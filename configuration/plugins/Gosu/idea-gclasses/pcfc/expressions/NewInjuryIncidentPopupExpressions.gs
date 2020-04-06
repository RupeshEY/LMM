package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/injury/NewInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewInjuryIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/injury/NewInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInjuryIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, Exposure :  Exposure) : int {
      return 1
    }
    
    // 'afterEnter' attribute on Popup (id=NewInjuryIncidentPopup) at NewInjuryIncidentPopup.pcf: line 12, column 69
    function afterEnter_6 () : void {
      if ((Exposure != null) && (Exposure.Claimant typeis Person)) { InjuryIncident.injured = Exposure.Claimant }
    }
    
    // 'canVisit' attribute on Popup (id=NewInjuryIncidentPopup) at NewInjuryIncidentPopup.pcf: line 12, column 69
    static function canVisit_7 (Claim :  Claim, Exposure :  Exposure) : java.lang.Boolean {
      return perm.Claim.createincident(Claim)
    }
    
    // 'def' attribute on PanelRef at NewInjuryIncidentPopup.pcf: line 36, column 49
    function def_onEnter_4 (def :  pcf.InjuryIncidentDV) : void {
      def.onEnter(InjuryIncident)
    }
    
    // 'def' attribute on PanelRef at NewInjuryIncidentPopup.pcf: line 36, column 49
    function def_refreshVariables_5 (def :  pcf.InjuryIncidentDV) : void {
      def.refreshVariables(InjuryIncident)
    }
    
    // 'icon' attribute on TitleBar at NewInjuryIncidentPopup.pcf: line 30, column 43
    function icon_1 () : java.lang.String {
      return InjuryIncident.HeaderIcon
    }
    
    // 'initialValue' attribute on Variable at NewInjuryIncidentPopup.pcf: line 26, column 37
    function initialValue_0 () : entity.InjuryIncident {
      return Claim.newIncident(entity.InjuryIncident) as InjuryIncident
    }
    
    // EditButtons at NewInjuryIncidentPopup.pcf: line 33, column 39
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewInjuryIncidentPopup.pcf: line 33, column 39
    function pickValue_2 () : InjuryIncident {
      return InjuryIncident
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewInjuryIncidentPopup {
      return super.CurrentLocation as pcf.NewInjuryIncidentPopup
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get InjuryIncident () : entity.InjuryIncident {
      return getVariableValue("InjuryIncident", 0) as entity.InjuryIncident
    }
    
    property set InjuryIncident ($arg :  entity.InjuryIncident) {
      setVariableValue("InjuryIncident", 0, $arg)
    }
    
    
  }
  
  
}