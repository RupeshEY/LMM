package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekDetailDV_USExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailDV.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at BusinessWeekDetailDV.US.pcf: line 39, column 64
    function def_onEnter_9 (def :  pcf.BusinessWeekZonesLV) : void {
      def.onEnter(BusinessWeek, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at BusinessWeekDetailDV.US.pcf: line 39, column 64
    function def_refreshVariables_10 (def :  pcf.BusinessWeekZonesLV) : void {
      def.refreshVariables(BusinessWeek, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      BusinessWeek.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at BusinessWeekDetailDV.US.pcf: line 20, column 23
    function initialValue_0 () : Country {
      return typekey.Country.TC_US
    }
    
    // 'onChange' attribute on PostOnChange at BusinessWeekDetailDV.US.pcf: line 32, column 183
    function onChange_1 () : void {
      linkedZone=null;                           BusinessWeek.FilterCriteria.LinkedZone=null;                           BusinessWeek.FilterCriteria.ZoneType=zoneType
    }
    
    // 'onChange' attribute on PostOnChange at BusinessWeekDetailDV.US.pcf: line 58, column 73
    function onChange_11 () : void {
      BusinessWeek.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function valueRange_17 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function valueRange_26 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,BusinessWeek.FilterCriteria.ZoneType,BusinessWeek.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function valueRange_5 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function valueRoot_25 () : java.lang.Object {
      return BusinessWeek
    }
    
    // 'value' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function value_13 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function value_2 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function value_21 () : java.lang.String[] {
      return BusinessWeek.ZoneCodes
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function verifyValueRangeIsAllowedType_6 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function verifyValueRange_19 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function verifyValueRange_28 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,BusinessWeek.FilterCriteria.ZoneType,BusinessWeek.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_27(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at BusinessWeekDetailDV.US.pcf: line 30, column 24
    function verifyValueRange_7 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypesWithGranularity(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=state) at BusinessWeekDetailDV.US.pcf: line 56, column 69
    function visible_12 () : java.lang.Boolean {
      return BusinessWeek.FilterCriteria.ZoneType == TC_COUNTY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at BusinessWeekDetailDV.US.pcf: line 73, column 236
    function visible_20 () : java.lang.Boolean {
      return !(BusinessWeek.FilterCriteria.ZoneType==null || BusinessWeek.FilterCriteria.ZoneType==TC_ZIP                   || (BusinessWeek.FilterCriteria.ZoneType == TC_COUNTY and BusinessWeek.FilterCriteria.LinkedZone==null))
    }
    
    // 'visible' attribute on ListViewInput at BusinessWeekDetailDV.US.pcf: line 39, column 64
    function visible_8 () : java.lang.Boolean {
      return BusinessWeek.FilterCriteria.ZoneType==TC_ZIP
    }
    
    property get BusinessWeek () : BusinessWeek {
      return getRequireValue("BusinessWeek", 0) as BusinessWeek
    }
    
    property set BusinessWeek ($arg :  BusinessWeek) {
      setRequireValue("BusinessWeek", 0, $arg)
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