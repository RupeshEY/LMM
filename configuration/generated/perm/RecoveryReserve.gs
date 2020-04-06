package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class RecoveryReserve {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.RecoveryReservePermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.RecoveryReservePermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.RecoveryReservePermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  
}