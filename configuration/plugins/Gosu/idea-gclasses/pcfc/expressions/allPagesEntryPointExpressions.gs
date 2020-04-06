package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/DefaultEntryPoint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class allPagesEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/DefaultEntryPoint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class allPagesEntryPointExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=*) at DefaultEntryPoint.pcf: line 8, column 42
    function location_0 () : pcf.api.Destination {
      return pcf.ClaimCenterStartupPage.createDestination()
    }
    
    
  }
  
  
}