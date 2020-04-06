package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ClaimContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimContactDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/ClaimContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (inputContact :  Contact, claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean) : int {
      return 1
    }
    
    static function __constructorIndex (inputContact :  Contact, claim :  Claim, startInEditMode :  boolean, allowEditInAddressBook :  boolean) : int {
      return 2
    }
    
    // 'canEdit' attribute on Popup (id=ClaimContactDetailPopup) at ClaimContactDetailPopup.pcf: line 13, column 38
    function canEdit_6 () : java.lang.Boolean {
      return (inputContact != null and perm.Contact.editlocal(inputContact)) and (claim != null and perm.Claim.edit(claim))
    }
    
    // 'canVisit' attribute on Popup (id=ClaimContactDetailPopup) at ClaimContactDetailPopup.pcf: line 13, column 38
    static function canVisit_7 (allowEditInAddressBook :  boolean, claim :  Claim, inputContact :  Contact, startInEditMode :  boolean) : java.lang.Boolean {
      return inputContact != null and perm.Contact.viewlocal and (claim != null and perm.Claim.view(claim))
    }
    
    // 'def' attribute on ScreenRef at ClaimContactDetailPopup.pcf: line 53, column 132
    function def_onEnter_4 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(contactHandle, true, false, linkStatus, claim, false, showRelatedObjects, allowEditInAddressBook)
    }
    
    // 'def' attribute on ScreenRef at ClaimContactDetailPopup.pcf: line 53, column 132
    function def_refreshVariables_5 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(contactHandle, true, false, linkStatus, claim, false, showRelatedObjects, allowEditInAddressBook)
    }
    
    // 'initialValue' attribute on Variable at ClaimContactDetailPopup.pcf: line 29, column 28
    function initialValue_0 () : ClaimContact {
      return claim == null ? null : claim.getClaimContact(inputContact)
    }
    
    // 'initialValue' attribute on Variable at ClaimContactDetailPopup.pcf: line 33, column 44
    function initialValue_1 () : gw.api.contact.ContactHandle {
      return claimContact == null ? new gw.api.contact.LocationContactHandle(inputContact) : claimContact
    }
    
    // 'initialValue' attribute on Variable at ClaimContactDetailPopup.pcf: line 38, column 54
    function initialValue_2 () : gw.api.contact.ContactSystemLinkStatus {
      return Contact==null ? null : gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // 'initialValue' attribute on Variable at ClaimContactDetailPopup.pcf: line 47, column 23
    function initialValue_3 () : boolean {
      return linkStatus.Known and linkStatus.Linked
    }
    
    // 'startInEditMode' attribute on Popup (id=ClaimContactDetailPopup) at ClaimContactDetailPopup.pcf: line 13, column 38
    function startInEditMode_8 () : java.lang.Boolean {
      return startInEditMode
    }
    
    // 'title' attribute on Popup (id=ClaimContactDetailPopup) at ClaimContactDetailPopup.pcf: line 13, column 38
    static function title_9 (allowEditInAddressBook :  boolean, claim :  Claim, inputContact :  Contact, startInEditMode :  boolean) : java.lang.Object {
      return inputContact.DisplayName
    }
    
    override property get CurrentLocation () : pcf.ClaimContactDetailPopup {
      return super.CurrentLocation as pcf.ClaimContactDetailPopup
    }
    
    property get allowEditInAddressBook () : boolean {
      return getVariableValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setVariableValue("allowEditInAddressBook", 0, $arg)
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
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getVariableValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setVariableValue("contactHandle", 0, $arg)
    }
    
    property get inputContact () : Contact {
      return getVariableValue("inputContact", 0) as Contact
    }
    
    property set inputContact ($arg :  Contact) {
      setVariableValue("inputContact", 0, $arg)
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
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    property get Contact() : Contact { return contactHandle.Contact; }
    
    
  }
  
  
}