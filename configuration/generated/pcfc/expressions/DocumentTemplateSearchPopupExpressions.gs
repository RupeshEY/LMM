package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentTemplateSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, documentCreationInfo :  gw.document.DocumentCreationInfo) : int {
      return 0
    }
    
    static function __constructorIndex (symbolProvider :  gw.document.SymbolProvider) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=cancel) at DocumentTemplateSearchPopup.pcf: line 28, column 62
    function action_0 () : void {
      CurrentLocation.cancel()
    }
    
    override property get CurrentLocation () : pcf.DocumentTemplateSearchPopup {
      return super.CurrentLocation as pcf.DocumentTemplateSearchPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get documentCreationInfo () : gw.document.DocumentCreationInfo {
      return getVariableValue("documentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set documentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setVariableValue("documentCreationInfo", 0, $arg)
    }
    
    property get symbolProvider () : gw.document.SymbolProvider {
      return getVariableValue("symbolProvider", 0) as gw.document.SymbolProvider
    }
    
    property set symbolProvider ($arg :  gw.document.SymbolProvider) {
      setVariableValue("symbolProvider", 0, $arg)
    }
    
    function createSearchCriteria() : DocumentTemplateSearchCriteria {
          var rtn = new DocumentTemplateSearchCriteria()
          if (claim != null) {
            rtn.Language = claim.claimant.PrimaryLanguage
            rtn.State = claim.JurisdictionState
            rtn.Lob = claim.LOBCode
          } else if (documentCreationInfo != null && documentCreationInfo.DocumentTemplateDescriptor != null) {
            rtn.Language = gw.api.util.LocaleUtil.toLanguageType(documentCreationInfo.DocumentTemplateDescriptor.Language)
          }
          return rtn
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends DocumentTemplateSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at DocumentTemplateSearchPopup.pcf: line 41, column 59
    function def_onEnter_1 (def :  pcf.DocumentTemplateSearchDV) : void {
      def.onEnter(searchCriteria)
    }
    
    // 'def' attribute on PanelRef at DocumentTemplateSearchPopup.pcf: line 43, column 83
    function def_onEnter_3 (def :  pcf.DocumentTemplateSearchResultLV) : void {
      def.onEnter(DocumentTemplateSearchResultsList)
    }
    
    // 'def' attribute on PanelRef at DocumentTemplateSearchPopup.pcf: line 41, column 59
    function def_refreshVariables_2 (def :  pcf.DocumentTemplateSearchDV) : void {
      def.refreshVariables(searchCriteria)
    }
    
    // 'def' attribute on PanelRef at DocumentTemplateSearchPopup.pcf: line 43, column 83
    function def_refreshVariables_4 (def :  pcf.DocumentTemplateSearchResultLV) : void {
      def.refreshVariables(DocumentTemplateSearchResultsList)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at DocumentTemplateSearchPopup.pcf: line 39, column 61
    function maxSearchResults_5 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forDocumentTemplates()
    }
    
    // 'searchCriteria' attribute on SearchPanel at DocumentTemplateSearchPopup.pcf: line 39, column 61
    function searchCriteria_7 () : entity.DocumentTemplateSearchCriteria {
      return createSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at DocumentTemplateSearchPopup.pcf: line 39, column 61
    function search_6 () : java.lang.Object {
      return searchCriteria.performSearch(symbolProvider != null ? symbolProvider : documentCreationInfo)
    }
    
    property get DocumentTemplateSearchResultsList () : DocumentTemplateSearchResults[] {
      return getResultsValue(1) as DocumentTemplateSearchResults[]
    }
    
    property get searchCriteria () : entity.DocumentTemplateSearchCriteria {
      return getCriteriaValue(1) as entity.DocumentTemplateSearchCriteria
    }
    
    property set searchCriteria ($arg :  entity.DocumentTemplateSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}