package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableOtherBenefitsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherBenefitsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 28, column 49
    function sortValue_0 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.ReferenceNumber
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 35, column 40
    function sortValue_1 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 41, column 43
    function sortValue_2 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.StartDate
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 47, column 41
    function sortValue_3 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.EndDate
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 53, column 48
    function sortValue_4 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 59, column 42
    function sortValue_5 (OtherBenefit :  entity.OtherBenefit) : java.lang.Object {
      return OtherBenefit.Comments
    }
    
    // 'toAdd' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 21, column 41
    function toAdd_30 (OtherBenefit :  entity.OtherBenefit) : void {
      Claim.addToOtherBenefits(OtherBenefit)
    }
    
    // 'toRemove' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 21, column 41
    function toRemove_31 (OtherBenefit :  entity.OtherBenefit) : void {
      Claim.removeFromOtherBenefits(OtherBenefit)
    }
    
    // 'value' attribute on RowIterator at EditableOtherBenefitsLV.pcf: line 21, column 41
    function value_32 () : entity.OtherBenefit[] {
      return Claim.OtherBenefits
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOtherBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableOtherBenefitsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableOtherBenefitsLV.pcf: line 35, column 40
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.Amount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableOtherBenefitsLV.pcf: line 41, column 43
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=EndDate) at EditableOtherBenefitsLV.pcf: line 47, column 41
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=InitialContact) at EditableOtherBenefitsLV.pcf: line 53, column 48
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.InitialContact = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Comment) at EditableOtherBenefitsLV.pcf: line 59, column 42
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at EditableOtherBenefitsLV.pcf: line 28, column 49
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherBenefit.ReferenceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at EditableOtherBenefitsLV.pcf: line 28, column 49
    function valueRoot_9 () : java.lang.Object {
      return OtherBenefit
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableOtherBenefitsLV.pcf: line 35, column 40
    function value_10 () : gw.api.financials.CurrencyAmount {
      return OtherBenefit.Amount
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableOtherBenefitsLV.pcf: line 41, column 43
    function value_14 () : java.util.Date {
      return OtherBenefit.StartDate
    }
    
    // 'value' attribute on DateCell (id=EndDate) at EditableOtherBenefitsLV.pcf: line 47, column 41
    function value_18 () : java.util.Date {
      return OtherBenefit.EndDate
    }
    
    // 'value' attribute on TextCell (id=InitialContact) at EditableOtherBenefitsLV.pcf: line 53, column 48
    function value_22 () : java.lang.String {
      return OtherBenefit.InitialContact
    }
    
    // 'value' attribute on TextCell (id=Comment) at EditableOtherBenefitsLV.pcf: line 59, column 42
    function value_26 () : java.lang.String {
      return OtherBenefit.Comments
    }
    
    // 'value' attribute on TextCell (id=ReferenceNumber) at EditableOtherBenefitsLV.pcf: line 28, column 49
    function value_6 () : java.lang.String {
      return OtherBenefit.ReferenceNumber
    }
    
    property get OtherBenefit () : entity.OtherBenefit {
      return getIteratedValue(1) as entity.OtherBenefit
    }
    
    
  }
  
  
}