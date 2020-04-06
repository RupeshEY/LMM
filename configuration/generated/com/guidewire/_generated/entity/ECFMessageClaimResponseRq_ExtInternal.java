package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimResponseRq_Ext.eti;ECFMessageClaimResponseRq_Ext.eix;ECFMessageClaimResponseRq_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimResponseRq_ExtInternal extends com.guidewire._generated.entity.ECFMessage_ExtInternal {
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the AgreementPartyModifications array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAgreementPartyModifications(entity.ECFResponseAPModification_Ext element);
  
  
  /**
   * Adds the given element to the ClaimParticipantRoles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimParticipantRoles(entity.ECFClaimParticipantRole_Ext element);
  
  
  /**
   * Adds the given element to the PrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPrivateComments(entity.ECFMessagePrivateComment_Ext element);
  
  
  /**
   * Adds the given element to the PublicComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPublicComments(entity.ECFMessagePublicComment_Ext element);
  
  
  /**
   * Adds the given element to the QueryReasons array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQueryReasons(entity.ECFResponseQueryReason_Ext element);
  
  
  /**
   * Gets the value of the Activities field.
   * Array of Approval / Approval Denied Activities linked to this Claim Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the AgreementPartyModifications field.
   * Agreement Party promotion and demotions made by a Lead
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFResponseAPModification_Ext[] getAgreementPartyModifications();
  
  
  /**
   * Gets the value of the AllUnderwritersToSeeFileInd field.
   * Indicator set by the leader to inform the broker that all underwriters on the market will need to see a copy of the file.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAllUnderwritersToSeeFileInd();
  
  
  /**
   * Gets the value of the ApprovalIssue field.
   * If this message needs approval before sending, this is the reason why
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getApprovalIssue();
  
  
  /**
   * Gets the value of the AsOfDate field.
   * Date/time action occurred (transaction created or updated or response made)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAsOfDate();
  
  
  /**
   * Gets the value of the BureauType field.
   * The carrier's bureau type for this transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauType();
  
  
  /**
   * Gets the value of the CategoryCode field.
   * Claim category code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimCategoryCode_Ext getCategoryCode();
  
  
  /**
   * Gets the value of the CauseOfLossCode field.
   * The new Claim Cause Of Loss set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFCauseOfLossCode_Ext getCauseOfLossCode();
  
  
  /**
   * Gets the value of the CedantInLiquidationIndicator field.
   * String representation of the CedantInLiquidationIndicator boolean
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCedantInLiquidationIndicator();
  
  
  /**
   * Gets the value of the ChaseUpIndicator field.
   * String representation of the ChaseUpIndicator boolean
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChaseUpIndicator();
  
  
  /**
   * Gets the value of the ChaseUpIndicatorInterval field.
   * String representation of the ChaseUpIndicator Interval
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
   * Gets the value of the ClaimParticipantRoles field.
   * Participants and their roles that can potentially be changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFClaimParticipantRole_Ext[] getClaimParticipantRoles();
  
  
  /**
   * Gets the value of the ClaimsScheme field.
   * The new Claims Scheme set in this Response
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
   * Gets the value of the ContactClassAccountId field.
   * The Account Code that the CLASS User ID belongs to of the person making the response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactClassAccountId();
  
  
  /**
   * Gets the value of the ContactClassUserId field.
   * The CLASS User ID of the person making the response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactClassUserId();
  
  
  /**
   * Gets the value of the ContactEmail field.
   * Email address of the name or department within the Insurer to be contacted in relation to a transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactEmail();
  
  
  /**
   * Gets the value of the ContactFax field.
   * Fax number of the name or department within the Insurer to be contacted in relation to transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactFax();
  
  
  /**
   * Gets the value of the ContactName field.
   * The person's name making the response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactName();
  
  
  /**
   * Gets the value of the ContactTelephone field.
   * Telephone number of the name or department within the Insurer to be contacted in relation to a transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactTelephone();
  
  
  /**
   * Gets the value of the ContractConditionsApplyInd field.
   * Indicates that contractual conditions apply to claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFContractConditions_Ext getContractConditionsApplyInd();
  
  
  /**
   * Gets the value of the Currency1 field.
   * The currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency1();
  
  
  /**
   * Gets the value of the Currency2 field.
   * The currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency2();
  
  
  /**
   * Gets the value of the Currency3 field.
   * The currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency3();
  
  
  /**
   * Gets the value of the ImmediatePartCollectionInd field.
   * Immediate part collection indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImmediatePartCollectionInd();
  
  
  /**
   * Gets the value of the ImportedServicesAmount1 field.
   * Change to the Imported Services Amount on the transaction in currency 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount1();
  
  
  /**
   * Gets the value of the ImportedServicesAmount1_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount1_amt();
  
  
  /**
   * Gets the value of the ImportedServicesAmount1_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount1_cur();
  
  
  /**
   * Gets the value of the ImportedServicesAmount2 field.
   * Change to the Imported Services Amount on the transaction in currency 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount2();
  
  
  /**
   * Gets the value of the ImportedServicesAmount2_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount2_amt();
  
  
  /**
   * Gets the value of the ImportedServicesAmount2_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount2_cur();
  
  
  /**
   * Gets the value of the ImportedServicesAmount3 field.
   * Change to the Imported Services Amount on the transaction in currency 3
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount3();
  
  
  /**
   * Gets the value of the ImportedServicesAmount3_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount3_amt();
  
  
  /**
   * Gets the value of the ImportedServicesAmount3_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount3_cur();
  
  
  /**
   * Gets the value of the ImportedServicesNarrative1 field.
   * Free format narrative to support the component claim imported services amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative1();
  
  
  /**
   * Gets the value of the ImportedServicesNarrative2 field.
   * Free format narrative to support the component claim imported services amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative2();
  
  
  /**
   * Gets the value of the ImportedServicesNarrative3 field.
   * Free format narrative to support the component claim imported services amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative3();
  
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef1 field.
   * The responding carriers reference to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef1();
  
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef2 field.
   * The responding carriers second reference to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef2();
  
  
  /**
   * Gets the value of the InsurerTransactionReference field.
   * Reference allocated to the transaction by the sender of this Claim Response Request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerTransactionReference();
  
  
  /**
   * Gets the value of the LcoCatastropheCode field.
   * The new LCO Catastrophe Code set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFLCOCategoryCode_Ext getLcoCatastropheCode();
  
  
  /**
   * Gets the value of the LeadContactEmail field.
   * Email address of the user who sent this Response as Lead
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeadContactEmail();
  
  
  /**
   * Gets the value of the LeadContactName field.
   * Name of the user who sent this Response as Lead
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeadContactName();
  
  
  /**
   * Gets the value of the LeadContactTelephone field.
   * Telephone number of the user who sent this Response as Lead
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeadContactTelephone();
  
  
  /**
   * Gets the value of the LeadReserveAmount1 field.
   * Change to the Lead Reserve amount on the transaction in currency 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveAmount1();
  
  
  /**
   * Gets the value of the LeadReserveAmount1_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveAmount1_amt();
  
  
  /**
   * Gets the value of the LeadReserveAmount1_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveAmount1_cur();
  
  
  /**
   * Gets the value of the LeadReserveAmount2 field.
   * Change to the Lead Reserve amount on the transaction in currency 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveAmount2();
  
  
  /**
   * Gets the value of the LeadReserveAmount2_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveAmount2_amt();
  
  
  /**
   * Gets the value of the LeadReserveAmount2_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveAmount2_cur();
  
  
  /**
   * Gets the value of the LeadReserveAmount3 field.
   * Change to the Lead Reserve amount on the transaction in currency 3
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveAmount3();
  
  
  /**
   * Gets the value of the LeadReserveAmount3_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveAmount3_amt();
  
  
  /**
   * Gets the value of the LeadReserveAmount3_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveAmount3_cur();
  
  
  /**
   * Gets the value of the LeadReserveFees1 field.
   * Change to the Lead Reserve Fees on the transaction in currency 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveFees1();
  
  
  /**
   * Gets the value of the LeadReserveFees1_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveFees1_amt();
  
  
  /**
   * Gets the value of the LeadReserveFees1_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveFees1_cur();
  
  
  /**
   * Gets the value of the LeadReserveFees2 field.
   * Change to the Lead Reserve Fees on the transaction in currency 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveFees2();
  
  
  /**
   * Gets the value of the LeadReserveFees2_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveFees2_amt();
  
  
  /**
   * Gets the value of the LeadReserveFees2_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveFees2_cur();
  
  
  /**
   * Gets the value of the LeadReserveFees3 field.
   * Change to the Lead Reserve Fees on the transaction in currency 3
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveFees3();
  
  
  /**
   * Gets the value of the LeadReserveFees3_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveFees3_amt();
  
  
  /**
   * Gets the value of the LeadReserveFees3_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveFees3_cur();
  
  
  /**
   * Gets the value of the MinorPrecautionaryIndicator field.
   * Collection unlikely indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMinorPrecautionaryIndicator();
  
  
  /**
   * Gets the value of the MultipleResponseIndicator field.
   * Indicates that a multiple response is being actioned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMultipleResponseIndicator();
  
  
  /**
   * Gets the value of the NoFurtherResponseIndicator field.
   * Indicates that the company in question has indicated that they do not want to make any further responses on this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNoFurtherResponseIndicator();
  
  
  /**
   * Gets the value of the OutstandingQualifierCode field.
   * The new Outstanding Qualifier Code set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFOutstandingQualifierCode_Ext getOutstandingQualifierCode();
  
  
  /**
   * Gets the value of the ParticipantFunction field.
   * The participant function of the user that is responding.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getParticipantFunction();
  
  
  /**
   * Gets the value of the PcsCatastropheCode field.
   * The new PCS Catastrophe Code set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFPCSCategoryCode_Ext getPcsCatastropheCode();
  
  
  /**
   * Gets the value of the PrivateComments field.
   * Any private comments the user entered with this response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePrivateComment_Ext[] getPrivateComments();
  
  
  /**
   * Gets the value of the PrivateFootnote field.
   * Private comments are only visible to members of the same organisation (LIRMA)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPrivateFootnote();
  
  
  /**
   * Gets the value of the PublicComments field.
   * Any public comments the user entered with this response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePublicComment_Ext[] getPublicComments();
  
  
  /**
   * Gets the value of the QueryReasons field.
   * Query Reasons in a Lloyd's Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFResponseQueryReason_Ext[] getQueryReasons();
  
  
  /**
   * Gets the value of the ReferredUUID field.
   * The UUID for the Claim Data Message this response is for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferredUUID();
  
  
  /**
   * Gets the value of the RequestToBroker1 field.
   * A Request to the Broker (LIRMA)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRequestToBroker1();
  
  
  /**
   * Gets the value of the RequestToBroker2 field.
   * A Request to the Broker (LIRMA)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRequestToBroker2();
  
  
  /**
   * Gets the value of the ResponseCode field.
   * The Response Code for this response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFResponseCode_Ext getResponseCode();
  
  
  /**
   * Gets the value of the RiskCode field.
   * ClaimResponseRq/ContractSection/RiskCode
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFRiskCode_Ext getRiskCode();
  
  
  /**
   * Gets the value of the SimultaneousRIPIndicator field.
   * String representation of the SimultaneousRIPIndicator boolean
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSimultaneousRIPIndicator();
  
  
  /**
   * Gets the value of the SubCategoryCode field.
   * Claim subcategory code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimSubCatCode_Ext getSubCategoryCode();
  
  
  /**
   * Gets the value of the TargetCurrency1 field.
   * The target currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getTargetCurrency1();
  
  
  /**
   * Gets the value of the TargetCurrency2 field.
   * The target currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getTargetCurrency2();
  
  
  /**
   * Gets the value of the TargetCurrency3 field.
   * The target currency associated with ClaimEntryAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getTargetCurrency3();
  
  
  /**
   * Gets the value of the TransactionType field.
   * Identifies the type of transaction and will notify if the message is a first advice (with or without settlement) and interim advice (with or without settlement). The sender and receiver should make sure that this data element is populated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTransactionType_Ext getTransactionType();
  
  
  /**
   * Gets the value of the TriageCategory field.
   * The new Triage Category set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFTriageCode_Ext getTriageCategory();
  
  
  /**
   * Gets the value of the VATAmount1 field.
   * Change to the VAT amount on the transaction in currency 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVATAmount1();
  
  
  /**
   * Gets the value of the VATAmount1_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVATAmount1_amt();
  
  
  /**
   * Gets the value of the VATAmount1_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVATAmount1_cur();
  
  
  /**
   * Gets the value of the VATAmount2 field.
   * Change to the VAT amount on the transaction in currency 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVATAmount2();
  
  
  /**
   * Gets the value of the VATAmount2_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVATAmount2_amt();
  
  
  /**
   * Gets the value of the VATAmount2_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVATAmount2_cur();
  
  
  /**
   * Gets the value of the VATAmount3 field.
   * Change to the VAT amount on the transaction in currency 3
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVATAmount3();
  
  
  /**
   * Gets the value of the VATAmount3_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVATAmount3_amt();
  
  
  /**
   * Gets the value of the VATAmount3_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVATAmount3_cur();
  
  
  /**
   * Gets the value of the XcsToAgreeIndicator field.
   * The new XCS To Agree Indicator set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getXcsToAgreeIndicator();
  
  
  /**
   * Gets the value of the IsSimultaneousRIPIndicator field.
   * The new Simultaneous RIP Indicator set in this Response
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsSimultaneousRIPIndicator();
  
  
  /**
   * Gets the value of the LIRMALeadActions field.
   * For a LIRMA Lead response, indicates whether the user chose to respond with Lead Actions or SAP Actions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLIRMALeadActions();
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element);
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the AgreementPartyModifications array. This is achieved by marking the element for removal.
   */
  public void removeFromAgreementPartyModifications(entity.ECFResponseAPModification_Ext element);
  
  
  /**
   * Removes the given element from the AgreementPartyModifications array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAgreementPartyModifications(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimParticipantRoles array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimParticipantRoles(entity.ECFClaimParticipantRole_Ext element);
  
  
  /**
   * Removes the given element from the ClaimParticipantRoles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimParticipantRoles(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the QueryReasons array. This is achieved by marking the element for removal.
   */
  public void removeFromQueryReasons(entity.ECFResponseQueryReason_Ext element);
  
  
  /**
   * Removes the given element from the QueryReasons array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQueryReasons(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the AgreementPartyModifications field.
   */
  public void setAgreementPartyModifications(entity.ECFResponseAPModification_Ext[] value);
  
  
  /**
   * Sets the value of the AllUnderwritersToSeeFileInd field.
   */
  public void setAllUnderwritersToSeeFileInd(java.lang.String value);
  
  
  /**
   * Sets the value of the ApprovalIssue field.
   */
  public void setApprovalIssue(java.lang.String value);
  
  
  /**
   * Sets the value of the AsOfDate field.
   */
  public void setAsOfDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BureauType field.
   */
  public void setBureauType(typekey.ECFBureauType_Ext value);
  
  
  /**
   * Sets the value of the CategoryCode field.
   */
  public void setCategoryCode(typekey.ECFClaimCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the CauseOfLossCode field.
   */
  public void setCauseOfLossCode(typekey.ECFCauseOfLossCode_Ext value);
  
  
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
   * Sets the value of the ClaimParticipantRoles field.
   */
  public void setClaimParticipantRoles(entity.ECFClaimParticipantRole_Ext[] value);
  
  
  /**
   * Sets the value of the ClaimsScheme field.
   */
  public void setClaimsScheme(typekey.ECFScheme_Ext value);
  
  
  /**
   * Sets the value of the ClassOfBusiness field.
   */
  public void setClassOfBusiness(typekey.ECFClassOfBusiness_Ext value);
  
  
  /**
   * Sets the value of the ContactClassAccountId field.
   */
  public void setContactClassAccountId(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactClassUserId field.
   */
  public void setContactClassUserId(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactEmail field.
   */
  public void setContactEmail(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactFax field.
   */
  public void setContactFax(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactName field.
   */
  public void setContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactTelephone field.
   */
  public void setContactTelephone(java.lang.String value);
  
  
  /**
   * Sets the value of the ContractConditionsApplyInd field.
   */
  public void setContractConditionsApplyInd(typekey.ECFContractConditions_Ext value);
  
  
  /**
   * Sets the value of the Currency1 field.
   */
  public void setCurrency1(typekey.Currency value);
  
  
  /**
   * Sets the value of the Currency2 field.
   */
  public void setCurrency2(typekey.Currency value);
  
  
  /**
   * Sets the value of the Currency3 field.
   */
  public void setCurrency3(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImmediatePartCollectionInd field.
   */
  public void setImmediatePartCollectionInd(java.lang.String value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount1 field.
   */
  public void setImportedServicesAmount1(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount1_amt field.
   */
  public void setImportedServicesAmount1_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount1_cur field.
   */
  public void setImportedServicesAmount1_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount2 field.
   */
  public void setImportedServicesAmount2(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount2_amt field.
   */
  public void setImportedServicesAmount2_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount2_cur field.
   */
  public void setImportedServicesAmount2_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount3 field.
   */
  public void setImportedServicesAmount3(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount3_amt field.
   */
  public void setImportedServicesAmount3_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount3_cur field.
   */
  public void setImportedServicesAmount3_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesNarrative1 field.
   */
  public void setImportedServicesNarrative1(java.lang.String value);
  
  
  /**
   * Sets the value of the ImportedServicesNarrative2 field.
   */
  public void setImportedServicesNarrative2(java.lang.String value);
  
  
  /**
   * Sets the value of the ImportedServicesNarrative3 field.
   */
  public void setImportedServicesNarrative3(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef1 field.
   */
  public void setInsurerOrReinsurerClaimRef1(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef2 field.
   */
  public void setInsurerOrReinsurerClaimRef2(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerTransactionReference field.
   */
  public void setInsurerTransactionReference(java.lang.String value);
  
  
  /**
   * Sets the value of the IsSimultaneousRIPIndicator field.
   */
  public void setIsSimultaneousRIPIndicator(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LIRMALeadActions field.
   */
  public void setLIRMALeadActions(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LcoCatastropheCode field.
   */
  public void setLcoCatastropheCode(typekey.ECFLCOCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the LeadContactEmail field.
   */
  public void setLeadContactEmail(java.lang.String value);
  
  
  /**
   * Sets the value of the LeadContactName field.
   */
  public void setLeadContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the LeadContactTelephone field.
   */
  public void setLeadContactTelephone(java.lang.String value);
  
  
  /**
   * Sets the value of the LeadReserveAmount1 field.
   */
  public void setLeadReserveAmount1(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveAmount1_amt field.
   */
  public void setLeadReserveAmount1_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveAmount1_cur field.
   */
  public void setLeadReserveAmount1_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveAmount2 field.
   */
  public void setLeadReserveAmount2(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveAmount2_amt field.
   */
  public void setLeadReserveAmount2_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveAmount2_cur field.
   */
  public void setLeadReserveAmount2_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveAmount3 field.
   */
  public void setLeadReserveAmount3(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveAmount3_amt field.
   */
  public void setLeadReserveAmount3_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveAmount3_cur field.
   */
  public void setLeadReserveAmount3_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveFees1 field.
   */
  public void setLeadReserveFees1(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveFees1_amt field.
   */
  public void setLeadReserveFees1_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveFees1_cur field.
   */
  public void setLeadReserveFees1_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveFees2 field.
   */
  public void setLeadReserveFees2(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveFees2_amt field.
   */
  public void setLeadReserveFees2_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveFees2_cur field.
   */
  public void setLeadReserveFees2_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveFees3 field.
   */
  public void setLeadReserveFees3(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveFees3_amt field.
   */
  public void setLeadReserveFees3_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveFees3_cur field.
   */
  public void setLeadReserveFees3_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the MinorPrecautionaryIndicator field.
   */
  public void setMinorPrecautionaryIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the MultipleResponseIndicator field.
   */
  public void setMultipleResponseIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the NoFurtherResponseIndicator field.
   */
  public void setNoFurtherResponseIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the OutstandingQualifierCode field.
   */
  public void setOutstandingQualifierCode(typekey.ECFOutstandingQualifierCode_Ext value);
  
  
  /**
   * Sets the value of the ParticipantFunction field.
   */
  public void setParticipantFunction(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the PcsCatastropheCode field.
   */
  public void setPcsCatastropheCode(typekey.ECFPCSCategoryCode_Ext value);
  
  
  /**
   * Sets the value of the PrivateComments field.
   */
  public void setPrivateComments(entity.ECFMessagePrivateComment_Ext[] value);
  
  
  /**
   * Sets the value of the PrivateFootnote field.
   */
  public void setPrivateFootnote(java.lang.String value);
  
  
  /**
   * Sets the value of the PublicComments field.
   */
  public void setPublicComments(entity.ECFMessagePublicComment_Ext[] value);
  
  
  /**
   * Sets the value of the QueryReasons field.
   */
  public void setQueryReasons(entity.ECFResponseQueryReason_Ext[] value);
  
  
  /**
   * Sets the value of the ReferredUUID field.
   */
  public void setReferredUUID(java.lang.String value);
  
  
  /**
   * Sets the value of the RequestToBroker1 field.
   */
  public void setRequestToBroker1(java.lang.String value);
  
  
  /**
   * Sets the value of the RequestToBroker2 field.
   */
  public void setRequestToBroker2(java.lang.String value);
  
  
  /**
   * Sets the value of the ResponseCode field.
   */
  public void setResponseCode(typekey.ECFResponseCode_Ext value);
  
  
  /**
   * Sets the value of the RiskCode field.
   */
  public void setRiskCode(typekey.ECFRiskCode_Ext value);
  
  
  /**
   * Sets the value of the SimultaneousRIPIndicator field.
   */
  public void setSimultaneousRIPIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the SubCategoryCode field.
   */
  public void setSubCategoryCode(typekey.ECFClaimSubCatCode_Ext value);
  
  
  /**
   * Sets the value of the TargetCurrency1 field.
   */
  public void setTargetCurrency1(typekey.Currency value);
  
  
  /**
   * Sets the value of the TargetCurrency2 field.
   */
  public void setTargetCurrency2(typekey.Currency value);
  
  
  /**
   * Sets the value of the TargetCurrency3 field.
   */
  public void setTargetCurrency3(typekey.Currency value);
  
  
  /**
   * Sets the value of the TransactionType field.
   */
  public void setTransactionType(typekey.ECFClaimTransactionType_Ext value);
  
  
  /**
   * Sets the value of the TriageCategory field.
   */
  public void setTriageCategory(typekey.ECFTriageCode_Ext value);
  
  
  /**
   * Sets the value of the VATAmount1 field.
   */
  public void setVATAmount1(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the VATAmount1_amt field.
   */
  public void setVATAmount1_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the VATAmount1_cur field.
   */
  public void setVATAmount1_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the VATAmount2 field.
   */
  public void setVATAmount2(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the VATAmount2_amt field.
   */
  public void setVATAmount2_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the VATAmount2_cur field.
   */
  public void setVATAmount2_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the VATAmount3 field.
   */
  public void setVATAmount3(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the VATAmount3_amt field.
   */
  public void setVATAmount3_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the VATAmount3_cur field.
   */
  public void setVATAmount3_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the XcsToAgreeIndicator field.
   */
  public void setXcsToAgreeIndicator(java.lang.String value);
  
  
  
}