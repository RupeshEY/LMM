package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicySelectPolicyPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicySelectPolicyPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'parent' attribute on Popup (id=ClaimPolicySelectPolicyPopup) at ClaimPolicySelectPolicyPopup.pcf: line 9, column 70
    static function parent_6 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicySelectPolicyPopup {
      return super.CurrentLocation as pcf.ClaimPolicySelectPolicyPopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimPolicySelectPolicyPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicySelectPolicyPopup.pcf: line 26, column 55
    function def_onEnter_0 (def :  pcf.PolicySearchDV) : void {
      def.onEnter(PolicySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicySelectPolicyPopup.pcf: line 28, column 95
    function def_onEnter_2 (def :  pcf.PolicySearchResultLV) : void {
      def.onEnter(PolicySummaryList, PolicySearchCriteria.IncludeArchived)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicySelectPolicyPopup.pcf: line 26, column 55
    function def_refreshVariables_1 (def :  pcf.PolicySearchDV) : void {
      def.refreshVariables(PolicySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicySelectPolicyPopup.pcf: line 28, column 95
    function def_refreshVariables_3 (def :  pcf.PolicySearchResultLV) : void {
      def.refreshVariables(PolicySummaryList, PolicySearchCriteria.IncludeArchived)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimPolicySelectPolicyPopup.pcf: line 24, column 83
    function searchCriteria_5 () : entity.PolicySearchCriteria {
      var c = new PolicySearchCriteria(); c.initialize(Claim); return c;
    }
    
    // 'search' attribute on SearchPanel at ClaimPolicySelectPolicyPopup.pcf: line 24, column 83
    function search_4 () : java.lang.Object {
      return PolicySearchCriteria.performSearch()
    }
    
    property get PolicySearchCriteria () : entity.PolicySearchCriteria {
      return getCriteriaValue(1) as entity.PolicySearchCriteria
    }
    
    property set PolicySearchCriteria ($arg :  entity.PolicySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get PolicySummaryList () : gw.api.database.IQueryBeanResult<PolicySummary> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<PolicySummary>
    }
    
    
  }
  
  
}