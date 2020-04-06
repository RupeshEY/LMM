package entity;

/**
 * Assignable
 * 
 *         A delegate containing common fields used by all assignable entities. These fields track:
 *         <ul>
 *         <li>The assignment status ("Assigned", "Unassigned" and so on)
 *         <li>The current assignee - a queue or user and their corresponding group
 *         <li>The previous assignee - a queue or user and their corresponding group
 *         <li>The user who last assigned the entity
 *         <li>The time when the entity was last assigned
 *         </ul>
 *         If an entity is assigned to a queue then the assigned group will be the queue's group. If an
 *         entity is assigned to a user then the assigned group will be one of the user's groups. Do not assign an
 *         entity to both a user and a queue. If an entity is assigned to a group it will usually also be assigned
 *         to a user or queue, though while assignment rules are running it may temporarily be assigned to just
 *         a group.
 *       
 *       
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Assignable.eti;Assignable.eix;Assignable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface Assignable extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Assignable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Assignable>("entity.Assignable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDBYUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("AssignedByUser", "AssignedByUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDGROUP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("AssignedGroup", "AssignedGroupID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDQUEUE_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("AssignedQueue", "AssignedQueueID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("AssignedUser", "AssignedUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNMENTDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AssignmentDate", "AssignmentDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSIGNMENTSTATUS_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("AssignmentStatus", "AssignmentStatus");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CloseDate", "CloseDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSGROUP_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("PreviousGroup", "PreviousGroupID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSQUEUE_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("PreviousQueue", "PreviousQueueID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("PreviousUser", "PreviousUserID");
  
  public static final java.lang.String ASSIGNMENTADDED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTADDED_EVENT;
  
  public static final java.lang.String ASSIGNMENTCHANGED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTCHANGED_EVENT;
  
  public static final java.lang.String ASSIGNMENTREMOVED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTREMOVED_EVENT;
  
  /**
   * Directly assigns the entity to the specified group and user by setting the assignedGroup and assignedUser fields.
   * If user or group is null returns false and nothing is done.
   * @param group The group to which the entity should be assigned
   * @param user The user to which the entity should be assigned
   * @return true if the assignment is successful
   */
  public boolean assign(entity.Group group, entity.User user);
  
  
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
  public void assign(gw.pl.persistence.core.Key groupID, gw.pl.persistence.core.Key userID) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException;
  
  
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
  public boolean assignActivityToQueue(entity.AssignableQueue queue);
  
  
  /**
   * Assign this entity, which must be an Activity,  to the specified queue. The queue should belong to the specified group.
   * Returns false if the assignable bean is not an activity.
   * @param queue Queue to assign the activity to
   * @param group cannot be null
   * @return true if the assignment is successful
   */
  public boolean assignActivityToQueue(entity.AssignableQueue queue, entity.Group group);
  
  
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
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria);
  
  
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
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups);
  
  
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
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group);
  
  
  /**
   * Assigns the entity to the group requested.  If group is null, nothing is done.
   * @param group the group to which the entity should be assigned
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroup(entity.Group group);
  
  
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
  public boolean assignGroupByGroupType(typekey.GroupType requiredGroupType);
  
  
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
  public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly);
  
  
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
  public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly, entity.Group parentGroup);
  
  
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
  public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType);
  
  
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
  public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType, boolean includeSubGroups);
  
  
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
  public boolean assignGroupByRoundRobin(typekey.GroupType groupType, boolean includeSubGroups, entity.Group parentGroup);
  
  
  /**
   * Uses the supplied dynamic assignment strategy implementation to find a group assignment for the current entity. See
   * {@link gw.api.assignment.DynamicGroupAssignmentStrategy} for more details on what that implementation should look like and how it
   * is used by the implementation of this method.
   * @param dynamicGroupAssignmentStrategy the {@link gw.api.assignment.DynamicGroupAssignmentStrategy} to be used to do the assignment
   * @param parentGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
   * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroupDynamically(gw.api.assignment.DynamicGroupAssignmentStrategy dynamicGroupAssignmentStrategy, entity.Group parentGroup, boolean includeSubGroups);
  
  
  /**
   * Assigns the item to the creator of the supplied entity, and to one of the user's groups. If no group
   * is found for the user, uses the group based on the rule engine state (if available).
   * @param sourceEntity The entity to query for the id of the creator.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignToCreator(entity.Editable sourceEntity);
  
  
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
  public boolean assignToCreator(entity.Editable sourceEntity, entity.Group defaultGroup);
  
  
  /**
   * Another name for {@link #assignToQueue()}, making it more explicit that the activity will be assigned to the FNOL
   * queue. See that method for more details.
   * @return true if the assignment is successful, false otherwise
   * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
   *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
   *             named queue.
   */
  public boolean assignToFNOLQueue();
  
  
  /**
   * Assigns this entity to the user and group to which the entity's "issue" is assigned. Which entity is used
   * to find the user and group is application-dependent. For example, in CC this will assign the entity to
   * the owner of the related exposure (if any) or claim. This method is currently only meaningful for CC.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignToIssueOwner();
  
  
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
  public boolean assignToQueue();
  
  
  /**
   * Assigns the entity to the user requested within the "current" group (retrieved from the current state of
   * the Assignment Engine).  If the user is null or is not a member of the current group, nothing is done and false is returned.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param user the user to be assigned
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assign(Group, User)</code> instead
   */
  public boolean assignUser(entity.User user);
  
  
  /**
   * Directly assigns the entity to the specified user and one of the groups the user belongs to.
   * <p/>
   * If the user does not have sufficient permission to accept the assignment, false is returned
   * @param user The user to which the entity should be assigned
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserAndDefaultGroup(entity.User user);
  
  
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
  public boolean assignUserByLocation(entity.Address address);
  
  
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
  public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups);
  
  
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
  public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups, entity.Group group);
  
  
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
  public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups);
  
  
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
  public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group);
  
  
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
  public boolean assignUserByRoundRobin();
  
  
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
  public boolean assignUserByRoundRobin(boolean includeSubGroups);
  
  
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
  public boolean assignUserByRoundRobin(boolean includeSubGroups, entity.Group group);
  
  
  /**
   * Uses the supplied dynamic assignment strategy implementation to find an assignment for the current entity. See
   * {@link gw.api.assignment.DynamicUserAssignmentStrategy} for more details on what that implementation should look like and how it
   * is used by the implementation of this method.
   * @param dynamicUserAssignmentStrategy the {@link gw.api.assignment.DynamicUserAssignmentStrategy} to be used to do the assignment
   * @param group The group to be used during the assignment (usually the group to which the entity is or should be assigned)
   * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserDynamically(gw.api.assignment.DynamicUserAssignmentStrategy dynamicUserAssignmentStrategy, entity.Group group, boolean includeSubGroups);
  
  
  /**
   * Invokes the Assignment Engine, which will process the configured Assignment Rules to come up with an assignment
   * for the current entity.
   * <p/>
   * May not be invoked from within an Assignment Rule, since the Assignment Engine may not be invoked recursively. If invoked
   * from within an Assigment Rule, an error will be logged and false will be returned.
   * @return true if an assignment has been found, false otherwise
   */
  public boolean autoAssign();
  
  
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
  public boolean autoAssign(entity.Group group, entity.User user);
  
  
  /**
   * Creates a AttributeBasedAssignmentCriteria instance, which is used to collect a set of user attributes on which to search for users.
   * The matchAll flag indicates whether each attribute must be satisfied (logical AND) or whether any attribute could
   * be satisfied (logical OR).
   * @return AttributeBasedAssignmentCriteria instance
   * @deprecated Use the constructor directly.  This method is no longer necessary, since a new AttributeBasedAssignmentCriteria entity can simply
   *             be created directly in Gosu and placed in the correct bundle.
   */
  public entity.AttributeBasedAssignmentCriteria createUserAttributes();
  
  
  /**
   * Gets the value of the AssignedByUser field.
   * User who assigned this entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedByUser();
  
  
  /**
   * Gets the value of the AssignedGroup field.
   * Group to which this entity is assigned; null if none assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup();
  
  
  /**
   * Gets the value of the AssignedQueue field.
   * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getAssignedQueue();
  
  
  /**
   * Gets the value of the AssignedUser field.
   * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser();
  
  
  /**
   * Gets the value of the AssignmentDate field.
   * Time when entity last assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssignmentDate();
  
  
  /**
   * Gets the value of the AssignmentStatus field.
   * Typelist describing assignment status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus();
  
  
  /**
   * Gets the value of the CloseDate field.
   * Date and time when this entity was closed. (Not applicable to all assignable entities)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCloseDate();
  
  
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
   * @return the Assignable entity being operated on by the Assignment Engine. May be either the current entity or
   *         a UserRoleAssignment entity relating to the current entity.
   */
  public entity.Assignable getCurrentAssignment();
  
  
  /**
   * Gets the value of the PreviousGroup field.
   * Group to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getPreviousGroup();
  
  
  /**
   * Gets the value of the PreviousQueue field.
   * Queue to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getPreviousQueue();
  
  
  /**
   * Gets the value of the PreviousUser field.
   * User to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPreviousUser();
  
  
  /**
   * Sets the value of the AssignedByUser field.
   */
  public void setAssignedByUser(entity.User value);
  
  
  /**
   * Sets the value of the AssignedGroup field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedGroup(entity.Group value);
  
  
  /**
   * Sets the value of the AssignedQueue field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedQueue(entity.AssignableQueue value);
  
  
  /**
   * Sets the value of the AssignedUser field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedUser(entity.User value);
  
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value);
  
  
  
}