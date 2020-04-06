package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/StartupPageErrorGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StartupPageErrorGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/util/StartupPageErrorGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartupPageErrorGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=StartupPageErrorGroup) at StartupPageErrorGroup.pcf: line 10, column 38
    function action_0 () : void {
      pcf.StartupPageError.go()
    }
    
    // 'location' attribute on LocationGroup (id=StartupPageErrorGroup) at StartupPageErrorGroup.pcf: line 10, column 38
    function action_dest_1 () : pcf.api.Destination {
      return pcf.StartupPageError.createDestination()
    }
    
    // LocationGroup (id=StartupPageErrorGroup) at StartupPageErrorGroup.pcf: line 8, column 26
    static function firstVisitableChildDestinationMethod_4 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.StartupPageError.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'tabBar' attribute on LocationGroup (id=StartupPageErrorGroup) at StartupPageErrorGroup.pcf: line 8, column 26
    function tabBar_onEnter_2 (def :  pcf.StartupPageErrorTabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=StartupPageErrorGroup) at StartupPageErrorGroup.pcf: line 8, column 26
    function tabBar_refreshVariables_3 (def :  pcf.StartupPageErrorTabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.StartupPageErrorGroup {
      return super.CurrentLocation as pcf.StartupPageErrorGroup
    }
    
    
  }
  
  
}