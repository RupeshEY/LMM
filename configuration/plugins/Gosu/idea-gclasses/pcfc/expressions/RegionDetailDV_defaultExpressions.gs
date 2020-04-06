package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionDetailDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.default.pcf: line 35, column 36
    function def_onEnter_9 (def :  pcf.RegionZonesLV) : void {
      def.onEnter(Region, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at RegionDetailDV.default.pcf: line 35, column 36
    function def_refreshVariables_10 (def :  pcf.RegionZonesLV) : void {
      def.refreshVariables(Region, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at RegionDetailDV.default.pcf: line 17, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'onChange' attribute on PostOnChange at RegionDetailDV.default.pcf: line 28, column 63
    function onChange_1 () : void {
      Region.FilterCriteria.ZoneType=zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function valueRange_5 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function value_2 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionDetailDV.default.pcf: line 26, column 38
    function verifyValueRange_7 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at RegionDetailDV.default.pcf: line 35, column 36
    function visible_8 () : java.lang.Boolean {
      return zoneType != null
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
    
    property get zoneType () : ZoneType {
      return getVariableValue("zoneType", 0) as ZoneType
    }
    
    property set zoneType ($arg :  ZoneType) {
      setVariableValue("zoneType", 0, $arg)
    }
    
    
  }
  
  
}