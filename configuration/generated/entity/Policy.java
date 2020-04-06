package entity;

/**
 * Policy
 * 
 * Describes an insurance policy against which a claim has been filed. When a claim
 * is entered in the system, the policy search adapter retrieves the policy
 * information from an external system, stores it as a unique <code>Policy</code>,
 * and associates it to the claim.  There is a one-to-one relationship between
 * claims and policies in the system.  If multiple claims have been filed against
 * the same actual policy, there will be a distinct <code>Policy</code> for every
 * <code>Claim</code> in the system.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Policy.eti;Policy.eix;Policy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Policy")
public class Policy extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Extractable, entity.ClaimContactRoleOwner, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Policy> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Policy>("entity.Policy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACCOUNTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AccountNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNEDRISK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignedRisk");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELLATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CancellationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLASSCODES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClassCodes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CONTACTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Contacts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVERAGEFORM_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoverageForm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> COVERAGES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Coverages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CUSTOMERSERVICETIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CustomerServiceTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EFFECTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EffectiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ENDORSEMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Endorsements");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIRATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpirationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FINANCIALINTERESTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FinancialInterests");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FOREIGNCOVERAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForeignCoverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDSICCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredSICCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Notes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ORIGEFFECTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OrigEffectiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERINSINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OtherInsInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERINSURANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OtherInsurance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PARTICIPATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Participation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> POLICYLOCATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PolicyLocations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYRATINGPLAN_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyRatingPlan");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYSOURCE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicySource");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYSUFFIX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicySuffix");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYSYSTEMPERIODID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicySystemPeriodID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PRODUCERCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProducerCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTINGDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportingDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETROACTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetroactiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOWORKPRGM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToWorkPrgm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RISKUNITS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RiskUnits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> STATCODES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "StatCodes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPROPERTIES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalProperties");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALVEHICLES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalVehicles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> UNDERWRITINGCO_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "UnderwritingCo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> UNDERWRITINGGROUP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "UnderwritingGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VERIFIED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Verified");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WCOTHERSTATES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WCOtherStates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WCSTATES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WCStates");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.PolicyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.policy.PolicyFinder finder = gw.cc.policy.entity.Policy.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Policy()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Policy(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Policy(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.PolicyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.PolicyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given coverage to the policy. Also defaults the Coverage's Currency to Policy Currency, if not set.
   * @param coverage the coverage to add
   */
  public void addCoverage(entity.PolicyCoverage coverage) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addCoverage(coverage);
  }
  
  /**
   * Adds an empty ClaimContactRole to this owner. It is assumed that the Contact associated with the role
   * will be filled in later. The role must be Required or ZeroToMore.
   * @param role 
   * @throws IllegalArgumentException if the role is prohibited or exclusive
   */
  public entity.ClaimContactRole addEmptyRole(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addEmptyRole(role);
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
   * Adds a role with the specified contact to this entity. This method should only be used with Required or ZeroToMore
   * roles. For Exclusive roles, just set the property with the name of the role.
   * Does nothing if the Contact already has the role.
   * @param role 
   * @param contact 
   * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
   * right type for the given role. For exclusive roles, use
   * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, gw.pl.contact.entity.Contact)} instead.
   */
  public entity.ClaimContactRole addRole(typekey.ContactRole role, entity.Contact contact) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addRole(role, contact);
  }
  
  /**
   * Adds the given element to the ClassCodes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClassCodes(entity.ClassCode element) {
    __getInternalInterface().addArrayElement(CLASSCODES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToContacts(entity.ClaimContact element) {
    __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Coverages array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToCoverages(entity.PolicyCoverage value) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToCoverages(value);
  }
  
  /**
   * Adds the given element to the Endorsements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEndorsements(entity.Endorsement element) {
    __getInternalInterface().addArrayElement(ENDORSEMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the PolicyLocations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPolicyLocations(entity.PolicyLocation element) {
    __getInternalInterface().addArrayElement(POLICYLOCATIONS_PROP.get(), element);
  }
  
  /**
   * Adds this policy to the given PolicyPeriod.  If this policy already belongs
   * to the PolicyPeriod, then does nothing.
   * @param policyPeriod the PolicyPeriod to add
   */
  public void addToPolicyPeriods(entity.PolicyPeriod policyPeriod) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToPolicyPeriods(policyPeriod);
  }
  
  /**
   * Adds the given element to the RiskUnits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRiskUnits(entity.RiskUnit element) {
    __getInternalInterface().addArrayElement(RISKUNITS_PROP.get(), element);
  }
  
  /**
   * Assigns an "RUNumber" to the {@link entity.RiskUnit} before
   * calling {@link PolicyStubI#addToRiskUnits(entity.RiskUnit)} to add it
   * @param riskUnit The risk unit
   */
  public void addToRiskUnitsAndAssignRUNumber(entity.RiskUnit riskUnit) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToRiskUnitsAndAssignRUNumber(riskUnit);
  }
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element) {
    __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the StatCodes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatCodes(entity.StatCode element) {
    __getInternalInterface().addArrayElement(STATCODES_PROP.get(), element);
  }
  
  /**
   * Returns false if the property is referenced by the claim, any exposure or any exposure
   * coverage.  Does not check if the property is referenced by any RiskUnits.
   * @param property the property to test whether it is allowed to be removed
   * @return false if the given property is referenced by the claim, any exposure, or any exposure coverage, false otherwise
   */
  public boolean allowPropertyRemoval(entity.PolicyLocation property) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).allowPropertyRemoval(property);
  }
  
  /**
   * Returns false if the vehicle is referenced by the claim, any exposure or any exposure
   * coverage.
   * @param v the Vehicle to test whether it is allowed to be removed
   * @return false if the vehicle is referenced by the claim, any exposure or any exposure coverage, true otherwise
   */
  public boolean allowVehicleRemoval(entity.Vehicle v) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).allowVehicleRemoval(v);
  }
  
  /**
   * Determines whether this owner can be edited.
   */
  public boolean canEdit() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
  }
  
  /**
   * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
   * object describing the problem.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkAddRole(role, contact);
  }
  
  /**
   * Determines whether or not the given role can be removed the given number of times.
   * @param role 
   * @param count number of instances of the role to be removed
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRemoveRole(role, count);
  }
  
  /**
   * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
   * of adding a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
   * instead.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleAdded(role, contact);
  }
  
  /**
   * Checks the removal of the given role, after it has occurred. To check the validity
   * of removing a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
   * instead.
   * @param role 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleRemoved(role);
  }
  
  /**
   */
  public void clearRoleCache() {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
  }
  
  /**
   * Check whether a contact is covered by this policy.
   * @param contact the contact to search the covered parties for
   * @return true iff the contact individual id is the same as one of our covered parties.
   */
  public boolean containsCoveredParty(entity.Contact contact) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).containsCoveredParty(contact);
  }
  
  /**
   * Check whether a contact is excluded from this policy.
   * @param contact the excluded party to search for.
   * @return true iff the Contact already exists in the set of excluded parties.
   */
  public boolean containsExcludedParty(entity.Contact contact) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).containsExcludedParty(contact);
  }
  
  /**
   * Returns an empty Endorsement linked to this policy.
   * @return an empty Endorsement linked to this policy
   */
  public entity.Endorsement createEndorsement() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createEndorsement();
  }
  
  /**
   * Returns a new LocationBasedRU of the subtype specified by riskUnitType.
   * @param riskUnitType the type of LocationBasedRU
   * @throws IllegalArgumentException if riskUnitType is not a subtype of LocationBasedRU
   * @return a new {@link entity.LocationBasedRU} linked to this policy
   */
  public entity.LocationBasedRU createLocationBasedRU(gw.entity.IEntityType riskUnitType) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createLocationBasedRU(riskUnitType);
  }
  
  /**
   * Returns a new {@link entity.PolicyLocation} linked to this policy.
   * @return The new policy location
   */
  public entity.PolicyLocation createPolicyLocation() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createPolicyLocation();
  }
  
  /**
   * Returns an empty statcode linked to this policy object.
   * @return an empty statcode linked to this policy object
   */
  public entity.StatCode createStatCode() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createStatCode();
  }
  
  /**
   * Returns a PolicyVehicle. The vehicle of the PolicyVehicle is a newly
   * created, editable, but empty vehicle. The PolicyVehicle is initialized with
   * the vehicle, policy and vehicle number
   * @return an empty policyvehicle linked to this policy object
   */
  public entity.VehicleRU createVehicleRU() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createVehicleRU();
  }
  
  /**
   * Gets the value of the AccountNumber field.
   * Account number that this Policy belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNUMBER_PROP.get());
  }
  
  /**
   * Returns an array of addresses associated with the Policy through both
   * PolicyLocations and Contacts.
   * @return The addresses
   */
  public entity.Address[] getAddresses() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAddresses();
  }
  
  /**
   * Returns all coverages on this policy, i.e., policy-level, vehicle, and
   * property coverages.
   * @return all coverages on this policy
   */
  public entity.Coverage[] getAllCoverages() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAllCoverages();
  }
  
  /**
   * Returns all allowed contact roles for a policy
   * @return a list of allowed contact roles for a policy
   */
  public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAllowedContactRolesForEntity();
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
   * Gets the value of the CancellationDate field.
   * Date on which the policy was canceled.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCancellationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CANCELLATIONDATE_PROP.get());
  }
  
  /**
   * Gets the list of stat codes returned by {@link #getStatCodes()} but sorts it by
   * display name and then caps it if it is longer than {@link #getStatCodeListCap()}.
   * Typically used to build a select list in the UI where the list should not be too
   * long, and any additional values can be added via a picker.
   * @return an array of stat codes, at most {@link #getStatCodeListCap()} long. May be empty
   *   but is never null
   */
  public entity.StatCode[] getCappedStatCodes() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getCappedStatCodes();
  }
  
  /**
   * Gets the value of the Claim field.
   * The claim that references this policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim[] getClaimArray() {
    return (entity.Claim[])__getInternalInterface().getFieldValue(CLAIMARRAY_PROP.get());
  }
  
  /**
   * Get the directly related ClaimContact with the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContact or null if none exists
   */
  public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactByRole(role);
  }
  
  /**
   * Gets the ClaimContactRole in the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContactRole or null if none exists.
   */
  public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRoleByRole(role);
  }
  
  /**
   * Gets the directly related ClaimContactRoles in the given role.
   * @param role 
   */
  public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRolesByRole(role);
  }
  
  /**
   * Gets the directly related ClaimContacts with the given role.
   * @param role 
   */
  public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRole(role);
  }
  
  public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRoles(roles);
  }
  
  /**
   * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
   * object.
   * <br>If you need all contacts, including those that are indirectly related to the Claim, use
   * {@link entity.Claim#getContacts()}
   */
  public entity.ClaimContact[] getClaimContactsForAllRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsForAllRoles();
  }
  
  /**
   * Gets the claim linked to this policy wrapped in an array, for the sake of backwards compatibility.
   * @return an array contain the claim (if any) associated with this policy
   * @deprecated please use getClaim instead
   */
  public entity.Claim[] getClaims() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getClaims();
  }
  
  /**
   * Gets the value of the ClassCodes field.
   * List of class codes covered by the Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassCode[] getClassCodes() {
    return (entity.ClassCode[])__getInternalInterface().getFieldValue(CLASSCODES_PROP.get());
  }
  
  /**
   * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
   * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
   * @param role 
   * @throws IllegalArgumentException if the role is not exclusive
   * @return Contact or null if none exists
   */
  public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactByRole(role);
  }
  
  /**
   * Gets the Contact class for the given role. If the role has a specific subtype constraint, returns that subtype. IF
   * there is no constraint or there are ExceptionConstraints to the subtype constraint, returns Contact.class.
   * @param role 
   * @deprecated Use getContactTypes instead, which will return all valid contact subtypes if there are more than one.
   */
  public gw.lang.reflect.IType getContactType(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactType(role);
  }
  
  /**
   * Gets the Contact classes for the given role.  If the role has a contact subtype constraint, returns that subtype.
   * If there are ExceptionConstraints then all valid subtypes will be returned (note, this only includes the types
   * specified in the constraints -- any subtypes of those types are implicitly valid.)  Otherwise returns [Contact.class].
   * @param role 
   */
  public java.util.List<gw.entity.IEntityType> getContactTypes(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactTypes(role);
  }
  
  /**
   * Gets the value of the Contacts field.
   * List of contacts associated with this policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact[] getContacts() {
    return (entity.ClaimContact[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
  }
  
  /**
   * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
   * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
   * @param role 
   */
  public entity.Contact[] getContactsByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRole(role);
  }
  
  public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRoles(role);
  }
  
  /**
   * 
   * @param role 
   */
  public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRole(role);
  }
  
  public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRoles(roles);
  }
  
  /**
   * Gets the value of the CoverageForm field.
   * Policy's coverage form.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageForm getCoverageForm() {
    return (typekey.CoverageForm)__getInternalInterface().getFieldValue(COVERAGEFORM_PROP.get());
  }
  
  /**
   * Gets the value of the Coverages field.
   * List of coverages directly related to the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyCoverage[] getCoverages() {
    return (entity.PolicyCoverage[])__getInternalInterface().getFieldValue(COVERAGES_PROP.get());
  }
  
  /**
   * Returns subset of all-coverages that are of certain CoverageType.
   * By "all-coverages" we mean: policy-level, vehicle, and property.
   * @param coverageType the coverageType to find coverages for
   * @return subset of all-coverages that are of the given coverage type
   */
  public entity.Coverage[] getCoveragesByCoverageType(typekey.CoverageType coverageType) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getCoveragesByCoverageType(coverageType);
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
   * Gets the value of the Currency field.
   * The Currency of the policy. When set, the new value is also propagated to Claim.Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the CustomerServiceTier field.
   * Service tier behind this policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CustomerServiceTier getCustomerServiceTier() {
    return (typekey.CustomerServiceTier)__getInternalInterface().getFieldValue(CUSTOMERSERVICETIER_PROP.get());
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
   * Finds an Endorsement by ID from its owning Policy.
   * @param endorsementID the ID of the Endorsement to find.
   * @return the located Endorsement, or NULL if no match was found.
   */
  public entity.Endorsement getEndorsement(gw.pl.persistence.core.Key endorsementID) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getEndorsement(endorsementID);
  }
  
  /**
   * Gets the value of the Endorsements field.
   * List of endorsements for the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Endorsement[] getEndorsements() {
    return (entity.Endorsement[])__getInternalInterface().getFieldValue(ENDORSEMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the policy expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EXPIRATIONDATE_PROP.get());
  }
  
  /**
   * Gets the value of the FinancialInterests field.
   * Other financial interests of note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFinancialInterests() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FINANCIALINTERESTS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InsuredSICCode field.
   * The insured's SIC code (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredSICCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDSICCODE_PROP.get());
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
   * Returns the loss type compatible with the policy type of this policy.
   * @return loss type compatible with the policy type of this policy
   * @deprecated This returns the first potential LossType, which may not be consistent with the Claim.LossType. Use getPotentialLossTypes instead.
   */
  @java.lang.Deprecated
  public typekey.LossType getLossType() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getLossType();
  }
  
  /**
   * Return all the non-exclusive claim contact roles for this owner
   * @return a list of claim contact role objects, possibly empty but never null
   */
  public entity.ClaimContactRole[] getNonExclusiveRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
  }
  
  /**
   * Gets the value of the Notes field.
   * Other notes on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOTES_PROP.get());
  }
  
  /**
   * Gets the value of the OrigEffectiveDate field.
   * First effective date on which the policyholder had coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOrigEffectiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ORIGEFFECTIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the OtherInsInfo field.
   * Notes about the insured's other insurance.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOtherInsInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OTHERINSINFO_PROP.get());
  }
  
  /**
   * Gets the value of the Participation field.
   * Participation percentage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getParticipation() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PARTICIPATION_PROP.get());
  }
  
  /**
   * Gets the {@link Account} corresponding to the {@link #getAccountNumber account number}
   * @return The account to which this policy belongs
   */
  public entity.Account getPolicyAccount() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPolicyAccount();
  }
  
  /**
   * Gets the value of the PolicyLocations field.
   * The list of all Locations available for use on this Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation[] getPolicyLocations() {
    return (entity.PolicyLocation[])__getInternalInterface().getFieldValue(POLICYLOCATIONS_PROP.get());
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
   * Returns the PolicyPeriods associated with this Policy.  Returns an empty
   * array if none exist.
   * @return the policy periods
   */
  public entity.PolicyPeriod[] getPolicyPeriods() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPolicyPeriods();
  }
  
  /**
   * Gets the value of the PolicyRatingPlan field.
   * Policy's rating plan (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyRatingPlan getPolicyRatingPlan() {
    return (typekey.PolicyRatingPlan)__getInternalInterface().getFieldValue(POLICYRATINGPLAN_PROP.get());
  }
  
  /**
   * Gets the value of the PolicySource field.
   * Source of the policy information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicySource getPolicySource() {
    return (typekey.PolicySource)__getInternalInterface().getFieldValue(POLICYSOURCE_PROP.get());
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
   * Gets the value of the PolicySystemPeriodID field.
   * The id of an associated external policy system period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getPolicySystemPeriodID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(POLICYSYSTEMPERIODID_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType() {
    return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
  }
  
  /**
   * Returns the loss types that are compatible with this policy.
   * @throws IllegalStateException If the PolicyType property is not populated
   * @return The potential loss types for the associated claim
   */
  public typekey.LossType[] getPotentialLossTypes() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPotentialLossTypes();
  }
  
  /**
   * Gets the value of the ProducerCode field.
   * Agency that sold the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getProducerCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRODUCERCODE_PROP.get());
  }
  
  /**
   * Returns all LocationBasedRUs, if any, associated with the Policy.
   * @return The location-based risk units
   */
  public entity.LocationBasedRU[] getProperties() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getProperties();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReportingDate field.
   * Extended reporting date for policies with extended coverage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportingDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(REPORTINGDATE_PROP.get());
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
   * Gets the value of the RetroactiveDate field.
   * Retroactive date for policies with retroactive coverage (for commercial policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetroactiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RETROACTIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the RiskUnits field.
   * List of risk units covered by the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RiskUnit[] getRiskUnits() {
    return (entity.RiskUnit[])__getInternalInterface().getFieldValue(RISKUNITS_PROP.get());
  }
  
  /**
   * Returns a list of all RiskUnits of the given subtype
   * @param subtype The risk unit subtype
   * @return The risk units that match the subtype
   */
  public java.util.List getRiskUnits(gw.entity.IEntityType subtype) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getRiskUnits(subtype);
  }
  
  /**
   * Gets the value of the Roles field.
   * The roles that this claimcontact has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles() {
    return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
  }
  
  /**
   * Finds a stat code by ID from its owning Policy.
   * @param statCodeID the ID of the StatCode to find.
   * @return the located StatCode, or NULL if no match was found.
   */
  public entity.StatCode getStatCode(gw.pl.persistence.core.Key statCodeID) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getStatCode(statCodeID);
  }
  
  /**
   * Get the cap on the number of stat codes returned by {@link #getCappedStatCodes()}. This
   * value is read from the system configuration parameter MaxStatCodesInDropdown.
   * @return the cap on the number of stat codes, as specified by the MaxStatCodesInDropdown
   *   configuration parameter
   */
  public int getStatCodeListCap() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getStatCodeListCap();
  }
  
  /**
   * Gets the value of the StatCodes field.
   * List of stat lines associated with the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.StatCode[] getStatCodes() {
    return (entity.StatCode[])__getInternalInterface().getFieldValue(STATCODES_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * Status of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyStatus getStatus() {
    return (typekey.PolicyStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Return all non-exclusive contact roles which are suitable for this owner's type and the
   * given contact. Used in the UI to restrict the user to suitable choices when adding a new
   * contact/role pair to the role owner
   * @param contact a contact, possibly null
   * @return an array of suitable roles, or an empty array if there are none
   */
  public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getSuitableNonExclusiveRolesFor(contact);
  }
  
  /**
   * Gets the value of the TotalProperties field.
   * Total number of properties on the master version of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalProperties() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALPROPERTIES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalVehicles field.
   * Total number of vehicles on the master version of the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalVehicles() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALVEHICLES_PROP.get());
  }
  
  /**
   * Gets the value of the UnderwritingCo field.
   * Underwriting company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnderwritingCompanyType getUnderwritingCo() {
    return (typekey.UnderwritingCompanyType)__getInternalInterface().getFieldValue(UNDERWRITINGCO_PROP.get());
  }
  
  /**
   * Gets the value of the UnderwritingGroup field.
   * Underwriting group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnderwritingGroupType getUnderwritingGroup() {
    return (typekey.UnderwritingGroupType)__getInternalInterface().getFieldValue(UNDERWRITINGGROUP_PROP.get());
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
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel() {
    return (typekey.ValidationLevel)__getInternalInterface().getFieldValue(VALIDATIONLEVEL_PROP.get());
  }
  
  /**
   * Gets the validation result.
   * @return The validation result.
   */
  public gw.api.validation.ValidationResult getValidationResult() {
    return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
  }
  
  /**
   * Look through the policy's array of PolicyVehicles for one whose vehicle
   * id matches the given id.
   * @param vehicleId the id of the vehicle
   * @return the matching PolicyVehicle, or null
   */
  public entity.VehicleRU getVehicleRU(gw.pl.persistence.core.Key vehicleId) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getVehicleRU(vehicleId);
  }
  
  /**
   * Returns all vehicle risk units, if any, associated with the Policy.
   * @return The vehicle risk units
   */
  public entity.VehicleRU[] getVehicles() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getVehicles();
  }
  
  /**
   * Gets the value of the WCOtherStates field.
   * Other states in which coverage applies (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCOtherStates() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCOTHERSTATES_PROP.get());
  }
  
  /**
   * Gets the value of the WCStates field.
   * States in which coverage applies (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCStates() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCSTATES_PROP.get());
  }
  
  /**
   * Returns true if the policy contains Property data (generally
   * associated with homeowners or commercial policies).
   * @return true if the policy contains Property data.
   */
  public boolean hasPropertyData() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasPropertyData();
  }
  
  /**
   * Returns true if the given property is referenced by this policy's location
   * based risk unit array, false otherwise. Returns false if property is null.
   * @param property the property to be tested whether it is this policy's property
   * @return true if the given property is referenced by this policy's policy property array, false otherwise
   */
  public boolean hasRUOnPolicy(entity.PolicyLocation property) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasRUOnPolicy(property);
  }
  
  /**
   * Returns true if the policy contains Vehicle data (generally
   * associated with an auto policy).
   * @return true if the policy contains Vehicle data.
   */
  public boolean hasVehicleData() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasVehicleData();
  }
  
  /**
   * Returns true if the policy contains employment class code (Workers' Comp) data.
   * <p/>
   * The UI uses this to determine whether to display Employment Class Codes
   * in the policy screens.
   * @return true if the policy contains Workers' Comp data.
   */
  public boolean hasWorkersCompData() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasWorkersCompData();
  }
  
  /**
   * Gets the value of the AssignedRisk field.
   * The policy is an Assigned risk from the state or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignedRisk() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNEDRISK_PROP.get());
  }
  
  /**
   * Returns true iff the policy type contains the commercial policy code.
   * @return true iff the policy type contains the commercial policy code.
   */
  public boolean isCommercialPolicy() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isCommercialPolicy();
  }
  
  /**
   * Determines whether some data on the contact in the given role has changed.
   * @param role 
   */
  public boolean isContactInRoleChanged(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleChanged(role);
  }
  
  /**
   * Determines whether the contact in the given role is a different contact than the one originally
   * in the role.
   * @param role 
   */
  public boolean isContactInRoleDifferent(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleDifferent(role);
  }
  
  /**
   * Returns true if the Currency on this Policy is editable, which is generally true if this Policy's Claim does
   * not have any Transactions.
   * @return true if the Currency property should be editable by the user
   */
  public boolean isCurrencyEditable() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isCurrencyEditable();
  }
  
  /**
   * Returns true if any of the aggregate limits for this policy have been
   * exceeded.  Returns false if this policy has no policy period or if its policy
   * period has no aggregate limits.
   * @return true if any of the aggregate limits for this policy have been exceeded, false otherwise
   */
  public boolean isExceedsLimit() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isExceedsLimit();
  }
  
  /**
   * Returns true if any of the aggregate limits for this policy have been
   * exceeded.  Returns false if this policy has no policy period or if its policy
   * period has no aggregate limits. This method can indicate whether it is applied to
   * aggregate limits or aggregate deductibles.
   * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
   * @return true if any of the aggregate limits for this policy have been exceeded, false otherwise
   */
  public boolean isExceedsLimit(typekey.AggregateType valueType) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isExceedsLimit(valueType);
  }
  
  /**
   * Determines whether or not the given role has the 'Exclusive' constraint on this object.
   * @param role a contact role, cannot be null
   */
  public boolean isExclusiveRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
  }
  
  /**
   * Gets the value of the ForeignCoverage field.
   * Whether the insured has foreign coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForeignCoverage() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FOREIGNCOVERAGE_PROP.get());
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
   * Gets the value of the OtherInsurance field.
   * Whether the insured has other insurance.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOtherInsurance() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OTHERINSURANCE_PROP.get());
  }
  
  /**
   * Returns true if the given vehicle is referenced by this policy's policy vehicle risk unit array, false
   * otherwise. Returns false if vehicle is null.
   * @param v the vehicle to test whether it is referenced by this policy.
   * @return true if the vehicle is referenced by this policy, false otherwise
   */
  public boolean isPolicyVehicle(entity.Vehicle v) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isPolicyVehicle(v);
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
   * Gets the value of the ReturnToWorkPrgm field.
   * Return to work program (for workers' comp policies only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkPrgm() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKPRGM_PROP.get());
  }
  
  /**
   * Determines whether or not the given role has the given constraint on this object.
   * @param role 
   * @param constraintType 
   */
  public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
  }
  
  /**
   * Returns whether the list of stat codes returned by {@link #getCappedStatCodes()} is capped.
   * @return true if the list is capped, false otherwise
   */
  public boolean isStatCodeListCapped() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isStatCodeListCapped();
  }
  
  /**
   * Returns whether stat coding is enabled? Consults the system configuration parameter EnableStatCoding.
   * @return true if stat coding is enabled, false otherwise
   */
  public boolean isStatCodingEnabled() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isStatCodingEnabled();
  }
  
  /**
   * Gets the value of the Verified field.
   * True if no non-internal fields have been changed since this policy was retrieved from external system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVerified() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VERIFIED_PROP.get());
  }
  
  /**
   * For the aggregate limits on this policy, returns true if any of them are
   * within the given amount of their limit.
   * <p/>
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * Returns true if this policy has no policy periods or if its policy periods
   * have no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is considered to be 0.
   * @return true if any aggregate limits on this policy is within the the given amount of their limit, false otherwise
   */
  public boolean isWithinLimit(java.math.BigDecimal amount) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinLimit(amount);
  }
  
  /**
   * For the aggregate limits on this policy, returns true if any of them are
   * within the given amount of their limit. This method can be specified to be applied
   * to aggregate limits or aggregate deductibles.
   * <p/>
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * Returns true if this policy has no policy periods or if its policy periods
   * have no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is considered to be 0.
   * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
   * @return true if any aggregate limits on this policy are within the given amount of their limit, false otherwise
   */
  public boolean isWithinLimit(java.math.BigDecimal amount, typekey.AggregateType valueType) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinLimit(amount, valueType);
  }
  
  /**
   * For the aggregate limits on this policy, return true if any of them are
   * within the given percentage of the limit.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * Returns true if this policy has no policy periods or if its policy periods
   * have no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                limit amount is not adjusted.
   * @return true if any aggregate limits on this policy are within the given percentage of the limit, false otherwise
   */
  public boolean isWithinPercentOfLimit(java.math.BigDecimal percent) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinPercentOfLimit(percent);
  }
  
  /**
   * For the aggregate limits on this policy, return true if any of them are
   * within the given percentage of the limit. This method can be specified to be
   * applied to aggregate limits or aggregate deductibles.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * Returns true if this policy has no policy periods or if its policy periods
   * have no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                limit amount is not adjusted.
   * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
   * @return true if any aggregate limits on this policy are within the given percentage of the limit, false otherwise
   */
  public boolean isWithinPercentOfLimit(java.math.BigDecimal percent, typekey.AggregateType valueType) {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinPercentOfLimit(percent, valueType);
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
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * Note that this is the fullest version of "reject"; all the others are
   * overloaded for easier use.
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
   * Removes all roles associated with this ClaimContactRoleOwner.
   */
  public void removeAllRoles() {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
  }
  
  /**
   * Removes the given coverage from the policy.
   * @param coverage the coverage to remove
   */
  public void removeCoverage(entity.PolicyCoverage coverage) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeCoverage(coverage);
  }
  
  /**
   * Removes the given endorsement from the policy.
   * @param endorsement the endorsement to remove
   */
  public void removeEndorsement(entity.Endorsement endorsement) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeEndorsement(endorsement);
  }
  
  /**
   * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
   */
  public void removeFromClassCodes(entity.ClassCode element) {
    __getInternalInterface().removeArrayElement(CLASSCODES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClassCodes(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLASSCODES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromContacts(entity.ClaimContact element) {
    __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContacts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverages(entity.PolicyCoverage element) {
    __getInternalInterface().removeArrayElement(COVERAGES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverages(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(COVERAGES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
   */
  public void removeFromEndorsements(entity.Endorsement element) {
    __getInternalInterface().removeArrayElement(ENDORSEMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEndorsements(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ENDORSEMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
   */
  public void removeFromPolicyLocations(entity.PolicyLocation element) {
    __getInternalInterface().removeArrayElement(POLICYLOCATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicyLocations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(POLICYLOCATIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
   */
  public void removeFromRiskUnits(entity.RiskUnit element) {
    __getInternalInterface().removeArrayElement(RISKUNITS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRiskUnits(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RISKUNITS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element) {
    __getInternalInterface().removeArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ROLES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
   */
  public void removeFromStatCodes(entity.StatCode element) {
    __getInternalInterface().removeArrayElement(STATCODES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatCodes(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(STATCODES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given LocationBasedRU from the policy and also cleans up the PolicyProperty
   * (if no other RiskUnits refer to it) and any property coverages.
   * @param pru The risk unit to remove
   * @throws com.guidewire.pl.web.controller.UserDisplayableException if {@link #allowPropertyRemoval(entity.PolicyLocation)} returns false then this method
   * will throw a user displayable exception and will not delete the property
   */
  public void removeLocationBasedRU(entity.LocationBasedRU pru) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeLocationBasedRU(pru);
  }
  
  /**
   * Removes the given ClaimContactRole from this owner.
   * @param claimContactRole 
   * @throws IllegalArgumentException if this is not the owner of the given ClaimContactRole.
   */
  public void removeRole(entity.ClaimContactRole claimContactRole) {
    ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).removeRole(claimContactRole);
  }
  
  /**
   * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
   * should only be used with Required or ZeroToMore roles.
   * @param role Role that is not exclusive
   * @param contact 
   * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
   * right type for the given role. For exclusive roles, use
   * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
   */
  public void removeRole(typekey.ContactRole role, entity.Contact contact) {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeRole(role, contact);
  }
  
  /**
   * Removes the given stat code from the policy.
   * @param statCode the stat code to remove from this policy
   */
  public void removeStatCode(entity.StatCode statCode) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeStatCode(statCode);
  }
  
  /**
   * Removes the given PolicyVehicle from the policy and also cleans up the associated vehicle
   * and vehicle coverages.
   * @param vru The vehicle risk unit
   * @throws com.guidewire.pl.web.controller.UserDisplayableException if the vehicle is referenced by the claim, any exposure or any exposure coverage - in
   * fact if {@link #allowVehicleRemoval(entity.Vehicle)} returns false then this method will throw
   * an exception instead of trying to remove the vehicle
   */
  public void removeVehicleRU(entity.VehicleRU vru) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeVehicleRU(vru);
  }
  
  /**
   * Sets the value of the AccountNumber field.
   */
  public void setAccountNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACCOUNTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedRisk field.
   */
  public void setAssignedRisk(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ASSIGNEDRISK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CancellationDate field.
   */
  public void setCancellationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CANCELLATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimArray field.
   */
  private void setClaimArray(entity.Claim[] value) {
    __getInternalInterface().setFieldValue(CLAIMARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClassCodes field.
   */
  public void setClassCodes(entity.ClassCode[] value) {
    __getInternalInterface().setFieldValue(CLASSCODES_PROP.get(), value);
  }
  
  /**
   * Sets the Contact in the given role to the given Contact.
   * @param role 
   * @param contact 
   * @throws IllegalArgumentException if the role is not exclusive, or if the Contact is non-null and
   *                                  the role is prohibited or constrained to a different Contact type.
   */
  public void setContactByRole(typekey.ContactRole role, entity.Contact contact) {
    ((com.guidewire.cc.domain.contact.EntityContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.EntityContactRoleOwner")).setContactByRole(role, contact);
  }
  
  /**
   * Sets the value of the Contacts field.
   */
  private void setContacts(entity.ClaimContact[] value) {
    __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageForm field.
   */
  public void setCoverageForm(typekey.CoverageForm value) {
    __getInternalInterface().setFieldValue(COVERAGEFORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Coverages field.
   */
  public void setCoverages(entity.PolicyCoverage[] value) {
    __getInternalInterface().setFieldValue(COVERAGES_PROP.get(), value);
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
   * Sets the value of the Currency field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setCurrency(typekey.Currency value) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).setCurrency(value);
  }
  
  /**
   * Sets the value of the CustomerServiceTier field.
   */
  public void setCustomerServiceTier(typekey.CustomerServiceTier value) {
    __getInternalInterface().setFieldValue(CUSTOMERSERVICETIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EFFECTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Endorsements field.
   */
  public void setEndorsements(entity.Endorsement[] value) {
    __getInternalInterface().setFieldValue(ENDORSEMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXPIRATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinancialInterests field.
   */
  public void setFinancialInterests(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FINANCIALINTERESTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForeignCoverage field.
   */
  public void setForeignCoverage(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FOREIGNCOVERAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredSICCode field.
   */
  public void setInsuredSICCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDSICCODE_PROP.get(), value);
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
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NOTES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OrigEffectiveDate field.
   */
  public void setOrigEffectiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ORIGEFFECTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherInsInfo field.
   */
  public void setOtherInsInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OTHERINSINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherInsurance field.
   */
  public void setOtherInsurance(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OTHERINSURANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Participation field.
   */
  public void setParticipation(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PARTICIPATION_PROP.get(), value);
  }
  
  /**
   * Sets the {@link Account} for this {@code Policy}.
   * @param account The account for this policy
   */
  public void setPolicyAccount(entity.Account account) {
    ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).setPolicyAccount(account);
  }
  
  /**
   * Sets the value of the PolicyLocations field.
   */
  public void setPolicyLocations(entity.PolicyLocation[] value) {
    __getInternalInterface().setFieldValue(POLICYLOCATIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyRatingPlan field.
   */
  public void setPolicyRatingPlan(typekey.PolicyRatingPlan value) {
    __getInternalInterface().setFieldValue(POLICYRATINGPLAN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicySource field.
   */
  public void setPolicySource(typekey.PolicySource value) {
    __getInternalInterface().setFieldValue(POLICYSOURCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicySuffix field.
   */
  public void setPolicySuffix(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYSUFFIX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicySystemPeriodID field.
   */
  public void setPolicySystemPeriodID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(POLICYSYSTEMPERIODID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value) {
    __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProducerCode field.
   */
  public void setProducerCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PRODUCERCODE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReportingDate field.
   */
  public void setReportingDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(REPORTINGDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetroactiveDate field.
   */
  public void setRetroactiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RETROACTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToWorkPrgm field.
   */
  public void setReturnToWorkPrgm(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RETURNTOWORKPRGM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskUnits field.
   */
  public void setRiskUnits(entity.RiskUnit[] value) {
    __getInternalInterface().setFieldValue(RISKUNITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value) {
    __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StatCodes field.
   */
  public void setStatCodes(entity.StatCode[] value) {
    __getInternalInterface().setFieldValue(STATCODES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.PolicyStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalProperties field.
   */
  public void setTotalProperties(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TOTALPROPERTIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalVehicles field.
   */
  public void setTotalVehicles(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TOTALVEHICLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UnderwritingCo field.
   */
  public void setUnderwritingCo(typekey.UnderwritingCompanyType value) {
    __getInternalInterface().setFieldValue(UNDERWRITINGCO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UnderwritingGroup field.
   */
  public void setUnderwritingGroup(typekey.UnderwritingGroupType value) {
    __getInternalInterface().setFieldValue(UNDERWRITINGGROUP_PROP.get(), value);
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
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value) {
    __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Verified field.
   */
  public void setVerified(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VERIFIED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCOtherStates field.
   */
  public void setWCOtherStates(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WCOTHERSTATES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCStates field.
   */
  public void setWCStates(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WCSTATES_PROP.get(), value);
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
  
  /**
   * Attempt to validate the policy. Note that this method has the side-effect of setting the validation
   * level on the policy, and hence requires that the current user have EDIT permissions on the
   * policy or will throw an exception.
   * @return a ValidationResult object containing the results of the validation operation.
   */
  public gw.api.validation.ValidationResult validate() {
    return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).validate();
  }
  
  /**
   * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PolicyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Policy.this.__getDelegateManager();
    }
    
    /**
     * Adds the given coverage to the policy. Also defaults the Coverage's Currency to Policy Currency, if not set.
     * @param coverage the coverage to add
     */
    public void addCoverage(entity.PolicyCoverage coverage) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addCoverage(coverage);
    }
    
    /**
     * Adds an empty ClaimContactRole to this owner. It is assumed that the Contact associated with the role
     * will be filled in later. The role must be Required or ZeroToMore.
     * @param role 
     * @throws IllegalArgumentException if the role is prohibited or exclusive
     */
    public entity.ClaimContactRole addEmptyRole(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addEmptyRole(role);
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
     * Adds a role with the specified contact to this entity. This method should only be used with Required or ZeroToMore
     * roles. For Exclusive roles, just set the property with the name of the role.
     * Does nothing if the Contact already has the role.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, gw.pl.contact.entity.Contact)} instead.
     */
    public entity.ClaimContactRole addRole(typekey.ContactRole role, entity.Contact contact) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addRole(role, contact);
    }
    
    /**
     * Adds the given element to the ClaimArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimArray(entity.Claim element) {
      __getInternalInterface().addArrayElement(CLAIMARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClassCodes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClassCodes(entity.ClassCode element) {
      __getInternalInterface().addArrayElement(CLASSCODES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContacts(entity.ClaimContact element) {
      __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Coverages array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToCoverages(entity.PolicyCoverage value) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToCoverages(value);
    }
    
    /**
     * Adds the given element to the Endorsements array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToEndorsements(entity.Endorsement element) {
      __getInternalInterface().addArrayElement(ENDORSEMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PolicyLocations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPolicyLocations(entity.PolicyLocation element) {
      __getInternalInterface().addArrayElement(POLICYLOCATIONS_PROP.get(), element);
    }
    
    /**
     * Adds this policy to the given PolicyPeriod.  If this policy already belongs
     * to the PolicyPeriod, then does nothing.
     * @param policyPeriod the PolicyPeriod to add
     */
    public void addToPolicyPeriods(entity.PolicyPeriod policyPeriod) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToPolicyPeriods(policyPeriod);
    }
    
    /**
     * Adds the given element to the RiskUnits array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRiskUnits(entity.RiskUnit element) {
      __getInternalInterface().addArrayElement(RISKUNITS_PROP.get(), element);
    }
    
    /**
     * Assigns an "RUNumber" to the {@link entity.RiskUnit} before
     * calling {@link PolicyStubI#addToRiskUnits(entity.RiskUnit)} to add it
     * @param riskUnit The risk unit
     */
    public void addToRiskUnitsAndAssignRUNumber(entity.RiskUnit riskUnit) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).addToRiskUnitsAndAssignRUNumber(riskUnit);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the StatCodes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToStatCodes(entity.StatCode element) {
      __getInternalInterface().addArrayElement(STATCODES_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
    }
    
    /**
     * Returns false if the property is referenced by the claim, any exposure or any exposure
     * coverage.  Does not check if the property is referenced by any RiskUnits.
     * @param property the property to test whether it is allowed to be removed
     * @return false if the given property is referenced by the claim, any exposure, or any exposure coverage, false otherwise
     */
    public boolean allowPropertyRemoval(entity.PolicyLocation property) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).allowPropertyRemoval(property);
    }
    
    /**
     * Returns false if the vehicle is referenced by the claim, any exposure or any exposure
     * coverage.
     * @param v the Vehicle to test whether it is allowed to be removed
     * @return false if the vehicle is referenced by the claim, any exposure or any exposure coverage, true otherwise
     */
    public boolean allowVehicleRemoval(entity.Vehicle v) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).allowVehicleRemoval(v);
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
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    /**
     * Determines whether this owner can be edited.
     */
    public boolean canEdit() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    /**
     * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
     * object describing the problem.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkAddRole(role, contact);
    }
    
    /**
     * Determines whether or not the given role can be removed the given number of times.
     * @param role 
     * @param count number of instances of the role to be removed
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRemoveRole(role, count);
    }
    
    /**
     * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
     * of adding a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
     * instead.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleAdded(role, contact);
    }
    
    /**
     * Checks the removal of the given role, after it has occurred. To check the validity
     * of removing a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
     * instead.
     * @param role 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleRemoved(role);
    }
    
    public boolean claimIsNullBecausePolicyIsChanged() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).claimIsNullBecausePolicyIsChanged();
    }
    
    /**
     */
    public void clearRoleCache() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Check whether a contact is covered by this policy.
     * @param contact the contact to search the covered parties for
     * @return true iff the contact individual id is the same as one of our covered parties.
     */
    public boolean containsCoveredParty(entity.Contact contact) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).containsCoveredParty(contact);
    }
    
    /**
     * Check whether a contact is excluded from this policy.
     * @param contact the excluded party to search for.
     * @return true iff the Contact already exists in the set of excluded parties.
     */
    public boolean containsExcludedParty(entity.Contact contact) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).containsExcludedParty(contact);
    }
    
    /**
     * Returns an empty Endorsement linked to this policy.
     * @return an empty Endorsement linked to this policy
     */
    public entity.Endorsement createEndorsement() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createEndorsement();
    }
    
    /**
     * Returns a new LocationBasedRU of the subtype specified by riskUnitType.
     * @param riskUnitType the type of LocationBasedRU
     * @throws IllegalArgumentException if riskUnitType is not a subtype of LocationBasedRU
     * @return a new {@link entity.LocationBasedRU} linked to this policy
     */
    public entity.LocationBasedRU createLocationBasedRU(gw.entity.IEntityType riskUnitType) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createLocationBasedRU(riskUnitType);
    }
    
    /**
     * Returns a new {@link entity.PolicyLocation} linked to this policy.
     * @return The new policy location
     */
    public entity.PolicyLocation createPolicyLocation() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createPolicyLocation();
    }
    
    /**
     * Returns an empty statcode linked to this policy object.
     * @return an empty statcode linked to this policy object
     */
    public entity.StatCode createStatCode() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createStatCode();
    }
    
    /**
     * Returns a PolicyVehicle. The vehicle of the PolicyVehicle is a newly
     * created, editable, but empty vehicle. The PolicyVehicle is initialized with
     * the vehicle, policy and vehicle number
     * @return an empty policyvehicle linked to this policy object
     */
    public entity.VehicleRU createVehicleRU() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).createVehicleRU();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<entity.PolicyPeriod> findPolicyPeriodsInBundleOnly() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).findPolicyPeriodsInBundleOnly();
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
     * Gets the value of the AccountNumber field.
     * Account number that this Policy belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAccountNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNUMBER_PROP.get());
    }
    
    /**
     * Returns an array of addresses associated with the Policy through both
     * PolicyLocations and Contacts.
     * @return The addresses
     */
    public entity.Address[] getAddresses() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAddresses();
    }
    
    /**
     * Returns all coverages on this policy, i.e., policy-level, vehicle, and
     * property coverages.
     * @return all coverages on this policy
     */
    public entity.Coverage[] getAllCoverages() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAllCoverages();
    }
    
    /**
     * Returns all allowed contact roles for a policy
     * @return a list of allowed contact roles for a policy
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getAllowedContactRolesForEntity();
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
     * Gets the value of the CancellationDate field.
     * Date on which the policy was canceled.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCancellationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CANCELLATIONDATE_PROP.get());
    }
    
    /**
     * Gets the list of stat codes returned by {@link #getStatCodes()} but sorts it by
     * display name and then caps it if it is longer than {@link #getStatCodeListCap()}.
     * Typically used to build a select list in the UI where the list should not be too
     * long, and any additional values can be added via a picker.
     * @return an array of stat codes, at most {@link #getStatCodeListCap()} long. May be empty
     *   but is never null
     */
    public entity.StatCode[] getCappedStatCodes() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getCappedStatCodes();
    }
    
    /**
     * Gets the value of the Claim field.
     * The claim that references this policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim[] getClaimArray() {
      return (entity.Claim[])__getInternalInterface().getFieldValue(CLAIMARRAY_PROP.get());
    }
    
    /**
     * Get the directly related ClaimContact with the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContact or null if none exists
     */
    public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactByRole(role);
    }
    
    /**
     * Gets the ClaimContactRole in the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContactRole or null if none exists.
     */
    public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRoleByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContactRoles in the given role.
     * @param role 
     */
    public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRolesByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContacts with the given role.
     * @param role 
     */
    public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRole(role);
    }
    
    public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRoles(roles);
    }
    
    /**
     * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
     * object.
     * <br>If you need all contacts, including those that are indirectly related to the Claim, use
     * {@link entity.Claim#getContacts()}
     */
    public entity.ClaimContact[] getClaimContactsForAllRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsForAllRoles();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the claim linked to this policy wrapped in an array, for the sake of backwards compatibility.
     * @return an array contain the claim (if any) associated with this policy
     * @deprecated please use getClaim instead
     */
    public entity.Claim[] getClaims() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getClaims();
    }
    
    /**
     * Gets the value of the ClassCodes field.
     * List of class codes covered by the Policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClassCode[] getClassCodes() {
      return (entity.ClassCode[])__getInternalInterface().getFieldValue(CLASSCODES_PROP.get());
    }
    
    /**
     * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
     * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
     * @param role 
     * @throws IllegalArgumentException if the role is not exclusive
     * @return Contact or null if none exists
     */
    public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactByRole(role);
    }
    
    /**
     * Gets the Contact class for the given role. If the role has a specific subtype constraint, returns that subtype. IF
     * there is no constraint or there are ExceptionConstraints to the subtype constraint, returns Contact.class.
     * @param role 
     * @deprecated Use getContactTypes instead, which will return all valid contact subtypes if there are more than one.
     */
    public gw.lang.reflect.IType getContactType(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactType(role);
    }
    
    /**
     * Gets the Contact classes for the given role.  If the role has a contact subtype constraint, returns that subtype.
     * If there are ExceptionConstraints then all valid subtypes will be returned (note, this only includes the types
     * specified in the constraints -- any subtypes of those types are implicitly valid.)  Otherwise returns [Contact.class].
     * @param role 
     */
    public java.util.List<gw.entity.IEntityType> getContactTypes(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactTypes(role);
    }
    
    /**
     * Gets the value of the Contacts field.
     * List of contacts associated with this policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact[] getContacts() {
      return (entity.ClaimContact[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
    }
    
    /**
     * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
     * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
     * @param role 
     */
    public entity.Contact[] getContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRole(role);
    }
    
    public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRoles(role);
    }
    
    /**
     * 
     * @param role 
     */
    public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRole(role);
    }
    
    public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRoles(roles);
    }
    
    /**
     * Gets the value of the CoverageForm field.
     * Policy's coverage form.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageForm getCoverageForm() {
      return (typekey.CoverageForm)__getInternalInterface().getFieldValue(COVERAGEFORM_PROP.get());
    }
    
    /**
     * Gets the value of the Coverages field.
     * List of coverages directly related to the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyCoverage[] getCoverages() {
      return (entity.PolicyCoverage[])__getInternalInterface().getFieldValue(COVERAGES_PROP.get());
    }
    
    /**
     * Returns subset of all-coverages that are of certain CoverageType.
     * By "all-coverages" we mean: policy-level, vehicle, and property.
     * @param coverageType the coverageType to find coverages for
     * @return subset of all-coverages that are of the given coverage type
     */
    public entity.Coverage[] getCoveragesByCoverageType(typekey.CoverageType coverageType) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getCoveragesByCoverageType(coverageType);
    }
    
    public java.util.List<entity.Coverage> getCoveragesWithTransactions() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).getCoveragesWithTransactions();
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
     * The Currency of the policy. When set, the new value is also propagated to Claim.Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the CustomerServiceTier field.
     * Service tier behind this policy
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CustomerServiceTier getCustomerServiceTier() {
      return (typekey.CustomerServiceTier)__getInternalInterface().getFieldValue(CUSTOMERSERVICETIER_PROP.get());
    }
    
    public typekey.ValidationLevel getDefaultValidationLevel() {
      return ((com.guidewire.pl.system.entity.LevelAwareValidatableBean)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.LevelAwareValidatableBean")).getDefaultValidationLevel();
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
     * Finds an Endorsement by ID from its owning Policy.
     * @param endorsementID the ID of the Endorsement to find.
     * @return the located Endorsement, or NULL if no match was found.
     */
    public entity.Endorsement getEndorsement(gw.pl.persistence.core.Key endorsementID) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getEndorsement(endorsementID);
    }
    
    /**
     * Gets the value of the Endorsements field.
     * List of endorsements for the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Endorsement[] getEndorsements() {
      return (entity.Endorsement[])__getInternalInterface().getFieldValue(ENDORSEMENTS_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the ExpirationDate field.
     * Date on which the policy expires.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExpirationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXPIRATIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the FinancialInterests field.
     * Other financial interests of note.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFinancialInterests() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FINANCIALINTERESTS_PROP.get());
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
     * Gets the value of the InsuredSICCode field.
     * The insured's SIC code (for workers' comp policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredSICCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDSICCODE_PROP.get());
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
     * Returns the loss type compatible with the policy type of this policy.
     * @return loss type compatible with the policy type of this policy
     * @deprecated This returns the first potential LossType, which may not be consistent with the Claim.LossType. Use getPotentialLossTypes instead.
     */
    @java.lang.Deprecated
    public typekey.LossType getLossType() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getLossType();
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Gets the value of the Notes field.
     * Other notes on the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNotes() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NOTES_PROP.get());
    }
    
    /**
     * Gets the value of the OrigEffectiveDate field.
     * First effective date on which the policyholder had coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getOrigEffectiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ORIGEFFECTIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the OtherInsInfo field.
     * Notes about the insured's other insurance.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOtherInsInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OTHERINSINFO_PROP.get());
    }
    
    /**
     * Gets the value of the Participation field.
     * Participation percentage (for commercial policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getParticipation() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PARTICIPATION_PROP.get());
    }
    
    /**
     * Gets the {@link Account} corresponding to the {@link #getAccountNumber account number}
     * @return The account to which this policy belongs
     */
    public entity.Account getPolicyAccount() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPolicyAccount();
    }
    
    /**
     * Gets the value of the PolicyLocations field.
     * The list of all Locations available for use on this Policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyLocation[] getPolicyLocations() {
      return (entity.PolicyLocation[])__getInternalInterface().getFieldValue(POLICYLOCATIONS_PROP.get());
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
     * Returns the PolicyPeriods associated with this Policy.  Returns an empty
     * array if none exist.
     * @return the policy periods
     */
    public entity.PolicyPeriod[] getPolicyPeriods() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPolicyPeriods();
    }
    
    /**
     * Gets the value of the PolicyRatingPlan field.
     * Policy's rating plan (for workers' comp policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyRatingPlan getPolicyRatingPlan() {
      return (typekey.PolicyRatingPlan)__getInternalInterface().getFieldValue(POLICYRATINGPLAN_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySource field.
     * Source of the policy information.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicySource getPolicySource() {
      return (typekey.PolicySource)__getInternalInterface().getFieldValue(POLICYSOURCE_PROP.get());
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
     * Gets the value of the PolicySystemPeriodID field.
     * The id of an associated external policy system period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getPolicySystemPeriodID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(POLICYSYSTEMPERIODID_PROP.get());
    }
    
    public typekey.PolicyTab[] getPolicyTabs() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).getPolicyTabs();
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Type of policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyType getPolicyType() {
      return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
    }
    
    /**
     * Returns the loss types that are compatible with this policy.
     * @throws IllegalStateException If the PolicyType property is not populated
     * @return The potential loss types for the associated claim
     */
    public typekey.LossType[] getPotentialLossTypes() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getPotentialLossTypes();
    }
    
    /**
     * Gets the value of the ProducerCode field.
     * Agency that sold the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getProducerCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRODUCERCODE_PROP.get());
    }
    
    /**
     * Returns all LocationBasedRUs, if any, associated with the Policy.
     * @return The location-based risk units
     */
    public entity.LocationBasedRU[] getProperties() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getProperties();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReportingDate field.
     * Extended reporting date for policies with extended coverage (for commercial policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReportingDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REPORTINGDATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RetroactiveDate field.
     * Retroactive date for policies with retroactive coverage (for commercial policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRetroactiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RETROACTIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the RiskUnits field.
     * List of risk units covered by the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RiskUnit[] getRiskUnits() {
      return (entity.RiskUnit[])__getInternalInterface().getFieldValue(RISKUNITS_PROP.get());
    }
    
    /**
     * Returns a list of all RiskUnits of the given subtype
     * @param subtype The risk unit subtype
     * @return The risk units that match the subtype
     */
    public java.util.List getRiskUnits(gw.entity.IEntityType subtype) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getRiskUnits(subtype);
    }
    
    public java.util.List<entity.RiskUnit> getRiskUnitsWithTransactions() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).getRiskUnitsWithTransactions();
    }
    
    /**
     * Gets the value of the Roles field.
     * The roles that this claimcontact has.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContactRole[] getRoles() {
      return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Finds a stat code by ID from its owning Policy.
     * @param statCodeID the ID of the StatCode to find.
     * @return the located StatCode, or NULL if no match was found.
     */
    public entity.StatCode getStatCode(gw.pl.persistence.core.Key statCodeID) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getStatCode(statCodeID);
    }
    
    /**
     * Get the cap on the number of stat codes returned by {@link #getCappedStatCodes()}. This
     * value is read from the system configuration parameter MaxStatCodesInDropdown.
     * @return the cap on the number of stat codes, as specified by the MaxStatCodesInDropdown
     *   configuration parameter
     */
    public int getStatCodeListCap() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getStatCodeListCap();
    }
    
    /**
     * Gets the value of the StatCodes field.
     * List of stat lines associated with the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.StatCode[] getStatCodes() {
      return (entity.StatCode[])__getInternalInterface().getFieldValue(STATCODES_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * Status of the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyStatus getStatus() {
      return (typekey.PolicyStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Return all non-exclusive contact roles which are suitable for this owner's type and the
     * given contact. Used in the UI to restrict the user to suitable choices when adding a new
     * contact/role pair to the role owner
     * @param contact a contact, possibly null
     * @return an array of suitable roles, or an empty array if there are none
     */
    public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getSuitableNonExclusiveRolesFor(contact);
    }
    
    /**
     * Gets the value of the TotalProperties field.
     * Total number of properties on the master version of the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTotalProperties() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALPROPERTIES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalVehicles field.
     * Total number of vehicles on the master version of the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTotalVehicles() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALVEHICLES_PROP.get());
    }
    
    /**
     * Gets the value of the UnderwritingCo field.
     * Underwriting company.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UnderwritingCompanyType getUnderwritingCo() {
      return (typekey.UnderwritingCompanyType)__getInternalInterface().getFieldValue(UNDERWRITINGCO_PROP.get());
    }
    
    /**
     * Gets the value of the UnderwritingGroup field.
     * Underwriting group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UnderwritingGroupType getUnderwritingGroup() {
      return (typekey.UnderwritingGroupType)__getInternalInterface().getFieldValue(UNDERWRITINGGROUP_PROP.get());
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
    
    /**
     * Gets the value of the ValidationLevel field.
     * Validation level that this object passed (if any) before it was stored.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ValidationLevel getValidationLevel() {
      return (typekey.ValidationLevel)__getInternalInterface().getFieldValue(VALIDATIONLEVEL_PROP.get());
    }
    
    /**
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
    }
    
    /**
     * Look through the policy's array of PolicyVehicles for one whose vehicle
     * id matches the given id.
     * @param vehicleId the id of the vehicle
     * @return the matching PolicyVehicle, or null
     */
    public entity.VehicleRU getVehicleRU(gw.pl.persistence.core.Key vehicleId) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getVehicleRU(vehicleId);
    }
    
    /**
     * Returns all vehicle risk units, if any, associated with the Policy.
     * @return The vehicle risk units
     */
    public entity.VehicleRU[] getVehicles() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).getVehicles();
    }
    
    /**
     * Gets the value of the WCOtherStates field.
     * Other states in which coverage applies (for workers' comp policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWCOtherStates() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCOTHERSTATES_PROP.get());
    }
    
    /**
     * Gets the value of the WCStates field.
     * States in which coverage applies (for workers' comp policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWCStates() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCSTATES_PROP.get());
    }
    
    public boolean hasPolicyPeriod(entity.PolicyPeriod policyPeriod) {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).hasPolicyPeriod(policyPeriod);
    }
    
    /**
     * Returns true if the policy contains Property data (generally
     * associated with homeowners or commercial policies).
     * @return true if the policy contains Property data.
     */
    public boolean hasPropertyData() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasPropertyData();
    }
    
    /**
     * Returns true if the given property is referenced by this policy's location
     * based risk unit array, false otherwise. Returns false if property is null.
     * @param property the property to be tested whether it is this policy's property
     * @return true if the given property is referenced by this policy's policy property array, false otherwise
     */
    public boolean hasRUOnPolicy(entity.PolicyLocation property) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasRUOnPolicy(property);
    }
    
    public boolean hasSamePeriod(entity.PolicyPeriod policyPeriod, gw.entity.IEntityPropertyInfo[] periodColumns) {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).hasSamePeriod(policyPeriod, periodColumns);
    }
    
    /**
     * Returns true if the policy contains Vehicle data (generally
     * associated with an auto policy).
     * @return true if the policy contains Vehicle data.
     */
    public boolean hasVehicleData() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasVehicleData();
    }
    
    /**
     * Returns true if the policy contains employment class code (Workers' Comp) data.
     * <p/>
     * The UI uses this to determine whether to display Employment Class Codes
     * in the policy screens.
     * @return true if the policy contains Workers' Comp data.
     */
    public boolean hasWorkersCompData() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).hasWorkersCompData();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAnyPeriodColumnNull(gw.entity.IEntityPropertyInfo[] periodColumns) {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).isAnyPeriodColumnNull(periodColumns);
    }
    
    /**
     * Gets the value of the AssignedRisk field.
     * The policy is an Assigned risk from the state or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAssignedRisk() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNEDRISK_PROP.get());
    }
    
    /**
     * Returns true iff the policy type contains the commercial policy code.
     * @return true iff the policy type contains the commercial policy code.
     */
    public boolean isCommercialPolicy() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isCommercialPolicy();
    }
    
    /**
     * Determines whether some data on the contact in the given role has changed.
     * @param role 
     */
    public boolean isContactInRoleChanged(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleChanged(role);
    }
    
    /**
     * Determines whether the contact in the given role is a different contact than the one originally
     * in the role.
     * @param role 
     */
    public boolean isContactInRoleDifferent(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleDifferent(role);
    }
    
    /**
     * Returns true if the Currency on this Policy is editable, which is generally true if this Policy's Claim does
     * not have any Transactions.
     * @return true if the Currency property should be editable by the user
     */
    public boolean isCurrencyEditable() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isCurrencyEditable();
    }
    
    /**
     * Returns true if any of the aggregate limits for this policy have been
     * exceeded.  Returns false if this policy has no policy period or if its policy
     * period has no aggregate limits.
     * @return true if any of the aggregate limits for this policy have been exceeded, false otherwise
     */
    public boolean isExceedsLimit() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isExceedsLimit();
    }
    
    /**
     * Returns true if any of the aggregate limits for this policy have been
     * exceeded.  Returns false if this policy has no policy period or if its policy
     * period has no aggregate limits. This method can indicate whether it is applied to
     * aggregate limits or aggregate deductibles.
     * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
     * @return true if any of the aggregate limits for this policy have been exceeded, false otherwise
     */
    public boolean isExceedsLimit(typekey.AggregateType valueType) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isExceedsLimit(valueType);
    }
    
    /**
     * Determines whether or not the given role has the 'Exclusive' constraint on this object.
     * @param role a contact role, cannot be null
     */
    public boolean isExclusiveRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
    }
    
    /**
     * Gets the value of the ForeignCoverage field.
     * Whether the insured has foreign coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isForeignCoverage() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FOREIGNCOVERAGE_PROP.get());
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
     * Gets the value of the OtherInsurance field.
     * Whether the insured has other insurance.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isOtherInsurance() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OTHERINSURANCE_PROP.get());
    }
    
    public boolean isPeriodChanged(entity.PolicyPeriod oldPolicyPeriod, gw.entity.IEntityPropertyInfo[] periodColumns) {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).isPeriodChanged(oldPolicyPeriod, periodColumns);
    }
    
    /**
     * Returns true if the given vehicle is referenced by this policy's policy vehicle risk unit array, false
     * otherwise. Returns false if vehicle is null.
     * @param v the vehicle to test whether it is referenced by this policy.
     * @return true if the vehicle is referenced by this policy, false otherwise
     */
    public boolean isPolicyVehicle(entity.Vehicle v) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isPolicyVehicle(v);
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
     * Gets the value of the ReturnToWorkPrgm field.
     * Return to work program (for workers' comp policies only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReturnToWorkPrgm() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKPRGM_PROP.get());
    }
    
    /**
     * Determines whether or not the given role has the given constraint on this object.
     * @param role 
     * @param constraintType 
     */
    public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
    }
    
    /**
     * Returns whether the list of stat codes returned by {@link #getCappedStatCodes()} is capped.
     * @return true if the list is capped, false otherwise
     */
    public boolean isStatCodeListCapped() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isStatCodeListCapped();
    }
    
    /**
     * Returns whether stat coding is enabled? Consults the system configuration parameter EnableStatCoding.
     * @return true if stat coding is enabled, false otherwise
     */
    public boolean isStatCodingEnabled() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isStatCodingEnabled();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the Verified field.
     * True if no non-internal fields have been changed since this policy was retrieved from external system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVerified() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VERIFIED_PROP.get());
    }
    
    public boolean isWithinEffectivePeriod(java.util.Date date) {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).isWithinEffectivePeriod(date);
    }
    
    /**
     * For the aggregate limits on this policy, returns true if any of them are
     * within the given amount of their limit.
     * <p/>
     * <p/>
     * For example, if the limit amount is $100 and the given amount is $20, then
     * this method returns
     * <ul>
     * <li> false if the amount used is less than $80
     * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
     * <li> false if the amount used is greater than $100
     * </ul>
     * Returns true if this policy has no policy periods or if its policy periods
     * have no aggregate limits.
     * @param amount The amount that is subtract from the limit amounts of all applicable
     *               aggregate limits.  If amount is null, then amount is considered to be 0.
     * @return true if any aggregate limits on this policy is within the the given amount of their limit, false otherwise
     */
    public boolean isWithinLimit(java.math.BigDecimal amount) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinLimit(amount);
    }
    
    /**
     * For the aggregate limits on this policy, returns true if any of them are
     * within the given amount of their limit. This method can be specified to be applied
     * to aggregate limits or aggregate deductibles.
     * <p/>
     * <p/>
     * For example, if the limit amount is $100 and the given amount is $20, then
     * this method returns
     * <ul>
     * <li> false if the amount used is less than $80
     * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
     * <li> false if the amount used is greater than $100
     * </ul>
     * Returns true if this policy has no policy periods or if its policy periods
     * have no aggregate limits.
     * @param amount The amount that is subtract from the limit amounts of all applicable
     *               aggregate limits.  If amount is null, then amount is considered to be 0.
     * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
     * @return true if any aggregate limits on this policy are within the given amount of their limit, false otherwise
     */
    public boolean isWithinLimit(java.math.BigDecimal amount, typekey.AggregateType valueType) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinLimit(amount, valueType);
    }
    
    /**
     * For the aggregate limits on this policy, return true if any of them are
     * within the given percentage of the limit.
     * <p/>
     * For example, if the limit amount is $100 and the given percentage is 20%,
     * then this method returns
     * <ul>
     * <li> false if the amount used is less than $80
     * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
     * <li> false if the amount used is greater than $100
     * </ul>
     * Returns true if this policy has no policy periods or if its policy periods
     * have no aggregate limits.
     * @param percent The percent that is applied to the limit amounts of all
     *                applicable aggregate limits.  If percent is null, then the
     *                limit amount is not adjusted.
     * @return true if any aggregate limits on this policy are within the given percentage of the limit, false otherwise
     */
    public boolean isWithinPercentOfLimit(java.math.BigDecimal percent) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinPercentOfLimit(percent);
    }
    
    /**
     * For the aggregate limits on this policy, return true if any of them are
     * within the given percentage of the limit. This method can be specified to be
     * applied to aggregate limits or aggregate deductibles.
     * <p/>
     * For example, if the limit amount is $100 and the given percentage is 20%,
     * then this method returns
     * <ul>
     * <li> false if the amount used is less than $80
     * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
     * <li> false if the amount used is greater than $100
     * </ul>
     * Returns true if this policy has no policy periods or if its policy periods
     * have no aggregate limits.
     * @param percent The percent that is applied to the limit amounts of all
     *                applicable aggregate limits.  If percent is null, then the
     *                limit amount is not adjusted.
     * @param valueType indicates whether this method applies to Aggregate Limits or to Aggregate Deductibles
     * @return true if any aggregate limits on this policy are within the given percentage of the limit, false otherwise
     */
    public boolean isWithinPercentOfLimit(java.math.BigDecimal percent, typekey.AggregateType valueType) {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).isWithinPercentOfLimit(percent, valueType);
    }
    
    public void makeEditable() {
      ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).makeEditable();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void populatePolicyPeriodForNewOrRestoredPolicy() {
      ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).populatePolicyPeriodForNewOrRestoredPolicy();
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
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
     * Removes all roles associated with this ClaimContactRoleOwner.
     */
    public void removeAllRoles() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
    }
    
    /**
     * Removes the given coverage from the policy.
     * @param coverage the coverage to remove
     */
    public void removeCoverage(entity.PolicyCoverage coverage) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeCoverage(coverage);
    }
    
    /**
     * Removes the given endorsement from the policy.
     * @param endorsement the endorsement to remove
     */
    public void removeEndorsement(entity.Endorsement endorsement) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeEndorsement(endorsement);
    }
    
    /**
     * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimArray(entity.Claim element) {
      __getInternalInterface().removeArrayElement(CLAIMARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
     */
    public void removeFromClassCodes(entity.ClassCode element) {
      __getInternalInterface().removeArrayElement(CLASSCODES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClassCodes array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClassCodes(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLASSCODES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
     */
    public void removeFromContacts(entity.ClaimContact element) {
      __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContacts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
     */
    public void removeFromCoverages(entity.PolicyCoverage element) {
      __getInternalInterface().removeArrayElement(COVERAGES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCoverages(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVERAGES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
     */
    public void removeFromEndorsements(entity.Endorsement element) {
      __getInternalInterface().removeArrayElement(ENDORSEMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Endorsements array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromEndorsements(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ENDORSEMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
     */
    public void removeFromPolicyLocations(entity.PolicyLocation element) {
      __getInternalInterface().removeArrayElement(POLICYLOCATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PolicyLocations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPolicyLocations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(POLICYLOCATIONS_PROP.get(), elementID);
    }
    
    public void removeFromPolicyPeriods(entity.PolicyPeriod[] policyPeriods) {
      ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).removeFromPolicyPeriods(policyPeriods);
    }
    
    /**
     * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
     */
    public void removeFromRiskUnits(entity.RiskUnit element) {
      __getInternalInterface().removeArrayElement(RISKUNITS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RiskUnits array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRiskUnits(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RISKUNITS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     */
    public void removeFromRoles(entity.ClaimContactRole element) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRoles(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
     */
    public void removeFromStatCodes(entity.StatCode element) {
      __getInternalInterface().removeArrayElement(STATCODES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the StatCodes array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromStatCodes(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(STATCODES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given LocationBasedRU from the policy and also cleans up the PolicyProperty
     * (if no other RiskUnits refer to it) and any property coverages.
     * @param pru The risk unit to remove
     * @throws com.guidewire.pl.web.controller.UserDisplayableException if {@link #allowPropertyRemoval(entity.PolicyLocation)} returns false then this method
     * will throw a user displayable exception and will not delete the property
     */
    public void removeLocationBasedRU(entity.LocationBasedRU pru) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeLocationBasedRU(pru);
    }
    
    /**
     * Removes the given ClaimContactRole from this owner.
     * @param claimContactRole 
     * @throws IllegalArgumentException if this is not the owner of the given ClaimContactRole.
     */
    public void removeRole(entity.ClaimContactRole claimContactRole) {
      ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).removeRole(claimContactRole);
    }
    
    /**
     * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
     * should only be used with Required or ZeroToMore roles.
     * @param role Role that is not exclusive
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
     */
    public void removeRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeRole(role, contact);
    }
    
    /**
     * Removes the given stat code from the policy.
     * @param statCode the stat code to remove from this policy
     */
    public void removeStatCode(entity.StatCode statCode) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeStatCode(statCode);
    }
    
    /**
     * Removes the given PolicyVehicle from the policy and also cleans up the associated vehicle
     * and vehicle coverages.
     * @param vru The vehicle risk unit
     * @throws com.guidewire.pl.web.controller.UserDisplayableException if the vehicle is referenced by the claim, any exposure or any exposure coverage - in
     * fact if {@link #allowVehicleRemoval(entity.Vehicle)} returns false then this method will throw
     * an exception instead of trying to remove the vehicle
     */
    public void removeVehicleRU(entity.VehicleRU vru) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).removeVehicleRU(vru);
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
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedRisk field.
     */
    public void setAssignedRisk(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ASSIGNEDRISK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CancellationDate field.
     */
    public void setCancellationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CANCELLATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimArray field.
     */
    public void setClaimArray(entity.Claim[] value) {
      __getInternalInterface().setFieldValue(CLAIMARRAY_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClassCodes field.
     */
    public void setClassCodes(entity.ClassCode[] value) {
      __getInternalInterface().setFieldValue(CLASSCODES_PROP.get(), value);
    }
    
    /**
     * Sets the Contact in the given role to the given Contact.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is not exclusive, or if the Contact is non-null and
     *                                  the role is prohibited or constrained to a different Contact type.
     */
    public void setContactByRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.contact.EntityContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.EntityContactRoleOwner")).setContactByRole(role, contact);
    }
    
    /**
     * Sets the value of the Contacts field.
     */
    public void setContacts(entity.ClaimContact[] value) {
      __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageForm field.
     */
    public void setCoverageForm(typekey.CoverageForm value) {
      __getInternalInterface().setFieldValue(COVERAGEFORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Coverages field.
     */
    public void setCoverages(entity.PolicyCoverage[] value) {
      __getInternalInterface().setFieldValue(COVERAGES_PROP.get(), value);
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
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).setCurrency(value);
    }
    
    /**
     * Sets the value of the CustomerServiceTier field.
     */
    public void setCustomerServiceTier(typekey.CustomerServiceTier value) {
      __getInternalInterface().setFieldValue(CUSTOMERSERVICETIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EffectiveDate field.
     */
    public void setEffectiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EFFECTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Endorsements field.
     */
    public void setEndorsements(entity.Endorsement[] value) {
      __getInternalInterface().setFieldValue(ENDORSEMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpirationDate field.
     */
    public void setExpirationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXPIRATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinancialInterests field.
     */
    public void setFinancialInterests(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FINANCIALINTERESTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForeignCoverage field.
     */
    public void setForeignCoverage(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FOREIGNCOVERAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredSICCode field.
     */
    public void setInsuredSICCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDSICCODE_PROP.get(), value);
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
     * Sets the value of the Notes field.
     */
    public void setNotes(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NOTES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OrigEffectiveDate field.
     */
    public void setOrigEffectiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ORIGEFFECTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherInsInfo field.
     */
    public void setOtherInsInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OTHERINSINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherInsurance field.
     */
    public void setOtherInsurance(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OTHERINSURANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Participation field.
     */
    public void setParticipation(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PARTICIPATION_PROP.get(), value);
    }
    
    /**
     * Sets the {@link Account} for this {@code Policy}.
     * @param account The account for this policy
     */
    public void setPolicyAccount(entity.Account account) {
      ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).setPolicyAccount(account);
    }
    
    /**
     * Sets the value of the PolicyLocations field.
     */
    public void setPolicyLocations(entity.PolicyLocation[] value) {
      __getInternalInterface().setFieldValue(POLICYLOCATIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyRatingPlan field.
     */
    public void setPolicyRatingPlan(typekey.PolicyRatingPlan value) {
      __getInternalInterface().setFieldValue(POLICYRATINGPLAN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySource field.
     */
    public void setPolicySource(typekey.PolicySource value) {
      __getInternalInterface().setFieldValue(POLICYSOURCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySuffix field.
     */
    public void setPolicySuffix(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSUFFIX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySystemPeriodID field.
     */
    public void setPolicySystemPeriodID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(POLICYSYSTEMPERIODID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(typekey.PolicyType value) {
      __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProducerCode field.
     */
    public void setProducerCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PRODUCERCODE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReportingDate field.
     */
    public void setReportingDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(REPORTINGDATE_PROP.get(), value);
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
     * Sets the value of the RetroactiveDate field.
     */
    public void setRetroactiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RETROACTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToWorkPrgm field.
     */
    public void setReturnToWorkPrgm(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RETURNTOWORKPRGM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskUnits field.
     */
    public void setRiskUnits(entity.RiskUnit[] value) {
      __getInternalInterface().setFieldValue(RISKUNITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatCodes field.
     */
    public void setStatCodes(entity.StatCode[] value) {
      __getInternalInterface().setFieldValue(STATCODES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.PolicyStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalProperties field.
     */
    public void setTotalProperties(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TOTALPROPERTIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalVehicles field.
     */
    public void setTotalVehicles(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TOTALVEHICLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UnderwritingCo field.
     */
    public void setUnderwritingCo(typekey.UnderwritingCompanyType value) {
      __getInternalInterface().setFieldValue(UNDERWRITINGCO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UnderwritingGroup field.
     */
    public void setUnderwritingGroup(typekey.UnderwritingGroupType value) {
      __getInternalInterface().setFieldValue(UNDERWRITINGGROUP_PROP.get(), value);
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
     * Sets the value of the ValidationLevel field.
     */
    public void setValidationLevel(typekey.ValidationLevel value) {
      __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
    }
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
    }
    
    /**
     * Sets the value of the Verified field.
     */
    public void setVerified(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VERIFIED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCOtherStates field.
     */
    public void setWCOtherStates(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WCOTHERSTATES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCStates field.
     */
    public void setWCStates(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WCSTATES_PROP.get(), value);
    }
    
    public boolean showAggregateLimitTab() {
      return ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).showAggregateLimitTab();
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
    
    public void updateCoverageLines(entity.PolicyPeriod oldPolicyPeriod, entity.PolicyPeriod newPolicyPeriod) {
      ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).updateCoverageLines(oldPolicyPeriod, newPolicyPeriod);
    }
    
    public void updatePolicyPeriods(boolean updateAll) {
      ((com.guidewire.cc.domain.policy.impl.PolicyInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicyInternal")).updatePolicyPeriods(updateAll);
    }
    
    /**
     * Attempt to validate the policy. Note that this method has the side-effect of setting the validation
     * level on the policy, and hence requires that the current user have EDIT permissions on the
     * policy or will throw an exception.
     * @return a ValidationResult object containing the results of the validation operation.
     */
    public gw.api.validation.ValidationResult validate() {
      return ((gw.cc.policy.entity.Policy)__getDelegateManager().getImplementation("gw.cc.policy.entity.Policy")).validate();
    }
    
    /**
     * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.cc.domain.policy.impl.PolicyInternal", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
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
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("com.guidewire.pl.system.entity.LevelAwareValidatableBean", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("gw.cc.policy.entity.Policy", "com.guidewire.cc.domain.policy.impl.PolicyImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Policy.class, config);
    com.guidewire._generated.entity.PolicyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Policy, com.guidewire._generated.entity.PolicyInternal>() {
      public java.lang.Object getImplementation(entity.Policy bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PolicyInternal getInternalInterface(entity.Policy bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Policy newEmptyInstance() {
        return new entity.Policy((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}