package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerAnalysisScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ProfilerAnalysisScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_10 (def :  pcf.PickProfilerSourceLV_StartablePlugin) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_12 (def :  pcf.PickProfilerSourceLV_Upgrade) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_14 (def :  pcf.PickProfilerSourceLV_Web) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_16 (def :  pcf.PickProfilerSourceLV_WebService) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_18 (def :  pcf.PickProfilerSourceLV_WorkQueue) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_2 (def :  pcf.PickProfilerSourceLV_BatchProcess) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 38, column 77
    function def_onEnter_21 (def :  pcf.ProfilerAnalysisPanelSet) : void {
      def.onEnter(profilerSource, entryPointType)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_4 (def :  pcf.PickProfilerSourceLV_ByTime) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_6 (def :  pcf.PickProfilerSourceLV_MessageDestination) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_onEnter_8 (def :  pcf.PickProfilerSourceLV_SavedFile) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_11 (def :  pcf.PickProfilerSourceLV_StartablePlugin) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_13 (def :  pcf.PickProfilerSourceLV_Upgrade) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_15 (def :  pcf.PickProfilerSourceLV_Web) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_17 (def :  pcf.PickProfilerSourceLV_WebService) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_19 (def :  pcf.PickProfilerSourceLV_WorkQueue) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 38, column 77
    function def_refreshVariables_22 (def :  pcf.ProfilerAnalysisPanelSet) : void {
      def.refreshVariables(profilerSource, entryPointType)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_3 (def :  pcf.PickProfilerSourceLV_BatchProcess) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_5 (def :  pcf.PickProfilerSourceLV_ByTime) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_7 (def :  pcf.PickProfilerSourceLV_MessageDestination) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function def_refreshVariables_9 (def :  pcf.PickProfilerSourceLV_SavedFile) : void {
      def.refreshVariables()
    }
    
    // 'addLabel' attribute on IteratorButtons at ProfilerAnalysisScreen.pcf: line 29, column 70
    function label_1 () : java.lang.Object {
      return (entryPointType == "SavedFile") ? DisplayKey.get("Button.Upload") : DisplayKey.get("Button.Search") as String 
    }
    
    // 'mode' attribute on PanelRef at ProfilerAnalysisScreen.pcf: line 21, column 31
    function mode_20 () : java.lang.Object {
      return entryPointType
    }
    
    property get profilerSource () : gw.api.profiler.ProfilerDataSource {
      return getCurrentSelection(1) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ProfilerAnalysisScreen.pcf: line 15, column 22
    function initialValue_0 () : String {
      return entryType
    }
    
    property get entryPointType () : String {
      return getVariableValue("entryPointType", 0) as String
    }
    
    property set entryPointType ($arg :  String) {
      setVariableValue("entryPointType", 0, $arg)
    }
    
    property get entryType () : String {
      return getRequireValue("entryType", 0) as String
    }
    
    property set entryType ($arg :  String) {
      setRequireValue("entryType", 0, $arg)
    }
    
    
  }
  
  
}