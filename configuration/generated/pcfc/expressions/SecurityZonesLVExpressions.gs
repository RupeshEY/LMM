package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityZonesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SecurityZonesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at SecurityZonesLV.pcf: line 25, column 24
    function action_2 () : void {
      SecurityZoneDetail.go(SecurityZone)
    }
    
    // 'action' attribute on TextCell (id=Name) at SecurityZonesLV.pcf: line 25, column 24
    function action_dest_3 () : pcf.api.Destination {
      return pcf.SecurityZoneDetail.createDestination(SecurityZone)
    }
    
    // 'value' attribute on TextCell (id=Name) at SecurityZonesLV.pcf: line 25, column 24
    function valueRoot_5 () : java.lang.Object {
      return SecurityZone
    }
    
    // 'value' attribute on TextCell (id=Name) at SecurityZonesLV.pcf: line 25, column 24
    function value_1 () : java.lang.String {
      return SecurityZone.Name
    }
    
    // 'value' attribute on TextCell (id=Description) at SecurityZonesLV.pcf: line 31, column 24
    function value_6 () : java.lang.String {
      return SecurityZone.Description
    }
    
    property get SecurityZone () : entity.SecurityZone {
      return getIteratedValue(1) as entity.SecurityZone
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZonesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at SecurityZonesLV.pcf: line 25, column 24
    function sortValue_0 (SecurityZone :  entity.SecurityZone) : java.lang.Object {
      return SecurityZone.Name
    }
    
    // 'value' attribute on RowIterator at SecurityZonesLV.pcf: line 15, column 79
    function value_9 () : gw.api.database.IQueryBeanResult<entity.SecurityZone> {
      return SecurityZoneList
    }
    
    property get SecurityZoneList () : gw.api.database.IQueryBeanResult<SecurityZone> {
      return getRequireValue("SecurityZoneList", 0) as gw.api.database.IQueryBeanResult<SecurityZone>
    }
    
    property set SecurityZoneList ($arg :  gw.api.database.IQueryBeanResult<SecurityZone>) {
      setRequireValue("SecurityZoneList", 0, $arg)
    }
    
    
  }
  
  
}