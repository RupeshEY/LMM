package perm

uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class AttributeUser {
  public static property get create () : boolean {
    return com.guidewire._generated.security.AttributeUserPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get delete () : boolean {
    return com.guidewire._generated.security.AttributeUserPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.AttributeUserPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}