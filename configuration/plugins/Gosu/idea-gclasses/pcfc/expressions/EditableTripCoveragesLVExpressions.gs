package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableTripCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableTripCoveragesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableTripCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableTripCoveragesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 30, column 44
    function sortValue_0 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.Type
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 41, column 64
    function sortValue_2 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.Currency
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 49, column 44
    function sortValue_3 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 55, column 47
    function sortValue_4 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 61, column 47
    function sortValue_5 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 67, column 48
    function sortValue_6 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.LimitsIndicator
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 72, column 39
    function sortValue_7 (TripCoverage :  entity.RUCoverage) : java.lang.Object {
      return TripCoverage.Notes
    }
    
    // 'toAdd' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 21, column 39
    function toAdd_39 (TripCoverage :  entity.RUCoverage) : void {
      aTripRU.addToCoverages(TripCoverage)
    }
    
    // 'toRemove' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 21, column 39
    function toRemove_40 (TripCoverage :  entity.RUCoverage) : void {
      aTripRU.removeFromCoverages(TripCoverage)
    }
    
    // 'value' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 21, column 39
    function value_41 () : entity.RUCoverage[] {
      return aTripRU.Coverages
    }
    
    // 'visible' attribute on RowIterator at EditableTripCoveragesLV.pcf: line 41, column 64
    function visible_1 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get aTripRU () : TripRU {
      return getRequireValue("aTripRU", 0) as TripRU
    }
    
    property set aTripRU ($arg :  TripRU) {
      setRequireValue("aTripRU", 0, $arg)
    }
    
    
    /*
    function getTripRU(selectedRow : Bean) : TripRU
    {
      if(selectedRow typeis TripAccommodation)
          return (selectedRow as TripAccommodation).TripRiskUnit
      if(selectedRow typeis TripSegment)
          return (selectedRow as TripSegment).TripRiskUnit
        return new TripRU()
    }*/
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EditableTripCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableTripCoveragesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTripCoveragesLV.pcf: line 30, column 44
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.Type = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableTripCoveragesLV.pcf: line 41, column 64
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditableTripCoveragesLV.pcf: line 49, column 44
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.Deductible = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditableTripCoveragesLV.pcf: line 55, column 47
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.ExposureLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditableTripCoveragesLV.pcf: line 61, column 47
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.IncidentLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitsIndicator) at EditableTripCoveragesLV.pcf: line 67, column 48
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.LimitsIndicator = (__VALUE_TO_SET as typekey.LimitsIndicator)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableTripCoveragesLV.pcf: line 72, column 39
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      TripCoverage.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TypeKeyCell (id=Currency) at EditableTripCoveragesLV.pcf: line 41, column 64
    function editable_12 () : java.lang.Boolean {
      return TripCoverage.allowCurrencyChange()
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTripCoveragesLV.pcf: line 30, column 44
    function valueRoot_11 () : java.lang.Object {
      return TripCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableTripCoveragesLV.pcf: line 41, column 64
    function value_14 () : typekey.Currency {
      return TripCoverage.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=Deductible) at EditableTripCoveragesLV.pcf: line 49, column 44
    function value_19 () : gw.api.financials.CurrencyAmount {
      return TripCoverage.Deductible
    }
    
    // 'value' attribute on CurrencyCell (id=ExposureLimit) at EditableTripCoveragesLV.pcf: line 55, column 47
    function value_23 () : gw.api.financials.CurrencyAmount {
      return TripCoverage.ExposureLimit
    }
    
    // 'value' attribute on CurrencyCell (id=IncidentLimit) at EditableTripCoveragesLV.pcf: line 61, column 47
    function value_27 () : gw.api.financials.CurrencyAmount {
      return TripCoverage.IncidentLimit
    }
    
    // 'value' attribute on TypeKeyCell (id=LimitsIndicator) at EditableTripCoveragesLV.pcf: line 67, column 48
    function value_31 () : typekey.LimitsIndicator {
      return TripCoverage.LimitsIndicator
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableTripCoveragesLV.pcf: line 72, column 39
    function value_35 () : java.lang.String {
      return TripCoverage.Notes
    }
    
    // 'value' attribute on TypeKeyCell (id=CoverageType) at EditableTripCoveragesLV.pcf: line 30, column 44
    function value_8 () : typekey.CoverageType {
      return TripCoverage.Type
    }
    
    // 'visible' attribute on TypeKeyCell (id=Currency) at EditableTripCoveragesLV.pcf: line 41, column 64
    function visible_13 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    property get TripCoverage () : entity.RUCoverage {
      return getIteratedValue(1) as entity.RUCoverage
    }
    
    
  }
  
  
}