package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressesPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressesPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressesPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends AddressesPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AddressesPanelSet.pcf: line 24, column 42
    function def_onEnter_0 (def :  pcf.AddressesLV) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AddressesPanelSet.pcf: line 39, column 135
    function def_onEnter_2 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(new gw.api.address.AddressAddressOwner(selectedAddress){ :AlwaysShowSeparateFields = true })
    }
    
    // 'def' attribute on PanelRef at AddressesPanelSet.pcf: line 24, column 42
    function def_refreshVariables_1 (def :  pcf.AddressesLV) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at AddressesPanelSet.pcf: line 39, column 135
    function def_refreshVariables_3 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(new gw.api.address.AddressAddressOwner(selectedAddress){ :AlwaysShowSeparateFields = true })
    }
    
    property get selectedAddress () : Address {
      return getCurrentSelection(1) as Address
    }
    
    property set selectedAddress ($arg :  Address) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}