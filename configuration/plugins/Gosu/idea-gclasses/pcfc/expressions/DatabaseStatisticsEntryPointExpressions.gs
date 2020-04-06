package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/DatabaseStatistics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseStatisticsEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/DatabaseStatistics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStatisticsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=DatabaseStatistics) at DatabaseStatistics.pcf: line 8, column 38
    function location_0 () : pcf.api.Destination {
      return pcf.DatabaseStatistics.createDestination()
    }
    
    
  }
  
  
}