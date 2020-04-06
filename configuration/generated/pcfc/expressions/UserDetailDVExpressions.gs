package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.Integer
@javax.annotation.Generated("config/web/pcf/admin/users/UserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UserDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserRole.Role = (__VALUE_TO_SET as entity.Role)
    }
    
    // Reflect at UserDetailDV.pcf: line 80, column 38
    function reflectionValue_28 (TRIGGER_INDEX :  int, VALUE :  entity.Role) : java.lang.Object {
      return VALUE.Description
    }
    
    // 'valueRange' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function valueRange_25 () : java.lang.Object {
      return AllRoles
    }
    
    // 'value' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function valueRoot_24 () : java.lang.Object {
      return UserRole
    }
    
    // 'value' attribute on TextCell (id=Description) at UserDetailDV.pcf: line 78, column 51
    function valueRoot_31 () : java.lang.Object {
      return UserRole.Role
    }
    
    // 'value' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function value_21 () : entity.Role {
      return UserRole.Role
    }
    
    // 'value' attribute on TextCell (id=Description) at UserDetailDV.pcf: line 78, column 51
    function value_29 () : java.lang.String {
      return UserRole.Role.Description
    }
    
    // 'valueRange' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function verifyValueRangeIsAllowedType_26 ($$arg :  entity.Role[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function verifyValueRangeIsAllowedType_26 ($$arg :  gw.api.database.IQueryBeanResult<entity.Role>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Name) at UserDetailDV.pcf: line 74, column 42
    function verifyValueRange_27 () : void {
      var __valueRangeArg = AllRoles
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    property get UserRole () : entity.UserRole {
      return getIteratedValue(1) as entity.UserRole
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at UserDetailDV.pcf: line 90, column 75
    function def_onEnter_35 (def :  pcf.UserGroupsLV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on InputSetRef (id=UserDetailCommons) at UserDetailDV.pcf: line 32, column 33
    function def_onEnter_4 (def :  pcf.UserDetailInputSet) : void {
      def.onEnter(User,new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(User.Contact)))
    }
    
    // 'def' attribute on ListViewInput at UserDetailDV.pcf: line 90, column 75
    function def_refreshVariables_36 (def :  pcf.UserGroupsLV) : void {
      def.refreshVariables(User)
    }
    
    // 'def' attribute on InputSetRef (id=UserDetailCommons) at UserDetailDV.pcf: line 32, column 33
    function def_refreshVariables_5 (def :  pcf.UserDetailInputSet) : void {
      def.refreshVariables(User,new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(User.Contact)))
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.UserSettings.StartupPage = (__VALUE_TO_SET as typekey.StartupPage)
    }
    
    // 'initialValue' attribute on Variable at UserDetailDV.pcf: line 16, column 60
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Role> {
      return Role.finder.allOrderedByName()
    }
    
    // 'initialValue' attribute on Variable at UserDetailDV.pcf: line 20, column 27
    function initialValue_1 () : UserContact {
      return getContact()
    }
    
    // 'label' attribute on Label at UserDetailDV.pcf: line 27, column 26
    function label_3 () : java.lang.String {
      return linkStatus.LinkStatusMessage
    }
    
    // 'value' attribute on RowIterator at UserDetailDV.pcf: line 74, column 42
    function sortValue_19 (UserRole :  entity.UserRole) : java.lang.Object {
      return UserRole.Role
    }
    
    // 'value' attribute on RowIterator at UserDetailDV.pcf: line 78, column 51
    function sortValue_20 (UserRole :  entity.UserRole) : java.lang.Object {
      return UserRole.Role.Description
    }
    
    // 'toAdd' attribute on RowIterator at UserDetailDV.pcf: line 64, column 43
    function toAdd_32 (UserRole :  entity.UserRole) : void {
      User.addToRoles(UserRole)
    }
    
    // 'toRemove' attribute on RowIterator at UserDetailDV.pcf: line 64, column 43
    function toRemove_33 (UserRole :  entity.UserRole) : void {
      User.removeFromRoles(UserRole)
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function valueRange_12 () : java.lang.Object {
      return User.VisibleStartupPages
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function valueRoot_11 () : java.lang.Object {
      return User.UserSettings
    }
    
    // 'value' attribute on TextInput (id=Workload) at UserDetailDV.pcf: line 46, column 109
    function value_16 () : java.lang.Integer {
      return getUserWorkload(User)
    }
    
    // 'value' attribute on RowIterator at UserDetailDV.pcf: line 64, column 43
    function value_34 () : entity.UserRole[] {
      return User.Roles
    }
    
    // 'value' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function value_7 () : typekey.StartupPage {
      return User.UserSettings.StartupPage
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function verifyValueRangeIsAllowedType_13 ($$arg :  typekey.StartupPage[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function verifyValueRange_14 () : void {
      var __valueRangeArg = User.VisibleStartupPages
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Workload) at UserDetailDV.pcf: line 46, column 109
    function visible_15 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on Label at UserDetailDV.pcf: line 24, column 39
    function visible_2 () : java.lang.Boolean {
      return User.AccountLocked
    }
    
    // 'visible' attribute on RangeInput (id=StartupPage) at UserDetailDV.pcf: line 40, column 30
    function visible_6 () : java.lang.Boolean {
      return !User.New
    }
    
    property get AllRoles () : gw.api.database.IQueryBeanResult<Role> {
      return getVariableValue("AllRoles", 0) as gw.api.database.IQueryBeanResult<Role>
    }
    
    property set AllRoles ($arg :  gw.api.database.IQueryBeanResult<Role>) {
      setVariableValue("AllRoles", 0, $arg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    property get UserContact () : UserContact {
      return getVariableValue("UserContact", 0) as UserContact
    }
    
    property set UserContact ($arg :  UserContact) {
      setVariableValue("UserContact", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    
    function getContact() : UserContact {
      if (User.Contact == null) {
        User.Contact = new UserContact()
      } 
      return User.Contact
    }
    
    function getUserWorkload(usr : User) : Integer {
      return usr.TotalUserWorkload
    }
    
    
  }
  
  
}