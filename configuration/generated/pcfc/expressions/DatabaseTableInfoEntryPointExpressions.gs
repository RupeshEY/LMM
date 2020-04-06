package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/DatabaseTableInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseTableInfoEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/DatabaseTableInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseTableInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=DatabaseTableInfo) at DatabaseTableInfo.pcf: line 8, column 37
    function location_0 () : pcf.api.Destination {
      return pcf.DatabaseTableInfo.createDestination()
    }
    
    
  }
  
  
}