package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyLocations300LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocations300LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyLocations300LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations300LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 23, column 40
    function sortValue_0 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.PropertyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 28, column 40
    function sortValue_1 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.Location
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 33, column 40
    function sortValue_2 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 37, column 79
    function sortValue_3 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyProperty.Property.Address)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 41, column 83
    function sortValue_4 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyProperty.Property.Lienholders)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 46, column 40
    function sortValue_5 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations300LV.pcf: line 17, column 35
    function value_22 () : dynamic.Dynamic {
      return SnapshotParam.Policy.Properties
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyLocations300LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocations300LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations300LV.pcf: line 28, column 40
    function valueRoot_11 () : java.lang.Object {
      return PolicyProperty.Property
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations300LV.pcf: line 23, column 40
    function valueRoot_8 () : java.lang.Object {
      return PolicyProperty
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocations300LV.pcf: line 33, column 40
    function value_12 () : dynamic.Dynamic {
      return PolicyProperty.Property.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocations300LV.pcf: line 37, column 79
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyProperty.Property.Address)
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocations300LV.pcf: line 41, column 83
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyProperty.Property.Lienholders)
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyLocations300LV.pcf: line 46, column 40
    function value_19 () : dynamic.Dynamic {
      return PolicyProperty.Property.Notes
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations300LV.pcf: line 23, column 40
    function value_6 () : dynamic.Dynamic {
      return PolicyProperty.PropertyNumber
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations300LV.pcf: line 28, column 40
    function value_9 () : dynamic.Dynamic {
      return PolicyProperty.Property.Location
    }
    
    property get PolicyProperty () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}