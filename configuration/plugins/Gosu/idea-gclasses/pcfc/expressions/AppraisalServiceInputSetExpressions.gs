package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AppraisalServiceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_6 () : void {
      AddressBookPickerPopup.push(statictypeof (appraisalService.SpecialistAndCreateClaimContact), incident.Claim, {SpecialistService.getForCode(appraisalServiceCode)})
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_8 () : void {
      if (appraisalService.SpecialistAndCreateClaimContact != null) { ClaimContactDetailPopup.push(appraisalService.SpecialistAndCreateClaimContact, incident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_9 () : void {
      ClaimContactDetailPopup.push(appraisalService.SpecialistAndCreateClaimContact, incident.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(appraisalService.SpecialistAndCreateClaimContact, incident.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (appraisalService.SpecialistAndCreateClaimContact), incident.Claim, {SpecialistService.getForCode(appraisalServiceCode)})
    }
    
    // 'allowToggle' attribute on InputGroup (id=AppraisalServiceInputGroup) at AppraisalServiceInputSet.pcf: line 29, column 46
    function available_27 () : java.lang.Boolean {
      return isEditableServiceRequest()
    }
    
    // 'def' attribute on InputSetRef at AppraisalServiceInputSet.pcf: line 50, column 41
    function def_onEnter_20 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.onEnter(appraisalService, DisplayKey.get("Web.AppraisalServiceInputSet.AppraisalLocation"), DisplayKey.get("Web.AppraisalServiceInputSet.Appraisal"))
    }
    
    // 'def' attribute on InputSetRef at AppraisalServiceInputSet.pcf: line 50, column 41
    function def_onEnter_22 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.onEnter(appraisalService, DisplayKey.get("Web.AppraisalServiceInputSet.AppraisalLocation"), DisplayKey.get("Web.AppraisalServiceInputSet.Appraisal"))
    }
    
    // 'def' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_3 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (appraisalService.SpecialistAndCreateClaimContact), null, incident.Claim)
    }
    
    // 'def' attribute on InputSetRef at AppraisalServiceInputSet.pcf: line 50, column 41
    function def_refreshVariables_21 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.refreshVariables(appraisalService, DisplayKey.get("Web.AppraisalServiceInputSet.AppraisalLocation"), DisplayKey.get("Web.AppraisalServiceInputSet.Appraisal"))
    }
    
    // 'def' attribute on InputSetRef at AppraisalServiceInputSet.pcf: line 50, column 41
    function def_refreshVariables_23 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.refreshVariables(appraisalService, DisplayKey.get("Web.AppraisalServiceInputSet.AppraisalLocation"), DisplayKey.get("Web.AppraisalServiceInputSet.Appraisal"))
    }
    
    // 'def' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_4 (def :  pcf.ClaimNewVendorOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (appraisalService.SpecialistAndCreateClaimContact), null, incident.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      appraisalService.SpecialistAndCreateClaimContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'initialValue' attribute on Variable at AppraisalServiceInputSet.pcf: line 23, column 23
    function initialValue_0 () : boolean {
      return appraisalService != null
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_11 (PickedValue :  Contact) : void {
      var contactType = statictypeof (appraisalService.SpecialistAndCreateClaimContact); var result = eval("appraisalService.SpecialistAndCreateClaimContact = incident.Claim.resolveContact(appraisalService.SpecialistAndCreateClaimContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onToggle' attribute on InputGroup (id=AppraisalServiceInputGroup) at AppraisalServiceInputSet.pcf: line 29, column 46
    function setter_28 (VALUE :  java.lang.Boolean) : void {
      toggleServiceRequest(VALUE)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_15 () : java.lang.Object {
      return incident.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_14 () : java.lang.Object {
      return appraisalService
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor_Picker) at AppraisalServiceInputSet.pcf: line 41, column 59
    function value_1 () : entity.Contact {
      return appraisalService.SpecialistAndCreateClaimContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_17 () : void {
      var __valueRangeArg = incident.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_2 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on InputSet (id=OtherServiceRequestInfo) at AppraisalServiceInputSet.pcf: line 47, column 57
    function visible_24 () : java.lang.Boolean {
      return appraisalService.Specialist != null
    }
    
    // 'visible' attribute on InputSet at AppraisalServiceInputSet.pcf: line 31, column 44
    function visible_25 () : java.lang.Boolean {
      return appraisalServiceSelected
    }
    
    // 'visible' attribute on ClaimContactInput (id=Assessor_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_5 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (appraisalService.SpecialistAndCreateClaimContact), incident.Claim, {SpecialistService.getForCode(appraisalServiceCode)})" != "" && true
    }
    
    property get appraisalService () : ServiceRequest {
      return getRequireValue("appraisalService", 0) as ServiceRequest
    }
    
    property set appraisalService ($arg :  ServiceRequest) {
      setRequireValue("appraisalService", 0, $arg)
    }
    
    property get appraisalServiceCode () : String {
      return getRequireValue("appraisalServiceCode", 0) as String
    }
    
    property set appraisalServiceCode ($arg :  String) {
      setRequireValue("appraisalServiceCode", 0, $arg)
    }
    
    property get appraisalServiceSelected () : boolean {
      return getVariableValue("appraisalServiceSelected", 0) as java.lang.Boolean
    }
    
    property set appraisalServiceSelected ($arg :  boolean) {
      setVariableValue("appraisalServiceSelected", 0, $arg)
    }
    
    property get incident () : PropertyIncident {
      return getRequireValue("incident", 0) as PropertyIncident
    }
    
    property set incident ($arg :  PropertyIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    function isEditableServiceRequest() : boolean {
      return appraisalService == null or appraisalService.IsEditableInUI
    }
    
    function toggleServiceRequest(checkboxValue : boolean) {
      if (appraisalService == null) {
        if (checkboxValue) {
          appraisalService = incident.Claim.newServiceRequest(incident.Claim.maincontact, incident)
          appraisalService.Instruction.addServiceFoundByCode(appraisalServiceCode)
          appraisalService.Kind = ServiceRequestKind.TC_QUOTEONLY
        }
      } else {
        if (not checkboxValue) {
          unusedServiceRequests.add(appraisalService)
        } else {
          unusedServiceRequests.remove(appraisalService)
        }
      }
      appraisalServiceSelected = checkboxValue
    }
    
    
  }
  
  
}