package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadInsertSelectsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadInsertSelectsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=insertexecuteorder) at LoadInsertSelectsLV.pcf: line 29, column 29
    function valueRoot_10 () : java.lang.Object {
      return Insert
    }
    
    // 'value' attribute on TextCell (id=insertstagingtablename) at LoadInsertSelectsLV.pcf: line 23, column 51
    function valueRoot_7 () : java.lang.Object {
      return Insert.LoadOperation
    }
    
    // 'value' attribute on TextCell (id=insertstarttime) at LoadInsertSelectsLV.pcf: line 34, column 107
    function value_11 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Insert.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=insertendtime) at LoadInsertSelectsLV.pcf: line 39, column 105
    function value_13 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Insert.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=insertduration) at LoadInsertSelectsLV.pcf: line 46, column 29
    function value_15 () : java.lang.String {
      return PageHelper.getDurationString(Insert.StartTime, Insert.EndTime)
    }
    
    // 'value' attribute on TextCell (id=affectedrowcount) at LoadInsertSelectsLV.pcf: line 51, column 39
    function value_17 () : java.lang.Long {
      return Insert.AffectedRowCount
    }
    
    // 'value' attribute on TextAreaCell (id=insertquery) at LoadInsertSelectsLV.pcf: line 58, column 33
    function value_20 () : java.lang.String {
      return Insert.Query
    }
    
    // 'value' attribute on TextCell (id=insertstagingtablename) at LoadInsertSelectsLV.pcf: line 23, column 51
    function value_5 () : java.lang.String {
      return Insert.LoadOperation.TableName
    }
    
    // 'value' attribute on TextCell (id=insertexecuteorder) at LoadInsertSelectsLV.pcf: line 29, column 29
    function value_8 () : java.lang.Integer {
      return Insert.ExecutionOrder
    }
    
    property get Insert () : entity.LoadInsertSelect {
      return getIteratedValue(1) as entity.LoadInsertSelect
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadInsertSelectsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadInsertSelectsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 23, column 51
    function sortValue_0 (Insert :  entity.LoadInsertSelect) : java.lang.Object {
      return Insert.LoadOperation.TableName
    }
    
    // 'value' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 29, column 29
    function sortValue_1 (Insert :  entity.LoadInsertSelect) : java.lang.Object {
      return Insert.ExecutionOrder
    }
    
    // 'sortBy' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 34, column 107
    function sortValue_2 (Insert :  entity.LoadInsertSelect) : java.lang.Object {
      return Insert.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 39, column 105
    function sortValue_3 (Insert :  entity.LoadInsertSelect) : java.lang.Object {
      return Insert.EndTime
    }
    
    // 'value' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 51, column 39
    function sortValue_4 (Insert :  entity.LoadInsertSelect) : java.lang.Object {
      return Insert.AffectedRowCount
    }
    
    // 'value' attribute on RowIterator at LoadInsertSelectsLV.pcf: line 17, column 83
    function value_23 () : gw.api.database.IQueryBeanResult<entity.LoadInsertSelect> {
      return InsertSelects
    }
    
    property get InsertSelects () : gw.api.database.IQueryBeanResult<LoadInsertSelect> {
      return getRequireValue("InsertSelects", 0) as gw.api.database.IQueryBeanResult<LoadInsertSelect>
    }
    
    property set InsertSelects ($arg :  gw.api.database.IQueryBeanResult<LoadInsertSelect>) {
      setRequireValue("InsertSelects", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}