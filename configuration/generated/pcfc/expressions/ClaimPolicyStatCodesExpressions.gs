package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyStatCodesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Page (id=ClaimPolicyStatCodes) at ClaimPolicyStatCodes.pcf: line 11, column 85
    function afterCommit_19 (TopLocation :  pcf.api.Location) : void {
      ClaimPolicyStatCodesForward.go(Claim)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyStatCodes) at ClaimPolicyStatCodes.pcf: line 11, column 85
    function canEdit_20 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Statcodes") and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyStatCodes) at ClaimPolicyStatCodes.pcf: line 11, column 85
    static function canVisit_21 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Statcodes") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyStatCodes.pcf: line 21, column 29
    function initialValue_0 () : entity.Policy {
      return Claim.Policy
    }
    
    // Page (id=ClaimPolicyStatCodes) at ClaimPolicyStatCodes.pcf: line 11, column 85
    static function parent_22 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyStatCodes {
      return super.CurrentLocation as pcf.ClaimPolicyStatCodes
    }
    
    property get Policy () : entity.Policy {
      return getVariableValue("Policy", 0) as entity.Policy
    }
    
    property set Policy ($arg :  entity.Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyStatCodes_EditButton) at ClaimPolicyStatCodes.pcf: line 71, column 139
    function action_10 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true);
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyStatCodes_AddMoreStatCodesButton) at ClaimPolicyStatCodes.pcf: line 53, column 135
    function action_6 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 61, column 50
    function def_onEnter_15 (def :  pcf.StatCodeDetailDV) : void {
      def.onEnter(StatCode)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 40, column 52
    function def_onEnter_7 (def :  pcf.StatCodesLV) : void {
      def.onEnter(StatCodeList, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 61, column 50
    function def_refreshVariables_16 (def :  pcf.StatCodeDetailDV) : void {
      def.refreshVariables(StatCode)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 40, column 52
    function def_refreshVariables_8 (def :  pcf.StatCodesLV) : void {
      def.refreshVariables(StatCodeList, Claim)
    }
    
    // EditButtons at ClaimPolicyStatCodes.pcf: line 76, column 55
    function label_14 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'cancelVisible' attribute on EditButtons at ClaimPolicyStatCodes.pcf: line 76, column 55
    function visible_11 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'addVisible' attribute on IteratorButtons at ClaimPolicyStatCodes.pcf: line 46, column 106
    function visible_3 () : java.lang.Boolean {
      return !Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyStatCodes_AddMoreStatCodesButton) at ClaimPolicyStatCodes.pcf: line 53, column 135
    function visible_5 () : java.lang.Boolean {
      return Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim) and perm.Policy.makeeditable(Claim)
    }
    
    property get StatCode () : StatCode {
      return getCurrentSelection(2) as StatCode
    }
    
    property set StatCode ($arg :  StatCode) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimPolicyStatCodesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 34, column 51
    function def_onEnter_1 (def :  pcf.StatCodeFilterDV) : void {
      def.onEnter(FilterCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodes.pcf: line 34, column 51
    function def_refreshVariables_2 (def :  pcf.StatCodeFilterDV) : void {
      def.refreshVariables(FilterCriteria)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimPolicyStatCodes.pcf: line 32, column 40
    function searchCriteria_18 () : entity.PolicyStatCodeFilterCriteria {
      var c = new PolicyStatCodeFilterCriteria(); c.Policy = Policy; return c;
    }
    
    // 'search' attribute on SearchPanel at ClaimPolicyStatCodes.pcf: line 32, column 40
    function search_17 () : java.lang.Object {
      return FilterCriteria.FilteredPolicyStatCodes.whereTypeIs(StatCode).toTypedArray()
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