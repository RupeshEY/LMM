package gw.acc.iplm.utils.pcf.suspensequeue

uses gw.api.assignment.SuggestedAssigneeBuilderBase

class LMSuggestedAssigneeBuilder extends SuggestedAssigneeBuilderBase {

  construct(assignables: Assignable[], includeQueues: boolean) {
    super(assignables, includeQueues)
  }

  /**
   * Add assignees to the suggested 'Select From' list on the Message Reassign screen.
   * Claim related assignees, which are included in the OOTB list, have been removed for LM Messages
   * Queues, which are used for Activities, has also been removed as an option on the screen.
   *
   * @param list
   * @param alreadyAdded
   */
  override protected function addSuggestedAssignees(list: List, alreadyAdded: Set) {
    addAutoAssign(list, alreadyAdded)
    addLoggedInUser(list, alreadyAdded)
    addGroupSupervisor(list, alreadyAdded)
    addGroupMembers(list, alreadyAdded)
  }
}