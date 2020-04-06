package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonColumnHeadingsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonColumnHeadingsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonColumnHeadingsInputSet.pcf: line 31, column 53
    function tdClass_1 () : java.lang.String {
      return controller.DefaultTDStyleClass
    }
    
    // 'value' attribute on TextInput (id=ColumnRelativeStateHeadings) at RuleComparisonColumnHeadingsInputSet.pcf: line 29, column 25
    function value_2 () : java.lang.String {
      return heading
    }
    
    property get heading () : String {
      return getIteratedValue(1) as String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonColumnHeadingsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonColumnHeadingsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'tdClass' attribute on LayoutConfig at RuleComparisonColumnHeadingsInputSet.pcf: line 17, column 51
    function tdClass_0 () : java.lang.String {
      return controller.DefaultTDStyleClass
    }
    
    // 'value' attribute on InputIterator (id=ColumnRelativeStateHeadings) at RuleComparisonColumnHeadingsInputSet.pcf: line 24, column 38
    function value_4 () : List<String> {
      return headings
    }
    
    // 'valueType' attribute on InputIterator (id=ColumnRelativeStateHeadings) at RuleComparisonColumnHeadingsInputSet.pcf: line 24, column 38
    function verifyValueTypeIsAllowedType_5 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ColumnRelativeStateHeadings) at RuleComparisonColumnHeadingsInputSet.pcf: line 24, column 38
    function verifyValueTypeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator (id=ColumnRelativeStateHeadings) at RuleComparisonColumnHeadingsInputSet.pcf: line 24, column 38
    function verifyValueType_6 () : void {
      var __valueTypeArg : List<String>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_5(__valueTypeArg)
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    property get headings () : List<String> {
      return getRequireValue("headings", 0) as List<String>
    }
    
    property set headings ($arg :  List<String>) {
      setRequireValue("headings", 0, $arg)
    }
    
    
  }
  
  
}