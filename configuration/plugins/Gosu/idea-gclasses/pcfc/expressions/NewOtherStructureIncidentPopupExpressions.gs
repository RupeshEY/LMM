package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewOtherStructureIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOtherStructureIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=NewOtherStructureIncidentPopup) at NewOtherStructureIncidentPopup.pcf: line 11, column 80
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return claim != null and perm.Claim.createincident(claim)
    }
    
    // 'def' attribute on PanelRef at NewOtherStructureIncidentPopup.pcf: line 30, column 51
    function def_onEnter_4 (def :  pcf.OtherStructureIncidentCV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at NewOtherStructureIncidentPopup.pcf: line 30, column 51
    function def_refreshVariables_5 (def :  pcf.OtherStructureIncidentCV) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at NewOtherStructureIncidentPopup.pcf: line 24, column 37
    function icon_1 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewOtherStructureIncidentPopup.pcf: line 17, column 45
    function initialValue_0 () : entity.OtherStructureIncident {
      return createIncident()
    }
    
    // EditButtons at NewOtherStructureIncidentPopup.pcf: line 27, column 33
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewOtherStructureIncidentPopup.pcf: line 27, column 33
    function pickValue_2 () : OtherStructureIncident {
      return incident
    }
    
    override property get CurrentLocation () : pcf.NewOtherStructureIncidentPopup {
      return super.CurrentLocation as pcf.NewOtherStructureIncidentPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get incident () : entity.OtherStructureIncident {
      return getVariableValue("incident", 0) as entity.OtherStructureIncident
    }
    
    property set incident ($arg :  entity.OtherStructureIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
    function createIncident() : OtherStructureIncident {
      var newIncident = claim.newIncident(entity.OtherStructureIncident) as OtherStructureIncident
      return newIncident
    }
          
        
    
    
  }
  
  
}