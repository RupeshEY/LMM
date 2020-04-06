package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/NewRegion.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRegionExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/NewRegion.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRegionExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    function afterCancel_3 () : void {
      Regions.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.Regions.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      Regions.go()
    }
    
    // 'beforeCommit' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      Region.removeNullZones()
    }
    
    // 'canVisit' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    static function canVisit_7 () : java.lang.Boolean {
      return perm.Region.create
    }
    
    // 'def' attribute on ScreenRef at NewRegion.pcf: line 23, column 41
    function def_onEnter_1 (def :  pcf.RegionDetailScreen) : void {
      def.onEnter(Region)
    }
    
    // 'def' attribute on ScreenRef at NewRegion.pcf: line 23, column 41
    function def_refreshVariables_2 (def :  pcf.RegionDetailScreen) : void {
      def.refreshVariables(Region)
    }
    
    // 'initialValue' attribute on Variable at NewRegion.pcf: line 21, column 22
    function initialValue_0 () : Region {
      return new Region()
    }
    
    // 'parent' attribute on Page (id=NewRegion) at NewRegion.pcf: line 15, column 61
    static function parent_8 () : pcf.api.Destination {
      return pcf.RegionsPage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewRegion {
      return super.CurrentLocation as pcf.NewRegion
    }
    
    property get Region () : Region {
      return getVariableValue("Region", 0) as Region
    }
    
    property set Region ($arg :  Region) {
      setVariableValue("Region", 0, $arg)
    }
    
    
  }
  
  
}