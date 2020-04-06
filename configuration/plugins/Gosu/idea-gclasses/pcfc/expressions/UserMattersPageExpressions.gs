package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserMattersPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserMattersPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserMattersPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserMattersPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=UserMattersPage_AssignButton) at UserMattersPage.pcf: line 31, column 25
    function allCheckedRowsAction_2 (CheckedValues :  entity.MatterUserView[], CheckedValuesErrors :  java.util.Map) : void {
      AssignMattersPopup.push(new gw.api.matter.MatterAssignmentPopup(CheckedValues))
    }
    
    // 'canVisit' attribute on Page (id=UserMattersPage) at UserMattersPage.pcf: line 8, column 80
    static function canVisit_5 (User :  User) : java.lang.Boolean {
      return perm.User.view
    }
    
    // 'def' attribute on PanelRef at UserMattersPage.pcf: line 35, column 50
    function def_onEnter_3 (def :  pcf.UserMattersLV) : void {
      def.onEnter(MatterUserViewList)
    }
    
    // 'def' attribute on PanelRef at UserMattersPage.pcf: line 35, column 50
    function def_refreshVariables_4 (def :  pcf.UserMattersLV) : void {
      def.refreshVariables(MatterUserViewList)
    }
    
    // 'initialValue' attribute on Variable at UserMattersPage.pcf: line 17, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return MatterUserView.finder.findAssignedToUser(User)
    }
    
    // Page (id=UserMattersPage) at UserMattersPage.pcf: line 8, column 80
    static function parent_6 (User :  User) : pcf.api.Destination {
      return pcf.UserDetailGroup.createDestination(User)
    }
    
    // 'title' attribute on TitleBar at UserMattersPage.pcf: line 22, column 93
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.Admin.UserDetail.Matters", User.DisplayName)
    }
    
    // 'title' attribute on Page (id=UserMattersPage) at UserMattersPage.pcf: line 8, column 80
    static function title_7 (User :  User) : java.lang.Object {
      return DisplayKey.get("Web.Admin.UserDetail", User.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.UserMattersPage {
      return super.CurrentLocation as pcf.UserMattersPage
    }
    
    property get MatterUserViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("MatterUserViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set MatterUserViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("MatterUserViewList", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}