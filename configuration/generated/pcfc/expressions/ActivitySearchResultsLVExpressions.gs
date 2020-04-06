package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivitySearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 35, column 47
    function sortValue_0 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.Subject
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 41, column 51
    function sortValue_1 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.ClaimNumber
    }
    
    // 'sortBy' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 85, column 61
    function sortValue_10 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.AssignedUserName
    }
    
    // 'sortBy' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 85, column 61
    function sortValue_11 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.AssignedQueueName
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 46, column 56
    function sortValue_2 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 52, column 50
    function sortValue_3 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.TargetDate
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 57, column 49
    function sortValue_4 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.CloseDate
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 63, column 41
    function sortValue_5 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.Priority
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 69, column 47
    function sortValue_6 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.Status
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 74, column 55
    function sortValue_7 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 79, column 59
    function sortValue_8 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.ExternalOwnerCCName
    }
    
    // 'sortBy' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 85, column 61
    function sortValue_9 (ActivitySearchView :  entity.ActivitySearchView) : java.lang.Object {
      return ActivitySearchView.AssignmentStatus
    }
    
    // 'value' attribute on RowIterator at ActivitySearchResultsLV.pcf: line 20, column 87
    function value_49 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivitySearchViewList
    }
    
    property get ActivitySearchViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("ActivitySearchViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivitySearchViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("ActivitySearchViewList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ActivitySearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at ActivitySearchResultsLV.pcf: line 35, column 47
    function action_16 () : void {
      ClaimWorkplan.go(ActivitySearchView.Claim); ActivityDetailForward.goInWorkspace(ActivitySearchView.Claim, ActivitySearchView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at ActivitySearchResultsLV.pcf: line 41, column 51
    function action_20 () : void {
      pcf.Claim.go(ActivitySearchView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at ActivitySearchResultsLV.pcf: line 41, column 51
    function action_dest_21 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivitySearchView.Claim)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at ActivitySearchResultsLV.pcf: line 52, column 50
    function fontColor_28 () : java.lang.String {
      return ActivitySearchView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at ActivitySearchResultsLV.pcf: line 29, column 49
    function valueRoot_14 () : java.lang.Object {
      return ActivitySearchView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at ActivitySearchResultsLV.pcf: line 29, column 49
    function value_12 () : java.lang.Boolean {
      return ActivitySearchView.Escalated
    }
    
    // 'value' attribute on TextCell (id=Subject) at ActivitySearchResultsLV.pcf: line 35, column 47
    function value_15 () : java.lang.String {
      return ActivitySearchView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at ActivitySearchResultsLV.pcf: line 41, column 51
    function value_19 () : java.lang.String {
      return ActivitySearchView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at ActivitySearchResultsLV.pcf: line 46, column 56
    function value_24 () : java.lang.String {
      return ActivitySearchView.ClaimInsuredName
    }
    
    // 'value' attribute on DateCell (id=DueDate) at ActivitySearchResultsLV.pcf: line 52, column 50
    function value_27 () : java.util.Date {
      return ActivitySearchView.TargetDate
    }
    
    // 'value' attribute on DateCell (id=Closed) at ActivitySearchResultsLV.pcf: line 57, column 49
    function value_31 () : java.util.Date {
      return ActivitySearchView.CloseDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at ActivitySearchResultsLV.pcf: line 63, column 41
    function value_34 () : typekey.Priority {
      return ActivitySearchView.Priority
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ActivitySearchResultsLV.pcf: line 69, column 47
    function value_37 () : typekey.ActivityStatus {
      return ActivitySearchView.Status
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at ActivitySearchResultsLV.pcf: line 74, column 55
    function value_40 () : java.lang.Boolean {
      return ActivitySearchView.ExternallyOwned
    }
    
    // 'value' attribute on TextCell (id=ExternalOwner) at ActivitySearchResultsLV.pcf: line 79, column 59
    function value_43 () : java.lang.String {
      return ActivitySearchView.ExternalOwnerCCName
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at ActivitySearchResultsLV.pcf: line 85, column 61
    function value_46 () : java.lang.String {
      return ActivitySearchView.AssigneeDisplayString
    }
    
    property get ActivitySearchView () : entity.ActivitySearchView {
      return getIteratedValue(1) as entity.ActivitySearchView
    }
    
    
  }
  
  
}