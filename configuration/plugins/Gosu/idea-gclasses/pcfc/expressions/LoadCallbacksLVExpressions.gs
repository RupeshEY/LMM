package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadCallbacksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadCallbacksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=callbackname) at LoadCallbacksLV.pcf: line 35, column 38
    function action_12 () : void {
      LoadCallbackResultsDetail.drilldown(PageHelper, History, LoadCallback)
    }
    
    // 'action' attribute on TextCell (id=callbackname) at LoadCallbacksLV.pcf: line 35, column 38
    function action_dest_13 () : pcf.api.Destination {
      return pcf.LoadCallbackResultsDetail.createDestination(PageHelper, History, LoadCallback)
    }
    
    // 'available' attribute on TextCell (id=callbackname) at LoadCallbacksLV.pcf: line 35, column 38
    function available_9 () : java.lang.Boolean {
      return ResultsCount > 0 and ShowLinksAndCounts
    }
    
    // 'initialValue' attribute on Variable at LoadCallbacksLV.pcf: line 28, column 34
    function initialValue_8 () : java.lang.Double {
      return LoadCallback.CallbackResults.length
    }
    
    // RowIterator at LoadCallbacksLV.pcf: line 24, column 41
    function initializeVariables_34 () : void {
        ResultsCount = LoadCallback.CallbackResults.length;

    }
    
    // 'value' attribute on TextCell (id=callbackname) at LoadCallbacksLV.pcf: line 35, column 38
    function valueRoot_15 () : java.lang.Object {
      return LoadCallback
    }
    
    // 'value' attribute on TextCell (id=callbackname) at LoadCallbacksLV.pcf: line 35, column 38
    function value_10 () : java.lang.String {
      return LoadCallback.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=callbacktimetype) at LoadCallbacksLV.pcf: line 41, column 29
    function value_16 () : typekey.LoaderCallbackTimeType {
      return LoadCallback.ExecutionTime
    }
    
    // 'value' attribute on TextCell (id=callbackexecuteorder) at LoadCallbacksLV.pcf: line 48, column 29
    function value_19 () : java.lang.Integer {
      return LoadCallback.ExecutionOrder
    }
    
    // 'value' attribute on TextCell (id=callbackstarttime) at LoadCallbacksLV.pcf: line 53, column 113
    function value_22 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(LoadCallback.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=callbackendtime) at LoadCallbacksLV.pcf: line 58, column 111
    function value_24 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(LoadCallback.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=callbackduration) at LoadCallbacksLV.pcf: line 64, column 29
    function value_26 () : java.lang.String {
      return PageHelper.getDurationString(LoadCallback.StartTime, LoadCallback.EndTime)
    }
    
    // 'value' attribute on TextCell (id=callbackdescription) at LoadCallbacksLV.pcf: line 68, column 45
    function value_28 () : java.lang.String {
      return LoadCallback.Description
    }
    
    // 'value' attribute on TextCell (id=loadresultscount) at LoadCallbacksLV.pcf: line 76, column 29
    function value_32 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(ResultsCount, "####0")
    }
    
    // 'visible' attribute on TextCell (id=loadresultscount) at LoadCallbacksLV.pcf: line 76, column 29
    function visible_31 () : java.lang.Boolean {
      return ShowLinksAndCounts
    }
    
    property get LoadCallback () : entity.LoadCallback {
      return getIteratedValue(1) as entity.LoadCallback
    }
    
    property get ResultsCount () : java.lang.Double {
      return getVariableValue("ResultsCount", 1) as java.lang.Double
    }
    
    property set ResultsCount ($arg :  java.lang.Double) {
      setVariableValue("ResultsCount", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadCallbacksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadCallbacksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 35, column 38
    function sortValue_0 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.Name
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 41, column 29
    function sortValue_1 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.ExecutionTime
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 48, column 29
    function sortValue_2 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.ExecutionOrder
    }
    
    // 'sortBy' attribute on RowIterator at LoadCallbacksLV.pcf: line 53, column 113
    function sortValue_3 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadCallbacksLV.pcf: line 58, column 111
    function sortValue_4 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.EndTime
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 64, column 29
    function sortValue_5 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return PageHelper.getDurationString(LoadCallback.StartTime, LoadCallback.EndTime)
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 68, column 45
    function sortValue_6 (LoadCallback :  entity.LoadCallback) : java.lang.Object {
      return LoadCallback.Description
    }
    
    // 'value' attribute on RowIterator at LoadCallbacksLV.pcf: line 24, column 41
    function value_35 () : entity.LoadCallback[] {
      return LoadCallbacks
    }
    
    // 'visible' attribute on RowIterator at LoadCallbacksLV.pcf: line 76, column 29
    function visible_7 () : java.lang.Boolean {
      return ShowLinksAndCounts
    }
    
    property get History () : LoadCommand {
      return getRequireValue("History", 0) as LoadCommand
    }
    
    property set History ($arg :  LoadCommand) {
      setRequireValue("History", 0, $arg)
    }
    
    property get LoadCallbacks () : LoadCallback[] {
      return getRequireValue("LoadCallbacks", 0) as LoadCallback[]
    }
    
    property set LoadCallbacks ($arg :  LoadCallback[]) {
      setRequireValue("LoadCallbacks", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    property get ShowLinksAndCounts () : boolean {
      return getRequireValue("ShowLinksAndCounts", 0) as java.lang.Boolean
    }
    
    property set ShowLinksAndCounts ($arg :  boolean) {
      setRequireValue("ShowLinksAndCounts", 0, $arg)
    }
    
    
  }
  
  
}