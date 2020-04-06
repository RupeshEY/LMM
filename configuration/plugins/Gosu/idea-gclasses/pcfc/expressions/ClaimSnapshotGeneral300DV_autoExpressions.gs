package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral300DV_autoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.auto.pcf: line 294, column 46
    function sortValue_122 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.auto.pcf: line 299, column 46
    function sortValue_123 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.auto.pcf: line 304, column 46
    function sortValue_124 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral300DV.auto.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral300DV.auto.pcf: line 82, column 38
    function valueRoot_31 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotGeneral300DV.auto.pcf: line 160, column 38
    function valueRoot_67 () : java.lang.Object {
      return Snapshot.Vehicle
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral300DV.auto.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral300DV.auto.pcf: line 39, column 38
    function value_10 () : dynamic.Dynamic {
      return Snapshot.Segment
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 232, column 38
    function value_100 () : dynamic.Dynamic {
      return Snapshot.LitigationStatus
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 237, column 38
    function value_103 () : dynamic.Dynamic {
      return Snapshot.SubrogationStatus
    }
    
    // 'value' attribute on TextInput (id=SalvageStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 242, column 38
    function value_106 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "SalvageStatus")
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 247, column 38
    function value_108 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "OtherRecovStatus")
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 252, column 38
    function value_110 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "SIUStatus")
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 257, column 38
    function value_112 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "ReinsuranceStatus")
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral300DV.auto.pcf: line 265, column 38
    function value_114 () : dynamic.Dynamic {
      return Snapshot.Flagged
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral300DV.auto.pcf: line 269, column 66
    function value_117 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FlaggedDate)
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral300DV.auto.pcf: line 274, column 38
    function value_119 () : dynamic.Dynamic {
      return Snapshot.FlaggedReason
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral300DV.auto.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Snapshot.Strategy
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.auto.pcf: line 288, column 44
    function value_134 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(Snapshot, "Officials") as Object[]
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral300DV.auto.pcf: line 49, column 38
    function value_16 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral300DV.auto.pcf: line 58, column 38
    function value_19 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral300DV.auto.pcf: line 66, column 38
    function value_22 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=LossDate) at ClaimSnapshotGeneral300DV.auto.pcf: line 70, column 63
    function value_25 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossDate)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral300DV.auto.pcf: line 77, column 67
    function value_27 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.LossLocation)
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral300DV.auto.pcf: line 82, column 38
    function value_29 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral300DV.auto.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral300DV.auto.pcf: line 87, column 38
    function value_32 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral300DV.auto.pcf: line 92, column 38
    function value_35 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossLocationCode")
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral300DV.auto.pcf: line 97, column 38
    function value_37 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral300DV.auto.pcf: line 104, column 67
    function value_40 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.ReportedDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral300DV.auto.pcf: line 111, column 38
    function value_42 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "FirstNoticeSuit")
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral300DV.auto.pcf: line 116, column 38
    function value_44 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral300DV.auto.pcf: line 120, column 108
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getContactByRole(Snapshot, "reporter"))
    }
    
    // 'value' attribute on TextInput (id=DriverRelation) at ClaimSnapshotGeneral300DV.auto.pcf: line 125, column 38
    function value_49 () : dynamic.Dynamic {
      return Snapshot.DriverRelation
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral300DV.auto.pcf: line 129, column 111
    function value_52 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getContactByRole(Snapshot, "maincontact"))
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral300DV.auto.pcf: line 134, column 38
    function value_54 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral300DV.auto.pcf: line 142, column 60
    function value_59 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Fault)
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral300DV.auto.pcf: line 30, column 133
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPropertyValue(Snapshot, "AssignedUser")["Contact"])
    }
    
    // 'value' attribute on TextInput (id=Vehicle) at ClaimSnapshotGeneral300DV.auto.pcf: line 150, column 62
    function value_61 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Vehicle)
    }
    
    // 'value' attribute on TextInput (id=Style) at ClaimSnapshotGeneral300DV.auto.pcf: line 155, column 38
    function value_63 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot.Vehicle, "Style")
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotGeneral300DV.auto.pcf: line 160, column 38
    function value_65 () : dynamic.Dynamic {
      return Snapshot.Vehicle.Color
    }
    
    // 'value' attribute on TextInput (id=Vin) at ClaimSnapshotGeneral300DV.auto.pcf: line 165, column 38
    function value_68 () : dynamic.Dynamic {
      return Snapshot.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotGeneral300DV.auto.pcf: line 170, column 38
    function value_71 () : dynamic.Dynamic {
      return Snapshot.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSnapshotGeneral300DV.auto.pcf: line 175, column 38
    function value_74 () : dynamic.Dynamic {
      return Snapshot.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotGeneral300DV.auto.pcf: line 182, column 106
    function value_77 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getContactByRole(Snapshot, "driver"))
    }
    
    // 'value' attribute on TextInput (id=VehicleUseReason) at ClaimSnapshotGeneral300DV.auto.pcf: line 187, column 38
    function value_79 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "VehicleUseReason")
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral300DV.auto.pcf: line 34, column 66
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Catastrophe)
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral300DV.auto.pcf: line 199, column 112
    function value_84 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "CreateTime") )
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral300DV.auto.pcf: line 203, column 111
    function value_86 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "CloseDate") )
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral300DV.auto.pcf: line 208, column 38
    function value_88 () : dynamic.Dynamic {
      return Snapshot.ClosedOutcome
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral300DV.auto.pcf: line 215, column 38
    function value_91 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral300DV.auto.pcf: line 222, column 38
    function value_94 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral300DV.auto.pcf: line 227, column 38
    function value_97 () : dynamic.Dynamic {
      return Snapshot.DeductibleStatus
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral300DV.auto.pcf: line 294, column 46
    function valueRoot_127 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral300DV.auto.pcf: line 294, column 46
    function value_125 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral300DV.auto.pcf: line 299, column 46
    function value_128 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral300DV.auto.pcf: line 304, column 46
    function value_131 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}