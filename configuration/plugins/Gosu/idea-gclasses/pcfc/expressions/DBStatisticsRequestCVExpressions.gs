package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DBStatisticsRequestCVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DBStatisticsRequestCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatisticsRequestCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsTablesLV) at DBStatisticsRequestCV.pcf: line 15, column 30
    function def_onEnter_0 (def :  pcf.DBStatisticsRequestLV) : void {
      def.onEnter(PageHelper.DBTables)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsStagingTablesLV) at DBStatisticsRequestCV.pcf: line 24, column 37
    function def_onEnter_2 (def :  pcf.DBStatisticsRequestLV) : void {
      def.onEnter(PageHelper.StagingTables)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsTypelistTablesLV) at DBStatisticsRequestCV.pcf: line 33, column 38
    function def_onEnter_4 (def :  pcf.DBStatisticsRequestLV) : void {
      def.onEnter(PageHelper.TypelistTables)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsTablesLV) at DBStatisticsRequestCV.pcf: line 15, column 30
    function def_refreshVariables_1 (def :  pcf.DBStatisticsRequestLV) : void {
      def.refreshVariables(PageHelper.DBTables)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsStagingTablesLV) at DBStatisticsRequestCV.pcf: line 24, column 37
    function def_refreshVariables_3 (def :  pcf.DBStatisticsRequestLV) : void {
      def.refreshVariables(PageHelper.StagingTables)
    }
    
    // 'def' attribute on PanelRef (id=DBStatsTypelistTablesLV) at DBStatisticsRequestCV.pcf: line 33, column 38
    function def_refreshVariables_5 (def :  pcf.DBStatisticsRequestLV) : void {
      def.refreshVariables(PageHelper.TypelistTables)
    }
    
    property get PageHelper () : gw.api.tools.DatabaseStatisticsHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.DatabaseStatisticsHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.DatabaseStatisticsHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}