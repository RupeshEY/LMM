package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InjuryIncidentDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (injuryIncident :  InjuryIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=InjuryIncidentDetailPrint) at InjuryIncidentDetailPrint.pcf: line 10, column 70
    static function canVisit_2 (injuryIncident :  InjuryIncident) : java.lang.Boolean {
      return perm.Incident.view(injuryIncident)
    }
    
    // 'def' attribute on PanelRef at InjuryIncidentDetailPrint.pcf: line 20, column 49
    function def_onEnter_0 (def :  pcf.InjuryIncidentDV) : void {
      def.onEnter(injuryIncident)
    }
    
    // 'def' attribute on PanelRef at InjuryIncidentDetailPrint.pcf: line 20, column 49
    function def_refreshVariables_1 (def :  pcf.InjuryIncidentDV) : void {
      def.refreshVariables(injuryIncident)
    }
    
    // 'parent' attribute on Page (id=InjuryIncidentDetailPrint) at InjuryIncidentDetailPrint.pcf: line 10, column 70
    static function parent_3 (injuryIncident :  InjuryIncident) : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(injuryIncident.Claim)
    }
    
    override property get CurrentLocation () : pcf.InjuryIncidentDetailPrint {
      return super.CurrentLocation as pcf.InjuryIncidentDetailPrint
    }
    
    property get injuryIncident () : InjuryIncident {
      return getVariableValue("injuryIncident", 0) as InjuryIncident
    }
    
    property set injuryIncident ($arg :  InjuryIncident) {
      setVariableValue("injuryIncident", 0, $arg)
    }
    
    
  }
  
  
}