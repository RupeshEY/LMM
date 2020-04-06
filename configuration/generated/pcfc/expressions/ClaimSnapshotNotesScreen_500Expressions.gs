package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotNotesScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotNotesScreen_500Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotNotesScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotNotesScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Topic) at ClaimSnapshotNotesScreen.500.pcf: line 39, column 44
    function valueRoot_11 () : java.lang.Object {
      return Note
    }
    
    // 'value' attribute on TextCell (id=Author) at ClaimSnapshotNotesScreen.500.pcf: line 30, column 44
    function valueRoot_6 () : java.lang.Object {
      return Note.Author
    }
    
    // 'value' attribute on TextCell (id=Subject) at ClaimSnapshotNotesScreen.500.pcf: line 44, column 44
    function value_12 () : dynamic.Dynamic {
      return Note.Subject
    }
    
    // 'value' attribute on TextCell (id=Author) at ClaimSnapshotNotesScreen.500.pcf: line 30, column 44
    function value_4 () : dynamic.Dynamic {
      return Note.Author.DisplayName
    }
    
    // 'value' attribute on TextCell (id=AuthoringDate) at ClaimSnapshotNotesScreen.500.pcf: line 34, column 70
    function value_7 () : java.lang.String {
      return util.Snapshot.renderValue(Note.AuthoringDate)
    }
    
    // 'value' attribute on TextCell (id=Topic) at ClaimSnapshotNotesScreen.500.pcf: line 39, column 44
    function value_9 () : dynamic.Dynamic {
      return Note.Topic
    }
    
    property get Note () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotNotesScreen.500.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotNotesScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.500.pcf: line 30, column 44
    function sortValue_0 (Note :  dynamic.Dynamic) : java.lang.Object {
      return Note.Author.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.500.pcf: line 34, column 70
    function sortValue_1 (Note :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Note.AuthoringDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.500.pcf: line 39, column 44
    function sortValue_2 (Note :  dynamic.Dynamic) : java.lang.Object {
      return Note.Topic
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.500.pcf: line 44, column 44
    function sortValue_3 (Note :  dynamic.Dynamic) : java.lang.Object {
      return Note.Subject
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotNotesCard) at ClaimSnapshotNotesScreen.500.pcf: line 51, column 137
    function title_45 () : java.lang.String {
      return (SelectedNote.Author.DisplayName + " - " + util.Snapshot.renderValue(SelectedNote.AuthoringDate)) as String
    }
    
    // 'value' attribute on TextInput (id=Topic) at ClaimSnapshotNotesScreen.500.pcf: line 64, column 46
    function valueRoot_20 () : java.lang.Object {
      return SelectedNote
    }
    
    // 'value' attribute on TextInput (id=Exposure) at ClaimSnapshotNotesScreen.500.pcf: line 77, column 58
    function valueRoot_28 () : java.lang.Object {
      return SelectedNote.Exposure
    }
    
    // 'value' attribute on TextInput (id=Matter) at ClaimSnapshotNotesScreen.500.pcf: line 83, column 56
    function valueRoot_33 () : java.lang.Object {
      return SelectedNote.Matter
    }
    
    // 'value' attribute on TextInput (id=Claim) at ClaimSnapshotNotesScreen.500.pcf: line 89, column 90
    function valueRoot_38 () : java.lang.Object {
      return SelectedNote.Claim
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotNotesScreen.500.pcf: line 24, column 39
    function value_15 () : dynamic.Dynamic {
      return util.Snapshot.getViewableNotes(Claim, SnapshotParam.Notes)
    }
    
    // 'value' attribute on TextInput (id=By) at ClaimSnapshotNotesScreen.500.pcf: line 59, column 46
    function value_16 () : dynamic.Dynamic {
      return SelectedNote.Author.DisplayName + " - " + util.Snapshot.renderValue(SelectedNote.AuthoringDate)
    }
    
    // 'value' attribute on TextInput (id=Topic) at ClaimSnapshotNotesScreen.500.pcf: line 64, column 46
    function value_18 () : dynamic.Dynamic {
      return SelectedNote.Topic
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at ClaimSnapshotNotesScreen.500.pcf: line 71, column 46
    function value_21 () : dynamic.Dynamic {
      return SelectedNote.Confidential
    }
    
    // 'value' attribute on TextInput (id=Exposure) at ClaimSnapshotNotesScreen.500.pcf: line 77, column 58
    function value_25 () : dynamic.Dynamic {
      return SelectedNote.Exposure.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Matter) at ClaimSnapshotNotesScreen.500.pcf: line 83, column 56
    function value_30 () : dynamic.Dynamic {
      return SelectedNote.Matter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Claim) at ClaimSnapshotNotesScreen.500.pcf: line 89, column 90
    function value_35 () : dynamic.Dynamic {
      return SelectedNote.Claim.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=Subject) at ClaimSnapshotNotesScreen.500.pcf: line 94, column 46
    function value_39 () : dynamic.Dynamic {
      return SelectedNote.Subject
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at ClaimSnapshotNotesScreen.500.pcf: line 101, column 46
    function value_42 () : dynamic.Dynamic {
      return SelectedNote.Body
    }
    
    // 'visible' attribute on TextInput (id=Exposure) at ClaimSnapshotNotesScreen.500.pcf: line 77, column 58
    function visible_24 () : java.lang.Boolean {
      return SelectedNote.Exposure != null
    }
    
    // 'visible' attribute on TextInput (id=Matter) at ClaimSnapshotNotesScreen.500.pcf: line 83, column 56
    function visible_29 () : java.lang.Boolean {
      return SelectedNote.Matter != null
    }
    
    // 'visible' attribute on TextInput (id=Claim) at ClaimSnapshotNotesScreen.500.pcf: line 89, column 90
    function visible_34 () : java.lang.Boolean {
      return SelectedNote.Exposure == null and SelectedNote.Matter == null
    }
    
    property get SelectedNote () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedNote ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}