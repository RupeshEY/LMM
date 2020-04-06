package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
uses gw.api.util.LocaleUtil
uses gw.vendormanagement.ServiceRequestPrefixedAdditionalInstructionsTextHelper
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.rental.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewServiceRequestInstructionInputSet_rentalExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.rental.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestInstructionInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (serviceRequest.Instruction.CustomerContact != null) { ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_11 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_12 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.rental.pcf: line 63, column 36
    function def_onEnter_42 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.rental.pcf: line 63, column 36
    function def_refreshVariables_43 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.CustomerContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at NewServiceRequestInstructionInputSet.rental.pcf: line 29, column 32
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      InstructionText = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.ServiceAddressOwner.Address = (__VALUE_TO_SET as entity.Address)
    }
    
    // 'label' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function label_23 () : java.lang.Object {
      return serviceAddressLabel == null ? DisplayKey.get("Web.ServiceRequest.ServiceAddress") : serviceAddressLabel
    }
    
    // 'label' attribute on TextInput (id=ServiceAddressName) at NewServiceRequestInstructionInputSet.rental.pcf: line 58, column 40
    function label_35 () : java.lang.Object {
      return CurrentLocation.InEditMode ? null  : (serviceAddressLabel == null ? DisplayKey.get("Web.ServiceRequest.ServiceAddress") : serviceAddressLabel)
    }
    
    // 'newValue' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function newValue_29 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner.getOrCreateNewAddress()
    }
    
    // 'onChange' attribute on PostOnChange at NewServiceRequestInstructionInputSet.rental.pcf: line 51, column 248
    function onChange_22 () : void {
      showAddressFields = serviceRequest.Instruction.ServiceAddressOwner.Address.New && not serviceRequest.Instruction.ServiceAddressOwner.NonEditableAddresses.contains(serviceRequest.Instruction.ServiceAddressOwner.Address)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_13 (PickedValue :  Contact) : void {
      var contactType = statictypeof (serviceRequest.Instruction.CustomerContact); var result = eval("serviceRequest.Instruction.CustomerContact = serviceRequest.Claim.resolveContact(serviceRequest.Instruction.CustomerContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionLabel' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function optionLabel_30 (VALUE :  entity.Address) : java.lang.String {
      return gw.util.RangeInputUtil.formatLabel(serviceRequest.Instruction.ServiceAddressOwner.getOrCreateNewAddress(), VALUE)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_17 () : java.lang.Object {
      return serviceRequest.Claim.Contacts*.Contact
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function valueRange_31 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner.ServiceAddresses
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_16 () : java.lang.Object {
      return serviceRequest.Instruction
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function valueRoot_28 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at NewServiceRequestInstructionInputSet.rental.pcf: line 29, column 32
    function value_0 () : java.lang.String {
      return InstructionText
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function value_24 () : entity.Address {
      return serviceRequest.Instruction.ServiceAddressOwner.Address
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at NewServiceRequestInstructionInputSet.rental.pcf: line 37, column 60
    function value_3 () : entity.Contact {
      return serviceRequest.Instruction.CustomerContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function verifyValueRangeIsAllowedType_32 ($$arg :  entity.Address[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function verifyValueRangeIsAllowedType_32 ($$arg :  gw.api.database.IQueryBeanResult<entity.Address>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_19 () : void {
      var __valueRangeArg = serviceRequest.Claim.Contacts*.Contact
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.rental.pcf: line 49, column 34
    function verifyValueRange_33 () : void {
      var __valueRangeArg = serviceRequest.Instruction.ServiceAddressOwner.ServiceAddresses
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ServiceAddressName) at NewServiceRequestInstructionInputSet.rental.pcf: line 58, column 40
    function visible_34 () : java.lang.Boolean {
      return not showAddressFields
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.rental.pcf: line 63, column 36
    function visible_41 () : java.lang.Boolean {
      return showAddressFields
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get quoteOrServiceAlternativeLabel () : String {
      return getRequireValue("quoteOrServiceAlternativeLabel", 0) as String
    }
    
    property set quoteOrServiceAlternativeLabel ($arg :  String) {
      setRequireValue("quoteOrServiceAlternativeLabel", 0, $arg)
    }
    
    property get serviceAddressLabel () : String {
      return getRequireValue("serviceAddressLabel", 0) as String
    }
    
    property set serviceAddressLabel ($arg :  String) {
      setRequireValue("serviceAddressLabel", 0, $arg)
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getRequireValue("serviceRequest", 0) as entity.ServiceRequest
    }
    
    property set serviceRequest ($arg :  entity.ServiceRequest) {
      setRequireValue("serviceRequest", 0, $arg)
    }
    
    property get showAddressFields () : boolean {
      return getVariableValue("showAddressFields", 0) as java.lang.Boolean
    }
    
    property set showAddressFields ($arg :  boolean) {
      setVariableValue("showAddressFields", 0, $arg)
    }
    
    
    property get VehicleIncident() : VehicleIncident {
      return serviceRequest.Incident as VehicleIncident
    }
    
    property get InstructionText() : String {
      return ServiceRequestPrefixedAdditionalInstructionsTextHelper.getStrippedDisplayText(serviceRequest)
    }
    
    property set InstructionText(text : String) {
      ServiceRequestPrefixedAdditionalInstructionsTextHelper.updateInstructionText(serviceRequest,  getInstructionTextPrefix(), text)
    }
    
    private function getInstructionTextPrefix() : String {
      var dateFormat = LocaleUtil.getCurrentLocale().getOutputDateFormat(null, null)
      return DisplayKey.get("Web.VehicleIncidentRentalDV.InstructionPrefix", dateFormat.format(VehicleIncident.RentalBeginDate), dateFormat.format(VehicleIncident.RentalEndDate), CurrencyUtil.renderAsCurrency(VehicleIncident.RentalDailyRate))
    }
    
    
  }
  
  
}