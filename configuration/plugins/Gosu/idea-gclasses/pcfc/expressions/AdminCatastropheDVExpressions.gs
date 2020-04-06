package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminCatastropheDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/AdminCatastropheDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminCatastropheDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_onEnter_45 (def :  pcf.CatastropheZonesInputSet_CA) : void {
      def.onEnter(Catastrophe)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_onEnter_47 (def :  pcf.CatastropheZonesInputSet_US) : void {
      def.onEnter(Catastrophe)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_onEnter_49 (def :  pcf.CatastropheZonesInputSet_default) : void {
      def.onEnter(Catastrophe)
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 109, column 27
    function def_onEnter_52 (def :  pcf.CatastrophePerilsLV) : void {
      def.onEnter(Catastrophe)
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 124, column 64
    function def_onEnter_55 (def :  pcf.LocalizedValuesLV) : void {
      def.onEnter(Catastrophe, { "Name", "Description"}, { DisplayKey.get("Web.Admin.CatastropheLocalizedLV.Name"), DisplayKey.get("Web.Admin.CatastropheLocalizedLV.Description")})
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 138, column 27
    function def_onEnter_57 (def :  pcf.CatastropheClaimsHistoryLV) : void {
      def.onEnter(Catastrophe)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_refreshVariables_46 (def :  pcf.CatastropheZonesInputSet_CA) : void {
      def.refreshVariables(Catastrophe)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_refreshVariables_48 (def :  pcf.CatastropheZonesInputSet_US) : void {
      def.refreshVariables(Catastrophe)
    }
    
    // 'def' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function def_refreshVariables_50 (def :  pcf.CatastropheZonesInputSet_default) : void {
      def.refreshVariables(Catastrophe)
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 109, column 27
    function def_refreshVariables_53 (def :  pcf.CatastrophePerilsLV) : void {
      def.refreshVariables(Catastrophe)
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 124, column 64
    function def_refreshVariables_56 (def :  pcf.LocalizedValuesLV) : void {
      def.refreshVariables(Catastrophe, { "Name", "Description"}, { DisplayKey.get("Web.Admin.CatastropheLocalizedLV.Name"), DisplayKey.get("Web.Admin.CatastropheLocalizedLV.Description")})
    }
    
    // 'def' attribute on ListViewInput at AdminCatastropheDV.pcf: line 138, column 27
    function def_refreshVariables_58 (def :  pcf.CatastropheClaimsHistoryLV) : void {
      def.refreshVariables(Catastrophe)
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_ID) at AdminCatastropheDV.pcf: line 46, column 48
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.CatastropheNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=CatastrophePCSNo) at AdminCatastropheDV.pcf: line 51, column 51
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.PCSCatastropheNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=LCOCode) at AdminCatastropheDV.pcf: line 56, column 38
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.LCOCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=CatastropheAdmin_Type) at AdminCatastropheDV.pcf: line 63, column 46
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.Type = (__VALUE_TO_SET as typekey.CatastropheType)
    }
    
    // 'value' attribute on DateInput (id=CatastropheValidFrom) at AdminCatastropheDV.pcf: line 71, column 50
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.CatastropheValidFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_Name) at AdminCatastropheDV.pcf: line 30, column 34
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=CatastropheValidTo) at AdminCatastropheDV.pcf: line 83, column 49
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.CatastropheValidTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      country = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_Description) at AdminCatastropheDV.pcf: line 38, column 41
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Catastrophe.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at AdminCatastropheDV.pcf: line 20, column 23
    function initialValue_0 () : Country {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'mode' attribute on InputSetRef at AdminCatastropheDV.pcf: line 103, column 25
    function mode_51 () : java.lang.Object {
      return country
    }
    
    // 'onChange' attribute on PostOnChange at AdminCatastropheDV.pcf: line 73, column 204
    function onChange_25 () : void {
      if (Catastrophe.PolicyEffectiveDate == null) { Catastrophe.PolicyEffectiveDate = Catastrophe.CatastropheValidFrom; Catastrophe.PolicyRetrievalSetTime = java.util.Date.CurrentDate }
    }
    
    // 'validationExpression' attribute on DateInput (id=CatastropheValidTo) at AdminCatastropheDV.pcf: line 83, column 49
    function validationExpression_30 () : java.lang.Object {
      return Catastrophe.CatastropheValidFrom > Catastrophe.CatastropheValidTo ? DisplayKey.get("Java.Validation.AdminCatastrophe.Date.ForbidValidReverse") : null
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function valueRange_42 () : java.lang.Object {
      return getPossibleCountries()
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_Name) at AdminCatastropheDV.pcf: line 30, column 34
    function valueRoot_4 () : java.lang.Object {
      return Catastrophe
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_Name) at AdminCatastropheDV.pcf: line 30, column 34
    function value_1 () : java.lang.String {
      return Catastrophe.Name
    }
    
    // 'value' attribute on TextInput (id=CatastrophePCSNo) at AdminCatastropheDV.pcf: line 51, column 51
    function value_13 () : java.lang.String {
      return Catastrophe.PCSCatastropheNumber
    }
    
    // 'value' attribute on TextInput (id=LCOCode) at AdminCatastropheDV.pcf: line 56, column 38
    function value_17 () : java.lang.String {
      return Catastrophe.LCOCode
    }
    
    // 'value' attribute on TypeKeyInput (id=CatastropheAdmin_Type) at AdminCatastropheDV.pcf: line 63, column 46
    function value_21 () : typekey.CatastropheType {
      return Catastrophe.Type
    }
    
    // 'value' attribute on DateInput (id=CatastropheValidFrom) at AdminCatastropheDV.pcf: line 71, column 50
    function value_26 () : java.util.Date {
      return Catastrophe.CatastropheValidFrom
    }
    
    // 'value' attribute on DateInput (id=CatastropheValidTo) at AdminCatastropheDV.pcf: line 83, column 49
    function value_31 () : java.util.Date {
      return Catastrophe.CatastropheValidTo
    }
    
    // 'value' attribute on TextAreaInput (id=Zones) at AdminCatastropheDV.pcf: line 89, column 36
    function value_36 () : java.lang.String {
      return Catastrophe.Zones
    }
    
    // 'value' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function value_39 () : typekey.Country {
      return country
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_Description) at AdminCatastropheDV.pcf: line 38, column 41
    function value_5 () : java.lang.String {
      return Catastrophe.Description
    }
    
    // 'value' attribute on TextInput (id=CatastropheAdmin_ID) at AdminCatastropheDV.pcf: line 46, column 48
    function value_9 () : java.lang.String {
      return Catastrophe.CatastropheNumber
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function verifyValueRangeIsAllowedType_43 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function verifyValueRangeIsAllowedType_43 ($$arg :  typekey.Country[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Country) at AdminCatastropheDV.pcf: line 98, column 37
    function verifyValueRange_44 () : void {
      var __valueRangeArg = getPossibleCountries()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_43(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at AdminCatastropheDV.pcf: line 124, column 64
    function visible_54 () : java.lang.Boolean {
      return LanguageType.getTypeKeys(false).Count > 1
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
    
    function getZoneInputValueRange(first : String[], second : String[]) : String[] {
      var both = new java.util.ArrayList<String>();
      java.util.Collections.addAll(both, first);
      java.util.Collections.addAll(both, second);
    
      var h = new java.util.HashSet<String>(both);
      both.clear();
      both.addAll(h);
    
      return both.toArray(new String[] {});
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