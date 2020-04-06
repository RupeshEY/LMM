package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidayDetailDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.default.pcf: line 45, column 36
    function def_onEnter_17 (def :  pcf.HolidayZonesLV) : void {
      def.onEnter(Holiday, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.default.pcf: line 45, column 36
    function def_refreshVariables_18 (def :  pcf.HolidayZonesLV) : void {
      def.refreshVariables(Holiday, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at HolidayDetailDV.default.pcf: line 27, column 47
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Holiday.Zones = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.default.pcf: line 14, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.default.pcf: line 18, column 24
    function initialValue_1 () : ZoneType {
      return Holiday.HolidayZones.IsEmpty ? (country == typekey.Country.TC_US ? typekey.ZoneType.TC_STATE : typekey.ZoneType.TC_COUNTRY) : Holiday.HolidayZones.first().ZoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function valueRange_13 () : java.lang.Object {
      return getRelevantZoneTypes(country)
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at HolidayDetailDV.default.pcf: line 27, column 47
    function valueRoot_7 () : java.lang.Object {
      return Holiday
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at HolidayDetailDV.default.pcf: line 27, column 47
    function value_3 () : java.lang.String {
      return Holiday.Zones
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function value_9 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function verifyValueRangeIsAllowedType_14 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.default.pcf: line 37, column 46
    function verifyValueRange_15 () : void {
      var __valueRangeArg = getRelevantZoneTypes(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at HolidayDetailDV.default.pcf: line 45, column 36
    function visible_16 () : java.lang.Boolean {
      return zoneType != null
    }
    
    // 'visible' attribute on TextAreaInput (id=Zones) at HolidayDetailDV.default.pcf: line 27, column 47
    function visible_2 () : java.lang.Boolean {
      return !Holiday.AppliesToAllZones
    }
    
    property get Holiday () : Holiday {
      return getRequireValue("Holiday", 0) as Holiday
    }
    
    property set Holiday ($arg :  Holiday) {
      setRequireValue("Holiday", 0, $arg)
    }
    
    property get country () : Country {
      return getVariableValue("country", 0) as Country
    }
    
    property set country ($arg :  Country) {
      setVariableValue("country", 0, $arg)
    }
    
    property get zoneType () : ZoneType {
      return getVariableValue("zoneType", 0) as ZoneType
    }
    
    property set zoneType ($arg :  ZoneType) {
      setVariableValue("zoneType", 0, $arg)
    }
    
    function getPossibleCountries() : java.util.List<Country> {
      var org = User.util.CurrentUser.Organization
      if (org == null) {
        org = User.util.UnrestrictedUser.Organization
      }
      return org.Countries
    }
    
    function getRelevantZoneTypes(countryVar : Country) : java.util.List<ZoneType> {
      var allTypeKeys = typekey.ZoneType.getTypeKeys( false )
      return allTypeKeys.where( \ z -> ( z.Categories.hasMatch( \ c -> c.Code == countryVar.Code ) ) )
    }
    
    function getZoneInputValueRange(first : String[], second : String[]) : String[] {
      var both = new java.util.ArrayList<String>()
      java.util.Collections.addAll(both, first)
      java.util.Collections.addAll(both, second)
    
      var h = new java.util.HashSet<String>(both)
      both.clear()
      both.addAll(h)
    
      return both.toArray(new String[] {})
    }
    
    
  }
  
  
}