package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewMetroReportDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/NewMetroReportDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewMetroReportDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at NewMetroReportDetailsPopup.pcf: line 21, column 59
    function def_onEnter_1 (def :  pcf.MetroReportDetailsScreen) : void {
      def.onEnter(claim, metroReport)
    }
    
    // 'def' attribute on ScreenRef at NewMetroReportDetailsPopup.pcf: line 21, column 59
    function def_refreshVariables_2 (def :  pcf.MetroReportDetailsScreen) : void {
      def.refreshVariables(claim, metroReport)
    }
    
    // 'initialValue' attribute on Variable at NewMetroReportDetailsPopup.pcf: line 19, column 27
    function initialValue_0 () : MetroReport {
      return claim.newMetroReport()
    }
    
    override property get CurrentLocation () : pcf.NewMetroReportDetailsPopup {
      return super.CurrentLocation as pcf.NewMetroReportDetailsPopup
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