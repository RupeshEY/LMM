package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RoleDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/roles/RoleDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 21, column 44
    function def_onEnter_3 (def :  pcf.RoleDetailDV) : void {
      def.onEnter(Role)
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 23, column 212
    function def_onEnter_5 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(Role, { "Name", "Description"}, { DisplayKey.get("Web.Admin.RoleDetailDV.Name"), DisplayKey.get("Web.Admin.RoleDetailDV.Description")})
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 31, column 43
    function def_onEnter_8 (def :  pcf.RoleUsersLV) : void {
      def.onEnter(Role)
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 21, column 44
    function def_refreshVariables_4 (def :  pcf.RoleDetailDV) : void {
      def.refreshVariables(Role)
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 23, column 212
    function def_refreshVariables_6 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(Role, { "Name", "Description"}, { DisplayKey.get("Web.Admin.RoleDetailDV.Name"), DisplayKey.get("Web.Admin.RoleDetailDV.Description")})
    }
    
    // 'def' attribute on PanelRef at RoleDetailScreen.pcf: line 31, column 43
    function def_refreshVariables_9 (def :  pcf.RoleUsersLV) : void {
      def.refreshVariables(Role)
    }
    
    // 'editable' attribute on PanelRef at RoleDetailScreen.pcf: line 21, column 44
    function editable_2 () : java.lang.Boolean {
      return perm.Role.edit(Role)
    }
    
    // 'editable' attribute on PanelRef at RoleDetailScreen.pcf: line 31, column 43
    function editable_7 () : java.lang.Boolean {
      return perm.User.grantroles
    }
    
    // EditButtons at RoleDetailScreen.pcf: line 12, column 71
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'editVisible' attribute on EditButtons at RoleDetailScreen.pcf: line 12, column 71
    function visible_0 () : java.lang.Boolean {
      return (perm.Role.edit(Role) or perm.User.grantroles)
    }
    
    property get Role () : Role {
      return getRequireValue("Role", 0) as Role
    }
    
    property set Role ($arg :  Role) {
      setRequireValue("Role", 0, $arg)
    }
    
    
  }
  
  
}