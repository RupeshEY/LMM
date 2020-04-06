package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroReportDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, metroReport :  MetroReport) : int {
      return 1
    }
    
    // 'def' attribute on ScreenRef at MetroReportDetailsPopup.pcf: line 22, column 59
    function def_onEnter_1 (def :  pcf.MetroReportDetailsScreen) : void {
      def.onEnter(claim, metroReport)
    }
    
    // 'def' attribute on ScreenRef at MetroReportDetailsPopup.pcf: line 22, column 59
    function def_refreshVariables_2 (def :  pcf.MetroReportDetailsScreen) : void {
      def.refreshVariables(claim, metroReport)
    }
    
    // 'initialValue' attribute on Variable at MetroReportDetailsPopup.pcf: line 20, column 27
    function initialValue_0 () : MetroReport {
      return claim.newMetroReport()
    }
    
    override property get CurrentLocation () : pcf.MetroReportDetailsPopup {
      return super.CurrentLocation as pcf.MetroReportDetailsPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get metroReport () : MetroReport {
      return getVariableValue("metroReport", 0) as MetroReport
    }
    
    property set metroReport ($arg :  MetroReport) {
      setVariableValue("metroReport", 0, $arg)
    }
    
    
  }
  
  
}