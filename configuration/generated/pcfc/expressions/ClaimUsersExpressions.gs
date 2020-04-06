package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimUsersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUsersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimUsers_AddUserButton) at ClaimUsers.pcf: line 34, column 57
    function action_3 () : void {
      GroupUserPickerPopup.push()
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimUsers_AddUserButton) at ClaimUsers.pcf: line 34, column 57
    function action_dest_4 () : pcf.api.Destination {
      return pcf.GroupUserPickerPopup.createDestination()
    }
    
    // 'afterCancel' attribute on Page (id=ClaimUsers) at ClaimUsers.pcf: line 11, column 62
    function afterCancel_14 () : void {
      PageHelper.afterCancel(claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimUsers_ButtonButton) at ClaimUsers.pcf: line 42, column 57
    function allCheckedRowsAction_7 (CheckedValues :  entity.ClaimUserModel[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.claimparties.ClaimUserUtil.removeUserRoles(CurrentLocation, CheckedValues)
    }
    
    // 'canVisit' attribute on Page (id=ClaimUsers) at ClaimUsers.pcf: line 11, column 62
    static function canVisit_16 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewclaimparties
    }
    
    // 'initialValue' attribute on Variable at ClaimUsers.pcf: line 17, column 56
    function initialValue_0 () : gw.api.claimparties.ClaimUsersPageHelper {
      return new gw.api.claimparties.ClaimUsersPageHelper()
    }
    
    // 'initialValue' attribute on Variable at ClaimUsers.pcf: line 24, column 33
    function initialValue_1 () : ClaimUserModelSet {
      return claim.ClaimUserModelSet
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=ClaimUsers_AddUserButton) at ClaimUsers.pcf: line 34, column 57
    function onPick_5 (PickedValue :  GroupUser) : void {
      gw.api.claimparties.ClaimUserUtil.addClaimUser(PickedValue, claimUserModelSet, CurrentLocation)
    }
    
    // Page (id=ClaimUsers) at ClaimUsers.pcf: line 11, column 62
    static function parent_17 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPartiesGroup.createDestination(claim)
    }
    
    // 'startEditing' attribute on Page (id=ClaimUsers) at ClaimUsers.pcf: line 11, column 62
    function startEditing_18 () : void {
      PageHelper.startEditing()
    }
    
    // 'visible' attribute on PickerToolbarButton (id=ClaimUsers_AddUserButton) at ClaimUsers.pcf: line 34, column 57
    function visible_2 () : java.lang.Boolean {
      return perm.Claim.manageclaimusers(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimUsers {
      return super.CurrentLocation as pcf.ClaimUsers
    }
    
    property get PageHelper () : gw.api.claimparties.ClaimUsersPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.claimparties.ClaimUsersPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.claimparties.ClaimUsersPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimUserModelSet () : ClaimUserModelSet {
      return getVariableValue("claimUserModelSet", 0) as ClaimUserModelSet
    }
    
    property set claimUserModelSet ($arg :  ClaimUserModelSet) {
      setVariableValue("claimUserModelSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimUsersExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimUsers.pcf: line 55, column 62
    function def_onEnter_11 (def :  pcf.ClaimUserDetailDV) : void {
      def.onEnter(claimUserModel, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimUsers.pcf: line 49, column 66
    function def_onEnter_8 (def :  pcf.ClaimUsersLV) : void {
      def.onEnter(claimUserModelSet.ClaimUserModels)
    }
    
    // 'def' attribute on PanelRef at ClaimUsers.pcf: line 55, column 62
    function def_refreshVariables_12 (def :  pcf.ClaimUserDetailDV) : void {
      def.refreshVariables(claimUserModel, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimUsers.pcf: line 49, column 66
    function def_refreshVariables_9 (def :  pcf.ClaimUsersLV) : void {
      def.refreshVariables(claimUserModelSet.ClaimUserModels)
    }
    
    // EditButtons at ClaimUsers.pcf: line 57, column 31
    function label_10 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Card (id=UserDetailsCard) at ClaimUsers.pcf: line 53, column 103
    function title_13 () : java.lang.String {
      return DisplayKey.get("Web.ClaimUsers.UserDetails.Title", claimUserModel.User)
    }
    
    property get claimUserModel () : ClaimUserModel {
      return getCurrentSelection(1) as ClaimUserModel
    }
    
    property set claimUserModel ($arg :  ClaimUserModel) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}