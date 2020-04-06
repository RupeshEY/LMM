package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/ExternalLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExternalLinkEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/ExternalLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternalLinkExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=ExternalLink) at ExternalLink.pcf: line 9, column 52
    function location_0 () : pcf.api.Destination {
      return pcf.ExternalLink.createDestination(linkName, claimNumber)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get linkName () : String {
      return getVariableValue("linkName", 0) as String
    }
    
    property set linkName ($arg :  String) {
      setVariableValue("linkName", 0, $arg)
    }
    
    
  }
  
  
}