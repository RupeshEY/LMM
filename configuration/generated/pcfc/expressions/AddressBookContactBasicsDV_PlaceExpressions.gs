package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactBasicsDV_PlaceExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Place.pcf: line 23, column 56
    function def_onEnter_1 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate((contact as Place))))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Place.pcf: line 39, column 105
    function def_onEnter_14 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.onEnter(contact, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Place.pcf: line 23, column 56
    function def_onEnter_3 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate((contact as Place))))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Place.pcf: line 26, column 59
    function def_onEnter_6 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Place.pcf: line 39, column 105
    function def_refreshVariables_15 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.refreshVariables(contact, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Place.pcf: line 23, column 56
    function def_refreshVariables_2 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate((contact as Place))))
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Place.pcf: line 23, column 56
    function def_refreshVariables_4 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate((contact as Place))))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Place.pcf: line 26, column 59
    function def_refreshVariables_7 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.refreshVariables(contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Place.pcf: line 37, column 67
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      contact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Place.pcf: line 47, column 43
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as Place).Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at AddressBookContactBasicsDV.Place.pcf: line 19, column 51
    function label_0 () : java.lang.String {
      return contact.getSubtype().DisplayName
    }
    
    // 'mode' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Place.pcf: line 23, column 56
    function mode_5 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Place.pcf: line 37, column 67
    function valueRoot_13 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Place.pcf: line 47, column 43
    function valueRoot_19 () : java.lang.Object {
      return (contact as Place)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Place.pcf: line 47, column 43
    function value_16 () : java.lang.String {
      return (contact as Place).Notes
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Place.pcf: line 37, column 67
    function value_9 () : typekey.Currency {
      return contact.PreferredCurrency
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Place.pcf: line 37, column 67
    function visible_8 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
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