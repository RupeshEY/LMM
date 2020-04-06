package entity;

/**
 * TmpTAccountCreditDebit
 * Temp table for upgrade to taccounts.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountCreditDebit.eti;TmpTAccountCreditDebit.eix;TmpTAccountCreditDebit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAccountCreditDebit")
public class TmpTAccountCreditDebit extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAccountCreditDebit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAccountCreditDebit>("entity.TmpTAccountCreditDebit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPCREDITBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpCreditBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPCREDITBALANCEREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpCreditBalanceReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPCREDITBALANCERESERVING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpCreditBalanceReserving");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPDEBITBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpDebitBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPDEBITBALANCEREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpDebitBalanceReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPDEBITBALANCERESERVING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpDebitBalanceReserving");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPNUMCONTRIBUTINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpNumContributingTxns");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAccountCreditDebitInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAccountCreditDebit()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAccountCreditDebit(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAccountCreditDebit(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAccountCreditDebitInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAccountCreditDebitInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * 
   * @return Unique identifier of the object.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the TmpCreditBalance field.
   * Temp credit balance for claim amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCE_PROP.get());
  }
  
  /**
   * Gets the value of the TmpCreditBalanceReporting field.
   * Temp credit balance for reporting amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalanceReporting() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCEREPORTING_PROP.get());
  }
  
  /**
   * Gets the value of the TmpCreditBalanceReserving field.
   * Temp credit balance for reserving amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalanceReserving() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCERESERVING_PROP.get());
  }
  
  /**
   * Gets the value of the TmpDebitBalance field.
   * Temp debit balance for claim amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalance() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCE_PROP.get());
  }
  
  /**
   * Gets the value of the TmpDebitBalanceReporting field.
   * Temp debit balance for reporting amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalanceReporting() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCEREPORTING_PROP.get());
  }
  
  /**
   * Gets the value of the TmpDebitBalanceReserving field.
   * Temp debit balance for reserving amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalanceReserving() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCERESERVING_PROP.get());
  }
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * temp field for the number of contributing transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the TmpCreditBalance field.
   */
  public void setTmpCreditBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPCREDITBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpCreditBalanceReporting field.
   */
  public void setTmpCreditBalanceReporting(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPCREDITBALANCEREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpCreditBalanceReserving field.
   */
  public void setTmpCreditBalanceReserving(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPCREDITBALANCERESERVING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpDebitBalance field.
   */
  public void setTmpDebitBalance(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPDEBITBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpDebitBalanceReporting field.
   */
  public void setTmpDebitBalanceReporting(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPDEBITBALANCEREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpDebitBalanceReserving field.
   */
  public void setTmpDebitBalanceReserving(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TMPDEBITBALANCERESERVING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAccountCreditDebitInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAccountCreditDebit.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the TmpCreditBalance field.
     * Temp credit balance for claim amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpCreditBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCE_PROP.get());
    }
    
    /**
     * Gets the value of the TmpCreditBalanceReporting field.
     * Temp credit balance for reporting amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpCreditBalanceReporting() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCEREPORTING_PROP.get());
    }
    
    /**
     * Gets the value of the TmpCreditBalanceReserving field.
     * Temp credit balance for reserving amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpCreditBalanceReserving() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPCREDITBALANCERESERVING_PROP.get());
    }
    
    /**
     * Gets the value of the TmpDebitBalance field.
     * Temp debit balance for claim amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpDebitBalance() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCE_PROP.get());
    }
    
    /**
     * Gets the value of the TmpDebitBalanceReporting field.
     * Temp debit balance for reporting amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpDebitBalanceReporting() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCEREPORTING_PROP.get());
    }
    
    /**
     * Gets the value of the TmpDebitBalanceReserving field.
     * Temp debit balance for reserving amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTmpDebitBalanceReserving() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TMPDEBITBALANCERESERVING_PROP.get());
    }
    
    /**
     * Gets the value of the TmpNumContributingTxns field.
     * temp field for the number of contributing transactions
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTmpNumContributingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the TmpCreditBalance field.
     */
    public void setTmpCreditBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPCREDITBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpCreditBalanceReporting field.
     */
    public void setTmpCreditBalanceReporting(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPCREDITBALANCEREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpCreditBalanceReserving field.
     */
    public void setTmpCreditBalanceReserving(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPCREDITBALANCERESERVING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpDebitBalance field.
     */
    public void setTmpDebitBalance(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPDEBITBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpDebitBalanceReporting field.
     */
    public void setTmpDebitBalanceReporting(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPDEBITBALANCEREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpDebitBalanceReserving field.
     */
    public void setTmpDebitBalanceReserving(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TMPDEBITBALANCERESERVING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpNumContributingTxns field.
     */
    public void setTmpNumContributingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpTAccountCreditDebit", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAccountCreditDebitImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAccountCreditDebit.class, config);
    com.guidewire._generated.entity.TmpTAccountCreditDebitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAccountCreditDebit, com.guidewire._generated.entity.TmpTAccountCreditDebitInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAccountCreditDebit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAccountCreditDebitInternal getInternalInterface(entity.TmpTAccountCreditDebit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAccountCreditDebit newEmptyInstance() {
        return new entity.TmpTAccountCreditDebit((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}