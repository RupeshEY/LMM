package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditFixedPropertyIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditFixedPropertyIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fixedPropertyIncident :  FixedPropertyIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=EditFixedPropertyIncidentPopup) at EditFixedPropertyIncidentPopup.pcf: line 11, column 226
    function beforeCommit_5 (pickedValue :  java.lang.Object) : void {
      fixedPropertyIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); fixedPropertyIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Popup (id=EditFixedPropertyIncidentPopup) at EditFixedPropertyIncidentPopup.pcf: line 11, column 226
    function canEdit_6 () : java.lang.Boolean {
      return perm.Incident.edit(fixedPropertyIncident)
    }
    
    // 'canVisit' attribute on Popup (id=EditFixedPropertyIncidentPopup) at EditFixedPropertyIncidentPopup.pcf: line 11, column 226
    static function canVisit_7 (fixedPropertyIncident :  FixedPropertyIncident, startInEditMode :  boolean) : java.lang.Boolean {
      return fixedPropertyIncident != null
    }
    
    // 'def' attribute on PanelRef at EditFixedPropertyIncidentPopup.pcf: line 39, column 86
    function def_onEnter_3 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.onEnter(fixedPropertyIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at EditFixedPropertyIncidentPopup.pcf: line 39, column 86
    function def_refreshVariables_4 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.refreshVariables(fixedPropertyIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at EditFixedPropertyIncidentPopup.pcf: line 28, column 50
    function icon_1 () : java.lang.String {
      return fixedPropertyIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at EditFixedPropertyIncidentPopup.pcf: line 24, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at EditFixedPropertyIncidentPopup.pcf: line 30, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditFixedPropertyIncidentPopup) at EditFixedPropertyIncidentPopup.pcf: line 11, column 226
    function startInEditMode_8 () : java.lang.Boolean {
      return startInEditMode
    }
    
    // 'title' attribute on Popup (id=EditFixedPropertyIncidentPopup) at EditFixedPropertyIncidentPopup.pcf: line 11, column 226
    static function title_9 (fixedPropertyIncident :  FixedPropertyIncident, startInEditMode :  boolean) : java.lang.Object {
      return fixedPropertyIncident.Claim.Policy.PolicyType == TC_HOMEOWNERS ? DisplayKey.get("Web.EditFixedPropertyIncident.PropertyLiability.Title") : DisplayKey.get("Web.EditFixedPropertyIncident.Title")
    }
    
    override property get CurrentLocation () : pcf.EditFixedPropertyIncidentPopup {
      return super.CurrentLocation as pcf.EditFixedPropertyIncidentPopup
    }
    
    property get fixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("fixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set fixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("fixedPropertyIncident", 0, $arg)
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
    
    
  }
  
  
}