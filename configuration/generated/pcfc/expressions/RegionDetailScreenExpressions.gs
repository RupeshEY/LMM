package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_onEnter_18 (def :  pcf.RegionDetailDV_CA) : void {
      def.onEnter(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_onEnter_20 (def :  pcf.RegionDetailDV_US) : void {
      def.onEnter(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_onEnter_22 (def :  pcf.RegionDetailDV_default) : void {
      def.onEnter(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 61, column 124
    function def_onEnter_25 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(Region, { "Name"}, { DisplayKey.get("Web.Admin.RegionDetailDV.Name") })
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_refreshVariables_19 (def :  pcf.RegionDetailDV_CA) : void {
      def.refreshVariables(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_refreshVariables_21 (def :  pcf.RegionDetailDV_US) : void {
      def.refreshVariables(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function def_refreshVariables_23 (def :  pcf.RegionDetailDV_default) : void {
      def.refreshVariables(Region)
    }
    
    // 'def' attribute on PanelRef at RegionDetailScreen.pcf: line 61, column 124
    function def_refreshVariables_26 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(Region, { "Name"}, { DisplayKey.get("Web.Admin.RegionDetailDV.Name") })
    }
    
    // 'value' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      country = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionDetailScreen.pcf: line 35, column 34
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Region.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function editable_17 () : java.lang.Boolean {
      return perm.Region.edit(Region)
    }
    
    // 'initialValue' attribute on Variable at RegionDetailScreen.pcf: line 13, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // EditButtons at RegionDetailScreen.pcf: line 16, column 101
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at RegionDetailScreen.pcf: line 59, column 23
    function mode_24 () : java.lang.Object {
      return country
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function valueRange_14 () : java.lang.Object {
      return getPossibleCountries()
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionDetailScreen.pcf: line 35, column 34
    function valueRoot_7 () : java.lang.Object {
      return Region
    }
    
    // 'value' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function value_11 () : typekey.Country {
      return country
    }
    
    // 'value' attribute on TextInput (id=Name) at RegionDetailScreen.pcf: line 35, column 34
    function value_4 () : java.lang.String {
      return Region.Name
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at RegionDetailScreen.pcf: line 41, column 35
    function value_8 () : java.lang.String {
      return Region.Zones
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function verifyValueRangeIsAllowedType_15 ($$arg :  typekey.Country[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at RegionDetailScreen.pcf: line 50, column 41
    function verifyValueRange_16 () : void {
      var __valueRangeArg = getPossibleCountries()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'editVisible' attribute on EditButtons at RegionDetailScreen.pcf: line 16, column 101
    function visible_1 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesForDefaultCountry().length != 0
    }
    
    // 'visible' attribute on Verbatim at RegionDetailScreen.pcf: line 21, column 95
    function visible_3 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getRegionZoneTypesForDefaultCountry().length == 0
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
    
    function getPossibleCountries() : java.util.List<Country> {
      var org = User.util.CurrentUser.Organization
      if (org == null) {
        org = User.util.UnrestrictedUser.Organization
      }
      return org.Countries
    }
    
    
  }
  
  
}