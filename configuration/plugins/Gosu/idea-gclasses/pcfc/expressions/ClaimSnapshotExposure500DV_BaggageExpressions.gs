package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotExposure500DV.Baggage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure500DV_BaggageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotExposure500DV.Baggage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure500DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=Baggage_Incident) at ClaimSnapshotExposure500DV.Baggage.pcf: line 87, column 38
    function label_31 () : java.lang.Object {
      return Exposure.BaggageIncident.DelayOnly == true ? DisplayKey.get("Web.BaggageIncident.DelayDescription") : DisplayKey.get("Web.BaggageIncident.Description")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 133, column 46
    function sortValue_48 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 138, column 46
    function sortValue_49 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 143, column 46
    function sortValue_50 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 148, column 46
    function sortValue_51 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 153, column 46
    function sortValue_52 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure500DV.Baggage.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure500DV.Baggage.pcf: line 72, column 38
    function valueRoot_27 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Baggage_Type) at ClaimSnapshotExposure500DV.Baggage.pcf: line 81, column 38
    function valueRoot_30 () : java.lang.Object {
      return Exposure.BaggageIncident
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotExposure500DV.Baggage.pcf: line 26, column 38
    function valueRoot_5 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure500DV.Baggage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure500DV.Baggage.pcf: line 40, column 63
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Coverage)
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure500DV.Baggage.pcf: line 44, column 65
    function value_14 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure500DV.Baggage.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure500DV.Baggage.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure500DV.Baggage.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure500DV.Baggage.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotExposure500DV.Baggage.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Baggage_Type) at ClaimSnapshotExposure500DV.Baggage.pcf: line 81, column 38
    function value_28 () : dynamic.Dynamic {
      return Exposure.BaggageIncident.BaggageType
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotExposure500DV.Baggage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.Incident.Severity
    }
    
    // 'value' attribute on TextInput (id=Baggage_Incident) at ClaimSnapshotExposure500DV.Baggage.pcf: line 87, column 38
    function value_32 () : dynamic.Dynamic {
      return Exposure.BaggageIncident.Description
    }
    
    // 'value' attribute on TextInput (id=DelayOnly) at ClaimSnapshotExposure500DV.Baggage.pcf: line 92, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.BaggageIncident.DelayOnly
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposure500DV.Baggage.pcf: line 102, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.Segment
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposure500DV.Baggage.pcf: line 107, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.Strategy
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure500DV.Baggage.pcf: line 117, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure500DV.Baggage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure500DV.Baggage.pcf: line 127, column 41
    function value_68 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure500DV.Baggage.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/500/ClaimSnapshotExposure500DV.Baggage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure500DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure500DV.Baggage.pcf: line 133, column 46
    function valueRoot_55 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure500DV.Baggage.pcf: line 133, column 46
    function value_53 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure500DV.Baggage.pcf: line 138, column 46
    function value_56 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure500DV.Baggage.pcf: line 143, column 46
    function value_59 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure500DV.Baggage.pcf: line 148, column 46
    function value_62 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure500DV.Baggage.pcf: line 153, column 46
    function value_65 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}