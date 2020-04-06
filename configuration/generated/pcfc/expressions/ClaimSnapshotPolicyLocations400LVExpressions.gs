package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocations400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocations400LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocations400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations400LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 24, column 40
    function sortValue_0 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.PropertyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 29, column 40
    function sortValue_1 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.Location
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 34, column 40
    function sortValue_2 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 38, column 79
    function sortValue_3 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyProperty.Property.Address)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 43, column 40
    function sortValue_4 (PolicyProperty :  dynamic.Dynamic) : java.lang.Object {
      return PolicyProperty.Property.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations400LV.pcf: line 17, column 35
    function value_19 () : dynamic.Dynamic {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocations400LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocations400LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations400LV.pcf: line 29, column 40
    function valueRoot_10 () : java.lang.Object {
      return PolicyProperty.Property
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations400LV.pcf: line 24, column 40
    function valueRoot_7 () : java.lang.Object {
      return PolicyProperty
    }
    
    // 'value' attribute on TextCell (id=BuildingNumber) at ClaimSnapshotPolicyLocations400LV.pcf: line 34, column 40
    function value_11 () : dynamic.Dynamic {
      return PolicyProperty.Property.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocations400LV.pcf: line 38, column 79
    function value_14 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyProperty.Property.Address)
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyLocations400LV.pcf: line 43, column 40
    function value_16 () : dynamic.Dynamic {
      return PolicyProperty.Property.Notes
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations400LV.pcf: line 24, column 40
    function value_5 () : dynamic.Dynamic {
      return PolicyProperty.PropertyNumber
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations400LV.pcf: line 29, column 40
    function value_8 () : dynamic.Dynamic {
      return PolicyProperty.Property.Location
    }
    
    property get PolicyProperty () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}