package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/StartupPageErrorTabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartupPageErrorTabBarExpressions {
  @javax.annotation.Generated("config/web/pcf/util/StartupPageErrorTabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartupPageErrorTabBarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at StartupPageErrorTabBar.pcf: line 10, column 60
    function action_0 () : void {
      Help.push()
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at StartupPageErrorTabBar.pcf: line 10, column 60
    function action_dest_1 () : pcf.api.Destination {
      return pcf.Help.createDestination()
    }
    
    // 'label' attribute on TabBarLogout (id=LogoutTabBarLink) at StartupPageErrorTabBar.pcf: line 19, column 21
    function label_2 () : java.lang.Object {
      return DisplayKey.get("Web.TabBar.Logout", entity.User.util.CurrentUser)
    }
    
    
  }
  
  
}