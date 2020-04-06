package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditDwellingIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditDwellingIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, startInEditMode :  boolean) : int {
      return 2
    }
    
    static function __constructorIndex (dwellingIncident :  DwellingIncident) : int {
      return 1
    }
    
    static function __constructorIndex (dwellingIncident :  DwellingIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    // 'afterEnter' attribute on Popup (id=EditDwellingIncidentPopup) at EditDwellingIncidentPopup.pcf: line 12, column 72
    function afterEnter_5 () : void {
      initializeVariable()
    }
    
    // 'beforeCommit' attribute on Popup (id=EditDwellingIncidentPopup) at EditDwellingIncidentPopup.pcf: line 12, column 72
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      dwellingIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); dwellingIncident.Claim.instructNewServiceRequests() 
    }
    
    // 'canEdit' attribute on Popup (id=EditDwellingIncidentPopup) at EditDwellingIncidentPopup.pcf: line 12, column 72
    function canEdit_7 () : java.lang.Boolean {
      return perm.Incident.edit(dwellingIncident)
    }
    
    // 'canVisit' attribute on Popup (id=EditDwellingIncidentPopup) at EditDwellingIncidentPopup.pcf: line 12, column 72
    static function canVisit_8 (Claim :  Claim, dwellingIncident :  DwellingIncident, startInEditMode :  boolean) : java.lang.Boolean {
      return dwellingIncident != null or Claim != null
    }
    
    // 'def' attribute on PanelRef at EditDwellingIncidentPopup.pcf: line 47, column 76
    function def_onEnter_3 (def :  pcf.DwellingIncidentCV) : void {
      def.onEnter(dwellingIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at EditDwellingIncidentPopup.pcf: line 47, column 76
    function def_refreshVariables_4 (def :  pcf.DwellingIncidentCV) : void {
      def.refreshVariables(dwellingIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at EditDwellingIncidentPopup.pcf: line 36, column 45
    function icon_1 () : java.lang.String {
      return dwellingIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at EditDwellingIncidentPopup.pcf: line 32, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at EditDwellingIncidentPopup.pcf: line 38, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditDwellingIncidentPopup) at EditDwellingIncidentPopup.pcf: line 12, column 72
    function startInEditMode_9 () : java.lang.Boolean {
      return startInEditMode
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.EditDwellingIncidentPopup {
      return super.CurrentLocation as pcf.EditDwellingIncidentPopup
    }
    
    property get dwellingIncident () : DwellingIncident {
      return getVariableValue("dwellingIncident", 0) as DwellingIncident
    }
    
    property set dwellingIncident ($arg :  DwellingIncident) {
      setVariableValue("dwellingIncident", 0, $arg)
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    function initializeVariable() {
      if (dwellingIncident == null) {
        dwellingIncident = new DwellingIncident();
        Claim.addToIncidents( dwellingIncident );
      }
    }
    
    
  }
  
  
}