package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.template.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandParameterInputSet_templateExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.template.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandParameterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoComplete' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function autoComplete_12 () : gw.api.contact.AutocompleteHandler {
      return fragHolder.AutocompleteHandler
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.template.pcf: line 29, column 61
    function def_onEnter_3 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.template.pcf: line 29, column 61
    function def_refreshVariables_4 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'value' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.Fragment = (__VALUE_TO_SET as entity.ExpressionFragment)
    }
    
    // 'initialValue' attribute on Variable at CommandParameterInputSet.template.pcf: line 15, column 60
    function initialValue_0 () : gw.bizrules.pcf.TextExpressionFragmentHolder {
      return parameterHolder.FragHolder as gw.bizrules.pcf.TextExpressionFragmentHolder
    }
    
    // 'inputConversion' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function inputConversion_6 (VALUE :  java.lang.String) : java.lang.Object {
      return fragHolder.inputConversion(VALUE)
    }
    
    // 'label' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function label_1 () : java.lang.Object {
      return parameterHolder.ParameterLabel
    }
    
    // 'numCols' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function numCols_7 () : java.lang.Integer {
      return parameterHolder.UIConfig.NumCols
    }
    
    // 'outputConversion' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function outputConversion_8 (VALUE :  entity.ExpressionFragment) : java.lang.String {
      return fragHolder.outputConversion()
    }
    
    // 'value' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function valueRoot_11 () : java.lang.Object {
      return fragHolder
    }
    
    // 'value' attribute on TextInput (id=TemplateExpression) at CommandParameterInputSet.template.pcf: line 26, column 45
    function value_2 () : entity.ExpressionFragment {
      return fragHolder.Fragment
    }
    
    property get fragHolder () : gw.bizrules.pcf.TextExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.TextExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.TextExpressionFragmentHolder) {
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