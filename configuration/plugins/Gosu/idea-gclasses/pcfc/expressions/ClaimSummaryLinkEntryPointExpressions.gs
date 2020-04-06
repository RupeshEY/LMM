package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/ClaimSummaryLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryLinkEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/ClaimSummaryLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryLinkExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=ClaimSummaryLink) at ClaimSummaryLink.pcf: line 9, column 46
    function location_0 () : pcf.api.Destination {
      return pcf.ClaimSummaryLink.createDestination(claimNumber)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    
  }
  
  
}