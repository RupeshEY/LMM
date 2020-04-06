package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Activity {
  static function approve (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.APPROVE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function assign (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.ASSIGN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function makemandatory (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.MAKEMANDATORY.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function own (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.OWN.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get approveany () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.APPROVEANY.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get assignfromqueue () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.ASSIGNFROMQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassign () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.GENERICASSIGN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignowned () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.GENERICASSIGNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get genericassignunowned () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.GENERICASSIGNUNOWNED.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get makemandatory () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.MAKEMANDATORY.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get nextfromqueue () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.NEXTFROMQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get own () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.OWN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get pickfromqueue () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.PICKFROMQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get reviewassignment () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.REVIEWASSIGNMENT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewallqueues () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.VIEWALLQUEUES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewqueue () : boolean {
    return com.guidewire._generated.security.ActivityPermKeys.VIEWQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}