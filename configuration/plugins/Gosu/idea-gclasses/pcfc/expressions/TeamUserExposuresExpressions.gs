package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamUserExposures_Print) at TeamUserExposures.pcf: line 49, column 25
    function action_5 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamUserExposures_Assign) at TeamUserExposures.pcf: line 42, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.ExposureTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamUserExposures_Print) at TeamUserExposures.pcf: line 49, column 25
    function available_4 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamUserExposures) at TeamUserExposures.pcf: line 8, column 87
    static function canVisit_8 (Group :  Group, User :  User) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamUserExposures.pcf: line 52, column 65
    function def_onEnter_6 (def :  pcf.TeamExposuresLV) : void {
      def.onEnter(ExposureTeamViewList, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamUserExposures.pcf: line 52, column 65
    function def_refreshVariables_7 (def :  pcf.TeamExposuresLV) : void {
      def.refreshVariables(ExposureTeamViewList, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamUserExposures.pcf: line 20, column 49
    function initialValue_0 () : gw.api.team.TeamExposureFilterSet {
      return new gw.api.team.TeamUserExposureFilterSet(User,Group)
    }
    
    // 'initialValue' attribute on Variable at TeamUserExposures.pcf: line 25, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ExposureTeamView.finder.findAssignedToUser(User, Group)
    }
    
    // Page (id=TeamUserExposures) at TeamUserExposures.pcf: line 8, column 87
    static function parent_9 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.TeamUserGroup.createDestination(User,Group)
    }
    
    // 'title' attribute on Page (id=TeamUserExposures) at TeamUserExposures.pcf: line 8, column 87
    static function title_10 (Group :  Group, User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Team.UserExposuresTitle", User.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamUserExposures.pcf: line 34, column 92
    function title_2 () : java.lang.String {
      return DisplayKey.get("Web.Team.UserExposuresTitle", User.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamUserExposures {
      return super.CurrentLocation as pcf.TeamUserExposures
    }
    
    property get ExposureTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ExposureTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ExposureTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ExposureTeamViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.team.TeamExposureFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamExposureFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamExposureFilterSet) {
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