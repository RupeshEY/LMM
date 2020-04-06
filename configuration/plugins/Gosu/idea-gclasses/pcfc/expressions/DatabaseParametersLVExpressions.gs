package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseParametersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParametersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CellIterator (id=headerCells) at DatabaseParametersLV.pcf: line 17, column 40
    function value_2 () : java.lang.String[] {
      return ParameterSet.AttributeNames
    }
    
    // 'value' attribute on RowIterator (id=dbParamLVRowIter) at DatabaseParametersLV.pcf: line 29, column 40
    function value_6 () : java.lang.Object[][] {
      return ParameterSet.AttributeValues
    }
    
    property get ParameterSet () : gw.api.database.DatabaseParameterSet {
      return getRequireValue("ParameterSet", 0) as gw.api.database.DatabaseParameterSet
    }
    
    property set ParameterSet ($arg :  gw.api.database.DatabaseParameterSet) {
      setRequireValue("ParameterSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends DatabaseParametersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CellIterator (id=dbParamLVRowIterRowCellIter) at DatabaseParametersLV.pcf: line 36, column 42
    function value_5 () : java.lang.Object[] {
      return Values
    }
    
    property get Values () : java.lang.Object[] {
      return getIteratedValue(1) as java.lang.Object[]
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends IteratorEntry2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ValueCell) at DatabaseParametersLV.pcf: line 41, column 26
    function value_3 () : java.lang.Object {
      return Value
    }
    
    property get Value () : java.lang.Object {
      return getIteratedValue(2) as java.lang.Object
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DatabaseParametersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=HeaderCell) at DatabaseParametersLV.pcf: line 20, column 25
    function value_0 () : java.lang.String {
      return Name
    }
    
    property get Name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}