package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowDateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonRowDateInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowDateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonRowDateInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowDateInputSet.pcf: line 29, column 35
    function tdClass_4 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on DateInput (id=Value) at RuleComparisonRowDateInputSet.pcf: line 27, column 29
    function value_5 () : java.util.Date {
      return value.get()
    }
    
    property get value () : java.util.function.Supplier<Date> {
      return getIteratedValue(1) as java.util.function.Supplier<Date>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonRowDateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonRowDateInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonRowDateInputSet.pcf: line 15, column 33
    function tdClass_0 () : java.lang.String {
      return row.CssClass
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowDateInputSet.pcf: line 13, column 25
    function valueRoot_3 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextInput (id=Label) at RuleComparisonRowDateInputSet.pcf: line 13, column 25
    function value_1 () : java.lang.String {
      return row.Label
    }
    
    // 'value' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowDateInputSet.pcf: line 22, column 71
    function value_7 () : List<java.util.function.Supplier<Date>> {
      return row.Values
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowDateInputSet.pcf: line 22, column 71
    function verifyValueTypeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowDateInputSet.pcf: line 22, column 71
    function verifyValueTypeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ValueIterator) at RuleComparisonRowDateInputSet.pcf: line 22, column 71
    function verifyValueType_9 () : void {
      var __valueTypeArg : List<java.util.function.Supplier<Date>>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_8(__valueTypeArg)
    }
    
    property get row () : gw.bizrules.pcf.RuleComparisonRow<Date> {
      return getRequireValue("row", 0) as gw.bizrules.pcf.RuleComparisonRow<Date>
    }
    
    property set row ($arg :  gw.bizrules.pcf.RuleComparisonRow<Date>) {
      setRequireValue("row", 0, $arg)
    }
    
    
  }
  
  
}