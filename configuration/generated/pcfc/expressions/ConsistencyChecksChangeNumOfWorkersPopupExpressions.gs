package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConsistencyChecksChangeNumOfWorkersPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecksChangeNumOfWorkersPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (CCPageHelper :  gw.api.tools.ConsistencyChecksRunsPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 35, column 92
    function action_3 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=FinishButton) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 39, column 62
    function action_4 () : void {
      CurrentLocation.cancel()
    }
    
    // 'value' attribute on TextInput (id=DesiredNumThreads) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 65, column 43
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      DesiredNumThreads = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'initialValue' attribute on Variable at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 20, column 104
    function initialValue_0 () : java.util.List<gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo> {
      return CCPageHelper.getWorkQueueExecutors(false)
    }
    
    // 'initialValue' attribute on Variable at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 25, column 19
    function initialValue_1 () : int {
      return CCPageHelper.calcNumberOfThreads(WorkQueueExecutors)
    }
    
    // 'initialValue' attribute on Variable at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 29, column 19
    function initialValue_2 () : int {
      return ActualNumThreads
    }
    
    // 'label' attribute on AlertBar (id=OneServerAlert) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 50, column 139
    function label_7 () : java.lang.Object {
      return DisplayKey.get("Web.InternalTools.DBConsistCheckRun.NumberOfWorkers.OneServer", BatchProcessType.TC_DBCONSISTENCYCHECK)
    }
    
    // 'onChange' attribute on PostOnChange at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 67, column 85
    function onChange_10 () : void {
      CCPageHelper.setDesiredNumberOfThreads(DesiredNumThreads)
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=DesiredNumThreads) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 65, column 43
    function requestValidationExpression_12 (VALUE :  java.lang.Integer) : java.lang.Object {
      return VALUE > 0 ? null : DisplayKey.get("Validator.PositiveInteger", VALUE)
    }
    
    // 'sortBy' attribute on IteratorSort at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 81, column 28
    function sortBy_15 (Executor :  gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo) : java.lang.Object {
      return Executor.NumWorkers
    }
    
    // 'sortBy' attribute on IteratorSort at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 84, column 28
    function sortBy_16 (Executor :  gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo) : java.lang.Object {
      return Executor.ServerId
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 89, column 42
    function sortValue_17 (Executor :  gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo) : java.lang.Object {
      return Executor.ServerId
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 95, column 28
    function sortValue_18 (Executor :  gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo) : java.lang.Object {
      return Executor.NumWorkers
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 99, column 217
    function sortValue_19 (Executor :  gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo) : java.lang.Object {
      return Executor.InCluster ? DisplayKey.get("Web.InternalTools.DBConsistCheckRun.ExecutorActive.Yes") : DisplayKey.get("Web.InternalTools.DBConsistCheckRun.ExecutorActive.Unknown")
    }
    
    // 'value' attribute on TextInput (id=DesiredNumThreads) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 65, column 43
    function value_11 () : java.lang.Integer {
      return DesiredNumThreads
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 77, column 112
    function value_28 () : java.util.List<gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo> {
      return WorkQueueExecutors
    }
    
    // 'value' attribute on TextInput (id=ActualNumThreads) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 57, column 44
    function value_8 () : java.lang.Integer {
      return ActualNumThreads
    }
    
    // 'visible' attribute on AlertBar (id=InProgressAlert) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 45, column 58
    function visible_5 () : java.lang.Boolean {
      return DesiredNumThreads != ActualNumThreads
    }
    
    // 'visible' attribute on AlertBar (id=OneServerAlert) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 50, column 139
    function visible_6 () : java.lang.Boolean {
      return DesiredNumThreads == ActualNumThreads and CCPageHelper.isOnlyOneServerInClusterProcessingWorkQueue(WorkQueueExecutors)
    }
    
    property get ActualNumThreads () : int {
      return getVariableValue("ActualNumThreads", 0) as java.lang.Integer
    }
    
    property set ActualNumThreads ($arg :  int) {
      setVariableValue("ActualNumThreads", 0, $arg)
    }
    
    property get CCPageHelper () : gw.api.tools.ConsistencyChecksRunsPageHelper {
      return getVariableValue("CCPageHelper", 0) as gw.api.tools.ConsistencyChecksRunsPageHelper
    }
    
    property set CCPageHelper ($arg :  gw.api.tools.ConsistencyChecksRunsPageHelper) {
      setVariableValue("CCPageHelper", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ConsistencyChecksChangeNumOfWorkersPopup {
      return super.CurrentLocation as pcf.ConsistencyChecksChangeNumOfWorkersPopup
    }
    
    property get DesiredNumThreads () : int {
      return getVariableValue("DesiredNumThreads", 0) as java.lang.Integer
    }
    
    property set DesiredNumThreads ($arg :  int) {
      setVariableValue("DesiredNumThreads", 0, $arg)
    }
    
    property get WorkQueueExecutors () : java.util.List<gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo> {
      return getVariableValue("WorkQueueExecutors", 0) as java.util.List<gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo>
    }
    
    property set WorkQueueExecutors ($arg :  java.util.List<gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo>) {
      setVariableValue("WorkQueueExecutors", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ConsistencyChecksChangeNumOfWorkersPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ServerId) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 89, column 42
    function valueRoot_22 () : java.lang.Object {
      return Executor
    }
    
    // 'value' attribute on TextCell (id=ServerId) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 89, column 42
    function value_20 () : java.lang.String {
      return Executor.ServerId
    }
    
    // 'value' attribute on TextCell (id=NumWorkers) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 95, column 28
    function value_23 () : java.lang.Integer {
      return Executor.NumWorkers
    }
    
    // 'value' attribute on TextCell (id=Active) at ConsistencyChecksChangeNumOfWorkersPopup.pcf: line 99, column 217
    function value_26 () : java.lang.String {
      return Executor.InCluster ? DisplayKey.get("Web.InternalTools.DBConsistCheckRun.ExecutorActive.Yes") : DisplayKey.get("Web.InternalTools.DBConsistCheckRun.ExecutorActive.Unknown")
    }
    
    property get Executor () : gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo {
      return getIteratedValue(1) as gw.api.tools.ConsistencyChecksRunsPageHelper.WorkQueueExecutorInfo
    }
    
    
  }
  
  
}