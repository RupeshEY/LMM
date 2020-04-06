package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactBasicsDV_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 33, column 96
    function def_onEnter_0 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.onEnter(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_onEnter_11 (def :  pcf.AdditionalInfoInputSet_Person) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_onEnter_13 (def :  pcf.AdditionalInfoInputSet_PersonVendor) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_onEnter_15 (def :  pcf.AdditionalInfoInputSet_UserContact) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 53, column 46
    function def_onEnter_19 (def :  pcf.DriversLicenseInfoInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 37, column 50
    function def_onEnter_2 (def :  pcf.PersonNameInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsDV.Person.pcf: line 69, column 27
    function def_onEnter_25 (def :  pcf.ContactEFTLV) : void {
      def.onEnter(contactHandle.Contact)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 40, column 50
    function def_onEnter_5 (def :  pcf.PersonContactInfoInputSet) : void {
      def.onEnter(contactHandle, ClaimContact)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 43, column 54
    function def_onEnter_7 (def :  pcf.PrimaryAddressInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_onEnter_9 (def :  pcf.AdditionalInfoInputSet_Adjudicator) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 33, column 96
    function def_refreshVariables_1 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_refreshVariables_10 (def :  pcf.AdditionalInfoInputSet_Adjudicator) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_refreshVariables_12 (def :  pcf.AdditionalInfoInputSet_Person) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_refreshVariables_14 (def :  pcf.AdditionalInfoInputSet_PersonVendor) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function def_refreshVariables_16 (def :  pcf.AdditionalInfoInputSet_UserContact) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 53, column 46
    function def_refreshVariables_20 (def :  pcf.DriversLicenseInfoInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsDV.Person.pcf: line 69, column 27
    function def_refreshVariables_26 (def :  pcf.ContactEFTLV) : void {
      def.refreshVariables(contactHandle.Contact)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 37, column 50
    function def_refreshVariables_3 (def :  pcf.PersonNameInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 40, column 50
    function def_refreshVariables_6 (def :  pcf.PersonContactInfoInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 43, column 54
    function def_refreshVariables_8 (def :  pcf.PrimaryAddressInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Person.pcf: line 61, column 31
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 50, column 32
    function mode_17 () : java.lang.Object {
      return Person.Subtype
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Person.pcf: line 61, column 31
    function valueRoot_24 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Person.pcf: line 61, column 31
    function value_21 () : java.lang.String {
      return Person.Notes
    }
    
    // 'visible' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 53, column 46
    function visible_18 () : java.lang.Boolean {
      return Person.Subtype==TC_PERSON
    }
    
    // 'visible' attribute on InputSetRef at ContactBasicsDV.Person.pcf: line 40, column 50
    function visible_4 () : java.lang.Boolean {
      return !(Person typeis PersonVendor)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    property get showRoles () : boolean {
      return getRequireValue("showRoles", 0) as java.lang.Boolean
    }
    
    property set showRoles ($arg :  boolean) {
      setRequireValue("showRoles", 0, $arg)
    }
    
    property get Person() : Person { return contactHandle.Contact as Person; }
          
    property get ClaimContact() : ClaimContact { return contactHandle typeis ClaimContact ? (contactHandle) : null; }
    
    
  }
  
  
}