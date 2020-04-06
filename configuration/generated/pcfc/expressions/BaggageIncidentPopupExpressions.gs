package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BaggageIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (baggageIncidentParam :  BaggageIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    static function __constructorIndex (aClaim :  Claim) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=BaggageIncidentPopup) at BaggageIncidentPopup.pcf: line 13, column 71
    function beforeCommit_7 (pickedValue :  BaggageIncident) : void {
      aBaggageIncident.updateLineItemsBeforeCommit(); aBaggageIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); aBaggageIncident.Claim.instructNewServiceRequests()
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentPopup.pcf: line 51, column 81
    function def_onEnter_5 (def :  pcf.BaggageIncidentDetailDV) : void {
      def.onEnter(aBaggageIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at BaggageIncidentPopup.pcf: line 51, column 81
    function def_refreshVariables_6 (def :  pcf.BaggageIncidentDetailDV) : void {
      def.refreshVariables(aBaggageIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at BaggageIncidentPopup.pcf: line 39, column 45
    function icon_2 () : java.lang.String {
      return aBaggageIncident.HeaderIcon
    }
    
    // 'infoBar' attribute on Popup (id=BaggageIncidentPopup) at BaggageIncidentPopup.pcf: line 13, column 71
    function infoBar_onEnter_8 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(aBaggageIncident.Claim)
    }
    
    // 'infoBar' attribute on Popup (id=BaggageIncidentPopup) at BaggageIncidentPopup.pcf: line 13, column 71
    function infoBar_refreshVariables_9 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(aBaggageIncident.Claim)
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentPopup.pcf: line 21, column 31
    function initialValue_0 () : BaggageIncident {
      return baggageIncidentParam == null ? aClaim.newIncident(entity.BaggageIncident) as BaggageIncident : baggageIncidentParam
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentPopup.pcf: line 35, column 51
    function initialValue_1 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // EditButtons at BaggageIncidentPopup.pcf: line 42, column 41
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at BaggageIncidentPopup.pcf: line 42, column 41
    function pickValue_3 () : BaggageIncident {
      return aBaggageIncident
    }
    
    // 'startInEditMode' attribute on Popup (id=BaggageIncidentPopup) at BaggageIncidentPopup.pcf: line 13, column 71
    function startInEditMode_10 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.BaggageIncidentPopup {
      return super.CurrentLocation as pcf.BaggageIncidentPopup
    }
    
    property get aBaggageIncident () : BaggageIncident {
      return getVariableValue("aBaggageIncident", 0) as BaggageIncident
    }
    
    property set aBaggageIncident ($arg :  BaggageIncident) {
      setVariableValue("aBaggageIncident", 0, $arg)
    }
    
    property get aClaim () : Claim {
      return getVariableValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setVariableValue("aClaim", 0, $arg)
    }
    
    property get baggageIncidentParam () : BaggageIncident {
      return getVariableValue("baggageIncidentParam", 0) as BaggageIncident
    }
    
    property set baggageIncidentParam ($arg :  BaggageIncident) {
      setVariableValue("baggageIncidentParam", 0, $arg)
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