package gw.api.assignment.workload.util

uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException



/**
 * Utility helper class for Weighted Workload Assignment UI.
 */
@Export
final public class WorkloadUIHelper {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Construction
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * This class is not allowed to be instantiated.
   */
  private construct() {}


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Tests if a group user has any workload-aware assignables assigned to them. If so, then throws an exception.
   * This is used in the Admin screens to prevent a user from being disassociated from a group if they have
   * any assignables with potential workload.
   */
  public static function checkCanRemoveGroup(gu: GroupUser) {
    // deny ability to remove a user from a group if the user has any
    // workload-enabled assignables. This only applies if weighted workload functionality is enabled.
    if (gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value) {
      if (gu.hasWorkloadAssignables()) {
        throw new DisplayableException(DisplayKey.get("Web.Admin.GroupUsers.Exception.RemoveAssignablesBeforeGroupRemoval"))
      }
    }
  }

}