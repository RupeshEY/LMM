package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageMapperAbstract
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses org.apache.commons.lang.StringUtils

/**
 * There are only two services (Claim Retrieve Response and Claim Notify Request) which update
 * the claim information in ECF and the purpose of this class is to avoid inconsistency between them
 * and keeping the data integrity.
 * This class should be extended by any mapper responsible for updating ECF claim information.
 */
abstract class ECFMessageClaimDataMapper extends LMMessageMapperAbstract {

  protected function createCommonMessageClaimData(claimMessageDTO: ClaimMessageDTO, ecfMessage: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {

    var claimNotifyRq = claimMessageDTO.ClaimNotifyEventRq
    var claimRetrieveRs = claimMessageDTO.ClaimRetrieveRs

    ecfMessage.UUID = claimNotifyRq?.UUId?:claimRetrieveRs?.UUId
    ecfMessage.OriginTimeStamp = claimNotifyRq?.OriginTimeStamp?:claimRetrieveRs?.OriginTimeStamp
    ClaimDataWarningsAndErrorsCreator.createErrorsAndWarnings(ecfMessage, claimMessageDTO)

    ecfMessage.MessageType = (claimNotifyRq.MessageType)?:(claimRetrieveRs.MessageType)
    ecfMessage.UCR = claimNotifyRq.UCR?:claimRetrieveRs.UCR
    ecfMessage.Claim = claimNotifyRq != null ? _claimDAO.findClaim(claimNotifyRq.UCR) : ECFUtils.findClaimByMessageUUID(claimRetrieveRs.ReferredUUId)
    ecfMessage.UMR = claimNotifyRq.UMR?:claimRetrieveRs.UMR
    ecfMessage.BureauType = claimNotifyRq.BureauType?:claimRetrieveRs.BureauType
    ecfMessage.PolicyNumber = claimNotifyRq.PolicyNumber?:claimRetrieveRs.PolicyNumber
    ecfMessage.TR = claimNotifyRq.TR?:claimRetrieveRs.TR
    ecfMessage.TransactionSequence = claimNotifyRq.TransactionSequence?:claimRetrieveRs.TransactionSequence
    ecfMessage.TransactionType = claimNotifyRq.TransactionType?:claimRetrieveRs.TransactionType
    ecfMessage.AmendmentDetails = claimNotifyRq.AmendmentDetails?:claimRetrieveRs.AmendmentDetails
    ecfMessage.TransactionStatusType = claimNotifyRq.TransactionStatus?:claimRetrieveRs.TransactionStatus
    ecfMessage.InsuredId = claimNotifyRq.InsuredId?:claimRetrieveRs.InsuredId
    ecfMessage.InsuredName = claimNotifyRq.InsuredName?:claimRetrieveRs.InsuredName
    ecfMessage.ClaimLineNumber = (claimNotifyRq.ClaimLineNumber?:claimRetrieveRs.ClaimLineNumber) as int
    ecfMessage.AsOfDate = ECFUtils.getDateFromXMLDateTime(claimNotifyRq.AsOfDate?:claimRetrieveRs.AsOfDate)
    ecfMessage.ActionCode = claimNotifyRq.ActionCode?:claimRetrieveRs.ActionCode
    ecfMessage.TriageCategory = claimNotifyRq.TriageCategory?:claimRetrieveRs.TriageCategory
    ecfMessage.PcsCatastropheCode = claimNotifyRq.PcsCatastropheCode?:claimRetrieveRs.PcsCatastropheCode
    ecfMessage.LcoCatastropheCode = claimNotifyRq.LcoCatastropheCode?:claimRetrieveRs.LcoCatastropheCode
    ecfMessage.InsurerReference = claimNotifyRq.InsurerReference?:claimRetrieveRs.InsurerReference
    ecfMessage.Claimant = claimNotifyRq.ClaimantName?:claimRetrieveRs.ClaimantName
    ecfMessage.ClaimType = ECFClaimTypeCode_Ext.get(claimNotifyRq.ClaimType?:claimRetrieveRs.ClaimType)
    ecfMessage.ClaimStatus = claimNotifyRq.ClaimStatus?:claimRetrieveRs.ClaimStatus
    ecfMessage.ClassOfBusiness = claimNotifyRq.JvClassOfBusiness?:claimRetrieveRs.JvClassOfBusiness
    ecfMessage.LossOrEventName = claimNotifyRq.ClaimMovement.Claim.LossOrEventName?:claimRetrieveRs.ClaimMovement.Claim.LossOrEventName
    ecfMessage.ClaimsScheme = claimNotifyRq.ClaimsScheme?:claimRetrieveRs.ClaimsScheme
    ecfMessage.ConflictOfInterestInd = claimNotifyRq.ConflictOfInterestIndicator?:claimRetrieveRs.ConflictOfInterestIndicator
    ecfMessage.SimultaneousReinstatementReq = claimNotifyRq.SimultaneousReinstatementRequired?:claimRetrieveRs.SimultaneousReinstatementRequired
    ecfMessage.InsurerOrReinsurerClaimRef1 = claimNotifyRq.InsurerOrReinsurerClaimReference1?:claimRetrieveRs.InsurerOrReinsurerClaimReference1
    ecfMessage.InsurerOrReinsurerClaimRef2 = claimNotifyRq.InsurerOrReinsurerClaimReference2?:claimRetrieveRs.InsurerOrReinsurerClaimReference2
    ecfMessage.RiskCode = claimNotifyRq.RiskCode?:claimRetrieveRs.RiskCode
    ecfMessage.XcsToAgreeIndicator = claimNotifyRq.ClaimMovement.Extension.Claim.Indicators.XcsToAgreeIndicator?:claimRetrieveRs.ClaimMovement.Extension.Claim.Indicators.XcsToAgreeIndicator
    var categoryCode = claimNotifyRq.ClaimMovement.Extension.Claim.ClaimCategoryCode?:claimRetrieveRs.ClaimMovement.Extension.Claim.ClaimCategoryCode
    ecfMessage.CategoryCode = ECFClaimCategoryCode_Ext.get(categoryCode)
    var subCategoryCode = claimNotifyRq.ClaimMovement.Extension.Claim.ClaimSubCategoryCode?:claimRetrieveRs.ClaimMovement.Extension.Claim.ClaimSubCategoryCode
    ecfMessage.SubCategoryCode = ECFClaimSubCatCode_Ext.get(subCategoryCode)
    ecfMessage.ImmediatePartCollectionInd = claimNotifyRq.ImmediatePartCollectionIndicator?:claimRetrieveRs.ImmediatePartCollectionIndicator
    ecfMessage.NoFurtherResponseIndicator = claimNotifyRq.NoFurtherResponseIndicator?:claimRetrieveRs.NoFurtherResponseIndicator
    ecfMessage.MultipleResponseIndicator = claimNotifyRq.MultipleResponseIndicator?:claimRetrieveRs.MultipleResponseIndicator
    ecfMessage.CedantInLiquidationIndicator = claimNotifyRq.CedantInLiquidationIndicator?:claimRetrieveRs.CedantInLiquidationIndicator
    ecfMessage.ChaseUpIndicator = claimNotifyRq.ChaseUpIndicator?:claimRetrieveRs.ChaseUpIndicator
    ecfMessage.ChaseUpIndicatorInterval = claimNotifyRq.ChaseUpIndicatorInterval?:claimRetrieveRs.ChaseUpIndicatorInterval
    ecfMessage.ContractualConditionsIndicator = claimNotifyRq.ContractualConditionsMayApplyIndicator?:claimRetrieveRs.ContractualConditionsMayApplyIndicator
    ecfMessage.SimultaneousReinstatementProcd = claimNotifyRq.SimultaneousReinstatementProcessed?:claimRetrieveRs.SimultaneousReinstatementProcessed
    ecfMessage.CollectionUnlikelyIndicator = claimNotifyRq.CollectionUnlikelyIndicator?:claimRetrieveRs.CollectionUnlikelyIndicator

    ecfMessage = mapUnderwritingYear(ecfMessage, claimNotifyRq, claimRetrieveRs)
    ecfMessage = mapLossData(ecfMessage, claimNotifyRq, claimRetrieveRs)
    ecfMessage = mapReceiverData(ecfMessage, claimNotifyRq, claimRetrieveRs)
    ecfMessage = mapSenderData(ecfMessage, claimNotifyRq, claimRetrieveRs)
    ecfMessage = mapParallelUCRs(ecfMessage, claimNotifyRq, claimRetrieveRs)

    ClaimDataContractMarketCreator.createContractMarket(ecfMessage, claimMessageDTO)
    ecfMessage.Role = ecfMessage.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == ecfMessage.ReceiverPartyId).ParticipantFunction
    ClaimDataDocumentCreator.createDocuments(ecfMessage, claimMessageDTO)
    ClaimDataPolicyCreator.createPolicies(ecfMessage, claimMessageDTO)
    ClaimDataFinancialCreator.createFinancials(ecfMessage, claimMessageDTO)
    ClaimDataContactsCreator.createContacts(ecfMessage, claimMessageDTO)
    ClaimDataTransactionCreator.createTransactionState(ecfMessage)

    new ClaimDataBulkClaimCreator(ecfMessage, claimMessageDTO).createBulkClaims()
    new ClaimDataCommentCreator(ecfMessage, claimMessageDTO).createComments()
    return ecfMessage
  }

  private function mapLossData(ecfMessage: ECFMessageClaimData_Ext,
                               claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                   RetrieveClaimRs): ECFMessageClaimData_Ext {
    ecfMessage.LossCause = claimNotifyRq.LossCause?:claimRetrieveRs.LossCause
    ecfMessage.LossLocation = claimNotifyRq.LossLocation?:claimRetrieveRs.LossLocation
    ecfMessage.LossDetails = claimNotifyRq.LossDetails?:claimRetrieveRs.LossDetails
    ecfMessage.LossDateQualifier = ECFLossDateQualifier_Ext.get(claimNotifyRq.LossDateQualifier?:claimRetrieveRs.LossDateQualifier)
    ecfMessage.LossStartDate = ECFUtils.parseFlexibleDateType(claimNotifyRq.ClaimLossStartDate?:claimRetrieveRs.ClaimLossStartDate)
    ecfMessage.LossEndDate = ECFUtils.parseFlexibleDateType(claimNotifyRq.ClaimLossEndDate?:claimRetrieveRs.ClaimLossEndDate)
    return ecfMessage
  }

  private function mapSenderData(ecfMessage: ECFMessageClaimData_Ext,
                                 claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                     RetrieveClaimRs): ECFMessageClaimData_Ext {
    ecfMessage.SenderPartyId = claimNotifyRq.SenderPartyId?:claimRetrieveRs.SenderPartyId
    ecfMessage.SenderPartyName = claimNotifyRq.SenderPartyName?:claimRetrieveRs.SenderPartyName
    ecfMessage.SenderPartyRoleCd = claimNotifyRq.SenderPartyRoleCd?:claimRetrieveRs.SenderPartyRoleCd
    ecfMessage.SenderPartyAgency = claimNotifyRq.SenderPartyAgency?:claimRetrieveRs.SenderPartyAgency
    return ecfMessage
  }

  private function mapReceiverData(ecfMessage: ECFMessageClaimData_Ext,
                                   claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                       RetrieveClaimRs): ECFMessageClaimData_Ext {
    ecfMessage.ReceiverPartyId = claimNotifyRq.InsurerId?:claimRetrieveRs.InsurerId
    ecfMessage.ReceiverPartyName = claimNotifyRq.InsurerName?:claimRetrieveRs.InsurerName
    ecfMessage.ReceiverPartyRoleCd = claimNotifyRq.ReceiverPartyRoleCd?:claimRetrieveRs.ReceiverPartyRoleCd
    ecfMessage.ReceiverPartyAgency = claimNotifyRq.InsurerAgency?:claimRetrieveRs.InsurerAgency
    return ecfMessage
  }

  private function mapParallelUCRs(ecfMessage: ECFMessageClaimData_Ext,
                                   claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                       RetrieveClaimRs): ECFMessageClaimData_Ext {

    var allUnFilteredParallelUCRs = claimNotifyRq.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference?:
        claimRetrieveRs.ClaimMovement.Extension.Claim.ParallelUniqueClaimReference
    var filteredParallelUCRs = allUnFilteredParallelUCRs?.where(\parallelUCR -> StringUtils.isNotBlank(parallelUCR))
    filteredParallelUCRs?.each(\parallelUCR -> {
      var ecfParallelClaimsUCR = new ECFMessageClaimDataParallelClaimUCR_Ext()
      ecfParallelClaimsUCR.PUCR = parallelUCR
      ecfMessage.addToParallelClaimsUCR(ecfParallelClaimsUCR)
    })
    return ecfMessage
  }

  private function mapUnderwritingYear(ecfMessage: ECFMessageClaimData_Ext,
                                       claimNotifyRq: ClaimNotifyEventRq, claimRetrieveRs:
                                           RetrieveClaimRs): ECFMessageClaimData_Ext {

    var year: Integer = claimNotifyRq.ClaimMovement.ContractSection?.UnderwritingYear?.Year
    if (year == null) {
      year = claimRetrieveRs.ClaimMovement.ContractSection?.UnderwritingYear?.Year
    }

    ecfMessage.UnderwritingYear = (1000 < year and year < 2999) ? year : null
    return ecfMessage
  }
}