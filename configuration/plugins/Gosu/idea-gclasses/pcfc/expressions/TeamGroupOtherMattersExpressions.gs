package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupOtherMattersExpressions {
  @javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherMattersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupOtherMatters_Print) at TeamGroupOtherMatters.pcf: line 42, column 25
    function action_3 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupOtherMatters_Assign) at TeamGroupOtherMatters.pcf: line 35, column 25
    function allCheckedRowsAction_1 (CheckedValues :  entity.MatterTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupOtherMatters_Print) at TeamGroupOtherMatters.pcf: line 42, column 25
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupOtherMatters) at TeamGroupOtherMatters.pcf: line 8, column 68
    static function canVisit_6 (Group :  Group) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherMatters.pcf: line 45, column 50
    function def_onEnter_4 (def :  pcf.TeamMattersLV) : void {
      def.onEnter(MatterTeamViewList)
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherMatters.pcf: line 45, column 50
    function def_refreshVariables_5 (def :  pcf.TeamMattersLV) : void {
      def.refreshVariables(MatterTeamViewList)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupOtherMatters.pcf: line 18, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return MatterTeamView.finder.findStaleOrFailedAssignmentsByGroup(Group)
    }
    
    // Page (id=TeamGroupOtherMatters) at TeamGroupOtherMatters.pcf: line 8, column 68
    static function parent_7 (Group :  Group) : pcf.api.Destination {
      return pcf.TeamGroupOtherGroup.createDestination(Group)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupOtherMatters {
      return super.CurrentLocation as pcf.TeamGroupOtherMatters
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
    
    
  }
  
  
}