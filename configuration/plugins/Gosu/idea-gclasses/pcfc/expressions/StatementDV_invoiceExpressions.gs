package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatementDV_invoiceExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at StatementDV.invoice.pcf: line 42, column 27
    function def_onEnter_21 (def :  pcf.StatementLineItemLV) : void {
      def.onEnter(currentInvoice)
    }
    
    // 'def' attribute on ListViewInput at StatementDV.invoice.pcf: line 42, column 27
    function def_refreshVariables_22 (def :  pcf.StatementLineItemLV) : void {
      def.refreshVariables(currentInvoice)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.invoice.pcf: line 38, column 73
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentInvoice.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.invoice.pcf: line 24, column 73
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentInvoice.ReferenceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=ReferenceNumber) at StatementDV.invoice.pcf: line 24, column 73
    function editable_0 () : java.lang.Boolean {
      return currentInvoice.New
    }
    
    // 'value' attribute on TypeKeyInput (id=InvoiceStatus) at StatementDV.invoice.pcf: line 30, column 78
    function valueRoot_12 () : java.lang.Object {
      return (currentInvoice as ServiceRequestInvoice)
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.invoice.pcf: line 24, column 73
    function valueRoot_7 () : java.lang.Object {
      return currentInvoice
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.invoice.pcf: line 38, column 73
    function value_15 () : java.lang.String {
      return currentInvoice.Description
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.invoice.pcf: line 24, column 73
    function value_2 () : java.lang.String {
      return currentInvoice.ReferenceNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=InvoiceStatus) at StatementDV.invoice.pcf: line 30, column 78
    function value_9 () : typekey.ServiceRequestInvoiceStatus {
      return (currentInvoice as ServiceRequestInvoice).Status
    }
    
    // 'visible' attribute on TextInput (id=ReferenceNumber) at StatementDV.invoice.pcf: line 24, column 73
    function visible_1 () : java.lang.Boolean {
      return currentInvoice != null or CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TypeKeyInput (id=InvoiceStatus) at StatementDV.invoice.pcf: line 30, column 78
    function visible_8 () : java.lang.Boolean {
      return currentInvoice != null and not CurrentLocation.InEditMode
    }
    
    property get currentInvoice () : ServiceRequestStatement {
      return getRequireValue("currentInvoice", 0) as ServiceRequestStatement
    }
    
    property set currentInvoice ($arg :  ServiceRequestStatement) {
      setRequireValue("currentInvoice", 0, $arg)
    }
    
    property get previousTotal () : gw.api.financials.CurrencyAmount {
      return getRequireValue("previousTotal", 0) as gw.api.financials.CurrencyAmount
    }
    
    property set previousTotal ($arg :  gw.api.financials.CurrencyAmount) {
      setRequireValue("previousTotal", 0, $arg)
    }
    
    property get readOnly () : boolean {
      return getRequireValue("readOnly", 0) as java.lang.Boolean
    }
    
    property set readOnly ($arg :  boolean) {
      setRequireValue("readOnly", 0, $arg)
    }
    
    
  }
  
  
}