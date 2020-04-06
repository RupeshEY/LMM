package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchLocationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CCAddressBookSearchLocationInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchLocationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCAddressBookSearchLocationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at CCAddressBookSearchLocationInputSet.pcf: line 18, column 46
    function def_onEnter_1 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef at CCAddressBookSearchLocationInputSet.pcf: line 18, column 46
    function def_refreshVariables_2 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'initialValue' attribute on Variable at CCAddressBookSearchLocationInputSet.pcf: line 14, column 45
    function initialValue_0 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.ContactSearchAddressOwner(contactSearchCriteria){ :AlwaysShowSeparateFields = true } 
    }
    
    property get addressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("addressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("addressOwner", 0, $arg)
    }
    
    property get contactSearchCriteria () : ContactSearchCriteria {
      return getRequireValue("contactSearchCriteria", 0) as ContactSearchCriteria
    }
    
    property set contactSearchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("contactSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}