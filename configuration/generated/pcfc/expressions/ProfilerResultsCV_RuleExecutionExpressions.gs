package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_RuleExecutionExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends RowTreeEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=reportLink) at ProfilerResultsCV.RuleExecution.pcf: line 124, column 52
    function action_37 () : void {
      gw.api.profiler.ProfilerPageHelper.downloadReport(report)
    }
    
    // 'label' attribute on Link (id=reportLink) at ProfilerResultsCV.RuleExecution.pcf: line 124, column 52
    function label_38 () : java.lang.Object {
      return report.Name
    }
    
    property get report () : gw.api.profiler.DbmsReportZipProvider {
      return getIteratedValue(3) as gw.api.profiler.DbmsReportZipProvider
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=StartTime) at ProfilerResultsCV.RuleExecution.pcf: line 50, column 47
    function valueRoot_10 () : java.lang.Object {
      return lvStack
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.RuleExecution.pcf: line 54, column 46
    function value_11 () : java.lang.String {
      return lvStack.StackName
    }
    
    // 'value' attribute on TextCell (id=frameCount) at ProfilerResultsCV.RuleExecution.pcf: line 59, column 50
    function value_14 () : java.lang.Integer {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on TextCell (id=StartTime) at ProfilerResultsCV.RuleExecution.pcf: line 50, column 47
    function value_8 () : java.lang.Long {
      return lvStack.StartTime
    }
    
    property get lvStack () : gw.api.profiler.ProfilerStack {
      return getIteratedValue(2) as gw.api.profiler.ProfilerStack
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // RowTree at ProfilerResultsCV.RuleExecution.pcf: line 81, column 54
    function containerLabel_42 (frame :  java.lang.Object) : java.lang.String {
      return ""
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.RuleExecution.pcf: line 89, column 54
    function sortValue_18 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.Offset
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.RuleExecution.pcf: line 93, column 47
    function sortValue_19 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.Tag.Name
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.RuleExecution.pcf: line 98, column 54
    function sortValue_20 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.FrameTime
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.RuleExecution.pcf: line 103, column 54
    function sortValue_21 (frame :  gw.api.profiler.ProfilerFrame) : java.lang.Object {
      return frame.ElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.RuleExecution.pcf: line 50, column 47
    function sortValue_5 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StartTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.RuleExecution.pcf: line 54, column 46
    function sortValue_6 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.RuleExecution.pcf: line 59, column 50
    function sortValue_7 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.RuleExecution.pcf: line 43, column 59
    function value_17 () : gw.api.profiler.ProfilerStack[] {
      return page.RuleExecutionStacks
    }
    
    // 'value' attribute on RowTree at ProfilerResultsCV.RuleExecution.pcf: line 81, column 54
    function value_41 () : java.lang.Object {
      return page.buildStackTree(stack)
    }
    
    property get stack () : gw.api.profiler.ProfilerStack {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerStack
    }
    
    property set stack ($arg :  gw.api.profiler.ProfilerStack) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.RuleExecution.pcf: line 27, column 41
    function def_onEnter_2 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.RuleExecution.pcf: line 27, column 41
    function def_refreshVariables_3 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'initialValue' attribute on Variable at ProfilerResultsCV.RuleExecution.pcf: line 16, column 64
    function initialValue_0 () : gw.api.profiler.RuleExecutionProfilerResultsPage {
      return new gw.api.profiler.RuleExecutionProfilerResultsPage(profilerDataSource)
    }
    
    // 'initialValue' attribute on Variable at ProfilerResultsCV.RuleExecution.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return page.refresh(profilerDataSource)
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.RuleExecution.pcf: line 25, column 40
    function visible_4 () : java.lang.Boolean {
      return not page.HasRuleStacks
    }
    
    // 'visible' attribute on Card (id=Results) at ProfilerResultsCV.RuleExecution.pcf: line 32, column 36
    function visible_43 () : java.lang.Boolean {
      return page.HasRuleStacks
    }
    
    property get page () : gw.api.profiler.RuleExecutionProfilerResultsPage {
      return getVariableValue("page", 0) as gw.api.profiler.RuleExecutionProfilerResultsPage
    }
    
    property set page ($arg :  gw.api.profiler.RuleExecutionProfilerResultsPage) {
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
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ProfilerResultsCV.RuleExecution.pcf: line 118, column 42
    function sortBy_36 (report :  gw.api.profiler.DbmsReportZipProvider) : java.lang.Object {
      return report.Name
    }
    
    // 'value' attribute on TextCell (id=offset) at ProfilerResultsCV.RuleExecution.pcf: line 89, column 54
    function valueRoot_24 () : java.lang.Object {
      return frame
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.RuleExecution.pcf: line 93, column 47
    function valueRoot_27 () : java.lang.Object {
      return frame.Tag
    }
    
    // 'value' attribute on TextCell (id=offset) at ProfilerResultsCV.RuleExecution.pcf: line 89, column 54
    function value_22 () : java.lang.Integer {
      return frame.Offset
    }
    
    // 'value' attribute on TextCell (id=name) at ProfilerResultsCV.RuleExecution.pcf: line 93, column 47
    function value_25 () : java.lang.String {
      return frame.Tag.Name
    }
    
    // 'value' attribute on TextCell (id=frameTime) at ProfilerResultsCV.RuleExecution.pcf: line 98, column 54
    function value_28 () : java.lang.Integer {
      return frame.FrameTime
    }
    
    // 'value' attribute on TextCell (id=elapsedTime) at ProfilerResultsCV.RuleExecution.pcf: line 103, column 54
    function value_31 () : java.lang.Integer {
      return frame.ElapsedTime
    }
    
    // 'value' attribute on TextCell (id=propsAndCounters) at ProfilerResultsCV.RuleExecution.pcf: line 108, column 122
    function value_34 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.getPropertiesAndCountersExcludingTracesString( frame )
    }
    
    // 'value' attribute on LinkIterator at ProfilerResultsCV.RuleExecution.pcf: line 115, column 77
    function value_39 () : gw.api.profiler.DbmsReportZipProvider[] {
      return gw.api.profiler.ProfilerPageHelper.getDbmsReports( frame, profilerDataSource ).toTypedArray()
    }
    
    // 'visible' attribute on Row at ProfilerResultsCV.RuleExecution.pcf: line 83, column 110
    function visible_40 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerRuleExecutionHelperFactory.forFrame(frame).isVisible()
    }
    
    property get frame () : gw.api.profiler.ProfilerFrame {
      return getIteratedValue(2) as gw.api.profiler.ProfilerFrame
    }
    
    
  }
  
  
}