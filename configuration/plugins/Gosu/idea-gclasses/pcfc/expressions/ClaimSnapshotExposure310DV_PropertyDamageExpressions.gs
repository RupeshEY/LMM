package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure310DV_PropertyDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 250, column 46
    function sortValue_102 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 255, column 46
    function sortValue_103 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 260, column 46
    function sortValue_104 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 265, column 46
    function sortValue_105 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 270, column 46
    function sortValue_106 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 139, column 75
    function sortValue_52 (Lienholder :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Lienholder.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 144, column 46
    function sortValue_53 (Lienholder :  dynamic.Dynamic) : java.lang.Object {
      return Lienholder.OwnerType
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 284, column 51
    function valueRoot_128 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 40, column 38
    function valueRoot_13 () : java.lang.Object {
      return Exposure.AssignedUser
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 94, column 38
    function valueRoot_39 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=PolicyLocation) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 124, column 38
    function valueRoot_51 () : java.lang.Object {
      return Exposure.Property
    }
    
    // 'value' attribute on BooleanRadioInput (id=InspectionRequired) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 158, column 38
    function valueRoot_62 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 40, column 38
    function value_11 () : dynamic.Dynamic {
      return Exposure.AssignedUser.Contact
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 244, column 41
    function value_122 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 284, column 51
    function value_125 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 290, column 51
    function value_130 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on TextInput (id=TotalPayments) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 296, column 51
    function value_135 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 45, column 38
    function value_14 () : dynamic.Dynamic {
      return Exposure.State
    }
    
    // 'value' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 302, column 53
    function value_140 () : dynamic.Dynamic {
      return Exposure.TotalRecoveries
    }
    
    // 'value' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 308, column 59
    function value_145 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.TotalIncurredNet
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 49, column 65
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 53, column 64
    function value_19 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CloseDate)
    }
    
    // 'value' attribute on TextInput (id=ReOpenDate) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 57, column 65
    function value_21 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.ReOpenDate)
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 62, column 38
    function value_23 () : dynamic.Dynamic {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 66, column 63
    function value_26 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.StatLine)
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 73, column 63
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 78, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 85, column 38
    function value_33 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 89, column 67
    function value_35 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 94, column 38
    function value_37 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PropertyDesc) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 102, column 38
    function value_40 () : dynamic.Dynamic {
      return Exposure.PropertyDesc
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 109, column 38
    function value_43 () : dynamic.Dynamic {
      return Exposure.Description
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 114, column 38
    function value_46 () : dynamic.Dynamic {
      return Exposure.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=PolicyLocation) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 124, column 38
    function value_49 () : dynamic.Dynamic {
      return Exposure.Property.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 134, column 41
    function value_59 () : dynamic.Dynamic {
      return Exposure.Property.Lienholders
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on BooleanRadioInput (id=InspectionRequired) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 158, column 38
    function value_60 () : dynamic.Dynamic {
      return Exposure.Incident.InspectionRequired
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 163, column 38
    function value_63 () : dynamic.Dynamic {
      return Exposure.WhenToView
    }
    
    // 'value' attribute on TextInput (id=LocationStreet) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 168, column 38
    function value_66 () : dynamic.Dynamic {
      return Exposure.LocationStreet
    }
    
    // 'value' attribute on TextInput (id=LocationCity) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 173, column 38
    function value_69 () : dynamic.Dynamic {
      return Exposure.LocationCity
    }
    
    // 'value' attribute on TextInput (id=LocationState) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 178, column 38
    function value_72 () : dynamic.Dynamic {
      return Exposure.LocationState
    }
    
    // 'value' attribute on TextInput (id=LocationZip) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 183, column 38
    function value_75 () : dynamic.Dynamic {
      return Exposure.LocationZip
    }
    
    // 'value' attribute on TextInput (id=EstimatesReceived) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 191, column 38
    function value_78 () : dynamic.Dynamic {
      return Exposure.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstRepairCost) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 196, column 38
    function value_81 () : dynamic.Dynamic {
      return Exposure.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstRepairTime) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 201, column 38
    function value_84 () : dynamic.Dynamic {
      return Exposure.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=RepairShop) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 206, column 38
    function value_87 () : dynamic.Dynamic {
      return Exposure.RepairShop
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 35, column 63
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Coverage)
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 214, column 38
    function value_90 () : dynamic.Dynamic {
      return Exposure.Segment
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 219, column 38
    function value_93 () : dynamic.Dynamic {
      return Exposure.Strategy
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 224, column 38
    function value_96 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 234, column 38
    function value_99 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'visible' attribute on Label at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 278, column 61
    function visible_123 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'visible' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 284, column 51
    function visible_124 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
    }
    
    // 'visible' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 290, column 51
    function visible_129 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 302, column 53
    function visible_139 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 308, column 59
    function visible_144 () : java.lang.Boolean {
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
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotExposure310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 250, column 46
    function valueRoot_109 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 250, column 46
    function value_107 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 255, column 46
    function value_110 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 260, column 46
    function value_113 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 265, column 46
    function value_116 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 270, column 46
    function value_119 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 144, column 46
    function valueRoot_58 () : java.lang.Object {
      return Lienholder
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 139, column 75
    function value_54 () : java.lang.String {
      return util.Snapshot.renderValue(Lienholder.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotExposure310DV.PropertyDamage.pcf: line 144, column 46
    function value_56 () : dynamic.Dynamic {
      return Lienholder.OwnerType
    }
    
    property get Lienholder () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}