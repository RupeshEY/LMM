package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConditionBuilderLVExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionBuilderLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ConditionBuilderLV.pcf: line 65, column 24
    function sortBy_3 (conditionLineHolder :  gw.bizrules.pcf.RuleConditionLineHolder) : java.lang.Object {
      return conditionLineHolder.Line.OrderNumber
    }
    
    // 'startChecked' attribute on RowIterator (id=ConditionLineIterator) at ConditionBuilderLV.pcf: line 62, column 81
    function startChecked_72 (conditionLineHolder :  gw.bizrules.pcf.RuleConditionLineHolder) : java.lang.Boolean {
      return controller.isLineChecked(conditionLineHolder)
    }
    
    // 'toRemove' attribute on RowIterator (id=ConditionLineIterator) at ConditionBuilderLV.pcf: line 62, column 81
    function toRemove_70 (conditionLineHolder :  gw.bizrules.pcf.RuleConditionLineHolder) : void {
      controller.removeLine(conditionLineHolder)
    }
    
    // 'value' attribute on RowIterator (id=ConditionLineIterator) at ConditionBuilderLV.pcf: line 62, column 81
    function value_71 () : java.util.List<gw.bizrules.pcf.RuleConditionLineHolder> {
      return controller.ConditionLineHolders
    }
    
    // 'visible' attribute on TextCell (id=AndOrLabel) at ConditionBuilderLV.pcf: line 24, column 21
    function visible_0 () : java.lang.Boolean {
      return advanced
    }
    
    property get advanced () : boolean {
      return getRequireValue("advanced", 0) as java.lang.Boolean
    }
    
    property set advanced ($arg :  boolean) {
      setRequireValue("advanced", 0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.ConditionBuilderController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.ConditionBuilderController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.ConditionBuilderController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LeftOperandError) at ConditionBuilderLV.pcf: line 180, column 30
    function value_51 () : java.lang.String {
      return error
    }
    
    property get error () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=RightOperandError) at ConditionBuilderLV.pcf: line 209, column 30
    function value_56 () : java.lang.String {
      return error
    }
    
    property get error () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LineError) at ConditionBuilderLV.pcf: line 251, column 30
    function value_65 () : java.lang.String {
      return error
    }
    
    property get error () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionBuilderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ConditionBuilderLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at ConditionBuilderLV.pcf: line 68, column 27
    function condition_4 () : java.lang.Boolean {
      return controller.canMoveUp(conditionLineHolder)
    }
    
    // 'condition' attribute on ToolbarFlag at ConditionBuilderLV.pcf: line 71, column 29
    function condition_5 () : java.lang.Boolean {
      return controller.canMoveDown(conditionLineHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function def_onEnter_17 (def :  pcf.ExpressionFragCell_formula) : void {
      def.onEnter(controller, conditionLineHolder.LeftOperandHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function def_onEnter_19 (def :  pcf.ExpressionFragCell_nested) : void {
      def.onEnter(controller, conditionLineHolder.LeftOperandHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at ConditionBuilderLV.pcf: line 108, column 118
    function def_onEnter_23 (def :  pcf.ConditionBuilderExpressionMenuItemSet) : void {
      def.onEnter(conditionLineHolder.LeftOperandHolder, conditionLineHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function def_onEnter_31 (def :  pcf.ExpressionFragCell_formula) : void {
      def.onEnter(controller, conditionLineHolder.RightOperandHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function def_onEnter_33 (def :  pcf.ExpressionFragCell_nested) : void {
      def.onEnter(controller, conditionLineHolder.RightOperandHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at ConditionBuilderLV.pcf: line 133, column 119
    function def_onEnter_39 (def :  pcf.ConditionBuilderExpressionMenuItemSet) : void {
      def.onEnter(conditionLineHolder.RightOperandHolder, conditionLineHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function def_refreshVariables_18 (def :  pcf.ExpressionFragCell_formula) : void {
      def.refreshVariables(controller, conditionLineHolder.LeftOperandHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function def_refreshVariables_20 (def :  pcf.ExpressionFragCell_nested) : void {
      def.refreshVariables(controller, conditionLineHolder.LeftOperandHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at ConditionBuilderLV.pcf: line 108, column 118
    function def_refreshVariables_24 (def :  pcf.ConditionBuilderExpressionMenuItemSet) : void {
      def.refreshVariables(conditionLineHolder.LeftOperandHolder, conditionLineHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function def_refreshVariables_32 (def :  pcf.ExpressionFragCell_formula) : void {
      def.refreshVariables(controller, conditionLineHolder.RightOperandHolder)
    }
    
    // 'def' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function def_refreshVariables_34 (def :  pcf.ExpressionFragCell_nested) : void {
      def.refreshVariables(controller, conditionLineHolder.RightOperandHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at ConditionBuilderLV.pcf: line 133, column 119
    function def_refreshVariables_40 (def :  pcf.ConditionBuilderExpressionMenuItemSet) : void {
      def.refreshVariables(conditionLineHolder.RightOperandHolder, conditionLineHolder)
    }
    
    // 'value' attribute on TypeKeyCell (id=AndOr) at ConditionBuilderLV.pcf: line 82, column 22
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      conditionLineHolder.Line.BooleanOperator = (__VALUE_TO_SET as typekey.RuleBooleanOperator)
    }
    
    // 'value' attribute on TypeKeyCell (id=LeftParens) at ConditionBuilderLV.pcf: line 93, column 22
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      conditionLineHolder.Line.LeftParens = (__VALUE_TO_SET as typekey.Parentheses)
    }
    
    // 'value' attribute on TypeKeyCell (id=Operator) at ConditionBuilderLV.pcf: line 117, column 44
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      conditionLineHolder.LineOperator = (__VALUE_TO_SET as typekey.RuleOperator)
    }
    
    // 'value' attribute on TypeKeyCell (id=RightParens) at ConditionBuilderLV.pcf: line 142, column 30
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      conditionLineHolder.Line.RightParens = (__VALUE_TO_SET as typekey.Parentheses)
    }
    
    // 'editable' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function editable_30 () : java.lang.Boolean {
      return not conditionLineHolder.isNoRHSRequiredOperator()
    }
    
    // 'fontColor' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function fontColor_22 () : java.lang.String {
      return conditionLineHolder.operandColor(conditionLineHolder.LeftOperandHolder)
    }
    
    // 'fontColor' attribute on TypeKeyCell (id=Operator) at ConditionBuilderLV.pcf: line 117, column 44
    function fontColor_26 () : java.lang.String {
      return conditionLineHolder.operatorColor()
    }
    
    // 'fontColor' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function fontColor_38 () : java.lang.String {
      return conditionLineHolder.operandColor(conditionLineHolder.RightOperandHolder)
    }
    
    // 'mode' attribute on ModalCellRef (id=LeftOperandCell) at ConditionBuilderLV.pcf: line 102, column 24
    function mode_21 () : java.lang.Object {
      return conditionLineHolder.LeftOperandHolder.PCFMode
    }
    
    // 'mode' attribute on ModalCellRef (id=RightOperandCell) at ConditionBuilderLV.pcf: line 126, column 24
    function mode_35 () : java.lang.Object {
      return conditionLineHolder.RightOperandHolder.PCFMode
    }
    
    // 'value' attribute on TypeKeyCell (id=AndOr) at ConditionBuilderLV.pcf: line 82, column 22
    function valueRoot_11 () : java.lang.Object {
      return conditionLineHolder.Line
    }
    
    // 'value' attribute on TypeKeyCell (id=Operator) at ConditionBuilderLV.pcf: line 117, column 44
    function valueRoot_29 () : java.lang.Object {
      return conditionLineHolder
    }
    
    // 'value' attribute on TypeKeyCell (id=LeftParens) at ConditionBuilderLV.pcf: line 93, column 22
    function value_13 () : typekey.Parentheses {
      return conditionLineHolder.Line.LeftParens
    }
    
    // 'value' attribute on TypeKeyCell (id=Operator) at ConditionBuilderLV.pcf: line 117, column 44
    function value_25 () : typekey.RuleOperator {
      return conditionLineHolder.LineOperator
    }
    
    // 'value' attribute on TypeKeyCell (id=RightParens) at ConditionBuilderLV.pcf: line 142, column 30
    function value_43 () : typekey.Parentheses {
      return conditionLineHolder.Line.RightParens
    }
    
    // 'value' attribute on InputIterator (id=LeftOperandErrors) at ConditionBuilderLV.pcf: line 177, column 44
    function value_53 () : java.lang.String[] {
      return conditionLineHolder.LeftOperandHolder.validate()
    }
    
    // 'value' attribute on InputIterator (id=RightOperandErrors) at ConditionBuilderLV.pcf: line 206, column 44
    function value_58 () : java.lang.String[] {
      return conditionLineHolder.RightOperandHolder.validate()
    }
    
    // 'value' attribute on InputIterator (id=LineErrors) at ConditionBuilderLV.pcf: line 248, column 44
    function value_67 () : java.lang.String[] {
      return conditionLineHolder.validate()
    }
    
    // 'value' attribute on TypeKeyCell (id=AndOr) at ConditionBuilderLV.pcf: line 82, column 22
    function value_7 () : typekey.RuleBooleanOperator {
      return conditionLineHolder.Line.BooleanOperator
    }
    
    // 'valueVisible' attribute on TextCell (id=RightOperandMenu) at ConditionBuilderLV.pcf: line 131, column 22
    function visible_41 () : java.lang.Boolean {
      return conditionLineHolder.shouldShowRHSModeSwitchMenu()
    }
    
    // 'visible' attribute on ContentInput (id=LeftOperandValidationErrorsCellHeader) at ConditionBuilderLV.pcf: line 163, column 71
    function visible_49 () : java.lang.Boolean {
      return conditionLineHolder.LeftOperandHolder.HasErrors
    }
    
    // 'visible' attribute on ContentInput (id=RightOperandValidationErrorsCellHeader) at ConditionBuilderLV.pcf: line 192, column 72
    function visible_54 () : java.lang.Boolean {
      return conditionLineHolder.RightOperandHolder.HasErrors
    }
    
    // 'visible' attribute on TypeKeyCell (id=AndOr) at ConditionBuilderLV.pcf: line 82, column 22
    function visible_6 () : java.lang.Boolean {
      return advanced
    }
    
    // 'visible' attribute on Row at ConditionBuilderLV.pcf: line 147, column 119
    function visible_60 () : java.lang.Boolean {
      return conditionLineHolder.LeftOperandHolder.HasErrors || conditionLineHolder.RightOperandHolder.HasErrors
    }
    
    // 'visible' attribute on ContentInput (id=LineValidationErrorsCellHeader) at ConditionBuilderLV.pcf: line 234, column 53
    function visible_63 () : java.lang.Boolean {
      return conditionLineHolder.HasErrors
    }
    
    // 'valueVisible' attribute on TypeKeyCell (id=AndOr) at ConditionBuilderLV.pcf: line 82, column 22
    function visible_8 () : java.lang.Boolean {
      return !conditionLineHolder.Line.FirstLine
    }
    
    property get conditionLineHolder () : gw.bizrules.pcf.RuleConditionLineHolder {
      return getIteratedValue(1) as gw.bizrules.pcf.RuleConditionLineHolder
    }
    
    
  }
  
  
}