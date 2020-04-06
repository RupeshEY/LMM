package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentTransferLineItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PaymentTransferLineItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      TransactionLineItem.LineCategory = (__VALUE_TO_SET as typekey.LineCategory)
    }
    
    // 'editable' attribute on TypeKeyCell (id=LineCategory) at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function editable_4 () : java.lang.Boolean {
      return TransactionLineItem.LineCategory!=TC_DEDUCTIBLE and TransactionLineItem.LineCategory!=TC_FORMERDEDUCTIBLE
    }
    
    // 'filter' attribute on TypeKeyCell (id=LineCategory) at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function filter_10 (VALUE :  typekey.LineCategory, VALUES :  typekey.LineCategory[]) : java.lang.Boolean {
      return TransactionLineItem.ValidLineCategories.contains(VALUE)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function valueRoot_9 () : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at PaymentTransferLineItemsLV.pcf: line 31, column 55
    function value_11 () : gw.api.financials.IPairedMoney {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function value_5 () : typekey.LineCategory {
      return TransactionLineItem.LineCategory
    }
    
    property get TransactionLineItem () : entity.TransactionLineItem {
      return getIteratedValue(1) as entity.TransactionLineItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentTransferLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferLineItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PaymentTransferLineItemsLV.pcf: line 24, column 45
    function sortValue_0 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on RowIterator at PaymentTransferLineItemsLV.pcf: line 31, column 55
    function sortValue_1 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // '$$sumValue' attribute on RowIterator at PaymentTransferLineItemsLV.pcf: line 31, column 55
    function sumValueRoot_3 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'footerSumValue' attribute on RowIterator at PaymentTransferLineItemsLV.pcf: line 31, column 55
    function sumValue_2 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at PaymentTransferLineItemsLV.pcf: line 15, column 48
    function value_14 () : entity.TransactionLineItem[] {
      return Transaction.LineItems
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  
}