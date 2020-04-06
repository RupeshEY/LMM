package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimReplacementServicesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimReplacementServicesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimReplacementServicesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimReplacementServicesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at NewClaimReplacementServicesDV.pcf: line 35, column 103
    function def_onEnter_14 (def :  pcf.EditableServiceProviderLV) : void {
      def.onEnter(Exposure.getClaimContactRolesByRole(TC_RSBENPROVIDER), Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewClaimReplacementServicesDV.pcf: line 35, column 103
    function def_refreshVariables_15 (def :  pcf.EditableServiceProviderLV) : void {
      def.refreshVariables(Exposure.getClaimContactRolesByRole(TC_RSBENPROVIDER), Exposure)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MaxCompRate) at NewClaimReplacementServicesDV.pcf: line 29, column 50
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.RSBenefits.MaxCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimReplacementServicesDV.pcf: line 18, column 56
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.RSBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimReplacementServicesDV.pcf: line 24, column 54
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.RSBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimReplacementServicesDV.pcf: line 24, column 54
    function validationExpression_4 () : java.lang.Object {
      return !(Exposure.RSBenefits.BenefitsBeginDate > Exposure.RSBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimReplacementServicesDV.pcf: line 18, column 56
    function valueRoot_3 () : java.lang.Object {
      return Exposure.RSBenefits
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimReplacementServicesDV.pcf: line 18, column 56
    function value_0 () : java.util.Date {
      return Exposure.RSBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MaxCompRate) at NewClaimReplacementServicesDV.pcf: line 29, column 50
    function value_10 () : gw.api.financials.CurrencyAmount {
      return Exposure.RSBenefits.MaxCompRate
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimReplacementServicesDV.pcf: line 24, column 54
    function value_5 () : java.util.Date {
      return Exposure.RSBenefits.BenefitsEndDate
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}