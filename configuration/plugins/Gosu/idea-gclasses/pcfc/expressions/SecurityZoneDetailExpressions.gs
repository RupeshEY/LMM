package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityZoneDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZoneDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (securityZone :  SecurityZone) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    function afterCancel_2 () : void {
      SecurityZones.go()
    }
    
    // 'afterCancel' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.SecurityZones.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      SecurityZones.go()
    }
    
    // 'canEdit' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    function canEdit_5 () : java.lang.Boolean {
      return perm.SecurityZone.edit
    }
    
    // 'canVisit' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    static function canVisit_6 (securityZone :  SecurityZone) : java.lang.Boolean {
      return perm.SecurityZone.view
    }
    
    // 'def' attribute on ScreenRef at SecurityZoneDetail.pcf: line 20, column 53
    function def_onEnter_0 (def :  pcf.SecurityZoneDetailScreen) : void {
      def.onEnter(securityZone)
    }
    
    // 'def' attribute on ScreenRef at SecurityZoneDetail.pcf: line 20, column 53
    function def_refreshVariables_1 (def :  pcf.SecurityZoneDetailScreen) : void {
      def.refreshVariables(securityZone)
    }
    
    // 'parent' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    static function parent_7 (securityZone :  SecurityZone) : pcf.api.Destination {
      return pcf.SecurityZones.createDestination()
    }
    
    // 'title' attribute on Page (id=SecurityZoneDetail) at SecurityZoneDetail.pcf: line 13, column 89
    static function title_8 (securityZone :  SecurityZone) : java.lang.Object {
      return DisplayKey.get("Web.Admin.SecurityZoneDetail", securityZone.Name)
    }
    
    override property get CurrentLocation () : pcf.SecurityZoneDetail {
      return super.CurrentLocation as pcf.SecurityZoneDetail
    }
    
    property get securityZone () : SecurityZone {
      return getVariableValue("securityZone", 0) as SecurityZone
    }
    
    property set securityZone ($arg :  SecurityZone) {
      setVariableValue("securityZone", 0, $arg)
    }
    
    
  }
  
  
}