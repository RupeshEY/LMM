package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAddressesPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAddressesPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends AddressBookAddressesPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AddressBookAddressesPanelSet.pcf: line 15, column 48
    function def_onEnter_0 (def :  pcf.AddressBookAddressesLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAddressesPanelSet.pcf: line 25, column 136
    function def_onEnter_2 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(new gw.api.address.AddressAddressOwner(selectedAddress){ :AlwaysShowSeparateFields = true } )
    }
    
    // 'def' attribute on PanelRef at AddressBookAddressesPanelSet.pcf: line 15, column 48
    function def_refreshVariables_1 (def :  pcf.AddressBookAddressesLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAddressesPanelSet.pcf: line 25, column 136
    function def_refreshVariables_3 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(new gw.api.address.AddressAddressOwner(selectedAddress){ :AlwaysShowSeparateFields = true } )
    }
    
    property get selectedAddress () : Address {
      return getCurrentSelection(1) as Address
    }
    
    property set selectedAddress ($arg :  Address) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}