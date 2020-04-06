package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignableDV_activityExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignableDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserActivitiesPage_AssignButton) at UserAssignableDV.activity.pcf: line 22, column 27
    function allCheckedRowsAction_0 (CheckedValues :  entity.ActivityDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.activity.pcf: line 14, column 27
    function def_onEnter_1 (def :  pcf.DesktopActivitiesLV) : void {
      def.onEnter(ActivityDesktopView.finder.findAssignedToUser(User))
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.activity.pcf: line 14, column 27
    function def_refreshVariables_2 (def :  pcf.DesktopActivitiesLV) : void {
      def.refreshVariables(ActivityDesktopView.finder.findAssignedToUser(User))
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}