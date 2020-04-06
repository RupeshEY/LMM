package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekZonesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekZonesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at BusinessWeekZonesLV.pcf: line 31, column 24
    function sortBy_0 (BusinessWeekZone :  entity.BusinessWeekZone) : java.lang.Object {
      return BusinessWeekZone.Code
    }
    
    // 'value' attribute on RowIterator at BusinessWeekZonesLV.pcf: line 41, column 42
    function sortValue_1 (BusinessWeekZone :  entity.BusinessWeekZone) : java.lang.Object {
      return BusinessWeekZone.Code
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at BusinessWeekZonesLV.pcf: line 28, column 45
    function toCreateAndAdd_7 () : entity.BusinessWeekZone {
      return createNewBusinessWeekZone()
    }
    
    // 'toRemove' attribute on RowIterator at BusinessWeekZonesLV.pcf: line 28, column 45
    function toRemove_8 (BusinessWeekZone :  entity.BusinessWeekZone) : void {
      BusinessWeek.removeFromBusinessWeekZones(BusinessWeekZone)
    }
    
    // 'value' attribute on RowIterator at BusinessWeekZonesLV.pcf: line 28, column 45
    function value_9 () : entity.BusinessWeekZone[] {
      return BusinessWeek.getBusinessWeekZones(zoneType)
    }
    
    property get BusinessWeek () : BusinessWeek {
      return getRequireValue("BusinessWeek", 0) as BusinessWeek
    }
    
    property set BusinessWeek ($arg :  BusinessWeek) {
      setRequireValue("BusinessWeek", 0, $arg)
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
    
    
    function createNewBusinessWeekZone() : BusinessWeekZone {
      var newBusinessWeekZone = new BusinessWeekZone()
      newBusinessWeekZone.ZoneType = zoneType
      newBusinessWeekZone.Country = country
      BusinessWeek.addToBusinessWeekZones(newBusinessWeekZone)
      return newBusinessWeekZone
    }
    
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BusinessWeekZonesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextCell (id=ZoneCode) at BusinessWeekZonesLV.pcf: line 41, column 42
    function autoComplete_6 () : gw.api.contact.AutocompleteHandler {
      return new gw.api.admin.ZoneAutocompleteHandler(country, zoneType)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at BusinessWeekZonesLV.pcf: line 41, column 42
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      BusinessWeekZone.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at BusinessWeekZonesLV.pcf: line 41, column 42
    function valueRoot_5 () : java.lang.Object {
      return BusinessWeekZone
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at BusinessWeekZonesLV.pcf: line 41, column 42
    function value_2 () : java.lang.String {
      return BusinessWeekZone.Code
    }
    
    property get BusinessWeekZone () : entity.BusinessWeekZone {
      return getIteratedValue(1) as entity.BusinessWeekZone
    }
    
    
  }
  
  
}