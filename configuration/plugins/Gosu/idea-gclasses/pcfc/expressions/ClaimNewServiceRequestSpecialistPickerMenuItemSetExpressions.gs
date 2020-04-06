package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewServiceRequestSpecialistPickerMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewServiceRequestSpecialistPickerMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewAutoRepairShop) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 23, column 80
    function action_0 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewPersonVendor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 43, column 78
    function action_10 () : void {
      NewContactPopup.push(typekey.Contact.TC_PERSONVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAdjudicator) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 51, column 77
    function action_12 () : void {
      NewContactPopup.push(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAttorney) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 55, column 74
    function action_14 () : void {
      NewContactPopup.push(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewLawFirm) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 59, column 73
    function action_16 () : void {
      NewContactPopup.push(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAutoTowingAgency) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 27, column 80
    function action_2 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewDoctor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 31, column 72
    function action_4 () : void {
      NewContactPopup.push(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewMedicalCareOrg) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 35, column 80
    function action_6 () : void {
      NewContactPopup.push(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewCompanyVendor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 39, column 79
    function action_8 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAutoRepairShop) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 23, column 80
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewPersonVendor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 43, column 78
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_PERSONVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAdjudicator) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 51, column 77
    function action_dest_13 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAttorney) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 55, column 74
    function action_dest_15 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewLawFirm) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 59, column 73
    function action_dest_17 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewAutoTowingAgency) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 27, column 80
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewDoctor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 31, column 72
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewMedicalCareOrg) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 35, column 80
    function action_dest_7 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewCompanyVendor) at ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf: line 39, column 79
    function action_dest_9 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
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
    
    
  }
  
  
}