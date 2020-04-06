package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LivingExpensesIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/LivingExpensesIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (c :  Claim, incident :  LivingExpensesIncident) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=LivingExpensesIncidentPrint) at LivingExpensesIncidentPrint.pcf: line 10, column 80
    static function canVisit_2 (c :  Claim, incident :  LivingExpensesIncident) : java.lang.Boolean {
      return incident != null and perm.Incident.view(incident)
    }
    
    // 'def' attribute on PanelRef at LivingExpensesIncidentPrint.pcf: line 21, column 57
    function def_onEnter_0 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at LivingExpensesIncidentPrint.pcf: line 21, column 57
    function def_refreshVariables_1 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'parent' attribute on Page (id=LivingExpensesIncidentPrint) at LivingExpensesIncidentPrint.pcf: line 10, column 80
    static function parent_3 (c :  Claim, incident :  LivingExpensesIncident) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(c)
    }
    
    override property get CurrentLocation () : pcf.LivingExpensesIncidentPrint {
      return super.CurrentLocation as pcf.LivingExpensesIncidentPrint
    }
    
    property get c () : Claim {
      return getVariableValue("c", 0) as Claim
    }
    
    property set c ($arg :  Claim) {
      setVariableValue("c", 0, $arg)
    }
    
    property get incident () : LivingExpensesIncident {
      return getVariableValue("incident", 0) as LivingExpensesIncident
    }
    
    property set incident ($arg :  LivingExpensesIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}