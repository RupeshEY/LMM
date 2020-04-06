package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityZoneDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZoneDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Delete) at SecurityZoneDetailScreen.pcf: line 18, column 74
    function action_3 () : void {
      deleteSecurityZone()
    }
    
    // 'available' attribute on ToolbarButton (id=Delete) at SecurityZoneDetailScreen.pcf: line 18, column 74
    function available_1 () : java.lang.Boolean {
      return !isSecurityZoneInUse()
    }
    
    // 'def' attribute on PanelRef at SecurityZoneDetailScreen.pcf: line 21, column 49
    function def_onEnter_4 (def :  pcf.SecurityZoneDetailDV) : void {
      def.onEnter(securityZone)
    }
    
    // 'def' attribute on PanelRef at SecurityZoneDetailScreen.pcf: line 23, column 234
    function def_onEnter_6 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(securityZone, { "Name", "Description" }, { DisplayKey.get("Web.Admin.SecurityZoneDetailDV.Name"), DisplayKey.get("Web.Admin.SecurityZoneDetailDV.Description") })
    }
    
    // 'def' attribute on PanelRef at SecurityZoneDetailScreen.pcf: line 21, column 49
    function def_refreshVariables_5 (def :  pcf.SecurityZoneDetailDV) : void {
      def.refreshVariables(securityZone)
    }
    
    // 'def' attribute on PanelRef at SecurityZoneDetailScreen.pcf: line 23, column 234
    function def_refreshVariables_7 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(securityZone, { "Name", "Description" }, { DisplayKey.get("Web.Admin.SecurityZoneDetailDV.Name"), DisplayKey.get("Web.Admin.SecurityZoneDetailDV.Description") })
    }
    
    // EditButtons at SecurityZoneDetailScreen.pcf: line 11, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'visible' attribute on ToolbarButton (id=Delete) at SecurityZoneDetailScreen.pcf: line 18, column 74
    function visible_2 () : java.lang.Boolean {
      return perm.SecurityZone.delete && !securityZone.New
    }
    
    property get securityZone () : SecurityZone {
      return getRequireValue("securityZone", 0) as SecurityZone
    }
    
    property set securityZone ($arg :  SecurityZone) {
      setRequireValue("securityZone", 0, $arg)
    }
    
    
    function deleteSecurityZone() {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
        bundle.add(securityZone).remove()
      })
      SecurityZones.go()
    }
    
    function isSecurityZoneInUse() : boolean {
      return !securityZone.New and Query.make(entity.Group).compare("SecurityZone", Equals, securityZone).select().Count > 0
    }
    
    
  }
  
  
}