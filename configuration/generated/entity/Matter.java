package entity;

/**
 * Matter
 * 
 *             Represents the set of data organized around a single lawsuit or potential lawsuit.
 *             It contains data fields (such as case number and trail date). A Matter is associated with a single claim. 
 *             
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Matter.eti;Matter.eix;Matter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Matter")
public class Matter extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Extractable, entity.CCAssignable, entity.ClaimContactRoleOwner, entity.EventAware, gw.api.assignment.CCAssignableMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Matter> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Matter>("entity.Matter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDAMNUMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdDamnumAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDAMNUMSPECIFIED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdDamnumSpecified");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARBITRATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Arbitration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARBITRATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArbitrationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARBITRATIONROOM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArbitrationRoom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNMENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignmentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSIGNMENTSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AssignmentStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BUDGETLINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BudgetLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CASENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CaseNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CloseDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COURTDISTRICT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CourtDistrict");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COURTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CourtType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECLARATORYJGMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DeclaratoryJgmt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEFENSEAPPTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DefenseApptDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCKETNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocketNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSURES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Exposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FILEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FileDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FILINGDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FilingDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FINALLEGALCOST_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FinalLegalCost");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FINALSETTLECOST_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FinalSettleCost");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FINALSETTLEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FinalSettleDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNOTICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstNotice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HEARINGDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HearingDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HEARINGROOM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HearingRoom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LEGALSPECIALTY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LegalSpecialty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATTERCASENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatterCaseNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MATTERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MatterType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEDIATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MediationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEDIATIONROOM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MediationRoom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> METHODSERVED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MethodServed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOTIONSUMMARYJGMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MotionSummaryJgmt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PRIMARYCAUSE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PrimaryCause");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUNITIVEAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PunitiveAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUNITIVEDAMAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PunitiveDamages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REOPENEDREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReopenedReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESOLUTION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Resolution");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESPONSEDUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ResponseDue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESPONSEFILED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ResponseFiled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RISKTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RiskType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROOM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Room");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENTTODEFENSEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SentToDefenseDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServiceDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> STATUSTYPELINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "StatusTypeLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STRUCTUREDSETTLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StructuredSettle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBRORELATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubroRelated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBROGATIONSUMMARY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SubrogationSummary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SuitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRIALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TrialDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VENUERATING_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VenueRating");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MatterInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final java.lang.String ASSIGNMENTADDED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTADDED_EVENT;
  
  public static final java.lang.String ASSIGNMENTCHANGED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTCHANGED_EVENT;
  
  public static final java.lang.String ASSIGNMENTREMOVED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTREMOVED_EVENT;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.matter.PublicMatterFinder finder = gw.cc.matter.entity.Matter.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Matter()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Matter(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Matter(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MatterInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.MatterInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Adds the given element to the BudgetLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBudgetLines(entity.BudgetLine element) {
    __getInternalInterface().addArrayElement(BUDGETLINES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.MatterExposure element) {
    __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element) {
    __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the StatusTypeLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatusTypeLines(entity.LitStatusTypeLine element) {
    __getInternalInterface().addArrayElement(STATUSTYPELINES_PROP.get(), element);
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
  
  /**
   * Returns true if the matter can be closed by the indicated User.
   * @param user The User to test for ability to close this Matter - cannot be NULL.
   * @return <code>true</code> if the matter can be closed by the indicated User, else <code>false</code>
   */
  public boolean canClose(entity.User user) {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).canClose(user);
  }
  
  /**
   * Determines whether this owner can be edited.
   */
  public boolean canEdit() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
  }
  
  /**
   * Returns true if the matter can be reopened by the indicated User.
   * @param user The User to test for ability to reopen this Matter - cannot be NULL.
   * @return <code>true</code> if the matter can be reopened by the indicated User, else <code>false</code>
   */
  public boolean canReopen(entity.User user) {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).canReopen(user);
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
   * Closes this matter, with a null resolution and null description of why the matter is being closed
   * @throws CloseException if this Matter is already closed.
   * @deprecated Please use the version of close that takes ResolutionType and reason parameters,
   *   and provide values for those parameters explaining why the matter is being closed.
   */
  public void close() throws com.guidewire.pl.system.exception.CloseException {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).close();
  }
  
  /**
   * Closes this matter.
   * @param resolution resolution which closes this matter
   * @param strReason description of reason why this matter is being closed
   * @throws com.guidewire.pl.system.exception.CloseException if this Matter is already closed.
   * @throws EntityValidationException If the Matter Closed validation ruleset returns any errors or new warnings.
   */
  public void close(typekey.ResolutionType resolution, java.lang.String strReason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).close(resolution, strReason);
  }
  
  /**
   * Commits this matter to the data store.
   */
  public void commit() {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).commit();
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
  
  /**
   * Called after the assignable is assigned to create a new history event recording the assignment. May
   * return null for some assignable types, meaning that no history event was created
   * @param assignable the assignable containing details of the new assignment
   * @return the new history event, or null
   */
  public entity.History createAssignmentHistoryEvent(entity.Assignable assignable) {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentHistoryEvent(assignable);
  }
  
  /**
   * Create a new assignment review activity which represents the responsibility to assign this
   * assignable. Assignment review activities are used for manual assignment.
   * @return a new assignment review activity which refers to this assignable
   */
  public entity.Activity createAssignmentReviewActivity() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentReviewActivity();
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
  
  /**
   * Find any existing open assignment review activities related to this assignable. Normally this will
   * return either zero or one activities. Assignment review activities are used for manual assignment.
   * @return a query result containing the open assignment review activities, if any
   */
  public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
  }
  
  /**
   * Get all the open activities for this matter as a query processor.
   * @return a QueryProcessor that encapsulates the query described above.
   */
  public gw.api.database.IQueryBeanResult<entity.Activity> getActivities() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getActivities();
  }
  
  /**
   * Gets the value of the AdDamnumAmount field.
   * Ad Damnum Amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAdDamnumAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(ADDAMNUMAMOUNT_PROP.get());
  }
  
  /**
   * Returns all allowed contact roles for a matter
   * @return a list of allowed contact roles for a matter
   */
  public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getAllowedContactRolesForEntity();
  }
  
  /**
   * Gets the value of the ArbitrationDate field.
   * Current schedule trial date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getArbitrationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ARBITRATIONDATE_PROP.get());
  }
  
  /**
   * Returns the activity corresponding to this matter's arbitration date.
   * @return activity corresponding to this matter's arbitration date, null if there is no arbitration activity
   */
  public entity.Activity getArbitrationDateActivity() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getArbitrationDateActivity();
  }
  
  /**
   * Gets the value of the ArbitrationRoom field.
   * Room number in the arbitration venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArbitrationRoom() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARBITRATIONROOM_PROP.get());
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
  
  /**
   * Gets the value of the AssignedByUser field.
   * User who assigned this entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDBYUSER_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedGroup field.
   * Group to which this entity is assigned; null if none assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedQueue field.
   * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getAssignedQueue() {
    return (entity.AssignableQueue)__getInternalInterface().getFieldValue(ASSIGNEDQUEUE_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedUser field.
   * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
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
   * Gets the value of the BudgetLines field.
   * An array of budget line records
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BudgetLine[] getBudgetLines() {
    return (entity.BudgetLine[])__getInternalInterface().getFieldValue(BUDGETLINES_PROP.get());
  }
  
  /**
   * Gets the value of the CaseNumber field.
   * Official reference number for the lawsuit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCaseNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CASENUMBER_PROP.get());
  }
  
  /**
   * Returns the child objects of the current assignable to which the new assigment should maybe be
   * cascaded. shouldCascadeAssignment will be called on each child before actually doing the cascade
   * @return child objects to which the new assignment should potentially be cascaded
   */
  public java.util.List<gw.api.assignment.CCAssignableMethods> getChildrenForCascadeAssignment() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getChildrenForCascadeAssignment();
  }
  
  /**
   * Gets the value of the Claim field.
   * The claim associated with this legal matter.
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
   * The currency related to this Matter's Claim.
   * @return The associated Claim's currency.  Returns NULL if the Claim is not currently
   *         reachable (for example, if the necessary entity connections have not yet been made).
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getClaimCurrency();
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
   * Gets the value of the CourtDistrict field.
   * Court jurisdictional district
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterCourtDistrict getCourtDistrict() {
    return (typekey.MatterCourtDistrict)__getInternalInterface().getFieldValue(COURTDISTRICT_PROP.get());
  }
  
  /**
   * Gets the value of the CourtType field.
   * Court type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterCourtType getCourtType() {
    return (typekey.MatterCourtType)__getInternalInterface().getFieldValue(COURTTYPE_PROP.get());
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
   * Gets the value of the DefenseApptDate field.
   * Date the defense counsel was appointed to this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDefenseApptDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DEFENSEAPPTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the DocketNumber field.
   * Court docket number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocketNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCKETNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Exposures field.
   * The list of exposures to which this matter relates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MatterExposure[] getExposures() {
    return (entity.MatterExposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
  }
  
  /**
   * Gets the value of the FileDate field.
   * Date the trial was filed in court.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFileDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FILEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the FilingDate field.
   * Filing date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFilingDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FILINGDATE_PROP.get());
  }
  
  /**
   * Gets the value of the FinalLegalCost field.
   * The final legal cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinalLegalCost() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FINALLEGALCOST_PROP.get());
  }
  
  /**
   * Gets the value of the FinalSettleCost field.
   * The final settlement cost.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinalSettleCost() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FINALSETTLECOST_PROP.get());
  }
  
  /**
   * Gets the value of the FinalSettleDate field.
   * The actual date of the final settlement (as opposed to the date of the payment).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFinalSettleDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FINALSETTLEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the HearingDate field.
   * Current scheduled matter hearing date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHearingDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(HEARINGDATE_PROP.get());
  }
  
  /**
   * Returns the activity corresponding to this matter's hearing date.
   * @return activity corresponding to this matter's hearing date, null if there is no hearing activity
   */
  public entity.Activity getHearingDateActivity() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getHearingDateActivity();
  }
  
  /**
   * Gets the value of the HearingRoom field.
   * Room number in the hearing venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHearingRoom() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HEARINGROOM_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LegalSpecialty field.
   * Legal specialty needed for this matter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LegalSpecialty getLegalSpecialty() {
    return (typekey.LegalSpecialty)__getInternalInterface().getFieldValue(LEGALSPECIALTY_PROP.get());
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
   * Gets the value of the MatterCaseNumber field.
   * Case number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMatterCaseNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATTERCASENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the MatterType field.
   * Type of Matter such as General, Lawsuit, Arbitration, Hearing or Mediation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterType getMatterType() {
    return (typekey.MatterType)__getInternalInterface().getFieldValue(MATTERTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MediationDate field.
   * Date this matter entered mediation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMediationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MEDIATIONDATE_PROP.get());
  }
  
  /**
   * Returns the activity corresponding to this matter's mediation date.
   * @return activity corresponding to this matter's mediation date, null if there is no mediation activity
   */
  public entity.Activity getMediationDateActivity() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getMediationDateActivity();
  }
  
  /**
   * Gets the value of the MediationRoom field.
   * Room number in the mediation venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMediationRoom() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MEDIATIONROOM_PROP.get());
  }
  
  /**
   * Gets the value of the MethodServed field.
   * Method served
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterMethodServed getMethodServed() {
    return (typekey.MatterMethodServed)__getInternalInterface().getFieldValue(METHODSERVED_PROP.get());
  }
  
  /**
   * Gets the value of the Name field.
   * Then name for this matter. Typically of the form 'X vs. Y' once the matter goes to trial.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * Return all the non-exclusive claim contact roles for this owner
   * @return a list of claim contact role objects, possibly empty but never null
   */
  public entity.ClaimContactRole[] getNonExclusiveRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
  }
  
  /**
   * Get the viewable notes for this matter as a query processor.
   * @return a QueryProcessor that encapsulates the query described above.
   */
  public gw.api.database.IQueryBeanResult<entity.Note> getNotes() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getNotes();
  }
  
  /**
   * Called by the "assignToClaimOwner" method to determine which assignable "owns" the current assignable
   * so the owners assignment information can be copied. The owner is nearly always just the claim though
   * there is a special case - if an activity belongs to an exposure then the exposure is the owner. If
   * this method return null the assignToClaimOwner call will return false.
   * @return the owning assignable, usually the claim
   */
  public entity.Assignable getOwningAssignable() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningAssignable();
  }
  
  /**
   * The claim that owns this assignable. If this property returns null then this assignable cannot be
   * manually assigned (because no assignment review activity can be created), cannot be assigned using
   * the "assignToClaimOwner" method and will not create history events when assigned.
   * @return the claim
   */
  public entity.Claim getOwningClaim() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningClaim();
  }
  
  /**
   * Gets the value of the PreviousGroup field.
   * Group to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getPreviousGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(PREVIOUSGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the PreviousQueue field.
   * Queue to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getPreviousQueue() {
    return (entity.AssignableQueue)__getInternalInterface().getFieldValue(PREVIOUSQUEUE_PROP.get());
  }
  
  /**
   * Gets the value of the PreviousUser field.
   * User to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPreviousUser() {
    return (entity.User)__getInternalInterface().getFieldValue(PREVIOUSUSER_PROP.get());
  }
  
  /**
   * Gets the value of the PrimaryCause field.
   * Why the lawsuit was brought in the first place.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PrimaryCauseType getPrimaryCause() {
    return (typekey.PrimaryCauseType)__getInternalInterface().getFieldValue(PRIMARYCAUSE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the PunitiveAmount field.
   * Punitive damages amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPunitiveAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PUNITIVEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterReopenedReason getReopenedReason() {
    return (typekey.MatterReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
  }
  
  /**
   * Gets the value of the Resolution field.
   * The type of resolution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ResolutionType getResolution() {
    return (typekey.ResolutionType)__getInternalInterface().getFieldValue(RESOLUTION_PROP.get());
  }
  
  /**
   * Gets the value of the ResponseDue field.
   * Response Due
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getResponseDue() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RESPONSEDUE_PROP.get());
  }
  
  /**
   * Gets the value of the ResponseFiled field.
   * Response filed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getResponseFiled() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RESPONSEFILED_PROP.get());
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
   * Gets the value of the RiskType field.
   * Describes the overall risk on this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterRiskType getRiskType() {
    return (typekey.MatterRiskType)__getInternalInterface().getFieldValue(RISKTYPE_PROP.get());
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
   * Gets the value of the Room field.
   * Room number in the venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRoom() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROOM_PROP.get());
  }
  
  /**
   * Gets the value of the SentToDefenseDate field.
   * Date this matter was sent to the defense attorney.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSentToDefenseDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SENTTODEFENSEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceDate field.
   * Service date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServiceDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the StatusTypeLines field.
   * The progression of status type lines on this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LitStatusTypeLine[] getStatusTypeLines() {
    return (entity.LitStatusTypeLine[])__getInternalInterface().getFieldValue(STATUSTYPELINES_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Subrogation information related to this matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary() {
    return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
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
   * Gets the value of the SuitType field.
   * The type of suit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SuitType getSuitType() {
    return (typekey.SuitType)__getInternalInterface().getFieldValue(SUITTYPE_PROP.get());
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
   * Computes and returns the Total Paid amount for the "LEGAL" {@link typekey.CostCategory}
   * related to this matter.  Optionally, the computed amount can be limited by a specific {@link typekey.LineCategory}.
   * <p/>
   * NOTE: This computed amount returned by this method only reflects the currently saved data.  It does not reflect any new, updated or removed
   *       Payments or TransactionLineItems that have not yet been saved.
   * @param lineCategory The {@link typekey.LineCategory} by which to filter the Total Paid computation.  If NULL, then all
   *                     LineCategories are included
   * @return CurrencyAmount Containing the Total Paid amount tied to this Matter for the indicated {@link typekey.LineCategory} (if not NULL).  The currency
   *                        on the Currency Amount will be the Claim's currency, or just the default application currency for non-multicurrency
   *                        configurations.
   */
  public gw.api.financials.CurrencyAmount getTotalPaidForMatterCostCategory(typekey.LineCategory lineCategory) {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getTotalPaidForMatterCostCategory(lineCategory);
  }
  
  /**
   * Gets the value of the TrialDate field.
   * Current schedule trial date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTrialDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TRIALDATE_PROP.get());
  }
  
  /**
   * Returns the activity corresponding to this matter's trial date.
   * @return activity corresponding to this matter's trial date, null if there is not trial activity
   */
  public entity.Activity getTrialDateActivity() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getTrialDateActivity();
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
   * Validation level the matter passed (if any) the last time it was checked.
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
   * Gets the value of the VenueRating field.
   * Rating of venue for this matter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterVenueRating getVenueRating() {
    return (typekey.MatterVenueRating)__getInternalInterface().getFieldValue(VENUERATING_PROP.get());
  }
  
  /**
   * Gets the value of the AdDamnumSpecified field.
   * Was Ad Damnum specified?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdDamnumSpecified() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADDAMNUMSPECIFIED_PROP.get());
  }
  
  /**
   * Gets the value of the Arbitration field.
   * Whether a suit has gone into arbitration.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isArbitration() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ARBITRATION_PROP.get());
  }
  
  /**
   * Returns true if the matter is closed.
   * @return true if the matter is closed
   */
  public boolean isClosed() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).isClosed();
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
   * Gets the value of the DeclaratoryJgmt field.
   * Whether the court has been asked to make a declaratory judgment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDeclaratoryJgmt() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DECLARATORYJGMT_PROP.get());
  }
  
  /**
   * Determines whether or not the given role has the 'Exclusive' constraint on this object.
   * @param role a contact role, cannot be null
   */
  public boolean isExclusiveRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
  }
  
  /**
   * Gets the value of the FirstNotice field.
   * Whether the lawsuit was the first notice of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFirstNotice() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIRSTNOTICE_PROP.get());
  }
  
  /**
   * Gets the value of the MotionSummaryJgmt field.
   * Whether this matter has a motion for summary judgment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMotionSummaryJgmt() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOTIONSUMMARYJGMT_PROP.get());
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
   * Gets the value of the PunitiveDamages field.
   * Punitive damages?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPunitiveDamages() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PUNITIVEDAMAGES_PROP.get());
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
   * Determines whether or not the given role has the given constraint on this object.
   * @param role 
   * @param constraintType 
   */
  public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
  }
  
  /**
   * Gets the value of the StructuredSettle field.
   * Whether this matter is a good candidate for structured settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStructuredSettle() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(STRUCTUREDSETTLE_PROP.get());
  }
  
  /**
   * Gets the value of the SubroRelated field.
   * Boolean field to mark if Matter related to Subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSubroRelated() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUBRORELATED_PROP.get());
  }
  
  public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
    ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
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
   * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
   */
  public void removeFromBudgetLines(entity.BudgetLine element) {
    __getInternalInterface().removeArrayElement(BUDGETLINES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBudgetLines(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BUDGETLINES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.MatterExposure element) {
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
   * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
   */
  public void removeFromStatusTypeLines(entity.LitStatusTypeLine element) {
    __getInternalInterface().removeArrayElement(STATUSTYPELINES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatusTypeLines(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(STATUSTYPELINES_PROP.get(), elementID);
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
   * Reopens this matter.
   * @param reopenReason reason the matter is being reopened
   * @param strReason description of reason why this matter is being closed
   * @throws com.guidewire.pl.system.exception.ReopenException if this Matter is already open.
   * @throws EntityValidationException If the Matter Reopened validation ruleset returns any errors or new warnings.
   */
  public void reopen(typekey.MatterReopenedReason reopenReason, java.lang.String strReason) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).reopen(reopenReason, strReason);
  }
  
  /**
   * Saves and sets up the matter.
   */
  public void saveAndSetup() {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).saveAndSetup();
  }
  
  /**
   * Sets the value of the AdDamnumAmount field.
   */
  public void setAdDamnumAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(ADDAMNUMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AdDamnumSpecified field.
   */
  public void setAdDamnumSpecified(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ADDAMNUMSPECIFIED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Arbitration field.
   */
  public void setArbitration(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ARBITRATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArbitrationDate field.
   */
  public void setArbitrationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ARBITRATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArbitrationRoom field.
   */
  public void setArbitrationRoom(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ARBITRATIONROOM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedByUser field.
   */
  public void setAssignedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedGroup field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedGroup(entity.Group value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedGroup(value);
  }
  
  /**
   * Sets the value of the AssignedQueue field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedQueue(entity.AssignableQueue value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedQueue(value);
  }
  
  /**
   * Sets the value of the AssignedUser field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedUser(entity.User value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedUser(value);
  }
  
  /**
   * Sets the value of the AssignmentDate field.
   */
  private void setAssignmentDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  private void setAssignmentStatus(typekey.AssignmentStatus value) {
    __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BudgetLines field.
   */
  public void setBudgetLines(entity.BudgetLine[] value) {
    __getInternalInterface().setFieldValue(BUDGETLINES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CaseNumber field.
   */
  public void setCaseNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CASENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
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
   * Sets the value of the CourtDistrict field.
   */
  public void setCourtDistrict(typekey.MatterCourtDistrict value) {
    __getInternalInterface().setFieldValue(COURTDISTRICT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CourtType field.
   */
  public void setCourtType(typekey.MatterCourtType value) {
    __getInternalInterface().setFieldValue(COURTTYPE_PROP.get(), value);
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
   * Sets the value of the DeclaratoryJgmt field.
   */
  public void setDeclaratoryJgmt(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DECLARATORYJGMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DefenseApptDate field.
   */
  public void setDefenseApptDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(DEFENSEAPPTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocketNumber field.
   */
  public void setDocketNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCKETNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.MatterExposure[] value) {
    __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FileDate field.
   */
  public void setFileDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FILEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FilingDate field.
   */
  public void setFilingDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FILINGDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinalLegalCost field.
   */
  public void setFinalLegalCost(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FINALLEGALCOST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinalSettleCost field.
   */
  public void setFinalSettleCost(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FINALSETTLECOST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinalSettleDate field.
   */
  public void setFinalSettleDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FINALSETTLEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstNotice field.
   */
  public void setFirstNotice(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FIRSTNOTICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HearingDate field.
   */
  public void setHearingDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(HEARINGDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HearingRoom field.
   */
  public void setHearingRoom(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(HEARINGROOM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LegalSpecialty field.
   */
  public void setLegalSpecialty(typekey.LegalSpecialty value) {
    __getInternalInterface().setFieldValue(LEGALSPECIALTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterCaseNumber field.
   */
  public void setMatterCaseNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MATTERCASENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterType field.
   */
  public void setMatterType(typekey.MatterType value) {
    __getInternalInterface().setFieldValue(MATTERTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MediationDate field.
   */
  public void setMediationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MEDIATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MediationRoom field.
   */
  public void setMediationRoom(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MEDIATIONROOM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MethodServed field.
   */
  public void setMethodServed(typekey.MatterMethodServed value) {
    __getInternalInterface().setFieldValue(METHODSERVED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MotionSummaryJgmt field.
   */
  public void setMotionSummaryJgmt(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MOTIONSUMMARYJGMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
   * Sets the value of the PreviousGroup field.
   */
  private void setPreviousGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(PREVIOUSGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviousQueue field.
   */
  private void setPreviousQueue(entity.AssignableQueue value) {
    __getInternalInterface().setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviousUser field.
   */
  private void setPreviousUser(entity.User value) {
    __getInternalInterface().setFieldValue(PREVIOUSUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PrimaryCause field.
   */
  public void setPrimaryCause(typekey.PrimaryCauseType value) {
    __getInternalInterface().setFieldValue(PRIMARYCAUSE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the PunitiveAmount field.
   */
  public void setPunitiveAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(PUNITIVEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PunitiveDamages field.
   */
  public void setPunitiveDamages(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PUNITIVEDAMAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.MatterReopenedReason value) {
    __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Resolution field.
   */
  public void setResolution(typekey.ResolutionType value) {
    __getInternalInterface().setFieldValue(RESOLUTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ResponseDue field.
   */
  public void setResponseDue(java.util.Date value) {
    __getInternalInterface().setFieldValue(RESPONSEDUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ResponseFiled field.
   */
  public void setResponseFiled(java.util.Date value) {
    __getInternalInterface().setFieldValue(RESPONSEFILED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskType field.
   */
  public void setRiskType(typekey.MatterRiskType value) {
    __getInternalInterface().setFieldValue(RISKTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value) {
    __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Room field.
   */
  public void setRoom(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ROOM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SentToDefenseDate field.
   */
  public void setSentToDefenseDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SENTTODEFENSEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceDate field.
   */
  public void setServiceDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StatusTypeLines field.
   */
  public void setStatusTypeLines(entity.LitStatusTypeLine[] value) {
    __getInternalInterface().setFieldValue(STATUSTYPELINES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StructuredSettle field.
   */
  public void setStructuredSettle(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(STRUCTUREDSETTLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroRelated field.
   */
  public void setSubroRelated(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SUBRORELATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value) {
    __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SuitType field.
   */
  public void setSuitType(typekey.SuitType value) {
    __getInternalInterface().setFieldValue(SUITTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TrialDate field.
   */
  public void setTrialDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(TRIALDATE_PROP.get(), value);
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
   * Sets the value of the VenueRating field.
   */
  public void setVenueRating(typekey.MatterVenueRating value) {
    __getInternalInterface().setFieldValue(VENUERATING_PROP.get(), value);
  }
  
  /**
   * Called on an assignable to decide if the assignment on the parent assignable should be cascaded
   * to this assignable.
   * @param parent the parent assignable
   * @param defaultOwnerUserId the id of the special default owner user, used by the assignment engine
   *   as the user of last resort if, for example, assignment rules can't find an appropriate user.
   * @param defaultGroupId the id of the root group, used by the assignment engine as the group of last
   *   resort if, for example, assignment rules can't find an appropriate group.
   * @return true if the assignment should be cascaded, false otherwise
   */
  public boolean shouldCascadeAssignment(entity.Assignable parent, gw.pl.persistence.core.Key defaultOwnerUserId, gw.pl.persistence.core.Key defaultGroupId) {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId);
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
   * Updates, creates or removes the arbitration date activity related to matter.  If no arbitration activity is associated with
   * the matter, one is created. If one already exists, it will be updated. If null is given for the arbitration date, then
   * the arbitration activity (if it exists) will be removed.
   * @param targetDate new arbitration date to update (or create) arbitration activity, null to remove arbitration activity   *
   */
  public void updateArbitrationDate(java.util.Date targetDate) {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateArbitrationDate(targetDate);
  }
  
  /**
   * Updates, creates or removes the hearing date activity related to matter.  If no hearing activity is associated with
   * the matter, one is created. If one already exists, it will be updated. If null is given for the hearing date, then
   * the hearing activity (if it exists) will be removed.
   * @param targetDate new hearing date to update (or create) hearing activity, null to remove hearing activity   *
   */
  public void updateHearingDate(java.util.Date targetDate) {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateHearingDate(targetDate);
  }
  
  /**
   * Updates, creates or removes the mediation date activity related to matter.  If no mediation activity is associated with
   * the matter, one is created. If one already exists, it will be updated. If null is given for the mediation date, then
   * the mediation activity (if it exists) will be removed.
   * @param targetDate new trial date to update (or create) trial activity, null to remove trial activity   *
   */
  public void updateMediationDate(java.util.Date targetDate) {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateMediationDate(targetDate);
  }
  
  /**
   * Updates, creates or removes a trial date activity related to matter. If no trial activity is associated with
   * the matter, one is created. If one already exists, it will be updated. If null is given for the trial date, then
   * the trial activity (if it exists) will be removed.
   * @param targetDate new trial date to update (or create) trial activity, null to remove trial activity
   */
  public void updateTrialDate(java.util.Date targetDate) {
    ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateTrialDate(targetDate);
  }
  
  /**
   * Executes matter validation rules on the matter, and returns a validation
   * object containing any errors. If validation was successful, an empty
   * validation object is returned. Note that calling this method has
   * the side effect of setting the validation level, hence requires that
   * the current user have EDIT permissions on the {@code Matter}, or will throw an exception.
   * @return a ValidationResult containing 0 or more errors/warnings found
   */
  public gw.api.validation.ValidationResult validate() {
    return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).validate();
  }
  
  /**
   * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MatterInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Matter.this.__getDelegateManager();
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
     * Adds the given element to the BudgetLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBudgetLines(entity.BudgetLine element) {
      __getInternalInterface().addArrayElement(BUDGETLINES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposures(entity.MatterExposure element) {
      __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the StatusTypeLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToStatusTypeLines(entity.LitStatusTypeLine element) {
      __getInternalInterface().addArrayElement(STATUSTYPELINES_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
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
    
    /**
     * Returns true if the matter can be closed by the indicated User.
     * @param user The User to test for ability to close this Matter - cannot be NULL.
     * @return <code>true</code> if the matter can be closed by the indicated User, else <code>false</code>
     */
    public boolean canClose(entity.User user) {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).canClose(user);
    }
    
    /**
     * Determines whether this owner can be edited.
     */
    public boolean canEdit() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
    }
    
    /**
     * Returns true if the matter can be reopened by the indicated User.
     * @param user The User to test for ability to reopen this Matter - cannot be NULL.
     * @return <code>true</code> if the matter can be reopened by the indicated User, else <code>false</code>
     */
    public boolean canReopen(entity.User user) {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).canReopen(user);
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
    
    /**
     * Closes this matter, with a null resolution and null description of why the matter is being closed
     * @throws CloseException if this Matter is already closed.
     * @deprecated Please use the version of close that takes ResolutionType and reason parameters,
     *   and provide values for those parameters explaining why the matter is being closed.
     */
    public void close() throws com.guidewire.pl.system.exception.CloseException {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).close();
    }
    
    /**
     * Closes this matter.
     * @param resolution resolution which closes this matter
     * @param strReason description of reason why this matter is being closed
     * @throws com.guidewire.pl.system.exception.CloseException if this Matter is already closed.
     * @throws EntityValidationException If the Matter Closed validation ruleset returns any errors or new warnings.
     */
    public void close(typekey.ResolutionType resolution, java.lang.String strReason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).close(resolution, strReason);
    }
    
    public void closeWithValidationOption(typekey.ResolutionType resolution, java.lang.String strReason, gw.api.validation.BundleValidationOption validationOption) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.matter.impl.MatterInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.matter.impl.MatterInternal")).closeWithValidationOption(resolution, strReason, validationOption);
    }
    
    /**
     * Commits this matter to the data store.
     */
    public void commit() {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).commit();
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
     * Called after the assignable is assigned to create a new history event recording the assignment. May
     * return null for some assignable types, meaning that no history event was created
     * @param assignable the assignable containing details of the new assignment
     * @return the new history event, or null
     */
    public entity.History createAssignmentHistoryEvent(entity.Assignable assignable) {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentHistoryEvent(assignable);
    }
    
    /**
     * Create a new assignment review activity which represents the responsibility to assign this
     * assignable. Assignment review activities are used for manual assignment.
     * @return a new assignment review activity which refers to this assignable
     */
    public entity.Activity createAssignmentReviewActivity() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentReviewActivity();
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
    
    /**
     * Find any existing open assignment review activities related to this assignable. Normally this will
     * return either zero or one activities. Assignment review activities are used for manual assignment.
     * @return a query result containing the open assignment review activities, if any
     */
    public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
    }
    
    public void finishAssignment() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).finishAssignment();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateAssignmentEvents() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).generateAssignmentEvents();
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
     * Get all the open activities for this matter as a query processor.
     * @return a QueryProcessor that encapsulates the query described above.
     */
    public gw.api.database.IQueryBeanResult<entity.Activity> getActivities() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getActivities();
    }
    
    /**
     * Gets the value of the AdDamnumAmount field.
     * Ad Damnum Amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAdDamnumAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(ADDAMNUMAMOUNT_PROP.get());
    }
    
    /**
     * Returns all allowed contact roles for a matter
     * @return a list of allowed contact roles for a matter
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getAllowedContactRolesForEntity();
    }
    
    /**
     * Gets the value of the ArbitrationDate field.
     * Current schedule trial date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getArbitrationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ARBITRATIONDATE_PROP.get());
    }
    
    /**
     * Returns the activity corresponding to this matter's arbitration date.
     * @return activity corresponding to this matter's arbitration date, null if there is no arbitration activity
     */
    public entity.Activity getArbitrationDateActivity() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getArbitrationDateActivity();
    }
    
    /**
     * Gets the value of the ArbitrationRoom field.
     * Room number in the arbitration venue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getArbitrationRoom() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARBITRATIONROOM_PROP.get());
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
     * Gets the value of the BudgetLines field.
     * An array of budget line records
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BudgetLine[] getBudgetLines() {
      return (entity.BudgetLine[])__getInternalInterface().getFieldValue(BUDGETLINES_PROP.get());
    }
    
    /**
     * Gets the value of the CaseNumber field.
     * Official reference number for the lawsuit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCaseNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CASENUMBER_PROP.get());
    }
    
    /**
     * Returns the child objects of the current assignable to which the new assigment should maybe be
     * cascaded. shouldCascadeAssignment will be called on each child before actually doing the cascade
     * @return child objects to which the new assignment should potentially be cascaded
     */
    public java.util.List<gw.api.assignment.CCAssignableMethods> getChildrenForCascadeAssignment() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getChildrenForCascadeAssignment();
    }
    
    /**
     * Gets the value of the Claim field.
     * The claim associated with this legal matter.
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
     * The currency related to this Matter's Claim.
     * @return The associated Claim's currency.  Returns NULL if the Claim is not currently
     *         reachable (for example, if the necessary entity connections have not yet been made).
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
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
     * Gets the value of the CourtDistrict field.
     * Court jurisdictional district
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterCourtDistrict getCourtDistrict() {
      return (typekey.MatterCourtDistrict)__getInternalInterface().getFieldValue(COURTDISTRICT_PROP.get());
    }
    
    /**
     * Gets the value of the CourtType field.
     * Court type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterCourtType getCourtType() {
      return (typekey.MatterCourtType)__getInternalInterface().getFieldValue(COURTTYPE_PROP.get());
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
    
    public typekey.ValidationLevel getDefaultValidationLevel() {
      return ((com.guidewire.pl.system.entity.LevelAwareValidatableBean)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.LevelAwareValidatableBean")).getDefaultValidationLevel();
    }
    
    /**
     * Gets the value of the DefenseApptDate field.
     * Date the defense counsel was appointed to this matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDefenseApptDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DEFENSEAPPTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the DocketNumber field.
     * Court docket number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocketNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCKETNUMBER_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the Exposures field.
     * The list of exposures to which this matter relates.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MatterExposure[] getExposures() {
      return (entity.MatterExposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
    }
    
    /**
     * Gets the value of the FileDate field.
     * Date the trial was filed in court.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFileDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FILEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the FilingDate field.
     * Filing date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFilingDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FILINGDATE_PROP.get());
    }
    
    /**
     * Gets the value of the FinalLegalCost field.
     * The final legal cost.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFinalLegalCost() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FINALLEGALCOST_PROP.get());
    }
    
    /**
     * Gets the value of the FinalSettleCost field.
     * The final settlement cost.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFinalSettleCost() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FINALSETTLECOST_PROP.get());
    }
    
    /**
     * Gets the value of the FinalSettleDate field.
     * The actual date of the final settlement (as opposed to the date of the payment).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFinalSettleDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FINALSETTLEDATE_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getGroupAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getGroupAssignmentStateHelpers();
    }
    
    /**
     * Gets the value of the HearingDate field.
     * Current scheduled matter hearing date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getHearingDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(HEARINGDATE_PROP.get());
    }
    
    /**
     * Returns the activity corresponding to this matter's hearing date.
     * @return activity corresponding to this matter's hearing date, null if there is no hearing activity
     */
    public entity.Activity getHearingDateActivity() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getHearingDateActivity();
    }
    
    /**
     * Gets the value of the HearingRoom field.
     * Room number in the hearing venue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getHearingRoom() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HEARINGROOM_PROP.get());
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
     * Gets the value of the LegalSpecialty field.
     * Legal specialty needed for this matter
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LegalSpecialty getLegalSpecialty() {
      return (typekey.LegalSpecialty)__getInternalInterface().getFieldValue(LEGALSPECIALTY_PROP.get());
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
     * Gets the value of the MatterCaseNumber field.
     * Case number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMatterCaseNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATTERCASENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the MatterType field.
     * Type of Matter such as General, Lawsuit, Arbitration, Hearing or Mediation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterType getMatterType() {
      return (typekey.MatterType)__getInternalInterface().getFieldValue(MATTERTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MediationDate field.
     * Date this matter entered mediation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMediationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MEDIATIONDATE_PROP.get());
    }
    
    /**
     * Returns the activity corresponding to this matter's mediation date.
     * @return activity corresponding to this matter's mediation date, null if there is no mediation activity
     */
    public entity.Activity getMediationDateActivity() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getMediationDateActivity();
    }
    
    /**
     * Gets the value of the MediationRoom field.
     * Room number in the mediation venue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMediationRoom() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MEDIATIONROOM_PROP.get());
    }
    
    /**
     * Gets the value of the MethodServed field.
     * Method served
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterMethodServed getMethodServed() {
      return (typekey.MatterMethodServed)__getInternalInterface().getFieldValue(METHODSERVED_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * Then name for this matter. Typically of the form 'X vs. Y' once the matter goes to trial.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Get the viewable notes for this matter as a query processor.
     * @return a QueryProcessor that encapsulates the query described above.
     */
    public gw.api.database.IQueryBeanResult<entity.Note> getNotes() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getNotes();
    }
    
    public entity.LitStatusTypeLine[] getOrderedStatusTypeLines() {
      return ((com.guidewire.cc.domain.matter.impl.MatterInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.matter.impl.MatterInternal")).getOrderedStatusTypeLines();
    }
    
    /**
     * Called by the "assignToClaimOwner" method to determine which assignable "owns" the current assignable
     * so the owners assignment information can be copied. The owner is nearly always just the claim though
     * there is a special case - if an activity belongs to an exposure then the exposure is the owner. If
     * this method return null the assignToClaimOwner call will return false.
     * @return the owning assignable, usually the claim
     */
    public entity.Assignable getOwningAssignable() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningAssignable();
    }
    
    /**
     * The claim that owns this assignable. If this property returns null then this assignable cannot be
     * manually assigned (because no assignment review activity can be created), cannot be assigned using
     * the "assignToClaimOwner" method and will not create history events when assigned.
     * @return the claim
     */
    public entity.Claim getOwningClaim() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningClaim();
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
    
    /**
     * Gets the value of the PrimaryCause field.
     * Why the lawsuit was brought in the first place.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PrimaryCauseType getPrimaryCause() {
      return (typekey.PrimaryCauseType)__getInternalInterface().getFieldValue(PRIMARYCAUSE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the PunitiveAmount field.
     * Punitive damages amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getPunitiveAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PUNITIVEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReopenedReason field.
     * The reason for reopening the matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterReopenedReason getReopenedReason() {
      return (typekey.MatterReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
    }
    
    /**
     * Gets the value of the Resolution field.
     * The type of resolution.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ResolutionType getResolution() {
      return (typekey.ResolutionType)__getInternalInterface().getFieldValue(RESOLUTION_PROP.get());
    }
    
    /**
     * Gets the value of the ResponseDue field.
     * Response Due
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getResponseDue() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RESPONSEDUE_PROP.get());
    }
    
    /**
     * Gets the value of the ResponseFiled field.
     * Response filed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getResponseFiled() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RESPONSEFILED_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RiskType field.
     * Describes the overall risk on this matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterRiskType getRiskType() {
      return (typekey.MatterRiskType)__getInternalInterface().getFieldValue(RISKTYPE_PROP.get());
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
     * Gets the value of the Room field.
     * Room number in the venue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRoom() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROOM_PROP.get());
    }
    
    /**
     * Gets the value of the SentToDefenseDate field.
     * Date this matter was sent to the defense attorney.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSentToDefenseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SENTTODEFENSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceDate field.
     * Service date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServiceDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the StatusTypeLines field.
     * The progression of status type lines on this matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LitStatusTypeLine[] getStatusTypeLines() {
      return (entity.LitStatusTypeLine[])__getInternalInterface().getFieldValue(STATUSTYPELINES_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationSummary field.
     * Subrogation information related to this matter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SubrogationSummary getSubrogationSummary() {
      return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubrogationSummaryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBROGATIONSUMMARY_PROP.get());
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
     * Gets the value of the SuitType field.
     * The type of suit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SuitType getSuitType() {
      return (typekey.SuitType)__getInternalInterface().getFieldValue(SUITTYPE_PROP.get());
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
     * Computes and returns the Total Paid amount for the "LEGAL" {@link typekey.CostCategory}
     * related to this matter.  Optionally, the computed amount can be limited by a specific {@link typekey.LineCategory}.
     * <p/>
     * NOTE: This computed amount returned by this method only reflects the currently saved data.  It does not reflect any new, updated or removed
     *       Payments or TransactionLineItems that have not yet been saved.
     * @param lineCategory The {@link typekey.LineCategory} by which to filter the Total Paid computation.  If NULL, then all
     *                     LineCategories are included
     * @return CurrencyAmount Containing the Total Paid amount tied to this Matter for the indicated {@link typekey.LineCategory} (if not NULL).  The currency
     *                        on the Currency Amount will be the Claim's currency, or just the default application currency for non-multicurrency
     *                        configurations.
     */
    public gw.api.financials.CurrencyAmount getTotalPaidForMatterCostCategory(typekey.LineCategory lineCategory) {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getTotalPaidForMatterCostCategory(lineCategory);
    }
    
    /**
     * Gets the value of the TrialDate field.
     * Current schedule trial date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTrialDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TRIALDATE_PROP.get());
    }
    
    /**
     * Returns the activity corresponding to this matter's trial date.
     * @return activity corresponding to this matter's trial date, null if there is not trial activity
     */
    public entity.Activity getTrialDateActivity() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).getTrialDateActivity();
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
     * Gets the value of the ValidationLevel field.
     * Validation level the matter passed (if any) the last time it was checked.
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
     * Gets the value of the VenueRating field.
     * Rating of venue for this matter
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MatterVenueRating getVenueRating() {
      return (typekey.MatterVenueRating)__getInternalInterface().getFieldValue(VENUERATING_PROP.get());
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
    
    /**
     * Gets the value of the AdDamnumSpecified field.
     * Was Ad Damnum specified?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAdDamnumSpecified() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADDAMNUMSPECIFIED_PROP.get());
    }
    
    /**
     * Gets the value of the Arbitration field.
     * Whether a suit has gone into arbitration.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isArbitration() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ARBITRATION_PROP.get());
    }
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
    }
    
    /**
     * Returns true if the matter is closed.
     * @return true if the matter is closed
     */
    public boolean isClosed() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).isClosed();
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
     * Gets the value of the DeclaratoryJgmt field.
     * Whether the court has been asked to make a declaratory judgment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDeclaratoryJgmt() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DECLARATORYJGMT_PROP.get());
    }
    
    /**
     * Determines whether or not the given role has the 'Exclusive' constraint on this object.
     * @param role a contact role, cannot be null
     */
    public boolean isExclusiveRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
    }
    
    /**
     * Gets the value of the FirstNotice field.
     * Whether the lawsuit was the first notice of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFirstNotice() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIRSTNOTICE_PROP.get());
    }
    
    /**
     * Gets the value of the MotionSummaryJgmt field.
     * Whether this matter has a motion for summary judgment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMotionSummaryJgmt() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOTIONSUMMARYJGMT_PROP.get());
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
     * Gets the value of the PunitiveDamages field.
     * Punitive damages?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPunitiveDamages() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PUNITIVEDAMAGES_PROP.get());
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
     * Determines whether or not the given role has the given constraint on this object.
     * @param role 
     * @param constraintType 
     */
    public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
    }
    
    /**
     * Gets the value of the StructuredSettle field.
     * Whether this matter is a good candidate for structured settlement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isStructuredSettle() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(STRUCTUREDSETTLE_PROP.get());
    }
    
    /**
     * Gets the value of the SubroRelated field.
     * Boolean field to mark if Matter related to Subrogation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSubroRelated() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SUBRORELATED_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public void open() {
      ((com.guidewire.cc.domain.matter.impl.MatterInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.matter.impl.MatterInternal")).open();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
      ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
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
     * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
     */
    public void removeFromBudgetLines(entity.BudgetLine element) {
      __getInternalInterface().removeArrayElement(BUDGETLINES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BudgetLines array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBudgetLines(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BUDGETLINES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     */
    public void removeFromExposures(entity.MatterExposure element) {
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
     * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
     */
    public void removeFromStatusTypeLines(entity.LitStatusTypeLine element) {
      __getInternalInterface().removeArrayElement(STATUSTYPELINES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the StatusTypeLines array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromStatusTypeLines(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(STATUSTYPELINES_PROP.get(), elementID);
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
     * Reopens this matter.
     * @param reopenReason reason the matter is being reopened
     * @param strReason description of reason why this matter is being closed
     * @throws com.guidewire.pl.system.exception.ReopenException if this Matter is already open.
     * @throws EntityValidationException If the Matter Reopened validation ruleset returns any errors or new warnings.
     */
    public void reopen(typekey.MatterReopenedReason reopenReason, java.lang.String strReason) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).reopen(reopenReason, strReason);
    }
    
    public void reopenWithValidationOption(typekey.MatterReopenedReason reopenReason, java.lang.String reason, gw.api.validation.BundleValidationOption validationOption) {
      ((com.guidewire.cc.domain.matter.impl.MatterInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.matter.impl.MatterInternal")).reopenWithValidationOption(reopenReason, reason, validationOption);
    }
    
    /**
     * Saves and sets up the matter.
     */
    public void saveAndSetup() {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).saveAndSetup();
    }
    
    /**
     * Sets the value of the AdDamnumAmount field.
     */
    public void setAdDamnumAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(ADDAMNUMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AdDamnumSpecified field.
     */
    public void setAdDamnumSpecified(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ADDAMNUMSPECIFIED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Arbitration field.
     */
    public void setArbitration(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ARBITRATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArbitrationDate field.
     */
    public void setArbitrationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ARBITRATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArbitrationRoom field.
     */
    public void setArbitrationRoom(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ARBITRATIONROOM_PROP.get(), value);
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
     * Sets the value of the BudgetLines field.
     */
    public void setBudgetLines(entity.BudgetLine[] value) {
      __getInternalInterface().setFieldValue(BUDGETLINES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CaseNumber field.
     */
    public void setCaseNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CASENUMBER_PROP.get(), value);
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
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
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
     * Sets the value of the CourtDistrict field.
     */
    public void setCourtDistrict(typekey.MatterCourtDistrict value) {
      __getInternalInterface().setFieldValue(COURTDISTRICT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CourtType field.
     */
    public void setCourtType(typekey.MatterCourtType value) {
      __getInternalInterface().setFieldValue(COURTTYPE_PROP.get(), value);
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
     * Sets the value of the DeclaratoryJgmt field.
     */
    public void setDeclaratoryJgmt(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DECLARATORYJGMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DefenseApptDate field.
     */
    public void setDefenseApptDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(DEFENSEAPPTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocketNumber field.
     */
    public void setDocketNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCKETNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposures field.
     */
    public void setExposures(entity.MatterExposure[] value) {
      __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FileDate field.
     */
    public void setFileDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FILEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FilingDate field.
     */
    public void setFilingDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FILINGDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinalLegalCost field.
     */
    public void setFinalLegalCost(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FINALLEGALCOST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinalSettleCost field.
     */
    public void setFinalSettleCost(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FINALSETTLECOST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinalSettleDate field.
     */
    public void setFinalSettleDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FINALSETTLEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstNotice field.
     */
    public void setFirstNotice(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FIRSTNOTICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HearingDate field.
     */
    public void setHearingDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(HEARINGDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HearingRoom field.
     */
    public void setHearingRoom(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(HEARINGROOM_PROP.get(), value);
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
     * Sets the value of the LegalSpecialty field.
     */
    public void setLegalSpecialty(typekey.LegalSpecialty value) {
      __getInternalInterface().setFieldValue(LEGALSPECIALTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterCaseNumber field.
     */
    public void setMatterCaseNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MATTERCASENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterType field.
     */
    public void setMatterType(typekey.MatterType value) {
      __getInternalInterface().setFieldValue(MATTERTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MediationDate field.
     */
    public void setMediationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MEDIATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MediationRoom field.
     */
    public void setMediationRoom(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MEDIATIONROOM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MethodServed field.
     */
    public void setMethodServed(typekey.MatterMethodServed value) {
      __getInternalInterface().setFieldValue(METHODSERVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MotionSummaryJgmt field.
     */
    public void setMotionSummaryJgmt(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MOTIONSUMMARYJGMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
    
    /**
     * Sets the value of the PrimaryCause field.
     */
    public void setPrimaryCause(typekey.PrimaryCauseType value) {
      __getInternalInterface().setFieldValue(PRIMARYCAUSE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the PunitiveAmount field.
     */
    public void setPunitiveAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(PUNITIVEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PunitiveDamages field.
     */
    public void setPunitiveDamages(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PUNITIVEDAMAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReopenedReason field.
     */
    public void setReopenedReason(typekey.MatterReopenedReason value) {
      __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Resolution field.
     */
    public void setResolution(typekey.ResolutionType value) {
      __getInternalInterface().setFieldValue(RESOLUTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ResponseDue field.
     */
    public void setResponseDue(java.util.Date value) {
      __getInternalInterface().setFieldValue(RESPONSEDUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ResponseFiled field.
     */
    public void setResponseFiled(java.util.Date value) {
      __getInternalInterface().setFieldValue(RESPONSEFILED_PROP.get(), value);
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
     * Sets the value of the RiskType field.
     */
    public void setRiskType(typekey.MatterRiskType value) {
      __getInternalInterface().setFieldValue(RISKTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Room field.
     */
    public void setRoom(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ROOM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SentToDefenseDate field.
     */
    public void setSentToDefenseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SENTTODEFENSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceDate field.
     */
    public void setServiceDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatusTypeLines field.
     */
    public void setStatusTypeLines(entity.LitStatusTypeLine[] value) {
      __getInternalInterface().setFieldValue(STATUSTYPELINES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StructuredSettle field.
     */
    public void setStructuredSettle(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(STRUCTUREDSETTLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroRelated field.
     */
    public void setSubroRelated(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SUBRORELATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationSummary field.
     */
    public void setSubrogationSummary(entity.SubrogationSummary value) {
      __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
    }
    
    public void setSubrogationSummaryID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SuitType field.
     */
    public void setSuitType(typekey.SuitType value) {
      __getInternalInterface().setFieldValue(SUITTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TrialDate field.
     */
    public void setTrialDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(TRIALDATE_PROP.get(), value);
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
     * Sets the value of the VenueRating field.
     */
    public void setVenueRating(typekey.MatterVenueRating value) {
      __getInternalInterface().setFieldValue(VENUERATING_PROP.get(), value);
    }
    
    /**
     * Called on an assignable to decide if the assignment on the parent assignable should be cascaded
     * to this assignable.
     * @param parent the parent assignable
     * @param defaultOwnerUserId the id of the special default owner user, used by the assignment engine
     *   as the user of last resort if, for example, assignment rules can't find an appropriate user.
     * @param defaultGroupId the id of the root group, used by the assignment engine as the group of last
     *   resort if, for example, assignment rules can't find an appropriate group.
     * @return true if the assignment should be cascaded, false otherwise
     */
    public boolean shouldCascadeAssignment(entity.Assignable parent, gw.pl.persistence.core.Key defaultOwnerUserId, gw.pl.persistence.core.Key defaultGroupId) {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId);
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
     * Updates, creates or removes the arbitration date activity related to matter.  If no arbitration activity is associated with
     * the matter, one is created. If one already exists, it will be updated. If null is given for the arbitration date, then
     * the arbitration activity (if it exists) will be removed.
     * @param targetDate new arbitration date to update (or create) arbitration activity, null to remove arbitration activity   *
     */
    public void updateArbitrationDate(java.util.Date targetDate) {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateArbitrationDate(targetDate);
    }
    
    /**
     * Updates, creates or removes the hearing date activity related to matter.  If no hearing activity is associated with
     * the matter, one is created. If one already exists, it will be updated. If null is given for the hearing date, then
     * the hearing activity (if it exists) will be removed.
     * @param targetDate new hearing date to update (or create) hearing activity, null to remove hearing activity   *
     */
    public void updateHearingDate(java.util.Date targetDate) {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateHearingDate(targetDate);
    }
    
    /**
     * Updates, creates or removes the mediation date activity related to matter.  If no mediation activity is associated with
     * the matter, one is created. If one already exists, it will be updated. If null is given for the mediation date, then
     * the mediation activity (if it exists) will be removed.
     * @param targetDate new trial date to update (or create) trial activity, null to remove trial activity   *
     */
    public void updateMediationDate(java.util.Date targetDate) {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateMediationDate(targetDate);
    }
    
    /**
     * Updates, creates or removes a trial date activity related to matter. If no trial activity is associated with
     * the matter, one is created. If one already exists, it will be updated. If null is given for the trial date, then
     * the trial activity (if it exists) will be removed.
     * @param targetDate new trial date to update (or create) trial activity, null to remove trial activity
     */
    public void updateTrialDate(java.util.Date targetDate) {
      ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).updateTrialDate(targetDate);
    }
    
    /**
     * Executes matter validation rules on the matter, and returns a validation
     * object containing any errors. If validation was successful, an empty
     * validation object is returned. Note that calling this method has
     * the side effect of setting the validation level, hence requires that
     * the current user have EDIT permissions on the {@code Matter}, or will throw an exception.
     * @return a ValidationResult containing 0 or more errors/warnings found
     */
    public gw.api.validation.ValidationResult validate() {
      return ((gw.cc.matter.entity.Matter)__getDelegateManager().getImplementation("gw.cc.matter.entity.Matter")).validate();
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
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.cc.domain.matter.impl.MatterInternal", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.assignment.AssignablePublicMethods", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.system.entity.LevelAwareValidatableBean", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("gw.api.assignment.CCAssignableMethods", "gw.assignment.MatterAssignableMethodsImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("gw.cc.assignment.entity.CCAssignable", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("gw.cc.matter.entity.Matter", "com.guidewire.cc.domain.matter.impl.MatterImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Matter.class, config);
    com.guidewire._generated.entity.MatterInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Matter, com.guidewire._generated.entity.MatterInternal>() {
      public java.lang.Object getImplementation(entity.Matter bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MatterInternal getInternalInterface(entity.Matter bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Matter newEmptyInstance() {
        return new entity.Matter((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}