package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionZonesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RegionZonesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextCell (id=ZoneCode) at RegionZonesLV.pcf: line 41, column 28
    function autoComplete_6 () : gw.api.contact.AutocompleteHandler {
      return new gw.api.admin.ZoneAutocompleteHandler(c, zt)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at RegionZonesLV.pcf: line 41, column 28
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      rz.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at RegionZonesLV.pcf: line 41, column 28
    function valueRoot_5 () : java.lang.Object {
      return rz
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at RegionZonesLV.pcf: line 41, column 28
    function value_2 () : java.lang.String {
      return rz.Code
    }
    
    property get rz () : entity.RegionZone {
      return getIteratedValue(1) as entity.RegionZone
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionZonesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at RegionZonesLV.pcf: line 31, column 24
    function sortBy_0 (rz :  entity.RegionZone) : java.lang.Object {
      return rz.Code
    }
    
    // 'value' attribute on RowIterator at RegionZonesLV.pcf: line 41, column 28
    function sortValue_1 (rz :  entity.RegionZone) : java.lang.Object {
      return rz.Code
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at RegionZonesLV.pcf: line 28, column 39
    function toCreateAndAdd_7 () : entity.RegionZone {
      return createNewRegionZone()
    }
    
    // 'toRemove' attribute on RowIterator at RegionZonesLV.pcf: line 28, column 39
    function toRemove_8 (rz :  entity.RegionZone) : void {
      r.removeFromRegionZones(rz)
    }
    
    // 'value' attribute on RowIterator at RegionZonesLV.pcf: line 28, column 39
    function value_9 () : entity.RegionZone[] {
      return r.getRegionZones(zt)
    }
    
    property get c () : Country {
      return getRequireValue("c", 0) as Country
    }
    
    property set c ($arg :  Country) {
      setRequireValue("c", 0, $arg)
    }
    
    property get r () : Region {
      return getRequireValue("r", 0) as Region
    }
    
    property set r ($arg :  Region) {
      setRequireValue("r", 0, $arg)
    }
    
    property get zt () : ZoneType {
      return getRequireValue("zt", 0) as ZoneType
    }
    
    property set zt ($arg :  ZoneType) {
      setRequireValue("zt", 0, $arg)
    }
    
    
    function createNewRegionZone() : RegionZone {
            var newRegionZone = new RegionZone()
            newRegionZone.ZoneType=zt
            newRegionZone.Country=c
            r.addToRegionZones(newRegionZone)
            return newRegionZone
          }
        
    
    
  }
  
  
}