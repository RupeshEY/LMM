package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactBasicsDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Label at AddressBookContactBasicsDV.default.pcf: line 20, column 36
    function label_1 () : java.lang.String {
      return DisplayKey.get("Web.ContactDetail.UndefinedType", contact.Subtype)
    }
    
    // 'visible' attribute on Label at AddressBookContactBasicsDV.default.pcf: line 20, column 36
    function visible_0 () : java.lang.Boolean {
      return contact != null
    }
    
    // 'visible' attribute on Label at AddressBookContactBasicsDV.default.pcf: line 23, column 36
    function visible_2 () : java.lang.Boolean {
      return contact == null
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}