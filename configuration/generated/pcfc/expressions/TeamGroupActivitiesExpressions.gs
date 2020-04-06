package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/team/activities/TeamGroupActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupActivities_Print) at TeamGroupActivities.pcf: line 46, column 25
    function action_5 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupActivities_Assign) at TeamGroupActivities.pcf: line 39, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.ActivityTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupActivities_Print) at TeamGroupActivities.pcf: line 46, column 25
    function available_4 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupActivities) at TeamGroupActivities.pcf: line 8, column 94
    static function canVisit_8 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam and GroupInfo.Group != null
    }
    
    // 'def' attribute on PanelRef at TeamGroupActivities.pcf: line 49, column 131
    function def_onEnter_6 (def :  pcf.TeamGroupActivitiesLV) : void {
      def.onEnter(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamGroupActivities.pcf: line 49, column 131
    function def_refreshVariables_7 (def :  pcf.TeamGroupActivitiesLV) : void {
      def.refreshVariables(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupActivities.pcf: line 17, column 54
    function initialValue_0 () : gw.api.team.TeamGroupActivityFilterSet {
      return gw.api.team.TeamGroupActivityFilterSet.TEAM_GROUP_ACTIVITY_FILTER
    }
    
    // 'initialValue' attribute on Variable at TeamGroupActivities.pcf: line 22, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityTeamView.finder.findPendingByGroup(GroupInfo.Group, false)
    }
    
    // Page (id=TeamGroupActivities) at TeamGroupActivities.pcf: line 8, column 94
    static function parent_9 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=TeamGroupActivities) at TeamGroupActivities.pcf: line 8, column 94
    static function title_10 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupActivitiesTitle", GroupInfo.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamGroupActivities.pcf: line 31, column 99
    function title_2 () : java.lang.String {
      return DisplayKey.get("Web.Team.GroupActivitiesTitle", GroupInfo.DisplayName)
    }
    
    property get ActivityTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ActivityTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ActivityTeamViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupActivities {
      return super.CurrentLocation as pcf.TeamGroupActivities
    }
    
    property get FilterSet () : gw.api.team.TeamGroupActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamGroupActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamGroupActivityFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}