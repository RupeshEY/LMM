package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/InternalToolsMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InternalToolsMenuActionsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/InternalToolsMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalToolsMenuActionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ReturnToApp) at InternalToolsMenuActions.pcf: line 11, column 67
    function action_0 () : void {
      gw.api.util.NavUtil.goToDefaultEntryPoint()
    }
    
    // 'label' attribute on MenuItem (id=InternalToolsMenuActions_Logout) at InternalToolsMenuActions.pcf: line 15, column 92
    function label_1 () : java.lang.Object {
      return DisplayKey.get("Web.TabBar.Logout", entity.User.util.CurrentUser)
    }
    
    
  }
  
  
}