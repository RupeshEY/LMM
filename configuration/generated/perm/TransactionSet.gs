package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class TransactionSet {
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.TransactionSetPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  
}