package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionDetailDV_USExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.US.pcf: line 38, column 58
    function def_onEnter_9 (def :  pcf.RegionZonesLV) : void {
      def.onEnter(Region, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.US.pcf: line 38, column 58
    function def_refreshVariables_10 (def :  pcf.RegionZonesLV) : void {
      def.refreshVariables(Region, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Region.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at RegionDetailDV.US.pcf: line 20, column 23
    function initialValue_0 () : Country {
      return typekey.Country.TC_US
    }
    
    // 'onChange' attribute on PostOnChange at RegionDetailDV.US.pcf: line 31, column 171
    function onChange_1 () : void {
      linkedZone=null;                           Region.FilterCriteria.LinkedZone=null;                           Region.FilterCriteria.ZoneType=zoneType
    }
    
    // 'onChange' attribute on PostOnChange at RegionDetailDV.US.pcf: line 57, column 67
    function onChange_11 () : void {
      Region.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function valueRange_17 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function valueRange_26 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,Region.FilterCriteria.ZoneType,Region.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function valueRange_5 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function valueRoot_25 () : java.lang.Object {
      return Region
    }
    
    // 'value' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function value_13 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function value_2 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function value_21 () : java.lang.String[] {
      return Region.ZoneCodes
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function verifyValueRange_19 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function verifyValueRange_28 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,Region.FilterCriteria.ZoneType,Region.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_27(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.US.pcf: line 29, column 38
    function verifyValueRange_7 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=state) at RegionDetailDV.US.pcf: line 55, column 63
    function visible_12 () : java.lang.Boolean {
      return Region.FilterCriteria.ZoneType == TC_COUNTY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at RegionDetailDV.US.pcf: line 72, column 212
    function visible_20 () : java.lang.Boolean {
      return !(Region.FilterCriteria.ZoneType==null || Region.FilterCriteria.ZoneType==TC_ZIP                   || (Region.FilterCriteria.ZoneType == TC_COUNTY and Region.FilterCriteria.LinkedZone==null))
    }
    
    // 'visible' attribute on ListViewInput at RegionDetailDV.US.pcf: line 38, column 58
    function visible_8 () : java.lang.Boolean {
      return Region.FilterCriteria.ZoneType==TC_ZIP
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