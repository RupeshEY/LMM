package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewNoteWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNoteWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewNoteWorksheet_AddDocumentButton) at NewNoteWorksheet.pcf: line 53, column 125
    function action_10 () : void {
      PickExistingDocumentPopup.push(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewNoteWorksheet_UseTemplateButton) at NewNoteWorksheet.pcf: line 44, column 25
    function action_5 () : void {
      PickNoteTemplatePopup.push(templateSearchCriteria)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewNoteWorksheet_AddDocumentButton) at NewNoteWorksheet.pcf: line 53, column 125
    function action_dest_11 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewNoteWorksheet_UseTemplateButton) at NewNoteWorksheet.pcf: line 44, column 25
    function action_dest_6 () : pcf.api.Destination {
      return pcf.PickNoteTemplatePopup.createDestination(templateSearchCriteria)
    }
    
    // 'available' attribute on PickerToolbarButton (id=NewNoteWorksheet_AddDocumentButton) at NewNoteWorksheet.pcf: line 53, column 125
    function available_8 () : java.lang.Boolean {
      return documentActionsUIHelper.DocumentMetadataActionsAvailable
    }
    
    // 'canVisit' attribute on Worksheet (id=NewNoteWorksheet) at NewNoteWorksheet.pcf: line 13, column 70
    static function canVisit_15 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createnote(Claim)
    }
    
    // 'def' attribute on PanelRef at NewNoteWorksheet.pcf: line 56, column 47
    function def_onEnter_13 (def :  pcf.NoteDetailDV) : void {
      def.onEnter(Note, true, true)
    }
    
    // 'def' attribute on PanelRef at NewNoteWorksheet.pcf: line 56, column 47
    function def_refreshVariables_14 (def :  pcf.NoteDetailDV) : void {
      def.refreshVariables(Note, true, true)
    }
    
    // 'initialValue' attribute on Variable at NewNoteWorksheet.pcf: line 24, column 20
    function initialValue_1 () : Note {
      return Claim.addNote(null)
    }
    
    // 'initialValue' attribute on Variable at NewNoteWorksheet.pcf: line 28, column 42
    function initialValue_2 () : NoteTemplateSearchCriteria {
      return initializeTemplateSearchCriteria()
    }
    
    // 'initialValue' attribute on Variable at NewNoteWorksheet.pcf: line 32, column 52
    function initialValue_3 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // EditButtons at NewNoteWorksheet.pcf: line 37, column 32
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'location' attribute on Scope at NewNoteWorksheet.pcf: line 17, column 32
    function location_0 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=NewNoteWorksheet_AddDocumentButton) at NewNoteWorksheet.pcf: line 53, column 125
    function onPick_12 (PickedValue :  Document) : void {
      gw.api.note.NewNoteUtil.linkDocumentToNote(PickedValue, Note)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=NewNoteWorksheet_UseTemplateButton) at NewNoteWorksheet.pcf: line 44, column 25
    function onPick_7 (PickedValue :  NoteTemplateSearchResults) : void {
      Note.useTemplate( PickedValue, { "claim" -> Claim})
    }
    
    // 'parent' attribute on Worksheet (id=NewNoteWorksheet) at NewNoteWorksheet.pcf: line 13, column 70
    static function parent_16 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'startEditing' attribute on Worksheet (id=NewNoteWorksheet) at NewNoteWorksheet.pcf: line 13, column 70
    function startEditing_17 () : void {
      Note.setInitialValues()
    }
    
    // 'visible' attribute on PickerToolbarButton (id=NewNoteWorksheet_AddDocumentButton) at NewNoteWorksheet.pcf: line 53, column 125
    function visible_9 () : java.lang.Boolean {
      return gw.document.DocumentsUtil.claimHasDocuments(Claim) and perm.Claim.view(Claim) and perm.System.viewdocs
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewNoteWorksheet {
      return super.CurrentLocation as pcf.NewNoteWorksheet
    }
    
    property get Note () : Note {
      return getVariableValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setVariableValue("Note", 0, $arg)
    }
    
    property get documentActionsUIHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentActionsUIHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentActionsUIHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentActionsUIHelper", 0, $arg)
    }
    
    property get templateSearchCriteria () : NoteTemplateSearchCriteria {
      return getVariableValue("templateSearchCriteria", 0) as NoteTemplateSearchCriteria
    }
    
    property set templateSearchCriteria ($arg :  NoteTemplateSearchCriteria) {
      setVariableValue("templateSearchCriteria", 0, $arg)
    }
    
    function initializeTemplateSearchCriteria() : NoteTemplateSearchCriteria {
      var rtn = new NoteTemplateSearchCriteria()
      rtn.Language = gw.api.util.LocaleUtil.toLanguageType(User.util.CurrentLocale)
      rtn.AvailableSymbols = "Claim"
      return rtn
    }
    
    
  }
  
  
}