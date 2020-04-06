package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure300DV_PropertyDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 141, column 75
    function sortValue_40 (Lienholder :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Lienholder.Lienholder)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 146, column 46
    function sortValue_41 (Lienholder :  dynamic.Dynamic) : java.lang.Object {
      return Lienholder.OwnerType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 253, column 46
    function sortValue_76 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 258, column 46
    function sortValue_77 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 263, column 46
    function sortValue_78 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 268, column 46
    function sortValue_79 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 273, column 46
    function sortValue_80 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 24, column 38
    function value_0 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LossParty")
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 48, column 38
    function value_10 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "State")
    }
    
    // 'value' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 293, column 51
    function value_103 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["FuturePayments"]
    }
    
    // 'value' attribute on TextInput (id=TotalPayments) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 299, column 51
    function value_107 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalPayments"]
    }
    
    // 'value' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 305, column 53
    function value_111 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "TotalRecoveries")
    }
    
    // 'value' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 311, column 59
    function value_115 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalIncurredNet"]
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 52, column 112
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CreateTime") )
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 56, column 111
    function value_14 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CloseDate") )
    }
    
    // 'value' attribute on TextInput (id=ReOpenDate) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 60, column 112
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "ReOpenDate") )
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 65, column 38
    function value_18 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClosedOutcome")
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 29, column 38
    function value_2 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "PrimaryCoverage")
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 69, column 110
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "StatLine") )
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 76, column 119
    function value_22 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 81, column 38
    function value_24 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClaimantType")
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 88, column 38
    function value_26 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(SnapshotParam, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 92, column 123
    function value_28 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=ClaimantAddress) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 96, column 147
    function value_30 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"]["PrimaryAddress"] )
    }
    
    // 'value' attribute on TextInput (id=PropertyDesc) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 104, column 38
    function value_32 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "PropertyDesc")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 111, column 38
    function value_34 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Description")
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 116, column 38
    function value_36 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LossEstimate")
    }
    
    // 'value' attribute on TextInput (id=PolicyLocation) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 125, column 110
    function value_38 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "Property") )
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 34, column 38
    function value_4 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "CoverageSubType")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 136, column 44
    function value_47 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(Exposure, "Property")["Lienholders"] as Object[]
    }
    
    // 'value' attribute on BooleanRadioInput (id=InspectionRequired) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 160, column 38
    function value_48 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "InspectionRequired")
    }
    
    // 'value' attribute on TextInput (id=WhenToView) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 165, column 38
    function value_50 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "WhenToView")
    }
    
    // 'value' attribute on TextInput (id=LocationStreet) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 170, column 38
    function value_52 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationStreet")
    }
    
    // 'value' attribute on TextInput (id=LocationCity) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 175, column 38
    function value_54 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationCity")
    }
    
    // 'value' attribute on TextInput (id=LocationState) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 180, column 38
    function value_56 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationState")
    }
    
    // 'value' attribute on TextInput (id=LocationZip) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 185, column 38
    function value_58 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LocationZip")
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 38, column 127
    function value_6 () : java.lang.String {
      return util.Snapshot.getCoverageName(SnapshotParam, util.Snapshot.getPropertyValue(Exposure, "Coverage"))
    }
    
    // 'value' attribute on TextInput (id=EstimatesReceived) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 193, column 38
    function value_60 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "EstimatesReceived")
    }
    
    // 'value' attribute on TextInput (id=EstRepairCost) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 198, column 38
    function value_62 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "EstRepairCost")
    }
    
    // 'value' attribute on TextInput (id=EstRepairTime) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 203, column 38
    function value_64 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "EstRepairTime")
    }
    
    // 'value' attribute on TextInput (id=RepairShop) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 208, column 38
    function value_66 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "RepairShop")
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 216, column 38
    function value_68 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Segment")
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 221, column 38
    function value_70 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Strategy")
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 226, column 38
    function value_72 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "JurisdictionState")
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 236, column 38
    function value_74 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "OtherCoverage")
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 43, column 38
    function value_8 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "AssignedUser")["Contact"]
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 247, column 44
    function value_96 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(Exposure, "OtherCoverageDet") as Object[]
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 287, column 51
    function value_99 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["RemainingReserves"]
    }
    
    // 'visible' attribute on TextInput (id=FuturePayments) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 293, column 51
    function visible_102 () : java.lang.Boolean {
      return perm.Claim.viewpayments(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalRecoveries) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 305, column 53
    function visible_110 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(Claim)
    }
    
    // 'visible' attribute on TextInput (id=TotalIncurredNet) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 311, column 59
    function visible_114 () : java.lang.Boolean {
      return perm.Claim.viewnettotalincurred(Claim)
    }
    
    // 'visible' attribute on Label at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 281, column 61
    function visible_97 () : java.lang.Boolean {
      return perm.Claim.viewtransactiondetails(Claim)
    }
    
    // 'visible' attribute on TextInput (id=RemainingReserves) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 287, column 51
    function visible_98 () : java.lang.Boolean {
      return perm.Claim.viewreserves(Claim)
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
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotExposure300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 253, column 46
    function valueRoot_83 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 253, column 46
    function value_81 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 258, column 46
    function value_84 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 263, column 46
    function value_87 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 268, column 46
    function value_90 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 273, column 46
    function value_93 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 146, column 46
    function valueRoot_46 () : java.lang.Object {
      return Lienholder
    }
    
    // 'value' attribute on TextCell (id=Lienholder) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 141, column 75
    function value_42 () : java.lang.String {
      return util.Snapshot.renderValue(Lienholder.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType) at ClaimSnapshotExposure300DV.PropertyDamage.pcf: line 146, column 46
    function value_44 () : dynamic.Dynamic {
      return Lienholder.OwnerType
    }
    
    property get Lienholder () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}