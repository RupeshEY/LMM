package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AggregateLimitClaimsWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitClaimsWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ParentClaim :  Claim, AggregateLimit :  AggregateLimit) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at AggregateLimitClaimsWorksheet.pcf: line 28, column 61
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on ListViewInput (id=agglimitsListView) at AggregateLimitClaimsWorksheet.pcf: line 45, column 31
    function def_onEnter_6 (def :  pcf.AggregateLimitClaimsLV) : void {
      def.onEnter(AggregateLimit.ApplicableNonZeroClaimAggregateLimitRpts, AggregateLimit)
    }
    
    // 'def' attribute on ListViewInput (id=agglimitsListView) at AggregateLimitClaimsWorksheet.pcf: line 45, column 31
    function def_refreshVariables_7 (def :  pcf.AggregateLimitClaimsLV) : void {
      def.refreshVariables(AggregateLimit.ApplicableNonZeroClaimAggregateLimitRpts, AggregateLimit)
    }
    
    // 'location' attribute on Scope at AggregateLimitClaimsWorksheet.pcf: line 16, column 59
    function location_0 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(ParentClaim)
    }
    
    // 'title' attribute on Worksheet (id=AggregateLimitClaimsWorksheet) at AggregateLimitClaimsWorksheet.pcf: line 12, column 63
    static function title_8 (AggregateLimit :  AggregateLimit, ParentClaim :  Claim) : java.lang.Object {
      return DisplayKey.get("LITERAL", "")
    }
    
    // 'value' attribute on TextInput (id=lid1) at AggregateLimitClaimsWorksheet.pcf: line 40, column 107
    function value_3 () : java.lang.String {
      return DisplayKey.get("LV.Policy.AggregateLimits.CalculationUsedForRealized", AggregateLimit.FinancialsCalculationDescription)
    }
    
    // 'visible' attribute on TextInput (id=lid1) at AggregateLimitClaimsWorksheet.pcf: line 40, column 107
    function visible_2 () : java.lang.Boolean {
      return AggregateLimit.PolicyPeriod.PolicyPeriodType == typekey.PolicyPeriodType.TC_POLICY
    }
    
    property get AggregateLimit () : AggregateLimit {
      return getVariableValue("AggregateLimit", 0) as AggregateLimit
    }
    
    property set AggregateLimit ($arg :  AggregateLimit) {
      setVariableValue("AggregateLimit", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AggregateLimitClaimsWorksheet {
      return super.CurrentLocation as pcf.AggregateLimitClaimsWorksheet
    }
    
    property get ParentClaim () : Claim {
      return getVariableValue("ParentClaim", 0) as Claim
    }
    
    property set ParentClaim ($arg :  Claim) {
      setVariableValue("ParentClaim", 0, $arg)
    }
    
    
  }
  
  
}