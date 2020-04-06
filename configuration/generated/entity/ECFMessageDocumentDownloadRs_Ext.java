package entity;

/**
 * ECFMessageDocumentDownloadRs_Ext
 * Document Download Response subtype for ECF messages
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageDocumentDownloadRs_Ext.eti;ECFMessageDocumentDownloadRs_Ext.eix;ECFMessageDocumentDownloadRs_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ECFMessageDocumentDownloadRs_Ext")
public class ECFMessageDocumentDownloadRs_Ext extends entity.ECFDocumentMessage_Ext {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageDocumentDownloadRs_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageDocumentDownloadRs_Ext>("entity.ECFMessageDocumentDownloadRs_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTBINARY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentBinary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOWNLOADREQUESTUUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DownloadRequestUUId");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ECFMessageDocumentDownloadRs_Ext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ECFMessageDocumentDownloadRs_Ext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ECFMessageDocumentDownloadRs_Ext(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the DocumentBinary field.
   * The Binary data of the document attached to this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getDocumentBinary() {
    return (gw.lang.Blob)__getInternalInterface().getFieldValue(DOCUMENTBINARY_PROP.get());
  }
  
  /**
   * Gets the value of the DownloadRequestUUId field.
   * DownloadRequestUUId - Unique Universal Identifier of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDownloadRequestUUId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOWNLOADREQUESTUUID_PROP.get());
  }
  
  /**
   * Sets the value of the DocumentBinary field.
   */
  public void setDocumentBinary(gw.lang.Blob value) {
    __getInternalInterface().setFieldValue(DOCUMENTBINARY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DownloadRequestUUId field.
   */
  public void setDownloadRequestUUId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOWNLOADREQUESTUUID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ECFMessageDocumentDownloadRs_Ext.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public entity.KeyableBean asKeyableBean() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).asKeyableBean();
    }
    
    /**
     * Directly assigns the entity to the specified group and user by setting the assignedGroup and assignedUser fields.
     * If user or group is null returns false and nothing is done.
     * @param group The group to which the entity should be assigned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful
     */
    public boolean assign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(group, user);
    }
    
    /**
     * <p>
     * Invokes the Assignment Engine to assign the item to the specified group and user.  If userID is null,
     * the item will be assigned using the group's assignment rules.  If
     * userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param groupID The group to which the item should be assigned - must be
     *                specified.  If not known, use autoAssign(item) instead.
     * @param userID The user to which the item should be assigned; if null an
     *                appropriate user will be selected by group assignment rules.
     * @throws com.guidewire.pl.system.exception.IllegalAssignmentException if the user does not have permission
     * @throws com.guidewire.pl.system.exception.NoAssignmentFoundException if assignment could not be made
     * @deprecated Use autoAssign(Group, User) instead. Note that that method returns a boolean instead of throwing exceptions
     */
    public void assign(gw.pl.persistence.core.Key groupID, gw.pl.persistence.core.Key userID) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(groupID, userID);
    }
    
    /**
     * Assign the entity, which must be an Activity to the specified queue. (Currently, only Activities may be assigned
     * to Queues.) The current group is not a parameter - it is derived from the current
     * Assignment Engine state. As a result, this method may only be invoked from within an Assignment Rule.
     * <p/>
     * If there is no current group, nothing is done and a warning is logged. The queue must belong to the current group
     * or nothing is done.  Returns false if the assignable bean is not an activity.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param queue Queue to assign the activity to
     * @return true if the assignment is successful, false otherwise
     * @deprecated use assignActivityToQueue(AssignableQueue, Group) instead, since that method is more widely valid and
     *             is easier to understand because the group is explicit rather than implicit.
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue);
    }
    
    /**
     * Assign this entity, which must be an Activity,  to the specified queue. The queue should belong to the specified group.
     * Returns false if the assignable bean is not an activity.
     * @param queue Queue to assign the activity to
     * @param group cannot be null
     * @return true if the assignment is successful
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue, group);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
     *                         the current group. If false, only searches users in the current group
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns an assignable item to a user who satisfies the constraints defined in the attributeBasedAssignmentCriteria
     * parameter. This is done by:
     * <p/>
     * 1) Find the set of users who are members of the supplied group, and optionally its subgroups, and who satisfy
     * the supplied attribute-based search criteria. (If the group parameter is null, then no group restriction applies)
     * 2) Select from the resulting set of users via the round-robin rotation mechanism. A separate round-robin state will
     * be maintained for each unique assignment criteria entity and group.
     * @param attributeBasedAssignmentCriteria the criteria to be satisfied by the selected user
     * @param includeSubGroups if true, searches  all the users in any subgroups of the group parameter as well as those in
     *                         that group. If false, only searches users in the group
     * @param group the group.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns the entity to the group requested.  If group is null, nothing is done.
     * @param group the group to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroup(entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroup(group);
    }
    
    /**
     * Uses the group type group selector to choose the next subgroup under the "current" group (retrieved from the
     * current state of the Assignment Engine) to receive the assignable. If there is no current group, the root group
     * from the Assignment Engine is used.
     * <p/>
     * This method will search breadth-first through the group tree, starting with the current group, and will
     * return the first group found with the approriate type.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A GroupType typecode; the assignment will be restricted to a group of this type. If null, then
     *                          no group will be found.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This method of assignment is deemed useless, because it always returns the first group found with the
     *             required type. Use <code>assignGroupByRoundRobin()</code> instead, so that the assignment will be rotated among
     *             the matching groups.
     */
    public boolean assignGroupByGroupType(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByGroupType(requiredGroupType);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * Alternative signature; see <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the current group
     *                           but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the groups within the parameter group whose region assignment configuration includes that zip code.
     * 3) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one group is found, then round-robin among the resulting groups based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no groups that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the sub-groups of the specified group and optionally all of its children. If there is no
     * specified group, then the root group is used. Note that starting from the root group is potentially costly in
     * performance time. If invoked from outside an Assignment Rule, this method will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the parameter
     *                           group but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly, parentGroup);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRogin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @param includeSubGroups If true, all the user
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType, includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next group to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each Group's load factor is used to determine relative assignment frequency; essentially, a
     * group with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group type (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * <p/>
     * If no group is specified, the root group will be used instead. Note that starting from the root group is
     * potentially costly in performance time.
     * <p/>
     * When group type is specified, the load factor is <b>NOT</b> used.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter
     *                         group's immediate children but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType groupType, boolean includeSubGroups, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(groupType, includeSubGroups, parentGroup);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find a group assignment for the current entity. See
     * {@link gw.api.assignment.DynamicGroupAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicGroupAssignmentStrategy the {@link gw.api.assignment.DynamicGroupAssignmentStrategy} to be used to do the assignment
     * @param parentGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupDynamically(gw.api.assignment.DynamicGroupAssignmentStrategy dynamicGroupAssignmentStrategy, entity.Group parentGroup, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupDynamically(dynamicGroupAssignmentStrategy, parentGroup, includeSubGroups);
    }
    
    /**
     * Request manual assignment of the entity to the supplied user.
     * <p/>
     * Request is granted only if the responsible user has review assignment permission.
     * <p/>
     * Successful completion will cause a review activity to be created indicating that the assignment needs to be
     * completed, and that activity will be assigned to the supplied user
     * @param responsibleUser The person who should carry out the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean assignManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManually(responsibleUser);
    }
    
    /**
     * Request manual assignment of the entity, with the responsibilty round-robbined among members of either the
     * currently assigned group or the specified group if no group is currently assigned
     * <p/>
     * {@see assignManually} for more information about "manual" assignment.
     * @param group the group to use if this entity does not have a currently assigned group.
     * @return true if a user was found to give the manual assignment action to, false if no sure user was found
     */
    public boolean assignManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManuallyByRoundRobin(group);
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Assigns the entity to the user and group to which the associated claim is currently assigned.
     * Caller is responsible for ensuring that the entity is linked to an assigned claim. If the resulting assignment
     * is invalid for any reason, then an IllegalAssignmentException will be thrown.
     * 
     * Note that this method is currently only valid for an Activity, Exposure, or Matter.
     */
    public void assignToClaimOwner() {
      ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimOwner();
    }
    
    /**
     * Assign to the claim user with the given role. The search for a user with
     * a matching role is done in the following steps:
     * <ol>
     * <li>If assigning an activity associated with an exposure search the
     *     exposure first
     * <li>Search the claim users
     * <li>If not assigning an activity associated with an exposure, search all
     *     the exposures
     * </ol>
     * If the search finds a match at any step, it stops. If the match is unique
     * it does the assignment and returns true. If the match is not unique it
     * returns false. If the search goes through all steps without finding a
     * match it returns false
     * @param userRole the desired user role
     * @return true if a unique match was found and the assignment was made, false
     *   otherwise
     */
    public boolean assignToClaimUserWithRole(typekey.UserRole userRole) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimUserWithRole(userRole);
    }
    
    /**
     * Assigns the item to the creator of the supplied entity, and to one of the user's groups. If no group
     * is found for the user, uses the group based on the rule engine state (if available).
     * @param sourceEntity The entity to query for the id of the creator.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToCreator(entity.Editable sourceEntity) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity);
    }
    
    /**
     * Assigns this entity to the user who created the supplied entity, and to the first group in the user's list of member groups. In the
     * unlikely case that the user does not belong to any groups, then the entity will be assigned to the supplied
     * default group.
     * <p/>
     * If the supplied entity has not been persisted yet, and therefore has no recorded creator, then the current user will be
     * used instead.
     * @param sourceEntity The entity to query for the id of its creator.
     * @param defaultGroup The default group to use if the assigned user is not a member of any group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This signature is a little confusing, because the defaultGroup parameter should almost never be
     *             necessary, since in the current system a user almost never belongs to no groups. Use assignToCreator(EditableBean)
     *             instead
     */
    public boolean assignToCreator(entity.Editable sourceEntity, entity.Group defaultGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity, defaultGroup);
    }
    
    /**
     * Another name for {@link #assignToQueue()}, making it more explicit that the activity will be assigned to the FNOL
     * queue. See that method for more details.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToFNOLQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToFNOLQueue();
    }
    
    /**
     * Assigns this entity to the user and group to which the entity's "issue" is assigned. Which entity is used
     * to find the user and group is application-dependent. For example, in CC this will assign the entity to
     * the owner of the related exposure (if any) or claim. This method is currently only meaningful for CC.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToIssueOwner() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToIssueOwner();
    }
    
    /**
     * Assigns the entity to the previously assigned user.  The current group is kept track of for the client.  If there is no current
     * group, nothing is done and a warning is logged.
     * <p/>
     * This is no longer a very useful method, and should be considered deprecated, in favor of simply assigning directly to the
     * PreviousUser and PreviousGroup properties.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToPreviousOwner() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToPreviousOwner();
    }
    
    /**
     * Assign an activity to the FNOL queue of items assigned to the "current" group (retrieved from the current state of
     * the Assignment Engine). If the entity to be assigned is not an activity nothing is done,
     * false is returned and a warning is logged.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToQueue();
    }
    
    public void assignToQueueInternal(entity.AssignableQueue queue) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).assignToQueueInternal(queue);
    }
    
    /**
     * Assigns the entity to the user requested within the "current" group (retrieved from the current state of
     * the Assignment Engine).  If the user is null or is not a member of the current group, nothing is done and false is returned.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param user the user to be assigned
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assign(Group, User)</code> instead
     */
    public boolean assignUser(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUser(user);
    }
    
    /**
     * Directly assigns the entity to the specified user and one of the groups the user belongs to.
     * <p/>
     * If the user does not have sufficient permission to accept the assignment, false is returned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserAndDefaultGroup(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserAndDefaultGroup(user);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the users whose region assignment configuration includes that zip code.
     * 3) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one user is found, then round-robin among the resulting users based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no users that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the users of the group (and optionally its subgroups). It is an error if there is no
     * group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose users will be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups, group);
    }
    
    /**
     * A combination of {@link #assignUserByLocation} and {@link #assignByUserAttributes} .
     * <p/>
     * Alternative signature; see <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria whose region assignments contain the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocation}
     * to find a user whose region assignments contain the supplied location.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the parameter  group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria who is closest to the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocationUsingProximitySearch}
     * to choose the closest one.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the supplied group as well as users in the
     *                         parameter group.
     * @param group The group whose users should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximityAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximityAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this AssignmentBean to the user in the current group with the closest address to the given address,
     * measured by great-circle distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use as the center of the proximity search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address);
    }
    
    /**
     * Assigns this AssignmentBean to the user with the closest address to the given address, measured by a great-circle
     * distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user with the closest address to the specified address, measured by a great-circle
     * distance along the surface of the earth. This includes the following steps:
     * <p/>
     * 1) Geocode the supplied address which will serve as the center of the search. (If necessary, location may already be geocoded)
     * 2) For each user in the specified group, compute the distance from their location (using their Contact entity's primary address)
     * to the supplied location.
     * 2a) If the includeSubGroups parameter is true, repeat this process with all of the descendant groups of the specified group
     * 3) Return the user who is closest to the specified location
     * <p/>
     * If the geocoding attempt fails for the supplied location, an error will be logged and false returned
     * <p/>
     * Search begins with the users of the parameter group; it is an error if there is no group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for assignment. May not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups, group);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search.
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.Geocode.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @param currentGroup the group within which the search will be performed
     * @return true if the assignment is successful
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups, entity.Group currentGroup) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups, currentGroup);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, includeSubGroups);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on a User Search by Proximity. This includes the following steps:
     * <p/>
     * 1) Geocode the location which will serve as the center of the search, accessed through <code>usc.getContact().getAddress()</code>.
     * (If necessary; the location may already be geocoded)
     * 2) Finds a list of users who satisfy the user search criteria, which may include proximity restrictions.
     * The specified cap is used to limit the number of users in this list; in the case of proximity restrictions, the users farthest from the search center are trimmed.
     * 3) Use the round-robin algorithm to pick one of the users. This means that repeated, identical calls to this
     * method will rotate through the resulting set of users to find the user to return.
     * <p/>
     * Note that the round-robin rotation is based on the exact UserSearchCriteria used. One implication of this is that
     * the location used should be as general as possible (such as just a city, state or zip, rather than a specific
     * street address) to get the benefit of the round-robin processing and reduce the load on the system.
     * <p/>
     * To always assign to the closest user, set the cap to 1.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * <p/>
     * The user search criteria should be set up via gw.api.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * The group parameter may be null. If it is not null, it will be used as part of the search
     * @param usc a valid User Search Criteria, may not be null
     * @param cap If greater than zero, the maximum number of users to include for round robin from the search results.
     *                         If -1, all users from the search results will be included in the round robin.
     * @param includeSubGroups if the sub group should be used for search
     * @param group The group from where the search should be conducted
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups, group);
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin();
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the current group
     *                         but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next user from the specified group or to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each User's load factor is used to determine relative assignment frequency; essentially, a
     * user with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter group
     *                         but also through all its subgroups.
     * @param group may not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups, group);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find an assignment for the current entity. See
     * {@link gw.api.assignment.DynamicUserAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicUserAssignmentStrategy the {@link gw.api.assignment.DynamicUserAssignmentStrategy} to be used to do the assignment
     * @param group The group to be used during the assignment (usually the group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserDynamically(gw.api.assignment.DynamicUserAssignmentStrategy dynamicUserAssignmentStrategy, entity.Group group, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserDynamically(dynamicUserAssignmentStrategy, group, includeSubGroups);
    }
    
    /**
     * Invokes the Assignment Engine, which will process the configured Assignment Rules to come up with an assignment
     * for the current entity.
     * <p/>
     * May not be invoked from within an Assignment Rule, since the Assignment Engine may not be invoked recursively. If invoked
     * from within an Assigment Rule, an error will be logged and false will be returned.
     * @return true if an assignment has been found, false otherwise
     */
    public boolean autoAssign() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign();
    }
    
    /**
     * <p>
     * Invokes the Assignment Enging to assign the item to the specified group and user.
     * If userID is null, the item will be assigned using the group's assignment rules.
     * If userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param group The group to which the item should be assigned - must be
     *              specified.  If not known, use autoAssign(item) instead.
     * @param user The user to which the item should be assigned; if null an
     *              appropriate user will be selected by group assignment rules.
     * @return true if the assignment is successufl, false otherwise
     */
    public boolean autoAssign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign(group, user);
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
    
    /**
     * This method is only available inside the Assignment Engine. Request manual confirmation of the entity's current assignment by the specified user.
     * <p/>
     * If the specified user does not have the review assignment permission, then does nothing and returns false.
     * Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param responsibleUser The person who should confirm the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean confirmManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManually(responsibleUser);
    }
    
    /**
     * Request manual confirmation of the entity's current assignment, with the responsibility round-robined among members
     * of the given group.
     * <p/>
     * Only users in the specified group (not subgroups)  who have the review assignment permission will be considered. The
     * round-robin rotation used here is independent of the rotation used by the assignUserByRoundRobin() methods.
     * <p/>
     * If no user is found, does nothing and returns false. Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param group the group whose users should be considered in the round-robin rotation
     * @return true if a user was found to give the confirmation action to, false if no such user was found
     */
    public boolean confirmManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManuallyByRoundRobin(group);
    }
    
    public void copyPreviousAssignments(entity.Assignable source) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).copyPreviousAssignments(source);
    }
    
    /**
     * Creates a AttributeBasedAssignmentCriteria instance, which is used to collect a set of user attributes on which to search for users.
     * The matchAll flag indicates whether each attribute must be satisfied (logical AND) or whether any attribute could
     * be satisfied (logical OR).
     * @return AttributeBasedAssignmentCriteria instance
     * @deprecated Use the constructor directly.  This method is no longer necessary, since a new AttributeBasedAssignmentCriteria entity can simply
     *             be created directly in Gosu and placed in the correct bundle.
     */
    public entity.AttributeBasedAssignmentCriteria createUserAttributes() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).createUserAttributes();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void finishAssignment() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).finishAssignment();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateAssignmentEvents() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).generateAssignmentEvents();
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
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedByUser field.
     * User who assigned this entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedGroup field.
     * Group to which this entity is assigned; null if none assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getAssignedGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedQueue field.
     * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getAssignedQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUser field.
     * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    /**
     * Returns a string describing the current assignee plus their group,
     * suitable for display to the user. This can be quite a long string,
     * for example "Andy Applegate (Auto1 - TeamA)". See also
     * {@link #getAssigneeDisplayString()} which omits the group name and
     * may be more appropriate if space is tight.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue plus their group (for example
     * "Andy Applegate (Auto1 - TeamA)"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeAndGroupDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeAndGroupDisplayString();
    }
    
    /**
     * Returns a string describing the current assignee, suitable for display
     * to the user. See also {@link #getAssigneeAndGroupDisplayString()}, which
     * returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue (for example "Andy Applegate"). If assignment
     * is pending, returns a simple string (for example "pending assignment").
     * If the assignable is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeDisplayString();
    }
    
    /**
     * Returns a string describing only the group of the current assignee,
     * suitable for display to the user. See also {@link #getAssigneeAndGroupDisplayString()},
     *  which returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user, returns the name of the
     * user's group (for example "Auto1 - TeamA"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeGroupOnlyDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeGroupOnlyDisplayString();
    }
    
    /**
     * Gets the value of the AssignmentDate field.
     * Time when entity last assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssignmentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSIGNMENTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignmentStatus field.
     * Typelist describing assignment status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssignmentStatus getAssignmentStatus() {
      return (typekey.AssignmentStatus)__getInternalInterface().getFieldValue(ASSIGNMENTSTATUS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The Claim this message is related to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimType field.
     * The three-digit ECF Code specifying the type of Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimTypeCode_Ext getClaimType() {
      return (typekey.ECFClaimTypeCode_Ext)__getInternalInterface().getFieldValue(CLAIMTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the CloseDate field.
     * Date and time when this entity was closed. (Not applicable to all assignable entities)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Content field.
     * The message content
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getContent() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(CONTENT_PROP.get());
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
     * This method exists to support the notion of "secondary" assignment in the Assignment Rules. "Secondary" assignments
     * generally represented by UserRoleAssignment entities, are assignments of "roles" to users, separated from the single
     * "primary" owner of the entity.
     * <p/>
     * It is generally desirable for Assignment rule writers to be able to re-use a single set of, say, Claim Assignment rules
     * for both primary and secondary assignments. This method allows rules to be written in the form of
     * <code>Claim.CurrentAssignment.assignXXX()</code> rather than <code>Claim.assignXXX()</code>. If the primary
     * assignment is being performed, then getCurrentAssignment() will return the entity itself (in this case, the Claim).
     * If a secondary assignment is being performed, then getCurrentAssignment() will return the UserRoleAssignment which
     * is current being operated upon.
     * <p/>
     * Obviously, if an entity does not support secondary assignment (i.e. does not implement the UserRoleOwner interface),
     * then rules do not need to use this method. Secondary assignments done outside of the Assignment Rules can simplay
     * call the assignXXX methods directly on the UserRoleAssignment entity themselves, and therefore also do not require
     * this method.
     * <p/>
     * Since this method is dependent on the Assignment Engine state, calling it outside of the Assignment Rules is illegal.
     * @return the CCAssignable entity being operated on by the Assignment Engine. May be either the current entity or
     *         a UserRoleAssignment entity relating to the current entity.
     */
    public entity.CCAssignable getCurrentAssignment() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getCurrentAssignment();
    }
    
    /**
     * Gets the value of the Document field.
     * The Document which relates to this message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Document getDocument() {
      return (entity.Document)__getInternalInterface().getFieldValue(DOCUMENT_PROP.get());
    }
    
    /**
     * Gets the value of the DocumentBinary field.
     * The Binary data of the document attached to this message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getDocumentBinary() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(DOCUMENTBINARY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDocumentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DOCUMENT_PROP.get());
    }
    
    /**
     * Gets the value of the DownloadRequestUUId field.
     * DownloadRequestUUId - Unique Universal Identifier of the message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDownloadRequestUUId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOWNLOADREQUESTUUID_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getGroupAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getGroupAssignmentStateHelpers();
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
     * Gets the value of the InsuredId field.
     * Insured Id come with in the message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDID_PROP.get());
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
     * Gets the value of the MessageCategory field.
     * Specifies a category that this message belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LMMessageCategory_Ext getMessageCategory() {
      return (typekey.LMMessageCategory_Ext)__getInternalInterface().getFieldValue(MESSAGECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the MessageDirection field.
     * Specifies if the message is an Inbound or Outbound message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageDirectionType_Ext getMessageDirection() {
      return (typekey.ECFMessageDirectionType_Ext)__getInternalInterface().getFieldValue(MESSAGEDIRECTION_PROP.get());
    }
    
    /**
     * Gets the value of the MessageType field.
     * store message type as extracted from the header
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageType_Ext getMessageType() {
      return (typekey.ECFMessageType_Ext)__getInternalInterface().getFieldValue(MESSAGETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the OriginTimeStamp field.
     * The message origin post date and time
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getOriginTimeStamp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ORIGINTIMESTAMP_PROP.get());
    }
    
    public gw.internal.ext.org.apache.commons.collections.BidiMap getPreviousAssignments() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getPreviousAssignments();
    }
    
    /**
     * Gets the value of the PreviousGroup field.
     * Group to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getPreviousGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousQueue field.
     * Queue to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getPreviousQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousUser field.
     * User to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getPreviousUser() {
      return (entity.User)__getInternalInterface().getFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReceiverPartyAgency field.
     * Receiver Party Agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyId field.
     * Receiver Party Id
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYID_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyName field.
     * Receiver Party Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ReceiverPartyRoleCd field.
     * Receiver Party Role
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReceiverPartyRoleCd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECEIVERPARTYROLECD_PROP.get());
    }
    
    /**
     * Gets the value of the ResponseAcknowledgement field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ECFMessageResponseAcknowledgement_Ext getResponseAcknowledgement() {
      return (entity.ECFMessageResponseAcknowledgement_Ext)__getInternalInterface().getFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getResponseAcknowledgementID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Role field.
     * The role the receiver had in this message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFParticipantFunction_Ext getRole() {
      return (typekey.ECFParticipantFunction_Ext)__getInternalInterface().getFieldValue(ROLE_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyAgency field.
     * Sender Party Agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyId field.
     * Sender Party Id
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYID_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyName field.
     * Sender Party Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the SenderPartyRoleCd field.
     * Sender Party Role
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderPartyRoleCd() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERPARTYROLECD_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * Message processing status
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFMessageStatus_Ext getStatus() {
      return (typekey.ECFMessageStatus_Ext)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LMMessage_Ext getSubtype() {
      return (typekey.LMMessage_Ext)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Returns the suggested assignees for this entity, to be displayed in the
     * UI as the most likely assignees when the user is assigning the entity. The list of assignees
     * will depend on the type of entity, and will contain users who are somehow "involved" with the entity,
     * associated claim, or currently assigned user and group.
     * @return the list of suggested assignees, never null or empty
     */
    public gw.api.assignment.Assignee[] getSuggestedAssignees() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getSuggestedAssignees();
    }
    
    /**
     * Gets the value of the TR field.
     * Transaction reference for the Transaction this message belongs to
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TR_PROP.get());
    }
    
    /**
     * Gets the value of the UCR field.
     * Unique Claim Reference for claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUCR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_PROP.get());
    }
    
    /**
     * Gets the value of the UMR field.
     * Unique Mandate Reference. This identifies the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUMR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_PROP.get());
    }
    
    /**
     * Gets the value of the UUID field.
     * UUId - Unique Universal Identifier of the message
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UUID_PROP.get());
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
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getUserAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getUserAssignmentStateHelpers();
    }
    
    /**
     * Gets the value of the ValidationErrorCode field.
     * The error code for the reason this message failed validation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getValidationErrorCode() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(VALIDATIONERRORCODE_PROP.get());
    }
    
    /**
     * Gets the value of the ValidationFailureReason field.
     * The reason being given for this message to have failed validation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getValidationFailureReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALIDATIONFAILUREREASON_PROP.get());
    }
    
    public void handleAssignmentCommit() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentCommit();
    }
    
    public void handleAssignmentRollback() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentRollback();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
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
     * Gets the value of the Reprocess field.
     * Indicates if a message needs to be reprocessed. Will be picked up by a batch process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReprocess() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REPROCESS_PROP.get());
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
     * Gets the value of the Suspended field.
     * Whether the message needs a manual interaction due to preprocessing validation failure or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSuspended() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUSPENDED_PROP.get());
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
     * Sets the value of the AssignedByUser field.
     */
    public void setAssignedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    public void setAssignedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedGroup field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroup(entity.Group value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedGroup(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroupID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedGroupID(value);
    }
    
    /**
     * Sets the value of the AssignedQueue field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueue(entity.AssignableQueue value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedQueue(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueueID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedQueueID(value);
    }
    
    /**
     * Sets the value of the AssignedUser field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUser(entity.User value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedUser(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedUserID(value);
    }
    
    /**
     * Sets the value of the AssignmentDate field.
     */
    public void setAssignmentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignmentStatus field.
     */
    public void setAssignmentStatus(typekey.AssignmentStatus value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
     * Sets the value of the ClaimType field.
     */
    public void setClaimType(typekey.ECFClaimTypeCode_Ext value) {
      __getInternalInterface().setFieldValue(CLAIMTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Content field.
     */
    public void setContent(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(CONTENT_PROP.get(), value);
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
     * Sets the value of the Document field.
     */
    public void setDocument(entity.Document value) {
      __getInternalInterface().setFieldValue(DOCUMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentBinary field.
     */
    public void setDocumentBinary(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(DOCUMENTBINARY_PROP.get(), value);
    }
    
    public void setDocumentID(gw.pl.persistence.core.Key value) {
      setFieldValue(DOCUMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DownloadRequestUUId field.
     */
    public void setDownloadRequestUUId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOWNLOADREQUESTUUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredId field.
     */
    public void setInsuredId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDID_PROP.get(), value);
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
     * Sets the value of the MessageCategory field.
     */
    public void setMessageCategory(typekey.LMMessageCategory_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGECATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageDirection field.
     */
    public void setMessageDirection(typekey.ECFMessageDirectionType_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGEDIRECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageType field.
     */
    public void setMessageType(typekey.ECFMessageType_Ext value) {
      __getInternalInterface().setFieldValue(MESSAGETYPE_PROP.get(), value);
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
     * Sets the value of the OriginTimeStamp field.
     */
    public void setOriginTimeStamp(java.util.Date value) {
      __getInternalInterface().setFieldValue(ORIGINTIMESTAMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousGroup field.
     */
    public void setPreviousGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    public void setPreviousGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousQueue field.
     */
    public void setPreviousQueue(entity.AssignableQueue value) {
      __getInternalInterface().setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    public void setPreviousQueueID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousUser field.
     */
    public void setPreviousUser(entity.User value) {
      __getInternalInterface().setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    public void setPreviousUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReceiverPartyAgency field.
     */
    public void setReceiverPartyAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyId field.
     */
    public void setReceiverPartyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyName field.
     */
    public void setReceiverPartyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReceiverPartyRoleCd field.
     */
    public void setReceiverPartyRoleCd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECEIVERPARTYROLECD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Reprocess field.
     */
    public void setReprocess(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REPROCESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ResponseAcknowledgement field.
     */
    public void setResponseAcknowledgement(entity.ECFMessageResponseAcknowledgement_Ext value) {
      __getInternalInterface().setFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get(), value);
    }
    
    public void setResponseAcknowledgementID(gw.pl.persistence.core.Key value) {
      setFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get(), value);
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
    public void setRole(typekey.ECFParticipantFunction_Ext value) {
      __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyAgency field.
     */
    public void setSenderPartyAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyId field.
     */
    public void setSenderPartyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyName field.
     */
    public void setSenderPartyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderPartyRoleCd field.
     */
    public void setSenderPartyRoleCd(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERPARTYROLECD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.ECFMessageStatus_Ext value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.LMMessage_Ext value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Suspended field.
     */
    public void setSuspended(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SUSPENDED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TR field.
     */
    public void setTR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UCR field.
     */
    public void setUCR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UCR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UMR field.
     */
    public void setUMR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UMR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UUID field.
     */
    public void setUUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UUID_PROP.get(), value);
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
     * Sets the value of the ValidationErrorCode field.
     */
    public void setValidationErrorCode(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(VALIDATIONERRORCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidationFailureReason field.
     */
    public void setValidationFailureReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VALIDATIONFAILUREREASON_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.assignment.AssignablePublicMethods", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("gw.cc.assignment.entity.CCAssignable", "com.guidewire.cc.domain.assignment.impl.CCAssignableImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ECFMessageDocumentDownloadRs_Ext.class, config);
    com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ECFMessageDocumentDownloadRs_Ext, com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageDocumentDownloadRs_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageDocumentDownloadRs_ExtInternal getInternalInterface(entity.ECFMessageDocumentDownloadRs_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ECFMessageDocumentDownloadRs_Ext newEmptyInstance() {
        return new entity.ECFMessageDocumentDownloadRs_Ext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}