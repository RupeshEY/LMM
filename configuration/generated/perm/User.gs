package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class User {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.UserPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editvacation (object :  Object) : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITVACATION.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get DevAllAccess () : boolean {
    return com.guidewire._generated.security.UserPermKeys.DEVALLACCESS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditBatchProcess () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITBATCHPROCESS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditCluster () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITCLUSTER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditJProfiler () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITJPROFILER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditLog () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITLOG.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditMBeans () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITMBEANS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditPlugin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITPLUGIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditProfiler () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITPROFILER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get EditWorkQueue () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDITWORKQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ExecuteDataChange () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EXECUTEDATACHANGE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ServerTools () : boolean {
    return com.guidewire._generated.security.UserPermKeys.SERVERTOOLS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewBatchProcess () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWBATCHPROCESS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewCacheInfo () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWCACHEINFO.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewCluster () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWCLUSTER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewDataChange () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWDATACHANGE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewInfo () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWINFO.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewLog () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWLOG.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewMBeans () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWMBEANS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewPlugin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWPLUGIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewProfiler () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWPROFILER.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ViewWorkQueue () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWWORKQUEUE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get alwaysaccessdebugtools () : boolean {
    return com.guidewire._generated.security.UserPermKeys.ALWAYSACCESSDEBUGTOOLS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.UserPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get delete () : boolean {
    return com.guidewire._generated.security.UserPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get edit () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get exportadmindata () : boolean {
    return com.guidewire._generated.security.UserPermKeys.EXPORTADMINDATA.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get grantauthoritylimits () : boolean {
    return com.guidewire._generated.security.UserPermKeys.GRANTAUTHORITYLIMITS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get grantroles () : boolean {
    return com.guidewire._generated.security.UserPermKeys.GRANTROLES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ignoreacl () : boolean {
    return com.guidewire._generated.security.UserPermKeys.IGNOREACL.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get importadmindata () : boolean {
    return com.guidewire._generated.security.UserPermKeys.IMPORTADMINDATA.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get integrationadmin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.INTEGRATIONADMIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get jmxadmin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.JMXADMIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get manageattributes () : boolean {
    return com.guidewire._generated.security.UserPermKeys.MANAGEATTRIBUTES.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get printlistviews () : boolean {
    return com.guidewire._generated.security.UserPermKeys.PRINTLISTVIEWS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get resumedestination () : boolean {
    return com.guidewire._generated.security.UserPermKeys.RESUMEDESTINATION.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get ruleadmin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.RULEADMIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get soapadmin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.SOAPADMIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get suspenddestination () : boolean {
    return com.guidewire._generated.security.UserPermKeys.SUSPENDDESTINATION.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get usereditlang () : boolean {
    return com.guidewire._generated.security.UserPermKeys.USEREDITLANG.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get view () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewactcal () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWACTCAL.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewallusers () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWALLUSERS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewanyadmin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWANYADMIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewanyedb () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWANYEDB.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewdestination () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWDESTINATION.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewedbclaimact () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWEDBCLAIMACT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewedbclaimcounts () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWEDBCLAIMCOUNTS.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewedbcurrfin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWEDBCURRFIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewedbpdfin () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWEDBPDFIN.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewsearch () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWSEARCH.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewteam () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWTEAM.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  public static property get viewworkload () : boolean {
    return com.guidewire._generated.security.UserPermKeys.VIEWWORKLOAD.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}