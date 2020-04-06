package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamUserActivities_Print) at TeamUserActivities.pcf: line 49, column 25
    function action_5 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamUserActivities_Assign) at TeamUserActivities.pcf: line 42, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.ActivityTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamUserActivities_Print) at TeamUserActivities.pcf: line 49, column 25
    function available_4 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamUserActivities) at TeamUserActivities.pcf: line 8, column 88
    static function canVisit_8 (Group :  Group, User :  User) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamUserActivities.pcf: line 52, column 130
    function def_onEnter_6 (def :  pcf.TeamUserActivitiesLV) : void {
      def.onEnter(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamUserActivities.pcf: line 52, column 130
    function def_refreshVariables_7 (def :  pcf.TeamUserActivitiesLV) : void {
      def.refreshVariables(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamUserActivities.pcf: line 20, column 53
    function initialValue_0 () : gw.api.team.TeamUserActivityFilterSet {
      return gw.api.team.TeamUserActivityFilterSet.TEAM_USER_ACTIVITY_FILTER
    }
    
    // 'initialValue' attribute on Variable at TeamUserActivities.pcf: line 25, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityTeamView.finder.findAssignedToUser(User, Group)
    }
    
    // Page (id=TeamUserActivities) at TeamUserActivities.pcf: line 8, column 88
    static function parent_9 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.TeamUserGroup.createDestination(User,Group)
    }
    
    // 'title' attribute on Page (id=TeamUserActivities) at TeamUserActivities.pcf: line 8, column 88
    static function title_10 (Group :  Group, User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Team.UserActivitiesTitle", User.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamUserActivities.pcf: line 34, column 93
    function title_2 () : java.lang.String {
      return DisplayKey.get("Web.Team.UserActivitiesTitle", User.DisplayName)
    }
    
    property get ActivityTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ActivityTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ActivityTeamViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamUserActivities {
      return super.CurrentLocation as pcf.TeamUserActivities
    }
    
    property get FilterSet () : gw.api.team.TeamUserActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamUserActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamUserActivityFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}