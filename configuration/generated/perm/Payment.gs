package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Payment {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function deletemanual (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.DELETEMANUAL.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function deletenormal (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.DELETENORMAL.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editmanual (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.EDITMANUAL.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editnormal (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.EDITNORMAL.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function recode (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.RECODE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function stop (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.STOP.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function voidclearedpmt (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.VOIDCLEAREDPMT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function voidorstop (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.VOIDORSTOP.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function voidpmt (object :  Object) : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.VOIDPMT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get genericview () : boolean {
    return com.guidewire._generated.security.PaymentPermKeys.GENERICVIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}