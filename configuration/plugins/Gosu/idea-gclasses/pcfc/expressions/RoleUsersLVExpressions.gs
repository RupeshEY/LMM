package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RoleUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RoleUsersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/roles/RoleUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RoleUsersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at RoleUsersLV.pcf: line 28, column 45
    function valueRoot_6 () : java.lang.Object {
      return User.Contact
    }
    
    // 'value' attribute on TextCell (id=Name) at RoleUsersLV.pcf: line 28, column 45
    function value_4 () : java.lang.String {
      return User.Contact.DisplayName
    }
    
    property get User () : entity.User {
      return getIteratedValue(1) as entity.User
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/roles/RoleUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleUsersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at RoleUsersLV.pcf: line 22, column 33
    function pickLocation_7 () : void {
      MultiUserSearchPopup.push(null)
    }
    
    // 'sortBy' attribute on RowIterator at RoleUsersLV.pcf: line 28, column 45
    function sortValue_0 (User :  entity.User) : java.lang.Object {
      return User.Contact.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at RoleUsersLV.pcf: line 28, column 45
    function sortValue_1 (User :  entity.User) : java.lang.Object {
      return  User.Contact.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at RoleUsersLV.pcf: line 28, column 45
    function sortValue_2 (User :  entity.User) : java.lang.Object {
      return User.Contact.TertiarySortValue 
    }
    
    // 'sortBy' attribute on RowIterator at RoleUsersLV.pcf: line 28, column 45
    function sortValue_3 (User :  entity.User) : java.lang.Object {
      return User.Contact.QuaternarySortValue
    }
    
    // 'toAdd' attribute on RowIterator at RoleUsersLV.pcf: line 22, column 33
    function toAdd_8 (User :  entity.User) : void {
      Role.addRoleToUser(User)
    }
    
    // 'toRemove' attribute on RowIterator at RoleUsersLV.pcf: line 22, column 33
    function toRemove_9 (User :  entity.User) : void {
      Role.removeRoleFromUser(User)
    }
    
    // 'value' attribute on RowIterator at RoleUsersLV.pcf: line 22, column 33
    function value_10 () : entity.User[] {
      return Role.AllUsersArray
    }
    
    property get Role () : Role {
      return getRequireValue("Role", 0) as Role
    }
    
    property set Role ($arg :  Role) {
      setRequireValue("Role", 0, $arg)
    }
    
    
  }
  
  
}