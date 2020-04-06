package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLossCausesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceThresholdLossCausesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLossCausesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceThresholdLossCausesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause) at ReinsuranceThresholdLossCausesLV.pcf: line 28, column 42
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      LossCause.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause) at ReinsuranceThresholdLossCausesLV.pcf: line 28, column 42
    function valueRoot_4 () : java.lang.Object {
      return LossCause
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause) at ReinsuranceThresholdLossCausesLV.pcf: line 28, column 42
    function value_1 () : typekey.LossCause {
      return LossCause.LossCause
    }
    
    property get LossCause () : entity.ReinsuranceLossCause {
      return getIteratedValue(1) as entity.ReinsuranceLossCause
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLossCausesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdLossCausesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLossCausesLV.pcf: line 28, column 42
    function sortValue_0 (LossCause :  entity.ReinsuranceLossCause) : java.lang.Object {
      return LossCause.LossCause
    }
    
    // 'toAdd' attribute on RowIterator at ReinsuranceThresholdLossCausesLV.pcf: line 20, column 49
    function toAdd_5 (LossCause :  entity.ReinsuranceLossCause) : void {
      ReinsuranceThreshold.addToLossCauses( LossCause )
    }
    
    // 'toRemove' attribute on RowIterator at ReinsuranceThresholdLossCausesLV.pcf: line 20, column 49
    function toRemove_6 (LossCause :  entity.ReinsuranceLossCause) : void {
      ReinsuranceThreshold.removeFromLossCauses( LossCause )
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLossCausesLV.pcf: line 20, column 49
    function value_7 () : entity.ReinsuranceLossCause[] {
      return ReinsuranceThreshold.LossCauses
    }
    
    property get ReinsuranceThreshold () : ReinsuranceThreshold {
      return getRequireValue("ReinsuranceThreshold", 0) as ReinsuranceThreshold
    }
    
    property set ReinsuranceThreshold ($arg :  ReinsuranceThreshold) {
      setRequireValue("ReinsuranceThreshold", 0, $arg)
    }
    
    
  }
  
  
}