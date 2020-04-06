package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditOtherStructureIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditOtherStructureIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  OtherStructureIncident) : int {
      return 0
    }
    
    static function __constructorIndex (incident :  OtherStructureIncident, startInEditMode :  Boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=EditOtherStructureIncidentPopup) at EditOtherStructureIncidentPopup.pcf: line 11, column 80
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      incident.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Popup (id=EditOtherStructureIncidentPopup) at EditOtherStructureIncidentPopup.pcf: line 11, column 80
    function canEdit_5 () : java.lang.Boolean {
      return perm.Incident.edit(incident)
    }
    
    // 'canVisit' attribute on Popup (id=EditOtherStructureIncidentPopup) at EditOtherStructureIncidentPopup.pcf: line 11, column 80
    static function canVisit_6 (incident :  OtherStructureIncident, startInEditMode :  Boolean) : java.lang.Boolean {
      return incident != null
    }
    
    // 'def' attribute on PanelRef at EditOtherStructureIncidentPopup.pcf: line 37, column 51
    function def_onEnter_2 (def :  pcf.OtherStructureIncidentCV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at EditOtherStructureIncidentPopup.pcf: line 37, column 51
    function def_refreshVariables_3 (def :  pcf.OtherStructureIncidentCV) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at EditOtherStructureIncidentPopup.pcf: line 26, column 37
    function icon_0 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // EditButtons at EditOtherStructureIncidentPopup.pcf: line 28, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditOtherStructureIncidentPopup) at EditOtherStructureIncidentPopup.pcf: line 11, column 80
    function startInEditMode_7 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.EditOtherStructureIncidentPopup {
      return super.CurrentLocation as pcf.EditOtherStructureIncidentPopup
    }
    
    property get incident () : OtherStructureIncident {
      return getVariableValue("incident", 0) as OtherStructureIncident
    }
    
    property set incident ($arg :  OtherStructureIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get startInEditMode () : Boolean {
      return getVariableValue("startInEditMode", 0) as Boolean
    }
    
    property set startInEditMode ($arg :  Boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    
  }
  
  
}