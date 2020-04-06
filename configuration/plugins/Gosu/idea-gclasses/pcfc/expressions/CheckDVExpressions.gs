package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=BulkInvoice) at CheckDV.pcf: line 169, column 42
    function action_105 () : void {
      EditBulkInvoiceDetail.go(Check.BulkInvoiceItem.BulkInvoice)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_114 () : void {
      AddressBookPickerPopup.push(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 18, column 285
    function action_116 () : void {
      if (Check.Claimant != null) { ClaimContactDetailPopup.push(Check.Claimant, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_117 () : void {
      ClaimContactDetailPopup.push(Check.Claimant, Check.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function action_175 () : void {
      AddressBookPickerPopup.push(statictypeof (Check.CreateUser.Contact), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 18, column 285
    function action_177 () : void {
      if (Check.CreateUser.Contact != null) { ClaimContactDetailPopup.push(Check.CreateUser.Contact, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function action_178 () : void {
      ClaimContactDetailPopup.push(Check.CreateUser.Contact, Check.Claim)
    }
    
    // 'action' attribute on TextInput (id=BulkInvoice) at CheckDV.pcf: line 169, column 42
    function action_dest_106 () : pcf.api.Destination {
      return pcf.EditBulkInvoiceDetail.createDestination(Check.BulkInvoiceItem.BulkInvoice)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_115 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_118 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Check.Claimant, Check.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_176 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Check.CreateUser.Contact), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_179 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Check.CreateUser.Contact, Check.Claim)
    }
    
    // 'available' attribute on TextInput (id=BulkInvoice) at CheckDV.pcf: line 169, column 42
    function available_102 () : java.lang.Boolean {
      return Check.isBulked()
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_111 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Check.Claimant), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 193, column 73
    function def_onEnter_140 (def :  pcf.CheckPayeesLV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_172 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Check.CreateUser.Contact), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 270, column 27
    function def_onEnter_197 (def :  pcf.ApprovalHistoryLV) : void {
      def.onEnter(Check.CheckSet.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 279, column 27
    function def_onEnter_199 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.onEnter((Check.Group == null ? Check.Payments : Check.Group.PrimaryCheck.Payments))
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 287, column 39
    function def_onEnter_202 (def :  pcf.CheckGroupChecksLV) : void {
      def.onEnter(Check.Group)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 295, column 53
    function def_onEnter_205 (def :  pcf.RecurrenceChecksLV) : void {
      def.onEnter(Check.CheckSet)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 303, column 40
    function def_onEnter_208 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.onEnter(Check.CheckSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at CheckDV.pcf: line 56, column 27
    function def_onEnter_27 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.onEnter(Check,null)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 79, column 77
    function def_onEnter_43 (def :  pcf.PaymentDeductionsLV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_112 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Check.Claimant), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 193, column 73
    function def_refreshVariables_141 (def :  pcf.CheckPayeesLV) : void {
      def.refreshVariables(Check)
    }
    
    // 'def' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_173 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Check.CreateUser.Contact), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 270, column 27
    function def_refreshVariables_198 (def :  pcf.ApprovalHistoryLV) : void {
      def.refreshVariables(Check.CheckSet.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 279, column 27
    function def_refreshVariables_200 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.refreshVariables((Check.Group == null ? Check.Payments : Check.Group.PrimaryCheck.Payments))
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 287, column 39
    function def_refreshVariables_203 (def :  pcf.CheckGroupChecksLV) : void {
      def.refreshVariables(Check.Group)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 295, column 53
    function def_refreshVariables_206 (def :  pcf.RecurrenceChecksLV) : void {
      def.refreshVariables(Check.CheckSet)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 303, column 40
    function def_refreshVariables_209 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.refreshVariables(Check.CheckSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at CheckDV.pcf: line 56, column 27
    function def_refreshVariables_28 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.refreshVariables(Check,null)
    }
    
    // 'def' attribute on ListViewInput at CheckDV.pcf: line 79, column 77
    function def_refreshVariables_44 (def :  pcf.PaymentDeductionsLV) : void {
      def.refreshVariables(Check)
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.EFTData = (__VALUE_TO_SET as entity.EFTData)
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at CheckDV.pcf: line 112, column 31
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankName) at CheckDV.pcf: line 121, column 34
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.BankName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.BankAccountType = (__VALUE_TO_SET as typekey.BankAccountType)
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at CheckDV.pcf: line 144, column 43
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.BankAccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at CheckDV.pcf: line 154, column 43
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.BankRoutingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=BankAccountNumber) at CheckDV.pcf: line 144, column 43
    function encryptionExpression_91 (VALUE :  java.lang.String) : java.lang.String {
      return Check.maskBankAccountNumber(VALUE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_119 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Check.Claimant); var result = eval("Check.Claimant = Check.Claim.resolveContact(Check.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function onPick_180 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Check.CreateUser.Contact); var result = eval("Check.CreateUser.Contact = Check.Claim.resolveContact(Check.CreateUser.Contact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at CheckDV.pcf: line 115, column 40
    function reflectionValue_64 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.AccountName
    }
    
    // 'value' attribute on Reflect at CheckDV.pcf: line 124, column 37
    function reflectionValue_70 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankName
    }
    
    // 'value' attribute on Reflect at CheckDV.pcf: line 136, column 44
    function reflectionValue_76 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountType
    }
    
    // 'value' attribute on Reflect at CheckDV.pcf: line 147, column 46
    function reflectionValue_85 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountNumber
    }
    
    // 'value' attribute on Reflect at CheckDV.pcf: line 157, column 46
    function reflectionValue_92 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankRoutingNumber
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 325, column 176
    function sortValue_210 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("LV.Financials.Check.Invoices.InvoiceReferenceNumberMissing")
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 330, column 70
    function sortValue_211 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 336, column 56
    function sortValue_212 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.StatementCreationTime
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 340, column 41
    function sortValue_213 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Amount
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 344, column 56
    function sortValue_214 (invoice :  entity.ServiceRequestInvoice) : java.lang.Object {
      return invoice.Description.elide(28)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_122 () : java.lang.Object {
      return Check.Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_183 () : java.lang.Object {
      return Check.Claim.RelatedUserContactArray
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function valueRange_61 () : java.lang.Object {
      return Check.FirstPayee.Payee.EFTRecords
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function valueRange_82 () : java.lang.Object {
      return BankAccountType.getTypeKeys( false )
    }
    
    // 'value' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_182 () : java.lang.Object {
      return Check.CreateUser
    }
    
    // 'value' attribute on TextInput (id=Portion_Percentage) at CheckDV.pcf: line 41, column 53
    function valueRoot_19 () : java.lang.Object {
      return Check.Portion
    }
    
    // 'value' attribute on CurrencyInput (id=Recurrence_Total) at CheckDV.pcf: line 264, column 59
    function valueRoot_196 () : java.lang.Object {
      return Check.CheckSet.Recurrence
    }
    
    // 'value' attribute on TextInput (id=Transfer_Check) at CheckDV.pcf: line 61, column 42
    function valueRoot_33 () : java.lang.Object {
      return Check.getTransferredToCheck().Claim
    }
    
    // 'value' attribute on TextInput (id=PayTo) at CheckDV.pcf: line 17, column 64
    function valueRoot_4 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=PayTo) at CheckDV.pcf: line 17, column 64
    function value_1 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TextInput (id=BulkInvoice) at CheckDV.pcf: line 169, column 42
    function value_103 () : java.lang.String {
      return Check.BulkInvoiceNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=Claimant) at CheckDV.pcf: line 175, column 51
    function value_109 () : entity.Contact {
      return Check.Claimant
    }
    
    // 'value' attribute on TextInput (id=Memo) at CheckDV.pcf: line 32, column 29
    function value_12 () : java.lang.String {
      return Check.Memo
    }
    
    // 'value' attribute on DateInput (id=DateOfService) at CheckDV.pcf: line 180, column 58
    function value_128 () : java.util.Date {
      return Check.DateOfService
    }
    
    // 'value' attribute on TextInput (id=ServicePeriod) at CheckDV.pcf: line 185, column 57
    function value_133 () : java.lang.String {
      return Check.ServicePeriodString
    }
    
    // 'value' attribute on TextInput (id=Comments) at CheckDV.pcf: line 189, column 33
    function value_137 () : java.lang.String {
      return Check.Comments
    }
    
    // 'value' attribute on TextInput (id=MailToContact) at CheckDV.pcf: line 204, column 64
    function value_143 () : java.lang.String {
      return Check.MailTo
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at CheckDV.pcf: line 209, column 44
    function value_147 () : typekey.PaymentMethod {
      return Check.PaymentMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at CheckDV.pcf: line 214, column 44
    function value_150 () : typekey.CheckBatching {
      return Check.CheckBatching
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at CheckDV.pcf: line 220, column 64
    function value_154 () : typekey.DeliveryMethod {
      return Check.DeliveryMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at CheckDV.pcf: line 225, column 56
    function value_158 () : typekey.CheckHandlingInstructions {
      return Check.CheckInstructions
    }
    
    // 'value' attribute on TextInput (id=Portion_Percentage) at CheckDV.pcf: line 41, column 53
    function value_16 () : java.math.BigDecimal {
      return Check.Portion.Percentage
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at CheckDV.pcf: line 233, column 48
    function value_161 () : typekey.TransactionStatus {
      return Check.Status
    }
    
    // 'value' attribute on DateInput (id=IssueDate) at CheckDV.pcf: line 237, column 34
    function value_164 () : java.util.Date {
      return Check.IssueDate
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckDV.pcf: line 241, column 42
    function value_167 () : java.util.Date {
      return Check.ScheduledSendDate
    }
    
    // 'value' attribute on ClaimContactInput (id=CreateUser) at CheckDV.pcf: line 248, column 41
    function value_170 () : entity.UserContact {
      return Check.CreateUser.Contact
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at CheckDV.pcf: line 252, column 35
    function value_189 () : java.util.Date {
      return Check.CreateTime
    }
    
    // 'value' attribute on TextInput (id=Recurrence_Description) at CheckDV.pcf: line 259, column 141
    function value_192 () : java.lang.String {
      return Check.CheckSet.Recurrence.Description != null ? Check.CheckSet.Recurrence.Description : DisplayKey.get("Web.NA")
    }
    
    // 'value' attribute on CurrencyInput (id=Recurrence_Total) at CheckDV.pcf: line 264, column 59
    function value_194 () : gw.api.financials.CurrencyAmountPair {
      return Check.CheckSet.Recurrence.TotalPair
    }
    
    // 'value' attribute on TextInput (id=Portion_FixedAmount) at CheckDV.pcf: line 47, column 65
    function value_21 () : java.lang.String {
      return Check.Portion.getMultiCurrencyDisplayName(Check)
    }
    
    // 'value' attribute on RowIterator at CheckDV.pcf: line 318, column 56
    function value_230 () : entity.ServiceRequestInvoice[] {
      return Check.ServiceRequestInvoices
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Gross) at CheckDV.pcf: line 53, column 59
    function value_24 () : gw.api.financials.CurrencyAmountPair {
      return Check.GrossAmountPair
    }
    
    // 'value' attribute on TextInput (id=Transfer_Check) at CheckDV.pcf: line 61, column 42
    function value_30 () : java.lang.String {
      return Check.getTransferredToCheck().Claim.ClaimNumber
    }
    
    // 'value' attribute on CurrencyInput (id=Transfer_Amount) at CheckDV.pcf: line 67, column 42
    function value_35 () : gw.api.financials.CurrencyAmount {
      return Check.getTransferredAmount()
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxReporting) at CheckDV.pcf: line 72, column 48
    function value_38 () : typekey.ReportabilityType {
      return Check.Reportability
    }
    
    // 'value' attribute on TextInput (id=Amount_Reportable) at CheckDV.pcf: line 76, column 199
    function value_41 () : java.lang.String {
      return (Check.Reportability == ReportabilityType.TC_NOTREPORTABLE) ? DisplayKey.get("Web.NA") : gw.api.util.CurrencyUtil.renderAsCurrency(Check.ReportableAmount, Check.Currency)
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at CheckDV.pcf: line 89, column 64
    function value_46 () : java.lang.String {
      return Check.CheckNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=BankAccount) at CheckDV.pcf: line 95, column 64
    function value_51 () : typekey.BankAccount {
      return Check.BankAccount
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function value_56 () : entity.EFTData {
      return Check.EFTData
    }
    
    // 'value' attribute on TextInput (id=MailingAddress) at CheckDV.pcf: line 22, column 64
    function value_6 () : java.lang.String {
      return Check.FormatAddressSummary(true)
    }
    
    // 'value' attribute on TextInput (id=BankName) at CheckDV.pcf: line 121, column 34
    function value_72 () : java.lang.String {
      return Check.BankName
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function value_78 () : typekey.BankAccountType {
      return Check.BankAccountType
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at CheckDV.pcf: line 144, column 43
    function value_87 () : java.lang.String {
      return Check.BankAccountNumber
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Net) at CheckDV.pcf: line 28, column 59
    function value_9 () : gw.api.financials.CurrencyAmountPair {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at CheckDV.pcf: line 154, column 43
    function value_94 () : java.lang.String {
      return Check.BankRoutingNumber
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at CheckDV.pcf: line 163, column 38
    function value_99 () : java.lang.String {
      return Check.InvoiceNumber
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  entity.UserContact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  gw.api.database.IQueryBeanResult<entity.UserContact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function verifyValueRangeIsAllowedType_62 ($$arg :  entity.EFTData[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function verifyValueRangeIsAllowedType_62 ($$arg :  gw.api.database.IQueryBeanResult<entity.EFTData>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function verifyValueRangeIsAllowedType_62 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function verifyValueRangeIsAllowedType_83 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function verifyValueRangeIsAllowedType_83 ($$arg :  typekey.BankAccountType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_124 () : void {
      var __valueRangeArg = Check.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_123(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_185 () : void {
      var __valueRangeArg = Check.Claim.RelatedUserContactArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_184(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function verifyValueRange_63 () : void {
      var __valueRangeArg = Check.FirstPayee.Payee.EFTRecords
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_62(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at CheckDV.pcf: line 133, column 47
    function verifyValueRange_84 () : void {
      var __valueRangeArg = BankAccountType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_83(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=CreateUser) at CheckDV.pcf: line 248, column 41
    function verifyValueType_188 () : void {
      var __valueTypeArg : entity.UserContact
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TextInput (id=PayTo) at CheckDV.pcf: line 17, column 64
    function visible_0 () : java.lang.Boolean {
      return Check.PaymentMethod != PaymentMethod.TC_EFT
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 14, column 229
    function visible_110 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Claimant) at ClaimContactWidget.xml: line 16, column 225
    function visible_113 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on DateInput (id=DateOfService) at CheckDV.pcf: line 180, column 58
    function visible_127 () : java.lang.Boolean {
      return !Check.hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on TextInput (id=ServicePeriod) at CheckDV.pcf: line 185, column 57
    function visible_132 () : java.lang.Boolean {
      return Check.hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on TextInput (id=Portion_Percentage) at CheckDV.pcf: line 41, column 53
    function visible_15 () : java.lang.Boolean {
      return Check.Portion.Percentage != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function visible_174 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Check.CreateUser.Contact), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=Portion_FixedAmount) at CheckDV.pcf: line 47, column 65
    function visible_20 () : java.lang.Boolean {
      return Check.Portion.FixedTransactionAmount != null
    }
    
    // 'visible' attribute on ListViewInput at CheckDV.pcf: line 287, column 39
    function visible_201 () : java.lang.Boolean {
      return Check.Group != null
    }
    
    // 'visible' attribute on ListViewInput at CheckDV.pcf: line 295, column 53
    function visible_204 () : java.lang.Boolean {
      return Check.CheckSet.Recurrence != null
    }
    
    // 'visible' attribute on ListViewInput at CheckDV.pcf: line 303, column 40
    function visible_207 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on ListViewInput at CheckDV.pcf: line 310, column 60
    function visible_231 () : java.lang.Boolean {
      return Check.ServiceRequestInvoices.HasElements
    }
    
    // 'visible' attribute on TextInput (id=Transfer_Check) at CheckDV.pcf: line 61, column 42
    function visible_29 () : java.lang.Boolean {
      return Check.isTransferred()
    }
    
    // 'visible' attribute on RangeInput (id=EFTRecords) at CheckDV.pcf: line 106, column 49
    function visible_55 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on InputSet (id=EFTDataInputSet) at CheckDV.pcf: line 98, column 63
    function visible_98 () : java.lang.Boolean {
      return Check.PaymentMethod == PaymentMethod.TC_EFT
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CheckDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=InvoiceReferenceNumber) at CheckDV.pcf: line 325, column 176
    function action_216 () : void {
      ClaimServiceRequests.go(invoice.Check.Claim, invoice.ServiceRequest, invoice)
    }
    
    // 'action' attribute on TextCell (id=InvoiceReferenceNumber) at CheckDV.pcf: line 325, column 176
    function action_dest_217 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(invoice.Check.Claim, invoice.ServiceRequest, invoice)
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at CheckDV.pcf: line 330, column 70
    function valueRoot_221 () : java.lang.Object {
      return invoice.ServiceRequest
    }
    
    // 'value' attribute on DateCell (id=SubmittedDate) at CheckDV.pcf: line 336, column 56
    function valueRoot_224 () : java.lang.Object {
      return invoice
    }
    
    // 'value' attribute on TextCell (id=InvoiceReferenceNumber) at CheckDV.pcf: line 325, column 176
    function value_215 () : java.lang.String {
      return invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("LV.Financials.Check.Invoices.InvoiceReferenceNumberMissing")
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber) at CheckDV.pcf: line 330, column 70
    function value_219 () : java.lang.String {
      return invoice.ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on DateCell (id=SubmittedDate) at CheckDV.pcf: line 336, column 56
    function value_222 () : java.util.Date {
      return invoice.StatementCreationTime
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at CheckDV.pcf: line 340, column 41
    function value_225 () : gw.api.financials.CurrencyAmount {
      return invoice.Amount
    }
    
    // 'value' attribute on TextCell (id=Description) at CheckDV.pcf: line 344, column 56
    function value_228 () : java.lang.String {
      return invoice.Description.elide(28)
    }
    
    property get invoice () : entity.ServiceRequestInvoice {
      return getIteratedValue(1) as entity.ServiceRequestInvoice
    }
    
    
  }
  
  
}