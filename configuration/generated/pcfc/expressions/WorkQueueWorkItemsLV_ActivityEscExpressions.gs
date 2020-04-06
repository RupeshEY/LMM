package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.ActivityEsc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueWorkItemsLV_ActivityEscExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.ActivityEsc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkQueueWorkItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 26, column 83
    function checkBoxVisible_39 () : java.lang.Boolean {
      return item.Status != TC_AVAILABLE
    }
    
    // 'condition' attribute on ToolbarFlag at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 45, column 28
    function condition_11 () : java.lang.Boolean {
      return item.Status == TC_CHECKEDOUT || item.Status == TC_FAILED
    }
    
    // 'initialValue' attribute on Variable at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 30, column 26
    function initialValue_10 () : Activity {
      return gw.api.database.Query.make(entity.Activity).compare("Id", Equals, new gw.pl.persistence.core.Key(entity.Activity, item.Target)).select().first() // Activity(item.Target)
    }
    
    // RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 26, column 83
    function initializeVariables_40 () : void {
        actv = gw.api.database.Query.make(entity.Activity).compare("Id", Equals, new gw.pl.persistence.core.Key(entity.Activity, item.Target)).select().first() // Activity(item.Target);

    }
    
    // 'value' attribute on TextCell (id=ItemId) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 52, column 51
    function valueRoot_14 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=activityId) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 91, column 51
    function valueRoot_35 () : java.lang.Object {
      return actv
    }
    
    // 'value' attribute on TextCell (id=ItemId) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 52, column 51
    function value_12 () : gw.pl.persistence.core.Key {
      return item.ID
    }
    
    // 'value' attribute on DateCell (id=createdTime) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 58, column 38
    function value_15 () : java.util.Date {
      return item.CreationTime
    }
    
    // 'value' attribute on DateCell (id=updateTime) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 64, column 40
    function value_18 () : java.util.Date {
      return item.LastUpdateTime
    }
    
    // 'value' attribute on DateCell (id=availableAt) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 71, column 46
    function value_21 () : java.util.Date {
      return item.AvailableSinceAsDate
    }
    
    // 'value' attribute on TextCell (id=checkedOutBy) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 75, column 38
    function value_24 () : java.lang.String {
      return item.CheckedOutBy
    }
    
    // 'value' attribute on TextCell (id=writerId) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 80, column 39
    function value_27 () : java.lang.Long {
      return item.ProcessHistoryID
    }
    
    // 'value' attribute on TextCell (id=retries) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 85, column 42
    function value_30 () : java.lang.Integer {
      return item.Attempts
    }
    
    // 'value' attribute on TextCell (id=activityId) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 91, column 51
    function value_33 () : gw.pl.persistence.core.Key {
      return actv.ID
    }
    
    // 'value' attribute on TextCell (id=activitySubject) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 96, column 33
    function value_36 () : java.lang.String {
      return actv.Subject
    }
    
    property get actv () : Activity {
      return getVariableValue("actv", 1) as Activity
    }
    
    property set actv ($arg :  Activity) {
      setVariableValue("actv", 1, $arg)
    }
    
    property get item () : entity.StandardWorkItem {
      return getIteratedValue(1) as entity.StandardWorkItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.ActivityEsc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueWorkItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 34, column 74
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllProblems()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 37, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllFailures()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 39, column 72
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllErrors()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 41, column 72
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllActive()
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 52, column 51
    function sortValue_4 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.ID
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 58, column 38
    function sortValue_5 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.CreationTime
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 64, column 40
    function sortValue_6 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.LastUpdateTime
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 75, column 38
    function sortValue_7 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.CheckedOutBy
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 80, column 39
    function sortValue_8 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.ProcessHistoryID
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 85, column 42
    function sortValue_9 (item :  entity.StandardWorkItem) : java.lang.Object {
      return item.Attempts
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.ActivityEsc.pcf: line 26, column 83
    function value_41 () : gw.api.database.IQueryBeanResult<entity.StandardWorkItem> {
      return Helper.getWorkItems( Queue ) as gw.api.database.IQueryBeanResult<StandardWorkItem>
    }
    
    property get Helper () : gw.api.web.tools.WorkQueueInfoPage {
      return getRequireValue("Helper", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Helper ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setRequireValue("Helper", 0, $arg)
    }
    
    property get Queue () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getRequireValue("Queue", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set Queue ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setRequireValue("Queue", 0, $arg)
    }
    
    
  }
  
  
}