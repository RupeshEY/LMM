package gw.entity

uses gw.assignment.workload.proxy.WorkloadProxyFactory

/**
 * Extends GroupUser functionality for Weighted Workload Assignment.
 */
@Export
enhancement GWGroupUserWorkloadEnhancement: entity.GroupUser {

  /**
   * Tests if a user-group relationship for this User has any assigned workload-aware assignables.
   */
  public function hasWorkloadAssignables() : boolean {
    for (proxy in WorkloadProxyFactory.INSTANCE.Proxies) {
      if (not proxy.findAssignables(this, null).Empty) {
        return true
      }
    }

    return false
  }


}
