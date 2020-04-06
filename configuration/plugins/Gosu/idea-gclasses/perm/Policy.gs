package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Policy {
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.PolicyPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function makeeditable (object :  Object) : boolean {
    return com.guidewire._generated.security.PolicyPermKeys.MAKEEDITABLE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.PolicyPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get createunverifiedpolicy () : boolean {
    return com.guidewire._generated.security.PolicyPermKeys.CREATEUNVERIFIEDPOLICY.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}