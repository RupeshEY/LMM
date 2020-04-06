package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewPaymentInstructionsDV_singleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPaymentInstructionsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 17, column 63
    function def_onEnter_0 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function def_onEnter_3 (def :  pcf.ServiceRequestInvoiceInputSet_multiple) : void {
      def.onEnter(Wizard, false)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function def_onEnter_5 (def :  pcf.ServiceRequestInvoiceInputSet_single) : void {
      def.onEnter(Wizard, false)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 17, column 63
    function def_refreshVariables_1 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function def_refreshVariables_4 (def :  pcf.ServiceRequestInvoiceInputSet_multiple) : void {
      def.refreshVariables(Wizard, false)
    }
    
    // 'def' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function def_refreshVariables_6 (def :  pcf.ServiceRequestInvoiceInputSet_single) : void {
      def.refreshVariables(Wizard, false)
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at NewPaymentInstructionsDV.single.pcf: line 36, column 44
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.CheckBatching = (__VALUE_TO_SET as typekey.CheckBatching)
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at NewPaymentInstructionsDV.single.pcf: line 42, column 42
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at NewPaymentInstructionsDV.single.pcf: line 48, column 56
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.CheckInstructions = (__VALUE_TO_SET as typekey.CheckHandlingInstructions)
    }
    
    // 'filter' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.single.pcf: line 30, column 44
    function filter_11 (VALUE :  typekey.PaymentMethod, VALUES :  typekey.PaymentMethod[]) : java.lang.Boolean {
      return VALUE !=  PaymentMethod.TC_MANUAL
    }
    
    // 'mode' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function mode_7 () : java.lang.Object {
      return Wizard.Check.ServiceRequestInvoices.Count == 1 ? "single" : "multiple"
    }
    
    // 'validationExpression' attribute on DateInput (id=ScheduledSendDate) at NewPaymentInstructionsDV.single.pcf: line 42, column 42
    function validationExpression_16 () : java.lang.Object {
      return Check.New and Check.ScheduledSendDate.before(java.util.Date.Today) ? DisplayKey.get("Java.Validation.Date.ForbidPast") : null
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.single.pcf: line 30, column 44
    function valueRoot_10 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at NewPaymentInstructionsDV.single.pcf: line 36, column 44
    function value_12 () : typekey.CheckBatching {
      return Check.CheckBatching
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at NewPaymentInstructionsDV.single.pcf: line 42, column 42
    function value_17 () : java.util.Date {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at NewPaymentInstructionsDV.single.pcf: line 48, column 56
    function value_22 () : typekey.CheckHandlingInstructions {
      return Check.CheckInstructions
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at NewPaymentInstructionsDV.single.pcf: line 30, column 44
    function value_8 () : typekey.PaymentMethod {
      return Check.PaymentMethod
    }
    
    // 'visible' attribute on InputSetRef at NewPaymentInstructionsDV.single.pcf: line 22, column 57
    function visible_2 () : java.lang.Boolean {
      return Wizard.Check.LinkedToServiceRequests
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