package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersEmergencyDebrisRemovalDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HomeownersEmergencyDebrisRemovalDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/HomeownersEmergencyDebrisRemovalDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HomeownersEmergencyDebrisRemovalDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (emsService.SpecialistAndCreateClaimContact != null) { ClaimContactDetailPopup.push(emsService.SpecialistAndCreateClaimContact, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(emsService.SpecialistAndCreateClaimContact, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (emsService.SpecialistAndCreateClaimContact), claim, {SpecialistService.getForCode(emsdebrisServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(emsService.SpecialistAndCreateClaimContact, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (emsService.SpecialistAndCreateClaimContact), claim, {SpecialistService.getForCode(emsdebrisServiceCode)})
    }
    
    // 'def' attribute on InputSetRef at HomeownersEmergencyDebrisRemovalDV.pcf: line 57, column 41
    function def_onEnter_27 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.onEnter(emsService, null, null)
    }
    
    // 'def' attribute on InputSetRef at HomeownersEmergencyDebrisRemovalDV.pcf: line 57, column 41
    function def_onEnter_29 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.onEnter(emsService, null, null)
    }
    
    // 'def' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (emsService.SpecialistAndCreateClaimContact), null, claim)
    }
    
    // 'def' attribute on InputSetRef at HomeownersEmergencyDebrisRemovalDV.pcf: line 57, column 41
    function def_refreshVariables_28 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.refreshVariables(emsService, null, null)
    }
    
    // 'def' attribute on InputSetRef at HomeownersEmergencyDebrisRemovalDV.pcf: line 57, column 41
    function def_refreshVariables_30 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.refreshVariables(emsService, null, null)
    }
    
    // 'def' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (emsService.SpecialistAndCreateClaimContact), null, claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      emsService.SpecialistAndCreateClaimContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'editable' attribute on ClaimContactInput (id=DebrisRemovalPicker) at HomeownersEmergencyDebrisRemovalDV.pcf: line 43, column 50
    function editable_2 () : java.lang.Boolean {
      return isEditableServiceRequest()
    }
    
    // 'initialValue' attribute on Variable at HomeownersEmergencyDebrisRemovalDV.pcf: line 22, column 32
    function initialValue_0 () : java.lang.String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.PROPEMSDEBRISREMOVAL
    }
    
    // 'initialValue' attribute on Variable at HomeownersEmergencyDebrisRemovalDV.pcf: line 26, column 23
    function initialValue_1 () : boolean {
      return emsService != null
    }
    
    // 'onPick' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (emsService.SpecialistAndCreateClaimContact); var result = eval("emsService.SpecialistAndCreateClaimContact = claim.resolveContact(emsService.SpecialistAndCreateClaimContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onToggle' attribute on InputGroup (id=EMSDebrisRemovalInputGroup) at HomeownersEmergencyDebrisRemovalDV.pcf: line 33, column 48
    function setter_35 (VALUE :  java.lang.Boolean) : void {
      toggleServiceRequest(VALUE)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_18 () : java.lang.Object {
      return claim.RelatedCompanyArray
    }
    
    // 'value' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_17 () : java.lang.Object {
      return emsService
    }
    
    // 'value' attribute on TextInput (id=DebrisRemovalPhone) at HomeownersEmergencyDebrisRemovalDV.pcf: line 54, column 62
    function valueRoot_26 () : java.lang.Object {
      return emsService.Specialist
    }
    
    // 'value' attribute on TextInput (id=DebrisRemovalPhone) at HomeownersEmergencyDebrisRemovalDV.pcf: line 54, column 62
    function value_24 () : java.lang.String {
      return emsService.Specialist.PrimaryPhoneValue
    }
    
    // 'value' attribute on ClaimContactInput (id=DebrisRemovalPicker) at HomeownersEmergencyDebrisRemovalDV.pcf: line 43, column 50
    function value_3 () : entity.Contact {
      return emsService.SpecialistAndCreateClaimContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_20 () : void {
      var __valueRangeArg = claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSet (id=OtherServiceRequestInfo) at HomeownersEmergencyDebrisRemovalDV.pcf: line 50, column 51
    function visible_32 () : java.lang.Boolean {
      return emsService.Specialist != null
    }
    
    // 'childrenVisible' attribute on InputGroup (id=EMSDebrisRemovalInputGroup) at HomeownersEmergencyDebrisRemovalDV.pcf: line 33, column 48
    function visible_33 () : java.lang.Boolean {
      return emsServiceSelected
    }
    
    // 'visible' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=DebrisRemovalPicker) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (emsService.SpecialistAndCreateClaimContact), claim, {SpecialistService.getForCode(emsdebrisServiceCode)})" != "" && true
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get emsService () : ServiceRequest {
      return getRequireValue("emsService", 0) as ServiceRequest
    }
    
    property set emsService ($arg :  ServiceRequest) {
      setRequireValue("emsService", 0, $arg)
    }
    
    property get emsServiceSelected () : boolean {
      return getVariableValue("emsServiceSelected", 0) as java.lang.Boolean
    }
    
    property set emsServiceSelected ($arg :  boolean) {
      setVariableValue("emsServiceSelected", 0, $arg)
    }
    
    property get emsdebrisServiceCode () : java.lang.String {
      return getVariableValue("emsdebrisServiceCode", 0) as java.lang.String
    }
    
    property set emsdebrisServiceCode ($arg :  java.lang.String) {
      setVariableValue("emsdebrisServiceCode", 0, $arg)
    }
    
    property get incident () : PropertyIncident {
      return getRequireValue("incident", 0) as PropertyIncident
    }
    
    property set incident ($arg :  PropertyIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<entity.ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<entity.ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<entity.ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    function isEditableServiceRequest() : boolean {
      return emsService == null or emsService.IsEditableInUI
    }
    
    function toggleServiceRequest(checkboxValue : boolean) {
      if (emsService == null) {
        if (checkboxValue) {
          emsService = claim.newServiceRequest(claim.maincontact, incident)
          emsService.Instruction.addServiceFoundByCode(emsdebrisServiceCode)
          emsService.Kind = ServiceRequestKind.TC_QUOTEANDSERVICE
        }
      } else {
        if (not checkboxValue) {
          unusedServiceRequests.add(emsService)
        } else {
          unusedServiceRequests.remove(emsService)
        }
      }
      emsServiceSelected = checkboxValue
    }
    
    
  }
  
  
}