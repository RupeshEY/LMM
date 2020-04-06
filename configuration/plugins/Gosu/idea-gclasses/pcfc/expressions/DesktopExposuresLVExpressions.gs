package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at DesktopExposuresLV.pcf: line 32, column 39
    function cacheKey_7 () : java.lang.String {
      return FilterSet.CacheKey
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 36, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 39, column 81
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 42, column 91
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getClosedLastNDaysOwnedFilter(90)
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 45, column 83
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 48, column 83
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewRelatedFilter
    }
    
    // 'initialValue' attribute on Variable at DesktopExposuresLV.pcf: line 21, column 56
    function initialValue_0 () : gw.api.exposure.DesktopExposureFilterSet {
      return new gw.api.exposure.DesktopExposureFilterSet(User)
    }
    
    // 'label' attribute on ToolbarFilterOption at DesktopExposuresLV.pcf: line 42, column 91
    function label_4 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Exposures.ClosedLastNDays", 90)
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 69, column 45
    function sortValue_10 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ExposureType
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 74, column 45
    function sortValue_11 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 85, column 46
    function sortValue_12 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.State
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 91, column 111
    function sortValue_14 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.WorkloadWeight
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 97, column 61
    function sortValue_16 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 56, column 52
    function sortValue_8 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 63, column 42
    function sortValue_9 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at DesktopExposuresLV.pcf: line 27, column 86
    function value_51 () : gw.api.database.IQueryBeanResult<entity.ExposureDesktopView> {
      return ExposureDesktopViewList
    }
    
    // 'visible' attribute on RowIterator at DesktopExposuresLV.pcf: line 91, column 111
    function visible_13 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on RowIterator at DesktopExposuresLV.pcf: line 97, column 61
    function visible_15 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    property get ExposureDesktopViewList () : gw.api.database.IQueryBeanResult<ExposureDesktopView> {
      return getRequireValue("ExposureDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ExposureDesktopView>
    }
    
    property set ExposureDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ExposureDesktopView>) {
      setRequireValue("ExposureDesktopViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.exposure.DesktopExposureFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.exposure.DesktopExposureFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.exposure.DesktopExposureFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/exposures/DesktopExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DesktopExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopExposuresLV.pcf: line 56, column 52
    function action_18 () : void {
      pcf.Claim.go(ExposureDesktopView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Order) at DesktopExposuresLV.pcf: line 63, column 42
    function action_23 () : void {
      ExposureDetailForward.go(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at DesktopExposuresLV.pcf: line 69, column 45
    function action_28 () : void {
      ExposureDetailForward.go(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claimant) at DesktopExposuresLV.pcf: line 80, column 53
    function action_36 () : void {
      ClaimContactDetailPopup.push(ExposureDesktopView.Claimant, ExposureDesktopView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopExposuresLV.pcf: line 56, column 52
    function action_dest_19 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ExposureDesktopView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Order) at DesktopExposuresLV.pcf: line 63, column 42
    function action_dest_24 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at DesktopExposuresLV.pcf: line 69, column 45
    function action_dest_29 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TextCell (id=Claimant) at DesktopExposuresLV.pcf: line 80, column 53
    function action_dest_37 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ExposureDesktopView.Claimant, ExposureDesktopView.ExposureClaim)
    }
    
    // 'value' attribute on TextCell (id=CaseID) at DesktopExposuresLV.pcf: line 56, column 52
    function valueRoot_21 () : java.lang.Object {
      return ExposureDesktopView
    }
    
    // 'value' attribute on TextCell (id=CaseID) at DesktopExposuresLV.pcf: line 56, column 52
    function value_17 () : java.lang.String {
      return ExposureDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Order) at DesktopExposuresLV.pcf: line 63, column 42
    function value_22 () : java.lang.Integer {
      return ExposureDesktopView.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at DesktopExposuresLV.pcf: line 69, column 45
    function value_27 () : typekey.ExposureType {
      return ExposureDesktopView.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at DesktopExposuresLV.pcf: line 74, column 45
    function value_32 () : typekey.CoverageType {
      return ExposureDesktopView.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at DesktopExposuresLV.pcf: line 80, column 53
    function value_35 () : java.lang.String {
      return ExposureDesktopView.ClaimantName
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DesktopExposuresLV.pcf: line 85, column 46
    function value_40 () : typekey.ExposureState {
      return ExposureDesktopView.State
    }
    
    // 'value' attribute on TextCell (id=WorkloadWeight) at DesktopExposuresLV.pcf: line 91, column 111
    function value_44 () : java.lang.Integer {
      return ExposureDesktopView.WorkloadWeight
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at DesktopExposuresLV.pcf: line 97, column 61
    function value_48 () : gw.api.financials.CurrencyAmount {
      return ExposureDesktopView.TotalIncurredNet
    }
    
    // 'visible' attribute on TextCell (id=WorkloadWeight) at DesktopExposuresLV.pcf: line 91, column 111
    function visible_43 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'visible' attribute on CurrencyCell (id=TotalIncurredNet) at DesktopExposuresLV.pcf: line 97, column 61
    function visible_47 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    property get ExposureDesktopView () : entity.ExposureDesktopView {
      return getIteratedValue(1) as entity.ExposureDesktopView
    }
    
    
  }
  
  
}