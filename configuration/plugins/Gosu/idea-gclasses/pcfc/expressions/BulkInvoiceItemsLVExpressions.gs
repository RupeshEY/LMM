package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceItemsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceItemsLV.pcf: line 23, column 71
    function initialValue_0 () : gw.api.database.IQueryBeanResult<BulkInvoiceItem> {
      return bulkInvoice.SortedInvoiceItemsQuery
    }
    
    // 'footerLabel' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 105, column 49
    function label_11 () : java.lang.Object {
      return gw.api.util.CurrencyUtil.renderAsCurrency(bulkInvoice.TotalCurrencyAmount)
    }
    
    // 'footerLabel' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 112, column 49
    function label_12 () : java.lang.Object {
      return gw.api.util.CurrencyUtil.renderAsCurrency(bulkInvoice.DeductionsSum)
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 42, column 43
    function sortValue_1 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 88, column 43
    function sortValue_3 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.PaymentType
    }
    
    // 'sortBy' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 105, column 49
    function sortValue_4 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Amount
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 112, column 49
    function sortValue_5 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.DeductionsAmount
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 118, column 46
    function sortValue_6 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.DateOfService
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 124, column 44
    function sortValue_7 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Description
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 128, column 44
    function sortValue_8 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Explanation
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 133, column 54
    function sortValue_9 (invoiceItem :  entity.BulkInvoiceItem) : java.lang.Object {
      return invoiceItem.Status
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 32, column 82
    function toCreateAndAdd_84 () : entity.BulkInvoiceItem {
      return bulkInvoice.addNewInvoiceItem()
    }
    
    // 'toRemove' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 32, column 82
    function toRemove_85 (invoiceItem :  entity.BulkInvoiceItem) : void {
      bulkInvoice.removeFromInvoiceItems(invoiceItem)
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 32, column 82
    function value_86 () : gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> {
      return bulkInvoiceItems
    }
    
    // 'visible' attribute on RowIterator at BulkInvoiceItemsLV.pcf: line 51, column 54
    function visible_2 () : java.lang.Boolean {
      return bulkInvoice.hasArchivedClaims()
    }
    
    property get bulkInvoice () : BulkInvoice {
      return getRequireValue("bulkInvoice", 0) as BulkInvoice
    }
    
    property set bulkInvoice ($arg :  BulkInvoice) {
      setRequireValue("bulkInvoice", 0, $arg)
    }
    
    property get bulkInvoiceItems () : gw.api.database.IQueryBeanResult<BulkInvoiceItem> {
      return getVariableValue("bulkInvoiceItems", 0) as gw.api.database.IQueryBeanResult<BulkInvoiceItem>
    }
    
    property set bulkInvoiceItems ($arg :  gw.api.database.IQueryBeanResult<BulkInvoiceItem>) {
      setVariableValue("bulkInvoiceItems", 0, $arg)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get helper () : gw.api.financials.BulkPayHelper {
      return getRequireValue("helper", 0) as gw.api.financials.BulkPayHelper
    }
    
    property set helper ($arg :  gw.api.financials.BulkPayHelper) {
      setRequireValue("helper", 0, $arg)
    }
    
    function verifyClaimPermission(claimNum : String, item : BulkInvoiceItem) : String {
      var claim = gw.api.database.Query.make(entity.Claim).compare("ClaimNumber", Equals, claimNum).select().FirstResult
      var claimInfo = gw.api.database.Query.make(entity.ClaimInfo).compare("ClaimNumber", Equals, claimNum).select().FirstResult
      if (claimInfo == null) {
        return DisplayKey.get("Web.Financials.BulkPay.InvoiceItem.Alert.ClaimNotFound", claimNum)
      }
      //if archived claim, throw exception, however, if the archived claim is already saved previously, it is okay
      if (claimInfo.ArchiveState != null and item.ClaimNumber != claimNum) {
        return DisplayKey.get("Web.Financials.BulkPay.InvoiceItem.Alert.ClaimIsArchived",  claimNum )
      }
      if (claim != null and !perm.Claim.view(claim)) {
        return DisplayKey.get("Web.Financials.BulkPay.Error.NoPermissionForClaim") 
      }
      return null
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkInvoiceItemsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function available_26 () : java.lang.Boolean {
      return invoiceItem.Claim != null
    }
    
    // 'available' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function available_36 () : java.lang.Boolean {
      return invoiceItem.ReserveLineWrapper != null and invoiceItem.ReserveLineWrapper.ReserveLine == null
    }
    
    // 'available' attribute on TypeKeyCell (id=BulkInvoiceItemsLV_PaymentType) at BulkInvoiceItemsLV.pcf: line 88, column 43
    function available_45 () : java.lang.Boolean {
      return invoiceItem.Claim != null and invoiceItem.ReserveLineWrapper != null
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_ClaimNumber) at BulkInvoiceItemsLV.pcf: line 42, column 43
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.ReserveLineWrapper = (__VALUE_TO_SET as entity.ReserveLineWrapper)
    }
    
    // 'value' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.Exposure = (__VALUE_TO_SET as entity.Exposure)
    }
    
    // 'value' attribute on TypeKeyCell (id=BulkInvoiceItemsLV_PaymentType) at BulkInvoiceItemsLV.pcf: line 88, column 43
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.PaymentType = (__VALUE_TO_SET as typekey.PaymentType)
    }
    
    // 'value' attribute on DateCell (id=BulkInvoiceItemsLV_ServiceDate) at BulkInvoiceItemsLV.pcf: line 118, column 46
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.DateOfService = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_Description) at BulkInvoiceItemsLV.pcf: line 124, column 44
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoiceItem.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on CurrencyCell (id=BulkInvoiceItemsLV_Amount) at BulkInvoiceItemsLV.pcf: line 105, column 49
    function editable_53 () : java.lang.Boolean {
      return !invoiceItem.BulkInvoice.SplitEqually and invoiceItem.isEditable()
    }
    
    // 'editable' attribute on Row at BulkInvoiceItemsLV.pcf: line 34, column 41
    function editable_82 () : java.lang.Boolean {
      return invoiceItem.Editable
    }
    
    // 'filter' attribute on TypeKeyCell (id=BulkInvoiceItemsLV_PaymentType) at BulkInvoiceItemsLV.pcf: line 88, column 43
    function filter_51 (VALUE :  typekey.PaymentType, VALUES :  typekey.PaymentType[]) : java.lang.Boolean {
      return helper.isPaymentTypeValidForItem( invoiceItem, VALUE )
    }
    
    // 'onChange' attribute on PostOnChange at BulkInvoiceItemsLV.pcf: line 44, column 118
    function onChange_13 () : void {
      helper.cleanupClaim(invoiceItem); invoiceItem.setClaimByClaimNumber(invoiceItem.ClaimNumber)
    }
    
    // 'onChange' attribute on PostOnChange at BulkInvoiceItemsLV.pcf: line 64, column 250
    function onChange_25 () : void {
      invoiceItem.updateRelatedInvoiceItemFields(); invoiceItem.NonEroding = false; invoiceItem.PaymentType = invoiceItem.BulkInvoice.DefaultPaymentType == null ? PaymentType.TC_PARTIAL : invoiceItem.BulkInvoice.DefaultPaymentType
    }
    
    // 'optionLabel' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function optionLabel_32 (VALUE :  entity.ReserveLineWrapper) : java.lang.String {
      return helper.getReserveLineDisplayName(VALUE)
    }
    
    // 'requestValidationExpression' attribute on TextCell (id=BulkInvoiceItemsLV_ClaimNumber) at BulkInvoiceItemsLV.pcf: line 42, column 43
    function requestValidationExpression_17 (VALUE :  java.lang.String) : java.lang.Object {
      return verifyClaimPermission(VALUE, invoiceItem)
    }
    
    // 'validationExpression' attribute on TextCell (id=BulkInvoiceItemsLV_ClaimNumber) at BulkInvoiceItemsLV.pcf: line 42, column 43
    function validationExpression_14 () : java.lang.Object {
      if(invoiceItem.ClaimNumber != null) {if(invoiceItem.Claim == null || invoiceItem.ClaimInfo == null) {return DisplayKey.get("Web.Financials.BulkPay.InvoiceItem.Alert.ClaimNotFound", invoiceItem.ClaimNumber)} else if( invoiceItem.ClaimInfo.ArchiveState != null ) {return DisplayKey.get("Web.Financials.BulkPay.InvoiceItem.Alert.ClaimIsArchived", invoiceItem.ClaimNumber)}  } return null
    }
    
    // 'validationExpression' attribute on CurrencyCell (id=BulkInvoiceItemsLV_Amount) at BulkInvoiceItemsLV.pcf: line 105, column 49
    function validationExpression_54 () : java.lang.Object {
      return invoiceItem.Amount.Amount >= 0 ? null : DisplayKey.get("Web.Financials.BulkPay.InvoiceItem.AmountNotNegative")
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function valueRange_33 () : java.lang.Object {
      return helper.getReserveLines(invoiceItem)
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function valueRange_42 () : java.lang.Object {
      return helper.getExposures(invoiceItem)
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_ClaimNumber) at BulkInvoiceItemsLV.pcf: line 42, column 43
    function valueRoot_20 () : java.lang.Object {
      return invoiceItem
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_ClaimNumber) at BulkInvoiceItemsLV.pcf: line 42, column 43
    function value_15 () : java.lang.String {
      return invoiceItem.ClaimNumber
    }
    
    // 'value' attribute on BooleanRadioCell (id=BulkInvoiceItemsLV_Archived) at BulkInvoiceItemsLV.pcf: line 51, column 54
    function value_22 () : java.lang.Boolean {
      return invoiceItem.ItemClaimArchived
    }
    
    // 'value' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function value_27 () : entity.ReserveLineWrapper {
      return invoiceItem.ReserveLineWrapper
    }
    
    // 'value' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function value_37 () : entity.Exposure {
      return invoiceItem.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=BulkInvoiceItemsLV_PaymentType) at BulkInvoiceItemsLV.pcf: line 88, column 43
    function value_46 () : typekey.PaymentType {
      return invoiceItem.PaymentType
    }
    
    // 'value' attribute on CurrencyCell (id=BulkInvoiceItemsLV_Amount) at BulkInvoiceItemsLV.pcf: line 105, column 49
    function value_55 () : gw.api.financials.IMoney {
      return invoiceItem.AmountComponent
    }
    
    // 'value' attribute on CurrencyCell (id=BulkInvoiceItemsLV_DeductionsAmount) at BulkInvoiceItemsLV.pcf: line 112, column 49
    function value_61 () : gw.api.financials.CurrencyAmount {
      return invoiceItem.DeductionsAmount
    }
    
    // 'value' attribute on DateCell (id=BulkInvoiceItemsLV_ServiceDate) at BulkInvoiceItemsLV.pcf: line 118, column 46
    function value_65 () : java.util.Date {
      return invoiceItem.DateOfService
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_Description) at BulkInvoiceItemsLV.pcf: line 124, column 44
    function value_71 () : java.lang.String {
      return invoiceItem.Description
    }
    
    // 'value' attribute on TextCell (id=BulkInvoiceItemsLV_Alerts) at BulkInvoiceItemsLV.pcf: line 128, column 44
    function value_76 () : java.lang.String {
      return invoiceItem.Explanation
    }
    
    // 'value' attribute on TypeKeyCell (id=BulkInvoiceItemsLV_Status) at BulkInvoiceItemsLV.pcf: line 133, column 54
    function value_79 () : typekey.BulkInvoiceItemStatus {
      return invoiceItem.Status
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function verifyValueRangeIsAllowedType_34 ($$arg :  entity.ReserveLineWrapper[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function verifyValueRangeIsAllowedType_34 ($$arg :  gw.api.database.IQueryBeanResult<entity.ReserveLineWrapper>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function verifyValueRangeIsAllowedType_34 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function verifyValueRangeIsAllowedType_43 ($$arg :  entity.Exposure[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function verifyValueRangeIsAllowedType_43 ($$arg :  gw.api.database.IQueryBeanResult<entity.Exposure>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function verifyValueRangeIsAllowedType_43 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_ReserveLine) at BulkInvoiceItemsLV.pcf: line 62, column 49
    function verifyValueRange_35 () : void {
      var __valueRangeArg = helper.getReserveLines(invoiceItem)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_34(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=BulkInvoiceItemsLV_Exposure) at BulkInvoiceItemsLV.pcf: line 75, column 39
    function verifyValueRange_44 () : void {
      var __valueRangeArg = helper.getExposures(invoiceItem)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_43(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioCell (id=BulkInvoiceItemsLV_Archived) at BulkInvoiceItemsLV.pcf: line 51, column 54
    function visible_21 () : java.lang.Boolean {
      return bulkInvoice.hasArchivedClaims()
    }
    
    property get invoiceItem () : entity.BulkInvoiceItem {
      return getIteratedValue(1) as entity.BulkInvoiceItem
    }
    
    
  }
  
  
}