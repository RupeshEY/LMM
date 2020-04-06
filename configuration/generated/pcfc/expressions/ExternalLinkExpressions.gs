package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ExternalLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExternalLinkExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ExternalLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternalLinkExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (linkName :  String, claimNumber :  String) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 21, column 34
    function action_1 () : void {
      EndUserError.go(DisplayKey.get("Java.Error.ExternalLink.BadClaimNumber", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 30, column 68
    function action_10 () : void {
      ClaimFinancialsGroup.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 33, column 66
    function action_13 () : void {
      ClaimWorkplan.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 36, column 76
    function action_16 () : void {
      ClaimCalendar.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 39, column 269
    function action_19 () : void {
      pcf.Claim.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 42, column 220
    function action_22 () : void {
      CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 44, column 112
    function action_25 () : void {
      EndUserError.go(DisplayKey.get("Java.Error.ExternalLink.UnknownLinkName", linkName))
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 24, column 58
    function action_4 () : void {
      ClaimSummary.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 27, column 69
    function action_7 () : void {
      ClaimLossDetails.go(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 30, column 68
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 33, column 66
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 36, column 76
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimCalendar.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 21, column 34
    function action_dest_2 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Java.Error.ExternalLink.BadClaimNumber", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 39, column 269
    function action_dest_20 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 42, column 220
    function action_dest_23 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 44, column 112
    function action_dest_26 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Java.Error.ExternalLink.UnknownLinkName", linkName))
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 24, column 58
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'action' attribute on ForwardCondition at ExternalLink.pcf: line 27, column 69
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 30, column 68
    function condition_12 () : java.lang.Boolean {
      return linkName == "ClaimFinancialsByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 33, column 66
    function condition_15 () : java.lang.Boolean {
      return linkName == "ClaimWorkPlanByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 36, column 76
    function condition_18 () : java.lang.Boolean {
      return linkName == "ClaimLitigationCalendarByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 39, column 269
    function condition_21 () : java.lang.Boolean {
      return linkName == "ClaimByNumber" or linkName == "ClaimLossDetailsByNumber" or linkName == "ClaimFinancialsByNumber" or linkName == "ClaimLitigationCalendarByNumber" or linkName == "ClaimWorkPlanByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 42, column 220
    function condition_24 () : java.lang.Boolean {
      return linkName == "ClaimByNumber" or linkName == "ClaimLossDetailsByNumber" or linkName == "ClaimFinancialsByNumber" or linkName == "ClaimLitigationCalendarByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 21, column 34
    function condition_3 () : java.lang.Boolean {
      return Claim == null
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 24, column 58
    function condition_6 () : java.lang.Boolean {
      return linkName == "ClaimByNumber"
    }
    
    // 'condition' attribute on ForwardCondition at ExternalLink.pcf: line 27, column 69
    function condition_9 () : java.lang.Boolean {
      return linkName == "ClaimLossDetailsByNumber"
    }
    
    // 'initialValue' attribute on Variable at ExternalLink.pcf: line 18, column 21
    function initialValue_0 () : Claim {
      return (gw.api.database.Query.make(entity.Claim).compare("ClaimNumber", Equals, claimNumber).select()).getAtMostOneRow()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ExternalLink {
      return super.CurrentLocation as pcf.ExternalLink
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get linkName () : String {
      return getVariableValue("linkName", 0) as String
    }
    
    property set linkName ($arg :  String) {
      setVariableValue("linkName", 0, $arg)
    }
    
    
  }
  
  
}