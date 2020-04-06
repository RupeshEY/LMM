package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.bool.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandParameterInputSet_boolExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.bool.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandParameterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.bool.pcf: line 22, column 61
    function def_onEnter_3 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.bool.pcf: line 22, column 61
    function def_refreshVariables_4 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'value' attribute on BooleanRadioInput (id=BooleanValue) at CommandParameterInputSet.bool.pcf: line 20, column 32
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.Value = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at CommandParameterInputSet.bool.pcf: line 15, column 63
    function initialValue_0 () : gw.bizrules.pcf.BooleanExpressionFragmentHolder {
      return parameterHolder.FragHolder as gw.bizrules.pcf.BooleanExpressionFragmentHolder
    }
    
    // 'label' attribute on BooleanRadioInput (id=BooleanValue) at CommandParameterInputSet.bool.pcf: line 20, column 32
    function label_1 () : java.lang.Object {
      return parameterHolder.ParameterLabel
    }
    
    // 'value' attribute on BooleanRadioInput (id=BooleanValue) at CommandParameterInputSet.bool.pcf: line 20, column 32
    function valueRoot_8 () : java.lang.Object {
      return fragHolder
    }
    
    // 'value' attribute on BooleanRadioInput (id=BooleanValue) at CommandParameterInputSet.bool.pcf: line 20, column 32
    function value_2 () : java.lang.Boolean {
      return fragHolder.Value
    }
    
    property get fragHolder () : gw.bizrules.pcf.BooleanExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.BooleanExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.BooleanExpressionFragmentHolder) {
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