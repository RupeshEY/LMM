package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/ExposureCodingFinancialsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureCodingFinancialsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/ExposureCodingFinancialsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureCodingFinancialsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureCodingFinancialsInputSet.pcf: line 28, column 41
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at ExposureCodingFinancialsInputSet.pcf: line 28, column 41
    function filter_10 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureCodingFinancialsInputSet.pcf: line 38, column 58
    function valueRoot_16 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at ExposureCodingFinancialsInputSet.pcf: line 16, column 41
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=Segment) at ExposureCodingFinancialsInputSet.pcf: line 16, column 41
    function value_0 () : typekey.ClaimSegment {
      return Exposure.Segment
    }
    
    // 'value' attribute on CurrencyInput (id=RemainingReserves) at ExposureCodingFinancialsInputSet.pcf: line 38, column 58
    function value_13 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on CurrencyInput (id=FuturePayments) at ExposureCodingFinancialsInputSet.pcf: line 43, column 58
    function value_18 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalPayments) at ExposureCodingFinancialsInputSet.pcf: line 48, column 58
    function value_23 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on CurrencyInput (id=TotalRecoveries) at ExposureCodingFinancialsInputSet.pcf: line 53, column 60
    function value_28 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalRecoveries
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at ExposureCodingFinancialsInputSet.pcf: line 21, column 42
    function value_3 () : typekey.ClaimStrategy {
      return Exposure.Strategy
    }
    
    // 'value' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureCodingFinancialsInputSet.pcf: line 59, column 66
    function value_33 () : gw.api.financials.CurrencyAmount {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at ExposureCodingFinancialsInputSet.pcf: line 28, column 41
    function value_6 () : typekey.Jurisdiction {
      return Exposure.JurisdictionState
    }
    
    // 'visible' attribute on Label at ExposureCodingFinancialsInputSet.pcf: line 32, column 68
    function visible_11 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=RemainingReserves) at ExposureCodingFinancialsInputSet.pcf: line 38, column 58
    function visible_12 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=FuturePayments) at ExposureCodingFinancialsInputSet.pcf: line 43, column 58
    function visible_17 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalRecoveries) at ExposureCodingFinancialsInputSet.pcf: line 53, column 60
    function visible_27 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Exposure.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=TotalIncurredNet) at ExposureCodingFinancialsInputSet.pcf: line 59, column 66
    function visible_32 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Exposure.Claim)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}