package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.gl.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral310DV_glExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.gl.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.gl.pcf: line 258, column 46
    function sortValue_115 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.gl.pcf: line 263, column 46
    function sortValue_116 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.gl.pcf: line 268, column 46
    function sortValue_117 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.gl.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.gl.pcf: line 79, column 38
    function valueRoot_30 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.gl.pcf: line 129, column 38
    function valueRoot_56 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.gl.pcf: line 139, column 38
    function valueRoot_62 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.gl.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.AssignedUser.Contact
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.gl.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 217, column 38
    function value_101 () : dynamic.Dynamic {
      return Snapshot.SIUStatus
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 222, column 38
    function value_104 () : dynamic.Dynamic {
      return Snapshot.ReinsuranceStatus
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral310DV.gl.pcf: line 230, column 38
    function value_107 () : dynamic.Dynamic {
      return Snapshot.Flagged
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral310DV.gl.pcf: line 40, column 38
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Segment
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral310DV.gl.pcf: line 234, column 66
    function value_110 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FlaggedDate)
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral310DV.gl.pcf: line 239, column 38
    function value_112 () : dynamic.Dynamic {
      return Snapshot.FlaggedReason
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.gl.pcf: line 252, column 41
    function value_127 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral310DV.gl.pcf: line 45, column 38
    function value_14 () : dynamic.Dynamic {
      return Snapshot.Strategy
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral310DV.gl.pcf: line 50, column 38
    function value_17 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral310DV.gl.pcf: line 59, column 38
    function value_20 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral310DV.gl.pcf: line 67, column 38
    function value_23 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=LossDate) at ClaimSnapshotGeneral310DV.gl.pcf: line 71, column 63
    function value_26 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossDate)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.gl.pcf: line 79, column 38
    function value_28 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral310DV.gl.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral310DV.gl.pcf: line 84, column 38
    function value_31 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral310DV.gl.pcf: line 89, column 38
    function value_34 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral310DV.gl.pcf: line 94, column 38
    function value_37 () : dynamic.Dynamic {
      return Snapshot.LossLocationCode
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral310DV.gl.pcf: line 99, column 38
    function value_40 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral310DV.gl.pcf: line 104, column 38
    function value_43 () : dynamic.Dynamic {
      return Snapshot.Fault
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral310DV.gl.pcf: line 112, column 67
    function value_46 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ReportedDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral310DV.gl.pcf: line 119, column 38
    function value_48 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral310DV.gl.pcf: line 124, column 38
    function value_51 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.gl.pcf: line 129, column 38
    function value_54 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DriverRelation) at ClaimSnapshotGeneral310DV.gl.pcf: line 134, column 38
    function value_57 () : dynamic.Dynamic {
      return Snapshot.DriverRelation
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.gl.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Snapshot.AssignedUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.gl.pcf: line 139, column 38
    function value_60 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral310DV.gl.pcf: line 144, column 38
    function value_63 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on TextInput (id=DateRptdToAgent) at ClaimSnapshotGeneral310DV.gl.pcf: line 148, column 70
    function value_66 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateRptdToAgent)
    }
    
    // 'value' attribute on TextInput (id=ManifestationDate) at ClaimSnapshotGeneral310DV.gl.pcf: line 152, column 72
    function value_68 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ManifestationDate)
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral310DV.gl.pcf: line 164, column 65
    function value_73 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral310DV.gl.pcf: line 168, column 64
    function value_75 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CloseDate)
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral310DV.gl.pcf: line 173, column 38
    function value_77 () : dynamic.Dynamic {
      return Snapshot.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral310DV.gl.pcf: line 180, column 38
    function value_80 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral310DV.gl.pcf: line 187, column 38
    function value_83 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 192, column 38
    function value_86 () : dynamic.Dynamic {
      return Snapshot.DeductibleStatus
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 197, column 38
    function value_89 () : dynamic.Dynamic {
      return Snapshot.LitigationStatus
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.gl.pcf: line 35, column 66
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Catastrophe)
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 202, column 38
    function value_92 () : dynamic.Dynamic {
      return Snapshot.SubrogationStatus
    }
    
    // 'value' attribute on TextInput (id=SalvageStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 207, column 38
    function value_95 () : dynamic.Dynamic {
      return Snapshot.SalvageStatus
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral310DV.gl.pcf: line 212, column 38
    function value_98 () : dynamic.Dynamic {
      return Snapshot.OtherRecovStatus
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.gl.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.gl.pcf: line 258, column 46
    function valueRoot_120 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.gl.pcf: line 258, column 46
    function value_118 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral310DV.gl.pcf: line 263, column 46
    function value_121 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral310DV.gl.pcf: line 268, column 46
    function value_124 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}