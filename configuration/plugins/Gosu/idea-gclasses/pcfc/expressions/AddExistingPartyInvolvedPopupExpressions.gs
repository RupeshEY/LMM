package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddExistingPartyInvolvedPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddExistingPartyInvolvedPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=AddExistingPartyInvolvedPopup) at AddExistingPartyInvolvedPopup.pcf: line 11, column 100
    static function canVisit_4 (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact) : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'def' attribute on ScreenRef at AddExistingPartyInvolvedPopup.pcf: line 30, column 98
    function def_onEnter_2 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(claimContact, true, true, linkStatus, claim, true, false, true)
    }
    
    // 'def' attribute on ScreenRef at AddExistingPartyInvolvedPopup.pcf: line 30, column 98
    function def_refreshVariables_3 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(claimContact, true, true, linkStatus, claim, true, false, true)
    }
    
    // 'initialValue' attribute on Variable at AddExistingPartyInvolvedPopup.pcf: line 23, column 35
    function initialValue_0 () : entity.ClaimContact {
      return gw.api.claimparties.ClaimContactUtil.createClaimContact(claim, tempContact)
    }
    
    // 'initialValue' attribute on Variable at AddExistingPartyInvolvedPopup.pcf: line 28, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(claimContact.Contact)
    }
    
    // 'title' attribute on Popup (id=AddExistingPartyInvolvedPopup) at AddExistingPartyInvolvedPopup.pcf: line 11, column 100
    static function title_5 (claim :  Claim, tempContact :  gw.api.contact.TemporaryContact) : java.lang.Object {
      return gw.api.contact.NewContactUtil.getDisplayKeyForContactSubtype(tempContact.Subtype.Code)
    }
    
    override property get CurrentLocation () : pcf.AddExistingPartyInvolvedPopup {
      return super.CurrentLocation as pcf.AddExistingPartyInvolvedPopup
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
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    property get tempContact () : gw.api.contact.TemporaryContact {
      return getVariableValue("tempContact", 0) as gw.api.contact.TemporaryContact
    }
    
    property set tempContact ($arg :  gw.api.contact.TemporaryContact) {
      setVariableValue("tempContact", 0, $arg)
    }
    
    
  }
  
  
}