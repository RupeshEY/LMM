package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_ChronoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=reportLink) at ProfilerResultsCV.Chrono.pcf: line 69, column 82
    function action_19 () : void {
      gw.api.profiler.ProfilerPageHelper.downloadReport(lvStack.getDbmsReport(profilerDataSource))
    }
    
    // 'available' attribute on Link (id=reportLink) at ProfilerResultsCV.Chrono.pcf: line 69, column 82
    function available_17 () : java.lang.Boolean {
      return lvStack.getDbmsReport(profilerDataSource) != null
    }
    
    // 'label' attribute on Link (id=reportLink) at ProfilerResultsCV.Chrono.pcf: line 69, column 82
    function label_20 () : java.lang.Object {
      return lvStack.getDbmsReport(profilerDataSource).Name
    }
    
    // 'value' attribute on TextCell (id=StartTme) at ProfilerResultsCV.Chrono.pcf: line 50, column 47
    function valueRoot_10 () : java.lang.Object {
      return lvStack
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.Chrono.pcf: line 54, column 46
    function value_11 () : java.lang.String {
      return lvStack.StackName
    }
    
    // 'value' attribute on TextCell (id=frameCount) at ProfilerResultsCV.Chrono.pcf: line 59, column 50
    function value_14 () : java.lang.Integer {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on TextCell (id=StartTme) at ProfilerResultsCV.Chrono.pcf: line 50, column 47
    function value_8 () : java.lang.Long {
      return lvStack.StartTime
    }
    
    property get lvStack () : gw.api.profiler.ProfilerStack {
      return getIteratedValue(2) as gw.api.profiler.ProfilerStack
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // RowTree at ProfilerResultsCV.Chrono.pcf: line 92, column 54
    function containerLabel_41 (frame :  java.lang.Object) : java.lang.String {
      return ""
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.Chrono.pcf: line 99, column 54
    function sortValue_22 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.Offset
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.Chrono.pcf: line 103, column 47
    function sortValue_23 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.Tag.Name
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.Chrono.pcf: line 108, column 54
    function sortValue_24 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.FrameTime
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.Chrono.pcf: line 113, column 54
    function sortValue_25 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.ElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Chrono.pcf: line 50, column 47
    function sortValue_5 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StartTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Chrono.pcf: line 54, column 46
    function sortValue_6 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Chrono.pcf: line 59, column 50
    function sortValue_7 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.Chrono.pcf: line 43, column 59
    function value_21 () : gw.api.profiler.ProfilerStack[] {
      return page.ProfilerStacks
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.Chrono.pcf: line 92, column 54
    function value_40 () : java.lang.Object {
      return page.buildStackTree(stack)
    }
    
    property get stack () : gw.api.profiler.ProfilerStack {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerStack
    }
    
    property set stack ($arg :  gw.api.profiler.ProfilerStack) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.Chrono.pcf: line 27, column 41
    function def_onEnter_2 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.Chrono.pcf: line 27, column 41
    function def_refreshVariables_3 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'initialValue' attribute on Variable at ProfilerResultsCV.Chrono.pcf: line 16, column 57
    function initialValue_0 () : gw.api.profiler.ChronoProfilerResultsPage {
      return new gw.api.profiler.ChronoProfilerResultsPage(profilerDataSource)
    }
    
    // 'initialValue' attribute on Variable at ProfilerResultsCV.Chrono.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return page.refresh(profilerDataSource)
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.Chrono.pcf: line 25, column 36
    function visible_4 () : java.lang.Boolean {
      return not page.HasStacks
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.Chrono.pcf: line 32, column 32
    function visible_42 () : java.lang.Boolean {
      return page.HasStacks
    }
    
    property get page () : gw.api.profiler.ChronoProfilerResultsPage {
      return getVariableValue("page", 0) as gw.api.profiler.ChronoProfilerResultsPage
    }
    
    property set page ($arg :  gw.api.profiler.ChronoProfilerResultsPage) {
      setVariableValue("page", 0, $arg)
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    property get refresher () : boolean {
      return getVariableValue("refresher", 0) as java.lang.Boolean
    }
    
    property set refresher ($arg :  boolean) {
      setVariableValue("refresher", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=offset) at ProfilerResultsCV.Chrono.pcf: line 99, column 54
    function valueRoot_28 () : java.lang.Object {
      return frame
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.Chrono.pcf: line 103, column 47
    function valueRoot_31 () : java.lang.Object {
      return frame.Tag
    }
    
    // 'value' attribute on TextCell (id=offset) at ProfilerResultsCV.Chrono.pcf: line 99, column 54
    function value_26 () : java.lang.Integer {
      return frame.Offset
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.Chrono.pcf: line 103, column 47
    function value_29 () : java.lang.String {
      return frame.Tag.Name
    }
    
    // 'value' attribute on TextCell (id=frameTime) at ProfilerResultsCV.Chrono.pcf: line 108, column 54
    function value_32 () : java.lang.Integer {
      return frame.FrameTime
    }
    
    // 'value' attribute on TextCell (id=elapsedTime) at ProfilerResultsCV.Chrono.pcf: line 113, column 54
    function value_35 () : java.lang.Integer {
      return frame.ElapsedTime
    }
    
    // 'value' attribute on TextCell (id=propsAndCounters) at ProfilerResultsCV.Chrono.pcf: line 118, column 122
    function value_38 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.getPropertiesAndCountersExcludingTracesString( frame )
    }
    
    property get frame () : gw.api.profiler.ProfilerFrame {
      return getIteratedValue(2) as gw.api.profiler.ProfilerFrame
    }
    
    
  }
  
  
}