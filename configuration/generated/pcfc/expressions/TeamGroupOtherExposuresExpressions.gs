package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupOtherExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/team/group/TeamGroupOtherExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupOtherExposures_Print) at TeamGroupOtherExposures.pcf: line 46, column 25
    function action_4 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupOtherExposures_Assign) at TeamGroupOtherExposures.pcf: line 39, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ExposureTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupOtherExposures_Print) at TeamGroupOtherExposures.pcf: line 46, column 25
    function available_3 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupOtherExposures) at TeamGroupOtherExposures.pcf: line 8, column 70
    static function canVisit_7 (Group :  Group) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherExposures.pcf: line 49, column 65
    function def_onEnter_5 (def :  pcf.TeamExposuresLV) : void {
      def.onEnter(ExposureTeamViewList, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamGroupOtherExposures.pcf: line 49, column 65
    function def_refreshVariables_6 (def :  pcf.TeamExposuresLV) : void {
      def.refreshVariables(ExposureTeamViewList, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupOtherExposures.pcf: line 17, column 49
    function initialValue_0 () : gw.api.team.TeamExposureFilterSet {
      return gw.api.team.TeamOtherExposureFilterSet.TEAM_OTHER_EXPOSURE_FILTER
    }
    
    // 'initialValue' attribute on Variable at TeamGroupOtherExposures.pcf: line 22, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ExposureTeamView.finder.findStaleOrFailedAssignmentsByGroup(Group)
    }
    
    // Page (id=TeamGroupOtherExposures) at TeamGroupOtherExposures.pcf: line 8, column 70
    static function parent_8 (Group :  Group) : pcf.api.Destination {
      return pcf.TeamGroupOtherGroup.createDestination(Group)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupOtherExposures {
      return super.CurrentLocation as pcf.TeamGroupOtherExposures
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
    
    
  }
  
  
}