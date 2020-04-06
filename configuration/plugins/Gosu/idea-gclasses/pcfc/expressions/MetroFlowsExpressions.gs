package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroFlowsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=MetroFlows) at MetroFlows.pcf: line 11, column 70
    static function canVisit_8 () : java.lang.Boolean {
      return perm.System.workflowview
    }
    
    // 'parent' attribute on Page (id=MetroFlows) at MetroFlows.pcf: line 11, column 70
    static function parent_9 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.MetroFlows {
      return super.CurrentLocation as pcf.MetroFlows
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/workflow/MetroFlows.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends MetroFlowsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=MetroFlows_ResumeAllButton) at MetroFlows.pcf: line 41, column 29
    function action_3 () : void {
      gw.api.admin.WorkflowUtil.resumeAllWorkflows()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MetroFlows_ResumeButton) at MetroFlows.pcf: line 35, column 29
    function allCheckedRowsAction_2 (CheckedValues :  entity.Workflow[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.WorkflowUtil.resumeWorkflows(CheckedValues)
    }
    
    // 'def' attribute on PanelRef at MetroFlows.pcf: line 22, column 47
    function def_onEnter_0 (def :  pcf.MetroFlowsDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at MetroFlows.pcf: line 24, column 48
    function def_onEnter_4 (def :  pcf.MetroFlowsLV) : void {
      def.onEnter(WorkflowsResults)
    }
    
    // 'def' attribute on PanelRef at MetroFlows.pcf: line 22, column 47
    function def_refreshVariables_1 (def :  pcf.MetroFlowsDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at MetroFlows.pcf: line 24, column 48
    function def_refreshVariables_5 (def :  pcf.MetroFlowsLV) : void {
      def.refreshVariables(WorkflowsResults)
    }
    
    // 'searchCriteria' attribute on SearchPanel at MetroFlows.pcf: line 20, column 78
    function searchCriteria_7 () : entity.WorkflowSearchCriteria {
      return new WorkflowSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at MetroFlows.pcf: line 20, column 78
    function search_6 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    property get SearchCriteria () : entity.WorkflowSearchCriteria {
      return getCriteriaValue(1) as entity.WorkflowSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.WorkflowSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get WorkflowsResults () : gw.api.database.IQueryBeanResult<Workflow> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    
  }
  
  
}