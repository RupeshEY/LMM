package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditInjuryIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditInjuryIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (injuryIncident :  InjuryIncident) : int {
      return 1
    }
    
    static function __constructorIndex (injuryIncident :  InjuryIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      injuryIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    function canEdit_5 () : java.lang.Boolean {
      return perm.Incident.edit(injuryIncident)
    }
    
    // 'canVisit' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    static function canVisit_6 (injuryIncident :  InjuryIncident, startInEditMode :  boolean) : java.lang.Boolean {
      return injuryIncident != null
    }
    
    // 'def' attribute on PanelRef at EditInjuryIncidentPopup.pcf: line 38, column 49
    function def_onEnter_2 (def :  pcf.InjuryIncidentDV) : void {
      def.onEnter(injuryIncident)
    }
    
    // 'def' attribute on PanelRef at EditInjuryIncidentPopup.pcf: line 38, column 49
    function def_refreshVariables_3 (def :  pcf.InjuryIncidentDV) : void {
      def.refreshVariables(injuryIncident)
    }
    
    // 'icon' attribute on TitleBar at EditInjuryIncidentPopup.pcf: line 27, column 43
    function icon_0 () : java.lang.String {
      return injuryIncident.HeaderIcon
    }
    
    // 'infoBar' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    function infoBar_onEnter_7 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(injuryIncident.Claim)
    }
    
    // 'infoBar' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    function infoBar_refreshVariables_8 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(injuryIncident.Claim)
    }
    
    // EditButtons at EditInjuryIncidentPopup.pcf: line 29, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=EditInjuryIncidentPopup) at EditInjuryIncidentPopup.pcf: line 12, column 70
    function startInEditMode_9 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.EditInjuryIncidentPopup {
      return super.CurrentLocation as pcf.EditInjuryIncidentPopup
    }
    
    property get injuryIncident () : InjuryIncident {
      return getVariableValue("injuryIncident", 0) as InjuryIncident
    }
    
    property set injuryIncident ($arg :  InjuryIncident) {
      setVariableValue("injuryIncident", 0, $arg)
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    
  }
  
  
}