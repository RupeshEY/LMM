package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral600PanelSet_TravExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral600PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 133, column 29
    function def_onEnter_58 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.onEnter(Snapshot.LossLocation, Snapshot)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 133, column 29
    function def_refreshVariables_59 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.refreshVariables(Snapshot.LossLocation, Snapshot)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 265, column 48
    function sortValue_104 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.Make
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 271, column 48
    function sortValue_105 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.Model
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 276, column 48
    function sortValue_106 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 281, column 48
    function sortValue_107 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Vehicle.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 286, column 48
    function sortValue_108 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.VehicleLossParty
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 291, column 48
    function sortValue_109 (Vehicle :  dynamic.Dynamic) : java.lang.Object {
      return Vehicle.Driver.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 316, column 48
    function sortValue_133 (FixedPropertyIncidentInstance :  dynamic.Dynamic) : java.lang.Object {
      return FixedPropertyIncidentInstance.Property.Address.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 322, column 48
    function sortValue_134 (FixedPropertyIncidentInstance :  dynamic.Dynamic) : java.lang.Object {
      return FixedPropertyIncidentInstance.Property.Address.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 327, column 48
    function sortValue_135 (FixedPropertyIncidentInstance :  dynamic.Dynamic) : java.lang.Object {
      return FixedPropertyIncidentInstance.Property.Address.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 350, column 48
    function sortValue_150 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 355, column 48
    function sortValue_151 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 360, column 48
    function sortValue_152 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator (id=tripincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 157, column 48
    function sortValue_60 (TripIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return TripIncidentIterator.TripRU.RUNumber + ": " + TripIncidentIterator.TripRU.TripDescription
    }
    
    // 'value' attribute on RowIterator (id=tripincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 163, column 48
    function sortValue_61 (TripIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return TripIncidentIterator.Description
    }
    
    // 'value' attribute on RowIterator (id=baggageincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 191, column 48
    function sortValue_70 (BaggageIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return BaggageIncidentIterator.BaggageType
    }
    
    // 'value' attribute on RowIterator (id=baggageincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 198, column 48
    function sortValue_71 (BaggageIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return BaggageIncidentIterator.PropertyDesc
    }
    
    // 'value' attribute on RowIterator (id=baggageincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 204, column 48
    function sortValue_72 (BaggageIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return BaggageIncidentIterator.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 230, column 48
    function sortValue_87 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.injured.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 236, column 48
    function sortValue_88 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.Severity
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 241, column 48
    function sortValue_89 (InjuryIncidentIterator :  dynamic.Dynamic) : java.lang.Object {
      return InjuryIncidentIterator.Description
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 23, column 40
    function valueRoot_2 () : java.lang.Object {
      return Snapshot
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 91, column 40
    function valueRoot_37 () : java.lang.Object {
      return Snapshot.Reporter
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 96, column 40
    function valueRoot_40 () : java.lang.Object {
      return Snapshot.MainContact
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 33, column 40
    function valueRoot_8 () : java.lang.Object {
      return Snapshot.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 23, column 40
    function value_0 () : dynamic.Dynamic {
      return Snapshot.LOBCode
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 223, column 46
    function value_103 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "InjuryIncident")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 47, column 40
    function value_12 () : dynamic.Dynamic {
      return Snapshot.Description
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 258, column 46
    function value_132 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "VehicleIncident")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 309, column 46
    function value_149 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "FixedPropertyIncident")
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 55, column 40
    function value_15 () : dynamic.Dynamic {
      return Snapshot.LossCause
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 344, column 43
    function value_162 () : dynamic.Dynamic {
      return Snapshot.Officials
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 374, column 40
    function value_163 () : dynamic.Dynamic {
      return Snapshot.CreateTime
    }
    
    // 'value' attribute on TextInput (id=ValidationLevel) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 379, column 40
    function value_166 () : dynamic.Dynamic {
      return Snapshot.ValidationLevel
    }
    
    // 'value' attribute on TextInput (id=Fault) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 60, column 40
    function value_18 () : dynamic.Dynamic {
      return Snapshot.FaultRating
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 67, column 40
    function value_21 () : dynamic.Dynamic {
      return Snapshot.LossDate
    }
    
    // 'value' attribute on TextInput (id=Weather) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 78, column 40
    function value_29 () : dynamic.Dynamic {
      return Snapshot.Weather
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 28, column 40
    function value_3 () : dynamic.Dynamic {
      return Snapshot.LossType
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentCourse) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 83, column 40
    function value_32 () : dynamic.Dynamic {
      return Snapshot.EmploymentInjury
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 91, column 40
    function value_35 () : dynamic.Dynamic {
      return Snapshot.Reporter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 96, column 40
    function value_38 () : dynamic.Dynamic {
      return Snapshot.MainContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 101, column 40
    function value_41 () : dynamic.Dynamic {
      return Snapshot.MainContactType
    }
    
    // 'value' attribute on DateInput (id=ReportedDate) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 107, column 40
    function value_44 () : dynamic.Dynamic {
      return Snapshot.ReportedDate
    }
    
    // 'value' attribute on TextInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 111, column 72
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(Snapshot.FirstNoticeSuit)
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 116, column 40
    function value_49 () : dynamic.Dynamic {
      return Snapshot.HowReported
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 121, column 40
    function value_52 () : dynamic.Dynamic {
      return Snapshot.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 126, column 40
    function value_55 () : dynamic.Dynamic {
      return Snapshot.CoverageInQuestion
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 33, column 40
    function value_6 () : dynamic.Dynamic {
      return Snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=tripincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 149, column 46
    function value_69 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "TripIncident")
    }
    
    // 'value' attribute on RowIterator (id=baggageincident_iterator) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 183, column 46
    function value_86 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(Snapshot.Incidents, "BaggageIncident")
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 38, column 40
    function value_9 () : dynamic.Dynamic {
      return Snapshot.PermissionRequired
    }
    
    // 'visible' attribute on TextInput (id=AtFaultPercentage) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 73, column 65
    function visible_24 () : java.lang.Boolean {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=BaggageType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 191, column 48
    function action_74 () : void {
      ClaimSnapshotBaggageIncidentPopup.push( Claim, BaggageIncidentIterator )
    }
    
    // 'action' attribute on TextCell (id=PropertyDescription) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 198, column 48
    function action_79 () : void {
      ClaimSnapshotBaggageIncidentPopup.push( Claim, BaggageIncidentIterator )
    }
    
    // 'action' attribute on TextCell (id=BaggageType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 191, column 48
    function action_dest_75 () : pcf.api.Destination {
      return pcf.ClaimSnapshotBaggageIncidentPopup.createDestination( Claim, BaggageIncidentIterator )
    }
    
    // 'action' attribute on TextCell (id=PropertyDescription) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 198, column 48
    function action_dest_80 () : pcf.api.Destination {
      return pcf.ClaimSnapshotBaggageIncidentPopup.createDestination( Claim, BaggageIncidentIterator )
    }
    
    // 'value' attribute on TextCell (id=BaggageType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 191, column 48
    function valueRoot_77 () : java.lang.Object {
      return BaggageIncidentIterator
    }
    
    // 'value' attribute on TextCell (id=BaggageType) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 191, column 48
    function value_73 () : dynamic.Dynamic {
      return BaggageIncidentIterator.BaggageType
    }
    
    // 'value' attribute on TextCell (id=PropertyDescription) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 198, column 48
    function value_78 () : dynamic.Dynamic {
      return BaggageIncidentIterator.PropertyDesc
    }
    
    // 'value' attribute on TextCell (id=Baggage) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 204, column 48
    function value_83 () : dynamic.Dynamic {
      return BaggageIncidentIterator.Description
    }
    
    property get BaggageIncidentIterator () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 230, column 48
    function action_91 () : void {
      ClaimSnapshotInjuryIncidentPopup.push(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 236, column 48
    function action_96 () : void {
      ClaimSnapshotInjuryIncidentPopup.push(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 230, column 48
    function action_dest_92 () : pcf.api.Destination {
      return pcf.ClaimSnapshotInjuryIncidentPopup.createDestination(Claim, InjuryIncidentIterator)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 236, column 48
    function action_dest_97 () : pcf.api.Destination {
      return pcf.ClaimSnapshotInjuryIncidentPopup.createDestination(Claim, InjuryIncidentIterator)
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 230, column 48
    function valueRoot_94 () : java.lang.Object {
      return InjuryIncidentIterator.injured
    }
    
    // 'value' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 236, column 48
    function valueRoot_99 () : java.lang.Object {
      return InjuryIncidentIterator
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 241, column 48
    function value_100 () : dynamic.Dynamic {
      return InjuryIncidentIterator.Description
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 230, column 48
    function value_90 () : dynamic.Dynamic {
      return InjuryIncidentIterator.injured.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 236, column 48
    function value_95 () : dynamic.Dynamic {
      return InjuryIncidentIterator.Severity
    }
    
    property get InjuryIncidentIterator () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 265, column 48
    function action_111 () : void {
      ClaimSnapshotVehicleIncidentPopup.push(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Model) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 271, column 48
    function action_116 () : void {
      ClaimSnapshotVehicleIncidentPopup.push(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 265, column 48
    function action_dest_112 () : pcf.api.Destination {
      return pcf.ClaimSnapshotVehicleIncidentPopup.createDestination(Claim, Vehicle)
    }
    
    // 'action' attribute on TextCell (id=Model) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 271, column 48
    function action_dest_117 () : pcf.api.Destination {
      return pcf.ClaimSnapshotVehicleIncidentPopup.createDestination(Claim, Vehicle)
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 265, column 48
    function valueRoot_114 () : java.lang.Object {
      return Vehicle.Vehicle
    }
    
    // 'value' attribute on TextCell (id=LossParty) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 286, column 48
    function valueRoot_128 () : java.lang.Object {
      return Vehicle
    }
    
    // 'value' attribute on TextCell (id=Driver) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 291, column 48
    function valueRoot_131 () : java.lang.Object {
      return Vehicle.Driver
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 265, column 48
    function value_110 () : dynamic.Dynamic {
      return Vehicle.Vehicle.Make
    }
    
    // 'value' attribute on TextCell (id=Model) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 271, column 48
    function value_115 () : dynamic.Dynamic {
      return Vehicle.Vehicle.Model
    }
    
    // 'value' attribute on TextCell (id=License) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 276, column 48
    function value_120 () : dynamic.Dynamic {
      return Vehicle.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 281, column 48
    function value_123 () : dynamic.Dynamic {
      return Vehicle.Vehicle.State
    }
    
    // 'value' attribute on TextCell (id=LossParty) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 286, column 48
    function value_126 () : dynamic.Dynamic {
      return Vehicle.VehicleLossParty
    }
    
    // 'value' attribute on TextCell (id=Driver) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 291, column 48
    function value_129 () : dynamic.Dynamic {
      return Vehicle.Driver.DisplayName
    }
    
    property get Vehicle () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 316, column 48
    function action_137 () : void {
      ClaimSnapshotFixedPropertyIncidentPopup.push(Claim, FixedPropertyIncidentInstance)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 322, column 48
    function action_142 () : void {
      ClaimSnapshotFixedPropertyIncidentPopup.push(Claim, FixedPropertyIncidentInstance)
    }
    
    // 'action' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 316, column 48
    function action_dest_138 () : pcf.api.Destination {
      return pcf.ClaimSnapshotFixedPropertyIncidentPopup.createDestination(Claim, FixedPropertyIncidentInstance)
    }
    
    // 'action' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 322, column 48
    function action_dest_143 () : pcf.api.Destination {
      return pcf.ClaimSnapshotFixedPropertyIncidentPopup.createDestination(Claim, FixedPropertyIncidentInstance)
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 316, column 48
    function valueRoot_140 () : java.lang.Object {
      return FixedPropertyIncidentInstance.Property.Address
    }
    
    // 'value' attribute on TextCell (id=Make) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 316, column 48
    function value_136 () : dynamic.Dynamic {
      return FixedPropertyIncidentInstance.Property.Address.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=Severity) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 322, column 48
    function value_141 () : dynamic.Dynamic {
      return FixedPropertyIncidentInstance.Property.Address.City
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 327, column 48
    function value_146 () : dynamic.Dynamic {
      return FixedPropertyIncidentInstance.Property.Address.State
    }
    
    property get FixedPropertyIncidentInstance () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 350, column 48
    function valueRoot_155 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 350, column 48
    function value_153 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 355, column 48
    function value_156 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 360, column 48
    function value_159 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=TripRU) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 157, column 48
    function action_63 () : void {
      ClaimSnapshotTripIncidentPopup.push( Claim, TripIncidentIterator )
    }
    
    // 'action' attribute on TextCell (id=TripRU) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 157, column 48
    function action_dest_64 () : pcf.api.Destination {
      return pcf.ClaimSnapshotTripIncidentPopup.createDestination( Claim, TripIncidentIterator )
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 163, column 48
    function valueRoot_68 () : java.lang.Object {
      return TripIncidentIterator
    }
    
    // 'value' attribute on TextCell (id=TripRU) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 157, column 48
    function value_62 () : dynamic.Dynamic {
      return TripIncidentIterator.TripRU.RUNumber + ": " + TripIncidentIterator.TripRU.TripDescription
    }
    
    // 'value' attribute on TextCell (id=Description) at ClaimSnapshotGeneral600PanelSet.Trav.pcf: line 163, column 48
    function value_66 () : dynamic.Dynamic {
      return TripIncidentIterator.Description
    }
    
    property get TripIncidentIterator () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}