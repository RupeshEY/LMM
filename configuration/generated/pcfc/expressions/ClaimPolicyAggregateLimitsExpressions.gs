package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyAggregateLimitsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyAggregateLimits_AddButton) at ClaimPolicyAggregateLimits.pcf: line 30, column 46
    function action_3 () : void {
      ClaimPolicyNewAggregateLimit.go(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyAggregateLimits_AddButton) at ClaimPolicyAggregateLimits.pcf: line 30, column 46
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimPolicyNewAggregateLimit.createDestination(Claim)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimPolicyAggregateLimits_AddButton) at ClaimPolicyAggregateLimits.pcf: line 30, column 46
    function available_1 () : java.lang.Boolean {
      return enableAdd
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyAggregateLimits) at ClaimPolicyAggregateLimits.pcf: line 9, column 91
    static function canVisit_11 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "AggregateLimits") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimPolicyAggregateLimits_DeleteButton) at ClaimPolicyAggregateLimits.pcf: line 38, column 46
    function checkedRowAction_7 (element :  entity.AggregateLimit, CheckedValue :  entity.AggregateLimit) : void {
      gw.api.admin.AggregateLimitUtil.removeLimit(CheckedValue)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyAggregateLimits.pcf: line 50, column 27
    function def_onEnter_9 (def :  pcf.AggregateLimitsLV) : void {
      def.onEnter(Claim.AggregateLimits, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyAggregateLimits.pcf: line 50, column 27
    function def_refreshVariables_10 (def :  pcf.AggregateLimitsLV) : void {
      def.refreshVariables(Claim.AggregateLimits, Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyAggregateLimits.pcf: line 19, column 23
    function initialValue_0 () : boolean {
      return not gw.api.claim.ClaimUtil.doesClaimHaveUnsavedWork()
    }
    
    // Page (id=ClaimPolicyAggregateLimits) at ClaimPolicyAggregateLimits.pcf: line 9, column 91
    static function parent_12 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'tooltip' attribute on ToolbarButton (id=ClaimPolicyAggregateLimits_AddButton) at ClaimPolicyAggregateLimits.pcf: line 30, column 46
    function tooltip_5 () : java.lang.String {
      return enableAdd ? null : DisplayKey.get("LV.Policy.AggregateLimits.AddDisabledTooltip")
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyAggregateLimits_AddButton) at ClaimPolicyAggregateLimits.pcf: line 30, column 46
    function visible_2 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on DetailViewPanel at ClaimPolicyAggregateLimits.pcf: line 41, column 78
    function visible_8 () : java.lang.Boolean {
      return Claim.AggregateLimits.hasMatch(\ a -> a.Valid == false)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyAggregateLimits {
      return super.CurrentLocation as pcf.ClaimPolicyAggregateLimits
    }
    
    property get enableAdd () : boolean {
      return getVariableValue("enableAdd", 0) as java.lang.Boolean
    }
    
    property set enableAdd ($arg :  boolean) {
      setVariableValue("enableAdd", 0, $arg)
    }
    
    
  }
  
  
}