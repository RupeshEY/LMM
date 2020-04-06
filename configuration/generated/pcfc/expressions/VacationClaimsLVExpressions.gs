package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/VacationClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/vacation/VacationClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at VacationClaimsLV.pcf: line 98, column 37
    function label_39 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at VacationClaimsLV.pcf: line 102, column 111
    function visible_40 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/vacation/VacationClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VacationClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Claims_ID) at VacationClaimsLV.pcf: line 75, column 50
    function action_27 () : void {
      pcf.Claim.go(ClaimVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Claims_Insured) at VacationClaimsLV.pcf: line 86, column 52
    function action_35 () : void {
      ClaimContactDetailPopup.push(ClaimVacationView.Insured, ClaimVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Claims_ID) at VacationClaimsLV.pcf: line 75, column 50
    function action_dest_28 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ClaimVacationView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Claims_Insured) at VacationClaimsLV.pcf: line 86, column 52
    function action_dest_36 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimVacationView.Insured, ClaimVacationView.Claim)
    }
    
    // 'initialValue' attribute on Variable at VacationClaimsLV.pcf: line 28, column 26
    function initialValue_19 () : String[] {
      return ClaimVacationView.getClaimantNames()
    }
    
    // RowIterator at VacationClaimsLV.pcf: line 24, column 84
    function initializeVariables_57 () : void {
        claimantList = ClaimVacationView.getClaimantNames();

    }
    
    // 'value' attribute on BooleanRadioCell (id=Claims_Flagged) at VacationClaimsLV.pcf: line 62, column 55
    function valueRoot_22 () : java.lang.Object {
      return ClaimVacationView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Claims_Flagged) at VacationClaimsLV.pcf: line 62, column 55
    function value_20 () : java.lang.Boolean {
      return ClaimVacationView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=VacationClaims_AssignedUser) at VacationClaimsLV.pcf: line 68, column 60
    function value_23 () : java.lang.String {
      return ClaimVacationView.AssigneeDisplayString
    }
    
    // 'value' attribute on TextCell (id=Claims_ID) at VacationClaimsLV.pcf: line 75, column 50
    function value_26 () : java.lang.String {
      return ClaimVacationView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Claims_PolicyID) at VacationClaimsLV.pcf: line 80, column 51
    function value_31 () : java.lang.String {
      return ClaimVacationView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Claims_Insured) at VacationClaimsLV.pcf: line 86, column 52
    function value_34 () : java.lang.String {
      return ClaimVacationView.InsuredDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at VacationClaimsLV.pcf: line 95, column 44
    function value_41 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=Claims_LossDate) at VacationClaimsLV.pcf: line 109, column 47
    function value_42 () : java.util.Date {
      return ClaimVacationView.LossDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Claims_Status) at VacationClaimsLV.pcf: line 115, column 43
    function value_45 () : typekey.ClaimState {
      return ClaimVacationView.State
    }
    
    // 'value' attribute on CurrencyCell (id=Claims_TotalIncurredNet) at VacationClaimsLV.pcf: line 121, column 55
    function value_48 () : gw.api.financials.CurrencyAmount {
      return ClaimVacationView.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyCell (id=Claims_LOBCode) at VacationClaimsLV.pcf: line 127, column 40
    function value_51 () : typekey.LOBCode {
      return ClaimVacationView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=Claims_JurisdictionState) at VacationClaimsLV.pcf: line 133, column 45
    function value_54 () : typekey.Jurisdiction {
      return ClaimVacationView.JurisdictionState
    }
    
    property get ClaimVacationView () : entity.ClaimVacationView {
      return getIteratedValue(1) as entity.ClaimVacationView
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/vacation/VacationClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 36, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 39, column 86
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 42, column 90
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFlaggedOwnedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 45, column 80
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 48, column 80
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewRelatedFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at VacationClaimsLV.pcf: line 51, column 80
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.DraftOwnedFilter
    }
    
    // 'initialValue' attribute on Variable at VacationClaimsLV.pcf: line 18, column 54
    function initialValue_0 () : gw.api.vacation.VacationClaimFilterSet {
      return new gw.api.vacation.VacationClaimFilterSet()
    }
    
    // 'sortBy' attribute on RowIterator at VacationClaimsLV.pcf: line 68, column 60
    function sortValue_10 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 75, column 50
    function sortValue_11 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 80, column 51
    function sortValue_12 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 86, column 52
    function sortValue_13 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 109, column 47
    function sortValue_14 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.LossDate
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 115, column 43
    function sortValue_15 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.State
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 121, column 55
    function sortValue_16 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 127, column 40
    function sortValue_17 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.LOBCode
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 133, column 45
    function sortValue_18 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.JurisdictionState
    }
    
    // 'sortBy' attribute on RowIterator at VacationClaimsLV.pcf: line 62, column 55
    function sortValue_7 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.Flagged
    }
    
    // 'sortBy' attribute on RowIterator at VacationClaimsLV.pcf: line 68, column 60
    function sortValue_8 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at VacationClaimsLV.pcf: line 68, column 60
    function sortValue_9 (ClaimVacationView :  entity.ClaimVacationView) : java.lang.Object {
      return ClaimVacationView.AssignedUser
    }
    
    // 'value' attribute on RowIterator at VacationClaimsLV.pcf: line 24, column 84
    function value_58 () : gw.api.database.IQueryBeanResult<entity.ClaimVacationView> {
      return ClaimVacationViewList
    }
    
    property get ClaimVacationViewList () : gw.api.database.IQueryBeanResult<ClaimVacationView> {
      return getRequireValue("ClaimVacationViewList", 0) as gw.api.database.IQueryBeanResult<ClaimVacationView>
    }
    
    property set ClaimVacationViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimVacationView>) {
      setRequireValue("ClaimVacationViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.vacation.VacationClaimFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.vacation.VacationClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.vacation.VacationClaimFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  
}