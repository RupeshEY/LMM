package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at DesktopClaimsLV.pcf: line 42, column 36
    function cacheKey_9 () : java.lang.String {
      return FilterSet.CacheKey
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 46, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 49, column 78
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 52, column 82
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFlaggedOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 55, column 88
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getClosedLastNDaysOwnedFilter(90)
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 58, column 80
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 61, column 80
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 64, column 80
    function filter_8 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.DraftOwnedFilter
    }
    
    // 'initialValue' attribute on Variable at DesktopClaimsLV.pcf: line 27, column 52
    function initialValue_0 () : gw.api.desktop.DesktopClaimFilterSet {
      return new gw.api.desktop.DesktopClaimFilterSet(User)
    }
    
    // 'label' attribute on ToolbarFilterOption at DesktopClaimsLV.pcf: line 55, column 88
    function label_5 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Claims.ClosedLastNDays", 90)
    }
    
    // 'sortBy' attribute on RowIterator at DesktopClaimsLV.pcf: line 75, column 54
    function sortValue_10 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.Flagged
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 83, column 49
    function sortValue_11 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 88, column 50
    function sortValue_12 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 95, column 51
    function sortValue_13 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 102, column 56
    function sortValue_15 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.ClaimantDenorm
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 126, column 46
    function sortValue_17 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.LossDate
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 132, column 43
    function sortValue_18 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.State
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 139, column 111
    function sortValue_20 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.WorkloadWeight
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 145, column 54
    function sortValue_21 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 151, column 40
    function sortValue_22 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.LOBCode
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 157, column 45
    function sortValue_23 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at DesktopClaimsLV.pcf: line 33, column 83
    function value_75 () : gw.api.database.IQueryBeanResult<entity.ClaimDesktopView> {
      return ClaimDesktopViewList
    }
    
    // 'visible' attribute on RowIterator at DesktopClaimsLV.pcf: line 102, column 56
    function visible_14 () : java.lang.Boolean {
      return (User.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at DesktopClaimsLV.pcf: line 107, column 55
    function visible_16 () : java.lang.Boolean {
      return (User.LossType != LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at DesktopClaimsLV.pcf: line 139, column 111
    function visible_19 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get ClaimDesktopViewList () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return getRequireValue("ClaimDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ClaimDesktopView>
    }
    
    property set ClaimDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimDesktopView>) {
      setRequireValue("ClaimDesktopViewList", 0, $arg)
    }
    
    property get EnableNavLinks () : Boolean {
      return getRequireValue("EnableNavLinks", 0) as Boolean
    }
    
    property set EnableNavLinks ($arg :  Boolean) {
      setRequireValue("EnableNavLinks", 0, $arg)
    }
    
    property get FilterSet () : gw.api.desktop.DesktopClaimFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.desktop.DesktopClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.desktop.DesktopClaimFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at DesktopClaimsLV.pcf: line 115, column 37
    function label_51 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at DesktopClaimsLV.pcf: line 119, column 111
    function visible_52 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DesktopClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=claimID) at DesktopClaimsLV.pcf: line 83, column 49
    function action_31 () : void {
      ClaimForward.go(ClaimDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopClaimsLV.pcf: line 95, column 51
    function action_41 () : void {
      ClaimContactDetailPopup.push(ClaimDesktopView.Insured, ClaimDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=claimID) at DesktopClaimsLV.pcf: line 83, column 49
    function action_dest_32 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(ClaimDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopClaimsLV.pcf: line 95, column 51
    function action_dest_42 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimDesktopView.Insured, ClaimDesktopView.Claim)
    }
    
    // 'available' attribute on TextCell (id=claimID) at DesktopClaimsLV.pcf: line 83, column 49
    function available_28 () : java.lang.Boolean {
      return EnableNavLinks
    }
    
    // 'initialValue' attribute on Variable at DesktopClaimsLV.pcf: line 37, column 26
    function initialValue_24 () : String[] {
      return ClaimDesktopView.getClaimantNames()
    }
    
    // RowIterator at DesktopClaimsLV.pcf: line 33, column 83
    function initializeVariables_74 () : void {
        claimantList = ClaimDesktopView.getClaimantNames();

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at DesktopClaimsLV.pcf: line 75, column 54
    function valueRoot_27 () : java.lang.Object {
      return ClaimDesktopView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at DesktopClaimsLV.pcf: line 75, column 54
    function value_25 () : java.lang.Boolean {
      return ClaimDesktopView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=claimID) at DesktopClaimsLV.pcf: line 83, column 49
    function value_29 () : java.lang.String {
      return ClaimDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at DesktopClaimsLV.pcf: line 88, column 50
    function value_35 () : java.lang.String {
      return ClaimDesktopView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at DesktopClaimsLV.pcf: line 95, column 51
    function value_39 () : java.lang.String {
      return ClaimDesktopView.InsuredDenorm
    }
    
    // 'value' attribute on TextCell (id=InjuredWorker) at DesktopClaimsLV.pcf: line 102, column 56
    function value_47 () : java.lang.String {
      return ClaimDesktopView.ClaimantDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at DesktopClaimsLV.pcf: line 112, column 44
    function value_53 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at DesktopClaimsLV.pcf: line 126, column 46
    function value_55 () : java.util.Date {
      return ClaimDesktopView.LossDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DesktopClaimsLV.pcf: line 132, column 43
    function value_58 () : typekey.ClaimState {
      return ClaimDesktopView.State
    }
    
    // 'value' attribute on TextCell (id=Workload) at DesktopClaimsLV.pcf: line 139, column 111
    function value_62 () : java.lang.Integer {
      return ClaimDesktopView.WorkloadWeight
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at DesktopClaimsLV.pcf: line 145, column 54
    function value_65 () : gw.api.financials.CurrencyAmount {
      return ClaimDesktopView.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode) at DesktopClaimsLV.pcf: line 151, column 40
    function value_68 () : typekey.LOBCode {
      return ClaimDesktopView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at DesktopClaimsLV.pcf: line 157, column 45
    function value_71 () : typekey.Jurisdiction {
      return ClaimDesktopView.JurisdictionState
    }
    
    // 'visible' attribute on TextCell (id=InjuredWorker) at DesktopClaimsLV.pcf: line 102, column 56
    function visible_46 () : java.lang.Boolean {
      return (User.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on LinkCell (id=Claimant) at DesktopClaimsLV.pcf: line 107, column 55
    function visible_54 () : java.lang.Boolean {
      return (User.LossType != LossType.TC_WC)
    }
    
    // 'visible' attribute on TextCell (id=Workload) at DesktopClaimsLV.pcf: line 139, column 111
    function visible_61 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    property get ClaimDesktopView () : entity.ClaimDesktopView {
      return getIteratedValue(1) as entity.ClaimDesktopView
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  
}