package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Group {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.GroupPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.GroupPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function manageloadfactors (object :  Object) : boolean {
    return com.guidewire._generated.security.GroupPermKeys.MANAGELOADFACTORS.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.GroupPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get delete () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewloadfactors () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.VIEWLOADFACTORS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewtree () : boolean {
    return com.guidewire._generated.security.GroupPermKeys.VIEWTREE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}