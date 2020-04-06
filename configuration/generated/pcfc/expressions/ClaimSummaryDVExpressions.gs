package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=WC_RTW) at ClaimSummaryDV.pcf: line 28, column 84
    function def_onEnter_7 (def :  pcf.ReturnToWorkInputSet_WC) : void {
      def.onEnter(Claim.LossType == TC_WC ? Claim.ensureClaimInjuryIncident() : null, false)
    }
    
    // 'def' attribute on InputSetRef (id=WC_RTW) at ClaimSummaryDV.pcf: line 28, column 84
    function def_refreshVariables_8 (def :  pcf.ReturnToWorkInputSet_WC) : void {
      def.refreshVariables(Claim.LossType == TC_WC ? Claim.ensureClaimInjuryIncident() : null, false)
    }
    
    // 'value' attribute on TextInput (id=Location) at ClaimSummaryDV.pcf: line 35, column 49
    function valueRoot_11 () : java.lang.Object {
      return Claim.LossLocation
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSummaryDV.pcf: line 19, column 33
    function valueRoot_2 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSummaryDV.pcf: line 19, column 33
    function value_0 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSummaryDV.pcf: line 40, column 36
    function value_12 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TextInput (id=WCInjuryWorkStatus) at ClaimSummaryDV.pcf: line 45, column 44
    function value_16 () : java.lang.String {
      return Claim.getWorkStatusMessage()
    }
    
    // 'value' attribute on DateInput (id=ReportDate) at ClaimSummaryDV.pcf: line 23, column 37
    function value_3 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on TextInput (id=Location) at ClaimSummaryDV.pcf: line 35, column 49
    function value_9 () : java.lang.String {
      return Claim.LossLocation.Description
    }
    
    // 'visible' attribute on TextInput (id=WCInjuryWorkStatus) at ClaimSummaryDV.pcf: line 45, column 44
    function visible_15 () : java.lang.Boolean {
      return Claim.LossType == TC_WC
    }
    
    // 'visible' attribute on InputSetRef (id=WC_RTW) at ClaimSummaryDV.pcf: line 28, column 84
    function visible_6 () : java.lang.Boolean {
      return Claim.LossType == TC_WC and Claim.getLossTimeExposure() != null
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}