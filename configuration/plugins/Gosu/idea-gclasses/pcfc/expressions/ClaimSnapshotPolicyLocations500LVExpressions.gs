package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocations500LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocations500LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocations500LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations500LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicyLocations500LV.pcf: line 16, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return (SnapshotParam).Policy
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 28, column 40
    function sortValue_1 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return (LocationBasedRU).RUNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 33, column 40
    function sortValue_2 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return (LocationBasedRU).Property.LocationNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 38, column 40
    function sortValue_3 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return (LocationBasedRU).Building.BuildingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 43, column 40
    function sortValue_4 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return (LocationBasedRU).ClassCode.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 47, column 82
    function sortValue_5 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue((LocationBasedRU).Property.Address)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 52, column 40
    function sortValue_6 (LocationBasedRU :  dynamic.Dynamic) : java.lang.Object {
      return (LocationBasedRU).Property.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocations500LV.pcf: line 21, column 35
    function value_24 () : dynamic.Dynamic {
      return getProperties(Policy.RiskUnits)
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
    
    
    function getProperties(riskUnits : dynamic.Dynamic) : dynamic.Dynamic {
      var list = new java.util.ArrayList();
      for (ru in riskUnits) {
        if ({"LocationBasedRU", "BuildingRU", "GeneralLiabilityRU", "InlandMarineRU", "PropertyRU"}.contains(ru.Subtype.Name)) {
          list.add(ru);
        }
      }
      return list.toArray()
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyLocations500LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocations500LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations500LV.pcf: line 33, column 40
    function valueRoot_12 () : java.lang.Object {
      return (LocationBasedRU).Property
    }
    
    // 'value' attribute on TextCell (id=Building) at ClaimSnapshotPolicyLocations500LV.pcf: line 38, column 40
    function valueRoot_15 () : java.lang.Object {
      return (LocationBasedRU).Building
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at ClaimSnapshotPolicyLocations500LV.pcf: line 43, column 40
    function valueRoot_18 () : java.lang.Object {
      return (LocationBasedRU).ClassCode
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations500LV.pcf: line 28, column 40
    function valueRoot_9 () : java.lang.Object {
      return (LocationBasedRU)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations500LV.pcf: line 33, column 40
    function value_10 () : dynamic.Dynamic {
      return (LocationBasedRU).Property.LocationNumber
    }
    
    // 'value' attribute on TextCell (id=Building) at ClaimSnapshotPolicyLocations500LV.pcf: line 38, column 40
    function value_13 () : dynamic.Dynamic {
      return (LocationBasedRU).Building.BuildingNumber
    }
    
    // 'value' attribute on TextCell (id=ClassCode) at ClaimSnapshotPolicyLocations500LV.pcf: line 43, column 40
    function value_16 () : dynamic.Dynamic {
      return (LocationBasedRU).ClassCode.Code
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocations500LV.pcf: line 47, column 82
    function value_19 () : java.lang.String {
      return util.Snapshot.renderValue((LocationBasedRU).Property.Address)
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyLocations500LV.pcf: line 52, column 40
    function value_21 () : dynamic.Dynamic {
      return (LocationBasedRU).Property.Notes
    }
    
    // 'value' attribute on TextCell (id=PropertyNumber) at ClaimSnapshotPolicyLocations500LV.pcf: line 28, column 40
    function value_7 () : dynamic.Dynamic {
      return (LocationBasedRU).RUNumber
    }
    
    property get LocationBasedRU () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}