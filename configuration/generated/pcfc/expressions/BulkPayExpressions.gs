package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.BulkInvoiceUIHelper
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkPay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkPayExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkPay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkPayExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at BulkPay.pcf: line 72, column 86
    function action_18 () : void {
      helper.clearMessages()
    }
    
    // 'action' attribute on ToolbarButton (id=CreateNewButton) at BulkPay.pcf: line 36, column 46
    function action_8 () : void {
      NewBulkInvoiceDetail.go()
    }
    
    // 'action' attribute on ToolbarButton (id=CreateNewButton) at BulkPay.pcf: line 36, column 46
    function action_dest_9 () : pcf.api.Destination {
      return pcf.NewBulkInvoiceDetail.createDestination()
    }
    
    // 'canVisit' attribute on Page (id=BulkPay) at BulkPay.pcf: line 9, column 85
    static function canVisit_21 () : java.lang.Boolean {
      return perm.BulkInvoice.view
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DeleteButton) at BulkPay.pcf: line 44, column 46
    function checkedRowAction_11 (element :  entity.BulkInvoice, CheckedValue :  entity.BulkInvoice) : void {
      CheckedValue.delete()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=SubmitButton) at BulkPay.pcf: line 52, column 44
    function checkedRowAction_13 (element :  entity.BulkInvoice, CheckedValue :  entity.BulkInvoice) : void {
      validateAndSubmit(CheckedValue)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=StopButton) at BulkPay.pcf: line 60, column 44
    function checkedRowAction_15 (element :  entity.BulkInvoice, CheckedValue :  entity.BulkInvoice) : void {
      CheckedValue.stopBulkInvoice()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=VoidButton) at BulkPay.pcf: line 67, column 44
    function checkedRowAction_17 (element :  entity.BulkInvoice, CheckedValue :  entity.BulkInvoice) : void {
      CheckedValue.voidBulkInvoice()
    }
    
    // 'def' attribute on PanelRef at BulkPay.pcf: line 75, column 88
    function def_onEnter_19 (def :  pcf.BulkInvoicesLV) : void {
      def.onEnter(helper.getBulkInvoicesByStatus(BulkInvoiceActiveStatus))
    }
    
    // 'def' attribute on PanelRef at BulkPay.pcf: line 75, column 88
    function def_refreshVariables_20 (def :  pcf.BulkInvoicesLV) : void {
      def.refreshVariables(helper.getBulkInvoicesByStatus(BulkInvoiceActiveStatus))
    }
    
    // 'value' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkPayFilter = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at BulkPay.pcf: line 15, column 47
    function initialValue_0 () : gw.api.financials.BulkPayHelper {
      return new gw.api.financials.BulkPayHelper()
    }
    
    // Page (id=BulkPay) at BulkPay.pcf: line 9, column 85
    static function parent_22 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function valueRange_4 () : java.lang.Object {
      return BulkPayFilterOptions
    }
    
    // 'value' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function value_1 () : java.lang.String {
      return bulkPayFilter
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=BulkPayFilter) at BulkPay.pcf: line 29, column 40
    function verifyValueRange_6 () : void {
      var __valueRangeArg = BulkPayFilterOptions
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=DeleteButton) at BulkPay.pcf: line 44, column 46
    function visible_10 () : java.lang.Boolean {
      return perm.BulkInvoice.delete
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=SubmitButton) at BulkPay.pcf: line 52, column 44
    function visible_12 () : java.lang.Boolean {
      return perm.BulkInvoice.edit
    }
    
    // 'visible' attribute on ToolbarButton (id=CreateNewButton) at BulkPay.pcf: line 36, column 46
    function visible_7 () : java.lang.Boolean {
      return perm.BulkInvoice.create
    }
    
    override property get CurrentLocation () : pcf.BulkPay {
      return super.CurrentLocation as pcf.BulkPay
    }
    
    property get bulkPayFilter () : String {
      return getVariableValue("bulkPayFilter", 0) as String
    }
    
    property set bulkPayFilter ($arg :  String) {
      setVariableValue("bulkPayFilter", 0, $arg)
    }
    
    property get helper () : gw.api.financials.BulkPayHelper {
      return getVariableValue("helper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set helper ($arg :  gw.api.financials.BulkPayHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    
    property get BulkInvoiceActiveStatus() : BulkInvoiceStatus[] {
      if (DisplayKey.get("Web.Financials.BulkPay.Filter.Active") == bulkPayFilter) {
        return new BulkInvoiceStatus[]{BulkInvoiceStatus.TC_AWAITINGSUBMISSION, BulkInvoiceStatus.TC_DRAFT, BulkInvoiceStatus.TC_INREVIEW,
               BulkInvoiceStatus.TC_INVALIDITEMS, BulkInvoiceStatus.TC_ONHOLD, BulkInvoiceStatus.TC_PENDINGITEMVALIDATION,
               BulkInvoiceStatus.TC_PENDINGSTOP, BulkInvoiceStatus.TC_PENDINGVOID, BulkInvoiceStatus.TC_REJECTED,
               BulkInvoiceStatus.TC_REQUESTED, BulkInvoiceStatus.TC_REQUESTING}
      } else {
        return null
     }
    }
    
    property get BulkPayFilterOptions() : String[] {
      return {DisplayKey.get("Web.Financials.BulkPay.Filter.Active"), DisplayKey.get("Web.Financials.BulkPay.Filter.All")}
    }
    
    function validateAndSubmit(bi : BulkInvoice) {
      bi.validate()
    
      if (bi.Submittable) {
        BulkInvoiceUIHelper.beforeSubmit(bi)
        bi.refresh()
        bi.submitForApproval()
      }
    }
    
    
  }
  
  
}