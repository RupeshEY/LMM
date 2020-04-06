package entity;

/**
 * InjuryIncident
 * Report of an incident involving a bodily injury.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InjuryIncident.eti;InjuryIncident.eix;InjuryIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "InjuryIncident")
public class InjuryIncident extends entity.Incident {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.InjuryIncident> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.InjuryIncident>("entity.InjuryIncident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AMBULANCEUSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AmbulanceUsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BODYPARTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BodyParts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMINCIDENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimIncident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DETAILEDINJURYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DetailedInjuryType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DISABLEDDUETOACCIDENT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DisabledDueToAccident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GENERALINJURYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GeneralInjuryType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPAIRMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Impairment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INJURYDIAGNOSES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InjuryDiagnoses");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSTWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LostWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MEDICALTREATMENTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MedicalTreatmentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOMODWORKACTUAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToModWorkActual");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOMODWORKDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToModWorkDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOMODWORKVALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToModWorkValid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOWORKACTUAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToWorkActual");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOWORKDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToWorkDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNTOWORKVALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnToWorkValid");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public InjuryIncident()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public InjuryIncident(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected InjuryIncident(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.InjuryIncidentInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.InjuryIncidentInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.InjuryIncidentInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the BodyPartDetails to the BodyParts array and sets its Ordering property
   * so it appears at the end of the OrderedBodyParts list.
   * @param bodyPart 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToBodyParts(entity.BodyPartDetails bodyPart) {
    ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).addToBodyParts(bodyPart);
  }
  
  /**
   * Adds the given element to the InjuryDiagnoses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInjuryDiagnoses(entity.InjuryDiagnosis element) {
    __getInternalInterface().addArrayElement(INJURYDIAGNOSES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the BodyParts field.
   * Details of body parts injured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BodyPartDetails[] getBodyParts() {
    return (entity.BodyPartDetails[])__getInternalInterface().getFieldValue(BODYPARTS_PROP.get());
  }
  
  /**
   * Gets the value of the DetailedInjuryType field.
   * Detailed Injury category.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedInjuryType getDetailedInjuryType() {
    return (typekey.DetailedInjuryType)__getInternalInterface().getFieldValue(DETAILEDINJURYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DisabledDueToAccident field.
   * For non-WC, to characterize the disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DisabledDueToAccident getDisabledDueToAccident() {
    return (typekey.DisabledDueToAccident)__getInternalInterface().getFieldValue(DISABLEDDUETOACCIDENT_PROP.get());
  }
  
  /**
   * The first BodyPartDetails in the OrderedBodyParts array, which has the lowest
   * Ordering field. Or null if the array is empty. When setting the FirstBodyPart,
   * the BodyPartDetails should have already been added to the array.
   */
  public entity.BodyPartDetails getFirstBodyPart() {
    return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).getFirstBodyPart();
  }
  
  /**
   * Gets the value of the GeneralInjuryType field.
   * High-level categorization of the injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InjuryType getGeneralInjuryType() {
    return (typekey.InjuryType)__getInternalInterface().getFieldValue(GENERALINJURYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Impairment field.
   * Percentage impairment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImpairment() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPAIRMENT_PROP.get());
  }
  
  /**
   * Gets the value of the InjuryDiagnoses field.
   * All ICD codes associated with this incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.InjuryDiagnosis[] getInjuryDiagnoses() {
    return (entity.InjuryDiagnosis[])__getInternalInterface().getFieldValue(INJURYDIAGNOSES_PROP.get());
  }
  
  /**
   * Gets the value of the MedicalTreatmentType field.
   * Type of treatment received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalTreatmentType getMedicalTreatmentType() {
    return (typekey.MedicalTreatmentType)__getInternalInterface().getFieldValue(MEDICALTREATMENTTYPE_PROP.get());
  }
  
  /**
   * Returns the BodyParts array sorted by the Ordering field. BodyPartDetails with
   * a null Ordering field appear at the end of the list.
   */
  public entity.BodyPartDetails[] getOrderedBodyParts() {
    return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).getOrderedBodyParts();
  }
  
  /**
   * Gets the value of the ReturnToModWorkDate field.
   * the Return to Modified Work date for this claim, if ReturnToModWorkActual is true, this date is actual, otherwise it is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReturnToModWorkDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RETURNTOMODWORKDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ReturnToWorkDate field.
   * the Return to Work date for this claim, if ReturnToWorkActual is true, this date is actual, otherwise it is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReturnToWorkDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RETURNTOWORKDATE_PROP.get());
  }
  
  /**
   * Gets the value of the AmbulanceUsed field.
   * Ambulance arrived during the loss or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAmbulanceUsed() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AMBULANCEUSED_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimIncident field.
   * True for the one InjuryIncident per claim that holds injury fields formerly on Claim, for Workers Comp.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClaimIncident() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLAIMINCIDENT_PROP.get());
  }
  
  /**
   * Gets the value of the LostWages field.
   * True if the injured person lost wages as a result of the injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLostWages() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOSTWAGES_PROP.get());
  }
  
  /**
   * Gets the value of the ReturnToModWorkActual field.
   * If true, the field, ReturnToModWorkDate, is actual; if false, then date is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToModWorkActual() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOMODWORKACTUAL_PROP.get());
  }
  
  /**
   * Gets the value of the ReturnToModWorkValid field.
   * True indicates that Modified Duty is applicable for this injured person and will be tracked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToModWorkValid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOMODWORKVALID_PROP.get());
  }
  
  /**
   * Gets the value of the ReturnToWorkActual field.
   * If true, the field, ReturnToWorkDate, is actual; if false, then date is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkActual() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKACTUAL_PROP.get());
  }
  
  /**
   * Gets the value of the ReturnToWorkValid field.
   * True indicates that Return to Work will be tracked for this person
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkValid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKVALID_PROP.get());
  }
  
  /**
   * Creates a new BodyPart and adds it to the BodyParts array, setting the Ordering field
   * so it appears at the end of the OrderedBodyParts list.
   * @return the new body part
   */
  public entity.BodyPartDetails newBodyPart() {
    return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).newBodyPart();
  }
  
  /**
   * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
   */
  public void removeFromBodyParts(entity.BodyPartDetails element) {
    __getInternalInterface().removeArrayElement(BODYPARTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBodyParts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BODYPARTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
   */
  public void removeFromInjuryDiagnoses(entity.InjuryDiagnosis element) {
    __getInternalInterface().removeArrayElement(INJURYDIAGNOSES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInjuryDiagnoses(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INJURYDIAGNOSES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AmbulanceUsed field.
   */
  public void setAmbulanceUsed(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AMBULANCEUSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BodyParts field.
   */
  public void setBodyParts(entity.BodyPartDetails[] value) {
    __getInternalInterface().setFieldValue(BODYPARTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimIncident field.
   */
  private void setClaimIncident(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CLAIMINCIDENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DetailedInjuryType field.
   */
  public void setDetailedInjuryType(typekey.DetailedInjuryType value) {
    __getInternalInterface().setFieldValue(DETAILEDINJURYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DisabledDueToAccident field.
   */
  public void setDisabledDueToAccident(typekey.DisabledDueToAccident value) {
    __getInternalInterface().setFieldValue(DISABLEDDUETOACCIDENT_PROP.get(), value);
  }
  
  /**
   * Make the bodyPart arg the primary Body Part in this InjuryIncident's BodyPart array,
   * by setting it's Ordering field lower than any other BodyPart's. The arg must have already been
   * added to the BodyParts array.
   * @param bodyPart 
   */
  public void setFirstBodyPart(entity.BodyPartDetails bodyPart) {
    ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).setFirstBodyPart(bodyPart);
  }
  
  /**
   * Sets the value of the GeneralInjuryType field.
   */
  public void setGeneralInjuryType(typekey.InjuryType value) {
    __getInternalInterface().setFieldValue(GENERALINJURYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Impairment field.
   */
  public void setImpairment(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(IMPAIRMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InjuryDiagnoses field.
   */
  public void setInjuryDiagnoses(entity.InjuryDiagnosis[] value) {
    __getInternalInterface().setFieldValue(INJURYDIAGNOSES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LostWages field.
   */
  public void setLostWages(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LOSTWAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedicalTreatmentType field.
   */
  public void setMedicalTreatmentType(typekey.MedicalTreatmentType value) {
    __getInternalInterface().setFieldValue(MEDICALTREATMENTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToModWorkActual field.
   */
  public void setReturnToModWorkActual(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RETURNTOMODWORKACTUAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToModWorkDate field.
   */
  public void setReturnToModWorkDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RETURNTOMODWORKDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToModWorkValid field.
   */
  public void setReturnToModWorkValid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RETURNTOMODWORKVALID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToWorkActual field.
   */
  public void setReturnToWorkActual(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RETURNTOWORKACTUAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToWorkDate field.
   */
  public void setReturnToWorkDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RETURNTOWORKDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnToWorkValid field.
   */
  public void setReturnToWorkValid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RETURNTOWORKVALID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.InjuryIncidentInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.InjuryIncident.this.__getDelegateManager();
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
     * Adds the BodyPartDetails to the BodyParts array and sets its Ordering property
     * so it appears at the end of the OrderedBodyParts list.
     * @param bodyPart 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToBodyParts(entity.BodyPartDetails bodyPart) {
      ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).addToBodyParts(bodyPart);
    }
    
    /**
     * Adds the given element to the ContentItemLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContentItemLine(entity.AssessmentContentItem element) {
      __getInternalInterface().addArrayElement(CONTENTITEMLINE_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposures(entity.Exposure element) {
      __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InjuryDiagnoses array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInjuryDiagnoses(entity.InjuryDiagnosis element) {
      __getInternalInterface().addArrayElement(INJURYDIAGNOSES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ItemLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToItemLine(entity.AssessmentItem element) {
      __getInternalInterface().addArrayElement(ITEMLINE_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SourceLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSourceLine(entity.AssessmentSource element) {
      __getInternalInterface().addArrayElement(SOURCELINE_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
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
    
    /**
     */
    public void clearRoleCache() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
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
     * Returns all allowed contact roles for an incident
     * @return a list of allowed contact roles for an incident
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getAllowedContactRolesForEntity();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentCloseDate field.
     * Date when this Assessment is complete
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssessmentCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSESSMENTCLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentComment field.
     * Assessment Comment
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssessmentComment() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSESSMENTCOMMENT_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentName field.
     * The name or subject of this negotiation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssessmentName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSESSMENTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentStatus field.
     * AssessmentStatus
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssessmentStatus getAssessmentStatus() {
      return (typekey.AssessmentStatus)__getInternalInterface().getFieldValue(ASSESSMENTSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentTargetCloseDate field.
     * Date when this Assessment is expected to be complete
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssessmentTargetCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSESSMENTTARGETCLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentType field.
     * AssessmentType
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssessmentType getAssessmentType() {
      return (typekey.AssessmentType)__getInternalInterface().getFieldValue(ASSESSMENTTYPE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BodyParts field.
     * Details of body parts injured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BodyPartDetails[] getBodyParts() {
      return (entity.BodyPartDetails[])__getInternalInterface().getFieldValue(BODYPARTS_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * Claim to which this incident is related.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
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
     * Gets this Incident's claim's currency.
     * @return the current Currency for the claim to which this incident belongs.  Returns NULL
     *         if the claim is currently unreachable (if, for example, the necessary entity
     *         connections have not yet been made).
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
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
     * Gets the value of the ContentItemLine field.
     * A list of line items for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentContentItem[] getContentItemLine() {
      return (entity.AssessmentContentItem[])__getInternalInterface().getFieldValue(CONTENTITEMLINE_PROP.get());
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
     * Gets the value of the Description field.
     * General description of the incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the DetailedInjuryType field.
     * Detailed Injury category.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DetailedInjuryType getDetailedInjuryType() {
      return (typekey.DetailedInjuryType)__getInternalInterface().getFieldValue(DETAILEDINJURYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the DisabledDueToAccident field.
     * For non-WC, to characterize the disability.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DisabledDueToAccident getDisabledDueToAccident() {
      return (typekey.DisabledDueToAccident)__getInternalInterface().getFieldValue(DISABLEDDUETOACCIDENT_PROP.get());
    }
    
    /**
     * Gets the value of the Exposures field.
     * A list of exposures for this incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure[] getExposures() {
      return (entity.Exposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
    }
    
    /**
     * The first BodyPartDetails in the OrderedBodyParts array, which has the lowest
     * Ordering field. Or null if the array is empty. When setting the FirstBodyPart,
     * the BodyPartDetails should have already been added to the array.
     */
    public entity.BodyPartDetails getFirstBodyPart() {
      return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).getFirstBodyPart();
    }
    
    /**
     * Gets the value of the GeneralInjuryType field.
     * High-level categorization of the injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.InjuryType getGeneralInjuryType() {
      return (typekey.InjuryType)__getInternalInterface().getFieldValue(GENERALINJURYTYPE_PROP.get());
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
     * Gets the value of the Impairment field.
     * Percentage impairment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getImpairment() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPAIRMENT_PROP.get());
    }
    
    /**
     * Gets the value of the InjuryDiagnoses field.
     * All ICD codes associated with this incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.InjuryDiagnosis[] getInjuryDiagnoses() {
      return (entity.InjuryDiagnosis[])__getInternalInterface().getFieldValue(INJURYDIAGNOSES_PROP.get());
    }
    
    /**
     * Gets the value of the InternalUser field.
     * Internal User
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getInternalUser() {
      return (entity.User)__getInternalInterface().getFieldValue(INTERNALUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInternalUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INTERNALUSER_PROP.get());
    }
    
    /**
     * Gets the value of the ItemLine field.
     * A list of line items for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentItem[] getItemLine() {
      return (entity.AssessmentItem[])__getInternalInterface().getFieldValue(ITEMLINE_PROP.get());
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
     * Gets the value of the LossEstimate field.
     * Estimated cost of the loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLossEstimate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOSSESTIMATE_PROP.get());
    }
    
    /**
     * Gets the value of the MedicalTreatmentType field.
     * Type of treatment received.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MedicalTreatmentType getMedicalTreatmentType() {
      return (typekey.MedicalTreatmentType)__getInternalInterface().getFieldValue(MEDICALTREATMENTTYPE_PROP.get());
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Returns the BodyParts array sorted by the Ordering field. BodyPartDetails with
     * a null Ordering field appear at the end of the list.
     */
    public entity.BodyPartDetails[] getOrderedBodyParts() {
      return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).getOrderedBodyParts();
    }
    
    /**
     * Returns the ContentItemLine ordered by the IncidentOrder value.
     * @return the sorted ContentItemLine array
     */
    public entity.AssessmentContentItem[] getOrderedContentItemLine() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getOrderedContentItemLine();
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
     * Gets the value of the ReturnToModWorkDate field.
     * the Return to Modified Work date for this claim, if ReturnToModWorkActual is true, this date is actual, otherwise it is projected 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReturnToModWorkDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RETURNTOMODWORKDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ReturnToWorkDate field.
     * the Return to Work date for this claim, if ReturnToWorkActual is true, this date is actual, otherwise it is projected 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReturnToWorkDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RETURNTOWORKDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Roles field.
     * The contacts and their roles associated with this incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContactRole[] getRoles() {
      return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequests field.
     * Service requests associated with this incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest[] getServiceRequests() {
      return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
    }
    
    /**
     * Gets the value of the Severity field.
     * Severity of the loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SeverityType getSeverity() {
      return (typekey.SeverityType)__getInternalInterface().getFieldValue(SEVERITY_PROP.get());
    }
    
    /**
     * Gets the value of the SourceLine field.
     * A source for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentSource[] getSourceLine() {
      return (entity.AssessmentSource[])__getInternalInterface().getFieldValue(SOURCELINE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Incident getSubtype() {
      return (typekey.Incident)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
    
    /**
     * Gets the value of the AmbulanceUsed field.
     * Ambulance arrived during the loss or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAmbulanceUsed() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AMBULANCEUSED_PROP.get());
    }
    
    /**
     * Returns whether this incident is better than the given one as the first choice for a new exposure Default
     * implementation checks which of the incidents is used by an exposure (unused is better) then
     * backs off to display name ordering.
     * 
     * The implementation can assume that the other incident provided as its argument is exactly
     * the same subtype of incident as this incident (e.g. if this is a VehicleIncident then the
     * "other" parameter will also be a VehicleIncident) it is permissible to throw a ClassCastException
     * if this is not true.
     * @param other second incident to test whether this incident is better than it
     * @return true if this incident is better than the given one
     */
    public boolean isBetterForNewExposure(entity.Incident other) {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).isBetterForNewExposure(other);
    }
    
    /**
     * Gets the value of the ClaimIncident field.
     * True for the one InjuryIncident per claim that holds injury fields formerly on Claim, for Workers Comp.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isClaimIncident() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLAIMINCIDENT_PROP.get());
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
     * Determines whether or not the given role has the 'Exclusive' constraint on this object.
     * @param role a contact role, cannot be null
     */
    public boolean isExclusiveRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
    }
    
    /**
     * Gets the value of the IncludeContentLineItems field.
     * Boolean field to indicate if assessmentcontentitems are utilized
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeContentLineItems() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDECONTENTLINEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the IncludeLineItems field.
     * Boolean field to indicate if assessmentitems are utilized
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeLineItems() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDELINEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the LostWages field.
     * True if the injured person lost wages as a result of the injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLostWages() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOSTWAGES_PROP.get());
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
    
    /**
     * Gets the value of the ReturnToModWorkActual field.
     * If true, the field, ReturnToModWorkDate, is actual; if false, then date is projected 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReturnToModWorkActual() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOMODWORKACTUAL_PROP.get());
    }
    
    /**
     * Gets the value of the ReturnToModWorkValid field.
     * True indicates that Modified Duty is applicable for this injured person and will be tracked
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReturnToModWorkValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOMODWORKVALID_PROP.get());
    }
    
    /**
     * Gets the value of the ReturnToWorkActual field.
     * If true, the field, ReturnToWorkDate, is actual; if false, then date is projected 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReturnToWorkActual() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKACTUAL_PROP.get());
    }
    
    /**
     * Gets the value of the ReturnToWorkValid field.
     * True indicates that Return to Work will be tracked for this person
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReturnToWorkValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RETURNTOWORKVALID_PROP.get());
    }
    
    /**
     * Determines whether or not the given role has the given constraint on this object.
     * @param role 
     * @param constraintType 
     */
    public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Returns whether this incident is used by at least one exposure.
     * @return true if the incident is used by an exposure, false otherwise
     */
    public boolean isUsedByExposure() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).isUsedByExposure();
    }
    
    /**
     * Creates a new BodyPart and adds it to the BodyParts array, setting the Ordering field
     * so it appears at the end of the OrderedBodyParts list.
     * @return the new body part
     */
    public entity.BodyPartDetails newBodyPart() {
      return ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).newBodyPart();
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
     * Removes all roles associated with this ClaimContactRoleOwner.
     */
    public void removeAllRoles() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
    }
    
    /**
     * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
     */
    public void removeFromBodyParts(entity.BodyPartDetails element) {
      __getInternalInterface().removeArrayElement(BODYPARTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBodyParts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BODYPARTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
     */
    public void removeFromContentItemLine(entity.AssessmentContentItem element) {
      __getInternalInterface().removeArrayElement(CONTENTITEMLINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContentItemLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTENTITEMLINE_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     */
    public void removeFromExposures(entity.Exposure element) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposures(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
     */
    public void removeFromInjuryDiagnoses(entity.InjuryDiagnosis element) {
      __getInternalInterface().removeArrayElement(INJURYDIAGNOSES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInjuryDiagnoses(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INJURYDIAGNOSES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
     */
    public void removeFromItemLine(entity.AssessmentItem element) {
      __getInternalInterface().removeArrayElement(ITEMLINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromItemLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ITEMLINE_PROP.get(), elementID);
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
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     */
    public void removeFromServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
     */
    public void removeFromSourceLine(entity.AssessmentSource element) {
      __getInternalInterface().removeArrayElement(SOURCELINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSourceLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SOURCELINE_PROP.get(), elementID);
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AmbulanceUsed field.
     */
    public void setAmbulanceUsed(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AMBULANCEUSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentCloseDate field.
     */
    public void setAssessmentCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSESSMENTCLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentComment field.
     */
    public void setAssessmentComment(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSESSMENTCOMMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentName field.
     */
    public void setAssessmentName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSESSMENTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentStatus field.
     */
    public void setAssessmentStatus(typekey.AssessmentStatus value) {
      __getInternalInterface().setFieldValue(ASSESSMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentTargetCloseDate field.
     */
    public void setAssessmentTargetCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSESSMENTTARGETCLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentType field.
     */
    public void setAssessmentType(typekey.AssessmentType value) {
      __getInternalInterface().setFieldValue(ASSESSMENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BodyParts field.
     */
    public void setBodyParts(entity.BodyPartDetails[] value) {
      __getInternalInterface().setFieldValue(BODYPARTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimIncident field.
     */
    public void setClaimIncident(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CLAIMINCIDENT_PROP.get(), value);
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
     * Sets the value of the ContentItemLine field.
     */
    public void setContentItemLine(entity.AssessmentContentItem[] value) {
      __getInternalInterface().setFieldValue(CONTENTITEMLINE_PROP.get(), value);
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
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DetailedInjuryType field.
     */
    public void setDetailedInjuryType(typekey.DetailedInjuryType value) {
      __getInternalInterface().setFieldValue(DETAILEDINJURYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DisabledDueToAccident field.
     */
    public void setDisabledDueToAccident(typekey.DisabledDueToAccident value) {
      __getInternalInterface().setFieldValue(DISABLEDDUETOACCIDENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposures field.
     */
    public void setExposures(entity.Exposure[] value) {
      __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
    }
    
    /**
     * Make the bodyPart arg the primary Body Part in this InjuryIncident's BodyPart array,
     * by setting it's Ordering field lower than any other BodyPart's. The arg must have already been
     * added to the BodyParts array.
     * @param bodyPart 
     */
    public void setFirstBodyPart(entity.BodyPartDetails bodyPart) {
      ((gw.cc.exposure.entity.InjuryIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.InjuryIncident")).setFirstBodyPart(bodyPart);
    }
    
    /**
     * Sets the value of the GeneralInjuryType field.
     */
    public void setGeneralInjuryType(typekey.InjuryType value) {
      __getInternalInterface().setFieldValue(GENERALINJURYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Impairment field.
     */
    public void setImpairment(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(IMPAIRMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeContentLineItems field.
     */
    public void setIncludeContentLineItems(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDECONTENTLINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeLineItems field.
     */
    public void setIncludeLineItems(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDELINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InjuryDiagnoses field.
     */
    public void setInjuryDiagnoses(entity.InjuryDiagnosis[] value) {
      __getInternalInterface().setFieldValue(INJURYDIAGNOSES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InternalUser field.
     */
    public void setInternalUser(entity.User value) {
      __getInternalInterface().setFieldValue(INTERNALUSER_PROP.get(), value);
    }
    
    public void setInternalUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(INTERNALUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ItemLine field.
     */
    public void setItemLine(entity.AssessmentItem[] value) {
      __getInternalInterface().setFieldValue(ITEMLINE_PROP.get(), value);
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
     * Sets the value of the LossEstimate field.
     */
    public void setLossEstimate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LOSSESTIMATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LostWages field.
     */
    public void setLostWages(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOSTWAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedicalTreatmentType field.
     */
    public void setMedicalTreatmentType(typekey.MedicalTreatmentType value) {
      __getInternalInterface().setFieldValue(MEDICALTREATMENTTYPE_PROP.get(), value);
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
     * Sets the value of the ReturnToModWorkActual field.
     */
    public void setReturnToModWorkActual(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RETURNTOMODWORKACTUAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToModWorkDate field.
     */
    public void setReturnToModWorkDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RETURNTOMODWORKDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToModWorkValid field.
     */
    public void setReturnToModWorkValid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RETURNTOMODWORKVALID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToWorkActual field.
     */
    public void setReturnToWorkActual(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RETURNTOWORKACTUAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToWorkDate field.
     */
    public void setReturnToWorkDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RETURNTOWORKDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnToWorkValid field.
     */
    public void setReturnToWorkValid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RETURNTOWORKVALID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequests field.
     */
    public void setServiceRequests(entity.ServiceRequest[] value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Severity field.
     */
    public void setSeverity(typekey.SeverityType value) {
      __getInternalInterface().setFieldValue(SEVERITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceLine field.
     */
    public void setSourceLine(entity.AssessmentSource[] value) {
      __getInternalInterface().setFieldValue(SOURCELINE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Incident value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    
    /**
     * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.InjuryIncidentImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.InjuryIncidentImpl");
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
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.exposure.impl.IncidentImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.InjuryIncidentImpl");
    config.put("gw.cc.exposure.entity.Incident", "com.guidewire.cc.domain.exposure.impl.InjuryIncidentImpl");
    config.put("gw.cc.exposure.entity.InjuryIncident", "com.guidewire.cc.domain.exposure.impl.InjuryIncidentImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.InjuryIncident.class, config);
    com.guidewire._generated.entity.InjuryIncidentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.InjuryIncident, com.guidewire._generated.entity.InjuryIncidentInternal>() {
      public java.lang.Object getImplementation(entity.InjuryIncident bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.InjuryIncidentInternal getInternalInterface(entity.InjuryIncident bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.InjuryIncident newEmptyInstance() {
        return new entity.InjuryIncident((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}