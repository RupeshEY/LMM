package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickExistingDocumentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickExistingDocumentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PickExistingDocumentPopup_CancelButton) at PickExistingDocumentPopup.pcf: line 23, column 62
    function action_0 () : void {
      CurrentLocation.cancel();
    }
    
    // 'canVisit' attribute on Popup (id=PickExistingDocumentPopup) at PickExistingDocumentPopup.pcf: line 11, column 79
    static function canVisit_7 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewdocs
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.PickExistingDocumentPopup {
      return super.CurrentLocation as pcf.PickExistingDocumentPopup
    }
    
    
          function createSearchCriteria() : DocumentSearchCriteria {
            var searchCriteria = new DocumentSearchCriteria();
            searchCriteria.Claim = Claim;
            searchCriteria.IncludeObsoletes = false;
            return searchCriteria;
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends PickExistingDocumentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PickExistingDocumentPopup.pcf: line 34, column 63
    function def_onEnter_1 (def :  pcf.ClaimDocumentSearchDV) : void {
      def.onEnter(DocumentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickExistingDocumentPopup.pcf: line 39, column 55
    function def_onEnter_3 (def :  pcf.PickExistingDocumentsLV) : void {
      def.onEnter(DocumentList)
    }
    
    // 'def' attribute on PanelRef at PickExistingDocumentPopup.pcf: line 34, column 63
    function def_refreshVariables_2 (def :  pcf.ClaimDocumentSearchDV) : void {
      def.refreshVariables(DocumentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickExistingDocumentPopup.pcf: line 39, column 55
    function def_refreshVariables_4 (def :  pcf.PickExistingDocumentsLV) : void {
      def.refreshVariables(DocumentList)
    }
    
    // 'searchCriteria' attribute on SearchPanel at PickExistingDocumentPopup.pcf: line 32, column 78
    function searchCriteria_6 () : entity.DocumentSearchCriteria {
      return createSearchCriteria();
    }
    
    // 'search' attribute on SearchPanel at PickExistingDocumentPopup.pcf: line 32, column 78
    function search_5 () : java.lang.Object {
      return DocumentSearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Document>
    }
    
    property get DocumentList () : gw.api.database.IQueryBeanResult<Document> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Document>
    }
    
    property get DocumentSearchCriteria () : entity.DocumentSearchCriteria {
      return getCriteriaValue(1) as entity.DocumentSearchCriteria
    }
    
    property set DocumentSearchCriteria ($arg :  entity.DocumentSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}