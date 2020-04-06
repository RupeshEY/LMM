package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ServerPerformance.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServerPerformanceExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ServerPerformance.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ServerPerformanceExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=name) at ServerPerformance.pcf: line 83, column 35
    function valueRoot_8 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on TextCell (id=serveravg) at ServerPerformance.pcf: line 91, column 43
    function value_12 () : java.lang.Long {
      return Row.AverageServerTime
    }
    
    // 'value' attribute on TextCell (id=clientavg) at ServerPerformance.pcf: line 96, column 43
    function value_15 () : java.lang.Long {
      return Row.AverageEndToEndTime
    }
    
    // 'value' attribute on TextCell (id=name) at ServerPerformance.pcf: line 83, column 35
    function value_6 () : java.lang.String {
      return Row.PageId
    }
    
    // 'value' attribute on TextCell (id=serverRequests) at ServerPerformance.pcf: line 87, column 46
    function value_9 () : java.lang.Integer {
      return Row.NumRequests
    }
    
    property get Row () : com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow {
      return getIteratedValue(1) as com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ServerPerformance.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerPerformanceExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at ServerPerformance.pcf: line 23, column 63
    function action_1 () : void {
      Data = com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.getServerPerformancePCFRows()
    }
    
    // 'action' attribute on ToolbarButton (id=ClearResultsButton) at ServerPerformance.pcf: line 27, column 107
    function action_2 () : void {
      com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.clearData(); Data = com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.getServerPerformancePCFRows()
    }
    
    // 'action' attribute on ToolbarButton (id=SummaryExportButton) at ServerPerformance.pcf: line 32, column 108
    function action_3 () : void {
      com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.exportSummaryToCSV()
    }
    
    // 'action' attribute on ToolbarButton (id=RawDataExportButton) at ServerPerformance.pcf: line 37, column 104
    function action_4 () : void {
      com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.exportRawDataToCSV()
    }
    
    // 'initialValue' attribute on Variable at ServerPerformance.pcf: line 16, column 113
    function initialValue_0 () : java.util.List<com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow> {
      return com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.getServerPerformancePCFRows()
    }
    
    // 'parent' attribute on Page (id=ServerPerformance) at ServerPerformance.pcf: line 10, column 93
    static function parent_19 () : pcf.api.Destination {
      return pcf.UnsupportedTools.createDestination()
    }
    
    // 'sortBy' attribute on IteratorSort at ServerPerformance.pcf: line 79, column 28
    function sortBy_5 (Row :  com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow) : java.lang.Object {
      return Row.PageId
    }
    
    // 'value' attribute on RowIterator (id=MainRows) at ServerPerformance.pcf: line 76, column 121
    function value_18 () : java.util.List<com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow> {
      return Data
    }
    
    override property get CurrentLocation () : pcf.ServerPerformance {
      return super.CurrentLocation as pcf.ServerPerformance
    }
    
    property get Data () : java.util.List<com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow> {
      return getVariableValue("Data", 0) as java.util.List<com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow>
    }
    
    property set Data ($arg :  java.util.List<com.guidewire.pl.web.pcf.ServerPerformancePCFHelper.ServerPerformancePCFRow>) {
      setVariableValue("Data", 0, $arg)
    }
    
    
  }
  
  
}