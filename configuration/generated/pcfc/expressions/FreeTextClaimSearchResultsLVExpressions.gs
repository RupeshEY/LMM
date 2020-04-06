package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at FreeTextClaimSearchResultsLV.pcf: line 19, column 81
    function initialValue_0 () : gw.api.database.IQueryBeanResult<FreeTextClaimSearchEntity> {
      return claimSearchResults == null ? null : claimSearchResults.getActiveClaimSearchResults()
    }
    
    // 'initialValue' attribute on Variable at FreeTextClaimSearchResultsLV.pcf: line 24, column 36
    function initialValue_1 () : java.math.BigDecimal {
      return getHighestScore()
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 83, column 49
    function sortValue_10 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.City
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 89, column 38
    function sortValue_11 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.State
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 94, column 55
    function sortValue_12 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.PostalCode
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 99, column 50
    function sortValue_13 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Phone
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 104, column 50
    function sortValue_14 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Roles
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 42, column 42
    function sortValue_2 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Rank
    }
    
    // 'sortBy' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 48, column 83
    function sortValue_3 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Score
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 54, column 56
    function sortValue_4 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 59, column 57
    function sortValue_5 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 64, column 51
    function sortValue_6 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Status
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 69, column 49
    function sortValue_7 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Date
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 73, column 53
    function sortValue_8 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.FullName
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 78, column 52
    function sortValue_9 (FreeTextClaimSearchView :  entity.FreeTextClaimSearchEntity) : java.lang.Object {
      return FreeTextClaimSearchView.Address
    }
    
    // 'value' attribute on RowIterator (id=FreeTextClaimSearchResultsIterator) at FreeTextClaimSearchResultsLV.pcf: line 32, column 92
    function value_56 () : gw.api.database.IQueryBeanResult<entity.FreeTextClaimSearchEntity> {
      return FreeTextClaimSearchViewList
    }
    
    property get FreeTextClaimSearchViewList () : gw.api.database.IQueryBeanResult<FreeTextClaimSearchEntity> {
      return getVariableValue("FreeTextClaimSearchViewList", 0) as gw.api.database.IQueryBeanResult<FreeTextClaimSearchEntity>
    }
    
    property set FreeTextClaimSearchViewList ($arg :  gw.api.database.IQueryBeanResult<FreeTextClaimSearchEntity>) {
      setVariableValue("FreeTextClaimSearchViewList", 0, $arg)
    }
    
    property get claimSearchResults () : gw.api.search.FreeTextClaimSearchResults {
      return getRequireValue("claimSearchResults", 0) as gw.api.search.FreeTextClaimSearchResults
    }
    
    property set claimSearchResults ($arg :  gw.api.search.FreeTextClaimSearchResults) {
      setRequireValue("claimSearchResults", 0, $arg)
    }
    
    property get highestScore () : java.math.BigDecimal {
      return getVariableValue("highestScore", 0) as java.math.BigDecimal
    }
    
    property set highestScore ($arg :  java.math.BigDecimal) {
      setVariableValue("highestScore", 0, $arg)
    }
    
    
    /**
     * Returns the highest score for the search results.
     */
     function getHighestScore() : BigDecimal {
       if(claimSearchResults==null) return 0
       return claimSearchResults.MaxScore
     }
     
     /**
      * Calculate percentage of highest score for a given
      * score. Returns 0-100, suitable for a progress widget.
      */
     function getPercentageOfHighest(score:BigDecimal) : float {
       if(score==null) {
         score = 0
       }
       // should never see high score of 0 here
       return (highestScore==0 ? 0d : score.divide(highestScore, BigDecimal.ROUND_DOWN).floatValue()) as float
     }
    
     /**
      * Calculate percentage of highest score for a given
      * score, and format it as a percentage.
      */
     function getFormattedPercentageOfHighest(score:BigDecimal) : String {
        var scorePercent = getPercentageOfHighest(score)
        var nf = java.text.NumberFormat.getPercentInstance()
        return nf.format(scorePercent)
     }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FreeTextClaimSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at FreeTextClaimSearchResultsLV.pcf: line 54, column 56
    function action_21 () : void {
      FreeTextClaimForward.go(FreeTextClaimSearchView.ClaimNumber, ClaimSearchType.TC_ACTIVE)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at FreeTextClaimSearchResultsLV.pcf: line 54, column 56
    function action_dest_22 () : pcf.api.Destination {
      return pcf.FreeTextClaimForward.createDestination(FreeTextClaimSearchView.ClaimNumber, ClaimSearchType.TC_ACTIVE)
    }
    
    // 'value' attribute on TextCell (id=Rank) at FreeTextClaimSearchResultsLV.pcf: line 42, column 42
    function valueRoot_17 () : java.lang.Object {
      return FreeTextClaimSearchView
    }
    
    // 'value' attribute on TextCell (id=Rank) at FreeTextClaimSearchResultsLV.pcf: line 42, column 42
    function value_15 () : java.lang.Integer {
      return FreeTextClaimSearchView.Rank
    }
    
    // 'value' attribute on TextCell (id=RelevanceNum) at FreeTextClaimSearchResultsLV.pcf: line 48, column 83
    function value_18 () : java.lang.String {
      return getFormattedPercentageOfHighest(FreeTextClaimSearchView.Score)
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at FreeTextClaimSearchResultsLV.pcf: line 54, column 56
    function value_20 () : java.lang.String {
      return FreeTextClaimSearchView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at FreeTextClaimSearchResultsLV.pcf: line 59, column 57
    function value_25 () : java.lang.String {
      return FreeTextClaimSearchView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Status) at FreeTextClaimSearchResultsLV.pcf: line 64, column 51
    function value_28 () : java.lang.String {
      return FreeTextClaimSearchView.Status
    }
    
    // 'value' attribute on DateCell (id=Date) at FreeTextClaimSearchResultsLV.pcf: line 69, column 49
    function value_31 () : java.util.Date {
      return FreeTextClaimSearchView.Date
    }
    
    // 'value' attribute on TextCell (id=FullName) at FreeTextClaimSearchResultsLV.pcf: line 73, column 53
    function value_34 () : java.lang.String {
      return FreeTextClaimSearchView.FullName
    }
    
    // 'value' attribute on TextCell (id=Address) at FreeTextClaimSearchResultsLV.pcf: line 78, column 52
    function value_37 () : java.lang.String {
      return FreeTextClaimSearchView.Address
    }
    
    // 'value' attribute on TextCell (id=City) at FreeTextClaimSearchResultsLV.pcf: line 83, column 49
    function value_40 () : java.lang.String {
      return FreeTextClaimSearchView.City
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at FreeTextClaimSearchResultsLV.pcf: line 89, column 38
    function value_43 () : typekey.State {
      return FreeTextClaimSearchView.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at FreeTextClaimSearchResultsLV.pcf: line 94, column 55
    function value_46 () : java.lang.String {
      return FreeTextClaimSearchView.PostalCode
    }
    
    // 'value' attribute on TextCell (id=Phone) at FreeTextClaimSearchResultsLV.pcf: line 99, column 50
    function value_49 () : java.lang.String {
      return FreeTextClaimSearchView.Phone
    }
    
    // 'value' attribute on TextCell (id=Roles) at FreeTextClaimSearchResultsLV.pcf: line 104, column 50
    function value_52 () : java.lang.String {
      return FreeTextClaimSearchView.Roles
    }
    
    property get FreeTextClaimSearchView () : entity.FreeTextClaimSearchEntity {
      return getIteratedValue(1) as entity.FreeTextClaimSearchEntity
    }
    
    
  }
  
  
}