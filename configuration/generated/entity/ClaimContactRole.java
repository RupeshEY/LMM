package entity;

/**
 * ClaimContactRole
 * 
 *         Links claim contacts with a role on the claim. The ClaimContactRole tracks which Incident and Exposure (if any)
 *         corresponds with the contact.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimContactRole.eti;ClaimContactRole.eix;ClaimContactRole.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimContactRole")
public class ClaimContactRole extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimContactRole> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimContactRole>("entity.ClaimContactRole");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACTIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Active");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVEREDPARTYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoveredPartyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EVALUATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Evaluation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INCIDENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Incident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MATTER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Matter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NEGOTIATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Negotiation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PARTYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PartyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Policy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ROLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Role");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WITNESSPERSPECTIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WitnessPerspective");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WITNESSPOSITION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "WitnessPosition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WITNESSSTATEMENTIND_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "WitnessStatementInd");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimContactRoleInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimContactRole()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimContactRole(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimContactRole(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimContactRoleInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimContactRoleInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Gets the value of the ClaimContact field.
   * The claimcontact with the given role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact() {
    return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments about this role on the claimcontact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
  }
  
  /**
   * Gets the Contact associated with this ClaimContactRole.
   */
  public entity.Contact getContact() {
    return ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).getContact();
  }
  
  /**
   * Gets the value of the CoveredPartyType field.
   * The type of covered party.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoveredPartyType getCoveredPartyType() {
    return (typekey.CoveredPartyType)__getInternalInterface().getFieldValue(COVEREDPARTYTYPE_PROP.get());
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
   * Gets the value of the Evaluation field.
   * The evaluation with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Evaluation getEvaluation() {
    return (entity.Evaluation)__getInternalInterface().getFieldValue(EVALUATION_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   * The exposure with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Incident field.
   * The incident with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident() {
    return (entity.Incident)__getInternalInterface().getFieldValue(INCIDENT_PROP.get());
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
   * Gets the value of the Matter field.
   * The legal matter with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter() {
    return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
  }
  
  /**
   * Gets the value of the Negotiation field.
   * The negotiation with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Negotiation getNegotiation() {
    return (entity.Negotiation)__getInternalInterface().getFieldValue(NEGOTIATION_PROP.get());
  }
  
  public entity.ClaimContactRoleOwner getOwner() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider")).getOwner();
  }
  
  /**
   * Gets the value of the PartyNumber field.
   * Number of the party in the list of parties.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPartyNumber() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PARTYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Policy field.
   * The policy with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy() {
    return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
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
   * Gets the value of the Role field.
   * The role of the contact in relation to the claim, exposure, or matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getRole() {
    return (typekey.ContactRole)__getInternalInterface().getFieldValue(ROLE_PROP.get());
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
   * Gets the value of the WitnessPerspective field.
   * WitnessPerspective
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWitnessPerspective() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WITNESSPERSPECTIVE_PROP.get());
  }
  
  /**
   * Gets the value of the WitnessPosition field.
   * Where was the witness when the accident happened?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WitnessPosition getWitnessPosition() {
    return (typekey.WitnessPosition)__getInternalInterface().getFieldValue(WITNESSPOSITION_PROP.get());
  }
  
  /**
   * Gets the value of the WitnessStatementInd field.
   * Indicator for whether witness gave statement or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getWitnessStatementInd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(WITNESSSTATEMENTIND_PROP.get());
  }
  
  /**
   * Gets the value of the Active field.
   * True if this contact is still active in its role for this claim or exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ACTIVE_PROP.get());
  }
  
  /**
   * Determines whether this ClaimContactRole is editable in the
   * EditableClaimContactRoles ListView. A ClaimContactRole is editable if it
   * can be removed and the user has permission to edit its owner.
   */
  public boolean isEditableInELV() {
    return ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).isEditableInELV();
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
   * Removes this role from its bundle without also removing the associated ClaimContact even if
   * this is the last role.  Normally you should use {@link #remove()}, which will remove the associated
   * ClaimContact if this is the last role.
   * <p>
   * For example, this is used on the claim parties page, so the user can temporarily remove all roles
   * without having the associated claim contact disappear as well.  That lets the user remove an
   * incorrect role and then add the correct role without having the claim contact disappear from the screen.
   */
  public void removeRoleOnly() {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).removeRoleOnly();
  }
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ACTIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the Contact for this ClaimContactRole. If the Contact already exists on the associated Claim, then its
   * ClaimContact is used. Otherwise, a new ClaimContact is created for the Contact. If the previous ClaimContact
   * that owned this role now has no more roles, it is removed.
   * @param contact 
   * @throws IllegalArgumentException if the Contact cannot be set on this ClaimContactRole because its type is
   * not compatible with that required by the owner and role.
   */
  public void setContact(entity.Contact contact) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setContact(contact);
  }
  
  /**
   * Sets the value of the CoveredPartyType field.
   */
  public void setCoveredPartyType(typekey.CoveredPartyType value) {
    __getInternalInterface().setFieldValue(COVEREDPARTYTYPE_PROP.get(), value);
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
   * Sets the value of the Evaluation field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setEvaluation(entity.Evaluation value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setEvaluation(value);
  }
  
  /**
   * Sets the value of the Exposure field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setExposure(entity.Exposure value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setExposure(value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incident field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setIncident(entity.Incident value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setIncident(value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Matter field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setMatter(entity.Matter value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setMatter(value);
  }
  
  /**
   * Sets the value of the Negotiation field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setNegotiation(entity.Negotiation value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setNegotiation(value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  public void setOwner(entity.ClaimContactRoleOwner owner) {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider")).setOwner(owner);
  }
  
  /**
   * Sets the value of the PartyNumber field.
   */
  public void setPartyNumber(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PARTYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Policy field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPolicy(entity.Policy value) {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setPolicy(value);
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
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ContactRole value) {
    __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
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
   * Sets the value of the WitnessPerspective field.
   */
  public void setWitnessPerspective(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WITNESSPERSPECTIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WitnessPosition field.
   */
  public void setWitnessPosition(typekey.WitnessPosition value) {
    __getInternalInterface().setFieldValue(WITNESSPOSITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WitnessStatementInd field.
   */
  public void setWitnessStatementInd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(WITNESSSTATEMENTIND_PROP.get(), value);
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
  
  public void updateDenormalizedContacts() {
    ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).updateDenormalizedContacts();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimContactRoleInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimContactRole.this.__getDelegateManager();
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
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemove() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).checkRemove();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
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
     * Gets the value of the ClaimContact field.
     * The claimcontact with the given role.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact getClaimContact() {
      return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments about this role on the claimcontact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
    }
    
    /**
     * Gets the Contact associated with this ClaimContactRole.
     */
    public entity.Contact getContact() {
      return ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).getContact();
    }
    
    /**
     * Gets the value of the CoveredPartyType field.
     * The type of covered party.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoveredPartyType getCoveredPartyType() {
      return (typekey.CoveredPartyType)__getInternalInterface().getFieldValue(COVEREDPARTYTYPE_PROP.get());
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
     * Gets the value of the Evaluation field.
     * The evaluation with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Evaluation getEvaluation() {
      return (entity.Evaluation)__getInternalInterface().getFieldValue(EVALUATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getEvaluationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EVALUATION_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the Exposure field.
     * The exposure with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
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
     * Gets the value of the Incident field.
     * The incident with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Incident getIncident() {
      return (entity.Incident)__getInternalInterface().getFieldValue(INCIDENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getIncidentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INCIDENT_PROP.get());
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
     * Gets the value of the Matter field.
     * The legal matter with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Matter getMatter() {
      return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getMatterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MATTER_PROP.get());
    }
    
    /**
     * Gets the value of the Negotiation field.
     * The negotiation with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Negotiation getNegotiation() {
      return (entity.Negotiation)__getInternalInterface().getFieldValue(NEGOTIATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNegotiationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NEGOTIATION_PROP.get());
    }
    
    public entity.ClaimContactRoleOwner getOriginalOwner() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal")).getOriginalOwner();
    }
    
    public entity.ClaimContactRoleOwner getOwner() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider")).getOwner();
    }
    
    /**
     * Gets the value of the PartyNumber field.
     * Number of the party in the list of parties.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPartyNumber() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PARTYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Policy field.
     * The policy with which the contact is associated, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Policy getPolicy() {
      return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICY_PROP.get());
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
     * Gets the value of the Role field.
     * The role of the contact in relation to the claim, exposure, or matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ContactRole getRole() {
      return (typekey.ContactRole)__getInternalInterface().getFieldValue(ROLE_PROP.get());
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
     * Gets the value of the WitnessPerspective field.
     * WitnessPerspective
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWitnessPerspective() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WITNESSPERSPECTIVE_PROP.get());
    }
    
    /**
     * Gets the value of the WitnessPosition field.
     * Where was the witness when the accident happened?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WitnessPosition getWitnessPosition() {
      return (typekey.WitnessPosition)__getInternalInterface().getFieldValue(WITNESSPOSITION_PROP.get());
    }
    
    /**
     * Gets the value of the WitnessStatementInd field.
     * Indicator for whether witness gave statement or not
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getWitnessStatementInd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(WITNESSSTATEMENTIND_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Active field.
     * True if this contact is still active in its role for this claim or exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isActive() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ACTIVE_PROP.get());
    }
    
    /**
     * Determines whether this ClaimContactRole is editable in the
     * EditableClaimContactRoles ListView. A ClaimContactRole is editable if it
     * can be removed and the user has permission to edit its owner.
     */
    public boolean isEditableInELV() {
      return ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).isEditableInELV();
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
    
    public boolean isOwnerChanged() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal")).isOwnerChanged();
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
     * Removes this role from its bundle without also removing the associated ClaimContact even if
     * this is the last role.  Normally you should use {@link #remove()}, which will remove the associated
     * ClaimContact if this is the last role.
     * <p>
     * For example, this is used on the claim parties page, so the user can temporarily remove all roles
     * without having the associated claim contact disappear as well.  That lets the user remove an
     * incorrect role and then add the correct role without having the claim contact disappear from the screen.
     */
    public void removeRoleOnly() {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).removeRoleOnly();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Active field.
     */
    public void setActive(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ACTIVE_PROP.get(), value);
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
     * Sets the value of the ClaimContact field.
     */
    public void setClaimContact(entity.ClaimContact value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the Contact for this ClaimContactRole. If the Contact already exists on the associated Claim, then its
     * ClaimContact is used. Otherwise, a new ClaimContact is created for the Contact. If the previous ClaimContact
     * that owned this role now has no more roles, it is removed.
     * @param contact 
     * @throws IllegalArgumentException if the Contact cannot be set on this ClaimContactRole because its type is
     * not compatible with that required by the owner and role.
     */
    public void setContact(entity.Contact contact) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setContact(contact);
    }
    
    /**
     * Sets the value of the CoveredPartyType field.
     */
    public void setCoveredPartyType(typekey.CoveredPartyType value) {
      __getInternalInterface().setFieldValue(COVEREDPARTYTYPE_PROP.get(), value);
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
     * Sets the value of the Evaluation field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setEvaluation(entity.Evaluation value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setEvaluation(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setEvaluationID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setEvaluationID(value);
    }
    
    /**
     * Sets the value of the Exposure field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExposure(entity.Exposure value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setExposure(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExposureID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setExposureID(value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incident field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setIncident(entity.Incident value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setIncident(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setIncidentID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setIncidentID(value);
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
     * Sets the value of the Matter field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setMatter(entity.Matter value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setMatter(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setMatterID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setMatterID(value);
    }
    
    /**
     * Sets the value of the Negotiation field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setNegotiation(entity.Negotiation value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setNegotiation(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setNegotiationID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setNegotiationID(value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    public void setOwner(entity.ClaimContactRoleOwner owner) {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider")).setOwner(owner);
    }
    
    public void setOwnerID(gw.pl.persistence.core.Key ownerId) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal")).setOwnerID(ownerId);
    }
    
    /**
     * Sets the value of the PartyNumber field.
     */
    public void setPartyNumber(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PARTYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Policy field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPolicy(entity.Policy value) {
      ((gw.cc.claim.entity.ClaimContactRole)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContactRole")).setPolicy(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPolicyID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).setPolicyID(value);
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
     * Sets the value of the Role field.
     */
    public void setRole(typekey.ContactRole value) {
      __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
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
     * Sets the value of the WitnessPerspective field.
     */
    public void setWitnessPerspective(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WITNESSPERSPECTIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WitnessPosition field.
     */
    public void setWitnessPosition(typekey.WitnessPosition value) {
      __getInternalInterface().setFieldValue(WITNESSPOSITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WitnessStatementInd field.
     */
    public void setWitnessStatementInd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(WITNESSSTATEMENTIND_PROP.get(), value);
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
    
    public void updateDenormalizedContacts() {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal")).updateDenormalizedContacts();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderImpl");
    config.put("com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("gw.cc.claim.entity.ClaimContactRole", "com.guidewire.cc.domain.claim.impl.ClaimContactRoleImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimContactRole.class, config);
    com.guidewire._generated.entity.ClaimContactRoleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimContactRole, com.guidewire._generated.entity.ClaimContactRoleInternal>() {
      public java.lang.Object getImplementation(entity.ClaimContactRole bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimContactRoleInternal getInternalInterface(entity.ClaimContactRole bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimContactRole newEmptyInstance() {
        return new entity.ClaimContactRole((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}