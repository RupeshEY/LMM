package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupSubrogationsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSubrogationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Print) at TeamGroupSubrogations.pcf: line 32, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions("SubrogationsLV")
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Assign) at TeamGroupSubrogations.pcf: line 25, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.SubrogationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=Print) at TeamGroupSubrogations.pcf: line 32, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupSubrogations) at TeamGroupSubrogations.pcf: line 8, column 91
    static function canVisit_6 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam and GroupInfo.Group != null and GroupInfo.Group.GroupType == TC_SUBRO
    }
    
    // 'def' attribute on PanelRef at TeamGroupSubrogations.pcf: line 35, column 90
    function def_onEnter_4 (def :  pcf.SubrogationsLV) : void {
      def.onEnter(SubrogationView.finder.findByGroup(GroupInfo.Group), true)
    }
    
    // 'def' attribute on PanelRef at TeamGroupSubrogations.pcf: line 35, column 90
    function def_refreshVariables_5 (def :  pcf.SubrogationsLV) : void {
      def.refreshVariables(SubrogationView.finder.findByGroup(GroupInfo.Group), true)
    }
    
    // Page (id=TeamGroupSubrogations) at TeamGroupSubrogations.pcf: line 8, column 91
    static function parent_7 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on TitleBar at TeamGroupSubrogations.pcf: line 18, column 96
    function title_0 () : java.lang.String {
      return DisplayKey.get("Web.Team.SubrogationsTitle", GroupInfo.DisplayName)
    }
    
    // 'title' attribute on Page (id=TeamGroupSubrogations) at TeamGroupSubrogations.pcf: line 8, column 91
    static function title_8 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.SubrogationsTitle", GroupInfo.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupSubrogations {
      return super.CurrentLocation as pcf.TeamGroupSubrogations
    }
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    
  }
  
  
}