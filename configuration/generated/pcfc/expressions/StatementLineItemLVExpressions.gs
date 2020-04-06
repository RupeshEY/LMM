package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatementLineItemLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StatementLineItemLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=lineItemCategory) at StatementLineItemLV.pcf: line 40, column 72
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      lineItem.Category = (__VALUE_TO_SET as typekey.ServiceRequestStatementLineItemCategory)
    }
    
    // 'value' attribute on TextCell (id=lineItemDescription) at StatementLineItemLV.pcf: line 45, column 41
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      lineItem.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyCell (id=lineItemAmount) at StatementLineItemLV.pcf: line 52, column 35
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      lineItem.Amount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'label' attribute on CurrencyCell (id=lineItemAmount) at StatementLineItemLV.pcf: line 52, column 35
    function label_17 () : java.lang.Object {
      return amountLabel
    }
    
    // 'value' attribute on TypeKeyCell (id=lineItemCategory) at StatementLineItemLV.pcf: line 40, column 72
    function valueRoot_12 () : java.lang.Object {
      return lineItem
    }
    
    // 'value' attribute on TextCell (id=lineItemDescription) at StatementLineItemLV.pcf: line 45, column 41
    function value_13 () : java.lang.String {
      return lineItem.Description
    }
    
    // 'value' attribute on CurrencyCell (id=lineItemAmount) at StatementLineItemLV.pcf: line 52, column 35
    function value_18 () : gw.api.financials.CurrencyAmount {
      return lineItem.Amount
    }
    
    // 'value' attribute on TypeKeyCell (id=lineItemCategory) at StatementLineItemLV.pcf: line 40, column 72
    function value_9 () : typekey.ServiceRequestStatementLineItemCategory {
      return lineItem.Category
    }
    
    property get lineItem () : entity.ServiceRequestStatementLineItem {
      return getIteratedValue(1) as entity.ServiceRequestStatementLineItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementLineItemLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoAdd' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 32, column 60
    function autoAdd_8 () : java.lang.Boolean {
      return serviceRequestStatement.LineItems.IsEmpty
    }
    
    // 'initialValue' attribute on Variable at StatementLineItemLV.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return serviceRequestStatement typeis ServiceRequestInvoice
    }
    
    // 'initialValue' attribute on Variable at StatementLineItemLV.pcf: line 21, column 32
    function initialValue_1 () : java.lang.String {
      return isInvoice ? DisplayKey.get("Web.ServiceRequest.Invoice.Amount") : DisplayKey.get("Web.ServiceRequest.Quote.Amount")
    }
    
    // 'label' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 52, column 35
    function label_4 () : java.lang.Object {
      return amountLabel
    }
    
    // 'value' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 40, column 72
    function sortValue_2 (lineItem :  entity.ServiceRequestStatementLineItem) : java.lang.Object {
      return lineItem.Category
    }
    
    // 'value' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 45, column 41
    function sortValue_3 (lineItem :  entity.ServiceRequestStatementLineItem) : java.lang.Object {
      return lineItem.Description
    }
    
    // 'value' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 52, column 35
    function sortValue_5 (lineItem :  entity.ServiceRequestStatementLineItem) : java.lang.Object {
      return lineItem.Amount
    }
    
    // '$$sumValue' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 52, column 35
    function sumValueRoot_7 (lineItem :  entity.ServiceRequestStatementLineItem) : java.lang.Object {
      return lineItem
    }
    
    // 'footerSumValue' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 52, column 35
    function sumValue_6 (lineItem :  entity.ServiceRequestStatementLineItem) : java.lang.Object {
      return lineItem.Amount
    }
    
    // 'toAdd' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 32, column 60
    function toAdd_23 (lineItem :  entity.ServiceRequestStatementLineItem) : void {
      serviceRequestStatement.addToLineItems(lineItem)
    }
    
    // 'toRemove' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 32, column 60
    function toRemove_24 (lineItem :  entity.ServiceRequestStatementLineItem) : void {
      serviceRequestStatement.removeFromLineItems(lineItem)
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=StatementLineItemLV) at StatementLineItemLV.pcf: line 7, column 86
    function validationExpression_26 () : java.lang.Object {
      return serviceRequestStatement.validateServiceRequestStatement()
    }
    
    // 'value' attribute on RowIterator (id=lineItemsIterator) at StatementLineItemLV.pcf: line 32, column 60
    function value_25 () : entity.ServiceRequestStatementLineItem[] {
      return serviceRequestStatement.LineItems
    }
    
    property get amountLabel () : java.lang.String {
      return getVariableValue("amountLabel", 0) as java.lang.String
    }
    
    property set amountLabel ($arg :  java.lang.String) {
      setVariableValue("amountLabel", 0, $arg)
    }
    
    property get isInvoice () : boolean {
      return getVariableValue("isInvoice", 0) as java.lang.Boolean
    }
    
    property set isInvoice ($arg :  boolean) {
      setVariableValue("isInvoice", 0, $arg)
    }
    
    property get serviceRequestStatement () : ServiceRequestStatement {
      return getRequireValue("serviceRequestStatement", 0) as ServiceRequestStatement
    }
    
    property set serviceRequestStatement ($arg :  ServiceRequestStatement) {
      setRequireValue("serviceRequestStatement", 0, $arg)
    }
    
    
  }
  
  
}