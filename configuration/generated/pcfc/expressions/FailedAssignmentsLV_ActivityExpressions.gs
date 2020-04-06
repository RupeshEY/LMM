package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FailedAssignmentsLV_ActivityExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 38, column 40
    function sortValue_0 (Activity :  Activity) : java.lang.Object {
      return Activity.TargetDate
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 44, column 41
    function sortValue_1 (Activity :  Activity) : java.lang.Object {
      return Activity.Priority
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 48, column 37
    function sortValue_2 (Activity :  Activity) : java.lang.Object {
      return Activity.Subject
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 53, column 47
    function sortValue_3 (Activity :  Activity) : java.lang.Object {
      return Activity.Claim.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 58, column 39
    function sortValue_4 (Activity :  Activity) : java.lang.Object {
      return Activity.Claim.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 17, column 39
    function value_27 () : entity.Assignable[] {
      return AssignmentPopup.getFailedAssignables()
    }
    
    // 'type' attribute on RowIterator at FailedAssignmentsLV.Activity.pcf: line 17, column 39
    function verifyIteratorType_28 () : void {
      var entry : entity.Assignable = null
      var typedEntry : Activity
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as Activity
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Activity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FailedAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at FailedAssignmentsLV.Activity.pcf: line 38, column 40
    function fontColor_12 () : java.lang.String {
      return Activity.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on TextCell (id=CaseID) at FailedAssignmentsLV.Activity.pcf: line 53, column 47
    function valueRoot_23 () : java.lang.Object {
      return Activity.Claim
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at FailedAssignmentsLV.Activity.pcf: line 25, column 52
    function valueRoot_7 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on DateCell (id=DueDate) at FailedAssignmentsLV.Activity.pcf: line 38, column 40
    function value_11 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at FailedAssignmentsLV.Activity.pcf: line 44, column 41
    function value_15 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at FailedAssignmentsLV.Activity.pcf: line 48, column 37
    function value_18 () : java.lang.String {
      return Activity.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at FailedAssignmentsLV.Activity.pcf: line 53, column 47
    function value_21 () : java.lang.String {
      return Activity.Claim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at FailedAssignmentsLV.Activity.pcf: line 58, column 39
    function value_24 () : entity.Contact {
      return Activity.Claim.InsuredDenorm
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at FailedAssignmentsLV.Activity.pcf: line 25, column 52
    function value_5 () : java.lang.Boolean {
      return Activity.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at FailedAssignmentsLV.Activity.pcf: line 32, column 39
    function value_8 () : java.lang.Boolean {
      return Activity.Escalated
    }
    
    property get Activity () : Activity {
      return getIteratedValue(1) as Activity
    }
    
    
  }
  
  
}