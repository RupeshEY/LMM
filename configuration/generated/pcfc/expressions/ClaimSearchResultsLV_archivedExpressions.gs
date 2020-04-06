package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.archived.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchResultsLV_archivedExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.archived.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSearchResultsLV.archived.pcf: line 19, column 75
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ClaimInfoSearchView> {
      return claimSearchResults == null ? null : claimSearchResults.getArchivedClaimSearchResults() as gw.api.database.IQueryBeanResult<ClaimInfoSearchView>
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 43, column 52
    function sortValue_1 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 55, column 53
    function sortValue_2 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 78, column 49
    function sortValue_3 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.LossDate
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 83, column 57
    function sortValue_4 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ArchivedAdjuster
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 89, column 45
    function sortValue_5 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ArchiveState
    }
    
    // 'value' attribute on RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 27, column 86
    function value_34 () : gw.api.database.IQueryBeanResult<entity.ClaimInfoSearchView> {
      return ClaimInfoSearchViewList
    }
    
    property get ClaimInfoSearchViewList () : gw.api.database.IQueryBeanResult<ClaimInfoSearchView> {
      return getVariableValue("ClaimInfoSearchViewList", 0) as gw.api.database.IQueryBeanResult<ClaimInfoSearchView>
    }
    
    property set ClaimInfoSearchViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimInfoSearchView>) {
      setVariableValue("ClaimInfoSearchViewList", 0, $arg)
    }
    
    property get claimSearchResults () : gw.api.search.ClaimSearchResults {
      return getRequireValue("claimSearchResults", 0) as gw.api.search.ClaimSearchResults
    }
    
    property set claimSearchResults ($arg :  gw.api.search.ClaimSearchResults) {
      setRequireValue("claimSearchResults", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.archived.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at ClaimSearchResultsLV.archived.pcf: line 67, column 37
    function label_19 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at ClaimSearchResultsLV.archived.pcf: line 71, column 111
    function visible_20 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchResultsLV.archived.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ClaimSearchResultsLV.archived.pcf: line 43, column 52
    function action_9 () : void {
      SimpleClaimForward.go(ClaimInfoSearchView.ClaimInfo)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ClaimSearchResultsLV.archived.pcf: line 43, column 52
    function action_dest_10 () : pcf.api.Destination {
      return pcf.SimpleClaimForward.createDestination(ClaimInfoSearchView.ClaimInfo)
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimSearchResultsLV.archived.pcf: line 34, column 34
    function condition_7 () : java.lang.Boolean {
      return ClaimInfoSearchView.canRestore()
    }
    
    // 'initialValue' attribute on Variable at ClaimSearchResultsLV.archived.pcf: line 31, column 26
    function initialValue_6 () : String[] {
      return ClaimInfoSearchView.getClaimantNames()
    }
    
    // RowIterator (id=ClaimSearchResultsIterator) at ClaimSearchResultsLV.archived.pcf: line 27, column 86
    function initializeVariables_32 () : void {
        claimantList = ClaimInfoSearchView.getClaimantNames();

    }
    
    // 'useArchivedStyle' attribute on Row at ClaimSearchResultsLV.archived.pcf: line 36, column 61
    function useArchivedStyle_31 () : java.lang.Boolean {
      return ClaimInfoSearchView.isArchived()
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at ClaimSearchResultsLV.archived.pcf: line 43, column 52
    function valueRoot_12 () : java.lang.Object {
      return ClaimInfoSearchView
    }
    
    // 'value' attribute on TextCell (id=Insured) at ClaimSearchResultsLV.archived.pcf: line 50, column 47
    function value_13 () : entity.ContactInfoView {
      return ClaimInfoSearchView.Insured
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at ClaimSearchResultsLV.archived.pcf: line 55, column 53
    function value_16 () : java.lang.String {
      return ClaimInfoSearchView.PolicyNumber
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantInfoName) at ClaimSearchResultsLV.archived.pcf: line 64, column 44
    function value_21 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at ClaimSearchResultsLV.archived.pcf: line 78, column 49
    function value_22 () : java.util.Date {
      return ClaimInfoSearchView.LossDate
    }
    
    // 'value' attribute on TextCell (id=Assignee) at ClaimSearchResultsLV.archived.pcf: line 83, column 57
    function value_25 () : java.lang.String {
      return ClaimInfoSearchView.ArchivedAdjuster
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ClaimSearchResultsLV.archived.pcf: line 89, column 45
    function value_28 () : typekey.ArchiveState {
      return ClaimInfoSearchView.ArchiveState
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at ClaimSearchResultsLV.archived.pcf: line 43, column 52
    function value_8 () : java.lang.String {
      return ClaimInfoSearchView.ClaimNumber
    }
    
    property get ClaimInfoSearchView () : entity.ClaimInfoSearchView {
      return getIteratedValue(1) as entity.ClaimInfoSearchView
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  
}