package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.matter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignableDV_matterExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.matter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignableDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserMattersPage_AssignButton) at UserAssignableDV.matter.pcf: line 23, column 27
    function allCheckedRowsAction_0 (CheckedValues :  entity.MatterUserView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.matter.pcf: line 14, column 27
    function def_onEnter_1 (def :  pcf.UserMattersLV) : void {
      def.onEnter(MatterUserView.finder.findAssignedToUser(User) )
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.matter.pcf: line 14, column 27
    function def_refreshVariables_2 (def :  pcf.UserMattersLV) : void {
      def.refreshVariables(MatterUserView.finder.findAssignedToUser(User) )
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}