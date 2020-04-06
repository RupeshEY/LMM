package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.contact.ContactUtil
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddSelectedDuplicatePartiesInvolvedPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddSelectedDuplicatePartiesInvolvedPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact, roles :  gw.api.contact.ClaimContactRoleWrapper) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=AddSelectedDuplicatePartiesInvolvedPopup) at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 11, column 100
    static function canVisit_4 (claim :  Claim, roles :  gw.api.contact.ClaimContactRoleWrapper, tempContact :  gw.api.contact.TemporaryContact) : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'def' attribute on ScreenRef at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 32, column 111
    function def_onEnter_2 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(claimContact, true, true, linkStatus, claimContact.Claim, true, false, true)
    }
    
    // 'def' attribute on ScreenRef at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 32, column 111
    function def_refreshVariables_3 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(claimContact, true, true, linkStatus, claimContact.Claim, true, false, true)
    }
    
    // 'initialValue' attribute on Variable at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 17, column 28
    function initialValue_0 () : ClaimContact {
      return createClaimContact()
    }
    
    // 'initialValue' attribute on Variable at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 30, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(claimContact.Contact)
    }
    
    // 'title' attribute on Popup (id=AddSelectedDuplicatePartiesInvolvedPopup) at AddSelectedDuplicatePartiesInvolvedPopup.pcf: line 11, column 100
    static function title_5 (claim :  Claim, roles :  gw.api.contact.ClaimContactRoleWrapper, tempContact :  gw.api.contact.TemporaryContact) : java.lang.Object {
      return gw.api.contact.NewContactUtil.getDisplayKeyForContactSubtype(tempContact.Subtype.Code)
    }
    
    override property get CurrentLocation () : pcf.AddSelectedDuplicatePartiesInvolvedPopup {
      return super.CurrentLocation as pcf.AddSelectedDuplicatePartiesInvolvedPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getVariableValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setVariableValue("claimContact", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    property get roles () : gw.api.contact.ClaimContactRoleWrapper {
      return getVariableValue("roles", 0) as gw.api.contact.ClaimContactRoleWrapper
    }
    
    property set roles ($arg :  gw.api.contact.ClaimContactRoleWrapper) {
      setVariableValue("roles", 0, $arg)
    }
    
    property get tempContact () : gw.api.contact.TemporaryContact {
      return getVariableValue("tempContact", 0) as gw.api.contact.TemporaryContact
    }
    
    property set tempContact ($arg :  gw.api.contact.TemporaryContact) {
      setVariableValue("tempContact", 0, $arg)
    }
    
    
    function createClaimContact() : ClaimContact {
      var cc = gw.api.claimparties.ClaimContactUtil.createClaimContact(claim, tempContact)  
      cc = roles.addRolesToClaimContact(cc)  
      return cc;
    }
    
    
  }
  
  
}