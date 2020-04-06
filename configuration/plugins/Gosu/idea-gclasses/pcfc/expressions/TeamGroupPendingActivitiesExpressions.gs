package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/group/TeamGroupPendingActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupPendingActivitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/team/group/TeamGroupPendingActivities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingActivitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupPendingActivities_Print) at TeamGroupPendingActivities.pcf: line 46, column 25
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupPendingActivities_Assign) at TeamGroupPendingActivities.pcf: line 39, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ActivityTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupPendingActivities_Print) at TeamGroupPendingActivities.pcf: line 46, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupPendingActivities) at TeamGroupPendingActivities.pcf: line 8, column 79
    static function canVisit_7 (Group :  Group) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamGroupPendingActivities.pcf: line 49, column 131
    function def_onEnter_5 (def :  pcf.TeamGroupActivitiesLV) : void {
      def.onEnter(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamGroupPendingActivities.pcf: line 49, column 131
    function def_refreshVariables_6 (def :  pcf.TeamGroupActivitiesLV) : void {
      def.refreshVariables(ActivityTeamViewList as gw.api.database.IQueryBeanResult<ActivityTeamView>, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupPendingActivities.pcf: line 17, column 54
    function initialValue_0 () : gw.api.team.TeamGroupActivityFilterSet {
      return gw.api.team.TeamActivityPendingFilterSet.TEAM_PENDING_ACTIVITY_FILTER
    }
    
    // 'initialValue' attribute on Variable at TeamGroupPendingActivities.pcf: line 22, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityTeamView.finder.findPendingByGroup(Group, true)
    }
    
    // Page (id=TeamGroupPendingActivities) at TeamGroupPendingActivities.pcf: line 8, column 79
    static function parent_8 (Group :  Group) : pcf.api.Destination {
      return pcf.TeamGroupPendingGroup.createDestination(Group)
    }
    
    property get ActivityTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ActivityTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ActivityTeamViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupPendingActivities {
      return super.CurrentLocation as pcf.TeamGroupPendingActivities
    }
    
    property get FilterSet () : gw.api.team.TeamGroupActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamGroupActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamGroupActivityFilterSet) {
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
    
    
  }
  
  
}