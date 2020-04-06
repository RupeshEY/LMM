package gw.acc.iplm.utils.pcf.suspensequeue

uses entity.LMMessage_Ext
uses gw.api.assignment.CCAssignmentPopup

class LMMessageAssignmentPopup extends CCAssignmentPopup {

  /**
   * Create a new assignment popup to assign a single LMMessage_Ext.
   *
   * @param message the LMMessage_Ext to be assigned.
   */
  construct (message: LMMessage_Ext) {
    this(new LMMessage_Ext[]{message})
  }

  /**
   * Create a new assignment popup to assign an array of LMMessage_Exts.
   *
   * @param messages the LMMessage_Exts to be assigned.
   */
  construct (messages: LMMessage_Ext[]) {
    super(LMMessage_Ext.TYPE.get(), messages, new LMSuggestedAssigneeBuilder(messages, false))
  }
}