package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewDwellingIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewDwellingIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/NewDwellingIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewDwellingIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewDwellingIncidentPopup) at NewDwellingIncidentPopup.pcf: line 12, column 71
    function beforeCommit_7 (pickedValue :  DwellingIncident) : void {
      dwellingIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); dwellingIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canVisit' attribute on Popup (id=NewDwellingIncidentPopup) at NewDwellingIncidentPopup.pcf: line 12, column 71
    static function canVisit_8 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createincident(claim)
    }
    
    // 'def' attribute on PanelRef at NewDwellingIncidentPopup.pcf: line 35, column 76
    function def_onEnter_5 (def :  pcf.DwellingIncidentCV) : void {
      def.onEnter(dwellingIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewDwellingIncidentPopup.pcf: line 35, column 76
    function def_refreshVariables_6 (def :  pcf.DwellingIncidentCV) : void {
      def.refreshVariables(dwellingIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at NewDwellingIncidentPopup.pcf: line 29, column 45
    function icon_2 () : java.lang.String {
      return dwellingIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewDwellingIncidentPopup.pcf: line 21, column 39
    function initialValue_0 () : entity.DwellingIncident {
      return claim.newIncident(entity.DwellingIncident) as DwellingIncident
    }
    
    // 'initialValue' attribute on Variable at NewDwellingIncidentPopup.pcf: line 25, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at NewDwellingIncidentPopup.pcf: line 32, column 41
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewDwellingIncidentPopup.pcf: line 32, column 41
    function pickValue_3 () : DwellingIncident {
      return dwellingIncident
    }
    
    override property get CurrentLocation () : pcf.NewDwellingIncidentPopup {
      return super.CurrentLocation as pcf.NewDwellingIncidentPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get dwellingIncident () : entity.DwellingIncident {
      return getVariableValue("dwellingIncident", 0) as entity.DwellingIncident
    }
    
    property set dwellingIncident ($arg :  entity.DwellingIncident) {
      setVariableValue("dwellingIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}