package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkloadClassificationCommonInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationCommonInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function available_14 () : java.lang.Boolean {
      return assignmentClassification.ClaimLossType != null
    }
    
    // 'available' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function available_25 () : java.lang.Boolean {
      return assignmentClassification.ClaimLOBCode != null
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimLossType) at WorkloadClassificationCommonInputSet.pcf: line 41, column 38
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      assignmentClassification.ClaimLossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      assignmentClassification.ClaimLOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      assignmentClassification.ClaimPolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'onChange' attribute on PostOnChange at WorkloadClassificationCommonInputSet.pcf: line 59, column 54
    function onChange_13 () : void {
      gw.api.assignment.workload.util.WorkloadClassificationUIHelper.validateAndUpdateWorkloadClassification(assignmentClassification)
    }
    
    // 'onChange' attribute on PostOnChange at WorkloadClassificationCommonInputSet.pcf: line 74, column 54
    function onChange_24 () : void {
      gw.api.assignment.workload.util.WorkloadClassificationUIHelper.validateAndUpdateWorkloadClassification(assignmentClassification)
    }
    
    // 'onChange' attribute on PostOnChange at WorkloadClassificationCommonInputSet.pcf: line 44, column 54
    function onChange_7 () : void {
      gw.api.assignment.workload.util.WorkloadClassificationUIHelper.validateAndUpdateWorkloadClassification(assignmentClassification)
    }
    
    // 'showConfirmMessage' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function showConfirmMessage_17 () : java.lang.Boolean {
      return gw.api.assignment.workload.util.WorkloadClassificationUIHelper.isLOBWarningApplicable(assignmentClassification)
    }
    
    // 'showConfirmMessage' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function showConfirmMessage_28 () : java.lang.Boolean {
      return gw.api.assignment.workload.util.WorkloadClassificationUIHelper.isPolicyTypeWarningApplicable(assignmentClassification)
    }
    
    // 'showConfirmMessage' attribute on TypeKeyInput (id=ClaimLossType) at WorkloadClassificationCommonInputSet.pcf: line 41, column 38
    function showConfirmMessage_9 () : java.lang.Boolean {
      return gw.api.assignment.workload.util.WorkloadClassificationUIHelper.isLossTypeWarningApplicable(assignmentClassification)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function valueRange_21 () : java.lang.Object {
      return getValidLOBRange(assignmentClassification.ClaimLossType)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function valueRange_32 () : java.lang.Object {
      return getValidPolicyTypeRange(assignmentClassification.ClaimLOBCode)
    }
    
    // 'value' attribute on TypeKeyInput (id=AllClaimLossType) at WorkloadClassificationCommonInputSet.pcf: line 18, column 39
    function valueRoot_2 () : java.lang.Object {
      return assignmentClassification
    }
    
    // 'value' attribute on TypeKeyInput (id=AllClaimLossType) at WorkloadClassificationCommonInputSet.pcf: line 18, column 39
    function value_0 () : typekey.LossType {
      return assignmentClassification.ClaimLossType 
    }
    
    // 'value' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function value_15 () : typekey.LOBCode {
      return assignmentClassification.ClaimLOBCode
    }
    
    // 'value' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function value_26 () : typekey.PolicyType {
      return assignmentClassification.ClaimPolicyType
    }
    
    // 'value' attribute on TextInput (id=AllClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 23, column 94
    function value_3 () : java.io.Serializable & java.lang.Comparable<java.lang.Object> {
      return assignmentClassification.ClaimLOBCode != null ? assignmentClassification.ClaimLOBCode : DisplayKey.get("Web.Admin.Workload.WorkloadClassification.ClaimLOB.AllLinesOfBusiness")
    }
    
    // 'value' attribute on TextInput (id=AllClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 28, column 94
    function value_5 () : java.io.Serializable & java.lang.Comparable<java.lang.Object> {
      return assignmentClassification.ClaimPolicyType != null ? assignmentClassification.ClaimPolicyType : DisplayKey.get("Web.Admin.Workload.WorkloadClassification.ClaimPolicyType.AllPolicyTypes")
    }
    
    // 'value' attribute on TypeKeyInput (id=ClaimLossType) at WorkloadClassificationCommonInputSet.pcf: line 41, column 38
    function value_8 () : typekey.LossType {
      return assignmentClassification.ClaimLossType
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function verifyValueRangeIsAllowedType_22 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function verifyValueRangeIsAllowedType_22 ($$arg :  typekey.LOBCode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function verifyValueRangeIsAllowedType_33 ($$arg :  typekey.PolicyType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimLOBCode) at WorkloadClassificationCommonInputSet.pcf: line 56, column 37
    function verifyValueRange_23 () : void {
      var __valueRangeArg = getValidLOBRange(assignmentClassification.ClaimLossType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_22(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPolicyType) at WorkloadClassificationCommonInputSet.pcf: line 71, column 40
    function verifyValueRange_34 () : void {
      var __valueRangeArg = getValidPolicyTypeRange(assignmentClassification.ClaimLOBCode)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    property get assignmentClassification () : WorkloadClassification {
      return getRequireValue("assignmentClassification", 0) as WorkloadClassification
    }
    
    property set assignmentClassification ($arg :  WorkloadClassification) {
      setRequireValue("assignmentClassification", 0, $arg)
    }
    
    function getValidLOBRange(lossType : LossType) : java.util.List<LOBCode> {
      var codes = LOBCode.getTypeKeys(false)
      if (lossType != null) {
        codes = codes.where(\ lobCode ->lobCode.hasCategory(lossType))
      }
      return codes
    }
    
    function getValidPolicyTypeRange(lobCode : LOBCode) : java.util.List<PolicyType> {
      var allPolicyTypes = PolicyType.getTypeKeys(false)
      if (lobCode != null) {
        return allPolicyTypes.where(\ policyType ->policyType.hasCategory(lobCode))
      }
      return java.util.Collections.emptyList()
    }
    
    
  }
  
  
}