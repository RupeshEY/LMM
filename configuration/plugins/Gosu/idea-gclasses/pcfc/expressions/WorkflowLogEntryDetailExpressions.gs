package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowLogEntryDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowLogEntryDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowLogEntryDetail_OKButton) at WorkflowLogEntryDetail.pcf: line 24, column 58
    function action_0 () : void {
      WorkflowDetail.go(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowLogEntryDetail_OKButton) at WorkflowLogEntryDetail.pcf: line 24, column 58
    function action_dest_1 () : pcf.api.Destination {
      return pcf.WorkflowDetail.createDestination(Workflow)
    }
    
    // 'parent' attribute on Page (id=WorkflowLogEntryDetail) at WorkflowLogEntryDetail.pcf: line 9, column 74
    static function parent_10 (LogEntry :  WorkflowTextLog, Workflow :  Workflow) : pcf.api.Destination {
      return pcf.WorkflowDetail.createDestination(Workflow)
    }
    
    // 'value' attribute on TextInput (id=Summary) at WorkflowLogEntryDetail.pcf: line 36, column 39
    function valueRoot_6 () : java.lang.Object {
      return LogEntry
    }
    
    // 'value' attribute on TextInput (id=LogDate) at WorkflowLogEntryDetail.pcf: line 32, column 107
    function value_2 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(LogEntry.LogDate, "MM/dd/yyyy HH:mm:ss")
    }
    
    // 'value' attribute on TextInput (id=Summary) at WorkflowLogEntryDetail.pcf: line 36, column 39
    function value_4 () : java.lang.String {
      return LogEntry.Summary
    }
    
    // 'value' attribute on PreFormattedTextInput (id=Description) at WorkflowLogEntryDetail.pcf: line 40, column 43
    function value_7 () : java.lang.String {
      return LogEntry.Description
    }
    
    override property get CurrentLocation () : pcf.WorkflowLogEntryDetail {
      return super.CurrentLocation as pcf.WorkflowLogEntryDetail
    }
    
    property get LogEntry () : WorkflowTextLog {
      return getVariableValue("LogEntry", 0) as WorkflowTextLog
    }
    
    property set LogEntry ($arg :  WorkflowTextLog) {
      setVariableValue("LogEntry", 0, $arg)
    }
    
    property get Workflow () : Workflow {
      return getVariableValue("Workflow", 0) as Workflow
    }
    
    property set Workflow ($arg :  Workflow) {
      setVariableValue("Workflow", 0, $arg)
    }
    
    
  }
  
  
}