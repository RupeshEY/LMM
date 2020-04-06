package perm

uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class ClaimAssociation {
  public static property get delete () : boolean {
    return com.guidewire._generated.security.ClaimAssociationPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.ClaimAssociationPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.ClaimAssociationPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}