package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowBooleanInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonRowBooleanInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowBooleanInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonRowBooleanInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowBooleanInputSet.pcf: line 28, column 35
    function tdClass_4 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on BooleanRadioInput (id=Value) at RuleComparisonRowBooleanInputSet.pcf: line 26, column 29
    function value_5 () : java.lang.Boolean {
      return value.get()
    }
    
    property get value () : java.util.function.Supplier<Boolean> {
      return getIteratedValue(1) as java.util.function.Supplier<Boolean>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowBooleanInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonRowBooleanInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowBooleanInputSet.pcf: line 15, column 33
    function tdClass_0 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowBooleanInputSet.pcf: line 13, column 25
    function valueRoot_3 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowBooleanInputSet.pcf: line 13, column 25
    function value_1 () : java.lang.String {
      return row.Label
    }
    
    // 'value' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowBooleanInputSet.pcf: line 22, column 74
    function value_7 () : List<java.util.function.Supplier<Boolean>> {
      return row.Values
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowBooleanInputSet.pcf: line 22, column 74
    function verifyValueTypeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowBooleanInputSet.pcf: line 22, column 74
    function verifyValueTypeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowBooleanInputSet.pcf: line 22, column 74
    function verifyValueType_9 () : void {
      var __valueTypeArg : List<java.util.function.Supplier<Boolean>>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_8(__valueTypeArg)
    }
    
    property get row () : gw.bizrules.pcf.RuleComparisonRow<Boolean> {
      return getRequireValue("row", 0) as gw.bizrules.pcf.RuleComparisonRow<Boolean>
    }
    
    property set row ($arg :  gw.bizrules.pcf.RuleComparisonRow<Boolean>) {
      setRequireValue("row", 0, $arg)
    }
    
    
  }
  
  
}