package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewOtherMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewOtherMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewNote) at ClaimNewOtherMenuItemSet.pcf: line 19, column 49
    function action_1 () : void {
      NewNoteWorksheet.goInWorkspace(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewEvaluation) at ClaimNewOtherMenuItemSet.pcf: line 34, column 55
    function action_10 () : void {
      NewEvaluation.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewNegotiation) at ClaimNewOtherMenuItemSet.pcf: line 39, column 56
    function action_13 () : void {
      NewNegotiation.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewServiceRequest) at ClaimNewOtherMenuItemSet.pcf: line 43, column 85
    function action_15 () : void {
      NewServiceRequest.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_Email) at ClaimNewOtherMenuItemSet.pcf: line 23, column 65
    function action_3 () : void {
      EmailWorksheet.goInWorkspace(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewMatter) at ClaimNewOtherMenuItemSet.pcf: line 29, column 51
    function action_7 () : void {
      NewMatter.go(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewEvaluation) at ClaimNewOtherMenuItemSet.pcf: line 34, column 55
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewEvaluation.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewNegotiation) at ClaimNewOtherMenuItemSet.pcf: line 39, column 56
    function action_dest_14 () : pcf.api.Destination {
      return pcf.NewNegotiation.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewServiceRequest) at ClaimNewOtherMenuItemSet.pcf: line 43, column 85
    function action_dest_16 () : pcf.api.Destination {
      return pcf.NewServiceRequest.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewNote) at ClaimNewOtherMenuItemSet.pcf: line 19, column 49
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewNoteWorksheet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_Email) at ClaimNewOtherMenuItemSet.pcf: line 23, column 65
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EmailWorksheet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_NewMatter) at ClaimNewOtherMenuItemSet.pcf: line 29, column 51
    function action_dest_8 () : pcf.api.Destination {
      return pcf.NewMatter.createDestination(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimMenuActions_NewMatter) at ClaimNewOtherMenuItemSet.pcf: line 29, column 51
    function available_5 () : java.lang.Boolean {
      return !Claim.Closed
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewNote) at ClaimNewOtherMenuItemSet.pcf: line 19, column 49
    function visible_0 () : java.lang.Boolean {
      return perm.Claim.createnote(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewNegotiation) at ClaimNewOtherMenuItemSet.pcf: line 39, column 56
    function visible_12 () : java.lang.Boolean {
      return perm.Claim.createnegotiation(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewOther) at ClaimNewOtherMenuItemSet.pcf: line 13, column 31
    function visible_17 () : java.lang.Boolean {
      return Claim != null
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewMatter) at ClaimNewOtherMenuItemSet.pcf: line 29, column 51
    function visible_6 () : java.lang.Boolean {
      return perm.Claim.creatematter(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_NewEvaluation) at ClaimNewOtherMenuItemSet.pcf: line 34, column 55
    function visible_9 () : java.lang.Boolean {
      return perm.Claim.createevaluation(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}