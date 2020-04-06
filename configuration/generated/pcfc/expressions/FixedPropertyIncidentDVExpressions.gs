package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Set
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixedPropertyIncidentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 72, column 48
    function def_onEnter_25 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on ListViewInput at FixedPropertyIncidentDV.pcf: line 79, column 82
    function def_onEnter_28 (def :  pcf.AllPolicyLocationLienHoldersLV) : void {
      def.onEnter(FixedPropertyIncident.Property)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at FixedPropertyIncidentDV.pcf: line 97, column 40
    function def_onEnter_34 (def :  pcf.AppraisalServiceInputSet) : void {
      def.onEnter(PropertyAppraisalServiceRequest, FixedPropertyIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 99, column 151
    function def_onEnter_36 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(Claim, FixedPropertyIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 134, column 65
    function def_onEnter_58 (def :  pcf.PropertyAttributeInputSet) : void {
      def.onEnter(FixedPropertyIncident)
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 72, column 48
    function def_refreshVariables_26 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on ListViewInput at FixedPropertyIncidentDV.pcf: line 79, column 82
    function def_refreshVariables_29 (def :  pcf.AllPolicyLocationLienHoldersLV) : void {
      def.refreshVariables(FixedPropertyIncident.Property)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at FixedPropertyIncidentDV.pcf: line 97, column 40
    function def_refreshVariables_35 (def :  pcf.AppraisalServiceInputSet) : void {
      def.refreshVariables(PropertyAppraisalServiceRequest, FixedPropertyIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 99, column 151
    function def_refreshVariables_37 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(Claim, FixedPropertyIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on InputSetRef at FixedPropertyIncidentDV.pcf: line 134, column 65
    function def_refreshVariables_59 (def :  pcf.PropertyAttributeInputSet) : void {
      def.refreshVariables(FixedPropertyIncident)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FixedPropertyIncidentDV.pcf: line 48, column 52
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at FixedPropertyIncidentDV.pcf: line 53, column 53
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.LossEstimate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=EstDamageAmt) at FixedPropertyIncidentDV.pcf: line 59, column 44
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.EstDamageType = (__VALUE_TO_SET as typekey.EstDamageType)
    }
    
    // 'value' attribute on TextAreaInput (id=ExtDamagetxt) at FixedPropertyIncidentDV.pcf: line 66, column 53
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.ExtDamagetxt = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatedReceived) at FixedPropertyIncidentDV.pcf: line 108, column 35
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.EstimatesReceived = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at FixedPropertyIncidentDV.pcf: line 116, column 70
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.EstRepairCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at FixedPropertyIncidentDV.pcf: line 122, column 70
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.EstRepairTime = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AlreadyRepaired) at FixedPropertyIncidentDV.pcf: line 127, column 55
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.AlreadyRepaired = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at FixedPropertyIncidentDV.pcf: line 41, column 53
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.PropertyDesc = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at FixedPropertyIncidentDV.pcf: line 19, column 21
    function initialValue_0 () : Claim {
      return FixedPropertyIncident.Claim
    }
    
    // 'initialValue' attribute on Variable at FixedPropertyIncidentDV.pcf: line 24, column 45
    function initialValue_1 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.FixedPropertyAddressOwner(FixedPropertyIncident, singletonNewFixedProperty)
    }
    
    // 'initialValue' attribute on Variable at FixedPropertyIncidentDV.pcf: line 28, column 22
    function initialValue_2 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.PROPINSPECTAPPRAISAL
    }
    
    // 'initialValue' attribute on Variable at FixedPropertyIncidentDV.pcf: line 32, column 51
    function initialValue_3 () : java.util.Set<ServiceRequest> {
      return createOtherServiceRequests()
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at FixedPropertyIncidentDV.pcf: line 41, column 53
    function valueRoot_7 () : java.lang.Object {
      return FixedPropertyIncident
    }
    
    // 'value' attribute on CurrencyInput (id=LossEstimate) at FixedPropertyIncidentDV.pcf: line 53, column 53
    function value_12 () : gw.api.financials.CurrencyAmount {
      return FixedPropertyIncident.LossEstimate
    }
    
    // 'value' attribute on TypeKeyInput (id=EstDamageAmt) at FixedPropertyIncidentDV.pcf: line 59, column 44
    function value_16 () : typekey.EstDamageType {
      return FixedPropertyIncident.EstDamageType
    }
    
    // 'value' attribute on TextAreaInput (id=ExtDamagetxt) at FixedPropertyIncidentDV.pcf: line 66, column 53
    function value_20 () : java.lang.String {
      return FixedPropertyIncident.ExtDamagetxt
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatedReceived) at FixedPropertyIncidentDV.pcf: line 108, column 35
    function value_38 () : typekey.YesNo {
      return FixedPropertyIncident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at FixedPropertyIncidentDV.pcf: line 41, column 53
    function value_4 () : java.lang.String {
      return FixedPropertyIncident.PropertyDesc
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at FixedPropertyIncidentDV.pcf: line 116, column 70
    function value_43 () : gw.api.financials.CurrencyAmount {
      return FixedPropertyIncident.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at FixedPropertyIncidentDV.pcf: line 122, column 70
    function value_49 () : java.lang.String {
      return FixedPropertyIncident.EstRepairTime
    }
    
    // 'value' attribute on BooleanRadioInput (id=AlreadyRepaired) at FixedPropertyIncidentDV.pcf: line 127, column 55
    function value_54 () : java.lang.Boolean {
      return FixedPropertyIncident.AlreadyRepaired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FixedPropertyIncidentDV.pcf: line 48, column 52
    function value_8 () : java.lang.String {
      return FixedPropertyIncident.Description
    }
    
    // 'visible' attribute on InputDivider at FixedPropertyIncidentDV.pcf: line 68, column 83
    function visible_24 () : java.lang.Boolean {
      return FixedPropertyIncident.Claim.Policy.PolicyType == TC_HOMEOWNERS
    }
    
    // 'visible' attribute on ListViewInput at FixedPropertyIncidentDV.pcf: line 79, column 82
    function visible_27 () : java.lang.Boolean {
      return FixedPropertyIncident.Claim.Policy.PolicyType != TC_HOMEOWNERS
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at FixedPropertyIncidentDV.pcf: line 89, column 37
    function visible_30 () : java.lang.Boolean {
      return Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at FixedPropertyIncidentDV.pcf: line 94, column 72
    function visible_32 () : java.lang.Boolean {
      return not Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on CurrencyInput (id=EstimateCost) at FixedPropertyIncidentDV.pcf: line 116, column 70
    function visible_42 () : java.lang.Boolean {
      return FixedPropertyIncident.EstimatesReceived == TC_YES
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getRequireValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setRequireValue("FixedPropertyIncident", 0, $arg)
    }
    
    property get addressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("addressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("addressOwner", 0, $arg)
    }
    
    property get appraisalIncidentCode () : String {
      return getVariableValue("appraisalIncidentCode", 0) as String
    }
    
    property set appraisalIncidentCode ($arg :  String) {
      setVariableValue("appraisalIncidentCode", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("otherServiceRequests", 0, $arg)
    }
    
    property get singletonNewFixedProperty () : PolicyLocation {
      return getRequireValue("singletonNewFixedProperty", 0) as PolicyLocation
    }
    
    property set singletonNewFixedProperty ($arg :  PolicyLocation) {
      setRequireValue("singletonNewFixedProperty", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
    property get PropertyAppraisalServiceRequest() : ServiceRequest {
      return FixedPropertyIncident.ServiceRequests.firstWhere(\ sr ->
             sr.Instruction.Services.Count == 1
             and sr.Instruction.Services.single().Service.Code == appraisalIncidentCode
             and (otherServiceRequests == null or not otherServiceRequests.contains(sr)))
    }
    
    function createOtherServiceRequests() :  Set<ServiceRequest> {
      return FixedPropertyIncident.ServiceRequests.where(\sr -> sr != PropertyAppraisalServiceRequest).toSet()
    }
    
    
  }
  
  
}