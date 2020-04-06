package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewLostWagesBenefitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewLostWagesBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLostWagesBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at NewLostWagesBenefitsDV.pcf: line 16, column 27
    function def_onEnter_0 (def :  pcf.EditableBenefitPeriodsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewLostWagesBenefitsDV.pcf: line 152, column 27
    function def_onEnter_80 (def :  pcf.EditableSettlementsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewLostWagesBenefitsDV.pcf: line 16, column 27
    function def_refreshVariables_1 (def :  pcf.EditableBenefitPeriodsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewLostWagesBenefitsDV.pcf: line 152, column 27
    function def_refreshVariables_81 (def :  pcf.EditableSettlementsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on DateInput (id=TTD_WaitingPeriodBegin) at NewLostWagesBenefitsDV.pcf: line 42, column 56
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.WaitPrdBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=TTD_WaitingPeriodEnd) at NewLostWagesBenefitsDV.pcf: line 48, column 54
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.WaitPrdEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=TTD_RetroactivePeriod) at NewLostWagesBenefitsDV.pcf: line 54, column 46
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.RetroPeriod = (__VALUE_TO_SET as typekey.RetroPeriodType)
    }
    
    // 'value' attribute on TypeKeyInput (id=TTD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 60, column 51
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on CurrencyInput (id=TPD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 69, column 51
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TPDBenefits.MinCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=TPD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 75, column 51
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TPDBenefits.MaxCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=TPD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 81, column 51
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TPDBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on CurrencyInput (id=TTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 31, column 51
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.MinCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=PTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 90, column 51
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PPDBenefits.MinCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=PTD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 96, column 51
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PPDBenefits.MaxCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateInput (id=PTD_MMIDate) at NewLostWagesBenefitsDV.pcf: line 102, column 47
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PPDBenefits.MMIDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=PTD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 108, column 51
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PPDBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at NewLostWagesBenefitsDV.pcf: line 145, column 55
    function defaultSetter_78 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DeathBenefits.MaxBurialRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=TTD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 37, column 51
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.TTDBenefits.MaxCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'validationExpression' attribute on DateInput (id=TTD_WaitingPeriodEnd) at NewLostWagesBenefitsDV.pcf: line 48, column 54
    function validationExpression_14 () : java.lang.Object {
      return !(Exposure.TTDBenefits.WaitPrdBeginDate > Exposure.TTDBenefits.WaitPrdEndDate) ? null : DisplayKey.get("JSP.LostWagesDetail.LostWages.Date.ValidationError")
    }
    
    // 'validationExpression' attribute on DateInput (id=PTD_MMIDate) at NewLostWagesBenefitsDV.pcf: line 102, column 47
    function validationExpression_48 () : java.lang.Object {
      return Exposure.PPDBenefits.MMIDate == null || Exposure.PPDBenefits.MMIDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'value' attribute on CurrencyInput (id=TPD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 69, column 51
    function valueRoot_31 () : java.lang.Object {
      return Exposure.TPDBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=PTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 90, column 51
    function valueRoot_43 () : java.lang.Object {
      return Exposure.PPDBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=TTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 31, column 51
    function valueRoot_5 () : java.lang.Object {
      return Exposure.TTDBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at NewLostWagesBenefitsDV.pcf: line 145, column 55
    function valueRoot_79 () : java.lang.Object {
      return Exposure.DeathBenefits
    }
    
    // 'value' attribute on DateInput (id=TTD_WaitingPeriodBegin) at NewLostWagesBenefitsDV.pcf: line 42, column 56
    function value_10 () : java.util.Date {
      return Exposure.TTDBenefits.WaitPrdBeginDate
    }
    
    // 'value' attribute on DateInput (id=TTD_WaitingPeriodEnd) at NewLostWagesBenefitsDV.pcf: line 48, column 54
    function value_15 () : java.util.Date {
      return Exposure.TTDBenefits.WaitPrdEndDate
    }
    
    // 'value' attribute on CurrencyInput (id=TTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 31, column 51
    function value_2 () : gw.api.financials.CurrencyAmount {
      return Exposure.TTDBenefits.MinCompRate
    }
    
    // 'value' attribute on TypeKeyInput (id=TTD_RetroactivePeriod) at NewLostWagesBenefitsDV.pcf: line 54, column 46
    function value_20 () : typekey.RetroPeriodType {
      return Exposure.TTDBenefits.RetroPeriod
    }
    
    // 'value' attribute on TypeKeyInput (id=TTD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 60, column 51
    function value_24 () : typekey.PaymentFrequencyType {
      return Exposure.TTDBenefits.PaymentFrequency
    }
    
    // 'value' attribute on CurrencyInput (id=TPD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 69, column 51
    function value_28 () : gw.api.financials.CurrencyAmount {
      return Exposure.TPDBenefits.MinCompRate
    }
    
    // 'value' attribute on CurrencyInput (id=TPD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 75, column 51
    function value_32 () : gw.api.financials.CurrencyAmount {
      return Exposure.TPDBenefits.MaxCompRate
    }
    
    // 'value' attribute on TypeKeyInput (id=TPD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 81, column 51
    function value_36 () : typekey.PaymentFrequencyType {
      return Exposure.TPDBenefits.PaymentFrequency
    }
    
    // 'value' attribute on CurrencyInput (id=PTD_MinStateCompRate) at NewLostWagesBenefitsDV.pcf: line 90, column 51
    function value_40 () : gw.api.financials.CurrencyAmount {
      return Exposure.PPDBenefits.MinCompRate
    }
    
    // 'value' attribute on CurrencyInput (id=PTD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 96, column 51
    function value_44 () : gw.api.financials.CurrencyAmount {
      return Exposure.PPDBenefits.MaxCompRate
    }
    
    // 'value' attribute on DateInput (id=PTD_MMIDate) at NewLostWagesBenefitsDV.pcf: line 102, column 47
    function value_49 () : java.util.Date {
      return Exposure.PPDBenefits.MMIDate
    }
    
    // 'value' attribute on TypeKeyInput (id=PTD_PaymentFrequency) at NewLostWagesBenefitsDV.pcf: line 108, column 51
    function value_54 () : typekey.PaymentFrequencyType {
      return Exposure.PPDBenefits.PaymentFrequency
    }
    
    // 'value' attribute on CurrencyInput (id=TTD_MaxStateCompRate) at NewLostWagesBenefitsDV.pcf: line 37, column 51
    function value_6 () : gw.api.financials.CurrencyAmount {
      return Exposure.TTDBenefits.MaxCompRate
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at NewLostWagesBenefitsDV.pcf: line 145, column 55
    function value_76 () : gw.api.financials.CurrencyAmount {
      return Exposure.DeathBenefits.MaxBurialRate
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}