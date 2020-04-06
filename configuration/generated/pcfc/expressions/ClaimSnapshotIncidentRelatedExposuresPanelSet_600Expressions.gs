package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotIncidentRelatedExposuresPanelSet_600Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotIncidentRelatedExposuresPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 30, column 44
    function sortValue_0 (exposure :  dynamic.Dynamic) : java.lang.Object {
      return exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 23, column 39
    function value_18 () : dynamic.Dynamic {
      return snapshot.Exposures
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get snapshot () : dynamic.Dynamic {
      return getRequireValue("snapshot", 0) as dynamic.Dynamic
    }
    
    property set snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotIncidentRelatedExposuresPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=CoverageLink) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 38, column 53
    function label_4 () : java.lang.Object {
      return exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Paid) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 53, column 59
    function valueRoot_12 () : java.lang.Object {
      return (exposure.ExposureRpt)
    }
    
    // 'value' attribute on TextCell (id=ClaimOrder) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 30, column 44
    function valueRoot_3 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextCell (id=ClaimOrder) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 30, column 44
    function value_1 () : dynamic.Dynamic {
      return exposure.ClaimOrder
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 59, column 59
    function value_14 () : dynamic.Dynamic {
      return (exposure.ExposureRpt).RemainingReserves
    }
    
    // 'value' attribute on TextInput (id=Assignee) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 43, column 46
    function value_5 () : dynamic.Dynamic {
      return exposure.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=Paid) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 53, column 59
    function value_9 () : dynamic.Dynamic {
      return (exposure.ExposureRpt).TotalPayments
    }
    
    // 'visible' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 59, column 59
    function visible_13 () : java.lang.Boolean {
      return perm.Claim.viewreserves(claim)
    }
    
    // 'visible' attribute on TextInput (id=Paid) at ClaimSnapshotIncidentRelatedExposuresPanelSet.600.pcf: line 53, column 59
    function visible_8 () : java.lang.Boolean {
      return perm.Claim.viewpayments(claim)
    }
    
    property get exposure () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}