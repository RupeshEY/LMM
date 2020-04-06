package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerResultsCV_GroupFramesExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ProfilerResultsCV.GroupFrames.pcf: line 75, column 66
    function initialValue_20 () : gw.api.profiler.ProfilerFrameGroupSource {
      return stack == null?null:profilerDataSource.getProfilerFrameGroupSource( stack )
    }
    
    // 'value' attribute on TextInput (id=frames) at ProfilerResultsCV.GroupFrames.pcf: line 81, column 50
    function valueRoot_23 () : java.lang.Object {
      return profilerFrameGroupSource
    }
    
    // 'value' attribute on TextInput (id=frames) at ProfilerResultsCV.GroupFrames.pcf: line 81, column 50
    function value_21 () : java.lang.Integer {
      return profilerFrameGroupSource.FrameCount
    }
    
    // 'value' attribute on TextInput (id=time) at ProfilerResultsCV.GroupFrames.pcf: line 86, column 50
    function value_24 () : java.lang.Integer {
      return profilerFrameGroupSource.TotalElapsedTime
    }
    
    // 'visible' attribute on DetailViewPanel at ProfilerResultsCV.GroupFrames.pcf: line 70, column 39
    function visible_27 () : java.lang.Boolean {
      return stack != null
    }
    
    property get profilerFrameGroupSource () : gw.api.profiler.ProfilerFrameGroupSource {
      return getVariableValue("profilerFrameGroupSource", 2) as gw.api.profiler.ProfilerFrameGroupSource
    }
    
    property set profilerFrameGroupSource ($arg :  gw.api.profiler.ProfilerFrameGroupSource) {
      setVariableValue("profilerFrameGroupSource", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=reportLink) at ProfilerResultsCV.GroupFrames.pcf: line 59, column 80
    function action_17 () : void {
      gw.api.profiler.ProfilerPageHelper.downloadReport(lvStack.getDbmsReport(profilerDataSource))
    }
    
    // 'available' attribute on Link (id=reportLink) at ProfilerResultsCV.GroupFrames.pcf: line 59, column 80
    function available_15 () : java.lang.Boolean {
      return lvStack.getDbmsReport(profilerDataSource) != null
    }
    
    // 'label' attribute on Link (id=reportLink) at ProfilerResultsCV.GroupFrames.pcf: line 59, column 80
    function label_18 () : java.lang.Object {
      return lvStack.getDbmsReport(profilerDataSource).Name
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.GroupFrames.pcf: line 39, column 44
    function valueRoot_8 () : java.lang.Object {
      return lvStack
    }
    
    // 'value' attribute on TextCell (id=elapsedTime) at ProfilerResultsCV.GroupFrames.pcf: line 49, column 48
    function value_12 () : java.lang.Integer {
      return lvStack.TotalElapsedTime
    }
    
    // 'value' attribute on TextCell (id=stackName) at ProfilerResultsCV.GroupFrames.pcf: line 39, column 44
    function value_6 () : java.lang.String {
      return lvStack.StackName
    }
    
    // 'value' attribute on TextCell (id=frameCount) at ProfilerResultsCV.GroupFrames.pcf: line 44, column 48
    function value_9 () : java.lang.Integer {
      return lvStack.FrameCount
    }
    
    property get lvStack () : gw.api.profiler.ProfilerStack {
      return getIteratedValue(2) as gw.api.profiler.ProfilerStack
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerResultsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupFrames.pcf: line 91, column 87
    function def_onEnter_29 (def :  pcf.ProfilerFrameGroupLV) : void {
      def.onEnter(profilerDataSource, profilerDataSource.getProfilerFrameGroupSource( stack ))
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupFrames.pcf: line 91, column 87
    function def_refreshVariables_30 (def :  pcf.ProfilerFrameGroupLV) : void {
      def.refreshVariables(profilerDataSource, profilerDataSource.getProfilerFrameGroupSource( stack ))
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.GroupFrames.pcf: line 39, column 44
    function sortValue_3 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.StackName
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.GroupFrames.pcf: line 44, column 48
    function sortValue_4 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.FrameCount
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.GroupFrames.pcf: line 49, column 48
    function sortValue_5 (lvStack :  gw.api.profiler.ProfilerStack) : java.lang.Object {
      return lvStack.TotalElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerResultsCV.GroupFrames.pcf: line 33, column 57
    function value_19 () : gw.api.profiler.ProfilerStack[] {
      return profilerDataSource.ProfilerStacks
    }
    
    // 'visible' attribute on PanelRef at ProfilerResultsCV.GroupFrames.pcf: line 91, column 87
    function visible_28 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource.StackCount > 1
    }
    
    property get stack () : gw.api.profiler.ProfilerStack {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerStack
    }
    
    property set stack ($arg :  gw.api.profiler.ProfilerStack) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerResultsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupFrames.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerResultsCV.GroupFrames.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.ProfilerResultsEmptyDV) : void {
      def.refreshVariables()
    }
    
    // 'visible' attribute on Card (id=Empty) at ProfilerResultsCV.GroupFrames.pcf: line 16, column 69
    function visible_2 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource == null
    }
    
    // 'visible' attribute on DetailViewPanel at ProfilerResultsCV.GroupFrames.pcf: line 99, column 79
    function visible_31 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource.StackCount == 1
    }
    
    // 'visible' attribute on Card (id=Card) at ProfilerResultsCV.GroupFrames.pcf: line 23, column 69
    function visible_32 () : java.lang.Boolean {
      return profilerDataSource.ProfilerFrameGroupSource != null
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    
  }
  
  
}