package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AgreementDetailsDV.FacProportionalRIAgreement.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AgreementDetailsDV_FacProportionalRIAgreementExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/AgreementDetailsDV.FacProportionalRIAgreement.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgreementDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 27, column 35
    function def_onEnter_9 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.onEnter( agreement.Claim, agreement )
    }
    
    // 'def' attribute on InputSetRef at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 27, column 35
    function def_refreshVariables_10 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.refreshVariables( agreement.Claim, agreement )
    }
    
    // 'value' attribute on TypeKeyInput (id=AgreementCurrency) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 37, column 62
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=ProportionalShare) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 48, column 43
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      (agreement as FacProportionalRIAgreement).ProportionalShare = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 18, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.AgreementNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=TopOfLayer) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 54, column 39
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.TopOfLayer = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=RecoveryLimit) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 61, column 42
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.RecoveryLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=NotificationThreshold) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 68, column 50
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.NotificationThreshold = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=AgreementName) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 24, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.AgreementName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ProportionalShare) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 48, column 43
    function valueRoot_20 () : java.lang.Object {
      return (agreement as FacProportionalRIAgreement)
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 18, column 44
    function valueRoot_3 () : java.lang.Object {
      return agreement
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 18, column 44
    function value_0 () : java.lang.String {
      return agreement.AgreementNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=AgreementCurrency) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 37, column 62
    function value_12 () : typekey.Currency {
      return agreement.Currency
    }
    
    // 'value' attribute on TextInput (id=ProportionalShare) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 48, column 43
    function value_17 () : java.math.BigDecimal {
      return (agreement as FacProportionalRIAgreement).ProportionalShare
    }
    
    // 'value' attribute on CurrencyInput (id=TopOfLayer) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 54, column 39
    function value_21 () : gw.api.financials.CurrencyAmount {
      return agreement.TopOfLayer
    }
    
    // 'value' attribute on CurrencyInput (id=RecoveryLimit) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 61, column 42
    function value_25 () : gw.api.financials.CurrencyAmount {
      return agreement.RecoveryLimit
    }
    
    // 'value' attribute on CurrencyInput (id=NotificationThreshold) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 68, column 50
    function value_29 () : gw.api.financials.CurrencyAmount {
      return agreement.NotificationThreshold
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExceedsNotificationThreshold) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 72, column 57
    function value_33 () : java.lang.Boolean {
      return agreement.ExceedsNotificationThreshold
    }
    
    // 'value' attribute on TextInput (id=AgreementName) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 24, column 42
    function value_4 () : java.lang.String {
      return agreement.AgreementName
    }
    
    // 'visible' attribute on TypeKeyInput (id=AgreementCurrency) at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 37, column 62
    function visible_11 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    // 'visible' attribute on InputSetRef at AgreementDetailsDV.FacProportionalRIAgreement.pcf: line 27, column 35
    function visible_8 () : java.lang.Boolean {
      return !agreement.New
    }
    
    property get agreement () : RIAgreement {
      return getRequireValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setRequireValue("agreement", 0, $arg)
    }
    
    
  }
  
  
}