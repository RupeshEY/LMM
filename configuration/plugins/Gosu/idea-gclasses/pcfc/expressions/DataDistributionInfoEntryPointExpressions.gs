package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DataDistributionInfoEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataDistributionInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=DataDistributionInfo) at DataDistributionInfo.pcf: line 8, column 40
    function location_0 () : pcf.api.Destination {
      return pcf.DataDistributionInfo.createDestination()
    }
    
    
  }
  
  
}