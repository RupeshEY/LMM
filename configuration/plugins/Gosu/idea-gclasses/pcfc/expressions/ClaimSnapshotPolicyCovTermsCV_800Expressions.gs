package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyCovTermsCV_800Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyCovTermsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 34, column 34
    function sortValue_0 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.CovTermOrder
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 41, column 46
    function sortValue_1 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.CovTermPattern
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 47, column 46
    function sortValue_2 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 52, column 46
    function sortValue_3 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 57, column 46
    function sortValue_4 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.ModelAggregation
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 64, column 34
    function sortValue_5 (CovTerm :  dynamic.Dynamic) : java.lang.Object {
      return CovTerm.Subtype.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 26, column 41
    function value_26 () : dynamic.Dynamic {
      return Coverage.CovTerms
    }
    
    property get Coverage () : dynamic.Dynamic {
      return getRequireValue("Coverage", 0) as dynamic.Dynamic
    }
    
    property set Coverage ($arg :  dynamic.Dynamic) {
      setRequireValue("Coverage", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyCovTermsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CovTermPattern) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 41, column 46
    function action_10 () : void {
      ClaimSnapshotCovTerm800Popup.push(CovTerm)
    }
    
    // 'action' attribute on TextCell (id=CovTermPattern) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 41, column 46
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimSnapshotCovTerm800Popup.createDestination(CovTerm)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 64, column 34
    function valueRoot_25 () : java.lang.Object {
      return CovTerm.Subtype
    }
    
    // 'value' attribute on TextCell (id=covSortOrderCell) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 34, column 34
    function valueRoot_8 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TextCell (id=ModelRestriction) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 47, column 46
    function value_14 () : dynamic.Dynamic {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on TextCell (id=Amount) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 52, column 46
    function value_17 () : dynamic.Dynamic {
      return CovTerm.DisplayName
    }
    
    // 'value' attribute on TextCell (id=ModelAggregation) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 57, column 46
    function value_20 () : dynamic.Dynamic {
      return CovTerm.ModelAggregation
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 64, column 34
    function value_23 () : dynamic.Dynamic {
      return CovTerm.Subtype.Code
    }
    
    // 'value' attribute on TextCell (id=covSortOrderCell) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 34, column 34
    function value_6 () : dynamic.Dynamic {
      return CovTerm.CovTermOrder
    }
    
    // 'value' attribute on TextCell (id=CovTermPattern) at ClaimSnapshotPolicyCovTermsCV.800.pcf: line 41, column 46
    function value_9 () : dynamic.Dynamic {
      return CovTerm.CovTermPattern
    }
    
    property get CovTerm () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}