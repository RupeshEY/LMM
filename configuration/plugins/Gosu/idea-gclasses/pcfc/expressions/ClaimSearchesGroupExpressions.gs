package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchesGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchesGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchesGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchesGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_0 () : void {
      pcf.SimpleClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_2 () : void {
      pcf.ClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_4 () : void {
      pcf.FreeTextClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_6 () : void {
      pcf.CatastropheSearch.go(null)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.SimpleClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.FreeTextClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_dest_7 () : pcf.api.Destination {
      return pcf.CatastropheSearch.createDestination(null)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 8, column 76
    static function canVisit_8 () : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch
    }
    
    // LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 8, column 76
    static function firstVisitableChildDestinationMethod_12 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.SimpleClaimSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.FreeTextClaimSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CatastropheSearch.createDestination(null)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 8, column 76
    static function parent_9 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 8, column 76
    function tabBar_onEnter_10 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSearchesGroup) at ClaimSearchesGroup.pcf: line 8, column 76
    function tabBar_refreshVariables_11 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ClaimSearchesGroup {
      return super.CurrentLocation as pcf.ClaimSearchesGroup
    }
    
    
  }
  
  
}