package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAllNotesPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllNotesPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimAllNotesPrint) at ClaimAllNotesPrint.pcf: line 11, column 26
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimnotes
    }
    
    // 'def' attribute on PanelRef at ClaimAllNotesPrint.pcf: line 20, column 44
    function def_onEnter_0 (def :  pcf.NotesLV) : void {
      def.onEnter(Claim.ViewableNotes)
    }
    
    // 'def' attribute on PanelRef at ClaimAllNotesPrint.pcf: line 20, column 44
    function def_refreshVariables_1 (def :  pcf.NotesLV) : void {
      def.refreshVariables(Claim.ViewableNotes)
    }
    
    // 'parent' attribute on Page (id=ClaimAllNotesPrint) at ClaimAllNotesPrint.pcf: line 11, column 26
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimNotes.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimAllNotesPrint {
      return super.CurrentLocation as pcf.ClaimAllNotesPrint
    }
    
    
  }
  
  
}