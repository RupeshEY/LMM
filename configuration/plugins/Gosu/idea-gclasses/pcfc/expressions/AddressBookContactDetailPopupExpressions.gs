package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (externalContact :  gw.api.contact.ExternalContact) : int {
      return 0
    }
    
    static function __constructorIndex (externalContact :  gw.api.contact.ExternalContact, allowEdit :  boolean) : int {
      return 1
    }
    
    // 'canEdit' attribute on Popup (id=AddressBookContactDetailPopup) at AddressBookContactDetailPopup.pcf: line 10, column 90
    function canEdit_7 () : java.lang.Boolean {
      return externalContact.Source.supportsUpdate() and perm.Contact.editab(externalContact.Contact) and allowEdit
    }
    
    // 'canVisit' attribute on Popup (id=AddressBookContactDetailPopup) at AddressBookContactDetailPopup.pcf: line 10, column 90
    static function canVisit_8 (allowEdit :  boolean, externalContact :  gw.api.contact.ExternalContact) : java.lang.Boolean {
      return perm.Contact.viewab(externalContact.Contact)
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetailPopup.pcf: line 32, column 58
    function def_onEnter_2 (def :  pcf.AddressBookContactDetailScreen_default) : void {
      def.onEnter(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact, allowEdit))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetailPopup.pcf: line 32, column 58
    function def_onEnter_4 (def :  pcf.AddressBookContactDetailScreen_error) : void {
      def.onEnter(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact, allowEdit))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetailPopup.pcf: line 32, column 58
    function def_refreshVariables_3 (def :  pcf.AddressBookContactDetailScreen_default) : void {
      def.refreshVariables(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact, allowEdit))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetailPopup.pcf: line 32, column 58
    function def_refreshVariables_5 (def :  pcf.AddressBookContactDetailScreen_error) : void {
      def.refreshVariables(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact, allowEdit))
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailPopup.pcf: line 18, column 56
    function initialValue_0 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailPopup.pcf: line 25, column 23
    function initialValue_1 () : Contact {
      return externalContact.Source.loadContact(externalContact.Contact, false)
    }
    
    // 'mode' attribute on ScreenRef at AddressBookContactDetailPopup.pcf: line 32, column 58
    function mode_6 () : java.lang.Object {
      return contact == null ? "error" : null
    }
    
    // 'title' attribute on Popup (id=AddressBookContactDetailPopup) at AddressBookContactDetailPopup.pcf: line 10, column 90
    static function title_9 (allowEdit :  boolean, externalContact :  gw.api.contact.ExternalContact) : java.lang.Object {
      return DisplayKey.get("Web.ContactDetail.Title", externalContact.Contact)
    }
    
    override property get CurrentLocation () : pcf.AddressBookContactDetailPopup {
      return super.CurrentLocation as pcf.AddressBookContactDetailPopup
    }
    
    property get PageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get allowEdit () : boolean {
      return getVariableValue("allowEdit", 0) as java.lang.Boolean
    }
    
    property set allowEdit ($arg :  boolean) {
      setVariableValue("allowEdit", 0, $arg)
    }
    
    property get contact () : Contact {
      return getVariableValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setVariableValue("contact", 0, $arg)
    }
    
    property get externalContact () : gw.api.contact.ExternalContact {
      return getVariableValue("externalContact", 0) as gw.api.contact.ExternalContact
    }
    
    property set externalContact ($arg :  gw.api.contact.ExternalContact) {
      setVariableValue("externalContact", 0, $arg)
    }
    
    
  }
  
  
}