package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/InternalTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InternalToolsEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/InternalTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalToolsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=InternalTools) at InternalTools.pcf: line 8, column 33
    function location_0 () : pcf.api.Destination {
      return pcf.InternalTools.createDestination()
    }
    
    
  }
  
  
}