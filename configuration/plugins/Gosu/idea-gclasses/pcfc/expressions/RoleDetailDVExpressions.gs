package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RoleDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RoleDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      rolePrivilege.Permission = (__VALUE_TO_SET as typekey.SystemPermissionType)
    }
    
    // 'editable' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function editable_14 () : java.lang.Boolean {
      return perm.RolePrivilege.edit
    }
    
    // 'valueRange' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function valueRange_20 () : java.lang.Object {
      return getValueRange(rolePrivilege.Permission)
    }
    
    // 'value' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function valueRoot_19 () : java.lang.Object {
      return rolePrivilege
    }
    
    // 'value' attribute on TextCell (id=Code) at RoleDetailDV.pcf: line 68, column 56
    function valueRoot_25 () : java.lang.Object {
      return rolePrivilege.Permission
    }
    
    // 'value' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function value_15 () : typekey.SystemPermissionType {
      return rolePrivilege.Permission
    }
    
    // 'value' attribute on TextCell (id=Code) at RoleDetailDV.pcf: line 68, column 56
    function value_23 () : java.lang.String {
      return rolePrivilege.Permission.Code
    }
    
    // 'value' attribute on TextCell (id=Description) at RoleDetailDV.pcf: line 72, column 63
    function value_26 () : java.lang.String {
      return rolePrivilege.Permission.Description
    }
    
    // 'valueRange' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function verifyValueRangeIsAllowedType_21 ($$arg :  typekey.SystemPermissionType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Permission) at RoleDetailDV.pcf: line 61, column 58
    function verifyValueRange_22 () : void {
      var __valueRangeArg = getValueRange(rolePrivilege.Permission)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    property get rolePrivilege () : entity.RolePrivilege {
      return getIteratedValue(1) as entity.RolePrivilege
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Name) at RoleDetailDV.pcf: line 23, column 28
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      role.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at RoleDetailDV.pcf: line 29, column 35
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      role.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at RoleDetailDV.pcf: line 14, column 38
    function initialValue_0 () : SystemPermissionType[] {
      return getAvailablePermissions()
    }
    
    // 'sortBy' attribute on RowIterator at RoleDetailDV.pcf: line 61, column 58
    function sortValue_11 (rolePrivilege :  entity.RolePrivilege) : java.lang.Object {
      return rolePrivilege.Permission
    }
    
    // 'value' attribute on RowIterator at RoleDetailDV.pcf: line 68, column 56
    function sortValue_12 (rolePrivilege :  entity.RolePrivilege) : java.lang.Object {
      return rolePrivilege.Permission.Code
    }
    
    // 'value' attribute on RowIterator at RoleDetailDV.pcf: line 72, column 63
    function sortValue_13 (rolePrivilege :  entity.RolePrivilege) : java.lang.Object {
      return rolePrivilege.Permission.Description
    }
    
    // 'toAdd' attribute on RowIterator at RoleDetailDV.pcf: line 49, column 48
    function toAdd_29 (rolePrivilege :  entity.RolePrivilege) : void {
      role.addToPrivileges(rolePrivilege)
    }
    
    // 'toRemove' attribute on RowIterator at RoleDetailDV.pcf: line 49, column 48
    function toRemove_30 (rolePrivilege :  entity.RolePrivilege) : void {
      role.removeFromPrivileges(rolePrivilege)
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=RolePrivilegesLV) at RoleDetailDV.pcf: line 40, column 95
    function validationExpression_32 () : java.lang.Object {
      return gw.api.admin.AdminUtil.checkForDuplicateRolePrivileges(role)
    }
    
    // 'value' attribute on TextInput (id=Name) at RoleDetailDV.pcf: line 23, column 28
    function valueRoot_4 () : java.lang.Object {
      return role
    }
    
    // 'value' attribute on TextInput (id=Name) at RoleDetailDV.pcf: line 23, column 28
    function value_1 () : java.lang.String {
      return role.Name
    }
    
    // 'value' attribute on RowIterator at RoleDetailDV.pcf: line 49, column 48
    function value_31 () : entity.RolePrivilege[] {
      return role.Privileges
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at RoleDetailDV.pcf: line 29, column 35
    function value_5 () : java.lang.String {
      return role.Description
    }
    
    // 'removeVisible' attribute on IteratorButtons at RoleDetailDV.pcf: line 36, column 56
    function visible_10 () : java.lang.Boolean {
      return perm.RolePrivilege.delete
    }
    
    // 'addVisible' attribute on IteratorButtons at RoleDetailDV.pcf: line 36, column 56
    function visible_9 () : java.lang.Boolean {
      return perm.RolePrivilege.create
    }
    
    property get availablePermissions () : SystemPermissionType[] {
      return getVariableValue("availablePermissions", 0) as SystemPermissionType[]
    }
    
    property set availablePermissions ($arg :  SystemPermissionType[]) {
      setVariableValue("availablePermissions", 0, $arg)
    }
    
    property get role () : Role {
      return getRequireValue("role", 0) as Role
    }
    
    property set role ($arg :  Role) {
      setRequireValue("role", 0, $arg)
    }
    
    function getAvailablePermissions() : SystemPermissionType[] {
              // Returns all permissions that are not already associated with "Role"
              var allPermissions = typekey.SystemPermissionType.getTypeKeys( false )
              var permissionsInUse = role.Privileges*.Permission
              return allPermissions.subtract(permissionsInUse.toSet()).toTypedArray()
          }
    
         function getValueRange(permission : SystemPermissionType) : SystemPermissionType[] {
             // Returns the available permissions with "permission" added if it's non-null. This is needed so
             // the range cell can display the currently set permission, which is no longer available.
             return (permission == null) ? availablePermissions : availablePermissions.union({permission}).toTypedArray()
         }
    
    
  }
  
  
}