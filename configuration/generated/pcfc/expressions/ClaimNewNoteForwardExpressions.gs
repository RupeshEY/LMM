package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewNoteForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewNoteForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewNoteForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewNoteForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewNoteForward.pcf: line 15, column 57
    function action_0 () : void {
      pcf.ArchivedClaim.go(Claim.ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewNoteForward.pcf: line 17, column 60
    function action_3 () : void {
      pcf.NewNoteWorksheet.goInWorkspace(Claim);
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewNoteForward.pcf: line 15, column 57
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(Claim.ClaimInfo)
    }
    
    // 'canVisit' attribute on Forward (id=ClaimNewNoteForward) at ClaimNewNoteForward.pcf: line 7, column 30
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return !(Claim.State == ClaimState.TC_DRAFT)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimNewNoteForward.pcf: line 15, column 57
    function condition_2 () : java.lang.Boolean {
      return Claim.ClaimInfo.ArchiveState != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewNoteForward {
      return super.CurrentLocation as pcf.ClaimNewNoteForward
    }
    
    
  }
  
  
}