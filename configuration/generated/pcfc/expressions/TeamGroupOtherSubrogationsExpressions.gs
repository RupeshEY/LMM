package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupOtherSubrogationsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherSubrogationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (group :  entity.Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Print) at TeamGroupOtherSubrogations.pcf: line 32, column 25
    function action_2 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions("SubrogationsLV")
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Assign) at TeamGroupOtherSubrogations.pcf: line 25, column 25
    function allCheckedRowsAction_0 (CheckedValues :  entity.SubrogationView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=Print) at TeamGroupOtherSubrogations.pcf: line 32, column 25
    function available_1 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupOtherSubrogations) at TeamGroupOtherSubrogations.pcf: line 8, column 73
    static function canVisit_5 (group :  entity.Group) : java.lang.Boolean {
      return perm.User.viewteam and group.GroupType == TC_SUBRO
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherSubrogations.pcf: line 35, column 78
    function def_onEnter_3 (def :  pcf.SubrogationsLV) : void {
      def.onEnter(SubrogationView.finder.findOther(group), true)
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherSubrogations.pcf: line 35, column 78
    function def_refreshVariables_4 (def :  pcf.SubrogationsLV) : void {
      def.refreshVariables(SubrogationView.finder.findOther(group), true)
    }
    
    // Page (id=TeamGroupOtherSubrogations) at TeamGroupOtherSubrogations.pcf: line 8, column 73
    static function parent_6 (group :  entity.Group) : pcf.api.Destination {
      return pcf.TeamGroupOtherGroup.createDestination(group)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupOtherSubrogations {
      return super.CurrentLocation as pcf.TeamGroupOtherSubrogations
    }
    
    property get group () : entity.Group {
      return getVariableValue("group", 0) as entity.Group
    }
    
    property set group ($arg :  entity.Group) {
      setVariableValue("group", 0, $arg)
    }
    
    
  }
  
  
}