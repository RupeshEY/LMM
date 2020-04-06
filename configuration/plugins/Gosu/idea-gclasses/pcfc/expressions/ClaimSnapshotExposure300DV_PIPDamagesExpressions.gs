package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure300DV_PIPDamagesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "PriorEmpData")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 194, column 81
    function sortValue_61 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 199, column 46
    function sortValue_62 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 204, column 46
    function sortValue_63 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on TextInput (id=LossParty) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 29, column 38
    function value_1 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "LossParty")
    }
    
    // 'value' attribute on TextInput (id=State) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 53, column 38
    function value_11 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "State")
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 57, column 112
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CreateTime") )
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 61, column 111
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "CloseDate") )
    }
    
    // 'value' attribute on TextInput (id=ReOpenDate) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 65, column 112
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "ReOpenDate") )
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 70, column 38
    function value_19 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClosedOutcome")
    }
    
    // 'value' attribute on TextInput (id=StatLine) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 74, column 110
    function value_21 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "StatLine") )
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 81, column 119
    function value_23 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=ClaimantType) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 86, column 38
    function value_25 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ClaimantType")
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 93, column 38
    function value_27 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(SnapshotParam, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 97, column 123
    function value_29 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 34, column 38
    function value_3 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "PrimaryCoverage")
    }
    
    // 'value' attribute on TextInput (id=ClaimantAddress) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 101, column 147
    function value_31 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"]["PrimaryAddress"] )
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 111, column 38
    function value_33 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Claimant")["Occupation"]
    }
    
    // 'value' attribute on TextInput (id=ContactCompany) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 115, column 138
    function value_35 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "Claimant")["ContactCompany"] )
    }
    
    // 'value' attribute on TextInput (id=PrimaryContact) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 119, column 166
    function value_37 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Exposure, "Claimant")["ContactCompany"]["PrimaryContact"] )
    }
    
    // 'value' attribute on TextInput (id=HireDate) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 123, column 114
    function value_39 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(PriorEmpData, "HireDate") )
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 128, column 38
    function value_41 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "EmploymentStatus")
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 133, column 38
    function value_43 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "NumHoursWorked")
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 138, column 38
    function value_45 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "NumDaysWorked")
    }
    
    // 'value' attribute on TextInput (id=WageAmount) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 143, column 38
    function value_47 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "WageAmount")
    }
    
    // 'value' attribute on TextInput (id=OvertimeRate) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 148, column 38
    function value_49 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "OvertimeRate")
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 39, column 38
    function value_5 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "CoverageSubType")
    }
    
    // 'value' attribute on TextInput (id=LastYearIncome) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 153, column 38
    function value_51 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "LastYearIncome")
    }
    
    // 'value' attribute on TextInput (id=PayPeriod) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 158, column 38
    function value_53 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "PayPeriod")
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 165, column 38
    function value_55 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "WagePaymentCont")
    }
    
    // 'value' attribute on TextInput (id=InjuryStartTime) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 170, column 38
    function value_57 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "InjuryStartTime")
    }
    
    // 'value' attribute on TextInput (id=DaysWorkedWeek) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 175, column 38
    function value_59 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(PriorEmpData, "DaysWorkedWeek")
    }
    
    // 'value' attribute on TextInput (id=Coverage) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 43, column 127
    function value_7 () : java.lang.String {
      return util.Snapshot.getCoverageName(SnapshotParam, util.Snapshot.getPropertyValue(Exposure, "Coverage"))
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 189, column 44
    function value_72 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(PriorEmpData, "WorkStatusChanges") as Object[]
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 216, column 38
    function value_73 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Segment")
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 221, column 38
    function value_75 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "Strategy")
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 226, column 38
    function value_77 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "JurisdictionState")
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 48, column 38
    function value_9 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "AssignedUser")["Contact"]
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
    
    property get PriorEmpData () : dynamic.Dynamic {
      return getVariableValue("PriorEmpData", 0) as dynamic.Dynamic
    }
    
    property set PriorEmpData ($arg :  dynamic.Dynamic) {
      setVariableValue("PriorEmpData", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 199, column 46
    function valueRoot_68 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 194, column 81
    function value_64 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 199, column 46
    function value_66 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotExposure300DV.PIPDamages.pcf: line 204, column 46
    function value_69 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}