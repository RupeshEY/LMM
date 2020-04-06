package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/Profiler.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/Profiler.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=Profiler) at Profiler.pcf: line 7, column 28
    function location_0 () : pcf.api.Destination {
      return pcf.Profiler.createDestination()
    }
    
    
  }
  
  
}