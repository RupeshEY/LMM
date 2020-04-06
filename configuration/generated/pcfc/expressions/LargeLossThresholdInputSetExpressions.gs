package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/keymetrics/LargeLossThresholdInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LargeLossThresholdInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/LargeLossThresholdInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LargeLossThresholdInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ClaimCenterThreshold) at LargeLossThresholdInputSet.pcf: line 23, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ccThreshold.ThresholdValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=PolicySystemThreshold) at LargeLossThresholdInputSet.pcf: line 31, column 98
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      psThreshold.ThresholdValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=ClaimCenterThreshold) at LargeLossThresholdInputSet.pcf: line 23, column 43
    function valueRoot_3 () : java.lang.Object {
      return ccThreshold
    }
    
    // 'value' attribute on TextInput (id=PolicySystemThreshold) at LargeLossThresholdInputSet.pcf: line 31, column 98
    function valueRoot_9 () : java.lang.Object {
      return psThreshold
    }
    
    // 'value' attribute on TextInput (id=ClaimCenterThreshold) at LargeLossThresholdInputSet.pcf: line 23, column 43
    function value_0 () : java.math.BigDecimal {
      return ccThreshold.ThresholdValue
    }
    
    // 'value' attribute on TextInput (id=PolicySystemThreshold) at LargeLossThresholdInputSet.pcf: line 31, column 98
    function value_5 () : java.math.BigDecimal {
      return psThreshold.ThresholdValue
    }
    
    // 'visible' attribute on TextInput (id=PolicySystemThreshold) at LargeLossThresholdInputSet.pcf: line 31, column 98
    function visible_4 () : java.lang.Boolean {
      return gw.plugin.Plugins.isEnabled(gw.plugin.policy.IPolicySystemNotificationPlugin)
    }
    
    property get ccThreshold () : LargeLossThreshold {
      return getRequireValue("ccThreshold", 0) as LargeLossThreshold
    }
    
    property set ccThreshold ($arg :  LargeLossThreshold) {
      setRequireValue("ccThreshold", 0, $arg)
    }
    
    property get policyType () : PolicyType {
      return getRequireValue("policyType", 0) as PolicyType
    }
    
    property set policyType ($arg :  PolicyType) {
      setRequireValue("policyType", 0, $arg)
    }
    
    property get psThreshold () : LargeLossThreshold {
      return getRequireValue("psThreshold", 0) as LargeLossThreshold
    }
    
    property set psThreshold ($arg :  LargeLossThreshold) {
      setRequireValue("psThreshold", 0, $arg)
    }
    
    
  }
  
  
}