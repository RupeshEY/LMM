package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LivingExpensesIncidentPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesIncidentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at LivingExpensesIncidentPanelSet.pcf: line 71, column 36
    function def_onEnter_25 (def :  pcf.IncidentExposuresLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesIncidentPanelSet.pcf: line 93, column 118
    function def_onEnter_31 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on PanelRef (id=LodgingProviderLV) at LivingExpensesIncidentPanelSet.pcf: line 104, column 34
    function def_onEnter_33 (def :  pcf.LodgingProviderLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at LivingExpensesIncidentPanelSet.pcf: line 71, column 36
    function def_refreshVariables_26 (def :  pcf.IncidentExposuresLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesIncidentPanelSet.pcf: line 93, column 118
    function def_refreshVariables_32 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on PanelRef (id=LodgingProviderLV) at LivingExpensesIncidentPanelSet.pcf: line 104, column 34
    function def_refreshVariables_34 (def :  pcf.LodgingProviderLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'value' attribute on TextInput (id=MealsDays) at LivingExpensesIncidentPanelSet.pcf: line 52, column 48
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.MealsDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=MealsPeople) at LivingExpensesIncidentPanelSet.pcf: line 58, column 48
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.MealsPeople = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LivingExpensesIncidentPanelSet.pcf: line 24, column 47
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=MealsRate) at LivingExpensesIncidentPanelSet.pcf: line 63, column 45
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.MealsRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LivingExpensesIncidentPanelSet.pcf: line 24, column 47
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LivingExpensesIncidentPanelSet.pcf: line 24, column 47
    function value_0 () : java.lang.String {
      return incident.Description
    }
    
    // 'value' attribute on CurrencyInput (id=TotalMealsEstimate) at LivingExpensesIncidentPanelSet.pcf: line 38, column 54
    function value_10 () : gw.api.financials.CurrencyAmount {
      return incident.TotalMealsEstimate
    }
    
    // 'value' attribute on TextInput (id=MealsDays) at LivingExpensesIncidentPanelSet.pcf: line 52, column 48
    function value_13 () : java.lang.Integer {
      return incident.MealsDays
    }
    
    // 'value' attribute on TextInput (id=MealsPeople) at LivingExpensesIncidentPanelSet.pcf: line 58, column 48
    function value_17 () : java.lang.Integer {
      return incident.MealsPeople
    }
    
    // 'value' attribute on CurrencyInput (id=MealsRate) at LivingExpensesIncidentPanelSet.pcf: line 63, column 45
    function value_21 () : gw.api.financials.CurrencyAmount {
      return incident.MealsRate
    }
    
    // 'value' attribute on TextInput (id=ExpectedDuration) at LivingExpensesIncidentPanelSet.pcf: line 28, column 60
    function value_4 () : java.lang.String {
      return incident.ExpectedDurationEstimate
    }
    
    // 'value' attribute on CurrencyInput (id=TotalLodgingEstimate) at LivingExpensesIncidentPanelSet.pcf: line 33, column 56
    function value_7 () : gw.api.financials.CurrencyAmount {
      return incident.TotalLodgingEstimate
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at LivingExpensesIncidentPanelSet.pcf: line 86, column 54
    function visible_27 () : java.lang.Boolean {
      return incident.Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at LivingExpensesIncidentPanelSet.pcf: line 91, column 89
    function visible_29 () : java.lang.Boolean {
      return not incident.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    property get incident () : LivingExpensesIncident {
      return getRequireValue("incident", 0) as LivingExpensesIncident
    }
    
    property set incident ($arg :  LivingExpensesIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    
  }
  
  
}