package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAdditionalInfoInputSet_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_33 () : java.lang.Boolean {
      return person.Guardian != null
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_57 () : java.lang.Boolean {
      return person.Employer != null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 12, column 225
    function action_25 () : void {
      AddressBookPickerPopup.push(entity.Person)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 14, column 151
    function action_27 () : void {
      person.Guardian = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 10, column 154
    function action_28 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(person.Guardian),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 12, column 225
    function action_49 () : void {
      AddressBookPickerPopup.push(statictypeof (person.Employer))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 14, column 151
    function action_51 () : void {
      person.Employer = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 10, column 154
    function action_52 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(person.Employer),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_26 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_29 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(person.Guardian),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_50 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (person.Employer))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_53 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(person.Employer),allowEditContact)
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth) at AddressBookAdditionalInfoInputSet.Person.pcf: line 35, column 35
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.DateOfBirth = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender) at AddressBookAdditionalInfoInputSet.Person.pcf: line 41, column 39
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.Gender = (__VALUE_TO_SET as typekey.GenderType)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at AddressBookAdditionalInfoInputSet.Person.pcf: line 23, column 29
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus) at AddressBookAdditionalInfoInputSet.Person.pcf: line 47, column 42
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.MaritalStatus = (__VALUE_TO_SET as typekey.MaritalStatus)
    }
    
    // 'value' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.Guardian = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.Person.pcf: line 63, column 65
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=Occupation) at AddressBookAdditionalInfoInputSet.Person.pcf: line 71, column 34
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.Occupation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.Employer = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus) at AddressBookAdditionalInfoInputSet.Person.pcf: line 29, column 48
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.TaxFilingStatus = (__VALUE_TO_SET as typekey.TaxFilingStatusType)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at AddressBookAdditionalInfoInputSet.Person.pcf: line 23, column 29
    function encryptionExpression_4 (VALUE :  java.lang.String) : java.lang.String {
      return person.maskTaxId(VALUE)
    }
    
    // 'validationExpression' attribute on DateInput (id=DateOfBirth) at AddressBookAdditionalInfoInputSet.Person.pcf: line 35, column 35
    function validationExpression_9 () : java.lang.Object {
      return (person.DateOfBirth == null or person.DateOfBirth <= gw.api.upgrade.Coercions.makeDateFrom("today")) ? null : DisplayKey.get("Web.ContactDetail.AdditionalInfo.DateOfBirth.FutureError")
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at AddressBookAdditionalInfoInputSet.Person.pcf: line 23, column 29
    function valueRoot_3 () : java.lang.Object {
      return person
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at AddressBookAdditionalInfoInputSet.Person.pcf: line 23, column 29
    function value_0 () : java.lang.String {
      return person.TaxID
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth) at AddressBookAdditionalInfoInputSet.Person.pcf: line 35, column 35
    function value_10 () : java.util.Date {
      return person.DateOfBirth
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender) at AddressBookAdditionalInfoInputSet.Person.pcf: line 41, column 39
    function value_15 () : typekey.GenderType {
      return person.Gender
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus) at AddressBookAdditionalInfoInputSet.Person.pcf: line 47, column 42
    function value_19 () : typekey.MaritalStatus {
      return person.MaritalStatus
    }
    
    // 'value' attribute on AddressBookContactInput (id=Guardian) at AddressBookAdditionalInfoInputSet.Person.pcf: line 56, column 34
    function value_23 () : entity.Person {
      return person.Guardian
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.Person.pcf: line 63, column 65
    function value_38 () : typekey.Currency {
      return person.PreferredCurrency
    }
    
    // 'value' attribute on TextInput (id=Occupation) at AddressBookAdditionalInfoInputSet.Person.pcf: line 71, column 34
    function value_43 () : java.lang.String {
      return person.Occupation
    }
    
    // 'value' attribute on AddressBookContactInput (id=Organization) at AddressBookAdditionalInfoInputSet.Person.pcf: line 79, column 35
    function value_47 () : entity.Company {
      return person.Employer
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus) at AddressBookAdditionalInfoInputSet.Person.pcf: line 29, column 48
    function value_5 () : typekey.TaxFilingStatusType {
      return person.TaxFilingStatus
    }
    
    // 'valueType' attribute on AddressBookContactInput (id=Guardian) at AddressBookAdditionalInfoInputSet.Person.pcf: line 56, column 34
    function verifyValueType_36 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on AddressBookContactInput (id=Organization) at AddressBookAdditionalInfoInputSet.Person.pcf: line 79, column 35
    function verifyValueType_60 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Guardian) at AddressBookContactWidget.xml: line 12, column 225
    function visible_24 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AddressBookAdditionalInfoInputSet.Person.pcf: line 63, column 65
    function visible_37 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Organization) at AddressBookContactWidget.xml: line 12, column 225
    function visible_48 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (person.Employer))" != "" && true
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    property get person () : Person {
      return getRequireValue("person", 0) as Person
    }
    
    property set person ($arg :  Person) {
      setRequireValue("person", 0, $arg)
    }
    
    
  }
  
  
}