package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_NewNoteWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewNoteWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_NewNoteWorksheet_UpdateButton) at FNOLWizard_NewNoteWorksheet.pcf: line 36, column 25
    function action_3 () : void {
      submitWorksheet()
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimWizard_NewNoteWorksheet_CancelButton) at FNOLWizard_NewNoteWorksheet.pcf: line 41, column 25
    function action_4 () : void {
      cancelWorksheet()
    }
    
    // 'canVisit' attribute on Worksheet (id=FNOLWizard_NewNoteWorksheet) at FNOLWizard_NewNoteWorksheet.pcf: line 13, column 70
    static function canVisit_7 (Wizard :  gw.api.claim.NewClaimWizardInfo) : java.lang.Boolean {
      return perm.Claim.create
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_NewNoteWorksheet.pcf: line 45, column 37
    function def_onEnter_5 (def :  pcf.DocumentNoteDV) : void {
      def.onEnter(Note)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_NewNoteWorksheet.pcf: line 45, column 37
    function def_refreshVariables_6 (def :  pcf.DocumentNoteDV) : void {
      def.refreshVariables(Note)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewNoteWorksheet.pcf: line 21, column 51
    function initialValue_1 () : gw.api.note.NewClaimNotesPageHelper {
      return new gw.api.note.NewClaimNotesPageHelper()
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewNoteWorksheet.pcf: line 28, column 20
    function initialValue_2 () : Note {
      return PageHelper.initialize(Wizard)
    }
    
    // 'location' attribute on Scope at FNOLWizard_NewNoteWorksheet.pcf: line 17, column 44
    function location_0 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination(Wizard.Claim)
    }
    
    // 'parent' attribute on Worksheet (id=FNOLWizard_NewNoteWorksheet) at FNOLWizard_NewNoteWorksheet.pcf: line 13, column 70
    static function parent_8 (Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination(Wizard.Claim)
    }
    
    // 'startEditing' attribute on Worksheet (id=FNOLWizard_NewNoteWorksheet) at FNOLWizard_NewNoteWorksheet.pcf: line 13, column 70
    function startEditing_9 () : void {
      Note.setInitialValues()
    }
    
    override property get CurrentLocation () : pcf.FNOLWizard_NewNoteWorksheet {
      return super.CurrentLocation as pcf.FNOLWizard_NewNoteWorksheet
    }
    
    property get Note () : Note {
      return getVariableValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setVariableValue("Note", 0, $arg)
    }
    
    property get PageHelper () : gw.api.note.NewClaimNotesPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.note.NewClaimNotesPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.note.NewClaimNotesPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    function submitWorksheet() {
      if (Note.Body.HasContent) {
        PageHelper.commitNote()
        CurrentLocation.cancel()
      } else {
        throw new gw.api.util.DisplayableException(DisplayKey.get("JSP.NewClaimNote.Add.NoteBodyRequired"))
      }
    }
    
    function cancelWorksheet() {
      PageHelper.cancelNote()
      CurrentLocation.cancel()
    }
    
    
  }
  
  
}