package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Note {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.NotePermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.NotePermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function editbody (object :  Object) : boolean {
    return com.guidewire._generated.security.NotePermKeys.EDITBODY.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.NotePermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.NotePermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}