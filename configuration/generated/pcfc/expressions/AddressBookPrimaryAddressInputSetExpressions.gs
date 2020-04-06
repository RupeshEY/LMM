package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPrimaryAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookPrimaryAddressInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPrimaryAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookPrimaryAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookPrimaryAddressInputSet.pcf: line 13, column 54
    function def_onEnter_0 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(contact.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at AddressBookPrimaryAddressInputSet.pcf: line 13, column 54
    function def_refreshVariables_1 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(contact.AddressOwner)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    
  }
  
  
}