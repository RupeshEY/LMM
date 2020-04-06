package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ClaimMetricsEntryPointForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMetricsEntryPointForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ClaimMetricsEntryPointForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMetricsEntryPointForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimNumber :  String) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 19, column 34
    function action_1 () : void {
      EndUserError.go(DisplayKey.get("Web.EntryPoint.ClaimMetricsEntryPointForward.CouldNotFindClaim", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 21, column 43
    function action_4 () : void {
      ClaimKeyMetrics.go(claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 23, column 139
    function action_6 () : void {
      EndUserError.go(DisplayKey.get("Web.EntryPoint.ClaimMetricsEntryPointForward.CouldNotVisitClaim", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 19, column 34
    function action_dest_2 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Web.EntryPoint.ClaimMetricsEntryPointForward.CouldNotFindClaim", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 21, column 43
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 23, column 139
    function action_dest_7 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Web.EntryPoint.ClaimMetricsEntryPointForward.CouldNotVisitClaim", claimNumber))
    }
    
    // 'condition' attribute on ForwardCondition at ClaimMetricsEntryPointForward.pcf: line 19, column 34
    function condition_3 () : java.lang.Boolean {
      return claim == null
    }
    
    // 'initialValue' attribute on Variable at ClaimMetricsEntryPointForward.pcf: line 16, column 28
    function initialValue_0 () : entity.Claim {
      return gw.api.database.Query.make(entity.Claim).compare("ClaimNumber", Equals, claimNumber).select().FirstResult
    }
    
    override property get CurrentLocation () : pcf.ClaimMetricsEntryPointForward {
      return super.CurrentLocation as pcf.ClaimMetricsEntryPointForward
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    
  }
  
  
}