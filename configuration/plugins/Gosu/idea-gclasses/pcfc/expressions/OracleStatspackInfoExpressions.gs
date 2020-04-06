package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleStatspackInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleStatspackInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleStatspackInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=download) at OracleStatspackInfo.pcf: line 36, column 66
    function action_2 () : void {
      PageHelper.downloadStatspackInfo()
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at OracleStatspackInfo.pcf: line 40, column 65
    function action_3 () : void {
      PageHelper.loadSnapshotInfo()
    }
    
    // 'action' attribute on ToolbarButton (id=TogglePaging) at OracleStatspackInfo.pcf: line 44, column 172
    function action_4 () : void {
      Paging = !Paging
    }
    
    // 'available' attribute on ToolbarButton (id=download) at OracleStatspackInfo.pcf: line 36, column 66
    function available_1 () : java.lang.Boolean {
      return PageHelper.ReadyToDownload
    }
    
    // 'canVisit' attribute on Page (id=OracleStatspackInfo) at OracleStatspackInfo.pcf: line 12, column 89
    static function canVisit_11 () : java.lang.Boolean {
      return gw.api.tools.OracleStatspackHelper.dbSupportsStatspack()
    }
    
    // 'def' attribute on PanelRef at OracleStatspackInfo.pcf: line 25, column 67
    function def_onEnter_6 (def :  pcf.OracleStatspackLV_nopaging) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on PanelRef at OracleStatspackInfo.pcf: line 25, column 67
    function def_onEnter_8 (def :  pcf.OracleStatspackLV_paging) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on PanelRef at OracleStatspackInfo.pcf: line 25, column 67
    function def_refreshVariables_7 (def :  pcf.OracleStatspackLV_nopaging) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'def' attribute on PanelRef at OracleStatspackInfo.pcf: line 25, column 67
    function def_refreshVariables_9 (def :  pcf.OracleStatspackLV_paging) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'initialValue' attribute on Variable at OracleStatspackInfo.pcf: line 16, column 50
    function initialValue_0 () : gw.api.tools.OracleStatspackHelper {
      return new gw.api.tools.OracleStatspackHelper()
    }
    
    // 'label' attribute on ToolbarButton (id=TogglePaging) at OracleStatspackInfo.pcf: line 44, column 172
    function label_5 () : java.lang.Object {
      return Paging ? DisplayKey.get("Web.InternalTools.InfoPages.DisablePaging") : DisplayKey.get("Web.InternalTools.InfoPages.EnablePaging")
    }
    
    // 'mode' attribute on PanelRef at OracleStatspackInfo.pcf: line 25, column 67
    function mode_10 () : java.lang.Object {
      return Paging ? "paging" : "nopaging"
    }
    
    // 'parent' attribute on Page (id=OracleStatspackInfo) at OracleStatspackInfo.pcf: line 12, column 89
    static function parent_12 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.OracleStatspackInfo {
      return super.CurrentLocation as pcf.OracleStatspackInfo
    }
    
    property get PageHelper () : gw.api.tools.OracleStatspackHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.OracleStatspackHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.OracleStatspackHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Paging () : Boolean {
      return getVariableValue("Paging", 0) as Boolean
    }
    
    property set Paging ($arg :  Boolean) {
      setVariableValue("Paging", 0, $arg)
    }
    
    
  }
  
  
}