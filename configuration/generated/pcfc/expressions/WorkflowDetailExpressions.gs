package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Workflow :  Workflow) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowDetail_RefreshButton) at WorkflowDetail.pcf: line 23, column 63
    function action_0 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowDetail_SuspendButtonButton) at WorkflowDetail.pcf: line 29, column 81
    function action_2 () : void {
      gw.api.admin.WorkflowUtil.suspend(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowDetail_ResumeButton) at WorkflowDetail.pcf: line 34, column 116
    function action_4 () : void {
      gw.api.admin.WorkflowUtil.resumeWorkflow(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowDetail_ManageButton) at WorkflowDetail.pcf: line 39, column 84
    function action_6 () : void {
      ManageWorkflows.go( new Workflow[] { Workflow })
    }
    
    // 'action' attribute on ToolbarButton (id=WorkflowDetail_ManageButton) at WorkflowDetail.pcf: line 39, column 84
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ManageWorkflows.createDestination( new Workflow[] { Workflow })
    }
    
    // 'afterCancel' attribute on Page (id=WorkflowDetail) at WorkflowDetail.pcf: line 11, column 66
    function afterCancel_13 () : void {
      WorkflowSearch.go()
    }
    
    // 'afterCancel' attribute on Page (id=WorkflowDetail) at WorkflowDetail.pcf: line 11, column 66
    function afterCancel_dest_14 () : pcf.api.Destination {
      return pcf.WorkflowSearch.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=WorkflowDetail) at WorkflowDetail.pcf: line 11, column 66
    function afterCommit_15 (TopLocation :  pcf.api.Location) : void {
      WorkflowSearch.go()
    }
    
    // 'def' attribute on PanelRef at WorkflowDetail.pcf: line 45, column 51
    function def_onEnter_11 (def :  pcf.WorkflowsLV) : void {
      def.onEnter(findSubFlows(Workflow), true)
    }
    
    // 'def' attribute on PanelRef at WorkflowDetail.pcf: line 42, column 43
    function def_onEnter_8 (def :  pcf.WorkflowDetailDV) : void {
      def.onEnter(Workflow)
    }
    
    // 'def' attribute on PanelRef at WorkflowDetail.pcf: line 45, column 51
    function def_refreshVariables_12 (def :  pcf.WorkflowsLV) : void {
      def.refreshVariables(findSubFlows(Workflow), true)
    }
    
    // 'def' attribute on PanelRef at WorkflowDetail.pcf: line 42, column 43
    function def_refreshVariables_9 (def :  pcf.WorkflowDetailDV) : void {
      def.refreshVariables(Workflow)
    }
    
    // 'parent' attribute on Page (id=WorkflowDetail) at WorkflowDetail.pcf: line 11, column 66
    static function parent_16 (Workflow :  Workflow) : pcf.api.Destination {
      return pcf.WorkflowSearch.createDestination()
    }
    
    // 'visible' attribute on ToolbarButton (id=WorkflowDetail_SuspendButtonButton) at WorkflowDetail.pcf: line 29, column 81
    function visible_1 () : java.lang.Boolean {
      return perm.System.workflowmanage and Workflow.State == TC_ACTIVE
    }
    
    // 'visible' attribute on PanelRef at WorkflowDetail.pcf: line 45, column 51
    function visible_10 () : java.lang.Boolean {
      return Workflow.SubFlows.length > 0
    }
    
    // 'visible' attribute on ToolbarButton (id=WorkflowDetail_ResumeButton) at WorkflowDetail.pcf: line 34, column 116
    function visible_3 () : java.lang.Boolean {
      return perm.System.workflowmanage and (Workflow.State == TC_ERROR or Workflow.State == TC_SUSPENDED)
    }
    
    // 'visible' attribute on ToolbarButton (id=WorkflowDetail_ManageButton) at WorkflowDetail.pcf: line 39, column 84
    function visible_5 () : java.lang.Boolean {
      return perm.System.workflowmanage and Workflow.State != TC_COMPLETED
    }
    
    override property get CurrentLocation () : pcf.WorkflowDetail {
      return super.CurrentLocation as pcf.WorkflowDetail
    }
    
    property get Workflow () : Workflow {
      return getVariableValue("Workflow", 0) as Workflow
    }
    
    property set Workflow ($arg :  Workflow) {
      setVariableValue("Workflow", 0, $arg)
    }
    
    function findSubFlows(wf : Workflow) : gw.api.database.IQueryBeanResult<Workflow> {
      var criteria = new WorkflowSearchCriteria()
      criteria.Parent = wf
      return criteria.performSearch() as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    
  }
  
  
}