package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckDuplicateContactsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDuplicateContactsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at CheckDuplicateContactsLV.pcf: line 25, column 53
    function initialValue_0 () : gw.api.contact.DrivingDirectionsCache {
      return pageHelper.getDrivingDirectionsCache()
    }
    
    // 'label' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 75, column 54
    function label_6 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US ? DisplayKey.get("Web.Address.Default.ZIP") : DisplayKey.get("Web.Address.Default.PostalCode")
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 56, column 39
    function sortValue_2 (contact :  entity.Contact) : java.lang.Object {
      return contact
    }
    
    // 'sortBy' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 61, column 63
    function sortValue_3 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryAddress.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 66, column 55
    function sortValue_4 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 71, column 38
    function sortValue_5 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 75, column 54
    function sortValue_7 (contact :  entity.Contact) : java.lang.Object {
      return contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 86, column 24
    function sortValue_8 (contact :  entity.Contact) : java.lang.Object {
      return contact.Subtype
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 91, column 42
    function sortValue_9 (contact :  entity.Contact) : java.lang.Object {
      return contact.Score
    }
    
    // 'value' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 36, column 56
    function value_58 () : java.util.List<entity.Contact> {
      return (addressBookMatch as gw.api.contact.DuplicateContactMatch ).retrieveContactList()
    }
    
    // 'visible' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 50, column 80
    function visible_1 () : java.lang.Boolean {
      return addressBookMatch != null and addressBookMatch.isLinking()
    }
    
    // 'visible' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 100, column 53
    function visible_10 () : java.lang.Boolean {
      return searchCriteria.ProximitySearch
    }
    
    // 'visible' attribute on RowIterator at CheckDuplicateContactsLV.pcf: line 107, column 74
    function visible_11 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria)
    }
    
    property get addressBookMatch () : gw.api.contact.AddressBookMatch {
      return getRequireValue("addressBookMatch", 0) as gw.api.contact.AddressBookMatch
    }
    
    property set addressBookMatch ($arg :  gw.api.contact.AddressBookMatch) {
      setRequireValue("addressBookMatch", 0, $arg)
    }
    
    property get directions () : gw.api.contact.DrivingDirectionsCache {
      return getVariableValue("directions", 0) as gw.api.contact.DrivingDirectionsCache
    }
    
    property set directions ($arg :  gw.api.contact.DrivingDirectionsCache) {
      setVariableValue("directions", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    property get pageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getRequireValue("pageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setRequireValue("pageHelper", 0, $arg)
    }
    
    property get searchCriteria () : ContactSearchCriteria {
      return getRequireValue("searchCriteria", 0) as ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult<Contact> {
      return getRequireValue("searchResults", 0) as gw.api.database.IQueryBeanResult<Contact>
    }
    
    property set searchResults ($arg :  gw.api.database.IQueryBeanResult<Contact>) {
      setRequireValue("searchResults", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CheckDuplicateContactsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=LinkTo) at CheckDuplicateContactsLV.pcf: line 50, column 80
    function action_17 () : void {
      gw.api.contact.CCAddressBookUtil.linkToMatch(addressBookMatch, contact)
    }
    
    // 'condition' attribute on ToolbarFlag at CheckDuplicateContactsLV.pcf: line 41, column 34
    function condition_14 () : java.lang.Boolean {
      return perm.Contact.deleteab(contact)
    }
    
    // 'label' attribute on TextCell (id=PostalCode) at CheckDuplicateContactsLV.pcf: line 75, column 54
    function label_29 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US ? DisplayKey.get("Web.Address.Default.ZIP") : DisplayKey.get("Web.Address.Default.PostalCode")
    }
    
    // 'value' attribute on TextCell (id=AddressLine1) at CheckDuplicateContactsLV.pcf: line 61, column 63
    function valueRoot_22 () : java.lang.Object {
      return contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=PrimaryPhone) at CheckDuplicateContactsLV.pcf: line 80, column 46
    function valueRoot_36 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at CheckDuplicateContactsLV.pcf: line 56, column 39
    function value_18 () : entity.Contact {
      return contact
    }
    
    // 'value' attribute on TextCell (id=AddressLine1) at CheckDuplicateContactsLV.pcf: line 61, column 63
    function value_20 () : java.lang.String {
      return contact.PrimaryAddress.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at CheckDuplicateContactsLV.pcf: line 66, column 55
    function value_23 () : java.lang.String {
      return contact.PrimaryAddress.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at CheckDuplicateContactsLV.pcf: line 71, column 38
    function value_26 () : typekey.State {
      return contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at CheckDuplicateContactsLV.pcf: line 75, column 54
    function value_30 () : java.lang.String {
      return contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on TextCell (id=PrimaryPhone) at CheckDuplicateContactsLV.pcf: line 80, column 46
    function value_34 () : java.lang.String {
      return contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TypeKeyCell (id=ContactSubtype) at CheckDuplicateContactsLV.pcf: line 86, column 24
    function value_37 () : typekey.Contact {
      return contact.Subtype
    }
    
    // 'value' attribute on TextCell (id=Score) at CheckDuplicateContactsLV.pcf: line 91, column 42
    function value_40 () : java.lang.Integer {
      return contact.Score
    }
    
    // 'value' attribute on TextCell (id=GCDistance) at CheckDuplicateContactsLV.pcf: line 100, column 53
    function value_44 () : java.lang.String {
      return contact.PrimaryAddress.getDistanceFromAsString(searchCriteria.ProximitySearchCenter)
    }
    
    // 'value' attribute on TextCell (id=DrivingDistance) at CheckDuplicateContactsLV.pcf: line 107, column 74
    function value_48 () : java.lang.String {
      return directions.getCached(searchCriteria.ProximitySearchCenter, contact.PrimaryAddress).getTotalDistanceString()
    }
    
    // 'value' attribute on TextCell (id=DrivingTime) at CheckDuplicateContactsLV.pcf: line 114, column 74
    function value_52 () : java.lang.String {
      return directions.getCached(searchCriteria.ProximitySearchCenter, contact.PrimaryAddress).getTotalTimeInMinutes()
    }
    
    // 'visible' attribute on TextCell (id=LinkTo) at CheckDuplicateContactsLV.pcf: line 50, column 80
    function visible_15 () : java.lang.Boolean {
      return addressBookMatch != null and addressBookMatch.isLinking()
    }
    
    // 'valueVisible' attribute on TextCell (id=LinkTo) at CheckDuplicateContactsLV.pcf: line 50, column 80
    function visible_16 () : java.lang.Boolean {
      return addressBookMatch.canLinkTo(contact)
    }
    
    // 'visible' attribute on TextCell (id=GCDistance) at CheckDuplicateContactsLV.pcf: line 100, column 53
    function visible_43 () : java.lang.Boolean {
      return searchCriteria.ProximitySearch
    }
    
    // 'valueVisible' attribute on TextCell (id=GCDistance) at CheckDuplicateContactsLV.pcf: line 100, column 53
    function visible_45 () : java.lang.Boolean {
      return (contact.PrimaryAddress != null) and (contact.PrimaryAddress.hasLocationInformation())
    }
    
    // 'visible' attribute on TextCell (id=DrivingDistance) at CheckDuplicateContactsLV.pcf: line 107, column 74
    function visible_47 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria)
    }
    
    // 'valueVisible' attribute on TextCell (id=DrivingDistance) at CheckDuplicateContactsLV.pcf: line 107, column 74
    function visible_49 () : java.lang.Boolean {
      return directions.haveCached(searchCriteria.ProximitySearchCenter, contact.PrimaryAddress)
    }
    
    property get contact () : entity.Contact {
      return getIteratedValue(1) as entity.Contact
    }
    
    
  }
  
  
}