package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AddressesLV.pcf: line 41, column 54
    function sortValue_0 (address :  entity.Address) : java.lang.Object {
      return address == Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at AddressesLV.pcf: line 46, column 44
    function sortValue_1 (address :  entity.Address) : java.lang.Object {
      return address.AddressType
    }
    
    // 'toAdd' attribute on RowIterator at AddressesLV.pcf: line 32, column 36
    function toAdd_11 (address :  entity.Address) : void {
      Contact.addAddress(address)
    }
    
    // 'toRemove' attribute on RowIterator at AddressesLV.pcf: line 32, column 36
    function toRemove_12 (address :  entity.Address) : void {
      Contact.removeAddress(address)
    }
    
    // 'value' attribute on RowIterator at AddressesLV.pcf: line 32, column 36
    function value_13 () : entity.Address[] {
      return Contact.AllAddresses
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
       property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on RadioButtonCell (id=Primary) at AddressesLV.pcf: line 41, column 54
    function action_3 () : void {
      Contact.makePrimaryAddress(address)
    }
    
    // 'value' attribute on TypeKeyCell (id=AddressType) at AddressesLV.pcf: line 46, column 44
    function valueRoot_7 () : java.lang.Object {
      return address
    }
    
    // 'value' attribute on RadioButtonCell (id=Primary) at AddressesLV.pcf: line 41, column 54
    function value_2 () : java.lang.Boolean {
      return address == Contact.PrimaryAddress
    }
    
    // 'value' attribute on TypeKeyCell (id=AddressType) at AddressesLV.pcf: line 46, column 44
    function value_5 () : typekey.AddressType {
      return address.AddressType
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at AddressesLV.pcf: line 49, column 40
    function value_8 () : java.lang.String {
      return address.DisplayName
    }
    
    property get address () : entity.Address {
      return getIteratedValue(1) as entity.Address
    }
    
    
  }
  
  
}