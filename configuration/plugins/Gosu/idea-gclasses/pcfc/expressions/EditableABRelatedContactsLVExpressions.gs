package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/EditableABRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableABRelatedContactsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/EditableABRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableABRelatedContactsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableABRelatedContactsLV.pcf: line 46, column 108
    function sortValue_0 (contactContact :  entity.ContactContact) : java.lang.Object {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact
    }
    
    // 'toAdd' attribute on RowIterator at EditableABRelatedContactsLV.pcf: line 34, column 43
    function toAdd_12 (contactContact :  entity.ContactContact) : void {
      primaryContact.addContactContact(contactContact); contactContact.setBidiRel(primaryContact, relationship)
    }
    
    // 'toRemove' attribute on RowIterator at EditableABRelatedContactsLV.pcf: line 34, column 43
    function toRemove_13 (contactContact :  entity.ContactContact) : void {
      primaryContact.removeContactContact(contactContact)
    }
    
    // 'value' attribute on RowIterator at EditableABRelatedContactsLV.pcf: line 34, column 43
    function value_14 () : entity.ContactContact[] {
      return primaryContact.getContactContactsByRelationship(relationship)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    property get primaryContact () : Contact {
      return getRequireValue("primaryContact", 0) as Contact
    }
    
    property set primaryContact ($arg :  Contact) {
      setRequireValue("primaryContact", 0, $arg)
    }
    
    property get relationship () : ContactBidiRel {
      return getRequireValue("relationship", 0) as ContactBidiRel
    }
    
    property set relationship ($arg :  ContactBidiRel) {
      setRequireValue("relationship", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/EditableABRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableABRelatedContactsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_10 () : java.lang.Boolean {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact != null
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function action_3 () : void {
      AddressBookPickerPopup.push(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 14, column 151
    function action_5 () : void {
      new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).setNoneSelected()
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function action_6 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact),true)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_4 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact),true)
    }
    
    // 'value' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on AddressBookContactCell (id=Contact) at EditableABRelatedContactsLV.pcf: line 46, column 108
    function value_1 () : entity.Contact {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact
    }
    
    // 'visible' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function visible_2 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)" != "" && true
    }
    
    property get contactContact () : entity.ContactContact {
      return getIteratedValue(1) as entity.ContactContact
    }
    
    
  }
  
  
}