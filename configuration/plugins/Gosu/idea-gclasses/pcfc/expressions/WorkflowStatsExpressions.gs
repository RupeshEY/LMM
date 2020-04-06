package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStats.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowStatsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStats.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends WorkflowStatsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at WorkflowStats.pcf: line 22, column 50
    function def_onEnter_0 (def :  pcf.WorkflowStatsDV) : void {
      def.onEnter(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at WorkflowStats.pcf: line 24, column 48
    function def_onEnter_2 (def :  pcf.WorkflowStatsLV) : void {
      def.onEnter(WorkflowStats)
    }
    
    // 'def' attribute on PanelRef at WorkflowStats.pcf: line 22, column 50
    function def_refreshVariables_1 (def :  pcf.WorkflowStatsDV) : void {
      def.refreshVariables(SearchCriteria)
    }
    
    // 'def' attribute on PanelRef at WorkflowStats.pcf: line 24, column 48
    function def_refreshVariables_3 (def :  pcf.WorkflowStatsLV) : void {
      def.refreshVariables(WorkflowStats)
    }
    
    // 'searchCriteria' attribute on SearchPanel at WorkflowStats.pcf: line 20, column 87
    function searchCriteria_5 () : entity.WFStatsSearchCriteria {
      return new WFStatsSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at WorkflowStats.pcf: line 20, column 87
    function search_4 () : java.lang.Object {
      return SearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<WorkflowStepStats>
    }
    
    property get SearchCriteria () : entity.WFStatsSearchCriteria {
      return getCriteriaValue(1) as entity.WFStatsSearchCriteria
    }
    
    property set SearchCriteria ($arg :  entity.WFStatsSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get WorkflowStats () : gw.api.database.IQueryBeanResult<WorkflowStepStats> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<WorkflowStepStats>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowStats.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowStatsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=WorkflowStats) at WorkflowStats.pcf: line 11, column 71
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.workflowview
    }
    
    // 'parent' attribute on Page (id=WorkflowStats) at WorkflowStats.pcf: line 11, column 71
    static function parent_7 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WorkflowStats {
      return super.CurrentLocation as pcf.WorkflowStats
    }
    
    
  }
  
  
}