package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotVehicleIncident600DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotVehicleIncident600DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotVehicleIncident600DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotVehicleIncident600DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotVehicleIncident600DV.pcf: line 328, column 27
    function def_onEnter_185 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.onEnter(VehicleIncident.LocationAddress,null)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotVehicleIncident600DV.pcf: line 328, column 27
    function def_refreshVariables_186 (def :  pcf.AddressSnapshot600InputSet) : void {
      def.refreshVariables(VehicleIncident.LocationAddress,null)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotVehicleIncident600DV.pcf: line 189, column 46
    function sortValue_102 (Citation :  dynamic.Dynamic) : java.lang.Object {
      return Citation.CitationNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotVehicleIncident600DV.pcf: line 195, column 46
    function sortValue_103 (Citation :  dynamic.Dynamic) : java.lang.Object {
      return Citation.CitationAuthority
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotVehicleIncident600DV.pcf: line 201, column 46
    function sortValue_104 (Citation :  dynamic.Dynamic) : java.lang.Object {
      return Citation.CitationType
    }
    
    // 'value' attribute on TextInput (id=TowingAgcy_Picker) at ClaimSnapshotVehicleIncident600DV.pcf: line 249, column 38
    function valueRoot_135 () : java.lang.Object {
      return VehicleIncident.TowingAgcy
    }
    
    // 'value' attribute on TextInput (id=RepairShop_Picker) at ClaimSnapshotVehicleIncident600DV.pcf: line 264, column 38
    function valueRoot_144 () : java.lang.Object {
      return VehicleIncident.RepairShop
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LossParty) at ClaimSnapshotVehicleIncident600DV.pcf: line 20, column 38
    function valueRoot_2 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotVehicleIncident600DV.pcf: line 92, column 38
    function valueRoot_49 () : java.lang.Object {
      return VehicleIncident.Driver
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at ClaimSnapshotVehicleIncident600DV.pcf: line 30, column 38
    function valueRoot_8 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LossParty) at ClaimSnapshotVehicleIncident600DV.pcf: line 20, column 38
    function value_0 () : dynamic.Dynamic {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotVehicleIncident600DV.pcf: line 182, column 41
    function value_114 () : dynamic.Dynamic {
      return VehicleIncident.Citations
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotVehicleIncident600DV.pcf: line 216, column 38
    function value_115 () : dynamic.Dynamic {
      return VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_AirbagsDeployed) at ClaimSnapshotVehicleIncident600DV.pcf: line 221, column 38
    function value_118 () : dynamic.Dynamic {
      return VehicleIncident.AirbagsDeployed
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Model) at ClaimSnapshotVehicleIncident600DV.pcf: line 40, column 38
    function value_12 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Model
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at ClaimSnapshotVehicleIncident600DV.pcf: line 226, column 38
    function value_121 () : dynamic.Dynamic {
      return VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on BooleanRadioInput (id=Exposure_EquipmentFailure) at ClaimSnapshotVehicleIncident600DV.pcf: line 231, column 38
    function value_124 () : dynamic.Dynamic {
      return VehicleIncident.EquipmentFailure
    }
    
    // 'value' attribute on BooleanRadioInput (id=Operable) at ClaimSnapshotVehicleIncident600DV.pcf: line 236, column 38
    function value_127 () : dynamic.Dynamic {
      return VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotVehicleIncident600DV.pcf: line 241, column 38
    function value_130 () : dynamic.Dynamic {
      return VehicleIncident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=TowingAgcy_Picker) at ClaimSnapshotVehicleIncident600DV.pcf: line 249, column 38
    function value_133 () : dynamic.Dynamic {
      return VehicleIncident.TowingAgcy.DisplayName
    }
    
    // 'value' attribute on TextInput (id=TowingAgcy_Phone) at ClaimSnapshotVehicleIncident600DV.pcf: line 254, column 38
    function value_136 () : dynamic.Dynamic {
      return VehicleIncident.TowingAgcy.PrimaryPhoneValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=RepWhereDisInd) at ClaimSnapshotVehicleIncident600DV.pcf: line 259, column 38
    function value_139 () : dynamic.Dynamic {
      return VehicleIncident.RepWhereDisInd
    }
    
    // 'value' attribute on TextInput (id=RepairShop_Picker) at ClaimSnapshotVehicleIncident600DV.pcf: line 264, column 38
    function value_142 () : dynamic.Dynamic {
      return VehicleIncident.RepairShop.DisplayName
    }
    
    // 'value' attribute on TextInput (id=RepairShop_Phone) at ClaimSnapshotVehicleIncident600DV.pcf: line 269, column 38
    function value_145 () : dynamic.Dynamic {
      return VehicleIncident.RepairShop.PrimaryPhoneValue
    }
    
    // 'value' attribute on BooleanRadioInput (id=Collision_Indicator) at ClaimSnapshotVehicleIncident600DV.pcf: line 277, column 38
    function value_148 () : dynamic.Dynamic {
      return VehicleIncident.Collision
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Style) at ClaimSnapshotVehicleIncident600DV.pcf: line 45, column 38
    function value_15 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Style
    }
    
    // 'value' attribute on TextInput (id=Speed) at ClaimSnapshotVehicleIncident600DV.pcf: line 283, column 46
    function value_152 () : dynamic.Dynamic {
      return VehicleIncident.Speed
    }
    
    // 'value' attribute on TextInput (id=VehicleDirection) at ClaimSnapshotVehicleIncident600DV.pcf: line 289, column 46
    function value_157 () : dynamic.Dynamic {
      return VehicleIncident.VehicleDirection
    }
    
    // 'value' attribute on TextInput (id=CollisionPoint) at ClaimSnapshotVehicleIncident600DV.pcf: line 295, column 46
    function value_162 () : dynamic.Dynamic {
      return VehicleIncident.CollisionPoint
    }
    
    // 'value' attribute on TextInput (id=Exposure_TrafficViolation) at ClaimSnapshotVehicleIncident600DV.pcf: line 301, column 46
    function value_167 () : dynamic.Dynamic {
      return VehicleIncident.TrafficViolation
    }
    
    // 'value' attribute on BooleanRadioInput (id=InspectionRequired) at ClaimSnapshotVehicleIncident600DV.pcf: line 309, column 38
    function value_171 () : dynamic.Dynamic {
      return VehicleIncident.InspectionRequired
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotVehicleIncident600DV.pcf: line 315, column 55
    function value_175 () : dynamic.Dynamic {
      return VehicleIncident.WhenToView
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Color) at ClaimSnapshotVehicleIncident600DV.pcf: line 50, column 38
    function value_18 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Color
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleLocationInd) at ClaimSnapshotVehicleIncident600DV.pcf: line 325, column 55
    function value_181 () : dynamic.Dynamic {
      return VehicleIncident.LocationInd
    }
    
    // 'value' attribute on BooleanRadioInput (id=RentalRequired) at ClaimSnapshotVehicleIncident600DV.pcf: line 336, column 38
    function value_187 () : dynamic.Dynamic {
      return VehicleIncident.RentalRequired
    }
    
    // 'value' attribute on DateInput (id=RentalBeginDate) at ClaimSnapshotVehicleIncident600DV.pcf: line 343, column 51
    function value_191 () : dynamic.Dynamic {
      return VehicleIncident.RentalBeginDate
    }
    
    // 'value' attribute on DateInput (id=RentalEndDate) at ClaimSnapshotVehicleIncident600DV.pcf: line 350, column 51
    function value_196 () : dynamic.Dynamic {
      return VehicleIncident.RentalEndDate
    }
    
    // 'value' attribute on TextInput (id=RentalDailyRate) at ClaimSnapshotVehicleIncident600DV.pcf: line 356, column 51
    function value_201 () : dynamic.Dynamic {
      return VehicleIncident.RentalDailyRate
    }
    
    // 'value' attribute on TextInput (id=RentalAgency) at ClaimSnapshotVehicleIncident600DV.pcf: line 362, column 51
    function value_206 () : dynamic.Dynamic {
      return VehicleIncident.RentalAgency
    }
    
    // 'value' attribute on TextInput (id=RentalReservationNumber) at ClaimSnapshotVehicleIncident600DV.pcf: line 368, column 51
    function value_211 () : dynamic.Dynamic {
      return VehicleIncident.RentalReserveNo
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VIN) at ClaimSnapshotVehicleIncident600DV.pcf: line 56, column 198
    function value_22 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on TextInput (id=Vehicle_SerialNumber) at ClaimSnapshotVehicleIncident600DV.pcf: line 62, column 196
    function value_27 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.SerialNumber
    }
    
    // 'value' attribute on TextInput (id=Vehicle_VehicleType) at ClaimSnapshotVehicleIncident600DV.pcf: line 25, column 38
    function value_3 () : dynamic.Dynamic {
      return VehicleIncident.VehicleType
    }
    
    // 'value' attribute on TextInput (id=Vehicle_State) at ClaimSnapshotVehicleIncident600DV.pcf: line 67, column 38
    function value_31 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=Vehicle_LicensePlate) at ClaimSnapshotVehicleIncident600DV.pcf: line 72, column 38
    function value_34 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextInput (id=Vehicle_BoatType) at ClaimSnapshotVehicleIncident600DV.pcf: line 78, column 75
    function value_38 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.BoatType
    }
    
    // 'value' attribute on TextInput (id=Vehicle_OffRoadStyle) at ClaimSnapshotVehicleIncident600DV.pcf: line 84, column 138
    function value_43 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.OffRoadStyle
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotVehicleIncident600DV.pcf: line 92, column 38
    function value_47 () : dynamic.Dynamic {
      return VehicleIncident.Driver.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ReasonForUse) at ClaimSnapshotVehicleIncident600DV.pcf: line 97, column 38
    function value_50 () : dynamic.Dynamic {
      return VehicleIncident.VehicleUseReason
    }
    
    // 'value' attribute on TextInput (id=RelationToInsured) at ClaimSnapshotVehicleIncident600DV.pcf: line 102, column 38
    function value_53 () : dynamic.Dynamic {
      return VehicleIncident.DriverRelation
    }
    
    // 'value' attribute on TextInput (id=RelationToOwner) at ClaimSnapshotVehicleIncident600DV.pcf: line 107, column 38
    function value_56 () : dynamic.Dynamic {
      return VehicleIncident.DriverRelToOwner
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnersPermission) at ClaimSnapshotVehicleIncident600DV.pcf: line 112, column 38
    function value_59 () : dynamic.Dynamic {
      return VehicleIncident.OwnersPermission
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Year) at ClaimSnapshotVehicleIncident600DV.pcf: line 30, column 38
    function value_6 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Year
    }
    
    // 'value' attribute on TextInput (id=Driver_IsKidInPolicy) at ClaimSnapshotVehicleIncident600DV.pcf: line 118, column 81
    function value_63 () : dynamic.Dynamic {
      return VehicleIncident.MinorOnPolicy
    }
    
    // 'value' attribute on TextInput (id=Driver_Phone) at ClaimSnapshotVehicleIncident600DV.pcf: line 123, column 38
    function value_67 () : dynamic.Dynamic {
      return VehicleIncident.Driver.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=Driver_IsKidInPolicy_Percentagedriven) at ClaimSnapshotVehicleIncident600DV.pcf: line 129, column 138
    function value_71 () : dynamic.Dynamic {
      return VehicleIncident.PercentagedrivenByMinor
    }
    
    // 'value' attribute on TextAreaInput (id=Driver_Address) at ClaimSnapshotVehicleIncident600DV.pcf: line 136, column 38
    function value_75 () : dynamic.Dynamic {
      return VehicleIncident.Driver.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=Driver_License) at ClaimSnapshotVehicleIncident600DV.pcf: line 141, column 38
    function value_78 () : dynamic.Dynamic {
      return VehicleIncident.Driver.LicenseNumber
    }
    
    // 'value' attribute on TextInput (id=Driver_LicenseState) at ClaimSnapshotVehicleIncident600DV.pcf: line 146, column 38
    function value_81 () : dynamic.Dynamic {
      return VehicleIncident.Driver.LicenseState
    }
    
    // 'value' attribute on BooleanRadioInput (id=LoanInformation_Loan) at ClaimSnapshotVehicleIncident600DV.pcf: line 154, column 38
    function value_84 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Loan
    }
    
    // 'value' attribute on TextInput (id=MonthlyPayment) at ClaimSnapshotVehicleIncident600DV.pcf: line 160, column 49
    function value_88 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.LoanMonthlyPayment
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Make) at ClaimSnapshotVehicleIncident600DV.pcf: line 35, column 38
    function value_9 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.Make
    }
    
    // 'value' attribute on TextInput (id=MonthsRemaining) at ClaimSnapshotVehicleIncident600DV.pcf: line 166, column 50
    function value_93 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.LoanMonthsRemaining
    }
    
    // 'value' attribute on TextInput (id=PayoffAmount) at ClaimSnapshotVehicleIncident600DV.pcf: line 172, column 49
    function value_98 () : dynamic.Dynamic {
      return VehicleIncident.Vehicle.LoanPayoffAmount
    }
    
    // 'visible' attribute on TextInput (id=Speed) at ClaimSnapshotVehicleIncident600DV.pcf: line 283, column 46
    function visible_151 () : java.lang.Boolean {
      return VehicleIncident.Collision
    }
    
    // 'visible' attribute on TextInput (id=WhenToView) at ClaimSnapshotVehicleIncident600DV.pcf: line 315, column 55
    function visible_174 () : java.lang.Boolean {
      return VehicleIncident.InspectionRequired
    }
    
    // 'visible' attribute on DateInput (id=RentalBeginDate) at ClaimSnapshotVehicleIncident600DV.pcf: line 343, column 51
    function visible_190 () : java.lang.Boolean {
      return VehicleIncident.RentalRequired
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_VIN) at ClaimSnapshotVehicleIncident600DV.pcf: line 56, column 198
    function visible_21 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style.Code != "boat" and VehicleIncident.Vehicle.Style.Code != "ATV" and VehicleIncident.Vehicle.Style.Code != "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_SerialNumber) at ClaimSnapshotVehicleIncident600DV.pcf: line 62, column 196
    function visible_26 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style.Code == "boat" or VehicleIncident.Vehicle.Style.Code == "ATV" or VehicleIncident.Vehicle.Style.Code == "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_BoatType) at ClaimSnapshotVehicleIncident600DV.pcf: line 78, column 75
    function visible_37 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style.Code == "boat"
    }
    
    // 'visible' attribute on TextInput (id=Vehicle_OffRoadStyle) at ClaimSnapshotVehicleIncident600DV.pcf: line 84, column 138
    function visible_42 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Style.Code == "ATV" or VehicleIncident.Vehicle.Style.Code == "snowmobile"
    }
    
    // 'visible' attribute on TextInput (id=Driver_IsKidInPolicy) at ClaimSnapshotVehicleIncident600DV.pcf: line 118, column 81
    function visible_62 () : java.lang.Boolean {
      return  VehicleIncident.DriverRelToOwner.Code == "child" 
    }
    
    // 'visible' attribute on TextInput (id=Driver_IsKidInPolicy_Percentagedriven) at ClaimSnapshotVehicleIncident600DV.pcf: line 129, column 138
    function visible_70 () : java.lang.Boolean {
      return  VehicleIncident.DriverRelToOwner.Code == "child" and VehicleIncident.MinorOnPolicy.Code == "No" 
    }
    
    // 'visible' attribute on TextInput (id=MonthlyPayment) at ClaimSnapshotVehicleIncident600DV.pcf: line 160, column 49
    function visible_87 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.Loan
    }
    
    // 'visible' attribute on TextInput (id=MonthsRemaining) at ClaimSnapshotVehicleIncident600DV.pcf: line 166, column 50
    function visible_92 () : java.lang.Boolean {
      return  VehicleIncident.Vehicle.Loan
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get VehicleIncident () : dynamic.Dynamic {
      return getRequireValue("VehicleIncident", 0) as dynamic.Dynamic
    }
    
    property set VehicleIncident ($arg :  dynamic.Dynamic) {
      setRequireValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotVehicleIncident600DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotVehicleIncident600DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CitationsArray_CitationNumber) at ClaimSnapshotVehicleIncident600DV.pcf: line 189, column 46
    function valueRoot_107 () : java.lang.Object {
      return Citation
    }
    
    // 'value' attribute on TextCell (id=CitationsArray_CitationNumber) at ClaimSnapshotVehicleIncident600DV.pcf: line 189, column 46
    function value_105 () : dynamic.Dynamic {
      return Citation.CitationNumber
    }
    
    // 'value' attribute on TextCell (id=CitationsArray_CitationAuthority) at ClaimSnapshotVehicleIncident600DV.pcf: line 195, column 46
    function value_108 () : dynamic.Dynamic {
      return Citation.CitationAuthority
    }
    
    // 'value' attribute on TextCell (id=CitationsArray_CitationType) at ClaimSnapshotVehicleIncident600DV.pcf: line 201, column 46
    function value_111 () : dynamic.Dynamic {
      return Citation.CitationType
    }
    
    property get Citation () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}