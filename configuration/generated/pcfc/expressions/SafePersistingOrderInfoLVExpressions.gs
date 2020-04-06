package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SafePersistingOrderInfoLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SafePersistingOrderInfoLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=order) at SafePersistingOrderInfoLV.pcf: line 29, column 42
    function valueRoot_8 () : java.lang.Object {
      return pair
    }
    
    // 'value' attribute on TextCell (id=Table) at SafePersistingOrderInfoLV.pcf: line 37, column 35
    function value_12 () : java.lang.String {
      return pair.TableName
    }
    
    // 'value' attribute on BooleanRadioCell (id=PreUpdateRules) at SafePersistingOrderInfoLV.pcf: line 41, column 34
    function value_15 () : java.lang.Boolean {
      return pair.HasRules
    }
    
    // 'value' attribute on TextCell (id=order) at SafePersistingOrderInfoLV.pcf: line 29, column 42
    function value_6 () : java.lang.Integer {
      return pair.Order
    }
    
    // 'value' attribute on TextCell (id=Name) at SafePersistingOrderInfoLV.pcf: line 33, column 36
    function value_9 () : java.lang.String {
      return pair.EntityName
    }
    
    property get pair () : gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData {
      return getIteratedValue(1) as gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SafePersistingOrderInfoLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at SafePersistingOrderInfoLV.pcf: line 20, column 33
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.tools.SafePersistingOrderInfoHelper.AllEntities()
    }
    
    // 'filter' attribute on ToolbarFilterOption at SafePersistingOrderInfoLV.pcf: line 22, column 84
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.tools.SafePersistingOrderInfoHelper.WithRulesOnly()
    }
    
    // 'value' attribute on RowIterator at SafePersistingOrderInfoLV.pcf: line 29, column 42
    function sortValue_2 (pair :  gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData) : java.lang.Object {
      return pair.Order
    }
    
    // 'value' attribute on RowIterator at SafePersistingOrderInfoLV.pcf: line 33, column 36
    function sortValue_3 (pair :  gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData) : java.lang.Object {
      return pair.EntityName
    }
    
    // 'value' attribute on RowIterator at SafePersistingOrderInfoLV.pcf: line 37, column 35
    function sortValue_4 (pair :  gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData) : java.lang.Object {
      return pair.TableName
    }
    
    // 'value' attribute on RowIterator at SafePersistingOrderInfoLV.pcf: line 41, column 34
    function sortValue_5 (pair :  gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData) : java.lang.Object {
      return pair.HasRules
    }
    
    // 'value' attribute on RowIterator at SafePersistingOrderInfoLV.pcf: line 15, column 108
    function value_18 () : java.util.List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData> {
      return safePersistingOrderTables
    }
    
    property get safePersistingOrderTables () : List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData> {
      return getRequireValue("safePersistingOrderTables", 0) as List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>
    }
    
    property set safePersistingOrderTables ($arg :  List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>) {
      setRequireValue("safePersistingOrderTables", 0, $arg)
    }
    
    
  }
  
  
}