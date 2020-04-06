package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchNewContactPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchNewContactPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (searchCriteria :  ContactSearchCriteria, contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=AddressBookSearchNewContactPopup) at AddressBookSearchNewContactPopup.pcf: line 11, column 95
    static function canVisit_4 (claim :  Claim, contactSubtype :  typekey.Contact, parentContact :  Contact, searchCriteria :  ContactSearchCriteria) : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'def' attribute on ScreenRef at AddressBookSearchNewContactPopup.pcf: line 36, column 98
    function def_onEnter_2 (def :  pcf.AddressBookSearchContactDetailScreen) : void {
      def.onEnter(contactHandle, true, false, linkStatus, claim)
    }
    
    // 'def' attribute on ScreenRef at AddressBookSearchNewContactPopup.pcf: line 36, column 98
    function def_refreshVariables_3 (def :  pcf.AddressBookSearchContactDetailScreen) : void {
      def.refreshVariables(contactHandle, true, false, linkStatus, claim)
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchNewContactPopup.pcf: line 29, column 52
    function initialValue_0 () : gw.api.contact.LocationContactHandle {
      return new gw.api.contact.LocationContactHandle(createNewContact())
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchNewContactPopup.pcf: line 34, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // 'title' attribute on Popup (id=AddressBookSearchNewContactPopup) at AddressBookSearchNewContactPopup.pcf: line 11, column 95
    static function title_5 (claim :  Claim, contactSubtype :  typekey.Contact, parentContact :  Contact, searchCriteria :  ContactSearchCriteria) : java.lang.Object {
      return gw.api.contact.NewContactUtil.getDisplayKeyForContactSubtype(contactSubtype.Code)
    }
    
    override property get CurrentLocation () : pcf.AddressBookSearchNewContactPopup {
      return super.CurrentLocation as pcf.AddressBookSearchNewContactPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.LocationContactHandle {
      return getVariableValue("contactHandle", 0) as gw.api.contact.LocationContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.LocationContactHandle) {
      setVariableValue("contactHandle", 0, $arg)
    }
    
    property get contactSubtype () : typekey.Contact {
      return getVariableValue("contactSubtype", 0) as typekey.Contact
    }
    
    property set contactSubtype ($arg :  typekey.Contact) {
      setVariableValue("contactSubtype", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    property get parentContact () : Contact {
      return getVariableValue("parentContact", 0) as Contact
    }
    
    property set parentContact ($arg :  Contact) {
      setVariableValue("parentContact", 0, $arg)
    }
    
    property get searchCriteria () : ContactSearchCriteria {
      return getVariableValue("searchCriteria", 0) as ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  ContactSearchCriteria) {
      setVariableValue("searchCriteria", 0, $arg)
    }
    
    
    property get Contact() : Contact { return contactHandle.Contact; }
    
          function createNewContact() : Contact {
            var newContact : Contact = gw.api.contact.NewContactUtil.newContactFromSubtype(contactSubtype);
            if (searchCriteria != null) {
              populateContact( searchCriteria, newContact );
            }
            return newContact;
          }
    
          function populateContact( sCriteria : ContactSearchCriteria, sContact : Contact ) {
            var populateString = "sCriteria.populate" + contactSubtype.Code + "( sContact )";
            var e = eval( populateString );
          }
        
    
    
  }
  
  
}