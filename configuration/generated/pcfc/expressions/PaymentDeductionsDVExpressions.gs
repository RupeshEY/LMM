package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/PaymentDeductionsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentDeductionsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/PaymentDeductionsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDeductionsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at PaymentDeductionsDV.pcf: line 36, column 95
    function def_onEnter_13 (def :  pcf.PaymentDeductionsLV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on ListViewInput at PaymentDeductionsDV.pcf: line 36, column 95
    function def_refreshVariables_14 (def :  pcf.PaymentDeductionsLV) : void {
      def.refreshVariables(Check)
    }
    
    // 'editable' attribute on CurrencyInput (id=Amount_Reportable) at PaymentDeductionsDV.pcf: line 33, column 47
    function editable_6 () : java.lang.Boolean {
      return Check.isEditable()
    }
    
    // 'validationExpression' attribute on CurrencyInput (id=Amount_Reportable) at PaymentDeductionsDV.pcf: line 33, column 47
    function validationExpression_7 () : java.lang.Object {
      return Check.ReportableAmount <= Check.GrossAmount ? null : DisplayKey.get("Java.NewPayment.Error.ReportableAmountToLarge")
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Gross) at PaymentDeductionsDV.pcf: line 19, column 59
    function valueRoot_2 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Gross) at PaymentDeductionsDV.pcf: line 19, column 59
    function value_0 () : gw.api.financials.CurrencyAmountPair {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Net) at PaymentDeductionsDV.pcf: line 43, column 59
    function value_15 () : gw.api.financials.CurrencyAmountPair {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on TextInput (id=Vendor) at PaymentDeductionsDV.pcf: line 24, column 37
    function value_3 () : entity.Contact {
      return Check.Vendor
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Reportable) at PaymentDeductionsDV.pcf: line 33, column 47
    function value_8 () : gw.api.financials.IMoney {
      return Check.ReportableAmountSettableComponent
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}