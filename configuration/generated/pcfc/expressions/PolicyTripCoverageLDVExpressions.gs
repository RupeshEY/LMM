package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyTripCoverageLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTripCoverageLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyTripCoverageLDV.pcf: line 14, column 23
    function def_onEnter_1 (def :  pcf.EditableTripCoveragesLV) : void {
      def.onEnter(aTripRU)
    }
    
    // 'def' attribute on PanelRef at PolicyTripCoverageLDV.pcf: line 26, column 24
    function def_onEnter_3 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.onEnter(coverage)
    }
    
    // 'def' attribute on PanelRef at PolicyTripCoverageLDV.pcf: line 14, column 23
    function def_refreshVariables_2 (def :  pcf.EditableTripCoveragesLV) : void {
      def.refreshVariables(aTripRU)
    }
    
    // 'def' attribute on PanelRef at PolicyTripCoverageLDV.pcf: line 26, column 24
    function def_refreshVariables_4 (def :  pcf.ClaimPolicyCovTermsCV) : void {
      def.refreshVariables(coverage)
    }
    
    // 'visible' attribute on TitleBar at PolicyTripCoverageLDV.pcf: line 18, column 37
    function visible_0 () : java.lang.Boolean {
      return coverage != null
    }
    
    property get aTripRU () : TripRU {
      return getRequireValue("aTripRU", 0) as TripRU
    }
    
    property set aTripRU ($arg :  TripRU) {
      setRequireValue("aTripRU", 0, $arg)
    }
    
    property get coverage () : Coverage {
      return getCurrentSelection(0) as Coverage
    }
    
    property set coverage ($arg :  Coverage) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  
}