package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignServiceRequestPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignServiceRequestPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssignmentPopup :  gw.api.vendormanagement.ServiceRequestAssignmentPopup) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AssignServiceRequestPopup) at AssignServiceRequestPopup.pcf: line 11, column 73
    function beforeCommit_2 (pickedValue :  gw.api.assignment.Assignee) : void {
      AssignmentPopup.Picker.setSelection(pickedValue);AssignmentPopup.performAssignment()
    }
    
    // 'def' attribute on ScreenRef at AssignServiceRequestPopup.pcf: line 18, column 81
    function def_onEnter_0 (def :  pcf.AssignmentPopupScreen) : void {
      def.onEnter(AssignmentPopup, AssignmentPopup.getClaim())
    }
    
    // 'def' attribute on ScreenRef at AssignServiceRequestPopup.pcf: line 18, column 81
    function def_refreshVariables_1 (def :  pcf.AssignmentPopupScreen) : void {
      def.refreshVariables(AssignmentPopup, AssignmentPopup.getClaim())
    }
    
    property get AssignmentPopup () : gw.api.vendormanagement.ServiceRequestAssignmentPopup {
      return getVariableValue("AssignmentPopup", 0) as gw.api.vendormanagement.ServiceRequestAssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.vendormanagement.ServiceRequestAssignmentPopup) {
      setVariableValue("AssignmentPopup", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AssignServiceRequestPopup {
      return super.CurrentLocation as pcf.AssignServiceRequestPopup
    }
    
    
  }
  
  
}