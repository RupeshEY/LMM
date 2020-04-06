package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContextObjectContactPickerMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContextObjectContactPickerMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ContextObjectContactPickerMenuItemSet.pcf: line 49, column 74
    function action_11 () : void {
      NewContactPopup.push(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ContextObjectContactPickerMenuItemSet.pcf: line 54, column 80
    function action_14 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ContextObjectContactPickerMenuItemSet.pcf: line 59, column 80
    function action_17 () : void {
      NewContactPopup.push(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ContextObjectContactPickerMenuItemSet.pcf: line 64, column 72
    function action_20 () : void {
      NewContactPopup.push(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ContextObjectContactPickerMenuItemSet.pcf: line 69, column 73
    function action_23 () : void {
      NewContactPopup.push(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ContextObjectContactPickerMenuItemSet.pcf: line 74, column 80
    function action_26 () : void {
      NewContactPopup.push(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ContextObjectContactPickerMenuItemSet.pcf: line 79, column 79
    function action_29 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ContextObjectContactPickerMenuItemSet.pcf: line 85, column 71
    function action_33 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ContextObjectContactPickerMenuItemSet.pcf: line 90, column 74
    function action_36 () : void {
      NewContactPopup.push(typekey.Contact.TC_LEGALVENUE, parentContact, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=AddressBookContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 95, column 52
    function action_38 () : void {
      AddressBookPickerPopup.push(requiredContactType)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ContextObjectContactPickerMenuItemSet.pcf: line 34, column 77
    function action_4 () : void {
      NewContactPopup.push(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=UserContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 100, column 60
    function action_41 () : void {
      UserSearchPopup.push()
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_OtherPerson) at ContextObjectContactPickerMenuItemSet.pcf: line 39, column 72
    function action_7 () : void {
      NewContactPopup.push(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ContextObjectContactPickerMenuItemSet.pcf: line 49, column 74
    function action_dest_12 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ATTORNEY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ContextObjectContactPickerMenuItemSet.pcf: line 54, column 80
    function action_dest_15 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOREPAIRSHOP, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ContextObjectContactPickerMenuItemSet.pcf: line 59, column 80
    function action_dest_18 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_AUTOTOWINGAGCY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ContextObjectContactPickerMenuItemSet.pcf: line 64, column 72
    function action_dest_21 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_DOCTOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ContextObjectContactPickerMenuItemSet.pcf: line 69, column 73
    function action_dest_24 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_LAWFIRM, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ContextObjectContactPickerMenuItemSet.pcf: line 74, column 80
    function action_dest_27 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_MEDICALCAREORG, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ContextObjectContactPickerMenuItemSet.pcf: line 79, column 79
    function action_dest_30 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ContextObjectContactPickerMenuItemSet.pcf: line 85, column 71
    function action_dest_34 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANY, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ContextObjectContactPickerMenuItemSet.pcf: line 90, column 74
    function action_dest_37 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_LEGALVENUE, parentContact, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=AddressBookContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 95, column 52
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(requiredContactType)
    }
    
    // 'action' attribute on PickerMenuItem (id=UserContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 100, column 60
    function action_dest_42 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ContextObjectContactPickerMenuItemSet.pcf: line 34, column 77
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_ADJUDICATOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_OtherPerson) at ContextObjectContactPickerMenuItemSet.pcf: line 39, column 72
    function action_dest_8 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'initialValue' attribute on Variable at ContextObjectContactPickerMenuItemSet.pcf: line 17, column 92
    function initialValue_0 () : Type {
      return gw.lang.reflect.TypeSystem.getByRelativeName(dynamicWidgetInfo.Type)
    }
    
    // 'initialValue' attribute on Variable at ContextObjectContactPickerMenuItemSet.pcf: line 21, column 59
    function initialValue_1 () : Claim {
      return documentCreationInfo.Document.Claim
    }
    
    // 'initialValue' attribute on Variable at ContextObjectContactPickerMenuItemSet.pcf: line 25, column 23
    function initialValue_2 () : Contact {
      return null
    }
    
    // 'onPick' attribute on PickerMenuItem (id=AddressBookContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 95, column 52
    function onPick_40 (PickedValue :  Contact) : void {
      ContextObjectContact = PickedValue
    }
    
    // 'onPick' attribute on PickerMenuItem (id=UserContactSearch) at ContextObjectContactPickerMenuItemSet.pcf: line 100, column 60
    function onPick_43 (PickedValue :  User) : void {
      ContextObjectContact = PickedValue.Contact
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Attorney) at ContextObjectContactPickerMenuItemSet.pcf: line 49, column 74
    function visible_10 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Attorney)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoRepairShop) at ContextObjectContactPickerMenuItemSet.pcf: line 54, column 80
    function visible_13 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.AutoRepairShop)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_AutoTowingAgcy) at ContextObjectContactPickerMenuItemSet.pcf: line 59, column 80
    function visible_16 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.AutoTowingAgcy)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Doctor) at ContextObjectContactPickerMenuItemSet.pcf: line 64, column 72
    function visible_19 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Doctor)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_LawFirm) at ContextObjectContactPickerMenuItemSet.pcf: line 69, column 73
    function visible_22 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.LawFirm)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_MedicalCareOrg) at ContextObjectContactPickerMenuItemSet.pcf: line 74, column 80
    function visible_25 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.MedicalCareOrg)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ContextObjectContactPickerMenuItemSet.pcf: line 79, column 79
    function visible_28 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.CompanyVendor)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_Adjudicator) at ContextObjectContactPickerMenuItemSet.pcf: line 34, column 77
    function visible_3 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Adjudicator)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewVendor) at ContextObjectContactPickerMenuItemSet.pcf: line 44, column 31
    function visible_31 () : java.lang.Boolean {
      return ShowNewVendor
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewCompany) at ContextObjectContactPickerMenuItemSet.pcf: line 85, column 71
    function visible_32 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Company)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewLegalVenue) at ContextObjectContactPickerMenuItemSet.pcf: line 90, column 74
    function visible_35 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.LegalVenue)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_OtherPerson) at ContextObjectContactPickerMenuItemSet.pcf: line 39, column 72
    function visible_6 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Person)
    }
    
    // 'visible' attribute on MenuItem (id=NewContactPickerMenuItemSet_NewPerson) at ContextObjectContactPickerMenuItemSet.pcf: line 29, column 31
    function visible_9 () : java.lang.Boolean {
      return ShowNewPerson
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get documentCreationInfo () : gw.document.DocumentCreationInfo {
      return getRequireValue("documentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set documentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setRequireValue("documentCreationInfo", 0, $arg)
    }
    
    property get dynamicWidgetInfo () : gw.document.DocumentCreationInfo.DynamicWidgetInfo {
      return getRequireValue("dynamicWidgetInfo", 0) as gw.document.DocumentCreationInfo.DynamicWidgetInfo
    }
    
    property set dynamicWidgetInfo ($arg :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) {
      setRequireValue("dynamicWidgetInfo", 0, $arg)
    }
    
    property get parentContact () : Contact {
      return getVariableValue("parentContact", 0) as Contact
    }
    
    property set parentContact ($arg :  Contact) {
      setVariableValue("parentContact", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getVariableValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setVariableValue("requiredContactType", 0, $arg)
    }
    
    property get ShowNewPerson() : boolean {
      return {entity.Contact,
              entity.Person,
              entity.Adjudicator}.contains(requiredContactType)
    }
    
    property get ShowNewVendor() : boolean {
      return {entity.Contact,
          entity.Company,
          entity.Person,
          entity.PersonVendor,
          entity.CompanyVendor,
          entity.Attorney,
          entity.AutoRepairShop,
          entity.AutoTowingAgcy,
          entity.Doctor,
          entity.LawFirm,
          entity.MedicalCareOrg
      }.contains(requiredContactType)
    }
    
    property set ContextObjectContact(value : Contact){
      documentCreationInfo.setContextObjectValue(dynamicWidgetInfo.Name, value)
    }
    
    
  }
  
  
}