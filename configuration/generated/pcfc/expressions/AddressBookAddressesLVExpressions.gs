package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAddressesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAddressesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AddressBookAddressesLV.pcf: line 33, column 54
    function sortValue_0 (address :  entity.Address) : java.lang.Object {
      return address == contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at AddressBookAddressesLV.pcf: line 39, column 44
    function sortValue_1 (address :  entity.Address) : java.lang.Object {
      return address.AddressType
    }
    
    // 'value' attribute on RowIterator at AddressBookAddressesLV.pcf: line 44, column 40
    function sortValue_2 (address :  entity.Address) : java.lang.Object {
      return address.DisplayName
    }
    
    // 'toAdd' attribute on RowIterator at AddressBookAddressesLV.pcf: line 23, column 36
    function toAdd_12 (address :  entity.Address) : void {
      contact.addAddress(address)
    }
    
    // 'toRemove' attribute on RowIterator at AddressBookAddressesLV.pcf: line 23, column 36
    function toRemove_13 (address :  entity.Address) : void {
      contact.removeAddress(address)
    }
    
    // 'value' attribute on RowIterator at AddressBookAddressesLV.pcf: line 23, column 36
    function value_14 () : entity.Address[] {
      return contact.AllAddresses
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookAddressesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on RadioButtonCell (id=Primary) at AddressBookAddressesLV.pcf: line 33, column 54
    function action_4 () : void {
      contact.makePrimaryAddress(address)
    }
    
    // 'value' attribute on TypeKeyCell (id=AddressType) at AddressBookAddressesLV.pcf: line 39, column 44
    function valueRoot_8 () : java.lang.Object {
      return address
    }
    
    // 'value' attribute on RadioButtonCell (id=Primary) at AddressBookAddressesLV.pcf: line 33, column 54
    function value_3 () : java.lang.Boolean {
      return address == contact.PrimaryAddress
    }
    
    // 'value' attribute on TypeKeyCell (id=AddressType) at AddressBookAddressesLV.pcf: line 39, column 44
    function value_6 () : typekey.AddressType {
      return address.AddressType
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at AddressBookAddressesLV.pcf: line 44, column 40
    function value_9 () : java.lang.String {
      return address.DisplayName
    }
    
    property get address () : entity.Address {
      return getIteratedValue(1) as entity.Address
    }
    
    
  }
  
  
}