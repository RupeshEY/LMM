package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionLineItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TransactionLineItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at TransactionLineItemsLV.pcf: line 21, column 45
    function valueRoot_5 () : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at TransactionLineItemsLV.pcf: line 21, column 45
    function value_3 () : typekey.LineCategory {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on TextCell (id=Comments) at TransactionLineItemsLV.pcf: line 25, column 49
    function value_6 () : java.lang.String {
      return TransactionLineItem.Comments
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at TransactionLineItemsLV.pcf: line 31, column 55
    function value_9 () : gw.api.financials.IPairedMoney {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    property get TransactionLineItem () : entity.TransactionLineItem {
      return getIteratedValue(1) as entity.TransactionLineItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionLineItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at TransactionLineItemsLV.pcf: line 21, column 45
    function sortValue_0 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on RowIterator at TransactionLineItemsLV.pcf: line 25, column 49
    function sortValue_1 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.Comments
    }
    
    // 'value' attribute on RowIterator at TransactionLineItemsLV.pcf: line 31, column 55
    function sortValue_2 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on RowIterator at TransactionLineItemsLV.pcf: line 15, column 48
    function value_12 () : entity.TransactionLineItem[] {
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