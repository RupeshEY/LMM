package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConditionBuilderPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionBuilderPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AdvancedShowPrettyPrint) at ConditionBuilderPanelSet.pcf: line 66, column 94
    function action_10 () : void {
      controller.setShowPrettyPrint(true)
    }
    
    // 'action' attribute on ToolbarButton (id=AdvancedHidePrettyPrint) at ConditionBuilderPanelSet.pcf: line 71, column 93
    function action_12 () : void {
      controller.setShowPrettyPrint(false)
    }
    
    // 'action' attribute on ToolbarButton (id=AdvancedContextHelp) at ConditionBuilderPanelSet.pcf: line 78, column 51
    function action_14 () : void {
      ContextHelp.push()
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleShowPrettyPrint) at ConditionBuilderPanelSet.pcf: line 116, column 94
    function action_23 () : void {
      controller.setShowPrettyPrint(true)
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleHidePrettyPrint) at ConditionBuilderPanelSet.pcf: line 121, column 93
    function action_25 () : void {
      controller.setShowPrettyPrint(false)
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleContextHelp) at ConditionBuilderPanelSet.pcf: line 128, column 51
    function action_27 () : void {
      ContextHelp.push()
    }
    
    // 'action' attribute on ToolbarButton (id=AdvancedContextHelp) at ConditionBuilderPanelSet.pcf: line 78, column 51
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ContextHelp.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=SimpleContextHelp) at ConditionBuilderPanelSet.pcf: line 128, column 51
    function action_dest_28 () : pcf.api.Destination {
      return pcf.ContextHelp.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=AdvancedMoveUp) at ConditionBuilderPanelSet.pcf: line 54, column 91
    function allCheckedRowsAction_7 (CheckedValues :  gw.bizrules.pcf.RuleConditionLineHolder[], CheckedValuesErrors :  java.util.Map) : void {
      controller.moveLinesUp(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=AdvancedMoveDown) at ConditionBuilderPanelSet.pcf: line 61, column 93
    function allCheckedRowsAction_8 (CheckedValues :  gw.bizrules.pcf.RuleConditionLineHolder[], CheckedValuesErrors :  java.util.Map) : void {
      controller.moveLinesDown(CheckedValues)
    }
    
    // 'def' attribute on PanelRef (id=AdvancedConditionsLV) at ConditionBuilderPanelSet.pcf: line 34, column 48
    function def_onEnter_17 (def :  pcf.ConditionBuilderLV) : void {
      def.onEnter(controller, true)
    }
    
    // 'def' attribute on PanelRef (id=SimpleConditionsLV) at ConditionBuilderPanelSet.pcf: line 84, column 49
    function def_onEnter_30 (def :  pcf.ConditionBuilderLV) : void {
      def.onEnter(controller, false)
    }
    
    // 'def' attribute on InputSetRef at ConditionBuilderPanelSet.pcf: line 147, column 87
    function def_onEnter_34 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(controller.ReadOnlyConditionErrors, true)
    }
    
    // 'def' attribute on InputSetRef at ConditionBuilderPanelSet.pcf: line 155, column 75
    function def_onEnter_37 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(controller?.validate(), true)
    }
    
    // 'def' attribute on PanelRef (id=AdvancedConditionsLV) at ConditionBuilderPanelSet.pcf: line 34, column 48
    function def_refreshVariables_18 (def :  pcf.ConditionBuilderLV) : void {
      def.refreshVariables(controller, true)
    }
    
    // 'def' attribute on PanelRef (id=SimpleConditionsLV) at ConditionBuilderPanelSet.pcf: line 84, column 49
    function def_refreshVariables_31 (def :  pcf.ConditionBuilderLV) : void {
      def.refreshVariables(controller, false)
    }
    
    // 'def' attribute on InputSetRef at ConditionBuilderPanelSet.pcf: line 147, column 87
    function def_refreshVariables_35 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(controller.ReadOnlyConditionErrors, true)
    }
    
    // 'def' attribute on InputSetRef at ConditionBuilderPanelSet.pcf: line 155, column 75
    function def_refreshVariables_38 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(controller?.validate(), true)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=ConditionType) at ConditionBuilderPanelSet.pcf: line 23, column 51
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      controller.RuleConditionType = (__VALUE_TO_SET as typekey.RuleConditionType)
    }
    
    // 'filter' attribute on TypeKeyRadioInput (id=ConditionType) at ConditionBuilderPanelSet.pcf: line 23, column 51
    function filter_4 (VALUE :  typekey.RuleConditionType, VALUES :  typekey.RuleConditionType[]) : java.lang.Boolean {
      return controller.AlwaysTrueConditionTypeVisible or VALUE != TC_ALWAYSTRUE
    }
    
    // TemplatePanel at ConditionBuilderPanelSet.pcf: line 134, column 24
    function renderCall_32 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.ConditionBuilderPanelSet_TemplatePanel1.render(__writer, __escaper, controller, __writer, __escaper)
    }
    
    // 'toCreateAndAdd' attribute on AddButton (id=AdvancedAdd) at ConditionBuilderPanelSet.pcf: line 42, column 117
    function toCreateAndAdd_6 (CheckedValues :  Object[]) : java.lang.Object {
      return controller.insertNewLines(CheckedValues as gw.bizrules.pcf.RuleConditionLineHolder[])
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=ConditionType) at ConditionBuilderPanelSet.pcf: line 23, column 51
    function valueRoot_3 () : java.lang.Object {
      return controller
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=ConditionType) at ConditionBuilderPanelSet.pcf: line 23, column 51
    function value_0 () : typekey.RuleConditionType {
      return controller.RuleConditionType
    }
    
    // 'visible' attribute on ToolbarButton (id=AdvancedHidePrettyPrint) at ConditionBuilderPanelSet.pcf: line 71, column 93
    function visible_11 () : java.lang.Boolean {
      return CurrentLocation.InEditMode && controller.isShowPrettyPrint()
    }
    
    // 'visible' attribute on PanelRef (id=AdvancedConditionsLV) at ConditionBuilderPanelSet.pcf: line 34, column 48
    function visible_16 () : java.lang.Boolean {
      return controller.AdvancedCondition
    }
    
    // 'visible' attribute on PanelRef (id=SimpleConditionsLV) at ConditionBuilderPanelSet.pcf: line 84, column 49
    function visible_29 () : java.lang.Boolean {
      return !controller.AdvancedCondition
    }
    
    // 'visible' attribute on PanelSet (id=PrettyPrintWrapperPanelSet) at ConditionBuilderPanelSet.pcf: line 133, column 81
    function visible_33 () : java.lang.Boolean {
      return !CurrentLocation.InEditMode || controller.isShowPrettyPrint()
    }
    
    // 'visible' attribute on DetailViewPanel (id=ConditionValidationErrorsWhenReadOnlyDV) at ConditionBuilderPanelSet.pcf: line 144, column 47
    function visible_36 () : java.lang.Boolean {
      return !CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on PanelSet at ConditionBuilderPanelSet.pcf: line 30, column 81
    function visible_40 () : java.lang.Boolean {
      return controller.RuleConditionType != RuleConditionType.TC_ALWAYSTRUE
    }
    
    // 'visible' attribute on PanelRef at ConditionBuilderPanelSet.pcf: line 11, column 44
    function visible_5 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on ToolbarButton (id=AdvancedShowPrettyPrint) at ConditionBuilderPanelSet.pcf: line 66, column 94
    function visible_9 () : java.lang.Boolean {
      return CurrentLocation.InEditMode && !controller.isShowPrettyPrint()
    }
    
    property get controller () : gw.bizrules.pcf.ConditionBuilderController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.ConditionBuilderController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.ConditionBuilderController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}