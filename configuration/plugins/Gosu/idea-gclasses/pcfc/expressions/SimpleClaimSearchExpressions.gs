package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SimpleClaimSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterEnter' attribute on Page (id=SimpleClaimSearch) at SimpleClaimSearch.pcf: line 11, column 76
    function afterEnter_2 () : void {
      gw.api.claim.ClaimUtil.ensureClaimSearchCriteriaHasActiveDatabaseSelected()
    }
    
    // 'canVisit' attribute on Page (id=SimpleClaimSearch) at SimpleClaimSearch.pcf: line 11, column 76
    static function canVisit_3 () : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch
    }
    
    // 'def' attribute on ScreenRef at SimpleClaimSearch.pcf: line 13, column 40
    function def_onEnter_0 (def :  pcf.SimpleClaimSearchScreen) : void {
      def.onEnter()
    }
    
    // 'def' attribute on ScreenRef at SimpleClaimSearch.pcf: line 13, column 40
    function def_refreshVariables_1 (def :  pcf.SimpleClaimSearchScreen) : void {
      def.refreshVariables()
    }
    
    // Page (id=SimpleClaimSearch) at SimpleClaimSearch.pcf: line 11, column 76
    static function parent_4 () : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.SimpleClaimSearch {
      return super.CurrentLocation as pcf.SimpleClaimSearch
    }
    
    
  }
  
  
}