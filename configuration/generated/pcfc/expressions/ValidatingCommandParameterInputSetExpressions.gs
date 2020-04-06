package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidatingCommandParameterInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ValidatingCommandParameterInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ValidatingCommandParameterInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidatingCommandParameterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_1 (def :  pcf.CommandParameterInputSet_bool) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_11 (def :  pcf.CommandParameterInputSet_typekey) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 18, column 74
    function def_onEnter_14 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(parameterHolder.validate(), false)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_3 (def :  pcf.CommandParameterInputSet_date) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_5 (def :  pcf.CommandParameterInputSet_formula) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_7 (def :  pcf.CommandParameterInputSet_nested) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_onEnter_9 (def :  pcf.CommandParameterInputSet_template) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_10 (def :  pcf.CommandParameterInputSet_template) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_12 (def :  pcf.CommandParameterInputSet_typekey) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 18, column 74
    function def_refreshVariables_15 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(parameterHolder.validate(), false)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_2 (def :  pcf.CommandParameterInputSet_bool) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_4 (def :  pcf.CommandParameterInputSet_date) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_6 (def :  pcf.CommandParameterInputSet_formula) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'def' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function def_refreshVariables_8 (def :  pcf.CommandParameterInputSet_nested) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'initialValue' attribute on Variable at ValidatingCommandParameterInputSet.pcf: line 13, column 56
    function initialValue_0 () : gw.bizrules.pcf.ExpressionFragmentHolder {
      return parameterHolder.FragHolder
    }
    
    // 'mode' attribute on InputSetRef at ValidatingCommandParameterInputSet.pcf: line 16, column 39
    function mode_13 () : java.lang.Object {
      return parameterHolder.PCFMode
    }
    
    property get fragHolder () : gw.bizrules.pcf.ExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.ExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.ExpressionFragmentHolder) {
      setVariableValue("fragHolder", 0, $arg)
    }
    
    property get parameterHolder () : gw.bizrules.pcf.RuleCommandParameterHolder {
      return getRequireValue("parameterHolder", 0) as gw.bizrules.pcf.RuleCommandParameterHolder
    }
    
    property set parameterHolder ($arg :  gw.bizrules.pcf.RuleCommandParameterHolder) {
      setRequireValue("parameterHolder", 0, $arg)
    }
    
    
  }
  
  
}