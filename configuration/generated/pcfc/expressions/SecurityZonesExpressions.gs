package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityZonesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZonesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=SecurityZones_AddSecurityZoneButton) at SecurityZones.pcf: line 24, column 25
    function action_1 () : void {
      NewSecurityZone.go()
    }
    
    // 'action' attribute on ToolbarButton (id=SecurityZones_AddSecurityZoneButton) at SecurityZones.pcf: line 24, column 25
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewSecurityZone.createDestination()
    }
    
    // 'canVisit' attribute on Page (id=SecurityZones) at SecurityZones.pcf: line 9, column 65
    static function canVisit_5 () : java.lang.Boolean {
      return perm.SecurityZone.view
    }
    
    // 'def' attribute on PanelRef at SecurityZones.pcf: line 27, column 47
    function def_onEnter_3 (def :  pcf.SecurityZonesLV) : void {
      def.onEnter(securityZones)
    }
    
    // 'def' attribute on PanelRef at SecurityZones.pcf: line 27, column 47
    function def_refreshVariables_4 (def :  pcf.SecurityZonesLV) : void {
      def.refreshVariables(securityZones)
    }
    
    // 'initialValue' attribute on Variable at SecurityZones.pcf: line 13, column 75
    function initialValue_0 () : gw.api.database.IQueryBeanResult<entity.SecurityZone> {
      return gw.api.database.Query.make(entity.SecurityZone).select()
    }
    
    // Page (id=SecurityZones) at SecurityZones.pcf: line 9, column 65
    static function parent_6 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    override property get CurrentLocation () : pcf.SecurityZones {
      return super.CurrentLocation as pcf.SecurityZones
    }
    
    property get securityZones () : gw.api.database.IQueryBeanResult<entity.SecurityZone> {
      return getVariableValue("securityZones", 0) as gw.api.database.IQueryBeanResult<entity.SecurityZone>
    }
    
    property set securityZones ($arg :  gw.api.database.IQueryBeanResult<entity.SecurityZone>) {
      setVariableValue("securityZones", 0, $arg)
    }
    
    
  }
  
  
}