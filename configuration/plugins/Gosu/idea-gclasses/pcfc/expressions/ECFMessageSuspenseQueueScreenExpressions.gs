package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageSuspenseQueueScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueueScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageSuspenseQueueScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ReassignButton) at ECFMessageSuspenseQueueScreen.pcf: line 93, column 101
    function allCheckedRowsAction_14 (CheckedValues :  LMMessageLloydsSCM_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      AssignLMMessagesPopup.push(new gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Delete) at ECFMessageSuspenseQueueScreen.pcf: line 99, column 100
    function allCheckedRowsAction_15 (CheckedValues :  LMMessageLloydsSCM_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      lmSuspenseQueueController.deleteMessages(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ReassignButton) at ECFMessageSuspenseQueueScreen.pcf: line 52, column 97
    function allCheckedRowsAction_6 (CheckedValues :  ECFMessageClaimData_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      AssignLMMessagesPopup.push(new gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesMenuItem (id=DeleteSelected) at ECFMessageSuspenseQueueScreen.pcf: line 61, column 107
    function allCheckedRowsAction_7 (CheckedValues :  ECFMessageClaimData_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      ecfSuspenseQueueController.deleteECFMessages(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesMenuItem (id=Available) at ECFMessageSuspenseQueueScreen.pcf: line 65, column 108
    function allCheckedRowsAction_8 (CheckedValues :  ECFMessageClaimData_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      ecfSuspenseQueueController.validateBeforeDeleteAdditionalMessages(CheckedValues); ECFMessageSuspenseQueueDeleteAdditionalMessagePopup.push(CheckedValues[0])
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ResubmitButton) at ECFMessageSuspenseQueueScreen.pcf: line 73, column 99
    function allCheckedRowsAction_9 (CheckedValues :  ECFMessageClaimData_Ext[], CheckedValuesErrors :  java.util.Map) : void {
      ecfSuspenseQueueController.resubmitECFMessages(CheckedValues); ECFAdminClaimRetrievePage.push()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ApplyToPolicyButton) at ECFMessageSuspenseQueueScreen.pcf: line 88, column 108
    function checkedRowAction_13 (element :  LMMessageLloydsSCM_Ext, CheckedValue :  LMMessageLloydsSCM_Ext) : void {
      LMSuspenseQueuePolicySearchPopup.push(CheckedValue); alertBarMessageEntity = CheckedValue; alertBarMessage = gw.acc.iplm.controller.LMSuspenseQueueController.MESSAGE_APPLY_TO_POLICY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ApplyToPolicyButton) at ECFMessageSuspenseQueueScreen.pcf: line 41, column 104
    function checkedRowAction_4 (element :  ECFMessageClaimData_Ext, CheckedValue :  ECFMessageClaimData_Ext) : void {
      ECFSuspenseQueuePolicySearchPopup.push(CheckedValue); alertBarMessageEntity = CheckedValue; alertBarMessage = gw.acc.iplm.controller.ECFSuspenseQueueController.MESSAGE_APPLY_TO_POLICY
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ApplyToClaimButton) at ECFMessageSuspenseQueueScreen.pcf: line 47, column 103
    function checkedRowAction_5 (element :  ECFMessageClaimData_Ext, CheckedValue :  ECFMessageClaimData_Ext) : void {
      ECFSuspenseQueueClaimSearchPopup.push(CheckedValue); alertBarMessageEntity = CheckedValue; alertBarMessage = gw.acc.iplm.controller.ECFSuspenseQueueController.MESSAGE_APPLY_TO_CLAIM
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueScreen.pcf: line 33, column 119
    function def_onEnter_10 (def :  pcf.ClaimDataSuspenseQueueLV) : void {
      def.onEnter(ecfSuspenseQueueController.getClaimDataMessagesForUser(User.util.CurrentUser))
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueScreen.pcf: line 81, column 104
    function def_onEnter_16 (def :  pcf.LMSuspenseQueueLV) : void {
      def.onEnter(lmSuspenseQueueController.getMessagesForUser(User.util.CurrentUser))
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueScreen.pcf: line 33, column 119
    function def_refreshVariables_11 (def :  pcf.ClaimDataSuspenseQueueLV) : void {
      def.refreshVariables(ecfSuspenseQueueController.getClaimDataMessagesForUser(User.util.CurrentUser))
    }
    
    // 'def' attribute on PanelRef at ECFMessageSuspenseQueueScreen.pcf: line 81, column 104
    function def_refreshVariables_17 (def :  pcf.LMSuspenseQueueLV) : void {
      def.refreshVariables(lmSuspenseQueueController.getMessagesForUser(User.util.CurrentUser))
    }
    
    // 'initialValue' attribute on Variable at ECFMessageSuspenseQueueScreen.pcf: line 13, column 65
    function initialValue_0 () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return new gw.acc.iplm.controller.ECFSuspenseQueueController()
    }
    
    // 'initialValue' attribute on Variable at ECFMessageSuspenseQueueScreen.pcf: line 17, column 64
    function initialValue_1 () : gw.acc.iplm.controller.LMSuspenseQueueController {
      return new gw.acc.iplm.controller.LMSuspenseQueueController()
    }
    
    // 'label' attribute on AlertBar (id=AlertBar) at ECFMessageSuspenseQueueScreen.pcf: line 27, column 69
    function label_3 () : java.lang.Object {
      return alertBarMessage(alertBarMessageEntity)
    }
    
    // 'title' attribute on Card (id=ECF) at ECFMessageSuspenseQueueScreen.pcf: line 31, column 182
    function title_12 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ECF.Title", ecfSuspenseQueueController.getNumberSuspendedMessagesForUser(User.util.CurrentUser))
    }
    
    // 'title' attribute on Card (id=LondonMarket) at ECFMessageSuspenseQueueScreen.pcf: line 79, column 180
    function title_18 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.LM.Title", lmSuspenseQueueController.getNumberSuspendedMessagesForUser(User.util.CurrentUser))
    }
    
    // 'visible' attribute on AlertBar (id=AlertBar) at ECFMessageSuspenseQueueScreen.pcf: line 27, column 69
    function visible_2 () : java.lang.Boolean {
      return wasChildPopupCommitted and alertBarMessage != null
    }
    
    property get alertBarMessage () : block(LMMessage_Ext):String {
      return getVariableValue("alertBarMessage", 0) as block(LMMessage_Ext):String
    }
    
    property set alertBarMessage ($arg :  block(LMMessage_Ext):String) {
      setVariableValue("alertBarMessage", 0, $arg)
    }
    
    property get alertBarMessageEntity () : LMMessage_Ext {
      return getVariableValue("alertBarMessageEntity", 0) as LMMessage_Ext
    }
    
    property set alertBarMessageEntity ($arg :  LMMessage_Ext) {
      setVariableValue("alertBarMessageEntity", 0, $arg)
    }
    
    property get ecfSuspenseQueueController () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return getVariableValue("ecfSuspenseQueueController", 0) as gw.acc.iplm.controller.ECFSuspenseQueueController
    }
    
    property set ecfSuspenseQueueController ($arg :  gw.acc.iplm.controller.ECFSuspenseQueueController) {
      setVariableValue("ecfSuspenseQueueController", 0, $arg)
    }
    
    property get lmSuspenseQueueController () : gw.acc.iplm.controller.LMSuspenseQueueController {
      return getVariableValue("lmSuspenseQueueController", 0) as gw.acc.iplm.controller.LMSuspenseQueueController
    }
    
    property set lmSuspenseQueueController ($arg :  gw.acc.iplm.controller.LMSuspenseQueueController) {
      setVariableValue("lmSuspenseQueueController", 0, $arg)
    }
    
    property get wasChildPopupCommitted () : boolean {
      return getRequireValue("wasChildPopupCommitted", 0) as java.lang.Boolean
    }
    
    property set wasChildPopupCommitted ($arg :  boolean) {
      setRequireValue("wasChildPopupCommitted", 0, $arg)
    }
    
    
  }
  
  
}