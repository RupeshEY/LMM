package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regionsearch/RegionSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regionsearch/RegionSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextInput (id=Code) at RegionSearchDV.pcf: line 41, column 42
    function autoComplete_21 () : gw.api.contact.AutocompleteHandler {
      return zoneHandler
    }
    
    // 'def' attribute on InputSetRef at RegionSearchDV.pcf: line 45, column 41
    function def_onEnter_22 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at RegionSearchDV.pcf: line 45, column 41
    function def_refreshVariables_23 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ZoneType = (__VALUE_TO_SET as typekey.ZoneType)
    }
    
    // 'value' attribute on TextInput (id=Code) at RegionSearchDV.pcf: line 41, column 42
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ZoneCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionSearchDV.pcf: line 24, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.RegionName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function editable_6 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country).length > 0
    }
    
    // 'initialValue' attribute on Variable at RegionSearchDV.pcf: line 13, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'initialValue' attribute on Variable at RegionSearchDV.pcf: line 17, column 52
    function initialValue_1 () : gw.api.admin.ZoneAutocompleteHandler {
      return new gw.api.admin.ZoneAutocompleteHandler(country)
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function valueRange_12 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionSearchDV.pcf: line 24, column 44
    function valueRoot_5 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Code) at RegionSearchDV.pcf: line 41, column 42
    function value_16 () : java.lang.String {
      return SearchCriteria.ZoneCode
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionSearchDV.pcf: line 24, column 44
    function value_2 () : java.lang.String {
      return SearchCriteria.RegionName
    }
    
    // 'value' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function value_7 () : typekey.ZoneType {
      return SearchCriteria.ZoneType
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function verifyValueRangeIsAllowedType_13 ($$arg :  typekey.ZoneType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=zoneType) at RegionSearchDV.pcf: line 33, column 39
    function verifyValueRange_14 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getRegionZoneTypes(country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    property get SearchCriteria () : gw.api.admin.RegionSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as gw.api.admin.RegionSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.admin.RegionSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    property get country () : Country {
      return getVariableValue("country", 0) as Country
    }
    
    property set country ($arg :  Country) {
      setVariableValue("country", 0, $arg)
    }
    
    property get zoneHandler () : gw.api.admin.ZoneAutocompleteHandler {
      return getVariableValue("zoneHandler", 0) as gw.api.admin.ZoneAutocompleteHandler
    }
    
    property set zoneHandler ($arg :  gw.api.admin.ZoneAutocompleteHandler) {
      setVariableValue("zoneHandler", 0, $arg)
    }
    
    
  }
  
  
}