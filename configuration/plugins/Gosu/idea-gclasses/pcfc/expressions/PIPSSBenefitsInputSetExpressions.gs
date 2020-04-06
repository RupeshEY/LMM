package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/PIPSSBenefitsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PIPSSBenefitsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/PIPSSBenefitsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPSSBenefitsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MonthlyCompRate) at PIPSSBenefitsInputSet.pcf: line 30, column 46
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SSDIBenefits.MonthlyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSCollected_Question) at PIPSSBenefitsInputSet.pcf: line 16, column 34
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SSBenefit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=SSDIBenefits_BeginDate) at PIPSSBenefitsInputSet.pcf: line 24, column 46
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.SSDIBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSCollected_Question) at PIPSSBenefitsInputSet.pcf: line 16, column 34
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on DateInput (id=SSDIBenefits_BeginDate) at PIPSSBenefitsInputSet.pcf: line 24, column 46
    function valueRoot_9 () : java.lang.Object {
      return Exposure.SSDIBenefits
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSCollected_Question) at PIPSSBenefitsInputSet.pcf: line 16, column 34
    function value_0 () : java.lang.Boolean {
      return Exposure.SSBenefit
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MonthlyCompRate) at PIPSSBenefitsInputSet.pcf: line 30, column 46
    function value_11 () : gw.api.financials.CurrencyAmount {
      return Exposure.SSDIBenefits.MonthlyCompRate
    }
    
    // 'value' attribute on DateInput (id=SSDIBenefits_BeginDate) at PIPSSBenefitsInputSet.pcf: line 24, column 46
    function value_5 () : java.util.Date {
      return Exposure.SSDIBenefits.BenefitsBeginDate
    }
    
    // 'visible' attribute on DateInput (id=SSDIBenefits_BeginDate) at PIPSSBenefitsInputSet.pcf: line 24, column 46
    function visible_4 () : java.lang.Boolean {
      return  Exposure.SSBenefit == true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}