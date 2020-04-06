package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandParameterInputSet_nestedExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.nested.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandParameterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=PopupLink) at CommandParameterInputSet.nested.pcf: line 33, column 25
    function action_4 () : void {
      inputConfig.pushPopupFromCommandParameter(parameterHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.nested.pcf: line 41, column 61
    function def_onEnter_10 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.nested.pcf: line 41, column 61
    function def_refreshVariables_11 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'initialValue' attribute on Variable at CommandParameterInputSet.nested.pcf: line 15, column 49
    function initialValue_0 () : gw.bizrules.pcf.NestedInputConfig {
      return parameterHolder.FragHolder as gw.bizrules.pcf.NestedInputConfig
    }
    
    // 'label' attribute on Link (id=Label) at CommandParameterInputSet.nested.pcf: line 23, column 45
    function label_2 () : java.lang.Object {
      return inputConfig.CommandParameterLabel
    }
    
    // 'label' attribute on Link (id=PopupLink) at CommandParameterInputSet.nested.pcf: line 33, column 25
    function label_5 () : java.lang.Object {
      return inputConfig.PopupLinkLabel
    }
    
    // 'label' attribute on ContentInput (id=LabelAndLink) at CommandParameterInputSet.nested.pcf: line 19, column 46
    function label_6 () : java.lang.Object {
      return parameterHolder.ParameterLabel
    }
    
    // 'value' attribute on TextInput (id=NestedText) at CommandParameterInputSet.nested.pcf: line 39, column 47
    function valueRoot_14 () : java.lang.Object {
      return inputConfig
    }
    
    // 'value' attribute on TextInput (id=NestedText) at CommandParameterInputSet.nested.pcf: line 39, column 47
    function value_9 () : java.lang.String {
      return inputConfig.NestedText
    }
    
    // 'visible' attribute on Link (id=Label) at CommandParameterInputSet.nested.pcf: line 23, column 45
    function visible_1 () : java.lang.Boolean {
      return inputConfig.LabelVisible
    }
    
    // 'visible' attribute on TextInput (id=NestedText) at CommandParameterInputSet.nested.pcf: line 39, column 47
    function visible_8 () : java.lang.Boolean {
      return inputConfig.NestedTextVisible
    }
    
    property get inputConfig () : gw.bizrules.pcf.NestedInputConfig {
      return getVariableValue("inputConfig", 0) as gw.bizrules.pcf.NestedInputConfig
    }
    
    property set inputConfig ($arg :  gw.bizrules.pcf.NestedInputConfig) {
      setVariableValue("inputConfig", 0, $arg)
    }
    
    property get parameterHolder () : gw.bizrules.pcf.RuleCommandParameterHolder {
      return getRequireValue("parameterHolder", 0) as gw.bizrules.pcf.RuleCommandParameterHolder
    }
    
    property set parameterHolder ($arg :  gw.bizrules.pcf.RuleCommandParameterHolder) {
      setRequireValue("parameterHolder", 0, $arg)
    }
    
    
  }
  
  
}