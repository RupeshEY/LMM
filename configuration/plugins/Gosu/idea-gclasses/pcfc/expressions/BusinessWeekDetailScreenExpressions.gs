package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_onEnter_27 (def :  pcf.BusinessWeekDetailDV_CA) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_onEnter_29 (def :  pcf.BusinessWeekDetailDV_US) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_onEnter_31 (def :  pcf.BusinessWeekDetailDV_default) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 64, column 52
    function def_onEnter_34 (def :  pcf.BusinessWeekDayDetailDV) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 66, column 136
    function def_onEnter_36 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(businessWeek, { "Name"}, { DisplayKey.get("Web.Admin.BusinessWeekDetailDV.Name") })
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_refreshVariables_28 (def :  pcf.BusinessWeekDetailDV_CA) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_refreshVariables_30 (def :  pcf.BusinessWeekDetailDV_US) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function def_refreshVariables_32 (def :  pcf.BusinessWeekDetailDV_default) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 64, column 52
    function def_refreshVariables_35 (def :  pcf.BusinessWeekDayDetailDV) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'def' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 66, column 136
    function def_refreshVariables_37 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(businessWeek, { "Name"}, { DisplayKey.get("Web.Admin.BusinessWeekDetailDV.Name") })
    }
    
    // 'value' attribute on BooleanRadioInput (id=AppliesToAllZones) at BusinessWeekDetailScreen.pcf: line 34, column 28
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.AppliesToAllZones = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      country = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on TextInput (id=Name) at BusinessWeekDetailScreen.pcf: line 27, column 40
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at BusinessWeekDetailScreen.pcf: line 13, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // EditButtons at BusinessWeekDetailScreen.pcf: line 16, column 47
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at BusinessWeekDetailScreen.pcf: line 62, column 50
    function mode_33 () : java.lang.Object {
      return country
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=AppliesToAllZones) at BusinessWeekDetailScreen.pcf: line 34, column 28
    function validationExpression_7 () : java.lang.Object {
      return businessWeek.validateOnlyOneBusinessWeekAppliesToAll()
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function valueRange_23 () : java.lang.Object {
      return getPossibleCountries()
    }
    
    // 'value' attribute on TextInput (id=Name) at BusinessWeekDetailScreen.pcf: line 27, column 40
    function valueRoot_6 () : java.lang.Object {
      return businessWeek
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at BusinessWeekDetailScreen.pcf: line 43, column 56
    function value_14 () : java.lang.String {
      return businessWeek.Zones
    }
    
    // 'value' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function value_19 () : typekey.Country {
      return country
    }
    
    // 'value' attribute on TextInput (id=Name) at BusinessWeekDetailScreen.pcf: line 27, column 40
    function value_3 () : java.lang.String {
      return businessWeek.Name
    }
    
    // 'value' attribute on BooleanRadioInput (id=AppliesToAllZones) at BusinessWeekDetailScreen.pcf: line 34, column 28
    function value_8 () : java.lang.Boolean {
      return businessWeek.AppliesToAllZones
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function verifyValueRangeIsAllowedType_24 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function verifyValueRangeIsAllowedType_24 ($$arg :  typekey.Country[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at BusinessWeekDetailScreen.pcf: line 53, column 55
    function verifyValueRange_25 () : void {
      var __valueRangeArg = getPossibleCountries()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_24(__valueRangeArg)
    }
    
    // 'editVisible' attribute on EditButtons at BusinessWeekDetailScreen.pcf: line 16, column 47
    function visible_1 () : java.lang.Boolean {
      return perm.BusinessWeek.edit
    }
    
    // 'visible' attribute on TextAreaInput (id=Zones) at BusinessWeekDetailScreen.pcf: line 43, column 56
    function visible_13 () : java.lang.Boolean {
      return !businessWeek.AppliesToAllZones
    }
    
    property get businessWeek () : BusinessWeek {
      return getRequireValue("businessWeek", 0) as BusinessWeek
    }
    
    property set businessWeek ($arg :  BusinessWeek) {
      setRequireValue("businessWeek", 0, $arg)
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