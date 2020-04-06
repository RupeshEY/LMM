package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewPropertyContentsIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPropertyContentsIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewPropertyContentsIncidentPopup) at NewPropertyContentsIncidentPopup.pcf: line 12, column 79
    function beforeCommit_6 (pickedValue :  PropertyContentsIncident) : void {
      incident.updatePropertyContentsLineItemsBeforeCommit()
    }
    
    // 'canVisit' attribute on Popup (id=NewPropertyContentsIncidentPopup) at NewPropertyContentsIncidentPopup.pcf: line 12, column 79
    static function canVisit_7 (claim :  Claim) : java.lang.Boolean {
      return claim != null and perm.Claim.createincident(claim)
    }
    
    // 'def' attribute on PanelRef at NewPropertyContentsIncidentPopup.pcf: line 31, column 59
    function def_onEnter_4 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at NewPropertyContentsIncidentPopup.pcf: line 31, column 59
    function def_refreshVariables_5 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at NewPropertyContentsIncidentPopup.pcf: line 25, column 37
    function icon_1 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewPropertyContentsIncidentPopup.pcf: line 21, column 47
    function initialValue_0 () : entity.PropertyContentsIncident {
      return createIncident()
    }
    
    // EditButtons at NewPropertyContentsIncidentPopup.pcf: line 28, column 33
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewPropertyContentsIncidentPopup.pcf: line 28, column 33
    function pickValue_2 () : PropertyContentsIncident {
      return incident
    }
    
    override property get CurrentLocation () : pcf.NewPropertyContentsIncidentPopup {
      return super.CurrentLocation as pcf.NewPropertyContentsIncidentPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get incident () : entity.PropertyContentsIncident {
      return getVariableValue("incident", 0) as entity.PropertyContentsIncident
    }
    
    property set incident ($arg :  entity.PropertyContentsIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
    function createIncident() : PropertyContentsIncident {
      var newIncident = claim.newIncident(entity.PropertyContentsIncident) as PropertyContentsIncident
      return newIncident
    }
          
        
    
    
  }
  
  
}