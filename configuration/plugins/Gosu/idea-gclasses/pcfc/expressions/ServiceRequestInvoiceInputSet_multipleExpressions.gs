package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestInvoiceInputSet_multipleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ServiceRequestInvoiceInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=ServiceRequestInvoiceAmount) at ServiceRequestInvoiceInputSet.multiple.pcf: line 43, column 39
    function valueRoot_11 () : java.lang.Object {
      return invoice
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at ServiceRequestInvoiceInputSet.multiple.pcf: line 39, column 68
    function valueRoot_8 () : java.lang.Object {
      return invoice.ServiceRequest
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestInvoiceReferenceNumber) at ServiceRequestInvoiceInputSet.multiple.pcf: line 34, column 197
    function value_4 () : java.lang.String {
      return invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("NVV.Financials.NewCheck.Check.ServiceRequestInvoice.InvoiceReferenceNumberMissing")
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at ServiceRequestInvoiceInputSet.multiple.pcf: line 39, column 68
    function value_6 () : java.lang.String {
      return invoice.ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on CurrencyCell (id=ServiceRequestInvoiceAmount) at ServiceRequestInvoiceInputSet.multiple.pcf: line 43, column 39
    function value_9 () : gw.api.financials.CurrencyAmount {
      return invoice.Amount
    }
    
    property get invoice () : entity.ServiceRequestInvoice {
      return getIteratedValue(1) as entity.ServiceRequestInvoice
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoiceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestInvoiceInputSet.multiple.pcf: line 17, column 46
    function initialValue_0 () : entity.ServiceRequestInvoice[] {
      return Wizard.Check.ServiceRequestInvoices
    }
    
    // 'value' attribute on RowIterator at ServiceRequestInvoiceInputSet.multiple.pcf: line 34, column 197
    function sortValue_1 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("NVV.Financials.NewCheck.Check.ServiceRequestInvoice.InvoiceReferenceNumberMissing")
    }
    
    // 'value' attribute on RowIterator at ServiceRequestInvoiceInputSet.multiple.pcf: line 39, column 68
    function sortValue_2 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on RowIterator at ServiceRequestInvoiceInputSet.multiple.pcf: line 43, column 39
    function sortValue_3 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Amount
    }
    
    // 'value' attribute on RowIterator at ServiceRequestInvoiceInputSet.multiple.pcf: line 28, column 54
    function value_12 () : entity.ServiceRequestInvoice[] {
      return invoices
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get invoices () : entity.ServiceRequestInvoice[] {
      return getVariableValue("invoices", 0) as entity.ServiceRequestInvoice[]
    }
    
    property set invoices ($arg :  entity.ServiceRequestInvoice[]) {
      setVariableValue("invoices", 0, $arg)
    }
    
    property get showDocuments () : boolean {
      return getRequireValue("showDocuments", 0) as java.lang.Boolean
    }
    
    property set showDocuments ($arg :  boolean) {
      setRequireValue("showDocuments", 0, $arg)
    }
    
    
  }
  
  
}