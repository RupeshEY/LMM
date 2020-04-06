package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends WorkflowSearchExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Workflows_ManageAllButton) at WorkflowSearch.pcf: line 40, column 29
    function action_4 () : void {
      ManageWorkflows.go(Workflows, SearchCriteria)
    }
    
    // 'action' attribute on ToolbarButton (id=Workflows_ManageAllButton) at WorkflowSearch.pcf: line 40, column 29
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ManageWorkflows.createDestination(Workflows, SearchCriteria)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Workflows_ManageButton) at WorkflowSearch.pcf: line 34, column 29
    function allCheckedRowsAction_2 (CheckedValues :  entity.Workflow[], CheckedValuesErrors :  java.util.Map) : void {
      ManageWorkflows.go(CheckedValues)
    }
    
    // 'available' attribute on ToolbarButton (id=Workflows_ManageAllButton) at WorkflowSearch.pcf: line 40, column 29
    function available_3 () : java.lang.Boolean {
      return Workflows == null ? false : Workflows.getCount() > 0
    }
    
    // 'def' attribute on PanelRef at WorkflowSearch.pcf: line 22, column 46
    function def_onEnter_0 (def :  pcf.WorkflowsDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at WorkflowSearch.pcf: line 24, column 47
    function def_onEnter_6 (def :  pcf.WorkflowsLV) : void {
      def.onEnter(Workflows, false)
    }
    
    // 'def' attribute on PanelRef at WorkflowSearch.pcf: line 22, column 46
    function def_refreshVariables_1 (def :  pcf.WorkflowsDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at WorkflowSearch.pcf: line 24, column 47
    function def_refreshVariables_7 (def :  pcf.WorkflowsLV) : void {
      def.refreshVariables(Workflows, false)
    }
    
    // 'searchCriteria' attribute on SearchPanel at WorkflowSearch.pcf: line 20, column 78
    function searchCriteria_9 () : entity.WorkflowSearchCriteria {
      return new WorkflowSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at WorkflowSearch.pcf: line 20, column 78
    function search_8 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    property get SearchCriteria () : entity.WorkflowSearchCriteria {
      return getCriteriaValue(1) as entity.WorkflowSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.WorkflowSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get Workflows () : gw.api.database.IQueryBeanResult<Workflow> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Workflow>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=WorkflowSearch) at WorkflowSearch.pcf: line 11, column 72
    static function canVisit_10 () : java.lang.Boolean {
      return perm.System.workflowview
    }
    
    // 'parent' attribute on Page (id=WorkflowSearch) at WorkflowSearch.pcf: line 11, column 72
    static function parent_11 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WorkflowSearch {
      return super.CurrentLocation as pcf.WorkflowSearch
    }
    
    
  }
  
  
}