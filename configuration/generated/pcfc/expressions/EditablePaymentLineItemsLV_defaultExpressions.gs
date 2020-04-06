package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/EditablePaymentLineItemsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditablePaymentLineItemsLV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/EditablePaymentLineItemsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePaymentLineItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoAdd' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 22, column 48
    function autoAdd_5 () : java.lang.Boolean {
      return Transaction.LineItems.length == 0
    }
    
    // 'required' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function required_0 () : java.lang.Boolean {
      return ScriptParameters.UtilizeMatterBudget and Transaction.CostCategory==typekey.CostCategory.TC_LEGAL
    }
    
    // 'value' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function sortValue_1 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.LineCategory
    }
    
    // 'value' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 41, column 54
    function sortValue_2 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // '$$sumValue' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 41, column 54
    function sumValueRoot_4 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'footerSumValue' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 41, column 54
    function sumValue_3 (TransactionLineItem :  entity.TransactionLineItem) : java.lang.Object {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'toAdd' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 22, column 48
    function toAdd_17 (TransactionLineItem :  entity.TransactionLineItem) : void {
      Transaction.addToLineItems(TransactionLineItem)
    }
    
    // 'toRemove' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 22, column 48
    function toRemove_18 (TransactionLineItem :  entity.TransactionLineItem) : void {
      remove(TransactionLineItem)
    }
    
    // 'value' attribute on RowIterator at EditablePaymentLineItemsLV.default.pcf: line 22, column 48
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
        Transaction.removeFromLineItemsIfEditable(tli)
      }
    }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/EditablePaymentLineItemsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditablePaymentLineItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      TransactionLineItem.LineCategory = (__VALUE_TO_SET as typekey.LineCategory)
    }
    
    // 'editable' attribute on Row at EditablePaymentLineItemsLV.default.pcf: line 24, column 156
    function editable_16 () : java.lang.Boolean {
      return TransactionLineItem.LineCategory != LineCategory.TC_DEDUCTIBLE and TransactionLineItem.LineCategory != LineCategory.TC_FORMERDEDUCTIBLE
    }
    
    // 'filter' attribute on TypeKeyCell (id=LineCategory) at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function filter_11 (VALUE :  typekey.LineCategory, VALUES :  typekey.LineCategory[]) : java.lang.Boolean {
      return TransactionLineItem.ValidLineCategories.contains(VALUE)
    }
    
    // 'required' attribute on TypeKeyCell (id=LineCategory) at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function required_7 () : java.lang.Boolean {
      return ScriptParameters.UtilizeMatterBudget and Transaction.CostCategory==typekey.CostCategory.TC_LEGAL
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function valueRoot_10 () : java.lang.Object {
      return TransactionLineItem
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditablePaymentLineItemsLV.default.pcf: line 41, column 54
    function value_13 () : gw.api.financials.IPairedMoney {
      return TransactionLineItem.TransactionAmountReservingAmountPair
    }
    
    // 'value' attribute on TypeKeyCell (id=LineCategory) at EditablePaymentLineItemsLV.default.pcf: line 32, column 45
    function value_6 () : typekey.LineCategory {
      return TransactionLineItem.LineCategory
    }
    
    property get TransactionLineItem () : entity.TransactionLineItem {
      return getIteratedValue(1) as entity.TransactionLineItem
    }
    
    
  }
  
  
}