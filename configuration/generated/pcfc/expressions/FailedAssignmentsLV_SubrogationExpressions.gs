package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FailedAssignmentsLV_SubrogationExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Subrogation.pcf: line 25, column 45
    function sortValue_0 (Subrogation :  Subrogation) : java.lang.Object {
      return Subrogation.Exposure?: "Claim"
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Subrogation.pcf: line 32, column 50
    function sortValue_1 (Subrogation :  Subrogation) : java.lang.Object {
      return Subrogation.Status
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Subrogation.pcf: line 16, column 39
    function value_7 () : entity.Assignable[] {
      return AssignmentPopup.getFailedAssignables()
    }
    
    // 'type' attribute on RowIterator at FailedAssignmentsLV.Subrogation.pcf: line 16, column 39
    function verifyIteratorType_8 () : void {
      var entry : entity.Assignable = null
      var typedEntry : Subrogation
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as Subrogation
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FailedAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at FailedAssignmentsLV.Subrogation.pcf: line 32, column 50
    function valueRoot_6 () : java.lang.Object {
      return Subrogation
    }
    
    // 'value' attribute on TextCell (id=Subrogation) at FailedAssignmentsLV.Subrogation.pcf: line 25, column 45
    function value_2 () : java.lang.Comparable {
      return Subrogation.Exposure?: "Claim"
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at FailedAssignmentsLV.Subrogation.pcf: line 32, column 50
    function value_4 () : typekey.SubrogationStatus {
      return Subrogation.Status
    }
    
    property get Subrogation () : Subrogation {
      return getIteratedValue(1) as Subrogation
    }
    
    
  }
  
  
}