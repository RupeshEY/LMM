package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotNotesScreen_300Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotNotesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Topic) at ClaimSnapshotNotesScreen.300.pcf: line 38, column 44
    function valueRoot_10 () : java.lang.Object {
      return Note
    }
    
    // 'value' attribute on TextCell (id=Subject) at ClaimSnapshotNotesScreen.300.pcf: line 43, column 44
    function value_11 () : dynamic.Dynamic {
      return Note.Subject
    }
    
    // 'value' attribute on TextCell (id=Author) at ClaimSnapshotNotesScreen.300.pcf: line 29, column 110
    function value_4 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Note, "Author") )
    }
    
    // 'value' attribute on TextCell (id=AuthoringDate) at ClaimSnapshotNotesScreen.300.pcf: line 33, column 70
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Note.AuthoringDate)
    }
    
    // 'value' attribute on TextCell (id=Topic) at ClaimSnapshotNotesScreen.300.pcf: line 38, column 44
    function value_8 () : dynamic.Dynamic {
      return Note.Topic
    }
    
    property get Note () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotNotesScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotNotesScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.300.pcf: line 29, column 110
    function sortValue_0 (Note :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Note, "Author") )
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.300.pcf: line 33, column 70
    function sortValue_1 (Note :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Note.AuthoringDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.300.pcf: line 38, column 44
    function sortValue_2 (Note :  dynamic.Dynamic) : java.lang.Object {
      return Note.Topic
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.300.pcf: line 43, column 44
    function sortValue_3 (Note :  dynamic.Dynamic) : java.lang.Object {
      return Note.Subject
    }
    
    // 'value' attribute on TextInput (id=Topic) at ClaimSnapshotNotesScreen.300.pcf: line 62, column 46
    function valueRoot_19 () : java.lang.Object {
      return SelectedNote
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.300.pcf: line 24, column 39
    function value_14 () : dynamic.Dynamic {
      return SnapshotParam.Notes
    }
    
    // 'value' attribute on TextInput (id=By) at ClaimSnapshotNotesScreen.300.pcf: line 57, column 147
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(SelectedNote.Author) + " - " + util.Snapshot.renderValue(SelectedNote.AuthoringDate)
    }
    
    // 'value' attribute on TextInput (id=Topic) at ClaimSnapshotNotesScreen.300.pcf: line 62, column 46
    function value_17 () : dynamic.Dynamic {
      return SelectedNote.Topic
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at ClaimSnapshotNotesScreen.300.pcf: line 69, column 46
    function value_20 () : dynamic.Dynamic {
      return SelectedNote.Confidential
    }
    
    // 'value' attribute on TextInput (id=Exposure) at ClaimSnapshotNotesScreen.300.pcf: line 75, column 103
    function value_24 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(SelectedNote, "Exposure")
    }
    
    // 'value' attribute on TextInput (id=Matter) at ClaimSnapshotNotesScreen.300.pcf: line 81, column 100
    function value_28 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(SelectedNote, "Claim")
    }
    
    // 'value' attribute on TextInput (id=Subject) at ClaimSnapshotNotesScreen.300.pcf: line 91, column 46
    function value_33 () : dynamic.Dynamic {
      return SelectedNote.Subject
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at ClaimSnapshotNotesScreen.300.pcf: line 98, column 46
    function value_36 () : dynamic.Dynamic {
      return SelectedNote.Body
    }
    
    // 'visible' attribute on TextInput (id=Exposure) at ClaimSnapshotNotesScreen.300.pcf: line 75, column 103
    function visible_23 () : java.lang.Boolean {
      return util.Snapshot.getPropertyValue(SelectedNote, "Exposure") != null
    }
    
    // 'visible' attribute on TextInput (id=Matter) at ClaimSnapshotNotesScreen.300.pcf: line 81, column 100
    function visible_27 () : java.lang.Boolean {
      return util.Snapshot.getPropertyValue(SelectedNote, "Claim") != null
    }
    
    // 'visible' attribute on TextInput (id=Claim) at ClaimSnapshotNotesScreen.300.pcf: line 86, column 179
    function visible_31 () : java.lang.Boolean {
      return util.Snapshot.getPropertyValue(SelectedNote, "Exposure") == null and util.Snapshot.getPropertyValue(SelectedNote, "Claim") == null
    }
    
    property get SelectedNote () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedNote ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}