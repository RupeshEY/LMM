package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactBasicsDV_CompanyExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 44, column 59
    function def_onEnter_15 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Company.pcf: line 31, column 56
    function def_onEnter_3 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate(asCompany())))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 91, column 81
    function def_onEnter_32 (def :  pcf.AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor) : void {
      def.onEnter(asCompany())
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 100, column 104
    function def_onEnter_41 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.onEnter(contact, externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Company.pcf: line 31, column 56
    function def_onEnter_5 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate(asCompany())))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 115, column 87
    function def_onEnter_50 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on ListViewInput at AddressBookContactBasicsDV.Company.pcf: line 132, column 27
    function def_onEnter_57 (def :  pcf.ContactEFTLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 44, column 59
    function def_refreshVariables_16 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 91, column 81
    function def_refreshVariables_33 (def :  pcf.AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor) : void {
      def.refreshVariables(asCompany())
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Company.pcf: line 31, column 56
    function def_refreshVariables_4 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate(asCompany())))
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 100, column 104
    function def_refreshVariables_42 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.refreshVariables(contact, externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 115, column 87
    function def_refreshVariables_51 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on ListViewInput at AddressBookContactBasicsDV.Company.pcf: line 132, column 27
    function def_refreshVariables_58 (def :  pcf.ContactEFTLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Company.pcf: line 31, column 56
    function def_refreshVariables_6 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.ContactNameDelegate(asCompany())))
    }
    
    // 'value' attribute on PrivacyInput (id=V_EIN) at AddressBookContactBasicsDV.Company.pcf: line 40, column 38
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      asCompany().TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Company.pcf: line 98, column 67
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      contact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Company.pcf: line 124, column 36
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      asCompany().Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=V_EIN) at AddressBookContactBasicsDV.Company.pcf: line 40, column 38
    function encryptionExpression_13 (VALUE :  java.lang.String) : java.lang.String {
      return asCompany().maskTaxId(VALUE)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactBasicsDV.Company.pcf: line 20, column 38
    function initialValue_0 () : ContactCategoryScore[] {
      return contact.getSortedCategoryScores()
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactBasicsDV.Company.pcf: line 24, column 23
    function initialValue_1 () : Boolean {
      return sortedCategoryScores != null and sortedCategoryScores.length > 0
    }
    
    // 'label' attribute on Label at AddressBookContactBasicsDV.Company.pcf: line 27, column 55
    function label_2 () : java.lang.String {
      return asCompany().getSubtype().DisplayName
    }
    
    // 'mode' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 91, column 81
    function mode_34 () : java.lang.Object {
      return contact typeis CompanyVendor ? "CompanyVendor" : null
    }
    
    // 'mode' attribute on InputSetRef (id=OrganizationName) at AddressBookContactBasicsDV.Company.pcf: line 31, column 56
    function mode_7 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'required' attribute on PrivacyInput (id=V_EIN) at AddressBookContactBasicsDV.Company.pcf: line 40, column 38
    function required_9 () : java.lang.Boolean {
      return asCompany() typeis CompanyVendor
    }
    
    // 'value' attribute on PrivacyInput (id=V_EIN) at AddressBookContactBasicsDV.Company.pcf: line 40, column 38
    function valueRoot_12 () : java.lang.Object {
      return asCompany()
    }
    
    // 'value' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Company.pcf: line 55, column 42
    function valueRoot_23 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Company.pcf: line 55, column 42
    function value_20 () : java.lang.Integer {
      return contact.Score
    }
    
    // 'value' attribute on RowIterator at AddressBookContactBasicsDV.Company.pcf: line 67, column 55
    function value_30 () : entity.ContactCategoryScore[] {
      return sortedCategoryScores
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Company.pcf: line 98, column 67
    function value_36 () : typekey.Currency {
      return contact.PreferredCurrency
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Company.pcf: line 124, column 36
    function value_53 () : java.lang.String {
      return asCompany().Notes
    }
    
    // 'value' attribute on PrivacyInput (id=V_EIN) at AddressBookContactBasicsDV.Company.pcf: line 40, column 38
    function value_8 () : java.lang.String {
      return asCompany().TaxID
    }
    
    // 'visible' attribute on InputSet at AddressBookContactBasicsDV.Company.pcf: line 33, column 51
    function visible_14 () : java.lang.Boolean {
      return !(contact typeis CompanyVendor)
    }
    
    // 'visible' attribute on InputDivider at AddressBookContactBasicsDV.Company.pcf: line 46, column 65
    function visible_17 () : java.lang.Boolean {
      return hasCategoryScores or (contact.Score != null)
    }
    
    // 'visible' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Company.pcf: line 55, column 42
    function visible_19 () : java.lang.Boolean {
      return contact.Score != null
    }
    
    // 'visible' attribute on ListViewInput at AddressBookContactBasicsDV.Company.pcf: line 58, column 37
    function visible_31 () : java.lang.Boolean {
      return hasCategoryScores
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AddressBookContactBasicsDV.Company.pcf: line 98, column 67
    function visible_35 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on InputSetRef at AddressBookContactBasicsDV.Company.pcf: line 115, column 87
    function visible_49 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US 
    }
    
    // 'visible' attribute on InputSet at AddressBookContactBasicsDV.Company.pcf: line 102, column 48
    function visible_52 () : java.lang.Boolean {
      return contact typeis CompanyVendor
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
    
    property get hasCategoryScores () : Boolean {
      return getVariableValue("hasCategoryScores", 0) as Boolean
    }
    
    property set hasCategoryScores ($arg :  Boolean) {
      setVariableValue("hasCategoryScores", 0, $arg)
    }
    
    property get sortedCategoryScores () : ContactCategoryScore[] {
      return getVariableValue("sortedCategoryScores", 0) as ContactCategoryScore[]
    }
    
    property set sortedCategoryScores ($arg :  ContactCategoryScore[]) {
      setVariableValue("sortedCategoryScores", 0, $arg)
    }
    
    function asCompany() : Company {
          return contact as Company;
          }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactBasicsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at AddressBookContactBasicsDV.Company.pcf: line 74, column 53
    function valueRoot_26 () : java.lang.Object {
      return categoryScore
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at AddressBookContactBasicsDV.Company.pcf: line 74, column 53
    function value_24 () : typekey.ReviewCategory {
      return categoryScore.ReviewCategory
    }
    
    // 'value' attribute on TextCell (id=Score) at AddressBookContactBasicsDV.Company.pcf: line 80, column 48
    function value_27 () : java.lang.Integer {
      return categoryScore.Score
    }
    
    property get categoryScore () : entity.ContactCategoryScore {
      return getIteratedValue(1) as entity.ContactCategoryScore
    }
    
    
  }
  
  
}