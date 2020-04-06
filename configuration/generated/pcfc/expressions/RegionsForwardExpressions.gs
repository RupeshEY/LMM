package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionsForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionsForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionsForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionsForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at RegionsForward.pcf: line 9, column 34
    function action_0 () : void {
      RegionsPage.go()
    }
    
    // 'action' attribute on ForwardCondition at RegionsForward.pcf: line 9, column 34
    function action_dest_1 () : pcf.api.Destination {
      return pcf.RegionsPage.createDestination()
    }
    
    // 'canVisit' attribute on Forward (id=RegionsForward) at RegionsForward.pcf: line 7, column 25
    static function canVisit_2 () : java.lang.Boolean {
      return perm.Region.view
    }
    
    // Forward (id=RegionsForward) at RegionsForward.pcf: line 7, column 25
    static function parent_3 () : pcf.api.Destination {
      return pcf.Regions.createDestination()
    }
    
    override property get CurrentLocation () : pcf.RegionsForward {
      return super.CurrentLocation as pcf.RegionsForward
    }
    
    
  }
  
  
}