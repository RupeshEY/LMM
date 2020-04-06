package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactBasicsDV_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 23, column 65
    function def_onEnter_1 (def :  pcf.AddressBookPersonNameInputSet) : void {
      def.onEnter(contact as Person)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_onEnter_23 (def :  pcf.AddressBookAdditionalInfoInputSet_Adjudicator) : void {
      def.onEnter(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_onEnter_25 (def :  pcf.AddressBookAdditionalInfoInputSet_Person) : void {
      def.onEnter(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_onEnter_27 (def :  pcf.AddressBookAdditionalInfoInputSet_PersonVendor) : void {
      def.onEnter(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_onEnter_29 (def :  pcf.AddressBookAdditionalInfoInputSet_UserContact) : void {
      def.onEnter(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 79, column 47
    function def_onEnter_33 (def :  pcf.AddressBookDriversLicenseInfoInputSet) : void {
      def.onEnter(contact as Person)
    }
    
    // 'def' attribute on ListViewInput at AddressBookContactBasicsDV.Person.pcf: line 95, column 27
    function def_onEnter_39 (def :  pcf.ContactEFTLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 26, column 51
    function def_onEnter_4 (def :  pcf.AddressBookPersonContactInfoInputSet) : void {
      def.onEnter(contact as Person, null)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 29, column 59
    function def_onEnter_6 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 23, column 65
    function def_refreshVariables_2 (def :  pcf.AddressBookPersonNameInputSet) : void {
      def.refreshVariables(contact as Person)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_refreshVariables_24 (def :  pcf.AddressBookAdditionalInfoInputSet_Adjudicator) : void {
      def.refreshVariables(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_refreshVariables_26 (def :  pcf.AddressBookAdditionalInfoInputSet_Person) : void {
      def.refreshVariables(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_refreshVariables_28 (def :  pcf.AddressBookAdditionalInfoInputSet_PersonVendor) : void {
      def.refreshVariables(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function def_refreshVariables_30 (def :  pcf.AddressBookAdditionalInfoInputSet_UserContact) : void {
      def.refreshVariables(contact as Person, externalContactSource, allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 79, column 47
    function def_refreshVariables_34 (def :  pcf.AddressBookDriversLicenseInfoInputSet) : void {
      def.refreshVariables(contact as Person)
    }
    
    // 'def' attribute on ListViewInput at AddressBookContactBasicsDV.Person.pcf: line 95, column 27
    function def_refreshVariables_40 (def :  pcf.ContactEFTLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 26, column 51
    function def_refreshVariables_5 (def :  pcf.AddressBookPersonContactInfoInputSet) : void {
      def.refreshVariables(contact as Person, null)
    }
    
    // 'def' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 29, column 59
    function def_refreshVariables_7 (def :  pcf.AddressBookPrimaryAddressInputSet) : void {
      def.refreshVariables(contact)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Person.pcf: line 87, column 44
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as Person).Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactBasicsDV.Person.pcf: line 20, column 23
    function initialValue_0 () : Boolean {
      return contact.CategoryScores != null and contact.CategoryScores.length > 0
    }
    
    // 'mode' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 76, column 33
    function mode_31 () : java.lang.Object {
      return contact.Subtype
    }
    
    // 'value' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Person.pcf: line 40, column 42
    function valueRoot_14 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Person.pcf: line 87, column 44
    function valueRoot_38 () : java.lang.Object {
      return (contact as Person)
    }
    
    // 'value' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Person.pcf: line 40, column 42
    function value_11 () : java.lang.Integer {
      return contact.Score
    }
    
    // 'value' attribute on RowIterator at AddressBookContactBasicsDV.Person.pcf: line 52, column 55
    function value_21 () : entity.ContactCategoryScore[] {
      return contact.getSortedCategoryScores()
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at AddressBookContactBasicsDV.Person.pcf: line 87, column 44
    function value_35 () : java.lang.String {
      return (contact as Person).Notes
    }
    
    // 'visible' attribute on TextInput (id=score) at AddressBookContactBasicsDV.Person.pcf: line 40, column 42
    function visible_10 () : java.lang.Boolean {
      return contact.Score != null
    }
    
    // 'visible' attribute on ListViewInput at AddressBookContactBasicsDV.Person.pcf: line 43, column 37
    function visible_22 () : java.lang.Boolean {
      return hasCategoryScores
    }
    
    // 'visible' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 26, column 51
    function visible_3 () : java.lang.Boolean {
      return !(contact typeis PersonVendor)
    }
    
    // 'visible' attribute on InputSetRef at AddressBookContactBasicsDV.Person.pcf: line 79, column 47
    function visible_32 () : java.lang.Boolean {
      return contact.Subtype==TC_PERSON
    }
    
    // 'visible' attribute on InputDivider at AddressBookContactBasicsDV.Person.pcf: line 31, column 65
    function visible_8 () : java.lang.Boolean {
      return hasCategoryScores or (contact.Score != null)
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
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactBasicsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at AddressBookContactBasicsDV.Person.pcf: line 59, column 53
    function valueRoot_17 () : java.lang.Object {
      return categoryScore
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at AddressBookContactBasicsDV.Person.pcf: line 59, column 53
    function value_15 () : typekey.ReviewCategory {
      return categoryScore.ReviewCategory
    }
    
    // 'value' attribute on TextCell (id=Score) at AddressBookContactBasicsDV.Person.pcf: line 65, column 48
    function value_18 () : java.lang.Integer {
      return categoryScore.Score
    }
    
    property get categoryScore () : entity.ContactCategoryScore {
      return getIteratedValue(1) as entity.ContactCategoryScore
    }
    
    
  }
  
  
}