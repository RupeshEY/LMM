package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/address/GlobalAddressInputSet.PostCodeBeforeCity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalAddressInputSet_PostCodeBeforeCityExpressions {
  @javax.annotation.Generated("config/web/pcf/address/GlobalAddressInputSet.PostCodeBeforeCity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function action_111 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "City")
    }
    
    // 'action' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function action_63 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'action' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function action_80 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'action' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function action_96 () : void {
      gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "City")
    }
    
    // 'autoComplete' attribute on AddressAutoFillInput (id=City) at AddressAutoFillWidget.xml: line 8, column 45
    function autoComplete_106 () : gw.api.contact.AutocompleteHandler {
      return cityhandler
    }
    
    // 'autoComplete' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function autoComplete_74 () : gw.api.contact.AutocompleteHandler {
      return pchandler
    }
    
    // 'available' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function available_119 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.CEDEX)
    }
    
    // 'available' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function available_130 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.CEDEXBUREAU)
    }
    
    // 'available' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function available_20 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'available' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function available_33 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'available' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function available_44 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE3)
    }
    
    // 'available' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function available_56 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'available' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function available_89 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'available' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function available_9 () : java.lang.Boolean {
      return addressOwner.isAvailable(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'value' attribute on AddressAutoFillInput (id=City) at AddressAutoFillWidget.xml: line 8, column 45
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.City = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function defaultSetter_128 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.CEDEX = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function defaultSetter_139 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.CEDEXBureau = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.SelectedCountry = (__VALUE_TO_SET as typekey.Country)
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.AddressLine3 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      addressOwner.AddressDelegate.PostalCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function editable_10 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'editable' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function editable_120 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.CEDEX)
    }
    
    // 'editable' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function editable_131 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.CEDEXBUREAU)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function editable_21 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function editable_34 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'editable' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function editable_45 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.ADDRESSLINE3)
    }
    
    // 'editable' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function editable_57 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'editable' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function editable_90 () : java.lang.Boolean {
      return addressOwner.isEditable(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'initialValue' attribute on Variable at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 14, column 50
    function initialValue_0 () : gw.api.contact.AutocompleteHandler {
      return gw.api.contact.AddressAutocompleteHandler.createHandler("City","City,PostalCode,Country",true)
    }
    
    // 'initialValue' attribute on Variable at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 18, column 50
    function initialValue_1 () : gw.api.contact.AutocompleteHandler {
      return gw.api.contact.AddressAutocompleteHandler.createHandler("PostalCode","City,PostalCode,Country",true)
    }
    
    // 'initialValue' attribute on Variable at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 25, column 33
    function initialValue_2 () : java.lang.Integer {
      if (addressOwner != null) addressOwner.InEditMode = CurrentLocation.InEditMode; return 0
    }
    
    // 'inputConversion' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function inputConversion_69 (VALUE :  java.lang.String) : java.lang.Object {
      return gw.api.address.PostalCodeInputFormatter.convertPostalCode(VALUE, addressOwner.SelectedCountry)
    }
    
    // 'inputMask' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function inputMask_75 () : java.lang.String {
      return gw.api.contact.AddressAutocompleteUtil.getInputMask(addressOwner.AddressDelegate, "PostalCode")
    }
    
    // 'label' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function label_23 () : java.lang.Object {
      return addressOwner.AddressLine1Label
    }
    
    // 'label' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 31, column 50
    function label_4 () : java.lang.Object {
      return addressOwner.AddressNameLabel
    }
    
    // 'label' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function label_60 () : java.lang.Object {
      return gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).PostalCodeLabel
    }
    
    // 'label' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function label_64 () : java.lang.Object {
      return addressOwner.AutofillIconEnabled ? DisplayKey.get("AutoFill.Override") : ""
    }
    
    // 'label' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function label_93 () : java.lang.Object {
      return gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).CityLabel
    }
    
    // 'onChange' attribute on PostOnChange at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 119, column 31
    function onChange_118 () : void {
      if (not addressOwner.AddressDelegate.CEDEX) addressOwner.AddressDelegate.CEDEXBureau = null
    }
    
    // 'onChange' attribute on PostOnChange at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 89, column 42
    function onChange_55 () : void {
      if (addressOwner.AutofillEnabled) gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "PostalCode", false)
    }
    
    // 'onChange' attribute on PostOnChange at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 107, column 42
    function onChange_88 () : void {
      if (addressOwner.AutofillEnabled) gw.api.contact.AddressAutocompleteUtil.autofillAddress(addressOwner.AddressDelegate, "City", false)
    }
    
    // 'required' attribute on AddressAutoFillInput (id=City) at AddressAutoFillWidget.xml: line 8, column 45
    function required_102 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    // 'required' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function required_126 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.CEDEX)
    }
    
    // 'required' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function required_137 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.CEDEXBUREAU)
    }
    
    // 'required' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function required_16 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'required' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function required_29 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'required' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function required_40 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'required' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function required_51 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.ADDRESSLINE3)
    }
    
    // 'required' attribute on AddressAutoFillInput (id=PostalCode) at AddressAutoFillWidget.xml: line 8, column 45
    function required_70 () : java.lang.Boolean {
      return addressOwner.isRequired(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'tooltip' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function tooltip_82 () : java.lang.String {
      return addressOwner.AutofillIconEnabled ? DisplayKey.get("AutoFill.Override") : ""
    }
    
    // 'validationExpression' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function validationExpression_58 () : java.lang.Object {
      return gw.api.contact.AddressAutocompleteUtil.validate(addressOwner.AddressDelegate, "PostalCode", gw.api.address.AddressCountrySettings.getSettings(addressOwner.SelectedCountry).PostalCodeLabel)
    }
    
    // 'validationExpression' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function validationExpression_91 () : java.lang.Object {
      return gw.api.contact.AddressAutocompleteUtil.validate(addressOwner.AddressDelegate, "City")
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function valueRoot_19 () : java.lang.Object {
      return addressOwner
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function valueRoot_32 () : java.lang.Object {
      return addressOwner.AddressDelegate
    }
    
    // 'value' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function value_12 () : typekey.Country {
      return addressOwner.SelectedCountry
    }
    
    // 'value' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function value_122 () : java.lang.Boolean {
      return addressOwner.AddressDelegate.CEDEX
    }
    
    // 'value' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function value_133 () : java.lang.String {
      return addressOwner.AddressDelegate.CEDEXBureau
    }
    
    // 'value' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function value_24 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine1
    }
    
    // 'value' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function value_36 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function value_47 () : java.lang.String {
      return addressOwner.AddressDelegate.AddressLine3
    }
    
    // 'value' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 31, column 50
    function value_5 () : java.lang.String {
      return new gw.api.address.AddressFormatter().format(addressOwner.AddressDelegate, "\n")
    }
    
    // 'value' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function value_61 () : java.lang.String {
      return addressOwner.AddressDelegate.PostalCode
    }
    
    // 'value' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function value_94 () : java.lang.String {
      return addressOwner.AddressDelegate.City
    }
    
    // 'visible' attribute on TypeKeyInput (id=Country) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 43, column 84
    function visible_11 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.COUNTRY)
    }
    
    // 'visible' attribute on CheckBoxInput (id=CEDEX) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 116, column 82
    function visible_121 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.CEDEX)
    }
    
    // 'visible' attribute on TextInput (id=CEDEXBureau) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 128, column 128
    function visible_132 () : java.lang.Boolean {
      return addressOwner.AddressDelegate.CEDEX and addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.CEDEXBUREAU)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine1) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 54, column 90
    function visible_22 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE1)
    }
    
    // 'visible' attribute on TextInput (id=AddressSummary) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 31, column 50
    function visible_3 () : java.lang.Boolean {
      return addressOwner.ShowAddressSummary
    }
    
    // 'visible' attribute on TextInput (id=AddressLine2) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 62, column 90
    function visible_35 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE2)
    }
    
    // 'visible' attribute on TextInput (id=AddressLine3) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 70, column 90
    function visible_46 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.ADDRESSLINE3)
    }
    
    // 'visible' attribute on AddressAutoFillInput (id=PostalCode) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 86, column 87
    function visible_59 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.POSTALCODE)
    }
    
    // 'visible' attribute on MenuItem (id=AutoFillIcon) at AddressAutoFillWidget.xml: line 8, column 45
    function visible_62 () : java.lang.Boolean {
      return addressOwner.AutofillIconEnabled
    }
    
    // 'visible' attribute on AddressAutoFillInput (id=City) at GlobalAddressInputSet.PostCodeBeforeCity.pcf: line 104, column 81
    function visible_92 () : java.lang.Boolean {
      return addressOwner.isVisible(gw.api.address.AddressOwnerFieldId.CITY)
    }
    
    property get addressOwner () : gw.api.address.AddressOwner {
      return getRequireValue("addressOwner", 0) as gw.api.address.AddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.AddressOwner) {
      setRequireValue("addressOwner", 0, $arg)
    }
    
    property get cityhandler () : gw.api.contact.AutocompleteHandler {
      return getVariableValue("cityhandler", 0) as gw.api.contact.AutocompleteHandler
    }
    
    property set cityhandler ($arg :  gw.api.contact.AutocompleteHandler) {
      setVariableValue("cityhandler", 0, $arg)
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