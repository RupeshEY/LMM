package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.ArrayList
uses gw.api.util.DisplayableException
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewServiceRequestDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextInput (id=SpecialistName) at NewServiceRequestDV.pcf: line 107, column 47
    function actionAvailable_64 () : java.lang.Boolean {
      return serviceRequest.Specialist != null
    }
    
    // 'action' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 16, column 225
    function action_42 () : void {
      AddressBookPickerPopup.push(statictypeof (serviceRequest.SpecialistAndCreateClaimContact), serviceRequest.Claim, serviceRequest.Instruction.Services*.Service.toList())
    }
    
    // 'action' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 18, column 285
    function action_44 () : void {
      if (serviceRequest.SpecialistAndCreateClaimContact != null) { ClaimContactDetailPopup.push(serviceRequest.SpecialistAndCreateClaimContact, serviceRequest.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function action_46 () : void {
      ClaimContactDetailPopup.push(serviceRequest.SpecialistAndCreateClaimContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on TextInput (id=SpecialistName) at NewServiceRequestDV.pcf: line 107, column 47
    function action_62 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Specialist, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_43 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (serviceRequest.SpecialistAndCreateClaimContact), serviceRequest.Claim, serviceRequest.Instruction.Services*.Service.toList())
    }
    
    // 'action' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_47 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.SpecialistAndCreateClaimContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on TextInput (id=SpecialistName) at NewServiceRequestDV.pcf: line 107, column 47
    function action_dest_63 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Specialist, serviceRequest.Claim)
    }
    
    // 'conversionExpression' attribute on AddButton (id=AddMultipleServices) at NewServiceRequestDV.pcf: line 65, column 70
    function conversionExpression_20 (PickedValue :  SpecialistService[]) : entity.ServiceRequestInstructionService[] {
      return addServicesFromPopup(PickedValue)
    }
    
    // 'def' attribute on ListViewInput at NewServiceRequestDV.pcf: line 58, column 274
    function def_onEnter_22 (def :  pcf.InstructionServicesLV_default) : void {
      def.onEnter(serviceRequest, true)
    }
    
    // 'def' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_39 (def :  pcf.ClaimNewServiceRequestSpecialistPickerMenuItemSet) : void {
      def.onEnter(statictypeof (serviceRequest.SpecialistAndCreateClaimContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewServiceRequestDV.pcf: line 132, column 37
    function def_onEnter_82 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.onEnter(serviceRequest, null, null)
    }
    
    // 'def' attribute on InputSetRef at NewServiceRequestDV.pcf: line 132, column 37
    function def_onEnter_84 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.onEnter(serviceRequest, null, null)
    }
    
    // 'def' attribute on ListViewInput at NewServiceRequestDV.pcf: line 58, column 274
    function def_refreshVariables_23 (def :  pcf.InstructionServicesLV_default) : void {
      def.refreshVariables(serviceRequest, true)
    }
    
    // 'def' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_40 (def :  pcf.ClaimNewServiceRequestSpecialistPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (serviceRequest.SpecialistAndCreateClaimContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewServiceRequestDV.pcf: line 132, column 37
    function def_refreshVariables_83 (def :  pcf.NewServiceRequestInstructionInputSet_default) : void {
      def.refreshVariables(serviceRequest, null, null)
    }
    
    // 'def' attribute on InputSetRef at NewServiceRequestDV.pcf: line 132, column 37
    function def_refreshVariables_85 (def :  pcf.NewServiceRequestInstructionInputSet_rental) : void {
      def.refreshVariables(serviceRequest, null, null)
    }
    
    // 'value' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Kind = (__VALUE_TO_SET as typekey.ServiceRequestKind)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.SpecialistAndCreateClaimContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'editable' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function editable_25 () : java.lang.Boolean {
      return not serviceRequest.IsPromotion
    }
    
    // 'icon' attribute on Link (id=IncompatibleServicesAlert) at NewServiceRequestDV.pcf: line 42, column 43
    function icon_12 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestStatus.ATTENTION.Icon
    }
    
    // 'mode' attribute on ListViewInput at NewServiceRequestDV.pcf: line 58, column 274
    function mode_24 () : java.lang.Object {
      return serviceRequest.Incident.ID // InstructionServicesLV has only a default mode.  Specifying it here as the Incident's ID forces it to redraw & reload the data whenever a different Incident is selected, allowing us to add an remove LV rows programmatically.
    }
    
    // 'onChange' attribute on PostOnChange at NewServiceRequestDV.pcf: line 36, column 41
    function onChange_0 () : void {
      removeIncompatibleServices()
    }
    
    // 'onChange' attribute on PostOnChange at NewServiceRequestDV.pcf: line 99, column 61
    function onChange_35 () : void {
      serviceRequest.initializeCommMethod()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function onPick_48 (PickedValue :  Contact) : void {
      var contactType = statictypeof (serviceRequest.SpecialistAndCreateClaimContact); var result = eval("serviceRequest.SpecialistAndCreateClaimContact = serviceRequest.Claim.resolveContact(serviceRequest.SpecialistAndCreateClaimContact) as " + contactType.Name + ";return null;"); serviceRequest.initializeCommMethod();
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Specialist) at NewServiceRequestDV.pcf: line 97, column 50
    function onPick_56 (PickedValue :  java.lang.Object) : void {
      serviceRequest.initializeCommMethod()
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function optionGroupLabel_7 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getServiceRequestOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function optionLabel_31 (VALUE :  typekey.ServiceRequestKind) : java.lang.String {
      return VALUE.Label
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function optionLabel_8 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getServiceRequestOptionLabel(VALUE as KeyableBean)
    }
    
    // 'pickLocation' attribute on AddButton (id=AddMultipleServices) at NewServiceRequestDV.pcf: line 65, column 70
    function pickLocation_21 () : void {
      SelectServicesPopup.push(serviceRequest)
    }
    
    // 'valueRange' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function valueRange_32 () : java.lang.Object {
      return serviceRequest.AvailableKinds
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_52 () : java.lang.Object {
      return serviceRequest.Claim.servicerequestspecialist
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function valueRange_9 () : java.lang.Object {
      return serviceRequest.getRelatedToCandidates(incidentsToExclude.toList())
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function valueRoot_6 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextInput (id=SpecialistPhone) at NewServiceRequestDV.pcf: line 112, column 54
    function valueRoot_71 () : java.lang.Object {
      return serviceRequest.Specialist
    }
    
    // 'value' attribute on TextInput (id=RelatedToName) at NewServiceRequestDV.pcf: line 51, column 116
    function value_16 () : java.lang.String {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function value_2 () : gw.pl.persistence.core.Bean {
      return serviceRequest.RelatedTo
    }
    
    // 'value' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function value_26 () : typekey.ServiceRequestKind {
      return serviceRequest.Kind
    }
    
    // 'value' attribute on ClaimContactInput (id=Specialist) at NewServiceRequestDV.pcf: line 97, column 50
    function value_37 () : entity.Contact {
      return serviceRequest.SpecialistAndCreateClaimContact
    }
    
    // 'value' attribute on TextInput (id=SpecialistName) at NewServiceRequestDV.pcf: line 107, column 47
    function value_60 () : java.lang.String {
      return serviceRequest.SpecialistName
    }
    
    // 'value' attribute on TextInput (id=SpecialistPhone) at NewServiceRequestDV.pcf: line 112, column 54
    function value_68 () : java.lang.String {
      return serviceRequest.Specialist.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=SpecialistAddress) at NewServiceRequestDV.pcf: line 119, column 54
    function value_73 () : entity.Address {
      return serviceRequest.Specialist.PrimaryAddress
    }
    
    // 'value' attribute on TypeKeyInput (id=SpecialistCommMethod) at NewServiceRequestDV.pcf: line 126, column 54
    function value_78 () : typekey.SpecialistCommMethod {
      return serviceRequest.SpecialistCommMethod
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function verifyValueRangeIsAllowedType_10 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function verifyValueRangeIsAllowedType_33 ($$arg :  typekey.ServiceRequestKind[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_53 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_53 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_53 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function verifyValueRange_11 () : void {
      var __valueRangeArg = serviceRequest.getRelatedToCandidates(incidentsToExclude.toList())
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Kind) at NewServiceRequestDV.pcf: line 79, column 48
    function verifyValueRange_34 () : void {
      var __valueRangeArg = serviceRequest.AvailableKinds
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_54 () : void {
      var __valueRangeArg = serviceRequest.Claim.servicerequestspecialist
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_53(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=RelatedTo) at NewServiceRequestDV.pcf: line 33, column 86
    function visible_1 () : java.lang.Boolean {
      return not serviceRequest.IsPromotion and not doNotAllowIncidentSelection
    }
    
    // 'visible' attribute on ContentInput at NewServiceRequestDV.pcf: line 39, column 36
    function visible_13 () : java.lang.Boolean {
      return incidentsRemoved
    }
    
    // 'visible' attribute on TextInput (id=RelatedToName) at NewServiceRequestDV.pcf: line 51, column 116
    function visible_15 () : java.lang.Boolean {
      return serviceRequest.IsPromotion or (serviceRequest.Incident != null and doNotAllowIncidentSelection)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 14, column 229
    function visible_38 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Specialist) at ClaimContactWidget.xml: line 16, column 225
    function visible_41 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (serviceRequest.SpecialistAndCreateClaimContact), serviceRequest.Claim, serviceRequest.Instruction.Services*.Service.toList())" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=SpecialistName) at NewServiceRequestDV.pcf: line 107, column 47
    function visible_59 () : java.lang.Boolean {
      return serviceRequest.IsPromotion
    }
    
    property get doNotAllowIncidentSelection () : boolean {
      return getRequireValue("doNotAllowIncidentSelection", 0) as java.lang.Boolean
    }
    
    property set doNotAllowIncidentSelection ($arg :  boolean) {
      setRequireValue("doNotAllowIncidentSelection", 0, $arg)
    }
    
    property get incidentsRemoved () : boolean {
      return getVariableValue("incidentsRemoved", 0) as java.lang.Boolean
    }
    
    property set incidentsRemoved ($arg :  boolean) {
      setVariableValue("incidentsRemoved", 0, $arg)
    }
    
    property get incidentsToExclude () : java.util.Collection<Incident> {
      return getRequireValue("incidentsToExclude", 0) as java.util.Collection<Incident>
    }
    
    property set incidentsToExclude ($arg :  java.util.Collection<Incident>) {
      setRequireValue("incidentsToExclude", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getRequireValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setRequireValue("serviceRequest", 0, $arg)
    }
    
    
    function removeIncompatibleServices() {
      var instruction = serviceRequest.Instruction
      if (serviceRequest.SpecialistServicesIncompatibleWithIncident.HasElements) {
        incidentsRemoved = true
        serviceRequest.SpecialistServicesIncompatibleWithIncident.each( \ is -> instruction.removeFromServices(is))
      } else {
        incidentsRemoved = false
      }
    }
    
    function addServicesFromPopup(pickedValue: SpecialistService[]): ServiceRequestInstructionService[] {
      incidentsRemoved = false
      var newSpecialistServices = new ArrayList<ServiceRequestInstructionService>()  
      pickedValue.each( \ ss -> newSpecialistServices.add(serviceRequest.Instruction.addService(ss)))
      
      serviceRequest.updateKindBasedOnSpecialistServicesSelection()
      return newSpecialistServices?.toTypedArray()
    }
    
    
  }
  
  
}