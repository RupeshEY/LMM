package gw.webservice.cc.cc901.claim

uses entity.Activity
uses entity.Address
uses entity.Contact
uses entity.History
uses gw.api.database.Query
uses gw.api.fnolmapper.FNOLMapper
uses gw.api.server.AvailabilityLevel
uses gw.api.tools.ProcessID
uses gw.api.webservice.exception.BadIdentifierException
uses gw.api.webservice.exception.DuplicateKeyException
uses gw.api.webservice.exception.EntityStateException
uses gw.api.webservice.exception.PermissionException
uses gw.api.webservice.exception.RequiredFieldException
uses gw.lang.Deprecated
uses gw.lang.reflect.IType
uses gw.lang.reflect.TypeSystem
uses gw.pl.util.ArgCheck
uses gw.plugin.assignment.AssignmentResponse
uses gw.transaction.Transaction
uses gw.webservice.cc.cc901.CCWsiEntityApiBase
uses gw.webservice.cc.cc901.dto.ActivityDTO
uses gw.webservice.cc.cc901.dto.ActivityPatternDTO
uses gw.webservice.cc.cc901.dto.AddressDTO
uses gw.webservice.cc.cc901.dto.ClaimDTO
uses gw.webservice.cc.cc901.dto.ClaimInfoDTO
uses gw.webservice.cc.cc901.dto.ContactDTO
uses gw.webservice.cc.cc901.dto.DocumentDTO
uses gw.webservice.cc.cc901.dto.ExposureDTO
uses gw.webservice.cc.cc901.dto.NoteDTO
uses gw.webservice.cc.cc901.dto.PolicyDTO
uses gw.webservice.cc.cc901.dto.PolicySummaryDTO
uses gw.webservice.cc.cc901.dto.VehicleDTO
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiCheckDuplicateExternalTransaction
uses gw.xml.ws.annotation.WsiGenInToolkit
uses gw.xml.ws.annotation.WsiWebService

/**
 * Date: 5/13/13
 * Jira: CLM-25234
 */

@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI")
@WsiAvailability(AvailabilityLevel.MAINTENANCE)
@WsiGenInToolkit
@Export
class ClaimAPI extends CCWsiEntityApiBase {

  construct() {
    super()
  }

  /* ==========
   * ACTIVITIES
   * ==========
   */

  /**
   * Complete the activity  specified by the identifier.
   * @param activityID The PublicID that specifies the activity to complete
   */
  @Throws(BadIdentifierException, "If the activityID doesn't correspond to an existing activity.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function completeActivity(activityID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var act = fetchByPublicID<Activity>(activityID, bundle)
      act.complete()
    })
  }

  /**
   * Creates a new activity with values defined by the DTO
   *
   * @param dto       A description of the activity to create
   * @return The PublicID of the newly created activity.
   */
  @Throws(BadIdentifierException, "If the dto's ClaimID does not exist")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(IllegalArgumentException, "If no DTO was supplied, or it does not specify a ClaimID or ActivityPatternID")
  @WsiCheckDuplicateExternalTransaction
  public function createActivity(dto : ActivityDTO) : String {
    ArgCheck.nonNull (dto,                   "activityDTO")
    ArgCheck.nonBlank(dto.ClaimPublicID,           "activityDTO.ClaimID")

    var activity : Activity
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = bundle.add(dto.Claim)
      activity = assembleFromDTOs({dto}, claim, dto.Exposure).first()
    })

    return activity.PublicID
  }

  /**
   * Adds an activity to a claim using an activity pattern. First, attempts to generate an activity from the given
   * pattern.  The activity pattern must be from the list of activity patterns for the given claim that meet the
   * following criteria:
   * <p/>
   * 1) if the claim is closed, then the activity pattern must be available to closed claims<br>
   * 2) the activity pattern's loss type must either be null, or must match the claim's
   * loss type.
   * <p/>
   * If the activity pattern doesn't match the above criteria, an EntityStateException is thrown.
   * <p/>
   * @param claimID           The PublicID of the claim to which the activity should be added.
   * @param patternID The PublicID of the activity pattern that is to be used for the activity.
   * @return The PublicID of the newly created activity.
   */
  @Throws(BadIdentifierException, "If either the claimID or patternID does not exist.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(EntityStateException, "If there is an attempt to add an activity using an activity pattern that isn't available to the particular type of the given claim, or that isn't available to a closed claim (if the given claim is closed).")
  @WsiCheckDuplicateExternalTransaction
  function createActivityFromPattern(claimID : String, patternID : String) : String {
    return createActivity(new ActivityDTO() {
        :ActivityPatternPublicID = patternID,
        :ClaimPublicID           = claimID
    })
  }

  function getActivityPatternDataForCode(aCode : String) : ActivityPatternDTO {
    var pattern = ActivityPattern.finder.getActivityPatternByCode(aCode)
    return ActivityPatternDTO.valueOf(pattern)
  }

  function getActivityPatternData(publicID : String) : ActivityPatternDTO {
    return ActivityPatternDTO.valueOf(fetchByPublicID(publicID))
  }

  /**
   * Skip the activity specified by the identifier.
   * @param activityID The PublicID that specifies the activity to skip
   */
  @Throws(BadIdentifierException, "If the activityID doesn't correspond to an existing activity.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function skipActivity(activityID : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var act = fetchByPublicID<Activity>(activityID, bundle)
      act.skip()
    })
  }


  /* ==========
   * ADDRESS
   * ==========
   */

  /**
   * Creates a new address with values defined by the DTO
   *
   * @param dto       A description of the address to create
   * @return The PublicID of the newly created address.
   */
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(IllegalArgumentException, "If no DTO was supplied")
  @WsiCheckDuplicateExternalTransaction
  public function createAddress(dto : AddressDTO) : String {
    ArgCheck.nonNull (dto,                   "addressDTO")

    var address: Address
    Transaction.runWithNewBundle(\ bundle -> {
      address = assembleFromDTO(dto, bundle)
    })

    return address.PublicID
  }


  /* ==========
   * CLAIM
   * ==========
   */

  /**
   * Retrieves a claim given the claim identifier
   *
   * @param claimID The ID of the claim to retrieve
   * @return The ClaimDTO
   */
  @Throws(BadIdentifierException, "If the claimID does not exist.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  function getDtoForClaim(claimID : String) : ClaimDTO {
    return ClaimDTO.valueOf(fetchByPublicID(claimID))
  }

  @Throws(RequiredFieldException, "If the supplied object is null.")
  private function requireField(obj: Object, fieldName: String) {
    if (obj == null) {
      throw new RequiredFieldException("The field '" + fieldName + "' is required.")
    }
  }

  /**
   * Adds an FNOL claim to the system. FNOLs are run through the Loaded rules, an import History event is created
   * and the claim is then run through the normal save and setup routine, at the end of which the claim is OPEN.
   * Finally the claim is committed; this commit will include all exposures, activities etc. created during the
   * call.
   *
   * @param claimDTO           The DTO that describes the Claim to be created.
   * @param policyDTO          The DTO that describes the Policy to be associated with the new Claim.
   * @return The PublicID of the newly created claim.
   */
  @Throws(DuplicateKeyException, "If the claim number is not unique.")
  @Throws(RequiredFieldException, "If the claim doesn't have a claim number or policy.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions")
  @Throws(IllegalArgumentException, "If a currency was supplied for the claimDTO (use a policy currency on the policyDTO instead, or If NewLossLocation and LossLocationPublicID are both specified in the ClaimDTO")
  @WsiCheckDuplicateExternalTransaction
  function addFNOL(claimDTO : ClaimDTO, policyDTO : PolicyDTO) : String {
    var fnolClaim : Claim
    requireField(claimDTO, "claimDTO")
    requireField(policyDTO, "policyDTO")

    if (claimDTO.Currency != null) {
      throw new IllegalArgumentException("To specify a claim currency, set it on the PolicyDTO, not the ClaimDTO")
    }
    if (claimDTO.NewLossLocation != null && claimDTO.LossLocationPublicID != null) {
      throw new IllegalArgumentException("NewLossLocation and LossLocationPublicID cannot both be specified")
    }
    Transaction.runWithNewBundle(\ bundle -> {
      // either or both could be null
      var user  = fetchByPublicID<User >(claimDTO.AssignedUserPublicID, true)
      var group = fetchByPublicID<Group>(claimDTO.AssignedGroupPublicID, true)

      fnolClaim = assembleFromDTO(claimDTO, policyDTO, bundle)

      Delegate.addAndAssignFNOL(fnolClaim, user, group)
    })
    return fnolClaim.PublicID
  }

  /**
   * Adds an FNOL claim to the system. FNOLs are run through the Loaded rules, an import History event is created
   * and the claim is then run through the normal save and setup routine, at the end of which the claim is OPEN.
   * Finally the claim is committed; this commit will include all exposures, activities etc. created during the
   * call.
   *
   * @param claimDTO           The DTO that describes the Claim to be created.
   * @param policySummaryDTO   The DTO that describes the PolicySummary to be used to fetch the Policy from the Policy
   * System.
   * @return The PublicID of the newly created claim.
   */
  @Throws(DuplicateKeyException, "If the claim number is not unique.")
  @Throws(RequiredFieldException, "If the claim doesn't have a claim number or policy.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions")
  @WsiCheckDuplicateExternalTransaction
  function addFNOLLookupPolicy(claimDTO : ClaimDTO, policySummaryDTO : PolicySummaryDTO) : String {
    var fnolClaim : Claim
    requireField(claimDTO, "claimDTO")
    requireField(policySummaryDTO, "policySummaryDTO")

    Transaction.runWithNewBundle(\ bundle -> {
      // either or both could be null
      var user  = fetchByPublicID<User >(claimDTO.AssignedUserPublicID, true)
      var group = fetchByPublicID<Group>(claimDTO.AssignedGroupPublicID, true)

      fnolClaim = assembleFromDTO(claimDTO, policySummaryDTO, bundle)

      Delegate.addAndAssignFNOL(fnolClaim, user, group)
    })
    return fnolClaim.PublicID
  }

  /**
   * Adds an FNOL claim to the system, populated from the given XML by using the
   * named mapper class. A new, empty, claim is created then an instance of the
   * given mapper class is created and called to populate the claim from the XML.
   * The populated claim is then processed in the same way as a normal addFNOL call:
   * the loaded rules are called, a history event is added and save and setup is
   * performed. See the addFNOL documentation for details.
   * @param xml The FNOL, as an XML string.
   * @param mapperClassName The name of a Gosu class that implements the gw.api.fnolmapper.FNOLMapper
   * @return The PublicID of the imported claim
   */
  @WsiCheckDuplicateExternalTransaction
  function importClaimFromXML(xml : String, mapperClassName : String) : String {
    var fnolClaim : Claim
    Transaction.runWithNewBundle(\ bundle -> {
      var fnolMapper = instantiateMapper(loadMapperType(mapperClassName))
      fnolClaim = Delegate.importFNOLFromXMLWithoutCommit(xml, fnolMapper, bundle)
    })
    return fnolClaim.PublicID
  }

  private function loadMapperType(typeName:String) : IType {
    var type = TypeSystem.getByFullNameIfValid(typeName)
    if(type==null) {
      throw new IllegalArgumentException("Mapper type '${typeName}' does not exist")
    }
    return type
  }

  private function instantiateMapper(type:IType) : FNOLMapper {
    if(not gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(FNOLMapper.Type, type)) {
      throw new IllegalArgumentException("Type '${type.Name}' is not a valid mapper type: must implement ${FNOLMapper.Type.Name}")
    }
    var constructor = type.TypeInfo.getConstructor({})
    return constructor.Constructor.newInstance({}) as FNOLMapper
  }


  /**
   * Adds an FNOL claim to the system, populated from the given ACORD XML by using
   * the out of box gw.fnolmapper.acord.AcordFNOLMapper mapper class. This is just a
   * convenience interface which calls importClaimFromXML with gw.fnolmapper.acord.AcordFNOLMapper
   * as the mapperClassName argument
   * @param xml The FNOL, as an Acord XML string.
   * @return The PublicID of the imported claim
   */
  @Throws(DuplicateKeyException, "If the claim number is not unique.")
  @Throws(RequiredFieldException, "If the claim doesn't have a claim number or policy.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions")
  @WsiCheckDuplicateExternalTransaction
  function importAcordClaimFromXML(xml : String) : String {
    return importClaimFromXML(xml, gw.fnolmapper.acord.AcordFNOLMapper.Type.Name)
  }


  /**
   * Adds a claim to the system. The claim must pass level0 (loadsave) validation before it will be added
   * to the system. The claim that is being added is presumed to have been worked on in another system and
   * is being migrated to ClaimCenter, so it will not go through the load rules or the setup process that
   * is executed by {@link #addFNOL}. The claim is marked as being in the "Open" state.
   * <p>
   * The steps executed by this method are
   * <ol>
   * <li>Sets the claim state from the DTO, or if that's null, to "Open"
   * <li>Assign the claim to the given user and group
   * <li>Commit the claim; this will run pre-update rules, validate the claim at the loadsave level and run event rules
   * </ol>
   * <p>
   *
   * @param claimDTO    The claim to be added to the system.
   * @param policyDTO          The DTO that describes the Policy to be associated with the new Claim.
   * @return The PublicID of the newly created claim.
   */
  @Throws(BadIdentifierException, "If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function migrateClaim(claimDTO : ClaimDTO, policyDTO : PolicyDTO) : String {
    var claim : Claim

    Transaction.runWithNewBundle(\ bundle -> {
      // Since State is read-only, writeTo() will set the DTO's value from the entity, overwriting
      // the passed-in value. Normally this is what we want, but during migration we want the DTO's
      // value to win, so we remember the original value and restore it after the call.
      var intendedState = claimDTO.State ?: ClaimState.TC_OPEN

      claim = assembleFromDTO(claimDTO, policyDTO, bundle)

      Delegate.migrateClaim(
          claim,
          intendedState,
          claimDTO.AssignedGroup.PublicID,
          claimDTO.AssignedUser.PublicID,
          false
      )
    })
    return claim.PublicID
  }


  /**
   * Check to see if the claim specified by claimID exists in the system.
   *
   * @param claimID The ID of the claim to check
   * @return <code>true</code> if the claim exists in ClaimCenter, and <code>false</code>
   *         otherwise
   */
  function doesExist(claimID : String) : boolean {
    var claimExists = false
    try {
      var claim = fetchByPublicID<Claim>(claimID)
      claimExists = claim != null
    }
    catch (ex : BadIdentifierException) {}
    return claimExists
  }


  /**
   * Check to see if the claims specified by the given claim numbers exist in
   * the system. Returns an array containing just the claim numbers that do
   * exist. If no numbers match returns an empty array. The order of the numbers
   * in the returned array is undefined - you should <em>not</em> rely on it
   * being the same order as in the claimNumbers parameter.
   *
   * @param claimNumbers the claim numbers to search for
   * @return array of strings containing all claim numbers that match
   */
  function claimsExist(claimNumbers : String[]) : String[] {
    var claimQ = Query.make(Claim)
        .compareIn(Claim#ClaimNumber, claimNumbers)
        .select()
    var results = claimQ.map(\ clm -> clm.ClaimNumber)
    return results.toTypedArray()
  }


  /**
   * Checks to see if the claim is valid. Any exposures associated with the claim are checked, as well. Validity is
   * determined by applying the claim validation rules.  If the validationLevelCode is blank, then the method returns
   * false if errors are found at any level.
   *
   * @param claimID          The ID of the claim to check
   * @param validationLevel The validation level to check
   * @return <code>true</code> if the claim and exposures are valid and <code>false</code> otherwise.
   */
  @Throws(BadIdentifierException, "If the claimID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  function checkValid(claimID : String, validationLevel : ValidationLevel) : boolean {
    var hasErrors = true

    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      hasErrors = claim.validate(true).hasErrors(validationLevel)
    })
    return !hasErrors
  }


  /**
   * Schedules all imported claims whose loadCommandID matches the supplied value for validation.
   * The claim and its associated policy and exposures will be validated.
   * Bulk validation uses distributed work queues to spread the work of validating large
   * numbers of claims across multiple threads/nodes.  This method does NOT perform the validation;
   * instead, it creates a workitem for each claim to be validated.  These workitems are processed
   * by distributed worker instances that perform the validation.<p>
   *
   * This method launches a batch process to generate the workitems; the process is NOT
   * guaranteed (or expected) to finish before the method returns.  The returned ProcessID
   * can be used to query the status of the batch process using the methods on MaintenanceToolsAPI.
   * <p>
   *
   * By default no worker instances are configured to run for this process.  In order to perform the actual validation,
   * use MaintenanceToolsAPI.setWorkQueueConfig() to dynamically allocate worker instances.
   * <p>
   * The complete process is:
   * <ol>
   * <li>Load claims via TableImportAPI.integrityCheckStagingTableContentsAndLoadSourceTables())</li>
   * <li>Extract the loadCommandID from the returned TableImportResult object</li></li>
   * <li>Call ClaimAPI.bulkValidate(loadCommandID)</li>
   * <li>Poll MaintenanceToolsAPI.batchProcessStatusByID() using the returned processID until the batch process completes.</li>
   * <li>Configure workers using MaintenanceToolsAPI.setWorkQueueConfig() with work queue name "ClaimValidation"</li>
   * <li>Notify workers using MaintenanceToolsAPI.notifyQueueWorkers() with work queue name "ClaimValidation"</li>
   * </ol>
   * @param loadCommandID  An integer value identifying the conversion batch that imported these claims.
   * The loadCommandID value is available through the TableImportResult object returned from a table
   * import operation. (e.g. TableImportAPI.integrityCheckStagingTableContentsAndLoadSourceTables())
   * @return Returns the ID of the batch process
   * @deprecated Use {@link ClaimAPI#startClaimValidation(String)} instead.
   */
  @Deprecated("Use gw.webservice.cc.cc901.claim.ClaimAPI#startClaimValidation(java.lang.String) instead")
  @SuppressWarnings("deprecation")
  function bulkValidate(loadCommandID : long) : long {
    return Delegate.bulkValidate(loadCommandID).Pid
  }

  /**
   * Schedules validation of the claim and associated policy and exposures for
   * all claims whose LoadCommand has the supplied PublicID. This validation uses
   * distributed work queues to spread the work across multiple threads/nodes.
   * This method does NOT perform the validation itself, but rather
   * launches a batch process that will create work items for each claim to be validated.
   * These work items are processed by distributed worker instances that perform the validation.
   * <p>
   *
   * This method launches a batch process to generate the workitems; the process is NOT
   * guaranteed (or expected) to finish before the method returns.  The returned ProcessID
   * can be used to query the status of the batch process using {@link gw.webservice.cc.MaintenanceToolsAPI#batchProcessStatusByID}.
   * <p>
   *
   * By default no worker instances are configured to run for this process.  In order to perform the actual validation,
   * use MaintenanceToolsAPI.setWorkQueueConfig() to dynamically allocate worker instances.
   * <p>
   * The usual steps for using this method are:
   * <ol>
   * <li>Load claims via TableImportAPI.integrityCheckStagingTableContentsAndLoadSourceTables())</li>
   * <li>Extract the LoadCommand's PublicID from the returned TableImportResult object</li></li>
   * <li>Call ClaimAPI.startClaimValidation(loadCommandPublicID)</li>
   * <li>Poll MaintenanceToolsAPI.batchProcessStatusByID() using the returned processID until the batch process completes.</li>
   * <li>Configure workers using MaintenanceToolsAPI.setWorkQueueConfig("ClaimValidation", new WorkQueueConfig()) </li>
   * <li>Notify workers using MaintenanceToolsAPI.notifyQueueWorkers("ClaimValidation")</li>
   * </ol>
   * @param loadCommandPublicID  A String value identifying the conversion batch that imported these claims.
   * The loadCommandPublicID value is available through the TableImportResult object returned from a table
   * import operation. (e.g. TableImportAPI.integrityCheckStagingTableContentsAndLoadSourceTables())
   * @return the ID of the batch process
   */
  function startClaimValidation(loadCommandPublicID : String) : ProcessID {
    return Delegate.startClaimValidation(loadCommandPublicID);
  }

  /**
   * Answer whether a claim has been flagged.
   *
   * @param claimID The ID of the claim to check
   * @return <code>true</code> if the Claim.Flagged field equals TC_IS_FLAGGED, and <code>false</code> otherwise.
   */
  @Throws(BadIdentifierException, "If the ClaimIdentifier doesn't correspond to an existing claim.")
  function isFlagged(claimID : String) : boolean {
    var claim = fetchByPublicID<Claim>(claimID)
    return claim.Flagged == FlaggedType.TC_ISFLAGGED
  }


  /**
   * Processes the given claim through the assignment engine, and produces an AssignmentResponse instance
   * that indicates the assignment found for this item.  Does NOT commit the item to the database.
   *
   * @param claimID The PublicID of the claim to run through the assignment engine
   * @return AssignmentResponse instance indicating the assignment found for this item
   */
  function previewAssignment(claimID : String) : AssignmentResponse {
    var claim = fetchByPublicID<Claim>(claimID)
    return Delegate.previewAssignment(claim)
  }


  /**
   * Closes the claim specified by the identifier.  Uses the same logic that governs the Close Claim screen.
   *
   * @param claimID The public ID of the claim to close
   * @param outcomeType   Type of outcome
   * @param reason        Optional string giving the reason for closing the claim
   */
  @Throws(BadIdentifierException, " If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function closeClaim(claimID : String, outcomeType : ClaimClosedOutcomeType, reason : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      claim.close(outcomeType, reason)
    })
  }


  /**
   * Reopens the claim specified by the identifier.  Uses the same logic that governs the Reopen Claim screen
   *
   * @param claimID The PublicID that specifies the claim to reopen
   * @param reasonType    typekey giving reason for reopen
   * @param reason        Optional string giving the reason for reopening the claim
   */
  @Throws(BadIdentifierException, "If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function reopenClaim(claimID : String, reasonType : ClaimReopenedReason, reason : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      claim.reopen(reasonType, reason)
    })
  }


  /**
   * Returns the code of the claim's state (a typekey from the ClaimState typelist) as a string.  If for some reason
   * the claim's state is not defined, returns null.
   *
   * @param claimID The PublicID that specifies the claim to get the state from
   * @return String representing the given claim's state
   */
  @Throws(BadIdentifierException, "If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  function getClaimState(claimID : String) : ClaimState {
    return fetchByPublicID<Claim>(claimID).State
  }

  /**
   * Cause the policy on the claim to be refreshed with the latest information from the Policy store
   *
   * @param claimID The PublicID of the claim whose policy will be refreshed
   */
  @Throws(BadIdentifierException, "If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function refreshPolicy(claimID : String) {
    Transaction.runWithNewBundle(\ bundle ->  {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      claim.refreshPolicy()
    })
  }

  /**
   * Cause the policy on the Claim to be set to a new policy instance found using the given information.
   * If the specified policy is already set on the claim, then the policy information will be refreshed.
   * NOTE: Changing the policy can have many side effects, especially if the old and new policies do not contain
   * the same set of sub-objects (such as vehicles). This method should be used with caution.
   *
   * @param claimID The PublicID that specifies the claim whose policy will be set
   * @param policySummaryDTO A dto providing enough information to retrieve the Policy from the adapter. It
   * need not be as fully populated as it would be were it to be displayed in the UI.
   */
  @Throws(BadIdentifierException, "If the PublicID doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function setPolicy(claimID : String, policySummaryDTO : PolicySummaryDTO) {
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      var policySummary = policySummaryDTO.writeToNewEntityIn(bundle)
      Delegate.setPolicy(claim, policySummary)
    })
  }


  /**
   * Finds the PublicID of a claim by the claimNumber
   * @param claimNumber
   * @return claim's publicID, else null if claim not found
   */
  function findPublicIDByClaimNumber(claimNumber : String) : String {
    var claim = Claim.finder.findClaimByClaimNumber(claimNumber)
    return claim?.PublicID
  }


  /**
   * Give a user permission on a claim
   *
   * @param claimID The PublicID of the claim
   * @param userID  The PublicID of the user
   * @param types   The permissions to give to that user on that claim
   */
  @Throws(BadIdentifierException, "If the user doesn't exist")
  @WsiCheckDuplicateExternalTransaction
  function giveUserPermissionsOnClaim(claimID : String, userID : String, accessTypes : ClaimAccessType[]) {
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      var user  = fetchByPublicID<User>(userID, bundle)
      Delegate.giveUserPermissionsOnClaim(claim, user, accessTypes)
    })
  }


  /**
   * Schedules the claims with the given claim numbers for archive. The claims are looked up and,
   * providing they are closed, are immediately scheduled for archive by creating a high priority
   * work item that will be picked up by the archiving work queue. Note that the archiving work
   * queue is processed asynchronously so it is unlikely that any of the claims will actually be
   * archived by the time this call returns.
   * <p>
   * There is a race condition that can affect this call. If a claim to be archived references a
   * newly created admin object, such as a new user, there is a chance the archiving of the claim
   * will fail because the new admin object has not yet been copied to the archiving database. This
   * is a rare edge case as most claims to be archived are old, closed, claims which have not been
   * altered for a long time. The chances of hitting this race condition can be minimized by
   * explicitly running the archive batch process before calling this method, though this is
   * expensive and is not recommended as a general practice.
   * <p>
   * Note that this method does not check for duplicate transactions because the internal
   * implementation performs multiple commits.
   * <p>
   * Throws SOAPException if claims cannot be scheduled for archive because they cannot be found,
   * are closed or because an archive work item could not be created. If any of the claims is not
   * found or is not closed then the call fails before attempting to archive any other claims.
   * However if all the claims are present and closed it is possible, though very unlikely, for
   * some work items to be created successfully and others to fail.
   *
   * @param claimNumbers Claim numbers of the claims to schedule for archive
   */
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  // Cannot enforce WsiCheckDuplicateExternalTransaction as the internal scheduling method issues multiple commits
  function scheduleForArchive(claimNumbers : String[]) {
    Delegate.scheduleForArchive(claimNumbers)
  }


  /**
   * Schedules the claims with the given PublicIDs for archive. The claims are looked up and,
   * providing they are closed, are immediately scheduled for archive by creating a high priority
   * work item that will be picked up by the archiving work queue. Note that the archiving work
   * queue is processed asynchronously so it is unlikely that any of the claims will actually be
   * archived by the time this call returns.
   * <p>
   * There is a race condition that can affect this call. If a claim to be archived references a
   * newly created admin object, such as a new user, there is a chance the archiving of the claim
   * will fail because the new admin object has not yet been copied to the archiving database. This
   * is a rare edge case as most claims to be archived are old, closed, claims which have not been
   * altered for a long time. The chances of hitting this race condition can be minimized by
   * explicitly running the archive batch process before calling this method, though this is
   * expensive and is not recommended as a general practice.
   * <p>
   * Note that this method does not check for duplicate transactions because the internal
   * implementation performs multiple commits.
   * <p>
   * Throws SOAPException if claims cannot be scheduled for archive because they cannot be found,
   * are closed or because an archive work item could not be created. If any of the claims is not
   * found or is not closed then the call fails before attempting to archive any other claims.
   * However if all the claims are present and closed it is possible, though very unlikely, for
   * some work items to be created successfully and others to fail.
   *
   * @param publicIDs Public IDs of the claims to schedule for archive
   */
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  // Cannot enforce WsiCheckDuplicateExternalTransaction as the internal scheduling method issues multiple commits
  function scheduleForArchiveByPublicID(publicIDs : String[]) {
    Delegate.scheduleForArchiveByPublicId(publicIDs)
  }


  /**
   * Restore claims from the archive database. Note that this method does not check for duplicate transactions because
   * the internal implementation performs multiple commits.
   * @param claimIDs Public IDs of the claim to be restored
   * @param comment comment for restoring the claims
   * @return The public IDs of the claims that were restored
   */
  // Cannot enforce WsiCheckDuplicateExternalTransaction as the internal scheduling method issues multiple commits
  function restoreClaims(claimIDs : String[], comment : String) : String[] {
    return Delegate.restoreClaim(claimIDs, comment)
  }


  /**
   * Retrieves a claim info given the claim public ID
   *
   * @param claimID The ID of the claim that the claim info is for
   * @return The ClaimInfoDTO representing the claim info
   */
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(BadIdentifierException, "If the claim with such public ID does not exist.")
  function getClaimInfo(claimID : String) : ClaimInfoDTO {
    var claim = fetchByPublicID<Claim>(claimID)
    return ClaimInfoDTO.valueOf(claim.ClaimInfo)
  }


  /* ==========
  * CONTACTS
  * ==========
  */

  /**
   * Creates the contact described by the dto.
   */
  @WsiCheckDuplicateExternalTransaction
  @Throws(IllegalArgumentException, "If no DTO was supplied")
  public function createContact(dto: ContactDTO): String {
    ArgCheck.nonNull(dto, "contactDTO")
    ArgCheck.nonNull(dto.Subtype, "contactDTO.Subtype")

    var contact: Contact
    Transaction.runWithNewBundle(\bundle -> {
      contact = dto.writeToNewEntityIn(bundle)
    })
    return contact.PublicID
  }

  /**
   * Creates the Contact described by the dto, and adds a ClaimContact with the supplied Role to the Claim.
   *
   * @param claimPublicID The PublicID of the Claim that will own the role
   * @param contactDTO A DTO that defines the new Contact
   * @param role The role that the new ClaimContact is to play on the Claim
   * @return The PublicID of the new ClaimContact
   *
   */
  @WsiCheckDuplicateExternalTransaction
  @Throws(BadIdentifierException, "If the claimPublicID does not correspond to an existing claim.")
  function createClaimContact(claimPublicID: String, contactDTO: ContactDTO, role: ContactRole): String {
    var claim = fetchByPublicID<Claim>(claimPublicID)

    var claimContactRole: ClaimContactRole
    Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claimContactRole = assembleFromDTOs({contactDTO}.toTypedArray(), claim, role).single()
    })
    return claimContactRole.ClaimContact.PublicID
  }
  /* ==========
  * DOCUMENTS
  * ==========
  */

  /**
   * Creates a new document with values defined the DTO
   *
   * @param dto       The details of the document to be created
   * @return The PublicID of the newly created document.
   */
  @Throws(BadIdentifierException, "If the dto's ClaimID does not exist")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(IllegalArgumentException, "If no DTO was supplied")
  @WsiCheckDuplicateExternalTransaction
  public function createDocument(dto : DocumentDTO) : String {
    ArgCheck.nonNull(dto, "documentDTO")
    ArgCheck.nonBlank(dto.ClaimPublicID, "documentDTO.ClaimID")

    var doc : Document
    Transaction.runWithNewBundle(\ bundle -> { doc = dto.writeToNewEntityIn(bundle) })
    return doc.PublicID
  }


  /* ==========
   * EXPOSURES
   * ==========
   */

  /**
   * Creates a new Exposure as described by the DTO, running through the normal setup process.
   * <p>
   * <b>WARNING:</b> Do not add new exposures to ClaimCenter via web service APIs while the financials
   * calculations are running.
   * <p>
   *
   * @param dto      The ExposureDTO to associate with the claim.
   * @return The PublicID of the newly created exposure.
   */
  @Throws(BadIdentifierException, "If the ClaimIdentifier doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(EntityStateException, "If the claim has been marked closed or closed pending approval.")
  @WsiCheckDuplicateExternalTransaction
  function createExposure(dto : ExposureDTO) : String {
    ArgCheck.nonNull (dto, "exposureDTO")
    ArgCheck.nonBlank(dto.ClaimPublicID, "exposureDTO.ClaimID")

    return createExposures(dto.ClaimPublicID, {dto}).first()
  }

  /**
   * Creates Exposures as described by the DTOs, running through the normal setup process.
   * <p>
   * <b>WARNING:</b> Do not add new exposures to ClaimCenter via web service APIs while the financials calculations are running.
   * <p>
   *
   * @param claimID       The PublicID of the Claim to which to add these exposures
   * @param exposures     An array of ExposureDTO describing the new exposures
   * @return The PublicIDs of the newly created exposures.
   */
  @Throws(BadIdentifierException, "If the ClaimIdentifier doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(EntityStateException, "If the claim has been marked closed or closed pending approval.")
  @WsiCheckDuplicateExternalTransaction
  function createExposures(claimID : String, exposures : ExposureDTO[]) : String[] {
    ArgCheck.nonNull(claimID, "claimID")
    ArgCheck.nonNull(exposures, "exposures")

    var newExposures : Exposure[] = {}

    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      newExposures = assembleFromDTOs(exposures, claim)
    })
    return newExposures*.PublicID
  }

  /**
   * Retrieves a DTO for the Exposure whose PublicID is specified
   *
   * @param exposureID The PublicID of the exposure to retrieve
   * @return The ExposureDTO
   */
  @Throws(BadIdentifierException, "If the exposureID does not exist.")
  @Throws(PermissionException, "If the user does not have VIEW_CLAIM permission.")
  function getDtoForExposure(exposureID : String) : ExposureDTO {
    return ExposureDTO.valueOf(fetchByPublicID(exposureID))
  }

  /**
   * Returns the code of the exposure's state (a typekey from the ExposureState typelist) as a string.  If for some
   * reason the exposure's state is not defined, returns a null string.
   *
   * @param exposureID The String that specifies the exposure to get the state from
   * @return String representing the given exposure's state
   */
  @Throws(BadIdentifierException, "If there is no Exposure whose PublicID == exposureID")
  @Throws(IllegalArgumentException, "If exposureID is null")
  public function getExposureState(exposureID : String) : ExposureState {
    return fetchByPublicID<Exposure>(exposureID).State
  }

  /**
   * Reopens the exposure specified by the identifier.  Uses the same logic that governs the Reopen Exposure screen
   *
   * @param exposureID The String that specifies the exposure to reopen
   * @param reasonType ExposureReopenedReason typekey, or null
   * @param reason     Optional string giving the reason for reopening the exposure
   */
  @Throws(BadIdentifierException, "If there is no Exposure whose PublicID == exposureID")
  @Throws(IllegalArgumentException, "If the exposureID is null")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  public function reopenExposure(exposureID : String, reasonType : ExposureReopenedReason, reason : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var exp = fetchByPublicID<Exposure>(exposureID, bundle)
      if (exp.State != ExposureState.TC_OPEN) {
        exp.reopen(reasonType, reason)
      }
    })
  }

  /**
       * Closes the exposure specified by the identifier.  Uses the same logic that governs the Close Exposure screen.
       *
       * @param exposureID     The String that specifies the exposure to close
       * @param outcome        The outcome type key
       * @param reason         Optional string giving the reason for closing the exposure
   */
  @Throws(BadIdentifierException, "If there is no Exposure whose PublicID == exposureID")
  @Throws(IllegalArgumentException, "If the exposureID is null")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  public function closeExposure(exposureID : String, outcome : ExposureClosedOutcomeType, reason : String) {
    Transaction.runWithNewBundle(\ bundle -> {
      var exp = fetchByPublicID<Exposure>(exposureID, bundle)
      exp.close(outcome, reason)
    })
  }


  /* ==========
   * HISTORY
   * ==========
   */

  /**
   * Adds a custom history event and a blank description to a claim with the given CustomHistoryType
   *
   * @param claimID The ID of the claim to modify.
   * @param historyType   The type of the history event
   */
  @Throws(BadIdentifierException, "If the ClaimIdentifier doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function createCustomHistory(claimID : String, historyType : CustomHistoryType) : String {
    return createCustomHistoryWithDesc(claimID, historyType, null)
  }

  /**
   * Adds a custom history event to the a claim, overriding the value of Description present
   * in the custom history type list.
   *
   * @param claimID The ID of the claim to modify.
   * @param historyType   The type of the history event
   * @param description   A String that will override the value that exists in the typekey specified
   *                      by historyType.
   */
  @Throws(BadIdentifierException, "If the ClaimIdentifier doesn't correspond to an existing claim.")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @WsiCheckDuplicateExternalTransaction
  function createCustomHistoryWithDesc(claimID : String, historyType : CustomHistoryType, description : String) : String {
    var history : History
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = fetchByPublicID<Claim>(claimID, bundle)
      history   = claim.createCustomHistoryEvent(historyType, description)
    })

    return history.PublicID
  }


  /* ==========
   * NOTES
   * ==========
   */

  /**
   * Creates a new note with values defined by the DTO
   *
   * @param dto   The field values for the new note.
   * @return The PublicID of the newly created note.
   */
  @Throws(BadIdentifierException, "If the dto's ClaimID does not exist")
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(IllegalArgumentException, "If no DTO was supplied, or its ClaimID field is null")
  @WsiCheckDuplicateExternalTransaction
  public function createNote(dto : NoteDTO) : String {
    ArgCheck.nonNull(dto, "noteDTO")
    ArgCheck.nonBlank(dto.ClaimPublicID, "noteDTO.ClaimID")

    var note : Note
    Transaction.runWithNewBundle(\ bundle -> {
      var claim = bundle.add(dto.Claim)
      note = assembleFromDTOs({dto}, claim).first()
    })
    return note.PublicID
  }


  /* ==========
   * VEHICLES
   * ==========
   */

  /**
   * Creates a new vehicle with values defined by the DTO
   *
   * @param dto   The field values for the new vehicle.
   * @return The PublicID of the newly created vehicle.
   */
  @Throws(PermissionException, "If the caller does not have the appropriate permissions.")
  @Throws(IllegalArgumentException, "If no DTO was supplied")
  @WsiCheckDuplicateExternalTransaction
  public function createVehicle(dto : VehicleDTO) : String {
    ArgCheck.nonNull(dto, "vehicleDTO")

    var vehicle : Vehicle
    Transaction.runWithNewBundle(\ bundle -> {
      vehicle = assembleFromDTO(dto, bundle)
    })
    return vehicle.PublicID
  }


  //----------------------------------------------------------------- private helper methods

  private property get Delegate() : gw.api.webservice.cc.claim.ClaimAPIImpl {
    return new gw.api.webservice.cc.claim.ClaimAPIImpl()
  }

}
