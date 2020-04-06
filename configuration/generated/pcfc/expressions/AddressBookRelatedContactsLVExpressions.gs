package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookRelatedContactsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookRelatedContactsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 45, column 107
    function sortValue_0 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(primaryContact).PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 45, column 107
    function sortValue_1 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(primaryContact).SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 45, column 107
    function sortValue_2 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(primaryContact).TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 45, column 107
    function sortValue_3 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(primaryContact).QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function sortValue_4 (contactContact :  entity.ContactContact) : java.lang.Object {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).BidiRel
    }
    
    // 'toAdd' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 29, column 43
    function toAdd_22 (contactContact :  entity.ContactContact) : void {
      primaryContact.addContactContact(contactContact)
    }
    
    // 'toRemove' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 29, column 43
    function toRemove_23 (contactContact :  entity.ContactContact) : void {
      primaryContact.removeContactContact(contactContact)
    }
    
    // 'value' attribute on RowIterator at AddressBookRelatedContactsLV.pcf: line 29, column 43
    function value_24 () : entity.ContactContact[] {
      return primaryContact.AllContactContacts
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
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
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookRelatedContactsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_14 () : java.lang.Boolean {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact != null
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function action_10 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function action_7 () : void {
      AddressBookPickerPopup.push(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 14, column 151
    function action_9 () : void {
      new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).setNoneSelected()
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_8 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)
    }
    
    // 'value' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).BidiRel = (__VALUE_TO_SET as typekey.ContactBidiRel)
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function valueRange_19 () : java.lang.Object {
      return primaryContact.getPossibleBidiRelsToContact(contactContact.getOtherContact(primaryContact))
    }
    
    // 'value' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function value_16 () : typekey.ContactBidiRel {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).BidiRel
    }
    
    // 'value' attribute on AddressBookContactCell (id=Contact) at AddressBookRelatedContactsLV.pcf: line 45, column 107
    function value_5 () : entity.Contact {
      return new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContact
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function verifyValueRangeIsAllowedType_20 ($$arg :  typekey.ContactBidiRel[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at AddressBookRelatedContactsLV.pcf: line 57, column 46
    function verifyValueRange_21 () : void {
      var __valueRangeArg = primaryContact.getPossibleBidiRelsToContact(contactContact.getOtherContact(primaryContact))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'visible' attribute on AddressBookContactCell (id=Contact) at AddressBookContactWidget.xml: line 12, column 225
    function visible_6 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(new util.lvwrapper.ContactContactLVWrapper(contactContact, primaryContact).OtherContactType)" != "" && true
    }
    
    property get contactContact () : entity.ContactContact {
      return getIteratedValue(1) as entity.ContactContact
    }
    
    
  }
  
  
}