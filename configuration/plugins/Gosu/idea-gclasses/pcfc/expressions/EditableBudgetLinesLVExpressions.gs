package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableBudgetLinesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBudgetLinesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 31, column 45
    function sortValue_0 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine.BudgetLineType
    }
    
    // 'value' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 41, column 47
    function sortValue_1 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine.OriginalEstimate
    }
    
    // 'value' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 51, column 90
    function sortValue_2 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return Matter.getTotalPaidForMatterCostCategory( BudgetLine.BudgetLineType )
    }
    
    // 'value' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 60, column 42
    function sortValue_3 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine.difference
    }
    
    // '$$sumValue' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 41, column 47
    function sumValueRoot_5 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 41, column 47
    function sumValue_4 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine.OriginalEstimate
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 51, column 90
    function sumValue_6 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return Matter.getTotalPaidForMatterCostCategory( BudgetLine.BudgetLineType )
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 60, column 42
    function sumValue_7 (BudgetLine :  entity.BudgetLine) : java.lang.Object {
      return BudgetLine.difference
    }
    
    // 'toAdd' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 21, column 39
    function toAdd_24 (BudgetLine :  entity.BudgetLine) : void {
      Matter.addToBudgetLines(BudgetLine)
    }
    
    // 'value' attribute on RowIterator at EditableBudgetLinesLV.pcf: line 21, column 39
    function value_25 () : entity.BudgetLine[] {
      return Matter.BudgetLines
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Matter () : Matter {
      return getRequireValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setRequireValue("Matter", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableBudgetLinesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=BudgetLineType) at EditableBudgetLinesLV.pcf: line 31, column 45
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      BudgetLine.BudgetLineType = (__VALUE_TO_SET as typekey.LineCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=OriginalEstimate) at EditableBudgetLinesLV.pcf: line 41, column 47
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      BudgetLine.OriginalEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'editable' attribute on TypeKeyCell (id=BudgetLineType) at EditableBudgetLinesLV.pcf: line 31, column 45
    function editable_9 () : java.lang.Boolean {
      return BudgetLine.BudgetLineType == null
    }
    
    // 'value' attribute on TypeKeyCell (id=BudgetLineType) at EditableBudgetLinesLV.pcf: line 31, column 45
    function valueRoot_14 () : java.lang.Object {
      return BudgetLine
    }
    
    // 'value' attribute on TypeKeyCell (id=BudgetLineType) at EditableBudgetLinesLV.pcf: line 31, column 45
    function value_10 () : typekey.LineCategory {
      return BudgetLine.BudgetLineType
    }
    
    // 'value' attribute on CurrencyCell (id=OriginalEstimate) at EditableBudgetLinesLV.pcf: line 41, column 47
    function value_15 () : gw.api.financials.CurrencyAmount {
      return BudgetLine.OriginalEstimate
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPayments) at EditableBudgetLinesLV.pcf: line 51, column 90
    function value_19 () : gw.api.financials.CurrencyAmount {
      return Matter.getTotalPaidForMatterCostCategory( BudgetLine.BudgetLineType )
    }
    
    // 'value' attribute on CurrencyCell (id=Difference) at EditableBudgetLinesLV.pcf: line 60, column 42
    function value_21 () : gw.api.financials.CurrencyAmount {
      return BudgetLine.difference
    }
    
    property get BudgetLine () : entity.BudgetLine {
      return getIteratedValue(1) as entity.BudgetLine
    }
    
    
  }
  
  
}