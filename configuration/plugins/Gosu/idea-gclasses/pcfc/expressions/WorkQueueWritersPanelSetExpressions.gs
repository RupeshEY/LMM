package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueWritersPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkQueueWritersPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=ExecutionTime) at WorkQueueWritersPanelSet.pcf: line 73, column 52
    function outputConversion_22 (VALUE :  gw.api.web.tools.Duration) : java.lang.String {
      return VALUE.getDisplayString()
    }
    
    // 'value' attribute on TextCell (id=ProcessId) at WorkQueueWritersPanelSet.pcf: line 36, column 53
    function valueRoot_5 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on BooleanRadioCell (id=WasScheduled) at WorkQueueWritersPanelSet.pcf: line 53, column 37
    function value_12 () : java.lang.Boolean {
      return item.Scheduled
    }
    
    // 'value' attribute on TextCell (id=NumberOfItems) at WorkQueueWritersPanelSet.pcf: line 59, column 44
    function value_15 () : java.lang.Integer {
      return item.NumberOfItems
    }
    
    // 'value' attribute on DateCell (id=LastWorkerEndTime) at WorkQueueWritersPanelSet.pcf: line 66, column 44
    function value_18 () : java.util.Date {
      return item.MaxWorkerEndTime
    }
    
    // 'value' attribute on TextCell (id=ExecutionTime) at WorkQueueWritersPanelSet.pcf: line 73, column 52
    function value_21 () : gw.api.web.tools.Duration {
      return item.ExecutionTime
    }
    
    // 'value' attribute on TextCell (id=AvailableCount) at WorkQueueWritersPanelSet.pcf: line 79, column 44
    function value_25 () : java.lang.Integer {
      return item.AvailableCount
    }
    
    // 'value' attribute on TextCell (id=CheckedOutCount) at WorkQueueWritersPanelSet.pcf: line 85, column 44
    function value_28 () : java.lang.Integer {
      return item.CheckedOutCount
    }
    
    // 'value' attribute on TextCell (id=ProcessId) at WorkQueueWritersPanelSet.pcf: line 36, column 53
    function value_3 () : gw.pl.persistence.core.Key {
      return item.ProcessId
    }
    
    // 'value' attribute on TextCell (id=SucceededItemCount) at WorkQueueWritersPanelSet.pcf: line 91, column 44
    function value_31 () : java.lang.Integer {
      return item.SucceededCount
    }
    
    // 'value' attribute on TextCell (id=FailedCount) at WorkQueueWritersPanelSet.pcf: line 97, column 44
    function value_34 () : java.lang.Integer {
      return item.FailedCount
    }
    
    // 'value' attribute on DateCell (id=CreationTime) at WorkQueueWritersPanelSet.pcf: line 43, column 40
    function value_6 () : java.util.Date {
      return item.CreationTime
    }
    
    // 'value' attribute on TextCell (id=ServerId) at WorkQueueWritersPanelSet.pcf: line 48, column 36
    function value_9 () : java.lang.String {
      return item.ServerId
    }
    
    property get item () : gw.api.web.tools.WorkItemDisplayInfo {
      return getIteratedValue(1) as gw.api.web.tools.WorkItemDisplayInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueWritersPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueWritersPanelSet.pcf: line 17, column 54
    function initialValue_0 () : gw.api.web.tools.WorkItemDisplayInfo[] {
      return Page.getWorkItemByWriterForQueue(Queue)
    }
    
    // 'label' attribute on Verbatim at WorkQueueWritersPanelSet.pcf: line 21, column 47
    function label_2 () : java.lang.String {
      return getMaxNumberOfRecordsShownText()
    }
    
    // 'value' attribute on RowIterator at WorkQueueWritersPanelSet.pcf: line 29, column 60
    function value_37 () : gw.api.web.tools.WorkItemDisplayInfo[] {
      return Writers
    }
    
    // 'visible' attribute on Verbatim at WorkQueueWritersPanelSet.pcf: line 21, column 47
    function visible_1 () : java.lang.Boolean {
      return isMaximumNumberOfRunsShown()
    }
    
    property get Page () : gw.api.web.tools.WorkQueueInfoPage {
      return getRequireValue("Page", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setRequireValue("Page", 0, $arg)
    }
    
    property get Queue () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getRequireValue("Queue", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set Queue ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setRequireValue("Queue", 0, $arg)
    }
    
    property get Writers () : gw.api.web.tools.WorkItemDisplayInfo[] {
      return getVariableValue("Writers", 0) as gw.api.web.tools.WorkItemDisplayInfo[]
    }
    
    property set Writers ($arg :  gw.api.web.tools.WorkItemDisplayInfo[]) {
      setVariableValue("Writers", 0, $arg)
    }
    
    function isMaximumNumberOfRunsShown() : boolean {
      if (Writers == null) {
        return false
      }
      return Writers.Count == Page.MaxSizeOfWriterRunsArray
    }
    
    function getMaxNumberOfRecordsShownText() : String {
      if (Writers == null) {
        return ""
      }
      return DisplayKey.get("Web.InternalTools.WorkQueueInfo.OnlyLastNRecordsAreShown", Writers.Count)
    }
    
    
  }
  
  
}