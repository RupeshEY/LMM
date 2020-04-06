package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserGroupsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserGroupsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserGroupsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UserGroupsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_11 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_9 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_dest_10 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_dest_12 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'value' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.Group = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Member) at UserGroupsLV.pcf: line 40, column 37
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.Member = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Manager) at UserGroupsLV.pcf: line 47, column 38
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.Manager = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyCell (id=LoadFactorType) at UserGroupsLV.pcf: line 54, column 47
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.LoadFactorType = (__VALUE_TO_SET as typekey.LoadFactorType)
    }
    
    // 'value' attribute on TextCell (id=LoadFactor) at UserGroupsLV.pcf: line 62, column 42
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      GroupUser.LoadFactor = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'validationExpression' attribute on TextCell (id=LoadFactor) at UserGroupsLV.pcf: line 62, column 42
    function validationExpression_33 () : java.lang.Object {
      return !(GroupUser.LoadFactor < 0 or GroupUser.LoadFactor > 100) ? null : DisplayKey.get("NVV.Admin.GroupBasics.AdminGroupDetails.Assignment.LoadFactor.OutOfRange")
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRange_16 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRoot_15 () : java.lang.Object {
      return GroupUser
    }
    
    // 'value' attribute on BooleanRadioCell (id=Member) at UserGroupsLV.pcf: line 40, column 37
    function value_21 () : java.lang.Boolean {
      return GroupUser.Member
    }
    
    // 'value' attribute on BooleanRadioCell (id=Manager) at UserGroupsLV.pcf: line 47, column 38
    function value_25 () : java.lang.Boolean {
      return GroupUser.Manager
    }
    
    // 'value' attribute on TypeKeyCell (id=LoadFactorType) at UserGroupsLV.pcf: line 54, column 47
    function value_29 () : typekey.LoadFactorType {
      return GroupUser.LoadFactorType
    }
    
    // 'value' attribute on TextCell (id=LoadFactor) at UserGroupsLV.pcf: line 62, column 42
    function value_34 () : java.lang.Integer {
      return GroupUser.LoadFactor
    }
    
    // 'value' attribute on TextCell (id=GroupUserWeightedWorkload) at UserGroupsLV.pcf: line 68, column 111
    function value_40 () : java.lang.Integer {
      return getWeightedWorkload(GroupUser)
    }
    
    // 'value' attribute on GroupCell (id=Group) at UserGroupsLV.pcf: line 31, column 35
    function value_8 () : entity.Group {
      return GroupUser.Group
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_17 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_17 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_18 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'visible' attribute on TextCell (id=GroupUserWeightedWorkload) at UserGroupsLV.pcf: line 68, column 111
    function visible_39 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get GroupUser () : entity.GroupUser {
      return getIteratedValue(1) as entity.GroupUser
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserGroupsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserGroupsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'conversionExpression' attribute on RowIterator at UserGroupsLV.pcf: line 22, column 38
    function conversionExpression_7 (PickedValue :  Group) : entity.GroupUser {
      var GU : GroupUser = null; if(User == null or !PickedValue.isMember(User?.ID)){GU = new GroupUser(); PickedValue.addToUsers(GU)}; return GU
    }
    
    // 'pickLocation' attribute on RowIterator at UserGroupsLV.pcf: line 22, column 38
    function pickLocation_42 () : void {
      OrganizationGroupTreePopup.push()
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 31, column 35
    function sortValue_0 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Group
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 40, column 37
    function sortValue_1 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Member
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 47, column 38
    function sortValue_2 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Manager
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 54, column 47
    function sortValue_3 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.LoadFactorType
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 62, column 42
    function sortValue_4 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.LoadFactor
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 68, column 111
    function sortValue_6 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return getWeightedWorkload(GroupUser)
    }
    
    // 'toAdd' attribute on RowIterator at UserGroupsLV.pcf: line 22, column 38
    function toAdd_43 (GroupUser :  entity.GroupUser) : void {
      gw.api.admin.GroupUserUtil.add(User,GroupUser)
    }
    
    // 'toRemove' attribute on RowIterator at UserGroupsLV.pcf: line 22, column 38
    function toRemove_44 (GroupUser :  entity.GroupUser) : void {
      gw.api.assignment.workload.util.WorkloadUIHelper.checkCanRemoveGroup(GroupUser); gw.api.admin.GroupUserUtil.remove(User,GroupUser.Group)
    }
    
    // 'value' attribute on RowIterator at UserGroupsLV.pcf: line 22, column 38
    function value_45 () : entity.GroupUser[] {
      return User.AllGroupUsersAsArray
    }
    
    // 'visible' attribute on RowIterator at UserGroupsLV.pcf: line 68, column 111
    function visible_5 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    function getWeightedWorkload(gu : GroupUser) : java.lang.Integer {
      var result : java.lang.Integer = null
      if (gu.GroupUserWorkload != null) {
        result = gu.GroupUserWorkload.Workload
      }
      return result
    }
    
    
  }
  
  
}