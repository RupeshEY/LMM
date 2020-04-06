package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/newcontact/NewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewContactPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/newcontact/NewContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (contactSubtype :  typekey.Contact, parentContact :  Contact, claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=NewContactPopup) at NewContactPopup.pcf: line 11, column 95
    static function canVisit_5 (claim :  Claim, contactSubtype :  typekey.Contact, parentContact :  Contact) : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'def' attribute on ScreenRef at NewContactPopup.pcf: line 38, column 113
    function def_onEnter_3 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(contactHandle, true, false, linkStatus, claim, true, showRelatedObjects, true)
    }
    
    // 'def' attribute on ScreenRef at NewContactPopup.pcf: line 38, column 113
    function def_refreshVariables_4 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(contactHandle, true, false, linkStatus, claim, true, showRelatedObjects, true)
    }
    
    // 'initialValue' attribute on Variable at NewContactPopup.pcf: line 26, column 52
    function initialValue_0 () : gw.api.contact.LocationContactHandle {
      return new gw.api.contact.LocationContactHandle(gw.api.contact.NewContactUtil.newContactFromSubtype(contactSubtype))
    }
    
    // 'initialValue' attribute on Variable at NewContactPopup.pcf: line 31, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // 'initialValue' attribute on Variable at NewContactPopup.pcf: line 36, column 23
    function initialValue_2 () : boolean {
      return (linkStatus != null and linkStatus.Known and linkStatus.Linked) ? true : false
    }
    
    // 'title' attribute on Popup (id=NewContactPopup) at NewContactPopup.pcf: line 11, column 95
    static function title_6 (claim :  Claim, contactSubtype :  typekey.Contact, parentContact :  Contact) : java.lang.Object {
      return gw.api.contact.NewContactUtil.getDisplayKeyForContactSubtype(contactSubtype.Code)
    }
    
    override property get CurrentLocation () : pcf.NewContactPopup {
      return super.CurrentLocation as pcf.NewContactPopup
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
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    
    property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}