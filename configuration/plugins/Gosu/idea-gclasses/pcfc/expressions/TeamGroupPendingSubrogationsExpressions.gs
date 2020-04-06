package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupPendingSubrogationsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingSubrogationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (group :  entity.Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Print) at TeamGroupPendingSubrogations.pcf: line 32, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions("SubrogationsLV")
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Assign) at TeamGroupPendingSubrogations.pcf: line 25, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.SubrogationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=Print) at TeamGroupPendingSubrogations.pcf: line 32, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupPendingSubrogations) at TeamGroupPendingSubrogations.pcf: line 8, column 100
    static function canVisit_6 (group :  entity.Group) : java.lang.Boolean {
      return perm.User.viewteam and group.GroupType == TC_SUBRO
    }
    
    // 'def' attribute on PanelRef at TeamGroupPendingSubrogations.pcf: line 35, column 80
    function def_onEnter_4 (def :  pcf.SubrogationsLV) : void {
      def.onEnter(SubrogationView.finder.findPending(group), true)
    }
    
    // 'def' attribute on PanelRef at TeamGroupPendingSubrogations.pcf: line 35, column 80
    function def_refreshVariables_5 (def :  pcf.SubrogationsLV) : void {
      def.refreshVariables(SubrogationView.finder.findPending(group), true)
    }
    
    // Page (id=TeamGroupPendingSubrogations) at TeamGroupPendingSubrogations.pcf: line 8, column 100
    static function parent_7 (group :  entity.Group) : pcf.api.Destination {
      return pcf.TeamGroupPendingGroup.createDestination(group)
    }
    
    // 'title' attribute on TitleBar at TeamGroupPendingSubrogations.pcf: line 18, column 105
    function title_0 () : java.lang.String {
      return DisplayKey.get("Web.Team.PendingAssignSubrogationsTitle", group.DisplayName)
    }
    
    // 'title' attribute on Page (id=TeamGroupPendingSubrogations) at TeamGroupPendingSubrogations.pcf: line 8, column 100
    static function title_8 (group :  entity.Group) : java.lang.Object {
      return DisplayKey.get("Web.Team.PendingAssignSubrogationsTitle", group.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupPendingSubrogations {
      return super.CurrentLocation as pcf.TeamGroupPendingSubrogations
    }
    
    property get group () : entity.Group {
      return getVariableValue("group", 0) as entity.Group
    }
    
    property set group ($arg :  entity.Group) {
      setVariableValue("group", 0, $arg)
    }
    
    
  }
  
  
}