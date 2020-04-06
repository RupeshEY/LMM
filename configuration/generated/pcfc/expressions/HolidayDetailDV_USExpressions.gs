package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidayDetailDV_USExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.US.pcf: line 40, column 59
    function def_onEnter_11 (def :  pcf.HolidayZonesLV) : void {
      def.onEnter(Holiday, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at HolidayDetailDV.US.pcf: line 40, column 59
    function def_refreshVariables_12 (def :  pcf.HolidayZonesLV) : void {
      def.refreshVariables(Holiday, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Holiday.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at HolidayDetailDV.US.pcf: line 20, column 23
    function initialValue_0 () : Country {
      return typekey.Country.TC_US
    }
    
    // 'onChange' attribute on PostOnChange at HolidayDetailDV.US.pcf: line 33, column 173
    function onChange_1 () : void {
      linkedZone=null;                           Holiday.FilterCriteria.LinkedZone=null;                           Holiday.FilterCriteria.ZoneType=zoneType
    }
    
    // 'onChange' attribute on PostOnChange at HolidayDetailDV.US.pcf: line 59, column 68
    function onChange_13 () : void {
      Holiday.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function valueRange_19 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function valueRange_28 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,Holiday.FilterCriteria.ZoneType,Holiday.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function valueRange_7 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function valueRoot_27 () : java.lang.Object {
      return Holiday
    }
    
    // 'value' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function value_15 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function value_23 () : java.lang.String[] {
      return Holiday.ZoneCodes
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function value_3 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function verifyValueRange_21 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,Holiday.FilterCriteria.ZoneType,Holiday.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function verifyValueRange_9 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at HolidayDetailDV.US.pcf: line 40, column 59
    function visible_10 () : java.lang.Boolean {
      return Holiday.FilterCriteria.ZoneType==TC_ZIP
    }
    
    // 'visible' attribute on RangeInput (id=state) at HolidayDetailDV.US.pcf: line 57, column 64
    function visible_14 () : java.lang.Boolean {
      return Holiday.FilterCriteria.ZoneType == TC_COUNTY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneType) at HolidayDetailDV.US.pcf: line 31, column 46
    function visible_2 () : java.lang.Boolean {
      return !Holiday.AppliesToAllZones
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at HolidayDetailDV.US.pcf: line 74, column 216
    function visible_22 () : java.lang.Boolean {
      return !(Holiday.FilterCriteria.ZoneType==null || Holiday.FilterCriteria.ZoneType==TC_ZIP                   || (Holiday.FilterCriteria.ZoneType == TC_COUNTY and Holiday.FilterCriteria.LinkedZone==null))
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