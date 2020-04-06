package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.document.SymbolProvider
uses gw.document.GosuCaseInsensitiveBackwardsCompatibleSymbolProvider
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DenialPeriodDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=AcceptDocumentTemplate) at DenialPeriodDV.pcf: line 87, column 39
    function action_45 () : void {
      DocumentTemplateSearchPopup.push(symbolProvider)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=RejectDocumentTemplate) at DenialPeriodDV.pcf: line 96, column 39
    function action_52 () : void {
      DocumentTemplateSearchPopup.push(symbolProvider)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=AcceptDocumentTemplate) at DenialPeriodDV.pcf: line 87, column 39
    function action_dest_46 () : pcf.api.Destination {
      return pcf.DocumentTemplateSearchPopup.createDestination(symbolProvider)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=RejectDocumentTemplate) at DenialPeriodDV.pcf: line 96, column 39
    function action_dest_53 () : pcf.api.Destination {
      return pcf.DocumentTemplateSearchPopup.createDestination(symbolProvider)
    }
    
    // 'conversionExpression' attribute on DocumentTemplateInput (id=AcceptDocumentTemplate) at DenialPeriodDV.pcf: line 87, column 39
    function conversionExpression_47 (PickedValue :  gw.plugin.document.IDocumentTemplateDescriptor) : java.lang.String {
      return PickedValue.TemplateId
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at DenialPeriodDV.pcf: line 31, column 47
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.EffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ExpiryDate) at DenialPeriodDV.pcf: line 38, column 44
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.ExpiryDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=BenefitPaymentAcceptance) at DenialPeriodDV.pcf: line 43, column 58
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.BenefitPaymentAcceptance = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=DueDateFormula) at DenialPeriodDV.pcf: line 53, column 51
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.DueDateFormula = (__VALUE_TO_SET as typekey.JurisdictionalFormula)
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at DenialPeriodDV.pcf: line 24, column 43
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextInput (id=TargetDaysFromLoss) at DenialPeriodDV.pcf: line 63, column 40
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.TargetDaysFromLoss = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=TargetDaysFromNotice) at DenialPeriodDV.pcf: line 71, column 40
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.TargetDaysFromNotice = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetIncludeDays) at DenialPeriodDV.pcf: line 78, column 46
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.TargetIncludeDays = (__VALUE_TO_SET as typekey.IncludeDaysType)
    }
    
    // 'value' attribute on DocumentTemplateInput (id=AcceptDocumentTemplate) at DenialPeriodDV.pcf: line 87, column 39
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.AcceptDocumentTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DocumentTemplateInput (id=RejectDocumentTemplate) at DenialPeriodDV.pcf: line 96, column 39
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCDenialPeriod.RejectDocumentTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on TypeKeyInput (id=JurisdictionState) at DenialPeriodDV.pcf: line 24, column 43
    function filter_5 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'initialValue' attribute on Variable at DenialPeriodDV.pcf: line 13, column 46
    function initialValue_0 () : gw.document.SymbolProvider {
      return createSymbolProvider()
    }
    
    // 'required' attribute on TextInput (id=TargetDaysFromLoss) at DenialPeriodDV.pcf: line 63, column 40
    function required_29 () : java.lang.Boolean {
      return WCDenialPeriod.DueDateFormula == TC_AFTERLOSSDATE or  WCDenialPeriod.DueDateFormula == TC_AFTERLOSSANDNOTICE 
    }
    
    // 'required' attribute on TextInput (id=TargetDaysFromNotice) at DenialPeriodDV.pcf: line 71, column 40
    function required_36 () : java.lang.Boolean {
      return WCDenialPeriod.DueDateFormula == TC_AFTERNOTICEDATE or  WCDenialPeriod.DueDateFormula == TC_AFTERLOSSANDNOTICE
    }
    
    // 'validationExpression' attribute on TextInput (id=TargetDaysFromLoss) at DenialPeriodDV.pcf: line 63, column 40
    function validationExpression_26 () : java.lang.Object {
      return (WCDenialPeriod.TargetDaysFromNotice < 0 ? DisplayKey.get("Rules.Validation.Admin.Denial.NoNegativeValue") : null)
    }
    
    // 'validationExpression' attribute on DateInput (id=EffectiveDate) at DenialPeriodDV.pcf: line 31, column 47
    function validationExpression_6 () : java.lang.Object {
      return validateDate()
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at DenialPeriodDV.pcf: line 24, column 43
    function valueRoot_4 () : java.lang.Object {
      return WCDenialPeriod
    }
    
    // 'value' attribute on TypeKeyInput (id=JurisdictionState) at DenialPeriodDV.pcf: line 24, column 43
    function value_1 () : typekey.Jurisdiction {
      return WCDenialPeriod.JurisdictionState
    }
    
    // 'value' attribute on DateInput (id=ExpiryDate) at DenialPeriodDV.pcf: line 38, column 44
    function value_13 () : java.util.Date {
      return WCDenialPeriod.ExpiryDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=BenefitPaymentAcceptance) at DenialPeriodDV.pcf: line 43, column 58
    function value_18 () : java.lang.Boolean {
      return WCDenialPeriod.BenefitPaymentAcceptance
    }
    
    // 'value' attribute on TypeKeyInput (id=DueDateFormula) at DenialPeriodDV.pcf: line 53, column 51
    function value_22 () : typekey.JurisdictionalFormula {
      return WCDenialPeriod.DueDateFormula
    }
    
    // 'value' attribute on TextInput (id=TargetDaysFromLoss) at DenialPeriodDV.pcf: line 63, column 40
    function value_27 () : java.lang.Integer {
      return WCDenialPeriod.TargetDaysFromLoss
    }
    
    // 'value' attribute on TextInput (id=TargetDaysFromNotice) at DenialPeriodDV.pcf: line 71, column 40
    function value_34 () : java.lang.Integer {
      return WCDenialPeriod.TargetDaysFromNotice
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetIncludeDays) at DenialPeriodDV.pcf: line 78, column 46
    function value_40 () : typekey.IncludeDaysType {
      return WCDenialPeriod.TargetIncludeDays
    }
    
    // 'value' attribute on DocumentTemplateInput (id=AcceptDocumentTemplate) at DenialPeriodDV.pcf: line 87, column 39
    function value_44 () : java.lang.String {
      return WCDenialPeriod.AcceptDocumentTemplate
    }
    
    // 'value' attribute on DocumentTemplateInput (id=RejectDocumentTemplate) at DenialPeriodDV.pcf: line 96, column 39
    function value_51 () : java.lang.String {
      return WCDenialPeriod.RejectDocumentTemplate
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at DenialPeriodDV.pcf: line 31, column 47
    function value_7 () : java.util.Date {
      return WCDenialPeriod.EffectiveDate
    }
    
    property get WCDenialPeriod () : WCDenialPeriod {
      return getRequireValue("WCDenialPeriod", 0) as WCDenialPeriod
    }
    
    property set WCDenialPeriod ($arg :  WCDenialPeriod) {
      setRequireValue("WCDenialPeriod", 0, $arg)
    }
    
    property get symbolProvider () : gw.document.SymbolProvider {
      return getVariableValue("symbolProvider", 0) as gw.document.SymbolProvider
    }
    
    property set symbolProvider ($arg :  gw.document.SymbolProvider) {
      setVariableValue("symbolProvider", 0, $arg)
    }
    
    
          function createSymbolProvider(): SymbolProvider {
            return new GosuCaseInsensitiveBackwardsCompatibleSymbolProvider({
              "WCDenialPeriod"->WCDenialPeriod
            })
          }
    
          function validateDate(): String {
            if (WCDenialPeriod.EffectiveDate > WCDenialPeriod.ExpiryDate) {
              return DisplayKey.get("Rules.Validation.Admin.EffDateGTExpiryDate")
            } else {
              return null
            }
          }
          
        
    
    
  }
  
  
}