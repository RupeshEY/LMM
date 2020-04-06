package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionDetailDV_CAExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.CA.pcf: line 40, column 58
    function def_onEnter_11 (def :  pcf.RegionZonesLV) : void {
      def.onEnter(Region, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.CA.pcf: line 40, column 58
    function def_refreshVariables_12 (def :  pcf.RegionZonesLV) : void {
      def.refreshVariables(Region, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Region.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at RegionDetailDV.CA.pcf: line 14, column 24
    function initialValue_0 () : ZoneType {
      return null
    }
    
    // 'initialValue' attribute on Variable at RegionDetailDV.CA.pcf: line 18, column 20
    function initialValue_1 () : Zone {
      return null
    }
    
    // 'initialValue' attribute on Variable at RegionDetailDV.CA.pcf: line 22, column 23
    function initialValue_2 () : Country {
      return typekey.Country.TC_CA
    }
    
    // 'onChange' attribute on PostOnChange at RegionDetailDV.CA.pcf: line 59, column 67
    function onChange_13 () : void {
      Region.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'onChange' attribute on PostOnChange at RegionDetailDV.CA.pcf: line 33, column 142
    function onChange_3 () : void {
      linkedZone=null;Region.FilterCriteria.LinkedZone=null;                         Region.FilterCriteria.ZoneType=zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function valueRange_19 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_PROVINCE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function valueRange_28 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,Region.FilterCriteria.ZoneType,Region.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function valueRange_7 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function valueRoot_27 () : java.lang.Object {
      return Region
    }
    
    // 'value' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function value_15 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function value_23 () : java.lang.String[] {
      return Region.ZoneCodes
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function value_4 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function verifyValueRange_21 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_PROVINCE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,Region.FilterCriteria.ZoneType,Region.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.CA.pcf: line 31, column 38
    function verifyValueRange_9 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at RegionDetailDV.CA.pcf: line 40, column 58
    function visible_10 () : java.lang.Boolean {
      return Region.FilterCriteria.ZoneType==TC_FSA
    }
    
    // 'visible' attribute on RangeInput (id=province) at RegionDetailDV.CA.pcf: line 57, column 61
    function visible_14 () : java.lang.Boolean {
      return Region.FilterCriteria.ZoneType == TC_CITY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.CA.pcf: line 75, column 210
    function visible_22 () : java.lang.Boolean {
      return !(Region.FilterCriteria.ZoneType==null || Region.FilterCriteria.ZoneType==TC_FSA                   || (Region.FilterCriteria.ZoneType == TC_CITY and Region.FilterCriteria.LinkedZone==null))
    }
    
    property get Region () : Region {
      return getRequireValue("Region", 0) as Region
    }
    
    property set Region ($arg :  Region) {
      setRequireValue("Region", 0, $arg)
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