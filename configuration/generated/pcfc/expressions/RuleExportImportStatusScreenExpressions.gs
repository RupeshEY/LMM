package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleExportImportStatusScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends RuleExportImportStatusScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 151, column 54
    function actionAvailable_60 () : java.lang.Boolean {
      return taskStatus.FailureReason != null
    }
    
    // 'action' attribute on TextCell (id=Rules) at RuleExportImportStatusScreen.pcf: line 137, column 51
    function action_51 () : void {
      RuleExportDetailsPopup.push(navigationSupport, exportTask)
    }
    
    // 'action' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 151, column 54
    function action_58 () : void {
      RuleExportImportFailurePopup.push(taskStatus.FailureReason)
    }
    
    // 'action' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 160, column 122
    function action_64 () : void {
      navigationSupport.VersionController.ExportImportController.requestExportImportTaskTermination(exportTask)
    }
    
    // 'action' attribute on Link (id=Download) at RuleExportImportStatusScreen.pcf: line 167, column 49
    function action_67 () : void {
      navigationSupport.VersionController.ExportImportController.sendExportedRulesToWebClient(exportTask)
    }
    
    // 'action' attribute on TextCell (id=Rules) at RuleExportImportStatusScreen.pcf: line 137, column 51
    function action_dest_52 () : pcf.api.Destination {
      return pcf.RuleExportDetailsPopup.createDestination(navigationSupport, exportTask)
    }
    
    // 'action' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 151, column 54
    function action_dest_59 () : pcf.api.Destination {
      return pcf.RuleExportImportFailurePopup.createDestination(taskStatus.FailureReason)
    }
    
    // 'confirmMessage' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 160, column 122
    function confirmMessage_65 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleExportImportStatusScreen.Export.CancelConfirmation', exportedRulesCountAsString)
    }
    
    // 'initialValue' attribute on Variable at RuleExportImportStatusScreen.pcf: line 112, column 71
    function initialValue_42 () : gw.bizrules.management.RuleExportImportTaskStatus {
      return gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, exportTask)
    }
    
    // 'initialValue' attribute on Variable at RuleExportImportStatusScreen.pcf: line 116, column 38
    function initialValue_43 () : java.lang.String {
      return navigationSupport.VersionController.ExportImportController.createExportTaskEntriesQuery(exportTask).select().Count as String
    }
    
    // RowIterator at RuleExportImportStatusScreen.pcf: line 108, column 78
    function initializeVariables_68 () : void {
        taskStatus = gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, exportTask);
  exportedRulesCountAsString = navigationSupport.VersionController.ExportImportController.createExportTaskEntriesQuery(exportTask).select().Count as String;

    }
    
    // 'percentage' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 144, column 28
    function percentage_55 () : java.lang.Double {
      return taskStatus.ProgressPercentage
    }
    
    // 'status' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 144, column 28
    function status_56 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleExportImportStatusScreen.Progress.Status', taskStatus.ProgressPercentage)
    }
    
    // 'value' attribute on TextCell (id=StartedBy) at RuleExportImportStatusScreen.pcf: line 122, column 57
    function valueRoot_46 () : java.lang.Object {
      return exportTask.StartedBy
    }
    
    // 'value' attribute on DateCell (id=Created) at RuleExportImportStatusScreen.pcf: line 131, column 28
    function valueRoot_49 () : java.lang.Object {
      return exportTask
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 151, column 54
    function valueRoot_62 () : java.lang.Object {
      return taskStatus.Status
    }
    
    // 'value' attribute on TextCell (id=StartedBy) at RuleExportImportStatusScreen.pcf: line 122, column 57
    function value_44 () : java.lang.String {
      return exportTask.StartedBy.DisplayName
    }
    
    // 'value' attribute on DateCell (id=Created) at RuleExportImportStatusScreen.pcf: line 131, column 28
    function value_47 () : java.util.Date {
      return exportTask.StartTime
    }
    
    // 'value' attribute on TextCell (id=Rules) at RuleExportImportStatusScreen.pcf: line 137, column 51
    function value_50 () : java.lang.String {
      return exportedRulesCountAsString
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 151, column 54
    function value_57 () : java.lang.String {
      return taskStatus.Status.DisplayName
    }
    
    // 'valueVisible' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 144, column 28
    function visible_54 () : java.lang.Boolean {
      return taskStatus.ProgressPercentage >= 0
    }
    
    // 'visible' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 160, column 122
    function visible_63 () : java.lang.Boolean {
      return taskStatus.Status == gw.bizrules.management.RuleExportImportTaskStatus.StatusType.IN_PROGRESS
    }
    
    // 'visible' attribute on Link (id=Download) at RuleExportImportStatusScreen.pcf: line 167, column 49
    function visible_66 () : java.lang.Boolean {
      return exportTask.hasData()
    }
    
    property get exportTask () : RuleExportTask {
      return getIteratedValue(1) as RuleExportTask
    }
    
    property get exportedRulesCountAsString () : java.lang.String {
      return getVariableValue("exportedRulesCountAsString", 1) as java.lang.String
    }
    
    property set exportedRulesCountAsString ($arg :  java.lang.String) {
      setVariableValue("exportedRulesCountAsString", 1, $arg)
    }
    
    property get taskStatus () : gw.bizrules.management.RuleExportImportTaskStatus {
      return getVariableValue("taskStatus", 1) as gw.bizrules.management.RuleExportImportTaskStatus
    }
    
    property set taskStatus ($arg :  gw.bizrules.management.RuleExportImportTaskStatus) {
      setVariableValue("taskStatus", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleExportImportStatusScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function actionAvailable_26 () : java.lang.Boolean {
      return taskStatus.FailureReason != null
    }
    
    // 'action' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function action_24 () : void {
      RuleExportImportFailurePopup.push(taskStatus.FailureReason)
    }
    
    // 'action' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 83, column 122
    function action_31 () : void {
      navigationSupport.VersionController.ExportImportController.requestExportImportTaskTermination(importTask)
    }
    
    // 'action' attribute on Link (id=ImportDetails) at RuleExportImportStatusScreen.pcf: line 90, column 69
    function action_35 () : void {
      RuleImportDetailsPopup.push(navigationSupport, importTask, taskStatus.Status == gw.bizrules.management.RuleExportImportTaskStatus.StatusType.COMPLETED)
    }
    
    // 'action' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function action_dest_25 () : pcf.api.Destination {
      return pcf.RuleExportImportFailurePopup.createDestination(taskStatus.FailureReason)
    }
    
    // 'action' attribute on Link (id=ImportDetails) at RuleExportImportStatusScreen.pcf: line 90, column 69
    function action_dest_36 () : pcf.api.Destination {
      return pcf.RuleImportDetailsPopup.createDestination(navigationSupport, importTask, taskStatus.Status == gw.bizrules.management.RuleExportImportTaskStatus.StatusType.COMPLETED)
    }
    
    // 'available' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function available_21 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'confirmMessage' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 83, column 122
    function confirmMessage_32 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleExportImportStatusScreen.Import.CancelConfirmation', importTask.SourceName)
    }
    
    // 'initialValue' attribute on Variable at RuleExportImportStatusScreen.pcf: line 38, column 71
    function initialValue_8 () : gw.bizrules.management.RuleExportImportTaskStatus {
      return gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, importTask)
    }
    
    // RowIterator at RuleExportImportStatusScreen.pcf: line 34, column 78
    function initializeVariables_38 () : void {
        taskStatus = gw.bizrules.management.RuleExportImportTaskStatus.of(navigationSupport.VersionController.ExportImportController, importTask);

    }
    
    // 'label' attribute on Link (id=ImportDetails) at RuleExportImportStatusScreen.pcf: line 90, column 69
    function label_37 () : java.lang.Object {
      return taskStatus.Status == gw.bizrules.management.RuleExportImportTaskStatus.StatusType.COMPLETED ? DisplayKey.get('BizRules.RuleExportImportStatusScreen.Review') : DisplayKey.get('BizRules.RuleExportImportStatusScreen.CompleteImport') 
    }
    
    // 'percentage' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 65, column 28
    function percentage_19 () : java.lang.Double {
      return taskStatus.ProgressPercentage
    }
    
    // 'status' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 65, column 28
    function status_20 () : java.lang.String {
      return DisplayKey.get('BizRules.RuleExportImportStatusScreen.Progress.Status', taskStatus.ProgressPercentage)
    }
    
    // 'value' attribute on TextCell (id=StartedBy) at RuleExportImportStatusScreen.pcf: line 44, column 57
    function valueRoot_11 () : java.lang.Object {
      return importTask.StartedBy
    }
    
    // 'value' attribute on DateCell (id=Created) at RuleExportImportStatusScreen.pcf: line 53, column 28
    function valueRoot_14 () : java.lang.Object {
      return importTask
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function valueRoot_28 () : java.lang.Object {
      return taskStatus.Status
    }
    
    // 'value' attribute on DateCell (id=Created) at RuleExportImportStatusScreen.pcf: line 53, column 28
    function value_12 () : java.util.Date {
      return importTask.StartTime
    }
    
    // 'value' attribute on TextCell (id=SourceName) at RuleExportImportStatusScreen.pcf: line 58, column 28
    function value_15 () : java.lang.String {
      return importTask.SourceName
    }
    
    // 'value' attribute on TextCell (id=Status) at RuleExportImportStatusScreen.pcf: line 73, column 54
    function value_22 () : java.lang.String {
      return taskStatus.Status.DisplayName
    }
    
    // 'value' attribute on TextCell (id=StartedBy) at RuleExportImportStatusScreen.pcf: line 44, column 57
    function value_9 () : java.lang.String {
      return importTask.StartedBy.DisplayName
    }
    
    // 'valueVisible' attribute on BarCell (id=Progress) at RuleExportImportStatusScreen.pcf: line 65, column 28
    function visible_18 () : java.lang.Boolean {
      return taskStatus.ProgressPercentage >= 0
    }
    
    // 'visible' attribute on Link (id=Cancel) at RuleExportImportStatusScreen.pcf: line 83, column 122
    function visible_30 () : java.lang.Boolean {
      return taskStatus.Status == gw.bizrules.management.RuleExportImportTaskStatus.StatusType.IN_PROGRESS
    }
    
    // 'visible' attribute on Link (id=ImportDetails) at RuleExportImportStatusScreen.pcf: line 90, column 69
    function visible_34 () : java.lang.Boolean {
      return importTask.BatchProcessCompleted != null
    }
    
    property get importTask () : RuleImportTask {
      return getIteratedValue(1) as RuleImportTask
    }
    
    property get taskStatus () : gw.bizrules.management.RuleExportImportTaskStatus {
      return getVariableValue("taskStatus", 1) as gw.bizrules.management.RuleExportImportTaskStatus
    }
    
    property set taskStatus ($arg :  gw.bizrules.management.RuleExportImportTaskStatus) {
      setVariableValue("taskStatus", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportImportStatusScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Import) at RuleExportImportStatusScreen.pcf: line 16, column 92
    function action_1 () : void {
      StartRuleImportPopup.push(navigationSupport)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at RuleExportImportStatusScreen.pcf: line 21, column 51
    function action_4 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=Import) at RuleExportImportStatusScreen.pcf: line 16, column 92
    function action_dest_2 () : pcf.api.Destination {
      return pcf.StartRuleImportPopup.createDestination(navigationSupport)
    }
    
    // 'available' attribute on ToolbarButton (id=Import) at RuleExportImportStatusScreen.pcf: line 16, column 92
    function available_0 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canImportRule()
    }
    
    // 'sortBy' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 122, column 57
    function sortValue_40 (exportTask :  RuleExportTask) : java.lang.Object {
      return exportTask.StartedBy
    }
    
    // 'value' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 131, column 28
    function sortValue_41 (exportTask :  RuleExportTask) : java.lang.Object {
      return exportTask.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 44, column 57
    function sortValue_5 (importTask :  RuleImportTask) : java.lang.Object {
      return importTask.StartedBy
    }
    
    // 'value' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 53, column 28
    function sortValue_6 (importTask :  RuleImportTask) : java.lang.Object {
      return importTask.StartTime
    }
    
    // 'value' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 58, column 28
    function sortValue_7 (importTask :  RuleImportTask) : java.lang.Object {
      return importTask.SourceName
    }
    
    // 'tooltip' attribute on ToolbarButton (id=Import) at RuleExportImportStatusScreen.pcf: line 16, column 92
    function tooltip_3 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetImportPermissionMsg()
    }
    
    // 'value' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 34, column 78
    function value_39 () : gw.api.database.IQueryBeanResult<RuleImportTask> {
      return navigationSupport.VersionController.ExportImportController.createImportTasksQuery().select()
    }
    
    // 'value' attribute on RowIterator at RuleExportImportStatusScreen.pcf: line 108, column 78
    function value_69 () : gw.api.database.IQueryBeanResult<RuleExportTask> {
      return navigationSupport.VersionController.ExportImportController.createExportTasksQuery().select()
    }
    
    // 'visible' attribute on PanelRef at RuleExportImportStatusScreen.pcf: line 97, column 70
    function visible_70 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canViewRule()
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    
  }
  
  
}