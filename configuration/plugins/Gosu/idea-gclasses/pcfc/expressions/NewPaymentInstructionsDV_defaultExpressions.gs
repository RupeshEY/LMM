package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewPaymentInstructionsDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPaymentInstructionsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.default.pcf: line 17, column 63
    function def_onEnter_0 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.default.pcf: line 40, column 47
    function def_onEnter_14 (def :  pcf.CheckRecurrenceInputSet) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.default.pcf: line 17, column 63
    function def_refreshVariables_1 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.default.pcf: line 40, column 47
    function def_refreshVariables_15 (def :  pcf.CheckRecurrenceInputSet) : void {
      def.refreshVariables(Check)
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at NewPaymentInstructionsDV.default.pcf: line 38, column 56
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.CheckInstructions = (__VALUE_TO_SET as typekey.CheckHandlingInstructions)
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at NewPaymentInstructionsDV.default.pcf: line 32, column 44
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.CheckBatching = (__VALUE_TO_SET as typekey.CheckBatching)
    }
    
    // 'filter' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.default.pcf: line 26, column 44
    function filter_5 (VALUE :  typekey.PaymentMethod, VALUES :  typekey.PaymentMethod[]) : java.lang.Boolean {
      return VALUE !=  PaymentMethod.TC_MANUAL
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.default.pcf: line 26, column 44
    function valueRoot_4 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at NewPaymentInstructionsDV.default.pcf: line 38, column 56
    function value_10 () : typekey.CheckHandlingInstructions {
      return Check.CheckInstructions
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.default.pcf: line 26, column 44
    function value_2 () : typekey.PaymentMethod {
      return Check.PaymentMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at NewPaymentInstructionsDV.default.pcf: line 32, column 44
    function value_6 () : typekey.CheckBatching {
      return Check.CheckBatching
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