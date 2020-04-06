package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.Integer
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupUsersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'conversionExpression' attribute on RowIterator at GroupUsersLV.pcf: line 22, column 38
    function conversionExpression_11 (PickedValue :  User) : entity.GroupUser {
      var GU = new GroupUser(); GU.User = PickedValue; return GU
    }
    
    // 'pickLocation' attribute on RowIterator at GroupUsersLV.pcf: line 22, column 38
    function pickLocation_67 () : void {
      UserSearchPopup.push(Group.Organization)
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 31, column 36
    function sortValue_0 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.User
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 37, column 37
    function sortValue_1 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Member
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 85, column 54
    function sortValue_10 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return gw.api.geocode.GeocodeScriptHelper.categorizeGeocodeStatus(GroupUser.User.Contact.PrimaryAddress.GeocodeStatus)
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 43, column 53
    function sortValue_2 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.User.Credential.Active
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 49, column 38
    function sortValue_3 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Manager
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 55, column 47
    function sortValue_4 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.LoadFactorType
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 62, column 42
    function sortValue_5 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.LoadFactor
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 68, column 111
    function sortValue_7 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return getUserWorkload(GroupUser)
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 74, column 51
    function sortValue_8 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.User.VacationStatus
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 80, column 36
    function sortValue_9 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.User.BackupUser
    }
    
    // 'toAdd' attribute on RowIterator at GroupUsersLV.pcf: line 22, column 38
    function toAdd_68 (GroupUser :  entity.GroupUser) : void {
      Group.addToUsers(GroupUser)
    }
    
    // 'toRemove' attribute on RowIterator at GroupUsersLV.pcf: line 22, column 38
    function toRemove_69 (GroupUser :  entity.GroupUser) : void {
      gw.api.assignment.workload.util.WorkloadUIHelper.checkCanRemoveGroup(GroupUser); Group.removeFromUsers(GroupUser)
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=GroupUsersLV) at GroupUsersLV.pcf: line 7, column 318
    function validationExpression_71 () : java.lang.Object {
      return Group.Users.partition(\ g -> g.User.ID).filterByValues(\ l -> l.Count > 1).Empty == false ? DisplayKey.get("JSP.GroupDetail.Group.UserAlreadyInGroup", Group.Users.partition(\ g -> g.User.ID).filterByValues(\ l -> l.Count > 1).Values.first().first().User) : null
    }
    
    // 'value' attribute on RowIterator at GroupUsersLV.pcf: line 22, column 38
    function value_70 () : entity.GroupUser[] {
      return Group.Users
    }
    
    // 'visible' attribute on RowIterator at GroupUsersLV.pcf: line 68, column 111
    function visible_6 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
    function getUserWorkload(guser : GroupUser) : Integer {
      var result : Integer = null
      if (guser.GroupUserWorkload != null) {
        result = guser.GroupUserWorkload.Workload
      }
      return result
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupUsersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 9, column 49
    function action_13 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 12, column 49
    function action_15 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 9, column 49
    function action_53 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 12, column 49
    function action_55 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 9, column 49
    function action_dest_14 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 12, column 49
    function action_dest_16 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 9, column 49
    function action_dest_54 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 12, column 49
    function action_dest_56 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'value' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.User = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Member) at GroupUsersLV.pcf: line 37, column 37
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.Member = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Active) at GroupUsersLV.pcf: line 43, column 53
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.User.Credential.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Manager) at GroupUsersLV.pcf: line 49, column 38
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.Manager = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyCell (id=GroupUsers_LoadFactorType) at GroupUsersLV.pcf: line 55, column 47
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.LoadFactorType = (__VALUE_TO_SET as typekey.LoadFactorType)
    }
    
    // 'value' attribute on TextCell (id=LoadFactor) at GroupUsersLV.pcf: line 62, column 42
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.LoadFactor = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyCell (id=VacationStatus) at GroupUsersLV.pcf: line 74, column 51
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.User.VacationStatus = (__VALUE_TO_SET as typekey.VacationStatusType)
    }
    
    // 'value' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 6, column 85
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.User.BackupUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'valueRange' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function valueRange_20 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function valueRoot_19 () : java.lang.Object {
      return GroupUser
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Active) at GroupUsersLV.pcf: line 43, column 53
    function valueRoot_32 () : java.lang.Object {
      return GroupUser.User.Credential
    }
    
    // 'value' attribute on TypeKeyCell (id=VacationStatus) at GroupUsersLV.pcf: line 74, column 51
    function valueRoot_51 () : java.lang.Object {
      return GroupUser.User
    }
    
    // 'value' attribute on UserCell (id=GroupUsers_User) at GroupUsersLV.pcf: line 31, column 36
    function value_12 () : entity.User {
      return GroupUser.User
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Member) at GroupUsersLV.pcf: line 37, column 37
    function value_25 () : java.lang.Boolean {
      return GroupUser.Member
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Active) at GroupUsersLV.pcf: line 43, column 53
    function value_29 () : java.lang.Boolean {
      return GroupUser.User.Credential.Active
    }
    
    // 'value' attribute on CheckBoxCell (id=GroupUsers_Manager) at GroupUsersLV.pcf: line 49, column 38
    function value_33 () : java.lang.Boolean {
      return GroupUser.Manager
    }
    
    // 'value' attribute on TypeKeyCell (id=GroupUsers_LoadFactorType) at GroupUsersLV.pcf: line 55, column 47
    function value_37 () : typekey.LoadFactorType {
      return GroupUser.LoadFactorType
    }
    
    // 'value' attribute on TextCell (id=LoadFactor) at GroupUsersLV.pcf: line 62, column 42
    function value_41 () : java.lang.Integer {
      return GroupUser.LoadFactor
    }
    
    // 'value' attribute on TextCell (id=WeightedWorkload) at GroupUsersLV.pcf: line 68, column 111
    function value_46 () : java.lang.Integer {
      return getUserWorkload(GroupUser)
    }
    
    // 'value' attribute on TypeKeyCell (id=VacationStatus) at GroupUsersLV.pcf: line 74, column 51
    function value_48 () : typekey.VacationStatusType {
      return GroupUser.User.VacationStatus
    }
    
    // 'value' attribute on UserCell (id=BackupUser) at GroupUsersLV.pcf: line 80, column 36
    function value_52 () : entity.User {
      return GroupUser.User.BackupUser
    }
    
    // 'value' attribute on TypeKeyCell (id=ProximitySearchStatus) at GroupUsersLV.pcf: line 85, column 54
    function value_65 () : typekey.ProximitySearchStatus {
      return gw.api.geocode.GeocodeScriptHelper.categorizeGeocodeStatus(GroupUser.User.Contact.PrimaryAddress.GeocodeStatus)
    }
    
    // 'valueRange' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_21 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_21 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_61 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_61 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_61 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=GroupUsers_User) at UserWidget.xml: line 6, column 85
    function verifyValueRange_22 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserCell (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_62 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_61(__valueRangeArg)
    }
    
    // 'visible' attribute on TextCell (id=WeightedWorkload) at GroupUsersLV.pcf: line 68, column 111
    function visible_45 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get GroupUser () : entity.GroupUser {
      return getIteratedValue(1) as entity.GroupUser
    }
    
    
  }
  
  
}