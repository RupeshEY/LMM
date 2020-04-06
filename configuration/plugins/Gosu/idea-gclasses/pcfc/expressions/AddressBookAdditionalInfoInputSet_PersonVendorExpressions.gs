package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAdditionalInfoInputSet_PersonVendorExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function def_onEnter_0 (def :  pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor) : void {
      def.onEnter(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 36, column 120
    function def_onEnter_18 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.onEnter((contact as PersonVendor), externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 49, column 82
    function def_onEnter_26 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.onEnter((contact as PersonVendor))
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function def_onEnter_3 (def :  pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney) : void {
      def.onEnter(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function def_refreshVariables_1 (def :  pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor) : void {
      def.refreshVariables(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 36, column 120
    function def_refreshVariables_19 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.refreshVariables((contact as PersonVendor), externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 49, column 82
    function def_refreshVariables_27 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.refreshVariables((contact as PersonVendor))
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function def_refreshVariables_4 (def :  pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney) : void {
      def.refreshVariables(contact as PersonVendor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as PersonVendor).Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 34, column 65
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      contact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on PrivacyInput (id=SSN) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 46, column 48
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as PersonVendor).TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function editable_6 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=SSN) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 46, column 48
    function encryptionExpression_24 (VALUE :  java.lang.String) : java.lang.String {
      return contact.maskTaxId(VALUE)
    }
    
    // 'mode' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function mode_2 () : java.lang.Object {
      return contact typeis Doctor ? "Doctor" : null
    }
    
    // 'mode' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function mode_5 () : java.lang.Object {
      return contact typeis Attorney ? "Attorney" : null
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function valueRoot_11 () : java.lang.Object {
      return (contact as PersonVendor)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 34, column 65
    function valueRoot_17 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 34, column 65
    function value_13 () : typekey.Currency {
      return contact.PreferredCurrency
    }
    
    // 'value' attribute on PrivacyInput (id=SSN) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 46, column 48
    function value_20 () : java.lang.String {
      return (contact as PersonVendor).TaxID
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function value_7 () : java.lang.Boolean {
      return (contact as PersonVendor).Preferred
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 34, column 65
    function visible_12 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 49, column 82
    function visible_25 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get contact () : Person {
      return getRequireValue("contact", 0) as Person
    }
    
    property set contact ($arg :  Person) {
      setRequireValue("contact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}