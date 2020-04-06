package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewContactPickerMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewContactPickerMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewPerson) at ClaimNewContactPickerMenuItemSet.pcf: line 21, column 96
    function action_1 () : void {
      NewContactPopup.push(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ClaimNewContactPickerMenuItemSet.pcf: line 40, column 72
    function action_10 () : void {
      NewContactPopup.push(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ClaimNewContactPickerMenuItemSet.pcf: line 45, column 80
    function action_13 () : void {
      NewContactPopup.push(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ClaimNewContactPickerMenuItemSet.pcf: line 50, column 79
    function action_16 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ClaimNewContactPickerMenuItemSet.pcf: line 56, column 71
    function action_20 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ClaimNewContactPickerMenuItemSet.pcf: line 65, column 77
    function action_23 () : void {
      NewContactPopup.push(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ClaimNewContactPickerMenuItemSet.pcf: line 70, column 74
    function action_26 () : void {
      NewContactPopup.push(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ClaimNewContactPickerMenuItemSet.pcf: line 75, column 73
    function action_29 () : void {
      NewContactPopup.push(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ClaimNewContactPickerMenuItemSet.pcf: line 80, column 76
    function action_32 () : void {
      NewContactPopup.push(typekey.Contact.TC_LEGALVENUE, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ClaimNewContactPickerMenuItemSet.pcf: line 30, column 80
    function action_4 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ClaimNewContactPickerMenuItemSet.pcf: line 35, column 80
    function action_7 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ClaimNewContactPickerMenuItemSet.pcf: line 40, column 72
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ClaimNewContactPickerMenuItemSet.pcf: line 45, column 80
    function action_dest_14 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ClaimNewContactPickerMenuItemSet.pcf: line 50, column 79
    function action_dest_17 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewPerson) at ClaimNewContactPickerMenuItemSet.pcf: line 21, column 96
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ClaimNewContactPickerMenuItemSet.pcf: line 56, column 71
    function action_dest_21 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ClaimNewContactPickerMenuItemSet.pcf: line 65, column 77
    function action_dest_24 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ClaimNewContactPickerMenuItemSet.pcf: line 70, column 74
    function action_dest_27 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ClaimNewContactPickerMenuItemSet.pcf: line 75, column 73
    function action_dest_30 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ClaimNewContactPickerMenuItemSet.pcf: line 80, column 76
    function action_dest_33 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_LEGALVENUE, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ClaimNewContactPickerMenuItemSet.pcf: line 30, column 80
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ClaimNewContactPickerMenuItemSet.pcf: line 35, column 80
    function action_dest_8 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewPerson) at ClaimNewContactPickerMenuItemSet.pcf: line 21, column 96
    function visible_0 () : java.lang.Boolean {
      return requiredContactType == entity.Contact or requiredContactType == entity.Person
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ClaimNewContactPickerMenuItemSet.pcf: line 45, column 80
    function visible_12 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.MedicalCareOrg)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ClaimNewContactPickerMenuItemSet.pcf: line 50, column 79
    function visible_15 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.CompanyVendor)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewVendor) at ClaimNewContactPickerMenuItemSet.pcf: line 25, column 31
    function visible_18 () : java.lang.Boolean {
      return ShowNewVendor
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ClaimNewContactPickerMenuItemSet.pcf: line 56, column 71
    function visible_19 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Company)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ClaimNewContactPickerMenuItemSet.pcf: line 65, column 77
    function visible_22 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Adjudicator)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ClaimNewContactPickerMenuItemSet.pcf: line 70, column 74
    function visible_25 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Attorney)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ClaimNewContactPickerMenuItemSet.pcf: line 75, column 73
    function visible_28 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.LawFirm)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ClaimNewContactPickerMenuItemSet.pcf: line 30, column 80
    function visible_3 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.AutoRepairShop)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ClaimNewContactPickerMenuItemSet.pcf: line 80, column 76
    function visible_31 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.LegalVenue)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegal) at ClaimNewContactPickerMenuItemSet.pcf: line 60, column 30
    function visible_34 () : java.lang.Boolean {
      return ShowNewLegal
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ClaimNewContactPickerMenuItemSet.pcf: line 35, column 80
    function visible_6 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.AutoTowingAgcy)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ClaimNewContactPickerMenuItemSet.pcf: line 40, column 72
    function visible_9 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Doctor)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get parentContact () : Contact {
      return getRequireValue("parentContact", 0) as Contact
    }
    
    property set parentContact ($arg :  Contact) {
      setRequireValue("parentContact", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getRequireValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setRequireValue("requiredContactType", 0, $arg)
    }
    
    property get ShowNewVendor() : boolean {
      return {entity.Contact,
              entity.Company,
              entity.Person,
              entity.PersonVendor,
              entity.CompanyVendor,
              entity.AutoRepairShop,
              entity.AutoTowingAgcy,
              entity.Doctor,
              entity.MedicalCareOrg}.contains(requiredContactType)
    }
    
    property get ShowNewLegal() : boolean {
      return {entity.Contact,
              entity.Attorney,
              entity.LawFirm,
              entity.Company,
              entity.LegalVenue,
              entity.Person,
              entity.Adjudicator}.contains(requiredContactType)
    }
    
    
  }
  
  
}