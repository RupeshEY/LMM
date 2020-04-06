package entity;

/**
 * ECFMessageClaimData_Ext
 * Claim related data common between ClaimNotifyRequest and ClaimRetrieveResponse
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimData_Ext.eti;ECFMessageClaimData_Ext.eix;ECFMessageClaimData_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ECFMessageClaimData_Ext")
public class ECFMessageClaimData_Ext extends entity.ECFMessage_Ext {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageClaimData_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageClaimData_Ext>("entity.ECFMessageClaimData_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACTIONCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ActionCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> AGGREGATEDETAILS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AggregateDetails");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AMENDMENTDETAILS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AmendmentDetails");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASOFDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AsOfDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BROKERCOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BrokerComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERCONTACT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKEREMAIL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerEmail");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerPhone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKCLAIMHEADERTR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkClaimHeaderTR");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKCLAIMHEADERUCR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkClaimHeaderUCR");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKCLAIMNOOFITEMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkClaimNoOfItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BULKCLAIMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BulkClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BUREAUTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BureauType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CARRIERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Carriers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CATEGORYCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CategoryCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDANTINLIQUIDATIONINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CedantInLiquidationIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHASEUPINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ChaseUpIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHASEUPINDICATORINTERVAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ChaseUpIndicatorInterval");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMLINENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimLineNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMRESPONSEUUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimResponseUUId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMANT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Claimant");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMSSCHEME_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimsScheme");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLASSOFBUSINESS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClassOfBusiness");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLEADINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoLeadIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLLECTIONUNLIKELYINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CollectionUnlikelyIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONFLICTOFINTERESTIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ConflictOfInterestInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTRACTUALCONDITIONSINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContractualConditionsIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERTYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CROSSMARKETPRIVATECOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CrossMarketPrivateComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CROSSMARKETPUBLICCOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CrossMarketPublicComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DOCS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Docs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ECFCONTACTDATA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ECFContactData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ECFCONTRACTMARKETS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ECFContractMarkets");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ECFTRANSACTIONSTATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ECFTransactionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ERRORSORWARNINGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ErrorsOrWarnings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FILEFORMAT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FileFormat");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> FINANCIALS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Financials");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMMEDIATEPARTCOLLECTIONIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImmediatePartCollectionInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Insured");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERORREINSURERCLAIMREF1_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerOrReinsurerClaimRef1");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERORREINSURERCLAIMREF2_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerOrReinsurerClaimRef2");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LCOCATASTROPHECODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LcoCatastropheCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEADNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LeadName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSCAUSE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossCause");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSDATEQUALIFIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossDateQualifier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDETAILS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDetails");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossEndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSLOCATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSOREVENTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossOrEventName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSSTARTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossStartDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MESSAGESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MessageState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MULTIPLERESPONSEINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MultipleResponseIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOFURTHERRESPONSEINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NoFurtherResponseIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ORIGINALSPLITREFERENCECSV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OriginalSplitReferenceCSV");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OUTSTANDINGAMOUNTQUALIFIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OutstandingAmountQualifier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PARALLELCLAIMSUCR_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ParallelClaimsUCR");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PCSCATASTROPHECODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PcsCatastropheCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYHOLDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Policyholder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PRIVATECOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PrivateComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PUBLICCOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PublicComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RISKCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RiskCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RISKDESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RiskDescription");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RISKLOCATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RiskLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RISKREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RiskReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SIMULTANEOUSREINSTATEMENTPROCD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SimultaneousReinstatementProcd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SIMULTANEOUSREINSTATEMENTREQ_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SimultaneousReinstatementReq");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SLIPLEADCOMMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SlipLeadComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SOFTWARNINGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SoftWarnings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBCATEGORYCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SubCategoryCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSACTIONSEQUENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TransactionSequence");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRANSACTIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TransactionStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRANSACTIONTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TransactionType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRIAGECATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TriageCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UNDERWRITINGYEAR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UnderwritingYear");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> XCSTOAGREEINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "XcsToAgreeIndicator");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ECFMessageClaimData_Ext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ECFMessageClaimData_Ext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ECFMessageClaimData_Ext(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the AggregateDetails array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAggregateDetails(entity.ECFMessageAggregateDetail_Ext element) {
    __getInternalInterface().addArrayElement(AGGREGATEDETAILS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BrokerComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBrokerComments(entity.ECFMessageBrokerComment_Ext element) {
    __getInternalInterface().addArrayElement(BROKERCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BulkClaims array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBulkClaims(entity.ECFMessageBulkClaim_Ext element) {
    __getInternalInterface().addArrayElement(BULKCLAIMS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Carriers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCarriers(entity.ECFMessageClaimDataCarrier_Ext element) {
    __getInternalInterface().addArrayElement(CARRIERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the CrossMarketPrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element) {
    __getInternalInterface().addArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the CrossMarketPublicComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element) {
    __getInternalInterface().addArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Docs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocs(entity.ECFMessageClaimDataDocument_Ext element) {
    __getInternalInterface().addArrayElement(DOCS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ECFContractMarkets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToECFContractMarkets(entity.ECFContractMarket_Ext element) {
    __getInternalInterface().addArrayElement(ECFCONTRACTMARKETS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ErrorsOrWarnings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element) {
    __getInternalInterface().addArrayElement(ERRORSORWARNINGS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Financials array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFinancials(entity.ECFMessageClaimDataFinancial_Ext element) {
    __getInternalInterface().addArrayElement(FINANCIALS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ParallelClaimsUCR array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element) {
    __getInternalInterface().addArrayElement(PARALLELCLAIMSUCR_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the PrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPrivateComments(entity.ECFMessagePrivateComment_Ext element) {
    __getInternalInterface().addArrayElement(PRIVATECOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the PublicComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPublicComments(entity.ECFMessagePublicComment_Ext element) {
    __getInternalInterface().addArrayElement(PUBLICCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the SlipLeadComments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element) {
    __getInternalInterface().addArrayElement(SLIPLEADCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the SoftWarnings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSoftWarnings(entity.ECFMessageSoftWarning_Ext element) {
    __getInternalInterface().addArrayElement(SOFTWARNINGS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the ActionCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFActionCode_Ext getActionCode() {
    return (typekey.ECFActionCode_Ext)__getInternalInterface().getFieldValue(ACTIONCODE_PROP.get());
  }
  
  /**
   * Gets the value of the AggregateDetails field.
   * Aggregate Details comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageAggregateDetail_Ext[] getAggregateDetails() {
    return (entity.ECFMessageAggregateDetail_Ext[])__getInternalInterface().getFieldValue(AGGREGATEDETAILS_PROP.get());
  }
  
  /**
   * Gets the value of the AmendmentDetails field.
   * Description of the 'business' reason for the sending of this claims message (e.g. 'On Account settlement')
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAmendmentDetails() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AMENDMENTDETAILS_PROP.get());
  }
  
  /**
   * Gets the value of the AsOfDate field.
   * Date/time action occurred (transaction created or updated or response made)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAsOfDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ASOFDATE_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerComments field.
   * broker additional comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBrokerComment_Ext[] getBrokerComments() {
    return (entity.ECFMessageBrokerComment_Ext[])__getInternalInterface().getFieldValue(BROKERCOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerContact field.
   * Text giving name of an individual who should serve as first point of contact for this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerContact() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerEmail field.
   * Text giving the email address of the person  to be contacted in a broking organisation. May not be the person who submits the transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerEmail() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKEREMAIL_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerId field.
   * Coded identification of a broking organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERID_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerName field.
   * The name of the Broker organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerPhone field.
   * Telephone number of the name or department within the broker organisation to be contacted in relation to a transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPHONE_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerReference field.
   * Broker policy reference 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERREFERENCE_PROP.get());
  }
  
  /**
   * Gets the value of the BulkClaimHeaderTR field.
   * The Transaction Reference of the Bulk collection
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkClaimHeaderTR() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKCLAIMHEADERTR_PROP.get());
  }
  
  /**
   * Gets the value of the BulkClaimHeaderUCR field.
   * The Unique Claim Reference of the bulk header
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkClaimHeaderUCR() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKCLAIMHEADERUCR_PROP.get());
  }
  
  /**
   * Gets the value of the BulkClaimNoOfItems field.
   * The number of bulk items included in the bulk
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBulkClaimNoOfItems() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BULKCLAIMNOOFITEMS_PROP.get());
  }
  
  /**
   * Gets the value of the BulkClaims field.
   * ECF Claim Data Message Bulk Claims
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBulkClaim_Ext[] getBulkClaims() {
    return (entity.ECFMessageBulkClaim_Ext[])__getInternalInterface().getFieldValue(BULKCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the BureauType field.
   * The carrier's bureau type for this transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauType() {
    return (typekey.ECFBureauType_Ext)__getInternalInterface().getFieldValue(BUREAUTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Carriers field.
   * ECF Claim Data Message Carriers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataCarrier_Ext[] getCarriers() {
    return (entity.ECFMessageClaimDataCarrier_Ext[])__getInternalInterface().getFieldValue(CARRIERS_PROP.get());
  }
  
  /**
   * Gets the value of the CategoryCode field.
   * Claim category code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimCategoryCode_Ext getCategoryCode() {
    return (typekey.ECFClaimCategoryCode_Ext)__getInternalInterface().getFieldValue(CATEGORYCODE_PROP.get());
  }
  
  /**
   * Gets the value of the CedantInLiquidationIndicator field.
   * Indicates that the cedant is in liquidation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCedantInLiquidationIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CEDANTINLIQUIDATIONINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the ChaseUpIndicator field.
   * Indicates whether chase up required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChaseUpIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHASEUPINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the ChaseUpIndicatorInterval field.
   * The period (in months) before a chase up will be issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getChaseUpIndicatorInterval() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CHASEUPINDICATORINTERVAL_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimLineNumber field.
   * The Claim Line Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimLineNumber() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMLINENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimResponseUUId field.
   * ClaimResponseUUId - Unique Universal Identifier of the ClaimResponseRq message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimResponseUUId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMRESPONSEUUID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageClaimStatus_Ext getClaimStatus() {
    return (typekey.ECFMessageClaimStatus_Ext)__getInternalInterface().getFieldValue(CLAIMSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Claimant field.
   * Name of the claimant involved in a loss
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimant() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMANT_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimsScheme field.
   * The claims scheme applicable to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFScheme_Ext getClaimsScheme() {
    return (typekey.ECFScheme_Ext)__getInternalInterface().getFieldValue(CLAIMSSCHEME_PROP.get());
  }
  
  /**
   * Gets the value of the ClassOfBusiness field.
   * Code for identifying the class of business (for ILU and LIRMA). AKA JvClassOfBusiness in the XML
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClassOfBusiness_Ext getClassOfBusiness() {
    return (typekey.ECFClassOfBusiness_Ext)__getInternalInterface().getFieldValue(CLASSOFBUSINESS_PROP.get());
  }
  
  /**
   * Gets the value of the CoLeadIndicator field.
   * Indicator Y/N to indicate if a Binding authority UCR has Co-Leads on it
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoLeadIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLEADINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the CollectionUnlikelyIndicator field.
   * Collection unlikely indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCollectionUnlikelyIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLLECTIONUNLIKELYINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the ContractualConditionsIndicator field.
   * Indicates that contractual conditions apply to claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContractualConditionsIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTRACTUALCONDITIONSINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the CoverType field.
   * Code expressing the type of cover (quota share, surplus, XOL..)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoverType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COVERTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the CrossMarketPrivateComments field.
   * Cross market private comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageCrossMarketPrivateComment_Ext[] getCrossMarketPrivateComments() {
    return (entity.ECFMessageCrossMarketPrivateComment_Ext[])__getInternalInterface().getFieldValue(CROSSMARKETPRIVATECOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the CrossMarketPublicComments field.
   * Cross market public comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageCrossMarketPublicComment_Ext[] getCrossMarketPublicComments() {
    return (entity.ECFMessageCrossMarketPublicComment_Ext[])__getInternalInterface().getFieldValue(CROSSMARKETPUBLICCOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the Docs field.
   * ECF Claim Data Message Documents
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataDocument_Ext[] getDocs() {
    return (entity.ECFMessageClaimDataDocument_Ext[])__getInternalInterface().getFieldValue(DOCS_PROP.get());
  }
  
  /**
   * Gets the value of the ECFContactData field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataContacts_Ext getECFContactData() {
    return (entity.ECFMessageClaimDataContacts_Ext)__getInternalInterface().getFieldValue(ECFCONTACTDATA_PROP.get());
  }
  
  /**
   * Gets the value of the ECFContractMarkets field.
   * An array holds the information about the parties and their role in each claim data message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFContractMarket_Ext[] getECFContractMarkets() {
    return (entity.ECFContractMarket_Ext[])__getInternalInterface().getFieldValue(ECFCONTRACTMARKETS_PROP.get());
  }
  
  /**
   * Gets the value of the ECFTransactionState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFTransactionState_Ext getECFTransactionState() {
    return (entity.ECFTransactionState_Ext)__getInternalInterface().getFieldValue(ECFTRANSACTIONSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorsOrWarnings field.
   * Errors or Warnings
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageErrorOrWarning_Ext[] getErrorsOrWarnings() {
    return (entity.ECFMessageErrorOrWarning_Ext[])__getInternalInterface().getFieldValue(ERRORSORWARNINGS_PROP.get());
  }
  
  /**
   * Gets the value of the FileFormat field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFFileFormat_Ext getFileFormat() {
    return (typekey.ECFFileFormat_Ext)__getInternalInterface().getFieldValue(FILEFORMAT_PROP.get());
  }
  
  /**
   * Gets the value of the Financials field.
   * ECF Claim Data Message Financials
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataFinancial_Ext[] getFinancials() {
    return (entity.ECFMessageClaimDataFinancial_Ext[])__getInternalInterface().getFieldValue(FINANCIALS_PROP.get());
  }
  
  /**
   * Gets the value of the ImmediatePartCollectionInd field.
   * Immediate part collection indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImmediatePartCollectionInd() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMMEDIATEPARTCOLLECTIONIND_PROP.get());
  }
  
  /**
   * Gets the value of the Insured field.
   * Name of insured person or organization in free text
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsured() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURED_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredName field.
   * Insured Name for this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDNAME_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef1 field.
   * The insurer or reinsurer claim reference number 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef1() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERORREINSURERCLAIMREF1_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerOrReinsurerClaimRef2 field.
   * The insurer or reinsurer claim reference number 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerOrReinsurerClaimRef2() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERORREINSURERCLAIMREF2_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerReference field.
   * Reference allocated to the sender transaction reference. Either Insurer or reinsurer transaction reference must be provided
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERREFERENCE_PROP.get());
  }
  
  /**
   * Gets the value of the LcoCatastropheCode field.
   * Reference assigned to a catastrophe by the the Lloyd's Claims Office (LCO) related to a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFLCOCategoryCode_Ext getLcoCatastropheCode() {
    return (typekey.ECFLCOCategoryCode_Ext)__getInternalInterface().getFieldValue(LCOCATASTROPHECODE_PROP.get());
  }
  
  /**
   * Gets the value of the LeadName field.
   * The name of the lead Insurer for the claim where more than one market is involved in the claim. Name and not ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeadName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEADNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LossCause field.
   * Code which identifies the claim cause. Cause code has to be provided on first advice by lead, will default to previous value on subsequent transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossCause() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSCAUSE_PROP.get());
  }
  
  /**
   * Gets the value of the LossDateQualifier field.
   * Code identification of what the Loss Date From and To represent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFLossDateQualifier_Ext getLossDateQualifier() {
    return (typekey.ECFLossDateQualifier_Ext)__getInternalInterface().getFieldValue(LOSSDATEQUALIFIER_PROP.get());
  }
  
  /**
   * Gets the value of the LossDetails field.
   * The loss details
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDetails() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSDETAILS_PROP.get());
  }
  
  /**
   * Gets the value of the LossEndDate field.
   * End date of period during which a loss occurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocation field.
   * Text description of the location of the loss being reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the LossOrEventName field.
   * Textual details on the loss or event which is the subject of the original insurance of the individual loss included in the transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossOrEventName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSOREVENTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LossStartDate field.
   * Start date of period during which a loss occurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossStartDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSSTARTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the MessageState field.
   * Identifies the state of Claim Data message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimMessageState_Ext getMessageState() {
    return (typekey.ECFClaimMessageState_Ext)__getInternalInterface().getFieldValue(MESSAGESTATE_PROP.get());
  }
  
  /**
   * Gets the value of the MultipleResponseIndicator field.
   * Indicates that a multiple response is being actioned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMultipleResponseIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MULTIPLERESPONSEINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the NoFurtherResponseIndicator field.
   * No Further Response Indicator. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNoFurtherResponseIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOFURTHERRESPONSEINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the OriginalSplitReferenceCSV field.
   * Financials: The Bureau reference allocated to the premium transaction relating to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOriginalSplitReferenceCSV() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ORIGINALSPLITREFERENCECSV_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingAmountQualifier field.
   * Financials: Qualifier providing more information about the outstanding amount and/or the claim in general
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFOutstandingQualifierCode_Ext getOutstandingAmountQualifier() {
    return (typekey.ECFOutstandingQualifierCode_Ext)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNTQUALIFIER_PROP.get());
  }
  
  /**
   * Gets the value of the ParallelClaimsUCR field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataParallelClaimUCR_Ext[] getParallelClaimsUCR() {
    return (entity.ECFMessageClaimDataParallelClaimUCR_Ext[])__getInternalInterface().getFieldValue(PARALLELCLAIMSUCR_PROP.get());
  }
  
  /**
   * Gets the value of the PcsCatastropheCode field.
   * Reference assigned to a catastrophe by the Property Claim Service (PCS) related to a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFPCSCategoryCode_Ext getPcsCatastropheCode() {
    return (typekey.ECFPCSCategoryCode_Ext)__getInternalInterface().getFieldValue(PCSCATASTROPHECODE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * ClaimNotifyRq/ClaimRetrieveRs.ClaimMovement.Contract.InsurerRiskReference
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Description of a policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Policyholder field.
   * Identity of the party that took the original insurance with the insurance company that ceded the business expressed in text form
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyholder() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYHOLDER_PROP.get());
  }
  
  /**
   * Gets the value of the PrivateComments field.
   * private comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePrivateComment_Ext[] getPrivateComments() {
    return (entity.ECFMessagePrivateComment_Ext[])__getInternalInterface().getFieldValue(PRIVATECOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the PublicComments field.
   * public comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessagePublicComment_Ext[] getPublicComments() {
    return (entity.ECFMessagePublicComment_Ext[])__getInternalInterface().getFieldValue(PUBLICCOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the RiskCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFRiskCode_Ext getRiskCode() {
    return (typekey.ECFRiskCode_Ext)__getInternalInterface().getFieldValue(RISKCODE_PROP.get());
  }
  
  /**
   * Gets the value of the RiskDescription field.
   * Text giving a description of the insured risk, contract or layer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKDESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the RiskLocation field.
   * Description of situation of insured interest, or journey
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskLocation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the RiskReference field.
   * Syndicate or company’s risk reference 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRiskReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKREFERENCE_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementCurrency field.
   * Financials: The currency in which amounts will be settled
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the SimultaneousReinstatementProcd field.
   * Indicates that the Reinstatement Premium has been processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSimultaneousReinstatementProcd() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTPROCD_PROP.get());
  }
  
  /**
   * Gets the value of the SimultaneousReinstatementReq field.
   * Indicates whether a simultaneous Reinstatement Premium is required
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSimultaneousReinstatementReq() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTREQ_PROP.get());
  }
  
  /**
   * Gets the value of the SlipLeadComments field.
   * slip lead comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageSlipLeadComment_Ext[] getSlipLeadComments() {
    return (entity.ECFMessageSlipLeadComment_Ext[])__getInternalInterface().getFieldValue(SLIPLEADCOMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the SoftWarnings field.
   * Soft Warnings
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageSoftWarning_Ext[] getSoftWarnings() {
    return (entity.ECFMessageSoftWarning_Ext[])__getInternalInterface().getFieldValue(SOFTWARNINGS_PROP.get());
  }
  
  /**
   * Gets the value of the SubCategoryCode field.
   * Claim subcategory code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimSubCatCode_Ext getSubCategoryCode() {
    return (typekey.ECFClaimSubCatCode_Ext)__getInternalInterface().getFieldValue(SUBCATEGORYCODE_PROP.get());
  }
  
  /**
   * Gets the value of the TransactionSequence field.
   * A number assigned to indicate the sequence of the transaction within the UCR
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTransactionSequence() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TRANSACTIONSEQUENCE_PROP.get());
  }
  
  /**
   * Gets the value of the TransactionStatus field.
   * The status of Lloyd's, LIRMA, ILU Transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFTransactionStatus_Ext getTransactionStatus() {
    return (typekey.ECFTransactionStatus_Ext)__getInternalInterface().getFieldValue(TRANSACTIONSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the TransactionType field.
   * Identifies the type of transaction and will notify if the message is a first advice (with or without settlement) and interim advice (with or without settlement). The sender and receiver should make sure that this data element is populated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTransactionType_Ext getTransactionType() {
    return (typekey.ECFClaimTransactionType_Ext)__getInternalInterface().getFieldValue(TRANSACTIONTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TriageCategory field.
   * An indication of the complexity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFTriageCode_Ext getTriageCategory() {
    return (typekey.ECFTriageCode_Ext)__getInternalInterface().getFieldValue(TRIAGECATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the UnderwritingYear field.
   * Year in which the contract, or an individual risk covered by the contract, is underwritten. Only for Lloyd’s. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUnderwritingYear() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(UNDERWRITINGYEAR_PROP.get());
  }
  
  /**
   * Gets the value of the XcsToAgreeIndicator field.
   * XcsToAgreeIndicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getXcsToAgreeIndicator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(XCSTOAGREEINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the ConflictOfInterestInd field.
   * States if this message indicates a Conflict Of Interest on the Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isConflictOfInterestInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONFLICTOFINTERESTIND_PROP.get());
  }
  
  /**
   * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
   */
  public void removeFromAggregateDetails(entity.ECFMessageAggregateDetail_Ext element) {
    __getInternalInterface().removeArrayElement(AGGREGATEDETAILS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateDetails(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(AGGREGATEDETAILS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
   */
  public void removeFromBrokerComments(entity.ECFMessageBrokerComment_Ext element) {
    __getInternalInterface().removeArrayElement(BROKERCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBrokerComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BROKERCOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
   */
  public void removeFromBulkClaims(entity.ECFMessageBulkClaim_Ext element) {
    __getInternalInterface().removeArrayElement(BULKCLAIMS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBulkClaims(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BULKCLAIMS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
   */
  public void removeFromCarriers(entity.ECFMessageClaimDataCarrier_Ext element) {
    __getInternalInterface().removeArrayElement(CARRIERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCarriers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CARRIERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
   */
  public void removeFromCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element) {
    __getInternalInterface().removeArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCrossMarketPrivateComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
   */
  public void removeFromCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element) {
    __getInternalInterface().removeArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCrossMarketPublicComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Docs array. This is achieved by marking the element for removal.
   */
  public void removeFromDocs(entity.ECFMessageClaimDataDocument_Ext element) {
    __getInternalInterface().removeArrayElement(DOCS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Docs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocs(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DOCS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
   */
  public void removeFromECFContractMarkets(entity.ECFContractMarket_Ext element) {
    __getInternalInterface().removeArrayElement(ECFCONTRACTMARKETS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromECFContractMarkets(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ECFCONTRACTMARKETS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   */
  public void removeFromErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element) {
    __getInternalInterface().removeArrayElement(ERRORSORWARNINGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromErrorsOrWarnings(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ERRORSORWARNINGS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Financials array. This is achieved by marking the element for removal.
   */
  public void removeFromFinancials(entity.ECFMessageClaimDataFinancial_Ext element) {
    __getInternalInterface().removeArrayElement(FINANCIALS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Financials array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFinancials(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(FINANCIALS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
   */
  public void removeFromParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element) {
    __getInternalInterface().removeArrayElement(PARALLELCLAIMSUCR_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParallelClaimsUCR(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PARALLELCLAIMSUCR_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
   */
  public void removeFromPrivateComments(entity.ECFMessagePrivateComment_Ext element) {
    __getInternalInterface().removeArrayElement(PRIVATECOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPrivateComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PRIVATECOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
   */
  public void removeFromPublicComments(entity.ECFMessagePublicComment_Ext element) {
    __getInternalInterface().removeArrayElement(PUBLICCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPublicComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PUBLICCOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
   */
  public void removeFromSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element) {
    __getInternalInterface().removeArrayElement(SLIPLEADCOMMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSlipLeadComments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SLIPLEADCOMMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
   */
  public void removeFromSoftWarnings(entity.ECFMessageSoftWarning_Ext element) {
    __getInternalInterface().removeArrayElement(SOFTWARNINGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSoftWarnings(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SOFTWARNINGS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ActionCode field.
   */
  public void setActionCode(typekey.ECFActionCode_Ext value) {
    __getInternalInterface().setFieldValue(ACTIONCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AggregateDetails field.
   */
  public void setAggregateDetails(entity.ECFMessageAggregateDetail_Ext[] value) {
    __getInternalInterface().setFieldValue(AGGREGATEDETAILS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AmendmentDetails field.
   */
  public void setAmendmentDetails(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AMENDMENTDETAILS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AsOfDate field.
   */
  public void setAsOfDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ASOFDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerComments field.
   */
  public void setBrokerComments(entity.ECFMessageBrokerComment_Ext[] value) {
    __getInternalInterface().setFieldValue(BROKERCOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerContact field.
   */
  public void setBrokerContact(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerEmail field.
   */
  public void setBrokerEmail(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKEREMAIL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerId field.
   */
  public void setBrokerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerName field.
   */
  public void setBrokerName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerPhone field.
   */
  public void setBrokerPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerReference field.
   */
  public void setBrokerReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERREFERENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkClaimHeaderTR field.
   */
  public void setBulkClaimHeaderTR(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BULKCLAIMHEADERTR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkClaimHeaderUCR field.
   */
  public void setBulkClaimHeaderUCR(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BULKCLAIMHEADERUCR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkClaimNoOfItems field.
   */
  public void setBulkClaimNoOfItems(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(BULKCLAIMNOOFITEMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkClaims field.
   */
  public void setBulkClaims(entity.ECFMessageBulkClaim_Ext[] value) {
    __getInternalInterface().setFieldValue(BULKCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BureauType field.
   */
  public void setBureauType(typekey.ECFBureauType_Ext value) {
    __getInternalInterface().setFieldValue(BUREAUTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Carriers field.
   */
  public void setCarriers(entity.ECFMessageClaimDataCarrier_Ext[] value) {
    __getInternalInterface().setFieldValue(CARRIERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CategoryCode field.
   */
  public void setCategoryCode(typekey.ECFClaimCategoryCode_Ext value) {
    __getInternalInterface().setFieldValue(CATEGORYCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CedantInLiquidationIndicator field.
   */
  public void setCedantInLiquidationIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CEDANTINLIQUIDATIONINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ChaseUpIndicator field.
   */
  public void setChaseUpIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHASEUPINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ChaseUpIndicatorInterval field.
   */
  public void setChaseUpIndicatorInterval(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CHASEUPINDICATORINTERVAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLineNumber field.
   */
  public void setClaimLineNumber(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMLINENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimResponseUUId field.
   */
  public void setClaimResponseUUId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMRESPONSEUUID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimStatus field.
   */
  public void setClaimStatus(typekey.ECFMessageClaimStatus_Ext value) {
    __getInternalInterface().setFieldValue(CLAIMSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claimant field.
   */
  public void setClaimant(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMANT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimsScheme field.
   */
  public void setClaimsScheme(typekey.ECFScheme_Ext value) {
    __getInternalInterface().setFieldValue(CLAIMSSCHEME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClassOfBusiness field.
   */
  public void setClassOfBusiness(typekey.ECFClassOfBusiness_Ext value) {
    __getInternalInterface().setFieldValue(CLASSOFBUSINESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoLeadIndicator field.
   */
  public void setCoLeadIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COLEADINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CollectionUnlikelyIndicator field.
   */
  public void setCollectionUnlikelyIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COLLECTIONUNLIKELYINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConflictOfInterestInd field.
   */
  public void setConflictOfInterestInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CONFLICTOFINTERESTIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContractualConditionsIndicator field.
   */
  public void setContractualConditionsIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CONTRACTUALCONDITIONSINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverType field.
   */
  public void setCoverType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COVERTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CrossMarketPrivateComments field.
   */
  public void setCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext[] value) {
    __getInternalInterface().setFieldValue(CROSSMARKETPRIVATECOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CrossMarketPublicComments field.
   */
  public void setCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext[] value) {
    __getInternalInterface().setFieldValue(CROSSMARKETPUBLICCOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Docs field.
   */
  public void setDocs(entity.ECFMessageClaimDataDocument_Ext[] value) {
    __getInternalInterface().setFieldValue(DOCS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFContactData field.
   */
  public void setECFContactData(entity.ECFMessageClaimDataContacts_Ext value) {
    __getInternalInterface().setFieldValue(ECFCONTACTDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFContractMarkets field.
   */
  public void setECFContractMarkets(entity.ECFContractMarket_Ext[] value) {
    __getInternalInterface().setFieldValue(ECFCONTRACTMARKETS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFTransactionState field.
   */
  public void setECFTransactionState(entity.ECFTransactionState_Ext value) {
    __getInternalInterface().setFieldValue(ECFTRANSACTIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorsOrWarnings field.
   */
  public void setErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext[] value) {
    __getInternalInterface().setFieldValue(ERRORSORWARNINGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FileFormat field.
   */
  public void setFileFormat(typekey.ECFFileFormat_Ext value) {
    __getInternalInterface().setFieldValue(FILEFORMAT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Financials field.
   */
  public void setFinancials(entity.ECFMessageClaimDataFinancial_Ext[] value) {
    __getInternalInterface().setFieldValue(FINANCIALS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImmediatePartCollectionInd field.
   */
  public void setImmediatePartCollectionInd(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMMEDIATEPARTCOLLECTIONIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Insured field.
   */
  public void setInsured(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredName field.
   */
  public void setInsuredName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef1 field.
   */
  public void setInsurerOrReinsurerClaimRef1(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERORREINSURERCLAIMREF1_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerOrReinsurerClaimRef2 field.
   */
  public void setInsurerOrReinsurerClaimRef2(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERORREINSURERCLAIMREF2_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerReference field.
   */
  public void setInsurerReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERREFERENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LcoCatastropheCode field.
   */
  public void setLcoCatastropheCode(typekey.ECFLCOCategoryCode_Ext value) {
    __getInternalInterface().setFieldValue(LCOCATASTROPHECODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadName field.
   */
  public void setLeadName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LEADNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSCAUSE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDateQualifier field.
   */
  public void setLossDateQualifier(typekey.ECFLossDateQualifier_Ext value) {
    __getInternalInterface().setFieldValue(LOSSDATEQUALIFIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDetails field.
   */
  public void setLossDetails(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSDETAILS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossEndDate field.
   */
  public void setLossEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossOrEventName field.
   */
  public void setLossOrEventName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSOREVENTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossStartDate field.
   */
  public void setLossStartDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSSTARTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MessageState field.
   */
  public void setMessageState(typekey.ECFClaimMessageState_Ext value) {
    __getInternalInterface().setFieldValue(MESSAGESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MultipleResponseIndicator field.
   */
  public void setMultipleResponseIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MULTIPLERESPONSEINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NoFurtherResponseIndicator field.
   */
  public void setNoFurtherResponseIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NOFURTHERRESPONSEINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OriginalSplitReferenceCSV field.
   */
  public void setOriginalSplitReferenceCSV(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ORIGINALSPLITREFERENCECSV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingAmountQualifier field.
   */
  public void setOutstandingAmountQualifier(typekey.ECFOutstandingQualifierCode_Ext value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNTQUALIFIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParallelClaimsUCR field.
   */
  public void setParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext[] value) {
    __getInternalInterface().setFieldValue(PARALLELCLAIMSUCR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PcsCatastropheCode field.
   */
  public void setPcsCatastropheCode(typekey.ECFPCSCategoryCode_Ext value) {
    __getInternalInterface().setFieldValue(PCSCATASTROPHECODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Policyholder field.
   */
  public void setPolicyholder(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYHOLDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PrivateComments field.
   */
  public void setPrivateComments(entity.ECFMessagePrivateComment_Ext[] value) {
    __getInternalInterface().setFieldValue(PRIVATECOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PublicComments field.
   */
  public void setPublicComments(entity.ECFMessagePublicComment_Ext[] value) {
    __getInternalInterface().setFieldValue(PUBLICCOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskCode field.
   */
  public void setRiskCode(typekey.ECFRiskCode_Ext value) {
    __getInternalInterface().setFieldValue(RISKCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskDescription field.
   */
  public void setRiskDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RISKDESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskLocation field.
   */
  public void setRiskLocation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RISKLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskReference field.
   */
  public void setRiskReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RISKREFERENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementCurrency field.
   */
  public void setSettlementCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(SETTLEMENTCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SimultaneousReinstatementProcd field.
   */
  public void setSimultaneousReinstatementProcd(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTPROCD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SimultaneousReinstatementReq field.
   */
  public void setSimultaneousReinstatementReq(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTREQ_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SlipLeadComments field.
   */
  public void setSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext[] value) {
    __getInternalInterface().setFieldValue(SLIPLEADCOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SoftWarnings field.
   */
  public void setSoftWarnings(entity.ECFMessageSoftWarning_Ext[] value) {
    __getInternalInterface().setFieldValue(SOFTWARNINGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubCategoryCode field.
   */
  public void setSubCategoryCode(typekey.ECFClaimSubCatCode_Ext value) {
    __getInternalInterface().setFieldValue(SUBCATEGORYCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransactionSequence field.
   */
  public void setTransactionSequence(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TRANSACTIONSEQUENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransactionStatus field.
   */
  public void setTransactionStatus(typekey.ECFTransactionStatus_Ext value) {
    __getInternalInterface().setFieldValue(TRANSACTIONSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransactionType field.
   */
  public void setTransactionType(typekey.ECFClaimTransactionType_Ext value) {
    __getInternalInterface().setFieldValue(TRANSACTIONTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TriageCategory field.
   */
  public void setTriageCategory(typekey.ECFTriageCode_Ext value) {
    __getInternalInterface().setFieldValue(TRIAGECATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UnderwritingYear field.
   */
  public void setUnderwritingYear(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(UNDERWRITINGYEAR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the XcsToAgreeIndicator field.
   */
  public void setXcsToAgreeIndicator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(XCSTOAGREEINDICATOR_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ECFMessageClaimData_Ext.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the AggregateDetails array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAggregateDetails(entity.ECFMessageAggregateDetail_Ext element) {
      __getInternalInterface().addArrayElement(AGGREGATEDETAILS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BrokerComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBrokerComments(entity.ECFMessageBrokerComment_Ext element) {
      __getInternalInterface().addArrayElement(BROKERCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BulkClaims array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBulkClaims(entity.ECFMessageBulkClaim_Ext element) {
      __getInternalInterface().addArrayElement(BULKCLAIMS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Carriers array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCarriers(entity.ECFMessageClaimDataCarrier_Ext element) {
      __getInternalInterface().addArrayElement(CARRIERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CrossMarketPrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element) {
      __getInternalInterface().addArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CrossMarketPublicComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element) {
      __getInternalInterface().addArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Docs array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDocs(entity.ECFMessageClaimDataDocument_Ext element) {
      __getInternalInterface().addArrayElement(DOCS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ECFContractMarkets array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToECFContractMarkets(entity.ECFContractMarket_Ext element) {
      __getInternalInterface().addArrayElement(ECFCONTRACTMARKETS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ErrorsOrWarnings array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element) {
      __getInternalInterface().addArrayElement(ERRORSORWARNINGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Financials array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToFinancials(entity.ECFMessageClaimDataFinancial_Ext element) {
      __getInternalInterface().addArrayElement(FINANCIALS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ParallelClaimsUCR array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element) {
      __getInternalInterface().addArrayElement(PARALLELCLAIMSUCR_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PrivateComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPrivateComments(entity.ECFMessagePrivateComment_Ext element) {
      __getInternalInterface().addArrayElement(PRIVATECOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PublicComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPublicComments(entity.ECFMessagePublicComment_Ext element) {
      __getInternalInterface().addArrayElement(PUBLICCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SlipLeadComments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element) {
      __getInternalInterface().addArrayElement(SLIPLEADCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SoftWarnings array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSoftWarnings(entity.ECFMessageSoftWarning_Ext element) {
      __getInternalInterface().addArrayElement(SOFTWARNINGS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public entity.KeyableBean asKeyableBean() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).asKeyableBean();
    }
    
    /**
     * Directly assigns the entity to the specified group and user by setting the assignedGroup and assignedUser fields.
     * If user or group is null returns false and nothing is done.
     * @param group The group to which the entity should be assigned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful
     */
    public boolean assign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(group, user);
    }
    
    /**
     * <p>
     * Invokes the Assignment Engine to assign the item to the specified group and user.  If userID is null,
     * the item will be assigned using the group's assignment rules.  If
     * userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param groupID The group to which the item should be assigned - must be
     *                specified.  If not known, use autoAssign(item) instead.
     * @param userID The user to which the item should be assigned; if null an
     *                appropriate user will be selected by group assignment rules.
     * @throws com.guidewire.pl.system.exception.IllegalAssignmentException if the user does not have permission
     * @throws com.guidewire.pl.system.exception.NoAssignmentFoundException if assignment could not be made
     * @deprecated Use autoAssign(Group, User) instead. Note that that method returns a boolean instead of throwing exceptions
     */
    public void assign(gw.pl.persistence.core.Key groupID, gw.pl.persistence.core.Key userID) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(groupID, userID);
    }
    
    /**
     * Assign the entity, which must be an Activity to the specified queue. (Currently, only Activities may be assigned
     * to Queues.) The current group is not a parameter - it is derived from the current
     * Assignment Engine state. As a result, this method may only be invoked from within an Assignment Rule.
     * <p/>
     * If there is no current group, nothing is done and a warning is logged. The queue must belong to the current group
     * or nothing is done.  Returns false if the assignable bean is not an activity.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param queue Queue to assign the activity to
     * @return true if the assignment is successful, false otherwise
     * @deprecated use assignActivityToQueue(AssignableQueue, Group) instead, since that method is more widely valid and
     *             is easier to understand because the group is explicit rather than implicit.
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue);
    }
    
    /**
     * Assign this entity, which must be an Activity,  to the specified queue. The queue should belong to the specified group.
     * Returns false if the assignable bean is not an activity.
     * @param queue Queue to assign the activity to
     * @param group cannot be null
     * @return true if the assignment is successful
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue, group);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
     *                         the current group. If false, only searches users in the current group
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns an assignable item to a user who satisfies the constraints defined in the attributeBasedAssignmentCriteria
     * parameter. This is done by:
     * <p/>
     * 1) Find the set of users who are members of the supplied group, and optionally its subgroups, and who satisfy
     * the supplied attribute-based search criteria. (If the group parameter is null, then no group restriction applies)
     * 2) Select from the resulting set of users via the round-robin rotation mechanism. A separate round-robin state will
     * be maintained for each unique assignment criteria entity and group.
     * @param attributeBasedAssignmentCriteria the criteria to be satisfied by the selected user
     * @param includeSubGroups if true, searches  all the users in any subgroups of the group parameter as well as those in
     *                         that group. If false, only searches users in the group
     * @param group the group.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns the entity to the group requested.  If group is null, nothing is done.
     * @param group the group to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroup(entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroup(group);
    }
    
    /**
     * Uses the group type group selector to choose the next subgroup under the "current" group (retrieved from the
     * current state of the Assignment Engine) to receive the assignable. If there is no current group, the root group
     * from the Assignment Engine is used.
     * <p/>
     * This method will search breadth-first through the group tree, starting with the current group, and will
     * return the first group found with the approriate type.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A GroupType typecode; the assignment will be restricted to a group of this type. If null, then
     *                          no group will be found.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This method of assignment is deemed useless, because it always returns the first group found with the
     *             required type. Use <code>assignGroupByRoundRobin()</code> instead, so that the assignment will be rotated among
     *             the matching groups.
     */
    public boolean assignGroupByGroupType(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByGroupType(requiredGroupType);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * Alternative signature; see <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the current group
     *                           but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the groups within the parameter group whose region assignment configuration includes that zip code.
     * 3) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one group is found, then round-robin among the resulting groups based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no groups that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the sub-groups of the specified group and optionally all of its children. If there is no
     * specified group, then the root group is used. Note that starting from the root group is potentially costly in
     * performance time. If invoked from outside an Assignment Rule, this method will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the parameter
     *                           group but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly, parentGroup);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRogin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @param includeSubGroups If true, all the user
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType, includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next group to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each Group's load factor is used to determine relative assignment frequency; essentially, a
     * group with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group type (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * <p/>
     * If no group is specified, the root group will be used instead. Note that starting from the root group is
     * potentially costly in performance time.
     * <p/>
     * When group type is specified, the load factor is <b>NOT</b> used.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter
     *                         group's immediate children but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType groupType, boolean includeSubGroups, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(groupType, includeSubGroups, parentGroup);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find a group assignment for the current entity. See
     * {@link gw.api.assignment.DynamicGroupAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicGroupAssignmentStrategy the {@link gw.api.assignment.DynamicGroupAssignmentStrategy} to be used to do the assignment
     * @param parentGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupDynamically(gw.api.assignment.DynamicGroupAssignmentStrategy dynamicGroupAssignmentStrategy, entity.Group parentGroup, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupDynamically(dynamicGroupAssignmentStrategy, parentGroup, includeSubGroups);
    }
    
    /**
     * Request manual assignment of the entity to the supplied user.
     * <p/>
     * Request is granted only if the responsible user has review assignment permission.
     * <p/>
     * Successful completion will cause a review activity to be created indicating that the assignment needs to be
     * completed, and that activity will be assigned to the supplied user
     * @param responsibleUser The person who should carry out the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean assignManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManually(responsibleUser);
    }
    
    /**
     * Request manual assignment of the entity, with the responsibilty round-robbined among members of either the
     * currently assigned group or the specified group if no group is currently assigned
     * <p/>
     * {@see assignManually} for more information about "manual" assignment.
     * @param group the group to use if this entity does not have a currently assigned group.
     * @return true if a user was found to give the manual assignment action to, false if no sure user was found
     */
    public boolean assignManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManuallyByRoundRobin(group);
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Assigns the entity to the user and group to which the associated claim is currently assigned.
     * Caller is responsible for ensuring that the entity is linked to an assigned claim. If the resulting assignment
     * is invalid for any reason, then an IllegalAssignmentException will be thrown.
     * 
     * Note that this method is currently only valid for an Activity, Exposure, or Matter.
     */
    public void assignToClaimOwner() {
      ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimOwner();
    }
    
    /**
     * Assign to the claim user with the given role. The search for a user with
     * a matching role is done in the following steps:
     * <ol>
     * <li>If assigning an activity associated with an exposure search the
     *     exposure first
     * <li>Search the claim users
     * <li>If not assigning an activity associated with an exposure, search all
     *     the exposures
     * </ol>
     * If the search finds a match at any step, it stops. If the match is unique
     * it does the assignment and returns true. If the match is not unique it
     * returns false. If the search goes through all steps without finding a
     * match it returns false
     * @param userRole the desired user role
     * @return true if a unique match was found and the assignment was made, false
     *   otherwise
     */
    public boolean assignToClaimUserWithRole(typekey.UserRole userRole) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimUserWithRole(userRole);
    }
    
    /**
     * Assigns the item to the creator of the supplied entity, and to one of the user's groups. If no group
     * is found for the user, uses the group based on the rule engine state (if available).
     * @param sourceEntity The entity to query for the id of the creator.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToCreator(entity.Editable sourceEntity) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity);
    }
    
    /**
     * Assigns this entity to the user who created the supplied entity, and to the first group in the user's list of member groups. In the
     * unlikely case that the user does not belong to any groups, then the entity will be assigned to the supplied
     * default group.
     * <p/>
     * If the supplied entity has not been persisted yet, and therefore has no recorded creator, then the current user will be
     * used instead.
     * @param sourceEntity The entity to query for the id of its creator.
     * @param defaultGroup The default group to use if the assigned user is not a member of any group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This signature is a little confusing, because the defaultGroup parameter should almost never be
     *             necessary, since in the current system a user almost never belongs to no groups. Use assignToCreator(EditableBean)
     *             instead
     */
    public boolean assignToCreator(entity.Editable sourceEntity, entity.Group defaultGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity, defaultGroup);
    }
    
    /**
     * Another name for {@link #assignToQueue()}, making it more explicit that the activity will be assigned to the FNOL
     * queue. See that method for more details.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToFNOLQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToFNOLQueue();
    }
    
    /**
     * Assigns this entity to the user and group to which the entity's "issue" is assigned. Which entity is used
     * to find the user and group is application-dependent. For example, in CC this will assign the entity to
     * the owner of the related exposure (if any) or claim. This method is currently only meaningful for CC.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToIssueOwner() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToIssueOwner();
    }
    
    /**
     * Assigns the entity to the previously assigned user.  The current group is kept track of for the client.  If there is no current
     * group, nothing is done and a warning is logged.
     * <p/>
     * This is no longer a very useful method, and should be considered deprecated, in favor of simply assigning directly to the
     * PreviousUser and PreviousGroup properties.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToPreviousOwner() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToPreviousOwner();
    }
    
    /**
     * Assign an activity to the FNOL queue of items assigned to the "current" group (retrieved from the current state of
     * the Assignment Engine). If the entity to be assigned is not an activity nothing is done,
     * false is returned and a warning is logged.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToQueue();
    }
    
    public void assignToQueueInternal(entity.AssignableQueue queue) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).assignToQueueInternal(queue);
    }
    
    /**
     * Assigns the entity to the user requested within the "current" group (retrieved from the current state of
     * the Assignment Engine).  If the user is null or is not a member of the current group, nothing is done and false is returned.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param user the user to be assigned
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assign(Group, User)</code> instead
     */
    public boolean assignUser(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUser(user);
    }
    
    /**
     * Directly assigns the entity to the specified user and one of the groups the user belongs to.
     * <p/>
     * If the user does not have sufficient permission to accept the assignment, false is returned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserAndDefaultGroup(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserAndDefaultGroup(user);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the users whose region assignment configuration includes that zip code.
     * 3) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one user is found, then round-robin among the resulting users based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no users that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the users of the group (and optionally its subgroups). It is an error if there is no
     * group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose users will be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups, group);
    }
    
    /**
     * A combination of {@link #assignUserByLocation} and {@link #assignByUserAttributes} .
     * <p/>
     * Alternative signature; see <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria whose region assignments contain the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocation}
     * to find a user whose region assignments contain the supplied location.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the parameter  group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria who is closest to the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocationUsingProximitySearch}
     * to choose the closest one.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the supplied group as well as users in the
     *                         parameter group.
     * @param group The group whose users should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximityAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximityAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this AssignmentBean to the user in the current group with the closest address to the given address,
     * measured by great-circle distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use as the center of the proximity search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address);
    }
    
    /**
     * Assigns this AssignmentBean to the user with the closest address to the given address, measured by a great-circle
     * distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user with the closest address to the specified address, measured by a great-circle
     * distance along the surface of the earth. This includes the following steps:
     * <p/>
     * 1) Geocode the supplied address which will serve as the center of the search. (If necessary, location may already be geocoded)
     * 2) For each user in the specified group, compute the distance from their location (using their Contact entity's primary address)
     * to the supplied location.
     * 2a) If the includeSubGroups parameter is true, repeat this process with all of the descendant groups of the specified group
     * 3) Return the user who is closest to the specified location
     * <p/>
     * If the geocoding attempt fails for the supplied location, an error will be logged and false returned
     * <p/>
     * Search begins with the users of the parameter group; it is an error if there is no group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for assignment. May not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups, group);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search.
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.Geocode.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @param currentGroup the group within which the search will be performed
     * @return true if the assignment is successful
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups, entity.Group currentGroup) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups, currentGroup);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, includeSubGroups);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on a User Search by Proximity. This includes the following steps:
     * <p/>
     * 1) Geocode the location which will serve as the center of the search, accessed through <code>usc.getContact().getAddress()</code>.
     * (If necessary; the location may already be geocoded)
     * 2) Finds a list of users who satisfy the user search criteria, which may include proximity restrictions.
     * The specified cap is used to limit the number of users in this list; in the case of proximity restrictions, the users farthest from the search center are trimmed.
     * 3) Use the round-robin algorithm to pick one of the users. This means that repeated, identical calls to this
     * method will rotate through the resulting set of users to find the user to return.
     * <p/>
     * Note that the round-robin rotation is based on the exact UserSearchCriteria used. One implication of this is that
     * the location used should be as general as possible (such as just a city, state or zip, rather than a specific
     * street address) to get the benefit of the round-robin processing and reduce the load on the system.
     * <p/>
     * To always assign to the closest user, set the cap to 1.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * <p/>
     * The user search criteria should be set up via gw.api.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * The group parameter may be null. If it is not null, it will be used as part of the search
     * @param usc a valid User Search Criteria, may not be null
     * @param cap If greater than zero, the maximum number of users to include for round robin from the search results.
     *                         If -1, all users from the search results will be included in the round robin.
     * @param includeSubGroups if the sub group should be used for search
     * @param group The group from where the search should be conducted
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups, group);
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin();
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the current group
     *                         but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next user from the specified group or to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each User's load factor is used to determine relative assignment frequency; essentially, a
     * user with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter group
     *                         but also through all its subgroups.
     * @param group may not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups, group);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find an assignment for the current entity. See
     * {@link gw.api.assignment.DynamicUserAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicUserAssignmentStrategy the {@link gw.api.assignment.DynamicUserAssignmentStrategy} to be used to do the assignment
     * @param group The group to be used during the assignment (usually the group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserDynamically(gw.api.assignment.DynamicUserAssignmentStrategy dynamicUserAssignmentStrategy, entity.Group group, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserDynamically(dynamicUserAssignmentStrategy, group, includeSubGroups);
    }
    
    /**
     * Invokes the Assignment Engine, which will process the configured Assignment Rules to come up with an assignment
     * for the current entity.
     * <p/>
     * May not be invoked from within an Assignment Rule, since the Assignment Engine may not be invoked recursively. If invoked
     * from within an Assigment Rule, an error will be logged and false will be returned.
     * @return true if an assignment has been found, false otherwise
     */
    public boolean autoAssign() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign();
    }
    
    /**
     * <p>
     * Invokes the Assignment Enging to assign the item to the specified group and user.
     * If userID is null, the item will be assigned using the group's assignment rules.
     * If userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param group The group to which the item should be assigned - must be
     *              specified.  If not known, use autoAssign(item) instead.
     * @param user The user to which the item should be assigned; if null an
     *              appropriate user will be selected by group assignment rules.
     * @return true if the assignment is successufl, false otherwise
     */
    public boolean autoAssign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign(group, user);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * This method is only available inside the Assignment Engine. Request manual confirmation of the entity's current assignment by the specified user.
     * <p/>
     * If the specified user does not have the review assignment permission, then does nothing and returns false.
     * Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param responsibleUser The person who should confirm the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean confirmManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManually(responsibleUser);
    }
    
    /**
     * Request manual confirmation of the entity's current assignment, with the responsibility round-robined among members
     * of the given group.
     * <p/>
     * Only users in the specified group (not subgroups)  who have the review assignment permission will be considered. The
     * round-robin rotation used here is independent of the rotation used by the assignUserByRoundRobin() methods.
     * <p/>
     * If no user is found, does nothing and returns false. Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param group the group whose users should be considered in the round-robin rotation
     * @return true if a user was found to give the confirmation action to, false if no such user was found
     */
    public boolean confirmManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManuallyByRoundRobin(group);
    }
    
    public void copyPreviousAssignments(entity.Assignable source) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).copyPreviousAssignments(source);
    }
    
    /**
     * Creates a AttributeBasedAssignmentCriteria instance, which is used to collect a set of user attributes on which to search for users.
     * The matchAll flag indicates whether each attribute must be satisfied (logical AND) or whether any attribute could
     * be satisfied (logical OR).
     * @return AttributeBasedAssignmentCriteria instance
     * @deprecated Use the constructor directly.  This method is no longer necessary, since a new AttributeBasedAssignmentCriteria entity can simply
     *             be created directly in Gosu and placed in the correct bundle.
     */
    public entity.AttributeBasedAssignmentCriteria createUserAttributes() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).createUserAttributes();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void finishAssignment() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).finishAssignment();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateAssignmentEvents() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).generateAssignmentEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the ActionCode field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFActionCode_Ext getActionCode() {
      return (typekey.ECFActionCode_Ext)__getInternalInterface().getFieldValue(ACTIONCODE_PROP.get());
    }
    
    /**
     * Gets the value of the AggregateDetails field.
     * Aggregate Details comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageAggregateDetail_Ext[] getAggregateDetails() {
      return (entity.ECFMessageAggregateDetail_Ext[])__getInternalInterface().getFieldValue(AGGREGATEDETAILS_PROP.get());
    }
    
    /**
     * Gets the value of the AmendmentDetails field.
     * Description of the 'business' reason for the sending of this claims message (e.g. 'On Account settlement')
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAmendmentDetails() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AMENDMENTDETAILS_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the AsOfDate field.
     * Date/time action occurred (transaction created or updated or response made)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAsOfDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASOFDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedByUser field.
     * User who assigned this entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedGroup field.
     * Group to which this entity is assigned; null if none assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getAssignedGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedQueue field.
     * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getAssignedQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUser field.
     * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    /**
     * Returns a string describing the current assignee plus their group,
     * suitable for display to the user. This can be quite a long string,
     * for example "Andy Applegate (Auto1 - TeamA)". See also
     * {@link #getAssigneeDisplayString()} which omits the group name and
     * may be more appropriate if space is tight.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue plus their group (for example
     * "Andy Applegate (Auto1 - TeamA)"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeAndGroupDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeAndGroupDisplayString();
    }
    
    /**
     * Returns a string describing the current assignee, suitable for display
     * to the user. See also {@link #getAssigneeAndGroupDisplayString()}, which
     * returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue (for example "Andy Applegate"). If assignment
     * is pending, returns a simple string (for example "pending assignment").
     * If the assignable is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeDisplayString();
    }
    
    /**
     * Returns a string describing only the group of the current assignee,
     * suitable for display to the user. See also {@link #getAssigneeAndGroupDisplayString()},
     *  which returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user, returns the name of the
     * user's group (for example "Auto1 - TeamA"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeGroupOnlyDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeGroupOnlyDisplayString();
    }
    
    /**
     * Gets the value of the AssignmentDate field.
     * Time when entity last assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssignmentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSIGNMENTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignmentStatus field.
     * Typelist describing assignment status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssignmentStatus getAssignmentStatus() {
      return (typekey.AssignmentStatus)__getInternalInterface().getFieldValue(ASSIGNMENTSTATUS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BrokerComments field.
     * broker additional comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageBrokerComment_Ext[] getBrokerComments() {
      return (entity.ECFMessageBrokerComment_Ext[])__getInternalInterface().getFieldValue(BROKERCOMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerContact field.
     * Text giving name of an individual who should serve as first point of contact for this message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerContact() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerEmail field.
     * Text giving the email address of the person  to be contacted in a broking organisation. May not be the person who submits the transaction
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerEmail() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKEREMAIL_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerId field.
     * Coded identification of a broking organisation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERID_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerName field.
     * The name of the Broker organisation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerPhone field.
     * Telephone number of the name or department within the broker organisation to be contacted in relation to a transaction
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerReference field.
     * Broker policy reference 1
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERREFERENCE_PROP.get());
    }
    
    /**
     * Gets the value of the BulkClaimHeaderTR field.
     * The Transaction Reference of the Bulk collection
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBulkClaimHeaderTR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKCLAIMHEADERTR_PROP.get());
    }
    
    /**
     * Gets the value of the BulkClaimHeaderUCR field.
     * The Unique Claim Reference of the bulk header
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBulkClaimHeaderUCR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKCLAIMHEADERUCR_PROP.get());
    }
    
    /**
     * Gets the value of the BulkClaimNoOfItems field.
     * The number of bulk items included in the bulk
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getBulkClaimNoOfItems() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BULKCLAIMNOOFITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the BulkClaims field.
     * ECF Claim Data Message Bulk Claims
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageBulkClaim_Ext[] getBulkClaims() {
      return (entity.ECFMessageBulkClaim_Ext[])__getInternalInterface().getFieldValue(BULKCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the BureauType field.
     * The carrier's bureau type for this transaction
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFBureauType_Ext getBureauType() {
      return (typekey.ECFBureauType_Ext)__getInternalInterface().getFieldValue(BUREAUTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Carriers field.
     * ECF Claim Data Message Carriers
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimDataCarrier_Ext[] getCarriers() {
      return (entity.ECFMessageClaimDataCarrier_Ext[])__getInternalInterface().getFieldValue(CARRIERS_PROP.get());
    }
    
    /**
     * Gets the value of the CategoryCode field.
     * Claim category code
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimCategoryCode_Ext getCategoryCode() {
      return (typekey.ECFClaimCategoryCode_Ext)__getInternalInterface().getFieldValue(CATEGORYCODE_PROP.get());
    }
    
    /**
     * Gets the value of the CedantInLiquidationIndicator field.
     * Indicates that the cedant is in liquidation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCedantInLiquidationIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CEDANTINLIQUIDATIONINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the ChaseUpIndicator field.
     * Indicates whether chase up required.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getChaseUpIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHASEUPINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the ChaseUpIndicatorInterval field.
     * The period (in months) before a chase up will be issued.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getChaseUpIndicatorInterval() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CHASEUPINDICATORINTERVAL_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * The Claim this message is related to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimLineNumber field.
     * The Claim Line Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimLineNumber() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMLINENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimResponseUUId field.
     * ClaimResponseUUId - Unique Universal Identifier of the ClaimResponseRq message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimResponseUUId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMRESPONSEUUID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageClaimStatus_Ext getClaimStatus() {
      return (typekey.ECFMessageClaimStatus_Ext)__getInternalInterface().getFieldValue(CLAIMSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimType field.
     * The three-digit ECF Code specifying the type of Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimTypeCode_Ext getClaimType() {
      return (typekey.ECFClaimTypeCode_Ext)__getInternalInterface().getFieldValue(CLAIMTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Claimant field.
     * Name of the claimant involved in a loss
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimant() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMANT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimsScheme field.
     * The claims scheme applicable to the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFScheme_Ext getClaimsScheme() {
      return (typekey.ECFScheme_Ext)__getInternalInterface().getFieldValue(CLAIMSSCHEME_PROP.get());
    }
    
    /**
     * Gets the value of the ClassOfBusiness field.
     * Code for identifying the class of business (for ILU and LIRMA). AKA JvClassOfBusiness in the XML
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClassOfBusiness_Ext getClassOfBusiness() {
      return (typekey.ECFClassOfBusiness_Ext)__getInternalInterface().getFieldValue(CLASSOFBUSINESS_PROP.get());
    }
    
    /**
     * Gets the value of the CloseDate field.
     * Date and time when this entity was closed. (Not applicable to all assignable entities)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the CoLeadIndicator field.
     * Indicator Y/N to indicate if a Binding authority UCR has Co-Leads on it
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCoLeadIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLEADINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the CollectionUnlikelyIndicator field.
     * Collection unlikely indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCollectionUnlikelyIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLLECTIONUNLIKELYINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the Content field.
     * The message content
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getContent() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(CONTENT_PROP.get());
    }
    
    /**
     * Gets the value of the ContractualConditionsIndicator field.
     * Indicates that contractual conditions apply to claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getContractualConditionsIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTRACTUALCONDITIONSINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the CoverType field.
     * Code expressing the type of cover (quota share, surplus, XOL..)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCoverType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COVERTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the CrossMarketPrivateComments field.
     * Cross market private comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageCrossMarketPrivateComment_Ext[] getCrossMarketPrivateComments() {
      return (entity.ECFMessageCrossMarketPrivateComment_Ext[])__getInternalInterface().getFieldValue(CROSSMARKETPRIVATECOMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the CrossMarketPublicComments field.
     * Cross market public comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageCrossMarketPublicComment_Ext[] getCrossMarketPublicComments() {
      return (entity.ECFMessageCrossMarketPublicComment_Ext[])__getInternalInterface().getFieldValue(CROSSMARKETPUBLICCOMMENTS_PROP.get());
    }
    
    /**
     * This method exists to support the notion of "secondary" assignment in the Assignment Rules. "Secondary" assignments
     * generally represented by UserRoleAssignment entities, are assignments of "roles" to users, separated from the single
     * "primary" owner of the entity.
     * <p/>
     * It is generally desirable for Assignment rule writers to be able to re-use a single set of, say, Claim Assignment rules
     * for both primary and secondary assignments. This method allows rules to be written in the form of
     * <code>Claim.CurrentAssignment.assignXXX()</code> rather than <code>Claim.assignXXX()</code>. If the primary
     * assignment is being performed, then getCurrentAssignment() will return the entity itself (in this case, the Claim).
     * If a secondary assignment is being performed, then getCurrentAssignment() will return the UserRoleAssignment which
     * is current being operated upon.
     * <p/>
     * Obviously, if an entity does not support secondary assignment (i.e. does not implement the UserRoleOwner interface),
     * then rules do not need to use this method. Secondary assignments done outside of the Assignment Rules can simplay
     * call the assignXXX methods directly on the UserRoleAssignment entity themselves, and therefore also do not require
     * this method.
     * <p/>
     * Since this method is dependent on the Assignment Engine state, calling it outside of the Assignment Rules is illegal.
     * @return the CCAssignable entity being operated on by the Assignment Engine. May be either the current entity or
     *         a UserRoleAssignment entity relating to the current entity.
     */
    public entity.CCAssignable getCurrentAssignment() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getCurrentAssignment();
    }
    
    /**
     * Gets the value of the Docs field.
     * ECF Claim Data Message Documents
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimDataDocument_Ext[] getDocs() {
      return (entity.ECFMessageClaimDataDocument_Ext[])__getInternalInterface().getFieldValue(DOCS_PROP.get());
    }
    
    /**
     * Gets the value of the ECFContactData field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimDataContacts_Ext getECFContactData() {
      return (entity.ECFMessageClaimDataContacts_Ext)__getInternalInterface().getFieldValue(ECFCONTACTDATA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getECFContactDataID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ECFCONTACTDATA_PROP.get());
    }
    
    /**
     * Gets the value of the ECFContractMarkets field.
     * An array holds the information about the parties and their role in each claim data message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFContractMarket_Ext[] getECFContractMarkets() {
      return (entity.ECFContractMarket_Ext[])__getInternalInterface().getFieldValue(ECFCONTRACTMARKETS_PROP.get());
    }
    
    /**
     * Gets the value of the ECFTransactionState field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFTransactionState_Ext getECFTransactionState() {
      return (entity.ECFTransactionState_Ext)__getInternalInterface().getFieldValue(ECFTRANSACTIONSTATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getECFTransactionStateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ECFTRANSACTIONSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorsOrWarnings field.
     * Errors or Warnings
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageErrorOrWarning_Ext[] getErrorsOrWarnings() {
      return (entity.ECFMessageErrorOrWarning_Ext[])__getInternalInterface().getFieldValue(ERRORSORWARNINGS_PROP.get());
    }
    
    /**
     * Gets the value of the FileFormat field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFFileFormat_Ext getFileFormat() {
      return (typekey.ECFFileFormat_Ext)__getInternalInterface().getFieldValue(FILEFORMAT_PROP.get());
    }
    
    /**
     * Gets the value of the Financials field.
     * ECF Claim Data Message Financials
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimDataFinancial_Ext[] getFinancials() {
      return (entity.ECFMessageClaimDataFinancial_Ext[])__getInternalInterface().getFieldValue(FINANCIALS_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getGroupAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getGroupAssignmentStateHelpers();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the ImmediatePartCollectionInd field.
     * Immediate part collection indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getImmediatePartCollectionInd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMMEDIATEPARTCOLLECTIONIND_PROP.get());
    }
    
    /**
     * Gets the value of the Insured field.
     * Name of insured person or organization in free text
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsured() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURED_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredId field.
     * Insured Id come with in the message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDID_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredName field.
     * Insured Name for this message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDNAME_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerOrReinsurerClaimRef1 field.
     * The insurer or reinsurer claim reference number 1
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerOrReinsurerClaimRef1() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERORREINSURERCLAIMREF1_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerOrReinsurerClaimRef2 field.
     * The insurer or reinsurer claim reference number 2
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerOrReinsurerClaimRef2() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERORREINSURERCLAIMREF2_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerReference field.
     * Reference allocated to the sender transaction reference. Either Insurer or reinsurer transaction reference must be provided
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERREFERENCE_PROP.get());
    }
    
    /**
     * Gets the value of the LcoCatastropheCode field.
     * Reference assigned to a catastrophe by the the Lloyd's Claims Office (LCO) related to a claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFLCOCategoryCode_Ext getLcoCatastropheCode() {
      return (typekey.ECFLCOCategoryCode_Ext)__getInternalInterface().getFieldValue(LCOCATASTROPHECODE_PROP.get());
    }
    
    /**
     * Gets the value of the LeadName field.
     * The name of the lead Insurer for the claim where more than one market is involved in the claim. Name and not ID
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLeadName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEADNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the LossCause field.
     * Code which identifies the claim cause. Cause code has to be provided on first advice by lead, will default to previous value on subsequent transactions
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossCause() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSCAUSE_PROP.get());
    }
    
    /**
     * Gets the value of the LossDateQualifier field.
     * Code identification of what the Loss Date From and To represent
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFLossDateQualifier_Ext getLossDateQualifier() {
      return (typekey.ECFLossDateQualifier_Ext)__getInternalInterface().getFieldValue(LOSSDATEQUALIFIER_PROP.get());
    }
    
    /**
     * Gets the value of the LossDetails field.
     * The loss details
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossDetails() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSDETAILS_PROP.get());
    }
    
    /**
     * Gets the value of the LossEndDate field.
     * End date of period during which a loss occurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocation field.
     * Text description of the location of the loss being reported
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossLocation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the LossOrEventName field.
     * Textual details on the loss or event which is the subject of the original insurance of the individual loss included in the transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossOrEventName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSOREVENTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LossStartDate field.
     * Start date of period during which a loss occurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossStartDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSSTARTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the MessageCategory field.
     * Specifies a category that this message belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LMMessageCategory_Ext getMessageCategory() {
      return (typekey.LMMessageCategory_Ext)__getInternalInterface().getFieldValue(MESSAGECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the MessageDirection field.
     * Specifies if the message is an Inbound or Outbound message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageDirectionType_Ext getMessageDirection() {
      return (typekey.ECFMessageDirectionType_Ext)__getInternalInterface().getFieldValue(MESSAGEDIRECTION_PROP.get());
    }
    
    /**
     * Gets the value of the MessageState field.
     * Identifies the state of Claim Data message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimMessageState_Ext getMessageState() {
      return (typekey.ECFClaimMessageState_Ext)__getInternalInterface().getFieldValue(MESSAGESTATE_PROP.get());
    }
    
    /**
     * Gets the value of the MessageType field.
     * store message type as extracted from the header
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageType_Ext getMessageType() {
      return (typekey.ECFMessageType_Ext)__getInternalInterface().getFieldValue(MESSAGETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MultipleResponseIndicator field.
     * Indicates that a multiple response is being actioned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMultipleResponseIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MULTIPLERESPONSEINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the NoFurtherResponseIndicator field.
     * No Further Response Indicator. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNoFurtherResponseIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOFURTHERRESPONSEINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the OriginTimeStamp field.
     * The message origin post date and time
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getOriginTimeStamp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ORIGINTIMESTAMP_PROP.get());
    }
    
    /**
     * Gets the value of the OriginalSplitReferenceCSV field.
     * Financials: The Bureau reference allocated to the premium transaction relating to the claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOriginalSplitReferenceCSV() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ORIGINALSPLITREFERENCECSV_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingAmountQualifier field.
     * Financials: Qualifier providing more information about the outstanding amount and/or the claim in general
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFOutstandingQualifierCode_Ext getOutstandingAmountQualifier() {
      return (typekey.ECFOutstandingQualifierCode_Ext)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNTQUALIFIER_PROP.get());
    }
    
    /**
     * Gets the value of the ParallelClaimsUCR field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimDataParallelClaimUCR_Ext[] getParallelClaimsUCR() {
      return (entity.ECFMessageClaimDataParallelClaimUCR_Ext[])__getInternalInterface().getFieldValue(PARALLELCLAIMSUCR_PROP.get());
    }
    
    /**
     * Gets the value of the PcsCatastropheCode field.
     * Reference assigned to a catastrophe by the Property Claim Service (PCS) related to a claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFPCSCategoryCode_Ext getPcsCatastropheCode() {
      return (typekey.ECFPCSCategoryCode_Ext)__getInternalInterface().getFieldValue(PCSCATASTROPHECODE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * ClaimNotifyRq/ClaimRetrieveRs.ClaimMovement.Contract.InsurerRiskReference
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Description of a policy
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Policyholder field.
     * Identity of the party that took the original insurance with the insurance company that ceded the business expressed in text form
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyholder() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYHOLDER_PROP.get());
    }
    
    public gw.internal.ext.org.apache.commons.collections.BidiMap getPreviousAssignments() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getPreviousAssignments();
    }
    
    /**
     * Gets the value of the PreviousGroup field.
     * Group to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getPreviousGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousQueue field.
     * Queue to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getPreviousQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousUser field.
     * User to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getPreviousUser() {
      return (entity.User)__getInternalInterface().getFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    /**
     * Gets the value of the PrivateComments field.
     * private comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessagePrivateComment_Ext[] getPrivateComments() {
      return (entity.ECFMessagePrivateComment_Ext[])__getInternalInterface().getFieldValue(PRIVATECOMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the PublicComments field.
     * public comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessagePublicComment_Ext[] getPublicComments() {
      return (entity.ECFMessagePublicComment_Ext[])__getInternalInterface().getFieldValue(PUBLICCOMMENTS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReceiverPartyAgency field.
     * Receiver Party Agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyId field.
     * Receiver Party Id
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYID_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyName field.
     * Receiver Party Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyRoleCd field.
     * Receiver Party Role
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyRoleCd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYROLECD_PROP.get());
    }
    
    /**
     * Gets the value of the ResponseAcknowledgement field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageResponseAcknowledgement_Ext getResponseAcknowledgement() {
      return (entity.ECFMessageResponseAcknowledgement_Ext)__getInternalInterface().getFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getResponseAcknowledgementID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RiskCode field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFRiskCode_Ext getRiskCode() {
      return (typekey.ECFRiskCode_Ext)__getInternalInterface().getFieldValue(RISKCODE_PROP.get());
    }
    
    /**
     * Gets the value of the RiskDescription field.
     * Text giving a description of the insured risk, contract or layer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRiskDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKDESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the RiskLocation field.
     * Description of situation of insured interest, or journey
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRiskLocation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the RiskReference field.
     * Syndicate or company’s risk reference 2
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRiskReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RISKREFERENCE_PROP.get());
    }
    
    /**
     * Gets the value of the Role field.
     * The role the receiver had in this message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFParticipantFunction_Ext getRole() {
      return (typekey.ECFParticipantFunction_Ext)__getInternalInterface().getFieldValue(ROLE_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyAgency field.
     * Sender Party Agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyId field.
     * Sender Party Id
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYID_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyName field.
     * Sender Party Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyRoleCd field.
     * Sender Party Role
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyRoleCd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYROLECD_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementCurrency field.
     * Financials: The currency in which amounts will be settled
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getSettlementCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the SimultaneousReinstatementProcd field.
     * Indicates that the Reinstatement Premium has been processed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSimultaneousReinstatementProcd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTPROCD_PROP.get());
    }
    
    /**
     * Gets the value of the SimultaneousReinstatementReq field.
     * Indicates whether a simultaneous Reinstatement Premium is required
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSimultaneousReinstatementReq() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTREQ_PROP.get());
    }
    
    /**
     * Gets the value of the SlipLeadComments field.
     * slip lead comments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageSlipLeadComment_Ext[] getSlipLeadComments() {
      return (entity.ECFMessageSlipLeadComment_Ext[])__getInternalInterface().getFieldValue(SLIPLEADCOMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the SoftWarnings field.
     * Soft Warnings
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageSoftWarning_Ext[] getSoftWarnings() {
      return (entity.ECFMessageSoftWarning_Ext[])__getInternalInterface().getFieldValue(SOFTWARNINGS_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * Message processing status
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageStatus_Ext getStatus() {
      return (typekey.ECFMessageStatus_Ext)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the SubCategoryCode field.
     * Claim subcategory code
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimSubCatCode_Ext getSubCategoryCode() {
      return (typekey.ECFClaimSubCatCode_Ext)__getInternalInterface().getFieldValue(SUBCATEGORYCODE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LMMessage_Ext getSubtype() {
      return (typekey.LMMessage_Ext)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Returns the suggested assignees for this entity, to be displayed in the
     * UI as the most likely assignees when the user is assigning the entity. The list of assignees
     * will depend on the type of entity, and will contain users who are somehow "involved" with the entity,
     * associated claim, or currently assigned user and group.
     * @return the list of suggested assignees, never null or empty
     */
    public gw.api.assignment.Assignee[] getSuggestedAssignees() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getSuggestedAssignees();
    }
    
    /**
     * Gets the value of the TR field.
     * Transaction reference for the Transaction this message belongs to
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TR_PROP.get());
    }
    
    /**
     * Gets the value of the TransactionSequence field.
     * A number assigned to indicate the sequence of the transaction within the UCR
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTransactionSequence() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TRANSACTIONSEQUENCE_PROP.get());
    }
    
    /**
     * Gets the value of the TransactionStatus field.
     * The status of Lloyd's, LIRMA, ILU Transactions
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFTransactionStatus_Ext getTransactionStatus() {
      return (typekey.ECFTransactionStatus_Ext)__getInternalInterface().getFieldValue(TRANSACTIONSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the TransactionType field.
     * Identifies the type of transaction and will notify if the message is a first advice (with or without settlement) and interim advice (with or without settlement). The sender and receiver should make sure that this data element is populated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimTransactionType_Ext getTransactionType() {
      return (typekey.ECFClaimTransactionType_Ext)__getInternalInterface().getFieldValue(TRANSACTIONTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TriageCategory field.
     * An indication of the complexity of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFTriageCode_Ext getTriageCategory() {
      return (typekey.ECFTriageCode_Ext)__getInternalInterface().getFieldValue(TRIAGECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the UCR field.
     * Unique Claim Reference for claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUCR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_PROP.get());
    }
    
    /**
     * Gets the value of the UMR field.
     * Unique Mandate Reference. This identifies the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUMR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_PROP.get());
    }
    
    /**
     * Gets the value of the UUID field.
     * UUId - Unique Universal Identifier of the message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UUID_PROP.get());
    }
    
    /**
     * Gets the value of the UnderwritingYear field.
     * Year in which the contract, or an individual risk covered by the contract, is underwritten. Only for Lloyd’s. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getUnderwritingYear() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(UNDERWRITINGYEAR_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getUserAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getUserAssignmentStateHelpers();
    }
    
    /**
     * Gets the value of the ValidationErrorCode field.
     * The error code for the reason this message failed validation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getValidationErrorCode() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(VALIDATIONERRORCODE_PROP.get());
    }
    
    /**
     * Gets the value of the ValidationFailureReason field.
     * The reason being given for this message to have failed validation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getValidationFailureReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALIDATIONFAILUREREASON_PROP.get());
    }
    
    /**
     * Gets the value of the XcsToAgreeIndicator field.
     * XcsToAgreeIndicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getXcsToAgreeIndicator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(XCSTOAGREEINDICATOR_PROP.get());
    }
    
    public void handleAssignmentCommit() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentCommit();
    }
    
    public void handleAssignmentRollback() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentRollback();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
    }
    
    /**
     * Gets the value of the ConflictOfInterestInd field.
     * States if this message indicates a Conflict Of Interest on the Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isConflictOfInterestInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONFLICTOFINTERESTIND_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * Gets the value of the Reprocess field.
     * Indicates if a message needs to be reprocessed. Will be picked up by a batch process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReprocess() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REPROCESS_PROP.get());
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    /**
     * Gets the value of the Suspended field.
     * Whether the message needs a manual interaction due to preprocessing validation failure or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSuspended() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUSPENDED_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    /**
     * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
     */
    public void removeFromAggregateDetails(entity.ECFMessageAggregateDetail_Ext element) {
      __getInternalInterface().removeArrayElement(AGGREGATEDETAILS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AggregateDetails array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAggregateDetails(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(AGGREGATEDETAILS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
     */
    public void removeFromBrokerComments(entity.ECFMessageBrokerComment_Ext element) {
      __getInternalInterface().removeArrayElement(BROKERCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BrokerComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBrokerComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BROKERCOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
     */
    public void removeFromBulkClaims(entity.ECFMessageBulkClaim_Ext element) {
      __getInternalInterface().removeArrayElement(BULKCLAIMS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BulkClaims array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBulkClaims(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BULKCLAIMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
     */
    public void removeFromCarriers(entity.ECFMessageClaimDataCarrier_Ext element) {
      __getInternalInterface().removeArrayElement(CARRIERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Carriers array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCarriers(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CARRIERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
     */
    public void removeFromCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext element) {
      __getInternalInterface().removeArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CrossMarketPrivateComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCrossMarketPrivateComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CROSSMARKETPRIVATECOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
     */
    public void removeFromCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext element) {
      __getInternalInterface().removeArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CrossMarketPublicComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCrossMarketPublicComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CROSSMARKETPUBLICCOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Docs array. This is achieved by marking the element for removal.
     */
    public void removeFromDocs(entity.ECFMessageClaimDataDocument_Ext element) {
      __getInternalInterface().removeArrayElement(DOCS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Docs array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDocs(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DOCS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
     */
    public void removeFromECFContractMarkets(entity.ECFContractMarket_Ext element) {
      __getInternalInterface().removeArrayElement(ECFCONTRACTMARKETS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ECFContractMarkets array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromECFContractMarkets(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ECFCONTRACTMARKETS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
     */
    public void removeFromErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element) {
      __getInternalInterface().removeArrayElement(ERRORSORWARNINGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromErrorsOrWarnings(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ERRORSORWARNINGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Financials array. This is achieved by marking the element for removal.
     */
    public void removeFromFinancials(entity.ECFMessageClaimDataFinancial_Ext element) {
      __getInternalInterface().removeArrayElement(FINANCIALS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Financials array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromFinancials(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(FINANCIALS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
     */
    public void removeFromParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext element) {
      __getInternalInterface().removeArrayElement(PARALLELCLAIMSUCR_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ParallelClaimsUCR array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromParallelClaimsUCR(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PARALLELCLAIMSUCR_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
     */
    public void removeFromPrivateComments(entity.ECFMessagePrivateComment_Ext element) {
      __getInternalInterface().removeArrayElement(PRIVATECOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PrivateComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPrivateComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PRIVATECOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
     */
    public void removeFromPublicComments(entity.ECFMessagePublicComment_Ext element) {
      __getInternalInterface().removeArrayElement(PUBLICCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PublicComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPublicComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PUBLICCOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
     */
    public void removeFromSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext element) {
      __getInternalInterface().removeArrayElement(SLIPLEADCOMMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SlipLeadComments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSlipLeadComments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SLIPLEADCOMMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
     */
    public void removeFromSoftWarnings(entity.ECFMessageSoftWarning_Ext element) {
      __getInternalInterface().removeArrayElement(SOFTWARNINGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SoftWarnings array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSoftWarnings(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SOFTWARNINGS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ActionCode field.
     */
    public void setActionCode(typekey.ECFActionCode_Ext value) {
      __getInternalInterface().setFieldValue(ACTIONCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AggregateDetails field.
     */
    public void setAggregateDetails(entity.ECFMessageAggregateDetail_Ext[] value) {
      __getInternalInterface().setFieldValue(AGGREGATEDETAILS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AmendmentDetails field.
     */
    public void setAmendmentDetails(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AMENDMENTDETAILS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AsOfDate field.
     */
    public void setAsOfDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASOFDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedByUser field.
     */
    public void setAssignedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    public void setAssignedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedGroup field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroup(entity.Group value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedGroup(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroupID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedGroupID(value);
    }
    
    /**
     * Sets the value of the AssignedQueue field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueue(entity.AssignableQueue value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedQueue(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueueID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedQueueID(value);
    }
    
    /**
     * Sets the value of the AssignedUser field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUser(entity.User value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedUser(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedUserID(value);
    }
    
    /**
     * Sets the value of the AssignmentDate field.
     */
    public void setAssignmentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignmentStatus field.
     */
    public void setAssignmentStatus(typekey.AssignmentStatus value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerComments field.
     */
    public void setBrokerComments(entity.ECFMessageBrokerComment_Ext[] value) {
      __getInternalInterface().setFieldValue(BROKERCOMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerContact field.
     */
    public void setBrokerContact(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerEmail field.
     */
    public void setBrokerEmail(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKEREMAIL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerId field.
     */
    public void setBrokerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerName field.
     */
    public void setBrokerName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerPhone field.
     */
    public void setBrokerPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerReference field.
     */
    public void setBrokerReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERREFERENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkClaimHeaderTR field.
     */
    public void setBulkClaimHeaderTR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BULKCLAIMHEADERTR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkClaimHeaderUCR field.
     */
    public void setBulkClaimHeaderUCR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BULKCLAIMHEADERUCR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkClaimNoOfItems field.
     */
    public void setBulkClaimNoOfItems(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(BULKCLAIMNOOFITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkClaims field.
     */
    public void setBulkClaims(entity.ECFMessageBulkClaim_Ext[] value) {
      __getInternalInterface().setFieldValue(BULKCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BureauType field.
     */
    public void setBureauType(typekey.ECFBureauType_Ext value) {
      __getInternalInterface().setFieldValue(BUREAUTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Carriers field.
     */
    public void setCarriers(entity.ECFMessageClaimDataCarrier_Ext[] value) {
      __getInternalInterface().setFieldValue(CARRIERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CategoryCode field.
     */
    public void setCategoryCode(typekey.ECFClaimCategoryCode_Ext value) {
      __getInternalInterface().setFieldValue(CATEGORYCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CedantInLiquidationIndicator field.
     */
    public void setCedantInLiquidationIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CEDANTINLIQUIDATIONINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ChaseUpIndicator field.
     */
    public void setChaseUpIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHASEUPINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ChaseUpIndicatorInterval field.
     */
    public void setChaseUpIndicatorInterval(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CHASEUPINDICATORINTERVAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLineNumber field.
     */
    public void setClaimLineNumber(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMLINENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimResponseUUId field.
     */
    public void setClaimResponseUUId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMRESPONSEUUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimStatus field.
     */
    public void setClaimStatus(typekey.ECFMessageClaimStatus_Ext value) {
      __getInternalInterface().setFieldValue(CLAIMSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimType field.
     */
    public void setClaimType(typekey.ECFClaimTypeCode_Ext value) {
      __getInternalInterface().setFieldValue(CLAIMTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claimant field.
     */
    public void setClaimant(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMANT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimsScheme field.
     */
    public void setClaimsScheme(typekey.ECFScheme_Ext value) {
      __getInternalInterface().setFieldValue(CLAIMSSCHEME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClassOfBusiness field.
     */
    public void setClassOfBusiness(typekey.ECFClassOfBusiness_Ext value) {
      __getInternalInterface().setFieldValue(CLASSOFBUSINESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoLeadIndicator field.
     */
    public void setCoLeadIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COLEADINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CollectionUnlikelyIndicator field.
     */
    public void setCollectionUnlikelyIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COLLECTIONUNLIKELYINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConflictOfInterestInd field.
     */
    public void setConflictOfInterestInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CONFLICTOFINTERESTIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Content field.
     */
    public void setContent(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(CONTENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContractualConditionsIndicator field.
     */
    public void setContractualConditionsIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CONTRACTUALCONDITIONSINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverType field.
     */
    public void setCoverType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COVERTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CrossMarketPrivateComments field.
     */
    public void setCrossMarketPrivateComments(entity.ECFMessageCrossMarketPrivateComment_Ext[] value) {
      __getInternalInterface().setFieldValue(CROSSMARKETPRIVATECOMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CrossMarketPublicComments field.
     */
    public void setCrossMarketPublicComments(entity.ECFMessageCrossMarketPublicComment_Ext[] value) {
      __getInternalInterface().setFieldValue(CROSSMARKETPUBLICCOMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Docs field.
     */
    public void setDocs(entity.ECFMessageClaimDataDocument_Ext[] value) {
      __getInternalInterface().setFieldValue(DOCS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFContactData field.
     */
    public void setECFContactData(entity.ECFMessageClaimDataContacts_Ext value) {
      __getInternalInterface().setFieldValue(ECFCONTACTDATA_PROP.get(), value);
    }
    
    public void setECFContactDataID(gw.pl.persistence.core.Key value) {
      setFieldValue(ECFCONTACTDATA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFContractMarkets field.
     */
    public void setECFContractMarkets(entity.ECFContractMarket_Ext[] value) {
      __getInternalInterface().setFieldValue(ECFCONTRACTMARKETS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFTransactionState field.
     */
    public void setECFTransactionState(entity.ECFTransactionState_Ext value) {
      __getInternalInterface().setFieldValue(ECFTRANSACTIONSTATE_PROP.get(), value);
    }
    
    public void setECFTransactionStateID(gw.pl.persistence.core.Key value) {
      setFieldValue(ECFTRANSACTIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorsOrWarnings field.
     */
    public void setErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext[] value) {
      __getInternalInterface().setFieldValue(ERRORSORWARNINGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FileFormat field.
     */
    public void setFileFormat(typekey.ECFFileFormat_Ext value) {
      __getInternalInterface().setFieldValue(FILEFORMAT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Financials field.
     */
    public void setFinancials(entity.ECFMessageClaimDataFinancial_Ext[] value) {
      __getInternalInterface().setFieldValue(FINANCIALS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImmediatePartCollectionInd field.
     */
    public void setImmediatePartCollectionInd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMMEDIATEPARTCOLLECTIONIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Insured field.
     */
    public void setInsured(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredId field.
     */
    public void setInsuredId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredName field.
     */
    public void setInsuredName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerOrReinsurerClaimRef1 field.
     */
    public void setInsurerOrReinsurerClaimRef1(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERORREINSURERCLAIMREF1_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerOrReinsurerClaimRef2 field.
     */
    public void setInsurerOrReinsurerClaimRef2(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERORREINSURERCLAIMREF2_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerReference field.
     */
    public void setInsurerReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERREFERENCE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LcoCatastropheCode field.
     */
    public void setLcoCatastropheCode(typekey.ECFLCOCategoryCode_Ext value) {
      __getInternalInterface().setFieldValue(LCOCATASTROPHECODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadName field.
     */
    public void setLeadName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LEADNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossCause field.
     */
    public void setLossCause(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSCAUSE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDateQualifier field.
     */
    public void setLossDateQualifier(typekey.ECFLossDateQualifier_Ext value) {
      __getInternalInterface().setFieldValue(LOSSDATEQUALIFIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDetails field.
     */
    public void setLossDetails(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSDETAILS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossEndDate field.
     */
    public void setLossEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocation field.
     */
    public void setLossLocation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossOrEventName field.
     */
    public void setLossOrEventName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSOREVENTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossStartDate field.
     */
    public void setLossStartDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSSTARTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageCategory field.
     */
    public void setMessageCategory(typekey.LMMessageCategory_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGECATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageDirection field.
     */
    public void setMessageDirection(typekey.ECFMessageDirectionType_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGEDIRECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageState field.
     */
    public void setMessageState(typekey.ECFClaimMessageState_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageType field.
     */
    public void setMessageType(typekey.ECFMessageType_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MultipleResponseIndicator field.
     */
    public void setMultipleResponseIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MULTIPLERESPONSEINDICATOR_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the NoFurtherResponseIndicator field.
     */
    public void setNoFurtherResponseIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NOFURTHERRESPONSEINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OriginTimeStamp field.
     */
    public void setOriginTimeStamp(java.util.Date value) {
      __getInternalInterface().setFieldValue(ORIGINTIMESTAMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OriginalSplitReferenceCSV field.
     */
    public void setOriginalSplitReferenceCSV(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ORIGINALSPLITREFERENCECSV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingAmountQualifier field.
     */
    public void setOutstandingAmountQualifier(typekey.ECFOutstandingQualifierCode_Ext value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNTQUALIFIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParallelClaimsUCR field.
     */
    public void setParallelClaimsUCR(entity.ECFMessageClaimDataParallelClaimUCR_Ext[] value) {
      __getInternalInterface().setFieldValue(PARALLELCLAIMSUCR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PcsCatastropheCode field.
     */
    public void setPcsCatastropheCode(typekey.ECFPCSCategoryCode_Ext value) {
      __getInternalInterface().setFieldValue(PCSCATASTROPHECODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Policyholder field.
     */
    public void setPolicyholder(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYHOLDER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousGroup field.
     */
    public void setPreviousGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    public void setPreviousGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousQueue field.
     */
    public void setPreviousQueue(entity.AssignableQueue value) {
      __getInternalInterface().setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    public void setPreviousQueueID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousUser field.
     */
    public void setPreviousUser(entity.User value) {
      __getInternalInterface().setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    public void setPreviousUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrivateComments field.
     */
    public void setPrivateComments(entity.ECFMessagePrivateComment_Ext[] value) {
      __getInternalInterface().setFieldValue(PRIVATECOMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PublicComments field.
     */
    public void setPublicComments(entity.ECFMessagePublicComment_Ext[] value) {
      __getInternalInterface().setFieldValue(PUBLICCOMMENTS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReceiverPartyAgency field.
     */
    public void setReceiverPartyAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyId field.
     */
    public void setReceiverPartyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyName field.
     */
    public void setReceiverPartyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyRoleCd field.
     */
    public void setReceiverPartyRoleCd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYROLECD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Reprocess field.
     */
    public void setReprocess(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REPROCESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ResponseAcknowledgement field.
     */
    public void setResponseAcknowledgement(entity.ECFMessageResponseAcknowledgement_Ext value) {
      __getInternalInterface().setFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get(), value);
    }
    
    public void setResponseAcknowledgementID(gw.pl.persistence.core.Key value) {
      setFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskCode field.
     */
    public void setRiskCode(typekey.ECFRiskCode_Ext value) {
      __getInternalInterface().setFieldValue(RISKCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskDescription field.
     */
    public void setRiskDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RISKDESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskLocation field.
     */
    public void setRiskLocation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RISKLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskReference field.
     */
    public void setRiskReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RISKREFERENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Role field.
     */
    public void setRole(typekey.ECFParticipantFunction_Ext value) {
      __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyAgency field.
     */
    public void setSenderPartyAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyId field.
     */
    public void setSenderPartyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyName field.
     */
    public void setSenderPartyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyRoleCd field.
     */
    public void setSenderPartyRoleCd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYROLECD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementCurrency field.
     */
    public void setSettlementCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(SETTLEMENTCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SimultaneousReinstatementProcd field.
     */
    public void setSimultaneousReinstatementProcd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTPROCD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SimultaneousReinstatementReq field.
     */
    public void setSimultaneousReinstatementReq(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SIMULTANEOUSREINSTATEMENTREQ_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SlipLeadComments field.
     */
    public void setSlipLeadComments(entity.ECFMessageSlipLeadComment_Ext[] value) {
      __getInternalInterface().setFieldValue(SLIPLEADCOMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SoftWarnings field.
     */
    public void setSoftWarnings(entity.ECFMessageSoftWarning_Ext[] value) {
      __getInternalInterface().setFieldValue(SOFTWARNINGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.ECFMessageStatus_Ext value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubCategoryCode field.
     */
    public void setSubCategoryCode(typekey.ECFClaimSubCatCode_Ext value) {
      __getInternalInterface().setFieldValue(SUBCATEGORYCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.LMMessage_Ext value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Suspended field.
     */
    public void setSuspended(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SUSPENDED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TR field.
     */
    public void setTR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransactionSequence field.
     */
    public void setTransactionSequence(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TRANSACTIONSEQUENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransactionStatus field.
     */
    public void setTransactionStatus(typekey.ECFTransactionStatus_Ext value) {
      __getInternalInterface().setFieldValue(TRANSACTIONSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransactionType field.
     */
    public void setTransactionType(typekey.ECFClaimTransactionType_Ext value) {
      __getInternalInterface().setFieldValue(TRANSACTIONTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TriageCategory field.
     */
    public void setTriageCategory(typekey.ECFTriageCode_Ext value) {
      __getInternalInterface().setFieldValue(TRIAGECATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UCR field.
     */
    public void setUCR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UCR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UMR field.
     */
    public void setUMR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UMR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UUID field.
     */
    public void setUUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UnderwritingYear field.
     */
    public void setUnderwritingYear(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(UNDERWRITINGYEAR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidationErrorCode field.
     */
    public void setValidationErrorCode(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(VALIDATIONERRORCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidationFailureReason field.
     */
    public void setValidationFailureReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VALIDATIONFAILUREREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the XcsToAgreeIndicator field.
     */
    public void setXcsToAgreeIndicator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(XCSTOAGREEINDICATOR_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.assignment.AssignablePublicMethods", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("gw.cc.assignment.entity.CCAssignable", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ECFMessageClaimData_Ext.class, config);
    com.guidewire._generated.entity.ECFMessageClaimData_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ECFMessageClaimData_Ext, com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageClaimData_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal getInternalInterface(entity.ECFMessageClaimData_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ECFMessageClaimData_Ext newEmptyInstance() {
        return new entity.ECFMessageClaimData_Ext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}