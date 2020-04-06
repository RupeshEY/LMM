package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadCallbackResultsDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadCallbackResultsDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=name) at LoadCallbackResultsDetail.pcf: line 54, column 38
    function valueRoot_12 () : java.lang.Object {
      return Result
    }
    
    // 'value' attribute on TextCell (id=name) at LoadCallbackResultsDetail.pcf: line 54, column 38
    function value_10 () : java.lang.String {
      return Result.Name
    }
    
    // 'value' attribute on TextCell (id=executionorder) at LoadCallbackResultsDetail.pcf: line 60, column 48
    function value_13 () : java.lang.Integer {
      return Result.ExecutionOrder
    }
    
    // 'value' attribute on TextCell (id=opstarttime) at LoadCallbackResultsDetail.pcf: line 65, column 113
    function value_16 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Result.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=opendtime) at LoadCallbackResultsDetail.pcf: line 70, column 111
    function value_18 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Result.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=opduration) at LoadCallbackResultsDetail.pcf: line 75, column 89
    function value_20 () : java.lang.String {
      return PageHelper.getDurationString(Result.StartTime, Result.EndTime)
    }
    
    // 'value' attribute on TextCell (id=affectedrowcount) at LoadCallbackResultsDetail.pcf: line 80, column 48
    function value_22 () : java.lang.Integer {
      return Result.AffectedRowCount
    }
    
    // 'value' attribute on TextAreaCell (id=lcrquery) at LoadCallbackResultsDetail.pcf: line 87, column 41
    function value_25 () : java.lang.String {
      return Result.SQLText
    }
    
    property get Result () : entity.LoadCallbackResult {
      return getIteratedValue(1) as entity.LoadCallbackResult
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadCallbackResultsDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand, Callback :  LoadCallback) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at LoadCallbackResultsDetail.pcf: line 30, column 63
    function action_0 () : void {
      
    }
    
    // 'def' attribute on PanelRef at LoadCallbackResultsDetail.pcf: line 33, column 90
    function def_onEnter_1 (def :  pcf.LoadHistoryLV) : void {
      def.onEnter(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadCallbackResultsDetail.pcf: line 37, column 90
    function def_onEnter_3 (def :  pcf.LoadCallbacksLV) : void {
      def.onEnter(PageHelper, History, new LoadCallback[] {Callback}, false)
    }
    
    // 'def' attribute on PanelRef at LoadCallbackResultsDetail.pcf: line 33, column 90
    function def_refreshVariables_2 (def :  pcf.LoadHistoryLV) : void {
      def.refreshVariables(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadCallbackResultsDetail.pcf: line 37, column 90
    function def_refreshVariables_4 (def :  pcf.LoadCallbacksLV) : void {
      def.refreshVariables(PageHelper, History, new LoadCallback[] {Callback}, false)
    }
    
    // 'parent' attribute on Page (id=LoadCallbackResultsDetail) at LoadCallbackResultsDetail.pcf: line 9, column 93
    static function parent_29 (Callback :  LoadCallback, History :  LoadCommand, PageHelper :  gw.api.tools.LoadHistoryHelper) : pcf.api.Destination {
      return pcf.LoadHistoryDetail.createDestination(PageHelper, History)
    }
    
    // 'value' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 54, column 38
    function sortValue_5 (Result :  entity.LoadCallbackResult) : java.lang.Object {
      return Result.Name
    }
    
    // 'sortBy' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 60, column 48
    function sortValue_6 (Result :  entity.LoadCallbackResult) : java.lang.Object {
      return Result.ExecutionOrder
    }
    
    // 'sortBy' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 65, column 113
    function sortValue_7 (Result :  entity.LoadCallbackResult) : java.lang.Object {
      return Result.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 70, column 111
    function sortValue_8 (Result :  entity.LoadCallbackResult) : java.lang.Object {
      return Result.EndTime
    }
    
    // 'value' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 80, column 48
    function sortValue_9 (Result :  entity.LoadCallbackResult) : java.lang.Object {
      return Result.AffectedRowCount
    }
    
    // 'value' attribute on RowIterator at LoadCallbackResultsDetail.pcf: line 49, column 91
    function value_28 () : gw.api.database.IQueryBeanResult<entity.LoadCallbackResult> {
      return gw.api.database.Query.make(LoadCallbackResult).compare("LoadCallback", Equals, Callback).select()
    }
    
    property get Callback () : LoadCallback {
      return getVariableValue("Callback", 0) as LoadCallback
    }
    
    property set Callback ($arg :  LoadCallback) {
      setVariableValue("Callback", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.LoadCallbackResultsDetail {
      return super.CurrentLocation as pcf.LoadCallbackResultsDetail
    }
    
    property get History () : LoadCommand {
      return getVariableValue("History", 0) as LoadCommand
    }
    
    property set History ($arg :  LoadCommand) {
      setVariableValue("History", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}