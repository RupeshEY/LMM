package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkflowsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workflow/WorkflowsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at WorkflowsDV.pcf: line 76, column 41
    function def_onEnter_50 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at WorkflowsDV.pcf: line 76, column 41
    function def_refreshVariables_51 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ProcessVersion = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on DateInput (id=StartDateFrom) at WorkflowsDV.pcf: line 34, column 47
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.StartDateFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Workflowtype = (__VALUE_TO_SET as typekey.Workflow)
    }
    
    // 'value' attribute on DateInput (id=StartDateTo) at WorkflowsDV.pcf: line 39, column 45
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.StartDateTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=UpdateDateFrom) at WorkflowsDV.pcf: line 44, column 48
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.UpdateDateFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=UpdateDateTo) at WorkflowsDV.pcf: line 49, column 46
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.UpdateDateTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.CurrentStep = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Handler) at WorkflowsDV.pcf: line 66, column 46
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Handler = (__VALUE_TO_SET as typekey.WorkflowHandler)
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at WorkflowsDV.pcf: line 72, column 44
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.State = (__VALUE_TO_SET as typekey.WorkflowState)
    }
    
    // 'optionLabel' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function optionLabel_38 (VALUE :  java.lang.String) : java.lang.String {
      return SearchCriteria.localizedStepName(VALUE)
    }
    
    // 'valueRange' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function valueRange_13 () : java.lang.Object {
      return SearchCriteria.getAvailableVersions()
    }
    
    // 'valueRange' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function valueRange_39 () : java.lang.Object {
      return SearchCriteria.getAvailableSteps()
    }
    
    // 'valueRange' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function valueRange_4 () : java.lang.Object {
      return SearchCriteria.getAvailableTypes()
    }
    
    // 'value' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function valueRoot_3 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function value_0 () : typekey.Workflow {
      return SearchCriteria.Workflowtype
    }
    
    // 'value' attribute on DateInput (id=StartDateFrom) at WorkflowsDV.pcf: line 34, column 47
    function value_16 () : java.util.Date {
      return SearchCriteria.StartDateFrom
    }
    
    // 'value' attribute on DateInput (id=StartDateTo) at WorkflowsDV.pcf: line 39, column 45
    function value_20 () : java.util.Date {
      return SearchCriteria.StartDateTo
    }
    
    // 'value' attribute on DateInput (id=UpdateDateFrom) at WorkflowsDV.pcf: line 44, column 48
    function value_24 () : java.util.Date {
      return SearchCriteria.UpdateDateFrom
    }
    
    // 'value' attribute on DateInput (id=UpdateDateTo) at WorkflowsDV.pcf: line 49, column 46
    function value_28 () : java.util.Date {
      return SearchCriteria.UpdateDateTo
    }
    
    // 'value' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function value_33 () : java.lang.String {
      return SearchCriteria.CurrentStep
    }
    
    // 'value' attribute on TypeKeyInput (id=Handler) at WorkflowsDV.pcf: line 66, column 46
    function value_42 () : typekey.WorkflowHandler {
      return SearchCriteria.Handler
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at WorkflowsDV.pcf: line 72, column 44
    function value_46 () : typekey.WorkflowState {
      return SearchCriteria.State
    }
    
    // 'value' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function value_8 () : java.lang.Integer {
      return SearchCriteria.ProcessVersion
    }
    
    // 'valueRange' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.lang.Integer[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function verifyValueRangeIsAllowedType_5 ($$arg :  typekey.Workflow[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function verifyValueRange_15 () : void {
      var __valueRangeArg = SearchCriteria.getAvailableVersions()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function verifyValueRange_41 () : void {
      var __valueRangeArg = SearchCriteria.getAvailableSteps()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_40(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Type) at WorkflowsDV.pcf: line 17, column 38
    function verifyValueRange_6 () : void {
      var __valueRangeArg = SearchCriteria.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=CurrentStep) at WorkflowsDV.pcf: line 60, column 98
    function visible_32 () : java.lang.Boolean {
      return SearchCriteria.Workflowtype != null and SearchCriteria.ProcessVersion != null
    }
    
    // 'visible' attribute on RangeInput (id=Version) at WorkflowsDV.pcf: line 27, column 55
    function visible_7 () : java.lang.Boolean {
      return SearchCriteria.Workflowtype != null
    }
    
    property get SearchCriteria () : WorkflowSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as WorkflowSearchCriteria
    }
    
    property set SearchCriteria ($arg :  WorkflowSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}