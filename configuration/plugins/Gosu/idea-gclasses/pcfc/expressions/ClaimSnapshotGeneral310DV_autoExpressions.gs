package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral310DV_autoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.auto.pcf: line 301, column 46
    function sortValue_138 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.auto.pcf: line 306, column 46
    function sortValue_139 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.auto.pcf: line 311, column 46
    function sortValue_140 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.auto.pcf: line 36, column 38
    function valueRoot_11 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.auto.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.auto.pcf: line 80, column 38
    function valueRoot_31 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.auto.pcf: line 124, column 38
    function valueRoot_54 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.auto.pcf: line 134, column 38
    function valueRoot_60 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=Vehicle) at ClaimSnapshotGeneral310DV.auto.pcf: line 157, column 38
    function valueRoot_71 () : java.lang.Object {
      return Snapshot.Vehicle
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.auto.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.AssignedUser.Contact
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotGeneral310DV.auto.pcf: line 190, column 38
    function valueRoot_89 () : java.lang.Object {
      return Snapshot.Driver
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral310DV.auto.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral310DV.auto.pcf: line 216, column 38
    function value_100 () : dynamic.Dynamic {
      return Snapshot.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral310DV.auto.pcf: line 223, column 38
    function value_103 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral310DV.auto.pcf: line 230, column 38
    function value_106 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 235, column 38
    function value_109 () : dynamic.Dynamic {
      return Snapshot.DeductibleStatus
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 240, column 38
    function value_112 () : dynamic.Dynamic {
      return Snapshot.LitigationStatus
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 245, column 38
    function value_115 () : dynamic.Dynamic {
      return Snapshot.SubrogationStatus
    }
    
    // 'value' attribute on TextInput (id=SalvageStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 250, column 38
    function value_118 () : dynamic.Dynamic {
      return Snapshot.SalvageStatus
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral310DV.auto.pcf: line 41, column 38
    function value_12 () : dynamic.Dynamic {
      return Snapshot.Segment
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 255, column 38
    function value_121 () : dynamic.Dynamic {
      return Snapshot.OtherRecovStatus
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 260, column 38
    function value_124 () : dynamic.Dynamic {
      return Snapshot.SIUStatus
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral310DV.auto.pcf: line 265, column 38
    function value_127 () : dynamic.Dynamic {
      return Snapshot.ReinsuranceStatus
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral310DV.auto.pcf: line 273, column 38
    function value_130 () : dynamic.Dynamic {
      return Snapshot.Flagged
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral310DV.auto.pcf: line 277, column 66
    function value_133 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FlaggedDate)
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral310DV.auto.pcf: line 282, column 38
    function value_135 () : dynamic.Dynamic {
      return Snapshot.FlaggedReason
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral310DV.auto.pcf: line 46, column 38
    function value_15 () : dynamic.Dynamic {
      return Snapshot.Strategy
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral310DV.auto.pcf: line 295, column 41
    function value_150 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral310DV.auto.pcf: line 51, column 38
    function value_18 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral310DV.auto.pcf: line 60, column 38
    function value_21 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral310DV.auto.pcf: line 68, column 38
    function value_24 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=LossDate) at ClaimSnapshotGeneral310DV.auto.pcf: line 72, column 63
    function value_27 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossDate)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral310DV.auto.pcf: line 80, column 38
    function value_29 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral310DV.auto.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral310DV.auto.pcf: line 85, column 38
    function value_32 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral310DV.auto.pcf: line 90, column 38
    function value_35 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral310DV.auto.pcf: line 95, column 38
    function value_38 () : dynamic.Dynamic {
      return Snapshot.LossLocationCode
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral310DV.auto.pcf: line 100, column 38
    function value_41 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral310DV.auto.pcf: line 107, column 67
    function value_44 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ReportedDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral310DV.auto.pcf: line 114, column 38
    function value_46 () : dynamic.Dynamic {
      return Snapshot.FirstNoticeSuit
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral310DV.auto.pcf: line 119, column 38
    function value_49 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral310DV.auto.pcf: line 124, column 38
    function value_52 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DriverRelation) at ClaimSnapshotGeneral310DV.auto.pcf: line 129, column 38
    function value_55 () : dynamic.Dynamic {
      return Snapshot.DriverRelation
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral310DV.auto.pcf: line 134, column 38
    function value_58 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral310DV.auto.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Snapshot.AssignedUser.Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral310DV.auto.pcf: line 139, column 38
    function value_61 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on TextInput (id=DateRptdToAgent) at ClaimSnapshotGeneral310DV.auto.pcf: line 143, column 70
    function value_64 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.DateRptdToAgent)
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral310DV.auto.pcf: line 148, column 38
    function value_66 () : dynamic.Dynamic {
      return Snapshot.Fault
    }
    
    // 'value' attribute on TextInput (id=Vehicle) at ClaimSnapshotGeneral310DV.auto.pcf: line 157, column 38
    function value_69 () : dynamic.Dynamic {
      return Snapshot.Vehicle.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Style) at ClaimSnapshotGeneral310DV.auto.pcf: line 162, column 38
    function value_72 () : dynamic.Dynamic {
      return Snapshot.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotGeneral310DV.auto.pcf: line 167, column 38
    function value_75 () : dynamic.Dynamic {
      return Snapshot.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=Vin) at ClaimSnapshotGeneral310DV.auto.pcf: line 172, column 38
    function value_78 () : dynamic.Dynamic {
      return Snapshot.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotGeneral310DV.auto.pcf: line 177, column 38
    function value_81 () : dynamic.Dynamic {
      return Snapshot.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSnapshotGeneral310DV.auto.pcf: line 182, column 38
    function value_84 () : dynamic.Dynamic {
      return Snapshot.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotGeneral310DV.auto.pcf: line 190, column 38
    function value_87 () : dynamic.Dynamic {
      return Snapshot.Driver.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral310DV.auto.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on TextInput (id=VehicleUseReason) at ClaimSnapshotGeneral310DV.auto.pcf: line 195, column 38
    function value_90 () : dynamic.Dynamic {
      return Snapshot.VehicleUseReason
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral310DV.auto.pcf: line 207, column 65
    function value_96 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral310DV.auto.pcf: line 211, column 64
    function value_98 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.CloseDate)
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.auto.pcf: line 301, column 46
    function valueRoot_143 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral310DV.auto.pcf: line 301, column 46
    function value_141 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral310DV.auto.pcf: line 306, column 46
    function value_144 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral310DV.auto.pcf: line 311, column 46
    function value_147 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}