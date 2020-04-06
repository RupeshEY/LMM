package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimData_Ext.eti;ECFMessageClaimData_Ext.eix;ECFMessageClaimData_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimData_ExtInternal extends com.guidewire._generated.entity.ECFMessage_ExtInternal {
  /**
   * Adds the given element to the AggregateDetails array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAggregateDetails(entity.ECFMessageAggregateDetail_Ext element);
  
  
  /**
   * Adds the given element to the BrokerComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBrokerComments(entity.ECFMessageBrokerComment_Ext element);
  
  
  /**
   * Adds the given element to the BulkClaims array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBulkClaims(entity.ECFMessageBulkClaim_Ext element);
  
  
  /**
   * Adds the given element to the Carriers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCarriers(entity.ECFMessageClaimDataCarrier_Ext element);
  
  
  /**
   * Adds the given element to the CrossMarketPrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element);
  
  
  /**
   * Adds the given element to the CrossMarketPublicComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element);
  
  
  /**
   * Adds the given element to the Docs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocs(entity.ECFMessageClaimDataDocument_Ext element);
  
  
  /**
   * Adds the given element to the ECFContractMarkets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToECFContractMarkets(entity.ECFContractMarket_Ext element);
  
  
  /**
   * Adds the given element to the ErrorsOrWarnings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element);
  
  
  /**
   * Adds the given element to the Financials array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFinancials(entity.ECFMessageClaimDataFinancial_Ext element);
  
  
  /**
   * Adds the given element to the ParallelClaimsUCR array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element);
  
  
  /**
   * Adds the given element to the PrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPrivateComments(entity.ECFMessagePrivateComment_Ext element);
  
  
  /**
   * Adds the given element to the PublicComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPublicComments(entity.ECFMessagePublicComment_Ext element);
  
  
  /**
   * Adds the given element to the SlipLeadComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element);
  
  
  /**
   * Adds the given element to the SoftWarnings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSoftWarnings(entity.ECFMessageSoftWarning_Ext element);
  
  
  /**
   * Gets the value of the ActionCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFActionCode_Ext getActionCode();
  
  
  /**
   * Gets the value of the AggregateDetails field.
   * Aggregate Details comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageAggregateDetail_Ext[] getAggregateDetails();
  
  
  /**
   * Gets the value of the AmendmentDetails field.
   * Description of the 'business' reason for the sending of this claims message (e.g. 'On Account settlement')
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAmendmentDetails();
  
  
  /**
   * Gets the value of the AsOfDate field.
   * Date/time action occurred (transaction created or updated or response made)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAsOfDate();
  
  
  /**
   * Gets the value of the BrokerComments field.
   * broker additional comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBrokerComment_Ext[] getBrokerComments();
  
  
  /**
   * Gets the value of the BrokerContact field.
   * Text giving name of an individual who should serve as first point of contact for this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerContact();
  
  
  /**
   * Gets the value of the BrokerEmail field.
   * Text giving the email address of the person  to be contacted in a broking organisation. May not be the person who submits the transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerEmail();
  
  
  /**
   * Gets the value of the BrokerId field.
   * Coded identification of a broking organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerId();
  
  
  /**
   * Gets the value of the BrokerName field.
   * The name of the Broker organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerName();
  
  
  /**
   * Gets the value of the BrokerPhone field.
   * Telephone number of the name or department within the broker organisation to be contacted in relation to a transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerPhone();
  
  
  /**
   * Gets the value of the BrokerReference field.
   * Broker policy reference 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerReference();
  
  
  /**
   * Gets the value of the BulkClaimHeaderTR field.
   * The Transaction Reference of the Bulk collection
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkClaimHeaderTR();
  
  
  /**
   * Gets the value of the BulkClaimHeaderUCR field.
   * The Unique Claim Reference of the bulk header
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkClaimHeaderUCR();
  
  
  /**
   * Gets the value of the BulkClaimNoOfItems field.
   * The number of bulk items included in the bulk
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBulkClaimNoOfItems();
  
  
  /**
   * Gets the value of the BulkClaims field.
   * ECF Claim Data Message Bulk Claims
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBulkClaim_Ext[] getBulkClaims();
  
  
  /**
   * Gets the value of the BureauType field.
   * The carrier's bureau type for this transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauType();
  
  
  /**
   * Gets the value of the Carriers field.
   * ECF Claim Data Message Carriers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataCarrier_Ext[] getCarriers();
  
  
  /**
   * Gets the value of the CategoryCode field.
   * Claim category code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimCategoryCode_Ext getCategoryCode();
  
  
  /**
   * Gets the value of the CedantInLiquidationIndicator field.
   * Indicates that the cedant is in liquidation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCedantInLiquidationIndicator();
  
  
  /**
   * Gets the value of the ChaseUpIndicator field.
   * Indicates whether chase up required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChaseUpIndicator();
  
  
  /**
   * Gets the value of the ChaseUpIndicatorInterval field.
   * The period (in months) before a chase up will be issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getChaseUpIndicatorInterval();
  
  
  /**
   * Gets the value of the ClaimLineNumber field.
   * The Claim Line Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimLineNumber();
  
  
  /**
   * Gets the value of the ClaimResponseUUId field.
   * ClaimResponseUUId - Unique Universal Identifier of the ClaimResponseRq message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimResponseUUId();
  
  
  /**
   * Gets the value of the ClaimStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageClaimStatus_Ext getClaimStatus();
  
  
  /**
   * Gets the value of the Claimant field.
   * Name of the claimant involved in a loss
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimant();
  
  
  /**
   * Gets the value of the ClaimsScheme field.
   * The claims scheme applicable to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFScheme_Ext getClaimsScheme();
  
  
  /**
   * Gets the value of the ClassOfBusiness field.
   * Code for identifying the class of business (for ILU and LIRMA). AKA JvClassOfBusiness in the XML
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClassOfBusiness_Ext getClassOfBusiness();
  
  
  /**
   * Gets the value of the CoLeadIndicator field.
   * Indicator Y/N to indicate if a Binding authority UCR has Co-Leads on it
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoLeadIndicator();
  
  
  /**
   * Gets the value of the CollectionUnlikelyIndicator field.
   * Collection unlikely indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCollectionUnlikelyIndicator();
  
  
  /**
   * Gets the value of the ContractualConditionsIndicator field.
   * Indicates that contractual conditions apply to claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContractualConditionsIndicator();
  
  
  /**
   * Gets the value of the CoverType field.
   * Code expressing the type of cover (quota share, surplus, XOL..)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoverType();
  
  
  /**
   * Gets the value of the CrossMarketPrivateComments field.
   * Cross market private comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageCrossMarketPrivateComment_Ext[] getCrossMarketPrivateComments();
  
  
  /**
   * Gets the value of the CrossMarketPublicComments field.
   * Cross market public comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageCrossMarketPublicComment_Ext[] getCrossMarketPublicComments();
  
  
  /**
   * Gets the value of the Docs field.
   * ECF Claim Data Message Documents
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataDocument_Ext[] getDocs();
  
  
  /**
   * Gets the value of the ECFContactData field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataContacts_Ext getECFContactData();
  
  
  public gw.pl.persistence.core.Key getECFContactDataID();
  
  
  /**
   * Gets the value of the ECFContractMarkets field.
   * An array holds the information about the parties and their role in each claim data message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFContractMarket_Ext[] getECFContractMarkets();
  
  
  /**
   * Gets the value of the ECFTransactionState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFTransactionState_Ext getECFTransactionState();
  
  
  public gw.pl.persistence.core.Key getECFTransactionStateID();
  
  
  /**
   * Gets the value of the ErrorsOrWarnings field.
   * Errors or Warnings
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageErrorOrWarning_Ext[] getErrorsOrWarnings();
  
  
  /**
   * Gets the value of the FileFormat field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFFileFormat_Ext getFileFormat();
  
  
  /**
   * Gets the value of the Financials field.
   * ECF Claim Data Message Financials
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataFinancial_Ext[] getFinancials();
  
  
  /**
   * Gets the value of the ImmediatePartCollectionInd field.
   * Immediate part collection indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImmediatePartCollectionInd();
  
  
  /**
   * Gets the value of the Insured field.
   * Name of insured person or organization in free text
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsured();
  
  
  /**
   * Gets the value of the InsuredName field.
   * Insured Name for this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredName();
  
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef1 field.
   * The insurer or reinsurer claim reference number 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef1();
  
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef2 field.
   * The insurer or reinsurer claim reference number 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef2();
  
  
  /**
   * Gets the value of the InsurerReference field.
   * Reference allocated to the sender transaction reference. Either Insurer or reinsurer transaction reference must be provided
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerReference();
  
  
  /**
   * Gets the value of the LcoCatastropheCode field.
   * Reference assigned to a catastrophe by the the Lloyd's Claims Office (LCO) related to a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFLCOCategoryCode_Ext getLcoCatastropheCode();
  
  
  /**
   * Gets the value of the LeadName field.
   * The name of the lead Insurer for the claim where more than one market is involved in the claim. Name and not ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeadName();
  
  
  /**
   * Gets the value of the LossCause field.
   * Code which identifies the claim cause. Cause code has to be provided on first advice by lead, will default to previous value on subsequent transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossCause();
  
  
  /**
   * Gets the value of the LossDateQualifier field.
   * Code identification of what the Loss Date From and To represent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFLossDateQualifier_Ext getLossDateQualifier();
  
  
  /**
   * Gets the value of the LossDetails field.
   * The loss details
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDetails();
  
  
  /**
   * Gets the value of the LossEndDate field.
   * End date of period during which a loss occurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossEndDate();
  
  
  /**
   * Gets the value of the LossLocation field.
   * Text description of the location of the loss being reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocation();
  
  
  /**
   * Gets the value of the LossOrEventName field.
   * Textual details on the loss or event which is the subject of the original insurance of the individual loss included in the transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossOrEventName();
  
  
  /**
   * Gets the value of the LossStartDate field.
   * Start date of period during which a loss occurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossStartDate();
  
  
  /**
   * Gets the value of the MessageState field.
   * Identifies the state of Claim Data message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimMessageState_Ext getMessageState();
  
  
  /**
   * Gets the value of the MultipleResponseIndicator field.
   * Indicates that a multiple response is being actioned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMultipleResponseIndicator();
  
  
  /**
   * Gets the value of the NoFurtherResponseIndicator field.
   * No Further Response Indicator. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNoFurtherResponseIndicator();
  
  
  /**
   * Gets the value of the OriginalSplitReferenceCSV field.
   * Financials: The Bureau reference allocated to the premium transaction relating to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOriginalSplitReferenceCSV();
  
  
  /**
   * Gets the value of the OutstandingAmountQualifier field.
   * Financials: Qualifier providing more information about the outstanding amount and/or the claim in general
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFOutstandingQualifierCode_Ext getOutstandingAmountQualifier();
  
  
  /**
   * Gets the value of the ParallelClaimsUCR field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataParallelClaimUCR_Ext[] getParallelClaimsUCR();
  
  
  /**
   * Gets the value of the PcsCatastropheCode field.
   * Reference assigned to a catastrophe by the Property Claim Service (PCS) related to a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFPCSCategoryCode_Ext getPcsCatastropheCode();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * ClaimNotifyRq/ClaimRetrieveRs.ClaimMovement.Contract.InsurerRiskReference
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Description of a policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyType();
  
  
  /**
   * Gets the value of the Policyholder field.
   * Identity of the party that took the original insurance with the insurance company that ceded the business expressed in text form
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyholder();
  
  
  /**
   * Gets the value of the PrivateComments field.
   * private comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePrivateComment_Ext[] getPrivateComments();
  
  
  /**
   * Gets the value of the PublicComments field.
   * public comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePublicComment_Ext[] getPublicComments();
  
  
  /**
   * Gets the value of the RiskCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFRiskCode_Ext getRiskCode();
  
  
  /**
   * Gets the value of the RiskDescription field.
   * Text giving a description of the insured risk, contract or layer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskDescription();
  
  
  /**
   * Gets the value of the RiskLocation field.
   * Description of situation of insured interest, or journey
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskLocation();
  
  
  /**
   * Gets the value of the RiskReference field.
   * Syndicate or company’s risk reference 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskReference();
  
  
  /**
   * Gets the value of the SettlementCurrency field.
   * Financials: The currency in which amounts will be settled
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementCurrency();
  
  
  /**
   * Gets the value of the SimultaneousReinstatementProcd field.
   * Indicates that the Reinstatement Premium has been processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSimultaneousReinstatementProcd();
  
  
  /**
   * Gets the value of the SimultaneousReinstatementReq field.
   * Indicates whether a simultaneous Reinstatement Premium is required
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSimultaneousReinstatementReq();
  
  
  /**
   * Gets the value of the SlipLeadComments field.
   * slip lead comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageSlipLeadComment_Ext[] getSlipLeadComments();
  
  
  /**
   * Gets the value of the SoftWarnings field.
   * Soft Warnings
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageSoftWarning_Ext[] getSoftWarnings();
  
  
  /**
   * Gets the value of the SubCategoryCode field.
   * Claim subcategory code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimSubCatCode_Ext getSubCategoryCode();
  
  
  /**
   * Gets the value of the TransactionSequence field.
   * A number assigned to indicate the sequence of the transaction within the UCR
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTransactionSequence();
  
  
  /**
   * Gets the value of the TransactionStatus field.
   * The status of Lloyd's, LIRMA, ILU Transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFTransactionStatus_Ext getTransactionStatus();
  
  
  /**
   * Gets the value of the TransactionType field.
   * Identifies the type of transaction and will notify if the message is a first advice (with or without settlement) and interim advice (with or without settlement). The sender and receiver should make sure that this data element is populated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTransactionType_Ext getTransactionType();
  
  
  /**
   * Gets the value of the TriageCategory field.
   * An indication of the complexity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFTriageCode_Ext getTriageCategory();
  
  
  /**
   * Gets the value of the UnderwritingYear field.
   * Year in which the contract, or an individual risk covered by the contract, is underwritten. Only for Lloyd’s. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUnderwritingYear();
  
  
  /**
   * Gets the value of the XcsToAgreeIndicator field.
   * XcsToAgreeIndicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getXcsToAgreeIndicator();
  
  
  /**
   * Gets the value of the ConflictOfInterestInd field.
   * States if this message indicates a Conflict Of Interest on the Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isConflictOfInterestInd();
  
  
  /**
   * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
   */
  public void removeFromAggregateDetails(entity.ECFMessageAggregateDetail_Ext element);
  
  
  /**
   * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateDetails(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
   */
  public void removeFromBrokerComments(entity.ECFMessageBrokerComment_Ext element);
  
  
  /**
   * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBrokerComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
   */
  public void removeFromBulkClaims(entity.ECFMessageBulkClaim_Ext element);
  
  
  /**
   * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBulkClaims(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
   */
  public void removeFromCarriers(entity.ECFMessageClaimDataCarrier_Ext element);
  
  
  /**
   * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCarriers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
   */
  public void removeFromCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element);
  
  
  /**
   * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCrossMarketPrivateComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
   */
  public void removeFromCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element);
  
  
  /**
   * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCrossMarketPublicComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Docs array. This is achieved by marking the element for removal.
   */
  public void removeFromDocs(entity.ECFMessageClaimDataDocument_Ext element);
  
  
  /**
   * Removes the given element from the Docs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
   */
  public void removeFromECFContractMarkets(entity.ECFContractMarket_Ext element);
  
  
  /**
   * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromECFContractMarkets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   */
  public void removeFromErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element);
  
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromErrorsOrWarnings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Financials array. This is achieved by marking the element for removal.
   */
  public void removeFromFinancials(entity.ECFMessageClaimDataFinancial_Ext element);
  
  
  /**
   * Removes the given element from the Financials array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFinancials(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
   */
  public void removeFromParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element);
  
  
  /**
   * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParallelClaimsUCR(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
   */
  public void removeFromPrivateComments(entity.ECFMessagePrivateComment_Ext element);
  
  
  /**
   * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPrivateComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
   */
  public void removeFromPublicComments(entity.ECFMessagePublicComment_Ext element);
  
  
  /**
   * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPublicComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
   */
  public void removeFromSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element);
  
  
  /**
   * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSlipLeadComments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
   */
  public void removeFromSoftWarnings(entity.ECFMessageSoftWarning_Ext element);
  
  
  /**
   * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSoftWarnings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ActionCode field.
   */
  public void setActionCode(typekey.ECFActionCode_Ext value);
  
  
  /**
   * Sets the value of the AggregateDetails field.
   */
  public void setAggregateDetails(entity.ECFMessageAggregateDetail_Ext[] value);
  
  
  /**
   * Sets the value of the AmendmentDetails field.
   */
  public void setAmendmentDetails(java.lang.String value);
  
  
  /**
   * Sets the value of the AsOfDate field.
   */
  public void setAsOfDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BrokerComments field.
   */
  public void setBrokerComments(entity.ECFMessageBrokerComment_Ext[] value);
  
  
  /**
   * Sets the value of the BrokerContact field.
   */
  public void setBrokerContact(java.lang.String value);
  
  
  /**
   * Sets the value of the BrokerEmail field.
   */
  public void setBrokerEmail(java.lang.String value);
  
  
  /**
   * Sets the value of the BrokerId field.
   */
  public void setBrokerId(java.lang.String value);
  
  
  /**
   * Sets the value of the BrokerName field.
   */
  public void setBrokerName(java.lang.String value);
  
  
  /**
   * Sets the value of the BrokerPhone field.
   */
  public void setBrokerPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the BrokerReference field.
   */
  public void setBrokerReference(java.lang.String value);
  
  
  /**
   * Sets the value of the BulkClaimHeaderTR field.
   */
  public void setBulkClaimHeaderTR(java.lang.String value);
  
  
  /**
   * Sets the value of the BulkClaimHeaderUCR field.
   */
  public void setBulkClaimHeaderUCR(java.lang.String value);
  
  
  /**
   * Sets the value of the BulkClaimNoOfItems field.
   */
  public void setBulkClaimNoOfItems(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the BulkClaims field.
   */
  public void setBulkClaims(entity.ECFMessageBulkClaim_Ext[] value);
  
  
  /**
   * Sets the value of the BureauType field.
   */
  public void setBureauType(typekey.ECFBureauType_Ext value);
  
  
  /**
   * Sets the value of the Carriers field.
   */
  public void setCarriers(entity.ECFMessageClaimDataCarrier_Ext[] value);
  
  
  /**
   * Sets the value of the CategoryCode field.
   */
  public void setCategoryCode(typekey.ECFClaimCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the CedantInLiquidationIndicator field.
   */
  public void setCedantInLiquidationIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the ChaseUpIndicator field.
   */
  public void setChaseUpIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the ChaseUpIndicatorInterval field.
   */
  public void setChaseUpIndicatorInterval(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimLineNumber field.
   */
  public void setClaimLineNumber(java.lang.Long value);
  
  
  /**
   * Sets the value of the ClaimResponseUUId field.
   */
  public void setClaimResponseUUId(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimStatus field.
   */
  public void setClaimStatus(typekey.ECFMessageClaimStatus_Ext value);
  
  
  /**
   * Sets the value of the Claimant field.
   */
  public void setClaimant(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimsScheme field.
   */
  public void setClaimsScheme(typekey.ECFScheme_Ext value);
  
  
  /**
   * Sets the value of the ClassOfBusiness field.
   */
  public void setClassOfBusiness(typekey.ECFClassOfBusiness_Ext value);
  
  
  /**
   * Sets the value of the CoLeadIndicator field.
   */
  public void setCoLeadIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the CollectionUnlikelyIndicator field.
   */
  public void setCollectionUnlikelyIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the ConflictOfInterestInd field.
   */
  public void setConflictOfInterestInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ContractualConditionsIndicator field.
   */
  public void setContractualConditionsIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the CoverType field.
   */
  public void setCoverType(java.lang.String value);
  
  
  /**
   * Sets the value of the CrossMarketPrivateComments field.
   */
  public void setCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext[] value);
  
  
  /**
   * Sets the value of the CrossMarketPublicComments field.
   */
  public void setCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext[] value);
  
  
  /**
   * Sets the value of the Docs field.
   */
  public void setDocs(entity.ECFMessageClaimDataDocument_Ext[] value);
  
  
  /**
   * Sets the value of the ECFContactData field.
   */
  public void setECFContactData(entity.ECFMessageClaimDataContacts_Ext value);
  
  
  public void setECFContactDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ECFContractMarkets field.
   */
  public void setECFContractMarkets(entity.ECFContractMarket_Ext[] value);
  
  
  /**
   * Sets the value of the ECFTransactionState field.
   */
  public void setECFTransactionState(entity.ECFTransactionState_Ext value);
  
  
  public void setECFTransactionStateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ErrorsOrWarnings field.
   */
  public void setErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext[] value);
  
  
  /**
   * Sets the value of the FileFormat field.
   */
  public void setFileFormat(typekey.ECFFileFormat_Ext value);
  
  
  /**
   * Sets the value of the Financials field.
   */
  public void setFinancials(entity.ECFMessageClaimDataFinancial_Ext[] value);
  
  
  /**
   * Sets the value of the ImmediatePartCollectionInd field.
   */
  public void setImmediatePartCollectionInd(java.lang.String value);
  
  
  /**
   * Sets the value of the Insured field.
   */
  public void setInsured(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredName field.
   */
  public void setInsuredName(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef1 field.
   */
  public void setInsurerOrReinsurerClaimRef1(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef2 field.
   */
  public void setInsurerOrReinsurerClaimRef2(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerReference field.
   */
  public void setInsurerReference(java.lang.String value);
  
  
  /**
   * Sets the value of the LcoCatastropheCode field.
   */
  public void setLcoCatastropheCode(typekey.ECFLCOCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the LeadName field.
   */
  public void setLeadName(java.lang.String value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(java.lang.String value);
  
  
  /**
   * Sets the value of the LossDateQualifier field.
   */
  public void setLossDateQualifier(typekey.ECFLossDateQualifier_Ext value);
  
  
  /**
   * Sets the value of the LossDetails field.
   */
  public void setLossDetails(java.lang.String value);
  
  
  /**
   * Sets the value of the LossEndDate field.
   */
  public void setLossEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(java.lang.String value);
  
  
  /**
   * Sets the value of the LossOrEventName field.
   */
  public void setLossOrEventName(java.lang.String value);
  
  
  /**
   * Sets the value of the LossStartDate field.
   */
  public void setLossStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MessageState field.
   */
  public void setMessageState(typekey.ECFClaimMessageState_Ext value);
  
  
  /**
   * Sets the value of the MultipleResponseIndicator field.
   */
  public void setMultipleResponseIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the NoFurtherResponseIndicator field.
   */
  public void setNoFurtherResponseIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the OriginalSplitReferenceCSV field.
   */
  public void setOriginalSplitReferenceCSV(java.lang.String value);
  
  
  /**
   * Sets the value of the OutstandingAmountQualifier field.
   */
  public void setOutstandingAmountQualifier(typekey.ECFOutstandingQualifierCode_Ext value);
  
  
  /**
   * Sets the value of the ParallelClaimsUCR field.
   */
  public void setParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext[] value);
  
  
  /**
   * Sets the value of the PcsCatastropheCode field.
   */
  public void setPcsCatastropheCode(typekey.ECFPCSCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(java.lang.String value);
  
  
  /**
   * Sets the value of the Policyholder field.
   */
  public void setPolicyholder(java.lang.String value);
  
  
  /**
   * Sets the value of the PrivateComments field.
   */
  public void setPrivateComments(entity.ECFMessagePrivateComment_Ext[] value);
  
  
  /**
   * Sets the value of the PublicComments field.
   */
  public void setPublicComments(entity.ECFMessagePublicComment_Ext[] value);
  
  
  /**
   * Sets the value of the RiskCode field.
   */
  public void setRiskCode(typekey.ECFRiskCode_Ext value);
  
  
  /**
   * Sets the value of the RiskDescription field.
   */
  public void setRiskDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the RiskLocation field.
   */
  public void setRiskLocation(java.lang.String value);
  
  
  /**
   * Sets the value of the RiskReference field.
   */
  public void setRiskReference(java.lang.String value);
  
  
  /**
   * Sets the value of the SettlementCurrency field.
   */
  public void setSettlementCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the SimultaneousReinstatementProcd field.
   */
  public void setSimultaneousReinstatementProcd(java.lang.String value);
  
  
  /**
   * Sets the value of the SimultaneousReinstatementReq field.
   */
  public void setSimultaneousReinstatementReq(java.lang.String value);
  
  
  /**
   * Sets the value of the SlipLeadComments field.
   */
  public void setSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext[] value);
  
  
  /**
   * Sets the value of the SoftWarnings field.
   */
  public void setSoftWarnings(entity.ECFMessageSoftWarning_Ext[] value);
  
  
  /**
   * Sets the value of the SubCategoryCode field.
   */
  public void setSubCategoryCode(typekey.ECFClaimSubCatCode_Ext value);
  
  
  /**
   * Sets the value of the TransactionSequence field.
   */
  public void setTransactionSequence(java.lang.String value);
  
  
  /**
   * Sets the value of the TransactionStatus field.
   */
  public void setTransactionStatus(typekey.ECFTransactionStatus_Ext value);
  
  
  /**
   * Sets the value of the TransactionType field.
   */
  public void setTransactionType(typekey.ECFClaimTransactionType_Ext value);
  
  
  /**
   * Sets the value of the TriageCategory field.
   */
  public void setTriageCategory(typekey.ECFTriageCode_Ext value);
  
  
  /**
   * Sets the value of the UnderwritingYear field.
   */
  public void setUnderwritingYear(java.lang.Integer value);
  
  
  /**
   * Sets the value of the XcsToAgreeIndicator field.
   */
  public void setXcsToAgreeIndicator(java.lang.String value);
  
  
  
}