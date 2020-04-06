package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/zones/Zones.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ZonesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/zones/Zones.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZonesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // LocationGroup (id=Zones) at Zones.pcf: line 9, column 31
    static function firstVisitableChildDestinationMethod_4 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ZonesPage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Zones) at Zones.pcf: line 9, column 31
    function menuLinks_onEnter_0 (def :  pcf.BlankMenuLinks) : void {
      def.onEnter()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Zones) at Zones.pcf: line 9, column 31
    function menuLinks_refreshVariables_1 (def :  pcf.BlankMenuLinks) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Zones) at Zones.pcf: line 9, column 31
    function tabBar_onEnter_2 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Zones) at Zones.pcf: line 9, column 31
    function tabBar_refreshVariables_3 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Zones {
      return super.CurrentLocation as pcf.Zones
    }
    
    
  }
  
  
}