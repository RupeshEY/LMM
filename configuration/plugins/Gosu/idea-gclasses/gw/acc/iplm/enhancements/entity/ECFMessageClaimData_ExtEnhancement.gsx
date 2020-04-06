package gw.acc.iplm.enhancements.entity

uses entity.ECFMessageComment_Ext
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses org.apache.commons.lang.text.StrBuilder
uses org.apache.commons.lang3.StringUtils

uses java.math.BigDecimal

enhancement ECFMessageClaimData_ExtEnhancement : ECFMessageClaimData_Ext {

  /**
   * Get the ECFContractMarket_Ext entity for the receiver of this message
   */
  property get ReceiverContractMarket() : ECFContractMarket_Ext {
    return this.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == this.ReceiverPartyId)
  }

  /**
   * States if the suspended Claim Data message can be applied to a Policy.
   * Note: Non-suspended messages will always return false.
   *
   * @return boolean Can be applied to a Policy
   */
  property get ApplicableToPolicy() : boolean {
    if (this.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM) {
      return this.Suspended
          and this.ValidationErrorCode == ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    } else {
      return this.Suspended
          and (this.ActionCode == TC_U or this.ActionCode == TC_A)
          and this.ValidationErrorCode == ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
    }
  }

  /**
   * States if the suspended Claim Data message can be applied to a Claim.
   * Note: Non-suspended messages will always return false.
   * Note: Claim Retrieve messages will always return false.
   *
   * @return boolean Can be applied to a Claim
   */
  property get ApplicableToClaim() : boolean {
    return this.MessageType != ECFMessageType_Ext.TC_RETRIEVECLAIM
        and this.Suspended
        and this.ActionCode == TC_U
        and this.ValidationErrorCode == ECFErrorCodeType.CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR.ErrorCode
  }

  /**
   * If the Action Code in a Claim Notify message is not recognised in the ECFActionCode_Ext typelist,
   * we may still want to display what was sent in the XML message to the user
   *
   * @return a String containing the xml action code, or null if XML content is not found,
   * or this is not a ClaimNotify Claim Data message
   */
  property get XmlActionCode() : String {
    if (this.MessageType == ECFMessageType_Ext.TC_CLAIMNOTIFY and this.Content?.getContentString()?.HasContent) {
      return ClaimNotifyEventRq.parse(this.Content.getContentString()).ClaimMovement?.Explanation
    }
    return null
  }

  /**
   * States whether this is a message for the Lloyd's Bureau.
   *
   * @return boolean States if this is a Lloyd's Bureau message.
   */
  property get LloydsMessage() : boolean {
    return this.ECFContactData.InsurerAgency == ECFBureauType_Ext.TC_LLOYDS.getCode()
  }

  /**
   * States whether this is a message for the LIRMA Bureau.
   *
   * @return boolean States if this is a LIRMA Bureau message.
   */
  property get LirmaMessage() : boolean {
    return this.ECFContactData.InsurerAgency == ECFBureauType_Ext.TC_LIRMA.getCode()
  }

  /**
   * Checks that this message can currently be responded to.
   */
  property get Respondable() : boolean {
    /* TODO: In which cases should ClaimRetrieveRs respond button be available?
       Till US19174 is over or transactions page is implemented,
       the Respond button will always be available for Claim Retrieve.
     */
    if (this typeis ECFMessageClaimRetrieveRs_Ext) {
      return true
    }
    if (this.PrimaryParticipantFollower
        or this.Claim.VCSIndicator_Ext
        or this.Claim.ECFLocked
        or this.Suspended) {
      return false
    }
    return this.ECFTransactionState.TransactionSequence == this.Claim.RespondableTransactionSequenceNumber(this.ReceiverPartyId)
        and this.ECFTransactionState.UUID == this.UUID
  }


  /*
   * @return true if message received by Lead
   */
  property get PrimaryParticipantLead() : boolean {
    return this.Role == ECFParticipantFunction_Ext.TC_LEAD
  }

  /*
   * @return true if message received by a Follower
   */
  property get PrimaryParticipantFollower() : boolean {
    return this.Role == ECFParticipantFunction_Ext.TC_FOLLOWER
  }

  /*
   * @return true if message received by an Agreement Party
   */
  property get PrimaryParticipantAgreementParty() : boolean {
    return this.Role == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
  }

  /**
   * This property will return the correct mode code to open the respective ClaimResponse popup.
   * A mode value consist of Bureau Name and Bureau Role in Contract Market.
   * All mode values should exist in ECFClaimResponseMode_Ext type list
   * If it don't find any specific mode, it returns the null.
   */
  property get Mode() : ECFClaimResponseMode_Ext {
    var modeCode = this.BureauType.DisplayName.replace("'", "") + this.Role.Code
    return ECFClaimResponseMode_Ext.get(modeCode)?:null
  }

  /**
   * This property evaluates that bureau type is Lloyd's and role is Lead
   *
   * @return boolean
   */
  property get LloydsLeadClaim() : boolean {
    return this.Mode == ECFClaimResponseMode_Ext.TC_LLOYDSLEAD
  }

  /**
   * This property evaluates that bureau type is LIRMA and role is Lead
   *
   * @return boolean
   */
  property get LirmaLeadClaim() : boolean {
    return this.Mode == ECFClaimResponseMode_Ext.TC_LIRMALEAD
  }

  property get MessageStateAwaiting() : boolean {
    return this.MessageState == ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
  }

  property get InsurerSharePercentage() : BigDecimal {
    return this.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == this.ReceiverPartyId).InsurerSharePercentage
  }

  /**
   * Sets transaction status type by matching the transaction
   * status of message with DisplayName of type
   *
   * @param transactionStatus A String having transaction status
   */
  public property set TransactionStatusType(transactionStatus : String) {
    final var nonDeprecatedTransactionStatuses = ECFTransactionStatus_Ext.getTypeKeys(false)
    final var transactionStatusWithoutSpaces = ECFUtils.stripWhiteSpaces(transactionStatus)

    this.TransactionStatus = nonDeprecatedTransactionStatuses.firstWhere(\ts -> StringUtils.equalsIgnoreCase(ECFUtils.stripWhiteSpaces(ts.DisplayName), transactionStatusWithoutSpaces))?:
        nonDeprecatedTransactionStatuses.firstWhere(\ts -> StringUtils.equalsIgnoreCase(ts.Code, transactionStatus))
  }

  /*
 * Return party participant function for parties in ContractMarket.InsurerOrReinsurer using PartId
 *
 * @return String Party Participant Function.
 */
  function getParticipantFunctionForParty(partyId : String) : String {
    return this.ECFContractMarkets?.firstWhere(\contractMarket -> contractMarket.PartyID == partyId)?.ParticipantFunction?.DisplayName
  }

  public function updateStateOnClaimDataMessage(state : ECFClaimMessageState_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var ecfClaimDataMessage = bundle.add(this)
      ecfClaimDataMessage.MessageState = state
    }, ECFConstants.ECF_SUPER_USER)
  }

  /*
   * Find the ECFMessageClaimData_Ext message for which this error event was generated
   * or null if no ECFMessageClaimNotifyRq_Ext is found.
   *
   * @return ECFMessageClaimResponseRq_Ext
   */
  property get ClaimDataMessageErrorRelatedClaimResponse() : ECFMessageClaimResponseRq_Ext {
    return this.Claim?.LMMessages?.whereTypeIs(ECFMessageClaimResponseRq_Ext)?.firstWhere(\ecfMessage -> ecfMessage.UUID == this.ClaimResponseUUId)
  }

  /*
   * Gets a boolean representation of the SimultaneousReinstatementReq String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get SimultaneousReinstatementReqBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.SimultaneousReinstatementReq)
  }

  /**
   * Gets a boolean representation of the ImmediatePartCollectionIndicator String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get ImmediatePartCollectionIndicatorBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.ImmediatePartCollectionInd)
  }

  /**
   * Gets a boolean representation of the NoFurtherResponseIndicator String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get NoFurtherResponseIndicatorBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.NoFurtherResponseIndicator)
  }

  /**
   * Gets a boolean representation of the MultipleResponseIndicator String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get MultipleResponseIndicatorBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.MultipleResponseIndicator)
  }

  /*
   * Gets a boolean representation of the CedantInLiquidationIndicatorBoolean String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get CedantInLiquidationIndicatorBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.CedantInLiquidationIndicator)
  }

  /*
   * Gets a boolean representation of the ChaseUpIndicatorBoolean String.
   *
   * @return {@link java.lang.Boolean}
   */
  property get ChaseUpIndicatorBoolean() : Boolean {
    return ECFIndicatorEnum.getBooleanValue(this.ChaseUpIndicator)
  }

  /**
   * Gets the Private Comments on this Claim Data message, separated by new line for display on the UI
   */
  property get FormattedPrivateComments() : String {
    return getFormattedComments(this.PrivateComments)
  }

  /**
   * Gets the Public Comments on this Claim Data message, separated by new line for display on the UI
   */
  property get FormattedPublicComments() : String {
    return getFormattedComments(this.PublicComments)
  }

  private function getFormattedComments(comments : ECFMessageComment_Ext[]) : String {
    var sb = new StrBuilder()
    comments.sortBy(\comment -> comment.LineNumber).each(\comment -> sb.appendln(comment.Detail))
    return sb.toString()
  }

  /**
   * Gets the catastrophe code by order: LcoCatastropheCode first, or PcsCatastropheCode
   *
   * @return a String containing the catastrophe code, or null if both are not present.
   */
  property get LcoOrPcsCatastropheCode() : String {
    return this.LcoCatastropheCode?.Code?:this.PcsCatastropheCode?.Code
  }

  /**
   * Gets a catastrophe with the LCO or PCS code by order: from LcoCatastropheCode first, or PcsCatastropheCode
   *
   * @return a Catastrophe object found with the LCO or PCS code, or null if both codes are not present.
   */
  property get CatastropheByLcoOrPcsCode() : Catastrophe {
    if (this.LcoOrPcsCatastropheCode == null) {
      return null
    }
    var catastrophe : Catastrophe
    var existentCatastrophes = gw.api.admin.CatastropheUtil.getCatastrophes()
    if (this.LcoCatastropheCode != null) {
      catastrophe = existentCatastrophes.firstWhere(\elt -> elt.LCOCode == this.LcoCatastropheCode.Code)
    } else if (this.PcsCatastropheCode != null) {
      catastrophe = existentCatastrophes.firstWhere(\elt -> elt.PCSCatastropheNumber == this.PcsCatastropheCode.Code)
    }
    return catastrophe
  }

  /**
   * Boolean property to indicate if the catastrophe codes are different from last message received.
   * This will return <code>false</code> if current codes are null and no previous message is found.
   *
   * @return <code>true</code> if any of the catastrophe code is different from previous received. Otherwise, <code>false</code>
   */
  property get HasCatastropheCodeDifferentFromLast() : boolean {
    var previousMessage = this.Claim.getLatestMessageClaimDataExcludingUUID(this.UUID)
    if (this.LcoOrPcsCatastropheCode == null and previousMessage == null) {
      return false
    }
    return this.LcoCatastropheCode != previousMessage?.LcoCatastropheCode or this.PcsCatastropheCode != previousMessage?.PcsCatastropheCode
  }

  /**
   * Boolean property to indicate if the LcoCatastropheCode or PcsCatastropheCode contains new codes not found in CC.
   *
   * @return <code>true</code> if any of the codes is not found in CC. Otherwise, <code>false</code>
   */
  property get HasNewCatastropheCode() : boolean {
    if (this.LcoOrPcsCatastropheCode == null) {
      return false
    }
    return this.CatastropheByLcoOrPcsCode == null
  }

  /*
   * Gets the Syndicate ID as a String, from the Receiver Party ID field.
   *
   * @return {@link java.lang.String}
   */
  property get SyndicateID() : String {
    return this.ReceiverPartyId?.split(":")?.last()
  }

  /**
   * Evaluates if a LIRMA Lead has circulated the transaction.
   * @return true if the Lead has circulated the transaction
   */
  property get LirmaLeadCirculated() : Boolean {
    return this.LirmaMessage and this.TransactionStatus == ECFTransactionStatus_Ext.TC_20_CIRCULATED
  }

  /**
   * Returns the Financials associated with this message, sorted by Currency
   * @return Financials sorted by Currency
   */
  property get FinancialsSortedByCurrency() : ECFMessageClaimDataFinancial_Ext[] {
    return this.Financials.sortBy(\financial -> financial.Currency.DisplayName)
  }

}