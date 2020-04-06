package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyLocationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyLocationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPolicyLocationsLV.pcf: line 16, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return (SnapshotParam).Policy
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 31, column 40
    function sortValue_1 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return PolicyLocation.LocationNumber
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 36, column 40
    function sortValue_2 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return PolicyLocation.Address.Description
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 41, column 70
    function sortValue_3 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PolicyLocation.Address)
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 46, column 75
    function sortValue_5 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(getLocationLienHolders(PolicyLocation))
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 50, column 51
    function sortValue_6 (PolicyLocation :  dynamic.Dynamic) : java.lang.Object {
      return hasListedItems(PolicyLocation)
    }
    
    // 'value' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 24, column 35
    function value_24 () : dynamic.Dynamic {
      return Policy.PolicyLocations
    }
    
    // 'visible' attribute on RowIterator (id=PolicyLocationIterator) at ClaimSnapshotPolicyLocationsLV.pcf: line 46, column 75
    function visible_4 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyLocationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocationsLV.pcf: line 41, column 70
    function action_16 () : void {
      ClaimSnapshotPolicyLocationPopup.push(Claim, PolicyLocation)
    }
    
    // 'action' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocationsLV.pcf: line 31, column 40
    function action_8 () : void {
      ClaimSnapshotPolicyLocationPopup.push(Claim, PolicyLocation)
    }
    
    // 'action' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocationsLV.pcf: line 41, column 70
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicyLocationPopup.createDestination(Claim, PolicyLocation)
    }
    
    // 'action' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocationsLV.pcf: line 31, column 40
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicyLocationPopup.createDestination(Claim, PolicyLocation)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocationsLV.pcf: line 31, column 40
    function valueRoot_11 () : java.lang.Object {
      return PolicyLocation
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocationsLV.pcf: line 36, column 40
    function valueRoot_14 () : java.lang.Object {
      return PolicyLocation.Address
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyLocationsLV.pcf: line 36, column 40
    function value_12 () : dynamic.Dynamic {
      return PolicyLocation.Address.Description
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPolicyLocationsLV.pcf: line 41, column 70
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(PolicyLocation.Address)
    }
    
    // 'value' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocationsLV.pcf: line 46, column 75
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue(getLocationLienHolders(PolicyLocation))
    }
    
    // 'value' attribute on TextCell (id=HighValueItems) at ClaimSnapshotPolicyLocationsLV.pcf: line 50, column 51
    function value_22 () : java.lang.String {
      return hasListedItems(PolicyLocation)
    }
    
    // 'value' attribute on TextCell (id=Location) at ClaimSnapshotPolicyLocationsLV.pcf: line 31, column 40
    function value_7 () : dynamic.Dynamic {
      return PolicyLocation.LocationNumber
    }
    
    // 'visible' attribute on TextCell (id=Lienholders) at ClaimSnapshotPolicyLocationsLV.pcf: line 46, column 75
    function visible_19 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    property get PolicyLocation () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}