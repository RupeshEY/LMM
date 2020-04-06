package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/ClaimMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMetricsEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/ClaimMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMetricsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=ClaimMetrics) at ClaimMetrics.pcf: line 8, column 59
    function location_0 () : pcf.api.Destination {
      return pcf.ClaimMetricsEntryPointForward.createDestination(claimNumber)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    
  }
  
  
}