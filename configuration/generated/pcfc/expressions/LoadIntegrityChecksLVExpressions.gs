package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadIntegrityChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadIntegrityChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=icexecuteorder) at LoadIntegrityChecksLV.pcf: line 30, column 29
    function valueRoot_11 () : java.lang.Object {
      return IntegrityCheck
    }
    
    // 'value' attribute on TextCell (id=icchekctest) at LoadIntegrityChecksLV.pcf: line 57, column 29
    function valueRoot_23 () : java.lang.Object {
      return IntegrityCheck.LoadIntegrityCheckType
    }
    
    // 'value' attribute on TextCell (id=icstagingtablename) at LoadIntegrityChecksLV.pcf: line 23, column 59
    function valueRoot_8 () : java.lang.Object {
      return IntegrityCheck.LoadOperation
    }
    
    // 'value' attribute on TextCell (id=icstarttime) at LoadIntegrityChecksLV.pcf: line 35, column 115
    function value_12 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(IntegrityCheck.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=icendtime) at LoadIntegrityChecksLV.pcf: line 40, column 113
    function value_14 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(IntegrityCheck.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=ThreadNameID) at LoadIntegrityChecksLV.pcf: line 45, column 46
    function value_16 () : java.lang.String {
      return IntegrityCheck.ThreadName
    }
    
    // 'value' attribute on TextCell (id=icduration) at LoadIntegrityChecksLV.pcf: line 51, column 29
    function value_19 () : java.lang.String {
      return PageHelper.getDurationString(IntegrityCheck.StartTime, IntegrityCheck.EndTime)
    }
    
    // 'value' attribute on TextCell (id=icchekctest) at LoadIntegrityChecksLV.pcf: line 57, column 29
    function value_21 () : java.lang.String {
      return IntegrityCheck.LoadIntegrityCheckType.DisplayName
    }
    
    // 'value' attribute on TextAreaCell (id=icquery) at LoadIntegrityChecksLV.pcf: line 64, column 41
    function value_24 () : java.lang.String {
      return IntegrityCheck.Query
    }
    
    // 'value' attribute on TextAreaCell (id=icdescription) at LoadIntegrityChecksLV.pcf: line 70, column 47
    function value_27 () : java.lang.String {
      return IntegrityCheck.Description
    }
    
    // 'value' attribute on TextCell (id=icstagingtablename) at LoadIntegrityChecksLV.pcf: line 23, column 59
    function value_6 () : java.lang.String {
      return IntegrityCheck.LoadOperation.TableName
    }
    
    // 'value' attribute on TextCell (id=icexecuteorder) at LoadIntegrityChecksLV.pcf: line 30, column 29
    function value_9 () : java.lang.Integer {
      return IntegrityCheck.ExecutionOrder
    }
    
    property get IntegrityCheck () : entity.LoadIntegrityCheck {
      return getIteratedValue(1) as entity.LoadIntegrityCheck
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 23, column 59
    function sortValue_0 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.LoadOperation.TableName
    }
    
    // 'value' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 30, column 29
    function sortValue_1 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.ExecutionOrder
    }
    
    // 'sortBy' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 35, column 115
    function sortValue_2 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 40, column 113
    function sortValue_3 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.EndTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 45, column 46
    function sortValue_4 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.ThreadName
    }
    
    // 'sortBy' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 57, column 29
    function sortValue_5 (IntegrityCheck :  entity.LoadIntegrityCheck) : java.lang.Object {
      return IntegrityCheck.LoadIntegrityCheckType
    }
    
    // 'value' attribute on RowIterator at LoadIntegrityChecksLV.pcf: line 17, column 85
    function value_30 () : gw.api.database.IQueryBeanResult<entity.LoadIntegrityCheck> {
      return IntegrityChecks
    }
    
    property get IntegrityChecks () : gw.api.database.IQueryBeanResult<LoadIntegrityCheck> {
      return getRequireValue("IntegrityChecks", 0) as gw.api.database.IQueryBeanResult<LoadIntegrityCheck>
    }
    
    property set IntegrityChecks ($arg :  gw.api.database.IQueryBeanResult<LoadIntegrityCheck>) {
      setRequireValue("IntegrityChecks", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}