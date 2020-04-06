package perm

uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class ActivityRule {
  public static property get approve () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.APPROVE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get delete () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get deploy () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.DEPLOY.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get import () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.IMPORT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.ActivityRulePermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}