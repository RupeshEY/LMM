package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyTrips600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyTrips600LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyTrips600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips600LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicyTrips600LV.pcf: line 16, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return (SnapshotParam).Policy
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 28, column 40
    function sortValue_1 (TripRU :  dynamic.Dynamic) : java.lang.Object {
      return (TripRU).RUNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 33, column 40
    function sortValue_2 (TripRU :  dynamic.Dynamic) : java.lang.Object {
      return (TripRU).TripDescription
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 38, column 40
    function sortValue_3 (TripRU :  dynamic.Dynamic) : java.lang.Object {
      return (TripRU).StartDate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 43, column 40
    function sortValue_4 (TripRU :  dynamic.Dynamic) : java.lang.Object {
      return (TripRU).EndDate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 48, column 40
    function sortValue_5 (TripRU :  dynamic.Dynamic) : java.lang.Object {
      return (TripRU).GeographicalRegion
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyTrips600LV.pcf: line 21, column 35
    function value_21 () : dynamic.Dynamic {
      return Policy.RiskUnits
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Policy () : dynamic.Dynamic {
      return getVariableValue("Policy", 0) as dynamic.Dynamic
    }
    
    property set Policy ($arg :  dynamic.Dynamic) {
      setVariableValue("Policy", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyTrips600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyTrips600LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=TripNumber) at ClaimSnapshotPolicyTrips600LV.pcf: line 28, column 40
    function valueRoot_8 () : java.lang.Object {
      return (TripRU)
    }
    
    // 'value' attribute on TextCell (id=StartDate) at ClaimSnapshotPolicyTrips600LV.pcf: line 38, column 40
    function value_12 () : dynamic.Dynamic {
      return (TripRU).StartDate
    }
    
    // 'value' attribute on TextCell (id=EndDate) at ClaimSnapshotPolicyTrips600LV.pcf: line 43, column 40
    function value_15 () : dynamic.Dynamic {
      return (TripRU).EndDate
    }
    
    // 'value' attribute on TextCell (id=GeographicalRegion) at ClaimSnapshotPolicyTrips600LV.pcf: line 48, column 40
    function value_18 () : dynamic.Dynamic {
      return (TripRU).GeographicalRegion
    }
    
    // 'value' attribute on TextCell (id=TripNumber) at ClaimSnapshotPolicyTrips600LV.pcf: line 28, column 40
    function value_6 () : dynamic.Dynamic {
      return (TripRU).RUNumber
    }
    
    // 'value' attribute on TextCell (id=TripDescription) at ClaimSnapshotPolicyTrips600LV.pcf: line 33, column 40
    function value_9 () : dynamic.Dynamic {
      return (TripRU).TripDescription
    }
    
    property get TripRU () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}