package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.lang.reflect.IType
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_PartiesInvolvedScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PartiesInvolvedScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_Adjudicator) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 34, column 83
    function action_0 () : void {
      createClaimContact(entity.Adjudicator)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_OtherPerson) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 38, column 83
    function action_1 () : void {
      createClaimContact(entity.Person)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_LegalVenue) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 79, column 80
    function action_10 () : void {
      createClaimContact(entity.LegalVenue)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_AddExistingButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 87, column 45
    function action_13 () : void {
      AddressBookPickerPopup.push(entity.Contact, Claim)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_Attorney) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 46, column 80
    function action_2 () : void {
      createClaimContact(entity.Attorney)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_AutoRepairShop) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 50, column 86
    function action_3 () : void {
      createClaimContact(entity.AutoRepairShop)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_AutoTowingAgcy) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 54, column 86
    function action_4 () : void {
      createClaimContact(entity.AutoTowingAgcy)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_Doctor) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 58, column 78
    function action_5 () : void {
      createClaimContact(entity.Doctor)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_LawFirm) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 62, column 79
    function action_6 () : void {
      createClaimContact(entity.LawFirm)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_MedicalCareOrg) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 66, column 86
    function action_7 () : void {
      createClaimContact(entity.MedicalCareOrg)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_CompanyVendor) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 70, column 85
    function action_8 () : void {
      createClaimContact(entity.CompanyVendor)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPartiesInvoled_Company) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 75, column 77
    function action_9 () : void {
      createClaimContact(entity.Company)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_AddExistingButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 87, column 45
    function action_dest_14 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Contact, Claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_DeleteButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 94, column 25
    function allCheckedRowsAction_16 (CheckedValues :  entity.ClaimContact[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.claimparties.ClaimContactUtil.deleteNewClaimContacts(CurrentLocation, Claim, CheckedValues, CheckedValuesErrors)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartiesInvolvedScreen.pcf: line 21, column 61
    function def_onEnter_17 (def :  pcf.NewClaimPeopleInvolvedDetailedLV) : void {
      def.onEnter(Wizard, Claim)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PartiesInvolvedScreen.pcf: line 21, column 61
    function def_refreshVariables_18 (def :  pcf.NewClaimPeopleInvolvedDetailedLV) : void {
      def.refreshVariables(Wizard, Claim)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_AddExistingButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 87, column 45
    function onPick_15 (PickedValue :  Contact) : void {
      NewClaimWizard_PartyInvolvedPopup.push(Wizard, Wizard.addClaimContact(PickedValue), Wizard.isContactNew(PickedValue))
    }
    
    // 'visible' attribute on ToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 27, column 46
    function visible_11 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on PickerToolbarButton (id=NewClaimWizard_PartiesInvolvedScreen_AddExistingButton) at NewClaimWizard_PartiesInvolvedScreen.pcf: line 87, column 45
    function visible_12 () : java.lang.Boolean {
      return perm.Contact.viewlocal
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
    function createClaimContact(contactType : IType) {
      NewClaimWizard_PartyInvolvedPopup.push(Wizard, Wizard.createClaimContact(contactType), true);
    }
    
    
  }
  
  
}