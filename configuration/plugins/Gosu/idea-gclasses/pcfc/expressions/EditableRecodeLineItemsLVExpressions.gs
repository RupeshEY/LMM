package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/EditableRecodeLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRecodeLineItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/EditableRecodeLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecodeLineItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function sortValue_0 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 39, column 55
    function sortValue_1 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // '$$sumValue' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 39, column 55
    function sumValueRoot_3 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 39, column 55
    function sumValue_2 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'toAdd' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 22, column 48
    function toAdd_17 (TransactionLineItem :  entity.TransactionLineItem) : void {
      Transaction.addToLineItems(TransactionLineItem)
    }
    
    // 'toRemove' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 22, column 48
    function toRemove_18 (TransactionLineItem :  entity.TransactionLineItem) : void {
      remove(TransactionLineItem)
    }
    
    // 'value' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 22, column 48
    function value_19 () : entity.TransactionLineItem[] {
      return Transaction.LineItems
    }
    
    property get Transaction () : Transaction {
      return getRequireValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setRequireValue("Transaction", 0, $arg)
    }
    
    function remove(tli : TransactionLineItem) {
      if (tli.LineCategory == TC_DEDUCTIBLE) {
        (Transaction as Payment).removeDeductibleLineItem(tli)
      } else {
        // temporarily disassociate the check from onset so that line items can be removed from a submitted check
        var c = (Transaction as Payment).Check;
        (Transaction as Payment).Check = null
        Transaction.removeFromLineItemsIfEditable(tli)
        (Transaction as Payment).Check = c
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/EditableRecodeLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRecodeLineItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at EditableRecodeLineItemsLV.pcf: line 22, column 48
    function checkBoxVisible_16 () : java.lang.Boolean {
      return (Transaction typeis Payment) and gw.api.financials.FinancialsUtil.isAllowMultipleLineItems()
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      TransactionLineItem.LineCategory = (__VALUE_TO_SET as typekey.LineCategory)
    }
    
    // 'editable' attribute on CurrencyCell (id=Amount) at EditableRecodeLineItemsLV.pcf: line 39, column 55
    function editable_11 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments() and (Transaction typeis Payment)
    }
    
    // 'editable' attribute on TypeKeyCell (id=LineCategory) at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function editable_4 () : java.lang.Boolean {
      return TransactionLineItem.LineCategory != TC_DEDUCTIBLE and TransactionLineItem.LineCategory != TC_FORMERDEDUCTIBLE
    }
    
    // 'filter' attribute on TypeKeyCell (id=LineCategory) at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function filter_10 (VALUE :  typekey.LineCategory, VALUES :  typekey.LineCategory[]) : java.lang.Boolean {
      return TransactionLineItem.ValidLineCategories.contains(VALUE)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function valueRoot_9 () : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableRecodeLineItemsLV.pcf: line 39, column 55
    function value_12 () : gw.api.financials.IPairedMoney {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditableRecodeLineItemsLV.pcf: line 31, column 45
    function value_5 () : typekey.LineCategory {
      return TransactionLineItem.LineCategory
    }
    
    property get TransactionLineItem () : entity.TransactionLineItem {
      return getIteratedValue(1) as entity.TransactionLineItem
    }
    
    
  }
  
  
}