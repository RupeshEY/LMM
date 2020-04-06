package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocations700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocations700LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocations700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations700LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicyLocations700LV.pcf: line 16, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return (SnapshotParam).Policy
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 31, column 40
    function sortValue_1 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return PolicyLocation.LocationNumber
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 36, column 40
    function sortValue_2 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return PolicyLocation.Address.Description
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 40, column 70
    function sortValue_3 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyLocation.Address)
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 44, column 86
    function sortValue_4 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(getLocationLienHolders(PolicyLocation))
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 48, column 51
    function sortValue_5 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return hasListedItems(PolicyLocation)
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocations700LV.pcf: line 24, column 35
    function value_20 () : dynamic.Dynamic {
      return Policy.PolicyLocations
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
    
    function getLocationLienHolders(policyLocation : dynamic.Dynamic) : dynamic.Dynamic {
      var list = new java.util.ArrayList()
      for (lienHolder in (policyLocation.Lienholders)) {
        if(lienHolder.LocationBasedRU == null) {
          list.add(lienHolder)
        }
       }
      return list.toArray()
    }
    
    function hasListedItems(policyLocation : dynamic.Dynamic) : String {
      if((policyLocation.HighValueItems).HasElements)
        return YesNo.TC_YES.DisplayName
      return YesNo.TC_NO.DisplayName  
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocations700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocations700LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations700LV.pcf: line 31, column 40
    function action_7 () : void {
      ClaimSnapshotPolicyLocation700Popup.push(Claim, PolicyLocation)
    }
    
    // 'action' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations700LV.pcf: line 31, column 40
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicyLocation700Popup.createDestination(Claim, PolicyLocation)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations700LV.pcf: line 31, column 40
    function valueRoot_10 () : java.lang.Object {
      return PolicyLocation
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocations700LV.pcf: line 36, column 40
    function valueRoot_13 () : java.lang.Object {
      return PolicyLocation.Address
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocations700LV.pcf: line 36, column 40
    function value_11 () : dynamic.Dynamic {
      return PolicyLocation.Address.Description
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocations700LV.pcf: line 40, column 70
    function value_14 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyLocation.Address)
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocations700LV.pcf: line 44, column 86
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(getLocationLienHolders(PolicyLocation))
    }
    
    // 'value' attribute on TextCell (id=HighValueItems) at ClaimSnapshotPolicyLocations700LV.pcf: line 48, column 51
    function value_18 () : java.lang.String {
      return hasListedItems(PolicyLocation)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocations700LV.pcf: line 31, column 40
    function value_6 () : dynamic.Dynamic {
      return PolicyLocation.LocationNumber
    }
    
    property get PolicyLocation () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}