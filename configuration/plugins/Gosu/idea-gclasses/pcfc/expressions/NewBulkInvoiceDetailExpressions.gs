package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewBulkInvoiceDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewBulkInvoiceDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    function afterCancel_10 () : void {
      helper.flushCache(); BulkPay.go()
    }
    
    // 'afterCommit' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    function afterCommit_11 (TopLocation :  pcf.api.Location) : void {
      helper.flushCache(); EditBulkInvoiceDetail.go( bulkInvoice )
    }
    
    // 'beforeCommit' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    function beforeCommit_12 (pickedValue :  java.lang.Object) : void {
      helper.clearUnusedReserveLineWrappers(bulkInvoice); bulkInvoice.verifyChangesAllowed()
    }
    
    // 'beforeValidate' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    function beforeValidate_13 (pickedValue :  java.lang.Object) : void {
      helper.prepBulkInvoiceForSave(bulkInvoice, CostType.TC_UNSPECIFIED, CostCategory.TC_UNSPECIFIED); paymentMethodHelper.cleanUpBeforeCommit()
    }
    
    // 'canEdit' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    function canEdit_14 () : java.lang.Boolean {
      return perm.BulkInvoice.create
    }
    
    // 'canVisit' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    static function canVisit_15 () : java.lang.Boolean {
      return perm.BulkInvoice.create
    }
    
    // 'def' attribute on PanelRef at NewBulkInvoiceDetail.pcf: line 47, column 106
    function def_onEnter_6 (def :  pcf.BulkInvoiceDetailDV) : void {
      def.onEnter(bulkInvoice, payeeLinkStatus, paymentMethodHelper, showAddressFields)
    }
    
    // 'def' attribute on PanelRef at NewBulkInvoiceDetail.pcf: line 49, column 55
    function def_onEnter_8 (def :  pcf.BulkInvoiceItemsLV) : void {
      def.onEnter(bulkInvoice, helper)
    }
    
    // 'def' attribute on PanelRef at NewBulkInvoiceDetail.pcf: line 47, column 106
    function def_refreshVariables_7 (def :  pcf.BulkInvoiceDetailDV) : void {
      def.refreshVariables(bulkInvoice, payeeLinkStatus, paymentMethodHelper, showAddressFields)
    }
    
    // 'def' attribute on PanelRef at NewBulkInvoiceDetail.pcf: line 49, column 55
    function def_refreshVariables_9 (def :  pcf.BulkInvoiceItemsLV) : void {
      def.refreshVariables(bulkInvoice, helper)
    }
    
    // 'initialValue' attribute on Variable at NewBulkInvoiceDetail.pcf: line 22, column 47
    function initialValue_0 () : gw.api.financials.BulkPayHelper {
      return new gw.api.financials.BulkPayHelper()
    }
    
    // 'initialValue' attribute on Variable at NewBulkInvoiceDetail.pcf: line 26, column 27
    function initialValue_1 () : BulkInvoice {
      return helper.newBulkInvoice()
    }
    
    // 'initialValue' attribute on Variable at NewBulkInvoiceDetail.pcf: line 31, column 54
    function initialValue_2 () : gw.api.contact.ContactSystemLinkStatus {
      return bulkInvoice.Payee!=null ? gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(bulkInvoice.Payee) : null
    }
    
    // 'initialValue' attribute on Variable at NewBulkInvoiceDetail.pcf: line 35, column 53
    function initialValue_3 () : gw.api.financials.PaymentMethodHelper {
      return new gw.api.financials.PaymentMethodHelper(bulkInvoice)
    }
    
    // 'initialValue' attribute on Variable at NewBulkInvoiceDetail.pcf: line 39, column 63
    function initialValue_4 () : org.apache.commons.lang3.mutable.MutableBoolean {
      return new org.apache.commons.lang3.mutable.MutableBoolean(false)
    }
    
    // EditButtons at NewBulkInvoiceDetail.pcf: line 44, column 23
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=NewBulkInvoiceDetail) at NewBulkInvoiceDetail.pcf: line 16, column 90
    static function parent_16 () : pcf.api.Destination {
      return pcf.BulkPay.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewBulkInvoiceDetail {
      return super.CurrentLocation as pcf.NewBulkInvoiceDetail
    }
    
    property get bulkInvoice () : BulkInvoice {
      return getVariableValue("bulkInvoice", 0) as BulkInvoice
    }
    
    property set bulkInvoice ($arg :  BulkInvoice) {
      setVariableValue("bulkInvoice", 0, $arg)
    }
    
    property get helper () : gw.api.financials.BulkPayHelper {
      return getVariableValue("helper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set helper ($arg :  gw.api.financials.BulkPayHelper) {
      setVariableValue("helper", 0, $arg)
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
    
    
  }
  
  
}