package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserExposuresPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserExposuresPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserExposuresPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserExposuresPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserExposuresPage_AssignButton) at UserExposuresPage.pcf: line 31, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.ExposureDesktopView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'canVisit' attribute on Page (id=UserExposuresPage) at UserExposuresPage.pcf: line 8, column 80
    static function canVisit_5 (User :  User) : java.lang.Boolean {
      return perm.User.view
    }
    
    // 'def' attribute on PanelRef at UserExposuresPage.pcf: line 35, column 66
    function def_onEnter_3 (def :  pcf.DesktopExposuresLV) : void {
      def.onEnter(ExposureDesktopViewList, User)
    }
    
    // 'def' attribute on PanelRef at UserExposuresPage.pcf: line 35, column 66
    function def_refreshVariables_4 (def :  pcf.DesktopExposuresLV) : void {
      def.refreshVariables(ExposureDesktopViewList, User)
    }
    
    // 'initialValue' attribute on Variable at UserExposuresPage.pcf: line 17, column 75
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ExposureDesktopView> {
      return ExposureDesktopView.finder.findAll()
    }
    
    // Page (id=UserExposuresPage) at UserExposuresPage.pcf: line 8, column 80
    static function parent_6 (User :  User) : pcf.api.Destination {
      return pcf.UserDetailGroup.createDestination(User)
    }
    
    // 'title' attribute on TitleBar at UserExposuresPage.pcf: line 22, column 95
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Admin.UserDetail.Exposures", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=UserExposuresPage) at UserExposuresPage.pcf: line 8, column 80
    static function title_7 (User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Admin.UserDetail", User.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.UserExposuresPage {
      return super.CurrentLocation as pcf.UserExposuresPage
    }
    
    property get ExposureDesktopViewList () : gw.api.database.IQueryBeanResult<ExposureDesktopView> {
      return getVariableValue("ExposureDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ExposureDesktopView>
    }
    
    property set ExposureDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ExposureDesktopView>) {
      setVariableValue("ExposureDesktopViewList", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}