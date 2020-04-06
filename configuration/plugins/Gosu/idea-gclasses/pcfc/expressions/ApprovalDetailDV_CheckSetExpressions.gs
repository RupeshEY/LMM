package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ApprovalDetailDV_CheckSetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 21, column 27
    function def_onEnter_1 (def :  pcf.ApprovalHistoryLV) : void {
      def.onEnter(checkSet.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 27, column 27
    function def_onEnter_3 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.onEnter(checkSet.PrimaryCheck.Payments)
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 174, column 40
    function def_onEnter_85 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.onEnter(checkSet.LinkedDocuments)
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 21, column 27
    function def_refreshVariables_2 (def :  pcf.ApprovalHistoryLV) : void {
      def.refreshVariables(checkSet.ApprovalHistory?.toTypedArray())
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 27, column 27
    function def_refreshVariables_4 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.refreshVariables(checkSet.PrimaryCheck.Payments)
    }
    
    // 'def' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 174, column 40
    function def_refreshVariables_86 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.refreshVariables(checkSet.LinkedDocuments)
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at ApprovalDetailDV.CheckSet.pcf: line 36, column 42
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.ApprovalRationale = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ApprovalDetailDV.CheckSet.pcf: line 15, column 24
    function initialValue_0 () : CheckSet {
      return Activity.TransactionSet as CheckSet
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at ApprovalDetailDV.CheckSet.pcf: line 36, column 42
    function valueRoot_10 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextInput (id=PayTo) at ApprovalDetailDV.CheckSet.pcf: line 44, column 46
    function valueRoot_13 () : java.lang.Object {
      return checkSet.PrimaryCheck
    }
    
    // 'value' attribute on CurrencyInput (id=Recurrence_Total) at ApprovalDetailDV.CheckSet.pcf: line 150, column 59
    function valueRoot_74 () : java.lang.Object {
      return checkSet.PrimaryCheck.CheckSet.Recurrence
    }
    
    // 'value' attribute on TextInput (id=CreateUser) at ApprovalDetailDV.CheckSet.pcf: line 162, column 41
    function valueRoot_80 () : java.lang.Object {
      return checkSet.PrimaryCheck.CreateUser
    }
    
    // 'value' attribute on TextInput (id=PayTo) at ApprovalDetailDV.CheckSet.pcf: line 44, column 46
    function value_11 () : java.lang.String {
      return checkSet.PrimaryCheck.PayTo
    }
    
    // 'value' attribute on TextInput (id=MailingAddress) at ApprovalDetailDV.CheckSet.pcf: line 48, column 67
    function value_14 () : java.lang.String {
      return checkSet.PrimaryCheck.FormatAddressSummary(true)
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Net) at ApprovalDetailDV.CheckSet.pcf: line 53, column 59
    function value_16 () : gw.api.financials.CurrencyAmountPair {
      return checkSet.PrimaryCheck.NetAmountPair
    }
    
    // 'value' attribute on TextInput (id=Memo) at ApprovalDetailDV.CheckSet.pcf: line 57, column 45
    function value_19 () : java.lang.String {
      return checkSet.PrimaryCheck.Memo
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Gross) at ApprovalDetailDV.CheckSet.pcf: line 65, column 59
    function value_22 () : gw.api.financials.CurrencyAmountPair {
      return checkSet.PrimaryCheck.GrossAmountPair
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxReporting) at ApprovalDetailDV.CheckSet.pcf: line 70, column 48
    function value_25 () : typekey.ReportabilityType {
      return checkSet.PrimaryCheck.Reportability
    }
    
    // 'value' attribute on TextInput (id=Amount_Reportable) at ApprovalDetailDV.CheckSet.pcf: line 74, column 224
    function value_28 () : java.lang.String {
      return (checkSet.PrimaryCheck).ReportableAmount == null ? DisplayKey.get("Web.NA") : gw.api.util.CurrencyUtil.renderAsCurrency((checkSet.PrimaryCheck).ReportableAmount, (checkSet.PrimaryCheck).Currency)
    }
    
    // 'value' attribute on CurrencyInput (id=Deductions) at ApprovalDetailDV.CheckSet.pcf: line 79, column 59
    function value_30 () : gw.api.financials.CurrencyAmountPair {
      return checkSet.PrimaryCheck.DeductionsTotalPair
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at ApprovalDetailDV.CheckSet.pcf: line 86, column 52
    function value_33 () : java.lang.String {
      return checkSet.PrimaryCheck.CheckNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=BankAccount) at ApprovalDetailDV.CheckSet.pcf: line 91, column 42
    function value_36 () : typekey.BankAccount {
      return checkSet.PrimaryCheck.BankAccount
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at ApprovalDetailDV.CheckSet.pcf: line 95, column 54
    function value_39 () : java.lang.String {
      return checkSet.PrimaryCheck.InvoiceNumber
    }
    
    // 'value' attribute on TextInput (id=Claimant) at ApprovalDetailDV.CheckSet.pcf: line 100, column 37
    function value_42 () : entity.Contact {
      return checkSet.PrimaryCheck.Claimant
    }
    
    // 'value' attribute on DateInput (id=DateOfService) at ApprovalDetailDV.CheckSet.pcf: line 105, column 76
    function value_46 () : java.util.Date {
      return checkSet.PrimaryCheck.DateOfService
    }
    
    // 'value' attribute on TextInput (id=ServicePeriod) at ApprovalDetailDV.CheckSet.pcf: line 110, column 75
    function value_51 () : java.lang.String {
      return checkSet.PrimaryCheck.ServicePeriodString
    }
    
    // 'value' attribute on TextInput (id=MailToContact) at ApprovalDetailDV.CheckSet.pcf: line 118, column 47
    function value_55 () : java.lang.String {
      return checkSet.PrimaryCheck.MailTo
    }
    
    // 'value' attribute on TypeKeyInput (id=PaymentMethod) at ApprovalDetailDV.CheckSet.pcf: line 123, column 44
    function value_58 () : typekey.PaymentMethod {
      return checkSet.PrimaryCheck.PaymentMethod
    }
    
    // 'value' attribute on TextInput (id=ApprovalRationale) at ApprovalDetailDV.CheckSet.pcf: line 36, column 42
    function value_6 () : java.lang.String {
      return Activity.ApprovalRationale
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckBatching) at ApprovalDetailDV.CheckSet.pcf: line 128, column 44
    function value_61 () : typekey.CheckBatching {
      return checkSet.PrimaryCheck.CheckBatching
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at ApprovalDetailDV.CheckSet.pcf: line 133, column 45
    function value_64 () : typekey.DeliveryMethod {
      return checkSet.PrimaryCheck.DeliveryMethod
    }
    
    // 'value' attribute on TypeKeyInput (id=CheckInstructions) at ApprovalDetailDV.CheckSet.pcf: line 138, column 56
    function value_67 () : typekey.CheckHandlingInstructions {
      return checkSet.PrimaryCheck.CheckInstructions
    }
    
    // 'value' attribute on TextInput (id=Recurrence_Description) at ApprovalDetailDV.CheckSet.pcf: line 145, column 129
    function value_70 () : java.lang.String {
      return checkSet.Recurrence.Description != null ? checkSet.Recurrence.Description : DisplayKey.get("Web.NA")
    }
    
    // 'value' attribute on CurrencyInput (id=Recurrence_Total) at ApprovalDetailDV.CheckSet.pcf: line 150, column 59
    function value_72 () : gw.api.financials.CurrencyAmountPair {
      return checkSet.PrimaryCheck.CheckSet.Recurrence.TotalPair
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at ApprovalDetailDV.CheckSet.pcf: line 157, column 58
    function value_75 () : java.util.Date {
      return checkSet.PrimaryCheck.ScheduledSendDate
    }
    
    // 'value' attribute on TextInput (id=CreateUser) at ApprovalDetailDV.CheckSet.pcf: line 162, column 41
    function value_78 () : entity.UserContact {
      return checkSet.PrimaryCheck.CreateUser.Contact
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at ApprovalDetailDV.CheckSet.pcf: line 166, column 51
    function value_81 () : java.util.Date {
      return checkSet.PrimaryCheck.CreateTime
    }
    
    // 'visible' attribute on DateInput (id=DateOfService) at ApprovalDetailDV.CheckSet.pcf: line 105, column 76
    function visible_45 () : java.lang.Boolean {
      return !(checkSet.PrimaryCheck).hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on TextInput (id=ApprovalRationale) at ApprovalDetailDV.CheckSet.pcf: line 36, column 42
    function visible_5 () : java.lang.Boolean {
      return Activity.canApprove()
    }
    
    // 'visible' attribute on TextInput (id=ServicePeriod) at ApprovalDetailDV.CheckSet.pcf: line 110, column 75
    function visible_50 () : java.lang.Boolean {
      return (checkSet.PrimaryCheck).hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on ListViewInput at ApprovalDetailDV.CheckSet.pcf: line 174, column 40
    function visible_84 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get checkSet () : CheckSet {
      return getVariableValue("checkSet", 0) as CheckSet
    }
    
    property set checkSet ($arg :  CheckSet) {
      setVariableValue("checkSet", 0, $arg)
    }
    
    
  }
  
  
}