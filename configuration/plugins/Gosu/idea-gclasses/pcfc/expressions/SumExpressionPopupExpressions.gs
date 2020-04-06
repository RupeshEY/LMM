package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/SumExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SumExpressionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/SumExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SumExpressionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fragHolder :  gw.bizrules.pcf.SumExpressionFragmentHolder) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Popup (id=SumExpressionPopup) at SumExpressionPopup.pcf: line 11, column 35
    function afterCancel_36 () : void {
      fragHolder.onCancel()
    }
    
    // 'afterCommit' attribute on Popup (id=SumExpressionPopup) at SumExpressionPopup.pcf: line 11, column 35
    function afterCommit_37 (TopLocation :  pcf.api.Location) : void {
      fragHolder.onCommit()
    }
    
    // 'autoComplete' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function autoComplete_12 () : gw.api.contact.AutocompleteHandler {
      return fragHolder.IterableHolder.AutocompleteHandler
    }
    
    // 'autoComplete' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function autoComplete_23 () : gw.api.contact.AutocompleteHandler {
      return fragHolder.NumericTransformHolder.AutocompleteHandler
    }
    
    // 'available' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function available_15 () : java.lang.Boolean {
      return fragHolder.validateIterable().IsEmpty
    }
    
    // 'def' attribute on InputSetRef (id=IterableErrors) at SumExpressionPopup.pcf: line 49, column 83
    function def_onEnter_13 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(fragHolder.validateIterable(), false)
    }
    
    // 'def' attribute on InputSetRef (id=NumericTransformErrors) at SumExpressionPopup.pcf: line 66, column 91
    function def_onEnter_24 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(fragHolder.validateNumericTransform(), false)
    }
    
    // 'def' attribute on PanelRef at SumExpressionPopup.pcf: line 79, column 47
    function def_onEnter_31 (def :  pcf.ConditionEnabledDV) : void {
      def.onEnter(fragHolder)
    }
    
    // 'def' attribute on PanelRef (id=ConditionBuilderPanelSet) at SumExpressionPopup.pcf: line 88, column 50
    function def_onEnter_34 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.onEnter(initializedController)
    }
    
    // 'def' attribute on InputSetRef (id=IterableErrors) at SumExpressionPopup.pcf: line 49, column 83
    function def_refreshVariables_14 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(fragHolder.validateIterable(), false)
    }
    
    // 'def' attribute on InputSetRef (id=NumericTransformErrors) at SumExpressionPopup.pcf: line 66, column 91
    function def_refreshVariables_25 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(fragHolder.validateNumericTransform(), false)
    }
    
    // 'def' attribute on PanelRef at SumExpressionPopup.pcf: line 79, column 47
    function def_refreshVariables_32 (def :  pcf.ConditionEnabledDV) : void {
      def.refreshVariables(fragHolder)
    }
    
    // 'def' attribute on PanelRef (id=ConditionBuilderPanelSet) at SumExpressionPopup.pcf: line 88, column 50
    function def_refreshVariables_35 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.refreshVariables(initializedController)
    }
    
    // 'value' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.IterableHolder.FragmentProp = (__VALUE_TO_SET as entity.ExpressionFragment)
    }
    
    // 'value' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.NumericTransformHolder.FragmentProp = (__VALUE_TO_SET as entity.ExpressionFragment)
    }
    
    // 'initialValue' attribute on Variable at SumExpressionPopup.pcf: line 20, column 58
    function initialValue_0 () : gw.bizrules.pcf.ConditionBuilderController {
      return fragHolder.getInitializedNestedController(CurrentLocation)
    }
    
    // 'inputConversion' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function inputConversion_18 (VALUE :  java.lang.String) : java.lang.Object {
      return fragHolder.NumericTransformHolder.inputConversion(VALUE)
    }
    
    // 'inputConversion' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function inputConversion_7 (VALUE :  java.lang.String) : java.lang.Object {
      return fragHolder.IterableHolder.inputConversion(VALUE)
    }
    
    // EditButtons at SumExpressionPopup.pcf: line 23, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on Label (id=IterableElementTypeDescription) at SumExpressionPopup.pcf: line 75, column 64
    function label_30 () : java.lang.String {
      return fragHolder.IterableElementTypeDescription
    }
    
    // 'label' attribute on Verbatim (id=DescriptionText) at SumExpressionPopup.pcf: line 30, column 60
    function label_5 () : java.lang.String {
      return fragHolder.PopupDescriptionText
    }
    
    // 'outputConversion' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function outputConversion_19 (VALUE :  entity.ExpressionFragment) : java.lang.String {
      return fragHolder.NumericTransformHolder.outputConversion()
    }
    
    // 'outputConversion' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function outputConversion_8 (VALUE :  entity.ExpressionFragment) : java.lang.String {
      return fragHolder.IterableHolder.outputConversion()
    }
    
    // 'title' attribute on Popup (id=SumExpressionPopup) at SumExpressionPopup.pcf: line 11, column 35
    static function title_38 (fragHolder :  gw.bizrules.pcf.SumExpressionFragmentHolder) : java.lang.Object {
      return fragHolder.PopupTitle
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at SumExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_onEnter_2 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(fragHolder)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at SumExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(fragHolder)
    }
    
    // 'value' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function valueRoot_11 () : java.lang.Object {
      return fragHolder.IterableHolder
    }
    
    // 'value' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function valueRoot_22 () : java.lang.Object {
      return fragHolder.NumericTransformHolder
    }
    
    // 'value' attribute on TextInput (id=NumericTransform) at SumExpressionPopup.pcf: line 61, column 51
    function value_16 () : entity.ExpressionFragment {
      return fragHolder.NumericTransformHolder.FragmentProp
    }
    
    // 'value' attribute on TextInput (id=Space) at SumExpressionPopup.pcf: line 70, column 70
    function value_27 () : java.lang.String {
      return null
    }
    
    // 'value' attribute on TextInput (id=Iterable) at SumExpressionPopup.pcf: line 44, column 51
    function value_6 () : entity.ExpressionFragment {
      return fragHolder.IterableHolder.FragmentProp
    }
    
    // 'visible' attribute on TextInput (id=Space) at SumExpressionPopup.pcf: line 70, column 70
    function visible_26 () : java.lang.Boolean {
      return fragHolder.validateNumericTransform().IsEmpty
    }
    
    // 'visible' attribute on PanelRef (id=ConditionBuilderPanelSet) at SumExpressionPopup.pcf: line 88, column 50
    function visible_33 () : java.lang.Boolean {
      return !fragHolder.ConditionDisabled
    }
    
    // 'visible' attribute on Verbatim (id=DescriptionText) at SumExpressionPopup.pcf: line 30, column 60
    function visible_4 () : java.lang.Boolean {
      return fragHolder.PopupDescriptionText != null
    }
    
    override property get CurrentLocation () : pcf.SumExpressionPopup {
      return super.CurrentLocation as pcf.SumExpressionPopup
    }
    
    property get fragHolder () : gw.bizrules.pcf.SumExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.SumExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.SumExpressionFragmentHolder) {
      setVariableValue("fragHolder", 0, $arg)
    }
    
    property get initializedController () : gw.bizrules.pcf.ConditionBuilderController {
      return getVariableValue("initializedController", 0) as gw.bizrules.pcf.ConditionBuilderController
    }
    
    property set initializedController ($arg :  gw.bizrules.pcf.ConditionBuilderController) {
      setVariableValue("initializedController", 0, $arg)
    }
    
    
  }
  
  
}