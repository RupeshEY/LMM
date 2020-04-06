package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditPropertyContentsIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditPropertyContentsIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  PropertyContentsIncident) : int {
      return 1
    }
    
    static function __constructorIndex (incident :  PropertyContentsIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=EditPropertyContentsIncidentPopup) at EditPropertyContentsIncidentPopup.pcf: line 11, column 80
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      incident.updatePropertyContentsLineItemsBeforeCommit(); incident.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Popup (id=EditPropertyContentsIncidentPopup) at EditPropertyContentsIncidentPopup.pcf: line 11, column 80
    function canEdit_5 () : java.lang.Boolean {
      return perm.Incident.edit(incident)
    }
    
    // 'canVisit' attribute on Popup (id=EditPropertyContentsIncidentPopup) at EditPropertyContentsIncidentPopup.pcf: line 11, column 80
    static function canVisit_6 (incident :  PropertyContentsIncident, startInEditMode :  boolean) : java.lang.Boolean {
      return incident != null
    }
    
    // 'def' attribute on PanelRef at EditPropertyContentsIncidentPopup.pcf: line 37, column 59
    function def_onEnter_2 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at EditPropertyContentsIncidentPopup.pcf: line 37, column 59
    function def_refreshVariables_3 (def :  pcf.PropertyContentsIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at EditPropertyContentsIncidentPopup.pcf: line 26, column 37
    function icon_0 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // EditButtons at EditPropertyContentsIncidentPopup.pcf: line 28, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditPropertyContentsIncidentPopup) at EditPropertyContentsIncidentPopup.pcf: line 11, column 80
    function startInEditMode_7 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.EditPropertyContentsIncidentPopup {
      return super.CurrentLocation as pcf.EditPropertyContentsIncidentPopup
    }
    
    property get incident () : PropertyContentsIncident {
      return getVariableValue("incident", 0) as PropertyContentsIncident
    }
    
    property set incident ($arg :  PropertyContentsIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    
  }
  
  
}