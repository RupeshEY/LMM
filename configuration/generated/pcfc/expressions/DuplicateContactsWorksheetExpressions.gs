package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DuplicateContactsWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactsWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (contact :  Contact, externalContactSource :  gw.api.contact.ExternalContactSource) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DuplicateContactsWorksheet_CloseButton) at DuplicateContactsWorksheet.pcf: line 42, column 25
    function action_5 () : void {
      CurrentLocation.cancel()
    }
    
    // 'canVisit' attribute on Worksheet (id=DuplicateContactsWorksheet) at DuplicateContactsWorksheet.pcf: line 9, column 80
    static function canVisit_8 (contact :  Contact, externalContactSource :  gw.api.contact.ExternalContactSource) : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'def' attribute on PanelRef at DuplicateContactsWorksheet.pcf: line 45, column 179
    function def_onEnter_6 (def :  pcf.CheckDuplicateContactsLV) : void {
      def.onEnter(null, proximitySearchPageHelper, addressBookContactSource, gw.api.contact.ContactSystemUtil.INSTANCE.findPotentialMatches(contact), null)
    }
    
    // 'def' attribute on PanelRef at DuplicateContactsWorksheet.pcf: line 45, column 179
    function def_refreshVariables_7 (def :  pcf.CheckDuplicateContactsLV) : void {
      def.refreshVariables(null, proximitySearchPageHelper, addressBookContactSource, gw.api.contact.ContactSystemUtil.INSTANCE.findPotentialMatches(contact), null)
    }
    
    // 'initialValue' attribute on Variable at DuplicateContactsWorksheet.pcf: line 26, column 56
    function initialValue_2 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at DuplicateContactsWorksheet.pcf: line 30, column 46
    function initialValue_3 () : gw.api.contact.ExternalContact {
      return externalContactSource.wrap(contact)
    }
    
    // 'initialValue' attribute on Variable at DuplicateContactsWorksheet.pcf: line 34, column 52
    function initialValue_4 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'location' attribute on Scope at DuplicateContactsWorksheet.pcf: line 13, column 61
    function location_0 () : pcf.api.Destination {
      return pcf.AddressBookContactDetail.createDestination(externalContact)
    }
    
    // 'location' attribute on Scope at DuplicateContactsWorksheet.pcf: line 15, column 66
    function location_1 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContact)
    }
    
    override property get CurrentLocation () : pcf.DuplicateContactsWorksheet {
      return super.CurrentLocation as pcf.DuplicateContactsWorksheet
    }
    
    property get addressBookContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("addressBookContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set addressBookContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("addressBookContactSource", 0, $arg)
    }
    
    property get contact () : Contact {
      return getVariableValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setVariableValue("contact", 0, $arg)
    }
    
    property get externalContact () : gw.api.contact.ExternalContact {
      return getVariableValue("externalContact", 0) as gw.api.contact.ExternalContact
    }
    
    property set externalContact ($arg :  gw.api.contact.ExternalContact) {
      setVariableValue("externalContact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("proximitySearchPageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("proximitySearchPageHelper", 0, $arg)
    }
    
    
  }
  
  
}