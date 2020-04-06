package entity;

/**
 * UserSearchCriteria
 * 
 *         Encapsulates ClaimCenter-specific extensions to the UserSearchCriteria. This is a UserSearchCriteria subtype.
 *         This entity exists only to support a search, the system does not store it.         
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserSearchCriteria.eti;UserSearchCriteria.eix;UserSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UserSearchCriteria")
public class UserSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UserSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UserSearchCriteria>("entity.UserSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ATTRIBUTENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AttributeName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ATTRIBUTESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AttributeState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ATTRIBUTEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AttributeValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROUPNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GroupName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROUPNAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GroupNameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GROUPTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GroupType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCLUDEDEFAULTOWNER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncludeDefaultOwner");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCLUDESYSTEMUSERS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncludeSystemUsers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTINANYGROUP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NotInAnyGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ORGANIZATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Organization");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARENTGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ParentGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ROLE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Role");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> USERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Username");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UserSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UserSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UserSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UserSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UserSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UserSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Returns a set of all roles which can be searched for, sorted by name.
   * @return an array containing the possible roles.
   */
  public entity.Role[] getAllRoles() {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).getAllRoles();
  }
  
  /**
   * Gets the value of the AttributeName field.
   * Match the attribute name with those a user might possess.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttributeName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTENAME_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeState field.
   * Match the attribute state with those a user might possess.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getAttributeState() {
    return (typekey.State)__getInternalInterface().getFieldValue(ATTRIBUTESTATE_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeValue field.
   * Match the attribute value with those a user might possess.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAttributeValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ATTRIBUTEVALUE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Contact field.
   * The user's contact information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactSearchCriteria getContact() {
    return (entity.ContactSearchCriteria)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the Group field.
   * Match the group that a user might belong.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
  }
  
  /**
   * Gets the value of the GroupName field.
   * Name of group the user belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGroupName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPNAME_PROP.get());
  }
  
  /**
   * Gets the value of the GroupNameKanji field.
   * Name of group the user belongs to in Kanji. Used only for Japanese.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGroupNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPNAMEKANJI_PROP.get());
  }
  
  /**
   * Gets the value of the GroupType field.
   * Type of group.
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
   * Gets the value of the Organization field.
   * The organization the user belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization() {
    return (entity.Organization)__getInternalInterface().getFieldValue(ORGANIZATION_PROP.get());
  }
  
  /**
   * Gets the value of the ParentGroup field.
   * Parent of the group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getParentGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(PARENTGROUP_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Role field.
   * The role which the user has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Role getRole() {
    return (entity.Role)__getInternalInterface().getFieldValue(ROLE_PROP.get());
  }
  
  /**
   * Returns only internal or external roles only controlled by the boolean parameter passed in.
   * @param isCarrierInternalRole 
   * @return returns either internal or external roles only, depending on the boolean parameter passed in
   */
  public gw.api.database.IQueryBeanResult getRoles(boolean isCarrierInternalRole) {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).getRoles(isCarrierInternalRole);
  }
  
  /**
   * Gets the value of the Username field.
   * Username
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUsername() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the IncludeDefaultOwner field.
   * Include in search users who might be the default owner.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeDefaultOwner() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEDEFAULTOWNER_PROP.get());
  }
  
  /**
   * Gets the value of the IncludeSystemUsers field.
   * Include in search system users.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeSystemUsers() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDESYSTEMUSERS_PROP.get());
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
   * Gets the value of the NotInAnyGroup field.
   * Include in the search users not in any group
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNotInAnyGroup() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(NOTINANYGROUP_PROP.get());
  }
  
  /**
   * Searches for visible UserGroups with users matching the last name and first
   * name fields specified in the criteria. Visible user groups have groups that
   * are in the same security zone(s) as the current user
   * (see {@link entity.User#getGroupsInSecurityZones()}) unless the user has the
   * special "view all users" permission, in which case all groups are visible.
   * <p/>
   * Note that since this search takes its results from the UserGroup table,
   * users with no groups will not be returned.
   * @return all visible user groups that match the criteria
   */
  public gw.api.database.IQueryBeanResult performGroupUserSearch() {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performGroupUserSearch();
  }
  
  /**
   * Performs a User search based on the passed-in criteria.
   * @return a QueryProcessor containing the User search results
   */
  public gw.api.database.IQueryBeanResult performSearch() {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearch();
  }
  
  /**
   * Performs a search based on the criteria that have been established.  Results are returned as a query
   * of User(Base?) entities.
   * @return a query of User entities
   */
  public gw.api.database.IQueryBeanResult performSearchByProximity() {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity();
  }
  
  /**
   * Performs a search based on the criteria that have been established.  Results are returned as a query
   * of User(Base?) entities.
   * @param webLocation the Pebbles/PCF location within the UI.  This must be null if this is being called from a scripting context.
   * @return a query of User entities
   * @deprecated this will create a new helper each time the search is performed, use the method which accepts a helper to preserve that across calls
   */
  @java.lang.Deprecated
  public gw.api.database.IQueryBeanResult performSearchByProximity(pcf.api.Location webLocation) {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity(webLocation);
  }
  
  /**
   * Performs a search based on the criteria that have been established.  Results are returned as a query
   * of User entities.
   * @param webLocation the Pebbles/PCF location within the UI.  This must be null if this is being called from a scripting context.
   * @param inPsph the ProximitySearchPagerHelper object from the calling page within the ui. This must be null if this is being called from a scripting context.
   * @return a query of User entities
   */
  public gw.api.database.IQueryBeanResult performSearchByProximity(pcf.api.Location webLocation, gw.api.contact.ProximitySearchPageHelper inPsph) {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity(webLocation, inPsph);
  }
  
  public gw.api.database.IQueryBeanResult performSearchByProximityForAssignmentCandidateUsers(gw.pl.persistence.core.Key[] groupIds, typekey.SystemPermissionType[] requiredPermissions) {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximityForAssignmentCandidateUsers(groupIds, requiredPermissions);
  }
  
  /**
   * Performs a search based on the criteria that have been established, but requires that an organization has
   * been set and that the organization's id is not temporary.
   * @return a QueryProcessor containing Users
   */
  public gw.api.database.IQueryBeanResult performSearchWithOrganization() {
    return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchWithOrganization();
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
   * Sets the value of the AttributeName field.
   */
  public void setAttributeName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ATTRIBUTENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeState field.
   */
  public void setAttributeState(typekey.State value) {
    __getInternalInterface().setFieldValue(ATTRIBUTESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeValue field.
   */
  public void setAttributeValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ATTRIBUTEVALUE_PROP.get(), value);
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
  public void setContact(entity.ContactSearchCriteria value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GroupName field.
   */
  public void setGroupName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(GROUPNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GroupNameKanji field.
   */
  public void setGroupNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(GROUPNAMEKANJI_PROP.get(), value);
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
   * Sets the value of the IncludeDefaultOwner field.
   */
  public void setIncludeDefaultOwner(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCLUDEDEFAULTOWNER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncludeSystemUsers field.
   */
  public void setIncludeSystemUsers(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCLUDESYSTEMUSERS_PROP.get(), value);
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
   * Sets the value of the NotInAnyGroup field.
   */
  public void setNotInAnyGroup(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(NOTINANYGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value) {
    __getInternalInterface().setFieldValue(ORGANIZATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParentGroup field.
   */
  public void setParentGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(PARENTGROUP_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(entity.Role value) {
    __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Username field.
   */
  public void setUsername(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(USERNAME_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UserSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UserSearchCriteria.this.__getDelegateManager();
    }
    
    public void addCriteria(com.guidewire.pl.system.database.TableObject userTable) {
      ((com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods")).addCriteria(userTable);
    }
    
    public void addExtendedGroupUserFinderSearchCriteria(com.guidewire.pl.system.database.Query query, com.guidewire.pl.system.database.TableObject userTableObject) {
      ((com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods")).addExtendedGroupUserFinderSearchCriteria(query, userTableObject);
    }
    
    public void addSearchConfigCriteria(com.guidewire.pl.system.database.TableObject to) {
      ((com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods")).addSearchConfigCriteria(to);
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
     * Returns a set of all roles which can be searched for, sorted by name.
     * @return an array containing the possible roles.
     */
    public entity.Role[] getAllRoles() {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).getAllRoles();
    }
    
    /**
     * Gets the value of the AttributeName field.
     * Match the attribute name with those a user might possess.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAttributeName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTENAME_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeState field.
     * Match the attribute state with those a user might possess.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getAttributeState() {
      return (typekey.State)__getInternalInterface().getFieldValue(ATTRIBUTESTATE_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeValue field.
     * Match the attribute value with those a user might possess.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAttributeValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ATTRIBUTEVALUE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Contact field.
     * The user's contact information.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactSearchCriteria getContact() {
      return (entity.ContactSearchCriteria)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the Group field.
     * Match the group that a user might belong.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
    }
    
    /**
     * Gets the value of the GroupName field.
     * Name of group the user belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getGroupName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPNAME_PROP.get());
    }
    
    /**
     * Gets the value of the GroupNameKanji field.
     * Name of group the user belongs to in Kanji. Used only for Japanese.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getGroupNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPNAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the GroupType field.
     * Type of group.
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
     * Gets the value of the Organization field.
     * The organization the user belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Organization getOrganization() {
      return (entity.Organization)__getInternalInterface().getFieldValue(ORGANIZATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getOrganizationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ORGANIZATION_PROP.get());
    }
    
    /**
     * Gets the value of the ParentGroup field.
     * Parent of the group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getParentGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(PARENTGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParentGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARENTGROUP_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Role field.
     * The role which the user has.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Role getRole() {
      return (entity.Role)__getInternalInterface().getFieldValue(ROLE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRoleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ROLE_PROP.get());
    }
    
    /**
     * Returns only internal or external roles only controlled by the boolean parameter passed in.
     * @param isCarrierInternalRole 
     * @return returns either internal or external roles only, depending on the boolean parameter passed in
     */
    public gw.api.database.IQueryBeanResult getRoles(boolean isCarrierInternalRole) {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).getRoles(isCarrierInternalRole);
    }
    
    /**
     * Gets the value of the Username field.
     * Username
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUsername() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERNAME_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the IncludeDefaultOwner field.
     * Include in search users who might be the default owner.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeDefaultOwner() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEDEFAULTOWNER_PROP.get());
    }
    
    /**
     * Gets the value of the IncludeSystemUsers field.
     * Include in search system users.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeSystemUsers() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDESYSTEMUSERS_PROP.get());
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
     * Gets the value of the NotInAnyGroup field.
     * Include in the search users not in any group
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isNotInAnyGroup() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(NOTINANYGROUP_PROP.get());
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
    
    /**
     * Searches for visible UserGroups with users matching the last name and first
     * name fields specified in the criteria. Visible user groups have groups that
     * are in the same security zone(s) as the current user
     * (see {@link entity.User#getGroupsInSecurityZones()}) unless the user has the
     * special "view all users" permission, in which case all groups are visible.
     * <p/>
     * Note that since this search takes its results from the UserGroup table,
     * users with no groups will not be returned.
     * @return all visible user groups that match the criteria
     */
    public gw.api.database.IQueryBeanResult performGroupUserSearch() {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performGroupUserSearch();
    }
    
    /**
     * Performs a User search based on the passed-in criteria.
     * @return a QueryProcessor containing the User search results
     */
    public gw.api.database.IQueryBeanResult performSearch() {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearch();
    }
    
    /**
     * Performs a search based on the criteria that have been established.  Results are returned as a query
     * of User(Base?) entities.
     * @return a query of User entities
     */
    public gw.api.database.IQueryBeanResult performSearchByProximity() {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity();
    }
    
    /**
     * Performs a search based on the criteria that have been established.  Results are returned as a query
     * of User(Base?) entities.
     * @param webLocation the Pebbles/PCF location within the UI.  This must be null if this is being called from a scripting context.
     * @return a query of User entities
     * @deprecated this will create a new helper each time the search is performed, use the method which accepts a helper to preserve that across calls
     */
    @java.lang.Deprecated
    public gw.api.database.IQueryBeanResult performSearchByProximity(pcf.api.Location webLocation) {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity(webLocation);
    }
    
    /**
     * Performs a search based on the criteria that have been established.  Results are returned as a query
     * of User entities.
     * @param webLocation the Pebbles/PCF location within the UI.  This must be null if this is being called from a scripting context.
     * @param inPsph the ProximitySearchPagerHelper object from the calling page within the ui. This must be null if this is being called from a scripting context.
     * @return a query of User entities
     */
    public gw.api.database.IQueryBeanResult performSearchByProximity(pcf.api.Location webLocation, gw.api.contact.ProximitySearchPageHelper inPsph) {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximity(webLocation, inPsph);
    }
    
    public gw.api.database.IQueryBeanResult performSearchByProximityForAssignmentCandidateUsers(gw.pl.persistence.core.Key[] groupIds, typekey.SystemPermissionType[] requiredPermissions) {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchByProximityForAssignmentCandidateUsers(groupIds, requiredPermissions);
    }
    
    /**
     * Performs a search based on the criteria that have been established, but requires that an organization has
     * been set and that the organization's id is not temporary.
     * @return a QueryProcessor containing Users
     */
    public gw.api.database.IQueryBeanResult performSearchWithOrganization() {
      return ((com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods")).performSearchWithOrganization();
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AttributeName field.
     */
    public void setAttributeName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ATTRIBUTENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeState field.
     */
    public void setAttributeState(typekey.State value) {
      __getInternalInterface().setFieldValue(ATTRIBUTESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeValue field.
     */
    public void setAttributeValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ATTRIBUTEVALUE_PROP.get(), value);
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
    public void setContact(entity.ContactSearchCriteria value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
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
     * Sets the value of the GroupName field.
     */
    public void setGroupName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(GROUPNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GroupNameKanji field.
     */
    public void setGroupNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(GROUPNAMEKANJI_PROP.get(), value);
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
     * Sets the value of the IncludeDefaultOwner field.
     */
    public void setIncludeDefaultOwner(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDEDEFAULTOWNER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeSystemUsers field.
     */
    public void setIncludeSystemUsers(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDESYSTEMUSERS_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
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
     * Sets the value of the NotInAnyGroup field.
     */
    public void setNotInAnyGroup(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(NOTINANYGROUP_PROP.get(), value);
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
     * Sets the value of the ParentGroup field.
     */
    public void setParentGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(PARENTGROUP_PROP.get(), value);
    }
    
    public void setParentGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARENTGROUP_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Role field.
     */
    public void setRole(entity.Role value) {
      __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
    }
    
    public void setRoleID(gw.pl.persistence.core.Key value) {
      setFieldValue(ROLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Username field.
     */
    public void setUsername(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(USERNAME_PROP.get(), value);
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
    
    public boolean validate() {
      return ((com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.community.UserSearchCriteriaPublicMethods", "com.guidewire.pl.domain.community.impl.UserSearchCriteriaImpl");
    config.put("com.guidewire.pl.domain.community.impl.UserSearchCriteriaInternalMethods", "com.guidewire.cc.domain.community.impl.UserSearchCriteriaCoreExtMethodsImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.pl.domain.community.impl.UserSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UserSearchCriteria.class, config);
    com.guidewire._generated.entity.UserSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UserSearchCriteria, com.guidewire._generated.entity.UserSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.UserSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UserSearchCriteriaInternal getInternalInterface(entity.UserSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UserSearchCriteria newEmptyInstance() {
        return new entity.UserSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}