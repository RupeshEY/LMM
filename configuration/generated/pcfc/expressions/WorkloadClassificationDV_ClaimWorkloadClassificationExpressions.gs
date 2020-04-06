package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkloadClassificationDV_ClaimWorkloadClassificationExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 18, column 69
    function def_onEnter_1 (def :  pcf.WorkloadClassificationCommonInputSet) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ListViewInput (id=SegmentConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 62, column 66
    function def_onEnter_17 (def :  pcf.SegmentConditionsLV) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ListViewInput (id=LossCauseConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 84, column 68
    function def_onEnter_25 (def :  pcf.LossCauseConditionsLV) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ListViewInput (id=CustomerServiceTierConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 106, column 78
    function def_onEnter_33 (def :  pcf.CustomerServiceTierConditionsLV) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ListViewInput (id=ExposureConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 40, column 67
    function def_onEnter_9 (def :  pcf.ExposureConditionsLV) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ListViewInput (id=ExposureConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 40, column 67
    function def_refreshVariables_10 (def :  pcf.ExposureConditionsLV) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on ListViewInput (id=SegmentConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 62, column 66
    function def_refreshVariables_18 (def :  pcf.SegmentConditionsLV) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on InputSetRef at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 18, column 69
    function def_refreshVariables_2 (def :  pcf.WorkloadClassificationCommonInputSet) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on ListViewInput (id=LossCauseConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 84, column 68
    function def_refreshVariables_26 (def :  pcf.LossCauseConditionsLV) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on ListViewInput (id=CustomerServiceTierConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 106, column 78
    function def_refreshVariables_34 (def :  pcf.CustomerServiceTierConditionsLV) : void {
      def.refreshVariables(classification)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllSegments) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 54, column 60
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.SegmentCondition.IncludeAll = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllLossCauses) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 76, column 62
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.LossCauseCondition.IncludeAll = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllCustomerServiceTiers) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 98, column 72
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.CustomerServiceTierCondition.IncludeAll = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllExposures) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 31, column 61
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.ExposureCondition.IncludeAll = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on ListViewInput (id=SegmentConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 62, column 66
    function editable_15 () : java.lang.Boolean {
      return not classification.SegmentCondition.IncludeAll
    }
    
    // 'editable' attribute on ListViewInput (id=LossCauseConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 84, column 68
    function editable_23 () : java.lang.Boolean {
      return not classification.LossCauseCondition.IncludeAll
    }
    
    // 'editable' attribute on ListViewInput (id=CustomerServiceTierConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 106, column 78
    function editable_31 () : java.lang.Boolean {
      return not classification.CustomerServiceTierCondition.IncludeAll
    }
    
    // 'editable' attribute on ListViewInput (id=ExposureConditions) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 40, column 67
    function editable_7 () : java.lang.Boolean {
      return not classification.ExposureCondition.IncludeAll
    }
    
    // 'initialValue' attribute on Variable at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 15, column 43
    function initialValue_0 () : ClaimWorkloadClassification {
      return assignmentClassification as ClaimWorkloadClassification
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllSegments) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 54, column 60
    function valueRoot_14 () : java.lang.Object {
      return classification.SegmentCondition
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllLossCauses) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 76, column 62
    function valueRoot_22 () : java.lang.Object {
      return classification.LossCauseCondition
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllCustomerServiceTiers) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 98, column 72
    function valueRoot_30 () : java.lang.Object {
      return classification.CustomerServiceTierCondition
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllExposures) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 31, column 61
    function valueRoot_6 () : java.lang.Object {
      return classification.ExposureCondition
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllSegments) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 54, column 60
    function value_11 () : java.lang.Boolean {
      return classification.SegmentCondition.IncludeAll
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllLossCauses) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 76, column 62
    function value_19 () : java.lang.Boolean {
      return classification.LossCauseCondition.IncludeAll
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllCustomerServiceTiers) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 98, column 72
    function value_27 () : java.lang.Boolean {
      return classification.CustomerServiceTierCondition.IncludeAll
    }
    
    // 'value' attribute on BooleanRadioInput (id=AllExposures) at WorkloadClassificationDV.ClaimWorkloadClassification.pcf: line 31, column 61
    function value_3 () : java.lang.Boolean {
      return classification.ExposureCondition.IncludeAll
    }
    
    property get assignmentClassification () : WorkloadClassification {
      return getRequireValue("assignmentClassification", 0) as WorkloadClassification
    }
    
    property set assignmentClassification ($arg :  WorkloadClassification) {
      setRequireValue("assignmentClassification", 0, $arg)
    }
    
    property get classification () : ClaimWorkloadClassification {
      return getVariableValue("classification", 0) as ClaimWorkloadClassification
    }
    
    property set classification ($arg :  ClaimWorkloadClassification) {
      setVariableValue("classification", 0, $arg)
    }
    
    
  }
  
  
}