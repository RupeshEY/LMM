package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/reassign/AssignLMMessagesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignLMMessagesPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/reassign/AssignLMMessagesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignLMMessagesPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssignmentPopup :  gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AssignLMMessagesPopup) at AssignLMMessagesPopup.pcf: line 11, column 90
    function beforeCommit_2 (pickedValue :  gw.api.assignment.Assignee) : void {
      AssignmentPopup.Picker.setSelection(pickedValue);AssignmentPopup.performAssignment()
    }
    
    // 'def' attribute on ScreenRef at AssignLMMessagesPopup.pcf: line 18, column 76
    function def_onEnter_0 (def :  pcf.AssignmentPopupScreen) : void {
      def.onEnter(AssignmentPopup, AssignmentPopup.Claim)
    }
    
    // 'def' attribute on ScreenRef at AssignLMMessagesPopup.pcf: line 18, column 76
    function def_refreshVariables_1 (def :  pcf.AssignmentPopupScreen) : void {
      def.refreshVariables(AssignmentPopup, AssignmentPopup.Claim)
    }
    
    property get AssignmentPopup () : gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup {
      return getVariableValue("AssignmentPopup", 0) as gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.acc.iplm.utils.pcf.suspensequeue.LMMessageAssignmentPopup) {
      setVariableValue("AssignmentPopup", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AssignLMMessagesPopup {
      return super.CurrentLocation as pcf.AssignLMMessagesPopup
    }
    
    
  }
  
  
}