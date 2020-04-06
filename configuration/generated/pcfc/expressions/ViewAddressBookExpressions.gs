package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/ViewAddressBook.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ViewAddressBookExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/ViewAddressBook.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewAddressBookExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (linkedContact :  Contact) : int {
      return 0
    }
    
    static function __constructorIndex (linkedContact :  Contact, allowEditInAddressBook :  boolean) : int {
      return 1
    }
    
    // 'action' attribute on Forward (id=ViewAddressBook) at ViewAddressBook.pcf: line 7, column 26
    function action_2 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(linkedContact), allowEditInAddressBook)
    }
    
    // 'action' attribute on Forward (id=ViewAddressBook) at ViewAddressBook.pcf: line 7, column 26
    function action_dest_3 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(linkedContact), allowEditInAddressBook)
    }
    
    // 'initialValue' attribute on Variable at ViewAddressBook.pcf: line 19, column 56
    function initialValue_0 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at ViewAddressBook.pcf: line 24, column 52
    function initialValue_1 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    override property get CurrentLocation () : pcf.ViewAddressBook {
      return super.CurrentLocation as pcf.ViewAddressBook
    }
    
    property get allowEditInAddressBook () : boolean {
      return getVariableValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setVariableValue("allowEditInAddressBook", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get linkedContact () : Contact {
      return getVariableValue("linkedContact", 0) as Contact
    }
    
    property set linkedContact ($arg :  Contact) {
      setVariableValue("linkedContact", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("proximitySearchPageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("proximitySearchPageHelper", 0, $arg)
    }
    
    
  }
  
  
}