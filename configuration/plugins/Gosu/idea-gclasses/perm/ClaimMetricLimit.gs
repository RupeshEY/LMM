package perm

uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class ClaimMetricLimit {
  public static property get create () : boolean {
    return com.guidewire._generated.security.ClaimMetricLimitPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get delete () : boolean {
    return com.guidewire._generated.security.ClaimMetricLimitPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.ClaimMetricLimitPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.ClaimMetricLimitPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}