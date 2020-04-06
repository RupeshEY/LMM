package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadHistoryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadHistoryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=download) at LoadHistoryLV.pcf: line 33, column 36
    function action_3 () : void {
      PageHelper.download(History)
    }
    
    // 'action' attribute on Link (id=ViewHistory) at LoadHistoryLV.pcf: line 43, column 36
    function action_5 () : void {
      LoadHistoryDetail.drilldown(PageHelper, History)
    }
    
    // 'action' attribute on Link (id=delete) at LoadHistoryLV.pcf: line 56, column 36
    function action_8 () : void {
      PageHelper.delete(History)
    }
    
    // 'action' attribute on Link (id=ViewHistory) at LoadHistoryLV.pcf: line 43, column 36
    function action_dest_6 () : pcf.api.Destination {
      return pcf.LoadHistoryDetail.createDestination(PageHelper, History)
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at LoadHistoryLV.pcf: line 107, column 40
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      History.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=LVOperationType) at LoadHistoryLV.pcf: line 64, column 24
    function valueRoot_11 () : java.lang.Object {
      return History.CommandType
    }
    
    // 'value' attribute on DateCell (id=LVStartTime) at LoadHistoryLV.pcf: line 74, column 24
    function valueRoot_14 () : java.lang.Object {
      return History
    }
    
    // 'value' attribute on TextCell (id=LVCallingUser) at LoadHistoryLV.pcf: line 101, column 24
    function valueRoot_25 () : java.lang.Object {
      return History.CallingUser
    }
    
    // 'value' attribute on DateCell (id=LVStartTime) at LoadHistoryLV.pcf: line 74, column 24
    function value_12 () : java.util.Date {
      return History.StartTime
    }
    
    // 'value' attribute on DateCell (id=LVEndTime) at LoadHistoryLV.pcf: line 82, column 24
    function value_15 () : java.util.Date {
      return History.EndTime
    }
    
    // 'value' attribute on TextCell (id=LVDuration) at LoadHistoryLV.pcf: line 89, column 24
    function value_18 () : java.lang.String {
      return PageHelper.getDurationString(History.StartTime, History.EndTime)
    }
    
    // 'value' attribute on TextCell (id=lverrorcount) at LoadHistoryLV.pcf: line 95, column 23
    function value_20 () : java.lang.Integer {
      return History.ErrorCount
    }
    
    // 'value' attribute on TextCell (id=LVCallingUser) at LoadHistoryLV.pcf: line 101, column 24
    function value_23 () : java.lang.String {
      return History.CallingUser.DisplayName
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at LoadHistoryLV.pcf: line 107, column 40
    function value_26 () : java.lang.String {
      return History.Description
    }
    
    // 'value' attribute on TextCell (id=LVOperationType) at LoadHistoryLV.pcf: line 64, column 24
    function value_9 () : java.lang.String {
      return History.CommandType.DisplayName
    }
    
    // 'visible' attribute on Link (id=download) at LoadHistoryLV.pcf: line 33, column 36
    function visible_2 () : java.lang.Boolean {
      return ShowButtons
    }
    
    property get History () : entity.LoadCommand {
      return getIteratedValue(1) as entity.LoadCommand
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at LoadHistoryLV.pcf: line 74, column 24
    function sortValue_0 (History :  entity.LoadCommand) : java.lang.Object {
      return History.StartTime
    }
    
    // 'value' attribute on RowIterator at LoadHistoryLV.pcf: line 95, column 23
    function sortValue_1 (History :  entity.LoadCommand) : java.lang.Object {
      return History.ErrorCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryLV.pcf: line 20, column 78
    function value_30 () : gw.api.database.IQueryBeanResult<entity.LoadCommand> {
      return Histories
    }
    
    property get Histories () : gw.api.database.IQueryBeanResult<LoadCommand> {
      return getRequireValue("Histories", 0) as gw.api.database.IQueryBeanResult<LoadCommand>
    }
    
    property set Histories ($arg :  gw.api.database.IQueryBeanResult<LoadCommand>) {
      setRequireValue("Histories", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    property get ShowButtons () : Boolean {
      return getRequireValue("ShowButtons", 0) as Boolean
    }
    
    property set ShowButtons ($arg :  Boolean) {
      setRequireValue("ShowButtons", 0, $arg)
    }
    
    
  }
  
  
}