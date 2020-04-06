package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.typekey.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandParameterInputSet_typekeyExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandParameterInputSet.typekey.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandParameterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.typekey.pcf: line 25, column 61
    function def_onEnter_3 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.onEnter(parameterHolder)
    }
    
    // 'def' attribute on MenuItemSetRef at CommandParameterInputSet.typekey.pcf: line 25, column 61
    function def_refreshVariables_4 (def :  pcf.CommandParameterMenuItemSet) : void {
      def.refreshVariables(parameterHolder)
    }
    
    // 'value' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.Value = (__VALUE_TO_SET as gw.entity.TypeKey)
    }
    
    // 'initialValue' attribute on Variable at CommandParameterInputSet.typekey.pcf: line 15, column 63
    function initialValue_0 () : gw.bizrules.pcf.TypekeyExpressionFragmentHolder {
      return parameterHolder.FragHolder as gw.bizrules.pcf.TypekeyExpressionFragmentHolder
    }
    
    // 'label' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function label_1 () : java.lang.Object {
      return parameterHolder.ParameterLabel
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function valueRange_10 () : java.lang.Object {
      return fragHolder.TypeKeyRange
    }
    
    // 'value' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function valueRoot_8 () : java.lang.Object {
      return fragHolder
    }
    
    // 'valueWidth' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function valueWidth_9 () : java.lang.Integer {
      return parameterHolder.UIConfig.ValueWidth
    }
    
    // 'value' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function value_2 () : gw.entity.TypeKey {
      return fragHolder.Value
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.entity.TypeKey[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeKey) at CommandParameterInputSet.typekey.pcf: line 23, column 56
    function verifyValueRange_12 () : void {
      var __valueRangeArg = fragHolder.TypeKeyRange
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_11(__valueRangeArg)
    }
    
    property get fragHolder () : gw.bizrules.pcf.TypekeyExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.TypekeyExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.TypekeyExpressionFragmentHolder) {
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