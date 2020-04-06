package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/newuser/NewUser.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewUserExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/newuser/NewUser.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewUserExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=NewUser_DeleteUserButton) at NewUser.pcf: line 36, column 62
    function action_4 () : void {
      gw.api.admin.AdminUtil.deleteUser(User); AdminWelcome.go();
    }
    
    // 'afterCancel' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    function afterCancel_20 () : void {
      AdminWelcome.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    function afterCancel_dest_21 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    function afterCommit_22 (TopLocation :  pcf.api.Location) : void {
      UserDetailPage.go(User)
    }
    
    // 'beforeCommit' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    function beforeCommit_23 (pickedValue :  java.lang.Object) : void {
      gw.api.admin.UserAuthorityLimitUtil.cleanUpUnusedCustomProfiles(User)
    }
    
    // 'canVisit' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    static function canVisit_24 () : java.lang.Boolean {
      return perm.User.create
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 65, column 47
    function def_onEnter_11 (def :  pcf.UserAuthorityLimitsDV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 75, column 42
    function def_onEnter_14 (def :  pcf.UserAttributesLV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 89, column 38
    function def_onEnter_17 (def :  pcf.UserRegionLV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 45, column 50
    function def_onEnter_5 (def :  pcf.UserDetailDV) : void {
      def.onEnter(User, linkStatus)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 55, column 51
    function def_onEnter_8 (def :  pcf.UserProfileDV) : void {
      def.onEnter(User, linkStatus)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 65, column 47
    function def_refreshVariables_12 (def :  pcf.UserAuthorityLimitsDV) : void {
      def.refreshVariables(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 75, column 42
    function def_refreshVariables_15 (def :  pcf.UserAttributesLV) : void {
      def.refreshVariables(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 89, column 38
    function def_refreshVariables_18 (def :  pcf.UserRegionLV) : void {
      def.refreshVariables(User)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 45, column 50
    function def_refreshVariables_6 (def :  pcf.UserDetailDV) : void {
      def.refreshVariables(User, linkStatus)
    }
    
    // 'def' attribute on PanelRef at NewUser.pcf: line 55, column 51
    function def_refreshVariables_9 (def :  pcf.UserProfileDV) : void {
      def.refreshVariables(User, linkStatus)
    }
    
    // 'initialValue' attribute on Variable at NewUser.pcf: line 21, column 20
    function initialValue_0 () : User {
      return new User()
    }
    
    // 'initialValue' attribute on Variable at NewUser.pcf: line 25, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return User.Contact == null ? null : gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(User.Contact)
    }
    
    // EditButtons at NewUser.pcf: line 29, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    static function parent_25 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'startEditing' attribute on Page (id=NewUser) at NewUser.pcf: line 15, column 59
    function startEditing_26 () : void {
      User.Credential = new Credential(); User.initPreferences()
    }
    
    // 'visible' attribute on ToolbarButton (id=NewUser_DeleteUserButton) at NewUser.pcf: line 36, column 62
    function visible_3 () : java.lang.Boolean {
      return  User.SafeToDelete and perm.User.delete
    }
    
    // 'visible' attribute on Card (id=BasicsCard) at NewUser.pcf: line 43, column 38
    function visible_7 () : java.lang.Boolean {
      return perm.User.create
    }
    
    override property get CurrentLocation () : pcf.NewUser {
      return super.CurrentLocation as pcf.NewUser
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    
  }
  
  
}