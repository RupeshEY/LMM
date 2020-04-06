package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/LoanInformationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoanInformationInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/LoanInformationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoanInformationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=MonthsRemaining) at LoanInformationInputSet.pcf: line 31, column 57
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanMonthsRemaining = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at LoanInformationInputSet.pcf: line 16, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.Loan = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=PayoffAmount) at LoanInformationInputSet.pcf: line 37, column 57
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanPayoffAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=MonthlyPayment) at LoanInformationInputSet.pcf: line 24, column 57
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      VehicleIncident.Vehicle.LoanMonthlyPayment = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at LoanInformationInputSet.pcf: line 16, column 44
    function valueRoot_3 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at LoanInformationInputSet.pcf: line 16, column 44
    function value_0 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Loan
    }
    
    // 'value' attribute on TextInput (id=MonthsRemaining) at LoanInformationInputSet.pcf: line 31, column 57
    function value_11 () : java.lang.Integer {
      return VehicleIncident.Vehicle.LoanMonthsRemaining
    }
    
    // 'value' attribute on CurrencyInput (id=PayoffAmount) at LoanInformationInputSet.pcf: line 37, column 57
    function value_17 () : gw.api.financials.CurrencyAmount {
      return VehicleIncident.Vehicle.LoanPayoffAmount
    }
    
    // 'value' attribute on CurrencyInput (id=MonthlyPayment) at LoanInformationInputSet.pcf: line 24, column 57
    function value_5 () : gw.api.financials.CurrencyAmount {
      return VehicleIncident.Vehicle.LoanMonthlyPayment
    }
    
    // 'visible' attribute on CurrencyInput (id=MonthlyPayment) at LoanInformationInputSet.pcf: line 24, column 57
    function visible_4 () : java.lang.Boolean {
      return  VehicleIncident.Vehicle.Loan == true 
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getRequireValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}