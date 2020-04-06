package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalInfoInputSet_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 16, column 225
    function action_113 () : void {
      AddressBookPickerPopup.push(statictypeof (Person.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 18, column 285
    function action_115 () : void {
      if (Person.Employer != null) { ClaimContactDetailPopup.push(Person.Employer, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function action_116 () : void {
      ClaimContactDetailPopup.push(Person.Employer, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 16, column 225
    function action_83 () : void {
      AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 18, column 285
    function action_85 () : void {
      if (Person.Guardian != null) { ClaimContactDetailPopup.push(Person.Guardian, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function action_86 () : void {
      ClaimContactDetailPopup.push(Person.Guardian, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_114 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Person.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_117 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Person.Employer, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_84 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_87 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Person.Guardian, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_110 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Person.Employer), Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_80 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(entity.Person.Type, Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_111 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Person.Employer), Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_81 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(entity.Person.Type, Person, claim)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.Person.pcf: line 144, column 65
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=Occupation) at AdditionalInfoInputSet.Person.pcf: line 152, column 34
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Occupation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Employer = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSNReleaseAuthorized) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.SSNReleaseAuthorized = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=VisaNumber) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.VisaNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GreenCardNumber) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.GreenCardNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PassportNumber) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PassportNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PersonClaimantIDType = (__VALUE_TO_SET as typekey.ClaimantIDType)
    }
    
    // 'value' attribute on TextInput (id=JurisdictionAssignedID) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.JurisdictionAssignedID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxExemptionsEntitled) at AdditionalInfoInputSet.Person.pcf: line 94, column 63
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxExemptionsEntitled = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus) at AdditionalInfoInputSet.Person.pcf: line 100, column 48
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxFilingStatus = (__VALUE_TO_SET as typekey.TaxFilingStatusType)
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.DateOfBirth = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender) at AdditionalInfoInputSet.Person.pcf: line 112, column 39
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Gender = (__VALUE_TO_SET as typekey.GenderType)
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus) at AdditionalInfoInputSet.Person.pcf: line 118, column 42
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.MaritalStatus = (__VALUE_TO_SET as typekey.MaritalStatus)
    }
    
    // 'value' attribute on TextInput (id=EducationLevel) at AdditionalInfoInputSet.Person.pcf: line 126, column 63
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.EducationLevel = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Guardian = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function encryptionExpression_12 (VALUE :  java.lang.String) : java.lang.String {
      return Person.maskTaxId(VALUE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function onPick_118 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Person.Employer); var result = eval("Person.Employer = claim.resolveContact(Person.Employer) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function onPick_88 (PickedValue :  Contact) : void {
      var contactType = entity.Person.Type; var result = eval("Person.Guardian = claim.resolveContact(Person.Guardian) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=DateOfBirth) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function validationExpression_58 () : java.lang.Object {
      return (Person.DateOfBirth == null or Person.DateOfBirth <= gw.api.upgrade.Coercions.makeDateFrom("today")) ? null : DisplayKey.get("Web.ContactDetail.AdditionalInfo.DateOfBirth.FutureError")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_122 () : java.lang.Object {
      return claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_92 () : java.lang.Object {
      return claim.RelatedPersonArray
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function valueRoot_5 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function value_1 () : typekey.ClaimantIDType {
      return Person.PersonClaimantIDType
    }
    
    // 'value' attribute on TextInput (id=Occupation) at AdditionalInfoInputSet.Person.pcf: line 152, column 34
    function value_104 () : java.lang.String {
      return Person.Occupation
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization) at AdditionalInfoInputSet.Person.pcf: line 161, column 35
    function value_108 () : entity.Company {
      return Person.Employer
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSNReleaseAuthorized) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function value_14 () : java.lang.Boolean {
      return Person.SSNReleaseAuthorized
    }
    
    // 'value' attribute on TextInput (id=VisaNumber) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function value_20 () : java.lang.String {
      return Person.VisaNumber
    }
    
    // 'value' attribute on TextInput (id=GreenCardNumber) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function value_26 () : java.lang.String {
      return Person.GreenCardNumber
    }
    
    // 'value' attribute on TextInput (id=PassportNumber) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function value_32 () : java.lang.String {
      return Person.PassportNumber
    }
    
    // 'value' attribute on TextInput (id=JurisdictionAssignedID) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function value_38 () : java.lang.String {
      return Person.JurisdictionAssignedID
    }
    
    // 'value' attribute on TextInput (id=EmployeeSecurityID) at AdditionalInfoInputSet.Person.pcf: line 85, column 63
    function value_44 () : java.lang.String {
      return Person.EmployeeSecurityID
    }
    
    // 'value' attribute on TextInput (id=TaxExemptionsEntitled) at AdditionalInfoInputSet.Person.pcf: line 94, column 63
    function value_49 () : java.math.BigDecimal {
      return Person.TaxExemptionsEntitled
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus) at AdditionalInfoInputSet.Person.pcf: line 100, column 48
    function value_54 () : typekey.TaxFilingStatusType {
      return Person.TaxFilingStatus
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function value_59 () : java.util.Date {
      return Person.DateOfBirth
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender) at AdditionalInfoInputSet.Person.pcf: line 112, column 39
    function value_64 () : typekey.GenderType {
      return Person.Gender
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus) at AdditionalInfoInputSet.Person.pcf: line 118, column 42
    function value_68 () : typekey.MaritalStatus {
      return Person.MaritalStatus
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function value_7 () : java.lang.String {
      return Person.TaxID
    }
    
    // 'value' attribute on TextInput (id=EducationLevel) at AdditionalInfoInputSet.Person.pcf: line 126, column 63
    function value_73 () : java.lang.String {
      return Person.EducationLevel
    }
    
    // 'value' attribute on ClaimContactInput (id=Guardian) at AdditionalInfoInputSet.Person.pcf: line 137, column 34
    function value_78 () : entity.Person {
      return Person.Guardian
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.Person.pcf: line 144, column 65
    function value_99 () : typekey.Currency {
      return Person.PreferredCurrency
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_93 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_124 () : void {
      var __valueRangeArg = claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_123(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_94 () : void {
      var __valueRangeArg = claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_93(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Organization) at AdditionalInfoInputSet.Person.pcf: line 161, column 35
    function verifyValueType_127 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Guardian) at AdditionalInfoInputSet.Person.pcf: line 137, column 34
    function verifyValueType_97 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TypeKeyInput (id=IDType) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function visible_0 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Organization) at ClaimContactWidget.xml: line 16, column 225
    function visible_112 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Person.Employer), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=SSNReleaseAuthorized) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function visible_13 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_S
    }
    
    // 'visible' attribute on TextInput (id=VisaNumber) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function visible_19 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_E
    }
    
    // 'visible' attribute on TextInput (id=GreenCardNumber) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function visible_25 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_G
    }
    
    // 'visible' attribute on TextInput (id=PassportNumber) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function visible_31 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_P
    }
    
    // 'visible' attribute on TextInput (id=JurisdictionAssignedID) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function visible_37 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_A
    }
    
    // 'visible' attribute on PrivacyInput (id=TaxID) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function visible_6 () : java.lang.Boolean {
      return Person.PersonClaimantIDType == ClaimantIDType.TC_S
    }
    
    // 'visible' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 14, column 229
    function visible_79 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Guardian) at ClaimContactWidget.xml: line 16, column 225
    function visible_82 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.Person.pcf: line 144, column 65
    function visible_98 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getRequireValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setRequireValue("claimContact", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
    property get Person() : Person { return contactHandle.Contact as Person; }
        
    
    
  }
  
  
}