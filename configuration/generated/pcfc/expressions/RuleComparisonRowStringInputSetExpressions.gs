package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowStringInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonRowStringInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowStringInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonRowStringInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowStringInputSet.pcf: line 28, column 35
    function tdClass_4 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on TextInput (id=Value) at RuleComparisonRowStringInputSet.pcf: line 26, column 29
    function value_5 () : java.lang.String {
      return value.get()
    }
    
    property get value () : java.util.function.Supplier<String> {
      return getIteratedValue(1) as java.util.function.Supplier<String>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowStringInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonRowStringInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowStringInputSet.pcf: line 15, column 33
    function tdClass_0 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowStringInputSet.pcf: line 13, column 25
    function valueRoot_3 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowStringInputSet.pcf: line 13, column 25
    function value_1 () : java.lang.String {
      return row.Label
    }
    
    // 'value' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowStringInputSet.pcf: line 22, column 73
    function value_7 () : List<java.util.function.Supplier<String>> {
      return row.Values
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowStringInputSet.pcf: line 22, column 73
    function verifyValueTypeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowStringInputSet.pcf: line 22, column 73
    function verifyValueTypeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowStringInputSet.pcf: line 22, column 73
    function verifyValueType_9 () : void {
      var __valueTypeArg : List<java.util.function.Supplier<String>>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_8(__valueTypeArg)
    }
    
    property get row () : gw.bizrules.pcf.RuleComparisonRow<String> {
      return getRequireValue("row", 0) as gw.bizrules.pcf.RuleComparisonRow<String>
    }
    
    property set row ($arg :  gw.bizrules.pcf.RuleComparisonRow<String>) {
      setRequireValue("row", 0, $arg)
    }
    
    
  }
  
  
}