package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.Archive.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueWorkItemsLV_ArchiveExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.Archive.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WorkQueueWorkItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 26, column 82
    function checkBoxVisible_34 () : java.lang.Boolean {
      return item.Status != TC_AVAILABLE
    }
    
    // 'condition' attribute on ToolbarFlag at WorkQueueWorkItemsLV.Archive.pcf: line 41, column 28
    function condition_10 () : java.lang.Boolean {
      return item.Status == TC_CHECKEDOUT || item.Status == TC_FAILED
    }
    
    // 'value' attribute on TextCell (id=ItemId) at WorkQueueWorkItemsLV.Archive.pcf: line 49, column 27
    function valueRoot_13 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=ItemId) at WorkQueueWorkItemsLV.Archive.pcf: line 49, column 27
    function value_11 () : gw.pl.persistence.core.Key {
      return item.ID
    }
    
    // 'value' attribute on DateCell (id=createdTime) at WorkQueueWorkItemsLV.Archive.pcf: line 55, column 38
    function value_14 () : java.util.Date {
      return item.CreationTime
    }
    
    // 'value' attribute on DateCell (id=updateTime) at WorkQueueWorkItemsLV.Archive.pcf: line 61, column 40
    function value_17 () : java.util.Date {
      return item.LastUpdateTime
    }
    
    // 'value' attribute on DateCell (id=availableAt) at WorkQueueWorkItemsLV.Archive.pcf: line 68, column 46
    function value_20 () : java.util.Date {
      return item.AvailableSinceAsDate
    }
    
    // 'value' attribute on TextCell (id=checkedOutBy) at WorkQueueWorkItemsLV.Archive.pcf: line 72, column 38
    function value_23 () : java.lang.String {
      return item.CheckedOutBy
    }
    
    // 'value' attribute on TextCell (id=writerId) at WorkQueueWorkItemsLV.Archive.pcf: line 77, column 39
    function value_26 () : java.lang.Long {
      return item.ProcessHistoryID
    }
    
    // 'value' attribute on TextCell (id=retries) at WorkQueueWorkItemsLV.Archive.pcf: line 82, column 42
    function value_29 () : java.lang.Integer {
      return item.Attempts
    }
    
    // 'value' attribute on TextCell (id=itemInfo) at WorkQueueWorkItemsLV.Archive.pcf: line 87, column 123
    function value_32 () : java.lang.String {
      return com.guidewire.pl.system.dependency.PLDependencies.getDomainGraphSupport().getInformationalString(item)
    }
    
    property get item () : entity.ArchiveWorkItem {
      return getIteratedValue(1) as entity.ArchiveWorkItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueWorkItemsLV.Archive.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueWorkItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.Archive.pcf: line 30, column 74
    function filter_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllProblems()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.Archive.pcf: line 33, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllFailures()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.Archive.pcf: line 35, column 72
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllErrors()
    }
    
    // 'filter' attribute on ToolbarFilterOption at WorkQueueWorkItemsLV.Archive.pcf: line 37, column 72
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.web.tools.WorkQueueInfoPage.AllActive()
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 49, column 27
    function sortValue_4 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.ID
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 55, column 38
    function sortValue_5 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.CreationTime
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 61, column 40
    function sortValue_6 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.LastUpdateTime
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 72, column 38
    function sortValue_7 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.CheckedOutBy
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 77, column 39
    function sortValue_8 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.ProcessHistoryID
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 82, column 42
    function sortValue_9 (item :  entity.ArchiveWorkItem) : java.lang.Object {
      return item.Attempts
    }
    
    // 'value' attribute on RowIterator (id=WorkItems) at WorkQueueWorkItemsLV.Archive.pcf: line 26, column 82
    function value_35 () : gw.api.database.IQueryBeanResult<entity.ArchiveWorkItem> {
      return Helper.getWorkItems( Queue ) as gw.api.database.IQueryBeanResult<ArchiveWorkItem>
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