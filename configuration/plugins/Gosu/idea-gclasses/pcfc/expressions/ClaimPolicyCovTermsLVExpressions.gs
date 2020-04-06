package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyCovTermsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyCovTermsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'editable' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 19, column 36
    function editable_5 () : java.lang.Boolean {
      return !Coverage.Policy.Verified
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 27, column 28
    function sortValue_0 (CovTerm :  entity.CovTerm) : java.lang.Object {
      return CovTerm.CovTermOrder
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 34, column 47
    function sortValue_1 (CovTerm :  entity.CovTerm) : java.lang.Object {
      return CovTerm.CovTermPattern
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 40, column 49
    function sortValue_2 (CovTerm :  entity.CovTerm) : java.lang.Object {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 44, column 40
    function sortValue_3 (CovTerm :  entity.CovTerm) : java.lang.Object {
      return CovTerm.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 49, column 48
    function sortValue_4 (CovTerm :  entity.CovTerm) : java.lang.Object {
      return CovTerm.ModelAggregation
    }
    
    // 'toRemove' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 19, column 36
    function toRemove_23 (CovTerm :  entity.CovTerm) : void {
      Coverage.removeFromCovTerms(CovTerm)
    }
    
    // 'value' attribute on RowIterator at ClaimPolicyCovTermsLV.pcf: line 19, column 36
    function value_24 () : entity.CovTerm[] {
      return Coverage.CovTerms.sortBy(\ c -> c.CovTermOrder)
    }
    
    property get Coverage () : Coverage {
      return getRequireValue("Coverage", 0) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setRequireValue("Coverage", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimPolicyCovTermsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=CovTermPattern) at ClaimPolicyCovTermsLV.pcf: line 34, column 47
    function action_10 () : void {
      CovTermPopup.push(CovTerm, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TypeKeyCell (id=CovTermPattern) at ClaimPolicyCovTermsLV.pcf: line 34, column 47
    function action_dest_11 () : pcf.api.Destination {
      return pcf.CovTermPopup.createDestination(CovTerm, CurrentLocation.InEditMode)
    }
    
    // 'value' attribute on TextCell (id=covSortOrderCell) at ClaimPolicyCovTermsLV.pcf: line 27, column 28
    function valueRoot_8 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TypeKeyCell (id=ModelRestriction) at ClaimPolicyCovTermsLV.pcf: line 40, column 49
    function value_14 () : typekey.CovTermModelRest {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on TextCell (id=Amount) at ClaimPolicyCovTermsLV.pcf: line 44, column 40
    function value_17 () : java.lang.String {
      return CovTerm.DisplayName
    }
    
    // 'value' attribute on TypeKeyCell (id=ModelAggregation) at ClaimPolicyCovTermsLV.pcf: line 49, column 48
    function value_20 () : typekey.CovTermModelAgg {
      return CovTerm.ModelAggregation
    }
    
    // 'value' attribute on TextCell (id=covSortOrderCell) at ClaimPolicyCovTermsLV.pcf: line 27, column 28
    function value_6 () : java.lang.Integer {
      return CovTerm.CovTermOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=CovTermPattern) at ClaimPolicyCovTermsLV.pcf: line 34, column 47
    function value_9 () : typekey.CovTermPattern {
      return CovTerm.CovTermPattern
    }
    
    property get CovTerm () : entity.CovTerm {
      return getIteratedValue(1) as entity.CovTerm
    }
    
    
  }
  
  
}