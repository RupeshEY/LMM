package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceThresholdCoveragesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceThresholdCoveragesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at ReinsuranceThresholdCoveragesLV.pcf: line 28, column 45
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Coverage.Coverage = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at ReinsuranceThresholdCoveragesLV.pcf: line 28, column 45
    function valueRoot_4 () : java.lang.Object {
      return Coverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at ReinsuranceThresholdCoveragesLV.pcf: line 28, column 45
    function value_1 () : typekey.CoverageType {
      return Coverage.Coverage
    }
    
    property get Coverage () : entity.ReinsuranceCoverage {
      return getIteratedValue(1) as entity.ReinsuranceCoverage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdCoveragesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdCoveragesLV.pcf: line 28, column 45
    function sortValue_0 (Coverage :  entity.ReinsuranceCoverage) : java.lang.Object {
      return Coverage.Coverage
    }
    
    // 'toAdd' attribute on RowIterator at ReinsuranceThresholdCoveragesLV.pcf: line 20, column 48
    function toAdd_5 (Coverage :  entity.ReinsuranceCoverage) : void {
      ReinsuranceThreshold.addToCoverageTypes( Coverage )
    }
    
    // 'toRemove' attribute on RowIterator at ReinsuranceThresholdCoveragesLV.pcf: line 20, column 48
    function toRemove_6 (Coverage :  entity.ReinsuranceCoverage) : void {
      ReinsuranceThreshold.removeFromCoverageTypes( Coverage )
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdCoveragesLV.pcf: line 20, column 48
    function value_7 () : entity.ReinsuranceCoverage[] {
      return ReinsuranceThreshold.CoverageTypes
    }
    
    property get ReinsuranceThreshold () : ReinsuranceThreshold {
      return getRequireValue("ReinsuranceThreshold", 0) as ReinsuranceThreshold
    }
    
    property set ReinsuranceThreshold ($arg :  ReinsuranceThreshold) {
      setRequireValue("ReinsuranceThreshold", 0, $arg)
    }
    
    
  }
  
  
}