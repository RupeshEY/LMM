package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitPPDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitPPDInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitPPDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitPPDInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitPPDInputSet.pcf: line 72, column 68
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.PPDBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'initialValue' attribute on Variable at WCBenefitPPDInputSet.pcf: line 14, column 23
    function initialValue_0 () : Boolean {
      return claim.findWCBeneCalcRef() != null
    }
    
    // 'initialValue' attribute on Variable at WCBenefitPPDInputSet.pcf: line 18, column 24
    function initialValue_1 () : Exposure {
      return claim.getLossTimeExposure()
    }
    
    // 'value' attribute on TextInput (id=PPD_MaxStateCompRate) at WCBenefitPPDInputSet.pcf: line 34, column 41
    function valueRoot_10 () : java.lang.Object {
      return claim.getPPDBenefitsCalculator()
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitPPDInputSet.pcf: line 72, column 68
    function valueRoot_32 () : java.lang.Object {
      return exposure.PPDBenefits
    }
    
    // 'value' attribute on TextInput (id=PPD_MinStateCompRate) at WCBenefitPPDInputSet.pcf: line 41, column 41
    function value_12 () : java.math.BigDecimal {
      return claim.getPPDBenefitsCalculator().MinCompRate
    }
    
    // 'value' attribute on TextInput (id=PPDCR) at WCBenefitPPDInputSet.pcf: line 66, column 95
    function value_23 () : java.math.BigDecimal {
      return claim.getPPDBenefitsCalculator().CompRate
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitPPDInputSet.pcf: line 72, column 68
    function value_28 () : gw.api.financials.CurrencyAmount {
      return exposure.PPDBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=PPDPercentOfWages) at WCBenefitPPDInputSet.pcf: line 27, column 41
    function value_3 () : java.math.BigDecimal {
      return claim.getPPDBenefitsCalculator().PercentOfWages * 100
    }
    
    // 'value' attribute on TextInput (id=PPDWeeks) at WCBenefitPPDInputSet.pcf: line 78, column 68
    function value_34 () : java.lang.Integer {
      return claim.getPPDBenefitsCalculator().MaxWeeksToPay
    }
    
    // 'value' attribute on TextInput (id=MaxTotalPPD) at WCBenefitPPDInputSet.pcf: line 85, column 127
    function value_39 () : java.math.BigDecimal {
      return claim.getPPDBenefitsCalculator().MaxWeeksToPay * claim.getPPDBenefitsCalculator().CompRate
    }
    
    // 'value' attribute on TextInput (id=PPD_MaxStateCompRate) at WCBenefitPPDInputSet.pcf: line 34, column 41
    function value_7 () : java.math.BigDecimal {
      return claim.getPPDBenefitsCalculator().MaxCompRate
    }
    
    // 'visible' attribute on TextAreaInput (id=MinStateCompRateAdj) at WCBenefitPPDInputSet.pcf: line 47, column 69
    function visible_16 () : java.lang.Boolean {
      return claim.getPPDBenefitsCalculator().MinAwwAdjustment 
    }
    
    // 'visible' attribute on TextInput (id=PPDRefData) at WCBenefitPPDInputSet.pcf: line 53, column 45
    function visible_18 () : java.lang.Boolean {
      return not ReferenceDataAvailable
    }
    
    // 'visible' attribute on TextInput (id=PPDPercentOfWages) at WCBenefitPPDInputSet.pcf: line 27, column 41
    function visible_2 () : java.lang.Boolean {
      return ReferenceDataAvailable
    }
    
    // 'visible' attribute on TextInput (id=PPDCompRateUnavailable) at WCBenefitPPDInputSet.pcf: line 59, column 95
    function visible_20 () : java.lang.Boolean {
      return ReferenceDataAvailable and claim.getPPDBenefitsCalculator().CompRate == null
    }
    
    // 'visible' attribute on TextInput (id=PPDCR) at WCBenefitPPDInputSet.pcf: line 66, column 95
    function visible_22 () : java.lang.Boolean {
      return ReferenceDataAvailable and claim.getPPDBenefitsCalculator().CompRate != null
    }
    
    // 'visible' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitPPDInputSet.pcf: line 72, column 68
    function visible_27 () : java.lang.Boolean {
      return claim.getPPDBenefitsCalculator().CompRate == null
    }
    
    // 'visible' attribute on TextInput (id=PPDWeeks) at WCBenefitPPDInputSet.pcf: line 78, column 68
    function visible_33 () : java.lang.Boolean {
      return claim.getPPDBenefitsCalculator().CompRate != null
    }
    
    // 'visible' attribute on TextInput (id=MaxTotalPPD) at WCBenefitPPDInputSet.pcf: line 85, column 127
    function visible_38 () : java.lang.Boolean {
      return claim.getPPDBenefitsCalculator().CompRate != null and claim.getPPDBenefitsCalculator().MaxWeeksToPay != null
    }
    
    property get ReferenceDataAvailable () : Boolean {
      return getVariableValue("ReferenceDataAvailable", 0) as Boolean
    }
    
    property set ReferenceDataAvailable ($arg :  Boolean) {
      setVariableValue("ReferenceDataAvailable", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    
  }
  
  
}