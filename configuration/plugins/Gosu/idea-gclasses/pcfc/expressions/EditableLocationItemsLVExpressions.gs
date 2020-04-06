package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableLocationItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableLocationItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableLocationItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableLocationItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableLocationItemsLV.pcf: line 29, column 45
    function sortValue_0 (PropertyItem :  entity.PropertyItem) : java.lang.Object {
      return PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator at EditableLocationItemsLV.pcf: line 36, column 48
    function sortValue_1 (PropertyItem :  entity.PropertyItem) : java.lang.Object {
      return PropertyItem.AppraisedValue
    }
    
    // 'toAdd' attribute on RowIterator at EditableLocationItemsLV.pcf: line 21, column 41
    function toAdd_10 (PropertyItem :  entity.PropertyItem) : void {
      PolicyLocation.addToHighValueItems(PropertyItem)
    }
    
    // 'toRemove' attribute on RowIterator at EditableLocationItemsLV.pcf: line 21, column 41
    function toRemove_11 (PropertyItem :  entity.PropertyItem) : void {
      PolicyLocation.removeFromHighValueItems(PropertyItem)
    }
    
    // 'value' attribute on RowIterator at EditableLocationItemsLV.pcf: line 21, column 41
    function value_12 () : entity.PropertyItem[] {
      return PolicyLocation.HighValueItems
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getRequireValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setRequireValue("PolicyLocation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableLocationItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableLocationItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableLocationItemsLV.pcf: line 29, column 45
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyItem.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyCell (id=Value) at EditableLocationItemsLV.pcf: line 36, column 48
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyItem.AppraisedValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableLocationItemsLV.pcf: line 29, column 45
    function valueRoot_5 () : java.lang.Object {
      return PropertyItem
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableLocationItemsLV.pcf: line 29, column 45
    function value_2 () : java.lang.String {
      return PropertyItem.Description
    }
    
    // 'value' attribute on CurrencyCell (id=Value) at EditableLocationItemsLV.pcf: line 36, column 48
    function value_6 () : gw.api.financials.CurrencyAmount {
      return PropertyItem.AppraisedValue
    }
    
    property get PropertyItem () : entity.PropertyItem {
      return getIteratedValue(1) as entity.PropertyItem
    }
    
    
  }
  
  
}