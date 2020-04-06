package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookMatchWorksheetScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookMatchWorksheetScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddressBookMatchWorksheet_CancelButton) at AddressBookMatchWorksheetScreen.pcf: line 24, column 60
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=AddressBookMatchWorksheet_CreateNewContactButton) at AddressBookMatchWorksheetScreen.pcf: line 29, column 127
    function action_3 () : void {
      gw.api.contact.CCAddressBookUtil.createMatchInAddressBook(addressBookMatch, onlyPrimaryRelationships)
    }
    
    // 'def' attribute on PanelRef at AddressBookMatchWorksheetScreen.pcf: line 35, column 183
    function def_onEnter_5 (def :  pcf.CheckDuplicateContactsLV) : void {
      def.onEnter(addressBookMatch, proximitySearchPageHelper, externalSource, addressBookMatch.Matches as gw.api.database.IQueryBeanResult<Contact>, null)
    }
    
    // 'def' attribute on PanelRef at AddressBookMatchWorksheetScreen.pcf: line 35, column 183
    function def_refreshVariables_6 (def :  pcf.CheckDuplicateContactsLV) : void {
      def.refreshVariables(addressBookMatch, proximitySearchPageHelper, externalSource, addressBookMatch.Matches as gw.api.database.IQueryBeanResult<Contact>, null)
    }
    
    // 'initialValue' attribute on Variable at AddressBookMatchWorksheetScreen.pcf: line 19, column 52
    function initialValue_0 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'label' attribute on Verbatim (id=matchMessage) at AddressBookMatchWorksheetScreen.pcf: line 33, column 41
    function label_4 () : java.lang.String {
      return addressBookMatch.Message
    }
    
    // 'visible' attribute on ToolbarButton (id=AddressBookMatchWorksheet_CreateNewContactButton) at AddressBookMatchWorksheetScreen.pcf: line 29, column 127
    function visible_2 () : java.lang.Boolean {
      return perm.Contact.createab(addressBookMatch.getRootContactType()) and addressBookMatch.canCreateInAddressBook()
    }
    
    property get addressBookMatch () : gw.api.contact.AddressBookMatch {
      return getRequireValue("addressBookMatch", 0) as gw.api.contact.AddressBookMatch
    }
    
    property set addressBookMatch ($arg :  gw.api.contact.AddressBookMatch) {
      setRequireValue("addressBookMatch", 0, $arg)
    }
    
    property get externalSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalSource", 0, $arg)
    }
    
    property get onlyPrimaryRelationships () : boolean {
      return getRequireValue("onlyPrimaryRelationships", 0) as java.lang.Boolean
    }
    
    property set onlyPrimaryRelationships ($arg :  boolean) {
      setRequireValue("onlyPrimaryRelationships", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getRequireValue("proximitySearchPageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setRequireValue("proximitySearchPageHelper", 0, $arg)
    }
    
    
  }
  
  
}