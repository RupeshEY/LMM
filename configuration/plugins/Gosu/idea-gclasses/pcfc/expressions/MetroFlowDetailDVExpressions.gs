package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroFlowDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends MetroFlowDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Summary) at MetroFlowDetailDV.pcf: line 115, column 51
    function action_49 () : void {
      WorkflowLogEntryDetail.go(Workflow, LogEntry as WorkflowTextLog)
    }
    
    // 'action' attribute on TextCell (id=Summary) at MetroFlowDetailDV.pcf: line 115, column 51
    function action_dest_50 () : pcf.api.Destination {
      return pcf.WorkflowLogEntryDetail.createDestination(Workflow, LogEntry as WorkflowTextLog)
    }
    
    // 'available' attribute on TextCell (id=Summary) at MetroFlowDetailDV.pcf: line 115, column 51
    function available_46 () : java.lang.Boolean {
      return LogEntry typeis WorkflowTextLog
    }
    
    // 'value' attribute on TextCell (id=Summary) at MetroFlowDetailDV.pcf: line 115, column 51
    function valueRoot_52 () : java.lang.Object {
      return LogEntry
    }
    
    // 'value' attribute on TextCell (id=LogDate) at MetroFlowDetailDV.pcf: line 108, column 173
    function value_44 () : java.lang.String {
      return gw.api.util.LocaleUtil.getCurrentLocale().getOutputDateFormat(gw.i18n.DateTimeFormat.SHORT, gw.i18n.DateTimeFormat.SHORT).format(LogEntry.LogDate)
    }
    
    // 'value' attribute on TextCell (id=Summary) at MetroFlowDetailDV.pcf: line 115, column 51
    function value_47 () : java.lang.String {
      return LogEntry.LocalizeMessage
    }
    
    property get LogEntry () : entity.WorkflowLogEntry {
      return getIteratedValue(1) as entity.WorkflowLogEntry
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MetroFlowDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 9, column 49
    function action_31 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 12, column 49
    function action_33 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 9, column 49
    function action_dest_32 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 12, column 49
    function action_dest_34 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'valueRange' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 6, column 85
    function valueRange_37 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at MetroFlowDetailDV.pcf: line 56, column 58
    function valueRoot_17 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at MetroFlowDetailDV.pcf: line 56, column 58
    function value_15 () : java.lang.Boolean {
      return Activity.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at MetroFlowDetailDV.pcf: line 63, column 43
    function value_18 () : java.lang.Boolean {
      return Activity.Overdue
    }
    
    // 'value' attribute on DateCell (id=TargetDate) at MetroFlowDetailDV.pcf: line 68, column 46
    function value_21 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at MetroFlowDetailDV.pcf: line 74, column 47
    function value_24 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at MetroFlowDetailDV.pcf: line 79, column 43
    function value_27 () : java.lang.String {
      return Activity.Subject
    }
    
    // 'value' attribute on UserCell (id=AssignedUser) at MetroFlowDetailDV.pcf: line 85, column 42
    function value_30 () : entity.User {
      return Activity.AssignedUser
    }
    
    // 'valueRange' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=AssignedUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_39 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_38(__valueRangeArg)
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at MetroFlowDetailDV.pcf: line 108, column 173
    function sortValue_43 (LogEntry :  entity.WorkflowLogEntry) : java.lang.Object {
      return LogEntry.SortOrder
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at MetroFlowDetailDV.pcf: line 17, column 44
    function valueRoot_2 () : java.lang.Object {
      return Workflow
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at MetroFlowDetailDV.pcf: line 17, column 44
    function value_0 () : typekey.WorkflowState {
      return Workflow.State
    }
    
    // 'value' attribute on TypeKeyInput (id=CurrentAction) at MetroFlowDetailDV.pcf: line 36, column 51
    function value_12 () : typekey.WorkflowActionType {
      return Workflow.CurrentAction
    }
    
    // 'value' attribute on TextInput (id=ProcessVersion) at MetroFlowDetailDV.pcf: line 23, column 42
    function value_3 () : java.lang.Integer {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on RowIterator at MetroFlowDetailDV.pcf: line 48, column 43
    function value_42 () : entity.Activity[] {
      return Workflow.Activities
    }
    
    // 'value' attribute on RowIterator at MetroFlowDetailDV.pcf: line 100, column 51
    function value_53 () : entity.WorkflowLogEntry[] {
      return Workflow.Log
    }
    
    // 'value' attribute on TextInput (id=CurrentStep) at MetroFlowDetailDV.pcf: line 27, column 41
    function value_6 () : java.lang.String {
      return Workflow.CurrentStep
    }
    
    // 'value' attribute on TextInput (id=PrevStep) at MetroFlowDetailDV.pcf: line 31, column 42
    function value_9 () : java.lang.String {
      return Workflow.PreviousStep
    }
    
    property get Workflow () : Workflow {
      return getRequireValue("Workflow", 0) as Workflow
    }
    
    property set Workflow ($arg :  Workflow) {
      setRequireValue("Workflow", 0, $arg)
    }
    
    
  }
  
  
}