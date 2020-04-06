package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.Exception
uses gw.plugin.contact.ContactSystemApprovalUtil
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_PartyInvolvedPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PartyInvolvedPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Wizard :  gw.api.claim.NewClaimWizardInfo, ClaimContact :  ClaimContact, IsNew :  boolean) : int {
      return 0
    }
    
    static function __constructorIndex (WizardBase :  gw.api.claim.NewClaimWizardInfoBase, ClaimContact :  ClaimContact, IsNew :  boolean, IsDuplicate :  boolean, roles :  gw.api.contact.ClaimContactRoleWrapper) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=CustomUpdateButton) at NewClaimWizard_PartyInvolvedPopup.pcf: line 56, column 82
    function action_3 () : void {
      customUpdate()
    }
    
    // 'action' attribute on ToolbarButton (id=CheckDuplicatesButton) at NewClaimWizard_PartyInvolvedPopup.pcf: line 63, column 113
    function action_7 () : void {
      checkForDuplicates(true)
    }
    
    // 'afterCancel' attribute on Popup (id=NewClaimWizard_PartyInvolvedPopup) at NewClaimWizard_PartyInvolvedPopup.pcf: line 11, column 176
    function afterCancel_25 () : void {
      if (IsNew) { cancelClaimContact() }
    }
    
    // 'afterEnter' attribute on Popup (id=NewClaimWizard_PartyInvolvedPopup) at NewClaimWizard_PartyInvolvedPopup.pcf: line 11, column 176
    function afterEnter_26 () : void {
      if (IsDuplicate) { addRoles() }
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_onEnter_10 (def :  pcf.ContactBasicsDV_Person) : void {
      def.onEnter(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_onEnter_12 (def :  pcf.ContactBasicsDV_Place) : void {
      def.onEnter(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_onEnter_14 (def :  pcf.ContactBasicsDV_default) : void {
      def.onEnter(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 80, column 51
    function def_onEnter_17 (def :  pcf.AddressesPanelSet) : void {
      def.onEnter(ClaimContact)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 89, column 58
    function def_onEnter_20 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 99, column 65
    function def_onEnter_23 (def :  pcf.ContactRelatedContactsDV) : void {
      def.onEnter(ClaimContact, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_onEnter_8 (def :  pcf.ContactBasicsDV_Company) : void {
      def.onEnter(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_refreshVariables_11 (def :  pcf.ContactBasicsDV_Person) : void {
      def.refreshVariables(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_refreshVariables_13 (def :  pcf.ContactBasicsDV_Place) : void {
      def.refreshVariables(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_refreshVariables_15 (def :  pcf.ContactBasicsDV_default) : void {
      def.refreshVariables(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 80, column 51
    function def_refreshVariables_18 (def :  pcf.AddressesPanelSet) : void {
      def.refreshVariables(ClaimContact)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 89, column 58
    function def_refreshVariables_21 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 99, column 65
    function def_refreshVariables_24 (def :  pcf.ContactRelatedContactsDV) : void {
      def.refreshVariables(ClaimContact, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function def_refreshVariables_9 (def :  pcf.ContactBasicsDV_Company) : void {
      def.refreshVariables(ClaimContact, true, linkStatus, Claim)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_PartyInvolvedPopup.pcf: line 29, column 28
    function initialValue_0 () : entity.Claim {
      return ClaimContact.Claim
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_PartyInvolvedPopup.pcf: line 34, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // EditButtons at NewClaimWizard_PartyInvolvedPopup.pcf: line 58, column 91
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_PartyInvolvedPopup.pcf: line 71, column 36
    function mode_16 () : java.lang.Object {
      return Contact.Subtype
    }
    
    // 'title' attribute on Popup (id=NewClaimWizard_PartyInvolvedPopup) at NewClaimWizard_PartyInvolvedPopup.pcf: line 11, column 176
    static function title_27 (ClaimContact :  ClaimContact, IsDuplicate :  boolean, IsNew :  boolean, Wizard :  gw.api.claim.NewClaimWizardInfo, WizardBase :  gw.api.claim.NewClaimWizardInfoBase, roles :  gw.api.contact.ClaimContactRoleWrapper) : java.lang.Object {
      return IsNew ? DisplayKey.get("Wizard.NewClaimWizard.NewClaimPartyInvolved.New") : DisplayKey.get("Wizard.NewClaimWizard.NewClaimPartyInvolved.Edit")
    }
    
    // 'visible' attribute on Card (id=NewClaimWizard_PartyInvolvedAddressesCard) at NewClaimWizard_PartyInvolvedPopup.pcf: line 78, column 45
    function visible_19 () : java.lang.Boolean {
      return !(Contact typeis Place)
    }
    
    // 'visible' attribute on ToolbarButton (id=CustomUpdateButton) at NewClaimWizard_PartyInvolvedPopup.pcf: line 56, column 82
    function visible_2 () : java.lang.Boolean {
      return Contact.PublicID == null and Contact.AddressBookUID == null
    }
    
    // 'visible' attribute on Card (id=ContactDocumentsCard) at NewClaimWizard_PartyInvolvedPopup.pcf: line 87, column 99
    function visible_22 () : java.lang.Boolean {
      return new gw.contact.ContactDocumentsUIHelper().isVendorDocumentsSupported(Contact)
    }
    
    // 'updateVisible' attribute on EditButtons at NewClaimWizard_PartyInvolvedPopup.pcf: line 58, column 91
    function visible_4 () : java.lang.Boolean {
      return !(Contact.PublicID == null and Contact.AddressBookUID == null)
    }
    
    // 'visible' attribute on ToolbarButton (id=CheckDuplicatesButton) at NewClaimWizard_PartyInvolvedPopup.pcf: line 63, column 113
    function visible_6 () : java.lang.Boolean {
      return Contact.PublicID == null and Contact.AddressBookUID == null and CurrentLocation.InEditMode
    }
    
    property get Claim () : entity.Claim {
      return getVariableValue("Claim", 0) as entity.Claim
    }
    
    property set Claim ($arg :  entity.Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get ClaimContact () : ClaimContact {
      return getVariableValue("ClaimContact", 0) as ClaimContact
    }
    
    property set ClaimContact ($arg :  ClaimContact) {
      setVariableValue("ClaimContact", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_PartyInvolvedPopup {
      return super.CurrentLocation as pcf.NewClaimWizard_PartyInvolvedPopup
    }
    
    property get IsDuplicate () : boolean {
      return getVariableValue("IsDuplicate", 0) as java.lang.Boolean
    }
    
    property set IsDuplicate ($arg :  boolean) {
      setVariableValue("IsDuplicate", 0, $arg)
    }
    
    property get IsNew () : boolean {
      return getVariableValue("IsNew", 0) as java.lang.Boolean
    }
    
    property set IsNew ($arg :  boolean) {
      setVariableValue("IsNew", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    property get WizardBase () : gw.api.claim.NewClaimWizardInfoBase {
      return getVariableValue("WizardBase", 0) as gw.api.claim.NewClaimWizardInfoBase
    }
    
    property set WizardBase ($arg :  gw.api.claim.NewClaimWizardInfoBase) {
      setVariableValue("WizardBase", 0, $arg)
    }
    
    property get alreadyCheckedDuplicates () : boolean {
      return getVariableValue("alreadyCheckedDuplicates", 0) as java.lang.Boolean
    }
    
    property set alreadyCheckedDuplicates ($arg :  boolean) {
      setVariableValue("alreadyCheckedDuplicates", 0, $arg)
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
    
    
    property get Contact() : Contact { return ClaimContact.Contact; }
    
    function addRoles() {
      roles.addRolesToClaimContact(ClaimContact)
    }
    
    function customUpdate() {
      if (!alreadyCheckedDuplicates and Contact.PublicID == null and Contact.AddressBookUID == null and (ContactSystemApprovalUtil.shouldCreateInContactSystem(Contact) or ClaimContact == null)) {
        if (!checkForDuplicates(false)) {
          gw.api.contact.ContactUtil.customCommit(false, Contact, CurrentLocation) 
        }
      } else {
        gw.api.contact.ContactUtil.customCommit(false, Contact, CurrentLocation)
      }
    }
    
    function checkForDuplicates(showMessage : boolean) : boolean {
      var hasDuplicates : boolean
      try {
        hasDuplicates = gw.api.contact.ContactUtil.findDuplicates(Contact, ClaimContact, showMessage, Wizard)    
      } catch (e : Exception) {
        if (showMessage) {
          throw e
        }  
      }
      alreadyCheckedDuplicates = true;
      return hasDuplicates;
    }
    
    function cancelClaimContact() {
      if (Wizard != null) {
        Wizard.cancelClaimContact(ClaimContact)  
      } else {
        WizardBase.cancelClaimContact(ClaimContact)  
      }
    }
    
    
  }
  
  
}