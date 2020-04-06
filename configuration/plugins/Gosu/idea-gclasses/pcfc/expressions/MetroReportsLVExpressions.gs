package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroReportsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MetroReportsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=MetroReportDocument) at MetroReportsLV.pcf: line 65, column 50
    function action_19 () : void {
      MetroReport.Document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ReSubmit) at MetroReportsLV.pcf: line 76, column 38
    function action_23 () : void {
      MetroReport.Status = TC_NEW
    }
    
    // 'action' attribute on TypeKeyCell (id=MetroReportType) at MetroReportsLV.pcf: line 42, column 48
    function action_7 () : void {
      MetroReportDetailsPopup.push(Claim, MetroReport)
    }
    
    // 'action' attribute on TypeKeyCell (id=MetroReportType) at MetroReportsLV.pcf: line 42, column 48
    function action_dest_8 () : pcf.api.Destination {
      return pcf.MetroReportDetailsPopup.createDestination(Claim, MetroReport)
    }
    
    // 'available' attribute on Link (id=MetroReportDocument) at MetroReportsLV.pcf: line 65, column 50
    function available_17 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(MetroReport.Document)
    }
    
    // 'available' attribute on Link (id=ReSubmit) at MetroReportsLV.pcf: line 76, column 38
    function available_22 () : java.lang.Boolean {
      return MetroReport.Status == TC_INSUFFICIENTDATA
    }
    
    // 'condition' attribute on ToolbarFlag at MetroReportsLV.pcf: line 31, column 38
    function condition_4 () : java.lang.Boolean {
      return MetroReport.Status == TC_NEW or                                                           MetroReport.Status == TC_INSUFFICIENTDATA or                                                           MetroReport.Status == TC_ORDERFAILED or                                                           MetroReport.Status == TC_INQUIRYFAILED
    }
    
    // 'condition' attribute on ToolbarFlag at MetroReportsLV.pcf: line 34, column 41
    function condition_5 () : java.lang.Boolean {
      return MetroReport.Status != TC_NEW and                                                              MetroReport.Status != TC_INSUFFICIENTDATA and                                                              MetroReport.Status != TC_ORDERFAILED and                                                              MetroReport.Status != TC_INQUIRYFAILED
    }
    
    // 'label' attribute on Link (id=MetroReportDocument) at MetroReportsLV.pcf: line 65, column 50
    function label_20 () : java.lang.Object {
      return MetroReport.Document.Name
    }
    
    // 'tooltip' attribute on Link (id=MetroReportDocument) at MetroReportsLV.pcf: line 65, column 50
    function tooltip_21 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(MetroReport.Document)
    }
    
    // 'value' attribute on TypeKeyCell (id=MetroReportType) at MetroReportsLV.pcf: line 42, column 48
    function valueRoot_10 () : java.lang.Object {
      return MetroReport
    }
    
    // 'value' attribute on TypeKeyCell (id=MetroReportStatus) at MetroReportsLV.pcf: line 48, column 50
    function value_11 () : typekey.MetroReportStatus {
      return MetroReport.Status
    }
    
    // 'value' attribute on DateCell (id=MetroReportOrderDate) at MetroReportsLV.pcf: line 53, column 41
    function value_14 () : java.util.Date {
      return MetroReport.SentDate
    }
    
    // 'value' attribute on TypeKeyCell (id=MetroReportType) at MetroReportsLV.pcf: line 42, column 48
    function value_6 () : typekey.MetroReportType {
      return MetroReport.MetroReportType
    }
    
    // 'visible' attribute on Link (id=MetroReportDocument) at MetroReportsLV.pcf: line 65, column 50
    function visible_18 () : java.lang.Boolean {
      return MetroReport.hasDocument()
    }
    
    property get MetroReport () : entity.MetroReport {
      return getIteratedValue(1) as entity.MetroReport
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at MetroReportsLV.pcf: line 17, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'pickLocation' attribute on RowIterator at MetroReportsLV.pcf: line 26, column 40
    function pickLocation_24 () : void {
      NewMetroReportDetailsPopup.push(Claim)
    }
    
    // 'value' attribute on RowIterator at MetroReportsLV.pcf: line 42, column 48
    function sortValue_1 (MetroReport :  entity.MetroReport) : java.lang.Object {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on RowIterator at MetroReportsLV.pcf: line 48, column 50
    function sortValue_2 (MetroReport :  entity.MetroReport) : java.lang.Object {
      return MetroReport.Status
    }
    
    // 'value' attribute on RowIterator at MetroReportsLV.pcf: line 53, column 41
    function sortValue_3 (MetroReport :  entity.MetroReport) : java.lang.Object {
      return MetroReport.SentDate
    }
    
    // 'toRemove' attribute on RowIterator at MetroReportsLV.pcf: line 26, column 40
    function toRemove_25 (MetroReport :  entity.MetroReport) : void {
      Claim.removeFromMetroReports(MetroReport)
    }
    
    // 'value' attribute on RowIterator at MetroReportsLV.pcf: line 26, column 40
    function value_26 () : entity.MetroReport[] {
      return Claim.MetroReports
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}