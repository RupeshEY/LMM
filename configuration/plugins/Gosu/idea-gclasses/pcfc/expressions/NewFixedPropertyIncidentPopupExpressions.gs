package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewFixedPropertyIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixedPropertyIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewFixedPropertyIncidentPopup) at NewFixedPropertyIncidentPopup.pcf: line 12, column 202
    function beforeCommit_7 (pickedValue :  FixedPropertyIncident) : void {
      fixedPropertyIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); fixedPropertyIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canVisit' attribute on Popup (id=NewFixedPropertyIncidentPopup) at NewFixedPropertyIncidentPopup.pcf: line 12, column 202
    static function canVisit_8 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createincident(claim)
    }
    
    // 'def' attribute on PanelRef at NewFixedPropertyIncidentPopup.pcf: line 41, column 86
    function def_onEnter_5 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.onEnter(fixedPropertyIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewFixedPropertyIncidentPopup.pcf: line 41, column 86
    function def_refreshVariables_6 (def :  pcf.FixPropIncidentDetailDV) : void {
      def.refreshVariables(fixedPropertyIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at NewFixedPropertyIncidentPopup.pcf: line 29, column 50
    function icon_2 () : java.lang.String {
      return fixedPropertyIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewFixedPropertyIncidentPopup.pcf: line 21, column 44
    function initialValue_0 () : entity.FixedPropertyIncident {
      return claim.newIncident(entity.FixedPropertyIncident) as FixedPropertyIncident
    }
    
    // 'initialValue' attribute on Variable at NewFixedPropertyIncidentPopup.pcf: line 25, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at NewFixedPropertyIncidentPopup.pcf: line 32, column 46
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewFixedPropertyIncidentPopup.pcf: line 32, column 46
    function pickValue_3 () : FixedPropertyIncident {
      return fixedPropertyIncident
    }
    
    // 'title' attribute on Popup (id=NewFixedPropertyIncidentPopup) at NewFixedPropertyIncidentPopup.pcf: line 12, column 202
    static function title_9 (claim :  Claim) : java.lang.Object {
      return claim.Policy.PolicyType == TC_HOMEOWNERS ? DisplayKey.get("Web.NewFixedPropertyIncident.PropertyLiability.Title") : DisplayKey.get("Web.NewFixedPropertyIncident.Title")
    }
    
    override property get CurrentLocation () : pcf.NewFixedPropertyIncidentPopup {
      return super.CurrentLocation as pcf.NewFixedPropertyIncidentPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get fixedPropertyIncident () : entity.FixedPropertyIncident {
      return getVariableValue("fixedPropertyIncident", 0) as entity.FixedPropertyIncident
    }
    
    property set fixedPropertyIncident ($arg :  entity.FixedPropertyIncident) {
      setVariableValue("fixedPropertyIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}