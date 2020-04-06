package entity;

/**
 * SubrogationView
 * 
 *         Supports the efficient creation of subrogation lists in ClaimCenter's views. The system uses this entity to list
 *         subrogations in the desktop in an optimum manner. This is a virtual entity and is not stored in the database.       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubrogationView.eti;SubrogationView.eix;SubrogationView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "SubrogationView")
public class SubrogationView extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.SubrogationView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.SubrogationView>("entity.SubrogationView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBROGATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Subrogation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBROGATIONCLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SubrogationClaim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROGATIONREFERRALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubrogationReferralDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBROGATIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SubrogationStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINCURREDNETCLAIM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalIncurredNetClaim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINCURREDNETEXPOSURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalIncurredNetExposure");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.SubrogationViewInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.api.subrogation.PublicSubrogationViewFinder finder = gw.cc.subrogation.entity.SubrogationView.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public SubrogationView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public SubrogationView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected SubrogationView(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.SubrogationViewInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.SubrogationViewInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AssignedUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURENAME_PROP.get());
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
   * Gets the value of the Subrogation field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Subrogation getSubrogation() {
    return (entity.Subrogation)__getInternalInterface().getFieldValue(SUBROGATION_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getSubrogationClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(SUBROGATIONCLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationReferralDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSubrogationReferralDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SUBROGATIONREFERRALDATE_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubrogationStatus getSubrogationStatus() {
    return (typekey.SubrogationStatus)__getInternalInterface().getFieldValue(SUBROGATIONSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubrogationView getSubtype() {
    return (typekey.SubrogationView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Returns the total of expected recovery % of all parties on the claim or exposure.
   * @return the total of expected recovery %
   */
  public java.lang.Double getTotalExpectedRecoveryPercentage() {
    return ((gw.cc.subrogation.entity.SubrogationView)__getDelegateManager().getImplementation("gw.cc.subrogation.entity.SubrogationView")).getTotalExpectedRecoveryPercentage();
  }
  
  /**
   * Returns the Total Net Incurred for the claim or exposure
   * @return the Net Incurred for the claim or exposure
   */
  public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
    return ((gw.cc.subrogation.entity.SubrogationView)__getDelegateManager().getImplementation("gw.cc.subrogation.entity.SubrogationView")).getTotalIncurredNet();
  }
  
  /**
   * Gets the value of the TotalIncurredNetClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNetClaim() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNETCLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the TotalIncurredNetExposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNetExposure() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNETEXPOSURE_PROP.get());
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
   * Sets the value of the AssignedUser field.
   */
  public void setAssignedUser(entity.User value) {
    __getInternalInterface().setFieldValue(ASSIGNEDUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureName field.
   */
  public void setExposureName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPOSURENAME_PROP.get(), value);
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
   * Sets the value of the Subrogation field.
   */
  public void setSubrogation(entity.Subrogation value) {
    __getInternalInterface().setFieldValue(SUBROGATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationClaim field.
   */
  public void setSubrogationClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(SUBROGATIONCLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationReferralDate field.
   */
  public void setSubrogationReferralDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SUBROGATIONREFERRALDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationStatus field.
   */
  public void setSubrogationStatus(typekey.SubrogationStatus value) {
    __getInternalInterface().setFieldValue(SUBROGATIONSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.SubrogationView value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalIncurredNetClaim field.
   */
  public void setTotalIncurredNetClaim(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALINCURREDNETCLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalIncurredNetExposure field.
   */
  public void setTotalIncurredNetExposure(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALINCURREDNETEXPOSURE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.SubrogationViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.SubrogationView.this.__getDelegateManager();
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
     * Gets the value of the AssignedUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the Exposure field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURENAME_PROP.get());
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
     * Gets the value of the Subrogation field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Subrogation getSubrogation() {
      return (entity.Subrogation)__getInternalInterface().getFieldValue(SUBROGATION_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationClaim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getSubrogationClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(SUBROGATIONCLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubrogationClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBROGATIONCLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubrogationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBROGATION_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationReferralDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSubrogationReferralDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SUBROGATIONREFERRALDATE_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubrogationStatus getSubrogationStatus() {
      return (typekey.SubrogationStatus)__getInternalInterface().getFieldValue(SUBROGATIONSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubrogationView getSubtype() {
      return (typekey.SubrogationView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Returns the total of expected recovery % of all parties on the claim or exposure.
     * @return the total of expected recovery %
     */
    public java.lang.Double getTotalExpectedRecoveryPercentage() {
      return ((gw.cc.subrogation.entity.SubrogationView)__getDelegateManager().getImplementation("gw.cc.subrogation.entity.SubrogationView")).getTotalExpectedRecoveryPercentage();
    }
    
    /**
     * Returns the Total Net Incurred for the claim or exposure
     * @return the Net Incurred for the claim or exposure
     */
    public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
      return ((gw.cc.subrogation.entity.SubrogationView)__getDelegateManager().getImplementation("gw.cc.subrogation.entity.SubrogationView")).getTotalIncurredNet();
    }
    
    /**
     * Gets the value of the TotalIncurredNetClaim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalIncurredNetClaim() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNETCLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the TotalIncurredNetExposure field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalIncurredNetExposure() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNETEXPOSURE_PROP.get());
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
     * Sets the value of the AssignedUser field.
     */
    public void setAssignedUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDUSER_PROP.get(), value);
    }
    
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCurrency field.
     */
    public void setClaimCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
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
     * Sets the value of the ExposureName field.
     */
    public void setExposureName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSURENAME_PROP.get(), value);
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
     * Sets the value of the Subrogation field.
     */
    public void setSubrogation(entity.Subrogation value) {
      __getInternalInterface().setFieldValue(SUBROGATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationClaim field.
     */
    public void setSubrogationClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(SUBROGATIONCLAIM_PROP.get(), value);
    }
    
    public void setSubrogationClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUBROGATIONCLAIM_PROP.get(), value);
    }
    
    public void setSubrogationID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUBROGATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationReferralDate field.
     */
    public void setSubrogationReferralDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SUBROGATIONREFERRALDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationStatus field.
     */
    public void setSubrogationStatus(typekey.SubrogationStatus value) {
      __getInternalInterface().setFieldValue(SUBROGATIONSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.SubrogationView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalIncurredNetClaim field.
     */
    public void setTotalIncurredNetClaim(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALINCURREDNETCLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalIncurredNetExposure field.
     */
    public void setTotalIncurredNetExposure(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALINCURREDNETEXPOSURE_PROP.get(), value);
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
    config.put("gw.cc.subrogation.entity.SubrogationView", "com.guidewire.cc.domain.subrogation.impl.SubrogationViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.SubrogationView.class, config);
    com.guidewire._generated.entity.SubrogationViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.SubrogationView, com.guidewire._generated.entity.SubrogationViewInternal>() {
      public java.lang.Object getImplementation(entity.SubrogationView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.SubrogationViewInternal getInternalInterface(entity.SubrogationView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.SubrogationView newEmptyInstance() {
        return new entity.SubrogationView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}