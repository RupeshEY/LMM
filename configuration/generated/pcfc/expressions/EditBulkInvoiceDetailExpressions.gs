package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.financials.BulkInvoiceUIHelper
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditBulkInvoiceDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditBulkInvoiceDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (bulkInvoice :  BulkInvoice) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=SubmitButton) at EditBulkInvoiceDetail.pcf: line 50, column 85
    function action_7 () : void {
      validateAndSubmit()
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at EditBulkInvoiceDetail.pcf: line 56, column 86
    function action_8 () : void {
      
    }
    
    // 'afterCancel' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function afterCancel_13 () : void {
      bulkPayHelper.flushCache()
    }
    
    // 'afterCommit' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function afterCommit_14 (TopLocation :  pcf.api.Location) : void {
      bulkPayHelper.flushCache()
    }
    
    // 'available' attribute on ToolbarButton (id=SubmitButton) at EditBulkInvoiceDetail.pcf: line 50, column 85
    function available_6 () : java.lang.Boolean {
      return (bulkInvoice.Validateable or bulkInvoice.Submittable) and perm.BulkInvoice.edit
    }
    
    // 'beforeCommit' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function beforeCommit_15 (pickedValue :  java.lang.Object) : void {
      bulkInvoice.verifyChangesAllowed()
    }
    
    // 'beforeValidate' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function beforeValidate_16 (pickedValue :  java.lang.Object) : void {
      bulkPayHelper.prepBulkInvoiceForSave(bulkInvoice, CostType.TC_UNSPECIFIED, CostCategory.TC_UNSPECIFIED); paymentMethodHelper.cleanUpBeforeCommit()
    }
    
    // 'canEdit' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function canEdit_17 () : java.lang.Boolean {
      return perm.BulkInvoice.edit
    }
    
    // 'canVisit' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    static function canVisit_18 (bulkInvoice :  BulkInvoice) : java.lang.Boolean {
      return perm.BulkInvoice.view
    }
    
    // 'def' attribute on PanelRef at EditBulkInvoiceDetail.pcf: line 61, column 62
    function def_onEnter_11 (def :  pcf.BulkInvoiceItemsLV) : void {
      def.onEnter(bulkInvoice, bulkPayHelper)
    }
    
    // 'def' attribute on PanelRef at EditBulkInvoiceDetail.pcf: line 59, column 106
    function def_onEnter_9 (def :  pcf.BulkInvoiceDetailDV) : void {
      def.onEnter(bulkInvoice, payeeLinkStatus, paymentMethodHelper, showAddressFields)
    }
    
    // 'def' attribute on PanelRef at EditBulkInvoiceDetail.pcf: line 59, column 106
    function def_refreshVariables_10 (def :  pcf.BulkInvoiceDetailDV) : void {
      def.refreshVariables(bulkInvoice, payeeLinkStatus, paymentMethodHelper, showAddressFields)
    }
    
    // 'def' attribute on PanelRef at EditBulkInvoiceDetail.pcf: line 61, column 62
    function def_refreshVariables_12 (def :  pcf.BulkInvoiceItemsLV) : void {
      def.refreshVariables(bulkInvoice, bulkPayHelper)
    }
    
    // 'initialValue' attribute on Variable at EditBulkInvoiceDetail.pcf: line 22, column 47
    function initialValue_0 () : gw.api.financials.BulkPayHelper {
      return new gw.api.financials.BulkPayHelper()
    }
    
    // 'initialValue' attribute on Variable at EditBulkInvoiceDetail.pcf: line 30, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return bulkInvoice.Payee!=null ? gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(bulkInvoice.Payee) : null
    }
    
    // 'initialValue' attribute on Variable at EditBulkInvoiceDetail.pcf: line 34, column 53
    function initialValue_2 () : gw.api.financials.PaymentMethodHelper {
      return new gw.api.financials.PaymentMethodHelper(bulkInvoice)
    }
    
    // 'initialValue' attribute on Variable at EditBulkInvoiceDetail.pcf: line 38, column 63
    function initialValue_3 () : org.apache.commons.lang3.mutable.MutableBoolean {
      return new org.apache.commons.lang3.mutable.MutableBoolean(bulkInvoice.MailingAddress == null and bulkInvoice.Payee.PrimaryAddress == null) 
    }
    
    // EditButtons at EditBulkInvoiceDetail.pcf: line 44, column 73
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    static function parent_19 (bulkInvoice :  BulkInvoice) : pcf.api.Destination {
      return pcf.BulkPay.createDestination()
    }
    
    // 'startEditing' attribute on Page (id=EditBulkInvoiceDetail) at EditBulkInvoiceDetail.pcf: line 16, column 90
    function startEditing_20 () : void {
      showAddressFields.Value = paymentMethodHelper.setupMailingAddress() 
    }
    
    // 'editVisible' attribute on EditButtons at EditBulkInvoiceDetail.pcf: line 44, column 73
    function visible_4 () : java.lang.Boolean {
      return bulkInvoice.Editable and perm.BulkInvoice.edit
    }
    
    override property get CurrentLocation () : pcf.EditBulkInvoiceDetail {
      return super.CurrentLocation as pcf.EditBulkInvoiceDetail
    }
    
    property get bulkInvoice () : BulkInvoice {
      return getVariableValue("bulkInvoice", 0) as BulkInvoice
    }
    
    property set bulkInvoice ($arg :  BulkInvoice) {
      setVariableValue("bulkInvoice", 0, $arg)
    }
    
    property get bulkPayHelper () : gw.api.financials.BulkPayHelper {
      return getVariableValue("bulkPayHelper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set bulkPayHelper ($arg :  gw.api.financials.BulkPayHelper) {
      setVariableValue("bulkPayHelper", 0, $arg)
    }
    
    property get payeeLinkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("payeeLinkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set payeeLinkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("payeeLinkStatus", 0, $arg)
    }
    
    property get paymentMethodHelper () : gw.api.financials.PaymentMethodHelper {
      return getVariableValue("paymentMethodHelper", 0) as gw.api.financials.PaymentMethodHelper
    }
    
    property set paymentMethodHelper ($arg :  gw.api.financials.PaymentMethodHelper) {
      setVariableValue("paymentMethodHelper", 0, $arg)
    }
    
    property get showAddressFields () : org.apache.commons.lang3.mutable.MutableBoolean {
      return getVariableValue("showAddressFields", 0) as org.apache.commons.lang3.mutable.MutableBoolean
    }
    
    property set showAddressFields ($arg :  org.apache.commons.lang3.mutable.MutableBoolean) {
      setVariableValue("showAddressFields", 0, $arg)
    }
    
    
    public function validateAndSubmit() {
      if (bulkInvoice.Validateable) {
        bulkPayHelper.validateBulkInvoice(bulkInvoice)
        bulkInvoice.refresh()
      }
      
      if (bulkInvoice.Submittable) {
        BulkInvoiceUIHelper.beforeSubmit(bulkInvoice)
        bulkPayHelper.submitBulkInvoiceForApprovalAndCommit(bulkInvoice)
        bulkInvoice.refresh()
      }
    
    }
    
    
  }
  
  
}