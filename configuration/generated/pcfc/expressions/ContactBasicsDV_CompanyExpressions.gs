package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactBasicsDV_CompanyExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on DateInput (id=CompanyVendorValidFrom) at ContactBasicsDV.Company.pcf: line 59, column 50
    function available_13 () : java.lang.Boolean {
      return ClaimContact != null
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 33, column 96
    function def_onEnter_0 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.onEnter(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 53, column 83
    function def_onEnter_10 (def :  pcf.CompanyVendorAdditionalInfoInputSet_CompanyVendor) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Company.pcf: line 41, column 56
    function def_onEnter_3 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 75, column 80
    function def_onEnter_32 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 88, column 120
    function def_onEnter_40 (def :  pcf.VendorW9InfoInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsDV.Company.pcf: line 105, column 27
    function def_onEnter_46 (def :  pcf.ContactEFTLV) : void {
      def.onEnter(contactHandle.Contact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Company.pcf: line 41, column 56
    function def_onEnter_5 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 44, column 54
    function def_onEnter_8 (def :  pcf.PrimaryAddressInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 33, column 96
    function def_refreshVariables_1 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 53, column 83
    function def_refreshVariables_11 (def :  pcf.CompanyVendorAdditionalInfoInputSet_CompanyVendor) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 75, column 80
    function def_refreshVariables_33 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Company.pcf: line 41, column 56
    function def_refreshVariables_4 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 88, column 120
    function def_refreshVariables_41 (def :  pcf.VendorW9InfoInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsDV.Company.pcf: line 105, column 27
    function def_refreshVariables_47 (def :  pcf.ContactEFTLV) : void {
      def.refreshVariables(contactHandle.Contact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Company.pcf: line 41, column 56
    function def_refreshVariables_6 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 44, column 54
    function def_refreshVariables_9 (def :  pcf.PrimaryAddressInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'value' attribute on DateInput (id=CompanyVendorValidFrom) at ContactBasicsDV.Company.pcf: line 59, column 50
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContact.ContactValidFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=CompanyVendorValidTo) at ContactBasicsDV.Company.pcf: line 65, column 48
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContact.ContactValidTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Company.pcf: line 73, column 67
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Company.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on PrivacyInput (id=V_EIN) at ContactBasicsDV.Company.pcf: line 85, column 34
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Company.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Company.pcf: line 97, column 32
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Company.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=V_EIN) at ContactBasicsDV.Company.pcf: line 85, column 34
    function encryptionExpression_38 (VALUE :  java.lang.String) : java.lang.String {
      return Company.maskTaxId(VALUE)
    }
    
    // 'label' attribute on Label at ContactBasicsDV.Company.pcf: line 37, column 46
    function label_2 () : java.lang.String {
      return Company.Subtype.DisplayName
    }
    
    // 'mode' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 53, column 83
    function mode_12 () : java.lang.Object {
      return Company typeis CompanyVendor ? "CompanyVendor" : null
    }
    
    // 'mode' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Company.pcf: line 41, column 56
    function mode_7 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on DateInput (id=CompanyVendorValidFrom) at ContactBasicsDV.Company.pcf: line 59, column 50
    function valueRoot_18 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Company.pcf: line 73, column 67
    function valueRoot_31 () : java.lang.Object {
      return Company
    }
    
    // 'value' attribute on DateInput (id=CompanyVendorValidFrom) at ContactBasicsDV.Company.pcf: line 59, column 50
    function value_14 () : java.util.Date {
      return ClaimContact.ContactValidFrom
    }
    
    // 'value' attribute on DateInput (id=CompanyVendorValidTo) at ContactBasicsDV.Company.pcf: line 65, column 48
    function value_20 () : java.util.Date {
      return ClaimContact.ContactValidTo
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Company.pcf: line 73, column 67
    function value_27 () : typekey.Currency {
      return Company.PreferredCurrency
    }
    
    // 'value' attribute on PrivacyInput (id=V_EIN) at ContactBasicsDV.Company.pcf: line 85, column 34
    function value_34 () : java.lang.String {
      return Company.TaxID
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Company.pcf: line 97, column 32
    function value_42 () : java.lang.String {
      return Company.Notes
    }
    
    // 'visible' attribute on InputSet at ContactBasicsDV.Company.pcf: line 50, column 48
    function visible_25 () : java.lang.Boolean {
      return Company typeis CompanyVendor
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Company.pcf: line 73, column 67
    function visible_26 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on InputSetRef at ContactBasicsDV.Company.pcf: line 88, column 120
    function visible_39 () : java.lang.Boolean {
      return Company typeis CompanyVendor and gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US 
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
    
    property get Company() : Company { return contactHandle.Contact as Company; }
          
    property get ClaimContact() : ClaimContact { return contactHandle typeis ClaimContact ? (contactHandle) : null; }
    
    
  }
  
  
}