package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/exposures/TeamGroupExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/team/exposures/TeamGroupExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupExposures_Print) at TeamGroupExposures.pcf: line 46, column 25
    function action_5 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupExposures_Assign) at TeamGroupExposures.pcf: line 39, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.ExposureTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupExposures_Print) at TeamGroupExposures.pcf: line 46, column 25
    function available_4 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupExposures) at TeamGroupExposures.pcf: line 8, column 93
    static function canVisit_8 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam and GroupInfo.Group != null
    }
    
    // 'def' attribute on PanelRef at TeamGroupExposures.pcf: line 49, column 65
    function def_onEnter_6 (def :  pcf.TeamExposuresLV) : void {
      def.onEnter(ExposureTeamViewList, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamGroupExposures.pcf: line 49, column 65
    function def_refreshVariables_7 (def :  pcf.TeamExposuresLV) : void {
      def.refreshVariables(ExposureTeamViewList, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupExposures.pcf: line 17, column 49
    function initialValue_0 () : gw.api.team.TeamExposureFilterSet {
      return new gw.api.team.TeamGroupExposureFilterSet(GroupInfo.Group)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupExposures.pcf: line 22, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ExposureTeamView.finder.findAll()
    }
    
    // Page (id=TeamGroupExposures) at TeamGroupExposures.pcf: line 8, column 93
    static function parent_9 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=TeamGroupExposures) at TeamGroupExposures.pcf: line 8, column 93
    static function title_10 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupExposuresTitle", GroupInfo.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamGroupExposures.pcf: line 31, column 98
    function title_2 () : java.lang.String {
      return DisplayKey.get("Web.Team.GroupExposuresTitle", GroupInfo.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupExposures {
      return super.CurrentLocation as pcf.TeamGroupExposures
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
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    
  }
  
  
}