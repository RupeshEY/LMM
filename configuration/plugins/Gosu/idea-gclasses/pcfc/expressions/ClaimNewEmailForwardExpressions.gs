package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewEmailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewEmailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewEmailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewEmailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewEmailForward.pcf: line 15, column 57
    function action_0 () : void {
      pcf.ArchivedClaim.go(Claim.ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewEmailForward.pcf: line 17, column 58
    function action_3 () : void {
      pcf.EmailWorksheet.goInWorkspace(Claim);
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewEmailForward.pcf: line 15, column 57
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(Claim.ClaimInfo)
    }
    
    // 'canVisit' attribute on Forward (id=ClaimNewEmailForward) at ClaimNewEmailForward.pcf: line 7, column 31
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return !(Claim.State == ClaimState.TC_DRAFT)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimNewEmailForward.pcf: line 15, column 57
    function condition_2 () : java.lang.Boolean {
      return Claim.ClaimInfo.ArchiveState != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewEmailForward {
      return super.CurrentLocation as pcf.ClaimNewEmailForward
    }
    
    
  }
  
  
}