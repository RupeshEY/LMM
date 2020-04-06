package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure400DV_BodilyInjuryDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 173, column 46
    function sortValue_68 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 178, column 46
    function sortValue_69 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 183, column 46
    function sortValue_70 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 188, column 46
    function sortValue_71 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 193, column 46
    function sortValue_72 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 72, column 38
    function valueRoot_27 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 111, column 38
    function valueRoot_47 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AltContact) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 76, column 65
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.AltContact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.Severity
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.LeadingInjury
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 94, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.DetailedInjury
    }
    
    // 'value' attribute on TextInput (id=PrimaryBodyPart) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 99, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.PrimaryBodyPart
    }
    
    // 'value' attribute on TextInput (id=DetailedBodyPart) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 104, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.DetailedBodyPart
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 111, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 115, column 68
    function value_48 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.PrimaryDoctor)
    }
    
    // 'value' attribute on TextInput (id=MedicalTreatment) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 120, column 38
    function value_50 () : dynamic.Dynamic {
      return Exposure.MedicalTreatment
    }
    
    // 'value' attribute on BooleanRadioInput (id=LostWages) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 127, column 38
    function value_53 () : dynamic.Dynamic {
      return Exposure.LostWages
    }
    
    // 'value' attribute on TextInput (id=Impairment) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 132, column 38
    function value_56 () : dynamic.Dynamic {
      return Exposure.Impairment
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 137, column 38
    function value_59 () : dynamic.Dynamic {
      return Exposure.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 147, column 38
    function value_62 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 157, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 167, column 41
    function value_88 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 35, column 63
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 173, column 46
    function valueRoot_75 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 173, column 46
    function value_73 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 178, column 46
    function value_76 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 183, column 46
    function value_79 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 188, column 46
    function value_82 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 193, column 46
    function value_85 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}