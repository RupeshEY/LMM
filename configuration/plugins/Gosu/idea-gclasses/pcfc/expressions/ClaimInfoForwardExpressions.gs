package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimInfoForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimInfoForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimInfoForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimInfoForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ClaimInfo :  ClaimInfo) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 17, column 77
    function action_0 () : void {
      ArchivedClaim.go(ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 20, column 54
    function action_3 () : void {
      FNOLWizard.go(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 22, column 47
    function action_6 () : void {
      pcf.Claim.go(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 24, column 42
    function action_8 () : void {
      pcf.CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 17, column 77
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 20, column 54
    function action_dest_4 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 22, column 47
    function action_dest_7 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimInfoForward.pcf: line 24, column 42
    function action_dest_9 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'canVisit' attribute on Forward (id=ClaimInfoForward) at ClaimInfoForward.pcf: line 9, column 32
    static function canVisit_10 (ClaimInfo :  ClaimInfo) : java.lang.Boolean {
      return gw.api.claim.ClaimNumberSearchUtil.isArchived(ClaimInfo) ? perm.ClaimInfo.view(ClaimInfo) : (perm.Claim.view(ClaimInfo.Claim) and perm.System.viewclaimsummary)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimInfoForward.pcf: line 17, column 77
    function condition_2 () : java.lang.Boolean {
      return gw.api.claim.ClaimNumberSearchUtil.isArchived(ClaimInfo)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimInfoForward.pcf: line 20, column 54
    function condition_5 () : java.lang.Boolean {
      return ClaimInfo.Claim.State == TC_DRAFT
    }
    
    // 'parent' attribute on Forward (id=ClaimInfoForward) at ClaimInfoForward.pcf: line 9, column 32
    static function parent_11 (ClaimInfo :  ClaimInfo) : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getVariableValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("ClaimInfo", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimInfoForward {
      return super.CurrentLocation as pcf.ClaimInfoForward
    }
    
    
  }
  
  
}