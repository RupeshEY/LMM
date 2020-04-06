package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.List
@javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleIncidentAutoBodyDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VehicleIncidentAutoBodyDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=Coverage) at VehicleIncidentAutoBodyDV.pcf: line 42, column 57
    function label_2 () : java.lang.Object {
      return coverage.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Coverage) at VehicleIncidentAutoBodyDV.pcf: line 42, column 57
    function value_3 () : java.lang.String {
      return getCoverageDescription(coverage)
    }
    
    property get coverage () : typekey.CoverageType {
      return getIteratedValue(1) as typekey.CoverageType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/VehicleIncidentAutoBodyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentAutoBodyDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 16, column 225
    function action_12 () : void {
      AddressBookPickerPopup.push(statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRepairServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 18, column 285
    function action_14 () : void {
      if (repairServiceRequest.SpecialistAndCreateClaimContact != null) { ClaimContactDetailPopup.push(repairServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function action_15 () : void {
      ClaimContactDetailPopup.push(repairServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_13 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRepairServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(repairServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim)
    }
    
    // 'allowToggle' attribute on InputGroup (id=AutobodyInputGroup) at VehicleIncidentAutoBodyDV.pcf: line 31, column 48
    function available_39 () : java.lang.Boolean {
      return isEditableServiceRequest()
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentAutoBodyDV.pcf: line 71, column 43
    function def_onEnter_32 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.onEnter(repairServiceRequest, null, null)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentAutoBodyDV.pcf: line 71, column 43
    function def_onEnter_34 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.onEnter(repairServiceRequest, null, null)
    }
    
    // 'def' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_9 (def :  pcf.ClaimNewRepairShopOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact), null, vehicleIncident.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_10 (def :  pcf.ClaimNewRepairShopOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact), null, vehicleIncident.Claim)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentAutoBodyDV.pcf: line 71, column 43
    function def_refreshVariables_33 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.refreshVariables(repairServiceRequest, null, null)
    }
    
    // 'def' attribute on InputSetRef at VehicleIncidentAutoBodyDV.pcf: line 71, column 43
    function def_refreshVariables_35 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.refreshVariables(repairServiceRequest, null, null)
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      repairServiceRequest.SpecialistAndCreateClaimContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'initialValue' attribute on Variable at VehicleIncidentAutoBodyDV.pcf: line 20, column 22
    function initialValue_0 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.AUTOBODYREPAIR
    }
    
    // 'initialValue' attribute on Variable at VehicleIncidentAutoBodyDV.pcf: line 24, column 23
    function initialValue_1 () : boolean {
      return repairServiceRequest != null
    }
    
    // 'label' attribute on InputGroup (id=AutobodyInputGroup) at VehicleIncidentAutoBodyDV.pcf: line 31, column 48
    function label_40 () : java.lang.Object {
      return HasCoverage ? DisplayKey.get("Web.VehicleIncidentAutoBodyDV.Autobody.ValueLabel") : DisplayKey.get("Web.VehicleIncidentAutoBodyDV.Autobody.LabelNoCoverage")
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function onPick_17 (PickedValue :  Contact) : void {
      var contactType = statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact); var result = eval("repairServiceRequest.SpecialistAndCreateClaimContact = vehicleIncident.Claim.resolveContact(repairServiceRequest.SpecialistAndCreateClaimContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onToggle' attribute on InputGroup (id=AutobodyInputGroup) at VehicleIncidentAutoBodyDV.pcf: line 31, column 48
    function setter_41 (VALUE :  java.lang.Boolean) : void {
      toggleServiceRequest(VALUE)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_21 () : java.lang.Object {
      return vehicleIncident.Claim.RelatedAutoRepairShopArray
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_20 () : java.lang.Object {
      return repairServiceRequest
    }
    
    // 'value' attribute on TextInput (id=RepairShopAddress) at VehicleIncidentAutoBodyDV.pcf: line 64, column 43
    function valueRoot_28 () : java.lang.Object {
      return repairServiceRequest.Specialist
    }
    
    // 'value' attribute on TextInput (id=RepairShopAddress) at VehicleIncidentAutoBodyDV.pcf: line 64, column 43
    function value_26 () : entity.Address {
      return repairServiceRequest.Specialist.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=RepairShopPhone) at VehicleIncidentAutoBodyDV.pcf: line 68, column 74
    function value_29 () : java.lang.String {
      return repairServiceRequest.Specialist.PrimaryPhoneValue
    }
    
    // 'value' attribute on InputIterator (id=Coverages) at VehicleIncidentAutoBodyDV.pcf: line 38, column 68
    function value_6 () : java.util.List<typekey.CoverageType> {
      return ApplicableCoverageTypes
    }
    
    // 'value' attribute on ClaimContactInput (id=RepairShop) at VehicleIncidentAutoBodyDV.pcf: line 53, column 75
    function value_7 () : entity.Contact {
      return repairServiceRequest.SpecialistAndCreateClaimContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_22 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_23 () : void {
      var __valueRangeArg = vehicleIncident.Claim.RelatedAutoRepairShopArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_22(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 16, column 225
    function visible_11 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (repairServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRepairServiceCode)})" != "" && true
    }
    
    // 'visible' attribute on InputSet (id=OtherServiceRequestInfo) at VehicleIncidentAutoBodyDV.pcf: line 59, column 63
    function visible_36 () : java.lang.Boolean {
      return repairServiceRequest.Specialist != null
    }
    
    // 'visible' attribute on InputSet at VehicleIncidentAutoBodyDV.pcf: line 33, column 40
    function visible_37 () : java.lang.Boolean {
      return autoRepairSelected
    }
    
    // 'visible' attribute on ClaimContactInput (id=RepairShop) at ClaimContactWidget.xml: line 14, column 229
    function visible_8 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    property get autoRepairSelected () : boolean {
      return getVariableValue("autoRepairSelected", 0) as java.lang.Boolean
    }
    
    property set autoRepairSelected ($arg :  boolean) {
      setVariableValue("autoRepairSelected", 0, $arg)
    }
    
    property get autoRepairServiceCode () : String {
      return getVariableValue("autoRepairServiceCode", 0) as String
    }
    
    property set autoRepairServiceCode ($arg :  String) {
      setVariableValue("autoRepairServiceCode", 0, $arg)
    }
    
    property get repairServiceRequest () : ServiceRequest {
      return getRequireValue("repairServiceRequest", 0) as ServiceRequest
    }
    
    property set repairServiceRequest ($arg :  ServiceRequest) {
      setRequireValue("repairServiceRequest", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    property get vehicleIncident () : VehicleIncident {
      return getRequireValue("vehicleIncident", 0) as VehicleIncident
    }
    
    property set vehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("vehicleIncident", 0, $arg)
    }
    
    
    function getCoverageDescription(coverageType : CoverageType) : String {
      var coverageDescription = vehicleIncident.getCoverageDescription(coverageType)
      return coverageDescription == null ? DisplayKey.get("Web.VehicleIncidentAutoBodyDV.NoCoverage") : coverageDescription
    }
    
    property get ApplicableCoverageTypes() : java.util.List<CoverageType> {
      if(vehicleIncident.VehicleLossParty == LossPartyType.TC_INSURED) {
        return {vehicleIncident.Claim.Policy.CollisionCoverageType,
                vehicleIncident.Claim.Policy.ComprehensiveCoverageType}
      }
      else {
        return {vehicleIncident.Claim.Policy.AutoBodilyInjuryCoverageType}
      }
    }
    
    property get HasCoverage() : boolean {
      return ApplicableCoverageTypes.hasMatch( \ covType -> getCoverageDescription(covType) != DisplayKey.get("Web.VehicleIncidentAutoBodyDV.NoCoverage") ) 
    }
    
    function isEditableServiceRequest() : boolean {
      return repairServiceRequest == null or repairServiceRequest.IsEditableInUI
    }
    
    function toggleServiceRequest(checkboxValue : boolean) {
      if (repairServiceRequest == null) {
        if (checkboxValue) {
          repairServiceRequest = vehicleIncident.Claim.newServiceRequest(vehicleIncident.Claim.maincontact, vehicleIncident)
          repairServiceRequest.Instruction.addServiceFoundByCode(autoRepairServiceCode)
          repairServiceRequest.Kind = ServiceRequestKind.TC_QUOTEANDSERVICE
        }
      } else {
        if (not checkboxValue) {
          unusedServiceRequests.add(repairServiceRequest)
        } else {
          unusedServiceRequests.remove(repairServiceRequest)
        }
      }
      vehicleIncident.BodyShopSelected = checkboxValue
      autoRepairSelected = checkboxValue
    }
    
    
  }
  
  
}