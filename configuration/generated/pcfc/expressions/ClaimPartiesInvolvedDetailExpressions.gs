package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPartiesInvolvedDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimPartiesInvolvedDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPartiesInvolvedDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimContact :  ClaimContact, claim :  Claim) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimPartiesInvolvedDetail) at ClaimPartiesInvolvedDetail.pcf: line 11, column 65
    function canEdit_5 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPartiesInvolvedDetail) at ClaimPartiesInvolvedDetail.pcf: line 11, column 65
    static function canVisit_6 (claim :  Claim, claimContact :  ClaimContact) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewclaimparties
    }
    
    // 'def' attribute on ScreenRef at ClaimPartiesInvolvedDetail.pcf: line 35, column 115
    function def_onEnter_3 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(claimContact, canAccessLinkButtons, true, linkStatus, claim, false, false, true)
    }
    
    // 'def' attribute on ScreenRef at ClaimPartiesInvolvedDetail.pcf: line 35, column 115
    function def_refreshVariables_4 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(claimContact, canAccessLinkButtons, true, linkStatus, claim, false, false, true)
    }
    
    // 'initialValue' attribute on Variable at ClaimPartiesInvolvedDetail.pcf: line 23, column 23
    function initialValue_0 () : boolean {
      return perm.Claim.managepartiesinvolved(claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimPartiesInvolvedDetail.pcf: line 28, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(claimContact.Contact)
    }
    
    // 'initialValue' attribute on Variable at ClaimPartiesInvolvedDetail.pcf: line 33, column 23
    function initialValue_2 () : boolean {
      return (linkStatus != null and linkStatus.Known and linkStatus.Linked) ? true : false
    }
    
    // 'parent' attribute on Page (id=ClaimPartiesInvolvedDetail) at ClaimPartiesInvolvedDetail.pcf: line 11, column 65
    static function parent_7 (claim :  Claim, claimContact :  ClaimContact) : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimPartiesInvolvedDetail {
      return super.CurrentLocation as pcf.ClaimPartiesInvolvedDetail
    }
    
    property get canAccessLinkButtons () : boolean {
      return getVariableValue("canAccessLinkButtons", 0) as java.lang.Boolean
    }
    
    property set canAccessLinkButtons ($arg :  boolean) {
      setVariableValue("canAccessLinkButtons", 0, $arg)
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
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    
  }
  
  
}