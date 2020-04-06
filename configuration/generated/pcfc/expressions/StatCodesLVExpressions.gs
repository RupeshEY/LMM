package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/StatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatCodesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/StatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StatCodesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at StatCodesLV.pcf: line 32, column 42
    function valueRoot_12 () : java.lang.Object {
      return StatCode
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at StatCodesLV.pcf: line 32, column 42
    function value_10 () : java.lang.Integer {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceLine) at StatCodesLV.pcf: line 38, column 46
    function value_13 () : typekey.InsuranceLine {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceSubLine) at StatCodesLV.pcf: line 44, column 49
    function value_16 () : typekey.InsuranceSubLine {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on TextCell (id=LocationNumber) at StatCodesLV.pcf: line 49, column 44
    function value_19 () : java.lang.String {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at StatCodesLV.pcf: line 54, column 44
    function value_22 () : java.lang.String {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at StatCodesLV.pcf: line 59, column 43
    function value_25 () : java.lang.String {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at StatCodesLV.pcf: line 64, column 39
    function value_28 () : java.lang.String {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on TypeKeyCell (id=MajorPeril) at StatCodesLV.pcf: line 70, column 44
    function value_31 () : typekey.MajorPerils {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at StatCodesLV.pcf: line 76, column 38
    function value_34 () : typekey.State {
      return StatCode.State
    }
    
    // 'value' attribute on TextCell (id=Notes) at StatCodesLV.pcf: line 81, column 35
    function value_37 () : java.lang.String {
      return StatCode.Notes
    }
    
    property get StatCode () : entity.StatCode {
      return getIteratedValue(1) as entity.StatCode
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/StatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatCodesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 32, column 42
    function sortValue_0 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 38, column 46
    function sortValue_1 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 44, column 49
    function sortValue_2 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 49, column 44
    function sortValue_3 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 54, column 44
    function sortValue_4 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 59, column 43
    function sortValue_5 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 64, column 39
    function sortValue_6 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 70, column 44
    function sortValue_7 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 76, column 38
    function sortValue_8 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.State
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 81, column 35
    function sortValue_9 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.Notes
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at StatCodesLV.pcf: line 25, column 37
    function toCreateAndAdd_40 () : entity.StatCode {
      return Claim.Policy.createStatCode()
    }
    
    // 'toRemove' attribute on RowIterator at StatCodesLV.pcf: line 25, column 37
    function toRemove_41 (StatCode :  entity.StatCode) : void {
      Claim.Policy.removeStatCode(StatCode)
    }
    
    // 'value' attribute on RowIterator at StatCodesLV.pcf: line 25, column 37
    function value_42 () : entity.StatCode[] {
      return StatCodeList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get StatCodeList () : StatCode[] {
      return getRequireValue("StatCodeList", 0) as StatCode[]
    }
    
    property set StatCodeList ($arg :  StatCode[]) {
      setRequireValue("StatCodeList", 0, $arg)
    }
    
    
  }
  
  
}