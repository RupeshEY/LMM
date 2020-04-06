package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.phone.PhoneOwner
uses gw.api.phone.PhoneOwnerFieldId
@javax.annotation.Generated("config/web/pcf/phone/GlobalPhoneInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalPhoneInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/phone/GlobalPhoneInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalPhoneInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      phoneOwner.PhoneFields.CountryCode = (__VALUE_TO_SET as typekey.PhoneCountryCode)
    }
    
    // 'value' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      phoneOwner.PhoneFields.NationalSubscriberNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      phoneOwner.PhoneFields.Extension = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function editable_1 () : java.lang.Boolean {
      return phoneOwner.isEditable(gw.api.phone.PhoneOwnerFieldId.COUNTRY_CODE)
    }
    
    // 'editable' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function editable_13 () : java.lang.Boolean {
      return phoneOwner.isEditable(gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'editable' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function editable_28 () : java.lang.Boolean {
      return phoneOwner.isEditable(gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'helpText' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function helpText_22 () : java.lang.String {
      return DisplayKey.get("Java.PhoneUtil.Example.ToolTip", phoneOwner.PhoneFields.CountryCode,gw.api.util.PhoneUtil.getExampleNumberWithExtension(phoneOwner.PhoneFields.CountryCode))
    }
    
    // 'initialValue' attribute on Variable at GlobalPhoneInputSet.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      return !(isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.COUNTRY_CODE) || isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.EXTENSION))
    }
    
    // 'label' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function label_16 () : java.lang.Object {
      return phoneOwner.getPhoneLabel(singleInput)
    }
    
    // 'label' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Web.ContactDetail.Phone.MultiField.RegionCode", phoneOwner.WidgetLabel)
    }
    
    // 'label' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function label_31 () : java.lang.Object {
      return DisplayKey.get("Web.ContactDetail.Phone.MultiField.Extension", phoneOwner.WidgetLabel)
    }
    
    // 'label' attribute on TextInput (id=PhoneDisplay) at GlobalPhoneInputSet.pcf: line 60, column 86
    function label_42 () : java.lang.Object {
      return phoneOwner.WidgetLabel
    }
    
    // 'onChange' attribute on PostOnChange at GlobalPhoneInputSet.pcf: line 40, column 39
    function onChange_12 () : void {
      phoneOwner.autoFormatAndCorrect(phoneOwner.PhoneFields.NationalSubscriberNumber, phoneOwner.PhoneFields.CountryCode)
    }
    
    // 'onChange' attribute on PostOnChange at GlobalPhoneInputSet.pcf: line 53, column 39
    function onChange_27 () : void {
      phoneOwner.autoFormatAndCorrect(phoneOwner.PhoneFields.NationalSubscriberNumber, phoneOwner.PhoneFields.CountryCode)
    }
    
    // 'required' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function required_23 () : java.lang.Boolean {
      return phoneOwner.isRequired(gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'required' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function required_37 () : java.lang.Boolean {
      return phoneOwner.isRequired(gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'required' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function required_8 () : java.lang.Boolean {
      return phoneOwner.isRegionCodeRequired() || phoneOwner.PhoneFields.NationalSubscriberNumber != null
    }
    
    // 'validationExpression' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function validationExpression_14 () : java.lang.Object {
      return phoneOwner.validatePhone()
    }
    
    // 'validationExpression' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function validationExpression_29 () : java.lang.Object {
      return gw.api.util.PhoneUtil.isValidExtension(phoneOwner.PhoneFields.Extension) ? null : DisplayKey.get("Validator.Phone.Extension", gw.api.util.PhoneUtil.getMaximumExtensionLength())
    }
    
    // 'value' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function valueRoot_11 () : java.lang.Object {
      return phoneOwner.PhoneFields
    }
    
    // 'value' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function value_17 () : java.lang.String {
      return phoneOwner.PhoneFields.NationalSubscriberNumber
    }
    
    // 'value' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function value_32 () : java.lang.String {
      return phoneOwner.PhoneFields.Extension
    }
    
    // 'value' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function value_4 () : typekey.PhoneCountryCode {
      return phoneOwner.PhoneFields.CountryCode
    }
    
    // 'value' attribute on TextInput (id=PhoneDisplay) at GlobalPhoneInputSet.pcf: line 60, column 86
    function value_43 () : java.lang.String {
      return phoneOwner.format()
    }
    
    // 'visible' attribute on TextInput (id=NationalSubscriberNumber) at GlobalPhoneInputSet.pcf: line 37, column 98
    function visible_15 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'visible' attribute on TypeKeyInput (id=CountryCode) at GlobalPhoneInputSet.pcf: line 24, column 84
    function visible_2 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.COUNTRY_CODE)
    }
    
    // 'visible' attribute on TextInput (id=Extension) at GlobalPhoneInputSet.pcf: line 50, column 81
    function visible_30 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'visible' attribute on TextInput (id=PhoneDisplay) at GlobalPhoneInputSet.pcf: line 60, column 86
    function visible_41 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.PHONE_DISPLAY)
    }
    
    property get phoneOwner () : gw.api.phone.PhoneOwner {
      return getRequireValue("phoneOwner", 0) as gw.api.phone.PhoneOwner
    }
    
    property set phoneOwner ($arg :  gw.api.phone.PhoneOwner) {
      setRequireValue("phoneOwner", 0, $arg)
    }
    
    property get singleInput () : boolean {
      return getVariableValue("singleInput", 0) as java.lang.Boolean
    }
    
    property set singleInput ($arg :  boolean) {
      setVariableValue("singleInput", 0, $arg)
    }
    
    
    function isVisible(owner: PhoneOwner, field : PhoneOwnerFieldId) : boolean {
      if(CurrentLocation.InEditMode){
        return owner.isFieldVisibleEditMode(field) 
      }else{
        return owner.isFieldVisibleReadOnlyMode(field)
      }
    }
    
    
  }
  
  
}