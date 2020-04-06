package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/aging/TeamGroupAging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupAgingExpressions {
  @javax.annotation.Generated("config/web/pcf/team/aging/TeamGroupAging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupAgingExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PrintButton) at TeamGroupAging.pcf: line 35, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'available' attribute on ToolbarButton (id=PrintButton) at TeamGroupAging.pcf: line 35, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupAging) at TeamGroupAging.pcf: line 8, column 89
    static function canVisit_8 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamGroupAging.pcf: line 45, column 67
    function def_onEnter_6 (def :  pcf.GroupAgingStatisticsLV) : void {
      def.onEnter(StatisticsList, PageHelper)
    }
    
    // 'def' attribute on PanelRef at TeamGroupAging.pcf: line 45, column 67
    function def_refreshVariables_7 (def :  pcf.GroupAgingStatisticsLV) : void {
      def.refreshVariables(StatisticsList, PageHelper)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupAging.pcf: line 17, column 53
    function initialValue_0 () : gw.api.team.TeamGroupStatisticsHelper {
      return new gw.api.team.TeamGroupStatisticsHelper(GroupInfo)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupAging.pcf: line 22, column 46
    function initialValue_1 () : gw.api.statistics.Statistics[] {
      return gw.api.team.TeamStatisticsUtil.getTeamStatistics(GroupInfo.Group)
    }
    
    // Page (id=TeamGroupAging) at TeamGroupAging.pcf: line 8, column 89
    static function parent_9 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=TeamGroupAging) at TeamGroupAging.pcf: line 8, column 89
    static function title_10 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupAgingTitle", GroupInfo.DisplayName)
    }
    
    // 'value' attribute on ToolbarInput (id=AsOf) at TeamGroupAging.pcf: line 42, column 41
    function value_4 () : java.lang.String {
      return DisplayKey.get("Web.Team.AsOf", PageHelper.AsOfDate)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupAging {
      return super.CurrentLocation as pcf.TeamGroupAging
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