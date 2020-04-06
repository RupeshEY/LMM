package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableSettlementsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableSettlementsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 30, column 53
    function sortValue_0 (Settlement :  entity.Settlement) : java.lang.Object {
      return Settlement.BenefitType
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 36, column 42
    function sortValue_1 (Settlement :  entity.Settlement) : java.lang.Object {
      return Settlement.SettleDate
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 42, column 44
    function sortValue_2 (Settlement :  entity.Settlement) : java.lang.Object {
      return Settlement.SettleAmount
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 49, column 45
    function sortValue_3 (Settlement :  entity.Settlement) : java.lang.Object {
      return Settlement.SettleMethod
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 54, column 43
    function sortValue_4 (Settlement :  entity.Settlement) : java.lang.Object {
      return Settlement.Description
    }
    
    // 'toAdd' attribute on RowIterator at EditableSettlementsLV.pcf: line 22, column 39
    function toAdd_25 (Settlement :  entity.Settlement) : void {
      Exposure.addToSettlements(Settlement)
    }
    
    // 'toRemove' attribute on RowIterator at EditableSettlementsLV.pcf: line 22, column 39
    function toRemove_26 (Settlement :  entity.Settlement) : void {
      Exposure.removeFromSettlements(Settlement)
    }
    
    // 'value' attribute on RowIterator at EditableSettlementsLV.pcf: line 22, column 39
    function value_27 () : entity.Settlement[] {
      return Exposure.Settlements
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableSettlementsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=SettleDate) at EditableSettlementsLV.pcf: line 36, column 42
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Settlement.SettleDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CurrencyCell (id=SettleAmount) at EditableSettlementsLV.pcf: line 42, column 44
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Settlement.SettleAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyCell (id=SettleMethod) at EditableSettlementsLV.pcf: line 49, column 45
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Settlement.SettleMethod = (__VALUE_TO_SET as typekey.SettleMethod)
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableSettlementsLV.pcf: line 54, column 43
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Settlement.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=BenefitType) at EditableSettlementsLV.pcf: line 30, column 53
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Settlement.BenefitType = (__VALUE_TO_SET as typekey.LostWagesBenefitType)
    }
    
    // 'value' attribute on TypeKeyCell (id=BenefitType) at EditableSettlementsLV.pcf: line 30, column 53
    function valueRoot_8 () : java.lang.Object {
      return Settlement
    }
    
    // 'value' attribute on CurrencyCell (id=SettleAmount) at EditableSettlementsLV.pcf: line 42, column 44
    function value_13 () : gw.api.financials.CurrencyAmount {
      return Settlement.SettleAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=SettleMethod) at EditableSettlementsLV.pcf: line 49, column 45
    function value_17 () : typekey.SettleMethod {
      return Settlement.SettleMethod
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableSettlementsLV.pcf: line 54, column 43
    function value_21 () : java.lang.String {
      return Settlement.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=BenefitType) at EditableSettlementsLV.pcf: line 30, column 53
    function value_5 () : typekey.LostWagesBenefitType {
      return Settlement.BenefitType
    }
    
    // 'value' attribute on DateCell (id=SettleDate) at EditableSettlementsLV.pcf: line 36, column 42
    function value_9 () : java.util.Date {
      return Settlement.SettleDate
    }
    
    property get Settlement () : entity.Settlement {
      return getIteratedValue(1) as entity.Settlement
    }
    
    
  }
  
  
}