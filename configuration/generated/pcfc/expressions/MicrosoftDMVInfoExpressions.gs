package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MicrosoftDMVInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MicrosoftDMVInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at MicrosoftDMVInfo.pcf: line 34, column 112
    function action_1 () : void {
      
    }
    
    // 'action' attribute on ButtonInput (id=SubmitBatch) at MicrosoftDMVInfo.pcf: line 59, column 53
    function action_8 () : void {
      PageHelper.submitBatch()
    }
    
    // 'canVisit' attribute on Page (id=MicrosoftDMVInfo) at MicrosoftDMVInfo.pcf: line 13, column 83
    static function canVisit_13 () : java.lang.Boolean {
      return gw.api.tools.MicrosoftDMVPageHelper.supportsDMV()
    }
    
    // 'def' attribute on ListViewInput at MicrosoftDMVInfo.pcf: line 29, column 33
    function def_onEnter_2 (def :  pcf.PerfDownloadLV) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on ListViewInput at MicrosoftDMVInfo.pcf: line 29, column 33
    function def_refreshVariables_3 (def :  pcf.PerfDownloadLV) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeDatabaseStatistics) at MicrosoftDMVInfo.pcf: line 73, column 63
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.IncludeDatabaseStatistics = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at MicrosoftDMVInfo.pcf: line 17, column 51
    function initialValue_0 () : gw.api.tools.MicrosoftDMVPageHelper {
      return gw.api.tools.MicrosoftDMVPageHelper.getInstance()
    }
    
    // 'parent' attribute on Page (id=MicrosoftDMVInfo) at MicrosoftDMVInfo.pcf: line 13, column 83
    static function parent_14 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'percentage' attribute on ProgressInput (id=batchProgress) at MicrosoftDMVInfo.pcf: line 42, column 33
    function percentage_4 () : java.lang.Double {
      return PageHelper.BatchRunning ? -1 : 100
    }
    
    // 'status' attribute on ProgressInput (id=batchProgress) at MicrosoftDMVInfo.pcf: line 42, column 33
    function status_5 () : java.lang.String {
      return PageHelper.BatchRunning ? DisplayKey.get("Web.InternalTools.InfoPages.PerfDownload.RunningBatchProcess") : null
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeDatabaseStatistics) at MicrosoftDMVInfo.pcf: line 73, column 63
    function valueRoot_12 () : java.lang.Object {
      return PageHelper
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeDatabaseStatistics) at MicrosoftDMVInfo.pcf: line 73, column 63
    function value_9 () : java.lang.Boolean {
      return PageHelper.IncludeDatabaseStatistics
    }
    
    // 'visible' attribute on ButtonInput (id=SubmitBatch) at MicrosoftDMVInfo.pcf: line 59, column 53
    function visible_6 () : java.lang.Boolean {
      return !PageHelper.BatchRunning
    }
    
    override property get CurrentLocation () : pcf.MicrosoftDMVInfo {
      return super.CurrentLocation as pcf.MicrosoftDMVInfo
    }
    
    property get PageHelper () : gw.api.tools.MicrosoftDMVPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.MicrosoftDMVPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.MicrosoftDMVPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}