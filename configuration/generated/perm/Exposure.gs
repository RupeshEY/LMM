package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Exposure {
  static function assign (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.ASSIGN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function close (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.CLOSE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function reopen (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.REOPEN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function validate (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.VALIDATE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get genericassign () : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.GENERICASSIGN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignowned () : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.GENERICASSIGNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignunowned () : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.GENERICASSIGNUNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get own () : boolean {
    return com.guidewire._generated.security.ExposurePermKeys.OWN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}