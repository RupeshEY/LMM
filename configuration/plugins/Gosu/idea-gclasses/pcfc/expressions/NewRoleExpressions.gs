package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/NewRole.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRoleExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/roles/NewRole.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRoleExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewRole) at NewRole.pcf: line 14, column 59
    function afterCancel_3 () : void {
      Roles.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewRole) at NewRole.pcf: line 14, column 59
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.Roles.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewRole) at NewRole.pcf: line 14, column 59
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      Roles.go()
    }
    
    // 'canVisit' attribute on Page (id=NewRole) at NewRole.pcf: line 14, column 59
    static function canVisit_6 () : java.lang.Boolean {
      return perm.Role.create
    }
    
    // 'def' attribute on ScreenRef at NewRole.pcf: line 22, column 37
    function def_onEnter_1 (def :  pcf.RoleDetailScreen) : void {
      def.onEnter(Role)
    }
    
    // 'def' attribute on ScreenRef at NewRole.pcf: line 22, column 37
    function def_refreshVariables_2 (def :  pcf.RoleDetailScreen) : void {
      def.refreshVariables(Role)
    }
    
    // 'initialValue' attribute on Variable at NewRole.pcf: line 20, column 20
    function initialValue_0 () : Role {
      return new Role()
    }
    
    // 'parent' attribute on Page (id=NewRole) at NewRole.pcf: line 14, column 59
    static function parent_7 () : pcf.api.Destination {
      return pcf.Roles.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewRole {
      return super.CurrentLocation as pcf.NewRole
    }
    
    property get Role () : Role {
      return getVariableValue("Role", 0) as Role
    }
    
    property set Role ($arg :  Role) {
      setVariableValue("Role", 0, $arg)
    }
    
    
  }
  
  
}