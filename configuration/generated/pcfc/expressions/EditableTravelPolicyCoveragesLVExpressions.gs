package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableTravelPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableTravelPolicyCoveragesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableTravelPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableTravelPolicyCoveragesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'editable' attribute on ListViewPanel (id=EditableTravelPolicyCoveragesLV) at EditableTravelPolicyCoveragesLV.pcf: line 8, column 42
    function editable_42 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 34, column 28
    function sortValue_0 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function sortValue_2 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 57, column 29
    function sortValue_3 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 64, column 29
    function sortValue_4 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 71, column 29
    function sortValue_5 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 77, column 29
    function sortValue_6 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Notes
    }
    
    // 'toAdd' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 22, column 43
    function toAdd_39 (PolicyCoverage :  entity.PolicyCoverage) : void {
      Policy.addCoverage(PolicyCoverage)
    }
    
    // 'toRemove' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 22, column 43
    function toRemove_40 (PolicyCoverage :  entity.PolicyCoverage) : void {
      Policy.removeCoverage(PolicyCoverage)
    }
    
    // 'value' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 22, column 43
    function value_41 () : entity.PolicyCoverage[] {
      return Policy.Coverages
    }
    
    // 'visible' attribute on RowIterator at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function visible_1 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableTravelPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableTravelPolicyCoveragesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditableTravelPolicyCoveragesLV.pcf: line 57, column 29
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Deductible = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditableTravelPolicyCoveragesLV.pcf: line 64, column 29
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.ExposureLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditableTravelPolicyCoveragesLV.pcf: line 71, column 29
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.IncidentLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableTravelPolicyCoveragesLV.pcf: line 77, column 29
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTravelPolicyCoveragesLV.pcf: line 34, column 28
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Type = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'editable' attribute on TypeKeyCell (id=Currency) at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function editable_11 () : java.lang.Boolean {
      return PolicyCoverage.allowCurrencyChange()
    }
    
    // 'editable' attribute on Row at EditableTravelPolicyCoveragesLV.pcf: line 24, column 37
    function editable_38 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'validationExpression' attribute on TypeKeyCell (id=Currency) at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function validationExpression_12 () : java.lang.Object {
      return util.PolicyUI.handleCoverageCurrencyUpdate(PolicyCoverage)
    }
    
    // 'validationExpression' attribute on CurrencyCell (id=Deductible) at EditableTravelPolicyCoveragesLV.pcf: line 57, column 29
    function validationExpression_20 () : java.lang.Object {
      return util.PolicyUI.handleCoverageDeductibleUpdate(PolicyCoverage)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTravelPolicyCoveragesLV.pcf: line 34, column 28
    function valueRoot_10 () : java.lang.Object {
      return PolicyCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function value_14 () : typekey.Currency {
      return PolicyCoverage.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditableTravelPolicyCoveragesLV.pcf: line 57, column 29
    function value_21 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.Deductible
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditableTravelPolicyCoveragesLV.pcf: line 64, column 29
    function value_26 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.ExposureLimit
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditableTravelPolicyCoveragesLV.pcf: line 71, column 29
    function value_30 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableTravelPolicyCoveragesLV.pcf: line 77, column 29
    function value_34 () : java.lang.String {
      return PolicyCoverage.Notes
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTravelPolicyCoveragesLV.pcf: line 34, column 28
    function value_7 () : typekey.CoverageType {
      return PolicyCoverage.Type
    }
    
    // 'visible' attribute on TypeKeyCell (id=Currency) at EditableTravelPolicyCoveragesLV.pcf: line 47, column 64
    function visible_13 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get PolicyCoverage () : entity.PolicyCoverage {
      return getIteratedValue(1) as entity.PolicyCoverage
    }
    
    
  }
  
  
}