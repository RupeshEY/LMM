package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimsummary/LMClaimSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LMClaimSummaryPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimsummary/LMClaimSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LMClaimSummaryPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at LMClaimSummaryPanelSet.pcf: line 46, column 39
    function def_onEnter_13 (def :  pcf.ECFClaimSummaryPanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at LMClaimSummaryPanelSet.pcf: line 46, column 39
    function def_refreshVariables_14 (def :  pcf.ECFClaimSummaryPanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'value' attribute on TextInput (id=UCR) at LMClaimSummaryPanelSet.pcf: line 18, column 38
    function valueRoot_2 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=UCR) at LMClaimSummaryPanelSet.pcf: line 18, column 38
    function value_0 () : java.lang.String {
      return Claim.UCR_Ext
    }
    
    // 'value' attribute on DateInput (id=LossDateFrom) at LMClaimSummaryPanelSet.pcf: line 23, column 39
    function value_3 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextInput (id=ecfUMR) at LMClaimSummaryPanelSet.pcf: line 34, column 38
    function value_6 () : java.lang.String {
      return Claim.UMR_Ext
    }
    
    // 'value' attribute on DateInput (id=ecfLossDateTo) at LMClaimSummaryPanelSet.pcf: line 39, column 46
    function value_9 () : java.util.Date {
      return Claim.LossEndDate_Ext
    }
    
    // 'visible' attribute on PanelRef at LMClaimSummaryPanelSet.pcf: line 46, column 39
    function visible_12 () : java.lang.Boolean {
      return Claim.isECFVisible()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}