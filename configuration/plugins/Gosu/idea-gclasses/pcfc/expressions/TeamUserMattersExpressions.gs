package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserMattersExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserMattersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamUserMatters_Print) at TeamUserMatters.pcf: line 45, column 25
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamUserMatters_Assign) at TeamUserMatters.pcf: line 38, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.MatterTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamUserMatters_Print) at TeamUserMatters.pcf: line 45, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamUserMatters) at TeamUserMatters.pcf: line 8, column 85
    static function canVisit_7 (Group :  Group, User :  User) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamUserMatters.pcf: line 48, column 50
    function def_onEnter_5 (def :  pcf.TeamMattersLV) : void {
      def.onEnter(MatterTeamViewList)
    }
    
    // 'def' attribute on PanelRef at TeamUserMatters.pcf: line 48, column 50
    function def_refreshVariables_6 (def :  pcf.TeamMattersLV) : void {
      def.refreshVariables(MatterTeamViewList)
    }
    
    // 'initialValue' attribute on Variable at TeamUserMatters.pcf: line 21, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return MatterTeamView.finder.findAssignedToUser(User, Group)
    }
    
    // Page (id=TeamUserMatters) at TeamUserMatters.pcf: line 8, column 85
    static function parent_8 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.TeamUserGroup.createDestination(User,Group)
    }
    
    // 'title' attribute on TitleBar at TeamUserMatters.pcf: line 30, column 90
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Team.UserMattersTitle", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=TeamUserMatters) at TeamUserMatters.pcf: line 8, column 85
    static function title_9 (Group :  Group, User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Team.UserMattersTitle", User.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamUserMatters {
      return super.CurrentLocation as pcf.TeamUserMatters
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get MatterTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("MatterTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set MatterTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("MatterTeamViewList", 0, $arg)
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