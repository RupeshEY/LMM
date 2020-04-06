package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroFlowsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MetroFlowsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CurrentStep) at MetroFlowsLV.pcf: line 45, column 41
    function action_13 () : void {
      MetroFlowDetail.go(Workflow)
    }
    
    // 'action' attribute on TextCell (id=CurrentStep) at MetroFlowsLV.pcf: line 45, column 41
    function action_dest_14 () : pcf.api.Destination {
      return pcf.MetroFlowDetail.createDestination(Workflow)
    }
    
    // 'condition' attribute on ToolbarFlag at MetroFlowsLV.pcf: line 22, column 33
    function condition_5 () : java.lang.Boolean {
      return Workflow.State == TC_ERROR
    }
    
    // 'value' attribute on DateCell (id=StartTime) at MetroFlowsLV.pcf: line 32, column 40
    function valueRoot_8 () : java.lang.Object {
      return Workflow
    }
    
    // 'value' attribute on TextCell (id=CurrentStep) at MetroFlowsLV.pcf: line 45, column 41
    function value_12 () : java.lang.String {
      return Workflow.CurrentStep
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at MetroFlowsLV.pcf: line 51, column 46
    function value_17 () : typekey.WorkflowState {
      return Workflow.State
    }
    
    // 'value' attribute on TextCell (id=ProcessVersion) at MetroFlowsLV.pcf: line 57, column 42
    function value_20 () : java.lang.Integer {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on DateCell (id=StartTime) at MetroFlowsLV.pcf: line 32, column 40
    function value_6 () : java.util.Date {
      return Workflow.CreateTime
    }
    
    // 'value' attribute on DateCell (id=UpdateTime) at MetroFlowsLV.pcf: line 39, column 40
    function value_9 () : java.util.Date {
      return Workflow.UpdateTime
    }
    
    property get Workflow () : entity.Workflow {
      return getIteratedValue(1) as entity.Workflow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 32, column 40
    function sortValue_0 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.CreateTime
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 39, column 40
    function sortValue_1 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.UpdateTime
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 45, column 41
    function sortValue_2 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.CurrentStep
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 51, column 46
    function sortValue_3 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.State
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 57, column 42
    function sortValue_4 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on RowIterator at MetroFlowsLV.pcf: line 19, column 75
    function value_23 () : gw.api.database.IQueryBeanResult<entity.Workflow> {
      return Workflows
    }
    
    property get Workflows () : gw.api.database.IQueryBeanResult<Workflow> {
      return getRequireValue("Workflows", 0) as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    property set Workflows ($arg :  gw.api.database.IQueryBeanResult<Workflow>) {
      setRequireValue("Workflows", 0, $arg)
    }
    
    
  }
  
  
}