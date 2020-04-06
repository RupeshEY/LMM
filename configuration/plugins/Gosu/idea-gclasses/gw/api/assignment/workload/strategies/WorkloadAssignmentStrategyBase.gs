package gw.api.assignment.workload.strategies

uses java.lang.Integer
uses java.util.Comparator
uses java.util.Map

@Export
abstract class WorkloadAssignmentStrategyBase extends AbstractWorkloadAssignmentStrategy {

  protected function getWorkloadComparator(weightTable : Map<GroupUser, Integer>) : Comparator<GroupUser> {
    return new GroupUserWorkloadComparator(weightTable)
  }

}