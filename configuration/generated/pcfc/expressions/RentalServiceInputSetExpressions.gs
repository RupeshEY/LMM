package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.CurrencyAmount
uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
uses gw.api.util.LocaleUtil
uses gw.vendormanagement.ServiceRequestPrefixedAdditionalInstructionsTextHelper
uses java.util.Date
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RentalServiceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RentalServiceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 16, column 225
    function action_25 () : void {
      AddressBookPickerPopup.push(statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRentalServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 18, column 285
    function action_27 () : void {
      if (rentalServiceRequest.SpecialistAndCreateClaimContact != null) { ClaimContactDetailPopup.push(rentalServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function action_29 () : void {
      ClaimContactDetailPopup.push(rentalServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_26 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRentalServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_30 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(rentalServiceRequest.SpecialistAndCreateClaimContact, vehicleIncident.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_22 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact), null, vehicleIncident.Claim)
    }
    
    // 'def' attribute on InputSetRef at RentalServiceInputSet.pcf: line 104, column 40
    function def_onEnter_48 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.onEnter(rentalServiceRequest, DisplayKey.get("Web.VehicleIncidentTowingDV.PickUpLocation"), null)
    }
    
    // 'def' attribute on InputSetRef at RentalServiceInputSet.pcf: line 104, column 40
    function def_onEnter_50 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.onEnter(rentalServiceRequest, DisplayKey.get("Web.VehicleIncidentTowingDV.PickUpLocation"), null)
    }
    
    // 'def' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_23 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact), null, vehicleIncident.Claim)
    }
    
    // 'def' attribute on InputSetRef at RentalServiceInputSet.pcf: line 104, column 40
    function def_refreshVariables_49 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.refreshVariables(rentalServiceRequest, DisplayKey.get("Web.VehicleIncidentTowingDV.PickUpLocation"), null)
    }
    
    // 'def' attribute on InputSetRef at RentalServiceInputSet.pcf: line 104, column 40
    function def_refreshVariables_51 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.refreshVariables(rentalServiceRequest, DisplayKey.get("Web.VehicleIncidentTowingDV.PickUpLocation"), null)
    }
    
    // 'value' attribute on DateInput (id=RentalEndDate) at RentalServiceInputSet.pcf: line 56, column 33
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      RentalEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CurrencyInput (id=RentalRate) at RentalServiceInputSet.pcf: line 65, column 30
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      RentalRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=ReservationNumber) at RentalServiceInputSet.pcf: line 73, column 37
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReservationNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      rentalServiceRequest.SpecialistAndCreateClaimContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=RentalBeginDate) at RentalServiceInputSet.pcf: line 46, column 35
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      RentalBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on ClaimContactInput (id=RentalAgency) at RentalServiceInputSet.pcf: line 85, column 66
    function editable_19 () : java.lang.Boolean {
      return rentalServiceRequest.IsEditableInUI
    }
    
    // 'editable' attribute on InputSetRef at RentalServiceInputSet.pcf: line 104, column 40
    function editable_47 () : java.lang.Boolean {
      return isEditableServiceRequest()
    }
    
    // 'initialValue' attribute on Variable at RentalServiceInputSet.pcf: line 19, column 22
    function initialValue_0 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.AUTORENTAL
    }
    
    // 'initialValue' attribute on Variable at RentalServiceInputSet.pcf: line 23, column 22
    function initialValue_1 () : String {
      return vehicleIncident.getCoverageDescription(vehicleIncident.Claim.Policy.RentalCoverageType)
    }
    
    // 'initialValue' attribute on Variable at RentalServiceInputSet.pcf: line 27, column 23
    function initialValue_2 () : boolean {
      return rentalServiceRequest != null
    }
    
    // 'label' attribute on InputGroup (id=RentalInputGroup) at RentalServiceInputSet.pcf: line 33, column 46
    function label_56 () : java.lang.Object {
      return coverageValue != null ? DisplayKey.get("Web.VehicleIncidentRentalDV.Rental.ValueLabel") : DisplayKey.get("Web.VehicleIncidentRentalDV.LabelNoCoverage")
    }
    
    // 'onPick' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function onPick_31 (PickedValue :  Contact) : void {
      var contactType = statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact); var result = eval("rentalServiceRequest.SpecialistAndCreateClaimContact = vehicleIncident.Claim.resolveContact(rentalServiceRequest.SpecialistAndCreateClaimContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onToggle' attribute on InputGroup (id=RentalInputGroup) at RentalServiceInputSet.pcf: line 33, column 46
    function setter_57 (VALUE :  java.lang.Boolean) : void {
      toggleServiceRequest(VALUE)
    }
    
    // 'validationExpression' attribute on DateInput (id=RentalEndDate) at RentalServiceInputSet.pcf: line 56, column 33
    function validationExpression_8 () : java.lang.Object {
      return vehicleIncident.RentalBeginDate != null and vehicleIncident.RentalEndDate != null and vehicleIncident.RentalEndDate < vehicleIncident.RentalBeginDate ? DisplayKey.get("Java.Validation.AdminCatastrophe.Date.ForbidValidReverse") : null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_35 () : java.lang.Object {
      return vehicleIncident.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_34 () : java.lang.Object {
      return rentalServiceRequest
    }
    
    // 'value' attribute on TextInput (id=RentalAgencyAddress) at RentalServiceInputSet.pcf: line 96, column 41
    function valueRoot_43 () : java.lang.Object {
      return rentalServiceRequest.Specialist
    }
    
    // 'value' attribute on CurrencyInput (id=RentalRate) at RentalServiceInputSet.pcf: line 65, column 30
    function value_13 () : gw.api.financials.CurrencyAmount {
      return RentalRate
    }
    
    // 'value' attribute on TextInput (id=ReservationNumber) at RentalServiceInputSet.pcf: line 73, column 37
    function value_16 () : java.lang.String {
      return ReservationNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=RentalAgency) at RentalServiceInputSet.pcf: line 85, column 66
    function value_20 () : entity.Contact {
      return rentalServiceRequest.SpecialistAndCreateClaimContact
    }
    
    // 'value' attribute on TextInput (id=RentalCoverage) at RentalServiceInputSet.pcf: line 39, column 148
    function value_3 () : java.lang.String {
      return coverageValue == null ? DisplayKey.get("Web.VehicleIncidentRentalDV.RentalCoverage.NoCoverage.Value") : coverageValue
    }
    
    // 'value' attribute on TextInput (id=RentalAgencyAddress) at RentalServiceInputSet.pcf: line 96, column 41
    function value_41 () : entity.Address {
      return rentalServiceRequest.Specialist.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=RentalAgencyPhone) at RentalServiceInputSet.pcf: line 100, column 72
    function value_44 () : java.lang.String {
      return rentalServiceRequest.Specialist.PrimaryPhoneValue
    }
    
    // 'value' attribute on DateInput (id=RentalBeginDate) at RentalServiceInputSet.pcf: line 46, column 35
    function value_5 () : java.util.Date {
      return RentalBeginDate
    }
    
    // 'value' attribute on DateInput (id=RentalEndDate) at RentalServiceInputSet.pcf: line 56, column 33
    function value_9 () : java.util.Date {
      return RentalEndDate
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_36 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_36 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_36 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_37 () : void {
      var __valueRangeArg = vehicleIncident.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_36(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 14, column 229
    function visible_21 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=RentalAgency) at ClaimContactWidget.xml: line 16, column 225
    function visible_24 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (rentalServiceRequest.SpecialistAndCreateClaimContact), vehicleIncident.Claim, {SpecialistService.getForCode(autoRentalServiceCode)})" != "" && true
    }
    
    // 'visible' attribute on InputSet (id=OtherServiceRequestInfo) at RentalServiceInputSet.pcf: line 91, column 61
    function visible_52 () : java.lang.Boolean {
      return rentalServiceRequest.Specialist != null
    }
    
    // 'visible' attribute on InputSet at RentalServiceInputSet.pcf: line 35, column 34
    function visible_53 () : java.lang.Boolean {
      return rentalSelected
    }
    
    property get autoRentalServiceCode () : String {
      return getVariableValue("autoRentalServiceCode", 0) as String
    }
    
    property set autoRentalServiceCode ($arg :  String) {
      setVariableValue("autoRentalServiceCode", 0, $arg)
    }
    
    property get coverageValue () : String {
      return getVariableValue("coverageValue", 0) as String
    }
    
    property set coverageValue ($arg :  String) {
      setVariableValue("coverageValue", 0, $arg)
    }
    
    property get rentalSelected () : boolean {
      return getVariableValue("rentalSelected", 0) as java.lang.Boolean
    }
    
    property set rentalSelected ($arg :  boolean) {
      setVariableValue("rentalSelected", 0, $arg)
    }
    
    property get rentalServiceRequest () : ServiceRequest {
      return getRequireValue("rentalServiceRequest", 0) as ServiceRequest
    }
    
    property set rentalServiceRequest ($arg :  ServiceRequest) {
      setRequireValue("rentalServiceRequest", 0, $arg)
    }
    
    property get unusedServices () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServices", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServices ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServices", 0, $arg)
    }
    
    property get vehicleIncident () : VehicleIncident {
      return getRequireValue("vehicleIncident", 0) as VehicleIncident
    }
    
    property set vehicleIncident ($arg :  VehicleIncident) {
      setRequireValue("vehicleIncident", 0, $arg)
    }
    
    
    
    function isEditableServiceRequest() : boolean {
      return rentalServiceRequest == null or rentalServiceRequest.IsEditableInUI
    }
    
    function updateInstructionText() {
      ServiceRequestPrefixedAdditionalInstructionsTextHelper.updateInstructionText(rentalServiceRequest, getInstructionTextPrefix())
    }
    
    private function getInstructionTextPrefix() : String {  
      return DisplayKey.get("Web.VehicleIncidentRentalDV.InstructionPrefix", getFormattedDate(RentalBeginDate), getFormattedDate(RentalEndDate), FormattedRentalRate)
    }
    
    property get FormattedRentalRate() : String {
      return vehicleIncident.RentalDailyRate != null ? CurrencyUtil.renderAsCurrency(vehicleIncident.RentalDailyRate) : null
    }
    
    function getFormattedDate(date : Date) : String {
      return date != null ? LocaleUtil.getCurrentLocale().getOutputDateFormat(null, null).format(date) : null
    }
    
    property get RentalBeginDate() : Date {
      return vehicleIncident.RentalBeginDate
    }
    
    property set RentalBeginDate(beginDate : Date) {
      vehicleIncident.RentalBeginDate = beginDate
      if (!isEditableServiceRequest()) {
        var reasonForChange = DisplayKey.get("Web.VehicleIncidentRentalDV.ServiceRequestChange.RentalBeginDateChanged", getFormattedDate(RentalBeginDate))
        rentalServiceRequest.recordChange(reasonForChange, null, null, User.util.CurrentUser.Contact)
      } else {
        updateInstructionText()
      }
    }
    
    property get RentalEndDate() : Date {
      return vehicleIncident.RentalEndDate
    }
    
    property set RentalEndDate(endDate : Date) {
      vehicleIncident.RentalEndDate = endDate
      rentalServiceRequest.RequestedServiceCompletionDateMoveToEndOfDay = endDate
      if (!isEditableServiceRequest()) {
        var reasonForChange = DisplayKey.get("Web.VehicleIncidentRentalDV.ServiceRequestChange.RentalEndDateChanged", getFormattedDate(RentalEndDate))
        rentalServiceRequest.recordChange(reasonForChange, null, null, User.util.CurrentUser.Contact)
      } else {
        updateInstructionText()
      }
    }
    
    property get RentalRate() : CurrencyAmount {
      return vehicleIncident.RentalDailyRate
    }
    
    property set RentalRate(rate : CurrencyAmount) {
      vehicleIncident.RentalDailyRate = rate
      if (!isEditableServiceRequest()) {
        var reasonForChange = DisplayKey.get("Web.VehicleIncidentRentalDV.ServiceRequestChange.RentalDailyRateChanged", FormattedRentalRate)
        rentalServiceRequest.recordChange(reasonForChange, null, null, User.util.CurrentUser.Contact)
      } else {
        updateInstructionText()
      }
    }
    
    property get ReservationNumber() : String{
      return vehicleIncident.RentalReserveNo
    }
    
    property set ReservationNumber(resNum : String) {
      vehicleIncident.RentalReserveNo = resNum
      rentalServiceRequest.ServiceRequestReferenceNumber = resNum
      if (!isEditableServiceRequest()) {
        var reasonForChange = DisplayKey.get("Web.VehicleIncidentRentalDV.ServiceRequestChange.RentalReserveNoChanged", rentalServiceRequest.ServiceRequestReferenceNumber)
        rentalServiceRequest.recordChange(reasonForChange, null, null, User.util.CurrentUser.Contact)
      }
    }
    
    function toggleServiceRequest(checkboxValue : boolean) {
      if (rentalServiceRequest == null) {
        if (checkboxValue) {
          rentalServiceRequest = vehicleIncident.Claim.newServiceRequest(vehicleIncident.Claim.maincontact, vehicleIncident)
          rentalServiceRequest.Instruction.addServiceFoundByCode(autoRentalServiceCode)
          rentalServiceRequest.Kind = ServiceRequestKind.TC_SERVICEONLY
        }
      } else {
        if (not checkboxValue) {
          unusedServices.add(rentalServiceRequest)
        } else {
          unusedServices.remove(rentalServiceRequest)
        }
      }
      rentalSelected = checkboxValue
    }
    
    
  }
  
  
}