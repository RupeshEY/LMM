package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerAnalysisPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerAnalysisPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadButton) at ProfilerAnalysisPanelSet.pcf: line 41, column 62
    function action_9 () : void {
      gw.api.profiler.ProfilerStacksDownloaderUploader.download(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_10 (def :  pcf.ProfilerResultsCV_Chrono) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_12 (def :  pcf.ProfilerResultsCV_Elapsed) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_14 (def :  pcf.ProfilerResultsCV_GroupFrames) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_16 (def :  pcf.ProfilerResultsCV_GroupStacks) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_18 (def :  pcf.ProfilerResultsCV_NameThisQuery) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_20 (def :  pcf.ProfilerResultsCV_QuerySpelunker) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_22 (def :  pcf.ProfilerResultsCV_RuleExecution) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_24 (def :  pcf.ProfilerResultsCV_StackQuerySummary) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_26 (def :  pcf.ProfilerResultsCV_StacksGrouped) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_onEnter_28 (def :  pcf.ProfilerResultsCV_default) : void {
      def.onEnter(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_11 (def :  pcf.ProfilerResultsCV_Chrono) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_13 (def :  pcf.ProfilerResultsCV_Elapsed) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_15 (def :  pcf.ProfilerResultsCV_GroupFrames) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_17 (def :  pcf.ProfilerResultsCV_GroupStacks) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_19 (def :  pcf.ProfilerResultsCV_NameThisQuery) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_21 (def :  pcf.ProfilerResultsCV_QuerySpelunker) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_23 (def :  pcf.ProfilerResultsCV_RuleExecution) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_25 (def :  pcf.ProfilerResultsCV_StackQuerySummary) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_27 (def :  pcf.ProfilerResultsCV_StacksGrouped) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'def' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function def_refreshVariables_29 (def :  pcf.ProfilerResultsCV_default) : void {
      def.refreshVariables(profilerDataSource)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      viewType = (__VALUE_TO_SET as com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType)
    }
    
    // 'initialValue' attribute on Variable at ProfilerAnalysisPanelSet.pcf: line 14, column 86
    function initialValue_0 () : com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType {
      return com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.VIEW_STACK_QUERY_SUMMARY
    }
    
    // 'mode' attribute on PanelRef at ProfilerAnalysisPanelSet.pcf: line 20, column 23
    function mode_30 () : java.lang.Object {
      return viewType
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function optionLabel_4 (VALUE :  com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function valueRange_5 () : java.lang.Object {
      return com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.getViewtypes()
    }
    
    // 'value' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function value_1 () : com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType {
      return viewType
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function verifyValueRangeIsAllowedType_6 ($$arg :  com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=ViewType) at ProfilerAnalysisPanelSet.pcf: line 32, column 94
    function verifyValueRange_7 () : void {
      var __valueRangeArg = com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.getViewtypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on ToolbarButton (id=DownloadButton) at ProfilerAnalysisPanelSet.pcf: line 41, column 62
    function visible_8 () : java.lang.Boolean {
      return entryPointType != "SavedFile"
    }
    
    property get entryPointType () : String {
      return getRequireValue("entryPointType", 0) as String
    }
    
    property set entryPointType ($arg :  String) {
      setRequireValue("entryPointType", 0, $arg)
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    property get viewType () : com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType {
      return getVariableValue("viewType", 0) as com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType
    }
    
    property set viewType ($arg :  com.guidewire.pl.web.internaltools.profiler.ProfilerViewTypes.ViewType) {
      setVariableValue("viewType", 0, $arg)
    }
    
    
  }
  
  
}