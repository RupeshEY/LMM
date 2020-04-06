package gw.processes

uses gw.api.database.Query
uses gw.api.system.CCConfigParameters
uses gw.api.system.CCLoggerCategory
uses gw.assignment.workload.proxy.WorkloadProxyFactory
uses gw.pl.persistence.core.Bundle

uses java.lang.StringBuffer
uses java.lang.Throwable
uses java.util.Collections
uses java.util.Iterator

/**
 * <p>Work queue for asynchronous updating of user weighted workload.  In order to maximize performance weights are calculated only
 * when significant modifications affect workloads, after which these calculated values are stored for quick access.  The GroupUser
 * keeps track of weight as well as all workload-aware assignables, such as Claims and Exposures.</p>
 *
 * <p>In the event a major change takes places that globally affects all workloads, such as changes to the Workload Classifications
 * or if the workloads fall out of sync for some reason, running this work queue will incrementally recalculate and resynchronize
 * the workloads of all Users and all eligible assignables assigned to those Users.</p>
 *
 */
@Export
public class UserWorkloadUpdateWorkQueue extends WorkQueueBase<GroupUser, StandardWorkItem> {

  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructor
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  public construct() {
    super(BatchProcessType.TC_USERWORKLOADUPDATE, StandardWorkItem, GroupUser)
  }


  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  public override function processWorkItem(workItem : StandardWorkItem) {
    var target : GroupUser

    try {
      gw.transaction.Transaction.runWithNewBundle(\ bundle ->{
              workItem = bundle.add(workItem)
              target = extractTarget(workItem)

              if (CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.DebugEnabled) {
                CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("Updating user " + getUserLogOutput(target))
              }

              // synchronize all open workload-aware assignables assigned to current user
              synchronizeAssignables(target)

              // synchronize the workload of the user
              synchronizeWorkload(target)
              if (CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.DebugEnabled) {
                CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("User " + getUserLogOutput(target) + " update completed")
              }
      })
    }

    catch(th : Throwable) {
      // log failure
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.error("Failed to update User " + getUserLogOutput(target), th)
      // rethrow so this work time will be re-queued
      throw th
    }
  }

  public override function findTargets() : Iterator<GroupUser> {

    // if weighted workload is deactivated in configuration, log a message
    // and immediately quit
    if (not CCConfigParameters.WeightedAssignmentEnabled.Value) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.warn("Weighted Workload functionality has been disabled in configuration. No users will be processed.")
      return Collections.emptyList<GroupUser>().iterator()
    }

    // find all group users where base user...
    var groupUsers = Query.make(GroupUser)
        .join(GroupUser#User)
            // base user has "at-work" vacation status
            .compare(User#VacationStatus, Equals, VacationStatusType.TC_ATWORK)
            // bas user must be "active"
            .join(User#Credential)
                    .compare(Credential#Active, Equals, true)
        .select()

    return groupUsers.iterator()
  }


  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  private function getUserLogOutput(gu : GroupUser) : String {
    var result = new StringBuffer("'")
            .append(gu.Group.DisplayName)
            .append(" - ")
            .append(gu.User.DisplayName)
            .append(" (")
            .append(gu.User.Credential.UserName)
            .append(")")
            .append("'")

    return result.toString()
  }

  private function synchronizeAssignables(gu : GroupUser) {
    var bundle = gu.Bundle
    for (proxy in WorkloadProxyFactory.INSTANCE.Proxies) {
        var query = proxy.findAssignables(gu, null)
        for (assignable in query) {
          assignable = bundle.add(assignable as KeyableBean)
          var weight = proxy.syncWeight(assignable)
          if (CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.TraceEnabled) {
            CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.trace("Updating '" + assignable.DisplayName + "' to workload = " + weight
                    + " assigned to user " + getUserLogOutput(gu))
          }
        }
    }
  }

  private function synchronizeWorkload(gu : GroupUser) {
    gu.syncWorkload()
  }

  override function createWorkItem(target: GroupUser, safeBundle: Bundle): StandardWorkItem {
    var result = super.createWorkItem(target, safeBundle)
    //Make sure this field is initialized during the batch process, so that we don't end up trying to do so during
    //the work queue, which would end up causing updates on Group entities, causing contention and making parallelization impossible.
    target = safeBundle.Bundle.add(target)
    if (target.GroupUserWorkload == null) {
      target.GroupUserWorkload = new GroupUserWorkload(safeBundle.Bundle)
    }
    return result
  }
}
