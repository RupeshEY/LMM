package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewReplacementServicesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReplacementServicesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at NewReplacementServicesDV.pcf: line 30, column 103
    function def_onEnter_10 (def :  pcf.EditableServiceProviderLV) : void {
      def.onEnter(Exposure.getClaimContactRolesByRole(TC_RSBENPROVIDER), Exposure)
    }
    
    // 'def' attribute on ListViewInput at NewReplacementServicesDV.pcf: line 30, column 103
    function def_refreshVariables_11 (def :  pcf.EditableServiceProviderLV) : void {
      def.refreshVariables(Exposure.getClaimContactRolesByRole(TC_RSBENPROVIDER), Exposure)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewReplacementServicesDV.pcf: line 17, column 56
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.RSBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewReplacementServicesDV.pcf: line 23, column 54
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.RSBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewReplacementServicesDV.pcf: line 23, column 54
    function validationExpression_4 () : java.lang.Object {
      return !(Exposure.RSBenefits.BenefitsBeginDate > Exposure.RSBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewReplacementServicesDV.pcf: line 17, column 56
    function valueRoot_3 () : java.lang.Object {
      return Exposure.RSBenefits
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewReplacementServicesDV.pcf: line 17, column 56
    function value_0 () : java.util.Date {
      return Exposure.RSBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewReplacementServicesDV.pcf: line 23, column 54
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