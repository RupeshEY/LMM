package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheZonesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheZonesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at CatastropheZonesLV.pcf: line 31, column 24
    function sortBy_0 (catastropheZone :  entity.CatastropheZone) : java.lang.Object {
      return catastropheZone.Code
    }
    
    // 'value' attribute on RowIterator at CatastropheZonesLV.pcf: line 41, column 41
    function sortValue_1 (catastropheZone :  entity.CatastropheZone) : java.lang.Object {
      return catastropheZone.Code
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at CatastropheZonesLV.pcf: line 28, column 44
    function toCreateAndAdd_7 () : entity.CatastropheZone {
      return createNewCatastropheZone()
    }
    
    // 'toRemove' attribute on RowIterator at CatastropheZonesLV.pcf: line 28, column 44
    function toRemove_8 (catastropheZone :  entity.CatastropheZone) : void {
      catastrophe.removeFromCatastropheZones(catastropheZone)
    }
    
    // 'value' attribute on RowIterator at CatastropheZonesLV.pcf: line 28, column 44
    function value_9 () : entity.CatastropheZone[] {
      return catastrophe.getCatastropheZones(zoneType)
    }
    
    property get catastrophe () : Catastrophe {
      return getRequireValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setRequireValue("catastrophe", 0, $arg)
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
    
    
    function createNewCatastropheZone() : CatastropheZone {
      var newCatastropheZone = new CatastropheZone()
      newCatastropheZone.ZoneType = zoneType
      newCatastropheZone.Country = country
      catastrophe.addToCatastropheZones(newCatastropheZone)
      return newCatastropheZone
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CatastropheZonesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextCell (id=ZoneCode) at CatastropheZonesLV.pcf: line 41, column 41
    function autoComplete_6 () : gw.api.contact.AutocompleteHandler {
      return new gw.api.admin.ZoneAutocompleteHandler(country, zoneType)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at CatastropheZonesLV.pcf: line 41, column 41
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      catastropheZone.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at CatastropheZonesLV.pcf: line 41, column 41
    function valueRoot_5 () : java.lang.Object {
      return catastropheZone
    }
    
    // 'value' attribute on TextCell (id=ZoneCode) at CatastropheZonesLV.pcf: line 41, column 41
    function value_2 () : java.lang.String {
      return catastropheZone.Code
    }
    
    property get catastropheZone () : entity.CatastropheZone {
      return getIteratedValue(1) as entity.CatastropheZone
    }
    
    
  }
  
  
}