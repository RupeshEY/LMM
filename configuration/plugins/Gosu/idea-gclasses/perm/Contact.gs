package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Contact {
  static function createab (object :  Object) : boolean {
    return com.guidewire._generated.security.ContactPermKeys.CREATEAB.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function deleteab (object :  Object) : boolean {
    return com.guidewire._generated.security.ContactPermKeys.DELETEAB.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editab (object :  Object) : boolean {
    return com.guidewire._generated.security.ContactPermKeys.EDITAB.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editlocal (object :  Object) : boolean {
    return com.guidewire._generated.security.ContactPermKeys.EDITLOCAL.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function viewab (object :  Object) : boolean {
    return com.guidewire._generated.security.ContactPermKeys.VIEWAB.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get createab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.CREATEAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get createlocal () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.CREATELOCAL.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get createpreferredab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.CREATEPREFERREDAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get deleteab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.DELETEAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get deletepreferredab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.DELETEPREFERREDAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get editab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.EDITAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get editpreferredab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.EDITPREFERREDAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.VIEWAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewlocal () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.VIEWLOCAL.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewsearchab () : boolean {
    return com.guidewire._generated.security.ContactPermKeys.VIEWSEARCHAB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}