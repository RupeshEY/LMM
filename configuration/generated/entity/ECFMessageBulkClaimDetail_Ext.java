package entity;

/**
 * ECFMessageBulkClaimDetail_Ext
 * ECF Message Claim Notify Request Carrier
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageBulkClaimDetail_Ext.eti;ECFMessageBulkClaimDetail_Ext.eix;ECFMessageBulkClaimDetail_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ECFMessageBulkClaimDetail_Ext")
public class ECFMessageBulkClaimDetail_Ext extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageBulkClaimDetail_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageBulkClaimDetail_Ext>("entity.ECFMessageBulkClaimDetail_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKCLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkClaim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPONENTLINENO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ComponentLineNo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> IMPORTEDSERVICESAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "ImportedServicesAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPORTEDSERVICESAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImportedServicesAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> IMPORTEDSERVICESAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ImportedServicesAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPORTEDSERVICESNARRATIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImportedServicesNarrative");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> INCURREDAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "IncurredAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCURREDAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncurredAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> INCURREDAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "IncurredAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> OUTSTANDINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "OutstandingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OUTSTANDINGAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OutstandingAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OUTSTANDINGAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OutstandingAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> PAIDTHISTIMEAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "PaidThisTimeAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAIDTHISTIMEAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PaidThisTimeAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAIDTHISTIMEAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaidThisTimeAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> PREVIOUSLYPAIDAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "PreviouslyPaidAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREVIOUSLYPAIDAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PreviouslyPaidAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PREVIOUSLYPAIDAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PreviouslyPaidAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> SETTLEMENTAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "SettlementAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEMENTAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettlementAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementAmount_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMENTCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettlementCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> VATAMOUNT_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "VatAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VATAMOUNT_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VatAmount_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VATAMOUNT_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VatAmount_cur");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ECFMessageBulkClaimDetail_Ext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ECFMessageBulkClaimDetail_Ext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ECFMessageBulkClaimDetail_Ext(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Gets the value of the BulkClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBulkClaim_Ext getBulkClaim() {
    return (entity.ECFMessageBulkClaim_Ext)__getInternalInterface().getFieldValue(BULKCLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ComponentLineNo field.
   * The component line number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getComponentLineNo() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(COMPONENTLINENO_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the ImportedServicesAmount field.
   * The component claim imported services amount in original currency
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
   * Free format narrative to support the component claim imported services amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get());
  }
  
  /**
   * Gets the value of the IncurredAmount field.
   * 100 % incurred amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getIncurredAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(INCURREDAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the IncurredAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIncurredAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(INCURREDAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the IncurredAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getIncurredAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(INCURREDAMOUNT_CUR_PROP.get());
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
   * Gets the value of the OutstandingAmount field.
   * 100 % outstanding amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the OutstandingAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the PaidThisTimeAmount field.
   * 100 % paid this time amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidThisTimeAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the PaidThisTimeAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidThisTimeAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the PaidThisTimeAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidThisTimeAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_CUR_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaidAmount field.
   * 100% previously paid amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPreviouslyPaidAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaidAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPreviouslyPaidAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the PreviouslyPaidAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPreviouslyPaidAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_CUR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * The 100% settlement amount in settlement currency for the component claim
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
   * Gets the value of the SettlementCurrency field.
   * The target currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTCURRENCY_PROP.get());
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
   * Gets the value of the VatAmount field.
   * The VAT amount which is included in the settlement amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVatAmount() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(VATAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the VatAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVatAmount_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(VATAMOUNT_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the VatAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVatAmount_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(VATAMOUNT_CUR_PROP.get());
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
   * Sets the value of the BulkClaim field.
   */
  public void setBulkClaim(entity.ECFMessageBulkClaim_Ext value) {
    __getInternalInterface().setFieldValue(BULKCLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ComponentLineNo field.
   */
  public void setComponentLineNo(java.lang.Long value) {
    __getInternalInterface().setFieldValue(COMPONENTLINENO_PROP.get(), value);
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
   * Sets the value of the IncurredAmount field.
   */
  public void setIncurredAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(INCURREDAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncurredAmount_amt field.
   */
  private void setIncurredAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(INCURREDAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncurredAmount_cur field.
   */
  private void setIncurredAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(INCURREDAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
   * Sets the value of the OutstandingAmount field.
   */
  public void setOutstandingAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingAmount_amt field.
   */
  private void setOutstandingAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OutstandingAmount_cur field.
   */
  private void setOutstandingAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidThisTimeAmount field.
   */
  public void setPaidThisTimeAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidThisTimeAmount_amt field.
   */
  private void setPaidThisTimeAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidThisTimeAmount_cur field.
   */
  private void setPaidThisTimeAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaidAmount field.
   */
  public void setPreviouslyPaidAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaidAmount_amt field.
   */
  private void setPreviouslyPaidAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviouslyPaidAmount_cur field.
   */
  private void setPreviouslyPaidAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_CUR_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
   * Sets the value of the SettlementCurrency field.
   */
  public void setSettlementCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(SETTLEMENTCURRENCY_PROP.get(), value);
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
   * Sets the value of the VatAmount field.
   */
  public void setVatAmount(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(VATAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VatAmount_amt field.
   */
  private void setVatAmount_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(VATAMOUNT_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VatAmount_cur field.
   */
  private void setVatAmount_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(VATAMOUNT_CUR_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ECFMessageBulkClaimDetail_Ext.this.__getDelegateManager();
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
     * Gets the value of the BulkClaim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageBulkClaim_Ext getBulkClaim() {
      return (entity.ECFMessageBulkClaim_Ext)__getInternalInterface().getFieldValue(BULKCLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKCLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ComponentLineNo field.
     * The component line number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getComponentLineNo() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(COMPONENTLINENO_PROP.get());
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
     * The component claim imported services amount in original currency
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
     * Free format narrative to support the component claim imported services amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getImportedServicesNarrative() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMPORTEDSERVICESNARRATIVE_PROP.get());
    }
    
    /**
     * Gets the value of the IncurredAmount field.
     * 100 % incurred amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getIncurredAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(INCURREDAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the IncurredAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getIncurredAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(INCURREDAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the IncurredAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getIncurredAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(INCURREDAMOUNT_CUR_PROP.get());
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
     * Gets the value of the OutstandingAmount field.
     * 100 % outstanding amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getOutstandingAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOutstandingAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the OutstandingAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getOutstandingAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(OUTSTANDINGAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the PaidThisTimeAmount field.
     * 100 % paid this time amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getPaidThisTimeAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the PaidThisTimeAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPaidThisTimeAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the PaidThisTimeAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getPaidThisTimeAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PAIDTHISTIMEAMOUNT_CUR_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaidAmount field.
     * 100% previously paid amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getPreviouslyPaidAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaidAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPreviouslyPaidAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the PreviouslyPaidAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getPreviouslyPaidAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PREVIOUSLYPAIDAMOUNT_CUR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the SettlementAmount field.
     * The 100% settlement amount in settlement currency for the component claim
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
     * Gets the value of the SettlementCurrency field.
     * The target currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getSettlementCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(SETTLEMENTCURRENCY_PROP.get());
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
     * Gets the value of the VatAmount field.
     * The VAT amount which is included in the settlement amount in original currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getVatAmount() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(VATAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the VatAmount_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getVatAmount_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(VATAMOUNT_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the VatAmount_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getVatAmount_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(VATAMOUNT_CUR_PROP.get());
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
     * Sets the value of the BulkClaim field.
     */
    public void setBulkClaim(entity.ECFMessageBulkClaim_Ext value) {
      __getInternalInterface().setFieldValue(BULKCLAIM_PROP.get(), value);
    }
    
    public void setBulkClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKCLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ComponentLineNo field.
     */
    public void setComponentLineNo(java.lang.Long value) {
      __getInternalInterface().setFieldValue(COMPONENTLINENO_PROP.get(), value);
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
     * Sets the value of the IncurredAmount field.
     */
    public void setIncurredAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(INCURREDAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncurredAmount_amt field.
     */
    public void setIncurredAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(INCURREDAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncurredAmount_cur field.
     */
    public void setIncurredAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(INCURREDAMOUNT_CUR_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
     * Sets the value of the OutstandingAmount field.
     */
    public void setOutstandingAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingAmount_amt field.
     */
    public void setOutstandingAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OutstandingAmount_cur field.
     */
    public void setOutstandingAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(OUTSTANDINGAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidThisTimeAmount field.
     */
    public void setPaidThisTimeAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidThisTimeAmount_amt field.
     */
    public void setPaidThisTimeAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidThisTimeAmount_cur field.
     */
    public void setPaidThisTimeAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PAIDTHISTIMEAMOUNT_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaidAmount field.
     */
    public void setPreviouslyPaidAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaidAmount_amt field.
     */
    public void setPreviouslyPaidAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviouslyPaidAmount_cur field.
     */
    public void setPreviouslyPaidAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PREVIOUSLYPAIDAMOUNT_CUR_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
     * Sets the value of the SettlementCurrency field.
     */
    public void setSettlementCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(SETTLEMENTCURRENCY_PROP.get(), value);
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
     * Sets the value of the VatAmount field.
     */
    public void setVatAmount(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(VATAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VatAmount_amt field.
     */
    public void setVatAmount_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(VATAMOUNT_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VatAmount_cur field.
     */
    public void setVatAmount_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(VATAMOUNT_CUR_PROP.get(), value);
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
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ECFMessageBulkClaimDetail_Ext.class, config);
    com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ECFMessageBulkClaimDetail_Ext, com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageBulkClaimDetail_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageBulkClaimDetail_ExtInternal getInternalInterface(entity.ECFMessageBulkClaimDetail_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ECFMessageBulkClaimDetail_Ext newEmptyInstance() {
        return new entity.ECFMessageBulkClaimDetail_Ext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}