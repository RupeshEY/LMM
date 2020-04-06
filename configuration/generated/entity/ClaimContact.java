package entity;

/**
 * ClaimContact
 * 
 *         Links a contact to a claim. This entity also contains an array to the roles played by the contact on the claim.
 *         Changes to the related Contact or the Roles array triggers validation.
 *      
 * 
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimContact.eti;ClaimContact.eix;ClaimContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimContact")
public class ClaimContact extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.EventAware, gw.api.contact.ContactHandle {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimContact> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimContact>("entity.ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BENEFITENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BenefitEndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BENEFITENDREASON_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BenefitEndReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BENEFITENDREASONTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BenefitEndReasonType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMANTFLAG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimantFlag");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTNAMEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactNameDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTPROHIBITED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactProhibited");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTVALIDFROM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactValidFrom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTVALIDTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactValidTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEPENDENTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DependentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ESSENTIALSERVICETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EssentialServiceType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERSONFIRSTNAMEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PersonFirstNameDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERSONLASTNAMEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PersonLastNameDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Policy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROVIDERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ProviderType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Service");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimContactInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimContact()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimContact(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimContact(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimContactInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimContactInternal __getInternalInterface() {
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
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element) {
    __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Checks the changes made to this ClaimContact's roles to determine their validity.
   */
  public com.guidewire.pl.web.validation.InternalValidationResult checkRoleChanges() {
    return ((gw.cc.claim.entity.ClaimContact)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContact")).checkRoleChanges();
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
   * Gets the value of the BenefitEndDate field.
   * Benefit end date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the BenefitEndReason field.
   * Reason benefits ended (deprecated in favor of BenefitEndReasonType)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBenefitEndReason() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BENEFITENDREASON_PROP.get());
  }
  
  /**
   * Gets the value of the BenefitEndReasonType field.
   * Reason benefits ended - typelist
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BenefitEndReasonType getBenefitEndReasonType() {
    return (typekey.BenefitEndReasonType)__getInternalInterface().getFieldValue(BENEFITENDREASONTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Claim field.
   * Claim with which the contact is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the Contact field.
   * Contact associated with the claim or exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the ContactNameDenorm field.
   * denormalization of contact name, to speed up search for claim by contact name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactNameDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTNAMEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the ContactValidFrom field.
   * Start Date when this Contact is valid on this claim 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getContactValidFrom() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CONTACTVALIDFROM_PROP.get());
  }
  
  /**
   * Gets the value of the ContactValidTo field.
   * Date when this Contact is no longer valid on this claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getContactValidTo() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CONTACTVALIDTO_PROP.get());
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
   * Gets the value of the DependentType field.
   * Type of dependent - spouse, child etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DependentType getDependentType() {
    return (typekey.DependentType)__getInternalInterface().getFieldValue(DEPENDENTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the EssentialServiceType field.
   * Type essential service provided by contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EssentialServiceType getEssentialServiceType() {
    return (typekey.EssentialServiceType)__getInternalInterface().getFieldValue(ESSENTIALSERVICETYPE_PROP.get());
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
   * Gets the value of the PersonFirstNameDenorm field.
   * denormalization of person first name, to speed up search for claim by person name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPersonFirstNameDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERSONFIRSTNAMEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the PersonLastNameDenorm field.
   * denormalization of person last name, to speed up search for claim by person name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPersonLastNameDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERSONLASTNAMEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the Policy field.
   * Policy with which the contact is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy() {
    return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
  }
  
  /**
   * Gets the value of the ProviderType field.
   * Provider type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProviderType getProviderType() {
    return (typekey.ProviderType)__getInternalInterface().getFieldValue(PROVIDERTYPE_PROP.get());
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
   * Gets the value of the Roles field.
   * The roles that this claimcontact has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles() {
    return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
  }
  
  /**
   * Gets the value of the Service field.
   * The service provided by contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getService() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICE_PROP.get());
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
   * Determines whether this ClaimContact is a claimant.
   */
  public boolean isClaimant() {
    return ((gw.cc.claim.entity.ClaimContact)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContact")).isClaimant();
  }
  
  /**
   * Gets the value of the ClaimantFlag field.
   * Denorm field indicating whether or not this ClaimContact has the role of claimant.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClaimantFlag() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLAIMANTFLAG_PROP.get());
  }
  
  /**
   * Gets the value of the ContactProhibited field.
   * Indicates whether contact is prohibited with this contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isContactProhibited() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONTACTPROHIBITED_PROP.get());
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
   * Sets the value of the BenefitEndDate field.
   */
  public void setBenefitEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(BENEFITENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BenefitEndReason field.
   */
  public void setBenefitEndReason(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BENEFITENDREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BenefitEndReasonType field.
   */
  public void setBenefitEndReasonType(typekey.BenefitEndReasonType value) {
    __getInternalInterface().setFieldValue(BENEFITENDREASONTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimantFlag field.
   */
  public void setClaimantFlag(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CLAIMANTFLAG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactNameDenorm field.
   */
  private void setContactNameDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CONTACTNAMEDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactProhibited field.
   */
  public void setContactProhibited(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CONTACTPROHIBITED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactValidFrom field.
   */
  public void setContactValidFrom(java.util.Date value) {
    __getInternalInterface().setFieldValue(CONTACTVALIDFROM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactValidTo field.
   */
  public void setContactValidTo(java.util.Date value) {
    __getInternalInterface().setFieldValue(CONTACTVALIDTO_PROP.get(), value);
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
   * Sets the value of the DependentType field.
   */
  public void setDependentType(typekey.DependentType value) {
    __getInternalInterface().setFieldValue(DEPENDENTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EssentialServiceType field.
   */
  public void setEssentialServiceType(typekey.EssentialServiceType value) {
    __getInternalInterface().setFieldValue(ESSENTIALSERVICETYPE_PROP.get(), value);
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
   * Sets the value of the PersonFirstNameDenorm field.
   */
  private void setPersonFirstNameDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PERSONFIRSTNAMEDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PersonLastNameDenorm field.
   */
  private void setPersonLastNameDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PERSONLASTNAMEDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value) {
    __getInternalInterface().setFieldValue(POLICY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProviderType field.
   */
  public void setProviderType(typekey.ProviderType value) {
    __getInternalInterface().setFieldValue(PROVIDERTYPE_PROP.get(), value);
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
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value) {
    __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Service field.
   */
  public void setService(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVICE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimContactInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimContact.this.__getDelegateManager();
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
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
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
    
    /**
     * Checks the changes made to this ClaimContact's roles to determine their validity.
     */
    public com.guidewire.pl.web.validation.InternalValidationResult checkRoleChanges() {
      return ((gw.cc.claim.entity.ClaimContact)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContact")).checkRoleChanges();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public boolean contactHasCompletedButUnsyncedReview() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).contactHasCompletedButUnsyncedReview();
    }
    
    public void copyRoles(entity.ClaimContact claimContact) throws com.guidewire.cc.system.exception.MismatchedContactTypeException {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).copyRoles(claimContact);
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
     * Gets the value of the BenefitEndDate field.
     * Benefit end date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBenefitEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the BenefitEndReason field.
     * Reason benefits ended (deprecated in favor of BenefitEndReasonType)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBenefitEndReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BENEFITENDREASON_PROP.get());
    }
    
    /**
     * Gets the value of the BenefitEndReasonType field.
     * Reason benefits ended - typelist
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BenefitEndReasonType getBenefitEndReasonType() {
      return (typekey.BenefitEndReasonType)__getInternalInterface().getFieldValue(BENEFITENDREASONTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * Claim with which the contact is associated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the Contact field.
     * Contact associated with the claim or exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the ContactNameDenorm field.
     * denormalization of contact name, to speed up search for claim by contact name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getContactNameDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTNAMEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the ContactValidFrom field.
     * Start Date when this Contact is valid on this claim 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getContactValidFrom() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CONTACTVALIDFROM_PROP.get());
    }
    
    /**
     * Gets the value of the ContactValidTo field.
     * Date when this Contact is no longer valid on this claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getContactValidTo() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CONTACTVALIDTO_PROP.get());
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
     * Gets the value of the DependentType field.
     * Type of dependent - spouse, child etc.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DependentType getDependentType() {
      return (typekey.DependentType)__getInternalInterface().getFieldValue(DEPENDENTTYPE_PROP.get());
    }
    
    public com.guidewire.cc.domain.claim.LogicalRole[] getDuplicateLogicalRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).getDuplicateLogicalRoles();
    }
    
    /**
     * Gets the value of the EssentialServiceType field.
     * Type essential service provided by contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.EssentialServiceType getEssentialServiceType() {
      return (typekey.EssentialServiceType)__getInternalInterface().getFieldValue(ESSENTIALSERVICETYPE_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
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
    
    public com.guidewire.cc.domain.claim.LogicalRole[] getLogicalRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).getLogicalRoles();
    }
    
    public int getNumAssociatedChecks() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).getNumAssociatedChecks();
    }
    
    public com.guidewire.cc.domain.claim.LogicalRole[] getOriginalLogicalRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).getOriginalLogicalRoles();
    }
    
    /**
     * Gets the value of the PersonFirstNameDenorm field.
     * denormalization of person first name, to speed up search for claim by person name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPersonFirstNameDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERSONFIRSTNAMEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the PersonLastNameDenorm field.
     * denormalization of person last name, to speed up search for claim by person name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPersonLastNameDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERSONLASTNAMEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the Policy field.
     * Policy with which the contact is associated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Policy getPolicy() {
      return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICY_PROP.get());
    }
    
    /**
     * Gets the value of the ProviderType field.
     * Provider type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ProviderType getProviderType() {
      return (typekey.ProviderType)__getInternalInterface().getFieldValue(PROVIDERTYPE_PROP.get());
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
     * Gets the value of the Roles field.
     * The roles that this claimcontact has.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContactRole[] getRoles() {
      return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the Service field.
     * The service provided by contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getService() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICE_PROP.get());
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
     * Determines whether this ClaimContact is a claimant.
     */
    public boolean isClaimant() {
      return ((gw.cc.claim.entity.ClaimContact)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimContact")).isClaimant();
    }
    
    /**
     * Gets the value of the ClaimantFlag field.
     * Denorm field indicating whether or not this ClaimContact has the role of claimant.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isClaimantFlag() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLAIMANTFLAG_PROP.get());
    }
    
    /**
     * Gets the value of the ContactProhibited field.
     * Indicates whether contact is prohibited with this contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isContactProhibited() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONTACTPROHIBITED_PROP.get());
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
    
    public com.guidewire.cc.domain.claim.ClaimContactSetOperationResult merge(entity.ClaimContact[] claimContactsToMerge) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).merge(claimContactsToMerge);
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
     * Sets the value of the BenefitEndDate field.
     */
    public void setBenefitEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(BENEFITENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BenefitEndReason field.
     */
    public void setBenefitEndReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BENEFITENDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BenefitEndReasonType field.
     */
    public void setBenefitEndReasonType(typekey.BenefitEndReasonType value) {
      __getInternalInterface().setFieldValue(BENEFITENDREASONTYPE_PROP.get(), value);
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
     * Sets the value of the ClaimantFlag field.
     */
    public void setClaimantFlag(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CLAIMANTFLAG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contact field.
     */
    public void setContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactNameDenorm field.
     */
    public void setContactNameDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CONTACTNAMEDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactProhibited field.
     */
    public void setContactProhibited(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CONTACTPROHIBITED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactValidFrom field.
     */
    public void setContactValidFrom(java.util.Date value) {
      __getInternalInterface().setFieldValue(CONTACTVALIDFROM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactValidTo field.
     */
    public void setContactValidTo(java.util.Date value) {
      __getInternalInterface().setFieldValue(CONTACTVALIDTO_PROP.get(), value);
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
     * Sets the value of the DependentType field.
     */
    public void setDependentType(typekey.DependentType value) {
      __getInternalInterface().setFieldValue(DEPENDENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EssentialServiceType field.
     */
    public void setEssentialServiceType(typekey.EssentialServiceType value) {
      __getInternalInterface().setFieldValue(ESSENTIALSERVICETYPE_PROP.get(), value);
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
    
    /**
     * Sets the value of the PersonFirstNameDenorm field.
     */
    public void setPersonFirstNameDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PERSONFIRSTNAMEDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PersonLastNameDenorm field.
     */
    public void setPersonLastNameDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PERSONLASTNAMEDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Policy field.
     */
    public void setPolicy(entity.Policy value) {
      __getInternalInterface().setFieldValue(POLICY_PROP.get(), value);
    }
    
    public void setPolicyID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProviderType field.
     */
    public void setProviderType(typekey.ProviderType value) {
      __getInternalInterface().setFieldValue(PROVIDERTYPE_PROP.get(), value);
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
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Service field.
     */
    public void setService(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVICE_PROP.get(), value);
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
    
    public void updateClaimantFlag() {
      ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).updateClaimantFlag();
    }
    
    public boolean userHavePermissionOnAllRoleOwners() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).userHavePermissionOnAllRoleOwners();
    }
    
    public com.guidewire.cc.domain.claim.impl.ClaimContactRoleValidationFailure[] validateRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimContactInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimContactInternal")).validateRoles();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.impl.ClaimContactInternal", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("gw.api.contact.ContactHandle", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("gw.cc.claim.entity.ClaimContact", "com.guidewire.cc.domain.claim.impl.ClaimContactImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimContact.class, config);
    com.guidewire._generated.entity.ClaimContactInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimContact, com.guidewire._generated.entity.ClaimContactInternal>() {
      public java.lang.Object getImplementation(entity.ClaimContact bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimContactInternal getInternalInterface(entity.ClaimContact bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimContact newEmptyInstance() {
        return new entity.ClaimContact((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}