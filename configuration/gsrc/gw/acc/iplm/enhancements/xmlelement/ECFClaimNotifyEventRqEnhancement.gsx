package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataPolicyCreator
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.xml.date.XmlDateTime

uses java.math.BigInteger

enhancement ECFClaimNotifyEventRqEnhancement: ClaimNotifyEventRq {

  /**
   * Gets the ClaimMovement.Claim.BrokerReference.
   */
  property get UCR(): String {
    return this.ClaimMovement.Claim.BrokerReference
  }

  /**
   * Sets the ClaimMovement.Claim.BrokerReference.
   *
   * @param newUCR
   */
  property set UCR(newUCR: String) {
    this.ClaimMovement.Claim.BrokerReference = newUCR
  }

  /**
   * Gets the ClaimMovement.Contract.BrokerReference.
   */
  property get UMR(): String {
    return this.ClaimMovement.Contract.BrokerReference
  }

  /**
   * Sets the ClaimMovement.Contract.BrokerReference.
   *
   * @param newUMR
   */
  property set UMR(newUMR: String) {
    this.ClaimMovement.Contract.BrokerReference = newUMR
  }

  /**
   * Gets the ClaimMovement.ClaimEntry.BrokerReference.
   */
  property get TR(): String {
    return this.ClaimMovement.ClaimEntry.BrokerReference
  }

  /**
   * Sets the ClaimMovement.ClaimEntry.BrokerReference.
   *
   * @param newTR
   */
  property set TR(newTR: String) {
    this.ClaimMovement.ClaimEntry.BrokerReference = newTR
  }

  /**
   * Gets the ClaimMovement.Contract.InsurerRiskReference (A policy Number)
   */
  property get PolicyNumber(): String {
    return this.ClaimMovement.Contract?.InsurerRiskReference
  }

  /**
   * Sets the ClaimMovement.Contract.InsurerRiskReference (A policy Number)
   */
  property set PolicyNumber(policyNumber: String) {
    this.ClaimMovement.Contract?.InsurerRiskReference = policyNumber
  }

  /**
   * Gets the ClaimMovement.Extension.ClaimEntry.TransactionSequence
   */
  property get TransactionSequence(): String {
    return this.ClaimMovement.Extension?.ClaimEntry?.TransactionSequence
  }

  /**
   * Gets the ClaimMovement.ClaimAdviceInitialOrSubsequentIndicator (A ECFClaimTransactionType_Ext)
   */
  property get TransactionType(): ECFClaimTransactionType_Ext {
    return ECFClaimTransactionType_Ext.get(this.ClaimMovement.ClaimAdviceInitialOrSubsequentIndicator)
  }

  /**
   * Gets the ClaimMovement.Extension.ClaimEntry.AmendmentDetails
   */
  property get AmendmentDetails(): String {
    return this.ClaimMovement.Extension?.ClaimEntry?.AmendmentDetails
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.LossPeriod.LossDateQualifier
   */
  property get LossDateQualifier(): String {
    return this.ClaimMovement.Extension?.Claim?.LossPeriod?.LossDateQualifier
  }

  /**
   * Gets the CreationDate
   */
  property get OriginTimeStamp(): Date {
    return ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(this.CreationDate)
  }

  /**
   * Get the message type
   *
   * @return ECFMessageType_Ext
   */
  property get MessageType(): ECFMessageType_Ext {
    return ECFMessageType_Ext.TC_CLAIMNOTIFY
  }


  /**
   * Gets the ClaimMovement.Extension.Claim.ClaimType.
   *
   * @return String
   */
  property get ClaimType(): String {
    return this.ClaimMovement.Extension?.Claim?.ClaimType
  }

  /**
   * Sets the ClaimMovement.Extension.Claim.ClaimType.
   *
   * @param newClaimType
   */
  property set ClaimType(newClaimType: String) {
    this.ClaimMovement.Extension?.Claim?.ClaimType = newClaimType
  }

  /**
   * Gets the ClaimMovement.LossDetails.
   *
   * @return String
   */
  property get LossDetails(): String {
    return this.ClaimMovement.LossDetails
  }

  /**
   * Sets the ClaimMovement.LossDetails.
   *
   * @param newLossDetails
   */
  property set LossDetails(newLossDetails: String) {
    this.ClaimMovement.LossDetails = newLossDetails
  }

  /**
   * Gets the ClaimMovement.Claim.CauseOfLoss.
   *
   * @return String
   */
  property get LossCause(): String {
    return this.ClaimMovement.Claim?.CauseOfLoss
  }


  /**
   * Gets the ClaimMovement.Claim.LossLocation.Location.Description.
   *
   * @return String
   */
  property get LossLocation(): String {
    return this.ClaimMovement.Claim?.LossLocation?.Location?.Description
  }


  /**
   * Gets the ClaimMovement.InsurerRiskReference2.
   *
   * @return String
   */
  property get RiskReference(): String {
    return this.ClaimMovement.InsurerRiskReference2
  }


  /**
   * Gets the ClaimMovement.Extension.Contract.RiskCode.
   */
  property get RiskCode(): ECFRiskCode_Ext {
    return ECFRiskCode_Ext.get(this.ClaimMovement.Extension?.Contract?.RiskCode)
  }

  /**
   * Gets Bureau type of the message receiver
   */
  property get BureauType(): ECFBureauType_Ext {
    return ECFBureauType_Ext.get(this.ClaimMovement.Insurer.Party.FirstAgency)
  }

  /**
   * Gets the ClaimMovement.Broker.Party.FirstAgency.
   */
  property get Market(): ECFBureauType_Ext {
    return ECFBureauType_Ext.get(this.ClaimMovement.Broker.Party.FirstAgency)
  }

  /**
   * Gets the ClaimMovement.Broker.Party.FirstId.
   */
  property get BrokerId(): String {
    return this.ClaimMovement.Broker.Party.FirstId
  }

  /**
   * Gets the ClaimMovement.Broker.Party.Name.
   */
  property get BrokerName(): String {
    return this.ClaimMovement.Broker.Party.Name
  }

  /**
   * Gets the ClaimMovement.Broker.Contact.PersonName.
   */
  property get BrokerContact(): String {
    return this.ClaimMovement.Broker.Contact.PersonName
  }

  /**
   * Gets the ClaimMovement.Broker.Contact.Telephone.
   */
  property get BrokerPhone(): String {
    return this.ClaimMovement.Broker.Contact.Telephone
  }

  /**
   * Gets the ClaimMovement.Broker.Contact.Email.
   */
  property get BrokerEmail(): String {
    return this.ClaimMovement.Broker.Contact.Email
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.CoLeadIndicator.
   */
  property get CoLeadIndicator(): String {
    return this.ClaimMovement.Extension?.Claim?.CoLeadIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Contract.SlipLeadName.Party.Name.
   */
  property get LeadName(): String {
    return this.ClaimMovement.Extension?.Contract?.SlipLeadName?.Party.Name
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.ClaimLineNumber.
   *
   * @return BigInteger
   */
  property get ClaimLineNumber(): BigInteger {
    return this.ClaimMovement.Extension?.Claim?.ClaimLineNumber
  }

  /**
   * Sets the ClaimMovement.Extension.Claim.ClaimLineNumber.
   *
   * @param newClaimLineNumber
   */
  property set ClaimLineNumber(newClaimLineNumber: BigInteger) {
    this.ClaimMovement.Extension?.Claim?.ClaimLineNumber = newClaimLineNumber
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.LossPeriod.StartDate.
   *
   * @return null if Loss Date Qualifier is not "L"
   */
  property get ClaimLossStartDate(): String {
    //TODO: ACC-4140 evaluate business case if Loss date is not L, are we missing some business case? (plz remove this comment if not evaluated)
    if (this.ClaimMovement.Extension?.Claim?.LossPeriod?.LossDateQualifier == ECFLossDateQualifier_Ext.TC_L.Code) {
      return this.ClaimMovement.Extension?.Claim?.LossPeriod?.StartDate
    } else {
      return null
    }
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.ConflictOfInterestIndicator value as boolean
   */
  property get ConflictOfInterestIndicator(): Boolean {
    return this.ClaimMovement.Extension?.Claim?.Indicators?.ConflictOfInterestIndicator == ECFIndicatorEnum.Y.IntegrationCode
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.SimultaneousReinstatementRequired element
   *
   * @return SimultaneousReinstatementRequired indicator from the XML message
   */
  property get SimultaneousReinstatementRequired(): String {
    return this.ClaimMovement.Extension?.Claim?.Indicators?.SimultaneousReinstatementRequired
  }

  /**
   * Gets the /ClaimMovement/Extension/Contract/ContractMarket/InsurerOrReinsurer/InsurerOrReinsurerClaimReference1 value
   * for the receiver of this message.
   * Returns null is value empty
   */
  property get InsurerOrReinsurerClaimReference1(): String {
    var insurersMarket = this.ClaimMovement.Extension?.Contract?.ContractMarket.firstWhere(\elt -> elt.Agency == this.InsurerAgency)
    var insurersMarketEntry = insurersMarket.InsurerOrReinsurer.firstWhere(\elt -> elt.Party.FirstId == this.InsurerId)
    return insurersMarketEntry.InsurerOrReinsurerClaimReference1
  }

  /**
   * Gets the /ClaimMovement/Extension/Contract/ContractMarket/InsurerOrReinsurer/InsurerOrReinsurerClaimReference2 value
   * for the receiver of this message.
   * Returns null is value empty
   */
  property get InsurerOrReinsurerClaimReference2(): String {
    var insurersMarket = this.ClaimMovement.Extension?.Contract?.ContractMarket.firstWhere(\elt -> elt.Agency == this.InsurerAgency)
    var insurersMarketEntry = insurersMarket.InsurerOrReinsurer.firstWhere(\elt -> elt.Party.FirstId == this.InsurerId)
    return insurersMarketEntry.InsurerOrReinsurerClaimReference2
  }

  /**
   * Using the value at the XML tag wb:ClaimNotifyEventRq/wb:ClaimMovement/wb:Extension/wb:Claim/wb:ClaimsScheme
   *
   * @return the typekey ECFScheme_Ext for this ClaimsScheme value
   */
  property get ClaimsScheme(): ECFScheme_Ext {
    return ECFScheme_Ext.AllTypeKeys.firstWhere(\scheme -> scheme.DisplayName == this.ClaimMovement.Extension?.Claim?.ClaimsScheme)
  }

  /**
   * Sets the ClaimMovement.Extension.Claim.LossPeriod.StartDate.
   *
   * @param newLossStartDate
   */
  property set ClaimLossStartDate(newLossStartDate: String) {
    this.ClaimMovement.Extension?.Claim?.LossPeriod?.StartDate = newLossStartDate
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.LossPeriod.EndDate.
   *
   * @return null if Loss Date Qualifier is not "L"
   */
  property get ClaimLossEndDate(): String {
    if (this.ClaimMovement.Extension?.Claim?.LossPeriod?.LossDateQualifier == ECFLossDateQualifier_Ext.TC_L.Code) {
      return this.ClaimMovement.Extension?.Claim?.LossPeriod?.EndDate
    } else {
      return null
    }
  }


  /**
   * Gets the ClaimMovement.ClaimMovement.ServiceProvider.Party.FirstId.
   */
  property get SenderPartyId(): String {
    return this.ClaimMovement.ServiceProvider.Party.FirstId
  }

  /**
   * Gets the ClaimMovement.ServiceProvider.Party.Name.
   */
  property get SenderPartyName(): String {
    return this.ClaimMovement.ServiceProvider.Party.Name
  }

  /**
   * Gets the Sender role.
   */
  property get SenderPartyRoleCd(): String {
    return this.Sender
  }

  /**
   * Gets the ClaimMovement.ServiceProvider.Party.FirstAgency.
   */
  property get SenderPartyAgency(): String {
    return this.ClaimMovement.ServiceProvider.Party.FirstAgency
  }

  /**
   * Gets the Receiver Role.
   */
  property get ReceiverPartyRoleCd(): String {
    return this.Receiver
  }

  /**
   * Gets the ClaimMovement.Insured.Party.FirstId.
   */
  property get InsuredId(): String {
    return this.ClaimMovement.Insured.Party.FirstId
  }

  /**
   * Gets the ClaimMovement.Insured.Party.Name.
   */
  property get InsuredName(): String {
    return this.ClaimMovement.Insured.Party.Name
  }

  /**
   * Gets the InsurerTransactionReference.
   */
  property get InsurerReference(): String {
    return this.ClaimMovement.ClaimEntry.InsurerReference
  }

  /**
   * Gets the ClaimMovement.AsOfDate.
   */
  property get AsOfDate(): XmlDateTime {
    return this.ClaimMovement.AsOfDate
  }

  /**
   * Gets the ClaimMovement.Explanation (A ActionCode).
   */
  property get ActionCode(): ECFActionCode_Ext {
    return ECFActionCode_Ext.get(this.ClaimMovement.Explanation)
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.TriageCategory (A TriageCategory).
   */
  property get TriageCategory(): ECFTriageCode_Ext {
    return ECFTriageCode_Ext.AllTypeKeys.firstWhere(\elt -> this.ClaimMovement.Extension?.Claim?.TriageCategory?.toLowerCase() == elt.DisplayName.toLowerCase())
  }

  /**
   * Gets the ClaimMovement.Claim.PcsReference (A PcsReference).
   */
  property get PcsCatastropheCode(): ECFPCSCategoryCode_Ext {
    return ECFPCSCategoryCode_Ext.get(this.ClaimMovement.Claim?.PcsReference)
  }

  /**
   * Gets the ClaimMovement.Claim.LcoCatastropheReference (A LcoCatastropheReference).
   */
  property get LcoCatastropheCode(): ECFLCOCategoryCode_Ext {
    return ECFLCOCategoryCode_Ext.get(this.ClaimMovement.Claim?.LcoCatastropheReference)
  }


  /**
   * Gets the Claimant Name.
   */
  property get ClaimantName(): String {
    if (!this.ClaimMovement.Claimant?.Empty) {
      return this.ClaimMovement.Claimant?[0].Party.Name
    } else {
      return null
    }
  }

  /**
   * Gets the ClaimStatus.
   */
  property get ClaimStatus(): ECFMessageClaimStatus_Ext {
    return ECFMessageClaimStatus_Ext.get(this.ClaimMovement.Extension?.Claim?.ClaimStatus)
  }


  /**
   * Gets the JvClassOfBusiness.
   */
  property get JvClassOfBusiness(): ECFClassOfBusiness_Ext {
    if (!this.ClaimMovement.ClaimOriginalPolicy?.Empty) {
      return ECFClassOfBusiness_Ext.get(this.ClaimMovement.ClaimOriginalPolicy?[0].JvClassOfBusiness)
    } else {
      return null
    }
  }

  /**
   * Gets the ClaimOriginalPolicy Name.
   */
  property get ClaimOriginalPolicyName(): String {
    return this.ClaimMovement.ClaimOriginalPolicy?.first()?.OriginalPolicyholder?.Party?.Name
  }

  /**
   * Gets the ClaimMovement.ContractSection.InsuredRiskOrInterestDescription.
   *
   * @return String
   */
  property get RiskDescription(): String {
    return this.ClaimMovement.ContractSection?.InsuredRiskOrInterestDescription
  }

  /**
   * Gets the ClaimMovement.Extension.Contract.BrokerPolicyReference1.
   *
   * @return String
   */
  property get BrokerPolicyReference(): String {
    return this.ClaimMovement.Extension?.Contract?.BrokerPolicyReference1
  }

  /**
   * Gets the ClaimMovement.Extension.Contract.RiskLocation.Location.Description.
   *
   * @return String
   */
  property get RiskLocation(): String {
    return this.ClaimMovement.Extension?.Contract?.RiskLocation?.Location?.Description
  }

  /**
   * Check if this is ECF Respond Error
   *
   * @return boolean If true if this message is a Respond Error Notify
   */
  public function isECFRespondError(): boolean {
    return this.ClaimMovement == null and this.hasErrorsAndWarnings() and not this.hasAdditionalInformation()
  }

  /**
   * Check if this is ECF Respond Error
   *
   * @return boolean If true if this message is a Transaction Error where Claim Movement information is missing
   */
  public function isECFTransactionError(): boolean {
    return this.ClaimMovement == null and this.hasErrorsAndWarnings() and this.hasAdditionalInformation()
  }

  /**
   * Check if this is has Errors and Warnings
   *
   * @return boolean If true, message contains ErrorsAndWarnings
   */
  public function hasErrorsAndWarnings(): boolean {
    return this.ErrorsAndWarnings?.Result != null
  }

  /**
   * Check if this is has Additional Information
   *
   * @return boolean If true, message contains AdditionalInformation ExtendedFields
   */
  public function hasAdditionalInformation(): boolean {
    return this.AdditionalInformation?.ExtendedFields != null
  }


  /**
   * Gets the ClaimMovement.ContractSection.PolicyType.
   *
   * @return String
   */
  property get PolicyType(): String {
    return this.ClaimMovement.ContractSection?.PolicyType?.elide(ClaimDataPolicyCreator.POLICY_TYPE_MAX_WIDTH)
  }

  /**
   * Gets the ClaimMovement.ContractSection.CoverType.
   *
   * @return String
   */
  property get CoverType(): String {
    return this.ClaimMovement.ContractSection?.CoverType
  }

  /**
   * Reads the Transaction Status Code from the XML payload, for the ClaimNotifyEventRq message type.
   * The Code will have the format "STATUS_CODE-CODE_DESCRIPTION" where STATUS_CODE is usually an integer number
   * and CODE_DESCRIPTION is a capitalized text description of that code e.g. "8-PURGED".
   * Only one of the three eligible elements should contain the Transaction Code.
   *
   * @return The Transaction Status Code from the ClaimNotifyEventRq XML, null if none was found
   */
  property get TransactionStatus(): String {
    return this.LloydsStatus?:(this.LirmaStatus?:this.IluStatus)
  }

  /**
   * Gets the ClaimMovement.Extension.ClaimEntry.LloydsStatus.
   *
   * @return String
   */
  property get LloydsStatus(): String {
    return this.ClaimMovement.Extension?.ClaimEntry?.LloydsStatus
  }

  /**
   * Gets the ClaimMovement.Extension.ClaimEntry.LirmaStatus.
   *
   * @return String
   */
  property get LirmaStatus(): String {
    return this.ClaimMovement.Extension?.ClaimEntry?.LirmaStatus
  }

  /**
   * Gets the ClaimMovement.Extension.ClaimEntry.IluStatus.
   *
   * @return String
   */
  property get IluStatus(): String {
    return this.ClaimMovement.Extension?.ClaimEntry?.IluStatus
  }

  /**
   * Gets the Adjuster name.
   *
   * @return String
   */
  property get AdjusterName(): String {
    return this.ClaimMovement.Claim?.AdjusterName
  }

  /**
   * Gets the Adjuster Reference
   *
   * @return String
   */
  property get AdjusterReference(): String {
    return this.ClaimMovement.Claim?.AdjusterReference
  }

  /**
   * Gets the Bureau Lead Insurer Or Reinsurer Name
   *
   * @return String
   */
  property get BureauLeadInsurerOrReinsurerName(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party?.Name
  }

  /**
   * Gets ContactName of the Bureau Lead Insurer Or Reinsurer
   *
   * @return String
   */
  property get BureauLeadInsurerOrReinsurerContactName(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Contact?.PersonName
  }

  /**
   * Gets ContactPhone of the Bureau Lead Insurer Or Reinsurer
   *
   * @return String
   */
  property get BureauLeadInsurerOrReinsurerContactPhone(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Contact?.Telephone
  }

  /**
   * Gets ContactEmail of the Bureau Lead Insurer Or Reinsurer
   *
   * @return String
   */
  property get BureauLeadInsurerOrReinsurerContactEmail(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Contact?.Email
  }

  /**
   * Gets the Insurer Id
   *
   * @return String
   */
  property get InsurerId(): String {
    return this.ClaimMovement.Insurer?.Party?.FirstId
  }

  /**
   * Gets the Insurer Name
   *
   * @return String
   */
  property get InsurerName(): String {
    return this.ClaimMovement.Insurer?.Party?.Name
  }

  /**
   * Gets the Insurer Agency
   *
   * @return String
   */
  property get InsurerAgency(): String {
    return this.ClaimMovement.Insurer?.Party?.FirstAgency
  }

  /**
   * Gets the Reinsurer Id
   *
   * @return String
   */
  property get ReinsurerId(): String {
    return this.ClaimMovement.Reinsurer?.Party?.FirstId
  }

  /**
   * Gets the Reinsurer Name
   *
   * @return String
   */
  property get ReinsurerName(): String {
    return this.ClaimMovement.Reinsurer?.Party?.Name
  }

  /**
   * Gets the Reinsurer Agency
   *
   * @return String
   */
  property get ReinsurerAgency(): String {
    return this.ClaimMovement.Reinsurer?.Party?.FirstAgency
  }

  /**
   * Gets the Lawyer Name
   *
   * @return String
   */
  property get LawyerName(): String {
    return this.ClaimMovement.Claim?.LawyerName
  }

  /**
   * Gets the Lawyer Reference
   *
   * @return String
   */
  property get LawyerReference(): String {
    return this.ClaimMovement.Claim?.LawyerReference
  }

  /**
   * Gets a list of Soft Warning descriptions from the message or empty list if no Soft Warnings exist
   *
   * @return {@link java.util.List<String>} List of Soft warnings
   */
  property get SoftWarnings(): List<String> {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.SoftWarnings?.map(\warning -> warning.SoftWarningsDescription)
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.ImmediatePartCollectionIndicator element
   *
   * @return {@link java.lang.String} ImmediatePartCollectionIndicator
   */
  property get ImmediatePartCollectionIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.ImmediatePartCollectionIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.NoFurtherResponseIndicator element
   *
   * @return {@link java.lang.String} NoFurtherResponseIndicator
   */
  property get NoFurtherResponseIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.NoFurtherResponseIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.NoFurtherResponseIndicator element
   *
   * @return {@link java.lang.String} MultipleResponseIndicator
   */
  property get MultipleResponseIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.MultipleResponseIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.CedantInLiquidationIndicator element
   *
   * @return {@link java.lang.String} CedantInLiquidationIndicator
   */
  property get CedantInLiquidationIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.CedantInLiquidationIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.ChaseUpIndicator.Indicator element
   *
   * @return {@link java.lang.String} ChaseUpIndicator
   */
  property get ChaseUpIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.ChaseUpIndicator?.Indicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.ChaseUpIndicator.Interval element
   *
   * @return {@link java.lang.Integer} ChaseUpIndicatorInterval
   */
  property get ChaseUpIndicatorInterval(): Integer {
    final var chaseUpIndicatorInterval = this.ClaimMovement?.Extension?.Claim?.Indicators?.ChaseUpIndicator?.Interval
    return chaseUpIndicatorInterval == null ? null : chaseUpIndicatorInterval.intValue()
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.ContractualConditionsMayApplyIndicator element
   *
   * @return {@link java.lang.String} ContractualConditionsMayApplyIndicator
   */
  property get ContractualConditionsMayApplyIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.ContractualConditionsMayApplyIndicator
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.SimultaneousReinstatementProcessed element
   *
   * @return {@link java.lang.String} SimultaneousReinstatementProcessed
   */
  property get SimultaneousReinstatementProcessed(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.SimultaneousReinstatementProcessed
  }

  /**
   * Gets the ClaimMovement.Extension.Claim.Indicators.CollectionUnlikelyIndicator element
   *
   * @return {@link java.lang.String} CollectionUnlikelyIndicator
   */
  property get CollectionUnlikelyIndicator(): String {
    return this.ClaimMovement?.Extension?.Claim?.Indicators?.CollectionUnlikelyIndicator
  }

  /**
   * @return the Field Name for UCR used in TransactionErrorNotify messages
   */
  property get UCR_FIELD_NAME(): String {
    return "UCR"
  }

  /**
   * @return the Field Name for UMR used in TransactionErrorNotify messages
   */
  property get UMR_FIELD_NAME(): String {
    return "UMR"
  }

  /**
   * @return the Field Name for TR used in TransactionErrorNotify messages
   */
  property get TR_FIELD_NAME(): String {
    return "TR"
  }

  /**
   * @return the Field Name for Bureau used in TransactionErrorNotify messages
   */
  property get BUREAU_FIELD_NAME(): String {
    return "Bureau"
  }

  /**
   * @return the Field Name for MessageSequenceNumber used in TransactionErrorNotify messages
   */
  property get MESSAGE_SEQUENCE_NUMBER_FIELD_NAME(): String {
    return "MessageSequenceNumber"
  }


}