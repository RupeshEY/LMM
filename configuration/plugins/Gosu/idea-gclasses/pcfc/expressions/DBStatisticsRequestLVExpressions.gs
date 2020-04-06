package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DBStatisticsRequestLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatisticsRequestLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at DBStatisticsRequestLV.pcf: line 16, column 44
    function value_7 () : gw.api.tools.PickerRow[] {
      return TablePickers
    }
    
    property get TablePickers () : gw.api.tools.PickerRow[] {
      return getRequireValue("TablePickers", 0) as gw.api.tools.PickerRow[]
    }
    
    property set TablePickers ($arg :  gw.api.tools.PickerRow[]) {
      setRequireValue("TablePickers", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DBStatisticsRequestLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at DBStatisticsRequestLV.pcf: line 22, column 31
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Row.Chosen = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at DBStatisticsRequestLV.pcf: line 22, column 31
    function valueRoot_3 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at DBStatisticsRequestLV.pcf: line 22, column 31
    function value_0 () : java.lang.Boolean {
      return Row.Chosen
    }
    
    // 'value' attribute on TextCell (id=tname) at DBStatisticsRequestLV.pcf: line 27, column 24
    function value_4 () : java.lang.String {
      return Row.DisplayName
    }
    
    property get Row () : gw.api.tools.PickerRow {
      return getIteratedValue(1) as gw.api.tools.PickerRow
    }
    
    
  }
  
  
}