package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 46, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenDueTodayFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 49, column 84
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getNotReviewOpenDueInNDaysFilter(7)
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 52, column 80
    function filter_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 55, column 80
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewOpenOverdueFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 58, column 88
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.NotReviewExternalOpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 61, column 92
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getNotReviewCompletedLastNDaysFilter(30)
    }
    
    // 'initialValue' attribute on Variable at DesktopActivitiesLV.pcf: line 21, column 55
    function initialValue_0 () : gw.api.desktop.DesktopActivityFilterSet {
      return new gw.api.desktop.DesktopActivityFilterSet()
    }
    
    // 'label' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 49, column 84
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.DueNDays", 7)
    }
    
    // 'label' attribute on ToolbarFilterOption at DesktopActivitiesLV.pcf: line 61, column 92
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Java.ToolBar.Activities.ClosedLastNDays", 30)
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 93, column 41
    function sortValue_10 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 99, column 48
    function sortValue_11 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 106, column 52
    function sortValue_12 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 112, column 57
    function sortValue_13 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 124, column 56
    function sortValue_14 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 130, column 40
    function sortValue_15 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.LOBCode
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 136, column 45
    function sortValue_16 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 86, column 51
    function sortValue_9 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on RowIterator at DesktopActivitiesLV.pcf: line 28, column 87
    function value_60 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityDesktopViewList
    }
    
    property get ActivityDesktopViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("ActivityDesktopViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("ActivityDesktopViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.desktop.DesktopActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.desktop.DesktopActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.desktop.DesktopActivityFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    /**
     * For performance reasons, we cannot just disable the activity subject link if the user cannot view the activity - it
     * would require us to read in every activity and claim on the page. Instead we only check permissions if the user actually
     * clicks on the activity subject link (so we only load the claim and activity for the entry that is clicked on)
     */
    function goToActivity(activityView : ActivityDesktopView) {
      if (perm.Claim.view(activityView.Claim) and perm.Activity.view(activityView.Activity)) {
        ClaimWorkplan.go(activityView.Claim)
        if (not gw.api.activity.ActivityUtil.isWorksheetOpen(activityView.Activity.ID)) {
          ActivityDetailForward.goInWorkspace(activityView.Claim, activityView.Activity)
        }
      } else {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.DesktopActivities.CannotView"))
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/activities/DesktopActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DesktopActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at DesktopActivitiesLV.pcf: line 99, column 48
    function action_35 () : void {
      goToActivity(ActivityDesktopView)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopActivitiesLV.pcf: line 106, column 52
    function action_39 () : void {
      pcf.Claim.go(ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopActivitiesLV.pcf: line 112, column 57
    function action_44 () : void {
      ClaimContactDetailPopup.push(ActivityDesktopView.ClaimInsured, ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopActivitiesLV.pcf: line 106, column 52
    function action_dest_40 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopActivitiesLV.pcf: line 112, column 57
    function action_dest_45 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityDesktopView.ClaimInsured, ActivityDesktopView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at DesktopActivitiesLV.pcf: line 31, column 35
    function condition_17 () : java.lang.Boolean {
      return ActivityDesktopView.canAssign() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityDesktopView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at DesktopActivitiesLV.pcf: line 34, column 33
    function condition_18 () : java.lang.Boolean {
      return ActivityDesktopView.canSkip() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityDesktopView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at DesktopActivitiesLV.pcf: line 37, column 37
    function condition_19 () : java.lang.Boolean {
      return ActivityDesktopView.canComplete() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityDesktopView.ID)
    }
    
    // 'condition' attribute on ToolbarFlag at DesktopActivitiesLV.pcf: line 40, column 36
    function condition_20 () : java.lang.Boolean {
      return ActivityDesktopView.canApprove() && !gw.api.activity.ActivityUtil.isWorksheetOpen(ActivityDesktopView.ID)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at DesktopActivitiesLV.pcf: line 86, column 51
    function fontColor_28 () : java.lang.String {
      return ActivityDesktopView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at DesktopActivitiesLV.pcf: line 71, column 63
    function valueRoot_23 () : java.lang.Object {
      return ActivityDesktopView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Updated) at DesktopActivitiesLV.pcf: line 71, column 63
    function value_21 () : java.lang.Boolean {
      return ActivityDesktopView.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at DesktopActivitiesLV.pcf: line 79, column 50
    function value_24 () : java.lang.Boolean {
      return ActivityDesktopView.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at DesktopActivitiesLV.pcf: line 86, column 51
    function value_27 () : java.util.Date {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at DesktopActivitiesLV.pcf: line 93, column 41
    function value_31 () : typekey.Priority {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at DesktopActivitiesLV.pcf: line 99, column 48
    function value_34 () : java.lang.String {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at DesktopActivitiesLV.pcf: line 106, column 52
    function value_38 () : java.lang.String {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at DesktopActivitiesLV.pcf: line 112, column 57
    function value_43 () : java.lang.String {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=Exposure) at DesktopActivitiesLV.pcf: line 119, column 49
    function value_48 () : java.lang.String {
      return ActivityDesktopView.Exposure
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at DesktopActivitiesLV.pcf: line 124, column 56
    function value_51 () : java.lang.Boolean {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at DesktopActivitiesLV.pcf: line 130, column 40
    function value_54 () : typekey.LOBCode {
      return ActivityDesktopView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at DesktopActivitiesLV.pcf: line 136, column 45
    function value_57 () : typekey.Jurisdiction {
      return ActivityDesktopView.JurisdictionState
    }
    
    property get ActivityDesktopView () : entity.ActivityDesktopView {
      return getIteratedValue(1) as entity.ActivityDesktopView
    }
    
    
  }
  
  
}