package entity;

/**
 * ExposureAbstractView
 * Abstract base view entity for efficiently displaying Exposures in list views.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureAbstractView.eti;ExposureAbstractView.eix;ExposureAbstractView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ExposureAbstractView")
public class ExposureAbstractView extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ExposureAbstractView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ExposureAbstractView>("entity.ExposureAbstractView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCLAIMANTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimClaimantName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURECLAIMANT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ExposureClaimant");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURECLAIMANTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureClaimantName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EXPOSURETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ExposureType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PRIMARYCOVERAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PrimaryCoverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINCURREDNET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalIncurredNet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADWEIGHT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkloadWeight");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ExposureAbstractViewInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ExposureAbstractView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ExposureAbstractView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ExposureAbstractView(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ExposureAbstractViewInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ExposureAbstractViewInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ClaimClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimClaimantName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimOrder field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMORDER_PROP.get());
  }
  
  /**
   * Returns the exposure's ClaimantDenorm name if it exists, else the claim's ClaimantDenorm name if it exists, else null.
   * @return the exposure's ClaimantDenorm name if it exists, else the claim's ClaimantDenorm name if it exists, else null
   */
  public java.lang.String getClaimantName() {
    return ((gw.cc.exposure.entity.ExposureAbstractView)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureAbstractView")).getClaimantName();
  }
  
  /**
   * Gets the value of the ExposureClaimant field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getExposureClaimant() {
    return (entity.Contact)__getInternalInterface().getFieldValue(EXPOSURECLAIMANT_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureClaimantName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureType getExposureType() {
    return (typekey.ExposureType)__getInternalInterface().getFieldValue(EXPOSURETYPE_PROP.get());
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
  
  /**
   * Gets the value of the PrimaryCoverage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getPrimaryCoverage() {
    return (typekey.CoverageType)__getInternalInterface().getFieldValue(PRIMARYCOVERAGE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureState getState() {
    return (typekey.ExposureState)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureAbstractView getSubtype() {
    return (typekey.ExposureAbstractView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TotalIncurredNet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNET_PROP.get());
  }
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKLOADWEIGHT_PROP.get());
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
   * Sets the value of the ClaimClaimantName field.
   */
  public void setClaimClaimantName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimOrder field.
   */
  public void setClaimOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureClaimant field.
   */
  public void setExposureClaimant(entity.Contact value) {
    __getInternalInterface().setFieldValue(EXPOSURECLAIMANT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureClaimantName field.
   */
  public void setExposureClaimantName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureType field.
   */
  public void setExposureType(typekey.ExposureType value) {
    __getInternalInterface().setFieldValue(EXPOSURETYPE_PROP.get(), value);
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
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value) {
    __getInternalInterface().setFieldValue(PRIMARYCOVERAGE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ExposureState value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.ExposureAbstractView value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKLOADWEIGHT_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ExposureAbstractViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ExposureAbstractView.this.__getDelegateManager();
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
     * Gets the value of the ClaimClaimantName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimClaimantName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimOrder field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMORDER_PROP.get());
    }
    
    /**
     * Returns the exposure's ClaimantDenorm name if it exists, else the claim's ClaimantDenorm name if it exists, else null.
     * @return the exposure's ClaimantDenorm name if it exists, else the claim's ClaimantDenorm name if it exists, else null
     */
    public java.lang.String getClaimantName() {
      return ((gw.cc.exposure.entity.ExposureAbstractView)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureAbstractView")).getClaimantName();
    }
    
    /**
     * Gets the value of the ExposureClaimant field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getExposureClaimant() {
      return (entity.Contact)__getInternalInterface().getFieldValue(EXPOSURECLAIMANT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureClaimantID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURECLAIMANT_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureClaimantName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureClaimantName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureType field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureType getExposureType() {
      return (typekey.ExposureType)__getInternalInterface().getFieldValue(EXPOSURETYPE_PROP.get());
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
    
    /**
     * Gets the value of the PrimaryCoverage field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageType getPrimaryCoverage() {
      return (typekey.CoverageType)__getInternalInterface().getFieldValue(PRIMARYCOVERAGE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the State field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureState getState() {
      return (typekey.ExposureState)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureAbstractView getSubtype() {
      return (typekey.ExposureAbstractView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TotalIncurredNet field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNET_PROP.get());
    }
    
    /**
     * Gets the value of the WorkloadWeight field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkloadWeight() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKLOADWEIGHT_PROP.get());
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
     * Sets the value of the ClaimClaimantName field.
     */
    public void setClaimClaimantName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCurrency field.
     */
    public void setClaimCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimOrder field.
     */
    public void setClaimOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMORDER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureClaimant field.
     */
    public void setExposureClaimant(entity.Contact value) {
      __getInternalInterface().setFieldValue(EXPOSURECLAIMANT_PROP.get(), value);
    }
    
    public void setExposureClaimantID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURECLAIMANT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureClaimantName field.
     */
    public void setExposureClaimantName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureType field.
     */
    public void setExposureType(typekey.ExposureType value) {
      __getInternalInterface().setFieldValue(EXPOSURETYPE_PROP.get(), value);
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
     * Sets the value of the PrimaryCoverage field.
     */
    public void setPrimaryCoverage(typekey.CoverageType value) {
      __getInternalInterface().setFieldValue(PRIMARYCOVERAGE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.ExposureState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ExposureAbstractView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalIncurredNet field.
     */
    public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkloadWeight field.
     */
    public void setWorkloadWeight(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKLOADWEIGHT_PROP.get(), value);
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
    config.put("gw.cc.exposure.entity.ExposureAbstractView", "com.guidewire.cc.domain.exposure.impl.ExposureAbstractViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ExposureAbstractView.class, config);
    com.guidewire._generated.entity.ExposureAbstractViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ExposureAbstractView, com.guidewire._generated.entity.ExposureAbstractViewInternal>() {
      public java.lang.Object getImplementation(entity.ExposureAbstractView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ExposureAbstractViewInternal getInternalInterface(entity.ExposureAbstractView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ExposureAbstractView newEmptyInstance() {
        return new entity.ExposureAbstractView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}