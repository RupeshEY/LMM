package gw.entity

/**
 * Assignment helper methods for assigning the subrogationowner roles
 */
@Export
enhancement GWSubroAssignmentEnhancement : entity.Subrogation {

  /**
  * Handles the creation and updates of the subrogationowner assignment role in the Claim for
  * this subrogation.
  * It removes the outdated assignments and add new assignments when needed.
  */
  function handleSubrogationOwnerRole() {

    // Only make changes when the assignment has changed
    if (this.isFieldChanged(Subrogation#AssignedUser)) {

      var claimRoleAssignments = this.SubrogationSummary.Claim.AllRoleAssignments.where( \ roleAssignment -> roleAssignment.Role == typekey.UserRole.TC_SUBROGATIONOWNER)
      // Remove previous assignment
      if (claimRoleAssignments.hasMatch( \ s -> s.AssignedUser.ID == this.getOriginalValue("AssignedUser") and s.Exposure == this.Exposure)) {
        claimRoleAssignments.singleWhere( \ s -> s.AssignedUser.ID == this.getOriginalValue("AssignedUser") and s.Exposure == this.Exposure).remove()
      }

      if (!claimRoleAssignments.hasMatch( \ s -> s.AssignedUser == this.AssignedUser and s.Exposure == this.Exposure)) {
        createUserRoleAssignmentWithExposure()
      }
    }
  }

  /**
   * Create a new UserRoleAssignment for the current
   * Subrogation AssignedUser, AssignedGroup and Exposure
   */
  private function createUserRoleAssignmentWithExposure () {
    var subroOwnerRole = this.SubrogationSummary.Claim.assignUserRole(this.AssignedUser, this.AssignedGroup, typekey.UserRole.TC_SUBROGATIONOWNER)
    subroOwnerRole.Exposure = this.Exposure
  }

}
