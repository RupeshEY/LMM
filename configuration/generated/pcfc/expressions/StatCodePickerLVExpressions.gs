package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/StatCodePickerLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatCodePickerLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/policy/StatCodePickerLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StatCodePickerLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at StatCodePickerLV.pcf: line 16, column 37
    function pickValue_40 () : StatCode {
      return StatCode
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at StatCodePickerLV.pcf: line 23, column 42
    function valueRoot_12 () : java.lang.Object {
      return StatCode
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at StatCodePickerLV.pcf: line 23, column 42
    function value_10 () : java.lang.Integer {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceLine) at StatCodePickerLV.pcf: line 29, column 46
    function value_13 () : typekey.InsuranceLine {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceSubLine) at StatCodePickerLV.pcf: line 35, column 49
    function value_16 () : typekey.InsuranceSubLine {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on TextCell (id=LocationNumber) at StatCodePickerLV.pcf: line 40, column 44
    function value_19 () : java.lang.String {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at StatCodePickerLV.pcf: line 45, column 44
    function value_22 () : java.lang.String {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at StatCodePickerLV.pcf: line 50, column 43
    function value_25 () : java.lang.String {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at StatCodePickerLV.pcf: line 55, column 39
    function value_28 () : java.lang.String {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on TypeKeyCell (id=MajorPeril) at StatCodePickerLV.pcf: line 61, column 44
    function value_31 () : typekey.MajorPerils {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at StatCodePickerLV.pcf: line 67, column 38
    function value_34 () : typekey.State {
      return StatCode.State
    }
    
    // 'value' attribute on TextCell (id=Notes) at StatCodePickerLV.pcf: line 72, column 35
    function value_37 () : java.lang.String {
      return StatCode.Notes
    }
    
    property get StatCode () : entity.StatCode {
      return getIteratedValue(1) as entity.StatCode
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/policy/StatCodePickerLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatCodePickerLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 23, column 42
    function sortValue_0 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 29, column 46
    function sortValue_1 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 35, column 49
    function sortValue_2 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 40, column 44
    function sortValue_3 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 45, column 44
    function sortValue_4 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 50, column 43
    function sortValue_5 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 55, column 39
    function sortValue_6 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 61, column 44
    function sortValue_7 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 67, column 38
    function sortValue_8 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.State
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 72, column 35
    function sortValue_9 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.Notes
    }
    
    // 'value' attribute on RowIterator at StatCodePickerLV.pcf: line 16, column 37
    function value_41 () : entity.StatCode[] {
      return StatCodeList
    }
    
    property get StatCodeList () : StatCode[] {
      return getRequireValue("StatCodeList", 0) as StatCode[]
    }
    
    property set StatCodeList ($arg :  StatCode[]) {
      setRequireValue("StatCodeList", 0, $arg)
    }
    
    
  }
  
  
}