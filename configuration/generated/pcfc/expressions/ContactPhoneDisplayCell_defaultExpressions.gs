package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.phone.PhoneOwner
uses gw.api.phone.PhoneOwnerFieldId
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactPhoneDisplayCell_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactPhoneDisplayCellExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      phoneOwner.PhoneFields.NationalSubscriberNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Extension) at ContactPhoneDisplayCell.default.pcf: line 56, column 84
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      phoneOwner.PhoneFields.Extension = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function editable_16 () : java.lang.Boolean {
      return phoneOwner.isEditable(gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'editable' attribute on TextInput (id=Extension) at ContactPhoneDisplayCell.default.pcf: line 56, column 84
    function editable_27 () : java.lang.Boolean {
      return phoneOwner.isEditable(gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'initialValue' attribute on Variable at ContactPhoneDisplayCell.default.pcf: line 18, column 23
    function initialValue_0 () : boolean {
      return !(isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.COUNTRY_CODE) || isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.EXTENSION))
    }
    
    // 'label' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function label_18 () : java.lang.Object {
      return singleInput ? phoneOwner.PhoneFields.Type.DisplayName : DisplayKey.get("Web.ContactDetail.Phone.PhoneNumber")
    }
    
    // 'label' attribute on TextInput (id=PhoneDisplay) at ContactPhoneDisplayCell.default.pcf: line 62, column 88
    function label_37 () : java.lang.Object {
      return phoneOwner.WidgetLabel
    }
    
    // 'onChange' attribute on PostOnChange at ContactPhoneDisplayCell.default.pcf: line 47, column 140
    function onChange_15 () : void {
      phoneOwner.autoFormatAndCorrect(phoneOwner.PhoneFields.NationalSubscriberNumber, phoneOwner.PhoneFields.CountryCode)
    }
    
    // 'required' attribute on TextInput (id=CountryCode) at ContactPhoneDisplayCell.default.pcf: line 37, column 87
    function required_12 () : java.lang.Boolean {
      return phoneOwner.isRegionCodeRequired()
    }
    
    // 'required' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function required_23 () : java.lang.Boolean {
      return phoneOwner.isRequired(gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'required' attribute on TextInput (id=Extension) at ContactPhoneDisplayCell.default.pcf: line 56, column 84
    function required_32 () : java.lang.Boolean {
      return phoneOwner.isRequired(gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'value' attribute on TextInput (id=CountryCode) at ContactPhoneDisplayCell.default.pcf: line 37, column 87
    function valueRoot_14 () : java.lang.Object {
      return phoneOwner.PhoneFields
    }
    
    // 'value' attribute on TextInput (id=Contact_PrimaryAddress) at ContactPhoneDisplayCell.default.pcf: line 24, column 37
    function valueRoot_3 () : java.lang.Object {
      return aLodgingProvider.Contact
    }
    
    // 'value' attribute on TextInput (id=label) at ContactPhoneDisplayCell.default.pcf: line 29, column 71
    function valueRoot_8 () : java.lang.Object {
      return phoneOwner
    }
    
    // 'value' attribute on TextInput (id=Contact_PrimaryAddress) at ContactPhoneDisplayCell.default.pcf: line 24, column 37
    function value_1 () : entity.Address {
      return aLodgingProvider.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=CountryCode) at ContactPhoneDisplayCell.default.pcf: line 37, column 87
    function value_10 () : typekey.PhoneCountryCode {
      return phoneOwner.PhoneFields.CountryCode
    }
    
    // 'value' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function value_19 () : java.lang.String {
      return phoneOwner.PhoneFields.NationalSubscriberNumber
    }
    
    // 'value' attribute on TextInput (id=Extension) at ContactPhoneDisplayCell.default.pcf: line 56, column 84
    function value_29 () : java.lang.String {
      return phoneOwner.PhoneFields.Extension
    }
    
    // 'value' attribute on TextInput (id=PhoneDisplay) at ContactPhoneDisplayCell.default.pcf: line 62, column 88
    function value_38 () : java.lang.String {
      return phoneOwner.format()
    }
    
    // 'value' attribute on TextInput (id=label) at ContactPhoneDisplayCell.default.pcf: line 29, column 71
    function value_5 () : java.lang.String {
      return phoneOwner.WidgetLabel
    }
    
    // 'visible' attribute on TextInput (id=NationalSubscriberNumber) at ContactPhoneDisplayCell.default.pcf: line 45, column 100
    function visible_17 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.NATIONAL_SUBSCRIBER_NUMBER)
    }
    
    // 'visible' attribute on TextInput (id=Extension) at ContactPhoneDisplayCell.default.pcf: line 56, column 84
    function visible_28 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.EXTENSION)
    }
    
    // 'visible' attribute on TextInput (id=PhoneDisplay) at ContactPhoneDisplayCell.default.pcf: line 62, column 88
    function visible_36 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.PHONE_DISPLAY)
    }
    
    // 'visible' attribute on TextInput (id=label) at ContactPhoneDisplayCell.default.pcf: line 29, column 71
    function visible_4 () : java.lang.Boolean {
      return !singleInput && CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TextInput (id=CountryCode) at ContactPhoneDisplayCell.default.pcf: line 37, column 87
    function visible_9 () : java.lang.Boolean {
      return isVisible(phoneOwner, gw.api.phone.PhoneOwnerFieldId.COUNTRY_CODE)
    }
    
    property get aLodgingProvider () : entity.LodgingProvider {
      return getRequireValue("aLodgingProvider", 0) as entity.LodgingProvider
    }
    
    property set aLodgingProvider ($arg :  entity.LodgingProvider) {
      setRequireValue("aLodgingProvider", 0, $arg)
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