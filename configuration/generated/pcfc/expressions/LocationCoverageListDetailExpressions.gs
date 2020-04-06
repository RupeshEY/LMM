package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LocationCoverageListDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationCoverageListDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at LocationCoverageListDetail.pcf: line 13, column 84
    function def_onEnter_0 (def :  pcf.EditablePropertyCoveragesLV) : void {
      def.onEnter(LocationBasedRU.Property, LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at LocationCoverageListDetail.pcf: line 24, column 24
    function def_onEnter_2 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.onEnter(Coverage)
    }
    
    // 'def' attribute on PanelRef at LocationCoverageListDetail.pcf: line 13, column 84
    function def_refreshVariables_1 (def :  pcf.EditablePropertyCoveragesLV) : void {
      def.refreshVariables(LocationBasedRU.Property, LocationBasedRU)
    }
    
    // 'def' attribute on PanelRef at LocationCoverageListDetail.pcf: line 24, column 24
    function def_refreshVariables_3 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.refreshVariables(Coverage)
    }
    
    property get Coverage () : Coverage {
      return getCurrentSelection(0) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setCurrentSelection(0, $arg)
    }
    
    property get LocationBasedRU () : LocationBasedRU {
      return getRequireValue("LocationBasedRU", 0) as LocationBasedRU
    }
    
    property set LocationBasedRU ($arg :  LocationBasedRU) {
      setRequireValue("LocationBasedRU", 0, $arg)
    }
    
    
  }
  
  
}