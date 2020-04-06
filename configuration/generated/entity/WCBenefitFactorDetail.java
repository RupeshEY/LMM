package entity;

/**
 * WCBenefitFactorDetail
 * Used to track comments, notes, special exceptions related to the WCBenefitParameterSet
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCBenefitFactorDetail.eti;WCBenefitFactorDetail.eix;WCBenefitFactorDetail.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WCBenefitFactorDetail")
public class WCBenefitFactorDetail extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WCBenefitFactorDetail> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WCBenefitFactorDetail>("entity.WCBenefitFactorDetail");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOPPD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToPPD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOPTD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToPTD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOTPD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToTPD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPLIESTOTTD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppliesToTTD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DETAILEDFACTOR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DetailedFactor");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FACTORCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FactorCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FACTORCOMMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FactorComment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FACTORVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FactorValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> WCBENEFITPARAMETERSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "WCBenefitParameterSet");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.WCBenefitFactorDetailInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WCBenefitFactorDetail()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WCBenefitFactorDetail(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WCBenefitFactorDetail(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.WCBenefitFactorDetailInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.WCBenefitFactorDetailInternal __getInternalInterface() {
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
   * Gets the value of the DetailedFactor field.
   * Used to track notes, exceptions, etc. related to WC Benefits
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WCBenefitFactorType getDetailedFactor() {
    return (typekey.WCBenefitFactorType)__getInternalInterface().getFieldValue(DETAILEDFACTOR_PROP.get());
  }
  
  /**
   * Gets the value of the FactorCategory field.
   * Category of the factor: Duration, EE attribute, etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WCBenefitFactorCategory getFactorCategory() {
    return (typekey.WCBenefitFactorCategory)__getInternalInterface().getFieldValue(FACTORCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the FactorComment field.
   * Comment explaining the reasoning behind this event status line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFactorComment() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FACTORCOMMENT_PROP.get());
  }
  
  /**
   * Gets the value of the FactorValue field.
   * Tracks a value related to the Footnote
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFactorValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FACTORVALUE_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the WCBenefitParameterSet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCBenefitParameterSet getWCBenefitParameterSet() {
    return (entity.WCBenefitParameterSet)__getInternalInterface().getFieldValue(WCBENEFITPARAMETERSET_PROP.get());
  }
  
  /**
   * Gets the value of the AppliesToPPD field.
   * If true, this footnote does not apply to PPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToPPD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOPPD_PROP.get());
  }
  
  /**
   * Gets the value of the AppliesToPTD field.
   * If true, this footnote does not apply to PTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToPTD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOPTD_PROP.get());
  }
  
  /**
   * Gets the value of the AppliesToTPD field.
   * If true, this footnote does not apply to TPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToTPD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOTPD_PROP.get());
  }
  
  /**
   * Gets the value of the AppliesToTTD field.
   * If true, this footnote does not apply to TTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToTTD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOTTD_PROP.get());
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
   * Sets the value of the AppliesToPPD field.
   */
  public void setAppliesToPPD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPLIESTOPPD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AppliesToPTD field.
   */
  public void setAppliesToPTD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPLIESTOPTD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AppliesToTPD field.
   */
  public void setAppliesToTPD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPLIESTOTPD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AppliesToTTD field.
   */
  public void setAppliesToTTD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPLIESTOTTD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DetailedFactor field.
   */
  public void setDetailedFactor(typekey.WCBenefitFactorType value) {
    __getInternalInterface().setFieldValue(DETAILEDFACTOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FactorCategory field.
   */
  public void setFactorCategory(typekey.WCBenefitFactorCategory value) {
    __getInternalInterface().setFieldValue(FACTORCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FactorComment field.
   */
  public void setFactorComment(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FACTORCOMMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FactorValue field.
   */
  public void setFactorValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FACTORVALUE_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the WCBenefitParameterSet field.
   */
  public void setWCBenefitParameterSet(entity.WCBenefitParameterSet value) {
    __getInternalInterface().setFieldValue(WCBENEFITPARAMETERSET_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WCBenefitFactorDetailInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WCBenefitFactorDetail.this.__getDelegateManager();
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
    
    /**
     * Gets the value of the DetailedFactor field.
     * Used to track notes, exceptions, etc. related to WC Benefits
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WCBenefitFactorType getDetailedFactor() {
      return (typekey.WCBenefitFactorType)__getInternalInterface().getFieldValue(DETAILEDFACTOR_PROP.get());
    }
    
    /**
     * Gets the value of the FactorCategory field.
     * Category of the factor: Duration, EE attribute, etc.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WCBenefitFactorCategory getFactorCategory() {
      return (typekey.WCBenefitFactorCategory)__getInternalInterface().getFieldValue(FACTORCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the FactorComment field.
     * Comment explaining the reasoning behind this event status line.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFactorComment() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FACTORCOMMENT_PROP.get());
    }
    
    /**
     * Gets the value of the FactorValue field.
     * Tracks a value related to the Footnote
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFactorValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FACTORVALUE_PROP.get());
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the WCBenefitParameterSet field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.WCBenefitParameterSet getWCBenefitParameterSet() {
      return (entity.WCBenefitParameterSet)__getInternalInterface().getFieldValue(WCBENEFITPARAMETERSET_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getWCBenefitParameterSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(WCBENEFITPARAMETERSET_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AppliesToPPD field.
     * If true, this footnote does not apply to PPD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToPPD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOPPD_PROP.get());
    }
    
    /**
     * Gets the value of the AppliesToPTD field.
     * If true, this footnote does not apply to PTD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToPTD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOPTD_PROP.get());
    }
    
    /**
     * Gets the value of the AppliesToTPD field.
     * If true, this footnote does not apply to TPD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToTPD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOTPD_PROP.get());
    }
    
    /**
     * Gets the value of the AppliesToTTD field.
     * If true, this footnote does not apply to TTD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppliesToTTD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPLIESTOTTD_PROP.get());
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
     * Sets the value of the AppliesToPPD field.
     */
    public void setAppliesToPPD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPLIESTOPPD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AppliesToPTD field.
     */
    public void setAppliesToPTD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPLIESTOPTD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AppliesToTPD field.
     */
    public void setAppliesToTPD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPLIESTOTPD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AppliesToTTD field.
     */
    public void setAppliesToTTD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPLIESTOTTD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DetailedFactor field.
     */
    public void setDetailedFactor(typekey.WCBenefitFactorType value) {
      __getInternalInterface().setFieldValue(DETAILEDFACTOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FactorCategory field.
     */
    public void setFactorCategory(typekey.WCBenefitFactorCategory value) {
      __getInternalInterface().setFieldValue(FACTORCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FactorComment field.
     */
    public void setFactorComment(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FACTORCOMMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FactorValue field.
     */
    public void setFactorValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FACTORVALUE_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the WCBenefitParameterSet field.
     */
    public void setWCBenefitParameterSet(entity.WCBenefitParameterSet value) {
      __getInternalInterface().setFieldValue(WCBENEFITPARAMETERSET_PROP.get(), value);
    }
    
    public void setWCBenefitParameterSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(WCBENEFITPARAMETERSET_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.exposure.entity.WCBenefitFactorDetail", "com.guidewire.cc.domain.exposure.impl.WCBenefitFactorDetailImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WCBenefitFactorDetail.class, config);
    com.guidewire._generated.entity.WCBenefitFactorDetailInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WCBenefitFactorDetail, com.guidewire._generated.entity.WCBenefitFactorDetailInternal>() {
      public java.lang.Object getImplementation(entity.WCBenefitFactorDetail bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WCBenefitFactorDetailInternal getInternalInterface(entity.WCBenefitFactorDetail bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WCBenefitFactorDetail newEmptyInstance() {
        return new entity.WCBenefitFactorDetail((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}