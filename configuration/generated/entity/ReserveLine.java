package entity;

/**
 * ReserveLine
 * 
 *       A combination of Claim, Exposure, CostType, and CostCategory, used to categorize every Transaction on a claim.
 *       Every Transaction has a ReserveLine. Claim is required, as all Transactions must be associated with a Claim.
 *       Exposure can be NULL, in which case the Transaction and ReserveLine are "Claim-level". CostType and CostCategory
 *       are typelists that contain values for categorizing Transactions, which can be configured for the customer's needs.
 *       CostType and CostCategory cannot be NULL, but each has an Unspecified value (which may be removed during configuration).
 *       <p>Every Transaction either increases or depletes reserves on a ReserveLine. Given the flexibility of Exposure being
 *       null, and the two typelists being configurable, customers can track their Transactions according to their needs: all
 *       Reserves and Payments could occur at the claim-level, or they could be categorized by exposure, CostType ("ClaimCost",
 *       "A & O" adjusting expenses, etc) and CostCategory (Auto body repair, Legal, Vehicle Inspection, etc). Only certain
 *       combinations of Exposure coverage type, CostType, and CostCategory are valid, as defined in the CostCategory.xml
 *       typelist file.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReserveLine.eti;ReserveLine.eix;ReserveLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ReserveLine")
public class ReserveLine extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.TAccountOwnerDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ReserveLine> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ReserveLine>("entity.ReserveLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RICODINGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RICodings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RECOVERYCODINGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RecoveryCodings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TACCOUNTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TAccounts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Transactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ReserveLineInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ReserveLine()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ReserveLine(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ReserveLine(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ReserveLineInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ReserveLineInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToRICodings(entity.RICoding element) {
    __getInternalInterface().addArrayElement(RICODINGS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RecoveryCodings array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToRecoveryCodings(entity.RecoveryCoding element) {
    __getInternalInterface().addArrayElement(RECOVERYCODINGS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the TAccounts array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToTAccounts(entity.TAccount element) {
    __getInternalInterface().addArrayElement(TACCOUNTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToTransactions(entity.Transaction element) {
    __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
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
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the CostCategory field.
   * The costcategory for this transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory() {
    return (typekey.CostCategory)__getInternalInterface().getFieldValue(COSTCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the CostType field.
   * Type of cost (for example, LAE or claim cost).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType() {
    return (typekey.CostType)__getInternalInterface().getFieldValue(COSTTYPE_PROP.get());
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
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the <code>Payment</code> objects for this reserveline.
   * You can choose to get either all the payments or only the new and modified payments.  If you choose to get all the
   * <code>Payment</code> objects, then <code>Payment</code> objects in the current transaction are not be
   * returned by the <code>Iterator</code>. This method is a much more efficient alternative to calling {@link #getTransactions()}
   * and iterating through all the transactions to find just the desired <code>Payment</code> objects.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be
   * in the same bundle as this <code>ReserveLine</code>, and their bundle may not be editable. To edit the beans, you
   * should add them to an editable bundle first.
   * </p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Payment</code> objects for this reserveline are
   * returned.  This includes payments for which only the line items were modified.  Otherwise,
   * if <code>false</code> then all <code>Payment</code> objects for the reserveline are returned, including
   * new and modified <code>Payment</code> objects, but excluding deleted <code>Payment</code> objects.
   * @return an <code>Iterator</code> that returns <code>Payment</code> objects.
   */
  public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).getPaymentsIterator(newAndModifiedOnly);
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
  public entity.RICoding[] getRICodings() {
    return (entity.RICoding[])__getInternalInterface().getFieldValue(RICODINGS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryCoding[] getRecoveryCodings() {
    return (entity.RecoveryCoding[])__getInternalInterface().getFieldValue(RECOVERYCODINGS_PROP.get());
  }
  
  /**
   * Gets the value of the ReservingCurrency field.
   * Reserving Currency of this ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount[] getTAccounts() {
    return (entity.TAccount[])__getInternalInterface().getFieldValue(TACCOUNTS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions() {
    return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the transactions for this reserveline.  This is a more efficient
   * alternative to calling {@link #getTransactions()}, particularly if you are only interested in new or modified
   * transactions.  You can use this method to retrieve all the <code>Transaction</code> objects or only the new and modified objects.
   * If you choose to retrieve all the <code>Transaction</code> objects then, those transactions that were removed
   * in the current transaction are not be returned by the <code>Iterator</code>.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, there is no guarantee that the beans returned by this
   * iterator may not be in the same bundle as this <code>ReserveLine</code>, and their bundle may not be editable.
   * To edit the beans, you should add them to an editable bundle first.</p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified transactions for this reserveline are
   *                           returned.  This includes transactions for which only the line items were modified.  Otherwise,
   *                           if <code>false</code> then the method returns all transactions for the reserveline, including
   *                           new and modified <code>Transaction</code> objects, but excluding deleted transactions.
   * @return an Iterator that returns transactions.
   */
  public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).getTransactionsIterator(newAndModifiedOnly);
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getawserodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("awserodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getawsnonerodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("awsnonerodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcashin() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cashin"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcashout() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cashout"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcededreservesout() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cededreservesout"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getclaimexpenses() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("claimexpenses"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcmtdadjcededres() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cmtdadjcededres"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcmtdadjrecoverable() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cmtdadjrecoverable"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcmtdnonadjcededres() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cmtdnonadjcededres"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcmtdnonadjrecoverable() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("cmtdnonadjrecoverable"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcommittederodepmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("committederodepmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getcommittednonerodepmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("committednonerodepmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getdraftpayments() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("draftpayments"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount geterodingforexchange() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("erodingforexchange"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getfutureerodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("futureerodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getfuturenonerodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("futurenonerodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getnonerodingforexchange() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("nonerodingforexchange"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendapperodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendapperodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendappnonerodingpmts() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendappnonerodingpmts"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingapprecoveries() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingapprecoveries"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingapprecreserves() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingapprecreserves"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingappreserves() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingappreserves"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingcashout() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingcashout"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingexpense() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingexpense"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getpendingreserves() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("pendingreserves"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getrecoverablesout() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("recoverablesout"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getrecoveries() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("recoveries"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getrecoveryreserves() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("recoveryreserves"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getreserves() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("reserves"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getstagingcashin() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("stagingcashin"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getstagingcashout() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("stagingcashout"));
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getstagingexpenses() {
    return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("stagingexpenses"));
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
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(entity.RICoding element) {
    __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryCodings(entity.RecoveryCoding element) {
    __getInternalInterface().removeArrayElement(RECOVERYCODINGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryCodings(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RECOVERYCODINGS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromTAccounts(entity.TAccount element) {
    __getInternalInterface().removeArrayElement(TACCOUNTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTAccounts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TACCOUNTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(entity.Transaction element) {
    __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the available reserves for this reserve line to the given amount by creating
   * a reserve that increases or decreases the currently available reserves.
   * 
   * This method creates a new ReserveSet and Reserve transaction with the amount necessary to get the AvailableReserves
   * for this ReserveLine to equal the newReserveAmount.
   * This transaction amount might be positive if an increase is needed or negative if a decrease is needed.
   * The ReserveSet is not run through pre-setup rules and is immediately submitted for approval.
   * Unlike setting reserves in the UI, this method ignores any Reserve transactions on this ReserveLine with a
   * status of Pending Approval (since the AvailableReserves calculation does not include PendingApproval reserves).
   * If the current AvailableReserves amount is already equal to newReserveAmount, then this method does not create
   * a new Reserve nor ReserveSet, and returns null.
   * @param newReserveAmount The amount the open reserves should be.  The amount must be non-null and zero or greater, not negative.
   * @param submittingUser User submitting this reserve.
   * @throws com.guidewire.cc.system.exception.ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
   * @throws com.guidewire.cc.system.exception.ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
   * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the reserve
   * @return the new reserve (Note: the amount of the returned reserve should not be changed)
   *         The method will return null if new reserve is not created.
   * @deprecated this may not work as expected if called on a reserve line with whose reserving currency is different from the claim currency
   */
  @java.lang.Deprecated
  public entity.Reserve setAvailableReserves(java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
    return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).setAvailableReserves(newReserveAmount, submittingUser);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  private void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CostCategory field.
   */
  private void setCostCategory(typekey.CostCategory value) {
    __getInternalInterface().setFieldValue(COSTCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CostType field.
   */
  private void setCostType(typekey.CostType value) {
    __getInternalInterface().setFieldValue(COSTTYPE_PROP.get(), value);
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
   * Sets the value of the Exposure field.
   */
  private void setExposure(entity.Exposure value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the open recovery reserves for this reserve line to the given amount by
   * creating a recovery reserve that increases or decreases the current open
   * recovery reserves.
   * @param recoveryCategory The recovery category for the recovery reserve.  This value can be null.
   * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
   * @param submittingUser User submitting this recovery reserve.
   * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims)
   * @throws ClosedExposureException if the exposure is closed (recovery reserves cannot be created on closed exposures)
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve
   * @throws com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException if the system is not configured to allow recovery reserves, i.e., the 'UseRecoveryReserves' parameter is false.
   * @return the new Recovery Reserve (Note: the amount of the returned Recovery Reserve should not be changed)
   *         The method will return null if new recoveryReserve is not created.
   * @deprecated this may not work as expected if called on a reserve line with whose reserving currency is different from the claim currency
   */
  @java.lang.Deprecated
  public entity.RecoveryReserve setOpenRecoveryReserves(typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
    return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).setOpenRecoveryReserves(recoveryCategory, newRecoveryReserveAmount, submittingUser);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RICodings field.
   */
  private void setRICodings(entity.RICoding[] value) {
    __getInternalInterface().setFieldValue(RICODINGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecoveryCodings field.
   */
  private void setRecoveryCodings(entity.RecoveryCoding[] value) {
    __getInternalInterface().setFieldValue(RECOVERYCODINGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  private void setReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TAccounts field.
   */
  private void setTAccounts(entity.TAccount[] value) {
    __getInternalInterface().setFieldValue(TACCOUNTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Transactions field.
   */
  private void setTransactions(entity.Transaction[] value) {
    __getInternalInterface().setFieldValue(TRANSACTIONS_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ReserveLineInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ReserveLine.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRICodings(entity.RICoding element) {
      __getInternalInterface().addArrayElement(RICODINGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RecoveryCodings array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRecoveryCodings(entity.RecoveryCoding element) {
      __getInternalInterface().addArrayElement(RECOVERYCODINGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TAccounts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTAccounts(entity.TAccount element) {
      __getInternalInterface().addArrayElement(TACCOUNTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTransactions(entity.Transaction element) {
      __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public void cleanupRelatedTAccountTxnsAndLineItems() {
      ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).cleanupRelatedTAccountTxnsAndLineItems();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.Reserve createNewReserve(gw.pl.persistence.core.Bundle bundle, typekey.TransactionStatus status, java.lang.String comments, java.math.BigDecimal amount, typekey.Currency currency, java.math.BigDecimal exchangeRateOverride, java.lang.String customExchangeRateDescription, gw.api.financials.CurrencyAmount claimAmountOverride) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).createNewReserve(bundle, status, comments, amount, currency, exchangeRateOverride, customExchangeRateDescription, claimAmountOverride);
    }
    
    public entity.TAccountDelegate createTAccount(gw.cc.financials.taccount.entity.TAccountOwnerDelegate.TAccountInitData initData) {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).createTAccount(initData);
    }
    
    public entity.Reserve createZeroingReserveInAllDimensionsIfNecessary(typekey.TransactionStatus status, gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).createZeroingReserveInAllDimensionsIfNecessary(status, bundle);
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
    
    public java.math.BigDecimal getAcctBalance(typekey.TAccountType acctType) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getAcctBalance(acctType);
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getAvailableReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getAvailableReserves();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The related claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public entity.Claim getClaimEntity() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).getClaimEntity();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    public com.guidewire.cc.domain.financials.cache.ContributingTransactionsQueryBuilder getContributingTransactionsQueryBuilder() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).getContributingTransactionsQueryBuilder();
    }
    
    /**
     * Gets the value of the CostCategory field.
     * The costcategory for this transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostCategory getCostCategory() {
      return (typekey.CostCategory)__getInternalInterface().getFieldValue(COSTCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the CostType field.
     * Type of cost (for example, LAE or claim cost).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostType getCostType() {
      return (typekey.CostType)__getInternalInterface().getFieldValue(COSTTYPE_PROP.get());
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
    
    public gw.pl.persistence.core.Key getEntityId() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).getEntityId();
    }
    
    /**
     * Gets the value of the Exposure field.
     * The related exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getFuturePayments() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getFuturePayments();
    }
    
    public gw.api.financials.CurrencyAmount getGrossTotalIncurred() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getGrossTotalIncurred();
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getNetTotalIncurred() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getNetTotalIncurred();
    }
    
    public int getNumPayments() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getNumPayments();
    }
    
    public gw.api.financials.CurrencyAmount getOpenRecoveryReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getOpenRecoveryReserves();
    }
    
    public gw.api.financials.CurrencyAmount getOpenReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getOpenReserves();
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the <code>Payment</code> objects for this reserveline.
     * You can choose to get either all the payments or only the new and modified payments.  If you choose to get all the
     * <code>Payment</code> objects, then <code>Payment</code> objects in the current transaction are not be
     * returned by the <code>Iterator</code>. This method is a much more efficient alternative to calling {@link #getTransactions()}
     * and iterating through all the transactions to find just the desired <code>Payment</code> objects.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be
     * in the same bundle as this <code>ReserveLine</code>, and their bundle may not be editable. To edit the beans, you
     * should add them to an editable bundle first.
     * </p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Payment</code> objects for this reserveline are
     * returned.  This includes payments for which only the line items were modified.  Otherwise,
     * if <code>false</code> then all <code>Payment</code> objects for the reserveline are returned, including
     * new and modified <code>Payment</code> objects, but excluding deleted <code>Payment</code> objects.
     * @return an <code>Iterator</code> that returns <code>Payment</code> objects.
     */
    public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).getPaymentsIterator(newAndModifiedOnly);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RICodings field.
     * Set of RICodings that reference this ReserveLine.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RICoding[] getRICodings() {
      return (entity.RICoding[])__getInternalInterface().getFieldValue(RICODINGS_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryCodings field.
     * Set of RecoveryCodings that reference this ReserveLine.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RecoveryCoding[] getRecoveryCodings() {
      return (entity.RecoveryCoding[])__getInternalInterface().getFieldValue(RECOVERYCODINGS_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getRemainingReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getRemainingReserves();
    }
    
    public typekey.PaymentType getRequiredPaymentType() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getRequiredPaymentType();
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     * Reserving Currency of this ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    public entity.TAccount getTAccount(typekey.TAccountType acctType) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTAccount(acctType);
    }
    
    public entity.TAccount getTAccount(typekey.TAccountType acctType, boolean createIfMissing) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTAccount(acctType, createIfMissing);
    }
    
    public gw.pl.persistence.core.Key getTAccountKey(typekey.TAccountType acctType) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTAccountKey(acctType);
    }
    
    /**
     * Gets the value of the TAccounts field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TAccount[] getTAccounts() {
      return (entity.TAccount[])__getInternalInterface().getFieldValue(TACCOUNTS_PROP.get());
    }
    
    /**
     * Array association for partition TAccountsByTAccountType on array TAccounts
     */
    public entity.TAccount getTAccountsByTAccountType(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.TAccount)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    public entity.TAccountDelegate getTAccountsByTAccountType(typekey.TAccountType acctType) {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).getTAccountsByTAccountType(acctType);
    }
    
    public java.util.Map<typekey.TAccountType, gw.cc.financials.taccount.entity.TAccountOwnerDelegate.TAccountInitData> getTAccountsInitMap() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).getTAccountsInitMap();
    }
    
    public java.util.Set<entity.TAccountTransaction> getTAcctTransactionsPointingToThisReserveLine(entity.Transaction txn) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTAcctTransactionsPointingToThisReserveLine(txn);
    }
    
    public gw.api.financials.CurrencyAmount getTotalPayments() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTotalPayments();
    }
    
    public gw.api.financials.CurrencyAmount getTotalRecoveries() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTotalRecoveries();
    }
    
    public gw.api.financials.CurrencyAmount getTotalRecoveryReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTotalRecoveryReserves();
    }
    
    public gw.api.financials.CurrencyAmount getTotalReserves() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).getTotalReserves();
    }
    
    /**
     * Gets the value of the Transactions field.
     * Set of transactions that contribute to this ReserveLine.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction[] getTransactions() {
      return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the transactions for this reserveline.  This is a more efficient
     * alternative to calling {@link #getTransactions()}, particularly if you are only interested in new or modified
     * transactions.  You can use this method to retrieve all the <code>Transaction</code> objects or only the new and modified objects.
     * If you choose to retrieve all the <code>Transaction</code> objects then, those transactions that were removed
     * in the current transaction are not be returned by the <code>Iterator</code>.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, there is no guarantee that the beans returned by this
     * iterator may not be in the same bundle as this <code>ReserveLine</code>, and their bundle may not be editable.
     * To edit the beans, you should add them to an editable bundle first.</p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified transactions for this reserveline are
     *                           returned.  This includes transactions for which only the line items were modified.  Otherwise,
     *                           if <code>false</code> then the method returns all transactions for the reserveline, including
     *                           new and modified <code>Transaction</code> objects, but excluding deleted transactions.
     * @return an Iterator that returns transactions.
     */
    public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).getTransactionsIterator(newAndModifiedOnly);
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
    
    public boolean hasApprovedFutureFinalPayment() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).hasApprovedFutureFinalPayment();
    }
    
    public boolean hasPayments() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).hasPayments();
    }
    
    public boolean hasPendingFinalPayment(entity.Payment paymentToExclude) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).hasPendingFinalPayment(paymentToExclude);
    }
    
    public boolean hasPendingOrBetterFutureFinalPayment(entity.Payment paymentToExclude) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).hasPendingOrBetterFutureFinalPayment(paymentToExclude);
    }
    
    public boolean hasReserve() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).hasReserve();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public void initTAccounts() {
      ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).initTAccounts();
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
    
    public boolean isPaymentAllowed() {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).isPaymentAllowed();
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
    
    public boolean matches(entity.Claim claim, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).matches(claim, exposure, costType, costCategory, reservingCurrency);
    }
    
    public boolean matches(entity.ReserveLine reserveLine) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).matches(reserveLine);
    }
    
    public entity.Reserve newReserve(typekey.TransactionStatus status, java.lang.String comment, gw.api.financials.CurrencyAmount reservingAmount, gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.impl.ReserveLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.ReserveLineInternal")).newReserve(status, comment, reservingAmount, bundle);
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
     * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
     */
    public void removeFromRICodings(entity.RICoding element) {
      __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRICodings(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
     */
    public void removeFromRecoveryCodings(entity.RecoveryCoding element) {
      __getInternalInterface().removeArrayElement(RECOVERYCODINGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRecoveryCodings(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RECOVERYCODINGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
     */
    public void removeFromTAccounts(entity.TAccount element) {
      __getInternalInterface().removeArrayElement(TACCOUNTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTAccounts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TACCOUNTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
     */
    public void removeFromTransactions(entity.Transaction element) {
      __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTransactions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), elementID);
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
     * Sets the available reserves for this reserve line to the given amount by creating
     * a reserve that increases or decreases the currently available reserves.
     * 
     * This method creates a new ReserveSet and Reserve transaction with the amount necessary to get the AvailableReserves
     * for this ReserveLine to equal the newReserveAmount.
     * This transaction amount might be positive if an increase is needed or negative if a decrease is needed.
     * The ReserveSet is not run through pre-setup rules and is immediately submitted for approval.
     * Unlike setting reserves in the UI, this method ignores any Reserve transactions on this ReserveLine with a
     * status of Pending Approval (since the AvailableReserves calculation does not include PendingApproval reserves).
     * If the current AvailableReserves amount is already equal to newReserveAmount, then this method does not create
     * a new Reserve nor ReserveSet, and returns null.
     * @param newReserveAmount The amount the open reserves should be.  The amount must be non-null and zero or greater, not negative.
     * @param submittingUser User submitting this reserve.
     * @throws com.guidewire.cc.system.exception.ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
     * @throws com.guidewire.cc.system.exception.ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
     * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the reserve
     * @return the new reserve (Note: the amount of the returned reserve should not be changed)
     *         The method will return null if new reserve is not created.
     * @deprecated this may not work as expected if called on a reserve line with whose reserving currency is different from the claim currency
     */
    @java.lang.Deprecated
    public entity.Reserve setAvailableReserves(java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
      return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).setAvailableReserves(newReserveAmount, submittingUser);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
     * Sets the value of the CostCategory field.
     */
    public void setCostCategory(typekey.CostCategory value) {
      __getInternalInterface().setFieldValue(COSTCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CostType field.
     */
    public void setCostType(typekey.CostType value) {
      __getInternalInterface().setFieldValue(COSTTYPE_PROP.get(), value);
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
     * Sets the value of the Exposure field.
     */
    public void setExposure(entity.Exposure value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    public void setExposureID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
     * Sets the open recovery reserves for this reserve line to the given amount by
     * creating a recovery reserve that increases or decreases the current open
     * recovery reserves.
     * @param recoveryCategory The recovery category for the recovery reserve.  This value can be null.
     * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
     * @param submittingUser User submitting this recovery reserve.
     * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims)
     * @throws ClosedExposureException if the exposure is closed (recovery reserves cannot be created on closed exposures)
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve
     * @throws com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException if the system is not configured to allow recovery reserves, i.e., the 'UseRecoveryReserves' parameter is false.
     * @return the new Recovery Reserve (Note: the amount of the returned Recovery Reserve should not be changed)
     *         The method will return null if new recoveryReserve is not created.
     * @deprecated this may not work as expected if called on a reserve line with whose reserving currency is different from the claim currency
     */
    @java.lang.Deprecated
    public entity.RecoveryReserve setOpenRecoveryReserves(typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
      return ((gw.cc.financials.entity.ReserveLine)__getDelegateManager().getImplementation("gw.cc.financials.entity.ReserveLine")).setOpenRecoveryReserves(recoveryCategory, newRecoveryReserveAmount, submittingUser);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RICodings field.
     */
    public void setRICodings(entity.RICoding[] value) {
      __getInternalInterface().setFieldValue(RICODINGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryCodings field.
     */
    public void setRecoveryCodings(entity.RecoveryCoding[] value) {
      __getInternalInterface().setFieldValue(RECOVERYCODINGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
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
     * Sets the value of the TAccounts field.
     */
    public void setTAccounts(entity.TAccount[] value) {
      __getInternalInterface().setFieldValue(TACCOUNTS_PROP.get(), value);
    }
    
    public void setTAccountsByTAccountType(typekey.TAccountType acctType, entity.TAccountDelegate newAcct) {
      ((com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter")).setTAccountsByTAccountType(acctType, newAcct);
    }
    
    /**
     * Sets the value of the Transactions field.
     */
    public void setTransactions(entity.Transaction[] value) {
      __getInternalInterface().setFieldValue(TRANSACTIONS_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.financials.impl.ReserveLineInternal", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter", "com.guidewire.cc.domain.financials.taccount.impl.TAccountOwnerDelegateAdapterReserveLineImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TAccountOwnerDelegateInternal", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
    config.put("gw.cc.financials.entity.ReserveLine", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
    config.put("gw.cc.financials.taccount.entity.TAccountOwnerDelegate", "com.guidewire.cc.domain.financials.impl.ReserveLineImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ReserveLine.class, config);
    com.guidewire._generated.entity.ReserveLineInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ReserveLine, com.guidewire._generated.entity.ReserveLineInternal>() {
      public java.lang.Object getImplementation(entity.ReserveLine bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ReserveLineInternal getInternalInterface(entity.ReserveLine bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ReserveLine newEmptyInstance() {
        return new entity.ReserveLine((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}