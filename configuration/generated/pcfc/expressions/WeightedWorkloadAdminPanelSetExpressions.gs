package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WeightedWorkloadAdminPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WeightedWorkloadAdminPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WeightedWorkloadAdminPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WeightedWorkloadAdminPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on PanelSet (id=WeightedWorkloadAdminPanelSet) at WeightedWorkloadAdminPanelSet.pcf: line 8, column 40
    function available_27 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcview
    }
    
    // 'def' attribute on PanelRef at WeightedWorkloadAdminPanelSet.pcf: line 55, column 52
    function def_onEnter_20 (def :  pcf.WorkloadClassificationDV_ClaimWorkloadClassification) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on PanelRef at WeightedWorkloadAdminPanelSet.pcf: line 55, column 52
    function def_onEnter_22 (def :  pcf.WorkloadClassificationDV_ExposureWorkloadClassification) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at WeightedWorkloadAdminPanelSet.pcf: line 61, column 29
    function def_onEnter_25 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(classification, { "Name", "Description"}, { DisplayKey.get("Web.Admin.CustomerServiceTier.Name"), DisplayKey.get("Web.Admin.CustomerServiceTier.Description")})
    }
    
    // 'def' attribute on PanelRef at WeightedWorkloadAdminPanelSet.pcf: line 55, column 52
    function def_refreshVariables_21 (def :  pcf.WorkloadClassificationDV_ClaimWorkloadClassification) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on PanelRef at WeightedWorkloadAdminPanelSet.pcf: line 55, column 52
    function def_refreshVariables_23 (def :  pcf.WorkloadClassificationDV_ExposureWorkloadClassification) : void {
      def.refreshVariables(classification)
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at WeightedWorkloadAdminPanelSet.pcf: line 61, column 29
    function def_refreshVariables_26 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(classification, { "Name", "Description"}, { DisplayKey.get("Web.Admin.CustomerServiceTier.Name"), DisplayKey.get("Web.Admin.CustomerServiceTier.Description")})
    }
    
    // 'value' attribute on BooleanRadioInput (id=Active) at WeightedWorkloadAdminPanelSet.pcf: line 32, column 46
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Priority) at WeightedWorkloadAdminPanelSet.pcf: line 39, column 46
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.Priority = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=Weight) at WeightedWorkloadAdminPanelSet.pcf: line 48, column 31
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.Weight = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=Name) at WeightedWorkloadAdminPanelSet.pcf: line 21, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at WeightedWorkloadAdminPanelSet.pcf: line 26, column 51
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      classification.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on PanelSet (id=WeightedWorkloadAdminPanelSet) at WeightedWorkloadAdminPanelSet.pcf: line 8, column 40
    function editable_28 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcmanage
    }
    
    // 'mode' attribute on PanelRef at WeightedWorkloadAdminPanelSet.pcf: line 55, column 52
    function mode_24 () : java.lang.Object {
      return (typeof classification).TypeInfo.Name
    }
    
    // 'value' attribute on TextInput (id=Name) at WeightedWorkloadAdminPanelSet.pcf: line 21, column 44
    function valueRoot_3 () : java.lang.Object {
      return classification
    }
    
    // 'value' attribute on TextInput (id=Name) at WeightedWorkloadAdminPanelSet.pcf: line 21, column 44
    function value_0 () : java.lang.String {
      return classification.Name
    }
    
    // 'value' attribute on TextInput (id=Priority) at WeightedWorkloadAdminPanelSet.pcf: line 39, column 46
    function value_12 () : java.lang.Integer {
      return classification.Priority
    }
    
    // 'value' attribute on TextInput (id=Weight) at WeightedWorkloadAdminPanelSet.pcf: line 48, column 31
    function value_16 () : java.lang.Integer {
      return classification.Weight
    }
    
    // 'value' attribute on TextInput (id=Description) at WeightedWorkloadAdminPanelSet.pcf: line 26, column 51
    function value_4 () : java.lang.String {
      return classification.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Active) at WeightedWorkloadAdminPanelSet.pcf: line 32, column 46
    function value_8 () : java.lang.Boolean {
      return classification.Active
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    
  }
  
  
}