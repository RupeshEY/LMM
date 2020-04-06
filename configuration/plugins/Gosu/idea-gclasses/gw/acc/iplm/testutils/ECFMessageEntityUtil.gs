package gw.acc.iplm.testutils

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperContext
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataBulkClaimCreator
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataContactsCreator
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataContractMarketCreator
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataFinancialCreator
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.RespondErrorNotifyMapper
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.TransactionErrorNotifyMapper
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator
uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.api.database.Query
uses gw.pl.currency.MonetaryAmount
uses gw.transaction.Transaction

class ECFMessageEntityUtil {

  public static function createClaimNotifyRqWithLinkedClaim(claim: Claim = null): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRq = createClaimNotifyRq()
    var newClaim = claim?:ClaimBuilderHelper.createClaim(true)

    Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)
      claimNotifyRq = bundle.add(claimNotifyRq)

      newClaim.UCR_Ext = claimNotifyRq.UCR
      newClaim.addToLMMessages(claimNotifyRq)
    }, User.util.UnrestrictedUser)

    return claimNotifyRq
  }

  public static function createClaimNotifyRq(): ECFMessageClaimNotifyRq_Ext {
    return createClaimNotifyRq(ECFMessageUtil.createNewClaimNotifyRq())
  }

  public static function createClaimNotifyRq(claimNotifyXml: ClaimNotifyEventRq): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var bureauStatus = getBureauStatus(claimNotifyXml)
    Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(new ECFMessageClaimNotifyRq_Ext())
      claimNotifyRq.UUID = claimNotifyXml.UUId
      claimNotifyRq.OriginTimeStamp = Date.Today
      claimNotifyRq.AsOfDate = Date.Now
      claimNotifyRq.TransactionStatusType = bureauStatus
      claimNotifyRq.Status = ECFMessageStatus_Ext.TC_PENDING
      claimNotifyRq.MessageState = ECFClaimMessageState_Ext.TC_RESPONDED
      claimNotifyRq.Content = new Blob(claimNotifyXml.asUTFString().Bytes)
      if (not claimNotifyXml.ErrorsAndWarnings.Result.isEmpty()) {
        claimNotifyXml.ErrorsAndWarnings?.Result?.each(\xmlErrorOrWarning -> {
          var errorsOrWarning = new ECFMessageErrorOrWarning_Ext(claimNotifyRq)
          errorsOrWarning.ErrorCode = xmlErrorOrWarning.ErrorCode
          errorsOrWarning.ErrorType = ECFErrorType_Ext.get(xmlErrorOrWarning.ErrorWarningLevel.Value)
          errorsOrWarning.Description = xmlErrorOrWarning.ErrorWarningDescription
          errorsOrWarning.ReferenceMessageUUID = claimNotifyRq.UUID
          claimNotifyRq.addToErrorsOrWarnings(errorsOrWarning)
        })

        claimNotifyXml.ClaimMovement?.Extension?.Claim?.Indicators?.SoftWarnings?.each(\xmlError -> {
          var softWarning = new ECFMessageSoftWarning_Ext(claimNotifyRq)
          softWarning.Description = xmlError.SoftWarningsDescription
          claimNotifyRq.addToSoftWarnings(softWarning)
        })
      }

      if (claimNotifyXml.isECFRespondError()) {
        claimNotifyRq = RespondErrorNotifyMapper.mapRespondErrorNotify(claimNotifyRq as ECFMessageClaimNotifyRq_Ext, claimNotifyXml)
        return
      }

      if (claimNotifyXml.isECFTransactionError()) {
        var header = new Xchangingheader()
        header.Receiver.Party.Id = "testid"
        claimNotifyRq =  TransactionErrorNotifyMapper.mapTransactionErrorNotify(claimNotifyRq as ECFMessageClaimNotifyRq_Ext, null, claimNotifyXml)
        return
      }

      claimNotifyRq.MessageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
      claimNotifyRq.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
      claimNotifyRq.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      claimNotifyRq.UCR = claimNotifyXml.UCR
      claimNotifyRq.UMR = claimNotifyXml.UMR
      claimNotifyRq.TR = claimNotifyXml.TR
      claimNotifyRq.PolicyNumber = claimNotifyXml.ClaimMovement.Contract.InsurerRiskReference
      claimNotifyRq.MessageSequence = claimNotifyXml.ClaimMovement.MessageSequenceNumber
      claimNotifyRq.TransactionSequence = claimNotifyXml.ClaimMovement.Extension.ClaimEntry.TransactionSequence
      claimNotifyRq.AmendmentDetails = claimNotifyXml.ClaimMovement.Extension.ClaimEntry.AmendmentDetails
      claimNotifyRq.TransactionType = ECFClaimTransactionType_Ext.get(claimNotifyXml.ClaimMovement.ClaimAdviceInitialOrSubsequentIndicator)
      claimNotifyRq.ActionCode = ECFActionCode_Ext.get(claimNotifyXml.ClaimMovement.Explanation)
      claimNotifyRq.ResponseCode = ECFResponseCode_Ext.get(claimNotifyXml.ClaimMovement.ResponseCode)
      claimNotifyRq.ActionParticipant = claimNotifyXml.ClaimMovement.ActionParticipant
      claimNotifyRq.setParticipantType(claimNotifyXml.ClaimMovement.ActionParticipantType)
      claimNotifyRq.SenderPartyId = claimNotifyXml.ClaimMovement.ServiceProvider.Party.FirstId
      claimNotifyRq.SenderPartyName = claimNotifyXml.ClaimMovement.ServiceProvider.Party.Name
      claimNotifyRq.SenderPartyRoleCd = claimNotifyXml.Sender
      claimNotifyRq.SenderPartyAgency = claimNotifyXml.ClaimMovement.ServiceProvider.Party.FirstAgency
      claimNotifyRq.ReceiverPartyId = claimNotifyXml.ClaimMovement.Insurer.Party.FirstId
      claimNotifyRq.ReceiverPartyName = claimNotifyXml.ClaimMovement.Insurer.Party.Name
      claimNotifyRq.ReceiverPartyRoleCd = claimNotifyXml.Receiver
      claimNotifyRq.ReceiverPartyAgency = claimNotifyXml.ClaimMovement.Insurer.Party.FirstAgency
      claimNotifyRq.InsuredId = claimNotifyXml.ClaimMovement?.Insured?.Party?.FirstId
      claimNotifyRq.LossDetails = claimNotifyXml.ClaimMovement?.LossDetails
      claimNotifyRq.ClaimsScheme = ECFScheme_Ext.get(claimNotifyXml.ClaimMovement.Extension.Claim.ClaimsScheme)
      claimNotifyRq.LossStartDate = Date.Now.addMonths(-2)
      claimNotifyRq.LossEndDate = Date.Now.addMonths(10)
      claimNotifyRq.ClaimLineNumber = claimNotifyXml.ClaimMovement.Extension.Claim.ClaimLineNumber as int
      claimNotifyRq.ClaimType = ECFClaimTypeCode_Ext.get(claimNotifyXml.ClaimMovement.Extension.Claim.ClaimType)
      claimNotifyRq.LossLocation = claimNotifyXml.ClaimMovement.Claim.LossLocation.Location.Description
      claimNotifyRq.Claimant = claimNotifyXml.ClaimMovement.Claimant.first().Party.Name
      claimNotifyRq.ECFTransactionState = new ECFTransactionState_Ext()
      claimNotifyRq.ECFTransactionState.UCR = claimNotifyRq.UCR
      claimNotifyRq.ECFTransactionState.TR = claimNotifyRq.TR
      claimNotifyRq.ECFTransactionState.ReceiverId = claimNotifyRq.ReceiverPartyId
      claimNotifyRq.ECFTransactionState.TransactionSequence = Integer.parseInt(claimNotifyRq.TransactionSequence)
      claimNotifyRq.RiskCode = ECFRiskCode_Ext.get(claimNotifyXml.ClaimMovement.Extension.Contract?.RiskCode)
      claimNotifyRq.CategoryCode = ECFClaimCategoryCode_Ext.get(claimNotifyXml.ClaimMovement?.Extension?.Claim?.ClaimCategoryCode)
      claimNotifyRq.SubCategoryCode = ECFClaimSubCatCode_Ext.get(claimNotifyXml.ClaimMovement?.Extension?.Claim?.ClaimSubCategoryCode)
      claimNotifyRq.BureauType = claimNotifyXml.BureauType
      claimNotifyRq = mapUnderwritingYear(claimNotifyRq, claimNotifyXml, null) as ECFMessageClaimNotifyRq_Ext

      var claimDTO = new ClaimMessageDTO(claimNotifyXml)
      ClaimDataContactsCreator.createContacts(claimNotifyRq, claimDTO)
      ClaimDataContractMarketCreator.createContractMarket(claimNotifyRq, claimDTO)
      claimNotifyRq.Role = claimNotifyRq.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimNotifyRq.ReceiverPartyId).ParticipantFunction
      ClaimDataFinancialCreator.createFinancials(claimNotifyRq, claimDTO)
      new ClaimDataBulkClaimCreator(claimNotifyRq, claimDTO).createBulkClaims()
    }, User.util.UnrestrictedUser)
    return claimNotifyRq
  }

  public static function createClaimRetrieveRq(): ECFMessageClaimRetrieveRq_Ext {
    return createClaimRetrieveRq(ECFMessageUtil.createNewClaimRetrieveRq())
  }

  public static function createClaimRetrieveRq(claimRetrieveRqXml: RetrieveClaimRq): ECFMessageClaimRetrieveRq_Ext {
    var claimRetrieveMessage: ECFMessageClaimRetrieveRq_Ext
    Transaction.runWithNewBundle(\bundle -> {
      claimRetrieveMessage = bundle.add(new ECFMessageClaimRetrieveRq_Ext())
      claimRetrieveMessage.UUID = claimRetrieveRqXml.UUId
      claimRetrieveMessage.UCR = claimRetrieveRqXml.ReferredObjects.Claim.BrokerReference
      claimRetrieveMessage.UMR = claimRetrieveRqXml.ReferredObjects.Contract.BrokerReference
      claimRetrieveMessage.TR = claimRetrieveRqXml.ReferredObjects.ClaimEntry.BrokerReference
      claimRetrieveMessage.Content = new Blob(claimRetrieveRqXml.asUTFString().Bytes)
      claimRetrieveMessage.Status = ECFMessageStatus_Ext.TC_PENDING
      claimRetrieveMessage.OriginTimeStamp = Date.Today
      claimRetrieveMessage.MessageType = ECFMessageType_Ext.TC_RETRIEVECLAIM
      claimRetrieveMessage.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRETRIEVE
      claimRetrieveMessage.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      claimRetrieveMessage.ClaimLineNumber = claimRetrieveRqXml.ReferredObjects.Claim.ClaimLineNumber.longValue()
      claimRetrieveMessage.ClaimType = ECFClaimTypeCode_Ext.get(claimRetrieveRqXml.ReferredObjects.Claim.ClaimType)

      claimRetrieveMessage.SenderPartyRoleCd = claimRetrieveRqXml.Sender
      claimRetrieveMessage.SenderPartyId = claimRetrieveRqXml.Insurer.Party.FirstId
      claimRetrieveMessage.SenderPartyName = claimRetrieveRqXml.Insurer.Party.Name
      claimRetrieveMessage.SenderPartyAgency = claimRetrieveRqXml.Insurer.Party.FirstAgency

      claimRetrieveMessage.ReceiverPartyRoleCd = claimRetrieveRqXml.Receiver
      claimRetrieveMessage.ReceiverPartyId = claimRetrieveRqXml.ServiceProvider.Party.FirstId
      claimRetrieveMessage.ReceiverPartyName = claimRetrieveRqXml.ServiceProvider.Party.Name
      claimRetrieveMessage.ReceiverPartyAgency = claimRetrieveRqXml.ServiceProvider.Party.FirstAgency
    }, User.util.UnrestrictedUser)
    return claimRetrieveMessage
  }

  public static function createClaimRetrieveRs(): ECFMessageClaimRetrieveRs_Ext {
    return createClaimRetrieveRs(ECFMessageUtil.createNewClaimRetrieveRs())
  }

  public static function createClaimRetrieveRs(claimRetrieveRsXml: RetrieveClaimRs): ECFMessageClaimRetrieveRs_Ext {

    var claimRetrieveMessage: ECFMessageClaimRetrieveRs_Ext
    var content = claimRetrieveRsXml.asUTFString()

    Transaction.runWithNewBundle(\bundle -> {
      claimRetrieveMessage = bundle.add(new ECFMessageClaimRetrieveRs_Ext())

      if (claimRetrieveRsXml.ClaimMovement?.Contract.InsurerRiskReference == null or claimRetrieveRsXml.ClaimMovement?.Contract.InsurerRiskReference.isEmpty()) {
        claimRetrieveRsXml.ClaimMovement?.Contract.InsurerRiskReference = "54-123456"
      }
      claimRetrieveMessage.UCR = claimRetrieveRsXml.UCR
      claimRetrieveMessage.TR = claimRetrieveRsXml.TR
      claimRetrieveMessage.UMR = claimRetrieveRsXml.UMR
      claimRetrieveMessage.PolicyNumber = claimRetrieveRsXml.ClaimMovement?.Contract?.InsurerRiskReference
      claimRetrieveMessage.UUID = claimRetrieveRsXml.UUId
      claimRetrieveMessage.ClaimRetrieveReqReferredUUId = claimRetrieveRsXml.ReferredUUId
      claimRetrieveMessage.Content = new Blob(content.Bytes)
      claimRetrieveMessage.Status = ECFMessageStatus_Ext.TC_PENDING
      claimRetrieveMessage.OriginTimeStamp = Date.Today
      claimRetrieveMessage.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.get(claimRetrieveRsXml.Response.AcknowledgementStatus)
      claimRetrieveMessage.ResponseAcknowledgement.AcknowledgementLevelIndicator = claimRetrieveRsXml.Response.AcknowledgementLevelIndicator
      claimRetrieveMessage.ResponseAcknowledgement.ResponseDescription = claimRetrieveRsXml.Response.ResponseDescription
      claimRetrieveMessage.LossDetails = claimRetrieveRsXml.LossDetails
      claimRetrieveMessage.LossStartDate = Date.Now.addMonths(-2)
      claimRetrieveMessage.LossEndDate = Date.Now.addMonths(10)
      claimRetrieveMessage.LossLocation = claimRetrieveRsXml.ClaimMovement.Claim.LossLocation.Location.Description
      claimRetrieveMessage.ClaimType = ECFClaimTypeCode_Ext.get(claimRetrieveRsXml.ClaimType)
      claimRetrieveMessage.ClaimLineNumber = claimRetrieveRsXml.ClaimLineNumber as int
      claimRetrieveMessage.TransactionStatusType = claimRetrieveRsXml.TransactionStatus
      claimRetrieveMessage.SenderPartyId = claimRetrieveRsXml.ClaimMovement?.ServiceProvider.Party.FirstId
      claimRetrieveMessage.SenderPartyName = claimRetrieveRsXml.ClaimMovement?.ServiceProvider.Party.Name
      claimRetrieveMessage.SenderPartyRoleCd = claimRetrieveRsXml.Sender
      claimRetrieveMessage.SenderPartyAgency = claimRetrieveRsXml.ClaimMovement?.ServiceProvider.Party.FirstAgency
      claimRetrieveMessage.ReceiverPartyId = claimRetrieveRsXml.ClaimMovement?.Insurer.Party.FirstId
      claimRetrieveMessage.ReceiverPartyName = claimRetrieveRsXml.ClaimMovement?.Insurer.Party.Name
      claimRetrieveMessage.ReceiverPartyRoleCd = claimRetrieveRsXml.Receiver
      claimRetrieveMessage.ReceiverPartyAgency = claimRetrieveRsXml.ClaimMovement?.Insurer.Party.FirstAgency
      claimRetrieveMessage.InsuredId = claimRetrieveRsXml.ClaimMovement?.Insured.Party.FirstId
      claimRetrieveMessage.TransactionSequence = claimRetrieveRsXml.ClaimMovement.Extension.ClaimEntry.TransactionSequence
      claimRetrieveMessage.MessageType = ECFMessageType_Ext.TC_RETRIEVECLAIM
      claimRetrieveMessage.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRETRIEVE
      claimRetrieveMessage.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      claimRetrieveMessage.RiskCode = ECFRiskCode_Ext.get(claimRetrieveRsXml.ClaimMovement.Extension.Contract?.RiskCode)
      claimRetrieveMessage.CategoryCode = ECFClaimCategoryCode_Ext.get(claimRetrieveRsXml.ClaimMovement?.Extension?.Claim?.ClaimCategoryCode)
      claimRetrieveMessage.SubCategoryCode = ECFClaimSubCatCode_Ext.get(claimRetrieveRsXml.ClaimMovement?.Extension?.Claim?.ClaimSubCategoryCode)
      claimRetrieveMessage = mapUnderwritingYear(claimRetrieveMessage, null, claimRetrieveRsXml) as ECFMessageClaimRetrieveRs_Ext

      var claimDTO = new ClaimMessageDTO(claimRetrieveRsXml)
      ClaimDataContactsCreator.createContacts(claimRetrieveMessage, claimDTO)
      ClaimDataContractMarketCreator.createContractMarket(claimRetrieveMessage, claimDTO)
      claimRetrieveMessage.Role = claimRetrieveMessage.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimRetrieveRsXml.InsuredId).ParticipantFunction
      ClaimDataFinancialCreator.createFinancials(claimRetrieveMessage, claimDTO)
      new ClaimDataBulkClaimCreator(claimRetrieveMessage, claimDTO).createBulkClaims()

      claimRetrieveMessage.ECFTransactionState = new ECFTransactionState_Ext()
      claimRetrieveMessage.ECFTransactionState.UCR = claimRetrieveMessage.UCR
      claimRetrieveMessage.ECFTransactionState.TR = claimRetrieveMessage.TR
      claimRetrieveMessage.ECFTransactionState.ReceiverId = claimRetrieveMessage.ReceiverPartyId
      claimRetrieveMessage.ECFTransactionState.TransactionSequence = claimRetrieveMessage.TransactionSequence == null? 1 :Integer.parseInt(claimRetrieveMessage.TransactionSequence)
    }, User.util.UnrestrictedUser)

    return claimRetrieveMessage
  }

  public static function createClaimResponseRq(): ECFMessageClaimResponseRq_Ext {
    return createClaimResponseRq(ECFMessageUtil.createNewClaimResponseRq())
  }

  public static function createClaimResponseRq(claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    var claimResponseMessageRq: ECFMessageClaimResponseRq_Ext
    Transaction.runWithNewBundle(\bundle -> {
      claimResponseMessageRq = bundle.add(new ECFMessageClaimResponseRq_Ext())
      claimResponseMessageRq.UUID = UUID.randomUUID().toString()
      claimResponseMessageRq.UCR = claimResponseRqXml.Claim.BrokerReference
      claimResponseMessageRq.TR = claimResponseRqXml.ClaimEntry.BrokerReference
      claimResponseMessageRq.UMR = claimResponseRqXml.Contract.BrokerReference
      claimResponseMessageRq.AsOfDate = Date.Now
      claimResponseMessageRq.ReferredUUID = UUID.randomUUID().toString()
      claimResponseMessageRq.ClaimType = ECFClaimTypeCode_Ext.get(claimResponseRqXml.Claim.ClaimType)
      claimResponseMessageRq.SenderPartyId = claimResponseRqXml.Insurer.Party.FirstId
      claimResponseMessageRq.SenderPartyName = claimResponseRqXml.Insurer.Party.Name
      claimResponseMessageRq.SenderPartyAgency = claimResponseRqXml.Insurer.Party.FirstAgency
      claimResponseMessageRq.SenderPartyRoleCd = claimResponseRqXml.Sender
      claimResponseMessageRq.ReceiverPartyId = claimResponseRqXml.ServiceProvider.Party.FirstId
      claimResponseMessageRq.ReceiverPartyName = claimResponseRqXml.ServiceProvider.Party.Name
      claimResponseMessageRq.ReceiverPartyAgency = claimResponseRqXml.ServiceProvider.Party.FirstAgency
      claimResponseMessageRq.ReceiverPartyRoleCd = claimResponseRqXml.Receiver
      claimResponseMessageRq.Content = new Blob(claimResponseRqXml.asUTFString().Bytes)
      claimResponseMessageRq.Status = ECFMessageStatus_Ext.TC_PENDING
      claimResponseMessageRq.OriginTimeStamp = Date.Now
      claimResponseMessageRq.BureauType = ECFBureauType_Ext.get(claimResponseRqXml.Insurer.Party?.FirstAgency)
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY
      claimResponseMessageRq.MessageType = ECFMessageType_Ext.TC_CLAIMRESPOND
      claimResponseMessageRq.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRESPONSE
      claimResponseMessageRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      claimResponseMessageRq.InsurerTransactionReference = "TestTxRef"
      claimResponseMessageRq.ContactClassUserId = claimResponseRqXml.Insurer.Contact?.ClassUserId
      claimResponseMessageRq.ContactClassAccountId = claimResponseRqXml.Insurer.Contact?.AccountCode
      claimResponseMessageRq.ContactName = claimResponseRqXml.Insurer.Contact?.PersonName
      claimResponseMessageRq.ContactTelephone = claimResponseRqXml.Insurer.Contact?.Telephone
      claimResponseMessageRq.ContactEmail = claimResponseRqXml.Insurer.Contact?.Email
      claimResponseMessageRq.ClaimLineNumber = claimResponseRqXml.ClaimResponse.ClaimLineNo?.longValue()
      claimResponseMessageRq.LeadContactName = claimResponseRqXml.ClaimResponse.LeadResponse?.LeadContact?.PersonName
      claimResponseMessageRq.LeadContactTelephone = claimResponseRqXml.ClaimResponse.LeadResponse?.LeadContact?.Telephone
      claimResponseMessageRq.LeadContactEmail = claimResponseRqXml.ClaimResponse.LeadResponse?.LeadContact?.Email
      claimResponseMessageRq.CauseOfLossCode = ECFCauseOfLossCode_Ext.get(claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.CauseOfLoss)
      claimResponseMessageRq.RiskCode = ECFRiskCode_Ext.get(claimResponseRqXml.ContractSection?.RiskCode)
      claimResponseMessageRq.PcsCatastropheCode = ECFPCSCategoryCode_Ext.get(claimResponseRqXml.Claim?.PcsReference)
      claimResponseMessageRq.LcoCatastropheCode = ECFLCOCategoryCode_Ext.get(claimResponseRqXml.Claim?.LcoCatastropheReference)
      claimResponseMessageRq.ClaimsScheme = ECFScheme_Ext.get(claimResponseRqXml.Claim?.ClaimsScheme)
      claimResponseMessageRq.TriageCategory = ECFTriageCode_Ext.get(claimResponseRqXml.Claim?.TriageCategory)
      claimResponseMessageRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.get(claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.OutstandingAmountQualifier)
      claimResponseMessageRq.SimultaneousRIPIndicator = claimResponseRqXml.Claim.Indicators?.SimultaneousRIPIndicator
      claimResponseMessageRq.MinorPrecautionaryIndicator = claimResponseRqXml.Claim.Indicators?.MinorPrecautionaryIndicator
      claimResponseMessageRq.AllUnderwritersToSeeFileInd = claimResponseRqXml.Claim.Indicators?.AllUnderwritersToSeeFileIndicator
      claimResponseMessageRq.ImmediatePartCollectionInd = claimResponseRqXml.Claim.Indicators?.ImmediatePartCollectionIndicator
      claimResponseMessageRq.NoFurtherResponseIndicator = claimResponseRqXml.Claim.Indicators?.NoFurtherResponseIndicator
      claimResponseMessageRq.MultipleResponseIndicator = claimResponseRqXml.Claim.Indicators?.MultipleResponseIndicator
      claimResponseMessageRq.ChaseUpIndicatorInterval = claimResponseRqXml.Claim.Indicators?.ChaseUpIndicator?.Interval?.intValue()
      claimResponseMessageRq.ChaseUpIndicator = claimResponseRqXml.Claim.Indicators?.ChaseUpIndicator?.Indicator
      claimResponseMessageRq.ContractConditionsApplyInd = ECFContractConditions_Ext.get(claimResponseRqXml.Claim.Indicators?.ContractualConditionsMayApplyIndicator?.Value)

      claimResponseMessageRq.InsurerOrReinsurerClaimRef1 = claimResponseRqXml.ClaimResponse.InsurerOrReinsurerClaimReference1
      claimResponseMessageRq.InsurerOrReinsurerClaimRef2 = claimResponseRqXml.ClaimResponse.InsurerOrReinsurerClaimReference2
      claimResponseMessageRq.ClassOfBusiness = ECFClassOfBusiness_Ext.get(claimResponseRqXml.ContractSection.JvClassOfBusiness)
      claimResponseMessageRq.CedantInLiquidationIndicator = claimResponseRqXml.Claim.Indicators.CedantInLiquidationIndicator


      claimResponseMessageRq.RequestToBroker1 = claimResponseRqXml.ClaimResponse.LirmaCompany?.RequestToBroker?.first()?.Request
      claimResponseMessageRq.RequestToBroker2 = claimResponseRqXml.ClaimResponse.LirmaCompany?.RequestToBroker?.Count > 1 ? claimResponseRqXml.ClaimResponse.LirmaCompany?.RequestToBroker?.get(1).Request : null
      claimResponseMessageRq.PrivateFootnote = claimResponseRqXml.ClaimResponse.LirmaCompany?.PrivateFootnote

      claimResponseMessageRq.CategoryCode = ECFClaimCategoryCode_Ext.get(claimResponseRqXml.Claim.ClaimCategoryCode)
      claimResponseMessageRq.SubCategoryCode = ECFClaimSubCatCode_Ext.get(claimResponseRqXml.Claim.ClaimSubCategoryCode)

      claimResponseMessageRq = createResponseCode(claimResponseMessageRq, claimResponseRqXml)
      claimResponseMessageRq = createClaimResponsePartyModifications(claimResponseMessageRq, claimResponseRqXml)
      claimResponseMessageRq = createPrivateComments(claimResponseMessageRq, claimResponseRqXml)
      claimResponseMessageRq = createPublicComments(claimResponseMessageRq, claimResponseRqXml)
      claimResponseMessageRq = createMonetaryAmounts(claimResponseMessageRq, claimResponseRqXml)
      claimResponseMessageRq = createQueryReasons(claimResponseMessageRq, claimResponseRqXml)

      claimResponseMessageRq.ParticipantFunction = ECFParticipantFunction_Ext.get(claimResponseRqXml.ClaimResponse.ParticipantFunction.replaceAll("\\s", ""))
    }, User.util.UnrestrictedUser)

    createClaimDataMessageWithUUID(claimResponseMessageRq.ReferredUUID)

    return claimResponseMessageRq
  }

  public static function createClaimResponseRs(): ECFMessageClaimResponseRs_Ext {
    return createClaimResponseRs(ECFMessageUtil.createNewClaimResponseRs())
  }

  public static function createClaimResponseRs(claimResponseRsXml: ClaimResponseRs): ECFMessageClaimResponseRs_Ext {
    var claimResponseMessageRs: ECFMessageClaimResponseRs_Ext
    Transaction.runWithNewBundle(\bundle -> {
      claimResponseMessageRs = bundle.add(new ECFMessageClaimResponseRs_Ext())
      claimResponseMessageRs.UUID = claimResponseRsXml.UUId
      claimResponseMessageRs.ReferredMessageUUId = claimResponseRsXml.ReferredMessage.UUId
      claimResponseMessageRs.ResponseAcknowledgement = new ECFMessageResponseAcknowledgement_Ext()
      claimResponseMessageRs.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.get(claimResponseRsXml.Response.AcknowledgementStatus)
      claimResponseMessageRs.ResponseAcknowledgement.ResponseDescription = claimResponseRsXml.Response.ResponseDescription
      claimResponseMessageRs.ResponseAcknowledgement.AcknowledgementLevelIndicator = claimResponseRsXml.Response.AcknowledgementLevelIndicator
      claimResponseMessageRs.MessageType = ECFMessageType_Ext.TC_CLAIMRESPOND
      claimResponseMessageRs.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRESPONSE
      claimResponseMessageRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      claimResponseMessageRs.OriginTimeStamp = Date.Now
    }, User.util.UnrestrictedUser)
    
    return claimResponseMessageRs
  }

  private static function createClaimDataMessageWithUUID(uuid: String) {
    var claimNotifyRq = createClaimNotifyRq()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.UUID = uuid
    }, User.util.UnrestrictedUser)
  }

  private static function createMonetaryAmounts(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse?.LeadResponse?.ClaimEntryAmounts

    if (claimEntryAmounts?.HasElements) {
      var claimEntryAmountsIt = claimEntryAmounts.iterator()

      if (claimEntryAmountsIt.hasNext()) {
        var cea1 = claimEntryAmountsIt.next()
        var ccy1 = Currency.get(cea1.Ccy)

        claimResponseMessageRq.Currency1 = ccy1
        claimResponseMessageRq.TargetCurrency1 = ccy1
        claimResponseMessageRq.VATAmount1 = cea1.VatAmount != null ? new MonetaryAmount(cea1.VatAmount, ccy1) : null
        claimResponseMessageRq.ImportedServicesAmount1 = cea1.ImportedServicesAmount != null ? new MonetaryAmount(cea1.ImportedServicesAmount, ccy1) : null
        claimResponseMessageRq.ImportedServicesNarrative1 = cea1.ImportedServicesNarrative
      }

      if (claimEntryAmountsIt.hasNext()) {
        var cea2 = claimEntryAmountsIt.next()
        var ccy2 = Currency.get(cea2.Ccy)

        claimResponseMessageRq.Currency2 = ccy2
        claimResponseMessageRq.TargetCurrency2 = ccy2
        claimResponseMessageRq.VATAmount2 = cea2.VatAmount != null ? new MonetaryAmount(cea2.VatAmount, ccy2) : null
        claimResponseMessageRq.ImportedServicesAmount2 = cea2.ImportedServicesAmount != null ? new MonetaryAmount(cea2.ImportedServicesAmount, ccy2) : null
        claimResponseMessageRq.ImportedServicesNarrative2 = cea2.ImportedServicesNarrative
      }

      if (claimEntryAmountsIt.hasNext()) {
        var cea3 = claimEntryAmountsIt.next()
        var ccy3 = Currency.get(cea3.Ccy)

        claimResponseMessageRq.Currency3 = ccy3
        claimResponseMessageRq.TargetCurrency3 = ccy3
        claimResponseMessageRq.VATAmount3 = cea3.VatAmount != null ? new MonetaryAmount(cea3.VatAmount, ccy3) : null
        claimResponseMessageRq.ImportedServicesAmount3 = cea3.ImportedServicesAmount != null ? new MonetaryAmount(cea3.ImportedServicesAmount, ccy3) : null
        claimResponseMessageRq.ImportedServicesNarrative3 = cea3.ImportedServicesNarrative
      }
    }

    return claimResponseMessageRq
  }

  private static function createResponseCode(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    if (claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.LloydsResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.LeadResponse.LloydsLead.LloydsResponse)
    } else if (claimResponseRqXml.ClaimResponse.LeadResponse?.IluLead?.IluResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.LeadResponse.IluLead.IluResponse)
    } else if (claimResponseRqXml.ClaimResponse.LeadResponse?.LirmaLead?.LirmaResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.LeadResponse.LirmaLead.LirmaResponse)
    } else if (claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.IluAgreementPartyResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.IluAgreementPartyResponse)
    } else if (claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.LloydsAgreeementPartyResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.LloydsAgreeementPartyResponse)
    } else if (claimResponseRqXml.ClaimResponse.LirmaCompany?.LirmaCompanyResponse != null) {
      claimResponseMessageRq.ResponseCode = ECFResponseCode_Ext.get(claimResponseRqXml.ClaimResponse.LirmaCompany?.LirmaCompanyResponse)
    }
    return claimResponseMessageRq
  }

  private static function createClaimResponsePartyModifications(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    var modifiedParties = claimResponseRqXml.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer

    for (insurer in modifiedParties) {
      var modifiedClaimPartRole = new ECFClaimParticipantRole_Ext()
      modifiedClaimPartRole.PartyID = insurer.Party.FirstId
      modifiedClaimPartRole.PartyName = insurer.Party.Name
      modifiedClaimPartRole.BureauType = ECFBureauType_Ext.get(insurer.Party.FirstAgency)
      if (insurer.AgreementPartyModifiedIndicator == ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator.Add) {
        modifiedClaimPartRole.InitialParticipantFunction = ECFParticipantFunction_Ext.TC_FOLLOWER
        modifiedClaimPartRole.NewParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      } else {
        modifiedClaimPartRole.InitialParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
        modifiedClaimPartRole.NewParticipantFunction = ECFParticipantFunction_Ext.TC_FOLLOWER
      }
      claimResponseMessageRq.addToClaimParticipantRoles(modifiedClaimPartRole)
    }

    return claimResponseMessageRq
  }

  private static function createPrivateComments(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    if (claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.PrivateComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.PrivateComments) {
        var privateComment = new ECFMessagePrivateComment_Ext()
        privateComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPrivateComments(privateComment)
      }
    }

    if (claimResponseRqXml.ClaimResponse.LeadResponse?.IluLead?.PrivateComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.LeadResponse?.IluLead?.PrivateComments) {
        var privateComment = new ECFMessagePrivateComment_Ext()
        privateComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPrivateComments(privateComment)
      }
    }

    if (claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.PrivateComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.PrivateComments) {
        var privateComment = new ECFMessagePrivateComment_Ext()
        privateComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPrivateComments(privateComment)
      }
    }

    return claimResponseMessageRq
  }

  private static function createPublicComments(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {
    if (claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.PublicComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.PublicComments) {
        var publicComment = new ECFMessagePublicComment_Ext()
        publicComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPublicComments(publicComment)
      }
    }

    if (claimResponseRqXml.ClaimResponse.LeadResponse?.IluLead.PublicComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.LeadResponse?.IluLead?.PublicComments) {
        var publicComment = new ECFMessagePublicComment_Ext()
        publicComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPublicComments(publicComment)
      }
    }

    if (claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.PublicComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.PublicComments) {
        var publicComment = new ECFMessagePublicComment_Ext()
        publicComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPublicComments(publicComment)
      }
    }

    if (claimResponseRqXml.ClaimResponse.LeadResponse?.LirmaLead?.LeadComments != null) {
      for (comment in claimResponseRqXml.ClaimResponse.LeadResponse?.LirmaLead?.LeadComments) {
        var publicComment = new ECFMessagePublicComment_Ext()
        publicComment.Detail = comment.CommentDetails
        claimResponseMessageRq.addToPublicComments(publicComment)
      }
    }


    return claimResponseMessageRq
  }

  private static function createQueryReasons(claimResponseMessageRq: ECFMessageClaimResponseRq_Ext, claimResponseRqXml: ClaimResponseRq): ECFMessageClaimResponseRq_Ext {

    claimResponseRqXml.ClaimResponse.LeadResponse?.LloydsLead?.QueryReason?.each(\reason -> {
      var queryReason = new ECFResponseQueryReason_Ext()
      queryReason.Reason = ECFQueryReason_Ext.get(reason)
      claimResponseMessageRq.addToQueryReasons(queryReason)
    })

    claimResponseRqXml.ClaimResponse.AgreementPartyResponse?.QueryReason?.each(\reason -> {
      var queryReason = new ECFResponseQueryReason_Ext()
      queryReason.Reason = ECFQueryReason_Ext.get(reason)
      claimResponseMessageRq.addToQueryReasons(queryReason)
    })

    return claimResponseMessageRq
  }

  public static function createDocumentSearchRq(): ECFMessageDocumentSearchRq_Ext {
    var docSearchRq = ECFMessageUtil.createNewDocumentSearchRq()
    return createDocumentSearchRq(docSearchRq)
  }

  public static function createDocumentSearchRq(docSearchRq: RepositoryOperationRq): ECFMessageDocumentSearchRq_Ext {
    return createDocumentSearchRq(docSearchRq, null)
  }

  public static function createDocumentSearchRq(docSearchRq: RepositoryOperationRq, claim: Claim): ECFMessageDocumentSearchRq_Ext {
    var documentSearchRq: ECFMessageDocumentSearchRq_Ext

    Transaction.runWithNewBundle(\bundle -> {
      documentSearchRq = bundle.add(new ECFMessageDocumentSearchRq_Ext())

      documentSearchRq.UUID = docSearchRq.MsgId
      documentSearchRq.UCR = docSearchRq.DocumentList.first().DocumentItem.first().ReferredObjects.Claim.BrokerReference
      documentSearchRq.Content = new Blob(docSearchRq.asUTFString().Bytes)
      documentSearchRq.TR = docSearchRq.DocumentList.first().DocumentItem.first().ReferredObjects.ClaimEntry.BrokerReference
      documentSearchRq.UMR = docSearchRq.DocumentList.first().DocumentItem.first().ReferredObjects.Contract.BrokerReference
      documentSearchRq.Status = ECFMessageStatus_Ext.TC_PENDING
      documentSearchRq.OriginTimeStamp = Date.Today
      documentSearchRq.MessageType = ECFMessageType_Ext.TC_REPOSITORYSEARCH
      documentSearchRq.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
      documentSearchRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      documentSearchRq.SenderPartyId = docSearchRq.Sender.PartyId
      documentSearchRq.SenderPartyName = docSearchRq.Sender.PartyName
      documentSearchRq.SenderPartyRoleCd = docSearchRq.Sender.PartyRoleCd
      documentSearchRq.ReceiverPartyId = docSearchRq.Receiver.PartyId
      documentSearchRq.ReceiverPartyName = docSearchRq.Receiver.PartyName
      documentSearchRq.ReceiverPartyRoleCd = docSearchRq.Receiver.PartyRoleCd
      if (claim != null) {
        documentSearchRq.Claim = claim
      } else {
        documentSearchRq.Claim = new ClaimDAO().findClaim(documentSearchRq.UCR)
      }
    }, User.util.UnrestrictedUser)
    return documentSearchRq
  }

  public static function createDocumentSearchRs(): ECFMessageDocumentSearchRs_Ext {
    var docSearchRs = ECFMessageUtil.createNewDocumentSearchRs()
    return createDocumentSearchRs(docSearchRs)
  }

  public static function createDocumentSearchRs(docSearchRs: RepositoryOperationRs): ECFMessageDocumentSearchRs_Ext {
    return createDocumentSearchRs(docSearchRs, null)
  }

  public static function createDocumentSearchRs(docSearchRs: RepositoryOperationRs, claim: Claim): ECFMessageDocumentSearchRs_Ext {
    var documentSearchRs: ECFMessageDocumentSearchRs_Ext
    Transaction.runWithNewBundle(\bundle -> {
      documentSearchRs = bundle.add(new ECFMessageDocumentSearchRs_Ext())
      documentSearchRs.UUID = docSearchRs.MsgId
      documentSearchRs.UCR = docSearchRs.DocumentList?.first()?.DocumentItem?.first()?.ReferredObjects?.Claim?.BrokerReference
      documentSearchRs.Content = new Blob(docSearchRs.asUTFString().Bytes)
      documentSearchRs.TR = docSearchRs.DocumentList?.first()?.DocumentItem?.first()?.ReferredObjects?.ClaimEntry?.BrokerReference
      documentSearchRs.Status = ECFMessageStatus_Ext.TC_PENDING
      documentSearchRs.OriginTimeStamp = Date.Today
      documentSearchRs.MessageType = ECFMessageType_Ext.TC_REPOSITORYSEARCH
      documentSearchRs.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
      documentSearchRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      if (claim != null) {
        documentSearchRs.Claim = claim
      } else {
        documentSearchRs.Claim = ECFUtils.findClaimByMessageUUID(docSearchRs.ResponseInfo?.MsgId)
      }
    }, User.util.UnrestrictedUser)
    return documentSearchRs
  }

  public static function createDocumentDownloadRq(): ECFMessageDocumentDownloadRq_Ext {
    var docDownloadRq = ECFMessageUtil.createNewDocumentDownloadRq()
    return createDocumentDownloadRq(docDownloadRq)
  }

  public static function createDocumentDownloadRq(document: Document): ECFMessageDocumentDownloadRq_Ext {
    var docDownloadRq = ECFMessageUtil.createNewDocumentDownloadRq()
    return createDocumentDownloadRq(docDownloadRq, document)
  }

  public static function createDocumentDownloadRq(docDownloadRq: RepositoryOperationRq): ECFMessageDocumentDownloadRq_Ext {

    return createDocumentDownloadRq(docDownloadRq, createNewDocument(docDownloadRq))
  }

  public static function createDocumentDownloadRq(docDownloadRq: RepositoryOperationRq, document: Document): ECFMessageDocumentDownloadRq_Ext {
    var documentDownloadRq: ECFMessageDocumentDownloadRq_Ext
    Transaction.runWithNewBundle(\bundle -> {
      documentDownloadRq = bundle.add(new ECFMessageDocumentDownloadRq_Ext())
      documentDownloadRq.UUID = docDownloadRq.MsgId
      documentDownloadRq.UCR = docDownloadRq.DocumentList.first().DocumentItem.first().ReferredObjects.Claim.BrokerReference
      documentDownloadRq.Content = new Blob(docDownloadRq.asUTFString().Bytes)
      documentDownloadRq.Status = ECFMessageStatus_Ext.TC_PENDING
      documentDownloadRq.OriginTimeStamp = Date.Today
      documentDownloadRq.MessageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD
      documentDownloadRq.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
      documentDownloadRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      documentDownloadRq.SenderPartyId = docDownloadRq.Sender.PartyId
      documentDownloadRq.SenderPartyName = docDownloadRq.Sender.PartyName
      documentDownloadRq.SenderPartyRoleCd = docDownloadRq.Sender.PartyRoleCd
      documentDownloadRq.ReceiverPartyId = docDownloadRq.Receiver.PartyId
      documentDownloadRq.ReceiverPartyName = docDownloadRq.Receiver.PartyName
      documentDownloadRq.ReceiverPartyRoleCd = docDownloadRq.Receiver.PartyRoleCd

      if (document != null) {
        documentDownloadRq.Document = document
        documentDownloadRq.Claim = document.Claim
      }
    }, User.util.UnrestrictedUser)

    return documentDownloadRq
  }

  public static function createDocumentDownloadRs(): ECFMessageDocumentDownloadRs_Ext {
    var docDownloadRs = ECFMessageUtil.createNewDocumentDownloadRs()
    return createDocumentDownloadRs(docDownloadRs)
  }

  public static function createDocumentDownloadRs(docDownloadRs: RepositoryOperationRs): ECFMessageDocumentDownloadRs_Ext {
    var documentDownloadRs: ECFMessageDocumentDownloadRs_Ext
    Transaction.runWithNewBundle(\bundle -> {
      documentDownloadRs = bundle.add(new ECFMessageDocumentDownloadRs_Ext())
      documentDownloadRs.MessageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD
      documentDownloadRs.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
      documentDownloadRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      documentDownloadRs.UUID = docDownloadRs.MsgId
      documentDownloadRs.UCR = docDownloadRs.DocumentList.first().DocumentItem.first().ReferredObjects.Claim.BrokerReference
      documentDownloadRs.Content = new Blob(docDownloadRs.asUTFString().Bytes)
      documentDownloadRs.Status = ECFMessageStatus_Ext.TC_PENDING
      documentDownloadRs.OriginTimeStamp = Date.Today
    }, User.util.UnrestrictedUser)

    return documentDownloadRs
  }

  public static function createDocumentUploadRq(): ECFMessageDocumentUploadRq_Ext {
    var docUploadRq = ECFMessageUtil.createNewDocumentUploadRq()
    return createDocumentUploadRq(docUploadRq)
  }

  public static function createDocumentUploadRq(document: Document): ECFMessageDocumentUploadRq_Ext {
    var docUploadRq = ECFMessageUtil.createNewDocumentUploadRq()
    return createDocumentUploadRq(docUploadRq, document)
  }

  public static function createDocumentUploadRq(docUploadRq: RepositoryOperationRq): ECFMessageDocumentUploadRq_Ext {
    return createDocumentUploadRq(docUploadRq, createNewDocument(docUploadRq))
  }

  public static function createDocumentUploadRq(docUploadRq: RepositoryOperationRq, document: Document): ECFMessageDocumentUploadRq_Ext {
    var documentUploadRq: ECFMessageDocumentUploadRq_Ext
    Transaction.runWithNewBundle(\bundle -> {
      documentUploadRq = bundle.add(new ECFMessageDocumentUploadRq_Ext())
      documentUploadRq.MessageType = ECFMessageType_Ext.TC_REPOSITORYUPLOAD
      documentUploadRq.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
      documentUploadRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      documentUploadRq.UUID = docUploadRq.MsgId
      documentUploadRq.UCR = docUploadRq.DocumentList.first().DocumentItem.first().ReferredObjects.Claim.BrokerReference
      documentUploadRq.Content = new Blob(docUploadRq.asUTFString().Bytes)
      documentUploadRq.Status = ECFMessageStatus_Ext.TC_PENDING
      documentUploadRq.OriginTimeStamp = Date.Today
      documentUploadRq.SenderPartyId = docUploadRq.Sender.PartyId
      documentUploadRq.SenderPartyName = docUploadRq.Sender.PartyName
      documentUploadRq.SenderPartyRoleCd = docUploadRq.Sender.PartyRoleCd
      documentUploadRq.ReceiverPartyId = docUploadRq.Receiver.PartyId
      documentUploadRq.ReceiverPartyName = docUploadRq.Receiver.PartyName
      documentUploadRq.ReceiverPartyRoleCd = docUploadRq.Receiver.PartyRoleCd
      documentUploadRq.ReceiverPartyRoleCd = docUploadRq.Receiver.PartyRoleCd
      if (document != null) {
        documentUploadRq.Document = bundle.add(document)
        documentUploadRq.Claim = document.Claim
      }

      var accessList = docUploadRq.DocumentList.first().DocumentItem.first().AccessControlList.AccessParty
      if (accessList != null) {
        accessList.each(\accessPartyXml -> {
          var accessParty = new ECFMessageDocumentUploadAccessParty_Ext(bundle)
          accessParty.PartyName = accessPartyXml.PartyName
          accessParty.PartyId = accessPartyXml.PartyId
          accessParty.PartyRole = accessPartyXml.PartyRoleCd
          accessParty.AccessRight = accessPartyXml.AccessRightCd.Value
          accessParty.ListAction = accessPartyXml.ListActionCd.Value
          accessParty.CanAccess = true
          documentUploadRq.addToAccessParties(accessParty)
        })
      }
    }, User.util.UnrestrictedUser)

    Transaction.runWithNewBundle(\bundle -> {
      bundle.add(documentUploadRq.Document)
      documentUploadRq.Document.IMRFileSizeNum = docUploadRq.DocumentList.first().DocumentItem.first().Document.FileSize.NumUnits
      documentUploadRq.Document.IMRFileSizeUnit = docUploadRq.DocumentList.first().DocumentItem.first().Document.FileSize.UnitMeasurementCd
    }, User.util.UnrestrictedUser)
    return documentUploadRq
  }

  public static function createDocumentUploadRs(): ECFMessageDocumentUploadRs_Ext {
    var docUploadRs = ECFMessageUtil.createNewDocumentUploadRs()
    return createDocumentUploadRs(docUploadRs)
  }

  public static function createDocumentUploadRs(document: Document): ECFMessageDocumentUploadRs_Ext {
    var docUploadRs = ECFMessageUtil.createNewDocumentUploadRs()
    return createDocumentUploadRs(docUploadRs, document)
  }

  public static function createDocumentUploadRs(docSearchRq: RepositoryOperationRs): ECFMessageDocumentUploadRs_Ext {
    return createDocumentUploadRs(docSearchRq, null)
  }

  public static function createDocumentUploadRs(docUploadRs: RepositoryOperationRs, document: Document): ECFMessageDocumentUploadRs_Ext {
    var documentUploadRs: ECFMessageDocumentUploadRs_Ext

    Transaction.runWithNewBundle(\bundle -> {
      documentUploadRs = bundle.add(new ECFMessageDocumentUploadRs_Ext())
      documentUploadRs.MessageType = ECFMessageType_Ext.TC_REPOSITORYUPLOAD
      documentUploadRs.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
      documentUploadRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      documentUploadRs.UUID = docUploadRs.MsgId
      documentUploadRs.Content = new Blob(docUploadRs.asUTFString().Bytes)
      documentUploadRs.Status = ECFMessageStatus_Ext.TC_PENDING
      documentUploadRs.OriginTimeStamp = Date.Today
      if (document != null) {
        documentUploadRs.Document = document
        documentUploadRs.Claim = document.Claim
      }
    }, User.util.UnrestrictedUser)
    return documentUploadRs
  }

  public static function createDocumentPostRs() : ECFMessageDocumentPostRs_Ext {
    var postRs = ECFMessageUtil.createNewPostRs()
    return createDocumentPostRs(postRs)
  }

  public static function createDocumentPostRs(postRs: PostRs) : ECFMessageDocumentPostRs_Ext {
    var postRsEntity : ECFMessageDocumentPostRs_Ext

    Transaction.runWithNewBundle(\bundle -> {
      postRsEntity = new EntityMapperService().createEntity(postRs) as ECFMessageDocumentPostRs_Ext
    }, User.util.UnrestrictedUser)

    return postRsEntity
  }

  public static function createNewLMMessageLloydsSCM() : LMMessageLloydsSCM_Ext {
    var scmMessage = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    return createNewLMMessageLloydsSCM(scmMessage)
  }

  public static function createNewLMMessageLloydsSCM(message: Jv_Ins_Reinsurance) : LMMessageLloydsSCM_Ext {
    var messageEntity: LMMessageLloydsSCM_Ext
    var messageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT, message, null)
    var messageMapper = new LMMessageMapperContext(LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT)

    Transaction.runWithNewBundle(\bundle -> {
      messageEntity = messageMapper.getAppropriateEntity(messageDTO) as LMMessageLloydsSCM_Ext
      messageEntity.LossStartDate = Date.Now.addMonths(-1)
    }, User.util.UnrestrictedUser)

    return messageEntity
  }

  private static function getBureauStatus(claimNotifyXml: ClaimNotifyEventRq): String {
    var lloydsStatus = claimNotifyXml.ClaimMovement.Extension.ClaimEntry?.LloydsStatus
    var lirmaStatus = claimNotifyXml.ClaimMovement.Extension.ClaimEntry?.LirmaStatus
    var iluStatus = claimNotifyXml.ClaimMovement.Extension.ClaimEntry?.IluStatus
    if (lloydsStatus != null) {
      return lloydsStatus
    } else if (lirmaStatus != null) {
      return lirmaStatus
    } else {
      return iluStatus
    }
  }

  /**
   * this function will query the Claim from the database using it's ID
   */
  public static function refreshClaimFromDatabase(claim: Claim): Claim {
    return gw.api.database.Query.make(entity.Claim)
        .compare(Claim#ID, Equals, claim.ID)
        .select().AtMostOneRow
  }

  private static function getClaimant(partyName: String): Claimant {
    var claimant = new Claimant()
    claimant.Party.Name = partyName
    return claimant
  }

  public static function deleteExistingRoles(ecfMessage: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      for (ecfRole in ecfMessage.ECFContractMarkets)
        bundle.delete(ecfRole)
    }, User.util.UnrestrictedUser)
    return ecfMessage
  }

  public static function changeCompanyRole(participantFunction: String, claimNotifyMsg: ClaimNotifyEventRq): ClaimNotifyEventRq {
    var insurerParty = claimNotifyMsg.ClaimMovement.Insurer
    var insurerOrReinsurers = claimNotifyMsg.ClaimMovement.Extension.Contract.ContractMarket*.InsurerOrReinsurer
    for (insurerOrReinsurer in insurerOrReinsurers) {
      if (insurerOrReinsurer.first().Party.Id.first() == insurerParty.Party.Id.first()) {
        insurerOrReinsurer.first().ParticipantFunction = participantFunction
        break
      }
    }
    return claimNotifyMsg
  }

  public static function addECFPrimaryRoleToClaimNotify(ecfParticipantFunction: ECFParticipantFunction_Ext, bureau: String, ecfMessage: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      var ecfContractMarket_ext = new ECFContractMarket_Ext(bundle)
      ecfContractMarket_ext.ParticipantFunction = ecfParticipantFunction
      ecfContractMarket_ext.Bureau = ECFBureauType_Ext.get(bureau)
      ecfContractMarket_ext.IsPrimaryRole = true
      ecfContractMarket_ext.PartyID = ecfMessage.ReceiverPartyId
      ecfMessage.addToECFContractMarkets(ecfContractMarket_ext)
    }, User.util.UnrestrictedUser)
    return ecfMessage
  }


  public static function addECFRoleToClaimNotify(
      partyId: String,
      isPrimary: boolean,
      ecfParticipantFunction: ECFParticipantFunction_Ext,
      bureau: String, ecfMessage: ECFMessageClaimNotifyRq_Ext): ECFMessageClaimNotifyRq_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      var ecfContractMarket_ext = new ECFContractMarket_Ext(bundle)
      ecfContractMarket_ext.ParticipantFunction = ecfParticipantFunction
      ecfContractMarket_ext.Bureau = ECFBureauType_Ext.get(bureau)
      ecfContractMarket_ext.IsPrimaryRole = isPrimary
      ecfContractMarket_ext.PartyID = partyId
      ecfContractMarket_ext.ECFMessageClaimData_Ext = ecfMessage
      ecfMessage.addToECFContractMarkets(ecfContractMarket_ext)
    }, User.util.UnrestrictedUser)
    return ecfMessage
  }

  public static function updateVCS(ecfMessage: ECFMessage_Ext, vscValue: boolean): ECFMessage_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      var claim = ecfMessage.Claim
      claim = bundle.add(claim)
      claim.VCSIndicator_Ext = vscValue
    }, User.util.UnrestrictedUser)
    return ecfMessage
  }

  public static function addClaimToMessage(ecfMessage: ECFMessage_Ext, claim: Claim): ECFMessage_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      if (claim == null) {
        claim = ClaimBuilderHelper.createClaim()
      }
      claim.addToLMMessages(ecfMessage)
      ecfMessage.Claim = claim
    }, ECFConstants.ECF_SUPER_USER)
    return ecfMessage
  }

  private static function mapUnderwritingYear(ecfMessage: ECFMessageClaimData_Ext,
                                              claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                                  RetrieveClaimRs): ECFMessageClaimData_Ext {

    var year: Integer = claimNotifyRq.ClaimMovement.ContractSection?.UnderwritingYear?.Year
    if (year == null) {
      year = claimRetrieveRs.ClaimMovement.ContractSection?.UnderwritingYear?.Year
    }

    ecfMessage.UnderwritingYear = (1000 < year and year < 2999) ? year : null
    return ecfMessage
  }

  public static function getAllECFMessages(): List<ECFMessage_Ext> {
    return Query.make(ECFMessage_Ext).select().toList()
  }

  public static function deleteAllECFMessagesFromDB() {
    var messageList = getAllECFMessages()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      messageList.each(\elt -> bundle.delete(elt))
    }, "su")
  }

  public static function getAllLMMessages(): List<LMMessage_Ext> {
    return Query.make(LMMessage_Ext).select().toList()
  }

  public static function deleteAllLMMessagesFromDB() {
    var messageList = getAllLMMessages()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      messageList.each(\elt -> bundle.delete(elt))
    }, "su")
  }

  public static function deleteAllCatastrophes() {
    var catastrophes = Query.make(Catastrophe).select().toList()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      catastrophes.each(\elt -> bundle.delete(elt))
    }, "su")
  }

  private static function createNewDocument(repositoryOperationRq: RepositoryOperationRq): Document {
    var newDoc: Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newDoc = bundle.add(new Document())
      var xmlDocument = repositoryOperationRq.DocumentList.first().DocumentItem.first().Document
      newDoc.IMRDocumentId = xmlDocument.DocumentId
      newDoc.IMRDocumentVersion = xmlDocument.DocumentVersion
      newDoc.IMRDocumentVersionDtTime = xmlDocument.DocumentVersionDtTime?.toCalendar()?.getTime()
      newDoc.IMRInheritIndicator = xmlDocument.InheritIndicator
      newDoc.Name = xmlDocument.FileId
      newDoc.MimeType = xmlDocument.FileFormatCd
      newDoc.IMRFileSizeNum = xmlDocument.FileSize.NumUnits
      newDoc.IMRFileSizeUnit = xmlDocument.FileSize.UnitMeasurementCd
      newDoc.IMRDocumentType = xmlDocument.DocumentTypeCd?.toString()
      newDoc.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
      newDoc.Claim = ClaimBuilderHelper.createClaim(true)
    }, ECFConstants.ECF_SUPER_USER)
    return newDoc
  }

}