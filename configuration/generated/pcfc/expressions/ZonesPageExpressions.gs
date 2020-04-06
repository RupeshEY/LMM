package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/zones/ZonesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ZonesPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/zones/ZonesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ZonesPageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ZonesPage.pcf: line 47, column 34
    function valueRoot_9 () : java.lang.Object {
      return zone
    }
    
    // 'value' attribute on TextCell (id=Code) at ZonesPage.pcf: line 51, column 34
    function value_10 () : java.lang.String {
      return zone.Code
    }
    
    // 'value' attribute on TypeKeyCell (id=ZoneType) at ZonesPage.pcf: line 56, column 45
    function value_13 () : typekey.ZoneType {
      return zone.ZoneType
    }
    
    // 'value' attribute on TypeKeyCell (id=Country) at ZonesPage.pcf: line 61, column 44
    function value_16 () : typekey.Country {
      return zone.Country
    }
    
    // 'value' attribute on TextCell (id=Name) at ZonesPage.pcf: line 47, column 34
    function value_7 () : java.lang.String {
      return zone.Name
    }
    
    property get zone () : entity.Zone {
      return getIteratedValue(1) as entity.Zone
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/zones/ZonesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZonesPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ZonesPage) at ZonesPage.pcf: line 9, column 31
    function canEdit_20 () : java.lang.Boolean {
      return perm.System.zonemanage
    }
    
    // 'canVisit' attribute on Page (id=ZonesPage) at ZonesPage.pcf: line 9, column 31
    static function canVisit_21 () : java.lang.Boolean {
      return perm.System.zoneview
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ZonesPage.pcf: line 34, column 139
    function filters_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.TypeKeyFilterSet( Zone.Type.TypeInfo.getProperty( "ZoneType" ) ).getFilterOptions()
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ZonesPage.pcf: line 40, column 166
    function filters_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.TypeKeyFilterSet( Zone.Type.TypeInfo.getProperty( "Country" ) ).getFilterOptions(getCustomCountryList(), true)
    }
    
    // 'initialValue' attribute on Variable at ZonesPage.pcf: line 13, column 60
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Zone> {
      return gw.api.database.Query.make(Zone).select()
    }
    
    // Page (id=ZonesPage) at ZonesPage.pcf: line 9, column 31
    static function parent_22 () : pcf.api.Destination {
      return pcf.Zones.createDestination()
    }
    
    // 'value' attribute on RowIterator at ZonesPage.pcf: line 47, column 34
    function sortValue_3 (zone :  entity.Zone) : java.lang.Object {
      return zone.Name
    }
    
    // 'value' attribute on RowIterator at ZonesPage.pcf: line 51, column 34
    function sortValue_4 (zone :  entity.Zone) : java.lang.Object {
      return zone.Code
    }
    
    // 'value' attribute on RowIterator at ZonesPage.pcf: line 56, column 45
    function sortValue_5 (zone :  entity.Zone) : java.lang.Object {
      return zone.ZoneType
    }
    
    // 'value' attribute on RowIterator at ZonesPage.pcf: line 61, column 44
    function sortValue_6 (zone :  entity.Zone) : java.lang.Object {
      return zone.Country
    }
    
    // 'value' attribute on RowIterator at ZonesPage.pcf: line 29, column 75
    function value_19 () : gw.api.database.IQueryBeanResult<entity.Zone> {
      return zones
    }
    
    override property get CurrentLocation () : pcf.ZonesPage {
      return super.CurrentLocation as pcf.ZonesPage
    }
    
    property get zones () : gw.api.database.IQueryBeanResult<Zone> {
      return getVariableValue("zones", 0) as gw.api.database.IQueryBeanResult<Zone>
    }
    
    property set zones ($arg :  gw.api.database.IQueryBeanResult<Zone>) {
      setVariableValue("zones", 0, $arg)
    }
    
    function getCustomCountryList() : java.util.List<Country> {
      return Zone.finder.findLoadedCountries().toList()
    }
    
    
  }
  
  
}