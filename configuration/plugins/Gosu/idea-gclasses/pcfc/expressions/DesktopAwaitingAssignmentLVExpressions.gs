package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopAwaitingAssignmentLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopAwaitingAssignmentLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopAwaitingAssignmentLV.pcf: line 32, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.MyAssignmentReviewActivitiesFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopAwaitingAssignmentLV.pcf: line 36, column 43
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.MyGroupAssignmentReviewActivitiesFilter
    }
    
    // 'initialValue' attribute on Variable at DesktopAwaitingAssignmentLV.pcf: line 18, column 65
    function initialValue_0 () : gw.api.desktop.DesktopAwaitingAssignmentFilterSet {
      return new gw.api.desktop.DesktopAwaitingAssignmentFilterSet()
    }
    
    // 'value' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 58, column 54
    function sortValue_4 (ActivityUnassignedView :  entity.ActivityUnassignedView) : java.lang.Object {
      return ActivityUnassignedView.TargetDate
    }
    
    // 'value' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 64, column 55
    function sortValue_5 (ActivityUnassignedView :  entity.ActivityUnassignedView) : java.lang.Object {
      return ActivityUnassignedView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 69, column 60
    function sortValue_6 (ActivityUnassignedView :  entity.ActivityUnassignedView) : java.lang.Object {
      return ActivityUnassignedView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 74, column 51
    function sortValue_7 (ActivityUnassignedView :  entity.ActivityUnassignedView) : java.lang.Object {
      return ActivityUnassignedView.Subject
    }
    
    // 'sortBy' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 89, column 64
    function sortValue_8 (ActivityUnassignedView :  entity.ActivityUnassignedView) : java.lang.Object {
      return ActivityUnassignedView.AssignedUserName
    }
    
    // 'value' attribute on RowIterator at DesktopAwaitingAssignmentLV.pcf: line 24, column 89
    function value_41 () : gw.api.database.IQueryBeanResult<entity.ActivityUnassignedView> {
      return ActivityUnassignedViewList
    }
    
    // 'visible' attribute on ToolbarFilterOption at DesktopAwaitingAssignmentLV.pcf: line 36, column 43
    function visible_3 () : java.lang.Boolean {
      return perm.System.viewteam
    }
    
    property get ActivityUnassignedViewList () : gw.api.database.IQueryBeanResult<ActivityUnassignedView> {
      return getRequireValue("ActivityUnassignedViewList", 0) as gw.api.database.IQueryBeanResult<ActivityUnassignedView>
    }
    
    property set ActivityUnassignedViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityUnassignedView>) {
      setRequireValue("ActivityUnassignedViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.desktop.DesktopAwaitingAssignmentFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.desktop.DesktopAwaitingAssignmentFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.desktop.DesktopAwaitingAssignmentFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DesktopAwaitingAssignmentLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopAwaitingAssignmentLV.pcf: line 64, column 55
    function action_20 () : void {
      pcf.Claim.go(ActivityUnassignedView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopAwaitingAssignmentLV.pcf: line 69, column 60
    function action_25 () : void {
      ClaimContactDetailPopup.push(ActivityUnassignedView.ClaimInsured, ActivityUnassignedView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopAwaitingAssignmentLV.pcf: line 64, column 55
    function action_dest_21 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityUnassignedView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopAwaitingAssignmentLV.pcf: line 69, column 60
    function action_dest_26 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityUnassignedView.ClaimInsured, ActivityUnassignedView.Claim)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at DesktopAwaitingAssignmentLV.pcf: line 58, column 54
    function fontColor_16 () : java.lang.String {
      return ActivityUnassignedView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at DesktopAwaitingAssignmentLV.pcf: line 45, column 66
    function valueRoot_11 () : java.lang.Object {
      return ActivityUnassignedView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at DesktopAwaitingAssignmentLV.pcf: line 52, column 53
    function value_12 () : java.lang.Boolean {
      return ActivityUnassignedView.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at DesktopAwaitingAssignmentLV.pcf: line 58, column 54
    function value_15 () : java.util.Date {
      return ActivityUnassignedView.TargetDate
    }
    
    // 'value' attribute on TextCell (id=CaseID) at DesktopAwaitingAssignmentLV.pcf: line 64, column 55
    function value_19 () : java.lang.String {
      return ActivityUnassignedView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at DesktopAwaitingAssignmentLV.pcf: line 69, column 60
    function value_24 () : java.lang.String {
      return ActivityUnassignedView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=Info) at DesktopAwaitingAssignmentLV.pcf: line 74, column 51
    function value_29 () : java.lang.String {
      return ActivityUnassignedView.Subject
    }
    
    // 'value' attribute on TextCell (id=Exposure) at DesktopAwaitingAssignmentLV.pcf: line 79, column 52
    function value_32 () : java.lang.String {
      return ActivityUnassignedView.Exposure
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at DesktopAwaitingAssignmentLV.pcf: line 84, column 72
    function value_35 () : java.lang.String {
      return ActivityUnassignedView.UnassignedActivityUserReview
    }
    
    // 'value' attribute on TextCell (id=Assigner) at DesktopAwaitingAssignmentLV.pcf: line 89, column 64
    function value_38 () : java.lang.String {
      return ActivityUnassignedView.ActivityAssignedUser
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at DesktopAwaitingAssignmentLV.pcf: line 45, column 66
    function value_9 () : java.lang.Boolean {
      return ActivityUnassignedView.UpdatedSinceLastViewed
    }
    
    property get ActivityUnassignedView () : entity.ActivityUnassignedView {
      return getIteratedValue(1) as entity.ActivityUnassignedView
    }
    
    
  }
  
  
}