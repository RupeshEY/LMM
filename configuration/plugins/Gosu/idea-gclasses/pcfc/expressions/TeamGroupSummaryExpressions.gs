package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/TeamGroupSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupSummaryExpressions {
  @javax.annotation.Generated("config/web/pcf/team/summary/TeamGroupSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSummaryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PrintButton) at TeamGroupSummary.pcf: line 43, column 25
    function action_4 () : void {
                                PrintSettings.InternalSettings.excludeWidget(BarGraphTitleId);                          gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV, PrintSettings);                        
    }
    
    // 'available' attribute on ToolbarButton (id=PrintButton) at TeamGroupSummary.pcf: line 43, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupSummary) at TeamGroupSummary.pcf: line 8, column 91
    static function canVisit_12 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamGroupSummary.pcf: line 56, column 90
    function def_onEnter_10 (def :  pcf.GroupStatisticsBarChart) : void {
      def.onEnter(gw.api.team.TeamStatisticsUtil.getMaxedTeamSummaryStatistics(GroupInfo.Group), GroupInfo.Group)
    }
    
    // 'def' attribute on PanelRef at TeamGroupSummary.pcf: line 53, column 62
    function def_onEnter_7 (def :  pcf.GroupStatisticsLV) : void {
      def.onEnter(StatisticsList, PageHelper)
    }
    
    // 'def' attribute on PanelRef at TeamGroupSummary.pcf: line 56, column 90
    function def_refreshVariables_11 (def :  pcf.GroupStatisticsBarChart) : void {
      def.refreshVariables(gw.api.team.TeamStatisticsUtil.getMaxedTeamSummaryStatistics(GroupInfo.Group), GroupInfo.Group)
    }
    
    // 'def' attribute on PanelRef at TeamGroupSummary.pcf: line 53, column 62
    function def_refreshVariables_8 (def :  pcf.GroupStatisticsLV) : void {
      def.refreshVariables(StatisticsList, PageHelper)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupSummary.pcf: line 17, column 53
    function initialValue_0 () : gw.api.team.TeamGroupStatisticsHelper {
      return new gw.api.team.TeamGroupStatisticsHelper(GroupInfo)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupSummary.pcf: line 21, column 42
    function initialValue_1 () : gw.api.print.PrintSettings {
      return new gw.api.print.PrintSettings()
    }
    
    // 'initialValue' attribute on Variable at TeamGroupSummary.pcf: line 26, column 46
    function initialValue_2 () : gw.api.statistics.Statistics[] {
      return gw.api.team.TeamStatisticsUtil.getTeamStatistics(GroupInfo.Group)
    }
    
    // Page (id=TeamGroupSummary) at TeamGroupSummary.pcf: line 8, column 91
    static function parent_13 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=TeamGroupSummary) at TeamGroupSummary.pcf: line 8, column 91
    static function title_14 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupSummaryTitle", GroupInfo.DisplayName)
    }
    
    // 'value' attribute on ToolbarInput (id=AsOf) at TeamGroupSummary.pcf: line 50, column 41
    function value_5 () : java.lang.String {
      return DisplayKey.get("Web.Team.AsOf", PageHelper.AsOfDate)
    }
    
    // 'visible' attribute on PanelRef at TeamGroupSummary.pcf: line 56, column 90
    function visible_9 () : java.lang.Boolean {
      return GroupInfo.Group != null and gw.api.team.TeamStatisticsUtil.showChart()
    }
    
    property get BarGraphTitleId () : java.lang.String {
      return getVariableValue("BarGraphTitleId", 0) as java.lang.String
    }
    
    property set BarGraphTitleId ($arg :  java.lang.String) {
      setVariableValue("BarGraphTitleId", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupSummary {
      return super.CurrentLocation as pcf.TeamGroupSummary
    }
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    property get PageHelper () : gw.api.team.TeamGroupStatisticsHelper {
      return getVariableValue("PageHelper", 0) as gw.api.team.TeamGroupStatisticsHelper
    }
    
    property set PageHelper ($arg :  gw.api.team.TeamGroupStatisticsHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get PrintSettings () : gw.api.print.PrintSettings {
      return getVariableValue("PrintSettings", 0) as gw.api.print.PrintSettings
    }
    
    property set PrintSettings ($arg :  gw.api.print.PrintSettings) {
      setVariableValue("PrintSettings", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get StatisticsList () : gw.api.statistics.Statistics[] {
      return getVariableValue("StatisticsList", 0) as gw.api.statistics.Statistics[]
    }
    
    property set StatisticsList ($arg :  gw.api.statistics.Statistics[]) {
      setVariableValue("StatisticsList", 0, $arg)
    }
    
    
  }
  
  
}