package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkflowsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=Parent) at WorkflowsLV.pcf: line 66, column 32
    function actionAvailable_29 () : java.lang.Boolean {
      return Workflow.Caller != null
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at WorkflowsLV.pcf: line 34, column 41
    function action_12 () : void {
      WorkflowDetail.go(Workflow)
    }
    
    // 'action' attribute on TextCell (id=Parent) at WorkflowsLV.pcf: line 66, column 32
    function action_27 () : void {
      WorkflowDetail.go(Workflow.Caller)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at WorkflowsLV.pcf: line 34, column 41
    function action_dest_13 () : pcf.api.Destination {
      return pcf.WorkflowDetail.createDestination(Workflow)
    }
    
    // 'action' attribute on TextCell (id=Parent) at WorkflowsLV.pcf: line 66, column 32
    function action_dest_28 () : pcf.api.Destination {
      return pcf.WorkflowDetail.createDestination(Workflow.Caller)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at WorkflowsLV.pcf: line 23, column 75
    function checkBoxVisible_48 () : java.lang.Boolean {
      return Workflow.State != TC_COMPLETED
    }
    
    // 'condition' attribute on ToolbarFlag at WorkflowsLV.pcf: line 26, column 27
    function condition_10 () : java.lang.Boolean {
      return Workflow.State == TC_ERROR || Workflow.State == TC_SUSPENDED
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at WorkflowsLV.pcf: line 34, column 41
    function valueRoot_15 () : java.lang.Object {
      return Workflow
    }
    
    // 'value' attribute on TextCell (id=Children) at WorkflowsLV.pcf: line 73, column 42
    function valueRoot_34 () : java.lang.Object {
      return Workflow.SubFlows
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at WorkflowsLV.pcf: line 34, column 41
    function value_11 () : typekey.Workflow {
      return Workflow.Subtype
    }
    
    // 'value' attribute on TextCell (id=ProcessVersion) at WorkflowsLV.pcf: line 40, column 42
    function value_16 () : java.lang.Integer {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on DateCell (id=StartTime) at WorkflowsLV.pcf: line 49, column 40
    function value_19 () : java.util.Date {
      return Workflow.CreateTime
    }
    
    // 'value' attribute on DateCell (id=UpdateTime) at WorkflowsLV.pcf: line 56, column 40
    function value_22 () : java.util.Date {
      return Workflow.UpdateTime
    }
    
    // 'value' attribute on TextCell (id=Parent) at WorkflowsLV.pcf: line 66, column 32
    function value_26 () : entity.Workflow {
      return Workflow.Caller
    }
    
    // 'value' attribute on TextCell (id=Children) at WorkflowsLV.pcf: line 73, column 42
    function value_32 () : java.lang.Integer {
      return Workflow.SubFlows.length
    }
    
    // 'value' attribute on TextCell (id=CurrentStep) at WorkflowsLV.pcf: line 79, column 56
    function value_35 () : java.lang.String {
      return Workflow.localizedCurrentStepName()
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at WorkflowsLV.pcf: line 85, column 46
    function value_37 () : typekey.WorkflowState {
      return Workflow.State
    }
    
    // 'value' attribute on TypeKeyCell (id=ActiveState) at WorkflowsLV.pcf: line 91, column 52
    function value_40 () : typekey.WorkflowActiveState {
      return Workflow.ActiveState
    }
    
    // 'value' attribute on TextCell (id=WorkItemState) at WorkflowsLV.pcf: line 97, column 51
    function value_43 () : java.lang.String {
      return workItemDisplayValue(Workflow)
    }
    
    // 'value' attribute on DateCell (id=WorkTimeout) at WorkflowsLV.pcf: line 104, column 41
    function value_45 () : java.util.Date {
      return Workflow.TimeoutTime
    }
    
    // 'visible' attribute on TextCell (id=Parent) at WorkflowsLV.pcf: line 66, column 32
    function visible_25 () : java.lang.Boolean {
      return !isParent
    }
    
    property get Workflow () : entity.Workflow {
      return getIteratedValue(1) as entity.Workflow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 34, column 41
    function sortValue_0 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.Subtype
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 40, column 42
    function sortValue_1 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.ProcessVersion
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 49, column 40
    function sortValue_2 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.CreateTime
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 56, column 40
    function sortValue_3 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.UpdateTime
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowsLV.pcf: line 66, column 32
    function sortValue_5 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.Caller.PublicID
    }
    
    // 'sortBy' attribute on RowIterator at WorkflowsLV.pcf: line 79, column 56
    function sortValue_6 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.CurrentStep
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 85, column 46
    function sortValue_7 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.State
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 91, column 52
    function sortValue_8 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.ActiveState
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 104, column 41
    function sortValue_9 (Workflow :  entity.Workflow) : java.lang.Object {
      return Workflow.TimeoutTime
    }
    
    // 'value' attribute on RowIterator at WorkflowsLV.pcf: line 23, column 75
    function value_49 () : gw.api.database.IQueryBeanResult<entity.Workflow> {
      return Workflows
    }
    
    // 'visible' attribute on RowIterator at WorkflowsLV.pcf: line 66, column 32
    function visible_4 () : java.lang.Boolean {
      return !isParent
    }
    
    property get Workflows () : gw.api.database.IQueryBeanResult<Workflow> {
      return getRequireValue("Workflows", 0) as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    property set Workflows ($arg :  gw.api.database.IQueryBeanResult<Workflow>) {
      setRequireValue("Workflows", 0, $arg)
    }
    
    property get isParent () : boolean {
      return getRequireValue("isParent", 0) as java.lang.Boolean
    }
    
    property set isParent ($arg :  boolean) {
      setRequireValue("isParent", 0, $arg)
    }
    
    
    function workItemDisplayValue(wf : Workflow) : String {
            if (wf.State == TC_ACTIVE) {
              var wi = wf.ActiveWorkflowWorkItem
              if (wi != null) {
                if (wi.Status == TC_CHECKEDOUT) {
                    return wi.CheckedOutBy
                }
                return wi.Status as String
              }
            }
            return null
          }
        
    
    
  }
  
  
}