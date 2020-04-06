package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FailedAssignmentsLV_ClaimExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at FailedAssignmentsLV.Claim.pcf: line 26, column 43
    function sortValue_0 (Claim :  Claim) : java.lang.Object {
      return Claim.Flagged
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Claim.pcf: line 17, column 39
    function value_19 () : entity.Assignable[] {
      return AssignmentPopup.getFailedAssignables()
    }
    
    // 'type' attribute on RowIterator at FailedAssignmentsLV.Claim.pcf: line 17, column 39
    function verifyIteratorType_20 () : void {
      var entry : entity.Assignable = null
      var typedEntry : Claim
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as Claim
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FailedAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at FailedAssignmentsLV.Claim.pcf: line 26, column 43
    function valueRoot_3 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at FailedAssignmentsLV.Claim.pcf: line 37, column 46
    function valueRoot_9 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at FailedAssignmentsLV.Claim.pcf: line 26, column 43
    function value_1 () : java.lang.Boolean {
      return Claim.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=Insured) at FailedAssignmentsLV.Claim.pcf: line 43, column 39
    function value_10 () : entity.Contact {
      return Claim.InsuredDenorm
    }
    
    // 'value' attribute on DateCell (id=LossDate) at FailedAssignmentsLV.Claim.pcf: line 48, column 35
    function value_13 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at FailedAssignmentsLV.Claim.pcf: line 54, column 43
    function value_16 () : typekey.ClaimState {
      return Claim.State
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at FailedAssignmentsLV.Claim.pcf: line 32, column 38
    function value_4 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at FailedAssignmentsLV.Claim.pcf: line 37, column 46
    function value_7 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    property get Claim () : Claim {
      return getIteratedValue(1) as Claim
    }
    
    
  }
  
  
}