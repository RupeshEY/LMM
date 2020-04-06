package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.api.databuilder.DataBuilder
uses gw.api.databuilder.ValueGenerator

uses java.math.BigDecimal

public class ECFMessageClaimNotifyRq_ExtBuilder extends DataBuilder<ECFMessageClaimNotifyRq_Ext, ECFMessageClaimNotifyRq_ExtBuilder> {

  construct() {
    super(ECFMessageClaimNotifyRq_Ext)
  }


  public function withActionCode(value: typekey.ECFActionCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ActionCode, value)
    return this
  }

  public function withActionParticipant(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ActionParticipant, value)
    return this
  }

  public function withActionParticipantType(value: typekey.ECFParticipationType_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ActionParticipantType, value)
    return this
  }

  public function withAmendmentDetails(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AmendmentDetails, value)
    return this
  }

  public function withAssignedByUserBuilder(builder: ValueGenerator<entity.User>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedByUser, builder)
    return this
  }

  public function withAssignedByUser(value: entity.User): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedByUser, value)
    return this
  }

  public function withAssignedGroupBuilder(builder: ValueGenerator<entity.Group>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedGroup, builder)
    return this
  }

  public function withAssignedGroup(value: entity.Group): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedGroup, value)
    return this
  }

  public function withAssignedQueueBuilder(builder: ValueGenerator<entity.AssignableQueue>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedQueue, builder)
    return this
  }

  public function withAssignedQueue(value: entity.AssignableQueue): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedQueue, value)
    return this
  }

  public function withAssignedUserBuilder(builder: ValueGenerator<entity.User>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedUser, builder)
    return this
  }

  public function withAssignedUser(value: entity.User): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AssignedUser, value)
    return this
  }

  public function withBrokerContact(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerContact, value)
    return this
  }

  public function withBrokerEmail(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerEmail, value)
    return this
  }

  public function withBrokerId(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerId, value)
    return this
  }

  public function withBureauType(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BureauType, value)
    return this
  }

  public function withBrokerName(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerName, value)
    return this
  }

  public function withBrokerPhone(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerPhone, value)
    return this
  }

  public function withBrokerReference(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#BrokerReference, value)
    return this
  }

  public function withCarriersBuilder(builder: ValueGenerator<entity.ECFMessageClaimDataCarrier_Ext[]>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Carriers, builder)
    return this
  }

  public function withCarriers(value: entity.ECFMessageClaimDataCarrier_Ext[]): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Carriers, value)
    return this
  }

  public function withBureauTransactionStatus(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TransactionStatus, value)
    return this
  }

  public function addECFContractMarket(value: ECFContractMarket_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    addArrayElement(ECFMessageClaimNotifyRq_Ext#ECFContractMarkets, value)
    return this
  }

  public function withClaimBuilder(builder: ValueGenerator<entity.Claim>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Claim, builder)
    return this
  }

  public function withClaim(value: entity.Claim): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Claim, value)
    return this
  }

  public function withClaimLineNumber(value: Long): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ClaimLineNumber, value)
    return this
  }

  public function withClaimStatus(value: typekey.ECFMessageClaimStatus_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ClaimStatus, value)
    return this
  }

  public function withClaimType(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ClaimType, value)
    return this
  }

  public function withClaimant(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Claimant, value)
    return this
  }

  public function withCloseDate(value: Date): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#CloseDate, value)
    return this
  }

  public function withCoLeadIndicator(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#CoLeadIndicator, value)
    return this
  }

  public function withContent(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Content, new Blob(value.Bytes))
    return this
  }

  public function withCoverType(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#CoverType, value)
    return this
  }

  public function withDocsBuilder(builder: ValueGenerator<entity.ECFMessageClaimDataDocument_Ext[]>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Docs, builder)
    return this
  }

  public function withDocs(value: entity.ECFMessageClaimDataDocument_Ext[]): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Docs, value)
    return this
  }

  public function withECFContractMarketsBuilder(builder: ValueGenerator<ECFContractMarket_Ext[]>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ECFContractMarkets, builder)
    return this
  }

  public function withECFContractMarkets(value: ECFContractMarket_Ext[]): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ECFContractMarkets, value)
    return this
  }

  public function withFileFormat(value: typekey.ECFFileFormat_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#FileFormat, value)
    return this
  }

  public function withFinancialsBuilder(builder: ValueGenerator<entity.ECFMessageClaimDataFinancial_Ext[]>): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Financials, builder)
    return this
  }

  public function withFinancials(value: entity.ECFMessageClaimDataFinancial_Ext[]): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Financials, value)
    return this
  }

  public function withInsured(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Insured, value)
    return this
  }

  public function withInsurerTransactionReference(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#InsurerReference, value)
    return this
  }

  public function withLOB(value: typekey.ECFClassOfBusiness_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ClassOfBusiness, value)
    return this
  }

  public function withLcoCatastropheCode(value: typekey.ECFLCOCategoryCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LcoCatastropheCode, value)
    return this
  }

  public function withLeadName(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LeadName, value)
    return this
  }

  public function withLossCause(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossCause, value)
    return this
  }

  public function withLossDate(value: Date): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossStartDate, value)
    return this
  }

  public function withLossDetails(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossDetails, value)
    return this
  }

  public function withLossEndDate(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossEndDate, value)
    return this
  }

  public function withLossLocation(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossLocation, value)
    return this
  }

  public function withLossStartDate(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#LossStartDate, value)
    return this
  }

  public function withSuspended(value: Boolean): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Suspended, value)
    return this
  }

  public function withMessageState(value: typekey.ECFClaimMessageState_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#MessageState, value)
    return this
  }

  public function withOriginTimeStamp(value: Date): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#OriginTimeStamp, value)
    return this
  }

  public function withMessageSequence(value: BigDecimal): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#MessageSequence, value)
    return this
  }

  public function withPcsCatastropheCode(value: typekey.ECFPCSCategoryCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#PcsCatastropheCode, value)
    return this
  }

  public function withPolicyReference(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#PolicyNumber, value)
    return this
  }

  public function withPolicyType(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#PolicyType, value)
    return this
  }

  public function withPolicyholder(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Policyholder, value)
    return this
  }

  public function withResponseCode(value: typekey.ECFResponseCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ResponseCode, value)
    return this
  }

  public function withRiskCode(value: typekey.ECFRiskCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#RiskCode, value)
    return this
  }

  public function withRiskDescription(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#RiskDescription, value)
    return this
  }

  public function withRiskLocation(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#RiskLocation, value)
    return this
  }

  public function withRiskReference(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#RiskReference, value)
    return this
  }

  public function withStatus(value: typekey.ECFMessageStatus_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#Status, value)
    return this
  }

  public function withTR(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TR, value)
    return this
  }

  public function withTransactionSequence(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TransactionSequence, value)
    return this
  }

  public function withTransactionStatus(value: typekey.ECFTransactionStatus_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TransactionStatus, value)
    return this
  }

  public function withTransactionStatusType(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TransactionStatusType, value)
    return this
  }

  public function withTransactionType(value: typekey.ECFClaimTransactionType_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TransactionType, value)
    return this
  }

  public function withTriageCategory(value: typekey.ECFTriageCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#TriageCategory, value)
    return this
  }

  public function withAsOfDate(value: Date): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#AsOfDate, value)
    return this
  }

  public function withUCR(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#UCR, value)
    return this
  }

  public function withUMR(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#UMR, value)
    return this
  }

  public function withUUID(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#UUID, value)
    return this
  }

  public function withValidationFailureReason(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#ValidationFailureReason, value)
    return this
  }

  public function withOriginalSplitReferenceCSV(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#OriginalSplitReferenceCSV, value)
    return this
  }

  public function withOutstandingAmountQualifier(value: typekey.ECFOutstandingQualifierCode_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#OutstandingAmountQualifier, value)
    return this
  }

  public function withSettlementCurrency(value: typekey.Currency): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#SettlementCurrency, value)
    return this
  }

  public function withMessageType(value: ECFMessageType_Ext): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#MessageType, value)
    return this
  }

  public function withSender(value: String): ECFMessageClaimNotifyRq_ExtBuilder {
    set(ECFMessageClaimNotifyRq_Ext#SenderPartyId, value)
    return this
  }
}