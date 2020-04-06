package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/entrypoints/ClaimExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimExposureEntryPointExpressions {
  @javax.annotation.Generated("config/web/pcf/entrypoints/ClaimExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposureExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on EntryPoint (id=ClaimExposure) at ClaimExposure.pcf: line 8, column 92
    function location_0 () : pcf.api.Destination {
      return pcf.ClaimExposureEntryPointForward.createDestination(claimNumber, exposureClaimOrder, exposureId)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get exposureClaimOrder () : String {
      return getVariableValue("exposureClaimOrder", 0) as String
    }
    
    property set exposureClaimOrder ($arg :  String) {
      setVariableValue("exposureClaimOrder", 0, $arg)
    }
    
    property get exposureId () : String {
      return getVariableValue("exposureId", 0) as String
    }
    
    property set exposureId ($arg :  String) {
      setVariableValue("exposureId", 0, $arg)
    }
    
    
  }
  
  
}