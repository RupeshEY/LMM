package entity;

/**
 * CheckPortion
 * 
 *       Indicates the amount of a multi-payee check that applies to a particular check. Checks with a CheckPortion do not
 *       have any payments, but just receive a percentage or fixed amount of the Payments in the primary Check of the
 *       CheckGroup (i.e., CheckGroup.PrimaryCheck).
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckPortion.eti;CheckPortion.eix;CheckPortion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "CheckPortion")
public class CheckPortion extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CheckPortion> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CheckPortion>("entity.CheckPortion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CHECKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Checks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIXEDCLAIMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FixedClaimAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIXEDREPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FixedReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIXEDRESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FixedReservingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIXEDTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FixedTransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Percentage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REISSUED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Reissued");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CheckPortionInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public CheckPortion()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public CheckPortion(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected CheckPortion(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CheckPortionInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CheckPortionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Checks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChecks(entity.Check element) {
    __getInternalInterface().addArrayElement(CHECKS_PROP.get(), element);
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
   * Gets this check portion's check's currency. Required by the "checkcurrency" datatype to resolve the check currency.
   */
  public typekey.Currency getCheckCurrency() {
    return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getCheckCurrency();
  }
  
  /**
   * Gets the value of the Checks field.
   * Checks whose amounts are defined by this CheckPortion. If there are multiple checks in this array, all of them must belong to the same CheckRecurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check[] getChecks() {
    return (entity.Check[])__getInternalInterface().getFieldValue(CHECKS_PROP.get());
  }
  
  /**
   * Gets this check portion's claim's currency. Required by the "claimcurrency" datatype to resolve the claim currency.
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getClaimCurrency();
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
   * defers to {@link #getFixedTransactionAmount}; in multicurrency mode, that method should be preferred
   */
  public java.math.BigDecimal getFixedAmount() {
    return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getFixedAmount();
  }
  
  /**
   * Gets the value of the FixedClaimAmount field.
   * The fixed amount (in the claim currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedClaimAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDCLAIMAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the FixedReportingAmount field.
   * The fixed amount (in the reporting currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDREPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the FixedReservingAmount field.
   * The fixed amount (in the reserving currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedReservingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDRESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the FixedTransactionAmount field.
   * The fixed amount (in the transaction currency) to allocate towards the check. Setting this clears Percentage and updates FixedClaimAmount and FixedReportingAmount. At least one check must be added to this CheckPortion before setting this.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDTRANSACTIONAMOUNT_PROP.get());
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
   * Returns DisplayName if Percentage or Check is null. Otherwise returns FixedTransactionAmount
   * formatted with Check.Currency.
   * @param check 
   */
  public java.lang.String getMultiCurrencyDisplayName(entity.Check check) {
    return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getMultiCurrencyDisplayName(check);
  }
  
  /**
   * Gets the value of the Percentage field.
   * The percentage to allocate towards the check. Setting this clears the fixed amount properties
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentage() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PERCENTAGE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets this check portion's check's reserving currency. Required by the "reservingcurrency" datatype to resolve
   * the reserving currency.
   */
  public typekey.Currency getReservingCurrency() {
    return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getReservingCurrency();
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
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReissued() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(REISSUED_PROP.get());
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
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   */
  public void removeFromChecks(entity.Check element) {
    __getInternalInterface().removeArrayElement(CHECKS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChecks(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CHECKS_PROP.get(), elementID);
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
   * Sets the value of the Checks field.
   */
  public void setChecks(entity.Check[] value) {
    __getInternalInterface().setFieldValue(CHECKS_PROP.get(), value);
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
   * defers to {@link #setFixedTransactionAmount(gw.api.financials.CurrencyAmount)}; in multicurrency mode, that method
   * should be preferred
   * @param value 
   */
  public void setFixedAmount(java.math.BigDecimal value) {
    ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setFixedAmount(value);
  }
  
  /**
   * Sets the value of the FixedClaimAmount field.
   */
  private void setFixedClaimAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FIXEDCLAIMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FixedReportingAmount field.
   */
  private void setFixedReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FIXEDREPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FixedReservingAmount field.
   */
  private void setFixedReservingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FIXEDRESERVINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FixedTransactionAmount field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setFixedTransactionAmount(gw.api.financials.CurrencyAmount value) {
    ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setFixedTransactionAmount(value);
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
   * Sets the value of the Percentage field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPercentage(java.math.BigDecimal value) {
    ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setPercentage(value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Reissued field.
   */
  private void setReissued(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(REISSUED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CheckPortionInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.CheckPortion.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Checks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToChecks(entity.Check element) {
      __getInternalInterface().addArrayElement(CHECKS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public boolean beforeCommit() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).beforeCommit();
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
    
    public entity.CheckPortion clonePortion(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).clonePortion(bundle);
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
    
    public gw.api.financials.CurrencyAmount getAmount(com.guidewire.cc.domain.financials.AmountType amountType, java.math.BigDecimal amount, entity.CheckPortion[] portions, boolean useOldPortionValues, boolean calculateForPrimaryPortion) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).getAmount(amountType, amount, portions, useOldPortionValues, calculateForPrimaryPortion);
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
     * Gets this check portion's check's currency. Required by the "checkcurrency" datatype to resolve the check currency.
     */
    public typekey.Currency getCheckCurrency() {
      return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getCheckCurrency();
    }
    
    /**
     * Gets the value of the Checks field.
     * Checks whose amounts are defined by this CheckPortion. If there are multiple checks in this array, all of them must belong to the same CheckRecurrence.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Check[] getChecks() {
      return (entity.Check[])__getInternalInterface().getFieldValue(CHECKS_PROP.get());
    }
    
    /**
     * Gets this check portion's claim's currency. Required by the "claimcurrency" datatype to resolve the claim currency.
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getClaimCurrency();
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
     * defers to {@link #getFixedTransactionAmount}; in multicurrency mode, that method should be preferred
     */
    public java.math.BigDecimal getFixedAmount() {
      return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getFixedAmount();
    }
    
    /**
     * Gets the value of the FixedClaimAmount field.
     * The fixed amount (in the claim currency) to allocate towards the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFixedClaimAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDCLAIMAMOUNT_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getFixedCurrencyAmount(com.guidewire.cc.domain.financials.AmountType amountType, boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).getFixedCurrencyAmount(amountType, useOldValues);
    }
    
    /**
     * Gets the value of the FixedReportingAmount field.
     * The fixed amount (in the reporting currency) to allocate towards the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFixedReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDREPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the FixedReservingAmount field.
     * The fixed amount (in the reserving currency) to allocate towards the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFixedReservingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDRESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the FixedTransactionAmount field.
     * The fixed amount (in the transaction currency) to allocate towards the check. Setting this clears Percentage and updates FixedClaimAmount and FixedReportingAmount. At least one check must be added to this CheckPortion before setting this.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFixedTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FIXEDTRANSACTIONAMOUNT_PROP.get());
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
     * Returns DisplayName if Percentage or Check is null. Otherwise returns FixedTransactionAmount
     * formatted with Check.Currency.
     * @param check 
     */
    public java.lang.String getMultiCurrencyDisplayName(entity.Check check) {
      return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getMultiCurrencyDisplayName(check);
    }
    
    /**
     * Gets the value of the Percentage field.
     * The percentage to allocate towards the check. Setting this clears the fixed amount properties
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPercentage() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PERCENTAGE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets this check portion's check's reserving currency. Required by the "reservingcurrency" datatype to resolve
     * the reserving currency.
     */
    public typekey.Currency getReservingCurrency() {
      return ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).getReservingCurrency();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
    
    public boolean isMatch(entity.CheckPortion portionToTestForMatch) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).isMatch(portionToTestForMatch);
    }
    
    public boolean isMatchForPercentage(entity.CheckPortion portionToTestForMatch) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).isMatchForPercentage(portionToTestForMatch);
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
     * Gets the value of the Reissued field.
     * Flag indicating whether this portion was created for a reissued check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReissued() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REISSUED_PROP.get());
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
    
    public void recalculateDependentAmounts() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal")).recalculateDependentAmounts();
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
     * Removes the given element from the Checks array. This is achieved by marking the element for removal.
     */
    public void removeFromChecks(entity.Check element) {
      __getInternalInterface().removeArrayElement(CHECKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Checks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromChecks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CHECKS_PROP.get(), elementID);
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
     * Sets the value of the Checks field.
     */
    public void setChecks(entity.Check[] value) {
      __getInternalInterface().setFieldValue(CHECKS_PROP.get(), value);
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
     * defers to {@link #setFixedTransactionAmount(gw.api.financials.CurrencyAmount)}; in multicurrency mode, that method
     * should be preferred
     * @param value 
     */
    public void setFixedAmount(java.math.BigDecimal value) {
      ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setFixedAmount(value);
    }
    
    /**
     * Sets the value of the FixedClaimAmount field.
     */
    public void setFixedClaimAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FIXEDCLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FixedReportingAmount field.
     */
    public void setFixedReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FIXEDREPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FixedReservingAmount field.
     */
    public void setFixedReservingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FIXEDRESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FixedTransactionAmount field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setFixedTransactionAmount(gw.api.financials.CurrencyAmount value) {
      ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setFixedTransactionAmount(value);
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
     * Sets the value of the Percentage field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPercentage(java.math.BigDecimal value) {
      ((gw.cc.financials.check.entity.CheckPortion)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckPortion")).setPercentage(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Reissued field.
     */
    public void setReissued(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REISSUED_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal", "com.guidewire.cc.domain.financials.check.impl.CheckPortionImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.check.impl.CheckPortionImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.check.impl.CheckPortionImpl");
    config.put("gw.cc.financials.check.entity.CheckPortion", "com.guidewire.cc.domain.financials.check.impl.CheckPortionImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.CheckPortion.class, config);
    com.guidewire._generated.entity.CheckPortionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.CheckPortion, com.guidewire._generated.entity.CheckPortionInternal>() {
      public java.lang.Object getImplementation(entity.CheckPortion bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CheckPortionInternal getInternalInterface(entity.CheckPortion bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.CheckPortion newEmptyInstance() {
        return new entity.CheckPortion((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}