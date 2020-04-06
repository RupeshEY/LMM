package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickNoteTemplatePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickNoteTemplatePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (lob :  LossType) : int {
      return 0
    }
    
    static function __constructorIndex (searchCriteria :  NoteTemplateSearchCriteria) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=PickNoteTemplatePopup_CancelButton) at PickNoteTemplatePopup.pcf: line 27, column 25
    function action_1 () : void {
      CurrentLocation.cancel();
    }
    
    // 'initialValue' attribute on Variable at PickNoteTemplatePopup.pcf: line 19, column 42
    function initialValue_0 () : NoteTemplateSearchCriteria {
      return initializeSearchCriteria()
    }
    
    override property get CurrentLocation () : pcf.PickNoteTemplatePopup {
      return super.CurrentLocation as pcf.PickNoteTemplatePopup
    }
    
    property get lob () : LossType {
      return getVariableValue("lob", 0) as LossType
    }
    
    property set lob ($arg :  LossType) {
      setVariableValue("lob", 0, $arg)
    }
    
    property get searchCriteria () : NoteTemplateSearchCriteria {
      return getVariableValue("searchCriteria", 0) as NoteTemplateSearchCriteria
    }
    
    property set searchCriteria ($arg :  NoteTemplateSearchCriteria) {
      setVariableValue("searchCriteria", 0, $arg)
    }
    
    function initializeSearchCriteria() : NoteTemplateSearchCriteria {
      var rtn = new NoteTemplateSearchCriteria(); 
      if (lob != null) {
        rtn.Lob = lob;
      }
      rtn.Language = gw.api.util.LocaleUtil.toLanguageType(User.util.CurrentLocale)
      return rtn
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends PickNoteTemplatePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PickNoteTemplatePopup.pcf: line 37, column 67
    function def_onEnter_2 (def :  pcf.NoteTemplateSearchDV) : void {
      def.onEnter(NoteTemplateSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickNoteTemplatePopup.pcf: line 39, column 76
    function def_onEnter_4 (def :  pcf.NoteTemplateSearchResultLV) : void {
      def.onEnter(NoteTemplateSearchResultsList)
    }
    
    // 'def' attribute on PanelRef at PickNoteTemplatePopup.pcf: line 37, column 67
    function def_refreshVariables_3 (def :  pcf.NoteTemplateSearchDV) : void {
      def.refreshVariables(NoteTemplateSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickNoteTemplatePopup.pcf: line 39, column 76
    function def_refreshVariables_5 (def :  pcf.NoteTemplateSearchResultLV) : void {
      def.refreshVariables(NoteTemplateSearchResultsList)
    }
    
    // 'searchCriteria' attribute on SearchPanel at PickNoteTemplatePopup.pcf: line 35, column 57
    function searchCriteria_7 () : entity.NoteTemplateSearchCriteria {
      return searchCriteria.copy() as NoteTemplateSearchCriteria
    }
    
    // 'search' attribute on SearchPanel at PickNoteTemplatePopup.pcf: line 35, column 57
    function search_6 () : java.lang.Object {
      return NoteTemplateSearchCriteria.performSearch()
    }
    
    property get NoteTemplateSearchCriteria () : entity.NoteTemplateSearchCriteria {
      return getCriteriaValue(1) as entity.NoteTemplateSearchCriteria
    }
    
    property set NoteTemplateSearchCriteria ($arg :  entity.NoteTemplateSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get NoteTemplateSearchResultsList () : NoteTemplateSearchResults[] {
      return getResultsValue(1) as NoteTemplateSearchResults[]
    }
    
    
  }
  
  
}