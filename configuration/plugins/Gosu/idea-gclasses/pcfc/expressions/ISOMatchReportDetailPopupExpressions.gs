package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ISOMatchReportDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (isoMatchReport :  ISOMatchReport) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ISOMatchReportDetailPopup) at ISOMatchReportDetailPopup.pcf: line 10, column 235
    static function canVisit_2 (isoMatchReport :  ISOMatchReport) : java.lang.Boolean {
      return (isoMatchReport.ISOExposure != null and perm.Exposure.view(isoMatchReport.ISOExposure)) or perm.Claim.view(isoMatchReport.ISOClaim)
    }
    
    // 'def' attribute on PanelRef at ISOMatchReportDetailPopup.pcf: line 20, column 49
    function def_onEnter_0 (def :  pcf.ISOMatchReportDV) : void {
      def.onEnter(isoMatchReport)
    }
    
    // 'def' attribute on PanelRef at ISOMatchReportDetailPopup.pcf: line 20, column 49
    function def_refreshVariables_1 (def :  pcf.ISOMatchReportDV) : void {
      def.refreshVariables(isoMatchReport)
    }
    
    // 'parent' attribute on Popup (id=ISOMatchReportDetailPopup) at ISOMatchReportDetailPopup.pcf: line 10, column 235
    static function parent_3 (isoMatchReport :  ISOMatchReport) : pcf.api.Destination {
      return pcf.ISOReportableForward.createDestination(isoMatchReport.ISOReportable)
    }
    
    // 'title' attribute on Popup (id=ISOMatchReportDetailPopup) at ISOMatchReportDetailPopup.pcf: line 10, column 235
    static function title_4 (isoMatchReport :  ISOMatchReport) : java.lang.Object {
      if (isoMatchReport.ISOExposure != null) {return DisplayKey.get("JSP.ISOMatchReport.Title", isoMatchReport.ISOExposure)} else {return DisplayKey.get("JSP.ISOMatchReport.Title", isoMatchReport.ISOClaim)}
    }
    
    override property get CurrentLocation () : pcf.ISOMatchReportDetailPopup {
      return super.CurrentLocation as pcf.ISOMatchReportDetailPopup
    }
    
    property get isoMatchReport () : ISOMatchReport {
      return getVariableValue("isoMatchReport", 0) as ISOMatchReport
    }
    
    property set isoMatchReport ($arg :  ISOMatchReport) {
      setVariableValue("isoMatchReport", 0, $arg)
    }
    
    
  }
  
  
}