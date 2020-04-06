package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroFlowDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlowDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Workflow :  Workflow) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowDetail_PreciousButton) at MetroFlowDetail.pcf: line 23, column 64
    function action_0 () : void {
      MetroFlows.go()
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowDetail_RefreshButtonButton) at MetroFlowDetail.pcf: line 27, column 63
    function action_2 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowDetail_SuspendButton) at MetroFlowDetail.pcf: line 33, column 52
    function action_4 () : void {
      gw.api.admin.WorkflowUtil.suspend(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowDetail_ResumeButton) at MetroFlowDetail.pcf: line 38, column 49
    function action_6 () : void {
      gw.api.admin.WorkflowUtil.resumeWorkflow(Workflow)
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlowDetail_PreciousButton) at MetroFlowDetail.pcf: line 23, column 64
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MetroFlows.createDestination()
    }
    
    // 'afterCancel' attribute on Page (id=MetroFlowDetail) at MetroFlowDetail.pcf: line 11, column 75
    function afterCancel_9 () : void {
      MetroFlows.go()
    }
    
    // 'afterCancel' attribute on Page (id=MetroFlowDetail) at MetroFlowDetail.pcf: line 11, column 75
    function afterCancel_dest_10 () : pcf.api.Destination {
      return pcf.MetroFlows.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=MetroFlowDetail) at MetroFlowDetail.pcf: line 11, column 75
    function afterCommit_11 (TopLocation :  pcf.api.Location) : void {
      MetroFlows.go()
    }
    
    // 'def' attribute on PanelRef at MetroFlowDetail.pcf: line 41, column 44
    function def_onEnter_7 (def :  pcf.MetroFlowDetailDV) : void {
      def.onEnter(Workflow)
    }
    
    // 'def' attribute on PanelRef at MetroFlowDetail.pcf: line 41, column 44
    function def_refreshVariables_8 (def :  pcf.MetroFlowDetailDV) : void {
      def.refreshVariables(Workflow)
    }
    
    // 'parent' attribute on Page (id=MetroFlowDetail) at MetroFlowDetail.pcf: line 11, column 75
    static function parent_12 (Workflow :  Workflow) : pcf.api.Destination {
      return pcf.MetroFlows.createDestination()
    }
    
    // 'visible' attribute on ToolbarButton (id=MetroFlowDetail_SuspendButton) at MetroFlowDetail.pcf: line 33, column 52
    function visible_3 () : java.lang.Boolean {
      return (Workflow.State == TC_ACTIVE)
    }
    
    // 'visible' attribute on ToolbarButton (id=MetroFlowDetail_ResumeButton) at MetroFlowDetail.pcf: line 38, column 49
    function visible_5 () : java.lang.Boolean {
      return Workflow.State == TC_ERROR
    }
    
    override property get CurrentLocation () : pcf.MetroFlowDetail {
      return super.CurrentLocation as pcf.MetroFlowDetail
    }
    
    property get Workflow () : Workflow {
      return getVariableValue("Workflow", 0) as Workflow
    }
    
    property set Workflow ($arg :  Workflow) {
      setVariableValue("Workflow", 0, $arg)
    }
    
    
  }
  
  
}