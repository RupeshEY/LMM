package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixedPropertyIncidentDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fixedPropertyIncident :  FixedPropertyIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=FixedPropertyIncidentDetailPrint) at FixedPropertyIncidentDetailPrint.pcf: line 10, column 77
    static function canVisit_2 (fixedPropertyIncident :  FixedPropertyIncident) : java.lang.Boolean {
      return perm.Incident.view(fixedPropertyIncident)
    }
    
    // 'def' attribute on PanelRef at FixedPropertyIncidentDetailPrint.pcf: line 20, column 110
    function def_onEnter_0 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.onEnter(fixedPropertyIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'def' attribute on PanelRef at FixedPropertyIncidentDetailPrint.pcf: line 20, column 110
    function def_refreshVariables_1 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.refreshVariables(fixedPropertyIncident, new java.util.HashSet<ServiceRequest>())
    }
    
    // 'parent' attribute on Page (id=FixedPropertyIncidentDetailPrint) at FixedPropertyIncidentDetailPrint.pcf: line 10, column 77
    static function parent_3 (fixedPropertyIncident :  FixedPropertyIncident) : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(fixedPropertyIncident.Claim)
    }
    
    override property get CurrentLocation () : pcf.FixedPropertyIncidentDetailPrint {
      return super.CurrentLocation as pcf.FixedPropertyIncidentDetailPrint
    }
    
    property get fixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("fixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set fixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("fixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  
}