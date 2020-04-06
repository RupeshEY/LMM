package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroFlowLogEntryDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowLogEntryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowLogEntryDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Workflow :  Workflow, LogEntry :  WorkflowTextLog) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowLogEntryDetail_OKButton) at MetroFlowLogEntryDetail.pcf: line 24, column 58
    function action_0 () : void {
      MetroFlowDetail.go(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowLogEntryDetail_OKButton) at MetroFlowLogEntryDetail.pcf: line 24, column 58
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MetroFlowDetail.createDestination(Workflow)
    }
    
    // 'parent' attribute on Page (id=MetroFlowLogEntryDetail) at MetroFlowLogEntryDetail.pcf: line 9, column 83
    static function parent_10 (LogEntry :  WorkflowTextLog, Workflow :  Workflow) : pcf.api.Destination {
      return pcf.MetroFlowDetail.createDestination(Workflow)
    }
    
    // 'value' attribute on TextInput (id=Summary) at MetroFlowLogEntryDetail.pcf: line 36, column 47
    function valueRoot_6 () : java.lang.Object {
      return LogEntry
    }
    
    // 'value' attribute on TextInput (id=LogDate) at MetroFlowLogEntryDetail.pcf: line 32, column 169
    function value_2 () : java.lang.String {
      return gw.api.util.LocaleUtil.getCurrentLocale().getOutputDateFormat(gw.i18n.DateTimeFormat.SHORT, gw.i18n.DateTimeFormat.SHORT).format(LogEntry.LogDate)
    }
    
    // 'value' attribute on TextInput (id=Summary) at MetroFlowLogEntryDetail.pcf: line 36, column 47
    function value_4 () : java.lang.String {
      return LogEntry.LocalizeMessage
    }
    
    // 'value' attribute on PreFormattedTextInput (id=Description) at MetroFlowLogEntryDetail.pcf: line 40, column 43
    function value_7 () : java.lang.String {
      return LogEntry.Description
    }
    
    override property get CurrentLocation () : pcf.MetroFlowLogEntryDetail {
      return super.CurrentLocation as pcf.MetroFlowLogEntryDetail
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