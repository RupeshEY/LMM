package gw.assignment.workload.rules

uses gw.api.assignment.workload.rules.AbstractWorkloadPreupdateRuleActions

@Export
abstract class WorkloadPreupdateRuleActionsBase extends AbstractWorkloadPreupdateRuleActions {

  protected construct(assignable: Assignable) {
    super(assignable)
  }

  protected function logPreviousAssignedUserInformation (assignable : Assignable) {
    var groupuser = getGroupUserForAssignable(assignable)
    if (groupuser.GroupUserWorkload != null) {
      ASSIGNMENT_LOGGER.debug(\ ->"Previous user '" + groupuser.User.Credential.UserName + "' workload: " + groupuser.GroupUserWorkload.Workload)
    } else {
      ASSIGNMENT_LOGGER.debug(\ ->"Previous user workload: (undefined)")
    }
  }


  protected function logPostUpdateStatus(assignable : Assignable) {
    var groupuser = getGroupUserForAssignable(assignable)
    // log results
    if (groupuser.GroupUserWorkload == null or groupuser.GroupUserWorkload.WorkloadUpdated == null) {
      ASSIGNMENT_LOGGER.warn(\ ->"Workload update could not be completed for user '" + groupuser.User.Credential.UserName + "'")
    } else {
      final var username = groupuser.User.Credential.UserName
      ASSIGNMENT_LOGGER.debug(\ ->"User '" + username + "' weight successfully updated to '" + groupuser.GroupUserWorkload.Workload + "'")
    }
  }

  protected function getGroupUserForAssignable(assignable : Assignable) : GroupUser {
    if (assignable.AssignedGroup != null and assignable.AssignedUser != null) {
      return assignable.AssignedGroup.getGroupUser(assignable.AssignedUser)
    } else {
      return null
    }
  }
}