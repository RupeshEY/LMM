package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/ExposureWorkloadInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureWorkloadInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/ExposureWorkloadInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureWorkloadInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=SupplementalWorkloadWeight) at ExposureWorkloadInputSet.pcf: line 36, column 38
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      exposure.SupplementalWorkloadWeight = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'editable' attribute on TextInput (id=SupplementalWorkloadWeight) at ExposureWorkloadInputSet.pcf: line 36, column 38
    function editable_10 () : java.lang.Boolean {
      return perm.System.wwlmanage
    }
    
    // 'initialValue' attribute on Variable at ExposureWorkloadInputSet.pcf: line 15, column 45
    function initialValue_0 () : entity.WorkloadClassification {
      return exposure.findMatchingClassification()
    }
    
    // 'value' attribute on TextInput (id=SupplementalWorkloadWeight) at ExposureWorkloadInputSet.pcf: line 36, column 38
    function valueRoot_15 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextInput (id=ClassificationWorkload) at ExposureWorkloadInputSet.pcf: line 30, column 38
    function valueRoot_9 () : java.lang.Object {
      return classification
    }
    
    // 'value' attribute on TextInput (id=SupplementalWorkloadWeight) at ExposureWorkloadInputSet.pcf: line 36, column 38
    function value_11 () : java.lang.Integer {
      return exposure.SupplementalWorkloadWeight
    }
    
    // 'value' attribute on TextInput (id=TotalWorkloadWeight) at ExposureWorkloadInputSet.pcf: line 41, column 38
    function value_16 () : java.lang.Integer {
      return exposure.WorkloadWeight
    }
    
    // 'value' attribute on TextInput (id=Classification) at ExposureWorkloadInputSet.pcf: line 24, column 38
    function value_2 () : entity.WorkloadClassification {
      return classification
    }
    
    // 'value' attribute on TextInput (id=ClassificationWorkload) at ExposureWorkloadInputSet.pcf: line 30, column 38
    function value_6 () : java.lang.Integer {
      return classification.Weight
    }
    
    // 'visible' attribute on TextInput (id=Classification) at ExposureWorkloadInputSet.pcf: line 24, column 38
    function visible_1 () : java.lang.Boolean {
      return not exposure.Closed
    }
    
    // 'visible' attribute on InputSet (id=ExposureWorkloadInputSet) at ExposureWorkloadInputSet.pcf: line 7, column 104
    function visible_19 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get classification () : entity.WorkloadClassification {
      return getVariableValue("classification", 0) as entity.WorkloadClassification
    }
    
    property set classification ($arg :  entity.WorkloadClassification) {
      setVariableValue("classification", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getRequireValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setRequireValue("exposure", 0, $arg)
    }
    
    
  }
  
  
}