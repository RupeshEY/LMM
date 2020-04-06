package entity;

/**
 * RITAccount
 * RITAccounts are used in ClaimCenter to provide a rolled-up view of all Reinsurance (RI) financials transactions
 *     entered into the system. They share the same functionality as TAccounts for regular transactions.
 *     Each RICoding (unique combination of ReserveLine and RIAgreement) has
 *     X distinct TAccounts that together represent every possible life cycle state for each of the 2 RI transaction subtypes
 *     (Ceded Reserves, Payment Recoverables), and distinguish the totals for normal transactions vs.
 *     "adjustment" transactions. Although RITransaction only use the Submitting/Submitted status, we use the
 *     same TAccount mechanism as regular transactions so Financials Calculations and other code can be reused.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITAccount.eti;RITAccount.eix;RITAccount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RITAccount")
public class RITAccount extends com.guidewire.pl.persistence.code.BeanBase implements entity.Editable, entity.Extractable, entity.TAccountDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RITAccount> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RITAccount>("entity.RITAccount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREDITBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreditBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREDITRPTBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreditRptBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEBITBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DebitBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEBITRPTBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DebitRptBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NORMALBALANCE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "NormalBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMCONTRIBUTINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumContributingTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RICODING_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RICoding");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RITACCOUNTLINEITEMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RITAccountLineItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TAccountType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RITAccountInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  protected RITAccount()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  protected RITAccount(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RITAccount(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.RITAccountInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.RITAccountInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the RITAccountLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToRITAccountLineItems(entity.RITAccountLineItem element) {
    __getInternalInterface().addArrayElement(RITACCOUNTLINEITEMS_PROP.get(), element);
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CREDITBALANCE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditRptBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CREDITRPTBALANCE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DEBITBALANCE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitRptBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DEBITRPTBALANCE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LedgerSide getNormalBalance() {
    return (typekey.LedgerSide)__getInternalInterface().getFieldValue(NORMALBALANCE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumContributingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMCONTRIBUTINGTXNS_PROP.get());
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
  public entity.RICoding getRICoding() {
    return (entity.RICoding)__getInternalInterface().getFieldValue(RICODING_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountLineItem[] getRITAccountLineItems() {
    return (entity.RITAccountLineItem[])__getInternalInterface().getFieldValue(RITACCOUNTLINEITEMS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType() {
    return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
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
   * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromRITAccountLineItems(entity.RITAccountLineItem element) {
    __getInternalInterface().removeArrayElement(RITACCOUNTLINEITEMS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRITAccountLineItems(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RITACCOUNTLINEITEMS_PROP.get(), elementID);
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
   * Sets the value of the CreditBalance field.
   */
  private void setCreditBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CREDITBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreditRptBalance field.
   */
  private void setCreditRptBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CREDITRPTBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DebitBalance field.
   */
  private void setDebitBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DEBITBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DebitRptBalance field.
   */
  private void setDebitRptBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DEBITRPTBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the NormalBalance field.
   */
  private void setNormalBalance(typekey.LedgerSide value) {
    __getInternalInterface().setFieldValue(NORMALBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumContributingTxns field.
   */
  private void setNumContributingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMCONTRIBUTINGTXNS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RICoding field.
   */
  private void setRICoding(entity.RICoding value) {
    __getInternalInterface().setFieldValue(RICODING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RITAccountLineItems field.
   */
  private void setRITAccountLineItems(entity.RITAccountLineItem[] value) {
    __getInternalInterface().setFieldValue(RITACCOUNTLINEITEMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TAccountType field.
   */
  private void setTAccountType(typekey.TAccountType value) {
    __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RITAccountInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RITAccount.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the RITAccountLineItems array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRITAccountLineItems(entity.RITAccountLineItem element) {
      __getInternalInterface().addArrayElement(RITACCOUNTLINEITEMS_PROP.get(), element);
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
    
    public void creditAccount(java.math.BigDecimal claimAmountToCredit, java.math.BigDecimal reportingAmountToCredit) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).creditAccount(claimAmountToCredit, reportingAmountToCredit);
    }
    
    public void debitAccount(java.math.BigDecimal claimAmountToDebit, java.math.BigDecimal reportingAmountToDebit) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).debitAccount(claimAmountToDebit, reportingAmountToDebit);
    }
    
    public void decrementContributingTransactions() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).decrementContributingTransactions();
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
    
    public java.math.BigDecimal getBalance() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getBalance();
    }
    
    public java.math.BigDecimal getBalance(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getBalance(useOldValues);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
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
     * Gets the value of the CreditBalance field.
     * The balance of the claim currency credit side of this t-account's ledger.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCreditBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CREDITBALANCE_PROP.get());
    }
    
    public java.math.BigDecimal getCreditBalance(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getCreditBalance(useOldValues);
    }
    
    /**
     * Gets the value of the CreditRptBalance field.
     * The balance of the reporting currency credit side of this t-account's ledger.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCreditRptBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CREDITRPTBALANCE_PROP.get());
    }
    
    /**
     * Gets the value of the DebitBalance field.
     * The balance of the claim currency debit side of this t-account's ledger.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDebitBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DEBITBALANCE_PROP.get());
    }
    
    public java.math.BigDecimal getDebitBalance(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getDebitBalance(useOldValues);
    }
    
    /**
     * Gets the value of the DebitRptBalance field.
     * The balance of the reporting currency debit side of this t-account's ledger.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDebitRptBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DEBITRPTBALANCE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    public gw.pl.persistence.core.Key getMyId() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getMyId();
    }
    
    /**
     * Gets the value of the NormalBalance field.
     * Indicates whether this t-account's normal balance is 'credit normal' or 'debit normal'.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LedgerSide getNormalBalance() {
      return (typekey.LedgerSide)__getInternalInterface().getFieldValue(NORMALBALANCE_PROP.get());
    }
    
    /**
     * Gets the value of the NumContributingTxns field.
     * Stores a denormalized counter of the number of financial transactions currently contributing to this taccount's net balance
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumContributingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMCONTRIBUTINGTXNS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RICoding field.
     * FK to the RICoding that this TAccount is assoicated with.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RICoding getRICoding() {
      return (entity.RICoding)__getInternalInterface().getFieldValue(RICODING_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRICodingID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RICODING_PROP.get());
    }
    
    /**
     * Gets the value of the RITAccountLineItems field.
     * Line items for this RITAccount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RITAccountLineItem[] getRITAccountLineItems() {
      return (entity.RITAccountLineItem[])__getInternalInterface().getFieldValue(RITACCOUNTLINEITEMS_PROP.get());
    }
    
    public java.math.BigDecimal getReportingBalance() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getReportingBalance();
    }
    
    public java.math.BigDecimal getReportingBalance(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).getReportingBalance(useOldValues);
    }
    
    public java.math.BigDecimal getReservingBalance() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter")).getReservingBalance();
    }
    
    public java.math.BigDecimal getReservingBalance(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter")).getReservingBalance(useOldValues);
    }
    
    /**
     * Gets the value of the TAccountType field.
     * The type of this t-account, i.e., the transaction subtype(s) and lifecycle state that it reflects.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TAccountType getTAccountType() {
      return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
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
    
    public void incrementContributingTransactions() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).incrementContributingTransactions();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isCreditNormal() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).isCreditNormal();
    }
    
    public boolean isDebitNormal() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal")).isDebitNormal();
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
     * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
     */
    public void removeFromRITAccountLineItems(entity.RITAccountLineItem element) {
      __getInternalInterface().removeArrayElement(RITACCOUNTLINEITEMS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRITAccountLineItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RITACCOUNTLINEITEMS_PROP.get(), elementID);
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
     * Sets the value of the CreditBalance field.
     */
    public void setCreditBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CREDITBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreditRptBalance field.
     */
    public void setCreditRptBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CREDITRPTBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DebitBalance field.
     */
    public void setDebitBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DEBITBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DebitRptBalance field.
     */
    public void setDebitRptBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DEBITRPTBALANCE_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the NormalBalance field.
     */
    public void setNormalBalance(typekey.LedgerSide value) {
      __getInternalInterface().setFieldValue(NORMALBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumContributingTxns field.
     */
    public void setNumContributingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMCONTRIBUTINGTXNS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RICoding field.
     */
    public void setRICoding(entity.RICoding value) {
      __getInternalInterface().setFieldValue(RICODING_PROP.get(), value);
    }
    
    public void setRICodingID(gw.pl.persistence.core.Key value) {
      setFieldValue(RICODING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RITAccountLineItems field.
     */
    public void setRITAccountLineItems(entity.RITAccountLineItem[] value) {
      __getInternalInterface().setFieldValue(RITACCOUNTLINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountType field.
     */
    public void setTAccountType(typekey.TAccountType value) {
      __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter", "com.guidewire.cc.domain.financials.taccount.impl.RITAccountImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal", "com.guidewire.cc.domain.financials.taccount.impl.RITAccountImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.RITAccount", "com.guidewire.cc.domain.financials.taccount.impl.RITAccountImpl");
    config.put("gw.cc.financials.taccount.entity.TAccountDelegate", "com.guidewire.cc.domain.financials.taccount.impl.RITAccountImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RITAccount.class, config);
    com.guidewire._generated.entity.RITAccountInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RITAccount, com.guidewire._generated.entity.RITAccountInternal>() {
      public java.lang.Object getImplementation(entity.RITAccount bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RITAccountInternal getInternalInterface(entity.RITAccount bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RITAccount newEmptyInstance() {
        return new entity.RITAccount((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}