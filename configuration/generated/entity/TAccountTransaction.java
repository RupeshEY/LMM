package entity;

/**
 * TAccountTransaction
 * Contains the TAccountLineItems that change a pair of T-accounts to account for a transaction as it moves
 *     through its LifeCycle States. For example, when a reserve becomes committed, it is debited (removed from) Pending Approval ReservesXX
 *     T-Account and added (credited) to the ReservesXX T-Account.  Each TAccountTransaction has a link to its succeeding TAccountTransaction,
 *     thus providing a history of the life of the associated transaction.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountTransaction.eti;TAccountTransaction.eix;TAccountTransaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TAccountTransaction")
public class TAccountTransaction extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.TAccountTransactionDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TAccountTransaction> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TAccountTransaction>("entity.TAccountTransaction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CREDITINGLINEITEMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CreditingLineItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DEBITINGLINEITEMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DebitingLineItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NEXTTRANSACTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NextTransaction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TACCTTXNHISTORYARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TaccttxnhistoryArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSACTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Transaction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TAccountTransactionInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  protected TAccountTransaction()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  protected TAccountTransaction(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TAccountTransaction(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TAccountTransactionInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TAccountTransactionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the CreditingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToCreditingLineItems(entity.TAccountLineItem element) {
    __getInternalInterface().addArrayElement(CREDITINGLINEITEMS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DebitingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToDebitingLineItems(entity.TAccountLineItem element) {
    __getInternalInterface().addArrayElement(DEBITINGLINEITEMS_PROP.get(), element);
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
   * Gets the value of the Comments field.
   * Comments about the transaction, such as the LifeCycleState transition for which it was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
  public entity.TAccountLineItem[] getCreditingLineItems() {
    return (entity.TAccountLineItem[])__getInternalInterface().getFieldValue(CREDITINGLINEITEMS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountLineItem[] getDebitingLineItems() {
    return (entity.TAccountLineItem[])__getInternalInterface().getFieldValue(DEBITINGLINEITEMS_PROP.get());
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction getNextTransaction() {
    return (entity.TAccountTransaction)__getInternalInterface().getFieldValue(NEXTTRANSACTION_PROP.get());
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Taccttxnhistory[] getTaccttxnhistoryArray() {
    return (entity.Taccttxnhistory[])__getInternalInterface().getFieldValue(TACCTTXNHISTORYARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction() {
    return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
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
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromCreditingLineItems(entity.TAccountLineItem element) {
    __getInternalInterface().removeArrayElement(CREDITINGLINEITEMS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreditingLineItems(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CREDITINGLINEITEMS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromDebitingLineItems(entity.TAccountLineItem element) {
    __getInternalInterface().removeArrayElement(DEBITINGLINEITEMS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDebitingLineItems(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DEBITINGLINEITEMS_PROP.get(), elementID);
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
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
   * Sets the value of the CreditingLineItems field.
   */
  private void setCreditingLineItems(entity.TAccountLineItem[] value) {
    __getInternalInterface().setFieldValue(CREDITINGLINEITEMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DebitingLineItems field.
   */
  private void setDebitingLineItems(entity.TAccountLineItem[] value) {
    __getInternalInterface().setFieldValue(DEBITINGLINEITEMS_PROP.get(), value);
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
   * Sets the value of the NextTransaction field.
   */
  private void setNextTransaction(entity.TAccountTransaction value) {
    __getInternalInterface().setFieldValue(NEXTTRANSACTION_PROP.get(), value);
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
   * Sets the value of the TaccttxnhistoryArray field.
   */
  private void setTaccttxnhistoryArray(entity.Taccttxnhistory[] value) {
    __getInternalInterface().setFieldValue(TACCTTXNHISTORYARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Transaction field.
   */
  private void setTransaction(entity.Transaction value) {
    __getInternalInterface().setFieldValue(TRANSACTION_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TAccountTransactionInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TAccountTransaction.this.__getDelegateManager();
    }
    
    public entity.TAccountLineItem addCreditingLineItem(entity.TAccount acctToCredit, java.math.BigDecimal reservingAmount, java.math.BigDecimal claimAmount, java.math.BigDecimal reportingAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal")).addCreditingLineItem(acctToCredit, reservingAmount, claimAmount, reportingAmount);
    }
    
    public entity.TAccountLineItemDelegate addCreditingLineItem(entity.TAccountDelegate acctToCredit, boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).addCreditingLineItem(acctToCredit, useOldAmount);
    }
    
    public entity.TAccountLineItemDelegate addCreditingLineItem(entity.TAccountDelegate acctToCredit, java.math.BigDecimal claimAmount, java.math.BigDecimal reportingAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).addCreditingLineItem(acctToCredit, claimAmount, reportingAmount);
    }
    
    public entity.TAccountLineItem addDebitingLineItem(entity.TAccount acctToDebit, java.math.BigDecimal reservingAmount, java.math.BigDecimal claimAmount, java.math.BigDecimal reportingAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal")).addDebitingLineItem(acctToDebit, reservingAmount, claimAmount, reportingAmount);
    }
    
    public entity.TAccountLineItemDelegate addDebitingLineItem(entity.TAccountDelegate acctToDebit, boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).addDebitingLineItem(acctToDebit, useOldAmount);
    }
    
    public entity.TAccountLineItemDelegate addDebitingLineItem(entity.TAccountDelegate acctToDebit, java.math.BigDecimal claimAmount, java.math.BigDecimal reportingAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).addDebitingLineItem(acctToDebit, claimAmount, reportingAmount);
    }
    
    /**
     * Adds the given element to the CreditingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCreditingLineItems(entity.TAccountLineItem element) {
      __getInternalInterface().addArrayElement(CREDITINGLINEITEMS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DebitingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDebitingLineItems(entity.TAccountLineItem element) {
      __getInternalInterface().addArrayElement(DEBITINGLINEITEMS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TaccttxnhistoryArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTaccttxnhistoryArray(entity.Taccttxnhistory element) {
      __getInternalInterface().addArrayElement(TACCTTXNHISTORYARRAY_PROP.get(), element);
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
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.TAccountLineItemDelegate createNewTAccountLineItem() {
      return ((com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter")).createNewTAccountLineItem();
    }
    
    public void delete() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).delete();
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
     * Gets the value of the Comments field.
     * Comments about the transaction, such as the LifeCycleState transition for which it was created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
     * Gets the value of the CreditingLineItems field.
     * Set of TAccountLineItems that are used by this TAccountTransaction to credit a TAccount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TAccountLineItem[] getCreditingLineItems() {
      return (entity.TAccountLineItem[])__getInternalInterface().getFieldValue(CREDITINGLINEITEMS_PROP.get());
    }
    
    public entity.TAccountLineItemDelegate[] getCreditingLineItemsForTAccounts() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).getCreditingLineItemsForTAccounts();
    }
    
    /**
     * Gets the value of the DebitingLineItems field.
     * Set of TAccountLineItems that are used by this TAccountTransaction to debit a TAccount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TAccountLineItem[] getDebitingLineItems() {
      return (entity.TAccountLineItem[])__getInternalInterface().getFieldValue(DEBITINGLINEITEMS_PROP.get());
    }
    
    public entity.TAccountLineItemDelegate[] getDebitingLineItemsForTAccounts() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).getDebitingLineItemsForTAccounts();
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
    
    /**
     * Gets the value of the NextTransaction field.
     * The t-account transaction that chronologically succeeds this one in a Transaction's lifecycle.  For the most recent TAccountTransaction, this will be NULL.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TAccountTransaction getNextTransaction() {
      return (entity.TAccountTransaction)__getInternalInterface().getFieldValue(NEXTTRANSACTION_PROP.get());
    }
    
    public entity.TAccountTransactionDelegate getNextTransactionEntity() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).getNextTransactionEntity();
    }
    
    public gw.pl.persistence.core.Key getNextTransactionEntityID() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).getNextTransactionEntityID();
    }
    
    public gw.pl.persistence.core.Key getNextTransactionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NEXTTRANSACTION_PROP.get());
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
     * Gets the value of the TaccttxnhistoryArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Taccttxnhistory[] getTaccttxnhistoryArray() {
      return (entity.Taccttxnhistory[])__getInternalInterface().getFieldValue(TACCTTXNHISTORYARRAY_PROP.get());
    }
    
    /**
     * Gets the value of the Transaction field.
     * The higher-level financial transaction for which this t-account transaction was created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction getTransaction() {
      return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransactionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSACTION_PROP.get());
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
    
    public boolean isNewEntity() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).isNewEntity();
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
    
    /**
     * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
     */
    public void removeFromCreditingLineItems(entity.TAccountLineItem element) {
      __getInternalInterface().removeArrayElement(CREDITINGLINEITEMS_PROP.get(), element);
    }
    
    public void removeFromCreditingLineItems(entity.TAccountLineItemDelegate lineItem) {
      ((com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter")).removeFromCreditingLineItems(lineItem);
    }
    
    /**
     * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCreditingLineItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CREDITINGLINEITEMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
     */
    public void removeFromDebitingLineItems(entity.TAccountLineItem element) {
      __getInternalInterface().removeArrayElement(DEBITINGLINEITEMS_PROP.get(), element);
    }
    
    public void removeFromDebitingLineItems(entity.TAccountLineItemDelegate lineItem) {
      ((com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter")).removeFromDebitingLineItems(lineItem);
    }
    
    /**
     * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDebitingLineItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DEBITINGLINEITEMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TaccttxnhistoryArray array. This is achieved by marking the element for removal.
     */
    public void removeFromTaccttxnhistoryArray(entity.Taccttxnhistory element) {
      __getInternalInterface().removeArrayElement(TACCTTXNHISTORYARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TaccttxnhistoryArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTaccttxnhistoryArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TACCTTXNHISTORYARRAY_PROP.get(), elementID);
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
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
     * Sets the value of the CreditingLineItems field.
     */
    public void setCreditingLineItems(entity.TAccountLineItem[] value) {
      __getInternalInterface().setFieldValue(CREDITINGLINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DebitingLineItems field.
     */
    public void setDebitingLineItems(entity.TAccountLineItem[] value) {
      __getInternalInterface().setFieldValue(DEBITINGLINEITEMS_PROP.get(), value);
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
     * Sets the value of the NextTransaction field.
     */
    public void setNextTransaction(entity.TAccountTransaction value) {
      __getInternalInterface().setFieldValue(NEXTTRANSACTION_PROP.get(), value);
    }
    
    public void setNextTransaction(entity.TAccountTransactionDelegate tAccountTransactionDelegate) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).setNextTransaction(tAccountTransactionDelegate);
    }
    
    public void setNextTransactionID(gw.pl.persistence.core.Key value) {
      setFieldValue(NEXTTRANSACTION_PROP.get(), value);
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
     * Sets the value of the TaccttxnhistoryArray field.
     */
    public void setTaccttxnhistoryArray(entity.Taccttxnhistory[] value) {
      __getInternalInterface().setFieldValue(TACCTTXNHISTORYARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Transaction field.
     */
    public void setTransaction(entity.Transaction value) {
      __getInternalInterface().setFieldValue(TRANSACTION_PROP.get(), value);
    }
    
    public void setTransaction(entity.TransactionTAccountOperationsDelegate owner) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).setTransaction(owner);
    }
    
    public void setTransactionID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSACTION_PROP.get(), value);
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
    
    public void validateAddLineItemPreConditions(entity.TAccountDelegate acct, typekey.LedgerSide lineItemType) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).validateAddLineItemPreConditions(acct, lineItemType);
    }
    
    public void verifyDebitsAndCredits() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal")).verifyDebitsAndCredits();
    }
    
    public void verifyReservingDebitsAndCredits() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal")).verifyReservingDebitsAndCredits();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateAdapterNormalImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
    config.put("gw.cc.financials.taccount.entity.TAccountTransaction", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
    config.put("gw.cc.financials.taccount.entity.TAccountTransactionDelegate", "com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TAccountTransaction.class, config);
    com.guidewire._generated.entity.TAccountTransactionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TAccountTransaction, com.guidewire._generated.entity.TAccountTransactionInternal>() {
      public java.lang.Object getImplementation(entity.TAccountTransaction bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TAccountTransactionInternal getInternalInterface(entity.TAccountTransaction bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TAccountTransaction newEmptyInstance() {
        return new entity.TAccountTransaction((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}