package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserActivitiesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserActivitiesPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserActivitiesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserActivitiesPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserActivitiesPage_AssignButton) at UserActivitiesPage.pcf: line 30, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ActivityDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignActivitiesPopup.push(new gw.api.activity.ActivityAssignmentPopup(CheckedValues))
    }
    
    // 'canVisit' attribute on Page (id=UserActivitiesPage) at UserActivitiesPage.pcf: line 8, column 80
    static function canVisit_5 (User :  User) : java.lang.Boolean {
      return perm.User.view
    }
    
    // 'def' attribute on PanelRef at UserActivitiesPage.pcf: line 34, column 61
    function def_onEnter_3 (def :  pcf.DesktopActivitiesLV) : void {
      def.onEnter(ActivityDesktopViewList)
    }
    
    // 'def' attribute on PanelRef at UserActivitiesPage.pcf: line 34, column 61
    function def_refreshVariables_4 (def :  pcf.DesktopActivitiesLV) : void {
      def.refreshVariables(ActivityDesktopViewList)
    }
    
    // 'initialValue' attribute on Variable at UserActivitiesPage.pcf: line 17, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityDesktopView.finder.findAssignedToUser(User)
    }
    
    // Page (id=UserActivitiesPage) at UserActivitiesPage.pcf: line 8, column 80
    static function parent_6 (User :  User) : pcf.api.Destination {
      return pcf.UserDetailGroup.createDestination(User)
    }
    
    // 'title' attribute on TitleBar at UserActivitiesPage.pcf: line 22, column 96
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Admin.UserDetail.Activities", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=UserActivitiesPage) at UserActivitiesPage.pcf: line 8, column 80
    static function title_7 (User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Admin.UserDetail", User.DisplayName)
    }
    
    property get ActivityDesktopViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ActivityDesktopViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ActivityDesktopViewList", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.UserActivitiesPage {
      return super.CurrentLocation as pcf.UserActivitiesPage
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}