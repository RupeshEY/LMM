package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConsistencyChecksRunsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecksRunsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 138, column 24
    function sortValue_3 (Row :  entity.DBConsistCheckRun) : java.lang.Object {
      return Row.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 165, column 33
    function sortValue_4 (Row :  entity.DBConsistCheckRun) : java.lang.Object {
      return Row.ID
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 19, column 66
    function value_48 () : java.util.List<entity.DBConsistCheckRun> {
      return PageHelper.ConsistCheckRunsByStartTime
    }
    
    // 'visible' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 39, column 60
    function visible_0 () : java.lang.Boolean {
      return PageHelper.ShowDownloadErrorsColHeader
    }
    
    // 'visible' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 53, column 61
    function visible_1 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    // 'visible' attribute on RowIterator at ConsistencyChecksRunsLV.pcf: line 78, column 51
    function visible_2 () : java.lang.Boolean {
      return PageHelper.ShowRerunColHeader
    }
    
    property get PageHelper () : gw.api.tools.ConsistencyChecksRunsPageHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.ConsistencyChecksRunsPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.ConsistencyChecksRunsPageHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ConsistencyChecksRunsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=LVDelete) at ConsistencyChecksRunsLV.pcf: line 71, column 44
    function action_13 () : void {
      PageHelper.deleteDBConsistCheckRun(Row)
    }
    
    // 'action' attribute on Link (id=LVRerunLink) at ConsistencyChecksRunsLV.pcf: line 83, column 85
    function action_16 () : void {
      PageHelper.submitRerunBatch(Row)
    }
    
    // 'action' attribute on Link (id=LVDownload) at ConsistencyChecksRunsLV.pcf: line 33, column 97
    function action_5 () : void {
      PageHelper.downloadConsistencyCheckRun(Row)
    }
    
    // 'action' attribute on Link (id=LVDownloadErrors) at ConsistencyChecksRunsLV.pcf: line 47, column 49
    function action_7 () : void {
      PageHelper.downloadConsistencyCheckErrorsRun(Row)
    }
    
    // 'action' attribute on Link (id=View) at ConsistencyChecksRunsLV.pcf: line 59, column 41
    function action_9 () : void {
      ReportView.push("DBCCRun", Row.PublicID)
    }
    
    // 'action' attribute on Link (id=View) at ConsistencyChecksRunsLV.pcf: line 59, column 41
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ReportView.createDestination("DBCCRun", Row.PublicID)
    }
    
    // 'confirmMessage' attribute on Link (id=LVDelete) at ConsistencyChecksRunsLV.pcf: line 71, column 44
    function confirmMessage_14 () : java.lang.String {
      return DisplayKey.get("Java.Web.ConsistencyCheck.DeleteConfirmation") 
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at ConsistencyChecksRunsLV.pcf: line 91, column 24
    function valueRoot_20 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at ConsistencyChecksRunsLV.pcf: line 91, column 24
    function value_18 () : java.lang.String {
      return Row.Description
    }
    
    // 'value' attribute on TextCell (id=numErrors) at ConsistencyChecksRunsLV.pcf: line 99, column 29
    function value_21 () : java.lang.Integer {
      return Row.NumErrorExecs
    }
    
    // 'value' attribute on TextCell (id=totalChecks) at ConsistencyChecksRunsLV.pcf: line 107, column 29
    function value_24 () : java.lang.Integer {
      return Row.TotalNumChecks
    }
    
    // 'value' attribute on TextCell (id=cellNotStarted) at ConsistencyChecksRunsLV.pcf: line 115, column 29
    function value_27 () : java.lang.Integer {
      return Row.TotalNumChecks - Row.NumExecsInProgress - Row.NumExecsFinished
    }
    
    // 'value' attribute on TextCell (id=cellInProgress) at ConsistencyChecksRunsLV.pcf: line 123, column 29
    function value_29 () : java.lang.Integer {
      return Row.NumExecsInProgress
    }
    
    // 'value' attribute on TextCell (id=cellFinished) at ConsistencyChecksRunsLV.pcf: line 131, column 29
    function value_32 () : java.lang.String {
      return "" + Row.NumExecsFinished + " ( " + ((100 * Row.NumExecsFinished) / Row.TotalNumChecks)  + "% )"
    }
    
    // 'value' attribute on DateCell (id=LVStartTime) at ConsistencyChecksRunsLV.pcf: line 138, column 24
    function value_35 () : java.util.Date {
      return Row.StartTime
    }
    
    // 'value' attribute on DateCell (id=LVEndTime) at ConsistencyChecksRunsLV.pcf: line 146, column 24
    function value_38 () : java.util.Date {
      return Row.EndTime
    }
    
    // 'value' attribute on TextCell (id=LVDuration) at ConsistencyChecksRunsLV.pcf: line 152, column 24
    function value_41 () : java.lang.String {
      return PageHelper.getFormattedDuration(Row.Duration?.longValue())
    }
    
    // 'value' attribute on TextCell (id=LVVersion) at ConsistencyChecksRunsLV.pcf: line 160, column 29
    function value_43 () : java.lang.String {
      return "( " + (Row.MajorSchemaVersion as String) + ", " + (Row.MinorSchemaVersion as String) + ", " + (Row.PlatformMajorSchemaVersion as String) + ", " + (Row.PlatformMinorSchemaVersion as String) + ", " + (Row.ExtensionsSchemaVersion as String) + " )"
    }
    
    // 'value' attribute on TextCell (id=LVPubliciD) at ConsistencyChecksRunsLV.pcf: line 165, column 33
    function value_45 () : java.lang.String {
      return Row.PublicID
    }
    
    // 'visible' attribute on LinkCell (id=ViewLinkCell) at ConsistencyChecksRunsLV.pcf: line 53, column 61
    function visible_11 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    // 'visible' attribute on Link (id=LVDelete) at ConsistencyChecksRunsLV.pcf: line 71, column 44
    function visible_12 () : java.lang.Boolean {
      return Row.EndTime != null
    }
    
    // 'visible' attribute on Link (id=LVRerunLink) at ConsistencyChecksRunsLV.pcf: line 83, column 85
    function visible_15 () : java.lang.Boolean {
      return PageHelper.runContainsSqlErrors(Row) and Row.EndTime != null
    }
    
    // 'visible' attribute on LinkCell (id=RerunHeader) at ConsistencyChecksRunsLV.pcf: line 78, column 51
    function visible_17 () : java.lang.Boolean {
      return PageHelper.ShowRerunColHeader
    }
    
    // 'valueVisible' attribute on TextCell (id=cellFinished) at ConsistencyChecksRunsLV.pcf: line 131, column 29
    function visible_33 () : java.lang.Boolean {
      return Row.TotalNumChecks != 0
    }
    
    // 'visible' attribute on Link (id=LVDownloadErrors) at ConsistencyChecksRunsLV.pcf: line 47, column 49
    function visible_6 () : java.lang.Boolean {
      return Row.NumErrorExecs > 0
    }
    
    // 'visible' attribute on LinkCell (id=DownloadHeaderErrors) at ConsistencyChecksRunsLV.pcf: line 39, column 60
    function visible_8 () : java.lang.Boolean {
      return PageHelper.ShowDownloadErrorsColHeader
    }
    
    property get Row () : entity.DBConsistCheckRun {
      return getIteratedValue(1) as entity.DBConsistCheckRun
    }
    
    
  }
  
  
}