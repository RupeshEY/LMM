package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/NewSecurityZone.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewSecurityZoneExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/NewSecurityZone.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewSecurityZoneExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewSecurityZone) at NewSecurityZone.pcf: line 14, column 67
    function afterCancel_3 () : void {
      SecurityZones.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewSecurityZone) at NewSecurityZone.pcf: line 14, column 67
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.SecurityZones.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewSecurityZone) at NewSecurityZone.pcf: line 14, column 67
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      SecurityZones.go()
    }
    
    // 'canVisit' attribute on Page (id=NewSecurityZone) at NewSecurityZone.pcf: line 14, column 67
    static function canVisit_6 () : java.lang.Boolean {
      return perm.SecurityZone.create
    }
    
    // 'def' attribute on ScreenRef at NewSecurityZone.pcf: line 22, column 53
    function def_onEnter_1 (def :  pcf.SecurityZoneDetailScreen) : void {
      def.onEnter(SecurityZone)
    }
    
    // 'def' attribute on ScreenRef at NewSecurityZone.pcf: line 22, column 53
    function def_refreshVariables_2 (def :  pcf.SecurityZoneDetailScreen) : void {
      def.refreshVariables(SecurityZone)
    }
    
    // 'initialValue' attribute on Variable at NewSecurityZone.pcf: line 20, column 28
    function initialValue_0 () : SecurityZone {
      return new SecurityZone()
    }
    
    // 'parent' attribute on Page (id=NewSecurityZone) at NewSecurityZone.pcf: line 14, column 67
    static function parent_7 () : pcf.api.Destination {
      return pcf.SecurityZones.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewSecurityZone {
      return super.CurrentLocation as pcf.NewSecurityZone
    }
    
    property get SecurityZone () : SecurityZone {
      return getVariableValue("SecurityZone", 0) as SecurityZone
    }
    
    property set SecurityZone ($arg :  SecurityZone) {
      setVariableValue("SecurityZone", 0, $arg)
    }
    
    
  }
  
  
}