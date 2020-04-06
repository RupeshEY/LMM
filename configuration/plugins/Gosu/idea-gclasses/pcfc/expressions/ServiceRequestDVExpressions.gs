package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextInput (id=Specialist) at ServiceRequestDV.pcf: line 101, column 48
    function actionAvailable_59 () : java.lang.Boolean {
      return serviceRequest.Specialist != null
    }
    
    // 'action' attribute on TextInput (id=Specialist) at ServiceRequestDV.pcf: line 101, column 48
    function action_57 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Specialist, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_83 () : void {
      AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 18, column 285
    function action_85 () : void {
      if (serviceRequest.Instruction.CustomerContact != null) { ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_86 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on TextInput (id=Specialist) at ServiceRequestDV.pcf: line 101, column 48
    function action_dest_58 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Specialist, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_84 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_87 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=ServiceToPerform) at ServiceRequestDV.pcf: line 120, column 36
    function def_onEnter_68 (def :  pcf.InstructionServicesLV_default) : void {
      def.onEnter(serviceRequest, false)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_80 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddress) at ServiceRequestDV.pcf: line 151, column 30
    function def_onEnter_96 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=ServiceToPerform) at ServiceRequestDV.pcf: line 120, column 36
    function def_refreshVariables_69 (def :  pcf.InstructionServicesLV_default) : void {
      def.refreshVariables(serviceRequest, false)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_81 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddress) at ServiceRequestDV.pcf: line 151, column 30
    function def_refreshVariables_97 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_88 (PickedValue :  Contact) : void {
      var contactType = statictypeof (serviceRequest.Instruction.CustomerContact); var result = eval("serviceRequest.Instruction.CustomerContact = serviceRequest.Claim.resolveContact(serviceRequest.Instruction.CustomerContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_91 () : java.lang.Object {
      return serviceRequest.Claim.Contacts*.Contact
    }
    
    // 'value' attribute on TextInput (id=RequoteReason) at ServiceRequestDV.pcf: line 40, column 70
    function valueRoot_18 () : java.lang.Object {
      return serviceRequest.LatestQuote
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestNumber) at ServiceRequestDV.pcf: line 19, column 54
    function valueRoot_2 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextInput (id=NextAction) at ServiceRequestDV.pcf: line 44, column 90
    function valueRoot_21 () : java.lang.Object {
      return serviceRequest.nextActionDefinition(stateHandler).NextAction
    }
    
    // 'value' attribute on TextInput (id=ActionOwner) at ServiceRequestDV.pcf: line 48, column 86
    function valueRoot_24 () : java.lang.Object {
      return serviceRequest.nextActionDefinition(stateHandler)
    }
    
    // 'value' attribute on TextInput (id=SpecialistPhone) at ServiceRequestDV.pcf: line 105, column 62
    function valueRoot_64 () : java.lang.Object {
      return serviceRequest.Specialist
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at ServiceRequestDV.pcf: line 138, column 74
    function valueRoot_77 () : java.lang.Object {
      return serviceRequest.Instruction
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestNumber) at ServiceRequestDV.pcf: line 19, column 54
    function value_0 () : java.lang.String {
      return serviceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=QuoteStatus) at ServiceRequestDV.pcf: line 35, column 62
    function value_10 () : typekey.ServiceRequestQuoteStatus {
      return serviceRequest.QuoteStatus
    }
    
    // 'value' attribute on TextInput (id=RequoteReason) at ServiceRequestDV.pcf: line 40, column 70
    function value_15 () : java.lang.String {
      return serviceRequest.LatestQuote.DeclinedReason
    }
    
    // 'value' attribute on TextInput (id=NextAction) at ServiceRequestDV.pcf: line 44, column 90
    function value_19 () : java.lang.String {
      return serviceRequest.nextActionDefinition(stateHandler).NextAction.ActionName
    }
    
    // 'value' attribute on TextInput (id=ActionOwner) at ServiceRequestDV.pcf: line 48, column 86
    function value_22 () : java.lang.String {
      return serviceRequest.nextActionDefinition(stateHandler).ActionOwnerString
    }
    
    // 'value' attribute on TextInput (id=RelatedTo) at ServiceRequestDV.pcf: line 52, column 47
    function value_25 () : java.lang.String {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at ServiceRequestDV.pcf: line 59, column 38
    function value_29 () : java.util.Date {
      return serviceRequest.RequestedQuoteCompletionDate
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestReferenceNumber) at ServiceRequestDV.pcf: line 24, column 63
    function value_3 () : java.lang.String {
      return serviceRequest.ServiceRequestReferenceNumber
    }
    
    // 'value' attribute on DateInput (id=RequestedServiceCompletionDate) at ServiceRequestDV.pcf: line 66, column 40
    function value_34 () : java.util.Date {
      return serviceRequest.RequestedServiceCompletionDate
    }
    
    // 'value' attribute on DateInput (id=ExpectedQuoteCompletionDate) at ServiceRequestDV.pcf: line 73, column 38
    function value_39 () : java.util.Date {
      return serviceRequest.ExpectedQuoteCompletionDate
    }
    
    // 'value' attribute on DateInput (id=ExpectedServiceCompletionDate) at ServiceRequestDV.pcf: line 80, column 40
    function value_44 () : java.util.Date {
      return serviceRequest.ExpectedServiceCompletionDate
    }
    
    // 'value' attribute on DateInput (id=CompletionDate) at ServiceRequestDV.pcf: line 87, column 58
    function value_49 () : java.util.Date {
      return serviceRequest.CompletionDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ServiceRequestDV.pcf: line 92, column 39
    function value_53 () : typekey.Currency {
      return serviceRequest.Currency
    }
    
    // 'value' attribute on TextInput (id=Specialist) at ServiceRequestDV.pcf: line 101, column 48
    function value_56 () : java.lang.String {
      return serviceRequest.SpecialistName
    }
    
    // 'value' attribute on TypeKeyInput (id=Progress) at ServiceRequestDV.pcf: line 29, column 53
    function value_6 () : typekey.ServiceRequestProgress {
      return serviceRequest.Progress
    }
    
    // 'value' attribute on TextInput (id=SpecialistPhone) at ServiceRequestDV.pcf: line 105, column 62
    function value_62 () : java.lang.String {
      return serviceRequest.Specialist.PrimaryPhoneValue
    }
    
    // 'value' attribute on TypeKeyInput (id=SpecialistCommMethod) at ServiceRequestDV.pcf: line 111, column 51
    function value_65 () : typekey.SpecialistCommMethod {
      return serviceRequest.SpecialistCommMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=Kind) at ServiceRequestDV.pcf: line 128, column 49
    function value_70 () : typekey.ServiceRequestKind {
      return serviceRequest.Kind
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at ServiceRequestDV.pcf: line 138, column 74
    function value_74 () : java.lang.String {
      return serviceRequest.Instruction.InstructionText
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at ServiceRequestDV.pcf: line 145, column 62
    function value_78 () : entity.Contact {
      return serviceRequest.Instruction.CustomerContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_92 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_92 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_92 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_93 () : void {
      var __valueRangeArg = serviceRequest.Claim.Contacts*.Contact
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_92(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=RequoteReason) at ServiceRequestDV.pcf: line 40, column 70
    function visible_14 () : java.lang.Boolean {
      return serviceRequest.LatestQuote.DeclinedReason != null
    }
    
    // 'visible' attribute on DateInput (id=RequestedQuoteCompletionDate) at ServiceRequestDV.pcf: line 59, column 38
    function visible_28 () : java.lang.Boolean {
      return QuoteDatesVisible
    }
    
    // 'visible' attribute on DateInput (id=RequestedServiceCompletionDate) at ServiceRequestDV.pcf: line 66, column 40
    function visible_33 () : java.lang.Boolean {
      return ServiceDatesVisible
    }
    
    // 'visible' attribute on DateInput (id=CompletionDate) at ServiceRequestDV.pcf: line 87, column 58
    function visible_48 () : java.lang.Boolean {
      return serviceRequest.CompletionDate != null
    }
    
    // 'visible' attribute on TextAreaInput (id=InstructionText) at ServiceRequestDV.pcf: line 138, column 74
    function visible_73 () : java.lang.Boolean {
      return serviceRequest.Instruction.InstructionText.HasContent
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function visible_79 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_82 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=QuoteStatus) at ServiceRequestDV.pcf: line 35, column 62
    function visible_9 () : java.lang.Boolean {
      return serviceRequest.quoteAllowed(stateHandler)
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getRequireValue("serviceRequest", 0) as entity.ServiceRequest
    }
    
    property set serviceRequest ($arg :  entity.ServiceRequest) {
      setRequireValue("serviceRequest", 0, $arg)
    }
    
    property get stateHandler () : gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler {
      return getRequireValue("stateHandler", 0) as gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler
    }
    
    property set stateHandler ($arg :  gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler) {
      setRequireValue("stateHandler", 0, $arg)
    }
    
    property get QuoteDatesVisible(): boolean{
      return serviceRequest.expectedQuoteCompletionDateApplies(stateHandler) or 
        (serviceRequest.Progress == ServiceRequestProgress.TC_DRAFT 
        and not serviceRequest.IsPromotion 
        and serviceRequest.Kind != ServiceRequestKind.TC_SERVICEONLY)
    }
    
    property get ServiceDatesVisible(): boolean {
      return serviceRequest.expectedServiceCompletionDateApplies(stateHandler) or 
        (serviceRequest.Progress == ServiceRequestProgress.TC_DRAFT and serviceRequest.IsPromotion) or
        (serviceRequest.Progress == ServiceRequestProgress.TC_DRAFT and serviceRequest.Kind == ServiceRequestKind.TC_SERVICEONLY) 
    }
    
    
  }
  
  
}