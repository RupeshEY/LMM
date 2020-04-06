package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserClaimsPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserClaimsPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserClaimsPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserClaimsPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserClaimsPage_AssignButton) at UserClaimsPage.pcf: line 31, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ClaimDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(CheckedValues))
    }
    
    // 'canVisit' attribute on Page (id=UserClaimsPage) at UserClaimsPage.pcf: line 8, column 80
    static function canVisit_5 (User :  User) : java.lang.Boolean {
      return perm.User.view
    }
    
    // 'def' attribute on PanelRef at UserClaimsPage.pcf: line 35, column 67
    function def_onEnter_3 (def :  pcf.DesktopClaimsLV) : void {
      def.onEnter(ClaimDesktopViewList, User, false)
    }
    
    // 'def' attribute on PanelRef at UserClaimsPage.pcf: line 35, column 67
    function def_refreshVariables_4 (def :  pcf.DesktopClaimsLV) : void {
      def.refreshVariables(ClaimDesktopViewList, User, false)
    }
    
    // 'initialValue' attribute on Variable at UserClaimsPage.pcf: line 17, column 72
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return ClaimDesktopView.finder.findAllAndAttachClaimants()
    }
    
    // Page (id=UserClaimsPage) at UserClaimsPage.pcf: line 8, column 80
    static function parent_6 (User :  User) : pcf.api.Destination {
      return pcf.UserDetailGroup.createDestination(User)
    }
    
    // 'title' attribute on TitleBar at UserClaimsPage.pcf: line 22, column 92
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Admin.UserDetail.Claims", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=UserClaimsPage) at UserClaimsPage.pcf: line 8, column 80
    static function title_7 (User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Admin.UserDetail", User.DisplayName)
    }
    
    property get ClaimDesktopViewList () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return getVariableValue("ClaimDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ClaimDesktopView>
    }
    
    property set ClaimDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimDesktopView>) {
      setVariableValue("ClaimDesktopViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.UserClaimsPage {
      return super.CurrentLocation as pcf.UserClaimsPage
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}