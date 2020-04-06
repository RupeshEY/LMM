package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAssignableDV_exposureExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignableDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserExposuresPage_AssignButton) at UserAssignableDV.exposure.pcf: line 23, column 27
    function allCheckedRowsAction_0 (CheckedValues :  entity.ExposureDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.exposure.pcf: line 14, column 27
    function def_onEnter_1 (def :  pcf.DesktopExposuresLV) : void {
      def.onEnter(ExposureDesktopView.finder.findAll(), User)
    }
    
    // 'def' attribute on ListViewInput at UserAssignableDV.exposure.pcf: line 14, column 27
    function def_refreshVariables_2 (def :  pcf.DesktopExposuresLV) : void {
      def.refreshVariables(ExposureDesktopView.finder.findAll(), User)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}