package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFSuspenseQueueClaimSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFSuspenseQueueClaimSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimDataMessage :  ECFMessageClaimData_Ext) : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at ECFSuspenseQueueClaimSearchPopup.pcf: line 17, column 42
    function initialValue_0 () : entity.ClaimSearchCriteria {
      return new ClaimSearchCriteria()
    }
    
    // 'initialValue' attribute on Variable at ECFSuspenseQueueClaimSearchPopup.pcf: line 21, column 65
    function initialValue_1 () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return new gw.acc.iplm.controller.ECFSuspenseQueueController()
    }
    
    property get ClaimSearchCriteria () : entity.ClaimSearchCriteria {
      return getVariableValue("ClaimSearchCriteria", 0) as entity.ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  entity.ClaimSearchCriteria) {
      setVariableValue("ClaimSearchCriteria", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ECFSuspenseQueueClaimSearchPopup {
      return super.CurrentLocation as pcf.ECFSuspenseQueueClaimSearchPopup
    }
    
    property get claimDataMessage () : ECFMessageClaimData_Ext {
      return getVariableValue("claimDataMessage", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMessage ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("claimDataMessage", 0, $arg)
    }
    
    property get ecfSuspenseQueueController () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return getVariableValue("ecfSuspenseQueueController", 0) as gw.acc.iplm.controller.ECFSuspenseQueueController
    }
    
    property set ecfSuspenseQueueController ($arg :  gw.acc.iplm.controller.ECFSuspenseQueueController) {
      setVariableValue("ecfSuspenseQueueController", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at ECFSuspenseQueueClaimSearchPopup.pcf: line 121, column 45
    function label_54 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at ECFSuspenseQueueClaimSearchPopup.pcf: line 125, column 119
    function visible_55 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(4) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SimpleClaimSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ApplyToClaimSelectButton) at ECFSuspenseQueueClaimSearchPopup.pcf: line 63, column 46
    function action_28 () : void {
      CurrentLocation.pickValueAndCommit(ecfSuspenseQueueController.processMessageAgainstClaim(claimDataMessage, SimpleClaimSearchView.UCR_Ext).UCR)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ECFSuspenseQueueClaimSearchPopup.pcf: line 80, column 62
    function action_34 () : void {
      ClaimForward.go(SimpleClaimSearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ECFSuspenseQueueClaimSearchPopup.pcf: line 80, column 62
    function action_dest_35 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(SimpleClaimSearchView.Claim)
    }
    
    // 'confirmMessage' attribute on Link (id=ApplyToClaimSelectButton) at ECFSuspenseQueueClaimSearchPopup.pcf: line 63, column 46
    function confirmMessage_29 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ApplyToClaim.ConfirmationDialog", SimpleClaimSearchView.ClaimNumber)
    }
    
    // 'initialValue' attribute on Variable at ECFSuspenseQueueClaimSearchPopup.pcf: line 55, column 44
    function initialValue_27 () : java.lang.String[] {
      return SimpleClaimSearchView.ClaimantNames
    }
    
    // RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 51, column 95
    function initializeVariables_92 () : void {
        claimantList = SimpleClaimSearchView.ClaimantNames;

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at ECFSuspenseQueueClaimSearchPopup.pcf: line 73, column 67
    function valueRoot_32 () : java.lang.Object {
      return SimpleClaimSearchView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at ECFSuspenseQueueClaimSearchPopup.pcf: line 73, column 67
    function value_30 () : java.lang.Boolean {
      return SimpleClaimSearchView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at ECFSuspenseQueueClaimSearchPopup.pcf: line 80, column 62
    function value_33 () : java.lang.String {
      return SimpleClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=UMR) at ECFSuspenseQueueClaimSearchPopup.pcf: line 86, column 58
    function value_38 () : java.lang.String {
      return SimpleClaimSearchView.UMR_Ext
    }
    
    // 'value' attribute on TextCell (id=UCR) at ECFSuspenseQueueClaimSearchPopup.pcf: line 92, column 58
    function value_41 () : java.lang.String {
      return SimpleClaimSearchView.UCR_Ext
    }
    
    // 'value' attribute on TextCell (id=Insured) at ECFSuspenseQueueClaimSearchPopup.pcf: line 97, column 64
    function value_44 () : java.lang.String {
      return SimpleClaimSearchView.InsuredDenorm
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at ECFSuspenseQueueClaimSearchPopup.pcf: line 102, column 63
    function value_47 () : java.lang.String {
      return SimpleClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=InjuredWorker) at ECFSuspenseQueueClaimSearchPopup.pcf: line 108, column 71
    function value_51 () : java.lang.String {
      return SimpleClaimSearchView.ClaimantDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantInfoName) at ECFSuspenseQueueClaimSearchPopup.pcf: line 118, column 52
    function value_56 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at ECFSuspenseQueueClaimSearchPopup.pcf: line 132, column 59
    function value_58 () : java.util.Date {
      return SimpleClaimSearchView.LossDate
    }
    
    // 'value' attribute on TextCell (id=Assignee) at ECFSuspenseQueueClaimSearchPopup.pcf: line 138, column 72
    function value_61 () : java.lang.String {
      return SimpleClaimSearchView.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ECFSuspenseQueueClaimSearchPopup.pcf: line 144, column 51
    function value_64 () : typekey.ClaimState {
      return SimpleClaimSearchView.State
    }
    
    // 'value' attribute on CurrencyCell (id=RemainingReserves) at ECFSuspenseQueueClaimSearchPopup.pcf: line 151, column 68
    function value_67 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.RemainingReserves
    }
    
    // 'value' attribute on CurrencyCell (id=FuturePayments) at ECFSuspenseQueueClaimSearchPopup.pcf: line 158, column 65
    function value_70 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.FuturePayments
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPayments) at ECFSuspenseQueueClaimSearchPopup.pcf: line 165, column 64
    function value_73 () : gw.api.financials.CurrencyAmount {
      return SimpleClaimSearchView.TotalPayments
    }
    
    // 'value' attribute on DateCell (id=NoticeDate) at ECFSuspenseQueueClaimSearchPopup.pcf: line 170, column 69
    function value_77 () : java.util.Date {
      return SimpleClaimSearchView.ReportedDate
    }
    
    // 'value' attribute on TextCell (id=AssignedGroup) at ECFSuspenseQueueClaimSearchPopup.pcf: line 175, column 69
    function value_81 () : java.lang.String {
      return SimpleClaimSearchView.AssignedGroup
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode) at ECFSuspenseQueueClaimSearchPopup.pcf: line 181, column 69
    function value_85 () : typekey.LOBCode {
      return SimpleClaimSearchView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=StateOfJurisdiction) at ECFSuspenseQueueClaimSearchPopup.pcf: line 187, column 69
    function value_89 () : typekey.Jurisdiction {
      return SimpleClaimSearchView.JurisdictionState
    }
    
    // 'visible' attribute on TextCell (id=InjuredWorker) at ECFSuspenseQueueClaimSearchPopup.pcf: line 108, column 71
    function visible_50 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on LinkCell (id=Claimant) at ECFSuspenseQueueClaimSearchPopup.pcf: line 113, column 70
    function visible_57 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    // 'visible' attribute on DateCell (id=NoticeDate) at ECFSuspenseQueueClaimSearchPopup.pcf: line 170, column 69
    function visible_76 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingCSV()
    }
    
    property get SimpleClaimSearchView () : entity.ClaimSearchView {
      return getIteratedValue(3) as entity.ClaimSearchView
    }
    
    property get claimantList () : java.lang.String[] {
      return getVariableValue("claimantList", 3) as java.lang.String[]
    }
    
    property set claimantList ($arg :  java.lang.String[]) {
      setVariableValue("claimantList", 3, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ECFSuspenseQueueClaimSearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ECFSuspenseQueueClaimSearchPopup.pcf: line 35, column 61
    function def_onEnter_2 (def :  pcf.SimpleClaimSearchDV) : void {
      def.onEnter(searchHelper.Criteria)
    }
    
    // 'def' attribute on PanelRef at ECFSuspenseQueueClaimSearchPopup.pcf: line 35, column 61
    function def_refreshVariables_3 (def :  pcf.SimpleClaimSearchDV) : void {
      def.refreshVariables(searchHelper.Criteria)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at ECFSuspenseQueueClaimSearchPopup.pcf: line 33, column 85
    function maxSearchResults_94 () : java.lang.Object {
      return searchHelper.MaxResults
    }
    
    // 'searchCriteria' attribute on SearchPanel at ECFSuspenseQueueClaimSearchPopup.pcf: line 33, column 85
    function searchCriteria_96 () : gw.api.search.SimpleClaimSearchHelper {
      return new gw.api.search.SimpleClaimSearchHelper()
    }
    
    // 'search' attribute on SearchPanel at ECFSuspenseQueueClaimSearchPopup.pcf: line 33, column 85
    function search_95 () : java.lang.Object {
      new gw.api.name.SearchNameOwner(searchHelper.Criteria.NameCriteria).clearNonvisibleFields(); return searchHelper.searchECFClaimsWithECFCriteria()
    }
    
    property get SimpleClaimSearchViewList () : gw.api.database.IQueryBeanResult<ClaimSearchView> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<ClaimSearchView>
    }
    
    property get searchHelper () : gw.api.search.SimpleClaimSearchHelper {
      return getCriteriaValue(1) as gw.api.search.SimpleClaimSearchHelper
    }
    
    property set searchHelper ($arg :  gw.api.search.SimpleClaimSearchHelper) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/desktop/claimsearch/ECFSuspenseQueueClaimSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchResultsLVExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ECFSuspenseQueueClaimSearchPopup.pcf: line 44, column 28
    function initialValue_4 () : User {
      return User.util.CurrentUser
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 102, column 63
    function sortValue_10 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 108, column 71
    function sortValue_12 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ClaimantDenorm
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 132, column 59
    function sortValue_14 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.LossDate
    }
    
    // 'sortBy' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 138, column 72
    function sortValue_15 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignmentStatus
    }
    
    // 'sortBy' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 138, column 72
    function sortValue_16 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedUser
    }
    
    // 'sortBy' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 138, column 72
    function sortValue_17 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedQueue
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 144, column 51
    function sortValue_18 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.State
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 170, column 69
    function sortValue_20 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ReportedDate
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 175, column 69
    function sortValue_22 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.AssignedGroup
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 181, column 69
    function sortValue_24 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.LOBCode
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 187, column 69
    function sortValue_26 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.JurisdictionState
    }
    
    // 'sortBy' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 73, column 67
    function sortValue_5 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.Flagged
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 80, column 62
    function sortValue_6 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 86, column 58
    function sortValue_7 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.UMR_Ext
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 92, column 58
    function sortValue_8 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.UCR_Ext
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 97, column 64
    function sortValue_9 (SimpleClaimSearchView :  entity.ClaimSearchView) : java.lang.Object {
      return SimpleClaimSearchView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 51, column 95
    function value_93 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return SimpleClaimSearchViewList
    }
    
    // 'visible' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 108, column 71
    function visible_11 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 113, column 70
    function visible_13 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at ECFSuspenseQueueClaimSearchPopup.pcf: line 170, column 69
    function visible_19 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingCSV()
    }
    
    property get CurrentUser () : User {
      return getVariableValue("CurrentUser", 2) as User
    }
    
    property set CurrentUser ($arg :  User) {
      setVariableValue("CurrentUser", 2, $arg)
    }
    
    
  }
  
  
}