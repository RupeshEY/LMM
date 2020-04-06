package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NotesSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NotesSearchScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/NotesSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=EditLink) at NotesSearchScreen.pcf: line 121, column 73
    function action_71 () : void {
      EditNote.drilldown(Note, Note.Claim)
    }
    
    // 'action' attribute on Link (id=DeleteLink) at NotesSearchScreen.pcf: line 131, column 75
    function action_74 () : void {
      gw.api.note.NotesUtilBase.deleteNote(Note)
    }
    
    // 'action' attribute on Link (id=PrintLink) at NotesSearchScreen.pcf: line 141, column 74
    function action_75 () : void {
      gw.api.print.PrintNoteAction.printNote(Note)
    }
    
    // 'action' attribute on Link (id=EditLink) at NotesSearchScreen.pcf: line 121, column 73
    function action_dest_72 () : pcf.api.Destination {
      return pcf.EditNote.createDestination(Note, Note.Claim)
    }
    
    // 'available' attribute on Link (id=EditLink) at NotesSearchScreen.pcf: line 121, column 73
    function available_70 () : java.lang.Boolean {
      return perm.Note.edit( Note )
    }
    
    // 'available' attribute on Link (id=DeleteLink) at NotesSearchScreen.pcf: line 131, column 75
    function available_73 () : java.lang.Boolean {
      return perm.Note.delete( Note )
    }
    
    // 'label' attribute on TextInput (id=AuthoringDate) at NotesSearchScreen.pcf: line 177, column 41
    function label_86 () : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(Note.AuthoringDate, "medium") + " " + gw.api.util.StringUtil.formatTime(Note.AuthoringDate, "short")
    }
    
    // 'value' attribute on TextInput (id=Author) at NotesSearchScreen.pcf: line 148, column 52
    function valueRoot_78 () : java.lang.Object {
      return Note.Author
    }
    
    // 'value' attribute on TextInput (id=Topic) at NotesSearchScreen.pcf: line 155, column 54
    function valueRoot_81 () : java.lang.Object {
      return Note
    }
    
    // 'value' attribute on TextInput (id=Author) at NotesSearchScreen.pcf: line 148, column 52
    function value_76 () : java.lang.String {
      return Note.Author.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Topic) at NotesSearchScreen.pcf: line 155, column 54
    function value_79 () : typekey.NoteTopicType {
      return Note.Topic
    }
    
    // 'value' attribute on TextInput (id=RelatedTo) at NotesSearchScreen.pcf: line 161, column 52
    function value_82 () : java.lang.String {
      return Note.getNoteRelatedTo()
    }
    
    // 'value' attribute on TextInput (id=Subject) at NotesSearchScreen.pcf: line 182, column 51
    function value_89 () : java.lang.String {
      return Note.Subject
    }
    
    // 'value' attribute on NoteBodyInput (id=Body) at NotesSearchScreen.pcf: line 186, column 38
    function value_93 () : java.lang.String {
      return Note.Body
    }
    
    // 'visible' attribute on TextInput (id=Confidential) at NotesSearchScreen.pcf: line 166, column 48
    function visible_84 () : java.lang.Boolean {
      return Note.Confidential
    }
    
    // 'visible' attribute on TextInput (id=Subject) at NotesSearchScreen.pcf: line 182, column 51
    function visible_88 () : java.lang.Boolean {
      return Note.Subject != null
    }
    
    property get Note () : entity.Note {
      return getIteratedValue(2) as entity.Note
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/notes/NotesSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    function createSearchCriteria() : NoteSearchCriteria {
            var searchCriteria = new NoteSearchCriteria();
            searchCriteria.Claim = Claim;
            //Default criteria values
            searchCriteria.SortBy = SortByRange.TC_DATE
            searchCriteria.RelatedTo = Claim
            return searchCriteria;
          }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/notes/NotesSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends NotesSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function available_25 () : java.lang.Boolean {
      return NoteSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function available_35 () : java.lang.Boolean {
      return NoteSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'def' attribute on InputSetRef at NotesSearchScreen.pcf: line 92, column 45
    function def_onEnter_68 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at NotesSearchScreen.pcf: line 92, column 45
    function def_refreshVariables_69 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TextInput (id=TextSearch) at NotesSearchScreen.pcf: line 31, column 46
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.Text = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NotesSearchScreen.pcf: line 57, column 48
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.Topic = (__VALUE_TO_SET as typekey.NoteTopicType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.DateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.DateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.DateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.DateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.DateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NotesSearchScreen.pcf: line 72, column 71
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.Author = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TypeKeyInput (id=SortByOption) at NotesSearchScreen.pcf: line 81, column 46
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.SortBy = (__VALUE_TO_SET as typekey.SortByRange)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SortAscending) at NotesSearchScreen.pcf: line 88, column 55
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteSearchCriteria.SortAscending = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at NotesSearchScreen.pcf: line 22, column 72
    function maxSearchResults_97 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forNotes()
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function optionGroupLabel_15 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function optionLabel_16 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'searchCriteria' attribute on SearchPanel at NotesSearchScreen.pcf: line 22, column 72
    function searchCriteria_99 () : entity.NoteSearchCriteria {
      return createSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at NotesSearchScreen.pcf: line 22, column 72
    function search_98 () : java.lang.Object {
      NoteSearchCriteria.Activity = Activity; return NoteSearchCriteria.performSearch(Claim) as gw.api.database.IQueryBeanResult<Note>
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function valueRange_17 () : java.lang.Object {
      return Claim.RelatedToCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function valueRange_8 () : java.lang.Object {
      return Claim.ViewableNoteAuthors
    }
    
    // 'value' attribute on TextInput (id=TextSearch) at NotesSearchScreen.pcf: line 31, column 46
    function valueRoot_3 () : java.lang.Object {
      return NoteSearchCriteria
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function valueRoot_30 () : java.lang.Object {
      return NoteSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on TextInput (id=TextSearch) at NotesSearchScreen.pcf: line 31, column 46
    function value_0 () : java.lang.String {
      return NoteSearchCriteria.Text
    }
    
    // 'value' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function value_11 () : gw.pl.persistence.core.Bean {
      return NoteSearchCriteria.RelatedTo
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NotesSearchScreen.pcf: line 57, column 48
    function value_20 () : typekey.NoteTopicType {
      return NoteSearchCriteria.Topic
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_24 () : entity.DateCriterionChoice {
      return NoteSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_26 () : java.lang.Object {
      return NoteSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_28 () : typekey.DateRangeChoiceType {
      return NoteSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_31 () : typekey.DateSearchType {
      return NoteSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_34 () : java.lang.Object {
      return NoteSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_36 () : java.util.Date {
      return NoteSearchCriteria.DateCriterionChoice.StartDate
    }
    
    // 'value' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function value_4 () : entity.User {
      return NoteSearchCriteria.Author
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch2) at NotesSearchScreen.pcf: line 64, column 61
    function value_42 () : java.util.Date {
      return NoteSearchCriteria.DateCriterionChoice.EndDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NotesSearchScreen.pcf: line 72, column 71
    function value_55 () : typekey.LanguageType {
      return NoteSearchCriteria.Language
    }
    
    // 'value' attribute on TypeKeyInput (id=SortByOption) at NotesSearchScreen.pcf: line 81, column 46
    function value_60 () : typekey.SortByRange {
      return NoteSearchCriteria.SortBy
    }
    
    // 'value' attribute on BooleanRadioInput (id=SortAscending) at NotesSearchScreen.pcf: line 88, column 55
    function value_64 () : java.lang.Boolean {
      return NoteSearchCriteria.SortAscending
    }
    
    // 'value' attribute on RowIterator at NotesSearchScreen.pcf: line 106, column 77
    function value_96 () : gw.api.database.IQueryBeanResult<entity.Note> {
      return NotesList
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Author) at NotesSearchScreen.pcf: line 39, column 38
    function verifyValueRange_10 () : void {
      var __valueRangeArg = Claim.ViewableNoteAuthors
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToSearch) at NotesSearchScreen.pcf: line 50, column 54
    function verifyValueRange_19 () : void {
      var __valueRangeArg = Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at NotesSearchScreen.pcf: line 72, column 71
    function visible_54 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get NoteSearchCriteria () : entity.NoteSearchCriteria {
      return getCriteriaValue(1) as entity.NoteSearchCriteria
    }
    
    property set NoteSearchCriteria ($arg :  entity.NoteSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get NotesList () : gw.api.database.IQueryBeanResult<Note> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Note>
    }
    
    
  }
  
  
}