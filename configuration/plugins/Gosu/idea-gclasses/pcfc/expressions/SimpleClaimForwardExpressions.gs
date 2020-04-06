package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SimpleClaimForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ClaimInfo :  ClaimInfo) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 14, column 95
    function action_0 () : void {
      pcf.ArchivedClaim.go(ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 17, column 95
    function action_3 () : void {
      pcf.ClaimForward.go(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 19, column 38
    function action_6 () : void {
      CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 14, column 95
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 17, column 95
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at SimpleClaimForward.pcf: line 19, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at SimpleClaimForward.pcf: line 14, column 95
    function condition_2 () : java.lang.Boolean {
      return ClaimInfo.ArchiveState != null && perm.ClaimInfo.view( ClaimInfo )
    }
    
    // 'condition' attribute on ForwardCondition at SimpleClaimForward.pcf: line 17, column 95
    function condition_5 () : java.lang.Boolean {
      return ClaimInfo.ArchiveState == null && perm.ClaimInfo.view( ClaimInfo )
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getVariableValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("ClaimInfo", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SimpleClaimForward {
      return super.CurrentLocation as pcf.SimpleClaimForward
    }
    
    
  }
  
  
}