package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotInjuredInjuryIncident700PopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuredInjuryIncident700PopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Incident :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSnapshotInjuredInjuryIncident700Popup) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 9, column 70
    static function canVisit_82 (Claim :  Claim, Incident :  dynamic.Dynamic) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsnapshot
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'value' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 41, column 68
    function valueRoot_11 () : java.lang.Object {
      return (Incident).injured.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=FirstName) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 29, column 42
    function valueRoot_3 () : java.lang.Object {
      return (Incident).injured.Person
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 78, column 42
    function valueRoot_32 () : java.lang.Object {
      return (Incident).injured
    }
    
    // 'value' attribute on TextInput (id=FirstName) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 29, column 42
    function value_1 () : dynamic.Dynamic {
      return (Incident).injured.Person.FirstName
    }
    
    // 'value' attribute on TextInput (id=reporter_businessphone) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 46, column 42
    function value_12 () : dynamic.Dynamic {
      return (Incident).injured.Person.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_homephone) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 51, column 42
    function value_15 () : dynamic.Dynamic {
      return (Incident).injured.Person.HomePhone
    }
    
    // 'value' attribute on TextInput (id=reporter_mobile) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 56, column 42
    function value_18 () : dynamic.Dynamic {
      return (Incident).injured.Person.CellPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_primarytype) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 61, column 42
    function value_21 () : dynamic.Dynamic {
      return (Incident).injured.Person.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 66, column 42
    function value_24 () : dynamic.Dynamic {
      return (Incident).injured.Person.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Email2) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 72, column 42
    function value_27 () : dynamic.Dynamic {
      return (Incident).injured.Person.EmailAddress2
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 78, column 42
    function value_30 () : dynamic.Dynamic {
      return (Incident).injured.Notes
    }
    
    // 'value' attribute on TextInput (id=LastName) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 35, column 42
    function value_4 () : dynamic.Dynamic {
      return (Incident).injured.Person.LastName
    }
    
    // 'value' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 41, column 68
    function value_8 () : dynamic.Dynamic {
      return (Incident).injured.PrimaryAddress.DisplayName
    }
    
    // 'visible' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 41, column 68
    function visible_7 () : java.lang.Boolean {
      return ((Incident).injured.PrimaryAddress) != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotInjuredInjuryIncident700Popup {
      return super.CurrentLocation as pcf.ClaimSnapshotInjuredInjuryIncident700Popup
    }
    
    property get Incident () : dynamic.Dynamic {
      return getVariableValue("Incident", 0) as dynamic.Dynamic
    }
    
    property set Incident ($arg :  dynamic.Dynamic) {
      setVariableValue("Incident", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getVariableValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setVariableValue("Snapshot", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentInputSetExpressionsImpl extends ClaimSnapshotInjuredInjuryIncident700PopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 89, column 31
    function initialValue_33 () : boolean {
      return (Incident).MedicalTreatmentType != null || (Incident).PrimaryDoctor != null
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 137, column 40
    function sortValue_46 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 143, column 52
    function sortValue_47 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 149, column 52
    function sortValue_48 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 94, column 44
    function valueRoot_36 () : java.lang.Object {
      return (Incident)
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 198, column 44
    function valueRoot_78 () : java.lang.Object {
      return (Incident).PrimaryDoctor
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 94, column 44
    function value_34 () : dynamic.Dynamic {
      return (Incident).Severity
    }
    
    // 'value' attribute on TextAreaInput (id=InjuryDescription) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 100, column 44
    function value_37 () : dynamic.Dynamic {
      return (Incident).Description
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjuryType) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 105, column 44
    function value_40 () : dynamic.Dynamic {
      return (Incident).GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=DetailedInjuryType) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 110, column 44
    function value_43 () : dynamic.Dynamic {
      return (Incident).DetailedInjuryType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 126, column 47
    function value_68 () : dynamic.Dynamic {
      return Incident.BodyParts
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReceivedTreatment) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 185, column 33
    function value_69 () : java.lang.Boolean {
      return treatment
    }
    
    // 'value' attribute on TextInput (id=TreatmentType) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 193, column 36
    function value_72 () : dynamic.Dynamic {
      return (Incident).MedicalTreatmentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 198, column 44
    function value_76 () : dynamic.Dynamic {
      return (Incident).PrimaryDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LostWages) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 203, column 43
    function value_79 () : dynamic.Dynamic {
      return (Incident).LostWages
    }
    
    property get treatment () : boolean {
      return getVariableValue("treatment", 1) as java.lang.Boolean
    }
    
    property set treatment ($arg :  boolean) {
      setVariableValue("treatment", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuredInjuryIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends InjuryIncidentInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 129, column 40
    function condition_49 () : java.lang.Boolean {
      return BodyPartDetails.Ordering == null || (BodyPartDetails.Ordering as java.lang.Double)  > ((Incident).FirstBodyPart.Ordering as java.lang.Double)
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 137, column 40
    function valueRoot_52 () : java.lang.Object {
      return BodyPartDetails
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 137, column 40
    function value_50 () : dynamic.Dynamic {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 143, column 52
    function value_53 () : dynamic.Dynamic {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 149, column 52
    function value_56 () : dynamic.Dynamic {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 158, column 41
    function value_59 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 167, column 41
    function value_62 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments) at ClaimSnapshotInjuredInjuryIncident700Popup.pcf: line 176, column 41
    function value_65 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityComments
    }
    
    property get BodyPartDetails () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  
}