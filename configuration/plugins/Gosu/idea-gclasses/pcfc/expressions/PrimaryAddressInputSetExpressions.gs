package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/PrimaryAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PrimaryAddressInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/PrimaryAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PrimaryAddressInputSet.pcf: line 19, column 60
    function def_onEnter_0 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(contactHandle.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef at PrimaryAddressInputSet.pcf: line 19, column 60
    function def_refreshVariables_1 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(contactHandle.AddressOwner)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
  }
  
  
}