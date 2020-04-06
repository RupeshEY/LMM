package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_StartablePluginExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.StartablePlugin.pcf: line 29, column 27
    function condition_4 () : java.lang.Boolean {
      return startablePluginHistory.CompleteDate != null
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.StartablePlugin.pcf: line 32, column 30
    function condition_5 () : java.lang.Boolean {
      return startablePluginHistory.CompleteDate == null
    }
    
    // 'pickValue' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 20, column 89
    function pickValue_15 () : java.lang.Object {
      return startablePluginHistory.ProfilerData
    }
    
    // 'value' attribute on TextCell (id=ServiceName) at PickProfilerSourceLV.StartablePlugin.pcf: line 38, column 54
    function valueRoot_8 () : java.lang.Object {
      return startablePluginHistory
    }
    
    // 'value' attribute on DateCell (id=CompleteDate) at PickProfilerSourceLV.StartablePlugin.pcf: line 52, column 56
    function value_12 () : java.util.Date {
      return startablePluginHistory.CompleteDate
    }
    
    // 'value' attribute on TextCell (id=ServiceName) at PickProfilerSourceLV.StartablePlugin.pcf: line 38, column 54
    function value_6 () : java.lang.String {
      return startablePluginHistory.PluginName
    }
    
    // 'value' attribute on DateCell (id=StartDate) at PickProfilerSourceLV.StartablePlugin.pcf: line 46, column 53
    function value_9 () : java.util.Date {
      return startablePluginHistory.StartDate
    }
    
    property get startablePluginHistory () : entity.StartablePluginHistory {
      return getIteratedValue(1) as entity.StartablePluginHistory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PickProfilerSourceLV.StartablePlugin.pcf: line 25, column 88
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.startable.StartablePluginPageHelper.getPluginNameFilters()
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 38, column 54
    function sortValue_1 (startablePluginHistory :  entity.StartablePluginHistory) : java.lang.Object {
      return startablePluginHistory.PluginName
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 46, column 53
    function sortValue_2 (startablePluginHistory :  entity.StartablePluginHistory) : java.lang.Object {
      return startablePluginHistory.StartDate
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 52, column 56
    function sortValue_3 (startablePluginHistory :  entity.StartablePluginHistory) : java.lang.Object {
      return startablePluginHistory.CompleteDate
    }
    
    // 'toRemove' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 20, column 89
    function toRemove_16 (startablePluginHistory :  entity.StartablePluginHistory) : void {
      deleteProfilerData(startablePluginHistory)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.StartablePlugin.pcf: line 20, column 89
    function value_17 () : gw.api.database.IQueryBeanResult<entity.StartablePluginHistory> {
      return gw.api.database.Query.make(StartablePluginHistory).compare("ProfilerData", NotEquals, null).select()
    }
    
    function deleteProfilerData(startablePluginHistory : StartablePluginHistory) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
          bundle.remove( startablePluginHistory )
        }
      )
    }
    
    
  }
  
  
}