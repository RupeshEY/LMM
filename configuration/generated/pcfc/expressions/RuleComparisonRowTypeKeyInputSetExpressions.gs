package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowTypeKeyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonRowTypeKeyInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowTypeKeyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonRowTypeKeyInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowTypeKeyInputSet.pcf: line 30, column 35
    function tdClass_4 () : java.lang.String {
      return row.CssClass
    }
    
    // 'valueRange' attribute on RangeInput (id=Value) at RuleComparisonRowTypeKeyInputSet.pcf: line 28, column 39
    function valueRange_7 () : java.lang.Object {
      return {}
    }
    
    // 'value' attribute on RangeInput (id=Value) at RuleComparisonRowTypeKeyInputSet.pcf: line 28, column 39
    function value_5 () : gw.entity.TypeKey {
      return value.get()
    }
    
    // 'valueRange' attribute on RangeInput (id=Value) at RuleComparisonRowTypeKeyInputSet.pcf: line 28, column 39
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.entity.TypeKey[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Value) at RuleComparisonRowTypeKeyInputSet.pcf: line 28, column 39
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Value) at RuleComparisonRowTypeKeyInputSet.pcf: line 28, column 39
    function verifyValueRange_9 () : void {
      var __valueRangeArg = {}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    property get value () : java.util.function.Supplier<gw.entity.TypeKey> {
      return getIteratedValue(1) as java.util.function.Supplier<gw.entity.TypeKey>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowTypeKeyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonRowTypeKeyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowTypeKeyInputSet.pcf: line 15, column 33
    function tdClass_0 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowTypeKeyInputSet.pcf: line 13, column 25
    function valueRoot_3 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowTypeKeyInputSet.pcf: line 13, column 25
    function value_1 () : java.lang.String {
      return row.Label
    }
    
    // 'value' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowTypeKeyInputSet.pcf: line 22, column 84
    function value_10 () : List<java.util.function.Supplier<gw.entity.TypeKey>> {
      return row.Values
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowTypeKeyInputSet.pcf: line 22, column 84
    function verifyValueTypeIsAllowedType_11 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowTypeKeyInputSet.pcf: line 22, column 84
    function verifyValueTypeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowTypeKeyInputSet.pcf: line 22, column 84
    function verifyValueType_12 () : void {
      var __valueTypeArg : List<java.util.function.Supplier<gw.entity.TypeKey>>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_11(__valueTypeArg)
    }
    
    property get row () : gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey> {
      return getRequireValue("row", 0) as gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey>
    }
    
    property set row ($arg :  gw.bizrules.pcf.RuleComparisonRow<gw.entity.TypeKey>) {
      setRequireValue("row", 0, $arg)
    }
    
    
  }
  
  
}