package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditablePropertyPolicyCoveragesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePropertyPolicyCoveragesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'editable' attribute on ListViewPanel (id=EditablePropertyPolicyCoveragesLV) at EditablePropertyPolicyCoveragesLV.pcf: line 8, column 44
    function editable_38 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 32, column 44
    function sortValue_0 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
    function sortValue_2 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 51, column 46
    function sortValue_3 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 57, column 49
    function sortValue_4 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 63, column 49
    function sortValue_5 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 68, column 41
    function sortValue_6 (PolicyCoverage :  entity.PolicyCoverage) : java.lang.Object {
      return PolicyCoverage.Notes
    }
    
    // 'toAdd' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 22, column 43
    function toAdd_35 (PolicyCoverage :  entity.PolicyCoverage) : void {
      Policy.addCoverage(PolicyCoverage)
    }
    
    // 'toRemove' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 22, column 43
    function toRemove_36 (PolicyCoverage :  entity.PolicyCoverage) : void {
      Policy.removeCoverage(PolicyCoverage)
    }
    
    // 'value' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 22, column 43
    function value_37 () : entity.PolicyCoverage[] {
      return Policy.Coverages
    }
    
    // 'visible' attribute on RowIterator at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
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
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditablePropertyPolicyCoveragesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditablePropertyPolicyCoveragesLV.pcf: line 51, column 46
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Deductible = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditablePropertyPolicyCoveragesLV.pcf: line 57, column 49
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.ExposureLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditablePropertyPolicyCoveragesLV.pcf: line 63, column 49
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.IncidentLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditablePropertyPolicyCoveragesLV.pcf: line 68, column 41
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyPolicyCoveragesLV.pcf: line 32, column 44
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyCoverage.Type = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'editable' attribute on TypeKeyCell (id=Currency) at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
    function editable_11 () : java.lang.Boolean {
      return PolicyCoverage.allowCurrencyChange()
    }
    
    // 'editable' attribute on Row at EditablePropertyPolicyCoveragesLV.pcf: line 24, column 37
    function editable_34 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyPolicyCoveragesLV.pcf: line 32, column 44
    function valueRoot_10 () : java.lang.Object {
      return PolicyCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
    function value_13 () : typekey.Currency {
      return PolicyCoverage.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditablePropertyPolicyCoveragesLV.pcf: line 51, column 46
    function value_18 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.Deductible
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditablePropertyPolicyCoveragesLV.pcf: line 57, column 49
    function value_22 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.ExposureLimit
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditablePropertyPolicyCoveragesLV.pcf: line 63, column 49
    function value_26 () : gw.api.financials.CurrencyAmount {
      return PolicyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditablePropertyPolicyCoveragesLV.pcf: line 68, column 41
    function value_30 () : java.lang.String {
      return PolicyCoverage.Notes
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyPolicyCoveragesLV.pcf: line 32, column 44
    function value_7 () : typekey.CoverageType {
      return PolicyCoverage.Type
    }
    
    // 'visible' attribute on TypeKeyCell (id=Currency) at EditablePropertyPolicyCoveragesLV.pcf: line 43, column 64
    function visible_12 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get PolicyCoverage () : entity.PolicyCoverage {
      return getIteratedValue(1) as entity.PolicyCoverage
    }
    
    
  }
  
  
}