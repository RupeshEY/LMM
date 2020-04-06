package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherStructureIncidentPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureIncidentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at OtherStructureIncidentPanelSet.pcf: line 71, column 36
    function def_onEnter_32 (def :  pcf.IncidentExposuresLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on InputSetRef at OtherStructureIncidentPanelSet.pcf: line 93, column 118
    function def_onEnter_38 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at OtherStructureIncidentPanelSet.pcf: line 71, column 36
    function def_refreshVariables_33 (def :  pcf.IncidentExposuresLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'def' attribute on InputSetRef at OtherStructureIncidentPanelSet.pcf: line 93, column 118
    function def_refreshVariables_39 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at OtherStructureIncidentPanelSet.pcf: line 38, column 65
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.EstRepairCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at OtherStructureIncidentPanelSet.pcf: line 44, column 65
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.EstRepairTime = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at OtherStructureIncidentPanelSet.pcf: line 24, column 47
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at OtherStructureIncidentPanelSet.pcf: line 49, column 48
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AlreadyRepaired) at OtherStructureIncidentPanelSet.pcf: line 54, column 50
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AlreadyRepaired = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FencesDamaged) at OtherStructureIncidentPanelSet.pcf: line 61, column 48
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.FencesDamaged = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatesReceived) at OtherStructureIncidentPanelSet.pcf: line 30, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.EstimatesReceived = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at OtherStructureIncidentPanelSet.pcf: line 24, column 47
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at OtherStructureIncidentPanelSet.pcf: line 24, column 47
    function value_0 () : java.lang.String {
      return incident.Description
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at OtherStructureIncidentPanelSet.pcf: line 44, column 65
    function value_15 () : java.lang.String {
      return incident.EstRepairTime
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at OtherStructureIncidentPanelSet.pcf: line 49, column 48
    function value_20 () : gw.api.financials.CurrencyAmount {
      return incident.LossEstimate
    }
    
    // 'value' attribute on BooleanRadioInput (id=AlreadyRepaired) at OtherStructureIncidentPanelSet.pcf: line 54, column 50
    function value_24 () : java.lang.Boolean {
      return incident.AlreadyRepaired
    }
    
    // 'value' attribute on BooleanRadioInput (id=FencesDamaged) at OtherStructureIncidentPanelSet.pcf: line 61, column 48
    function value_28 () : java.lang.Boolean {
      return incident.FencesDamaged
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatesReceived) at OtherStructureIncidentPanelSet.pcf: line 30, column 43
    function value_4 () : typekey.YesNo {
      return incident.EstimatesReceived
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at OtherStructureIncidentPanelSet.pcf: line 38, column 65
    function value_9 () : gw.api.financials.CurrencyAmount {
      return incident.EstRepairCost
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at OtherStructureIncidentPanelSet.pcf: line 86, column 54
    function visible_34 () : java.lang.Boolean {
      return incident.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at OtherStructureIncidentPanelSet.pcf: line 91, column 89
    function visible_36 () : java.lang.Boolean {
      return not incident.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on CurrencyInput (id=EstimateCost) at OtherStructureIncidentPanelSet.pcf: line 38, column 65
    function visible_8 () : java.lang.Boolean {
      return incident.EstimatesReceived == TC_YES
    }
    
    property get incident () : OtherStructureIncident {
      return getRequireValue("incident", 0) as OtherStructureIncident
    }
    
    property set incident ($arg :  OtherStructureIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    
  }
  
  
}