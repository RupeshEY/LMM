package entity;

/**
 * CoverageLine
 * A representation of a coverage based on the coverage's subtype, type, and any associated exposure unit.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CoverageLine.eti;CoverageLine.eix;CoverageLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "CoverageLine")
public class CoverageLine extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, com.guidewire.cc.domain.aggregatelimit.CoverageSpecification {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CoverageLine> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CoverageLine>("entity.CoverageLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> COVERAGELINELIMITS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CoverageLineLimits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVERAGESUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoverageSubtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVERAGETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoverageType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREUNITNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureUnitNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOBCOVERAGESUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LOBCoverageSubtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYPERIOD_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PolicyPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RUPOLICYSYSTEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RUPolicySystemId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CoverageLineInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public CoverageLine()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public CoverageLine(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected CoverageLine(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CoverageLineInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CoverageLineInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the CoverageLineLimits array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToCoverageLineLimits(entity.CoverageLineLimit element) {
    __getInternalInterface().addArrayElement(COVERAGELINELIMITS_PROP.get(), element);
  }
  
  public void fillInBasedOnCoverage(entity.Coverage coverage) {
    ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).fillInBasedOnCoverage(coverage);
  }
  
  public void fillInBasedOnCoverageTypeOnly(typekey.CoverageType coverageType) {
    ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).fillInBasedOnCoverageTypeOnly(coverageType);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CoverageLineLimits field.
   * Coverage line limits that join this coverage line to an aggregate limit. A single coverage line can be shared by more than one aggregate limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineLimit[] getCoverageLineLimits() {
    return (entity.CoverageLineLimit[])__getInternalInterface().getFieldValue(COVERAGELINELIMITS_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageSubtype field.
   * The subclass type of the Coverage, e.g., PolicyCoverage, VehicleCoverage, or PropertyCoverage. This is unrelated to the CoverageSubtype typelist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Coverage getCoverageSubtype() {
    return (typekey.Coverage)__getInternalInterface().getFieldValue(COVERAGESUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageType field.
   * Coverage type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType() {
    return (typekey.CoverageType)__getInternalInterface().getFieldValue(COVERAGETYPE_PROP.get());
  }
  
  /**
   * Builds and returns a display ready String representing this coverage line.
   * @return a human-readable string representing this coverage line
   */
  public java.lang.String getCoveredItemString() {
    return ((gw.cc.aggregatelimit.entity.CoverageLine)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.CoverageLine")).getCoveredItemString();
  }
  
  /**
   * Builds and returns a display ready String representing this coverage line in the context of the given policy.
   * If this coverageline's PolicySystemId is set, and Policy is not null, returns a String referencing the risk unit
   * number of the risk unit with the same PolicySystemId. Otherwise, returns a String referencing the coverageline's
   * exposure unit number, if any.
   * @param policy the policy in whose context the covered item should be displayed
   * @return a human-readable string representing this coverage line
   */
  public java.lang.String getCoveredItemString(entity.Policy policy) {
    return ((gw.cc.aggregatelimit.entity.CoverageLine)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.CoverageLine")).getCoveredItemString(policy);
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
   * Gets the value of the ExposureUnitNumber field.
   * Number of the risk unit for the coverage on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureUnitNumber() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSUREUNITNUMBER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LOBCoverageSubtype field.
   * The CoverageSubtype (from the LOB) that an exposure must have in order to match this CoverageLine
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getLOBCoverageSubtype() {
    return (typekey.CoverageSubtype)__getInternalInterface().getFieldValue(LOBCOVERAGESUBTYPE_PROP.get());
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
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which this CoverageLine is associated. It should be the same PolicyPeriod that is referred to by the AggregateLimits that are linked to this CoverageLine (through CoverageLineLimit entities).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getPolicyPeriod() {
    return (entity.PolicyPeriod)__getInternalInterface().getFieldValue(POLICYPERIOD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RUPolicySystemId field.
   * Identifier for the covered risk unit in an external policy system.  Only applies to those CoverageLines which point to a VehicleCoverage, or PropertyCoverage, or any coverage which extends from RUCoverage and therefore has a RiskUnit with (possibly) a policySystemID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRUPolicySystemId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RUPOLICYSYSTEMID_PROP.get());
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
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  public boolean matchesCoverage(entity.Coverage coverage) {
    return ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).matchesCoverage(coverage);
  }
  
  public boolean matchesCoverageTypeOnly(typekey.CoverageType coverageType) {
    return ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).matchesCoverageTypeOnly(coverageType);
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
   * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLineLimits(entity.CoverageLineLimit element) {
    __getInternalInterface().removeArrayElement(COVERAGELINELIMITS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLineLimits(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(COVERAGELINELIMITS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLineLimits field.
   */
  private void setCoverageLineLimits(entity.CoverageLineLimit[] value) {
    __getInternalInterface().setFieldValue(COVERAGELINELIMITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageSubtype field.
   */
  public void setCoverageSubtype(typekey.Coverage value) {
    __getInternalInterface().setFieldValue(COVERAGESUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value) {
    __getInternalInterface().setFieldValue(COVERAGETYPE_PROP.get(), value);
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
   * Sets the value of the ExposureUnitNumber field.
   */
  public void setExposureUnitNumber(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPOSUREUNITNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LOBCoverageSubtype field.
   */
  public void setLOBCoverageSubtype(typekey.CoverageSubtype value) {
    __getInternalInterface().setFieldValue(LOBCOVERAGESUBTYPE_PROP.get(), value);
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
   * Sets the value of the PolicyPeriod field.
   */
  public void setPolicyPeriod(entity.PolicyPeriod value) {
    __getInternalInterface().setFieldValue(POLICYPERIOD_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RUPolicySystemId field.
   */
  public void setRUPolicySystemId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RUPOLICYSYSTEMID_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CoverageLineInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.CoverageLine.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the CoverageLineLimits array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCoverageLineLimits(entity.CoverageLineLimit element) {
      __getInternalInterface().addArrayElement(COVERAGELINELIMITS_PROP.get(), element);
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
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void fillInBasedOnCoverage(entity.Coverage coverage) {
      ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).fillInBasedOnCoverage(coverage);
    }
    
    public void fillInBasedOnCoverageTypeOnly(typekey.CoverageType coverageType) {
      ((com.guidewire.cc.domain.aggregatelimit.CoverageSpecification)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification")).fillInBasedOnCoverageTypeOnly(coverageType);
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
    
    public java.util.List<entity.AggregateLimitRpt> getAggregateLimitRpts() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).getAggregateLimitRpts();
    }
    
    public java.util.List<entity.AggregateLimit> getAggregateLimits() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).getAggregateLimits();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    public gw.cc.aggregatelimit.entity.CoverageLine.CoverageLineConfiguration getCoverageLineConfiguration() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).getCoverageLineConfiguration();
    }
    
    /**
     * Gets the value of the CoverageLineLimits field.
     * Coverage line limits that join this coverage line to an aggregate limit. A single coverage line can be shared by more than one aggregate limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CoverageLineLimit[] getCoverageLineLimits() {
      return (entity.CoverageLineLimit[])__getInternalInterface().getFieldValue(COVERAGELINELIMITS_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageSubtype field.
     * The subclass type of the Coverage, e.g., PolicyCoverage, VehicleCoverage, or PropertyCoverage. This is unrelated to the CoverageSubtype typelist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Coverage getCoverageSubtype() {
      return (typekey.Coverage)__getInternalInterface().getFieldValue(COVERAGESUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageType field.
     * Coverage type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageType getCoverageType() {
      return (typekey.CoverageType)__getInternalInterface().getFieldValue(COVERAGETYPE_PROP.get());
    }
    
    /**
     * Builds and returns a display ready String representing this coverage line.
     * @return a human-readable string representing this coverage line
     */
    public java.lang.String getCoveredItemString() {
      return ((gw.cc.aggregatelimit.entity.CoverageLine)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.CoverageLine")).getCoveredItemString();
    }
    
    /**
     * Builds and returns a display ready String representing this coverage line in the context of the given policy.
     * If this coverageline's PolicySystemId is set, and Policy is not null, returns a String referencing the risk unit
     * number of the risk unit with the same PolicySystemId. Otherwise, returns a String referencing the coverageline's
     * exposure unit number, if any.
     * @param policy the policy in whose context the covered item should be displayed
     * @return a human-readable string representing this coverage line
     */
    public java.lang.String getCoveredItemString(entity.Policy policy) {
      return ((gw.cc.aggregatelimit.entity.CoverageLine)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.CoverageLine")).getCoveredItemString(policy);
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
     * Gets the value of the ExposureUnitNumber field.
     * Number of the risk unit for the coverage on the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExposureUnitNumber() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSUREUNITNUMBER_PROP.get());
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
     * Gets the value of the LOBCoverageSubtype field.
     * The CoverageSubtype (from the LOB) that an exposure must have in order to match this CoverageLine
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageSubtype getLOBCoverageSubtype() {
      return (typekey.CoverageSubtype)__getInternalInterface().getFieldValue(LOBCOVERAGESUBTYPE_PROP.get());
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
     * Gets the value of the PolicyPeriod field.
     * PolicyPeriod with which this CoverageLine is associated. It should be the same PolicyPeriod that is referred to by the AggregateLimits that are linked to this CoverageLine (through CoverageLineLimit entities).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyPeriod getPolicyPeriod() {
      return (entity.PolicyPeriod)__getInternalInterface().getFieldValue(POLICYPERIOD_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyPeriodID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICYPERIOD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RUPolicySystemId field.
     * Identifier for the covered risk unit in an external policy system.  Only applies to those CoverageLines which point to a VehicleCoverage, or PropertyCoverage, or any coverage which extends from RUCoverage and therefore has a RiskUnit with (possibly) a policySystemID.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRUPolicySystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RUPOLICYSYSTEMID_PROP.get());
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
    
    public boolean isDuplicate() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).isDuplicate();
    }
    
    public boolean isEqual(entity.CoverageLine line) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).isEqual(line);
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
    
    public boolean matchesCoverage(entity.Coverage coverage) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).matchesCoverage(coverage);
    }
    
    public boolean matchesCoverageTypeOnly(typekey.CoverageType coverageType) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).matchesCoverageTypeOnly(coverageType);
    }
    
    public boolean matchesData(com.guidewire.cc.domain.aggregatelimit.CoverageLineMatchData coverageLineMatchData) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).matchesData(coverageLineMatchData);
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
     * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
     */
    public void removeFromCoverageLineLimits(entity.CoverageLineLimit element) {
      __getInternalInterface().removeArrayElement(COVERAGELINELIMITS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCoverageLineLimits(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVERAGELINELIMITS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public boolean safeDelete() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal")).safeDelete();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLineLimits field.
     */
    public void setCoverageLineLimits(entity.CoverageLineLimit[] value) {
      __getInternalInterface().setFieldValue(COVERAGELINELIMITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageSubtype field.
     */
    public void setCoverageSubtype(typekey.Coverage value) {
      __getInternalInterface().setFieldValue(COVERAGESUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageType field.
     */
    public void setCoverageType(typekey.CoverageType value) {
      __getInternalInterface().setFieldValue(COVERAGETYPE_PROP.get(), value);
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
     * Sets the value of the ExposureUnitNumber field.
     */
    public void setExposureUnitNumber(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPOSUREUNITNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LOBCoverageSubtype field.
     */
    public void setLOBCoverageSubtype(typekey.CoverageSubtype value) {
      __getInternalInterface().setFieldValue(LOBCOVERAGESUBTYPE_PROP.get(), value);
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
     * Sets the value of the PolicyPeriod field.
     */
    public void setPolicyPeriod(entity.PolicyPeriod value) {
      __getInternalInterface().setFieldValue(POLICYPERIOD_PROP.get(), value);
    }
    
    public void setPolicyPeriodID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICYPERIOD_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RUPolicySystemId field.
     */
    public void setRUPolicySystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RUPOLICYSYSTEMID_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.aggregatelimit.CoverageSpecification", "com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineImpl");
    config.put("com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal", "com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineImpl");
    config.put("gw.cc.aggregatelimit.entity.CoverageLine", "com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.CoverageLine.class, config);
    com.guidewire._generated.entity.CoverageLineInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.CoverageLine, com.guidewire._generated.entity.CoverageLineInternal>() {
      public java.lang.Object getImplementation(entity.CoverageLine bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CoverageLineInternal getInternalInterface(entity.CoverageLine bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.CoverageLine newEmptyInstance() {
        return new entity.CoverageLine((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}