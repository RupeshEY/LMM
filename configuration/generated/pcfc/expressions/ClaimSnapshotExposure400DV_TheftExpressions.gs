package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.Theft.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure400DV_TheftExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.Theft.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=Vehicle_Incident) at ClaimSnapshotExposure400DV.Theft.pcf: line 81, column 38
    function action_29 () : void {
      ClaimSnapshotVehicleIncidentPopup.push(Claim, Exposure.VehicleIncident)
    }
    
    // 'action' attribute on TextInput (id=Vehicle_Incident) at ClaimSnapshotExposure400DV.Theft.pcf: line 81, column 38
    function action_dest_30 () : pcf.api.Destination {
      return pcf.ClaimSnapshotVehicleIncidentPopup.createDestination(Claim, Exposure.VehicleIncident)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 137, column 46
    function sortValue_51 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 142, column 46
    function sortValue_52 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 147, column 46
    function sortValue_53 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 152, column 46
    function sortValue_54 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 157, column 46
    function sortValue_55 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure400DV.Theft.pcf: line 21, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=ClaimantAddress) at ClaimSnapshotExposure400DV.Theft.pcf: line 72, column 38
    function valueRoot_27 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Incident) at ClaimSnapshotExposure400DV.Theft.pcf: line 81, column 38
    function valueRoot_32 () : java.lang.Object {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at ClaimSnapshotExposure400DV.Theft.pcf: line 86, column 38
    function valueRoot_35 () : java.lang.Object {
      return Exposure.VehicleIncident.Driver
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure400DV.Theft.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure400DV.Theft.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure400DV.Theft.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure400DV.Theft.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure400DV.Theft.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure400DV.Theft.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure400DV.Theft.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantAddress) at ClaimSnapshotExposure400DV.Theft.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Vehicle_Incident) at ClaimSnapshotExposure400DV.Theft.pcf: line 81, column 38
    function value_28 () : dynamic.Dynamic {
      return Exposure.VehicleIncident.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure400DV.Theft.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Incident_Driver) at ClaimSnapshotExposure400DV.Theft.pcf: line 86, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.VehicleIncident.Driver.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Incident_Description) at ClaimSnapshotExposure400DV.Theft.pcf: line 91, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Incident_VehicleOperable) at ClaimSnapshotExposure400DV.Theft.pcf: line 96, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.VehicleIncident.VehicleOperable
    }
    
    // 'value' attribute on TextInput (id=Incident_LossEstimate) at ClaimSnapshotExposure400DV.Theft.pcf: line 101, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.VehicleIncident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure400DV.Theft.pcf: line 111, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage) at ClaimSnapshotExposure400DV.Theft.pcf: line 121, column 38
    function value_48 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure400DV.Theft.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.Theft.pcf: line 131, column 41
    function value_71 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure400DV.Theft.pcf: line 35, column 63
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.Theft.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure400DV.Theft.pcf: line 137, column 46
    function valueRoot_58 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ClaimSnapshotExposure400DV.Theft.pcf: line 137, column 46
    function value_56 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ClaimSnapshotExposure400DV.Theft.pcf: line 142, column 46
    function value_59 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName) at ClaimSnapshotExposure400DV.Theft.pcf: line 147, column 46
    function value_62 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone) at ClaimSnapshotExposure400DV.Theft.pcf: line 152, column 46
    function value_65 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotExposure400DV.Theft.pcf: line 157, column 46
    function value_68 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}