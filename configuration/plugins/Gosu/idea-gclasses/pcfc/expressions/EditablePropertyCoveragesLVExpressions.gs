package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditablePropertyCoveragesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePropertyCoveragesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 33, column 44
    function sortValue_0 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function sortValue_2 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 52, column 48
    function sortValue_3 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 58, column 51
    function sortValue_4 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 64, column 51
    function sortValue_5 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 70, column 45
    function sortValue_6 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 76, column 46
    function sortValue_7 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 82, column 48
    function sortValue_8 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 87, column 43
    function sortValue_9 (PropertyCoverage :  entity.PropertyCoverage) : java.lang.Object {
      return PropertyCoverage.Notes
    }
    
    // 'toAdd' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 24, column 45
    function toAdd_49 (PropertyCoverage :  entity.PropertyCoverage) : void {
      LocationBasedRU.addToCoverages(PropertyCoverage)
    }
    
    // 'toRemove' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 24, column 45
    function toRemove_50 (PropertyCoverage :  entity.PropertyCoverage) : void {
      LocationBasedRU.removeFromCoverages(PropertyCoverage)
    }
    
    // 'value' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 24, column 45
    function value_51 () : entity.PropertyCoverage[] {
      return LocationBasedRU.Coverages.cast(PropertyCoverage)
    }
    
    // 'visible' attribute on RowIterator at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function visible_1 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get LocationBasedRU () : LocationBasedRU {
      return getRequireValue("LocationBasedRU", 0) as LocationBasedRU
    }
    
    property set LocationBasedRU ($arg :  LocationBasedRU) {
      setRequireValue("LocationBasedRU", 0, $arg)
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getRequireValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setRequireValue("PolicyLocation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditablePropertyCoveragesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyCoveragesLV.pcf: line 33, column 44
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.Type = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditablePropertyCoveragesLV.pcf: line 52, column 48
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.Deductible = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditablePropertyCoveragesLV.pcf: line 58, column 51
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.ExposureLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditablePropertyCoveragesLV.pcf: line 64, column 51
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.IncidentLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at EditablePropertyCoveragesLV.pcf: line 70, column 45
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.Coinsurance = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageBasis) at EditablePropertyCoveragesLV.pcf: line 76, column 46
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.CoverageBasis = (__VALUE_TO_SET as typekey.CoverageBasis)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitsIndicator) at EditablePropertyCoveragesLV.pcf: line 82, column 48
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.LimitsIndicator = (__VALUE_TO_SET as typekey.LimitsIndicator)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditablePropertyCoveragesLV.pcf: line 87, column 43
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      PropertyCoverage.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TypeKeyCell (id=Currency) at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function editable_14 () : java.lang.Boolean {
      return PropertyCoverage.allowCurrencyChange()
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyCoveragesLV.pcf: line 33, column 44
    function valueRoot_13 () : java.lang.Object {
      return PropertyCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditablePropertyCoveragesLV.pcf: line 33, column 44
    function value_10 () : typekey.CoverageType {
      return PropertyCoverage.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function value_16 () : typekey.Currency {
      return PropertyCoverage.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditablePropertyCoveragesLV.pcf: line 52, column 48
    function value_21 () : gw.api.financials.CurrencyAmount {
      return PropertyCoverage.Deductible
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditablePropertyCoveragesLV.pcf: line 58, column 51
    function value_25 () : gw.api.financials.CurrencyAmount {
      return PropertyCoverage.ExposureLimit
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditablePropertyCoveragesLV.pcf: line 64, column 51
    function value_29 () : gw.api.financials.CurrencyAmount {
      return PropertyCoverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Coinsurance) at EditablePropertyCoveragesLV.pcf: line 70, column 45
    function value_33 () : java.math.BigDecimal {
      return PropertyCoverage.Coinsurance
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageBasis) at EditablePropertyCoveragesLV.pcf: line 76, column 46
    function value_37 () : typekey.CoverageBasis {
      return PropertyCoverage.CoverageBasis
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitsIndicator) at EditablePropertyCoveragesLV.pcf: line 82, column 48
    function value_41 () : typekey.LimitsIndicator {
      return PropertyCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditablePropertyCoveragesLV.pcf: line 87, column 43
    function value_45 () : java.lang.String {
      return PropertyCoverage.Notes
    }
    
    // 'visible' attribute on TypeKeyCell (id=Currency) at EditablePropertyCoveragesLV.pcf: line 44, column 64
    function visible_15 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get PropertyCoverage () : entity.PropertyCoverage {
      return getIteratedValue(1) as entity.PropertyCoverage
    }
    
    
  }
  
  
}