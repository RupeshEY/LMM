package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPolicyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFSuspenseQueuePolicySearchPolicyInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPolicyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFSuspenseQueuePolicySearchPolicyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 39, column 46
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 16, column 50
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Vin) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 45, column 59
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.Vin = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PropertyCity) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 51, column 141
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.PropertyAddress.City = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyState) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 59, column 143
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.PropertyAddress.State = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 65, column 86
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.IncludeArchived = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 23, column 36
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.LossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'label' attribute on TypeKeyInput (id=PropertyState) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 59, column 143
    function label_34 () : java.lang.Object {
      return PolicySearchCriteria.PropertyAddress.Country == Country.TC_CA ? DisplayKey.get("Web.Address.Default.Province") : DisplayKey.get("Web.Address.Default.State")
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function valueRange_14 () : java.lang.Object {
      return gw.api.policy.PolicyTypeUtil.getPolicyTypes(PolicySearchCriteria)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 16, column 50
    function valueRoot_3 () : java.lang.Object {
      return PolicySearchCriteria
    }
    
    // 'value' attribute on TextInput (id=PropertyCity) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 51, column 141
    function valueRoot_32 () : java.lang.Object {
      return PolicySearchCriteria.PropertyAddress
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 16, column 50
    function value_0 () : java.lang.String {
      return PolicySearchCriteria.PolicyNumber
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 39, column 46
    function value_17 () : java.util.Date {
      return PolicySearchCriteria.LossDate
    }
    
    // 'value' attribute on TextInput (id=Vin) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 45, column 59
    function value_22 () : java.lang.String {
      return PolicySearchCriteria.Vin
    }
    
    // 'value' attribute on TextInput (id=PropertyCity) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 51, column 141
    function value_28 () : java.lang.String {
      return PolicySearchCriteria.PropertyAddress.City
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyState) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 59, column 143
    function value_35 () : typekey.State {
      return PolicySearchCriteria.PropertyAddress.State
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 23, column 36
    function value_4 () : typekey.LossType {
      return PolicySearchCriteria.LossType
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 65, column 86
    function value_42 () : java.lang.Boolean {
      return PolicySearchCriteria.IncludeArchived
    }
    
    // 'value' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function value_9 () : typekey.PolicyType {
      return PolicySearchCriteria.PolicyType
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function verifyValueRangeIsAllowedType_15 ($$arg :  typekey.PolicyType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function verifyValueRange_16 () : void {
      var __valueRangeArg = gw.api.policy.PolicyTypeUtil.getPolicyTypes(PolicySearchCriteria)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Vin) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 45, column 59
    function visible_21 () : java.lang.Boolean {
      return PolicySearchCriteria.LossType == TC_AUTO
    }
    
    // 'visible' attribute on TextInput (id=PropertyCity) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 51, column 141
    function visible_27 () : java.lang.Boolean {
      return PolicySearchCriteria.LossType == TC_PR || PolicySearchCriteria.LossType == TC_GL || PolicySearchCriteria.LossType == TC_WC
    }
    
    // 'visible' attribute on TypeKeyInput (id=PropertyState) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 59, column 143
    function visible_33 () : java.lang.Boolean {
      return (PolicySearchCriteria.LossType == TC_PR || PolicySearchCriteria.LossType == TC_GL || PolicySearchCriteria.LossType == TC_WC)
    }
    
    // 'visible' attribute on CheckBoxInput (id=IncludeArchivedPolicies) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 65, column 86
    function visible_41 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.PolicySystemArchivingEnabled.Value
    }
    
    // 'visible' attribute on RangeInput (id=PolicyType) at ECFSuspenseQueuePolicySearchPolicyInputSet.pcf: line 34, column 56
    function visible_8 () : java.lang.Boolean {
      return PolicySearchCriteria.LossType != null
    }
    
    property get PolicySearchCriteria () : PolicySearchCriteria {
      return getRequireValue("PolicySearchCriteria", 0) as PolicySearchCriteria
    }
    
    property set PolicySearchCriteria ($arg :  PolicySearchCriteria) {
      setRequireValue("PolicySearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}