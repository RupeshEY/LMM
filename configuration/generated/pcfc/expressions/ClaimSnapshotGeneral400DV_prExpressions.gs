package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral400DV_prExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 270, column 46
    function sortValue_115 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 275, column 46
    function sortValue_116 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 280, column 46
    function sortValue_117 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.CreateTime
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 135, column 46
    function sortValue_51 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 140, column 46
    function sortValue_52 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 145, column 46
    function sortValue_53 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 221, column 46
    function sortValue_96 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 226, column 46
    function sortValue_97 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 231, column 46
    function sortValue_98 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral400DV.pr.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral400DV.pr.pcf: line 78, column 38
    function valueRoot_30 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral400DV.pr.pcf: line 83, column 38
    function valueRoot_33 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral400DV.pr.pcf: line 157, column 38
    function valueRoot_68 () : java.lang.Object {
      return Snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral400DV.pr.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 215, column 41
    function value_108 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneral400DV.pr.pcf: line 245, column 38
    function value_109 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral400DV.pr.pcf: line 44, column 38
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneral400DV.pr.pcf: line 250, column 38
    function value_112 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 264, column 41
    function value_127 () : dynamic.Dynamic {
      return Snapshot.MetroReports
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral400DV.pr.pcf: line 52, column 38
    function value_14 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral400DV.pr.pcf: line 57, column 38
    function value_17 () : dynamic.Dynamic {
      return Snapshot.FaultRating
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSnapshotGeneral400DV.pr.pcf: line 64, column 38
    function value_20 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral400DV.pr.pcf: line 78, column 38
    function value_28 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral400DV.pr.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral400DV.pr.pcf: line 83, column 38
    function value_31 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral400DV.pr.pcf: line 88, column 38
    function value_34 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneral400DV.pr.pcf: line 94, column 38
    function value_37 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on TextInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral400DV.pr.pcf: line 98, column 70
    function value_40 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FirstNoticeSuit)
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral400DV.pr.pcf: line 103, column 38
    function value_42 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral400DV.pr.pcf: line 108, column 38
    function value_45 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral400DV.pr.pcf: line 113, column 38
    function value_48 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral400DV.pr.pcf: line 30, column 66
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Catastrophe)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral400DV.pr.pcf: line 128, column 44
    function value_65 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "FixedPropertyIncident")
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral400DV.pr.pcf: line 157, column 38
    function value_66 () : dynamic.Dynamic {
      return Snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Address1) at ClaimSnapshotGeneral400DV.pr.pcf: line 162, column 38
    function value_69 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine1
    }
    
    // 'value' attribute on TextInput (id=Address2) at ClaimSnapshotGeneral400DV.pr.pcf: line 167, column 38
    function value_72 () : dynamic.Dynamic {
      return Snapshot.LossLocation.AddressLine2
    }
    
    // 'value' attribute on TextInput (id=City) at ClaimSnapshotGeneral400DV.pr.pcf: line 172, column 38
    function value_75 () : dynamic.Dynamic {
      return Snapshot.LossLocation.City
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotGeneral400DV.pr.pcf: line 177, column 38
    function value_78 () : dynamic.Dynamic {
      return Snapshot.LossLocation.State
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral400DV.pr.pcf: line 35, column 38
    function value_8 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'value' attribute on TextInput (id=PostalCode) at ClaimSnapshotGeneral400DV.pr.pcf: line 182, column 38
    function value_81 () : dynamic.Dynamic {
      return Snapshot.LossLocation.PostalCode
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral400DV.pr.pcf: line 187, column 38
    function value_84 () : dynamic.Dynamic {
      return Snapshot.LossLocation.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral400DV.pr.pcf: line 192, column 38
    function value_87 () : dynamic.Dynamic {
      return Snapshot.LossLocation.Country
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral400DV.pr.pcf: line 197, column 38
    function value_90 () : dynamic.Dynamic {
      return Snapshot.LossLocationCode
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral400DV.pr.pcf: line 202, column 38
    function value_93 () : dynamic.Dynamic {
      return Snapshot.JurisdictionState
    }
    
    // 'visible' attribute on TextInput (id=AtFaultPercentage) at ClaimSnapshotGeneral400DV.pr.pcf: line 70, column 76
    function visible_23 () : java.lang.Boolean {
      return Snapshot.FaultRating["Code"] == "1"
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral400DV.pr.pcf: line 221, column 46
    function valueRoot_101 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral400DV.pr.pcf: line 226, column 46
    function value_102 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral400DV.pr.pcf: line 231, column 46
    function value_105 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral400DV.pr.pcf: line 221, column 46
    function value_99 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneral400DV.pr.pcf: line 270, column 46
    function valueRoot_120 () : java.lang.Object {
      return MetroReport
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneral400DV.pr.pcf: line 270, column 46
    function value_118 () : dynamic.Dynamic {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on TextCell (id=MetroReportStatus) at ClaimSnapshotGeneral400DV.pr.pcf: line 275, column 46
    function value_121 () : dynamic.Dynamic {
      return MetroReport.Status
    }
    
    // 'value' attribute on TextCell (id=MetroReportOrderDate) at ClaimSnapshotGeneral400DV.pr.pcf: line 280, column 46
    function value_124 () : dynamic.Dynamic {
      return MetroReport.CreateTime
    }
    
    property get MetroReport () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Address1) at ClaimSnapshotGeneral400DV.pr.pcf: line 135, column 46
    function action_55 () : void {
      ClaimSnapshotFixedPropertyIncidentPopup.push(Claim, prop)
    }
    
    // 'action' attribute on TextCell (id=Address1) at ClaimSnapshotGeneral400DV.pr.pcf: line 135, column 46
    function action_dest_56 () : pcf.api.Destination {
      return pcf.ClaimSnapshotFixedPropertyIncidentPopup.createDestination(Claim, prop)
    }
    
    // 'value' attribute on TextCell (id=Address1) at ClaimSnapshotGeneral400DV.pr.pcf: line 135, column 46
    function valueRoot_58 () : java.lang.Object {
      return prop.Property.Address
    }
    
    // 'value' attribute on TextCell (id=Address1) at ClaimSnapshotGeneral400DV.pr.pcf: line 135, column 46
    function value_54 () : dynamic.Dynamic {
      return prop.Property.Address.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimSnapshotGeneral400DV.pr.pcf: line 140, column 46
    function value_59 () : dynamic.Dynamic {
      return prop.Property.Address.City
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotGeneral400DV.pr.pcf: line 145, column 46
    function value_62 () : dynamic.Dynamic {
      return prop.Property.Address.State
    }
    
    property get prop () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}