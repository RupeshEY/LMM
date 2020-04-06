package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimsummary/ECFClaimSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimSummaryPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimsummary/ECFClaimSummaryPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimSummaryPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ECFLastRefresh) at ECFClaimSummaryPanelSet.pcf: line 26, column 43
    function valueRoot_2 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=ECFLastRefresh) at ECFClaimSummaryPanelSet.pcf: line 26, column 43
    function value_0 () : java.util.Date {
      return Claim.ECFLastUpdateTime
    }
    
    // 'visible' attribute on Label (id=VCSIndicatorLabel) at ECFClaimSummaryPanelSet.pcf: line 37, column 49
    function visible_3 () : java.lang.Boolean {
      return Claim.VCSIndicator_Ext
    }
    
    // 'visible' attribute on Label (id=UberPrecautionaryLabel) at ECFClaimSummaryPanelSet.pcf: line 41, column 58
    function visible_4 () : java.lang.Boolean {
      return Claim.UberPrecautionaryFlag_Ext
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}