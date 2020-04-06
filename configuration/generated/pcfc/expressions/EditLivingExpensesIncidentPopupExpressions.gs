package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditLivingExpensesIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditLivingExpensesIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  LivingExpensesIncident) : int {
      return 0
    }
    
    static function __constructorIndex (incident :  LivingExpensesIncident, startInEditMode :  Boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=EditLivingExpensesIncidentPopup) at EditLivingExpensesIncidentPopup.pcf: line 11, column 80
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      incident.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Popup (id=EditLivingExpensesIncidentPopup) at EditLivingExpensesIncidentPopup.pcf: line 11, column 80
    function canEdit_5 () : java.lang.Boolean {
      return perm.Incident.edit(incident)
    }
    
    // 'canVisit' attribute on Popup (id=EditLivingExpensesIncidentPopup) at EditLivingExpensesIncidentPopup.pcf: line 11, column 80
    static function canVisit_6 (incident :  LivingExpensesIncident, startInEditMode :  Boolean) : java.lang.Boolean {
      return incident != null
    }
    
    // 'def' attribute on PanelRef at EditLivingExpensesIncidentPopup.pcf: line 37, column 57
    function def_onEnter_2 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef at EditLivingExpensesIncidentPopup.pcf: line 37, column 57
    function def_refreshVariables_3 (def :  pcf.LivingExpensesIncidentPanelSet) : void {
      def.refreshVariables(incident)
    }
    
    // 'icon' attribute on TitleBar at EditLivingExpensesIncidentPopup.pcf: line 26, column 37
    function icon_0 () : java.lang.String {
      return incident.HeaderIcon
    }
    
    // EditButtons at EditLivingExpensesIncidentPopup.pcf: line 28, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditLivingExpensesIncidentPopup) at EditLivingExpensesIncidentPopup.pcf: line 11, column 80
    function startInEditMode_7 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.EditLivingExpensesIncidentPopup {
      return super.CurrentLocation as pcf.EditLivingExpensesIncidentPopup
    }
    
    property get incident () : LivingExpensesIncident {
      return getVariableValue("incident", 0) as LivingExpensesIncident
    }
    
    property set incident ($arg :  LivingExpensesIncident) {
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