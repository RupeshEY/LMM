package entity;

/**
 * ECFMessageClaimDataFinancial_Ext
 * ECF Message Claim Data Financials
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataFinancial_Ext.eti;ECFMessageClaimDataFinancial_Ext.eix;ECFMessageClaimDataFinancial_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ECFMessageClaimDataFinancial_Ext")
public class ECFMessageClaimDataFinancial_Ext extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageClaimDataFinancial_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageClaimDataFinancial_Ext>("entity.ECFMessageClaimDataFinancial_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> AGREEDNOTSETTLED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "AgreedNotSettled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGREEDNOTSETTLED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AgreedNotSettled_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGREEDNOTSETTLED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AgreedNotSettled_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CLAIMAGREEDNOTSETTLED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ClaimAgreedNotSettled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAGREEDNOTSETTLED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAgreedNotSettled_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMAGREEDNOTSETTLED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimAgreedNotSettled_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CLAIMLASTPAID_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ClaimLastPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMLASTPAID_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimLastPaid_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMLASTPAID_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimLastPaid_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CURRENTAGREEDED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "CurrentAgreeded");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTAGREEDED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentAgreeded_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENTAGREEDED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CurrentAgreeded_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CURRENTCOSTSFORCONTRACT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "CurrentCostsForContract");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTCOSTSFORCONTRACT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentCostsForContract_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENTCOSTSFORCONTRACT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CurrentCostsForContract_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CURRENTLOSSESFORCONTRACT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "CurrentLossesForContract");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTLOSSESFORCONTRACT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentLossesForContract_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENTLOSSESFORCONTRACT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CurrentLossesForContract_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> CURRENTPAID_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "CurrentPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTPAID_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentPaid_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENTPAID_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CurrentPaid_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ECFMSG_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ECFMsg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCHANGERATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExchangeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> FGUAMOUNTINCURRED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "FguAmountIncurred");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FGUAMOUNTINCURRED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FguAmountIncurred_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FGUAMOUNTINCURRED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FguAmountIncurred_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FGUNARRATIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FguNarrative");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> FULLCOSTSPAIDBEFORETENT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "FullCostsPaidBefoRetent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FULLCOSTSPAIDBEFORETENT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FullCostsPaidBefoRetent_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FULLCOSTSPAIDBEFORETENT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FullCostsPaidBefoRetent_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> IMPORTEDSERVICESAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ImportedServicesAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPORTEDSERVICESAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImportedServicesAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> IMPORTEDSERVICESAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ImportedServicesAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPORTEDSERVICESNARRATIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImportedServicesNarrative");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> INCURRED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "Incurred");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCURRED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Incurred_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> INCURRED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Incurred_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> LEADRESERVEAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "LeadReserveAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEADRESERVEAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LeadReserveAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LEADRESERVEAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LeadReserveAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> LEADRESERVEFEES_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "LeadReserveFees");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEADRESERVEFEES_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LeadReserveFees_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LEADRESERVEFEES_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LeadReserveFees_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> LETTEROFCREDITAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "LetterOfCreditAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LETTEROFCREDITAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LetterOfCreditAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LETTEROFCREDITAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LetterOfCreditAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LETTEROFCREDITREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LetterOfCreditReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> LOSSANDEXPENSESINCURRED_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "LossAndExpensesIncurred");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSANDEXPENSESINCURRED_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossAndExpensesIncurred_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSANDEXPENSESINCURRED_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossAndExpensesIncurred_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> OUTSTANDING_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "Outstanding");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> OUTSTANDINGLOSSPLUS_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "OutstandingLossPlus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OUTSTANDINGLOSSPLUS_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OutstandingLossPlus_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OUTSTANDINGLOSSPLUS_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OutstandingLossPlus_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OUTSTANDING_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Outstanding_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OUTSTANDING_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Outstanding_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> PREVIOUSLYPAID_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "PreviouslyPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREVIOUSLYPAID_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PreviouslyPaid_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PREVIOUSLYPAID_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PreviouslyPaid_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> PROFADVISORFEESCURPAYMENT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ProfAdvisorFeesCurPayment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFADVISORFEESCURPAYMENT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfAdvisorFeesCurPayment_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROFADVISORFEESCURPAYMENT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ProfAdvisorFeesCurPayment_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> PROFADVISORFEESOUTSTANDING_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ProfAdvisorFeesOutstanding");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFADVISORFEESOUTSTANDING_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfAdvisorFeesOutstanding_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROFADVISORFEESOUTSTANDING_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ProfAdvisorFeesOutstanding_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> REINSUREDRELEASEDAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ReinsuredReleasedAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSUREDRELEASEDAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsuredReleasedAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REINSUREDRELEASEDAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReinsuredReleasedAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> REINSUREDRETAINEDAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ReinsuredRetainedAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSUREDRETAINEDAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsuredRetainedAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REINSUREDRETAINEDAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReinsuredRetainedAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> REINSUREDRETAINEDINTEREST_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ReinsuredRetainedInterest");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSUREDRETAINEDINTEREST_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsuredRetainedInterest_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REINSUREDRETAINEDINTEREST_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReinsuredRetainedInterest_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> SETTLEMENTAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "SettlementAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEMENTAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettlementAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> SETTLEMENTTAX_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "SettlementTax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEMENTTAX_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettlementTax_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTTAX_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementTax_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> SETTLEMENTVAT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "SettlementVat");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEMENTVAT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettlementVat_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTVAT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementVat_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> VAT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "Vat");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VAT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Vat_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VAT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Vat_cur");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ECFMessageClaimDataFinancial_Ext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ECFMessageClaimDataFinancial_Ext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ECFMessageClaimDataFinancial_Ext(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AgreedNotSettled field.
   * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getAgreedNotSettled() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_PROP.get());
  }
  
  /**
   * Gets the value of the AgreedNotSettled_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAgreedNotSettled_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the AgreedNotSettled_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getAgreedNotSettled_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_CUR_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ClaimAgreedNotSettled field.
   * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getClaimAgreedNotSettled() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgreedNotSettled_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimAgreedNotSettled_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgreedNotSettled_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimAgreedNotSettled_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimLastPaid field.
   * The Previously Paid amount on a binder claim (For agreement only) at claim level. Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getClaimLastPaid() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CLAIMLASTPAID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimLastPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimLastPaid_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CLAIMLASTPAID_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimLastPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimLastPaid_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMLASTPAID_CUR_PROP.get());
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
  
  /**
   * Gets the value of the Currency field.
   * Reference Currency i.e. Original Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentAgreeded field.
   * The amount to be agreed this time on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentAgreeded() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTAGREEDED_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentAgreeded_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentAgreeded_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTAGREEDED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentAgreeded_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentAgreeded_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTAGREEDED_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentCostsForContract field.
   * The amount now payable in respect of losses and expenses as reported in the current claim movement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentCostsForContract() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentCostsForContract_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentCostsForContract_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentCostsForContract_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentCostsForContract_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentLossesForContract field.
   * The amount now payable in respect of losses as reported in the current claim movement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentLossesForContract() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentLossesForContract_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentLossesForContract_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentLossesForContract_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentLossesForContract_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentPaid field.
   * The amount to be Paid This Time on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentPaid() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTPAID_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentPaid_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTPAID_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentPaid_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTPAID_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ECFMsg field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMsg() {
    return (entity.ECFMessageClaimData_Ext)__getInternalInterface().getFieldValue(ECFMSG_PROP.get());
  }
  
  /**
   * Gets the value of the ExchangeRate field.
   * The rate of exchange
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExchangeRate() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(EXCHANGERATE_PROP.get());
  }
  
  /**
   * Gets the value of the FguAmountIncurred field.
   * The ISO (International standards organisation) coded identification of the currency in which all claim amounts for a contract are reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getFguAmountIncurred() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_PROP.get());
  }
  
  /**
   * Gets the value of the FguAmountIncurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFguAmountIncurred_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the FguAmountIncurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getFguAmountIncurred_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the FguNarrative field.
   * Description of the current estimate for the claim from the ground up (i.e. the expected final total amount that will be paid for the claim overall)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFguNarrative() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FGUNARRATIVE_PROP.get());
  }
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent field.
   * The paid loss plus expense for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getFullCostsPaidBefoRetent() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_PROP.get());
  }
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFullCostsPaidBefoRetent_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getFullCostsPaidBefoRetent_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_CUR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the ImportedServicesAmount field.
   * The amount of Imported Services that is included in the settlement amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ImportedServicesAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ImportedServicesAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ImportedServicesNarrative field.
   * Explanation of the Imported Services amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get());
  }
  
  /**
   * Gets the value of the Incurred field.
   * The Incurred amount  on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getIncurred() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(INCURRED_PROP.get());
  }
  
  /**
   * Gets the value of the Incurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIncurred_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(INCURRED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the Incurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getIncurred_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(INCURRED_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveAmount field.
   * The amount of reserve recommended by the Leader, in original currency, not including any outstanding fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveFees field.
   * The amount of reserve for fees recommended by the Leader, in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveFees() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LEADRESERVEFEES_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveFees_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveFees_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LEADRESERVEFEES_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the LeadReserveFees_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveFees_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(LEADRESERVEFEES_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the LetterOfCreditAmount field.
   * Letter of Credit Amount (in Settlement Currency). 100% amount is shown
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLetterOfCreditAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the LetterOfCreditAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLetterOfCreditAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the LetterOfCreditAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLetterOfCreditAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the LetterOfCreditReference field.
   * The reference identifying a Letter of Credit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLetterOfCreditReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LETTEROFCREDITREFERENCE_PROP.get());
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
   * Gets the value of the LossAndExpensesIncurred field.
   * Total paid and outstanding loss amount (excluding expenses) from Zero for this claim to the Insured including claims under all policies from anyone and uninsured amounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLossAndExpensesIncurred() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_PROP.get());
  }
  
  /**
   * Gets the value of the LossAndExpensesIncurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLossAndExpensesIncurred_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the LossAndExpensesIncurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLossAndExpensesIncurred_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the Outstanding field.
   * The outstanding amount on a binder claim (For agreement  only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstanding() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDING_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingLossPlus field.
   * The loss plus expense incurred for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration. The incurred amount under the contract as at a certain date is the sum of the the total paid amount and the oustanding claim amount as at the same date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingLossPlus() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingLossPlus_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingLossPlus_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingLossPlus_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingLossPlus_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the Outstanding_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstanding_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDING_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the Outstanding_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstanding_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDING_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaid field.
   * The Previously Paid amount on a binder claim (For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPreviouslyPaid() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPreviouslyPaid_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPreviouslyPaid_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to Fees, expressed as 100% amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getProfAdvisorFeesCurPayment() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getProfAdvisorFeesCurPayment_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getProfAdvisorFeesCurPayment_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding field.
   * The outstanding fees in original currency (also included in the outstanding)’: i.e. the overall Outstanding Amount (Orig Ccy) will include this amount as well as indemnity amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getProfAdvisorFeesOutstanding() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getProfAdvisorFeesOutstanding_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getProfAdvisorFeesOutstanding_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_CUR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReinsuredReleasedAmount field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve released by a reinsured, expressed as 100% figure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredReleasedAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredReleasedAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredReleasedAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredReleasedAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredReleasedAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedAmount field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve retained by a reinsured, expressed as 100%
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredRetainedAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredRetainedAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredRetainedAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedInterest field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to interest on the reserve retained by a reinsured, expressed as 100%
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredRetainedInterest() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedInterest_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredRetainedInterest_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuredRetainedInterest_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredRetainedInterest_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_CUR_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementAmount field.
   * The 100% settlement amount in settlement currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementTax field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to tax (other than VAT). Expressed as 100% figure
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementTax() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTTAX_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementTax_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementTax_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTTAX_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementTax_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementTax_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTTAX_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementVat field.
   * The calculated VAT amount to be paid on the claim. Included in the Settlement Amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementVat() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTVAT_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementVat_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementVat_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTVAT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the SettlementVat_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementVat_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTVAT_CUR_PROP.get());
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
  
  /**
   * Gets the value of the Vat field.
   * The VAT amount on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVat() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(VAT_PROP.get());
  }
  
  /**
   * Gets the value of the Vat_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVat_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(VAT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the Vat_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVat_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(VAT_CUR_PROP.get());
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
   * Sets the value of the AgreedNotSettled field.
   */
  public void setAgreedNotSettled(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgreedNotSettled_amt field.
   */
  private void setAgreedNotSettled_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgreedNotSettled_cur field.
   */
  private void setAgreedNotSettled_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgreedNotSettled field.
   */
  public void setClaimAgreedNotSettled(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgreedNotSettled_amt field.
   */
  private void setClaimAgreedNotSettled_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgreedNotSettled_cur field.
   */
  private void setClaimAgreedNotSettled_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLastPaid field.
   */
  public void setClaimLastPaid(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CLAIMLASTPAID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLastPaid_amt field.
   */
  private void setClaimLastPaid_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CLAIMLASTPAID_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLastPaid_cur field.
   */
  private void setClaimLastPaid_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CLAIMLASTPAID_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentAgreeded field.
   */
  public void setCurrentAgreeded(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CURRENTAGREEDED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentAgreeded_amt field.
   */
  private void setCurrentAgreeded_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CURRENTAGREEDED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentAgreeded_cur field.
   */
  private void setCurrentAgreeded_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENTAGREEDED_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentCostsForContract field.
   */
  public void setCurrentCostsForContract(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentCostsForContract_amt field.
   */
  private void setCurrentCostsForContract_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentCostsForContract_cur field.
   */
  private void setCurrentCostsForContract_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentLossesForContract field.
   */
  public void setCurrentLossesForContract(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentLossesForContract_amt field.
   */
  private void setCurrentLossesForContract_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentLossesForContract_cur field.
   */
  private void setCurrentLossesForContract_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentPaid field.
   */
  public void setCurrentPaid(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(CURRENTPAID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentPaid_amt field.
   */
  private void setCurrentPaid_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CURRENTPAID_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentPaid_cur field.
   */
  private void setCurrentPaid_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENTPAID_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFMsg field.
   */
  public void setECFMsg(entity.ECFMessageClaimData_Ext value) {
    __getInternalInterface().setFieldValue(ECFMSG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExchangeRate field.
   */
  public void setExchangeRate(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(EXCHANGERATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FguAmountIncurred field.
   */
  public void setFguAmountIncurred(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FguAmountIncurred_amt field.
   */
  private void setFguAmountIncurred_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FguAmountIncurred_cur field.
   */
  private void setFguAmountIncurred_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FguNarrative field.
   */
  public void setFguNarrative(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FGUNARRATIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent field.
   */
  public void setFullCostsPaidBefoRetent(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent_amt field.
   */
  private void setFullCostsPaidBefoRetent_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent_cur field.
   */
  private void setFullCostsPaidBefoRetent_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportedServicesAmount field.
   */
  public void setImportedServicesAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportedServicesAmount_amt field.
   */
  private void setImportedServicesAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportedServicesAmount_cur field.
   */
  private void setImportedServicesAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportedServicesNarrative field.
   */
  public void setImportedServicesNarrative(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incurred field.
   */
  public void setIncurred(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(INCURRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incurred_amt field.
   */
  private void setIncurred_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(INCURRED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incurred_cur field.
   */
  private void setIncurred_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(INCURRED_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveAmount field.
   */
  public void setLeadReserveAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveAmount_amt field.
   */
  private void setLeadReserveAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveAmount_cur field.
   */
  private void setLeadReserveAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveFees field.
   */
  public void setLeadReserveFees(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(LEADRESERVEFEES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveFees_amt field.
   */
  private void setLeadReserveFees_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LEADRESERVEFEES_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeadReserveFees_cur field.
   */
  private void setLeadReserveFees_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(LEADRESERVEFEES_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LetterOfCreditAmount field.
   */
  public void setLetterOfCreditAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LetterOfCreditAmount_amt field.
   */
  private void setLetterOfCreditAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LetterOfCreditAmount_cur field.
   */
  private void setLetterOfCreditAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LetterOfCreditReference field.
   */
  public void setLetterOfCreditReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LETTEROFCREDITREFERENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossAndExpensesIncurred field.
   */
  public void setLossAndExpensesIncurred(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossAndExpensesIncurred_amt field.
   */
  private void setLossAndExpensesIncurred_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossAndExpensesIncurred_cur field.
   */
  private void setLossAndExpensesIncurred_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_CUR_PROP.get(), value);
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
   * Sets the value of the Outstanding field.
   */
  public void setOutstanding(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(OUTSTANDING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingLossPlus field.
   */
  public void setOutstandingLossPlus(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingLossPlus_amt field.
   */
  private void setOutstandingLossPlus_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingLossPlus_cur field.
   */
  private void setOutstandingLossPlus_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Outstanding_amt field.
   */
  private void setOutstanding_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OUTSTANDING_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Outstanding_cur field.
   */
  private void setOutstanding_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(OUTSTANDING_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaid field.
   */
  public void setPreviouslyPaid(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaid_amt field.
   */
  private void setPreviouslyPaid_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAID_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaid_cur field.
   */
  private void setPreviouslyPaid_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAID_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment field.
   */
  public void setProfAdvisorFeesCurPayment(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment_amt field.
   */
  private void setProfAdvisorFeesCurPayment_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment_cur field.
   */
  private void setProfAdvisorFeesCurPayment_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding field.
   */
  public void setProfAdvisorFeesOutstanding(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding_amt field.
   */
  private void setProfAdvisorFeesOutstanding_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding_cur field.
   */
  private void setProfAdvisorFeesOutstanding_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_CUR_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReinsuredReleasedAmount field.
   */
  public void setReinsuredReleasedAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredReleasedAmount_amt field.
   */
  private void setReinsuredReleasedAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredReleasedAmount_cur field.
   */
  private void setReinsuredReleasedAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedAmount field.
   */
  public void setReinsuredRetainedAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedAmount_amt field.
   */
  private void setReinsuredRetainedAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedAmount_cur field.
   */
  private void setReinsuredRetainedAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedInterest field.
   */
  public void setReinsuredRetainedInterest(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedInterest_amt field.
   */
  private void setReinsuredRetainedInterest_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuredRetainedInterest_cur field.
   */
  private void setReinsuredRetainedInterest_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementAmount field.
   */
  public void setSettlementAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementAmount_amt field.
   */
  private void setSettlementAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementAmount_cur field.
   */
  private void setSettlementAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementTax field.
   */
  public void setSettlementTax(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(SETTLEMENTTAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementTax_amt field.
   */
  private void setSettlementTax_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(SETTLEMENTTAX_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementTax_cur field.
   */
  private void setSettlementTax_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(SETTLEMENTTAX_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementVat field.
   */
  public void setSettlementVat(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(SETTLEMENTVAT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementVat_amt field.
   */
  private void setSettlementVat_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(SETTLEMENTVAT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettlementVat_cur field.
   */
  private void setSettlementVat_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(SETTLEMENTVAT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vat field.
   */
  public void setVat(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(VAT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vat_amt field.
   */
  private void setVat_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(VAT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vat_cur field.
   */
  private void setVat_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(VAT_CUR_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ECFMessageClaimDataFinancial_Ext.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
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
     * Gets the value of the AgreedNotSettled field.
     * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getAgreedNotSettled() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_PROP.get());
    }
    
    /**
     * Gets the value of the AgreedNotSettled_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAgreedNotSettled_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the AgreedNotSettled_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getAgreedNotSettled_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(AGREEDNOTSETTLED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimAgreedNotSettled field.
     * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getClaimAgreedNotSettled() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgreedNotSettled_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getClaimAgreedNotSettled_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgreedNotSettled_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimAgreedNotSettled_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMAGREEDNOTSETTLED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimLastPaid field.
     * The Previously Paid amount on a binder claim (For agreement only) at claim level. Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getClaimLastPaid() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CLAIMLASTPAID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimLastPaid_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getClaimLastPaid_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CLAIMLASTPAID_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimLastPaid_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimLastPaid_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMLASTPAID_CUR_PROP.get());
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
     * Gets the value of the Currency field.
     * Reference Currency i.e. Original Currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentAgreeded field.
     * The amount to be agreed this time on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getCurrentAgreeded() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTAGREEDED_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentAgreeded_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCurrentAgreeded_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTAGREEDED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentAgreeded_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrentAgreeded_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTAGREEDED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentCostsForContract field.
     * The amount now payable in respect of losses and expenses as reported in the current claim movement
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getCurrentCostsForContract() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentCostsForContract_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCurrentCostsForContract_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentCostsForContract_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrentCostsForContract_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTCOSTSFORCONTRACT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentLossesForContract field.
     * The amount now payable in respect of losses as reported in the current claim movement
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getCurrentLossesForContract() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentLossesForContract_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCurrentLossesForContract_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentLossesForContract_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrentLossesForContract_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTLOSSESFORCONTRACT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentPaid field.
     * The amount to be Paid This Time on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getCurrentPaid() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(CURRENTPAID_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentPaid_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCurrentPaid_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CURRENTPAID_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentPaid_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrentPaid_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENTPAID_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ECFMsg field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageClaimData_Ext getECFMsg() {
      return (entity.ECFMessageClaimData_Ext)__getInternalInterface().getFieldValue(ECFMSG_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getECFMsgID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ECFMSG_PROP.get());
    }
    
    /**
     * Gets the value of the ExchangeRate field.
     * The rate of exchange
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getExchangeRate() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(EXCHANGERATE_PROP.get());
    }
    
    /**
     * Gets the value of the FguAmountIncurred field.
     * The ISO (International standards organisation) coded identification of the currency in which all claim amounts for a contract are reported
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getFguAmountIncurred() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_PROP.get());
    }
    
    /**
     * Gets the value of the FguAmountIncurred_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFguAmountIncurred_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the FguAmountIncurred_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getFguAmountIncurred_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(FGUAMOUNTINCURRED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the FguNarrative field.
     * Description of the current estimate for the claim from the ground up (i.e. the expected final total amount that will be paid for the claim overall)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFguNarrative() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FGUNARRATIVE_PROP.get());
    }
    
    /**
     * Gets the value of the FullCostsPaidBefoRetent field.
     * The paid loss plus expense for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getFullCostsPaidBefoRetent() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_PROP.get());
    }
    
    /**
     * Gets the value of the FullCostsPaidBefoRetent_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFullCostsPaidBefoRetent_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the FullCostsPaidBefoRetent_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getFullCostsPaidBefoRetent_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(FULLCOSTSPAIDBEFORETENT_CUR_PROP.get());
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
     * Gets the value of the ImportedServicesAmount field.
     * The amount of Imported Services that is included in the settlement amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getImportedServicesAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ImportedServicesAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getImportedServicesAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ImportedServicesAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getImportedServicesAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(IMPORTEDSERVICESAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ImportedServicesNarrative field.
     * Explanation of the Imported Services amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getImportedServicesNarrative() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get());
    }
    
    /**
     * Gets the value of the Incurred field.
     * The Incurred amount  on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getIncurred() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(INCURRED_PROP.get());
    }
    
    /**
     * Gets the value of the Incurred_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getIncurred_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(INCURRED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the Incurred_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getIncurred_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(INCURRED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveAmount field.
     * The amount of reserve recommended by the Leader, in original currency, not including any outstanding fees
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getLeadReserveAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLeadReserveAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getLeadReserveAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(LEADRESERVEAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveFees field.
     * The amount of reserve for fees recommended by the Leader, in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getLeadReserveFees() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LEADRESERVEFEES_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveFees_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLeadReserveFees_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LEADRESERVEFEES_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the LeadReserveFees_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getLeadReserveFees_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(LEADRESERVEFEES_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the LetterOfCreditAmount field.
     * Letter of Credit Amount (in Settlement Currency). 100% amount is shown
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getLetterOfCreditAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the LetterOfCreditAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLetterOfCreditAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the LetterOfCreditAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getLetterOfCreditAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(LETTEROFCREDITAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the LetterOfCreditReference field.
     * The reference identifying a Letter of Credit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLetterOfCreditReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LETTEROFCREDITREFERENCE_PROP.get());
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
     * Gets the value of the LossAndExpensesIncurred field.
     * Total paid and outstanding loss amount (excluding expenses) from Zero for this claim to the Insured including claims under all policies from anyone and uninsured amounts
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getLossAndExpensesIncurred() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_PROP.get());
    }
    
    /**
     * Gets the value of the LossAndExpensesIncurred_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLossAndExpensesIncurred_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the LossAndExpensesIncurred_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getLossAndExpensesIncurred_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(LOSSANDEXPENSESINCURRED_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the Outstanding field.
     * The outstanding amount on a binder claim (For agreement  only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getOutstanding() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDING_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingLossPlus field.
     * The loss plus expense incurred for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration. The incurred amount under the contract as at a certain date is the sum of the the total paid amount and the oustanding claim amount as at the same date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getOutstandingLossPlus() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingLossPlus_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOutstandingLossPlus_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingLossPlus_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getOutstandingLossPlus_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDINGLOSSPLUS_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the Outstanding_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOutstanding_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDING_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the Outstanding_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getOutstanding_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDING_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaid field.
     * The Previously Paid amount on a binder claim (For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getPreviouslyPaid() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaid_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPreviouslyPaid_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaid_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getPreviouslyPaid_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PREVIOUSLYPAID_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesCurPayment field.
     * The part of the settled amount (in original currency) for the claim transaction that relates to Fees, expressed as 100% amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getProfAdvisorFeesCurPayment() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesCurPayment_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getProfAdvisorFeesCurPayment_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesCurPayment_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getProfAdvisorFeesCurPayment_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PROFADVISORFEESCURPAYMENT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesOutstanding field.
     * The outstanding fees in original currency (also included in the outstanding)’: i.e. the overall Outstanding Amount (Orig Ccy) will include this amount as well as indemnity amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getProfAdvisorFeesOutstanding() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesOutstanding_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getProfAdvisorFeesOutstanding_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ProfAdvisorFeesOutstanding_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getProfAdvisorFeesOutstanding_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PROFADVISORFEESOUTSTANDING_CUR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReinsuredReleasedAmount field.
     * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve released by a reinsured, expressed as 100% figure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getReinsuredReleasedAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredReleasedAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getReinsuredReleasedAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredReleasedAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReinsuredReleasedAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRELEASEDAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedAmount field.
     * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve retained by a reinsured, expressed as 100%
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getReinsuredRetainedAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getReinsuredRetainedAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReinsuredRetainedAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRETAINEDAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedInterest field.
     * The part of the settled amount (in original currency) for the claim transaction that relates to interest on the reserve retained by a reinsured, expressed as 100%
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getReinsuredRetainedInterest() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedInterest_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getReinsuredRetainedInterest_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuredRetainedInterest_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReinsuredRetainedInterest_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(REINSUREDRETAINEDINTEREST_CUR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the SettlementAmount field.
     * The 100% settlement amount in settlement currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getSettlementAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getSettlementAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getSettlementAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementTax field.
     * The part of the settled amount (in original currency) for the claim transaction that relates to tax (other than VAT). Expressed as 100% figure
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getSettlementTax() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTTAX_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementTax_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getSettlementTax_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTTAX_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementTax_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getSettlementTax_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTTAX_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementVat field.
     * The calculated VAT amount to be paid on the claim. Included in the Settlement Amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getSettlementVat() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(SETTLEMENTVAT_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementVat_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getSettlementVat_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SETTLEMENTVAT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the SettlementVat_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getSettlementVat_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTVAT_CUR_PROP.get());
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
    
    /**
     * Gets the value of the Vat field.
     * The VAT amount on a binder claim(For agreement only). Included in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getVat() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(VAT_PROP.get());
    }
    
    /**
     * Gets the value of the Vat_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getVat_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(VAT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the Vat_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getVat_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(VAT_CUR_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AgreedNotSettled field.
     */
    public void setAgreedNotSettled(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgreedNotSettled_amt field.
     */
    public void setAgreedNotSettled_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgreedNotSettled_cur field.
     */
    public void setAgreedNotSettled_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(AGREEDNOTSETTLED_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgreedNotSettled field.
     */
    public void setClaimAgreedNotSettled(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgreedNotSettled_amt field.
     */
    public void setClaimAgreedNotSettled_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgreedNotSettled_cur field.
     */
    public void setClaimAgreedNotSettled_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMAGREEDNOTSETTLED_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLastPaid field.
     */
    public void setClaimLastPaid(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CLAIMLASTPAID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLastPaid_amt field.
     */
    public void setClaimLastPaid_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CLAIMLASTPAID_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLastPaid_cur field.
     */
    public void setClaimLastPaid_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMLASTPAID_CUR_PROP.get(), value);
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
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentAgreeded field.
     */
    public void setCurrentAgreeded(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CURRENTAGREEDED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentAgreeded_amt field.
     */
    public void setCurrentAgreeded_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CURRENTAGREEDED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentAgreeded_cur field.
     */
    public void setCurrentAgreeded_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENTAGREEDED_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentCostsForContract field.
     */
    public void setCurrentCostsForContract(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentCostsForContract_amt field.
     */
    public void setCurrentCostsForContract_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentCostsForContract_cur field.
     */
    public void setCurrentCostsForContract_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENTCOSTSFORCONTRACT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentLossesForContract field.
     */
    public void setCurrentLossesForContract(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentLossesForContract_amt field.
     */
    public void setCurrentLossesForContract_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentLossesForContract_cur field.
     */
    public void setCurrentLossesForContract_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENTLOSSESFORCONTRACT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentPaid field.
     */
    public void setCurrentPaid(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(CURRENTPAID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentPaid_amt field.
     */
    public void setCurrentPaid_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CURRENTPAID_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentPaid_cur field.
     */
    public void setCurrentPaid_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENTPAID_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFMsg field.
     */
    public void setECFMsg(entity.ECFMessageClaimData_Ext value) {
      __getInternalInterface().setFieldValue(ECFMSG_PROP.get(), value);
    }
    
    public void setECFMsgID(gw.pl.persistence.core.Key value) {
      setFieldValue(ECFMSG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExchangeRate field.
     */
    public void setExchangeRate(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(EXCHANGERATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FguAmountIncurred field.
     */
    public void setFguAmountIncurred(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FguAmountIncurred_amt field.
     */
    public void setFguAmountIncurred_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FguAmountIncurred_cur field.
     */
    public void setFguAmountIncurred_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(FGUAMOUNTINCURRED_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FguNarrative field.
     */
    public void setFguNarrative(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FGUNARRATIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullCostsPaidBefoRetent field.
     */
    public void setFullCostsPaidBefoRetent(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullCostsPaidBefoRetent_amt field.
     */
    public void setFullCostsPaidBefoRetent_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullCostsPaidBefoRetent_cur field.
     */
    public void setFullCostsPaidBefoRetent_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(FULLCOSTSPAIDBEFORETENT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportedServicesAmount field.
     */
    public void setImportedServicesAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportedServicesAmount_amt field.
     */
    public void setImportedServicesAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportedServicesAmount_cur field.
     */
    public void setImportedServicesAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(IMPORTEDSERVICESAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportedServicesNarrative field.
     */
    public void setImportedServicesNarrative(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incurred field.
     */
    public void setIncurred(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(INCURRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incurred_amt field.
     */
    public void setIncurred_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(INCURRED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incurred_cur field.
     */
    public void setIncurred_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(INCURRED_CUR_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LeadReserveAmount field.
     */
    public void setLeadReserveAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadReserveAmount_amt field.
     */
    public void setLeadReserveAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadReserveAmount_cur field.
     */
    public void setLeadReserveAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(LEADRESERVEAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadReserveFees field.
     */
    public void setLeadReserveFees(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(LEADRESERVEFEES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadReserveFees_amt field.
     */
    public void setLeadReserveFees_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LEADRESERVEFEES_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LeadReserveFees_cur field.
     */
    public void setLeadReserveFees_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(LEADRESERVEFEES_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LetterOfCreditAmount field.
     */
    public void setLetterOfCreditAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LetterOfCreditAmount_amt field.
     */
    public void setLetterOfCreditAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LetterOfCreditAmount_cur field.
     */
    public void setLetterOfCreditAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(LETTEROFCREDITAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LetterOfCreditReference field.
     */
    public void setLetterOfCreditReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LETTEROFCREDITREFERENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossAndExpensesIncurred field.
     */
    public void setLossAndExpensesIncurred(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossAndExpensesIncurred_amt field.
     */
    public void setLossAndExpensesIncurred_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossAndExpensesIncurred_cur field.
     */
    public void setLossAndExpensesIncurred_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(LOSSANDEXPENSESINCURRED_CUR_PROP.get(), value);
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
     * Sets the value of the Outstanding field.
     */
    public void setOutstanding(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(OUTSTANDING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingLossPlus field.
     */
    public void setOutstandingLossPlus(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingLossPlus_amt field.
     */
    public void setOutstandingLossPlus_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingLossPlus_cur field.
     */
    public void setOutstandingLossPlus_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGLOSSPLUS_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Outstanding_amt field.
     */
    public void setOutstanding_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OUTSTANDING_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Outstanding_cur field.
     */
    public void setOutstanding_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(OUTSTANDING_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaid field.
     */
    public void setPreviouslyPaid(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaid_amt field.
     */
    public void setPreviouslyPaid_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAID_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaid_cur field.
     */
    public void setPreviouslyPaid_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAID_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesCurPayment field.
     */
    public void setProfAdvisorFeesCurPayment(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesCurPayment_amt field.
     */
    public void setProfAdvisorFeesCurPayment_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesCurPayment_cur field.
     */
    public void setProfAdvisorFeesCurPayment_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESCURPAYMENT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesOutstanding field.
     */
    public void setProfAdvisorFeesOutstanding(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesOutstanding_amt field.
     */
    public void setProfAdvisorFeesOutstanding_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfAdvisorFeesOutstanding_cur field.
     */
    public void setProfAdvisorFeesOutstanding_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PROFADVISORFEESOUTSTANDING_CUR_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReinsuredReleasedAmount field.
     */
    public void setReinsuredReleasedAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredReleasedAmount_amt field.
     */
    public void setReinsuredReleasedAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredReleasedAmount_cur field.
     */
    public void setReinsuredReleasedAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(REINSUREDRELEASEDAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedAmount field.
     */
    public void setReinsuredRetainedAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedAmount_amt field.
     */
    public void setReinsuredRetainedAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedAmount_cur field.
     */
    public void setReinsuredRetainedAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedInterest field.
     */
    public void setReinsuredRetainedInterest(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedInterest_amt field.
     */
    public void setReinsuredRetainedInterest_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuredRetainedInterest_cur field.
     */
    public void setReinsuredRetainedInterest_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(REINSUREDRETAINEDINTEREST_CUR_PROP.get(), value);
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
     * Sets the value of the SettlementAmount field.
     */
    public void setSettlementAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementAmount_amt field.
     */
    public void setSettlementAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementAmount_cur field.
     */
    public void setSettlementAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(SETTLEMENTAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementTax field.
     */
    public void setSettlementTax(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(SETTLEMENTTAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementTax_amt field.
     */
    public void setSettlementTax_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(SETTLEMENTTAX_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementTax_cur field.
     */
    public void setSettlementTax_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(SETTLEMENTTAX_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementVat field.
     */
    public void setSettlementVat(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(SETTLEMENTVAT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementVat_amt field.
     */
    public void setSettlementVat_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(SETTLEMENTVAT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettlementVat_cur field.
     */
    public void setSettlementVat_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(SETTLEMENTVAT_CUR_PROP.get(), value);
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
     * Sets the value of the Vat field.
     */
    public void setVat(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(VAT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Vat_amt field.
     */
    public void setVat_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(VAT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Vat_cur field.
     */
    public void setVat_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(VAT_CUR_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ECFMessageClaimDataFinancial_Ext.class, config);
    com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ECFMessageClaimDataFinancial_Ext, com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageClaimDataFinancial_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageClaimDataFinancial_ExtInternal getInternalInterface(entity.ECFMessageClaimDataFinancial_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ECFMessageClaimDataFinancial_Ext newEmptyInstance() {
        return new entity.ECFMessageClaimDataFinancial_Ext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}