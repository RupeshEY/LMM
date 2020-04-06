package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_StacksGroupedExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.StacksGrouped.pcf: line 81, column 63
    function valueRoot_43 () : java.lang.Object {
      return selectedStackSummary
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.StacksGrouped.pcf: line 81, column 63
    function value_41 () : java.lang.String {
      return selectedStackSummary.StackName
    }
    
    // 'value' attribute on TextCell (id=time) at ProfilerResultsCV.StacksGrouped.pcf: line 86, column 54
    function value_44 () : java.lang.Integer {
      return time
    }
    
    property get time () : java.lang.Integer {
      return getIteratedValue(2) as java.lang.Integer
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextCell (id=count) at ProfilerResultsCV.StacksGrouped.pcf: line 39, column 50
    function label_14 () : java.lang.Object {
      return "# " + DisplayKey.get("Web.Profiler.Stacks")
    }
    
    // 'label' attribute on TextCell (id=total) at ProfilerResultsCV.StacksGrouped.pcf: line 44, column 50
    function label_19 () : java.lang.Object {
      return "Total " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on TextCell (id=average) at ProfilerResultsCV.StacksGrouped.pcf: line 49, column 50
    function label_24 () : java.lang.Object {
      return "Ave " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on TextCell (id=min) at ProfilerResultsCV.StacksGrouped.pcf: line 54, column 50
    function label_29 () : java.lang.Object {
      return "Min " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on TextCell (id=max) at ProfilerResultsCV.StacksGrouped.pcf: line 59, column 50
    function label_34 () : java.lang.Object {
      return "Max " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.StacksGrouped.pcf: line 34, column 51
    function valueRoot_13 () : java.lang.Object {
      return stackSummary
    }
    
    // 'value' attribute on TextCell (id=StackName) at ProfilerResultsCV.StacksGrouped.pcf: line 34, column 51
    function value_11 () : java.lang.String {
      return stackSummary.StackName
    }
    
    // 'value' attribute on TextCell (id=count) at ProfilerResultsCV.StacksGrouped.pcf: line 39, column 50
    function value_15 () : java.lang.Integer {
      return stackSummary.StackCount
    }
    
    // 'value' attribute on TextCell (id=total) at ProfilerResultsCV.StacksGrouped.pcf: line 44, column 50
    function value_20 () : java.lang.Integer {
      return stackSummary.TotalElapsed
    }
    
    // 'value' attribute on TextCell (id=average) at ProfilerResultsCV.StacksGrouped.pcf: line 49, column 50
    function value_25 () : java.lang.Integer {
      return stackSummary.AverageElapsed
    }
    
    // 'value' attribute on TextCell (id=min) at ProfilerResultsCV.StacksGrouped.pcf: line 54, column 50
    function value_30 () : java.lang.Integer {
      return stackSummary.MinElapsed
    }
    
    // 'value' attribute on TextCell (id=max) at ProfilerResultsCV.StacksGrouped.pcf: line 59, column 50
    function value_35 () : java.lang.Integer {
      return stackSummary.MaxElapsed
    }
    
    property get stackSummary () : gw.api.profiler.ProfilerStackGroup {
      return getIteratedValue(2) as gw.api.profiler.ProfilerStackGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 39, column 50
    function label_1 () : java.lang.Object {
      return "# " + DisplayKey.get("Web.Profiler.Stacks")
    }
    
    // 'label' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 44, column 50
    function label_3 () : java.lang.Object {
      return "Total " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 49, column 50
    function label_5 () : java.lang.Object {
      return "Ave " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 54, column 50
    function label_7 () : java.lang.Object {
      return "Min " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'label' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 59, column 50
    function label_9 () : java.lang.Object {
      return "Max " + DisplayKey.get("Web.Profiler.ElapsedTime")
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 34, column 51
    function sortValue_0 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 59, column 50
    function sortValue_10 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.MaxElapsed
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 39, column 50
    function sortValue_2 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.StackCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 44, column 50
    function sortValue_4 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.TotalElapsed
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 86, column 54
    function sortValue_40 (time :  java.lang.Integer) : java.lang.Object {
      return time
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 49, column 50
    function sortValue_6 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.AverageElapsed
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 54, column 50
    function sortValue_8 (stackSummary :  gw.api.profiler.ProfilerStackGroup) : java.lang.Object {
      return stackSummary.MinElapsed
    }
    
    // 'title' attribute on Card (id=NestedCard) at ProfilerResultsCV.StacksGrouped.pcf: line 67, column 93
    function title_47 () : java.lang.String {
      return DisplayKey.get("Web.Profiler.Stacks") + " in Group"
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 29, column 64
    function value_39 () : gw.api.profiler.ProfilerStackGroup[] {
      return profilerDataSource.StacksGroupedByName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.StacksGrouped.pcf: line 75, column 51
    function value_46 () : java.lang.Integer[] {
      return selectedStackSummary.ElapsedTimes
    }
    
    property get selectedStackSummary () : gw.api.profiler.ProfilerStackGroup {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerStackGroup
    }
    
    property set selectedStackSummary ($arg :  gw.api.profiler.ProfilerStackGroup) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    
  }
  
  
}