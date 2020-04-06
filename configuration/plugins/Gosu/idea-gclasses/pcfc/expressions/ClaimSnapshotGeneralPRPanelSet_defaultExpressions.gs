package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneralPRPanelSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneralPRPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 172, column 29
    function def_onEnter_76 (def :  pcf.AddressSnapshotInputSet) : void {
      def.onEnter(Snapshot.LossLocation, Snapshot)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 172, column 29
    function def_refreshVariables_77 (def :  pcf.AddressSnapshotInputSet) : void {
      def.refreshVariables(Snapshot.LossLocation, Snapshot)
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function sortValue_107 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.injured.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function sortValue_108 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.injured.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function sortValue_109 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.injured.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function sortValue_110 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.injured.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 251, column 48
    function sortValue_111 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.Severity
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 256, column 48
    function sortValue_112 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 278, column 48
    function sortValue_127 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 283, column 48
    function sortValue_128 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 288, column 48
    function sortValue_129 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 327, column 48
    function sortValue_146 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 332, column 48
    function sortValue_147 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 337, column 48
    function sortValue_148 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.CreateTime
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 151, column 48
    function sortValue_61 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 157, column 48
    function sortValue_62 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 162, column 48
    function sortValue_63 (prop :  dynamic.Dynamic) : java.lang.Object {
      return prop.Property.Address.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 193, column 48
    function sortValue_78 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 199, column 48
    function sortValue_79 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 204, column 48
    function sortValue_80 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 209, column 48
    function sortValue_81 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 214, column 48
    function sortValue_82 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.VehicleLossParty
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 219, column 48
    function sortValue_83 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Driver.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 23, column 40
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 61, column 66
    function valueRoot_21 () : java.lang.Object {
      return Snapshot.PropertyFireDamage
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 93, column 40
    function valueRoot_40 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 98, column 40
    function valueRoot_43 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 23, column 40
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 186, column 46
    function value_106 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "VehicleIncident")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 47, column 40
    function value_11 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 237, column 46
    function value_126 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "InjuryIncident")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 272, column 43
    function value_139 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 55, column 40
    function value_14 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 302, column 40
    function value_140 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 307, column 40
    function value_143 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 321, column 43
    function value_158 () : dynamic.Dynamic {
      return Snapshot.MetroReports
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 61, column 66
    function value_18 () : dynamic.Dynamic {
      return Snapshot.PropertyFireDamage.Arson
    }
    
    // 'value' attribute on TextInput (id=LocationOfTheft) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 67, column 70
    function value_23 () : dynamic.Dynamic {
      return Snapshot.LocationOfTheft
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 72, column 40
    function value_27 () : dynamic.Dynamic {
      return Snapshot.FaultRating
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 28, column 40
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 79, column 40
    function value_30 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 93, column 40
    function value_38 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 98, column 40
    function value_41 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 103, column 40
    function value_44 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 109, column 40
    function value_47 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on TextInput (id=FirstNoticeSuit) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 113, column 72
    function value_50 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FirstNoticeSuit)
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 118, column 40
    function value_52 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 123, column 40
    function value_55 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 128, column 40
    function value_58 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 32, column 68
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.Catastrophe)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 143, column 46
    function value_75 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "FixedPropertyIncident")
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 37, column 40
    function value_8 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ArsonInvolved) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 61, column 66
    function visible_17 () : java.lang.Boolean {
      return Snapshot.LossCause.Code == "fire"
    }
    
    // 'visible' attribute on TextInput (id=LocationOfTheft) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 67, column 70
    function visible_22 () : java.lang.Boolean {
      return Snapshot.LossCause.Code == "burglary"
    }
    
    // 'visible' attribute on TextInput (id=AtFaultPercentage) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 85, column 65
    function visible_33 () : java.lang.Boolean {
      return Snapshot.FaultRating.Code == "1"
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneralPRPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 193, column 48
    function action_85 () : void {
      ClaimSnapshotVehicleIncidentPopup.push(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Model) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 199, column 48
    function action_90 () : void {
      ClaimSnapshotVehicleIncidentPopup.push(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 193, column 48
    function action_dest_86 () : pcf.api.Destination {
      return pcf.ClaimSnapshotVehicleIncidentPopup.createDestination(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Model) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 199, column 48
    function action_dest_91 () : pcf.api.Destination {
      return pcf.ClaimSnapshotVehicleIncidentPopup.createDestination(Claim, Vehicle)
    }
    
    // 'value' attribute on TextCell (id=LossParty) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 214, column 48
    function valueRoot_102 () : java.lang.Object {
      return Vehicle
    }
    
    // 'value' attribute on TextCell (id=Driver) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 219, column 48
    function valueRoot_105 () : java.lang.Object {
      return Vehicle.Driver
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 193, column 48
    function valueRoot_88 () : java.lang.Object {
      return Vehicle.Vehicle
    }
    
    // 'value' attribute on TextCell (id=LossParty) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 214, column 48
    function value_100 () : dynamic.Dynamic {
      return Vehicle.VehicleLossParty
    }
    
    // 'value' attribute on TextCell (id=Driver) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 219, column 48
    function value_103 () : dynamic.Dynamic {
      return Vehicle.Driver.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 193, column 48
    function value_84 () : dynamic.Dynamic {
      return Vehicle.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 199, column 48
    function value_89 () : dynamic.Dynamic {
      return Vehicle.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=License) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 204, column 48
    function value_94 () : dynamic.Dynamic {
      return Vehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 209, column 48
    function value_97 () : dynamic.Dynamic {
      return Vehicle.Vehicle.State
    }
    
    property get Vehicle () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneralPRPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function action_114 () : void {
      ClaimSnapshotInjuryIncidentPopup.push(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 251, column 48
    function action_119 () : void {
      ClaimSnapshotInjuryIncidentPopup.push(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function action_dest_115 () : pcf.api.Destination {
      return pcf.ClaimSnapshotInjuryIncidentPopup.createDestination(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 251, column 48
    function action_dest_120 () : pcf.api.Destination {
      return pcf.ClaimSnapshotInjuryIncidentPopup.createDestination(Claim, InjuryIncidentIterator)
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function valueRoot_117 () : java.lang.Object {
      return InjuryIncidentIterator.injured
    }
    
    // 'value' attribute on TextCell (id=Severity) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 251, column 48
    function valueRoot_122 () : java.lang.Object {
      return InjuryIncidentIterator
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 245, column 48
    function value_113 () : dynamic.Dynamic {
      return InjuryIncidentIterator.injured.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Severity) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 251, column 48
    function value_118 () : dynamic.Dynamic {
      return InjuryIncidentIterator.Severity
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 256, column 48
    function value_123 () : dynamic.Dynamic {
      return InjuryIncidentIterator.Description
    }
    
    property get InjuryIncidentIterator () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneralPRPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 278, column 48
    function valueRoot_132 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 278, column 48
    function value_130 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 283, column 48
    function value_133 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 288, column 48
    function value_136 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotGeneralPRPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 327, column 48
    function valueRoot_151 () : java.lang.Object {
      return MetroReport
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 327, column 48
    function value_149 () : dynamic.Dynamic {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on TextCell (id=MetroReportStatus) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 332, column 48
    function value_152 () : dynamic.Dynamic {
      return MetroReport.Status
    }
    
    // 'value' attribute on TextCell (id=MetroReportOrderDate) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 337, column 48
    function value_155 () : dynamic.Dynamic {
      return MetroReport.CreateTime
    }
    
    property get MetroReport () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPRPanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneralPRPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Address1) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 151, column 48
    function action_65 () : void {
      ClaimSnapshotFixedPropertyIncidentPopup.push(Claim, prop)
    }
    
    // 'action' attribute on TextCell (id=Address1) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 151, column 48
    function action_dest_66 () : pcf.api.Destination {
      return pcf.ClaimSnapshotFixedPropertyIncidentPopup.createDestination(Claim, prop)
    }
    
    // 'value' attribute on TextCell (id=Address1) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 151, column 48
    function valueRoot_68 () : java.lang.Object {
      return prop.Property.Address
    }
    
    // 'value' attribute on TextCell (id=Address1) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 151, column 48
    function value_64 () : dynamic.Dynamic {
      return prop.Property.Address.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 157, column 48
    function value_69 () : dynamic.Dynamic {
      return prop.Property.Address.DisplayCity
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotGeneralPRPanelSet.default.pcf: line 162, column 48
    function value_72 () : dynamic.Dynamic {
      return prop.Property.Address.State
    }
    
    property get prop () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}