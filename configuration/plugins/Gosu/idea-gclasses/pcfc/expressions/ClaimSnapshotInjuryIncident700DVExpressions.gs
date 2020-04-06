package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotInjuryIncident700DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuryIncident700DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuryIncident700DV.pcf: line 13, column 23
    function initialValue_0 () : boolean {
      return InjuryIncidentInstance.MedicalTreatmentType != null || InjuryIncidentInstance.PrimaryDoctor != null
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuryIncident700DV.pcf: line 64, column 36
    function sortValue_13 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuryIncident700DV.pcf: line 70, column 48
    function sortValue_14 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuryIncident700DV.pcf: line 76, column 48
    function sortValue_15 (BodyPartDetails :  dynamic.Dynamic) : java.lang.Object {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuryIncident700DV.pcf: line 21, column 40
    function valueRoot_3 () : java.lang.Object {
      return InjuryIncidentInstance
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuryIncident700DV.pcf: line 125, column 40
    function valueRoot_45 () : java.lang.Object {
      return InjuryIncidentInstance.PrimaryDoctor
    }
    
    // 'value' attribute on TextInput (id=Severity) at ClaimSnapshotInjuryIncident700DV.pcf: line 21, column 40
    function value_1 () : dynamic.Dynamic {
      return InjuryIncidentInstance.Severity
    }
    
    // 'value' attribute on TextInput (id=DetailedInjuryType) at ClaimSnapshotInjuryIncident700DV.pcf: line 37, column 40
    function value_10 () : dynamic.Dynamic {
      return InjuryIncidentInstance.DetailedInjuryType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotInjuryIncident700DV.pcf: line 53, column 43
    function value_35 () : dynamic.Dynamic {
      return InjuryIncidentInstance.BodyParts
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReceivedTreatment) at ClaimSnapshotInjuryIncident700DV.pcf: line 112, column 29
    function value_36 () : java.lang.Boolean {
      return treatment
    }
    
    // 'value' attribute on TextInput (id=TreatmentType) at ClaimSnapshotInjuryIncident700DV.pcf: line 120, column 32
    function value_39 () : dynamic.Dynamic {
      return InjuryIncidentInstance.MedicalTreatmentType
    }
    
    // 'value' attribute on TextAreaInput (id=InjuryDescription) at ClaimSnapshotInjuryIncident700DV.pcf: line 27, column 40
    function value_4 () : dynamic.Dynamic {
      return InjuryIncidentInstance.Description
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor) at ClaimSnapshotInjuryIncident700DV.pcf: line 125, column 40
    function value_43 () : dynamic.Dynamic {
      return InjuryIncidentInstance.PrimaryDoctor.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LostWages) at ClaimSnapshotInjuryIncident700DV.pcf: line 130, column 39
    function value_46 () : dynamic.Dynamic {
      return InjuryIncidentInstance.LostWages
    }
    
    // 'value' attribute on TextInput (id=PrimaryInjuryType) at ClaimSnapshotInjuryIncident700DV.pcf: line 32, column 40
    function value_7 () : dynamic.Dynamic {
      return InjuryIncidentInstance.GeneralInjuryType
    }
    
    property get InjuryIncidentInstance () : dynamic.Dynamic {
      return getRequireValue("InjuryIncidentInstance", 0) as dynamic.Dynamic
    }
    
    property set InjuryIncidentInstance ($arg :  dynamic.Dynamic) {
      setRequireValue("InjuryIncidentInstance", 0, $arg)
    }
    
    property get treatment () : boolean {
      return getVariableValue("treatment", 0) as java.lang.Boolean
    }
    
    property set treatment ($arg :  boolean) {
      setVariableValue("treatment", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotInjuryIncident700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotInjuryIncident700DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimSnapshotInjuryIncident700DV.pcf: line 56, column 36
    function condition_16 () : java.lang.Boolean {
      return BodyPartDetails.Ordering == null || (BodyPartDetails.Ordering as java.lang.Double) > (InjuryIncidentInstance.FirstBodyPart.Ordering as java.lang.Double)
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuryIncident700DV.pcf: line 64, column 36
    function valueRoot_19 () : java.lang.Object {
      return BodyPartDetails
    }
    
    // 'value' attribute on TextCell (id=Ordering) at ClaimSnapshotInjuryIncident700DV.pcf: line 64, column 36
    function value_17 () : dynamic.Dynamic {
      return BodyPartDetails.Ordering
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart) at ClaimSnapshotInjuryIncident700DV.pcf: line 70, column 48
    function value_20 () : dynamic.Dynamic {
      return BodyPartDetails.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart) at ClaimSnapshotInjuryIncident700DV.pcf: line 76, column 48
    function value_23 () : dynamic.Dynamic {
      return BodyPartDetails.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision) at ClaimSnapshotInjuryIncident700DV.pcf: line 85, column 37
    function value_26 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate) at ClaimSnapshotInjuryIncident700DV.pcf: line 94, column 37
    function value_29 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments) at ClaimSnapshotInjuryIncident700DV.pcf: line 103, column 37
    function value_32 () : dynamic.Dynamic {
      return BodyPartDetails.CompensabilityComments
    }
    
    property get BodyPartDetails () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}