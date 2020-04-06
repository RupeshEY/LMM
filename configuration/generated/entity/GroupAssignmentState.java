package entity;

/**
 * GroupAssignmentState
 * 
 *         Maintains round-robin assignment state for a particular group or for a particular group and all
 *         its subgroups. This is an internal class which should only be used by the internals of the
 *         assignment engine.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupAssignmentState.eti;GroupAssignmentState.eix;GroupAssignmentState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "GroupAssignmentState")
public class GroupAssignmentState extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.LastAssignedUserContainerBase, entity.LastAssignedUserContainer {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GroupAssignmentState> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GroupAssignmentState>("entity.GroupAssignmentState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACTIVITYLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ActivityLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURELOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GROUPTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GroupType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCLUDESUBGROUPS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncludeSubGroups");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTACTIVITYGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastActivityGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTACTIVITYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastActivityUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTCLAIMGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastClaimGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTCLAIMUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastClaimUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTEXPOSUREGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastExposureGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTEXPOSUREUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastExposureUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTMATTERGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastMatterGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTMATTERUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastMatterUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTREVIEWGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastReviewGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTREVIEWUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastReviewUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSERVICEREQUESTGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastServiceRequestGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSERVICEREQUESTUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastServiceRequestUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSUBROGATIONGRP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastSubrogationGrp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LASTSUBROGATIONUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LastSubrogationUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATTERLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatterLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REVIEWLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReviewLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEREQUESTLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServiceRequestLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROGATIONLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubrogationLoad");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> USERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Users");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.GroupAssignmentStateInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public GroupAssignmentState()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public GroupAssignmentState(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected GroupAssignmentState(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.GroupAssignmentStateInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.GroupAssignmentStateInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUsers(entity.GroupUserAssignmentState element) {
    __getInternalInterface().addArrayElement(USERS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the ActivityLoad field.
   * The current load of the group for activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getActivityLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ACTIVITYLOAD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ClaimLoad field.
   * The current load of the group for claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMLOAD_PROP.get());
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
   * Gets the value of the ExposureLoad field.
   * The current load of the group for exposures.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSURELOAD_PROP.get());
  }
  
  /**
   * Gets the value of the Group field.
   * The group this state is tracking.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
  }
  
  /**
   * Gets the value of the GroupType field.
   * The group type this state is tracking.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getGroupType() {
    return (typekey.GroupType)__getInternalInterface().getFieldValue(GROUPTYPE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LastActivityGrp field.
   * The id of the last group that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastActivityGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTACTIVITYGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastActivityUser field.
   * The id of the last user that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastActivityUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTACTIVITYUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastClaimGrp field.
   * The id of the last group that was assigned a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastClaimGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTCLAIMGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastClaimUser field.
   * The id of the last user that was assigned a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastClaimUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTCLAIMUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastExposureGrp field.
   * The id of the last group that was assigned an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastExposureGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTEXPOSUREGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastExposureUser field.
   * The id of the last user that was assigned an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastExposureUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTEXPOSUREUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastMatterGrp field.
   * The id of the last group that was assigned a matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastMatterGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTMATTERGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastMatterUser field.
   * The id of the last user that was assigned a matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastMatterUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTMATTERUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastReviewGrp field.
   * The id of the last group that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastReviewGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTREVIEWGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastReviewUser field.
   * The id of the last user that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastReviewUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTREVIEWUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastServiceRequestGrp field.
   * The id of the last group that was assigned a service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastServiceRequestGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTSERVICEREQUESTGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastServiceRequestUser field.
   * The id of the last user that was assigned a service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastServiceRequestUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTSERVICEREQUESTUSER_PROP.get());
  }
  
  /**
   * Gets the value of the LastSubrogationGrp field.
   * The id of the last group that was assigned a subrogation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastSubrogationGrp() {
    return (entity.Group)__getInternalInterface().getFieldValue(LASTSUBROGATIONGRP_PROP.get());
  }
  
  /**
   * Gets the value of the LastSubrogationUser field.
   * The id of the last user that was assigned a subrogation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastSubrogationUser() {
    return (entity.User)__getInternalInterface().getFieldValue(LASTSUBROGATIONUSER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
  }
  
  /**
   * Gets the value of the MatterLoad field.
   * The current load of the group for matters.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMatterLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MATTERLOAD_PROP.get());
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
   * Gets the value of the ReviewLoad field.
   * The current load of the group for assignment review activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getReviewLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(REVIEWLOAD_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestLoad field.
   * The current load of the group for service requests.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getServiceRequestLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SERVICEREQUESTLOAD_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationLoad field.
   * The current load of the group for subrogations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubrogationLoad() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROGATIONLOAD_PROP.get());
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
  public entity.GroupUserAssignmentState[] getUsers() {
    return (entity.GroupUserAssignmentState[])__getInternalInterface().getFieldValue(USERS_PROP.get());
  }
  
  /**
   * Gets the value of the IncludeSubGroups field.
   * Is this assignment state for just this group, or does it include the sub groups as well.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeSubGroups() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDESUBGROUPS_PROP.get());
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
   * Removes the given element from the Users array. This is achieved by marking the element for removal.
   */
  public void removeFromUsers(entity.GroupUserAssignmentState element) {
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
   * Sets the value of the ActivityLoad field.
   */
  public void setActivityLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ACTIVITYLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLoad field.
   */
  public void setClaimLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMLOAD_PROP.get(), value);
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
   * Sets the value of the ExposureLoad field.
   */
  public void setExposureLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPOSURELOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
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
   * Sets the value of the IncludeSubGroups field.
   */
  public void setIncludeSubGroups(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCLUDESUBGROUPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastActivityGrp field.
   */
  public void setLastActivityGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTACTIVITYGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastActivityUser field.
   */
  public void setLastActivityUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTACTIVITYUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastClaimGrp field.
   */
  public void setLastClaimGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTCLAIMGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastClaimUser field.
   */
  public void setLastClaimUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTCLAIMUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastExposureGrp field.
   */
  public void setLastExposureGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTEXPOSUREGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastExposureUser field.
   */
  public void setLastExposureUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTEXPOSUREUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastMatterGrp field.
   */
  public void setLastMatterGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTMATTERGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastMatterUser field.
   */
  public void setLastMatterUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTMATTERUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastReviewGrp field.
   */
  public void setLastReviewGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTREVIEWGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastReviewUser field.
   */
  public void setLastReviewUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTREVIEWUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastServiceRequestGrp field.
   */
  public void setLastServiceRequestGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTSERVICEREQUESTGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastServiceRequestUser field.
   */
  public void setLastServiceRequestUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTSERVICEREQUESTUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastSubrogationGrp field.
   */
  public void setLastSubrogationGrp(entity.Group value) {
    __getInternalInterface().setFieldValue(LASTSUBROGATIONGRP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastSubrogationUser field.
   */
  public void setLastSubrogationUser(entity.User value) {
    __getInternalInterface().setFieldValue(LASTSUBROGATIONUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterLoad field.
   */
  public void setMatterLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MATTERLOAD_PROP.get(), value);
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
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReviewLoad field.
   */
  public void setReviewLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(REVIEWLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequestLoad field.
   */
  public void setServiceRequestLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationLoad field.
   */
  public void setSubrogationLoad(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBROGATIONLOAD_PROP.get(), value);
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
  public void setUsers(entity.GroupUserAssignmentState[] value) {
    __getInternalInterface().setFieldValue(USERS_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.GroupAssignmentStateInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.GroupAssignmentState.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Users array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUsers(entity.GroupUserAssignmentState element) {
      __getInternalInterface().addArrayElement(USERS_PROP.get(), element);
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
    
    /**
     * Gets the value of the ActivityLoad field.
     * The current load of the group for activities.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getActivityLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ACTIVITYLOAD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimLoad field.
     * The current load of the group for claims.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMLOAD_PROP.get());
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
     * Gets the value of the ExposureLoad field.
     * The current load of the group for exposures.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExposureLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSURELOAD_PROP.get());
    }
    
    /**
     * Gets the value of the Group field.
     * The group this state is tracking.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
    }
    
    /**
     * Gets the value of the GroupType field.
     * The group type this state is tracking.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.GroupType getGroupType() {
      return (typekey.GroupType)__getInternalInterface().getFieldValue(GROUPTYPE_PROP.get());
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
     * Gets the value of the LastActivityGrp field.
     * The id of the last group that was assigned an activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastActivityGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTACTIVITYGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastActivityGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTACTIVITYGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastActivityUser field.
     * The id of the last user that was assigned an activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastActivityUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTACTIVITYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastActivityUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTACTIVITYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastClaimGrp field.
     * The id of the last group that was assigned a claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastClaimGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTCLAIMGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastClaimGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTCLAIMGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastClaimUser field.
     * The id of the last user that was assigned a claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastClaimUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTCLAIMUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastClaimUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTCLAIMUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastExposureGrp field.
     * The id of the last group that was assigned an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastExposureGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTEXPOSUREGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastExposureGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTEXPOSUREGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastExposureUser field.
     * The id of the last user that was assigned an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastExposureUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTEXPOSUREUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastExposureUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTEXPOSUREUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastMatterGrp field.
     * The id of the last group that was assigned a matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastMatterGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTMATTERGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastMatterGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTMATTERGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastMatterUser field.
     * The id of the last user that was assigned a matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastMatterUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTMATTERUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastMatterUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTMATTERUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastReviewGrp field.
     * The id of the last group that was assigned an assignment review activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastReviewGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTREVIEWGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastReviewGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTREVIEWGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastReviewUser field.
     * The id of the last user that was assigned an assignment review activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastReviewUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTREVIEWUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastReviewUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTREVIEWUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastServiceRequestGrp field.
     * The id of the last group that was assigned a service request.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastServiceRequestGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTSERVICEREQUESTGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastServiceRequestGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTSERVICEREQUESTGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastServiceRequestUser field.
     * The id of the last user that was assigned a service request.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastServiceRequestUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTSERVICEREQUESTUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastServiceRequestUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTSERVICEREQUESTUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LastSubrogationGrp field.
     * The id of the last group that was assigned a subrogation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getLastSubrogationGrp() {
      return (entity.Group)__getInternalInterface().getFieldValue(LASTSUBROGATIONGRP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastSubrogationGrpID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTSUBROGATIONGRP_PROP.get());
    }
    
    /**
     * Gets the value of the LastSubrogationUser field.
     * The id of the last user that was assigned a subrogation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getLastSubrogationUser() {
      return (entity.User)__getInternalInterface().getFieldValue(LASTSUBROGATIONUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLastSubrogationUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LASTSUBROGATIONUSER_PROP.get());
    }
    
    /**
     * Gets the value of the LockingColumn field.
     * Meaningless column for locking
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLockingColumn() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
    }
    
    /**
     * Gets the value of the MatterLoad field.
     * The current load of the group for matters.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMatterLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MATTERLOAD_PROP.get());
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
     * Gets the value of the ReviewLoad field.
     * The current load of the group for assignment review activities.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getReviewLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(REVIEWLOAD_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestLoad field.
     * The current load of the group for service requests.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getServiceRequestLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SERVICEREQUESTLOAD_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationLoad field.
     * The current load of the group for subrogations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubrogationLoad() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROGATIONLOAD_PROP.get());
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
    public entity.GroupUserAssignmentState[] getUsers() {
      return (entity.GroupUserAssignmentState[])__getInternalInterface().getFieldValue(USERS_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the IncludeSubGroups field.
     * Is this assignment state for just this group, or does it include the sub groups as well.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeSubGroups() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDESUBGROUPS_PROP.get());
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
     * Removes the given element from the Users array. This is achieved by marking the element for removal.
     */
    public void removeFromUsers(entity.GroupUserAssignmentState element) {
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ActivityLoad field.
     */
    public void setActivityLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ACTIVITYLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLoad field.
     */
    public void setClaimLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMLOAD_PROP.get(), value);
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
     * Sets the value of the ExposureLoad field.
     */
    public void setExposureLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPOSURELOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Group field.
     */
    public void setGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
    }
    
    public void setGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(GROUP_PROP.get(), value);
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
    
    /**
     * Sets the value of the IncludeSubGroups field.
     */
    public void setIncludeSubGroups(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDESUBGROUPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastActivityGrp field.
     */
    public void setLastActivityGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTACTIVITYGRP_PROP.get(), value);
    }
    
    public void setLastActivityGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTACTIVITYGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastActivityUser field.
     */
    public void setLastActivityUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTACTIVITYUSER_PROP.get(), value);
    }
    
    public void setLastActivityUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTACTIVITYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastClaimGrp field.
     */
    public void setLastClaimGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTCLAIMGRP_PROP.get(), value);
    }
    
    public void setLastClaimGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTCLAIMGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastClaimUser field.
     */
    public void setLastClaimUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTCLAIMUSER_PROP.get(), value);
    }
    
    public void setLastClaimUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTCLAIMUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastExposureGrp field.
     */
    public void setLastExposureGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTEXPOSUREGRP_PROP.get(), value);
    }
    
    public void setLastExposureGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTEXPOSUREGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastExposureUser field.
     */
    public void setLastExposureUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTEXPOSUREUSER_PROP.get(), value);
    }
    
    public void setLastExposureUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTEXPOSUREUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastMatterGrp field.
     */
    public void setLastMatterGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTMATTERGRP_PROP.get(), value);
    }
    
    public void setLastMatterGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTMATTERGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastMatterUser field.
     */
    public void setLastMatterUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTMATTERUSER_PROP.get(), value);
    }
    
    public void setLastMatterUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTMATTERUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastReviewGrp field.
     */
    public void setLastReviewGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTREVIEWGRP_PROP.get(), value);
    }
    
    public void setLastReviewGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTREVIEWGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastReviewUser field.
     */
    public void setLastReviewUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTREVIEWUSER_PROP.get(), value);
    }
    
    public void setLastReviewUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTREVIEWUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastServiceRequestGrp field.
     */
    public void setLastServiceRequestGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTSERVICEREQUESTGRP_PROP.get(), value);
    }
    
    public void setLastServiceRequestGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTSERVICEREQUESTGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastServiceRequestUser field.
     */
    public void setLastServiceRequestUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTSERVICEREQUESTUSER_PROP.get(), value);
    }
    
    public void setLastServiceRequestUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTSERVICEREQUESTUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastSubrogationGrp field.
     */
    public void setLastSubrogationGrp(entity.Group value) {
      __getInternalInterface().setFieldValue(LASTSUBROGATIONGRP_PROP.get(), value);
    }
    
    public void setLastSubrogationGrpID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTSUBROGATIONGRP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastSubrogationUser field.
     */
    public void setLastSubrogationUser(entity.User value) {
      __getInternalInterface().setFieldValue(LASTSUBROGATIONUSER_PROP.get(), value);
    }
    
    public void setLastSubrogationUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(LASTSUBROGATIONUSER_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterLoad field.
     */
    public void setMatterLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MATTERLOAD_PROP.get(), value);
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
     * Sets the value of the ReviewLoad field.
     */
    public void setReviewLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(REVIEWLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequestLoad field.
     */
    public void setServiceRequestLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationLoad field.
     */
    public void setSubrogationLoad(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBROGATIONLOAD_PROP.get(), value);
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
    public void setUsers(entity.GroupUserAssignmentState[] value) {
      __getInternalInterface().setFieldValue(USERS_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.assignment.entity.LastAssignedUserContainer", "com.guidewire.cc.domain.assignment.impl.LastAssignedUserContainerImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.GroupAssignmentState.class, config);
    com.guidewire._generated.entity.GroupAssignmentStateInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.GroupAssignmentState, com.guidewire._generated.entity.GroupAssignmentStateInternal>() {
      public java.lang.Object getImplementation(entity.GroupAssignmentState bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.GroupAssignmentStateInternal getInternalInterface(entity.GroupAssignmentState bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.GroupAssignmentState newEmptyInstance() {
        return new entity.GroupAssignmentState((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}