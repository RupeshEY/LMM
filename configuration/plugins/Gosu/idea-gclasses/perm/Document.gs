package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Document {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.DocumentPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.DocumentPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.DocumentPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.DocumentPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericdelete () : boolean {
    return com.guidewire._generated.security.DocumentPermKeys.GENERICDELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}