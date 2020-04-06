package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/Login.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoginEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/Login.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoginExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=Login) at Login.pcf: line 9, column 27
    function location_0 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    
  }
  
  
}