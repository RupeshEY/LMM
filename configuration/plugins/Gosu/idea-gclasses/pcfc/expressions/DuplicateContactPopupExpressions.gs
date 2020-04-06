package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/DuplicateContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DuplicateContactPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/DuplicateContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (addressBookMatch :  gw.api.contact.AddressBookMatch, claimContact :  ClaimContact) : int {
      return 0
    }
    
    static function __constructorIndex (addressBookMatch :  gw.api.contact.AddressBookMatch, claimContact :  ClaimContact, wizard :  gw.api.claim.NewClaimWizardInfoBase) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=DuplicateContact_CancelButton) at DuplicateContactPopup.pcf: line 38, column 78
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'initialValue' attribute on Variable at DuplicateContactPopup.pcf: line 18, column 56
    function initialValue_0 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at DuplicateContactPopup.pcf: line 26, column 52
    function initialValue_1 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 62, column 44
    function sortValue_3 (contact :  entity.Contact) : java.lang.Object {
      return contact.DisplayName
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 66, column 48
    function sortValue_4 (contact :  entity.Contact) : java.lang.Object {
      return matchTypeValue(contact)
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 71, column 43
    function sortValue_5 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 75, column 50
    function sortValue_6 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 80, column 44
    function sortValue_7 (contact :  entity.Contact) : java.lang.Object {
      return contact.Subtype
    }
    
    // 'value' attribute on RowIterator at DuplicateContactPopup.pcf: line 53, column 60
    function value_23 () : java.util.List<entity.Contact> {
      return (addressBookMatch as gw.api.contact.DuplicateContactMatch ).retrieveContactList()
    }
    
    override property get CurrentLocation () : pcf.DuplicateContactPopup {
      return super.CurrentLocation as pcf.DuplicateContactPopup
    }
    
    property get addressBookMatch () : gw.api.contact.AddressBookMatch {
      return getVariableValue("addressBookMatch", 0) as gw.api.contact.AddressBookMatch
    }
    
    property set addressBookMatch ($arg :  gw.api.contact.AddressBookMatch) {
      setVariableValue("addressBookMatch", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getVariableValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setVariableValue("claimContact", 0, $arg)
    }
    
    property get externalSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalSource", 0, $arg)
    }
    
    property get onlyPrimaryRelationships () : boolean {
      return getVariableValue("onlyPrimaryRelationships", 0) as java.lang.Boolean
    }
    
    property set onlyPrimaryRelationships ($arg :  boolean) {
      setVariableValue("onlyPrimaryRelationships", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("proximitySearchPageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("proximitySearchPageHelper", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfoBase {
      return getVariableValue("wizard", 0) as gw.api.claim.NewClaimWizardInfoBase
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfoBase) {
      setVariableValue("wizard", 0, $arg)
    }
    
    function matchTypeValue(contact : Contact) : String {
      if ((addressBookMatch as gw.api.contact.DuplicateContactMatch).isExactMatch(contact)) {
        return DisplayKey.get("Web.AddressBook.Search.Result.ExactMatch")
      }  
      
      return DisplayKey.get("Web.AddressBook.Search.Result.PotentialMatch")
    }
    
    function selectRow(contact : Contact) {
      if (claimContact != null) {
        if (wizard == null) {
          gw.api.contact.ContactUtil.toAddExistingPopup(contact, claimContact)
        } else {
          gw.api.contact.ContactUtil.toAddExistingPopupFNOL(wizard, contact, claimContact)
        }
      } else {
        gw.api.contact.ContactUtil.pickContact(contact)
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/DuplicateContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DuplicateContactPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=SelectContact) at DuplicateContactPopup.pcf: line 58, column 89
    function action_8 () : void {
      selectRow(contact)
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at DuplicateContactPopup.pcf: line 62, column 44
    function valueRoot_11 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TextCell (id=MatchType) at DuplicateContactPopup.pcf: line 66, column 48
    function value_12 () : java.lang.String {
      return matchTypeValue(contact)
    }
    
    // 'value' attribute on TextCell (id=PrimaryAddress) at DuplicateContactPopup.pcf: line 71, column 43
    function value_14 () : entity.Address {
      return contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=PhoneNumber) at DuplicateContactPopup.pcf: line 75, column 50
    function value_17 () : java.lang.String {
      return contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TypeKeyCell (id=ContactSubtype) at DuplicateContactPopup.pcf: line 80, column 44
    function value_20 () : typekey.Contact {
      return contact.Subtype
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at DuplicateContactPopup.pcf: line 62, column 44
    function value_9 () : java.lang.String {
      return contact.DisplayName
    }
    
    property get contact () : entity.Contact {
      return getIteratedValue(1) as entity.Contact
    }
    
    
  }
  
  
}