package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitTTDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitTTDInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/WCBenefitTTDInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitTTDInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitTTDInputSet.pcf: line 72, column 68
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.TTDBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'initialValue' attribute on Variable at WCBenefitTTDInputSet.pcf: line 14, column 23
    function initialValue_0 () : Boolean {
      return claim.findWCBeneCalcRef() != null
    }
    
    // 'initialValue' attribute on Variable at WCBenefitTTDInputSet.pcf: line 18, column 31
    function initialValue_1 () : entity.Exposure {
      return claim.getLossTimeExposure()
    }
    
    // 'value' attribute on TextInput (id=TTD_MaxStateCompRate) at WCBenefitTTDInputSet.pcf: line 34, column 41
    function valueRoot_10 () : java.lang.Object {
      return claim.getTTDBenefitsCalculator()
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitTTDInputSet.pcf: line 72, column 68
    function valueRoot_32 () : java.lang.Object {
      return exposure.TTDBenefits
    }
    
    // 'value' attribute on TextInput (id=TTD_MinStateCompRate) at WCBenefitTTDInputSet.pcf: line 41, column 41
    function value_12 () : java.math.BigDecimal {
      return claim.getTTDBenefitsCalculator().MinCompRate
    }
    
    // 'value' attribute on TextInput (id=TTDCR) at WCBenefitTTDInputSet.pcf: line 66, column 95
    function value_23 () : java.math.BigDecimal {
      return claim.getTTDBenefitsCalculator().CompRate
    }
    
    // 'value' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitTTDInputSet.pcf: line 72, column 68
    function value_28 () : gw.api.financials.CurrencyAmount {
      return exposure.TTDBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=TTDPercentOfWages) at WCBenefitTTDInputSet.pcf: line 27, column 41
    function value_3 () : java.math.BigDecimal {
      return claim.getTTDBenefitsCalculator().PercentOfWages * 100
    }
    
    // 'value' attribute on TextInput (id=TTD_MaxStateCompRate) at WCBenefitTTDInputSet.pcf: line 34, column 41
    function value_7 () : java.math.BigDecimal {
      return claim.getTTDBenefitsCalculator().MaxCompRate
    }
    
    // 'visible' attribute on TextAreaInput (id=MinStateCompRateAdj) at WCBenefitTTDInputSet.pcf: line 47, column 69
    function visible_16 () : java.lang.Boolean {
      return claim.getTTDBenefitsCalculator().MinAwwAdjustment 
    }
    
    // 'visible' attribute on TextInput (id=TTDRefData) at WCBenefitTTDInputSet.pcf: line 53, column 45
    function visible_18 () : java.lang.Boolean {
      return not ReferenceDataAvailable
    }
    
    // 'visible' attribute on TextInput (id=TTDPercentOfWages) at WCBenefitTTDInputSet.pcf: line 27, column 41
    function visible_2 () : java.lang.Boolean {
      return ReferenceDataAvailable
    }
    
    // 'visible' attribute on TextInput (id=TTDCompRateUnavailable) at WCBenefitTTDInputSet.pcf: line 59, column 95
    function visible_20 () : java.lang.Boolean {
      return ReferenceDataAvailable and claim.getTTDBenefitsCalculator().CompRate == null
    }
    
    // 'visible' attribute on TextInput (id=TTDCR) at WCBenefitTTDInputSet.pcf: line 66, column 95
    function visible_22 () : java.lang.Boolean {
      return ReferenceDataAvailable and claim.getTTDBenefitsCalculator().CompRate != null
    }
    
    // 'visible' attribute on CurrencyInput (id=ManualCompRate) at WCBenefitTTDInputSet.pcf: line 72, column 68
    function visible_27 () : java.lang.Boolean {
      return claim.getTTDBenefitsCalculator().CompRate == null
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
    
    property get exposure () : entity.Exposure {
      return getVariableValue("exposure", 0) as entity.Exposure
    }
    
    property set exposure ($arg :  entity.Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    
  }
  
  
}