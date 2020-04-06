package entity;

/**
 * RecoverySearchView
 * Aggregates the information needed to display a Recovery on the Recovery Search page. Subtype of TransactionSearchView.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoverySearchView.eti;RecoverySearchView.eix;RecoverySearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RecoverySearchView")
public class RecoverySearchView extends entity.TransactionSearchView {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RecoverySearchView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RecoverySearchView>("entity.RecoverySearchView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCONTACTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimContactName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RECOVERY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Recovery");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVERYCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecoveryCategory");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RecoverySearchView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RecoverySearchView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RecoverySearchView(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RecoverySearchViewInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RecoverySearchViewInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RecoverySearchViewInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ClaimContact field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimContactName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimContactName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get());
  }
  
  /**
   * obtains the TransactionAmount and ReservingAmount properties as a CurrencyAmount
   * (to allow multicurrency display).  This method can be used in the
   * RecoverySearchResultsLV.pcf if the customer wishes to see the recovery's amount
   * in both the transaction and reserving currencies.
   * @return GrossAmount as a CurrencyAmount
   */
  public gw.api.financials.IMoney getCurrencyAmount() {
    return ((gw.cc.financials.recovery.entity.RecoverySearchView)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySearchView")).getCurrencyAmount();
  }
  
  /**
   * Gets the value of the Recovery field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Recovery getRecovery() {
    return (entity.Recovery)__getInternalInterface().getFieldValue(RECOVERY_PROP.get());
  }
  
  /**
   * Gets the value of the RecoveryCategory field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory() {
    return (typekey.RecoveryCategory)__getInternalInterface().getFieldValue(RECOVERYCATEGORY_PROP.get());
  }
  
  /**
   * Obtains the amount of the recovery in the transaction currency as a CurrencyAmount so that the correct
   * currency icon is displayed.  However, even if this recovery were not created in its claim's currency
   * only the transaction currency amount will be displayed.
   * @return the Transaction Amount as a CurrencyAmount
   */
  public gw.api.financials.CurrencyAmount getTransactionCurrencyAmount() {
    return ((gw.cc.financials.recovery.entity.RecoverySearchView)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySearchView")).getTransactionCurrencyAmount();
  }
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimContactName field.
   */
  public void setClaimContactName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Recovery field.
   */
  public void setRecovery(entity.Recovery value) {
    __getInternalInterface().setFieldValue(RECOVERY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value) {
    __getInternalInterface().setFieldValue(RECOVERYCATEGORY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RecoverySearchViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RecoverySearchView.this.__getDelegateManager();
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
     * Gets the value of the Amount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getClaimAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContact field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getClaimContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContactName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimContactName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CostType field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostType getCostType() {
      return (typekey.CostType)__getInternalInterface().getFieldValue(COSTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCreateUser() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * obtains the TransactionAmount and ReservingAmount properties as a CurrencyAmount
     * (to allow multicurrency display).  This method can be used in the
     * RecoverySearchResultsLV.pcf if the customer wishes to see the recovery's amount
     * in both the transaction and reserving currencies.
     * @return GrossAmount as a CurrencyAmount
     */
    public gw.api.financials.IMoney getCurrencyAmount() {
      return ((gw.cc.financials.recovery.entity.RecoverySearchView)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySearchView")).getCurrencyAmount();
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
     * Gets the value of the Recovery field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Recovery getRecovery() {
      return (entity.Recovery)__getInternalInterface().getFieldValue(RECOVERY_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryCategory field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RecoveryCategory getRecoveryCategory() {
      return (typekey.RecoveryCategory)__getInternalInterface().getFieldValue(RECOVERYCATEGORY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRecoveryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RECOVERY_PROP.get());
    }
    
    /**
     * Gets the value of the ReservingAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReservingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionStatus getStatus() {
      return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionSearchView getSubtype() {
      return (typekey.TransactionSearchView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Obtains the amount of the recovery in the transaction currency as a CurrencyAmount so that the correct
     * currency icon is displayed.  However, even if this recovery were not created in its claim's currency
     * only the transaction currency amount will be displayed.
     * @return the Transaction Amount as a CurrencyAmount
     */
    public gw.api.financials.CurrencyAmount getTransactionCurrencyAmount() {
      return ((gw.cc.financials.recovery.entity.RecoverySearchView)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySearchView")).getTransactionCurrencyAmount();
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
     * Sets the value of the Amount field.
     */
    public void setAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAmount field.
     */
    public void setClaimAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(CLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContact field.
     */
    public void setClaimContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContactName field.
     */
    public void setClaimContactName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCurrency field.
     */
    public void setClaimCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
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
    public void setCreateUser(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CREATEUSER_PROP.get(), value);
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
     * Sets the value of the Recovery field.
     */
    public void setRecovery(entity.Recovery value) {
      __getInternalInterface().setFieldValue(RECOVERY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryCategory field.
     */
    public void setRecoveryCategory(typekey.RecoveryCategory value) {
      __getInternalInterface().setFieldValue(RECOVERYCATEGORY_PROP.get(), value);
    }
    
    public void setRecoveryID(gw.pl.persistence.core.Key value) {
      setFieldValue(RECOVERY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingAmount field.
     */
    public void setReservingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.TransactionStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.TransactionSearchView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    config.put("gw.cc.financials.entity.TransactionSearchView", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySearchViewImpl");
    config.put("gw.cc.financials.recovery.entity.RecoverySearchView", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySearchViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RecoverySearchView.class, config);
    com.guidewire._generated.entity.RecoverySearchViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RecoverySearchView, com.guidewire._generated.entity.RecoverySearchViewInternal>() {
      public java.lang.Object getImplementation(entity.RecoverySearchView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RecoverySearchViewInternal getInternalInterface(entity.RecoverySearchView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RecoverySearchView newEmptyInstance() {
        return new entity.RecoverySearchView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}