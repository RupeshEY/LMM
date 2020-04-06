package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/EditNote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditNoteExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/EditNote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNoteExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Note :  Note, Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=EditNote_DeleteButton) at EditNote.pcf: line 35, column 45
    function action_1 () : void {
      Claim.removeFromNotes(Note); CurrentLocation.commit()
    }
    
    // 'afterCancel' attribute on Page (id=EditNote) at EditNote.pcf: line 13, column 59
    function afterCancel_4 () : void {
      ClaimNotes.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=EditNote) at EditNote.pcf: line 13, column 59
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.ClaimNotes.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=EditNote) at EditNote.pcf: line 13, column 59
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      ClaimNotes.go(Claim)
    }
    
    // 'def' attribute on PanelRef at EditNote.pcf: line 38, column 47
    function def_onEnter_2 (def :  pcf.NoteDetailDV) : void {
      def.onEnter(Note, true, true)
    }
    
    // 'def' attribute on PanelRef at EditNote.pcf: line 38, column 47
    function def_refreshVariables_3 (def :  pcf.NoteDetailDV) : void {
      def.refreshVariables(Note, true, true)
    }
    
    // 'parent' attribute on Page (id=EditNote) at EditNote.pcf: line 13, column 59
    static function parent_7 (Claim :  Claim, Note :  Note) : pcf.api.Destination {
      return pcf.ClaimNotes.createDestination(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=EditNote_DeleteButton) at EditNote.pcf: line 35, column 45
    function visible_0 () : java.lang.Boolean {
      return perm.Note.delete(Note)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.EditNote {
      return super.CurrentLocation as pcf.EditNote
    }
    
    property get Note () : Note {
      return getVariableValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setVariableValue("Note", 0, $arg)
    }
    
    
  }
  
  
}