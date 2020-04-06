package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueHistoryDownloadConfigurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueHistoryDownloadConfigurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (WorkQueueDisplayInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=download) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 57, column 75
    function action_10 () : void {
      completeDownload()
    }
    
    // 'afterEnter' attribute on Popup (id=WorkQueueHistoryDownloadConfigurePopup) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 13, column 133
    function afterEnter_11 () : void {
      initDates()
    }
    
    // 'available' attribute on ButtonInput (id=download) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 57, column 75
    function available_8 () : java.lang.Boolean {
      return WorkQueueDisplayInfo.WriterLastExecutionTime != null
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 43, column 32
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 50, column 30
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueHistoryDownloadConfigurePopup.pcf: line 19, column 50
    function initialValue_0 () : gw.api.web.tools.WorkQueueInfoPage {
      return new gw.api.web.tools.WorkQueueInfoPage()
    }
    
    // 'title' attribute on Popup (id=WorkQueueHistoryDownloadConfigurePopup) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 13, column 133
    static function title_12 (WorkQueueDisplayInfo :  gw.api.web.tools.WorkQueueDisplayInfo) : java.lang.Object {
      return DisplayKey.get("Web.InternalTools.WorkQueueLv.DownloadHistoryConfigure", WorkQueueDisplayInfo.QueueType.Code)
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 43, column 32
    function value_2 () : java.util.Date {
      return StartDate
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 50, column 30
    function value_5 () : java.util.Date {
      return EndDate
    }
    
    // 'visible' attribute on Verbatim (id=NoHistoryText) at WorkQueueHistoryDownloadConfigurePopup.pcf: line 34, column 73
    function visible_1 () : java.lang.Boolean {
      return WorkQueueDisplayInfo.WriterLastExecutionTime == null
    }
    
    override property get CurrentLocation () : pcf.WorkQueueHistoryDownloadConfigurePopup {
      return super.CurrentLocation as pcf.WorkQueueHistoryDownloadConfigurePopup
    }
    
    property get EndDate () : java.util.Date {
      return getVariableValue("EndDate", 0) as java.util.Date
    }
    
    property set EndDate ($arg :  java.util.Date) {
      setVariableValue("EndDate", 0, $arg)
    }
    
    property get Page () : gw.api.web.tools.WorkQueueInfoPage {
      return getVariableValue("Page", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setVariableValue("Page", 0, $arg)
    }
    
    property get StartDate () : java.util.Date {
      return getVariableValue("StartDate", 0) as java.util.Date
    }
    
    property set StartDate ($arg :  java.util.Date) {
      setVariableValue("StartDate", 0, $arg)
    }
    
    property get WorkQueueDisplayInfo () : gw.api.web.tools.WorkQueueDisplayInfo {
      return getVariableValue("WorkQueueDisplayInfo", 0) as gw.api.web.tools.WorkQueueDisplayInfo
    }
    
    property set WorkQueueDisplayInfo ($arg :  gw.api.web.tools.WorkQueueDisplayInfo) {
      setVariableValue("WorkQueueDisplayInfo", 0, $arg)
    }
    
    
    function initDates() {
      EndDate = DateUtil.currentDate()
      StartDate = DateUtil.trimToMidnight(EndDate)
    }
    
    function completeDownload() {
      if (StartDate.compareTo(EndDate) > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.InternalTools.WorkQueueLv.DownloadHistory.StartDateCannotBeGreaterThanEndDate"))
      }
      var startDateAdjusted = DateUtil.trimToMidnight(StartDate)
      var endDateAdjusted = DateUtil.endOfDay(EndDate)
      Page.downloadHistory(WorkQueueDisplayInfo, startDateAdjusted, endDateAdjusted)
    }
    
    
  }
  
  
}