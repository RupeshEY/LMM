package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewLivingExpensesIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLivingExpensesIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=NewLivingExpensesIncidentPopup) at NewLivingExpensesIncidentPopup.pcf: line 11, column 80
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return claim != null and perm.Claim.createincident(claim)
    }
    
    // 'def' attribute on PanelRef at NewLivingExpensesIncidentPopup.pcf: line 30, column 57
    function def_onEnter_4 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at NewLivingExpensesIncidentPopup.pcf: line 30, column 57
    function def_refreshVariables_5 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at NewLivingExpensesIncidentPopup.pcf: line 24, column 37
    function icon_1 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewLivingExpensesIncidentPopup.pcf: line 20, column 45
    function initialValue_0 () : entity.LivingExpensesIncident {
      return createIncident()
    }
    
    // EditButtons at NewLivingExpensesIncidentPopup.pcf: line 27, column 33
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewLivingExpensesIncidentPopup.pcf: line 27, column 33
    function pickValue_2 () : LivingExpensesIncident {
      return incident
    }
    
    override property get CurrentLocation () : pcf.NewLivingExpensesIncidentPopup {
      return super.CurrentLocation as pcf.NewLivingExpensesIncidentPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get incident () : entity.LivingExpensesIncident {
      return getVariableValue("incident", 0) as entity.LivingExpensesIncident
    }
    
    property set incident ($arg :  entity.LivingExpensesIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
    function createIncident() : LivingExpensesIncident {
      var newIncident = claim.newIncident(entity.LivingExpensesIncident) as LivingExpensesIncident
      return newIncident
    }
          
        
    
    
  }
  
  
}