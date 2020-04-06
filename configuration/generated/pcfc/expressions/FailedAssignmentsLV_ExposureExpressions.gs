package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FailedAssignmentsLV_ExposureExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at FailedAssignmentsLV.Exposure.pcf: line 17, column 39
    function value_18 () : entity.Assignable[] {
      return AssignmentPopup.getFailedAssignables()
    }
    
    // 'type' attribute on RowIterator at FailedAssignmentsLV.Exposure.pcf: line 17, column 39
    function verifyIteratorType_19 () : void {
      var entry : entity.Assignable = null
      var typedEntry : Exposure
      // If this cast fails to compile then the type specified by the 'type' attribute on
      // 'RowIterator' is not compatible with the member type of the 'valueType' attribute
      typedEntry = entry as Exposure
    }
    
    property get AssignmentPopup () : gw.api.assignment.AssignmentPopup {
      return getRequireValue("AssignmentPopup", 0) as gw.api.assignment.AssignmentPopup
    }
    
    property set AssignmentPopup ($arg :  gw.api.assignment.AssignmentPopup) {
      setRequireValue("AssignmentPopup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/FailedAssignmentsLV.Exposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FailedAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CaseID) at FailedAssignmentsLV.Exposure.pcf: line 24, column 47
    function valueRoot_2 () : java.lang.Object {
      return Exposure.Claim
    }
    
    // 'value' attribute on TextCell (id=Order) at FailedAssignmentsLV.Exposure.pcf: line 31, column 42
    function valueRoot_5 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextCell (id=CaseID) at FailedAssignmentsLV.Exposure.pcf: line 24, column 47
    function value_0 () : java.lang.String {
      return Exposure.Claim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Claimant) at FailedAssignmentsLV.Exposure.pcf: line 49, column 39
    function value_12 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at FailedAssignmentsLV.Exposure.pcf: line 55, column 46
    function value_15 () : typekey.ExposureState {
      return Exposure.State
    }
    
    // 'value' attribute on TextCell (id=Order) at FailedAssignmentsLV.Exposure.pcf: line 31, column 42
    function value_3 () : java.lang.Integer {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at FailedAssignmentsLV.Exposure.pcf: line 37, column 45
    function value_6 () : typekey.ExposureType {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at FailedAssignmentsLV.Exposure.pcf: line 43, column 45
    function value_9 () : typekey.CoverageType {
      return Exposure.PrimaryCoverage
    }
    
    property get Exposure () : Exposure {
      return getIteratedValue(1) as Exposure
    }
    
    
  }
  
  
}