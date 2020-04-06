package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/EditableRecoveryLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRecoveryLineItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/EditableRecoveryLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecoveryLineItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 29, column 45
    function sortValue_0 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 34, column 49
    function sortValue_1 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.Comments
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 43, column 55
    function sortValue_2 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // '$$sumValue' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 43, column 55
    function sumValueRoot_4 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 43, column 55
    function sumValue_3 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'toAdd' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 20, column 48
    function toAdd_17 (TransactionLineItem :  entity.TransactionLineItem) : void {
      Transaction.addToLineItems(TransactionLineItem)
    }
    
    // 'toRemove' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 20, column 48
    function toRemove_18 (TransactionLineItem :  entity.TransactionLineItem) : void {
      Transaction.removeFromLineItemsIfEditable(TransactionLineItem)
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryLineItemsLV.pcf: line 20, column 48
    function value_19 () : entity.TransactionLineItem[] {
      return Transaction.LineItems
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/EditableRecoveryLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRecoveryLineItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableRecoveryLineItemsLV.pcf: line 34, column 49
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      TransactionLineItem.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecoveryLineItemsLV.pcf: line 29, column 45
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      TransactionLineItem.LineCategory = (__VALUE_TO_SET as typekey.LineCategory)
    }
    
    // 'filter' attribute on TypeKeyCell (id=LineCategory) at EditableRecoveryLineItemsLV.pcf: line 29, column 45
    function filter_9 (VALUE :  typekey.LineCategory, VALUES :  typekey.LineCategory[]) : java.lang.Boolean {
      return TransactionLineItem.ValidLineCategories.contains(VALUE)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecoveryLineItemsLV.pcf: line 29, column 45
    function valueRoot_8 () : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableRecoveryLineItemsLV.pcf: line 34, column 49
    function value_10 () : java.lang.String {
      return TransactionLineItem.Comments
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableRecoveryLineItemsLV.pcf: line 43, column 55
    function value_14 () : gw.api.financials.IPairedMoney {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecoveryLineItemsLV.pcf: line 29, column 45
    function value_5 () : typekey.LineCategory {
      return TransactionLineItem.LineCategory
    }
    
    property get TransactionLineItem () : entity.TransactionLineItem {
      return getIteratedValue(1) as entity.TransactionLineItem
    }
    
    
  }
  
  
}