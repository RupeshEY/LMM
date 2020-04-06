package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotInjuredInjuryIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuredInjuryIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Incident :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSnapshotInjuredInjuryIncidentPopup) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 9, column 70
    static function canVisit_79 (Claim :  Claim, Incident :  dynamic.Dynamic) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsnapshot
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 72, column 42
    function valueRoot_29 () : java.lang.Object {
      return (Incident).injured
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 29, column 42
    function valueRoot_3 () : java.lang.Object {
      return (Incident).injured.Person
    }
    
    // 'value' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 35, column 68
    function valueRoot_8 () : java.lang.Object {
      return (Incident).injured.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 29, column 42
    function value_1 () : dynamic.Dynamic {
      return (Incident).injured.Person.DisplayName
    }
    
    // 'value' attribute on TextInput (id=reporter_homephone) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 45, column 42
    function value_12 () : dynamic.Dynamic {
      return (Incident).injured.Person.HomePhone
    }
    
    // 'value' attribute on TextInput (id=reporter_mobile) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 50, column 42
    function value_15 () : dynamic.Dynamic {
      return (Incident).injured.Person.CellPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_primarytype) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 55, column 42
    function value_18 () : dynamic.Dynamic {
      return (Incident).injured.Person.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 60, column 42
    function value_21 () : dynamic.Dynamic {
      return (Incident).injured.Person.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Email2) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 66, column 42
    function value_24 () : dynamic.Dynamic {
      return (Incident).injured.Person.EmailAddress2
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 72, column 42
    function value_27 () : dynamic.Dynamic {
      return (Incident).injured.Notes
    }
    
    // 'value' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 35, column 68
    function value_5 () : dynamic.Dynamic {
      return (Incident).injured.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=reporter_businessphone) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 40, column 42
    function value_9 () : dynamic.Dynamic {
      return (Incident).injured.Person.WorkPhone
    }
    
    // 'visible' attribute on TextInput (id=reporter_Address) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 35, column 68
    function visible_4 () : java.lang.Boolean {
      return ((Incident).injured.PrimaryAddress) != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotInjuredInjuryIncidentPopup {
      return super.CurrentLocation as pcf.ClaimSnapshotInjuredInjuryIncidentPopup
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentInputSetExpressionsImpl extends ClaimSnapshotInjuredInjuryIncidentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 83, column 31
    function initialValue_30 () : boolean {
      return (Incident).MedicalTreatmentType != null || (Incident).PrimaryDoctor != null
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 131, column 40
    function sortValue_43 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 137, column 52
    function sortValue_44 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 143, column 52
    function sortValue_45 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 88, column 44
    function valueRoot_33 () : java.lang.Object {
      return (Incident)
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 192, column 44
    function valueRoot_75 () : java.lang.Object {
      return (Incident).PrimaryDoctor
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 88, column 44
    function value_31 () : dynamic.Dynamic {
      return (Incident).Severity
    }
    
    // 'value' attribute on TextAreaInput (id=InjuryDescription) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 94, column 44
    function value_34 () : dynamic.Dynamic {
      return (Incident).Description
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjuryType) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 99, column 44
    function value_37 () : dynamic.Dynamic {
      return (Incident).GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=DetailedInjuryType) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 104, column 44
    function value_40 () : dynamic.Dynamic {
      return (Incident).DetailedInjuryType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 120, column 47
    function value_65 () : dynamic.Dynamic {
      return Incident.BodyParts
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReceivedTreatment) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 179, column 33
    function value_66 () : java.lang.Boolean {
      return treatment
    }
    
    // 'value' attribute on TextInput (id=TreatmentType) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 187, column 36
    function value_69 () : dynamic.Dynamic {
      return (Incident).MedicalTreatmentType
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 192, column 44
    function value_73 () : dynamic.Dynamic {
      return (Incident).PrimaryDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LostWages) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 197, column 43
    function value_76 () : dynamic.Dynamic {
      return (Incident).LostWages
    }
    
    property get treatment () : boolean {
      return getVariableValue("treatment", 1) as java.lang.Boolean
    }
    
    property set treatment ($arg :  boolean) {
      setVariableValue("treatment", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotInjuredInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends InjuryIncidentInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 123, column 40
    function condition_46 () : java.lang.Boolean {
      return BodyPartDetails.Ordering == null || (BodyPartDetails.Ordering as java.lang.Double)  > ((Incident).FirstBodyPart.Ordering as java.lang.Double)
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 131, column 40
    function valueRoot_49 () : java.lang.Object {
      return BodyPartDetails
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 131, column 40
    function value_47 () : dynamic.Dynamic {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 137, column 52
    function value_50 () : dynamic.Dynamic {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 143, column 52
    function value_53 () : dynamic.Dynamic {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 152, column 41
    function value_56 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 161, column 41
    function value_59 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments) at ClaimSnapshotInjuredInjuryIncidentPopup.pcf: line 170, column 41
    function value_62 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityComments
    }
    
    property get BodyPartDetails () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  
}