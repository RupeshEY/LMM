package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidayDetailDV_CAExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.CA.pcf: line 42, column 59
    function def_onEnter_13 (def :  pcf.HolidayZonesLV) : void {
      def.onEnter(Holiday, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.CA.pcf: line 42, column 59
    function def_refreshVariables_14 (def :  pcf.HolidayZonesLV) : void {
      def.refreshVariables(Holiday, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      Holiday.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.CA.pcf: line 14, column 24
    function initialValue_0 () : ZoneType {
      return null
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.CA.pcf: line 18, column 20
    function initialValue_1 () : Zone {
      return null
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.CA.pcf: line 22, column 23
    function initialValue_2 () : Country {
      return typekey.Country.TC_CA
    }
    
    // 'onChange' attribute on PostOnChange at HolidayDetailDV.CA.pcf: line 61, column 68
    function onChange_15 () : void {
      Holiday.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'onChange' attribute on PostOnChange at HolidayDetailDV.CA.pcf: line 35, column 144
    function onChange_3 () : void {
      linkedZone=null;Holiday.FilterCriteria.LinkedZone=null;                         Holiday.FilterCriteria.ZoneType=zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function valueRange_21 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_PROVINCE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function valueRange_30 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,Holiday.FilterCriteria.ZoneType,Holiday.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function valueRange_9 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function valueRoot_29 () : java.lang.Object {
      return Holiday
    }
    
    // 'value' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function value_17 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function value_25 () : java.lang.String[] {
      return Holiday.ZoneCodes
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function value_5 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function verifyValueRangeIsAllowedType_10 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function verifyValueRangeIsAllowedType_22 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function verifyValueRangeIsAllowedType_22 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function verifyValueRangeIsAllowedType_22 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function verifyValueRange_11 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function verifyValueRange_23 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_PROVINCE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_22(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function verifyValueRange_32 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,Holiday.FilterCriteria.ZoneType,Holiday.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at HolidayDetailDV.CA.pcf: line 42, column 59
    function visible_12 () : java.lang.Boolean {
      return Holiday.FilterCriteria.ZoneType==TC_FSA
    }
    
    // 'visible' attribute on RangeInput (id=province) at HolidayDetailDV.CA.pcf: line 59, column 62
    function visible_16 () : java.lang.Boolean {
      return Holiday.FilterCriteria.ZoneType == TC_CITY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.CA.pcf: line 77, column 214
    function visible_24 () : java.lang.Boolean {
      return !(Holiday.FilterCriteria.ZoneType==null || Holiday.FilterCriteria.ZoneType==TC_FSA                   || (Holiday.FilterCriteria.ZoneType == TC_CITY and Holiday.FilterCriteria.LinkedZone==null))
    }
    
    // 'visible' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.CA.pcf: line 33, column 46
    function visible_4 () : java.lang.Boolean {
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
    
    property get linkedZone () : Zone {
      return getVariableValue("linkedZone", 0) as Zone
    }
    
    property set linkedZone ($arg :  Zone) {
      setVariableValue("linkedZone", 0, $arg)
    }
    
    property get zoneType () : ZoneType {
      return getVariableValue("zoneType", 0) as ZoneType
    }
    
    property set zoneType ($arg :  ZoneType) {
      setVariableValue("zoneType", 0, $arg)
    }
    
    
  }
  
  
}