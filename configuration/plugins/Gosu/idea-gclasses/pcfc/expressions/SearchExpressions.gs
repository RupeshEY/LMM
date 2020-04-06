package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends SearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_0 () : void {
      pcf.SimpleClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_2 () : void {
      pcf.ClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_4 () : void {
      pcf.FreeTextClaimSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_6 () : void {
      pcf.CatastropheSearch.go(null)
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.SimpleClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.FreeTextClaimSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_dest_7 () : pcf.api.Destination {
      return pcf.CatastropheSearch.createDestination(null)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 18, column 21
    function action_10 () : void {
      pcf.ActivitySearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 22, column 21
    function action_12 () : void {
      pcf.PaymentSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 26, column 21
    function action_14 () : void {
      pcf.RecoverySearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 30, column 21
    function action_16 () : void {
      pcf.BulkInvoiceSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 14, column 21
    function action_8 () : void {
      pcf.ClaimSearchesGroup.go()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 18, column 21
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ActivitySearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 22, column 21
    function action_dest_13 () : pcf.api.Destination {
      return pcf.PaymentSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 26, column 21
    function action_dest_15 () : pcf.api.Destination {
      return pcf.RecoverySearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 30, column 21
    function action_dest_17 () : pcf.api.Destination {
      return pcf.BulkInvoiceSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Search) at Search.pcf: line 14, column 21
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    // LocationGroup (id=Search) at Search.pcf: line 8, column 59
    static function firstVisitableChildDestinationMethod_22 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimSearchesGroup.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ActivitySearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.PaymentSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.RecoverySearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.BulkInvoiceSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=Search) at Search.pcf: line 8, column 59
    function menuActions_onEnter_18 (def :  pcf.SearchMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=Search) at Search.pcf: line 8, column 59
    function menuActions_refreshVariables_19 (def :  pcf.SearchMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Search) at Search.pcf: line 8, column 59
    function tabBar_onEnter_20 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Search) at Search.pcf: line 8, column 59
    function tabBar_refreshVariables_21 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Search {
      return super.CurrentLocation as pcf.Search
    }
    
    
  }
  
  
}