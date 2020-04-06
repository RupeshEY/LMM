package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral310DV_prExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.pr.pcf: line 249, column 46
    function sortValue_110 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.pr.pcf: line 254, column 46
    function sortValue_111 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.pr.pcf: line 259, column 46
    function sortValue_112 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.pr.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.pr.pcf: line 79, column 38
    function valueRoot_30 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.pr.pcf: line 124, column 38
    function valueRoot_53 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.pr.pcf: line 134, column 38
    function valueRoot_59 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=DisplayName) at ClaimSnapshotGeneral310DV.pr.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.AssignedUser.Contact
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.pr.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral310DV.pr.pcf: line 221, column 38
    function value_102 () : dynamic.Dynamic {
      return Snapshot.Flagged
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral310DV.pr.pcf: line 225, column 66
    function value_105 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FlaggedDate)
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral310DV.pr.pcf: line 230, column 38
    function value_107 () : dynamic.Dynamic {
      return Snapshot.FlaggedReason
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral310DV.pr.pcf: line 40, column 38
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Segment
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.pr.pcf: line 243, column 41
    function value_122 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral310DV.pr.pcf: line 45, column 38
    function value_14 () : dynamic.Dynamic {
      return Snapshot.Strategy
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral310DV.pr.pcf: line 50, column 38
    function value_17 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral310DV.pr.pcf: line 59, column 38
    function value_20 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral310DV.pr.pcf: line 67, column 38
    function value_23 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=LossDate) at ClaimSnapshotGeneral310DV.pr.pcf: line 71, column 63
    function value_26 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossDate)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.pr.pcf: line 79, column 38
    function value_28 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral310DV.pr.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral310DV.pr.pcf: line 84, column 38
    function value_31 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral310DV.pr.pcf: line 89, column 38
    function value_34 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral310DV.pr.pcf: line 94, column 38
    function value_37 () : dynamic.Dynamic {
      return Snapshot.LossLocationCode
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral310DV.pr.pcf: line 99, column 38
    function value_40 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral310DV.pr.pcf: line 107, column 67
    function value_43 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ReportedDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral310DV.pr.pcf: line 114, column 38
    function value_45 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral310DV.pr.pcf: line 119, column 38
    function value_48 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.pr.pcf: line 124, column 38
    function value_51 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DriverRelation) at ClaimSnapshotGeneral310DV.pr.pcf: line 129, column 38
    function value_54 () : dynamic.Dynamic {
      return Snapshot.DriverRelation
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.pr.pcf: line 134, column 38
    function value_57 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DisplayName) at ClaimSnapshotGeneral310DV.pr.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Snapshot.AssignedUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral310DV.pr.pcf: line 139, column 38
    function value_60 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on TextInput (id=DateRptdToAgent) at ClaimSnapshotGeneral310DV.pr.pcf: line 143, column 70
    function value_63 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateRptdToAgent)
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral310DV.pr.pcf: line 148, column 38
    function value_65 () : dynamic.Dynamic {
      return Snapshot.Fault
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral310DV.pr.pcf: line 155, column 65
    function value_68 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral310DV.pr.pcf: line 159, column 64
    function value_70 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CloseDate)
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral310DV.pr.pcf: line 164, column 38
    function value_72 () : dynamic.Dynamic {
      return Snapshot.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral310DV.pr.pcf: line 171, column 38
    function value_75 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral310DV.pr.pcf: line 178, column 38
    function value_78 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 183, column 38
    function value_81 () : dynamic.Dynamic {
      return Snapshot.DeductibleStatus
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 188, column 38
    function value_84 () : dynamic.Dynamic {
      return Snapshot.LitigationStatus
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 193, column 38
    function value_87 () : dynamic.Dynamic {
      return Snapshot.SubrogationStatus
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.pr.pcf: line 35, column 66
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Catastrophe)
    }
    
    // 'value' attribute on TextInput (id=SalvageStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 198, column 38
    function value_90 () : dynamic.Dynamic {
      return Snapshot.SalvageStatus
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 203, column 38
    function value_93 () : dynamic.Dynamic {
      return Snapshot.OtherRecovStatus
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 208, column 38
    function value_96 () : dynamic.Dynamic {
      return Snapshot.SIUStatus
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral310DV.pr.pcf: line 213, column 38
    function value_99 () : dynamic.Dynamic {
      return Snapshot.ReinsuranceStatus
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getRequireValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("Snapshot", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.pr.pcf: line 249, column 46
    function valueRoot_115 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.pr.pcf: line 249, column 46
    function value_113 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral310DV.pr.pcf: line 254, column 46
    function value_116 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral310DV.pr.pcf: line 259, column 46
    function value_119 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}