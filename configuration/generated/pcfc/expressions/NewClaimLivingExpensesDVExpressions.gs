package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimLivingExpensesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimLivingExpensesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_NewIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 30, column 105
    function action_3 () : void {
      NewLivingExpensesIncidentPopup.push( Exposure.Claim )
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_EditIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 35, column 106
    function action_5 () : void {
      EditLivingExpensesIncidentPopup.push(Exposure.LivingExpensesIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_ViewIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 40, column 106
    function action_7 () : void {
      EditLivingExpensesIncidentPopup.push(Exposure.LivingExpensesIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_NewIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 30, column 105
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewLivingExpensesIncidentPopup.createDestination( Exposure.Claim )
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_EditIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 35, column 106
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditLivingExpensesIncidentPopup.createDestination(Exposure.LivingExpensesIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=LivingExpensesDV_ViewIncidentMenuItem) at NewClaimLivingExpensesDV.pcf: line 40, column 106
    function action_dest_8 () : pcf.api.Destination {
      return pcf.EditLivingExpensesIncidentPopup.createDestination(Exposure.LivingExpensesIncident, false)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLivingExpensesDV.pcf: line 12, column 55
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLivingExpensesDV.pcf: line 45, column 58
    function def_onEnter_15 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLivingExpensesDV.pcf: line 12, column 55
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLivingExpensesDV.pcf: line 45, column 58
    function def_refreshVariables_16 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.LivingExpensesIncident = (__VALUE_TO_SET as entity.LivingExpensesIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function valueRange_12 () : java.lang.Object {
      return Exposure.Claim.LivingExpensesIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function valueRoot_11 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function value_2 () : entity.LivingExpensesIncident {
      return Exposure.LivingExpensesIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_13 ($$arg :  entity.LivingExpensesIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.api.database.IQueryBeanResult<entity.LivingExpensesIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Living_Expenses_Incident) at NewClaimLivingExpensesDV.pcf: line 25, column 51
    function verifyValueRange_14 () : void {
      var __valueRangeArg = Exposure.Claim.LivingExpensesIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
    property get ContactProhibited() : boolean {
        return Exposure.Claim.getClaimContact(Exposure.Claimant).ContactProhibited
    }
      
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Exposure.Claim.getClaimContact(Exposure.Claimant) 
      if (claimContact != null) claimContact.ContactProhibited = prohibited 
    }
        
    
    
  }
  
  
}