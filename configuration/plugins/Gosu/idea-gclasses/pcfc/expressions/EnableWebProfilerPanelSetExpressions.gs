package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EnableWebProfilerPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnableWebProfilerPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=TurnProfilingOn) at EnableWebProfilerPanelSet.pcf: line 33, column 107
    function action_6 () : void {
      enableProfiling(enableProfilingActions)
    }
    
    // 'action' attribute on ButtonInput (id=TurnProfilingOff) at EnableWebProfilerPanelSet.pcf: line 39, column 106
    function action_9 () : void {
      disableProfiling(disableProfilingActions)
    }
    
    // 'def' attribute on PanelRef at EnableWebProfilerPanelSet.pcf: line 22, column 102
    function def_onEnter_2 (def :  pcf.ProfilerOptionsLV) : void {
      def.onEnter(profilerConfig)
    }
    
    // 'def' attribute on PanelRef at EnableWebProfilerPanelSet.pcf: line 22, column 102
    function def_refreshVariables_3 (def :  pcf.ProfilerOptionsLV) : void {
      def.refreshVariables(profilerConfig)
    }
    
    // 'initialValue' attribute on Variable at EnableWebProfilerPanelSet.pcf: line 18, column 40
    function initialValue_0 () : entity.WebProfilerConfig {
      return new WebProfilerConfig()
    }
    
    // 'visible' attribute on PanelRef at EnableWebProfilerPanelSet.pcf: line 22, column 102
    function visible_1 () : java.lang.Boolean {
      return !gw.api.profiler.WebSessionProfilerPageHelper.isWebProfilerEnabledInCurrentSession()
    }
    
    // 'visible' attribute on ButtonInput (id=TurnProfilingOff) at EnableWebProfilerPanelSet.pcf: line 39, column 106
    function visible_7 () : java.lang.Boolean {
      return gw.api.profiler.WebSessionProfilerPageHelper.isWebProfilerEnabledInCurrentSession()
    }
    
    property get disableProfilingActions () : block() {
      return getRequireValue("disableProfilingActions", 0) as block()
    }
    
    property set disableProfilingActions ($arg :  block()) {
      setRequireValue("disableProfilingActions", 0, $arg)
    }
    
    property get enableProfilingActions () : block() {
      return getRequireValue("enableProfilingActions", 0) as block()
    }
    
    property set enableProfilingActions ($arg :  block()) {
      setRequireValue("enableProfilingActions", 0, $arg)
    }
    
    property get profilerConfig () : entity.WebProfilerConfig {
      return getVariableValue("profilerConfig", 0) as entity.WebProfilerConfig
    }
    
    property set profilerConfig ($arg :  entity.WebProfilerConfig) {
      setVariableValue("profilerConfig", 0, $arg)
    }
    
    function enableProfiling(b : block()) {
      gw.api.profiler.WebSessionProfilerPageHelper.enableProfiler( null, profilerConfig.HiResClock, profilerConfig.StackTraceTracking, profilerConfig.QueryOptimizerTracing, profilerConfig.ExtendedQueryTracing, profilerConfig.DbmsCounterThresholdMs, profilerConfig.DiffDbmsCounters)
      b()
    }
    
    function disableProfiling(b : block()) {
       gw.api.profiler.WebSessionProfilerPageHelper.disableProfiler()
       b()
    }
    
    
  }
  
  
}