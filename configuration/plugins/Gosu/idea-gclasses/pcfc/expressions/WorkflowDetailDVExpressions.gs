package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends WorkflowDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Subject) at WorkflowDetailDV.pcf: line 149, column 43
    function valueRoot_67 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextCell (id=Subject) at WorkflowDetailDV.pcf: line 149, column 43
    function value_65 () : java.lang.String {
      return Activity.Subject
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at WorkflowDetailDV.pcf: line 155, column 58
    function value_68 () : java.lang.Boolean {
      return Activity.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at WorkflowDetailDV.pcf: line 161, column 43
    function value_71 () : java.lang.Boolean {
      return Activity.Overdue
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at WorkflowDetailDV.pcf: line 166, column 53
    function value_74 () : typekey.ActivityStatus {
      return Activity.Status
    }
    
    // 'value' attribute on DateCell (id=TargetDate) at WorkflowDetailDV.pcf: line 170, column 46
    function value_77 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at WorkflowDetailDV.pcf: line 175, column 47
    function value_80 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at WorkflowDetailDV.pcf: line 180, column 42
    function value_83 () : entity.User {
      return Activity.AssignedUser
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends WorkflowDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Summary) at WorkflowDetailDV.pcf: line 210, column 51
    function action_94 () : void {
      WorkflowLogEntryDetail.go(Workflow, LogEntry as WorkflowTextLog)
    }
    
    // 'action' attribute on TextCell (id=Summary) at WorkflowDetailDV.pcf: line 210, column 51
    function action_dest_95 () : pcf.api.Destination {
      return pcf.WorkflowLogEntryDetail.createDestination(Workflow, LogEntry as WorkflowTextLog)
    }
    
    // 'available' attribute on TextCell (id=Summary) at WorkflowDetailDV.pcf: line 210, column 51
    function available_91 () : java.lang.Boolean {
      return LogEntry typeis WorkflowTextLog
    }
    
    // 'value' attribute on TextCell (id=Summary) at WorkflowDetailDV.pcf: line 210, column 51
    function valueRoot_97 () : java.lang.Object {
      return LogEntry
    }
    
    // 'value' attribute on TextCell (id=LogDate) at WorkflowDetailDV.pcf: line 203, column 111
    function value_89 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(LogEntry.LogDate, "MM/dd/yyyy HH:mm:ss")
    }
    
    // 'value' attribute on TextCell (id=Summary) at WorkflowDetailDV.pcf: line 210, column 51
    function value_92 () : java.lang.String {
      return LogEntry.LocalizeMessage
    }
    
    property get LogEntry () : entity.WorkflowLogEntry {
      return getIteratedValue(1) as entity.WorkflowLogEntry
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkflowDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=CreationTime) at WorkflowDetailDV.pcf: line 100, column 44
    function valueRoot_43 () : java.lang.Object {
      return Item
    }
    
    // 'value' attribute on DateCell (id=CreationTime) at WorkflowDetailDV.pcf: line 100, column 44
    function value_41 () : java.util.Date {
      return Item.CreationTime
    }
    
    // 'value' attribute on DateCell (id=LastUndateTime) at WorkflowDetailDV.pcf: line 106, column 46
    function value_44 () : java.util.Date {
      return Item.LastUpdateTime
    }
    
    // 'value' attribute on DateCell (id=AvailableAtTime) at WorkflowDetailDV.pcf: line 113, column 52
    function value_47 () : java.util.Date {
      return Item.AvailableSinceAsDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at WorkflowDetailDV.pcf: line 118, column 57
    function value_50 () : typekey.WorkItemStatusType {
      return Item.Status
    }
    
    // 'value' attribute on TextCell (id=CheckedOutBy) at WorkflowDetailDV.pcf: line 122, column 44
    function value_53 () : java.lang.String {
      return Item.CheckedOutBy
    }
    
    // 'value' attribute on TextCell (id=NumRetries) at WorkflowDetailDV.pcf: line 128, column 48
    function value_56 () : java.lang.Integer {
      return Item.NumRetries
    }
    
    property get Item () : entity.WorkflowWorkItem {
      return getIteratedValue(1) as entity.WorkflowWorkItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=Parent) at WorkflowDetailDV.pcf: line 40, column 46
    function action_13 () : void {
      WorkflowDetail.go(Workflow.Caller)
    }
    
    // 'action' attribute on TextInput (id=Parent) at WorkflowDetailDV.pcf: line 40, column 46
    function action_dest_14 () : pcf.api.Destination {
      return pcf.WorkflowDetail.createDestination(Workflow.Caller)
    }
    
    // 'initialValue' attribute on Variable at WorkflowDetailDV.pcf: line 14, column 26
    function initialValue_0 () : Activity[] {
      return Workflow.Activities
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 100, column 44
    function sortValue_37 (Item :  entity.WorkflowWorkItem) : java.lang.Object {
      return Item.CreationTime
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 106, column 46
    function sortValue_38 (Item :  entity.WorkflowWorkItem) : java.lang.Object {
      return Item.LastUpdateTime
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 118, column 57
    function sortValue_39 (Item :  entity.WorkflowWorkItem) : java.lang.Object {
      return Item.Status
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 122, column 44
    function sortValue_40 (Item :  entity.WorkflowWorkItem) : java.lang.Object {
      return Item.CheckedOutBy
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 149, column 43
    function sortValue_60 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 166, column 53
    function sortValue_61 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Status
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 170, column 46
    function sortValue_62 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 175, column 47
    function sortValue_63 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 180, column 42
    function sortValue_64 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowDetailDV.pcf: line 203, column 111
    function sortValue_88 (LogEntry :  entity.WorkflowLogEntry) : java.lang.Object {
      return LogEntry.SortOrder
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at WorkflowDetailDV.pcf: line 22, column 39
    function valueRoot_3 () : java.lang.Object {
      return Workflow
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at WorkflowDetailDV.pcf: line 22, column 39
    function value_1 () : typekey.Workflow {
      return Workflow.Subtype
    }
    
    // 'value' attribute on TextInput (id=Parent) at WorkflowDetailDV.pcf: line 40, column 46
    function value_11 () : entity.Workflow {
      return Workflow.Caller
    }
    
    // 'value' attribute on TextInput (id=ProcessVersion) at WorkflowDetailDV.pcf: line 45, column 41
    function value_17 () : java.lang.Integer {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on TextInput (id=CurrentStep) at WorkflowDetailDV.pcf: line 51, column 56
    function value_20 () : java.lang.String {
      return Workflow.localizedCurrentStepName()
    }
    
    // 'value' attribute on TextInput (id=PrevStep) at WorkflowDetailDV.pcf: line 55, column 57
    function value_22 () : java.lang.String {
      return Workflow.localizedPreviousStepName()
    }
    
    // 'value' attribute on TypeKeyInput (id=CurrentAction) at WorkflowDetailDV.pcf: line 60, column 51
    function value_24 () : typekey.WorkflowActionType {
      return Workflow.CurrentAction
    }
    
    // 'value' attribute on TypeKeyInput (id=ActiveState) at WorkflowDetailDV.pcf: line 65, column 52
    function value_27 () : typekey.WorkflowActiveState {
      return Workflow.ActiveState
    }
    
    // 'value' attribute on TextInput (id=Timeouts) at WorkflowDetailDV.pcf: line 69, column 79
    function value_30 () : java.lang.String {
      return formatArrayOfStrings(Workflow.AvailableTimeouts as String)
    }
    
    // 'value' attribute on DateInput (id=Timeout) at WorkflowDetailDV.pcf: line 75, column 41
    function value_32 () : java.util.Date {
      return Workflow.TimeoutTime
    }
    
    // 'value' attribute on TextInput (id=Triggers) at WorkflowDetailDV.pcf: line 79, column 79
    function value_35 () : java.lang.String {
      return formatArrayOfStrings(Workflow.AvailableTriggers as String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Handler) at WorkflowDetailDV.pcf: line 27, column 46
    function value_4 () : typekey.WorkflowHandler {
      return Workflow.Handler
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 91, column 89
    function value_59 () : gw.api.database.IQueryBeanResult<entity.WorkflowWorkItem> {
      return Workflow.findWorkflowWorkItems()
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at WorkflowDetailDV.pcf: line 32, column 44
    function value_7 () : typekey.WorkflowState {
      return Workflow.State
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 144, column 43
    function value_86 () : entity.Activity[] {
      return activities
    }
    
    // 'value' attribute on RowIterator at WorkflowDetailDV.pcf: line 195, column 51
    function value_98 () : entity.WorkflowLogEntry[] {
      return Workflow.Log
    }
    
    // 'visible' attribute on TextInput (id=Parent) at WorkflowDetailDV.pcf: line 40, column 46
    function visible_10 () : java.lang.Boolean {
      return Workflow.Caller != null
    }
    
    // 'visible' attribute on ListViewInput at WorkflowDetailDV.pcf: line 136, column 44
    function visible_87 () : java.lang.Boolean {
      return activities.length > 0
    }
    
    property get Workflow () : Workflow {
      return getRequireValue("Workflow", 0) as Workflow
    }
    
    property set Workflow ($arg :  Workflow) {
      setRequireValue("Workflow", 0, $arg)
    }
    
    property get activities () : Activity[] {
      return getVariableValue("activities", 0) as Activity[]
    }
    
    property set activities ($arg :  Activity[]) {
      setVariableValue("activities", 0, $arg)
    }
    
    
    function formatArrayOfStrings(str : String) : String {
             return str.substring(1,str.length - 1)
           }
        
    
    
  }
  
  
}