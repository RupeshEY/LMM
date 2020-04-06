package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheZonesInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheZonesInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at CatastropheZonesInputSet.default.pcf: line 33, column 34
    function def_onEnter_8 (def :  pcf.CatastropheZonesLV) : void {
      def.onEnter(Catastrophe, zoneType, country)
    }
    
    // 'def' attribute on ListViewInput at CatastropheZonesInputSet.default.pcf: line 33, column 34
    function def_refreshVariables_9 (def :  pcf.CatastropheZonesLV) : void {
      def.refreshVariables(Catastrophe, zoneType, country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      zoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'onChange' attribute on PostOnChange at CatastropheZonesInputSet.default.pcf: line 26, column 66
    function onChange_0 () : void {
      Catastrophe.FilterCriteria.ZoneType=zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function valueRange_4 () : java.lang.Object {
      return country == null ? {} : Catastrophe.getRelevantZoneTypesForCountry(country)
    }
    
    // 'value' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function value_1 () : typekey.ZoneType {
      return zoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function verifyValueRangeIsAllowedType_5 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ZoneType) at CatastropheZonesInputSet.default.pcf: line 24, column 36
    function verifyValueRange_6 () : void {
      var __valueRangeArg = country == null ? {} : Catastrophe.getRelevantZoneTypesForCountry(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at CatastropheZonesInputSet.default.pcf: line 33, column 34
    function visible_7 () : java.lang.Boolean {
      return zoneType != null
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
    
    property get zoneType () : ZoneType {
      return getVariableValue("zoneType", 0) as ZoneType
    }
    
    property set zoneType ($arg :  ZoneType) {
      setVariableValue("zoneType", 0, $arg)
    }
    
    
  }
  
  
}