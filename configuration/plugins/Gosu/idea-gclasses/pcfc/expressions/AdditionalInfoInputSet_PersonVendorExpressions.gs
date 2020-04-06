package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalInfoInputSet_PersonVendorExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on DateInput (id=PersonVendorValidFrom) at AdditionalInfoInputSet.PersonVendor.pcf: line 71, column 46
    function available_31 () : java.lang.Boolean {
      return claimContact != null
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 30, column 70
    function def_onEnter_0 (def :  pcf.DoctorAdditionalInfoInputSet_Doctor) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 52, column 78
    function def_onEnter_21 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.onEnter(contactHandle, claimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 65, column 82
    function def_onEnter_29 (def :  pcf.VendorW9InfoInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 33, column 74
    function def_onEnter_3 (def :  pcf.AttorneyAdditionalInfoInputSet_Attorney) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 30, column 70
    function def_refreshVariables_1 (def :  pcf.DoctorAdditionalInfoInputSet_Doctor) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 52, column 78
    function def_refreshVariables_22 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.refreshVariables(contactHandle, claimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 65, column 82
    function def_refreshVariables_30 (def :  pcf.VendorW9InfoInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 33, column 74
    function def_refreshVariables_4 (def :  pcf.AttorneyAdditionalInfoInputSet_Attorney) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AdditionalInfoInputSet.PersonVendor.pcf: line 44, column 39
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      PersonVendor.Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.PersonVendor.pcf: line 50, column 37
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      PersonVendor.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on PrivacyInput (id=SSN) at AdditionalInfoInputSet.PersonVendor.pcf: line 62, column 35
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      PersonVendor.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=PersonVendorValidFrom) at AdditionalInfoInputSet.PersonVendor.pcf: line 71, column 46
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactValidFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=PersonVendorValidTo) at AdditionalInfoInputSet.PersonVendor.pcf: line 77, column 44
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactValidTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor) at AdditionalInfoInputSet.PersonVendor.pcf: line 44, column 39
    function editable_11 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=SSN) at AdditionalInfoInputSet.PersonVendor.pcf: line 62, column 35
    function encryptionExpression_27 (VALUE :  java.lang.String) : java.lang.String {
      return PersonVendor.maskTaxId(VALUE)
    }
    
    // 'mode' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 30, column 70
    function mode_2 () : java.lang.Object {
      return PersonVendor typeis Doctor ? "Doctor" : null
    }
    
    // 'mode' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 33, column 74
    function mode_5 () : java.lang.Object {
      return PersonVendor typeis Attorney ? "Attorney" : null
    }
    
    // 'value' attribute on TextInput (id=OverallReviewScore) at AdditionalInfoInputSet.PersonVendor.pcf: line 39, column 127
    function valueRoot_10 () : java.lang.Object {
      return contactHandle.Contact
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AdditionalInfoInputSet.PersonVendor.pcf: line 44, column 39
    function valueRoot_16 () : java.lang.Object {
      return PersonVendor
    }
    
    // 'value' attribute on DateInput (id=PersonVendorValidFrom) at AdditionalInfoInputSet.PersonVendor.pcf: line 71, column 46
    function valueRoot_36 () : java.lang.Object {
      return claimContact
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AdditionalInfoInputSet.PersonVendor.pcf: line 44, column 39
    function value_12 () : java.lang.Boolean {
      return PersonVendor.Preferred
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.PersonVendor.pcf: line 50, column 37
    function value_17 () : typekey.Currency {
      return PersonVendor.PreferredCurrency
    }
    
    // 'value' attribute on PrivacyInput (id=SSN) at AdditionalInfoInputSet.PersonVendor.pcf: line 62, column 35
    function value_23 () : java.lang.String {
      return PersonVendor.TaxID
    }
    
    // 'value' attribute on DateInput (id=PersonVendorValidFrom) at AdditionalInfoInputSet.PersonVendor.pcf: line 71, column 46
    function value_32 () : java.util.Date {
      return claimContact.ContactValidFrom
    }
    
    // 'value' attribute on DateInput (id=PersonVendorValidTo) at AdditionalInfoInputSet.PersonVendor.pcf: line 77, column 44
    function value_38 () : java.util.Date {
      return claimContact.ContactValidTo
    }
    
    // 'value' attribute on TextInput (id=OverallReviewScore) at AdditionalInfoInputSet.PersonVendor.pcf: line 39, column 127
    function value_7 () : java.lang.Integer {
      return contactHandle.Contact.Score
    }
    
    // 'visible' attribute on InputSetRef at AdditionalInfoInputSet.PersonVendor.pcf: line 65, column 82
    function visible_28 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US
    }
    
    // 'visible' attribute on TextInput (id=OverallReviewScore) at AdditionalInfoInputSet.PersonVendor.pcf: line 39, column 127
    function visible_6 () : java.lang.Boolean {
      return (contactHandle.Contact.Score != null) or util.ReviewPageHelper.shouldDisplayReviewTab(contactHandle.Contact)
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
    
    
    property get PersonVendor() : PersonVendor { return contactHandle.Contact as PersonVendor; }
        
    
    
  }
  
  
}