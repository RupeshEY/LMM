package entity;

/**
 * Group
 * Groups of users.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Group.eti;Group.eix;Group.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Group")
public class Group extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.EventAware, gw.api.assignment.Assignee {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Group> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Group>("entity.Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ASSIGNABLEQUEUES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AssignableQueues");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GROUPTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GroupType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADFACTOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadFactor");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NAME_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Name_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ORGANIZATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Organization");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Parent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PARENTGROUPARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ParentgroupArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> REGIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Regions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SECURITYZONE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SecurityZone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUPERVISOR_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Supervisor");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> USERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Users");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VISIBILITYZONE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "VisibilityZone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VISIBILITYZONEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "VisibilityzoneArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORLDVISIBLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorldVisible");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.GroupInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.community.PublicGroupFinder finder = com.guidewire.cc.domain.community.impl.GroupCoreExtMethods.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Group()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Group(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Group(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.GroupInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.GroupInternal __getInternalInterface() {
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
   * Adds the given element to the AssignableQueues array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAssignableQueues(entity.AssignableQueue element) {
    __getInternalInterface().addArrayElement(ASSIGNABLEQUEUES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Regions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRegions(entity.GroupRegion element) {
    __getInternalInterface().addArrayElement(REGIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUsers(entity.GroupUser element) {
    __getInternalInterface().addArrayElement(USERS_PROP.get(), element);
  }
  
  /**
   * Assign the given assignable entity according to this destination.
   * @param assignableBean the entity to be assigned
   * @throws NoAssignmentFoundException if no assignment could be found (possible if, for example, this
   *   assignee does automatic assignment)
   * @throws IllegalAssignmentException if this assignee is not suitable for the given assignable entity
   */
  public void assignToThis(entity.Assignable assignableBean) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
    ((gw.api.assignment.Assignee)__getDelegateManager().getImplementation("gw.api.assignment.Assignee")).assignToThis(assignableBean);
  }
  
  /**
   * Returns true if and only if this group contains the given user.
   * Note that a user can be contained in a group, but not be a member.
   * Hence, the group's user set is a (not necessarily strict) superset
   * of its membership.
   * @param user 
   */
  public boolean containsUser(entity.User user) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).containsUser(user);
  }
  
  public gw.api.database.IQueryBeanResult<entity.Claim> findOpenClaims() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenClaims();
  }
  
  public gw.api.database.IQueryBeanResult<entity.Exposure> findOpenExposures() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenExposures();
  }
  
  public gw.api.database.IQueryBeanResult<entity.Matter> findOpenMatters() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenMatters();
  }
  
  /**
   * Gets the value of the AssignableQueues field.
   * Assignment queues associated with this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue[] getAssignableQueues() {
    return (entity.AssignableQueue[])__getInternalInterface().getFieldValue(ASSIGNABLEQUEUES_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Returns all of the groups having this group as their parent and
   * which are visible to the caller.
   */
  public entity.Group[] getChildGroups() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getChildGroups();
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
   * Gets the value of the GroupType field.
   * Type of group (describes its function).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getGroupType() {
    return (typekey.GroupType)__getInternalInterface().getFieldValue(GROUPTYPE_PROP.get());
  }
  
  /**
   * Gets the <code>GroupUser</code> entry in this group that references the given <code>user</code>. This method compares
   * the <code>user.userID</cod> against the group members' to locate a match.
   * @param user The <code>user</code> entity to match.
   * @return GroupUser  The matching <code>GroupUser</code> entity or <code>null</code> if there is no such <code>GroupUser</code>.
   */
  public entity.GroupUser getGroupUser(entity.User user) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getGroupUser(user);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LoadFactor field.
   * Percentage value of normal workload to be given to this group. This is used for round-robin assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLoadFactor() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOADFACTOR_PROP.get());
  }
  
  /**
   * Returns all the users in this group that are members (including system users)
   * @return 
   */
  public entity.GroupUser[] getMembers() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembers();
  }
  
  /**
   * Returns all the users in this group that are members but who aren't system users
   * @return 
   */
  public entity.GroupUser[] getMembersNoSystemUsers() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsers();
  }
  
  /**
   * Returns all the users in this group that are members but who aren't system users.  Returns a List of User objects,
   * NOT GroupUser objects.
   * @return 
   */
  public java.util.List getMembersNoSystemUsersAsList() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsersAsList();
  }
  
  /**
   * Returns all the users in this group that are members, sorted by name
   * @return 
   */
  public entity.GroupUser[] getMembersNoSystemUsersSortedByName() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsersSortedByName();
  }
  
  /**
   * Gets the value of the Name field.
   * The group name; this must be unique.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * Gets the value of the NameKanji field.
   * The group name in Kanji. Used only for Japanese and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group_Name_L10N[] getName_L10N_ARRAY() {
    return (entity.Group_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Name_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"));
  }
  
  /**
   * 
   * @return All open activities assigned to this group.
   */
  public entity.Activity[] getOpenActivities() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getOpenActivities();
  }
  
  /**
   * 
   * @return Count of all open activities assigned to this group.
   */
  public int getOpenActivityCount() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getOpenActivityCount();
  }
  
  public int getOpenClaimCount() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenClaimCount();
  }
  
  @java.lang.Deprecated
  public entity.Claim[] getOpenClaims() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenClaims();
  }
  
  public int getOpenExposureCount() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenExposureCount();
  }
  
  @java.lang.Deprecated
  public entity.Exposure[] getOpenExposures() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenExposures();
  }
  
  public int getOpenMatterCount() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenMatterCount();
  }
  
  @java.lang.Deprecated
  public entity.Matter[] getOpenMatters() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenMatters();
  }
  
  /**
   * Gets the value of the Organization field.
   * The Organization that this group belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization() {
    return (entity.Organization)__getInternalInterface().getFieldValue(ORGANIZATION_PROP.get());
  }
  
  /**
   * Gets the value of the Parent field.
   * The group's parent group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getParent() {
    return (entity.Group)__getInternalInterface().getFieldValue(PARENT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Parentgroup[] getParentgroupArray() {
    return (entity.Parentgroup[])__getInternalInterface().getFieldValue(PARENTGROUPARRAY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * 
   * @param queueName name of the queue to get
   * @return The named AssignableQueue associated with this, or null if it does not exist...
   */
  public entity.AssignableQueue getQueue(java.lang.String queueName) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getQueue(queueName);
  }
  
  /**
   * Gets the value of the Regions field.
   * Regions associated with this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupRegion[] getRegions() {
    return (entity.GroupRegion[])__getInternalInterface().getFieldValue(REGIONS_PROP.get());
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
   * 
   * @return the root group for this group
   */
  public entity.Group getRootGroup() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getRootGroup();
  }
  
  /**
   * Returns the id of the root group.
   */
  public gw.pl.persistence.core.Key getRootGroupId() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getRootGroupId();
  }
  
  /**
   * Gets the value of the SecurityZone field.
   * Security zone to which the group belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SecurityZone getSecurityZone() {
    return (entity.SecurityZone)__getInternalInterface().getFieldValue(SECURITYZONE_PROP.get());
  }
  
  /**
   * Gets the value of the Supervisor field.
   * Supervisor of the group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getSupervisor() {
    return (entity.User)__getInternalInterface().getFieldValue(SUPERVISOR_PROP.get());
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
   * Gets the value of the Users field.
   * Users belonging to this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupUser[] getUsers() {
    return (entity.GroupUser[])__getInternalInterface().getFieldValue(USERS_PROP.get());
  }
  
  /**
   * Returns all the users in this group EXCEPT system users
   * @return 
   */
  public entity.GroupUser[] getUsersNoSystemUsers() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getUsersNoSystemUsers();
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
   * Gets the value of the VisibilityZone field.
   * Group that defines the visibility zone for this group. A visibility zone is defined by a direct child of the root group. The visibility zone of the root group will always be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getVisibilityZone() {
    return (entity.Group)__getInternalInterface().getFieldValue(VISIBILITYZONE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Visibilityzone[] getVisibilityzoneArray() {
    return (entity.Visibilityzone[])__getInternalInterface().getFieldValue(VISIBILITYZONEARRAY_PROP.get());
  }
  
  /**
   * 
   * @param maybeChild 
   * @return true this is an ancestor group of the argument
   */
  public boolean isAncestor(entity.Group maybeChild) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isAncestor(maybeChild);
  }
  
  /**
   * Returns true if and only if the user with the given <code>userId</code>
   * is a member of this group. Note that a user may be contained in a group
   * but may not be a member of the group.
   * @param userID the key of the user to check
   * @return true if the user is a member of group, false if not
   */
  public boolean isMember(gw.pl.persistence.core.Key userID) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isMember(userID);
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
   * Tests if the group can be safely deleted. Returns false if
   * <ul>
   * <li>The group is the root group.
   * <li>The group has any sub-groups.
   * <li>The group has any users.
   * </ul>
   * @return True if the user can be safely deleted.
   */
  public boolean isSafeToDelete() {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSafeToDelete();
  }
  
  /**
   * 
   * @param userId the user to check.
   * @return true iff the userId passed in is the supervisor of this group.
   */
  public boolean isSupervisor(gw.pl.persistence.core.Key userId) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSupervisor(userId);
  }
  
  /**
   * 
   * @param userId the user to check
   * @return true iff the userId passed in is the supervisor of this group or one if it's parents.
   */
  public boolean isSupervisorInChain(gw.pl.persistence.core.Key userId) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSupervisorInChain(userId);
  }
  
  /**
   * Gets the value of the WorldVisible field.
   * If true, this group is visible to all users, regardless of what groups they belong to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWorldVisible() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WORLDVISIBLE_PROP.get());
  }
  
  public entity.OrganizationSelection makeOrganizationSelection() {
    return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).makeOrganizationSelection();
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
   * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
   */
  public void removeFromAssignableQueues(entity.AssignableQueue element) {
    __getInternalInterface().removeArrayElement(ASSIGNABLEQUEUES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAssignableQueues(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ASSIGNABLEQUEUES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Regions array. This is achieved by marking the element for removal.
   */
  public void removeFromRegions(entity.GroupRegion element) {
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
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   */
  public void removeFromUsers(entity.GroupUser element) {
    __getInternalInterface().removeArrayElement(USERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUsers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(USERS_PROP.get(), elementID);
  }
  
  /**
   * 
   * @param user 
   * @return true if user was a member of the group, false if not.
   */
  public boolean removeUser(entity.User user) {
    return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).removeUser(user);
  }
  
  /**
   * Sets the value of the AssignableQueues field.
   */
  public void setAssignableQueues(entity.AssignableQueue[] value) {
    __getInternalInterface().setFieldValue(ASSIGNABLEQUEUES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
   * Sets the value of the GroupType field.
   */
  public void setGroupType(typekey.GroupType value) {
    __getInternalInterface().setFieldValue(GROUPTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadFactor field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setLoadFactor(java.lang.Integer value) {
    ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).setLoadFactor(value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  private void setName_L10N_ARRAY(entity.Group_Name_L10N[] value) {
    __getInternalInterface().setFieldValue(NAME_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key Name_ on array Name_L10N_ARRAY
   */
  public void setName_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Name_en_US"), value);
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
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value) {
    __getInternalInterface().setFieldValue(ORGANIZATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.Group value) {
    __getInternalInterface().setFieldValue(PARENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParentgroupArray field.
   */
  private void setParentgroupArray(entity.Parentgroup[] value) {
    __getInternalInterface().setFieldValue(PARENTGROUPARRAY_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Regions field.
   */
  public void setRegions(entity.GroupRegion[] value) {
    __getInternalInterface().setFieldValue(REGIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SecurityZone field.
   */
  public void setSecurityZone(entity.SecurityZone value) {
    __getInternalInterface().setFieldValue(SECURITYZONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Supervisor field.
   */
  public void setSupervisor(entity.User value) {
    __getInternalInterface().setFieldValue(SUPERVISOR_PROP.get(), value);
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
   * Sets the value of the Users field.
   */
  public void setUsers(entity.GroupUser[] value) {
    __getInternalInterface().setFieldValue(USERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value) {
    __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VisibilityZone field.
   */
  public void setVisibilityZone(entity.Group value) {
    __getInternalInterface().setFieldValue(VISIBILITYZONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VisibilityzoneArray field.
   */
  private void setVisibilityzoneArray(entity.Visibilityzone[] value) {
    __getInternalInterface().setFieldValue(VISIBILITYZONEARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorldVisible field.
   */
  public void setWorldVisible(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WORLDVISIBLE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.GroupInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Group.this.__getDelegateManager();
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
     * Adds the given element to the AssignableQueues array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAssignableQueues(entity.AssignableQueue element) {
      __getInternalInterface().addArrayElement(ASSIGNABLEQUEUES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToName_L10N_ARRAY(entity.Group_Name_L10N element) {
      __getInternalInterface().addArrayElement(NAME_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ParentgroupArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToParentgroupArray(entity.Parentgroup element) {
      __getInternalInterface().addArrayElement(PARENTGROUPARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Regions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRegions(entity.GroupRegion element) {
      __getInternalInterface().addArrayElement(REGIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUsers(entity.GroupUser element) {
      __getInternalInterface().addArrayElement(USERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the VisibilityzoneArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToVisibilityzoneArray(entity.Visibilityzone element) {
      __getInternalInterface().addArrayElement(VISIBILITYZONEARRAY_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Assign the given assignable entity according to this destination.
     * @param assignableBean the entity to be assigned
     * @throws NoAssignmentFoundException if no assignment could be found (possible if, for example, this
     *   assignee does automatic assignment)
     * @throws IllegalAssignmentException if this assignee is not suitable for the given assignable entity
     */
    public void assignToThis(entity.Assignable assignableBean) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((gw.api.assignment.Assignee)__getDelegateManager().getImplementation("gw.api.assignment.Assignee")).assignToThis(assignableBean);
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
    
    public void checkForReferencesBeforeRemove() {
      ((com.guidewire.pl.domain.community.impl.GroupInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.GroupInternalMethods")).checkForReferencesBeforeRemove();
    }
    
    public void checkUsersInSameOrganization(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.community.impl.GroupInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.GroupInternalMethods")).checkUsersInSameOrganization(result);
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Returns true if and only if this group contains the given user.
     * Note that a user can be contained in a group, but not be a member.
     * Hence, the group's user set is a (not necessarily strict) superset
     * of its membership.
     * @param user 
     */
    public boolean containsUser(entity.User user) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).containsUser(user);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public gw.api.database.IQueryBeanResult<entity.Claim> findOpenClaims() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenClaims();
    }
    
    public gw.api.database.IQueryBeanResult<entity.Exposure> findOpenExposures() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenExposures();
    }
    
    public gw.api.database.IQueryBeanResult<entity.Matter> findOpenMatters() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).findOpenMatters();
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
     * Gets the value of the AssignableQueues field.
     * Assignment queues associated with this group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue[] getAssignableQueues() {
      return (entity.AssignableQueue[])__getInternalInterface().getFieldValue(ASSIGNABLEQUEUES_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Returns all of the groups having this group as their parent and
     * which are visible to the caller.
     */
    public entity.Group[] getChildGroups() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getChildGroups();
    }
    
    public entity.Group[] getChildGroupsSortedByName() {
      return ((com.guidewire.pl.domain.community.impl.GroupInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.GroupInternalMethods")).getChildGroupsSortedByName();
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
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the GroupType field.
     * Type of group (describes its function).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.GroupType getGroupType() {
      return (typekey.GroupType)__getInternalInterface().getFieldValue(GROUPTYPE_PROP.get());
    }
    
    /**
     * Gets the <code>GroupUser</code> entry in this group that references the given <code>user</code>. This method compares
     * the <code>user.userID</cod> against the group members' to locate a match.
     * @param user The <code>user</code> entity to match.
     * @return GroupUser  The matching <code>GroupUser</code> entity or <code>null</code> if there is no such <code>GroupUser</code>.
     */
    public entity.GroupUser getGroupUser(entity.User user) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getGroupUser(user);
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
     * Gets the value of the LoadFactor field.
     * Percentage value of normal workload to be given to this group. This is used for round-robin assignment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLoadFactor() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOADFACTOR_PROP.get());
    }
    
    /**
     * Returns all the users in this group that are members (including system users)
     * @return 
     */
    public entity.GroupUser[] getMembers() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembers();
    }
    
    /**
     * Returns all the users in this group that are members but who aren't system users
     * @return 
     */
    public entity.GroupUser[] getMembersNoSystemUsers() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsers();
    }
    
    /**
     * Returns all the users in this group that are members but who aren't system users.  Returns a List of User objects,
     * NOT GroupUser objects.
     * @return 
     */
    public java.util.List getMembersNoSystemUsersAsList() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsersAsList();
    }
    
    /**
     * Returns all the users in this group that are members, sorted by name
     * @return 
     */
    public entity.GroupUser[] getMembersNoSystemUsersSortedByName() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getMembersNoSystemUsersSortedByName();
    }
    
    /**
     * Gets the value of the Name field.
     * The group name; this must be unique.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the NameKanji field.
     * The group name in Kanji. Used only for Japanese and will be null otherwise.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the Name_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group_Name_L10N[] getName_L10N_ARRAY() {
      return (entity.Group_Name_L10N[])__getInternalInterface().getFieldValue(NAME_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
     */
    public entity.Group_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.Group_Name_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * 
     * @return All open activities assigned to this group.
     */
    public entity.Activity[] getOpenActivities() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getOpenActivities();
    }
    
    /**
     * 
     * @return Count of all open activities assigned to this group.
     */
    public int getOpenActivityCount() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getOpenActivityCount();
    }
    
    public int getOpenClaimCount() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenClaimCount();
    }
    
    @java.lang.Deprecated
    public entity.Claim[] getOpenClaims() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenClaims();
    }
    
    public int getOpenExposureCount() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenExposureCount();
    }
    
    @java.lang.Deprecated
    public entity.Exposure[] getOpenExposures() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenExposures();
    }
    
    public int getOpenMatterCount() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenMatterCount();
    }
    
    @java.lang.Deprecated
    public entity.Matter[] getOpenMatters() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).getOpenMatters();
    }
    
    /**
     * Gets the value of the Organization field.
     * The Organization that this group belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Organization getOrganization() {
      return (entity.Organization)__getInternalInterface().getFieldValue(ORGANIZATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getOrganizationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ORGANIZATION_PROP.get());
    }
    
    /**
     * Gets the value of the Parent field.
     * The group's parent group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getParent() {
      return (entity.Group)__getInternalInterface().getFieldValue(PARENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARENT_PROP.get());
    }
    
    /**
     * Gets the value of the ParentgroupArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Parentgroup[] getParentgroupArray() {
      return (entity.Parentgroup[])__getInternalInterface().getFieldValue(PARENTGROUPARRAY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * 
     * @param queueName name of the queue to get
     * @return The named AssignableQueue associated with this, or null if it does not exist...
     */
    public entity.AssignableQueue getQueue(java.lang.String queueName) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getQueue(queueName);
    }
    
    public com.guidewire.pl.domain.assignment.AssignableQueueCounts getQueueCounts() {
      return ((com.guidewire.pl.domain.community.impl.GroupInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.GroupInternalMethods")).getQueueCounts();
    }
    
    /**
     * Gets the value of the Regions field.
     * Regions associated with this group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupRegion[] getRegions() {
      return (entity.GroupRegion[])__getInternalInterface().getFieldValue(REGIONS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * 
     * @return the root group for this group
     */
    public entity.Group getRootGroup() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getRootGroup();
    }
    
    /**
     * Returns the id of the root group.
     */
    public gw.pl.persistence.core.Key getRootGroupId() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getRootGroupId();
    }
    
    /**
     * Gets the value of the SecurityZone field.
     * Security zone to which the group belongs.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SecurityZone getSecurityZone() {
      return (entity.SecurityZone)__getInternalInterface().getFieldValue(SECURITYZONE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSecurityZoneID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SECURITYZONE_PROP.get());
    }
    
    /**
     * Gets the value of the Supervisor field.
     * Supervisor of the group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getSupervisor() {
      return (entity.User)__getInternalInterface().getFieldValue(SUPERVISOR_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSupervisorID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUPERVISOR_PROP.get());
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
     * Gets the value of the Users field.
     * Users belonging to this group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupUser[] getUsers() {
      return (entity.GroupUser[])__getInternalInterface().getFieldValue(USERS_PROP.get());
    }
    
    /**
     * Returns all the users in this group EXCEPT system users
     * @return 
     */
    public entity.GroupUser[] getUsersNoSystemUsers() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).getUsersNoSystemUsers();
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
     * Gets the value of the VisibilityZone field.
     * Group that defines the visibility zone for this group. A visibility zone is defined by a direct child of the root group. The visibility zone of the root group will always be null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getVisibilityZone() {
      return (entity.Group)__getInternalInterface().getFieldValue(VISIBILITYZONE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getVisibilityZoneID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(VISIBILITYZONE_PROP.get());
    }
    
    /**
     * Gets the value of the VisibilityzoneArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Visibilityzone[] getVisibilityzoneArray() {
      return (entity.Visibilityzone[])__getInternalInterface().getFieldValue(VISIBILITYZONEARRAY_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @param maybeChild 
     * @return true this is an ancestor group of the argument
     */
    public boolean isAncestor(entity.Group maybeChild) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isAncestor(maybeChild);
    }
    
    /**
     * Returns true if and only if the user with the given <code>userId</code>
     * is a member of this group. Note that a user may be contained in a group
     * but may not be a member of the group.
     * @param userID the key of the user to check
     * @return true if the user is a member of group, false if not
     */
    public boolean isMember(gw.pl.persistence.core.Key userID) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isMember(userID);
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
     * Tests if the group can be safely deleted. Returns false if
     * <ul>
     * <li>The group is the root group.
     * <li>The group has any sub-groups.
     * <li>The group has any users.
     * </ul>
     * @return True if the user can be safely deleted.
     */
    public boolean isSafeToDelete() {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSafeToDelete();
    }
    
    /**
     * 
     * @param userId the user to check.
     * @return true iff the userId passed in is the supervisor of this group.
     */
    public boolean isSupervisor(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSupervisor(userId);
    }
    
    /**
     * 
     * @param userId the user to check
     * @return true iff the userId passed in is the supervisor of this group or one if it's parents.
     */
    public boolean isSupervisorInChain(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).isSupervisorInChain(userId);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public boolean isThisRootGroup() {
      return ((com.guidewire.pl.domain.community.impl.GroupInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.GroupInternalMethods")).isThisRootGroup();
    }
    
    /**
     * Gets the value of the WorldVisible field.
     * If true, this group is visible to all users, regardless of what groups they belong to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWorldVisible() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WORLDVISIBLE_PROP.get());
    }
    
    public entity.OrganizationSelection makeOrganizationSelection() {
      return ((com.guidewire.cc.domain.community.impl.GroupCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods")).makeOrganizationSelection();
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
    
    /**
     * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
     */
    public void removeFromAssignableQueues(entity.AssignableQueue element) {
      __getInternalInterface().removeArrayElement(ASSIGNABLEQUEUES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AssignableQueues array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAssignableQueues(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ASSIGNABLEQUEUES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromName_L10N_ARRAY(entity.Group_Name_L10N element) {
      __getInternalInterface().removeArrayElement(NAME_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(NAME_L10N_ARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ParentgroupArray array. This is achieved by marking the element for removal.
     */
    public void removeFromParentgroupArray(entity.Parentgroup element) {
      __getInternalInterface().removeArrayElement(PARENTGROUPARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ParentgroupArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromParentgroupArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PARENTGROUPARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Regions array. This is achieved by marking the element for removal.
     */
    public void removeFromRegions(entity.GroupRegion element) {
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
     * Removes the given element from the Users array. This is achieved by marking the element for removal.
     */
    public void removeFromUsers(entity.GroupUser element) {
      __getInternalInterface().removeArrayElement(USERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Users array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUsers(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(USERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the VisibilityzoneArray array. This is achieved by marking the element for removal.
     */
    public void removeFromVisibilityzoneArray(entity.Visibilityzone element) {
      __getInternalInterface().removeArrayElement(VISIBILITYZONEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the VisibilityzoneArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromVisibilityzoneArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(VISIBILITYZONEARRAY_PROP.get(), elementID);
    }
    
    /**
     * 
     * @param user 
     * @return true if user was a member of the group, false if not.
     */
    public boolean removeUser(entity.User user) {
      return ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).removeUser(user);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AssignableQueues field.
     */
    public void setAssignableQueues(entity.AssignableQueue[] value) {
      __getInternalInterface().setFieldValue(ASSIGNABLEQUEUES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
     * Sets the value of the GroupType field.
     */
    public void setGroupType(typekey.GroupType value) {
      __getInternalInterface().setFieldValue(GROUPTYPE_PROP.get(), value);
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
     * Sets the value of the LoadFactor field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setLoadFactor(java.lang.Integer value) {
      ((com.guidewire.pl.domain.community.GroupPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.GroupPublicMethods")).setLoadFactor(value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameKanji field.
     */
    public void setNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name_L10N_ARRAY field.
     */
    public void setName_L10N_ARRAY(entity.Group_Name_L10N[] value) {
      __getInternalInterface().setFieldValue(NAME_L10N_ARRAY_PROP.get(), value);
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
     * Sets the value of the Organization field.
     */
    public void setOrganization(entity.Organization value) {
      __getInternalInterface().setFieldValue(ORGANIZATION_PROP.get(), value);
    }
    
    public void setOrganizationID(gw.pl.persistence.core.Key value) {
      setFieldValue(ORGANIZATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Parent field.
     */
    public void setParent(entity.Group value) {
      __getInternalInterface().setFieldValue(PARENT_PROP.get(), value);
    }
    
    public void setParentID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParentgroupArray field.
     */
    public void setParentgroupArray(entity.Parentgroup[] value) {
      __getInternalInterface().setFieldValue(PARENTGROUPARRAY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Regions field.
     */
    public void setRegions(entity.GroupRegion[] value) {
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
     * Sets the value of the SecurityZone field.
     */
    public void setSecurityZone(entity.SecurityZone value) {
      __getInternalInterface().setFieldValue(SECURITYZONE_PROP.get(), value);
    }
    
    public void setSecurityZoneID(gw.pl.persistence.core.Key value) {
      setFieldValue(SECURITYZONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Supervisor field.
     */
    public void setSupervisor(entity.User value) {
      __getInternalInterface().setFieldValue(SUPERVISOR_PROP.get(), value);
    }
    
    public void setSupervisorID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUPERVISOR_PROP.get(), value);
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
     * Sets the value of the Users field.
     */
    public void setUsers(entity.GroupUser[] value) {
      __getInternalInterface().setFieldValue(USERS_PROP.get(), value);
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
     * Sets the value of the VisibilityZone field.
     */
    public void setVisibilityZone(entity.Group value) {
      __getInternalInterface().setFieldValue(VISIBILITYZONE_PROP.get(), value);
    }
    
    public void setVisibilityZoneID(gw.pl.persistence.core.Key value) {
      setFieldValue(VISIBILITYZONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VisibilityzoneArray field.
     */
    public void setVisibilityzoneArray(entity.Visibilityzone[] value) {
      __getInternalInterface().setFieldValue(VISIBILITYZONEARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorldVisible field.
     */
    public void setWorldVisible(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WORLDVISIBLE_PROP.get(), value);
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
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.community.impl.GroupCoreExtMethods", "com.guidewire.cc.domain.community.impl.GroupCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.community.GroupPublicMethods", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.domain.community.impl.GroupInternalMethods", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("gw.api.assignment.Assignee", "com.guidewire.pl.domain.community.impl.GroupImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Group.class, config);
    com.guidewire._generated.entity.GroupInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Group, com.guidewire._generated.entity.GroupInternal>() {
      public java.lang.Object getImplementation(entity.Group bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.GroupInternal getInternalInterface(entity.Group bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Group newEmptyInstance() {
        return new entity.Group((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}