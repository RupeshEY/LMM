package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyStatCodes800LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyStatCodes800LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyStatCodes800LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes800LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 23, column 40
    function sortValue_0 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 28, column 40
    function sortValue_1 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 33, column 40
    function sortValue_2 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.InsuranceSubline
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 38, column 40
    function sortValue_3 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 43, column 40
    function sortValue_4 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 48, column 40
    function sortValue_5 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 53, column 40
    function sortValue_6 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 58, column 40
    function sortValue_7 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 63, column 40
    function sortValue_8 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 68, column 40
    function sortValue_9 (StatCode :  dynamic.Dynamic) : java.lang.Object {
      return StatCode.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyStatCodes800LV.pcf: line 17, column 35
    function value_40 () : dynamic.Dynamic {
      return SnapshotParam.Policy.StatCodes
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyStatCodes800LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyStatCodes800LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 23, column 40
    function valueRoot_12 () : java.lang.Object {
      return StatCode
    }
    
    // 'value' attribute on TextCell (id=LineNumber) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 23, column 40
    function value_10 () : dynamic.Dynamic {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on TextCell (id=InsuranceLine) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 28, column 40
    function value_13 () : dynamic.Dynamic {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on TextCell (id=InsuranceSubline) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 33, column 40
    function value_16 () : dynamic.Dynamic {
      return StatCode.InsuranceSubline
    }
    
    // 'value' attribute on TextCell (id=LocationNumber) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 38, column 40
    function value_19 () : dynamic.Dynamic {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 43, column 40
    function value_22 () : dynamic.Dynamic {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=VehicleNumber) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 48, column 40
    function value_25 () : dynamic.Dynamic {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 53, column 40
    function value_28 () : dynamic.Dynamic {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on TextCell (id=MajorPeril) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 58, column 40
    function value_31 () : dynamic.Dynamic {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 63, column 40
    function value_34 () : dynamic.Dynamic {
      return StatCode.State
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyStatCodes800LV.pcf: line 68, column 40
    function value_37 () : dynamic.Dynamic {
      return StatCode.Notes
    }
    
    property get StatCode () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}