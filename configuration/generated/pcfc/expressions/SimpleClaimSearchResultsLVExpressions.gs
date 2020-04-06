package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SimpleClaimSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at SimpleClaimSearchResultsLV.pcf: line 86, column 37
    function label_48 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at SimpleClaimSearchResultsLV.pcf: line 90, column 111
    function visible_49 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SimpleClaimSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at SimpleClaimSearchResultsLV.pcf: line 45, column 54
    function action_28 () : void {
      ClaimForward.go(SimpleClaimSearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at SimpleClaimSearchResultsLV.pcf: line 45, column 54
    function action_dest_29 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(SimpleClaimSearchView.Claim)
    }
    
    // 'initialValue' attribute on Variable at SimpleClaimSearchResultsLV.pcf: line 28, column 36
    function initialValue_23 () : java.lang.String[] {
      return SimpleClaimSearchView.ClaimantNames
    }
    
    // RowIterator at SimpleClaimSearchResultsLV.pcf: line 24, column 87
    function initializeVariables_86 () : void {
        claimantList = SimpleClaimSearchView.ClaimantNames;

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at SimpleClaimSearchResultsLV.pcf: line 38, column 59
    function valueRoot_26 () : java.lang.Object {
      return SimpleClaimSearchView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at SimpleClaimSearchResultsLV.pcf: line 38, column 59
    function value_24 () : java.lang.Boolean {
      return SimpleClaimSearchView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at SimpleClaimSearchResultsLV.pcf: line 45, column 54
    function value_27 () : java.lang.String {
      return SimpleClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=UMR) at SimpleClaimSearchResultsLV.pcf: line 51, column 50
    function value_32 () : java.lang.String {
      return SimpleClaimSearchView.UMR_Ext
    }
    
    // 'value' attribute on TextCell (id=UCR) at SimpleClaimSearchResultsLV.pcf: line 57, column 50
    function value_35 () : java.lang.String {
      return SimpleClaimSearchView.UCR_Ext
    }
    
    // 'value' attribute on TextCell (id=Insured) at SimpleClaimSearchResultsLV.pcf: line 62, column 56
    function value_38 () : java.lang.String {
      return SimpleClaimSearchView.InsuredDenorm
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at SimpleClaimSearchResultsLV.pcf: line 67, column 55
    function value_41 () : java.lang.String {
      return SimpleClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=InjuredWorker) at SimpleClaimSearchResultsLV.pcf: line 73, column 63
    function value_45 () : java.lang.String {
      return SimpleClaimSearchView.ClaimantDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantInfoName) at SimpleClaimSearchResultsLV.pcf: line 83, column 44
    function value_50 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at SimpleClaimSearchResultsLV.pcf: line 97, column 51
    function value_52 () : java.util.Date {
      return SimpleClaimSearchView.LossDate
    }
    
    // 'value' attribute on TextCell (id=Assignee) at SimpleClaimSearchResultsLV.pcf: line 103, column 64
    function value_55 () : java.lang.String {
      return SimpleClaimSearchView.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at SimpleClaimSearchResultsLV.pcf: line 109, column 43
    function value_58 () : typekey.ClaimState {
      return SimpleClaimSearchView.State
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at SimpleClaimSearchResultsLV.pcf: line 116, column 60
    function value_61 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.RemainingReserves
    }
    
    // 'value' attribute on CurrencyCell (id=FuturePayments) at SimpleClaimSearchResultsLV.pcf: line 123, column 57
    function value_64 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.FuturePayments
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPayments) at SimpleClaimSearchResultsLV.pcf: line 130, column 56
    function value_67 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.TotalPayments
    }
    
    // 'value' attribute on DateCell (id=NoticeDate) at SimpleClaimSearchResultsLV.pcf: line 135, column 61
    function value_71 () : java.util.Date {
      return SimpleClaimSearchView.ReportedDate
    }
    
    // 'value' attribute on TextCell (id=AssignedGroup) at SimpleClaimSearchResultsLV.pcf: line 140, column 61
    function value_75 () : java.lang.String {
      return SimpleClaimSearchView.AssignedGroup
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode) at SimpleClaimSearchResultsLV.pcf: line 146, column 61
    function value_79 () : typekey.LOBCode {
      return SimpleClaimSearchView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=StateOfJurisdiction) at SimpleClaimSearchResultsLV.pcf: line 152, column 61
    function value_83 () : typekey.Jurisdiction {
      return SimpleClaimSearchView.JurisdictionState
    }
    
    // 'visible' attribute on TextCell (id=InjuredWorker) at SimpleClaimSearchResultsLV.pcf: line 73, column 63
    function visible_44 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on LinkCell (id=Claimant) at SimpleClaimSearchResultsLV.pcf: line 78, column 62
    function visible_51 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    // 'visible' attribute on DateCell (id=NoticeDate) at SimpleClaimSearchResultsLV.pcf: line 135, column 61
    function visible_70 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingCSV()
    }
    
    property get SimpleClaimSearchView () : entity.ClaimSearchView {
      return getIteratedValue(1) as entity.ClaimSearchView
    }
    
    property get claimantList () : java.lang.String[] {
      return getVariableValue("claimantList", 1) as java.lang.String[]
    }
    
    property set claimantList ($arg :  java.lang.String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SimpleClaimSearchResultsLV.pcf: line 16, column 20
    function initialValue_0 () : User {
      return User.util.CurrentUser
    }
    
    // 'sortBy' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 38, column 59
    function sortValue_1 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.Flagged
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 97, column 51
    function sortValue_10 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.LossDate
    }
    
    // 'sortBy' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 103, column 64
    function sortValue_11 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 103, column 64
    function sortValue_12 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 103, column 64
    function sortValue_13 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 109, column 43
    function sortValue_14 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.State
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 135, column 61
    function sortValue_16 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ReportedDate
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 140, column 61
    function sortValue_18 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedGroup
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 45, column 54
    function sortValue_2 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 146, column 61
    function sortValue_20 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.LOBCode
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 152, column 61
    function sortValue_22 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 51, column 50
    function sortValue_3 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.UMR_Ext
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 57, column 50
    function sortValue_4 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.UCR_Ext
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 62, column 56
    function sortValue_5 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 67, column 55
    function sortValue_6 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 73, column 63
    function sortValue_8 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ClaimantDenorm
    }
    
    // 'value' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 24, column 87
    function value_88 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return SimpleClaimSearchViewList
    }
    
    // 'visible' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 135, column 61
    function visible_15 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingCSV()
    }
    
    // 'visible' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 73, column 63
    function visible_7 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at SimpleClaimSearchResultsLV.pcf: line 78, column 62
    function visible_9 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    property get CurrentUser () : User {
      return getVariableValue("CurrentUser", 0) as User
    }
    
    property set CurrentUser ($arg :  User) {
      setVariableValue("CurrentUser", 0, $arg)
    }
    
    property get SimpleClaimSearchViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("SimpleClaimSearchViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set SimpleClaimSearchViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("SimpleClaimSearchViewList", 0, $arg)
    }
    
    
  }
  
  
}