package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ApplicabilityCriteriaInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ApplicabilityCriteriaInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ApplicabilityCriteriaInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApplicabilityCriteriaInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      listBundle.Selected = (__VALUE_TO_SET as gw.entity.TypeKey[])
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnyOrSelection) at ApplicabilityCriteriaInputSet.pcf: line 26, column 44
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      listBundle.SelectorState = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at ApplicabilityCriteriaInputSet.pcf: line 13, column 68
    function initialValue_0 () : gw.bizrules.ActivityRulePanelSetHelper.SelectorState {
      return new gw.bizrules.ActivityRulePanelSetHelper.SelectorState(listBundle)
    }
    
    // 'initialValue' attribute on Variable at ApplicabilityCriteriaInputSet.pcf: line 18, column 23
    function initialValue_1 () : Boolean {
      return listBundle.initSelectorState(selectorState)
    }
    
    // 'label' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function label_11 () : java.lang.Object {
      return listBundle.ShuttleLabel
    }
    
    // 'label' attribute on BooleanRadioInput (id=AnyOrSelection) at ApplicabilityCriteriaInputSet.pcf: line 26, column 44
    function label_3 () : java.lang.Object {
      return listBundle.Label
    }
    
    // 'valueRange' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function valueRange_18 () : java.lang.Object {
      return listBundle.Range
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnyOrSelection) at ApplicabilityCriteriaInputSet.pcf: line 26, column 44
    function valueRoot_9 () : java.lang.Object {
      return listBundle
    }
    
    // 'value' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function value_12 () : gw.entity.TypeKey[] {
      return listBundle.Selected
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnyOrSelection) at ApplicabilityCriteriaInputSet.pcf: line 26, column 44
    function value_4 () : java.lang.Boolean {
      return listBundle.SelectorState
    }
    
    // 'valueRange' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.entity.TypeKey[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function verifyValueRange_20 () : void {
      var __valueRangeArg = listBundle.Range
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=InputWidget) at ApplicabilityCriteriaInputSet.pcf: line 40, column 46
    function visible_10 () : java.lang.Boolean {
      return not listBundle.SelectorState
    }
    
    // 'visible' attribute on BooleanRadioInput (id=AnyOrSelection) at ApplicabilityCriteriaInputSet.pcf: line 26, column 44
    function visible_2 () : java.lang.Boolean {
      return listBundle.SelectorVisible
    }
    
    property get listBundle () : gw.bizrules.ActivityRulePanelSetHelper.ShuttleListBundle {
      return getRequireValue("listBundle", 0) as gw.bizrules.ActivityRulePanelSetHelper.ShuttleListBundle
    }
    
    property set listBundle ($arg :  gw.bizrules.ActivityRulePanelSetHelper.ShuttleListBundle) {
      setRequireValue("listBundle", 0, $arg)
    }
    
    property get selectorState () : gw.bizrules.ActivityRulePanelSetHelper.SelectorState {
      return getVariableValue("selectorState", 0) as gw.bizrules.ActivityRulePanelSetHelper.SelectorState
    }
    
    property set selectorState ($arg :  gw.bizrules.ActivityRulePanelSetHelper.SelectorState) {
      setVariableValue("selectorState", 0, $arg)
    }
    
    property get selectorStateInitialized () : Boolean {
      return getVariableValue("selectorStateInitialized", 0) as Boolean
    }
    
    property set selectorStateInitialized ($arg :  Boolean) {
      setVariableValue("selectorStateInitialized", 0, $arg)
    }
    
    
  }
  
  
}