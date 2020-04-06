package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerOptionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerOptionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=QueryOptimizerTracing) at ProfilerOptionsLV.pcf: line 46, column 55
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.QueryOptimizerTracing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=ExtendedQueryTracing) at ProfilerOptionsLV.pcf: line 60, column 54
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.ExtendedQueryTracing = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=DiffDbmsCounters) at ProfilerOptionsLV.pcf: line 74, column 50
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.DiffDbmsCounters = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextCell (id=DbmsCounterThresholdMs) at ProfilerOptionsLV.pcf: line 88, column 40
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.DbmsCounterThresholdMs = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CheckBoxCell (id=UseNanoTime) at ProfilerOptionsLV.pcf: line 19, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.HiResClock = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=StackTraceTracking) at ProfilerOptionsLV.pcf: line 32, column 52
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      profilerConfig.StackTraceTracking = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on CheckBoxCell (id=UseNanoTime) at ProfilerOptionsLV.pcf: line 19, column 44
    function editable_0 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isHiResolutionClockAvailable()
    }
    
    // 'editable' attribute on CheckBoxCell (id=QueryOptimizerTracing) at ProfilerOptionsLV.pcf: line 46, column 55
    function editable_11 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isQueryOptimizerTracingAvailable()
    }
    
    // 'editable' attribute on CheckBoxCell (id=ExtendedQueryTracing) at ProfilerOptionsLV.pcf: line 60, column 54
    function editable_18 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isExtendedQueryTracingAvailable()
    }
    
    // 'editable' attribute on CheckBoxCell (id=DiffDbmsCounters) at ProfilerOptionsLV.pcf: line 74, column 50
    function editable_25 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable() 
    }
    
    // 'editable' attribute on TextCell (id=DbmsCounterThresholdMs) at ProfilerOptionsLV.pcf: line 88, column 40
    function editable_32 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable() and profilerConfig.DiffDbmsCounters
    }
    
    // 'value' attribute on CheckBoxCell (id=UseNanoTime) at ProfilerOptionsLV.pcf: line 19, column 44
    function valueRoot_5 () : java.lang.Object {
      return profilerConfig
    }
    
    // 'value' attribute on CheckBoxCell (id=UseNanoTime) at ProfilerOptionsLV.pcf: line 19, column 44
    function value_1 () : java.lang.Boolean {
      return profilerConfig.HiResClock
    }
    
    // 'value' attribute on CheckBoxCell (id=QueryOptimizerTracing) at ProfilerOptionsLV.pcf: line 46, column 55
    function value_12 () : java.lang.Boolean {
      return profilerConfig.QueryOptimizerTracing
    }
    
    // 'value' attribute on CheckBoxCell (id=ExtendedQueryTracing) at ProfilerOptionsLV.pcf: line 60, column 54
    function value_19 () : java.lang.Boolean {
      return profilerConfig.ExtendedQueryTracing
    }
    
    // 'value' attribute on CheckBoxCell (id=DiffDbmsCounters) at ProfilerOptionsLV.pcf: line 74, column 50
    function value_26 () : java.lang.Boolean {
      return profilerConfig.DiffDbmsCounters
    }
    
    // 'value' attribute on TextCell (id=DbmsCounterThresholdMs) at ProfilerOptionsLV.pcf: line 88, column 40
    function value_33 () : java.lang.Integer {
      return profilerConfig.DbmsCounterThresholdMs
    }
    
    // 'value' attribute on CheckBoxCell (id=StackTraceTracking) at ProfilerOptionsLV.pcf: line 32, column 52
    function value_7 () : java.lang.Boolean {
      return profilerConfig.StackTraceTracking
    }
    
    // 'visible' attribute on Row at ProfilerOptionsLV.pcf: line 69, column 85
    function visible_31 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()
    }
    
    property get profilerConfig () : ProfilerConfig {
      return getRequireValue("profilerConfig", 0) as ProfilerConfig
    }
    
    property set profilerConfig ($arg :  ProfilerConfig) {
      setRequireValue("profilerConfig", 0, $arg)
    }
    
    
  }
  
  
}