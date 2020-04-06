package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/vacationstatus/UserVacationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserVacationScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/vacationstatus/UserVacationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserVacationScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at UserVacationScreen.pcf: line 15, column 24
    function def_onEnter_1 (def :  pcf.UserVacationDV) : void {
      def.onEnter(user)
    }
    
    // 'def' attribute on PanelRef at UserVacationScreen.pcf: line 15, column 24
    function def_refreshVariables_2 (def :  pcf.UserVacationDV) : void {
      def.refreshVariables(user)
    }
    
    // EditButtons at UserVacationScreen.pcf: line 11, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get user () : User {
      return getRequireValue("user", 0) as User
    }
    
    property set user ($arg :  User) {
      setRequireValue("user", 0, $arg)
    }
    
    
  }
  
  
}