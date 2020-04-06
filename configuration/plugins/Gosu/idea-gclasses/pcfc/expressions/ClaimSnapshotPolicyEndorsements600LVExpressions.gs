package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyEndorsements600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyEndorsements600LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyEndorsements600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements600LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 23, column 40
    function sortValue_0 (Endorsement :  dynamic.Dynamic) : java.lang.Object {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 28, column 40
    function sortValue_1 (Endorsement :  dynamic.Dynamic) : java.lang.Object {
      return Endorsement.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 32, column 73
    function sortValue_2 (Endorsement :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Endorsement.EffectiveDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 36, column 74
    function sortValue_3 (Endorsement :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Endorsement.ExpirationDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 41, column 40
    function sortValue_4 (Endorsement :  dynamic.Dynamic) : java.lang.Object {
      return Endorsement.Comments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyEndorsements600LV.pcf: line 17, column 35
    function value_18 () : dynamic.Dynamic {
      return SnapshotParam.Policy.Endorsements
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyEndorsements600LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyEndorsements600LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 23, column 40
    function valueRoot_7 () : java.lang.Object {
      return Endorsement
    }
    
    // 'value' attribute on TextCell (id=EffectiveDate) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 32, column 73
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Endorsement.EffectiveDate)
    }
    
    // 'value' attribute on TextCell (id=ExpirationDate) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 36, column 74
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(Endorsement.ExpirationDate)
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 41, column 40
    function value_15 () : dynamic.Dynamic {
      return Endorsement.Comments
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 23, column 40
    function value_5 () : dynamic.Dynamic {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotPolicyEndorsements600LV.pcf: line 28, column 40
    function value_8 () : dynamic.Dynamic {
      return Endorsement.Description
    }
    
    property get Endorsement () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}