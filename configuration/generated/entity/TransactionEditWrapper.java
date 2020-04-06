package entity;

/**
 * TransactionEditWrapper
 * Wraps a Transaction to keep track of a new amount entered by the user. Used with TransactionWizardHelper. Internally stores an amount in the claim currency and in the currency of the transaction.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionEditWrapper.eti;TransactionEditWrapper.eix;TransactionEditWrapper.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TransactionEditWrapper")
public class TransactionEditWrapper extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TransactionEditWrapper> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TransactionEditWrapper>("entity.TransactionEditWrapper");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWRESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewReservingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewTransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREVBASEAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PrevBaseAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PREVRESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PrevReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSACTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Transaction");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TransactionEditWrapperInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TransactionEditWrapper()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TransactionEditWrapper(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TransactionEditWrapper(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TransactionEditWrapperInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TransactionEditWrapperInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of <code>Transaction.Currency</code>
   * @return the value of <code>Transaction.Currency</code>
   */
  public typekey.Currency getCurrency() {
    return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getCurrency();
  }
  
  /**
   * Gets the value of <code>Transaction.TransToReservingExchangeRateRate</code>
   * @return the value of <code>Transaction.TransToReservingExchangeRateRate</code>
   */
  @gw.datatype.annotation.DataType(name = "exchangerate")
  public java.math.BigDecimal getExchangeRateRate() {
    return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getExchangeRateRate();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets an IMutableMoney to be used for editing the amount in the reserving currency. When the amount is mutated, the
   * amount is saved to the internal reserving amount and transaction amount properties, and the Transaction's currency is
   * set to it's reserving currency.
   * @return an IMutableMoney to be used for modifying the amount in the reserving currency
   */
  public gw.api.financials.IMutableMoney getNewAmountInReservingCurrency() {
    return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getNewAmountInReservingCurrency();
  }
  
  /**
   * Gets an IMutablePairedMoney to be used for editing the amount in the transaction currency. The secondary amount
   * is equal to the internal reserving amount.
   * @return an IMutablePairedMoney to be used for modifying the amount in the transaction currency in the UI
   */
  public gw.api.financials.IMutableMoney getNewAmountInTransactionCurrency() {
    return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getNewAmountInTransactionCurrency();
  }
  
  /**
   * Gets the value of the NewReservingAmount field.
   * Internal storage of the amount in the reserving currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNewReservingAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NEWRESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the NewTransactionAmount field.
   * Internal storage of the amount in the transaction currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNewTransactionAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NEWTRANSACTIONAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of <code>Transaction.OverrideTransToReservingExchangeRate</code>
   * @return the value of <code>Transaction.OverrideTransToReservingExchangeRate</code>
   */
  public boolean getOverrideExchangeRate() {
    return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getOverrideExchangeRate();
  }
  
  /**
   * Gets the value of the PrevBaseAmount field.
   * The base amount in the reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the base amount has changed and therefore whether the amount properties should be reset when the reserve line changes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPrevBaseAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVBASEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the PrevReservingCurrency field.
   * The previous reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the reserving currency has changed and therefore whether the amount properties should be reset when the reserve line changes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPrevReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(PREVRESERVINGCURRENCY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Transaction field.
   * Wrapped transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction() {
    return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of <code>Transaction.Currency</code> and updates the internal reserving amount
   * property based on the transaction amount and the new exchange rate.
   * @param c 
   */
  public void setCurrency(typekey.Currency c) {
    ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setCurrency(c);
  }
  
  /**
   * Sets the value of <code>Transaction.TransToReservingExchangeRateRate</code> and updates the internal reserving amount
   * property based on the transaction amount and the new exchange rate.
   * @param r 
   */
  public void setExchangeRateRate(java.math.BigDecimal r) {
    ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setExchangeRateRate(r);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewReservingAmount field.
   */
  public void setNewReservingAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(NEWRESERVINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewTransactionAmount field.
   */
  public void setNewTransactionAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(NEWTRANSACTIONAMOUNT_PROP.get(), value);
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
   * Sets the value of <code>Transaction.OverrideTransToReservingExchangeRate</code> and updates the internal reserving amount
   * property based on the transaction amount and the new exchange rate.
   * @param o 
   */
  public void setOverrideExchangeRate(boolean o) {
    ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setOverrideExchangeRate(o);
  }
  
  /**
   * Sets the value of the PrevBaseAmount field.
   */
  public void setPrevBaseAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PREVBASEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PrevReservingCurrency field.
   */
  public void setPrevReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(PREVRESERVINGCURRENCY_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value) {
    __getInternalInterface().setFieldValue(TRANSACTION_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TransactionEditWrapperInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TransactionEditWrapper.this.__getDelegateManager();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    public typekey.Currency getClaimCurrency() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal")).getClaimCurrency();
    }
    
    /**
     * Gets the value of <code>Transaction.Currency</code>
     * @return the value of <code>Transaction.Currency</code>
     */
    public typekey.Currency getCurrency() {
      return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getCurrency();
    }
    
    /**
     * Gets the value of <code>Transaction.TransToReservingExchangeRateRate</code>
     * @return the value of <code>Transaction.TransToReservingExchangeRateRate</code>
     */
    @gw.datatype.annotation.DataType(name = "exchangerate")
    public java.math.BigDecimal getExchangeRateRate() {
      return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getExchangeRateRate();
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
     * Gets an IMutableMoney to be used for editing the amount in the reserving currency. When the amount is mutated, the
     * amount is saved to the internal reserving amount and transaction amount properties, and the Transaction's currency is
     * set to it's reserving currency.
     * @return an IMutableMoney to be used for modifying the amount in the reserving currency
     */
    public gw.api.financials.IMutableMoney getNewAmountInReservingCurrency() {
      return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getNewAmountInReservingCurrency();
    }
    
    /**
     * Gets an IMutablePairedMoney to be used for editing the amount in the transaction currency. The secondary amount
     * is equal to the internal reserving amount.
     * @return an IMutablePairedMoney to be used for modifying the amount in the transaction currency in the UI
     */
    public gw.api.financials.IMutableMoney getNewAmountInTransactionCurrency() {
      return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getNewAmountInTransactionCurrency();
    }
    
    /**
     * Gets the value of the NewReservingAmount field.
     * Internal storage of the amount in the reserving currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getNewReservingAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NEWRESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the NewTransactionAmount field.
     * Internal storage of the amount in the transaction currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getNewTransactionAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NEWTRANSACTIONAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of <code>Transaction.OverrideTransToReservingExchangeRate</code>
     * @return the value of <code>Transaction.OverrideTransToReservingExchangeRate</code>
     */
    public boolean getOverrideExchangeRate() {
      return ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).getOverrideExchangeRate();
    }
    
    /**
     * Gets the value of the PrevBaseAmount field.
     * The base amount in the reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the base amount has changed and therefore whether the amount properties should be reset when the reserve line changes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPrevBaseAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PREVBASEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the PrevReservingCurrency field.
     * The previous reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the reserving currency has changed and therefore whether the amount properties should be reset when the reserve line changes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getPrevReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(PREVRESERVINGCURRENCY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public typekey.Currency getReservingCurrency() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal")).getReservingCurrency();
    }
    
    /**
     * Gets the value of the Transaction field.
     * Wrapped transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction getTransaction() {
      return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransactionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSACTION_PROP.get());
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of <code>Transaction.Currency</code> and updates the internal reserving amount
     * property based on the transaction amount and the new exchange rate.
     * @param c 
     */
    public void setCurrency(typekey.Currency c) {
      ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setCurrency(c);
    }
    
    /**
     * Sets the value of <code>Transaction.TransToReservingExchangeRateRate</code> and updates the internal reserving amount
     * property based on the transaction amount and the new exchange rate.
     * @param r 
     */
    public void setExchangeRateRate(java.math.BigDecimal r) {
      ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setExchangeRateRate(r);
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
     * Sets the value of the NewReservingAmount field.
     */
    public void setNewReservingAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(NEWRESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewTransactionAmount field.
     */
    public void setNewTransactionAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(NEWTRANSACTIONAMOUNT_PROP.get(), value);
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
     * Sets the value of <code>Transaction.OverrideTransToReservingExchangeRate</code> and updates the internal reserving amount
     * property based on the transaction amount and the new exchange rate.
     * @param o 
     */
    public void setOverrideExchangeRate(boolean o) {
      ((gw.cc.financials.entity.TransactionEditWrapper)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionEditWrapper")).setOverrideExchangeRate(o);
    }
    
    /**
     * Sets the value of the PrevBaseAmount field.
     */
    public void setPrevBaseAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PREVBASEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrevReservingCurrency field.
     */
    public void setPrevReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(PREVRESERVINGCURRENCY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Transaction field.
     */
    public void setTransaction(entity.Transaction value) {
      __getInternalInterface().setFieldValue(TRANSACTION_PROP.get(), value);
    }
    
    public void setTransactionID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSACTION_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal", "com.guidewire.cc.domain.financials.impl.TransactionEditWrapperImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.entity.TransactionEditWrapper", "com.guidewire.cc.domain.financials.impl.TransactionEditWrapperImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TransactionEditWrapper.class, config);
    com.guidewire._generated.entity.TransactionEditWrapperInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TransactionEditWrapper, com.guidewire._generated.entity.TransactionEditWrapperInternal>() {
      public java.lang.Object getImplementation(entity.TransactionEditWrapper bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TransactionEditWrapperInternal getInternalInterface(entity.TransactionEditWrapper bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TransactionEditWrapper newEmptyInstance() {
        return new entity.TransactionEditWrapper((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}