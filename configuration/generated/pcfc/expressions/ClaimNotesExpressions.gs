package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/ClaimNotes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNotesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/ClaimNotes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNotesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimNotes) at ClaimNotes.pcf: line 9, column 68
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimnotes and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on ScreenRef at ClaimNotes.pcf: line 16, column 45
    function def_onEnter_0 (def :  pcf.NotesSearchScreen) : void {
      def.onEnter(Claim, null)
    }
    
    // 'def' attribute on ScreenRef at ClaimNotes.pcf: line 16, column 45
    function def_refreshVariables_1 (def :  pcf.NotesSearchScreen) : void {
      def.refreshVariables(Claim, null)
    }
    
    // Page (id=ClaimNotes) at ClaimNotes.pcf: line 9, column 68
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNotes {
      return super.CurrentLocation as pcf.ClaimNotes
    }
    
    
  }
  
  
}