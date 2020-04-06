package perm

uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class ExchangeRate {
  public static property get edit () : boolean {
    return com.guidewire._generated.security.ExchangeRatePermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}