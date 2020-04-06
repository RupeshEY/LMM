package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserSubrogationsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserSubrogationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Print) at TeamUserSubrogations.pcf: line 35, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions("SubrogationsLV")
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Assign) at TeamUserSubrogations.pcf: line 28, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.SubrogationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=Print) at TeamUserSubrogations.pcf: line 35, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamUserSubrogations) at TeamUserSubrogations.pcf: line 8, column 86
    static function canVisit_6 (Group :  Group, User :  User) : java.lang.Boolean {
      return perm.User.viewteam and Group.GroupType == TC_SUBRO
    }
    
    // 'def' attribute on PanelRef at TeamUserSubrogations.pcf: line 38, column 91
    function def_onEnter_4 (def :  pcf.SubrogationsLV) : void {
      def.onEnter(SubrogationView.finder.findByGroupUser(Group, User), false)
    }
    
    // 'def' attribute on PanelRef at TeamUserSubrogations.pcf: line 38, column 91
    function def_refreshVariables_5 (def :  pcf.SubrogationsLV) : void {
      def.refreshVariables(SubrogationView.finder.findByGroupUser(Group, User), false)
    }
    
    // Page (id=TeamUserSubrogations) at TeamUserSubrogations.pcf: line 8, column 86
    static function parent_7 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.TeamUserGroup.createDestination(User,Group)
    }
    
    // 'title' attribute on TitleBar at TeamUserSubrogations.pcf: line 21, column 91
    function title_0 () : java.lang.String {
      return DisplayKey.get("Web.Team.SubrogationsTitle", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=TeamUserSubrogations) at TeamUserSubrogations.pcf: line 8, column 86
    static function title_8 (Group :  Group, User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Team.SubrogationsTitle", User.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamUserSubrogations {
      return super.CurrentLocation as pcf.TeamUserSubrogations
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}