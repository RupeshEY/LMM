package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheZonesInputSet_USExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.US.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheZonesInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at CatastropheZonesInputSet.US.pcf: line 39, column 61
    function def_onEnter_11 (def :  pcf.CatastropheZonesLV) : void {
      def.onEnter(Catastrophe, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at CatastropheZonesInputSet.US.pcf: line 39, column 61
    function def_refreshVariables_12 (def :  pcf.CatastropheZonesLV) : void {
      def.refreshVariables(Catastrophe, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      linkedZone = (__VALUE_TO_SET as entity.Zone)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.ZoneCodes = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'initialValue' attribute on Variable at CatastropheZonesInputSet.US.pcf: line 14, column 24
    function initialValue_0 () : ZoneType {
      return null
    }
    
    // 'initialValue' attribute on Variable at CatastropheZonesInputSet.US.pcf: line 18, column 20
    function initialValue_1 () : Zone {
      return null
    }
    
    // 'initialValue' attribute on Variable at CatastropheZonesInputSet.US.pcf: line 22, column 23
    function initialValue_2 () : Country {
      return typekey.Country.TC_US
    }
    
    // 'onChange' attribute on PostOnChange at CatastropheZonesInputSet.US.pcf: line 58, column 70
    function onChange_13 () : void {
      Catastrophe.FilterCriteria.LinkedZone=linkedZone
    }
    
    // 'onChange' attribute on PostOnChange at CatastropheZonesInputSet.US.pcf: line 32, column 127
    function onChange_3 () : void {
      linkedZone=null; Catastrophe.FilterCriteria.LinkedZone=null; Catastrophe.FilterCriteria.ZoneType=zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function valueRange_19 () : java.lang.Object {
      return Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function valueRange_28 () : java.lang.Object {
      return Zone.finder.findZoneCodes(country,Catastrophe.FilterCriteria.ZoneType,Catastrophe.FilterCriteria.LinkedZone)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function valueRange_7 () : java.lang.Object {
      return Catastrophe.getRelevantZoneTypesForCountry(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function valueRoot_27 () : java.lang.Object {
      return Catastrophe
    }
    
    // 'value' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function value_15 () : entity.Zone {
      return linkedZone
    }
    
    // 'value' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function value_23 () : java.lang.String[] {
      return Catastrophe.ZoneCodes
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function value_4 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Zone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Zone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function verifyValueRange_21 () : void {
      var __valueRangeArg = Zone.finder.findZones(country,typekey.ZoneType.TC_STATE)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Zone.finder.findZoneCodes(country,Catastrophe.FilterCriteria.ZoneType,Catastrophe.FilterCriteria.LinkedZone)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.US.pcf: line 30, column 36
    function verifyValueRange_9 () : void {
      var __valueRangeArg = Catastrophe.getRelevantZoneTypesForCountry(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at CatastropheZonesInputSet.US.pcf: line 39, column 61
    function visible_10 () : java.lang.Boolean {
      return Catastrophe.FilterCriteria.ZoneType==TC_ZIP
    }
    
    // 'visible' attribute on RangeInput (id=state) at CatastropheZonesInputSet.US.pcf: line 56, column 116
    function visible_14 () : java.lang.Boolean {
      return Catastrophe.FilterCriteria.ZoneType == TC_COUNTY or Catastrophe.FilterCriteria.ZoneType == TC_CITY
    }
    
    // 'visible' attribute on RangeInput (id=ZoneInput) at CatastropheZonesInputSet.US.pcf: line 71, column 273
    function visible_22 () : java.lang.Boolean {
      return not (Catastrophe.FilterCriteria.ZoneType == null or Catastrophe.FilterCriteria.ZoneType == TC_ZIP or ((Catastrophe.FilterCriteria.ZoneType == TC_COUNTY or Catastrophe.FilterCriteria.ZoneType == TC_CITY) and Catastrophe.FilterCriteria.LinkedZone == null))
    }
    
    property get Catastrophe () : Catastrophe {
      return getRequireValue("Catastrophe", 0) as Catastrophe
    }
    
    property set Catastrophe ($arg :  Catastrophe) {
      setRequireValue("Catastrophe", 0, $arg)
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