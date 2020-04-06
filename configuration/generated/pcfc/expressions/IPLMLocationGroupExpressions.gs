package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/IPLMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMLocationGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/IPLMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMLocationGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 20, column 43
    function action_10 () : void {
      pcf.SCMLocationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 17, column 43
    function action_6 () : void {
      pcf.ECFLocationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 20, column 43
    function action_dest_11 () : pcf.api.Destination {
      return pcf.SCMLocationGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 17, column 43
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ECFLocationGroup.createDestination(Claim)
    }
    
    // LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    static function firstVisitableChildDestinationMethod_17 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ECFLocationGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SCMLocationGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    function menuActions_onEnter_12 (def :  pcf.ClaimMenuActions) : void {
      def.onEnter(Claim)
    }
    
    // 'menuActions' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    function menuActions_refreshVariables_13 (def :  pcf.ClaimMenuActions) : void {
      def.refreshVariables(Claim)
    }
    
    // 'parent' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    static function parent_14 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    function tabBar_onEnter_15 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=IPLMLocationGroup) at IPLMLocationGroup.pcf: line 9, column 90
    function tabBar_refreshVariables_16 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.IPLMLocationGroup {
      return super.CurrentLocation as pcf.IPLMLocationGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/IPLMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends IPLMLocationGroupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at SCMLocationGroup.pcf: line 17, column 43
    function action_8 () : void {
      pcf.SCMClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at SCMLocationGroup.pcf: line 17, column 43
    function action_dest_9 () : pcf.api.Destination {
      return pcf.SCMClaimMessages.createDestination(claim)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 1) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/IPLMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends IPLMLocationGroupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 17, column 44
    function action_0 () : void {
      pcf.ClaimTransactions.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 20, column 40
    function action_2 () : void {
      pcf.ClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 23, column 47
    function action_4 () : void {
      pcf.ClaimRetrieveRequest.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 17, column 44
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimTransactions.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 20, column 40
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimMessages.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=IPLMLocationGroup) at ECFLocationGroup.pcf: line 23, column 47
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimRetrieveRequest.createDestination(claim)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 1) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 1, $arg)
    }
    
    
  }
  
  
}