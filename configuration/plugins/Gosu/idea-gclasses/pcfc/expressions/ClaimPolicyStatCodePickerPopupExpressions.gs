package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyStatCodePickerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodePickerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyStatCodePickerPopup_CancelButton) at ClaimPolicyStatCodePickerPopup.pcf: line 28, column 25
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyStatCodePickerPopup.pcf: line 20, column 29
    function initialValue_0 () : entity.Policy {
      return Claim.Policy
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyStatCodePickerPopup {
      return super.CurrentLocation as pcf.ClaimPolicyStatCodePickerPopup
    }
    
    property get Policy () : entity.Policy {
      return getVariableValue("Policy", 0) as entity.Policy
    }
    
    property set Policy ($arg :  entity.Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimPolicyStatCodePickerPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodePickerPopup.pcf: line 40, column 51
    function def_onEnter_2 (def :  pcf.StatCodeFilterDV) : void {
      def.onEnter(FilterCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodePickerPopup.pcf: line 42, column 48
    function def_onEnter_4 (def :  pcf.StatCodePickerLV) : void {
      def.onEnter(StatCodeList)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodePickerPopup.pcf: line 40, column 51
    function def_refreshVariables_3 (def :  pcf.StatCodeFilterDV) : void {
      def.refreshVariables(FilterCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodePickerPopup.pcf: line 42, column 48
    function def_refreshVariables_5 (def :  pcf.StatCodePickerLV) : void {
      def.refreshVariables(StatCodeList)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimPolicyStatCodePickerPopup.pcf: line 38, column 40
    function searchCriteria_7 () : entity.PolicyStatCodeFilterCriteria {
      var c = new PolicyStatCodeFilterCriteria(); c.Policy = Policy; return c;
    }
    
    // 'search' attribute on SearchPanel at ClaimPolicyStatCodePickerPopup.pcf: line 38, column 40
    function search_6 () : java.lang.Object {
      return gw.api.upgrade.Coercions.makeArray<entity.StatCode>(FilterCriteria.FilteredPolicyStatCodes)
    }
    
    property get FilterCriteria () : entity.PolicyStatCodeFilterCriteria {
      return getCriteriaValue(1) as entity.PolicyStatCodeFilterCriteria
    }
    
    property set FilterCriteria ($arg :  entity.PolicyStatCodeFilterCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get StatCodeList () : StatCode[] {
      return getResultsValue(1) as StatCode[]
    }
    
    
  }
  
  
}