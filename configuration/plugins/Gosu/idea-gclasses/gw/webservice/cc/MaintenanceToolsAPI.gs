package gw.webservice.cc

uses gw.api.tools.ProcessID
uses gw.api.webservice.exception.SOAPException
uses java.lang.IllegalArgumentException
uses gw.api.webservice.maintenanceTools.WorkQueueConfig
uses gw.api.webservice.cc.maintenanceTools.CCMaintenanceToolsImpl
uses gw.api.webservice.maintenanceTools.WQueueStatus
uses gw.xml.ws.annotation.WsiWebService
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.WsiAuthenticationException
uses gw.xml.ws.annotation.WsiGenInToolkit
uses java.util.Date
uses gw.api.webservice.maintenanceTools.ProcessStatus
uses gw.xml.ws.annotation.WsiPermissions
uses gw.xml.ws.WebServiceException
uses gw.entity.IEntityType
uses gw.api.claimparties.ClaimContactUtil

/**
 * An API used for managing the application. This is distinct from
 * SystemToolsAPI which is concerned with managing the application platform.
 *
 */
@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI")
@WsiAvailability(MAINTENANCE)
@WsiGenInToolkit
@Export
class MaintenanceToolsAPI {

  /**
   * Note: All methods are overridden to ensure that the javadoc and exceptions for this web service are properly generated.
   */

  /**
   * Return the set of valid batch process names
   *
   * @return String[]
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  public function getValidBatchProcessNames() : String[] {
    return Delegate.ValidBatchProcessNames?.toTypedArray();
  }

   /**
   * Return whether a given batch process name is valid
   *
   * @return boolean
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  function isBatchProcessNameValid(processName : String) : boolean {
    return Delegate.isBatchProcessNameValid(processName);
  }

  /**
   * Starts the given batch process.  If the process is already running on the server,
   * an exception will be thrown.
   *
   * @param processName the name of the batch process to start
   * @return the ProcessID of the process that was started
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no process exists with the given process name.")
  function startBatchProcess(processName : String) : ProcessID {
    return Delegate.startBatchProcess( processName )
  }

  /**
   * Starts the given batch process with the given String arguments.  If the process is already running on the server,
   * an exception will be thrown.
   *
   * @param processName the name of the batch process to start
   * @param arguments the batch process arguments
   * @return the ProcessID of the process that was started
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no process exists with the given process name.")
  function startBatchProcessWithArguments(processName : String, arguments : String[]) : ProcessID {
    return getDelegate().startBatchProcess( processName, arguments )
  }

  /**
   * Return the date when the current statistics were calculated.
   *
   * @return date of the when the current statistics were calculated
   */
  @Throws(SOAPException, "if there is an exception thrown during the processing")
  public function whenStatsCalculated() : Date {
    return Delegate.whenStatsCalculated().Time
  }
  
  /**
   * Rebuilds the AggregateLimitRpts and ClaimAggregateLimitRpts associated for the AggregateLimits
   * which are defined for the same policy period as the claims passed in.
   * <p>
   * These tables are a denormalization of the LimitUsed values for aggregate limits and this method
   * will rebuild them from the transactions associated with the claims.  A separate batch job is available
   * which can rebuild all the aggregate limits in the system.
   * <p>
   * Throws SOAPException if a problem occurs while creating the WorkItems necessary for the work queue
   * to run the job.
   * <p>
   * @param claimNumbers Claim numbers of the claims for which the aggregate limits need to be rebuilt
   * @return An error or success String
   */
  @Throws(SOAPException, "If aggregate limits cannot be rebuilt")
  public function scheduleAggLimitRebuildOfClaims(claimNumbers : String[]) : String {
    return Delegate.scheduleAggLimitRebuildOfClaims(claimNumbers)
  }

  /**
   * Rebuilds the AggregateLimitRpts and ClaimAggregateLimitRpts associated for the AggregateLimits
   * which are defined for the same policy period as the policies passed in.
   * <p>
   * These tables are a denormalization of the LimitUsed values for aggregate limits and this method
   * will rebuild them from the transactions associated with the claims.  A separate batch job is available
   * which can rebuild all the aggregate limits in the system.
   * <p>
   * Throws SOAPException if a problem occurs while creating the WorkItems necessary for the work queue
   * to run the job.
   * <p>
   * @param policyNumbers of the policies for which the aggregate limits need to be rebuilt
   * @return An error or success String
   */
  @Throws(SOAPException, "If aggregate limits cannot be rebuilt")
  public function scheduleAggLimitRebuildOfPolicies(policyNumbers : String[]) : String {
    return Delegate.scheduleAggLimitRebuildOfPolicies(policyNumbers)
  }

  /**
   * Marks invalid and then rebuilds the AggregateLimitRpts and ClaimAggregateLimitRpts
   * associated for all AggregateLimits in the system.
   * <p>
   * These tables are a denormalization of the LimitUsed values for aggregate limits and this method
   * will rebuild them from the transactions associated with the claims.
   * <p>
   * Throws SOAPException if a problem occurs while creating the WorkItems necessary for the work queue
   * to run the job.
   * @return An error or success String
   */
  @Throws(SOAPException, "If aggregate limits cannot be marked invalid or the work items could not be created")
  public function scheduleAggLimitRebuildAllLimits() : String {
    return Delegate.scheduleAggLimitRebuildAllLimits()
  }

  /**
   * Rebuilds the AggregateLimitRpts and ClaimAggregateLimitRpts
   * associated with invalid AggregateLimits in the system.
   * <p>
   * These tables are a denormalization of the LimitUsed values for aggregate limits and this method
   * will rebuild them from the transactions associated with the claims.
   * <p>
   * Throws SOAPException if a problem occurs while creating the WorkItems necessary for the work queue
   * to run the job.
   * @return An error or success String
   */
  @Throws(SOAPException, "If the work items could not be created")
  public function scheduleAggLimitRebuildInvalidLimits() : String {
    return Delegate.scheduleAggLimitRebuildInvalidLimits()
  }


  
  /**
   * Marks the purge ready flag on claim for the claim purging batch process
   * @param claimNumbers The array of the claim numbers to be marked
   * @param purgeFromAggregateLimit if true then purge each claim even if it is part of an aggregate limit.
   *   If false, claims in an aggregate limit will not be purged and an error message will be returned
   * @return The results indicates if the claims were successuflly marked
   */
  @Throws(SOAPException, "Upon any error")
  @WsiPermissions({SystemPermissionType.TC_PURGE, SystemPermissionType.TC_SOAPADMIN})
  public function markPurgeReady(claimNumbers : String[], purgeFromAggregateLimit : boolean) : String {
    return Delegate.markPurgeReady(claimNumbers, purgeFromAggregateLimit)
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
   * Throws SOAPException if claims cannot be scheduled for archive because they cannot be found,
   * are closed or because an archive work item could not be created. If any of the claims is not
   * found or is not closed then the call fails before attempting to archive any other claims.
   * However if all the claims are present and closed it is possible, though very unlikely, for
   * some work items to be created successfully and others to fail.
   * <p>
   * This call is, internally, identical to ClaimAPI.scheduleForArchive and is only included here
   * for convenience, so it can be called by the command line maintenance tools.
   *
   * @param claimNumbers Claim numbers of the claims to schedule for archive
   * @return A string containing the numbers of the claims that were scheduled for archive
   */
  @Throws(SOAPException, "If claims cannot be found or cannot be scheduled for archive")  
  public function scheduleForArchive(claimNumbers : String[]) : String {
    return Delegate.scheduleForArchive(claimNumbers)
  }

  /**
   * Restore the claim
   * @param claimNumber The claim numbers used to look up the claim
   * @return The result indicates the claims processed and skipped
   */
  @Throws(SOAPException, "Upon any error")
  public function restore(claimNumbers : String[], comment : String) : String {
    return Delegate.restore(claimNumbers, comment)
  }

  //----------------------------------------------------------------- base methods from MaintenanceToolsAPI


  /**
   * Note: All methods are overriden to ensure that the javadoc and execptions for this web service are properly generated.
   */

  /**
   * Requests termination of the given batch process, if it's currently running.
   *
   * This method does not wait for the batch process to actually terminate
   *
   * @param processName the name of the batch process for which to request termination
   * @return true if the request was successful, false if the process could not be terminated
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  function requestTerminationOfBatchProcessByName(processName : String) : boolean {
    return Delegate.requestTerminationOfBatchProcess( processName )
  }

  /**
   * Requests termination of the given batch process, if it's currently running. Note that it's possible that
   * this particular invocation could have finished and another invocation of the same process
   * begun, in which case this won't request the termination of the current invocation.
   *
   * This method does not wait for the batch process to actually terminate
   *
   * @param pid the process ID of the process for which to request termination
   * @return true if the request was successful, false if the process could not be terminated
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "Invalid processID")
  function requestTerminationOfBatchProcessByID(pid : ProcessID) : boolean {
    if (pid == null || pid.Pid <= 0) {
      throw new IllegalArgumentException("Invalid processID " + pid)
    }
    return Delegate.requestTerminationOfBatchProcess( pid )
  }

  /**
   * Gets the status of the given batch process, indicating whether or not the process is running and,
   * if so, its current progress.
   *
   * @param processName the name of the process to retrieve the status of
   * @return the status of that particular process
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no process exists with the given process name.")
  function batchProcessStatusByName(processName : String) : ProcessStatus {
    return Delegate.batchProcessStatusByName( processName )
  }

  /**
   * Gets the status of a particular batch process invocation.  If that invocation is still running,
   * the status will indicate as much, and only the startDate and opsCompleted fields will be filled in.
   * Otherwise the returned object will contain information about
   * the completed run (see ProcessStatus for information about all the fields returned).
   *
   * @param pid the process ID to retrieve the status of
   * @return the status of that particular process invocation
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no process exists with the given process id or invalid ProcessID.")
  function batchProcessStatusByID(pid : ProcessID) : ProcessStatus {
    if (pid == null || pid.Pid <= 0) {
      throw new IllegalArgumentException("Invalid processID " + pid)
    }
    return Delegate.batchProcessStatusByID( pid )
  }

  /**
   * Get the current configuration of distributed workers for the
   * specified work queue.
   * @param queueName Name of the queue to query
   * @return A WorkQueueConfig instance containing the current settings
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function getWorkQueueConfig(queueName : String) : WorkQueueConfig {
    return Delegate.getWorkQueueConfig( queueName )
  }

  /**
   * Sets the configuration for distributed workers for the
   * specified work queue.  Any currently running worker
   * instances will be stopped after the current workitem in process
   * is completed.  New worker instances as specified by the passed
   * in config will be created and started.  Note that the
   * changes made here are temporary; if the server is restarted,
   * the initial values from config.xml will be used when creating
   * and starting workers.
   * @param queueName Name of the queue to modify
   * @param config The configuration to establish.
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function setWorkQueueConfig(queueName : String, config : WorkQueueConfig){
    Delegate.setWorkQueueConfig( queueName, config )
  }

  /**
   * Returns the list of work queue names for this product.
   * These names may be used in {@link #getWorkQueueConfig}
   * and {@link #setWorkQueueConfig}.
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  function getWorkQueueNames() : String[]{
    return Delegate.getWorkQueueNames()
  }

  /**
   * Wakes up all workers for the specified queue across the cluster.
   * Workers will check for workitems and will continue
   * processing any found until the workitem table for the
   * queue is empty.
   * @param queueName Name of the queue to notify workers
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function notifyQueueWorkers(queueName : String){
    Delegate.notifyQueueWorkers( queueName )
  }

  /**
   * This will stop the specified ied work queue.
   * @param queueName Name of the queue
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function stopWorkQueueWorkers(queueName : String) {
    Delegate.stopWorkQueueWorkers(queueName)
  }

  /**
   * This will start the workqueue workers
   * @param queueName Name of the queue
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function startWorkQueueWorkers(queueName : String) {
    Delegate.startWorkQueueWorkers(queueName)
  }

  /**
   * Retrieves the status of active executors for that particular queue. Each executor contains information
   * about last 25 workers ran by each executor.
   *
   * @param queueName name of the queue
   * @return The status of the queue
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function getWQueueStatus(queueName : String) : WQueueStatus {
    return Delegate.getWQueueStatus( queueName )
  }

  /**
   * Retrieves the number of active work items for a queue
   *
   * @param queueName name of the queue
   * @return The status of the queue
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function getNumActiveWorkItems(queueName : String) : int {
    return Delegate.getNumActiveWorkItems( queueName )
  }

  /**
   * Wait on the active work items for a queue
   *
   * @param queueName name of the queue
   * @return true if the queue is now empty
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no work queue exists with the given name.")
  function waitOnActiveWorkItems(queueName : String) : boolean {
    return Delegate.waitOnActiveWorkItems( queueName, 60, 200)
  }

  /**
   * whether the plugin is started.
   *
   * @param pluginName the name of the plugin to start
   */
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(IllegalArgumentException, "If no plugin exists with the given name.")
  @WsiPermissions({SystemPermissionType.TC_TOOLSPLUGINVIEW})
  function isPluginStarted(pluginName : String) : boolean {
    return Delegate.isPluginStarted(pluginName)
  }

  /**
   * Starts the given startable plugin.  Blocks for up to 120 seconds
   * waiting for confirmation.
   *
   * @param pluginName the name of the plugin to start
   */
  @Throws(IllegalArgumentException,"if invalid plugin name")
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @WsiPermissions({SystemPermissionType.TC_TOOLSPLUGINEDIT})
  function startPlugin(pluginName : String) {
    Delegate.startPlugin(pluginName)
  }

  /**
   * Starts the given startable plugin.
   *
   * Blocks for up to {@code timeout} milliseconds to confirm plugin reached
   * {@link gw.api.startable.StartablePluginState.Started} state
   *
   * @param pluginName the name of the plugin to start
   * @param timeout number of milliseconds to wait for a confirmed start
   *                or -1 to skip confirmation and return immediately
   */
  @Throws(IllegalArgumentException,"if invalid plugin name")
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @WsiPermissions({SystemPermissionType.TC_TOOLSPLUGINEDIT})
  function startPluginWithTimeout(pluginName : String, timeout : long) {
    Delegate.startPlugin(pluginName, timeout)
  }

  /**
   * Stop the given startable plugin.  Blocks for up to 120 seconds
   * waiting for confirmation.
   *
   * @param pluginName the name of the plugin
   */
  @Throws(IllegalArgumentException,"if invalid plugin name")
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @WsiPermissions({SystemPermissionType.TC_TOOLSPLUGINEDIT})
  function stopPlugin(pluginName : String) {
    Delegate.stopPlugin(pluginName)
  }

  /**
   * Stop the given startable plugin, if it's started.
   *
   * Blocks for up to {@code timeout} milliseconds to confirm plugin reached
   * {@link gw.api.startable.StartablePluginState.Stopped} state
   *
   * @param pluginName the name of the plugin
   * @param timeout number of milliseconds to wait for a confirmed stop
   *                or -1 to skip confirmation and return immediately
   */
  @Throws(IllegalArgumentException,"if invalid plugin name")
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @WsiPermissions({SystemPermissionType.TC_TOOLSPLUGINEDIT})
  function stopPluginWithTimeout(pluginName : String, timeout : long) {
    Delegate.stopPlugin(pluginName, timeout)
  }

  @Throws(IllegalArgumentException,"if contact not found or target type is invalid")
  @Throws(WsiAuthenticationException,"On permission or authentication errors")
  @Throws(WebServiceException, "if not currently in maintenance mode")
  function changeSubtype(publicID : String, targetType : String) {
    var query = gw.api.database.Query.make(Contact).compare("PublicID", Equals, publicID).select().AtMostOneRow

    var origType : IEntityType;
    var displayName : String
    if (query != null) {
      origType = query.IntrinsicType
      displayName = query.DisplayName
    }

    Delegate.changeSubtype(publicID, targetType)

    var claimContact = gw.api.database.Query.make(ClaimContact).join("Contact").compare("PublicID", Equals, publicID).select().AtMostOneRow
    if (claimContact != null) {
      ClaimContactUtil.updateNameDenormOnClaimContacts(claimContact.PublicID, origType as String, targetType, displayName)
    }
  }

  //----------------------------------------------------------------- private helper

  private property get Delegate() : CCMaintenanceToolsImpl {
    return new CCMaintenanceToolsImpl()
  }
}

