package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableConcurrentEmploymentLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableConcurrentEmploymentLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 28, column 53
    function sortValue_0 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.CompanyName
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 35, column 51
    function sortValue_1 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.StartDate
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 41, column 49
    function sortValue_2 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.EndDate
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 47, column 50
    function sortValue_3 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.FullTime
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 54, column 52
    function sortValue_4 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.WeeklyWage
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 60, column 50
    function sortValue_5 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.JobTitle
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 67, column 55
    function sortValue_6 (ConcurrentEmployment :  entity.ConcurrentEmployment) : java.lang.Object {
      return ConcurrentEmployment.ContactNumber
    }
    
    // 'toAdd' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 21, column 49
    function toAdd_35 (ConcurrentEmployment :  entity.ConcurrentEmployment) : void {
      Claim.addToConcurrentEmpl(ConcurrentEmployment)
    }
    
    // 'toRemove' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 21, column 49
    function toRemove_36 (ConcurrentEmployment :  entity.ConcurrentEmployment) : void {
      Claim.removeFromConcurrentEmpl(ConcurrentEmployment)
    }
    
    // 'value' attribute on RowIterator at EditableConcurrentEmploymentLV.pcf: line 21, column 49
    function value_37 () : entity.ConcurrentEmployment[] {
      return Claim.ConcurrentEmpl
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableConcurrentEmploymentLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableConcurrentEmploymentLV.pcf: line 35, column 51
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=EndDate) at EditableConcurrentEmploymentLV.pcf: line 41, column 49
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioCell (id=FullTime) at EditableConcurrentEmploymentLV.pcf: line 47, column 50
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.FullTime = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyCell (id=WeeklyWage) at EditableConcurrentEmploymentLV.pcf: line 54, column 52
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.WeeklyWage = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at EditableConcurrentEmploymentLV.pcf: line 60, column 50
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.JobTitle = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ContactNumber) at EditableConcurrentEmploymentLV.pcf: line 67, column 55
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.ContactNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at EditableConcurrentEmploymentLV.pcf: line 28, column 53
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ConcurrentEmployment.CompanyName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at EditableConcurrentEmploymentLV.pcf: line 28, column 53
    function valueRoot_10 () : java.lang.Object {
      return ConcurrentEmployment
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableConcurrentEmploymentLV.pcf: line 35, column 51
    function value_11 () : java.util.Date {
      return ConcurrentEmployment.StartDate
    }
    
    // 'value' attribute on DateCell (id=EndDate) at EditableConcurrentEmploymentLV.pcf: line 41, column 49
    function value_15 () : java.util.Date {
      return ConcurrentEmployment.EndDate
    }
    
    // 'value' attribute on BooleanRadioCell (id=FullTime) at EditableConcurrentEmploymentLV.pcf: line 47, column 50
    function value_19 () : java.lang.Boolean {
      return ConcurrentEmployment.FullTime
    }
    
    // 'value' attribute on CurrencyCell (id=WeeklyWage) at EditableConcurrentEmploymentLV.pcf: line 54, column 52
    function value_23 () : gw.api.financials.CurrencyAmount {
      return ConcurrentEmployment.WeeklyWage
    }
    
    // 'value' attribute on TextCell (id=JobTitle) at EditableConcurrentEmploymentLV.pcf: line 60, column 50
    function value_27 () : java.lang.String {
      return ConcurrentEmployment.JobTitle
    }
    
    // 'value' attribute on TextCell (id=ContactNumber) at EditableConcurrentEmploymentLV.pcf: line 67, column 55
    function value_31 () : java.lang.String {
      return ConcurrentEmployment.ContactNumber
    }
    
    // 'value' attribute on TextCell (id=CompanyName) at EditableConcurrentEmploymentLV.pcf: line 28, column 53
    function value_7 () : java.lang.String {
      return ConcurrentEmployment.CompanyName
    }
    
    property get ConcurrentEmployment () : entity.ConcurrentEmployment {
      return getIteratedValue(1) as entity.ConcurrentEmployment
    }
    
    
  }
  
  
}