package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CountExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CountExpressionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CountExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CountExpressionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fragHolder :  gw.bizrules.pcf.CountExpressionFragmentHolder) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Popup (id=CountExpressionPopup) at CountExpressionPopup.pcf: line 11, column 35
    function afterCancel_25 () : void {
      fragHolder.onCancel()
    }
    
    // 'afterCommit' attribute on Popup (id=CountExpressionPopup) at CountExpressionPopup.pcf: line 11, column 35
    function afterCommit_26 (TopLocation :  pcf.api.Location) : void {
      fragHolder.onCommit()
    }
    
    // 'autoComplete' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function autoComplete_12 () : gw.api.contact.AutocompleteHandler {
      return fragHolder.IterableHolder.AutocompleteHandler
    }
    
    // 'def' attribute on InputSetRef (id=IterableErrors) at CountExpressionPopup.pcf: line 49, column 83
    function def_onEnter_13 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(fragHolder.validateIterable(), false)
    }
    
    // 'def' attribute on PanelRef at CountExpressionPopup.pcf: line 62, column 47
    function def_onEnter_20 (def :  pcf.ConditionEnabledDV) : void {
      def.onEnter(fragHolder)
    }
    
    // 'def' attribute on PanelRef (id=ConditionBuilderPanelSet) at CountExpressionPopup.pcf: line 71, column 50
    function def_onEnter_23 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.onEnter(initializedController)
    }
    
    // 'def' attribute on InputSetRef (id=IterableErrors) at CountExpressionPopup.pcf: line 49, column 83
    function def_refreshVariables_14 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(fragHolder.validateIterable(), false)
    }
    
    // 'def' attribute on PanelRef at CountExpressionPopup.pcf: line 62, column 47
    function def_refreshVariables_21 (def :  pcf.ConditionEnabledDV) : void {
      def.refreshVariables(fragHolder)
    }
    
    // 'def' attribute on PanelRef (id=ConditionBuilderPanelSet) at CountExpressionPopup.pcf: line 71, column 50
    function def_refreshVariables_24 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.refreshVariables(initializedController)
    }
    
    // 'value' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.IterableHolder.FragmentProp = (__VALUE_TO_SET as entity.ExpressionFragment)
    }
    
    // 'initialValue' attribute on Variable at CountExpressionPopup.pcf: line 20, column 58
    function initialValue_0 () : gw.bizrules.pcf.ConditionBuilderController {
      return fragHolder.getInitializedNestedController(CurrentLocation)
    }
    
    // 'inputConversion' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function inputConversion_7 (VALUE :  java.lang.String) : java.lang.Object {
      return fragHolder.IterableHolder.inputConversion(VALUE)
    }
    
    // EditButtons at CountExpressionPopup.pcf: line 23, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on Label (id=IterableElementTypeDescription) at CountExpressionPopup.pcf: line 58, column 64
    function label_19 () : java.lang.String {
      return fragHolder.IterableElementTypeDescription
    }
    
    // 'label' attribute on Verbatim (id=DescriptionText) at CountExpressionPopup.pcf: line 30, column 60
    function label_5 () : java.lang.String {
      return fragHolder.PopupDescriptionText
    }
    
    // 'outputConversion' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function outputConversion_8 (VALUE :  entity.ExpressionFragment) : java.lang.String {
      return fragHolder.IterableHolder.outputConversion()
    }
    
    // 'title' attribute on Popup (id=CountExpressionPopup) at CountExpressionPopup.pcf: line 11, column 35
    static function title_27 (fragHolder :  gw.bizrules.pcf.CountExpressionFragmentHolder) : java.lang.Object {
      return fragHolder.PopupTitle
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at CountExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_onEnter_2 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(fragHolder)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at CountExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(fragHolder)
    }
    
    // 'value' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function valueRoot_11 () : java.lang.Object {
      return fragHolder.IterableHolder
    }
    
    // 'value' attribute on TextInput (id=Space) at CountExpressionPopup.pcf: line 53, column 62
    function value_16 () : java.lang.String {
      return null
    }
    
    // 'value' attribute on TextInput (id=Iterable) at CountExpressionPopup.pcf: line 44, column 51
    function value_6 () : entity.ExpressionFragment {
      return fragHolder.IterableHolder.FragmentProp
    }
    
    // 'visible' attribute on TextInput (id=Space) at CountExpressionPopup.pcf: line 53, column 62
    function visible_15 () : java.lang.Boolean {
      return fragHolder.validateIterable().IsEmpty
    }
    
    // 'visible' attribute on PanelRef (id=ConditionBuilderPanelSet) at CountExpressionPopup.pcf: line 71, column 50
    function visible_22 () : java.lang.Boolean {
      return !fragHolder.ConditionDisabled
    }
    
    // 'visible' attribute on Verbatim (id=DescriptionText) at CountExpressionPopup.pcf: line 30, column 60
    function visible_4 () : java.lang.Boolean {
      return fragHolder.PopupDescriptionText != null
    }
    
    override property get CurrentLocation () : pcf.CountExpressionPopup {
      return super.CurrentLocation as pcf.CountExpressionPopup
    }
    
    property get fragHolder () : gw.bizrules.pcf.CountExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.CountExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.CountExpressionFragmentHolder) {
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