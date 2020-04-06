package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CCAddressInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/shared/CCAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function available_21 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.CCAddressOwnerFieldId.ADDRESSTYPE)
    }
    
    // 'available' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function available_32 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.CCAddressOwnerFieldId.DESCRIPTION)
    }
    
    // 'available' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function available_43 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.CCAddressOwnerFieldId.VALIDUNTIL)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_onEnter_14 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_onEnter_16 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_onEnter_18 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_refreshVariables_15 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_refreshVariables_17 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function def_refreshVariables_19 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Address.AddressType = (__VALUE_TO_SET as typekey.AddressType)
    }
    
    // 'value' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Address.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Address.ValidUntil = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Claim_LocationCode) at CCAddressInputSet.pcf: line 66, column 141
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Claim.LossLocationCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Jurisdiction = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.Address = (__VALUE_TO_SET as entity.Address)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function editable_22 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.CCAddressOwnerFieldId.ADDRESSTYPE)
    }
    
    // 'editable' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function editable_33 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.CCAddressOwnerFieldId.DESCRIPTION)
    }
    
    // 'editable' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function editable_44 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.CCAddressOwnerFieldId.VALIDUNTIL)
    }
    
    // 'editable' attribute on TextInput (id=Claim_LocationCode) at CCAddressInputSet.pcf: line 66, column 141
    function editable_54 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.CCAddressOwnerFieldId.LOCATIONCODE)
    }
    
    // 'editable' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function editable_62 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.CCAddressOwnerFieldId.JURISDICTIONSTATE)
    }
    
    // 'label' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function label_1 () : java.lang.Object {
      return addressOwner.AddressNameLabel != null ? addressOwner.AddressNameLabel : DisplayKey.get("Web.Address.Default.Name")
    }
    
    // 'mode' attribute on InputSetRef (id=globalAddress) at CCAddressInputSet.pcf: line 34, column 43
    function mode_20 () : java.lang.Object {
      return gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).PCFMode
    }
    
    // 'newValue' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function newValue_9 () : java.lang.Object {
      return addressOwner.getOrCreateNewAddress()
    }
    
    // 'optionLabel' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function optionLabel_10 (VALUE :  entity.Address) : java.lang.String {
      return gw.util.RangeInputUtil.formatLabel(addressOwner.getOrCreateNewAddress(), VALUE)
    }
    
    // 'required' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function required_28 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.CCAddressOwnerFieldId.ADDRESSTYPE)
    }
    
    // 'required' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function required_39 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.CCAddressOwnerFieldId.DESCRIPTION)
    }
    
    // 'required' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function required_5 () : java.lang.Boolean {
      return addressOwner.RequiredFields.contains(gw.api.address.CCAddressOwnerFieldId.ADDRESS_NAME)
    }
    
    // 'required' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function required_50 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.CCAddressOwnerFieldId.VALIDUNTIL)
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function valueRange_11 () : java.lang.Object {
      return addressOwner.Addresses
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function valueRange_70 () : java.lang.Object {
      return addressOwner.Jurisdictions
    }
    
    // 'value' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function valueRoot_31 () : java.lang.Object {
      return addressOwner.Address
    }
    
    // 'value' attribute on TextInput (id=Claim_LocationCode) at CCAddressInputSet.pcf: line 66, column 141
    function valueRoot_61 () : java.lang.Object {
      return addressOwner.Claim
    }
    
    // 'value' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function valueRoot_8 () : java.lang.Object {
      return addressOwner
    }
    
    // 'value' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function value_2 () : entity.Address {
      return addressOwner.Address
    }
    
    // 'value' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function value_24 () : typekey.AddressType {
      return addressOwner.Address.AddressType
    }
    
    // 'value' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function value_35 () : java.lang.String {
      return addressOwner.Address.Description
    }
    
    // 'value' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function value_46 () : java.util.Date {
      return addressOwner.Address.ValidUntil
    }
    
    // 'value' attribute on TextInput (id=Claim_LocationCode) at CCAddressInputSet.pcf: line 66, column 141
    function value_56 () : java.lang.String {
      return addressOwner.Claim.LossLocationCode
    }
    
    // 'value' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function value_64 () : typekey.Jurisdiction {
      return addressOwner.Jurisdiction
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function verifyValueRangeIsAllowedType_12 ($$arg :  entity.Address[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult<entity.Address>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function verifyValueRangeIsAllowedType_71 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function verifyValueRangeIsAllowedType_71 ($$arg :  typekey.Jurisdiction[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function verifyValueRange_13 () : void {
      var __valueRangeArg = addressOwner.Addresses
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function verifyValueRange_72 () : void {
      var __valueRangeArg = addressOwner.Jurisdictions
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_71(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=Address_Picker) at CCAddressInputSet.pcf: line 26, column 50
    function visible_0 () : java.lang.Boolean {
      return addressOwner.Addresses != null
    }
    
    // 'visible' attribute on TypeKeyInput (id=Address_AddressType) at CCAddressInputSet.pcf: line 43, column 109
    function visible_23 () : java.lang.Boolean {
      return not addressOwner.HiddenFields.contains(gw.api.address.CCAddressOwnerFieldId.ADDRESSTYPE)
    }
    
    // 'visible' attribute on TextInput (id=Address_Description) at CCAddressInputSet.pcf: line 51, column 109
    function visible_34 () : java.lang.Boolean {
      return not addressOwner.HiddenFields.contains(gw.api.address.CCAddressOwnerFieldId.DESCRIPTION)
    }
    
    // 'visible' attribute on DateInput (id=Address_ValidUntil) at CCAddressInputSet.pcf: line 60, column 108
    function visible_45 () : java.lang.Boolean {
      return not addressOwner.HiddenFields.contains(gw.api.address.CCAddressOwnerFieldId.VALIDUNTIL)
    }
    
    // 'visible' attribute on TextInput (id=Claim_LocationCode) at CCAddressInputSet.pcf: line 66, column 141
    function visible_55 () : java.lang.Boolean {
      return addressOwner.Claim != null and not addressOwner.HiddenFields.contains(gw.api.address.CCAddressOwnerFieldId.LOCATIONCODE)
    }
    
    // 'visible' attribute on RangeInput (id=Claim_JurisdictionState) at CCAddressInputSet.pcf: line 74, column 43
    function visible_63 () : java.lang.Boolean {
      return IsJurisdictionVisible()
    }
    
    property get addressOwner () : gw.api.address.CCAddressOwner {
      return getRequireValue("addressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setRequireValue("addressOwner", 0, $arg)
    }
    
    function IsJurisdictionVisible(): boolean {
      return addressOwner.Claim != null 
              and not addressOwner.HiddenFields.contains(gw.api.address.CCAddressOwnerFieldId.JURISDICTIONSTATE)
              and addressOwner.Jurisdictions.HasElements
    }
    
    
  }
  
  
}