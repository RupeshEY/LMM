package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidayZonesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayZonesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at HolidayZonesLV.pcf: line 31, column 24
    function sortBy_0 (HolidayZone :  entity.HolidayZone) : java.lang.Object {
      return HolidayZone.Code
    }
    
    // 'value' attribute on RowIterator at HolidayZonesLV.pcf: line 41, column 37
    function sortValue_1 (HolidayZone :  entity.HolidayZone) : java.lang.Object {
      return HolidayZone.Code
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at HolidayZonesLV.pcf: line 28, column 40
    function toCreateAndAdd_7 () : entity.HolidayZone {
      return createNewHolidayZone()
    }
    
    // 'toRemove' attribute on RowIterator at HolidayZonesLV.pcf: line 28, column 40
    function toRemove_8 (HolidayZone :  entity.HolidayZone) : void {
      Holiday.removeFromHolidayZones(HolidayZone)
    }
    
    // 'value' attribute on RowIterator at HolidayZonesLV.pcf: line 28, column 40
    function value_9 () : entity.HolidayZone[] {
      return Holiday.getHolidayZones(zoneType)
    }
    
    property get Holiday () : Holiday {
      return getRequireValue("Holiday", 0) as Holiday
    }
    
    property set Holiday ($arg :  Holiday) {
      setRequireValue("Holiday", 0, $arg)
    }
    
    property get country () : Country {
      return getRequireValue("country", 0) as Country
    }
    
    property set country ($arg :  Country) {
      setRequireValue("country", 0, $arg)
    }
    
    property get zoneType () : ZoneType {
      return getRequireValue("zoneType", 0) as ZoneType
    }
    
    property set zoneType ($arg :  ZoneType) {
      setRequireValue("zoneType", 0, $arg)
    }
    
    
    function createNewHolidayZone() : HolidayZone {
      var newHolidayZone = new HolidayZone()
      newHolidayZone.ZoneType = zoneType
      newHolidayZone.Country = country
      Holiday.addToHolidayZones(newHolidayZone)
      return newHolidayZone
    }
    
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends HolidayZonesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextCell (id=ZoneCode) at HolidayZonesLV.pcf: line 41, column 37
    function autoComplete_6 () : gw.api.contact.AutocompleteHandler {
      return new gw.api.admin.ZoneAutocompleteHandler(country, zoneType)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at HolidayZonesLV.pcf: line 41, column 37
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      HolidayZone.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at HolidayZonesLV.pcf: line 41, column 37
    function valueRoot_5 () : java.lang.Object {
      return HolidayZone
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at HolidayZonesLV.pcf: line 41, column 37
    function value_2 () : java.lang.String {
      return HolidayZone.Code
    }
    
    property get HolidayZone () : entity.HolidayZone {
      return getIteratedValue(1) as entity.HolidayZone
    }
    
    
  }
  
  
}