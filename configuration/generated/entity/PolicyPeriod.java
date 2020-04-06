package entity;

/**
 * PolicyPeriod
 * Represents the period during which an insurance policy provides coverage. Every claim entered into ClaimCenter is associated
 *     with a unique policy entity, even if it shares the same real-world policy with multiple claims.  A policy entity is essentially a "snapshot" of the
 *     real-world policy at the time the claim was entered into ClaimCenter.  The PolicyPeriod entity groups these separate, but related, policy entities
 *     together for the purpose of determining the amount of an aggregate limit or deductible that has been used by the associated claims.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyPeriod.eti;PolicyPeriod.eix;PolicyPeriod.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PolicyPeriod")
public class PolicyPeriod extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PolicyPeriod> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PolicyPeriod>("entity.PolicyPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACCOUNTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AccountNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> AGGREGATELIMITRPTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AggregateLimitRpts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> AGGREGATELIMITS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AggregateLimits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMAGGREGATELIMITRPTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimAggregateLimitRpts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> COVERAGELINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CoverageLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EFFECTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EffectiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIRATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpirationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> POLICIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Policies");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYPERIODTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyPeriodType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYSUFFIX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicySuffix");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.PolicyPeriodInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PolicyPeriod()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PolicyPeriod(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PolicyPeriod(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.PolicyPeriodInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.PolicyPeriodInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the AggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToAggregateLimitRpts(entity.AggregateLimitRpt element) {
    __getInternalInterface().addArrayElement(AGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the AggregateLimits array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToAggregateLimits(entity.AggregateLimit element) {
    __getInternalInterface().addArrayElement(AGGREGATELIMITS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
    __getInternalInterface().addArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToCoverageLines(entity.CoverageLine element) {
    __getInternalInterface().addArrayElement(COVERAGELINES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Policies array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToPolicies(entity.PeriodPolicy element) {
    __getInternalInterface().addArrayElement(POLICIES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AccountNumber field.
   * Account number that the policies of this PolicyPeriod belong to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the AggregateLimitRpts field.
   * Denormalized data for this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AggregateLimitRpt[] getAggregateLimitRpts() {
    return (entity.AggregateLimitRpt[])__getInternalInterface().getFieldValue(AGGREGATELIMITRPTS_PROP.get());
  }
  
  /**
   * Gets the value of the AggregateLimits field.
   * Aggregate limits for the policies in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AggregateLimit[] getAggregateLimits() {
    return (entity.AggregateLimit[])__getInternalInterface().getFieldValue(AGGREGATELIMITS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ClaimAggregateLimitRpts field.
   * Denormalized data for this period per claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts() {
    return (entity.ClaimAggregateLimitRpt[])__getInternalInterface().getFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLines field.
   * Coverage lines associated with this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine[] getCoverageLines() {
    return (entity.CoverageLine[])__getInternalInterface().getFieldValue(COVERAGELINES_PROP.get());
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
   * Gets the value of the EffectiveDate field.
   * Date on which the policy is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EFFECTIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the policy expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EXPIRATIONDATE_PROP.get());
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
   * Gets the value of the Policies field.
   * Policies that belong to this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PeriodPolicy[] getPolicies() {
    return (entity.PeriodPolicy[])__getInternalInterface().getFieldValue(POLICIES_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyPeriodType field.
   * Type of policy period: account or policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyPeriodType getPolicyPeriodType() {
    return (typekey.PolicyPeriodType)__getInternalInterface().getFieldValue(POLICYPERIODTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicySuffix field.
   * Indicates each unique period that a policy has been in effect.  (Sometimes called 'Mod' or 'Module.')
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySuffix() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSUFFIX_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy to which this period applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType() {
    return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
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
   * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimitRpts(entity.AggregateLimitRpt element) {
    __getInternalInterface().removeArrayElement(AGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(AGGREGATELIMITRPTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimits(entity.AggregateLimit element) {
    __getInternalInterface().removeArrayElement(AGGREGATELIMITS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimits(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(AGGREGATELIMITS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
    __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLines(entity.CoverageLine element) {
    __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Policies array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromPolicies(entity.PeriodPolicy element) {
    __getInternalInterface().removeArrayElement(POLICIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Policies array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicies(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(POLICIES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AccountNumber field.
   */
  public void setAccountNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACCOUNTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AggregateLimitRpts field.
   */
  private void setAggregateLimitRpts(entity.AggregateLimitRpt[] value) {
    __getInternalInterface().setFieldValue(AGGREGATELIMITRPTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AggregateLimits field.
   */
  private void setAggregateLimits(entity.AggregateLimit[] value) {
    __getInternalInterface().setFieldValue(AGGREGATELIMITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAggregateLimitRpts field.
   */
  private void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value) {
    __getInternalInterface().setFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLines field.
   */
  private void setCoverageLines(entity.CoverageLine[] value) {
    __getInternalInterface().setFieldValue(COVERAGELINES_PROP.get(), value);
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
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EFFECTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXPIRATIONDATE_PROP.get(), value);
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
   * Sets the value of the Policies field.
   */
  private void setPolicies(entity.PeriodPolicy[] value) {
    __getInternalInterface().setFieldValue(POLICIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyPeriodType field.
   */
  public void setPolicyPeriodType(typekey.PolicyPeriodType value) {
    __getInternalInterface().setFieldValue(POLICYPERIODTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicySuffix field.
   */
  public void setPolicySuffix(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYSUFFIX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value) {
    __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PolicyPeriodInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PolicyPeriod.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the AggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAggregateLimitRpts(entity.AggregateLimitRpt element) {
      __getInternalInterface().addArrayElement(AGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the AggregateLimits array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAggregateLimits(entity.AggregateLimit element) {
      __getInternalInterface().addArrayElement(AGGREGATELIMITS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
      __getInternalInterface().addArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCoverageLines(entity.CoverageLine element) {
      __getInternalInterface().addArrayElement(COVERAGELINES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Policies array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPolicies(entity.PeriodPolicy element) {
      __getInternalInterface().addArrayElement(POLICIES_PROP.get(), element);
    }
    
    public void addToPolicies(entity.Policy policy) {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).addToPolicies(policy);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
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
    
    /**
     * Gets the value of the AccountNumber field.
     * Account number that the policies of this PolicyPeriod belong to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAccountNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the AggregateLimitRpts field.
     * Denormalized data for this period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AggregateLimitRpt[] getAggregateLimitRpts() {
      return (entity.AggregateLimitRpt[])__getInternalInterface().getFieldValue(AGGREGATELIMITRPTS_PROP.get());
    }
    
    /**
     * Gets the value of the AggregateLimits field.
     * Aggregate limits for the policies in this period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AggregateLimit[] getAggregateLimits() {
      return (entity.AggregateLimit[])__getInternalInterface().getFieldValue(AGGREGATELIMITS_PROP.get());
    }
    
    public java.util.List<entity.ClaimInfo> getArchivedClaims() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).getArchivedClaims();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimAggregateLimitRpts field.
     * Denormalized data for this period per claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts() {
      return (entity.ClaimAggregateLimitRpt[])__getInternalInterface().getFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get());
    }
    
    public typekey.Currency getClaimCurrency() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).getClaimCurrency();
    }
    
    /**
     * Gets the value of the CoverageLines field.
     * Coverage lines associated with this period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CoverageLine[] getCoverageLines() {
      return (entity.CoverageLine[])__getInternalInterface().getFieldValue(COVERAGELINES_PROP.get());
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
     * Gets the value of the EffectiveDate field.
     * Date on which the policy is effective.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEffectiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EFFECTIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ExpirationDate field.
     * Date on which the policy expires.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExpirationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXPIRATIONDATE_PROP.get());
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
     * Gets the value of the Policies field.
     * Policies that belong to this period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PeriodPolicy[] getPolicies() {
      return (entity.PeriodPolicy[])__getInternalInterface().getFieldValue(POLICIES_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Number of the policy (generally a string).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyPeriodType field.
     * Type of policy period: account or policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyPeriodType getPolicyPeriodType() {
      return (typekey.PolicyPeriodType)__getInternalInterface().getFieldValue(POLICYPERIODTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySuffix field.
     * Indicates each unique period that a policy has been in effect.  (Sometimes called 'Mod' or 'Module.')
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicySuffix() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSUFFIX_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Type of policy to which this period applies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyType getPolicyType() {
      return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
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
    
    public boolean hasArchivedClaim() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).hasArchivedClaim();
    }
    
    public boolean hasClaimsWithDifferingCurrencies() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).hasClaimsWithDifferingCurrencies();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isExceedsLimit() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isExceedsLimit();
    }
    
    public boolean isExceedsLimit(typekey.AggregateType valueType) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isExceedsLimit(valueType);
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
    
    public boolean isWithinLimit(java.math.BigDecimal amount) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isWithinLimit(amount);
    }
    
    public boolean isWithinLimit(java.math.BigDecimal amount, typekey.AggregateType valueType) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isWithinLimit(amount, valueType);
    }
    
    public boolean isWithinPercentOfLimit(java.math.BigDecimal percent) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isWithinPercentOfLimit(percent);
    }
    
    public boolean isWithinPercentOfLimit(java.math.BigDecimal percent, typekey.AggregateType valueType) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).isWithinPercentOfLimit(percent, valueType);
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
    
    public int rebuildAggregateLimits() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).rebuildAggregateLimits();
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
    
    public void removeAssociatedBeans() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).removeAssociatedBeans();
    }
    
    /**
     * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
     */
    public void removeFromAggregateLimitRpts(entity.AggregateLimitRpt element) {
      __getInternalInterface().removeArrayElement(AGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(AGGREGATELIMITRPTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
     */
    public void removeFromAggregateLimits(entity.AggregateLimit element) {
      __getInternalInterface().removeArrayElement(AGGREGATELIMITS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAggregateLimits(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(AGGREGATELIMITS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
      __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
     */
    public void removeFromCoverageLines(entity.CoverageLine element) {
      __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Policies array. This is achieved by marking the element for removal.
     */
    public void removeFromPolicies(entity.PeriodPolicy element) {
      __getInternalInterface().removeArrayElement(POLICIES_PROP.get(), element);
    }
    
    public void removeFromPolicies(entity.Policy policy) {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).removeFromPolicies(policy);
    }
    
    /**
     * Removes the given element from the Policies array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPolicies(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(POLICIES_PROP.get(), elementID);
    }
    
    public void removeOrphanedCoverageLines() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).removeOrphanedCoverageLines();
    }
    
    public void removeOrphanedRpts() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).removeOrphanedRpts();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AccountNumber field.
     */
    public void setAccountNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ACCOUNTNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AggregateLimitRpts field.
     */
    public void setAggregateLimitRpts(entity.AggregateLimitRpt[] value) {
      __getInternalInterface().setFieldValue(AGGREGATELIMITRPTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AggregateLimits field.
     */
    public void setAggregateLimits(entity.AggregateLimit[] value) {
      __getInternalInterface().setFieldValue(AGGREGATELIMITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAggregateLimitRpts field.
     */
    public void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value) {
      __getInternalInterface().setFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLines field.
     */
    public void setCoverageLines(entity.CoverageLine[] value) {
      __getInternalInterface().setFieldValue(COVERAGELINES_PROP.get(), value);
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
     * Sets the value of the EffectiveDate field.
     */
    public void setEffectiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EFFECTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpirationDate field.
     */
    public void setExpirationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXPIRATIONDATE_PROP.get(), value);
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
    
    public void setPeriodFields(typekey.PolicyPeriodType periodType, entity.Policy policy, gw.entity.IEntityPropertyInfo[] periodColumns) {
      ((com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal")).setPeriodFields(periodType, policy, periodColumns);
    }
    
    /**
     * Sets the value of the Policies field.
     */
    public void setPolicies(entity.PeriodPolicy[] value) {
      __getInternalInterface().setFieldValue(POLICIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyPeriodType field.
     */
    public void setPolicyPeriodType(typekey.PolicyPeriodType value) {
      __getInternalInterface().setFieldValue(POLICYPERIODTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySuffix field.
     */
    public void setPolicySuffix(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSUFFIX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(typekey.PolicyType value) {
      __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal", "com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodImpl");
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
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodImpl");
    config.put("gw.cc.aggregatelimit.entity.PolicyPeriod", "com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PolicyPeriod.class, config);
    com.guidewire._generated.entity.PolicyPeriodInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PolicyPeriod, com.guidewire._generated.entity.PolicyPeriodInternal>() {
      public java.lang.Object getImplementation(entity.PolicyPeriod bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PolicyPeriodInternal getInternalInterface(entity.PolicyPeriod bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PolicyPeriod newEmptyInstance() {
        return new entity.PolicyPeriod((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}