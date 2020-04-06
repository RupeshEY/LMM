package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Roles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RolesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Roles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Roles_AddRoleButton) at Roles.pcf: line 19, column 25
    function action_0 () : void {
      NewRole.go()
    }
    
    // 'action' attribute on ToolbarButton (id=Roles_AddRoleButton) at Roles.pcf: line 19, column 25
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewRole.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Roles_DeleteButton) at Roles.pcf: line 27, column 39
    function allCheckedRowsAction_3 (CheckedValues :  entity.Role[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteRoles(CheckedValues)
    }
    
    // 'canVisit' attribute on Page (id=Roles) at Roles.pcf: line 8, column 57
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Role.view
    }
    
    // 'def' attribute on PanelRef at Roles.pcf: line 30, column 62
    function def_onEnter_4 (def :  pcf.RolesLV) : void {
      def.onEnter(gw.api.admin.AdminUtil.getAllRoles())
    }
    
    // 'def' attribute on PanelRef at Roles.pcf: line 30, column 62
    function def_refreshVariables_5 (def :  pcf.RolesLV) : void {
      def.refreshVariables(gw.api.admin.AdminUtil.getAllRoles())
    }
    
    // Page (id=Roles) at Roles.pcf: line 8, column 57
    static function parent_7 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=Roles_DeleteButton) at Roles.pcf: line 27, column 39
    function visible_2 () : java.lang.Boolean {
      return perm.Role.delete
    }
    
    override property get CurrentLocation () : pcf.Roles {
      return super.CurrentLocation as pcf.Roles
    }
    
    
  }
  
  
}