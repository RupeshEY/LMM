package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 17, column 44
    function action_0 () : void {
      FNOLWizard.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 21, column 64
    function action_3 () : void {
      pcf.ArchivedClaim.go(Claim.ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 24, column 37
    function action_6 () : void {
      pcf.Claim.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 27, column 42
    function action_8 () : void {
      pcf.CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 17, column 44
    function action_dest_1 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 21, column 64
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(Claim.ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 24, column 37
    function action_dest_7 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimForward.pcf: line 27, column 42
    function action_dest_9 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at ClaimForward.pcf: line 17, column 44
    function condition_2 () : java.lang.Boolean {
      return Claim.State == TC_DRAFT
    }
    
    // 'condition' attribute on ForwardCondition at ClaimForward.pcf: line 21, column 64
    function condition_5 () : java.lang.Boolean {
      return Claim.ClaimInfo.ArchiveState == TC_ARCHIVED
    }
    
    // 'parent' attribute on Forward (id=ClaimForward) at ClaimForward.pcf: line 8, column 32
    static function parent_10 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimForward {
      return super.CurrentLocation as pcf.ClaimForward
    }
    
    
  }
  
  
}