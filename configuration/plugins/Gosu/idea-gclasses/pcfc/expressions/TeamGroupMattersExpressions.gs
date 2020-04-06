package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/matters/TeamGroupMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupMattersExpressions {
  @javax.annotation.Generated("config/web/pcf/team/matters/TeamGroupMatters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupMattersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupMatters_Print) at TeamGroupMatters.pcf: line 42, column 25
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupMatters_Assign) at TeamGroupMatters.pcf: line 35, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.MatterTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupMatters_Print) at TeamGroupMatters.pcf: line 42, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupMatters) at TeamGroupMatters.pcf: line 8, column 91
    static function canVisit_7 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam and GroupInfo.Group != null
    }
    
    // 'def' attribute on PanelRef at TeamGroupMatters.pcf: line 45, column 50
    function def_onEnter_5 (def :  pcf.TeamMattersLV) : void {
      def.onEnter(MatterTeamViewList)
    }
    
    // 'def' attribute on PanelRef at TeamGroupMatters.pcf: line 45, column 50
    function def_refreshVariables_6 (def :  pcf.TeamMattersLV) : void {
      def.refreshVariables(MatterTeamViewList)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupMatters.pcf: line 18, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return MatterTeamView.finder.findPendingByGroup(GroupInfo.Group, false)
    }
    
    // Page (id=TeamGroupMatters) at TeamGroupMatters.pcf: line 8, column 91
    static function parent_8 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on TitleBar at TeamGroupMatters.pcf: line 27, column 96
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Team.GroupMattersTitle", GroupInfo.DisplayName)
    }
    
    // 'title' attribute on Page (id=TeamGroupMatters) at TeamGroupMatters.pcf: line 8, column 91
    static function title_9 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupMattersTitle", GroupInfo.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupMatters {
      return super.CurrentLocation as pcf.TeamGroupMatters
    }
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
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