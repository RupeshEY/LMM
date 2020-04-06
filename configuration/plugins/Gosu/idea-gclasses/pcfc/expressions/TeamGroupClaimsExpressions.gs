package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/claims/TeamGroupClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupClaimsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/claims/TeamGroupClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupClaimsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamGroupClaims_Print) at TeamGroupClaims.pcf: line 53, column 25
    function action_6 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupClaims_Assign) at TeamGroupClaims.pcf: line 40, column 25
    function allCheckedRowsAction_3 (CheckedValues :  entity.ClaimTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamGroupClaims_RemoveFlag) at TeamGroupClaims.pcf: line 46, column 76
    function allCheckedRowsAction_4 (CheckedValues :  entity.ClaimTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      TeamClaimRemoveFlagPopup.push(gw.api.team.TeamUtil.convertViewArrayToSingleClaim(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamGroupClaims_Print) at TeamGroupClaims.pcf: line 53, column 25
    function available_5 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamGroupClaims) at TeamGroupClaims.pcf: line 8, column 90
    static function canVisit_9 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam and GroupInfo.Group != null
    }
    
    // 'def' attribute on PanelRef at TeamGroupClaims.pcf: line 56, column 59
    function def_onEnter_7 (def :  pcf.TeamClaimsLV) : void {
      def.onEnter(ClaimTeamViewList, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamGroupClaims.pcf: line 56, column 59
    function def_refreshVariables_8 (def :  pcf.TeamClaimsLV) : void {
      def.refreshVariables(ClaimTeamViewList, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupClaims.pcf: line 18, column 46
    function initialValue_0 () : gw.api.team.TeamClaimFilterSet {
      return new gw.api.team.TeamGroupClaimFilterSet(GroupInfo.Group)
    }
    
    // 'initialValue' attribute on Variable at TeamGroupClaims.pcf: line 23, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ClaimTeamView.finder.findAll()
    }
    
    // Page (id=TeamGroupClaims) at TeamGroupClaims.pcf: line 8, column 90
    static function parent_10 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.TeamGroupGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=TeamGroupClaims) at TeamGroupClaims.pcf: line 8, column 90
    static function title_11 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Web.Team.GroupClaimsTitle", GroupInfo.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamGroupClaims.pcf: line 32, column 95
    function title_2 () : java.lang.String {
      return DisplayKey.get("Web.Team.GroupClaimsTitle", GroupInfo.DisplayName)
    }
    
    property get ClaimTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ClaimTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ClaimTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ClaimTeamViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamGroupClaims {
      return super.CurrentLocation as pcf.TeamGroupClaims
    }
    
    property get FilterSet () : gw.api.team.TeamClaimFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamClaimFilterSet) {
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