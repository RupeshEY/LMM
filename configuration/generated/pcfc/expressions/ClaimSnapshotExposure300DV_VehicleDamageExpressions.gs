package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.VehicleDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure300DV_VehicleDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.VehicleDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Vehicle")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 351, column 46
    function sortValue_113 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 356, column 46
    function sortValue_114 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 361, column 46
    function sortValue_115 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 366, column 46
    function sortValue_116 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 371, column 46
    function sortValue_117 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 29, column 38
    function value_1 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LossParty")
    }
    
    // 'value' attribute on TextInput (id=RentalAgency) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 301, column 38
    function value_101 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RentalAgency")
    }
    
    // 'value' attribute on TextInput (id=RentalReserveNo) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 306, column 38
    function value_103 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RentalReserveNo")
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 314, column 38
    function value_105 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Segment")
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 319, column 38
    function value_107 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Strategy")
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 324, column 38
    function value_109 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "JurisdictionState")
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 53, column 38
    function value_11 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "State")
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 334, column 38
    function value_111 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "OtherCoverage")
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 57, column 112
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CreateTime") )
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 345, column 44
    function value_133 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(Exposure, "OtherCoverageDet") as Object[]
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 385, column 51
    function value_136 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["RemainingReserves"]
    }
    
    // 'value' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 391, column 51
    function value_140 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["FuturePayments"]
    }
    
    // 'value' attribute on TextInput (id=TotalPayments) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 397, column 51
    function value_144 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalPayments"]
    }
    
    // 'value' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 403, column 53
    function value_148 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "TotalRecoveries")
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 61, column 111
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CloseDate") )
    }
    
    // 'value' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 409, column 59
    function value_152 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalIncurredNet"]
    }
    
    // 'value' attribute on TextInput (id=ReOpenDate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 65, column 112
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "ReOpenDate") )
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 70, column 38
    function value_19 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClosedOutcome")
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 74, column 110
    function value_21 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "StatLine") )
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 81, column 119
    function value_23 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 86, column 38
    function value_25 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClaimantType")
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 93, column 38
    function value_27 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(SnapshotParam, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 97, column 123
    function value_29 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 34, column 38
    function value_3 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "PrimaryCoverage")
    }
    
    // 'value' attribute on TextInput (id=ClaimantAddress) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 101, column 147
    function value_31 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"]["PrimaryAddress"] )
    }
    
    // 'value' attribute on TextInput (id=Driver) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 108, column 105
    function value_33 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getContactByRole(Claim, "Driver") )
    }
    
    // 'value' attribute on TextInput (id=DriverRelToOwner) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 113, column 38
    function value_35 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "DriverRelToOwner")
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnersPermission) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 120, column 38
    function value_37 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "OwnersPermission")
    }
    
    // 'value' attribute on TextInput (id=DriverPhone) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 124, column 134
    function value_39 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone( util.Snapshot.getExposureClaimContact(SnapshotParam, Exposure, "driver") )
    }
    
    // 'value' attribute on TextInput (id=DriverAddress) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 128, column 158
    function value_41 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getExposureClaimContact(SnapshotParam, Exposure, "driver")["PrimaryAddress"] )
    }
    
    // 'value' attribute on TextInput (id=LicenseState) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 133, column 38
    function value_43 () : dynamic.Dynamic {
      return util.Snapshot.getExposureClaimContact(SnapshotParam, Exposure, "driver")["LicenseState"]
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 138, column 38
    function value_45 () : dynamic.Dynamic {
      return util.Snapshot.getExposureClaimContact(SnapshotParam, Exposure, "driver")["LicenseNumber"]
    }
    
    // 'value' attribute on TextInput (id=Vehicle) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 145, column 53
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(Vehicle)
    }
    
    // 'value' attribute on TextInput (id=Year) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 150, column 38
    function value_49 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Year")
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 39, column 38
    function value_5 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "CoverageSubType")
    }
    
    // 'value' attribute on TextInput (id=Make) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 155, column 38
    function value_51 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Make")
    }
    
    // 'value' attribute on TextInput (id=Model) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 160, column 38
    function value_53 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Model")
    }
    
    // 'value' attribute on TextInput (id=Style) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 165, column 38
    function value_55 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Style")
    }
    
    // 'value' attribute on TextInput (id=Color) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 170, column 38
    function value_57 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Color")
    }
    
    // 'value' attribute on TextInput (id=Vin) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 175, column 38
    function value_59 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "Vin")
    }
    
    // 'value' attribute on TextInput (id=VehicleState) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 180, column 38
    function value_61 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "State")
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 185, column 38
    function value_63 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Vehicle, "LicensePlate")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 196, column 38
    function value_65 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Description")
    }
    
    // 'value' attribute on BooleanRadioInput (id=TotalLoss) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 203, column 38
    function value_67 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "TotalLoss")
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleOperable) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 210, column 38
    function value_69 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "VehicleOperable")
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 43, column 127
    function value_7 () : java.lang.String {
      return util.Snapshot.getCoverageName(SnapshotParam, util.Snapshot.getPropertyValue(Exposure, "Coverage"))
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 215, column 38
    function value_71 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LossEstimate")
    }
    
    // 'value' attribute on TextInput (id=Speed) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 223, column 38
    function value_73 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Speed")
    }
    
    // 'value' attribute on TextInput (id=VehicleDirection) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 228, column 38
    function value_75 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "VehicleDirection")
    }
    
    // 'value' attribute on TextInput (id=CollisionPoint) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 233, column 38
    function value_77 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "CollisionPoint")
    }
    
    // 'value' attribute on BooleanRadioInput (id=InspectionRequired) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 243, column 38
    function value_79 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "InspectionRequired")
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 248, column 38
    function value_81 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "WhenToView")
    }
    
    // 'value' attribute on TextInput (id=LocationStreet) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 253, column 38
    function value_83 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationStreet")
    }
    
    // 'value' attribute on TextInput (id=LocationCity) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 258, column 38
    function value_85 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationCity")
    }
    
    // 'value' attribute on TextInput (id=LocationState) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 263, column 38
    function value_87 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationState")
    }
    
    // 'value' attribute on TextInput (id=LocationZip) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 268, column 38
    function value_89 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationZip")
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 48, column 38
    function value_9 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "AssignedUser")["Contact"]
    }
    
    // 'value' attribute on TextInput (id=RepairShop) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 273, column 38
    function value_91 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RepairShop")
    }
    
    // 'value' attribute on BooleanRadioInput (id=RentalRequired) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 283, column 38
    function value_93 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RentalRequired")
    }
    
    // 'value' attribute on TextInput (id=RentalBeginDate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 287, column 115
    function value_95 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPropertyValue(Exposure, "RentalBeginDate"))
    }
    
    // 'value' attribute on TextInput (id=RentalEndDate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 291, column 113
    function value_97 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPropertyValue(Exposure, "RentalEndDate"))
    }
    
    // 'value' attribute on TextInput (id=RentalDailyRate) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 296, column 38
    function value_99 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RentalDailyRate")
    }
    
    // 'visible' attribute on Label at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 379, column 61
    function visible_134 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'visible' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 385, column 51
    function visible_135 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 391, column 51
    function visible_139 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 403, column 53
    function visible_147 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 409, column 59
    function visible_151 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    property get Vehicle () : dynamic.Dynamic {
      return getVariableValue("Vehicle", 0) as dynamic.Dynamic
    }
    
    property set Vehicle ($arg :  dynamic.Dynamic) {
      setVariableValue("Vehicle", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.VehicleDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 351, column 46
    function valueRoot_120 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 351, column 46
    function value_118 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 356, column 46
    function value_121 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 361, column 46
    function value_124 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 366, column 46
    function value_127 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure300DV.VehicleDamage.pcf: line 371, column 46
    function value_130 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}