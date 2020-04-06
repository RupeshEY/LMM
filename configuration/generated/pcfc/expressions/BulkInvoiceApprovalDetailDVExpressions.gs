package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceApprovalDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceApprovalDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_34 () : java.lang.Boolean {
      return bulkInvoice.CreateUser.Contact != null
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_56 () : java.lang.Boolean {
      return bulkInvoice.Payee != null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 12, column 225
    function action_27 () : void {
      AddressBookPickerPopup.push(statictypeof (bulkInvoice.CreateUser.Contact))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 14, column 151
    function action_29 () : void {
      bulkInvoice.CreateUser.Contact = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 10, column 154
    function action_30 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(bulkInvoice.CreateUser.Contact),true)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function action_49 () : void {
      AddressBookPickerPopup.push(statictypeof (bulkInvoice.Payee))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 14, column 151
    function action_51 () : void {
      bulkInvoice.Payee = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function action_52 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(bulkInvoice.Payee),true)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_28 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (bulkInvoice.CreateUser.Contact))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_31 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(bulkInvoice.CreateUser.Contact),true)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_50 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (bulkInvoice.Payee))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_53 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(bulkInvoice.Payee),true)
    }
    
    // 'def' attribute on ListViewInput at BulkInvoiceApprovalDetailDV.pcf: line 30, column 93
    function def_onEnter_3 (def :  pcf.ApprovalHistoryLV) : void {
      def.onEnter(bulkInvoice.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceApprovalDetailDV.pcf: line 103, column 27
    function def_onEnter_59 (def :  pcf.PaymentMethodInputSet) : void {
      def.onEnter(bulkInvoice, null, false, new org.apache.commons.lang3.mutable.MutableBoolean(false))
    }
    
    // 'def' attribute on ListViewInput at BulkInvoiceApprovalDetailDV.pcf: line 30, column 93
    function def_refreshVariables_4 (def :  pcf.ApprovalHistoryLV) : void {
      def.refreshVariables(bulkInvoice.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceApprovalDetailDV.pcf: line 103, column 27
    function def_refreshVariables_60 (def :  pcf.PaymentMethodInputSet) : void {
      def.refreshVariables(bulkInvoice, null, false, new org.apache.commons.lang3.mutable.MutableBoolean(false))
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at BulkInvoiceApprovalDetailDV.pcf: line 46, column 42
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      activity.ApprovalRationale = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceApprovalDetailDV.pcf: line 16, column 27
    function initialValue_0 () : BulkInvoice {
      return activity.BulkInvoice
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceApprovalDetailDV.pcf: line 20, column 52
    function initialValue_1 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceApprovalDetailDV.pcf: line 25, column 71
    function initialValue_2 () : gw.api.database.IQueryBeanResult<BulkInvoiceItem> {
      return bulkInvoice.SortedInvoiceItemsQuery
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function sortValue_61 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Status
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 139, column 50
    function sortValue_62 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.PaymentType
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 144, column 63
    function sortValue_63 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Amount
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 148, column 50
    function sortValue_64 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Description
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 153, column 50
    function sortValue_65 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Explanation
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at BulkInvoiceApprovalDetailDV.pcf: line 46, column 42
    function valueRoot_12 () : java.lang.Object {
      return activity
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceApprovalDetailDV.pcf: line 57, column 44
    function valueRoot_15 () : java.lang.Object {
      return bulkInvoice
    }
    
    // 'value' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 10, column 154
    function valueRoot_33 () : java.lang.Object {
      return bulkInvoice.CreateUser
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceApprovalDetailDV.pcf: line 57, column 44
    function value_13 () : java.lang.String {
      return bulkInvoice.InvoiceNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at BulkInvoiceApprovalDetailDV.pcf: line 62, column 48
    function value_16 () : typekey.BulkInvoiceStatus {
      return bulkInvoice.Status
    }
    
    // 'value' attribute on DateInput (id=ReceivedDate) at BulkInvoiceApprovalDetailDV.pcf: line 66, column 43
    function value_19 () : java.util.Date {
      return bulkInvoice.ReceivedDate
    }
    
    // 'value' attribute on DateInput (id=CreateDate) at BulkInvoiceApprovalDetailDV.pcf: line 70, column 41
    function value_22 () : java.util.Date {
      return bulkInvoice.CreateTime
    }
    
    // 'value' attribute on AddressBookContactInput (id=Details_CreateUser) at BulkInvoiceApprovalDetailDV.pcf: line 75, column 41
    function value_25 () : entity.UserContact {
      return bulkInvoice.CreateUser.Contact
    }
    
    // 'value' attribute on TextInput (id=Memo) at BulkInvoiceApprovalDetailDV.pcf: line 82, column 35
    function value_38 () : java.lang.String {
      return bulkInvoice.Memo
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at BulkInvoiceApprovalDetailDV.pcf: line 86, column 48
    function value_41 () : java.util.Date {
      return bulkInvoice.ScheduledSendDate
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at BulkInvoiceApprovalDetailDV.pcf: line 91, column 56
    function value_44 () : typekey.CheckHandlingInstructions {
      return bulkInvoice.CheckInstructions
    }
    
    // 'value' attribute on AddressBookContactInput (id=Payee) at BulkInvoiceApprovalDetailDV.pcf: line 100, column 36
    function value_47 () : entity.Contact {
      return bulkInvoice.Payee
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at BulkInvoiceApprovalDetailDV.pcf: line 46, column 42
    function value_8 () : java.lang.String {
      return activity.ApprovalRationale
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceApprovalDetailDV.pcf: line 114, column 88
    function value_93 () : gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> {
      return bulkInvoiceItems
    }
    
    // 'valueType' attribute on AddressBookContactInput (id=Details_CreateUser) at BulkInvoiceApprovalDetailDV.pcf: line 75, column 41
    function verifyValueType_37 () : void {
      var __valueTypeArg : entity.UserContact
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Details_CreateUser) at AddressBookContactWidget.xml: line 12, column 225
    function visible_26 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (bulkInvoice.CreateUser.Contact))" != "" && true
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function visible_48 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (bulkInvoice.Payee))" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=ArchivedClaimsWarning) at BulkInvoiceApprovalDetailDV.pcf: line 36, column 52
    function visible_5 () : java.lang.Boolean {
      return bulkInvoice.hasArchivedClaims()
    }
    
    // 'visible' attribute on TextInput (id=ApprovalRationale) at BulkInvoiceApprovalDetailDV.pcf: line 46, column 42
    function visible_7 () : java.lang.Boolean {
      return activity.canApprove()
    }
    
    property get activity () : Activity {
      return getRequireValue("activity", 0) as Activity
    }
    
    property set activity ($arg :  Activity) {
      setRequireValue("activity", 0, $arg)
    }
    
    property get bulkInvoice () : BulkInvoice {
      return getVariableValue("bulkInvoice", 0) as BulkInvoice
    }
    
    property set bulkInvoice ($arg :  BulkInvoice) {
      setVariableValue("bulkInvoice", 0, $arg)
    }
    
    property get bulkInvoiceItems () : gw.api.database.IQueryBeanResult<BulkInvoiceItem> {
      return getVariableValue("bulkInvoiceItems", 0) as gw.api.database.IQueryBeanResult<BulkInvoiceItem>
    }
    
    property set bulkInvoiceItems ($arg :  gw.api.database.IQueryBeanResult<BulkInvoiceItem>) {
      setVariableValue("bulkInvoiceItems", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get helper () : gw.api.financials.BulkPayHelper {
      return getRequireValue("helper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set helper ($arg :  gw.api.financials.BulkPayHelper) {
      setRequireValue("helper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkInvoiceApprovalDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.Status = (__VALUE_TO_SET as typekey.BulkInvoiceItemStatus)
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemExplanation) at BulkInvoiceApprovalDetailDV.pcf: line 153, column 50
    function defaultSetter_91 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.Explanation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'outputConversion' attribute on TextCell (id=InvoiceItemReserveLine) at BulkInvoiceApprovalDetailDV.pcf: line 134, column 56
    function outputConversion_77 (VALUE :  entity.ReserveLineWrapper) : java.lang.String {
      return helper.getReserveLineDisplayNameForApprovalDetails(VALUE)
    }
    
    // 'valueRange' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function valueRange_70 () : java.lang.Object {
      return new BulkInvoiceItemStatus[] {BulkInvoiceItemStatus.TC_REJECTED, BulkInvoiceItemStatus.TC_INREVIEW}
    }
    
    // 'value' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function valueRoot_69 () : java.lang.Object {
      return invoiceItem
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemClaimNum) at BulkInvoiceApprovalDetailDV.pcf: line 127, column 56
    function valueRoot_75 () : java.lang.Object {
      return invoiceItem.Claim
    }
    
    // 'value' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function value_66 () : typekey.BulkInvoiceItemStatus {
      return invoiceItem.Status
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemClaimNum) at BulkInvoiceApprovalDetailDV.pcf: line 127, column 56
    function value_73 () : java.lang.String {
      return invoiceItem.Claim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemReserveLine) at BulkInvoiceApprovalDetailDV.pcf: line 134, column 56
    function value_76 () : entity.ReserveLineWrapper {
      return invoiceItem.ReserveLineWrapper
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemPaymentType) at BulkInvoiceApprovalDetailDV.pcf: line 139, column 50
    function value_80 () : typekey.PaymentType {
      return invoiceItem.PaymentType
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemAmount) at BulkInvoiceApprovalDetailDV.pcf: line 144, column 63
    function value_83 () : gw.api.financials.CurrencyAmount {
      return invoiceItem.Amount
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemDescription) at BulkInvoiceApprovalDetailDV.pcf: line 148, column 50
    function value_86 () : java.lang.String {
      return invoiceItem.Description
    }
    
    // 'value' attribute on TextCell (id=InvoiceItemExplanation) at BulkInvoiceApprovalDetailDV.pcf: line 153, column 50
    function value_89 () : java.lang.String {
      return invoiceItem.Explanation
    }
    
    // 'valueRange' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function verifyValueRangeIsAllowedType_71 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function verifyValueRangeIsAllowedType_71 ($$arg :  typekey.BulkInvoiceItemStatus[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=InvoiceItemStatus) at BulkInvoiceApprovalDetailDV.pcf: line 122, column 60
    function verifyValueRange_72 () : void {
      var __valueRangeArg = new BulkInvoiceItemStatus[] {BulkInvoiceItemStatus.TC_REJECTED, BulkInvoiceItemStatus.TC_INREVIEW}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_71(__valueRangeArg)
    }
    
    property get invoiceItem () : entity.BulkInvoiceItem {
      return getIteratedValue(1) as entity.BulkInvoiceItem
    }
    
    
  }
  
  
}