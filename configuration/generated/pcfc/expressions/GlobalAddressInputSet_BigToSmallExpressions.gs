package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/address/GlobalAddressInputSet.BigToSmall.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalAddressInputSet_BigToSmallExpressions {
  @javax.annotation.Generated("config/web/pcf/address/GlobalAddressInputSet.BigToSmall.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function action_27 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'action' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function action_44 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'autoComplete' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function autoComplete_38 () : gw.api.contact.AutocompleteHandler {
      return pchandler
    }
    
    // 'available' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function available_102 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1KANJI)
    }
    
    // 'available' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function available_114 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'available' attribute on TextInput (id=AddressLine2Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 119, column 95
    function available_125 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2KANJI)
    }
    
    // 'available' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function available_20 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'available' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function available_52 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.STATE)
    }
    
    // 'available' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function available_68 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'available' attribute on TextInput (id=CityKanji) at GlobalAddressInputSet.BigToSmall.pcf: line 89, column 87
    function available_79 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.CITYKANJI)
    }
    
    // 'available' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function available_8 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'available' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function available_89 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function defaultSetter_112 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine1Kanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function defaultSetter_123 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AddressLine2Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 119, column 95
    function defaultSetter_133 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine2Kanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.SelectedCountry = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.PostalCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.State = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.City = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=CityKanji) at GlobalAddressInputSet.BigToSmall.pcf: line 89, column 87
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.CityKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function editable_103 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1KANJI)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function editable_115 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine2Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 119, column 95
    function editable_126 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2KANJI)
    }
    
    // 'editable' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function editable_21 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'editable' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function editable_53 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.STATE)
    }
    
    // 'editable' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function editable_69 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'editable' attribute on TextInput (id=CityKanji) at GlobalAddressInputSet.BigToSmall.pcf: line 89, column 87
    function editable_80 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.CITYKANJI)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function editable_9 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function editable_90 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'initialValue' attribute on Variable at GlobalAddressInputSet.BigToSmall.pcf: line 14, column 50
    function initialValue_0 () : gw.api.contact.AutocompleteHandler {
      return gw.api.contact.AddressAutocompleteHandler.createHandler("PostalCode","PostalCode,Country",true)
    }
    
    // 'initialValue' attribute on Variable at GlobalAddressInputSet.BigToSmall.pcf: line 21, column 33
    function initialValue_1 () : java.lang.Integer {
      if (addressOwner != null) addressOwner.InEditMode = CurrentLocation.InEditMode; return 0
    }
    
    // 'inputConversion' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function inputConversion_33 (VALUE :  java.lang.String) : java.lang.Object {
      return gw.api.address.PostalCodeInputFormatter.convertPostalCode(VALUE, addressOwner.SelectedCountry)
    }
    
    // 'inputMask' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function inputMask_39 () : java.lang.String {
      return gw.api.contact.AddressAutocompleteUtil.getInputMask(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'label' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function label_105 () : java.lang.Object {
      return addressOwner.AddressLine1Label
    }
    
    // 'label' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function label_24 () : java.lang.Object {
      return gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).PostalCodeLabel
    }
    
    // 'label' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function label_28 () : java.lang.Object {
      return addressOwner.AutofillIconEnabled ? DisplayKey.get("AutoFill.Override") : ""
    }
    
    // 'label' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.BigToSmall.pcf: line 27, column 50
    function label_3 () : java.lang.Object {
      return addressOwner.AddressNameLabel
    }
    
    // 'label' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function label_92 () : java.lang.Object {
      return addressOwner.AddressLine1PhoneticLabel
    }
    
    // 'onChange' attribute on PostOnChange at GlobalAddressInputSet.BigToSmall.pcf: line 61, column 42
    function onChange_19 () : void {
      if (addressOwner.AutofillEnabled) gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode", false)
    }
    
    // 'required' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function required_121 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'required' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function required_15 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'required' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function required_34 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'required' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function required_61 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.STATE)
    }
    
    // 'required' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function required_75 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'required' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function required_98 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'tooltip' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function tooltip_46 () : java.lang.String {
      return addressOwner.AutofillIconEnabled ? DisplayKey.get("AutoFill.Override") : ""
    }
    
    // 'validationExpression' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function validationExpression_22 () : java.lang.Object {
      return gw.api.contact.AddressAutocompleteUtil.validate(addressOwner.AddressDelegate, "PostalCode", gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).PostalCodeLabel)
    }
    
    // 'validationExpression' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function validationExpression_54 () : java.lang.Object {
      return gw.api.contact.AddressAutocompleteUtil.validate(addressOwner.AddressDelegate, "State")
    }
    
    // 'valueRange' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function valueRange_65 () : java.lang.Object {
      return gw.api.contact.AddressAutocompleteUtil.getStates(addressOwner.AddressDelegate.Country)
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function valueRoot_18 () : java.lang.Object {
      return addressOwner
    }
    
    // 'value' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function valueRoot_37 () : java.lang.Object {
      return addressOwner.AddressDelegate
    }
    
    // 'value' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function value_106 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine1Kanji
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function value_11 () : typekey.Country {
      return addressOwner.SelectedCountry
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function value_117 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=AddressLine2Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 119, column 95
    function value_128 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine2Kanji
    }
    
    // 'value' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function value_25 () : java.lang.String {
      return addressOwner.AddressDelegate.PostalCode
    }
    
    // 'value' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.BigToSmall.pcf: line 27, column 50
    function value_4 () : java.lang.String {
      return new gw.api.address.AddressFormatter().format(addressOwner.AddressDelegate, "\n")
    }
    
    // 'value' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function value_56 () : typekey.State {
      return addressOwner.AddressDelegate.State
    }
    
    // 'value' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function value_71 () : java.lang.String {
      return addressOwner.AddressDelegate.City
    }
    
    // 'value' attribute on TextInput (id=CityKanji) at GlobalAddressInputSet.BigToSmall.pcf: line 89, column 87
    function value_82 () : java.lang.String {
      return addressOwner.AddressDelegate.CityKanji
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function value_93 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine1
    }
    
    // 'valueRange' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function verifyValueRangeIsAllowedType_66 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function verifyValueRangeIsAllowedType_66 ($$arg :  typekey.State[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function verifyValueRange_67 () : void {
      var __valueRangeArg = gw.api.contact.AddressAutocompleteUtil.getStates(addressOwner.AddressDelegate.Country)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_66(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.BigToSmall.pcf: line 39, column 84
    function visible_10 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine1Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 104, column 95
    function visible_104 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1KANJI)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.BigToSmall.pcf: line 112, column 90
    function visible_116 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine2Kanji) at GlobalAddressInputSet.BigToSmall.pcf: line 119, column 95
    function visible_127 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2KANJI)
    }
    
    // 'visible' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.BigToSmall.pcf: line 27, column 50
    function visible_2 () : java.lang.Boolean {
      return addressOwner.ShowAddressSummary
    }
    
    // 'visible' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.BigToSmall.pcf: line 58, column 87
    function visible_23 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'visible' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function visible_26 () : java.lang.Boolean {
      return addressOwner.AutofillIconEnabled
    }
    
    // 'visible' attribute on RangeInput (id=State) at GlobalAddressInputSet.BigToSmall.pcf: line 74, column 83
    function visible_55 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.STATE)
    }
    
    // 'visible' attribute on TextInput (id=City) at GlobalAddressInputSet.BigToSmall.pcf: line 82, column 82
    function visible_70 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'visible' attribute on TextInput (id=CityKanji) at GlobalAddressInputSet.BigToSmall.pcf: line 89, column 87
    function visible_81 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.CITYKANJI)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.BigToSmall.pcf: line 97, column 90
    function visible_91 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    property get addressOwner () : gw.api.address.AddressOwner {
      return getRequireValue("addressOwner", 0) as gw.api.address.AddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.AddressOwner) {
      setRequireValue("addressOwner", 0, $arg)
    }
    
    property get pchandler () : gw.api.contact.AutocompleteHandler {
      return getVariableValue("pchandler", 0) as gw.api.contact.AutocompleteHandler
    }
    
    property set pchandler ($arg :  gw.api.contact.AutocompleteHandler) {
      setVariableValue("pchandler", 0, $arg)
    }
    
    property get saveEditMode () : java.lang.Integer {
      return getVariableValue("saveEditMode", 0) as java.lang.Integer
    }
    
    property set saveEditMode ($arg :  java.lang.Integer) {
      setVariableValue("saveEditMode", 0, $arg)
    }
    
    
  }
  
  
}