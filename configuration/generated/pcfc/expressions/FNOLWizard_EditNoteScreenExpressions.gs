package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_EditNoteScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_EditNoteScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=EditNote_DeleteButton) at FNOLWizard_EditNoteScreen.pcf: line 24, column 25
    function action_0 () : void {
      ClaimTest.removeFromNotes(Note); CurrentLocation.commit();
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_EditNoteScreen.pcf: line 27, column 45
    function def_onEnter_1 (def :  pcf.NoteDetailDV) : void {
      def.onEnter(Note, true, true)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_EditNoteScreen.pcf: line 27, column 45
    function def_refreshVariables_2 (def :  pcf.NoteDetailDV) : void {
      def.refreshVariables(Note, true, true)
    }
    
    property get ClaimTest () : Claim {
      return getRequireValue("ClaimTest", 0) as Claim
    }
    
    property set ClaimTest ($arg :  Claim) {
      setRequireValue("ClaimTest", 0, $arg)
    }
    
    property get Note () : Note {
      return getRequireValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setRequireValue("Note", 0, $arg)
    }
    
    
  }
  
  
}