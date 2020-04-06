package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimStatCodesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimStatCodesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=LineNumber) at NewClaimStatCodesLV.pcf: line 33, column 42
    function action_11 () : void {
      NewClaimWizard_StatCodeDetailPopup.push(Policy, StatCode)
    }
    
    // 'action' attribute on TextCell (id=LineNumber) at NewClaimStatCodesLV.pcf: line 33, column 42
    function action_dest_12 () : pcf.api.Destination {
      return pcf.NewClaimWizard_StatCodeDetailPopup.createDestination(Policy, StatCode)
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at NewClaimStatCodesLV.pcf: line 33, column 42
    function valueRoot_14 () : java.lang.Object {
      return StatCode
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at NewClaimStatCodesLV.pcf: line 33, column 42
    function value_10 () : java.lang.Integer {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceLine) at NewClaimStatCodesLV.pcf: line 39, column 46
    function value_15 () : typekey.InsuranceLine {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on TypeKeyCell (id=InsuranceSubLine) at NewClaimStatCodesLV.pcf: line 45, column 49
    function value_18 () : typekey.InsuranceSubLine {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on TextCell (id=LocationNumber) at NewClaimStatCodesLV.pcf: line 50, column 44
    function value_21 () : java.lang.String {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at NewClaimStatCodesLV.pcf: line 55, column 44
    function value_24 () : java.lang.String {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at NewClaimStatCodesLV.pcf: line 60, column 43
    function value_27 () : java.lang.String {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at NewClaimStatCodesLV.pcf: line 65, column 39
    function value_30 () : java.lang.String {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on TypeKeyCell (id=MajorPeril) at NewClaimStatCodesLV.pcf: line 71, column 44
    function value_33 () : typekey.MajorPerils {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at NewClaimStatCodesLV.pcf: line 77, column 38
    function value_36 () : typekey.State {
      return StatCode.State
    }
    
    // 'value' attribute on TextCell (id=Notes) at NewClaimStatCodesLV.pcf: line 82, column 35
    function value_39 () : java.lang.String {
      return StatCode.Notes
    }
    
    property get StatCode () : entity.StatCode {
      return getIteratedValue(1) as entity.StatCode
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimStatCodesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 25, column 37
    function pickLocation_42 () : void {
      NewClaimWizard_NewStatCodePopup.push(Policy)
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 33, column 42
    function sortValue_0 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 39, column 46
    function sortValue_1 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 45, column 49
    function sortValue_2 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.InsuranceSubLine
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 50, column 44
    function sortValue_3 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 55, column 44
    function sortValue_4 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 60, column 43
    function sortValue_5 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 65, column 39
    function sortValue_6 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 71, column 44
    function sortValue_7 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 77, column 38
    function sortValue_8 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.State
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 82, column 35
    function sortValue_9 (StatCode :  entity.StatCode) : java.lang.Object {
      return StatCode.Notes
    }
    
    // 'toRemove' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 25, column 37
    function toRemove_43 (StatCode :  entity.StatCode) : void {
      Policy.removeStatCode(StatCode)
    }
    
    // 'value' attribute on RowIterator at NewClaimStatCodesLV.pcf: line 25, column 37
    function value_44 () : entity.StatCode[] {
      return StatCodeList
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    property get StatCodeList () : StatCode[] {
      return getRequireValue("StatCodeList", 0) as StatCode[]
    }
    
    property set StatCodeList ($arg :  StatCode[]) {
      setRequireValue("StatCodeList", 0, $arg)
    }
    
    
  }
  
  
}