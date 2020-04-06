package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/LivingExpensesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LivingExpensesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/LivingExpensesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_NewIncidentMenuItem) at LivingExpensesDV.pcf: line 32, column 105
    function action_5 () : void {
      NewLivingExpensesIncidentPopup.push( Exposure.Claim )
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_EditIncidentMenuItem) at LivingExpensesDV.pcf: line 37, column 106
    function action_7 () : void {
      EditLivingExpensesIncidentPopup.push(Exposure.LivingExpensesIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_ViewIncidentMenuItem) at LivingExpensesDV.pcf: line 42, column 106
    function action_9 () : void {
      EditLivingExpensesIncidentPopup.push(Exposure.LivingExpensesIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_ViewIncidentMenuItem) at LivingExpensesDV.pcf: line 42, column 106
    function action_dest_10 () : pcf.api.Destination {
      return pcf.EditLivingExpensesIncidentPopup.createDestination(Exposure.LivingExpensesIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_NewIncidentMenuItem) at LivingExpensesDV.pcf: line 32, column 105
    function action_dest_6 () : pcf.api.Destination {
      return pcf.NewLivingExpensesIncidentPopup.createDestination( Exposure.Claim )
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_EditIncidentMenuItem) at LivingExpensesDV.pcf: line 37, column 106
    function action_dest_8 () : pcf.api.Destination {
      return pcf.EditLivingExpensesIncidentPopup.createDestination(Exposure.LivingExpensesIncident, true)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 12, column 56
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, false)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 46, column 59
    function def_onEnter_17 (def :  pcf.ExposureCodingFinancialsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 50, column 58
    function def_onEnter_19 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 14, column 51
    function def_onEnter_2 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 12, column 56
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, false)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 46, column 59
    function def_refreshVariables_18 (def :  pcf.ExposureCodingFinancialsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 50, column 58
    function def_refreshVariables_20 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at LivingExpensesDV.pcf: line 14, column 51
    function def_refreshVariables_3 (def :  pcf.ExposureWorkloadInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.LivingExpensesIncident = (__VALUE_TO_SET as entity.LivingExpensesIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function valueRange_14 () : java.lang.Object {
      return Exposure.Claim.LivingExpensesIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function valueRoot_13 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function value_4 () : entity.LivingExpensesIncident {
      return Exposure.LivingExpensesIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.LivingExpensesIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.LivingExpensesIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at LivingExpensesDV.pcf: line 27, column 51
    function verifyValueRange_16 () : void {
      var __valueRangeArg = Exposure.Claim.LivingExpensesIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}