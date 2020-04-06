package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BaggageIncidentDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aClaim :  Claim, aBaggageIncident :  BaggageIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentDetailPrint.pcf: line 22, column 105
    function def_onEnter_0 (def :  pcf.BaggageIncidentDetailDV) : void {
      def.onEnter(aBaggageIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentDetailPrint.pcf: line 22, column 105
    function def_refreshVariables_1 (def :  pcf.BaggageIncidentDetailDV) : void {
      def.refreshVariables(aBaggageIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'parent' attribute on Page (id=BaggageIncidentDetailPrint) at BaggageIncidentDetailPrint.pcf: line 10, column 71
    static function parent_2 (aBaggageIncident :  BaggageIncident, aClaim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(aClaim)
    }
    
    override property get CurrentLocation () : pcf.BaggageIncidentDetailPrint {
      return super.CurrentLocation as pcf.BaggageIncidentDetailPrint
    }
    
    property get aBaggageIncident () : BaggageIncident {
      return getVariableValue("aBaggageIncident", 0) as BaggageIncident
    }
    
    property set aBaggageIncident ($arg :  BaggageIncident) {
      setVariableValue("aBaggageIncident", 0, $arg)
    }
    
    property get aClaim () : Claim {
      return getVariableValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setVariableValue("aClaim", 0, $arg)
    }
    
    
  }
  
  
}