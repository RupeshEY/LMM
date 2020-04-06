package entity;

/**
 * User
 * Internal system users.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "User.eti;User.eix;User.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "User")
public class User extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.User> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.User>("entity.User");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ATTRIBUTES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Attributes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> AUTHORITYPROFILE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AuthorityProfile");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BACKUPUSERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BackupUsers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREDENTIAL_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Credential");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEFAULTCOUNTRY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DefaultCountry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEFAULTPHONECOUNTRY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DefaultPhoneCountry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEPARTMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Department");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EXPERIENCELEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ExperienceLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTERNALUSER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExternalUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> GROUPUSERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "GroupUsers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> JOBTITLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "JobTitle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LANGUAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Language");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOCALE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Locale");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWLYASSIGNEDACTIVITIES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewlyAssignedActivities");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OFFSETSTATSUPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OffsetStatsUpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ORGANIZATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Organization");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> QUICKCLAIM_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "QuickClaim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> REGIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Regions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SESSIONTIMEOUTSECS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SessionTimeoutSecs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SPATIALPOINTDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SpatialPointDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUPERVISEESCACHE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SuperviseesCache");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SUPERVISEESCACHEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SuperviseesCacheArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SYSTEMUSERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SystemUserType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TIMEZONE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TimeZone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> USERSETTINGS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UserSettings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VACATIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VacationStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UserInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.community.CCPublicUserFinder finder = com.guidewire.cc.domain.community.impl.UserCoreExtMethods.finder;
  
  public static final gw.api.community.PublicUserUtil util = com.guidewire.pl.domain.community.UserPublicMethods.util;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public User()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public User(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected User(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UserInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UserInternal __getInternalInterface() {
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
   * Adds the given element to the Attributes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAttributes(entity.AttributeUser element) {
    __getInternalInterface().addArrayElement(ATTRIBUTES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BackupUsers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBackupUsers(entity.UserBackup element) {
    __getInternalInterface().addArrayElement(BACKUPUSERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the GroupUsers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGroupUsers(entity.GroupUser element) {
    __getInternalInterface().addArrayElement(GROUPUSERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Regions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRegions(entity.UserRegion element) {
    __getInternalInterface().addArrayElement(REGIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToRoles(entity.UserRole value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).addToRoles(value);
  }
  
  public void changeAuthorityProfile(entity.AuthorityLimitProfile newProfile) {
    ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).changeAuthorityProfile(newProfile);
  }
  
  /**
   * Returns all GroupUser entities *from the database* that point to this user.  To retrieve GroupUsers that are only
   * in the bundle as well, try <code>getAllGropuUsersAsArray()</code> on the product's User implementation.
   * @return List of GroupUser entities
   * @deprecated Use ({@link #getGroupUsers()} instead).
   */
  public java.util.List getAllGroupUsers() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getAllGroupUsers();
  }
  
  public entity.GroupUser[] getAllGroupUsersAsArray() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAllGroupUsersAsArray();
  }
  
  /**
   * Returns a Set of all the groups to which this user belongs or has admin rights to.
   * @return Set containing all Group entities to which this user belongs
   */
  public java.util.Set getAllGroups() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getAllGroups();
  }
  
  /**
   * Gets the value of the Attributes field.
   * Attributes for the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AttributeUser[] getAttributes() {
    return (entity.AttributeUser[])__getInternalInterface().getFieldValue(ATTRIBUTES_PROP.get());
  }
  
  public entity.AuthorityLimit getAuthorityLimit(typekey.AuthorityLimitType limitType, typekey.CoverageType coverageType, typekey.CostType costType) {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimit(limitType, coverageType, costType);
  }
  
  public entity.AuthorityLimit[] getAuthorityLimits() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimits();
  }
  
  public entity.AuthorityLimit[] getAuthorityLimits(typekey.AuthorityLimitType limitType) {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimits(limitType);
  }
  
  /**
   * Gets the value of the AuthorityProfile field.
   * Authority limit profile for this user
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AuthorityLimitProfile getAuthorityProfile() {
    return (entity.AuthorityLimitProfile)__getInternalInterface().getFieldValue(AUTHORITYPROFILE_PROP.get());
  }
  
  /**
   * Returns the backup user for this user
   * @return the backup user
   */
  public entity.User getBackupUser() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getBackupUser();
  }
  
  /**
   * Returns the ID of the backup user for this user
   * @return Key representing the backup user
   */
  public gw.pl.persistence.core.Key getBackupUserId() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getBackupUserId();
  }
  
  /**
   * Gets the value of the BackupUsers field.
   * Backup users for this user. Though this is an array, users can only have one backup user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserBackup[] getBackupUsers() {
    return (entity.UserBackup[])__getInternalInterface().getFieldValue(BACKUPUSERS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Contact field.
   * Contact entry related to the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserContact getContact() {
    return (entity.UserContact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
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
   * Gets the value of the Credential field.
   * Security credential for the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Credential getCredential() {
    return (entity.Credential)__getInternalInterface().getFieldValue(CREDENTIAL_PROP.get());
  }
  
  /**
   * Gets the value of the DefaultCountry field.
   * User's default country
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getDefaultCountry() {
    return (typekey.Country)__getInternalInterface().getFieldValue(DEFAULTCOUNTRY_PROP.get());
  }
  
  /**
   * Gets the value of the DefaultPhoneCountry field.
   * User's default phone country
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getDefaultPhoneCountry() {
    return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(DEFAULTPHONECOUNTRY_PROP.get());
  }
  
  /**
   * Gets the value of the Department field.
   * User's department within the company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDepartment() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DEPARTMENT_PROP.get());
  }
  
  /**
   * Gets the value of the ExperienceLevel field.
   * Experience level of the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UserExperienceType getExperienceLevel() {
    return (typekey.UserExperienceType)__getInternalInterface().getFieldValue(EXPERIENCELEVEL_PROP.get());
  }
  
  /**
   * Gets the value of the GroupUsers field.
   * Groups associated with this user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupUser[] getGroupUsers() {
    return (entity.GroupUser[])__getInternalInterface().getFieldValue(GROUPUSERS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the JobTitle field.
   * User's job title.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getJobTitle() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(JOBTITLE_PROP.get());
  }
  
  /**
   * Gets the value of the Language field.
   * User's preferred language.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage() {
    return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
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
   * Gets the value of the Locale field.
   * User's preferred locale.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LocaleType getLocale() {
    return (typekey.LocaleType)__getInternalInterface().getFieldValue(LOCALE_PROP.get());
  }
  
  /**
   * Gets the value of the LossType field.
   * High level claim type (for example, Auto or Property).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the NewlyAssignedActivities field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewlyAssignedActivities() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWLYASSIGNEDACTIVITIES_PROP.get());
  }
  
  /**
   * Gets the value of the OffsetStatsUpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOffsetStatsUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(OFFSETSTATSUPDATETIME_PROP.get());
  }
  
  /**
   * 
   * @return A QueryProcessor with all open activities assigned to this user.
   */
  public gw.api.database.IQueryBeanResult<entity.Activity> getOpenActivities() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOpenActivities();
  }
  
  /**
   * 
   * @return Count of all open activities assigned to this user.
   */
  public int getOpenActivityCount() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOpenActivityCount();
  }
  
  public int getOpenClaimCount() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenClaimCount();
  }
  
  public entity.Claim[] getOpenClaims() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenClaims();
  }
  
  public int getOpenExposureCount() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenExposureCount();
  }
  
  public entity.Exposure[] getOpenExposures() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenExposures();
  }
  
  public int getOpenMatterCount() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenMatterCount();
  }
  
  public entity.Matter[] getOpenMatters() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenMatters();
  }
  
  /**
   * Creates a UserSettings instance for this user.
   * @return UserSettings instance for this user.
   */
  public entity.UserSettings getOrCreateUserSettings() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOrCreateUserSettings();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOrganization();
  }
  
  /**
   * Gets the value of the PolicyType field.
   * High level policy type (for example, Auto or Property).
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
   * Gets the value of the QuickClaim field.
   * Default quick claim values categorized by LossType.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.QuickClaimDefault getQuickClaim() {
    return (typekey.QuickClaimDefault)__getInternalInterface().getFieldValue(QUICKCLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the Regions field.
   * Regions associated with this user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRegion[] getRegions() {
    return (entity.UserRegion[])__getInternalInterface().getFieldValue(REGIONS_PROP.get());
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
   * Security roles granted to the user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRole[] getRoles() {
    return (entity.UserRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
  }
  
  /**
   * Return the root group for this user
   */
  public entity.Group getRootGroup() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getRootGroup();
  }
  
  /**
   * Returns a list of all the security zones that this user can currently see (is assigned
   * to a group)
   * @return List of SecurityZones
   */
  public java.util.List<entity.SecurityZone> getSecurityZones() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getSecurityZones();
  }
  
  /**
   * Gets the value of the SessionTimeoutSecs field.
   * User's session timeout value in seconds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSessionTimeoutSecs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SESSIONTIMEOUTSECS_PROP.get());
  }
  
  /**
   * Gets the value of the SpatialPointDenorm field.
   * Denormalized column from UserContact.PrimaryAddress.SpatialPoint
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.database.spatial.SpatialPoint getSpatialPointDenorm() {
    return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(SPATIALPOINTDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the SuperviseesCache field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SuperviseesCache getSuperviseesCache() {
    return (entity.SuperviseesCache)__getInternalInterface().getFieldValue(SUPERVISEESCACHE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SuperviseesCache[] getSuperviseesCacheArray() {
    return (entity.SuperviseesCache[])__getInternalInterface().getFieldValue(SUPERVISEESCACHEARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the SystemUserType field.
   * Indicates the type of special system users (for example, default claim owner). This is null for regular users.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SystemUserType getSystemUserType() {
    return (typekey.SystemUserType)__getInternalInterface().getFieldValue(SYSTEMUSERTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TimeZone field.
   * User's time zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TimeZoneType getTimeZone() {
    return (typekey.TimeZoneType)__getInternalInterface().getFieldValue(TIMEZONE_PROP.get());
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
   * Gets the value of the UserSettings field.
   * Settings for this user (formerly known as preferences).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserSettings getUserSettings() {
    return (entity.UserSettings)__getInternalInterface().getFieldValue(USERSETTINGS_PROP.get());
  }
  
  /**
   * Gets the value of the VacationStatus field.
   * The vacation status of this user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VacationStatusType getVacationStatus() {
    return (typekey.VacationStatusType)__getInternalInterface().getFieldValue(VACATIONSTATUS_PROP.get());
  }
  
  /**
   * Returns an array containing the IDs of all users that are on vacation and are backed up by this user.
   * @return an array containing the IDs of all users that are on vacation and are backed up by this user.
   */
  public gw.pl.persistence.core.Key[] getVacationingUsers() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getVacationingUsers();
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
  
  public typekey.StartupPage[] getVisibleStartupPages() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getVisibleStartupPages();
  }
  
  public boolean hasClaimBasedPermission(gw.pl.persistence.core.Bean bean, typekey.SystemPermissionType permission) {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasClaimBasedPermission(bean, permission);
  }
  
  public boolean hasPaymentAuthority() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasPaymentAuthority();
  }
  
  public boolean hasReserveAuthority() {
    return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasReserveAuthority();
  }
  
  /**
   * Check whether user has a certain role
   * @param role 
   * @return true if user has the Role
   */
  public boolean hasRole(entity.Role role) {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).hasRole(role);
  }
  
  /**
   * Property that indicates whether user's account is locked. Reading this property requires User.view permission.
   * The property is writable, if you have User.edit permission, and can be used to lock or unlock the user account
   */
  public boolean isAccountLocked() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isAccountLocked();
  }
  
  /**
   * Gets the value of the ExternalUser field.
   * If true, the user is an external user, and claims assigned to the user should be treated as externally owned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExternalUser() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTERNALUSER_PROP.get());
  }
  
  /**
   * 
   * @param organization 
   * @return true if this user is in the organization
   */
  public boolean isInOrganization(entity.Organization organization) {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isInOrganization(organization);
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
   * Tests if the user can be safely deleted. Returns false if
   * <ul>
   * <li>The user is the super user
   * <li>The user is the "default owner", used as the assignee of last resort by the assignment system
   * <li>The user supervises any groups
   * <li>Any items are assigned to the user
   * </ul>
   * @return True if the user can be safely deleted.
   */
  public boolean isSafeToDelete() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSafeToDelete();
  }
  
  /**
   * Returns true if there are users that are on vacation and are backed by current user.
   */
  public boolean isSupportingVacationingUsers() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSupportingVacationingUsers();
  }
  
  /**
   * Indicates whether or not this user is a system user, indicated by the SystemUserType field on User
   * @return <code>true</code> if this user is a system user, <code>false</code> otherwise
   */
  public boolean isSystemUser() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSystemUser();
  }
  
  /**
   * Indicates whether or not this user is the super user that should be granted all permissions.
   * @return <code>true</code> if this user is the super user, <code>false</code> otherwise
   */
  public boolean isUnrestrictedUser() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isUnrestrictedUser();
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
   * Removes the given element from the Attributes array. This is achieved by marking the element for removal.
   */
  public void removeFromAttributes(entity.AttributeUser element) {
    __getInternalInterface().removeArrayElement(ATTRIBUTES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Attributes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAttributes(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ATTRIBUTES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BackupUsers array. This is achieved by marking the element for removal.
   */
  public void removeFromBackupUsers(entity.UserBackup element) {
    __getInternalInterface().removeArrayElement(BACKUPUSERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BackupUsers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBackupUsers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BACKUPUSERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the GroupUsers array. This is achieved by marking the element for removal.
   */
  public void removeFromGroupUsers(entity.GroupUser element) {
    __getInternalInterface().removeArrayElement(GROUPUSERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the GroupUsers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGroupUsers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(GROUPUSERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Regions array. This is achieved by marking the element for removal.
   */
  public void removeFromRegions(entity.UserRegion element) {
    __getInternalInterface().removeArrayElement(REGIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Regions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRegions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(REGIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.UserRole element) {
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
   * Returns true if this user is restricted to viewing only his organizations objects.
   * @return true if restricted
   */
  public boolean restrictedToOwnOrg() {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).restrictedToOwnOrg();
  }
  
  /**
   * Property that indicates whether user's account is locked. Reading this property requires User.view permission.
   * The property is writable, if you have User.edit permission, and can be used to lock or unlock the user account
   * @param locked 
   */
  public void setAccountLocked(boolean locked) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setAccountLocked(locked);
  }
  
  /**
   * Sets the value of the Attributes field.
   */
  public void setAttributes(entity.AttributeUser[] value) {
    __getInternalInterface().setFieldValue(ATTRIBUTES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AuthorityProfile field.
   */
  public void setAuthorityProfile(entity.AuthorityLimitProfile value) {
    __getInternalInterface().setFieldValue(AUTHORITYPROFILE_PROP.get(), value);
  }
  
  /**
   * Sets the backup user for this user
   * @param value The new backup user for this user
   */
  public void setBackupUser(entity.User value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setBackupUser(value);
  }
  
  /**
   * Sets the ID of the backup user for this user
   * @param value The ID of the new backup user for this user
   */
  public void setBackupUserId(gw.pl.persistence.core.Key value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setBackupUserId(value);
  }
  
  /**
   * Sets the value of the BackupUsers field.
   */
  public void setBackupUsers(entity.UserBackup[] value) {
    __getInternalInterface().setFieldValue(BACKUPUSERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.UserContact value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
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
   * Sets the value of the Credential field.
   */
  public void setCredential(entity.Credential value) {
    __getInternalInterface().setFieldValue(CREDENTIAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DefaultCountry field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setDefaultCountry(typekey.Country value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setDefaultCountry(value);
  }
  
  /**
   * Sets the value of the DefaultPhoneCountry field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setDefaultPhoneCountry(typekey.PhoneCountryCode value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setDefaultPhoneCountry(value);
  }
  
  /**
   * Sets the value of the Department field.
   */
  public void setDepartment(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DEPARTMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExperienceLevel field.
   */
  public void setExperienceLevel(typekey.UserExperienceType value) {
    __getInternalInterface().setFieldValue(EXPERIENCELEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExternalUser field.
   */
  public void setExternalUser(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXTERNALUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GroupUsers field.
   */
  public void setGroupUsers(entity.GroupUser[] value) {
    __getInternalInterface().setFieldValue(GROUPUSERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JobTitle field.
   */
  public void setJobTitle(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(JOBTITLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Language field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setLanguage(typekey.LanguageType value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setLanguage(value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Locale field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setLocale(typekey.LocaleType value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setLocale(value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewlyAssignedActivities field.
   */
  public void setNewlyAssignedActivities(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWLYASSIGNEDACTIVITIES_PROP.get(), value);
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
   * Sets the value of the OffsetStatsUpdateTime field.
   */
  public void setOffsetStatsUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(OFFSETSTATSUPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value) {
    __getInternalInterface().setFieldValue(ORGANIZATION_PROP.get(), value);
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
   * Sets the value of the QuickClaim field.
   */
  public void setQuickClaim(typekey.QuickClaimDefault value) {
    __getInternalInterface().setFieldValue(QUICKCLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Regions field.
   */
  public void setRegions(entity.UserRegion[] value) {
    __getInternalInterface().setFieldValue(REGIONS_PROP.get(), value);
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
  public void setRoles(entity.UserRole[] value) {
    __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SessionTimeoutSecs field.
   */
  public void setSessionTimeoutSecs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SESSIONTIMEOUTSECS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpatialPointDenorm field.
   */
  private void setSpatialPointDenorm(gw.api.database.spatial.SpatialPoint value) {
    __getInternalInterface().setFieldValue(SPATIALPOINTDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SuperviseesCache field.
   */
  private void setSuperviseesCache(entity.SuperviseesCache value) {
    __getInternalInterface().setFieldValue(SUPERVISEESCACHE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SuperviseesCacheArray field.
   */
  private void setSuperviseesCacheArray(entity.SuperviseesCache[] value) {
    __getInternalInterface().setFieldValue(SUPERVISEESCACHEARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SystemUserType field.
   */
  public void setSystemUserType(typekey.SystemUserType value) {
    __getInternalInterface().setFieldValue(SYSTEMUSERTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TimeZone field.
   */
  public void setTimeZone(typekey.TimeZoneType value) {
    __getInternalInterface().setFieldValue(TIMEZONE_PROP.get(), value);
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
   * Sets the value of the UserSettings field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setUserSettings(entity.UserSettings value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setUserSettings(value);
  }
  
  /**
   * Sets the value of the VacationStatus field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setVacationStatus(typekey.VacationStatusType value) {
    ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setVacationStatus(value);
  }
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value) {
    __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
  }
  
  public boolean syncRoles(java.lang.String[] roleNames) {
    return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).syncRoles(roleNames);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UserInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.User.this.__getDelegateManager();
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
     * Adds the given element to the Attributes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAttributes(entity.AttributeUser element) {
      __getInternalInterface().addArrayElement(ATTRIBUTES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BackupUsers array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBackupUsers(entity.UserBackup element) {
      __getInternalInterface().addArrayElement(BACKUPUSERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the GroupUsers array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToGroupUsers(entity.GroupUser element) {
      __getInternalInterface().addArrayElement(GROUPUSERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Regions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRegions(entity.UserRegion element) {
      __getInternalInterface().addArrayElement(REGIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToRoles(entity.UserRole value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).addToRoles(value);
    }
    
    /**
     * Adds the given element to the SuperviseesCacheArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSuperviseesCacheArray(entity.SuperviseesCache element) {
      __getInternalInterface().addArrayElement(SUPERVISEESCACHEARRAY_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void applySecurityRestrictionOnGroup(com.guidewire.pl.system.database.Restriction groupTableRestriction) {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).applySecurityRestrictionOnGroup(groupTableRestriction);
    }
    
    public void applySecurityRestrictionOnUser(com.guidewire.pl.system.database.Restriction userTableRestriction) {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).applySecurityRestrictionOnUser(userTableRestriction);
    }
    
    public com.guidewire.pl.system.database.TableObject applySecurityRestrictionOnUserViaGroupUser(com.guidewire.pl.system.database.Restriction userTableRestriction) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).applySecurityRestrictionOnUserViaGroupUser(userTableRestriction);
    }
    
    public void assertCustomPermission(java.lang.Object obj, typekey.SystemPermissionType permission) throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).assertCustomPermission(obj, permission);
    }
    
    public void assertPermission(com.guidewire.pl.system.security.PermissionKey permission) throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).assertPermission(permission);
    }
    
    public void assertPermission(com.guidewire.pl.system.security.StaticPermissionKey permission) throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).assertPermission(permission);
    }
    
    public void assertPermission(java.lang.Object obj, com.guidewire.pl.system.security.PermissionKey permission) {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).assertPermission(obj, permission);
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
    
    public void changeAuthorityProfile(entity.AuthorityLimitProfile newProfile) {
      ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).changeAuthorityProfile(newProfile);
    }
    
    public void checkForReferencesBeforeRemove() {
      ((com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods")).checkForReferencesBeforeRemove();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public gw.pl.persistence.core.Key ensureSuperviseeCacheUpToDate(java.util.Set<gw.pl.persistence.core.Key> groups, java.util.Set<gw.pl.persistence.core.Key> users) {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods")).ensureSuperviseeCacheUpToDate(groups, users);
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
     * Returns all GroupUser entities *from the database* that point to this user.  To retrieve GroupUsers that are only
     * in the bundle as well, try <code>getAllGropuUsersAsArray()</code> on the product's User implementation.
     * @return List of GroupUser entities
     * @deprecated Use ({@link #getGroupUsers()} instead).
     */
    public java.util.List getAllGroupUsers() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getAllGroupUsers();
    }
    
    public entity.GroupUser[] getAllGroupUsersAsArray() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAllGroupUsersAsArray();
    }
    
    /**
     * Returns a Set of all the groups to which this user belongs or has admin rights to.
     * @return Set containing all Group entities to which this user belongs
     */
    public java.util.Set getAllGroups() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getAllGroups();
    }
    
    /**
     * Gets the value of the Attributes field.
     * Attributes for the user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AttributeUser[] getAttributes() {
      return (entity.AttributeUser[])__getInternalInterface().getFieldValue(ATTRIBUTES_PROP.get());
    }
    
    public entity.AuthorityLimit getAuthorityLimit(typekey.AuthorityLimitType limitType, typekey.CoverageType coverageType, typekey.CostType costType) {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimit(limitType, coverageType, costType);
    }
    
    public entity.AuthorityLimit[] getAuthorityLimits() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimits();
    }
    
    public entity.AuthorityLimit[] getAuthorityLimits(typekey.AuthorityLimitType limitType) {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getAuthorityLimits(limitType);
    }
    
    /**
     * Gets the value of the AuthorityProfile field.
     * Authority limit profile for this user
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AuthorityLimitProfile getAuthorityProfile() {
      return (entity.AuthorityLimitProfile)__getInternalInterface().getFieldValue(AUTHORITYPROFILE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAuthorityProfileID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(AUTHORITYPROFILE_PROP.get());
    }
    
    /**
     * Returns the backup user for this user
     * @return the backup user
     */
    public entity.User getBackupUser() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getBackupUser();
    }
    
    /**
     * Returns the ID of the backup user for this user
     * @return Key representing the backup user
     */
    public gw.pl.persistence.core.Key getBackupUserId() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getBackupUserId();
    }
    
    /**
     * Gets the value of the BackupUsers field.
     * Backup users for this user. Though this is an array, users can only have one backup user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserBackup[] getBackupUsers() {
      return (entity.UserBackup[])__getInternalInterface().getFieldValue(BACKUPUSERS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Contact field.
     * Contact entry related to the user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserContact getContact() {
      return (entity.UserContact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
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
     * Gets the value of the Credential field.
     * Security credential for the user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Credential getCredential() {
      return (entity.Credential)__getInternalInterface().getFieldValue(CREDENTIAL_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCredentialID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREDENTIAL_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDefaultAssignmentGroupID() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getDefaultAssignmentGroupID();
    }
    
    /**
     * Gets the value of the DefaultCountry field.
     * User's default country
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Country getDefaultCountry() {
      return (typekey.Country)__getInternalInterface().getFieldValue(DEFAULTCOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the DefaultPhoneCountry field.
     * User's default phone country
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PhoneCountryCode getDefaultPhoneCountry() {
      return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(DEFAULTPHONECOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the Department field.
     * User's department within the company.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDepartment() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DEPARTMENT_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the ExperienceLevel field.
     * Experience level of the user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UserExperienceType getExperienceLevel() {
      return (typekey.UserExperienceType)__getInternalInterface().getFieldValue(EXPERIENCELEVEL_PROP.get());
    }
    
    /**
     * Gets the value of the GroupUsers field.
     * Groups associated with this user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupUser[] getGroupUsers() {
      return (entity.GroupUser[])__getInternalInterface().getFieldValue(GROUPUSERS_PROP.get());
    }
    
    public entity.Group[] getGroupsInSecurityZones() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getGroupsInSecurityZones();
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
     * Gets the value of the JobTitle field.
     * User's job title.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getJobTitle() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(JOBTITLE_PROP.get());
    }
    
    /**
     * Gets the value of the Language field.
     * User's preferred language.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LanguageType getLanguage() {
      return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
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
     * Gets the value of the Locale field.
     * User's preferred locale.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LocaleType getLocale() {
      return (typekey.LocaleType)__getInternalInterface().getFieldValue(LOCALE_PROP.get());
    }
    
    public java.lang.String getLogMessage() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getLogMessage();
    }
    
    /**
     * Gets the value of the LossType field.
     * High level claim type (for example, Auto or Property).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    public java.util.List getMemberGroupIDs() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getMemberGroupIDs();
    }
    
    public entity.Group[] getMemberGroups() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getMemberGroups();
    }
    
    public java.util.Set getMemberGroupsWithAncestors() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).getMemberGroupsWithAncestors();
    }
    
    /**
     * Gets the value of the NewlyAssignedActivities field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewlyAssignedActivities() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWLYASSIGNEDACTIVITIES_PROP.get());
    }
    
    /**
     * Gets the value of the OffsetStatsUpdateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getOffsetStatsUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(OFFSETSTATSUPDATETIME_PROP.get());
    }
    
    /**
     * 
     * @return A QueryProcessor with all open activities assigned to this user.
     */
    public gw.api.database.IQueryBeanResult<entity.Activity> getOpenActivities() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOpenActivities();
    }
    
    /**
     * 
     * @return Count of all open activities assigned to this user.
     */
    public int getOpenActivityCount() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOpenActivityCount();
    }
    
    public int getOpenClaimCount() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenClaimCount();
    }
    
    public entity.Claim[] getOpenClaims() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenClaims();
    }
    
    public int getOpenExposureCount() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenExposureCount();
    }
    
    public entity.Exposure[] getOpenExposures() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenExposures();
    }
    
    public int getOpenMatterCount() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenMatterCount();
    }
    
    public entity.Matter[] getOpenMatters() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOpenMatters();
    }
    
    public entity.SuperviseesCache getOrCreateSuperviseesCache() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods")).getOrCreateSuperviseesCache();
    }
    
    /**
     * Creates a UserSettings instance for this user.
     * @return UserSettings instance for this user.
     */
    public entity.UserSettings getOrCreateUserSettings() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getOrCreateUserSettings();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Organization getOrganization() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getOrganization();
    }
    
    public gw.pl.persistence.core.Key getOrganizationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ORGANIZATION_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * High level policy type (for example, Auto or Property).
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
     * Gets the value of the QuickClaim field.
     * Default quick claim values categorized by LossType.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.QuickClaimDefault getQuickClaim() {
      return (typekey.QuickClaimDefault)__getInternalInterface().getFieldValue(QUICKCLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the Regions field.
     * Regions associated with this user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserRegion[] getRegions() {
      return (entity.UserRegion[])__getInternalInterface().getFieldValue(REGIONS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Roles field.
     * Security roles granted to the user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserRole[] getRoles() {
      return (entity.UserRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Return the root group for this user
     */
    public entity.Group getRootGroup() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getRootGroup();
    }
    
    /**
     * Returns a list of all the security zones that this user can currently see (is assigned
     * to a group)
     * @return List of SecurityZones
     */
    public java.util.List<entity.SecurityZone> getSecurityZones() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getSecurityZones();
    }
    
    /**
     * Gets the value of the SessionTimeoutSecs field.
     * User's session timeout value in seconds
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSessionTimeoutSecs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SESSIONTIMEOUTSECS_PROP.get());
    }
    
    /**
     * Gets the value of the SpatialPointDenorm field.
     * Denormalized column from UserContact.PrimaryAddress.SpatialPoint
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.database.spatial.SpatialPoint getSpatialPointDenorm() {
      return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(SPATIALPOINTDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the SuperviseesCache field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SuperviseesCache getSuperviseesCache() {
      return (entity.SuperviseesCache)__getInternalInterface().getFieldValue(SUPERVISEESCACHE_PROP.get());
    }
    
    /**
     * Gets the value of the SuperviseesCacheArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SuperviseesCache[] getSuperviseesCacheArray() {
      return (entity.SuperviseesCache[])__getInternalInterface().getFieldValue(SUPERVISEESCACHEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSuperviseesCacheID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUPERVISEESCACHE_PROP.get());
    }
    
    /**
     * Gets the value of the SystemUserType field.
     * Indicates the type of special system users (for example, default claim owner). This is null for regular users.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SystemUserType getSystemUserType() {
      return (typekey.SystemUserType)__getInternalInterface().getFieldValue(SYSTEMUSERTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TimeZone field.
     * User's time zone.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TimeZoneType getTimeZone() {
      return (typekey.TimeZoneType)__getInternalInterface().getFieldValue(TIMEZONE_PROP.get());
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
     * Gets the value of the UserSettings field.
     * Settings for this user (formerly known as preferences).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserSettings getUserSettings() {
      return (entity.UserSettings)__getInternalInterface().getFieldValue(USERSETTINGS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUserSettingsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(USERSETTINGS_PROP.get());
    }
    
    /**
     * Gets the value of the VacationStatus field.
     * The vacation status of this user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VacationStatusType getVacationStatus() {
      return (typekey.VacationStatusType)__getInternalInterface().getFieldValue(VACATIONSTATUS_PROP.get());
    }
    
    /**
     * Returns an array containing the IDs of all users that are on vacation and are backed up by this user.
     * @return an array containing the IDs of all users that are on vacation and are backed up by this user.
     */
    public gw.pl.persistence.core.Key[] getVacationingUsers() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).getVacationingUsers();
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
    
    public typekey.StartupPage[] getVisibleStartupPages() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).getVisibleStartupPages();
    }
    
    public boolean hasClaimBasedPermission(gw.pl.persistence.core.Bean bean, typekey.SystemPermissionType permission) {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasClaimBasedPermission(bean, permission);
    }
    
    public boolean hasCustomPermission(java.lang.Object obj, typekey.SystemPermissionType permission) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).hasCustomPermission(obj, permission);
    }
    
    public boolean hasLoadFactorGroups() {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).hasLoadFactorGroups();
    }
    
    public boolean hasPaymentAuthority() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasPaymentAuthority();
    }
    
    public boolean hasPermission(com.guidewire.pl.system.security.PermissionKey permission) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).hasPermission(permission);
    }
    
    public boolean hasPermission(com.guidewire.pl.system.security.StaticPermissionKey permission) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).hasPermission(permission);
    }
    
    public boolean hasPermission(java.lang.Object obj, com.guidewire.pl.system.security.PermissionKey permission) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).hasPermission(obj, permission);
    }
    
    public boolean hasReserveAuthority() {
      return ((com.guidewire.cc.domain.community.impl.UserCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtMethods")).hasReserveAuthority();
    }
    
    /**
     * Check whether user has a certain role
     * @param role 
     * @return true if user has the Role
     */
    public boolean hasRole(entity.Role role) {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).hasRole(role);
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Property that indicates whether user's account is locked. Reading this property requires User.view permission.
     * The property is writable, if you have User.edit permission, and can be used to lock or unlock the user account
     */
    public boolean isAccountLocked() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isAccountLocked();
    }
    
    /**
     * Gets the value of the ExternalUser field.
     * If true, the user is an external user, and claims assigned to the user should be treated as externally owned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExternalUser() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTERNALUSER_PROP.get());
    }
    
    /**
     * 
     * @param organization 
     * @return true if this user is in the organization
     */
    public boolean isInOrganization(entity.Organization organization) {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isInOrganization(organization);
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
     * Tests if the user can be safely deleted. Returns false if
     * <ul>
     * <li>The user is the super user
     * <li>The user is the "default owner", used as the assignee of last resort by the assignment system
     * <li>The user supervises any groups
     * <li>Any items are assigned to the user
     * </ul>
     * @return True if the user can be safely deleted.
     */
    public boolean isSafeToDelete() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSafeToDelete();
    }
    
    /**
     * Returns true if there are users that are on vacation and are backed by current user.
     */
    public boolean isSupportingVacationingUsers() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSupportingVacationingUsers();
    }
    
    /**
     * Indicates whether or not this user is a system user, indicated by the SystemUserType field on User
     * @return <code>true</code> if this user is a system user, <code>false</code> otherwise
     */
    public boolean isSystemUser() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isSystemUser();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Indicates whether or not this user is the super user that should be granted all permissions.
     * @return <code>true</code> if this user is the super user, <code>false</code> otherwise
     */
    public boolean isUnrestrictedUser() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).isUnrestrictedUser();
    }
    
    public void lockAccount() {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).lockAccount();
    }
    
    public void markFailedLogin() {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).markFailedLogin();
    }
    
    public void markSuccessfulLogin() {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).markSuccessfulLogin();
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
    
    public boolean removeAttribute(entity.Attribute att) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).removeAttribute(att);
    }
    
    /**
     * Removes the given element from the Attributes array. This is achieved by marking the element for removal.
     */
    public void removeFromAttributes(entity.AttributeUser element) {
      __getInternalInterface().removeArrayElement(ATTRIBUTES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Attributes array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAttributes(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ATTRIBUTES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BackupUsers array. This is achieved by marking the element for removal.
     */
    public void removeFromBackupUsers(entity.UserBackup element) {
      __getInternalInterface().removeArrayElement(BACKUPUSERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BackupUsers array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBackupUsers(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BACKUPUSERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the GroupUsers array. This is achieved by marking the element for removal.
     */
    public void removeFromGroupUsers(entity.GroupUser element) {
      __getInternalInterface().removeArrayElement(GROUPUSERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the GroupUsers array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromGroupUsers(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(GROUPUSERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Regions array. This is achieved by marking the element for removal.
     */
    public void removeFromRegions(entity.UserRegion element) {
      __getInternalInterface().removeArrayElement(REGIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Regions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRegions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(REGIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     */
    public void removeFromRoles(entity.UserRole element) {
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
     * Removes the given element from the SuperviseesCacheArray array. This is achieved by marking the element for removal.
     */
    public void removeFromSuperviseesCacheArray(entity.SuperviseesCache element) {
      __getInternalInterface().removeArrayElement(SUPERVISEESCACHEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SuperviseesCacheArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSuperviseesCacheArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SUPERVISEESCACHEARRAY_PROP.get(), elementID);
    }
    
    public void removeReferences() {
      ((com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods")).removeReferences();
    }
    
    public boolean removeRegion(entity.Region region) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).removeRegion(region);
    }
    
    public boolean removeRole(entity.Role role) {
      return ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).removeRole(role);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Returns true if this user is restricted to viewing only his organizations objects.
     * @return true if restricted
     */
    public boolean restrictedToOwnOrg() {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).restrictedToOwnOrg();
    }
    
    public void retireCustomAuthorityLimitProfile() {
      ((com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods")).retireCustomAuthorityLimitProfile();
    }
    
    /**
     * Property that indicates whether user's account is locked. Reading this property requires User.view permission.
     * The property is writable, if you have User.edit permission, and can be used to lock or unlock the user account
     * @param locked 
     */
    public void setAccountLocked(boolean locked) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setAccountLocked(locked);
    }
    
    /**
     * Sets the value of the Attributes field.
     */
    public void setAttributes(entity.AttributeUser[] value) {
      __getInternalInterface().setFieldValue(ATTRIBUTES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AuthorityProfile field.
     */
    public void setAuthorityProfile(entity.AuthorityLimitProfile value) {
      __getInternalInterface().setFieldValue(AUTHORITYPROFILE_PROP.get(), value);
    }
    
    public void setAuthorityProfileID(gw.pl.persistence.core.Key value) {
      setFieldValue(AUTHORITYPROFILE_PROP.get(), value);
    }
    
    /**
     * Sets the backup user for this user
     * @param value The new backup user for this user
     */
    public void setBackupUser(entity.User value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setBackupUser(value);
    }
    
    /**
     * Sets the ID of the backup user for this user
     * @param value The ID of the new backup user for this user
     */
    public void setBackupUserId(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setBackupUserId(value);
    }
    
    /**
     * Sets the value of the BackupUsers field.
     */
    public void setBackupUsers(entity.UserBackup[] value) {
      __getInternalInterface().setFieldValue(BACKUPUSERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contact field.
     */
    public void setContact(entity.UserContact value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
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
     * Sets the value of the Credential field.
     */
    public void setCredential(entity.Credential value) {
      __getInternalInterface().setFieldValue(CREDENTIAL_PROP.get(), value);
    }
    
    public void setCredentialID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREDENTIAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DefaultCountry field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setDefaultCountry(typekey.Country value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setDefaultCountry(value);
    }
    
    /**
     * Sets the value of the DefaultPhoneCountry field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setDefaultPhoneCountry(typekey.PhoneCountryCode value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setDefaultPhoneCountry(value);
    }
    
    /**
     * Sets the value of the Department field.
     */
    public void setDepartment(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DEPARTMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExperienceLevel field.
     */
    public void setExperienceLevel(typekey.UserExperienceType value) {
      __getInternalInterface().setFieldValue(EXPERIENCELEVEL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternalUser field.
     */
    public void setExternalUser(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXTERNALUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GroupUsers field.
     */
    public void setGroupUsers(entity.GroupUser[] value) {
      __getInternalInterface().setFieldValue(GROUPUSERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JobTitle field.
     */
    public void setJobTitle(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(JOBTITLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Language field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setLanguage(typekey.LanguageType value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setLanguage(value);
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
     * Sets the value of the Locale field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setLocale(typekey.LocaleType value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setLocale(value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewlyAssignedActivities field.
     */
    public void setNewlyAssignedActivities(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWLYASSIGNEDACTIVITIES_PROP.get(), value);
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
     * Sets the value of the OffsetStatsUpdateTime field.
     */
    public void setOffsetStatsUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(OFFSETSTATSUPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Organization field.
     */
    public void setOrganization(entity.Organization value) {
      __getInternalInterface().setFieldValue(ORGANIZATION_PROP.get(), value);
    }
    
    public void setOrganizationID(gw.pl.persistence.core.Key value) {
      setFieldValue(ORGANIZATION_PROP.get(), value);
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
     * Sets the value of the QuickClaim field.
     */
    public void setQuickClaim(typekey.QuickClaimDefault value) {
      __getInternalInterface().setFieldValue(QUICKCLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Regions field.
     */
    public void setRegions(entity.UserRegion[] value) {
      __getInternalInterface().setFieldValue(REGIONS_PROP.get(), value);
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
    public void setRoles(entity.UserRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SessionTimeoutSecs field.
     */
    public void setSessionTimeoutSecs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SESSIONTIMEOUTSECS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpatialPointDenorm field.
     */
    public void setSpatialPointDenorm(gw.api.database.spatial.SpatialPoint value) {
      __getInternalInterface().setFieldValue(SPATIALPOINTDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SuperviseesCache field.
     */
    public void setSuperviseesCache(entity.SuperviseesCache value) {
      __getInternalInterface().setFieldValue(SUPERVISEESCACHE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SuperviseesCacheArray field.
     */
    public void setSuperviseesCacheArray(entity.SuperviseesCache[] value) {
      __getInternalInterface().setFieldValue(SUPERVISEESCACHEARRAY_PROP.get(), value);
    }
    
    public void setSuperviseesCacheID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUPERVISEESCACHE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SystemUserType field.
     */
    public void setSystemUserType(typekey.SystemUserType value) {
      __getInternalInterface().setFieldValue(SYSTEMUSERTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TimeZone field.
     */
    public void setTimeZone(typekey.TimeZoneType value) {
      __getInternalInterface().setFieldValue(TIMEZONE_PROP.get(), value);
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
     * Sets the value of the UserSettings field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setUserSettings(entity.UserSettings value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setUserSettings(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setUserSettingsID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).setUserSettingsID(value);
    }
    
    /**
     * Sets the value of the VacationStatus field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setVacationStatus(typekey.VacationStatusType value) {
      ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).setVacationStatus(value);
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
    
    public boolean syncRoles(java.lang.String[] roleNames) {
      return ((com.guidewire.pl.domain.community.UserPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserPublicMethods")).syncRoles(roleNames);
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
    
    public void unlockAccount() {
      ((com.guidewire.pl.domain.community.impl.UserInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserInternalMethods")).unlockAccount();
    }
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.community.impl.UserCoreExtInternalMethods", "com.guidewire.cc.domain.community.impl.UserCoreExtMethodsImpl");
    config.put("com.guidewire.cc.domain.community.impl.UserCoreExtMethods", "com.guidewire.cc.domain.community.impl.UserCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.community.UserPublicMethods", "com.guidewire.pl.domain.community.impl.UserImpl");
    config.put("com.guidewire.pl.domain.community.impl.UserInternalMethods", "com.guidewire.pl.domain.community.impl.UserImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.community.impl.UserImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.community.impl.UserImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.User.class, config);
    com.guidewire._generated.entity.UserInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.User, com.guidewire._generated.entity.UserInternal>() {
      public java.lang.Object getImplementation(entity.User bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UserInternal getInternalInterface(entity.User bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.User newEmptyInstance() {
        return new entity.User((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}