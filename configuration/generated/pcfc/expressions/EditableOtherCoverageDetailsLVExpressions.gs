package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableOtherCoverageDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableOtherCoverageDetailsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableOtherCoverageDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 29, column 48
    function sortValue_0 (OtherCoverageDetail :  entity.OtherCoverageDetail) : java.lang.Object {
      return OtherCoverageDetail.Insurer
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 34, column 53
    function sortValue_1 (OtherCoverageDetail :  entity.OtherCoverageDetail) : java.lang.Object {
      return OtherCoverageDetail.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 39, column 52
    function sortValue_2 (OtherCoverageDetail :  entity.OtherCoverageDetail) : java.lang.Object {
      return OtherCoverageDetail.ContactName
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 44, column 53
    function sortValue_3 (OtherCoverageDetail :  entity.OtherCoverageDetail) : java.lang.Object {
      return OtherCoverageDetail.ContactPhone
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 49, column 46
    function sortValue_4 (OtherCoverageDetail :  entity.OtherCoverageDetail) : java.lang.Object {
      return OtherCoverageDetail.Notes
    }
    
    // 'toAdd' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 21, column 48
    function toAdd_25 (OtherCoverageDetail :  entity.OtherCoverageDetail) : void {
      Exposure.addToOtherCoverageDet(OtherCoverageDetail)
    }
    
    // 'toRemove' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 21, column 48
    function toRemove_26 (OtherCoverageDetail :  entity.OtherCoverageDetail) : void {
      Exposure.removeFromOtherCoverageDet(OtherCoverageDetail)
    }
    
    // 'value' attribute on RowIterator at EditableOtherCoverageDetailsLV.pcf: line 21, column 48
    function value_27 () : entity.OtherCoverageDetail[] {
      return Exposure.OtherCoverageDet
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableOtherCoverageDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableOtherCoverageDetailsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at EditableOtherCoverageDetailsLV.pcf: line 34, column 53
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherCoverageDetail.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ContactName) at EditableOtherCoverageDetailsLV.pcf: line 39, column 52
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherCoverageDetail.ContactName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at EditableOtherCoverageDetailsLV.pcf: line 44, column 53
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherCoverageDetail.ContactPhone = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableOtherCoverageDetailsLV.pcf: line 49, column 46
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherCoverageDetail.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at EditableOtherCoverageDetailsLV.pcf: line 29, column 48
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      OtherCoverageDetail.Insurer = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at EditableOtherCoverageDetailsLV.pcf: line 29, column 48
    function valueRoot_8 () : java.lang.Object {
      return OtherCoverageDetail
    }
    
    // 'value' attribute on TextCell (id=ContactName) at EditableOtherCoverageDetailsLV.pcf: line 39, column 52
    function value_13 () : java.lang.String {
      return OtherCoverageDetail.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at EditableOtherCoverageDetailsLV.pcf: line 44, column 53
    function value_17 () : java.lang.String {
      return OtherCoverageDetail.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableOtherCoverageDetailsLV.pcf: line 49, column 46
    function value_21 () : java.lang.String {
      return OtherCoverageDetail.Notes
    }
    
    // 'value' attribute on TextCell (id=Insurer) at EditableOtherCoverageDetailsLV.pcf: line 29, column 48
    function value_5 () : java.lang.String {
      return OtherCoverageDetail.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at EditableOtherCoverageDetailsLV.pcf: line 34, column 53
    function value_9 () : java.lang.String {
      return OtherCoverageDetail.PolicyNumber
    }
    
    property get OtherCoverageDetail () : entity.OtherCoverageDetail {
      return getIteratedValue(1) as entity.OtherCoverageDetail
    }
    
    
  }
  
  
}