package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RolesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/roles/RolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RolesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at RolesLV.pcf: line 30, column 24
    function action_3 () : void {
      RoleDetailPage.go(Role)
    }
    
    // 'action' attribute on TextCell (id=Name) at RolesLV.pcf: line 30, column 24
    function action_dest_4 () : pcf.api.Destination {
      return pcf.RoleDetailPage.createDestination(Role)
    }
    
    // 'value' attribute on TextCell (id=Name) at RolesLV.pcf: line 30, column 24
    function valueRoot_6 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Name) at RolesLV.pcf: line 30, column 24
    function value_2 () : java.lang.String {
      return Role.Name
    }
    
    // 'value' attribute on TextCell (id=Description) at RolesLV.pcf: line 36, column 24
    function value_7 () : java.lang.String {
      return Role.Description
    }
    
    property get Role () : entity.Role {
      return getIteratedValue(1) as entity.Role
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/roles/RolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at RolesLV.pcf: line 30, column 24
    function sortValue_0 (Role :  entity.Role) : java.lang.Object {
      return Role.Name
    }
    
    // 'value' attribute on RowIterator at RolesLV.pcf: line 36, column 24
    function sortValue_1 (Role :  entity.Role) : java.lang.Object {
      return Role.Description
    }
    
    // 'value' attribute on RowIterator at RolesLV.pcf: line 20, column 33
    function value_10 () : entity.Role[] {
      return RoleList
    }
    
    property get RoleList () : Role[] {
      return getRequireValue("RoleList", 0) as Role[]
    }
    
    property set RoleList ($arg :  Role[]) {
      setRequireValue("RoleList", 0, $arg)
    }
    
    
  }
  
  
}