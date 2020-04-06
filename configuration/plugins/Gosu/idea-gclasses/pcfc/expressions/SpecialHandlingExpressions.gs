package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SpecialHandlingExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialHandlingExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 10, column 34
    function action_0 () : void {
      pcf.AccountAdmin.go()
    }
    
    // 'location' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 12, column 46
    function action_2 () : void {
      pcf.CustomerServiceTierAdmin.go()
    }
    
    // 'location' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 10, column 34
    function action_dest_1 () : pcf.api.Destination {
      return pcf.AccountAdmin.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 12, column 46
    function action_dest_3 () : pcf.api.Destination {
      return pcf.CustomerServiceTierAdmin.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 8, column 67
    static function canVisit_4 () : java.lang.Boolean {
      return perm.System.accountview or perm.System.custsvctierview
    }
    
    // LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 8, column 67
    static function firstVisitableChildDestinationMethod_8 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.AccountAdmin.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CustomerServiceTierAdmin.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 8, column 67
    static function parent_5 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 8, column 67
    function tabBar_onEnter_6 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=SpecialHandling) at SpecialHandling.pcf: line 8, column 67
    function tabBar_refreshVariables_7 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.SpecialHandling {
      return super.CurrentLocation as pcf.SpecialHandling
    }
    
    
  }
  
  
}