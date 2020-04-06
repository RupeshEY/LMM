package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionEnabledDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConditionEnabledDVExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ConditionEnabledDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionEnabledDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsConditionDisabled) at ConditionEnabledDV.pcf: line 18, column 46
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragHolder.ConditionDisabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'falseLabel' attribute on BooleanRadioInput (id=IsConditionDisabled) at ConditionEnabledDV.pcf: line 18, column 46
    function falseLabel_4 () : java.lang.Object {
      return fragHolder.getConditionLabel(false)
    }
    
    // 'trueLabel' attribute on BooleanRadioInput (id=IsConditionDisabled) at ConditionEnabledDV.pcf: line 18, column 46
    function trueLabel_5 () : java.lang.Object {
      return fragHolder.getConditionLabel(true)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsConditionDisabled) at ConditionEnabledDV.pcf: line 18, column 46
    function valueRoot_3 () : java.lang.Object {
      return fragHolder
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsConditionDisabled) at ConditionEnabledDV.pcf: line 18, column 46
    function value_0 () : java.lang.Boolean {
      return fragHolder.ConditionDisabled
    }
    
    property get fragHolder () : gw.bizrules.pcf.FilteredIterableExpressionFragmentHolder {
      return getRequireValue("fragHolder", 0) as gw.bizrules.pcf.FilteredIterableExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.FilteredIterableExpressionFragmentHolder) {
      setRequireValue("fragHolder", 0, $arg)
    }
    
    
  }
  
  
}