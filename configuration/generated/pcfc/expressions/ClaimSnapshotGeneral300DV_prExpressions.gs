package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneral300DV_prExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.pr.pcf: line 245, column 46
    function sortValue_78 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.pr.pcf: line 250, column 46
    function sortValue_79 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.pr.pcf: line 255, column 46
    function sortValue_80 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=LossType) at ClaimSnapshotGeneral300DV.pr.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossType")
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotGeneral300DV.pr.pcf: line 44, column 38
    function value_10 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "Strategy")
    }
    
    // 'value' attribute on TextInput (id=PermissionRequired) at ClaimSnapshotGeneral300DV.pr.pcf: line 49, column 38
    function value_12 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "PermissionRequired")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneral300DV.pr.pcf: line 58, column 38
    function value_14 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "Description")
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneral300DV.pr.pcf: line 66, column 38
    function value_16 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossCause")
    }
    
    // 'value' attribute on TextInput (id=LossDate) at ClaimSnapshotGeneral300DV.pr.pcf: line 70, column 110
    function value_18 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "LossDate") )
    }
    
    // 'value' attribute on TextInput (id=LOBCode) at ClaimSnapshotGeneral300DV.pr.pcf: line 26, column 38
    function value_2 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LOBCode")
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneral300DV.pr.pcf: line 77, column 114
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "LossLocation") )
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotGeneral300DV.pr.pcf: line 82, column 38
    function value_22 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossLocation")["County"]
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotGeneral300DV.pr.pcf: line 87, column 38
    function value_24 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossLocation")["Country"]
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at ClaimSnapshotGeneral300DV.pr.pcf: line 92, column 38
    function value_26 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LossLocationCode")
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at ClaimSnapshotGeneral300DV.pr.pcf: line 97, column 38
    function value_28 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "JurisdictionState")
    }
    
    // 'value' attribute on TextInput (id=ReportedDate) at ClaimSnapshotGeneral300DV.pr.pcf: line 105, column 114
    function value_30 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "ReportedDate") )
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimSnapshotGeneral300DV.pr.pcf: line 112, column 38
    function value_32 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "FirstNoticeSuit")
    }
    
    // 'value' attribute on TextInput (id=HowReported) at ClaimSnapshotGeneral300DV.pr.pcf: line 117, column 38
    function value_34 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "HowReported")
    }
    
    // 'value' attribute on TextInput (id=Reporter) at ClaimSnapshotGeneral300DV.pr.pcf: line 121, column 108
    function value_36 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getContactByRole(Snapshot, "reporter"))
    }
    
    // 'value' attribute on TextInput (id=DriverRelation) at ClaimSnapshotGeneral300DV.pr.pcf: line 126, column 38
    function value_38 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "DriverRelation")
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotGeneral300DV.pr.pcf: line 30, column 135
    function value_4 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "AssignedUser")["Contact"] )
    }
    
    // 'value' attribute on TextInput (id=MainContact) at ClaimSnapshotGeneral300DV.pr.pcf: line 130, column 111
    function value_40 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getContactByRole(Snapshot, "maincontact"))
    }
    
    // 'value' attribute on TextInput (id=MainContactType) at ClaimSnapshotGeneral300DV.pr.pcf: line 135, column 38
    function value_42 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "MainContactType")
    }
    
    // 'value' attribute on TextInput (id=DateRptdToAgent) at ClaimSnapshotGeneral300DV.pr.pcf: line 139, column 117
    function value_44 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "DateRptdToAgent") )
    }
    
    // 'value' attribute on TextInput (id=FaultRating) at ClaimSnapshotGeneral300DV.pr.pcf: line 143, column 107
    function value_46 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "Fault") )
    }
    
    // 'value' attribute on TextInput (id=CreateTime) at ClaimSnapshotGeneral300DV.pr.pcf: line 150, column 112
    function value_48 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "CreateTime") )
    }
    
    // 'value' attribute on TextInput (id=CloseDate) at ClaimSnapshotGeneral300DV.pr.pcf: line 154, column 111
    function value_50 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "CloseDate") )
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome) at ClaimSnapshotGeneral300DV.pr.pcf: line 159, column 38
    function value_52 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "ClosedOutcome")
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneral300DV.pr.pcf: line 166, column 38
    function value_54 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "IncidentReport")
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimSnapshotGeneral300DV.pr.pcf: line 173, column 38
    function value_56 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "CoverageInQuestion")
    }
    
    // 'value' attribute on TextInput (id=DeductibleStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 178, column 38
    function value_58 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "DeductibleStatus")
    }
    
    // 'value' attribute on TextInput (id=Catastrophe) at ClaimSnapshotGeneral300DV.pr.pcf: line 34, column 95
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.renderValue(Snapshot.Catastrophe) )
    }
    
    // 'value' attribute on TextInput (id=LitigationStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 183, column 38
    function value_60 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "LitigationStatus")
    }
    
    // 'value' attribute on TextInput (id=SubrogationStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 188, column 38
    function value_62 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "SubrogationStatus")
    }
    
    // 'value' attribute on TextInput (id=SalvageStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 193, column 38
    function value_64 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "SalvageStatus")
    }
    
    // 'value' attribute on TextInput (id=OtherRecovStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 198, column 38
    function value_66 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "OtherRecovStatus")
    }
    
    // 'value' attribute on TextInput (id=SIUStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 203, column 38
    function value_68 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "SIUStatus")
    }
    
    // 'value' attribute on TextInput (id=ReinsuranceStatus) at ClaimSnapshotGeneral300DV.pr.pcf: line 208, column 38
    function value_70 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "ReinsuranceStatus")
    }
    
    // 'value' attribute on TextInput (id=Flagged) at ClaimSnapshotGeneral300DV.pr.pcf: line 216, column 38
    function value_72 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "Flagged")
    }
    
    // 'value' attribute on TextInput (id=FlaggedDate) at ClaimSnapshotGeneral300DV.pr.pcf: line 220, column 113
    function value_74 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(Snapshot, "FlaggedDate") )
    }
    
    // 'value' attribute on TextInput (id=FlaggedReason) at ClaimSnapshotGeneral300DV.pr.pcf: line 225, column 38
    function value_76 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "FlaggedReason")
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotGeneral300DV.pr.pcf: line 39, column 38
    function value_8 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Snapshot, "Segment")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneral300DV.pr.pcf: line 239, column 44
    function value_90 () : java.lang.Object[] {
      return util.Snapshot.getPropertyValue(Snapshot, "Officials") as Object[]
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getRequireValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("Snapshot", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneral300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral300DV.pr.pcf: line 245, column 46
    function valueRoot_83 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneral300DV.pr.pcf: line 245, column 46
    function value_81 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneral300DV.pr.pcf: line 250, column 46
    function value_84 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneral300DV.pr.pcf: line 255, column 46
    function value_87 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}