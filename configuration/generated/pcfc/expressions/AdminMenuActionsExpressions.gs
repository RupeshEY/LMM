package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/AdminMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminMenuActionsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/AdminMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuActionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AdminMenuActions_NewUser) at AdminMenuActions.pcf: line 11, column 21
    function action_0 () : void {
      NewUser.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminMenuActions_NewGroup) at AdminMenuActions.pcf: line 16, column 21
    function action_2 () : void {
      NewGroup.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminMenuActions_NewUser) at AdminMenuActions.pcf: line 11, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewUser.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=AdminMenuActions_NewGroup) at AdminMenuActions.pcf: line 16, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewGroup.createDestination()
    }
    
    
  }
  
  
}