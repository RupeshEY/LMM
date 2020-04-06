package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceApprovalDetailWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceApprovalDetailWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Activity :  Activity) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=BulkInvoiceApprovalDetailWorksheet_ApproveButton) at BulkInvoiceApprovalDetailWorksheet.pcf: line 29, column 44
    function action_3 () : void {
      buttonAction(\ -> Activity.approve())
    }
    
    // 'action' attribute on ToolbarButton (id=BulkInvoiceApprovalDetailWorksheet_RejectButton) at BulkInvoiceApprovalDetailWorksheet.pcf: line 34, column 44
    function action_5 () : void {
      buttonAction(\ -> Activity.reject())
    }
    
    // 'action' attribute on ToolbarButton (id=BulkInvoiceApprovalDetailWorksheet_CancelButton) at BulkInvoiceApprovalDetailWorksheet.pcf: line 38, column 96
    function action_6 () : void {
      CurrentLocation.cancel()
    }
    
    // 'canVisit' attribute on Worksheet (id=BulkInvoiceApprovalDetailWorksheet) at BulkInvoiceApprovalDetailWorksheet.pcf: line 10, column 115
    static function canVisit_10 (Activity :  Activity) : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceApprovalDetailWorksheet.pcf: line 44, column 66
    function def_onEnter_8 (def :  pcf.BulkInvoiceApprovalDetailDV) : void {
      def.onEnter(Activity, PageHelper)
    }
    
    // 'def' attribute on PanelRef at BulkInvoiceApprovalDetailWorksheet.pcf: line 44, column 66
    function def_refreshVariables_9 (def :  pcf.BulkInvoiceApprovalDetailDV) : void {
      def.refreshVariables(Activity, PageHelper)
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceApprovalDetailWorksheet.pcf: line 18, column 47
    function initialValue_1 () : gw.api.financials.BulkPayHelper {
      return new gw.api.financials.BulkPayHelper()
    }
    
    // EditButtons at BulkInvoiceApprovalDetailWorksheet.pcf: line 41, column 34
    function label_7 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'location' attribute on Scope at BulkInvoiceApprovalDetailWorksheet.pcf: line 14, column 41
    function location_0 () : pcf.api.Destination {
      return pcf.Claim.createDestination(Activity.Claim)
    }
    
    // 'title' attribute on Worksheet (id=BulkInvoiceApprovalDetailWorksheet) at BulkInvoiceApprovalDetailWorksheet.pcf: line 10, column 115
    static function title_11 (Activity :  Activity) : java.lang.Object {
      return DisplayKey.get("JSP.ApprovalActivityDetailHeader.Detail.Title", Activity.Claim.ClaimNumber)
    }
    
    // 'visible' attribute on ToolbarButton (id=BulkInvoiceApprovalDetailWorksheet_ApproveButton) at BulkInvoiceApprovalDetailWorksheet.pcf: line 29, column 44
    function visible_2 () : java.lang.Boolean {
      return Activity.canApprove()
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.BulkInvoiceApprovalDetailWorksheet {
      return super.CurrentLocation as pcf.BulkInvoiceApprovalDetailWorksheet
    }
    
    property get PageHelper () : gw.api.financials.BulkPayHelper {
      return getVariableValue("PageHelper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set PageHelper ($arg :  gw.api.financials.BulkPayHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    function buttonAction(action()) {
      if (!CurrentLocation.InEditMode) {
        CurrentLocation.startEditing()
      } 
      
      action()
      CurrentLocation.commit()
    }
    
    
  }
  
  
}