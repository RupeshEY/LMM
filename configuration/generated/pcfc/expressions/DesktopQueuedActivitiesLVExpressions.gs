package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DesktopQueuedActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopQueuedActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 47, column 55
    function sortValue_0 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.AssignmentDate
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 54, column 51
    function sortValue_1 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 60, column 41
    function sortValue_2 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 66, column 48
    function sortValue_3 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 73, column 52
    function sortValue_4 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 79, column 57
    function sortValue_5 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 91, column 56
    function sortValue_6 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 22, column 87
    function value_44 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ActivityDesktopViewList
    }
    
    property get ActivityDesktopViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("ActivityDesktopViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ActivityDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("ActivityDesktopViewList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DesktopQueuedActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at DesktopQueuedActivitiesLV.pcf: line 66, column 48
    function action_24 () : void {
      ClaimWorkplan.go(ActivityDesktopView.Claim); ActivityDetailForward.goInWorkspace(ActivityDesktopView.Claim, ActivityDesktopView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopQueuedActivitiesLV.pcf: line 73, column 52
    function action_28 () : void {
      pcf.Claim.go(ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopQueuedActivitiesLV.pcf: line 79, column 57
    function action_33 () : void {
      ClaimContactDetailPopup.push(ActivityDesktopView.ClaimInsured, ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at DesktopQueuedActivitiesLV.pcf: line 73, column 52
    function action_dest_29 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Insured) at DesktopQueuedActivitiesLV.pcf: line 79, column 57
    function action_dest_34 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ActivityDesktopView.ClaimInsured, ActivityDesktopView.Claim)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at DesktopQueuedActivitiesLV.pcf: line 22, column 87
    function checkBoxVisible_43 () : java.lang.Boolean {
      return perm.Activity.pickfromqueue
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at DesktopQueuedActivitiesLV.pcf: line 54, column 51
    function fontColor_17 () : java.lang.String {
      return ActivityDesktopView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at DesktopQueuedActivitiesLV.pcf: line 33, column 63
    function valueRoot_9 () : java.lang.Object {
      return ActivityDesktopView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at DesktopQueuedActivitiesLV.pcf: line 41, column 50
    function value_10 () : java.lang.Boolean {
      return ActivityDesktopView.Escalated
    }
    
    // 'value' attribute on DateCell (id=AssignmentDate) at DesktopQueuedActivitiesLV.pcf: line 47, column 55
    function value_13 () : java.util.Date {
      return ActivityDesktopView.AssignmentDate
    }
    
    // 'value' attribute on DateCell (id=DueDate) at DesktopQueuedActivitiesLV.pcf: line 54, column 51
    function value_16 () : java.util.Date {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at DesktopQueuedActivitiesLV.pcf: line 60, column 41
    function value_20 () : typekey.Priority {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at DesktopQueuedActivitiesLV.pcf: line 66, column 48
    function value_23 () : java.lang.String {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at DesktopQueuedActivitiesLV.pcf: line 73, column 52
    function value_27 () : java.lang.String {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at DesktopQueuedActivitiesLV.pcf: line 79, column 57
    function value_32 () : java.lang.String {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=Exposure) at DesktopQueuedActivitiesLV.pcf: line 86, column 49
    function value_37 () : java.lang.String {
      return ActivityDesktopView.Exposure
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at DesktopQueuedActivitiesLV.pcf: line 91, column 56
    function value_40 () : java.lang.Boolean {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at DesktopQueuedActivitiesLV.pcf: line 33, column 63
    function value_7 () : java.lang.Boolean {
      return ActivityDesktopView.UpdatedSinceLastViewed
    }
    
    property get ActivityDesktopView () : entity.ActivityDesktopView {
      return getIteratedValue(1) as entity.ActivityDesktopView
    }
    
    
  }
  
  
}