package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on BooleanRadioInput (id=ExchangeRateOverride) at BulkInvoiceDetailDV.pcf: line 91, column 142
    function available_31 () : java.lang.Boolean {
      return bulkInvoice.Currency != gw.api.util.CurrencyUtil.getReportingCurrency()
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceDetailDV.pcf: line 180, column 117
    function def_onEnter_90 (def :  pcf.PaymentMethodInputSet) : void {
      def.onEnter(bulkInvoice, paymentMethodHelper, isPayeeChangeable, showMailingAddressFields)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceDetailDV.pcf: line 180, column 117
    function def_refreshVariables_91 (def :  pcf.PaymentMethodInputSet) : void {
      def.refreshVariables(bulkInvoice, paymentMethodHelper, isPayeeChangeable, showMailingAddressFields)
    }
    
    // 'value' attribute on DateInput (id=ReceivedDate) at BulkInvoiceDetailDV.pcf: line 48, column 43
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.ReceivedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at BulkInvoiceDetailDV.pcf: line 201, column 56
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.CheckInstructions = (__VALUE_TO_SET as typekey.CheckHandlingInstructions)
    }
    
    // 'value' attribute on TextInput (id=Memo) at BulkInvoiceDetailDV.pcf: line 207, column 35
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.Memo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SplitEqually) at BulkInvoiceDetailDV.pcf: line 56, column 42
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.SplitEqually = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at BulkInvoiceDetailDV.pcf: line 80, column 66
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExchangeRateOverride) at BulkInvoiceDetailDV.pcf: line 91, column 142
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.OverrideTransToReportingExchangeRate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=ExchangeRate) at BulkInvoiceDetailDV.pcf: line 105, column 142
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.TransToReportingExchangeRateRate = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceDetailDV.pcf: line 42, column 44
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.InvoiceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=RateSet_Description) at BulkInvoiceDetailDV.pcf: line 113, column 143
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.TransToReportingExchangeRate.ExchangeRateSet.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCostType) at BulkInvoiceDetailDV.pcf: line 149, column 38
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.DefaultCostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCostCategory) at BulkInvoiceDetailDV.pcf: line 157, column 42
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.DefaultCostCategory = (__VALUE_TO_SET as typekey.CostCategory)
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultPaymentType) at BulkInvoiceDetailDV.pcf: line 165, column 41
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.DefaultPaymentType = (__VALUE_TO_SET as typekey.PaymentType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Reportability) at BulkInvoiceDetailDV.pcf: line 186, column 48
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.Reportability = (__VALUE_TO_SET as typekey.ReportabilityType)
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at BulkInvoiceDetailDV.pcf: line 195, column 48
    function defaultSetter_98 (__VALUE_TO_SET :  java.lang.Object) : void {
      bulkInvoice.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on DetailViewPanel (id=BulkInvoiceDetailDV) at BulkInvoiceDetailDV.pcf: line 7, column 30
    function editable_162 () : java.lang.Boolean {
      return !bulkInvoice.PendingItemValidation
    }
    
    // 'editable' attribute on BooleanRadioInput (id=ExchangeRateOverride) at BulkInvoiceDetailDV.pcf: line 91, column 142
    function editable_32 () : java.lang.Boolean {
      return perm.ExchangeRate.edit
    }
    
    // 'format' attribute on TextInput (id=ExchangeRate) at BulkInvoiceDetailDV.pcf: line 105, column 142
    function format_46 () : java.lang.String {
      return getExchangeRateFormatPattern( bulkInvoice.TransToReportingExchangeRate )
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceDetailDV.pcf: line 23, column 23
    function initialValue_0 () : boolean {
      return bulkInvoice.PayeeChangeable
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceDetailDV.pcf: line 28, column 23
    function initialValue_1 () : boolean {
      return bulkInvoice.hasApprovalHistory()
    }
    
    // 'initialValue' attribute on Variable at BulkInvoiceDetailDV.pcf: line 33, column 23
    function initialValue_2 () : boolean {
      return bulkInvoice.hasArchivedClaims()
    }
    
    // 'label' attribute on TextInput (id=BulkInvoiceValidLabel) at BulkInvoiceDetailDV.pcf: line 224, column 38
    function label_112 () : java.lang.Object {
      return DisplayKey.get("Web.Financials.BulkPay.Invoice.Validation.IsValid", bulkInvoice.LastValidatedDate.formatTime(SHORT),bulkInvoice.LastValidatedDate.formatDate(MEDIUM))
    }
    
    // 'label' attribute on TextInput (id=BulkInvoiceInvalidLabel) at BulkInvoiceDetailDV.pcf: line 231, column 128
    function label_118 () : java.lang.Object {
      return DisplayKey.get("Web.Financials.BulkPay.Invoice.Validation.IsNotValid", bulkInvoice.LastValidatedDate.formatTime(SHORT),bulkInvoice.LastValidatedDate.formatDate(MEDIUM))
    }
    
    // 'label' attribute on Label at BulkInvoiceDetailDV.pcf: line 174, column 37
    function label_88 () : java.lang.String {
      return payeeLinkStatus.LinkStatusMessage
    }
    
    // 'onChange' attribute on PostOnChange at BulkInvoiceDetailDV.pcf: line 58, column 169
    function onChange_12 () : void {
      bulkInvoice.recalculateSplitAmounts(); if (!bulkInvoice.SplitEqually) {bulkInvoice.BulkInvoiceAmountComponent.Amount = java.math.BigDecimal.ZERO}
    }
    
    // 'onChange' attribute on PostOnChange at BulkInvoiceDetailDV.pcf: line 72, column 61
    function onChange_17 () : void {
      bulkInvoice.recalculateSplitAmounts()
    }
    
    // 'requestValidationExpression' attribute on DateInput (id=ReceivedDate) at BulkInvoiceDetailDV.pcf: line 48, column 43
    function requestValidationExpression_8 (VALUE :  java.util.Date) : java.lang.Object {
      return ((gw.api.util.DateUtil.compareIgnoreTime(gw.api.util.DateUtil.currentDate(), (VALUE)) < 0) ? DisplayKey.get("Web.Financials.BulkPay.Error.ReceivedDateAfterCurrentDate") : null)
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 248, column 60
    function sortValue_123 (validationAlert :  entity.BIValidationAlert) : java.lang.Object {
      return validationAlert.AlertType
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 252, column 51
    function sortValue_124 (validationAlert :  entity.BIValidationAlert) : java.lang.Object {
      return validationAlert.AlertMsg
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 292, column 52
    function sortValue_140 (approvalHistory :  entity.Activity) : java.lang.Object {
      return approvalHistory.CloseDate
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 296, column 74
    function sortValue_141 (approvalHistory :  entity.Activity) : java.lang.Object {
      return getApprovalUserOrGroupString( approvalHistory )
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 300, column 61
    function sortValue_142 (approvalHistory :  entity.Activity) : java.lang.Object {
      return getApprovalString(approvalHistory)
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 304, column 56
    function sortValue_143 (approvalHistory :  entity.Activity) : java.lang.Object {
      return approvalHistory.ApprovalIssue
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 308, column 60
    function sortValue_144 (approvalHistory :  entity.Activity) : java.lang.Object {
      return approvalHistory.ApprovalRationale
    }
    
    // 'value' attribute on TextInput (id=RateSet_Description) at BulkInvoiceDetailDV.pcf: line 113, column 143
    function valueRoot_57 () : java.lang.Object {
      return bulkInvoice.TransToReportingExchangeRate.ExchangeRateSet
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceDetailDV.pcf: line 42, column 44
    function valueRoot_6 () : java.lang.Object {
      return bulkInvoice
    }
    
    // 'value' attribute on DateInput (id=RateSet_Date) at BulkInvoiceDetailDV.pcf: line 118, column 143
    function valueRoot_62 () : java.lang.Object {
      return bulkInvoice.TransToReportingExchangeRate
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at BulkInvoiceDetailDV.pcf: line 201, column 56
    function value_100 () : typekey.CheckHandlingInstructions {
      return bulkInvoice.CheckInstructions
    }
    
    // 'value' attribute on TextInput (id=Memo) at BulkInvoiceDetailDV.pcf: line 207, column 35
    function value_104 () : java.lang.String {
      return bulkInvoice.Memo
    }
    
    // 'value' attribute on TextInput (id=Comments) at BulkInvoiceDetailDV.pcf: line 214, column 39
    function value_108 () : java.lang.String {
      return bulkInvoice.Comments
    }
    
    // 'value' attribute on TextInput (id=BulkInvoiceValidLabel) at BulkInvoiceDetailDV.pcf: line 224, column 38
    function value_113 () : java.lang.Object {
      return null
    }
    
    // 'value' attribute on BooleanRadioInput (id=SplitEqually) at BulkInvoiceDetailDV.pcf: line 56, column 42
    function value_13 () : java.lang.Boolean {
      return bulkInvoice.SplitEqually
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 242, column 52
    function value_131 () : entity.BIValidationAlert[] {
      return bulkInvoice.ValidationAlerts
    }
    
    // 'value' attribute on RowIterator at BulkInvoiceDetailDV.pcf: line 283, column 63
    function value_158 () : java.util.List<entity.Activity> {
      return bulkInvoice.ApprovalHistory
    }
    
    // 'value' attribute on CurrencyInput (id=TotalAmount) at BulkInvoiceDetailDV.pcf: line 70, column 44
    function value_20 () : gw.api.financials.IMutableMoney {
      return bulkInvoice.BulkInvoiceAmountComponent
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at BulkInvoiceDetailDV.pcf: line 80, column 66
    function value_26 () : typekey.Currency {
      return bulkInvoice.Currency
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceDetailDV.pcf: line 42, column 44
    function value_3 () : java.lang.String {
      return bulkInvoice.InvoiceNumber
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExchangeRateOverride) at BulkInvoiceDetailDV.pcf: line 91, column 142
    function value_34 () : java.lang.Boolean {
      return bulkInvoice.OverrideTransToReportingExchangeRate
    }
    
    // 'value' attribute on TextInput (id=ExchangeRate) at BulkInvoiceDetailDV.pcf: line 105, column 142
    function value_43 () : java.math.BigDecimal {
      return bulkInvoice.TransToReportingExchangeRateRate
    }
    
    // 'value' attribute on TextInput (id=RateSet_Description) at BulkInvoiceDetailDV.pcf: line 113, column 143
    function value_52 () : java.lang.String {
      return bulkInvoice.TransToReportingExchangeRate.ExchangeRateSet.Description
    }
    
    // 'value' attribute on DateInput (id=RateSet_Date) at BulkInvoiceDetailDV.pcf: line 118, column 143
    function value_59 () : java.util.Date {
      return bulkInvoice.TransToReportingExchangeRate.UpdateTime
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at BulkInvoiceDetailDV.pcf: line 126, column 48
    function value_63 () : typekey.BulkInvoiceStatus {
      return bulkInvoice.Status
    }
    
    // 'value' attribute on DateInput (id=ApprovalDate) at BulkInvoiceDetailDV.pcf: line 130, column 43
    function value_66 () : java.util.Date {
      return bulkInvoice.ApprovalDate
    }
    
    // 'value' attribute on CurrencyInput (id=TotalApprovedAmount) at BulkInvoiceDetailDV.pcf: line 136, column 59
    function value_69 () : gw.api.financials.CurrencyAmountPair {
      return bulkInvoice.ApprovedCurrencyAmount
    }
    
    // 'value' attribute on DateInput (id=ReceivedDate) at BulkInvoiceDetailDV.pcf: line 48, column 43
    function value_7 () : java.util.Date {
      return bulkInvoice.ReceivedDate
    }
    
    // 'value' attribute on DateInput (id=IssueDate) at BulkInvoiceDetailDV.pcf: line 140, column 40
    function value_72 () : java.util.Date {
      return bulkInvoice.IssueDate
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCostType) at BulkInvoiceDetailDV.pcf: line 149, column 38
    function value_75 () : typekey.CostType {
      return bulkInvoice.DefaultCostType
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultCostCategory) at BulkInvoiceDetailDV.pcf: line 157, column 42
    function value_79 () : typekey.CostCategory {
      return bulkInvoice.DefaultCostCategory
    }
    
    // 'value' attribute on TypeKeyInput (id=DefaultPaymentType) at BulkInvoiceDetailDV.pcf: line 165, column 41
    function value_83 () : typekey.PaymentType {
      return bulkInvoice.DefaultPaymentType
    }
    
    // 'value' attribute on TypeKeyInput (id=Reportability) at BulkInvoiceDetailDV.pcf: line 186, column 48
    function value_92 () : typekey.ReportabilityType {
      return bulkInvoice.Reportability
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at BulkInvoiceDetailDV.pcf: line 195, column 48
    function value_96 () : java.util.Date {
      return bulkInvoice.ScheduledSendDate
    }
    
    // 'visible' attribute on TextInput (id=BulkInvoiceValidLabel) at BulkInvoiceDetailDV.pcf: line 224, column 38
    function visible_111 () : java.lang.Boolean {
      return bulkInvoice.Valid
    }
    
    // 'visible' attribute on TextInput (id=BulkInvoiceInvalidLabel) at BulkInvoiceDetailDV.pcf: line 231, column 128
    function visible_117 () : java.lang.Boolean {
      return bulkInvoice.LastValidatedDate != null and !bulkInvoice.Valid and bulkInvoice.ValidationAlerts.length > 0
    }
    
    // 'visible' attribute on TextInput (id=BulkInvoiceNeedsValidationLabel) at BulkInvoiceDetailDV.pcf: line 263, column 127
    function visible_133 () : java.lang.Boolean {
      return !bulkInvoice.Valid and (bulkInvoice.ValidationAlerts.length == 0 or bulkInvoice.LastValidatedDate == null)
    }
    
    // 'visible' attribute on TextInput (id=NoApprovalHistory) at BulkInvoiceDetailDV.pcf: line 272, column 107
    function visible_138 () : java.lang.Boolean {
      return not bulkInvoice.New and not invoiceHasApprovalHistory and not invoiceHasArchivedClaims
    }
    
    // 'visible' attribute on ListViewInput at BulkInvoiceDetailDV.pcf: line 274, column 45
    function visible_159 () : java.lang.Boolean {
      return invoiceHasApprovalHistory
    }
    
    // 'visible' attribute on TextInput (id=ArchivedClaimsWarning) at BulkInvoiceDetailDV.pcf: line 316, column 45
    function visible_160 () : java.lang.Boolean {
      return invoiceHasArchivedClaims
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at BulkInvoiceDetailDV.pcf: line 80, column 66
    function visible_25 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ExchangeRateOverride) at BulkInvoiceDetailDV.pcf: line 91, column 142
    function visible_33 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and bulkInvoice.Currency != gw.api.util.CurrencyUtil.getReportingCurrency()
    }
    
    // 'visible' attribute on Label at BulkInvoiceDetailDV.pcf: line 174, column 37
    function visible_87 () : java.lang.Boolean {
      return !bulkInvoice.New
    }
    
    // 'visible' attribute on Label at BulkInvoiceDetailDV.pcf: line 178, column 39
    function visible_89 () : java.lang.Boolean {
      return !isPayeeChangeable
    }
    
    property get bulkInvoice () : BulkInvoice {
      return getRequireValue("bulkInvoice", 0) as BulkInvoice
    }
    
    property set bulkInvoice ($arg :  BulkInvoice) {
      setRequireValue("bulkInvoice", 0, $arg)
    }
    
    property get invoiceHasApprovalHistory () : boolean {
      return getVariableValue("invoiceHasApprovalHistory", 0) as java.lang.Boolean
    }
    
    property set invoiceHasApprovalHistory ($arg :  boolean) {
      setVariableValue("invoiceHasApprovalHistory", 0, $arg)
    }
    
    property get invoiceHasArchivedClaims () : boolean {
      return getVariableValue("invoiceHasArchivedClaims", 0) as java.lang.Boolean
    }
    
    property set invoiceHasArchivedClaims ($arg :  boolean) {
      setVariableValue("invoiceHasArchivedClaims", 0, $arg)
    }
    
    property get isPayeeChangeable () : boolean {
      return getVariableValue("isPayeeChangeable", 0) as java.lang.Boolean
    }
    
    property set isPayeeChangeable ($arg :  boolean) {
      setVariableValue("isPayeeChangeable", 0, $arg)
    }
    
    property get payeeLinkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("payeeLinkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set payeeLinkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("payeeLinkStatus", 0, $arg)
    }
    
    property get paymentMethodHelper () : gw.api.financials.PaymentMethodHelper {
      return getRequireValue("paymentMethodHelper", 0) as gw.api.financials.PaymentMethodHelper
    }
    
    property set paymentMethodHelper ($arg :  gw.api.financials.PaymentMethodHelper) {
      setRequireValue("paymentMethodHelper", 0, $arg)
    }
    
    property get showMailingAddressFields () : org.apache.commons.lang3.mutable.MutableBoolean {
      return getRequireValue("showMailingAddressFields", 0) as org.apache.commons.lang3.mutable.MutableBoolean
    }
    
    property set showMailingAddressFields ($arg :  org.apache.commons.lang3.mutable.MutableBoolean) {
      setRequireValue("showMailingAddressFields", 0, $arg)
    }
    
    function getExchangeRateFormatPattern( rate : ExchangeRate ) : String {
      return "1 " + rate.BaseCurrency.DisplayName + " = #.###### " + rate.PriceCurrency.DisplayName;
    }
    
    function getApprovalUserOrGroupString(approvalHistory : Activity) : String {
      var closeUser = approvalHistory.CloseUser
      var assignedUser = approvalHistory.AssignedUser
      var assignedGroup = approvalHistory.AssignedGroup
      
      if( closeUser != null )  {
        return closeUser.DisplayName
      } 
      else if( assignedUser != null ) {
        return assignedUser.DisplayName
      }  
      else if( assignedGroup != null ) {
        return assignedGroup.DisplayName
      } 
      else {
        return ""
      }
    }
    
    function getApprovalString( activity : Activity ) : String {
      if (activity.Approved == null) {
        return DisplayKey.get("Java.ApprovalHistory.PendingApproval")
      } else if (activity.Approved) {
        return DisplayKey.get("Java.ApprovalHistory.Approved")
      } else {
        return DisplayKey.get("Java.ApprovalHistory.Rejected")
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends BulkInvoiceDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=ApprovalHistory_Date) at BulkInvoiceDetailDV.pcf: line 292, column 52
    function valueRoot_147 () : java.lang.Object {
      return approvalHistory
    }
    
    // 'value' attribute on DateCell (id=ApprovalHistory_Date) at BulkInvoiceDetailDV.pcf: line 292, column 52
    function value_145 () : java.util.Date {
      return approvalHistory.CloseDate
    }
    
    // 'value' attribute on TextCell (id=User) at BulkInvoiceDetailDV.pcf: line 296, column 74
    function value_148 () : java.lang.String {
      return getApprovalUserOrGroupString( approvalHistory )
    }
    
    // 'value' attribute on TextCell (id=Approved) at BulkInvoiceDetailDV.pcf: line 300, column 61
    function value_150 () : java.lang.String {
      return getApprovalString(approvalHistory)
    }
    
    // 'value' attribute on TextCell (id=ApprovalIssue) at BulkInvoiceDetailDV.pcf: line 304, column 56
    function value_152 () : java.lang.String {
      return approvalHistory.ApprovalIssue
    }
    
    // 'value' attribute on TextCell (id=ApprovalRationale) at BulkInvoiceDetailDV.pcf: line 308, column 60
    function value_155 () : java.lang.String {
      return approvalHistory.ApprovalRationale
    }
    
    property get approvalHistory () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkInvoiceDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=AlertType) at BulkInvoiceDetailDV.pcf: line 248, column 60
    function valueRoot_127 () : java.lang.Object {
      return validationAlert
    }
    
    // 'value' attribute on TypeKeyCell (id=AlertType) at BulkInvoiceDetailDV.pcf: line 248, column 60
    function value_125 () : typekey.BIValidationAlertType {
      return validationAlert.AlertType
    }
    
    // 'value' attribute on TextCell (id=AlertMsg) at BulkInvoiceDetailDV.pcf: line 252, column 51
    function value_128 () : java.lang.String {
      return validationAlert.AlertMsg
    }
    
    property get validationAlert () : entity.BIValidationAlert {
      return getIteratedValue(1) as entity.BIValidationAlert
    }
    
    
  }
  
  
}