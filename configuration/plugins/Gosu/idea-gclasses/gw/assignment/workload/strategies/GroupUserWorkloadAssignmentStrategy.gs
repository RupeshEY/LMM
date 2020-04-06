package gw.assignment.workload.strategies

uses gw.api.assignment.workload.strategies.WorkloadAssignmentStrategyBase

/**
 * Assignment Strategy that chooses assignees based on Load Factor calibrated workloads.
 */
@Export
public class GroupUserWorkloadAssignmentStrategy extends WorkloadAssignmentStrategyBase {
  
  /**
   * Returns the workload influenced by the group-user relationship.
   */    
  protected override function fetchWorkload(groupUser : GroupUser) : int {
    // workload in this situation is the workload calculated based on User-Group relationship dynamics
    return groupUser.AssignmentWeightedWorkload
  }

}
