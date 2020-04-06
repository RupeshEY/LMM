package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureDV_PersonalPropertyDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 145, column 46
    function sortValue_51 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 150, column 46
    function sortValue_52 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 155, column 46
    function sortValue_53 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 160, column 46
    function sortValue_54 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 165, column 46
    function sortValue_55 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 71, column 38
    function valueRoot_26 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=PropertyDesc) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 79, column 38
    function valueRoot_29 () : java.lang.Object {
      return Exposure.MobilePropertyIncident
    }
    
    // 'value' attribute on TextAreaInput (id=DamageDescription) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 86, column 38
    function valueRoot_32 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 43, column 63
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.StatLine)
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 50, column 63
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 55, column 38
    function value_17 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 62, column 38
    function value_20 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 66, column 67
    function value_22 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 71, column 38
    function value_24 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PropertyDesc) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 79, column 38
    function value_27 () : dynamic.Dynamic {
      return Exposure.MobilePropertyIncident.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextAreaInput (id=DamageDescription) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 86, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 91, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=EstimatesReceived) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 99, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.MobilePropertyIncident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstRepairCost) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 104, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.MobilePropertyIncident.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstRepairTime) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 109, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.MobilePropertyIncident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 119, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 129, column 38
    function value_48 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 139, column 41
    function value_71 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 35, column 63
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Coverage)
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposureDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 145, column 46
    function valueRoot_58 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 145, column 46
    function value_56 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 150, column 46
    function value_59 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 155, column 46
    function value_62 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 160, column 46
    function value_65 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposureDV.PersonalPropertyDamage.pcf: line 165, column 46
    function value_68 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}