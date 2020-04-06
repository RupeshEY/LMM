package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NoteTemplateSearchResultLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NoteTemplateSearchResultLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 16, column 54
    function pickValue_22 () : NoteTemplateSearchResults {
      return NoteTemplateSearchResults
    }
    
    // 'value' attribute on TextCell (id=Template) at NoteTemplateSearchResultLV.pcf: line 21, column 51
    function valueRoot_8 () : java.lang.Object {
      return NoteTemplateSearchResults
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at NoteTemplateSearchResultLV.pcf: line 31, column 41
    function value_12 () : typekey.NoteType {
      return NoteTemplateSearchResults.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Language) at NoteTemplateSearchResultLV.pcf: line 37, column 69
    function value_16 () : typekey.LanguageType {
      return NoteTemplateSearchResults.Language
    }
    
    // 'value' attribute on TextCell (id=LossType) at NoteTemplateSearchResultLV.pcf: line 42, column 56
    function value_19 () : java.lang.String {
      return NoteTemplateSearchResults.LossTypes
    }
    
    // 'value' attribute on TextCell (id=Template) at NoteTemplateSearchResultLV.pcf: line 21, column 51
    function value_6 () : java.lang.String {
      return NoteTemplateSearchResults.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=Topic) at NoteTemplateSearchResultLV.pcf: line 26, column 46
    function value_9 () : typekey.NoteTopicType {
      return NoteTemplateSearchResults.Topic
    }
    
    // 'visible' attribute on TypeKeyCell (id=Language) at NoteTemplateSearchResultLV.pcf: line 37, column 69
    function visible_15 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get NoteTemplateSearchResults () : entity.NoteTemplateSearchResults {
      return getIteratedValue(1) as entity.NoteTemplateSearchResults
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoteTemplateSearchResultLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 21, column 51
    function sortValue_0 (NoteTemplateSearchResults :  entity.NoteTemplateSearchResults) : java.lang.Object {
      return NoteTemplateSearchResults.Name
    }
    
    // 'value' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 26, column 46
    function sortValue_1 (NoteTemplateSearchResults :  entity.NoteTemplateSearchResults) : java.lang.Object {
      return NoteTemplateSearchResults.Topic
    }
    
    // 'value' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 31, column 41
    function sortValue_2 (NoteTemplateSearchResults :  entity.NoteTemplateSearchResults) : java.lang.Object {
      return NoteTemplateSearchResults.Type
    }
    
    // 'value' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 37, column 69
    function sortValue_4 (NoteTemplateSearchResults :  entity.NoteTemplateSearchResults) : java.lang.Object {
      return NoteTemplateSearchResults.Language
    }
    
    // 'sortBy' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 42, column 56
    function sortValue_5 (NoteTemplateSearchResults :  entity.NoteTemplateSearchResults) : java.lang.Object {
      return NoteTemplateSearchResults.LossTypes
    }
    
    // 'value' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 16, column 54
    function value_23 () : entity.NoteTemplateSearchResults[] {
      return NoteTemplateSearchResultsList
    }
    
    // 'visible' attribute on RowIterator at NoteTemplateSearchResultLV.pcf: line 37, column 69
    function visible_3 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get NoteTemplateSearchResultsList () : NoteTemplateSearchResults[] {
      return getRequireValue("NoteTemplateSearchResultsList", 0) as NoteTemplateSearchResults[]
    }
    
    property set NoteTemplateSearchResultsList ($arg :  NoteTemplateSearchResults[]) {
      setRequireValue("NoteTemplateSearchResultsList", 0, $arg)
    }
    
    
    // Not used, the search criteria perform search, does this for us
    // but left for if they decided they would rather the search result retruned
    // codes
    function formatLOB(lobStr : String) : String {
      if (lobStr == null) {
        return null
      }
      return lobStr.split(",").map(\ s -> (typekey.LossType.get(s)).DisplayName).join(",")
    }
          
        
    
    
  }
  
  
}