package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure600DV_BodilyInjuryDamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure600DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 118, column 46
    function sortValue_42 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 123, column 46
    function sortValue_43 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 128, column 46
    function sortValue_44 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityDecision
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 133, column 46
    function sortValue_45 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityDecisionDate
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 138, column 46
    function sortValue_46 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityComments
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 204, column 46
    function sortValue_83 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 209, column 46
    function sortValue_84 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 214, column 46
    function sortValue_85 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 219, column 46
    function sortValue_86 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 224, column 46
    function sortValue_87 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 72, column 38
    function valueRoot_27 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 84, column 38
    function valueRoot_32 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 89, column 38
    function valueRoot_35 () : java.lang.Object {
      return Exposure.InjuryIncident
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 198, column 41
    function value_103 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AltContact) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 76, column 65
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.AltContact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.Incident.Severity
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 94, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 101, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 112, column 41
    function value_62 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.BodyParts
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 146, column 83
    function value_63 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.InjuryIncident.PrimaryDoctor)
    }
    
    // 'value' attribute on TextInput (id=MedicalTreatment) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 151, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on BooleanRadioInput (id=LostWages) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 158, column 38
    function value_68 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.LostWages
    }
    
    // 'value' attribute on TextInput (id=Impairment) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 163, column 38
    function value_71 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.Impairment
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 168, column 38
    function value_74 () : dynamic.Dynamic {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 178, column 38
    function value_77 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 188, column 38
    function value_80 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 35, column 63
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotExposure600DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 204, column 46
    function valueRoot_90 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 224, column 46
    function value_100 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 204, column 46
    function value_88 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 209, column 46
    function value_91 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 214, column 46
    function value_94 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 219, column 46
    function value_97 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure600DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 118, column 46
    function valueRoot_49 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 118, column 46
    function value_47 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 123, column 46
    function value_50 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 128, column 46
    function value_53 () : dynamic.Dynamic {
      return BodyPart.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 133, column 46
    function value_56 () : dynamic.Dynamic {
      return BodyPart.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments) at ClaimSnapshotExposure600DV.BodilyInjuryDamage.pcf: line 138, column 46
    function value_59 () : dynamic.Dynamic {
      return BodyPart.CompensabilityComments
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}