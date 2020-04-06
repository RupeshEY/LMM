package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimContactsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardViewPanelExpressionsImpl extends PeopleInvolvedDetailedListDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ContactBasicsHeaderInputSet_TransferRolesButton) at ClaimContacts.pcf: line 139, column 91
    function action_38 () : void {
      ClaimContactTransferRolesPopup.push(selectedClaimContact.Claim, selectedClaimContact)
    }
    
    // 'action' attribute on ToolbarButton (id=ContactBasicsHeaderInputSet_TransferRolesButton) at ClaimContacts.pcf: line 139, column 91
    function action_dest_39 () : pcf.api.Destination {
      return pcf.ClaimContactTransferRolesPopup.createDestination(selectedClaimContact.Claim, selectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_onEnter_40 (def :  pcf.ContactBasicsDV_Company) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_onEnter_42 (def :  pcf.ContactBasicsDV_Person) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_onEnter_44 (def :  pcf.ContactBasicsDV_Place) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_onEnter_46 (def :  pcf.ContactBasicsDV_default) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 148, column 61
    function def_onEnter_51 (def :  pcf.AddressesPanelSet) : void {
      def.onEnter(selectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 160, column 81
    function def_onEnter_54 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.onEnter(selectedClaimContact.Contact)
    }
    
    // 'def' attribute on ListViewInput at ClaimContacts.pcf: line 180, column 33
    function def_onEnter_60 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.onEnter(selectedClaimContact, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 195, column 84
    function def_onEnter_64 (def :  pcf.ReviewsPanelSet) : void {
      def.onEnter(claim,selectedClaimContact.Contact,true,false)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_refreshVariables_41 (def :  pcf.ContactBasicsDV_Company) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_refreshVariables_43 (def :  pcf.ContactBasicsDV_Person) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_refreshVariables_45 (def :  pcf.ContactBasicsDV_Place) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function def_refreshVariables_47 (def :  pcf.ContactBasicsDV_default) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 148, column 61
    function def_refreshVariables_52 (def :  pcf.AddressesPanelSet) : void {
      def.refreshVariables(selectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 160, column 81
    function def_refreshVariables_55 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.refreshVariables(selectedClaimContact.Contact)
    }
    
    // 'def' attribute on ListViewInput at ClaimContacts.pcf: line 180, column 33
    function def_refreshVariables_61 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.refreshVariables(selectedClaimContact, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 195, column 84
    function def_refreshVariables_65 (def :  pcf.ReviewsPanelSet) : void {
      def.refreshVariables(claim,selectedClaimContact.Contact,true,false)
    }
    
    // 'initialValue' attribute on Variable at ClaimContacts.pcf: line 122, column 60
    function initialValue_34 () : gw.api.contact.ContactSystemLinkStatus {
      return selectedClaimContact.Contact==null ? null : gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(selectedClaimContact.Contact)
    }
    
    // 'mode' attribute on PanelRef at ClaimContacts.pcf: line 128, column 59
    function mode_48 () : java.lang.Object {
      return selectedClaimContact.Contact.Subtype
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 131, column 156
    function toolbarButtonSet_onEnter_35 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 151, column 156
    function toolbarButtonSet_onEnter_49 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 172, column 156
    function toolbarButtonSet_onEnter_57 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 198, column 156
    function toolbarButtonSet_onEnter_62 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 131, column 156
    function toolbarButtonSet_refreshVariables_36 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 151, column 156
    function toolbarButtonSet_refreshVariables_50 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 172, column 156
    function toolbarButtonSet_refreshVariables_58 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ClaimContacts.pcf: line 198, column 156
    function toolbarButtonSet_refreshVariables_63 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(selectedClaimContact, canAccessLinkButtons, linkStatus, false, allowEditInAddressBook)
    }
    
    // 'validationExpression' attribute on ListViewInput at ClaimContacts.pcf: line 180, column 33
    function validationExpression_59 () : java.lang.Object {
      return selectedClaimContact.Contact.validateRelationships().formatUserMessage()
    }
    
    // 'visible' attribute on ToolbarButton (id=ContactBasicsHeaderInputSet_TransferRolesButton) at ClaimContacts.pcf: line 139, column 91
    function visible_37 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(selectedClaimContact.Claim)
    }
    
    // 'visible' attribute on Card (id=AddressesCard) at ClaimContacts.pcf: line 146, column 68
    function visible_53 () : java.lang.Boolean {
      return !(selectedClaimContact.Contact typeis Place)
    }
    
    // 'visible' attribute on Card (id=ContactDocumentsCard) at ClaimContacts.pcf: line 158, column 122
    function visible_56 () : java.lang.Boolean {
      return new gw.contact.ContactDocumentsUIHelper().isVendorDocumentsSupported(selectedClaimContact.Contact)
    }
    
    // 'visible' attribute on Card (id=ReviewsCard) at ClaimContacts.pcf: line 193, column 119
    function visible_66 () : java.lang.Boolean {
      return util.ReviewPageHelper.shouldDisplayReviewTab(selectedClaimContact.Contact) and perm.Review.list
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 2) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimContacts) at ClaimContacts.pcf: line 11, column 33
    function canEdit_67 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimContacts) at ClaimContacts.pcf: line 11, column 33
    static function canVisit_68 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewclaimparties
    }
    
    // 'handlesValidationIssue' attribute on Page (id=ClaimContacts) at ClaimContacts.pcf: line 11, column 33
    static function handlesValidationIssue_69 (claim :  Claim, VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Contact
    }
    
    // 'initialValue' attribute on Variable at ClaimContacts.pcf: line 20, column 23
    function initialValue_0 () : boolean {
      return perm.Claim.managepartiesinvolved(claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimContacts.pcf: line 24, column 26
    function initialValue_1 () : ReviewType {
      return null
    }
    
    // 'initialValue' attribute on Variable at ClaimContacts.pcf: line 28, column 23
    function initialValue_2 () : boolean {
      return !CurrentLocation.InEditMode
    }
    
    // Page (id=ClaimContacts) at ClaimContacts.pcf: line 11, column 33
    static function parent_70 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPartiesGroup.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimContacts {
      return super.CurrentLocation as pcf.ClaimContacts
    }
    
    property get allowEditInAddressBook () : boolean {
      return getVariableValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setVariableValue("allowEditInAddressBook", 0, $arg)
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
    
    property get reviewType () : ReviewType {
      return getVariableValue("reviewType", 0) as ReviewType
    }
    
    property set reviewType ($arg :  ReviewType) {
      setVariableValue("reviewType", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolvedDetailedListDetailExpressionsImpl extends ClaimContactsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_MedicalCareOrg) at ClaimContacts.pcf: line 67, column 90
    function action_11 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_MEDICALCAREORG)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_CompanyVendor) at ClaimContacts.pcf: line 71, column 89
    function action_13 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_COMPANYVENDOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Company) at ClaimContacts.pcf: line 76, column 81
    function action_15 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_COMPANY)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Adjudicator) at ClaimContacts.pcf: line 83, column 87
    function action_17 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_ADJUDICATOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Attorney) at ClaimContacts.pcf: line 87, column 84
    function action_19 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_ATTORNEY)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_LawFirm) at ClaimContacts.pcf: line 91, column 83
    function action_21 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_LAWFIRM)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_LegalVenue) at ClaimContacts.pcf: line 95, column 86
    function action_23 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_LEGALVENUE)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimContacts_AddExistingButton) at ClaimContacts.pcf: line 105, column 93
    function action_27 () : void {
      AddressBookPickerPopup.push(entity.Contact, true, claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_NewPerson) at ClaimContacts.pcf: line 48, column 80
    function action_3 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_PERSON)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_AutoRepairShop) at ClaimContacts.pcf: line 55, column 90
    function action_5 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_AUTOREPAIRSHOP)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_AutoTowingAgcy) at ClaimContacts.pcf: line 59, column 90
    function action_7 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_AUTOTOWINGAGCY)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Doctor) at ClaimContacts.pcf: line 63, column 82
    function action_9 () : void {
      NewPartyInvolvedPopup.push(claim, typekey.Contact.TC_DOCTOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Doctor) at ClaimContacts.pcf: line 63, column 82
    function action_dest_10 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_DOCTOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_MedicalCareOrg) at ClaimContacts.pcf: line 67, column 90
    function action_dest_12 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_MEDICALCAREORG)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_CompanyVendor) at ClaimContacts.pcf: line 71, column 89
    function action_dest_14 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_COMPANYVENDOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Company) at ClaimContacts.pcf: line 76, column 81
    function action_dest_16 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_COMPANY)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Adjudicator) at ClaimContacts.pcf: line 83, column 87
    function action_dest_18 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_ADJUDICATOR)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_Attorney) at ClaimContacts.pcf: line 87, column 84
    function action_dest_20 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_ATTORNEY)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_LawFirm) at ClaimContacts.pcf: line 91, column 83
    function action_dest_22 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_LAWFIRM)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_LegalVenue) at ClaimContacts.pcf: line 95, column 86
    function action_dest_24 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_LEGALVENUE)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimContacts_AddExistingButton) at ClaimContacts.pcf: line 105, column 93
    function action_dest_28 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Contact, true, claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_NewPerson) at ClaimContacts.pcf: line 48, column 80
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_PERSON)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_AutoRepairShop) at ClaimContacts.pcf: line 55, column 90
    function action_dest_6 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_AUTOREPAIRSHOP)
    }
    
    // 'action' attribute on MenuItem (id=ClaimContacts_AutoTowingAgcy) at ClaimContacts.pcf: line 59, column 90
    function action_dest_8 () : pcf.api.Destination {
      return pcf.NewPartyInvolvedPopup.createDestination(claim, typekey.Contact.TC_AUTOTOWINGAGCY)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimContacts_DeleteButton) at ClaimContacts.pcf: line 114, column 66
    function allCheckedRowsAction_31 (CheckedValues :  entity.ClaimContact[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.claimparties.ClaimContactUtil.deleteClaimContacts(CurrentLocation, claim, CheckedValues, CheckedValuesErrors)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 37, column 49
    function def_onEnter_32 (def :  pcf.PeopleInvolvedDetailedLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContacts.pcf: line 37, column 49
    function def_refreshVariables_33 (def :  pcf.PeopleInvolvedDetailedLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=ClaimContacts_AddExistingButton) at ClaimContacts.pcf: line 105, column 93
    function onPick_29 (PickedValue :  Contact) : void {
      AddExistingPartyInvolvedPopup.push(claim, new gw.api.contact.TemporaryContact(PickedValue))
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimContacts_CreateNewContactButton) at ClaimContacts.pcf: line 44, column 94
    function visible_25 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'visible' attribute on PickerToolbarButton (id=ClaimContacts_AddExistingButton) at ClaimContacts.pcf: line 105, column 93
    function visible_26 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim) and perm.Contact.viewlocal
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimContacts_DeleteButton) at ClaimContacts.pcf: line 114, column 66
    function visible_30 () : java.lang.Boolean {
      return perm.Claim.managepartiesinvolved(claim)
    }
    
    property get selectedClaimContact () : ClaimContact {
      return getCurrentSelection(1) as ClaimContact
    }
    
    property set selectedClaimContact ($arg :  ClaimContact) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}