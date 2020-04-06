package entity;

/**
 * RUCoverage
 * 
 * A <code>Coverage</code> associated with a <code>RiskUnit</code>.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RUCoverage.eti;RUCoverage.eix;RUCoverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RUCoverage")
public class RUCoverage extends entity.Coverage {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RUCoverage> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RUCoverage>("entity.RUCoverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RISKUNIT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RiskUnit");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RUCoverage()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RUCoverage(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RUCoverage(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RUCoverageInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RUCoverageInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RUCoverageInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the RiskUnit field.
   * RiskUnit associated with the coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RiskUnit getRiskUnit() {
    return (entity.RiskUnit)__getInternalInterface().getFieldValue(RISKUNIT_PROP.get());
  }
  
  /**
   * Sets the value of the RiskUnit field.
   */
  public void setRiskUnit(entity.RiskUnit value) {
    __getInternalInterface().setFieldValue(RISKUNIT_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RUCoverageInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RUCoverage.this.__getDelegateManager();
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    /**
     * Adds the given element to the ClaimDeductibleArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimDeductibleArray(entity.Deductible element) {
      __getInternalInterface().addArrayElement(CLAIMDEDUCTIBLEARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CovTerms array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCovTerms(entity.CovTerm element) {
      __getInternalInterface().addArrayElement(COVTERMS_PROP.get(), element);
    }
    
    /**
     * Determines if the Coverage's Currency can be changed. The OOTB implementation is to disallow a Currency change if
     * the Coverage has a Deductible set on it and the Deductible is marked as paid. (Of course, if the Currency is being
     * set for the very first time, this API doesn't impose any restriction at all)
     * @return true if the Currency can be changed; false otherwise
     */
    public boolean allowCurrencyChange() {
      return ((gw.api.policy.CoverageMethods)__getDelegateManager().getImplementation("gw.api.policy.CoverageMethods")).allowCurrencyChange();
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
    
    /**
     * If this coverage relates to a particular vehicle or property then get the associated vehicle or fixed property
     * incident. If there is no such incident then create a new one. If this coverage is not related to a particular
     * vehicle or property, or if it is part of a policy that is not attached to a claim, then return null
     * @return the incident that is related to this coverage, or the newly created one
     * @deprecated This method is used to pre-populate the incident for an exposure but it does not take
     *   the exposure type into account. For example finding a VehicleIncident makes sense for an exposure
     *   that uses VehicleIncidents but is incorrect for an exposure which does not. So callers should
     *   use the version of this method that takes an exposure type; this version will just return null
     *   if the exposure type is not appropriate for a vehicle or fixed property incident.
     */
    public entity.Incident findOrCreateIncident() {
      return ((gw.cc.policy.entity.Coverage)__getDelegateManager().getImplementation("gw.cc.policy.entity.Coverage")).findOrCreateIncident();
    }
    
    /**
     * If this coverage relates to a particular vehicle or property AND the Exposure is of type which
     * can contain vehicle or fixed property incident then get the associated vehicle or fixed property
     * incident. If there is no such incident then create a new one. Otherwise return null.
     * @param exposureType the type of exposure we are trying to find an incident for
     * @return the incident that is related to this coverage, or the newly created one
     */
    public entity.Incident findOrCreateIncident(typekey.ExposureType exposureType) {
      return ((gw.cc.policy.entity.Coverage)__getDelegateManager().getImplementation("gw.cc.policy.entity.Coverage")).findOrCreateIncident(exposureType);
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
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
     * Gets the value of the ClaimDeductible field.
     * Deductible entity to be applied to a payment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Deductible getClaimDeductible() {
      return (entity.Deductible)__getInternalInterface().getFieldValue(CLAIMDEDUCTIBLE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimDeductibleArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Deductible[] getClaimDeductibleArray() {
      return (entity.Deductible[])__getInternalInterface().getFieldValue(CLAIMDEDUCTIBLEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimDeductibleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMDEDUCTIBLE_PROP.get());
    }
    
    /**
     * Gets the value of the CovTerms field.
     * Additional terms and conditions associated with this Coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CovTerm[] getCovTerms() {
      return (entity.CovTerm[])__getInternalInterface().getFieldValue(COVTERMS_PROP.get());
    }
    
    public typekey.Coverage getCoverageLineType() {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).getCoverageLineType();
    }
    
    public entity.CoverageLine[] getCoverageLines() {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).getCoverageLines();
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
     * Gets the value of the Currency field.
     * The currency of the coverage. Once set, this value can be updated only when CoverageMethods.allowCurrencyChange() returns true.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the Deductible field.
     * Deductible for this coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getDeductible() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DEDUCTIBLE_PROP.get());
    }
    
    /**
     * Gets the value of the EffectiveDate field.
     * Date on which the coverage is effective.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEffectiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EFFECTIVEDATE_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the ExpirationDate field.
     * Date on which the coverage is expired.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExpirationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXPIRATIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureLimit field.
     * Dollar limit per exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getExposureLimit() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(EXPOSURELIMIT_PROP.get());
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
     * Gets the value of the IncidentLimit field.
     * Dollar limit per incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getIncidentLimit() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(INCIDENTLIMIT_PROP.get());
    }
    
    /**
     * Gets the value of the LimitsIndicator field.
     * Whether a coverage type can be combined.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LimitsIndicator getLimitsIndicator() {
      return (typekey.LimitsIndicator)__getInternalInterface().getFieldValue(LIMITSINDICATOR_PROP.get());
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
     * Gets the value of the Notes field.
     * Additional notes on this coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNotes() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOTES_PROP.get());
    }
    
    /**
     * Gets the value of the Policy field.
     * Policy to which the coverage belongs.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Policy getPolicy() {
      return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
    }
    
    /**
     * Retrieves the Currency of the associated Policy entity, if any.
     * @return a member of the Currency typelist, representing the set Currency of this
     *         Coverage's Policy.  Returns NULL if the Policy is unreachable (for example, if
     *         the necessary entity connections have not yet been made).
     * @deprecated use getCurrency() instead, since the Coverage Currency can be different from Policy Currency.
     */
    public typekey.Currency getPolicyCurrency() {
      return ((gw.cc.policy.entity.Coverage)__getDelegateManager().getImplementation("gw.cc.policy.entity.Coverage")).getPolicyCurrency();
    }
    
    public gw.pl.persistence.core.Key getPolicyID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICY_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySystemId field.
     * Identifier for the coverage in an external policy system
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicySystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSYSTEMID_PROP.get());
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
     * Gets the value of the RiskUnit field.
     * RiskUnit associated with the coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RiskUnit getRiskUnit() {
      return (entity.RiskUnit)__getInternalInterface().getFieldValue(RISKUNIT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRiskUnitID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RISKUNIT_PROP.get());
    }
    
    public java.lang.Integer getRiskUnitNumber() {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).getRiskUnitNumber();
    }
    
    public java.lang.String getRiskUnitPolicySystemId() {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).getRiskUnitPolicySystemId();
    }
    
    /**
     * Gets the value of the State field.
     * The state in which this coverage is applicable, if state-specific.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getState() {
      return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Coverage getSubtype() {
      return (typekey.Coverage)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * Type of coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageType getType() {
      return (typekey.CoverageType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
    
    public boolean isCoveragePolicyInPolicyPeriod(entity.PolicyPeriod policyPeriod) {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).isCoveragePolicyInPolicyPeriod(policyPeriod);
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
    
    public entity.CoverageLine newCoverageLine(entity.PolicyPeriod policyPeriod) {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).newCoverageLine(policyPeriod);
    }
    
    public entity.CoverageLine newCoverageLine(entity.PolicyPeriod policyPeriod, typekey.CoverageSubtype coverageSubtype) {
      return ((com.guidewire.cc.domain.policy.impl.CoverageInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.CoverageInternal")).newCoverageLine(policyPeriod, coverageSubtype);
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
     * Removes the given element from the ClaimDeductibleArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimDeductibleArray(entity.Deductible element) {
      __getInternalInterface().removeArrayElement(CLAIMDEDUCTIBLEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimDeductibleArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimDeductibleArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMDEDUCTIBLEARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the CovTerms array. This is achieved by marking the element for removal.
     */
    public void removeFromCovTerms(entity.CovTerm element) {
      __getInternalInterface().removeArrayElement(COVTERMS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CovTerms array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCovTerms(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVTERMS_PROP.get(), elementID);
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
     * Sets the value of the ClaimDeductible field.
     */
    public void setClaimDeductible(entity.Deductible value) {
      __getInternalInterface().setFieldValue(CLAIMDEDUCTIBLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimDeductibleArray field.
     */
    public void setClaimDeductibleArray(entity.Deductible[] value) {
      __getInternalInterface().setFieldValue(CLAIMDEDUCTIBLEARRAY_PROP.get(), value);
    }
    
    public void setClaimDeductibleID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMDEDUCTIBLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CovTerms field.
     */
    public void setCovTerms(entity.CovTerm[] value) {
      __getInternalInterface().setFieldValue(COVTERMS_PROP.get(), value);
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
     * Sets the value of the Currency field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCurrency(typekey.Currency value) {
      ((gw.cc.policy.entity.Coverage)__getDelegateManager().getImplementation("gw.cc.policy.entity.Coverage")).setCurrency(value);
    }
    
    /**
     * Sets the value of the Deductible field.
     */
    public void setDeductible(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(DEDUCTIBLE_PROP.get(), value);
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
     * Sets the value of the ExposureLimit field.
     */
    public void setExposureLimit(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(EXPOSURELIMIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentLimit field.
     */
    public void setIncidentLimit(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(INCIDENTLIMIT_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LimitsIndicator field.
     */
    public void setLimitsIndicator(typekey.LimitsIndicator value) {
      __getInternalInterface().setFieldValue(LIMITSINDICATOR_PROP.get(), value);
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
     * Sets the value of the Notes field.
     */
    public void setNotes(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NOTES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Policy field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPolicy(entity.Policy value) {
      ((gw.cc.policy.entity.Coverage)__getDelegateManager().getImplementation("gw.cc.policy.entity.Coverage")).setPolicy(value);
    }
    
    public void setPolicyID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySystemId field.
     */
    public void setPolicySystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSYSTEMID_PROP.get(), value);
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
     * Sets the value of the RiskUnit field.
     */
    public void setRiskUnit(entity.RiskUnit value) {
      __getInternalInterface().setFieldValue(RISKUNIT_PROP.get(), value);
    }
    
    public void setRiskUnitID(gw.pl.persistence.core.Key value) {
      setFieldValue(RISKUNIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.State value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Coverage value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.CoverageType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.policy.impl.CoverageInternal", "com.guidewire.cc.domain.policy.impl.CoverageImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.policy.impl.CoverageImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.policy.impl.CoverageImpl");
    config.put("gw.api.policy.CoverageMethods", "gw.api.policy.CoverageMethodsImpl");
    config.put("gw.cc.policy.entity.Coverage", "com.guidewire.cc.domain.policy.impl.RUCoverageImpl");
    config.put("gw.cc.policy.entity.RUCoverage", "com.guidewire.cc.domain.policy.impl.RUCoverageImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RUCoverage.class, config);
    com.guidewire._generated.entity.RUCoverageInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RUCoverage, com.guidewire._generated.entity.RUCoverageInternal>() {
      public java.lang.Object getImplementation(entity.RUCoverage bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RUCoverageInternal getInternalInterface(entity.RUCoverage bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RUCoverage newEmptyInstance() {
        return new entity.RUCoverage((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}