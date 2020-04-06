package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/CatastropheSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 1
    }
    
    static function __constructorIndex (catastrophe :  Catastrophe) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=CatastropheSearch) at CatastropheSearch.pcf: line 10, column 76
    static function canVisit_2 (catastrophe :  Catastrophe) : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch and perm.Catastrophe.view and gw.api.heatmap.HeatMapGenerator.isHeatMapConfigured()
    }
    
    // 'def' attribute on ScreenRef at CatastropheSearch.pcf: line 19, column 51
    function def_onEnter_0 (def :  pcf.CatastropheSearchScreen) : void {
      def.onEnter(catastrophe)
    }
    
    // 'def' attribute on ScreenRef at CatastropheSearch.pcf: line 19, column 51
    function def_refreshVariables_1 (def :  pcf.CatastropheSearchScreen) : void {
      def.refreshVariables(catastrophe)
    }
    
    // 'parent' attribute on Page (id=CatastropheSearch) at CatastropheSearch.pcf: line 10, column 76
    static function parent_3 (catastrophe :  Catastrophe) : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.CatastropheSearch {
      return super.CurrentLocation as pcf.CatastropheSearch
    }
    
    property get catastrophe () : Catastrophe {
      return getVariableValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setVariableValue("catastrophe", 0, $arg)
    }
    
    
  }
  
  
}