package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewPartyInvolvedPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPartyInvolvedPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, contactSubtype :  typekey.Contact) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=NewPartyInvolvedPopup) at NewPartyInvolvedPopup.pcf: line 11, column 95
    static function canVisit_5 (claim :  Claim, contactSubtype :  typekey.Contact) : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'def' attribute on ScreenRef at NewPartyInvolvedPopup.pcf: line 35, column 111
    function def_onEnter_3 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(claimContact, true, true, linkStatus, claim, true, showRelatedObjects, true)
    }
    
    // 'def' attribute on ScreenRef at NewPartyInvolvedPopup.pcf: line 35, column 111
    function def_refreshVariables_4 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(claimContact, true, true, linkStatus, claim, true, showRelatedObjects, true)
    }
    
    // 'initialValue' attribute on Variable at NewPartyInvolvedPopup.pcf: line 23, column 35
    function initialValue_0 () : entity.ClaimContact {
      return claim.createClaimContact(gw.api.contact.NewContactUtil.newContactFromSubtype(contactSubtype))
    }
    
    // 'initialValue' attribute on Variable at NewPartyInvolvedPopup.pcf: line 28, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // 'initialValue' attribute on Variable at NewPartyInvolvedPopup.pcf: line 33, column 23
    function initialValue_2 () : boolean {
      return (linkStatus != null and linkStatus.Known and linkStatus.Linked) ? true : false
    }
    
    // 'title' attribute on Popup (id=NewPartyInvolvedPopup) at NewPartyInvolvedPopup.pcf: line 11, column 95
    static function title_6 (claim :  Claim, contactSubtype :  typekey.Contact) : java.lang.Object {
      return gw.api.contact.NewContactUtil.getDisplayKeyForContactSubtype(contactSubtype.Code)
    }
    
    override property get CurrentLocation () : pcf.NewPartyInvolvedPopup {
      return super.CurrentLocation as pcf.NewPartyInvolvedPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimContact () : entity.ClaimContact {
      return getVariableValue("claimContact", 0) as entity.ClaimContact
    }
    
    property set claimContact ($arg :  entity.ClaimContact) {
      setVariableValue("claimContact", 0, $arg)
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
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    
    property get Contact() : Contact { return claimContact.Contact; }
        
    
    
  }
  
  
}