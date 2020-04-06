package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserAssignmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimUserAssignmentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserAssignmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserAssignmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at ClaimUserAssignmentsLV.pcf: line 21, column 348
    function sortValue_0 (Assignable :  entity.Assignable) : java.lang.Object {
      return (Assignable typeis Claim ? 1 : (Assignable typeis Exposure ? 2 : (Assignable typeis Activity ? 3 : (Assignable typeis Matter ? 4 : 1000))))
    }
    
    // 'value' attribute on RowIterator at ClaimUserAssignmentsLV.pcf: line 25, column 43
    function sortValue_1 (Assignable :  entity.Assignable) : java.lang.Object {
      return Assignable.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimUserAssignmentsLV.pcf: line 29, column 87
    function sortValue_2 (Assignable :  entity.Assignable) : java.lang.Object {
      return gw.api.claimparties.ClaimUserAssignmentsUtil.getStatus(Assignable)
    }
    
    // 'value' attribute on RowIterator at ClaimUserAssignmentsLV.pcf: line 15, column 39
    function value_10 () : entity.Assignable[] {
      return AssignableList
    }
    
    property get AssignableList () : Assignable[] {
      return getRequireValue("AssignableList", 0) as Assignable[]
    }
    
    property set AssignableList ($arg :  Assignable[]) {
      setRequireValue("AssignableList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserAssignmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimUserAssignmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimUserAssignmentsLV.pcf: line 25, column 43
    function valueRoot_7 () : java.lang.Object {
      return Assignable
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimUserAssignmentsLV.pcf: line 21, column 348
    function value_3 () : java.lang.String {
      var entityName = (Assignable typeis Claim ? "Claim" : (Assignable typeis Exposure ? "Exposure" : (Assignable typeis Activity ? "Activity" : (Assignable typeis Matter ? "Matter" : null)))); var displayName = Assignable.DisplayName; return (displayName == null ? entityName : displayName);
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimUserAssignmentsLV.pcf: line 25, column 43
    function value_5 () : java.lang.String {
      return Assignable.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimUserAssignmentsLV.pcf: line 29, column 87
    function value_8 () : java.lang.String {
      return gw.api.claimparties.ClaimUserAssignmentsUtil.getStatus(Assignable)
    }
    
    property get Assignable () : entity.Assignable {
      return getIteratedValue(1) as entity.Assignable
    }
    
    
  }
  
  
}