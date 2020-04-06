package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewServiceRequestInstructionInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewServiceRequestInstructionInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestInstructionInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_29 () : void {
      AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 18, column 285
    function action_31 () : void {
      if (serviceRequest.Instruction.CustomerContact != null) { ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_32 () : void {
      ClaimContactDetailPopup.push(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_30 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_33 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(serviceRequest.Instruction.CustomerContact, serviceRequest.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_26 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.default.pcf: line 79, column 36
    function def_onEnter_63 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_27 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (serviceRequest.Instruction.CustomerContact), null, serviceRequest.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.default.pcf: line 79, column 36
    function def_refreshVariables_64 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(serviceRequest.Instruction.ServiceAddressOwner)
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.RequestedQuoteCompletionDateMoveToEndOfDay = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at NewServiceRequestInstructionInputSet.default.pcf: line 27, column 59
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.InstructionText = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=RequestedServiceCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 45, column 55
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.RequestedServiceCompletionDateMoveToEndOfDay = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.CustomerContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      serviceRequest.Instruction.ServiceAddressOwner.Address = (__VALUE_TO_SET as entity.Address)
    }
    
    // 'label' attribute on DateInput (id=RequestedServiceCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 45, column 55
    function label_16 () : java.lang.Object {
      return getCompletionDateLabel(DisplayKey.get("Web.ServiceRequest.RequestedServiceCompletionDate"))
    }
    
    // 'label' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function label_44 () : java.lang.Object {
      return serviceAddressLabel == null ? DisplayKey.get("Web.ServiceRequest.ServiceAddress") : serviceAddressLabel
    }
    
    // 'label' attribute on TextInput (id=ServiceAddressName) at NewServiceRequestInstructionInputSet.default.pcf: line 74, column 40
    function label_56 () : java.lang.Object {
      return CurrentLocation.InEditMode ? null : (serviceAddressLabel == null ? DisplayKey.get("Web.ServiceRequest.ServiceAddress") : serviceAddressLabel)
    }
    
    // 'label' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function label_6 () : java.lang.Object {
      return getCompletionDateLabel(DisplayKey.get("Web.ServiceRequest.RequestedQuoteCompletionDate"))
    }
    
    // 'newValue' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function newValue_50 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner.getOrCreateNewAddress()
    }
    
    // 'onChange' attribute on PostOnChange at NewServiceRequestInstructionInputSet.default.pcf: line 67, column 248
    function onChange_43 () : void {
      showAddressFields = serviceRequest.Instruction.ServiceAddressOwner.Address.New && not serviceRequest.Instruction.ServiceAddressOwner.NonEditableAddresses.contains(serviceRequest.Instruction.ServiceAddressOwner.Address)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_34 (PickedValue :  Contact) : void {
      var contactType = statictypeof (serviceRequest.Instruction.CustomerContact); var result = eval("serviceRequest.Instruction.CustomerContact = serviceRequest.Claim.resolveContact(serviceRequest.Instruction.CustomerContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionLabel' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function optionLabel_51 (VALUE :  entity.Address) : java.lang.String {
      return gw.util.RangeInputUtil.formatLabel(serviceRequest.Instruction.ServiceAddressOwner.getOrCreateNewAddress(), VALUE)
    }
    
    // 'validationExpression' attribute on DateInput (id=RequestedServiceCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 45, column 55
    function validationExpression_14 () : java.lang.Object {
      return serviceRequest.RequestedServiceCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight() ? DisplayKey.get("Web.ServiceRequest.DateInPast") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function validationExpression_4 () : java.lang.Object {
      return serviceRequest.RequestedQuoteCompletionDate < gw.api.util.DateUtil.currentDate().trimToMidnight() ? DisplayKey.get("Web.ServiceRequest.DateInPast") : null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_38 () : java.lang.Object {
      return serviceRequest.Claim.Contacts*.Contact
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function valueRange_52 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner.ServiceAddresses
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function valueRoot_13 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at NewServiceRequestInstructionInputSet.default.pcf: line 27, column 59
    function valueRoot_3 () : java.lang.Object {
      return serviceRequest.Instruction
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function valueRoot_49 () : java.lang.Object {
      return serviceRequest.Instruction.ServiceAddressOwner
    }
    
    // 'value' attribute on TextAreaInput (id=InstructionText) at NewServiceRequestInstructionInputSet.default.pcf: line 27, column 59
    function value_0 () : java.lang.String {
      return serviceRequest.Instruction.InstructionText
    }
    
    // 'value' attribute on DateInput (id=RequestedServiceCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 45, column 55
    function value_17 () : java.util.Date {
      return serviceRequest.RequestedServiceCompletionDateMoveToEndOfDay
    }
    
    // 'value' attribute on ClaimContactInput (id=CustomerContact) at NewServiceRequestInstructionInputSet.default.pcf: line 53, column 60
    function value_24 () : entity.Contact {
      return serviceRequest.Instruction.CustomerContact
    }
    
    // 'value' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function value_45 () : entity.Address {
      return serviceRequest.Instruction.ServiceAddressOwner.Address
    }
    
    // 'value' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function value_7 () : java.util.Date {
      return serviceRequest.RequestedQuoteCompletionDateMoveToEndOfDay
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_39 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_39 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_39 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function verifyValueRangeIsAllowedType_53 ($$arg :  entity.Address[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function verifyValueRangeIsAllowedType_53 ($$arg :  gw.api.database.IQueryBeanResult<entity.Address>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function verifyValueRangeIsAllowedType_53 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_40 () : void {
      var __valueRangeArg = serviceRequest.Claim.Contacts*.Contact
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_39(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ServiceAddressPicker) at NewServiceRequestInstructionInputSet.default.pcf: line 65, column 34
    function verifyValueRange_54 () : void {
      var __valueRangeArg = serviceRequest.Instruction.ServiceAddressOwner.ServiceAddresses
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_53(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=RequestedServiceCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 45, column 55
    function visible_15 () : java.lang.Boolean {
      return not ShowRequestedQuoteCompletionDate
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 14, column 229
    function visible_25 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=CustomerContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_28 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (serviceRequest.Instruction.CustomerContact), serviceRequest.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on DateInput (id=RequestedQuoteCompletionDate) at NewServiceRequestInstructionInputSet.default.pcf: line 36, column 51
    function visible_5 () : java.lang.Boolean {
      return ShowRequestedQuoteCompletionDate
    }
    
    // 'visible' attribute on TextInput (id=ServiceAddressName) at NewServiceRequestInstructionInputSet.default.pcf: line 74, column 40
    function visible_55 () : java.lang.Boolean {
      return not showAddressFields
    }
    
    // 'visible' attribute on InputSetRef (id=ServiceAddressFields) at NewServiceRequestInstructionInputSet.default.pcf: line 79, column 36
    function visible_62 () : java.lang.Boolean {
      return showAddressFields
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
    
    property get ShowRequestedQuoteCompletionDate(): boolean{
      return serviceRequest.Kind != ServiceRequestKind.TC_SERVICEONLY and not serviceRequest.IsPromotion
    }
    
    function getCompletionDateLabel(defaultLabel : String) : String {
      return quoteOrServiceAlternativeLabel != null 
        ? DisplayKey.get("Web.ServiceRequest.RequestedSomethingCompletionDate", quoteOrServiceAlternativeLabel)
        : defaultLabel
    }
    
    
  }
  
  
}