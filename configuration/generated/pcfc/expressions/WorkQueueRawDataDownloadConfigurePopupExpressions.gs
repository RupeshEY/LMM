package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueRawDataDownloadConfigurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueRawDataDownloadConfigurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=download) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 50, column 75
    function action_7 () : void {
      completeDownload()
    }
    
    // 'afterEnter' attribute on Popup (id=WorkQueueRawDataDownloadConfigurePopup) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 13, column 96
    function afterEnter_8 () : void {
      initDates()
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 36, column 36
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      StartDateTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 44, column 34
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      EndDateTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueRawDataDownloadConfigurePopup.pcf: line 19, column 50
    function initialValue_0 () : gw.api.web.tools.WorkQueueInfoPage {
      return new gw.api.web.tools.WorkQueueInfoPage()
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 36, column 36
    function value_1 () : java.util.Date {
      return StartDateTime
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WorkQueueRawDataDownloadConfigurePopup.pcf: line 44, column 34
    function value_4 () : java.util.Date {
      return EndDateTime
    }
    
    override property get CurrentLocation () : pcf.WorkQueueRawDataDownloadConfigurePopup {
      return super.CurrentLocation as pcf.WorkQueueRawDataDownloadConfigurePopup
    }
    
    property get EndDateTime () : java.util.Date {
      return getVariableValue("EndDateTime", 0) as java.util.Date
    }
    
    property set EndDateTime ($arg :  java.util.Date) {
      setVariableValue("EndDateTime", 0, $arg)
    }
    
    property get Page () : gw.api.web.tools.WorkQueueInfoPage {
      return getVariableValue("Page", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setVariableValue("Page", 0, $arg)
    }
    
    property get StartDateTime () : java.util.Date {
      return getVariableValue("StartDateTime", 0) as java.util.Date
    }
    
    property set StartDateTime ($arg :  java.util.Date) {
      setVariableValue("StartDateTime", 0, $arg)
    }
    
    
    function initDates() {
      EndDateTime = DateUtil.currentDate()
      StartDateTime = DateUtil.trimToMidnight(EndDateTime)
    }
    
    function completeDownload() {
      if (StartDateTime.compareTo(EndDateTime) > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.InternalTools.WorkQueueLv.RawDataDownloadConfigure.StartDateCannotBeGreaterThanEndDate"))
      }
      Page.downloadCsv(StartDateTime, EndDateTime)
    }
    
    
  }
  
  
}