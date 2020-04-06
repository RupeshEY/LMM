package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookContactDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (externalContact :  gw.api.contact.ExternalContact) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=AddressBookContactDetail) at AddressBookContactDetail.pcf: line 11, column 90
    function canEdit_6 () : java.lang.Boolean {
      return externalContact.Source.supportsUpdate() and perm.Contact.editab(externalContact.Contact)
    }
    
    // 'canVisit' attribute on Page (id=AddressBookContactDetail) at AddressBookContactDetail.pcf: line 11, column 90
    static function canVisit_7 (externalContact :  gw.api.contact.ExternalContact) : java.lang.Boolean {
      return perm.Contact.viewab(externalContact.Contact)
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetail.pcf: line 26, column 132
    function def_onEnter_2 (def :  pcf.AddressBookContactDetailScreen_default) : void {
      def.onEnter(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetail.pcf: line 26, column 132
    function def_onEnter_4 (def :  pcf.AddressBookContactDetailScreen_error) : void {
      def.onEnter(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetail.pcf: line 26, column 132
    function def_refreshVariables_3 (def :  pcf.AddressBookContactDetailScreen_default) : void {
      def.refreshVariables(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact))
    }
    
    // 'def' attribute on ScreenRef at AddressBookContactDetail.pcf: line 26, column 132
    function def_refreshVariables_5 (def :  pcf.AddressBookContactDetailScreen_error) : void {
      def.refreshVariables(new gw.pcf.AddressBookContactHelper(contact, externalContact.Source, externalContact))
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetail.pcf: line 17, column 56
    function initialValue_0 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetail.pcf: line 24, column 23
    function initialValue_1 () : Contact {
      return externalContact.Source.loadContact(externalContact.Contact, true)
    }
    
    // 'parent' attribute on Page (id=AddressBookContactDetail) at AddressBookContactDetail.pcf: line 11, column 90
    static function parent_8 (externalContact :  gw.api.contact.ExternalContact) : pcf.api.Destination {
      return pcf.AddressBook.createDestination()
    }
    
    // 'title' attribute on Page (id=AddressBookContactDetail) at AddressBookContactDetail.pcf: line 11, column 90
    static function title_9 (externalContact :  gw.api.contact.ExternalContact) : java.lang.Object {
      return DisplayKey.get("Web.ContactDetail.Title", externalContact.Contact)
    }
    
    override property get CurrentLocation () : pcf.AddressBookContactDetail {
      return super.CurrentLocation as pcf.AddressBookContactDetail
    }
    
    property get PageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
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