package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationRiskDetailPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends PolicyLocationRiskDetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 40, column 52
    function def_onEnter_4 (def :  pcf.LocationBasedRULV) : void {
      def.onEnter(PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 47, column 71
    function def_onEnter_6 (def :  pcf.PolicyLocationRUDetailsDV) : void {
      def.onEnter(RU as LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 55, column 72
    function def_onEnter_8 (def :  pcf.LocationCoverageListDetail) : void {
      def.onEnter(RU as LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 40, column 52
    function def_refreshVariables_5 (def :  pcf.LocationBasedRULV) : void {
      def.refreshVariables(PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 47, column 71
    function def_refreshVariables_7 (def :  pcf.PolicyLocationRUDetailsDV) : void {
      def.refreshVariables(RU as LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationRiskDetailPanelSet.pcf: line 55, column 72
    function def_refreshVariables_9 (def :  pcf.LocationCoverageListDetail) : void {
      def.refreshVariables(RU as LocationBasedRU)
    }
    
    property get RU () : RiskUnit {
      return getCurrentSelection(1) as RiskUnit
    }
    
    property set RU ($arg :  RiskUnit) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationRiskDetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on AddButton (id=AddLocationRisk) at PolicyLocationRiskDetailPanelSet.pcf: line 21, column 142
    function label_0 () : java.lang.Object {
      return DisplayKey.get("NVV.Policy.LocationDetail.Property.Risks.Add", typekey.RiskUnit.TC_LOCATIONBASEDRU.DisplayName)
    }
    
    // 'label' attribute on AddButton (id=AddMiscLocationRisk) at PolicyLocationRiskDetailPanelSet.pcf: line 28, column 115
    function label_2 () : java.lang.Object {
      return DisplayKey.get("NVV.Policy.LocationDetail.Property.Risks.Add", typekey.RiskUnit.TC_LOCATIONMISCRU.DisplayName)
    }
    
    // 'toCreateAndAdd' attribute on AddButton (id=AddMiscLocationRisk) at PolicyLocationRiskDetailPanelSet.pcf: line 28, column 115
    function toCreateAndAdd_3 (CheckedValues :  Object[]) : java.lang.Object {
      return PolicyLocation.addLocationBasedRU(typekey.RiskUnit.TC_LOCATIONMISCRU.Description)
    }
    
    // 'visible' attribute on AddButton (id=AddMiscLocationRisk) at PolicyLocationRiskDetailPanelSet.pcf: line 28, column 115
    function visible_1 () : java.lang.Boolean {
      return Policy.Claim.LOBCode != TC_WORKERSCOMPLINE and Policy.Claim.LOBCode != TC_HOMEOWNERSLINE_HOE
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getRequireValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setRequireValue("PolicyLocation", 0, $arg)
    }
    
    
  }
  
  
}