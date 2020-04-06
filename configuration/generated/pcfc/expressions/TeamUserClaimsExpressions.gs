package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/user/TeamUserClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserClaimsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/user/TeamUserClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserClaimsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=TeamUserClaims_Print) at TeamUserClaims.pcf: line 59, column 25
    function action_7 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamUserClaims_Assign) at TeamUserClaims.pcf: line 46, column 25
    function allCheckedRowsAction_4 (CheckedValues :  entity.ClaimTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=TeamUserClaims_RemoveFlag) at TeamUserClaims.pcf: line 52, column 76
    function allCheckedRowsAction_5 (CheckedValues :  entity.ClaimTeamView[], CheckedValuesErrors :  java.util.Map) : void {
      TeamClaimRemoveFlagPopup.push(gw.api.team.TeamUtil.convertViewArrayToSingleClaim(CheckedValues))
    }
    
    // 'available' attribute on ToolbarButton (id=TeamUserClaims_Print) at TeamUserClaims.pcf: line 59, column 25
    function available_6 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=TeamUserClaims) at TeamUserClaims.pcf: line 8, column 84
    static function canVisit_10 (Group :  Group, User :  User) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // 'def' attribute on PanelRef at TeamUserClaims.pcf: line 62, column 59
    function def_onEnter_8 (def :  pcf.TeamClaimsLV) : void {
      def.onEnter(ClaimTeamViewList, FilterSet)
    }
    
    // 'def' attribute on PanelRef at TeamUserClaims.pcf: line 62, column 59
    function def_refreshVariables_9 (def :  pcf.TeamClaimsLV) : void {
      def.refreshVariables(ClaimTeamViewList, FilterSet)
    }
    
    // 'initialValue' attribute on Variable at TeamUserClaims.pcf: line 20, column 46
    function initialValue_0 () : gw.api.team.TeamClaimFilterSet {
      return new gw.api.team.TeamUserClaimFilterSet(User,Group)
    }
    
    // 'initialValue' attribute on Variable at TeamUserClaims.pcf: line 25, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ClaimTeamView.finder.findAll()
    }
    
    // 'initialValue' attribute on Variable at TeamUserClaims.pcf: line 29, column 30
    function initialValue_2 () : RemoveFlagInfo {
      return new RemoveFlagInfo()
    }
    
    // Page (id=TeamUserClaims) at TeamUserClaims.pcf: line 8, column 84
    static function parent_11 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.TeamUserGroup.createDestination(User,Group)
    }
    
    // 'title' attribute on Page (id=TeamUserClaims) at TeamUserClaims.pcf: line 8, column 84
    static function title_12 (Group :  Group, User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Team.UserClaimsTitle", User.DisplayName)
    }
    
    // 'title' attribute on TitleBar at TeamUserClaims.pcf: line 38, column 89
    function title_3 () : java.lang.String {
      return DisplayKey.get("Web.Team.UserClaimsTitle", User.DisplayName)
    }
    
    property get ClaimTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ClaimTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ClaimTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ClaimTeamViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.TeamUserClaims {
      return super.CurrentLocation as pcf.TeamUserClaims
    }
    
    property get FilterSet () : gw.api.team.TeamClaimFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.team.TeamClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.team.TeamClaimFilterSet) {
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
    
    property get RemoveFlagInfo () : RemoveFlagInfo {
      return getVariableValue("RemoveFlagInfo", 0) as RemoveFlagInfo
    }
    
    property set RemoveFlagInfo ($arg :  RemoveFlagInfo) {
      setVariableValue("RemoveFlagInfo", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}