package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (IncludesCarrier :  Boolean) : int {
      return 1
    }
    
    override property get CurrentLocation () : pcf.OrganizationSearchPopup {
      return super.CurrentLocation as pcf.OrganizationSearchPopup
    }
    
    property get IncludesCarrier () : Boolean {
      return getVariableValue("IncludesCarrier", 0) as Boolean
    }
    
    property set IncludesCarrier ($arg :  Boolean) {
      setVariableValue("IncludesCarrier", 0, $arg)
    }
    
    
          function createSearchCriteria() : OrganizationSearchCriteria {
            var criteria = new OrganizationSearchCriteria();
            if (IncludesCarrier) {
              criteria.Carrier = null;
            }
            return criteria;
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends OrganizationSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at OrganizationSearchPopup.pcf: line 29, column 55
    function def_onEnter_0 (def :  pcf.OrganizationSearchDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at OrganizationSearchPopup.pcf: line 31, column 71
    function def_onEnter_2 (def :  pcf.OrganizationSearchResultsLV) : void {
      def.onEnter(Organizations?.asQuery())
    }
    
    // 'def' attribute on PanelRef at OrganizationSearchPopup.pcf: line 29, column 55
    function def_refreshVariables_1 (def :  pcf.OrganizationSearchDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at OrganizationSearchPopup.pcf: line 31, column 71
    function def_refreshVariables_3 (def :  pcf.OrganizationSearchResultsLV) : void {
      def.refreshVariables(Organizations?.asQuery())
    }
    
    // 'searchCriteria' attribute on SearchPanel at OrganizationSearchPopup.pcf: line 27, column 44
    function searchCriteria_5 () : entity.OrganizationSearchCriteria {
      return createSearchCriteria();
    }
    
    // 'search' attribute on SearchPanel at OrganizationSearchPopup.pcf: line 27, column 44
    function search_4 () : java.lang.Object {
      return SearchCriteria.performSearch()
    }
    
    property get Organizations () : Organization[] {
      return getResultsValue(1) as Organization[]
    }
    
    property get SearchCriteria () : entity.OrganizationSearchCriteria {
      return getCriteriaValue(1) as entity.OrganizationSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.OrganizationSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}