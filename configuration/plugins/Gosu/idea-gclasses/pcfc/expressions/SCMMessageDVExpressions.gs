package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMMessageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SCMMessageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMMessageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SCMMessageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'format' attribute on TextInput (id=paidThisTimeIndemnity) at SCMMessageDV.pcf: line 63, column 45
    function format_24 () : java.lang.String {
      return message.FinancialAmountFormatPattern
    }
    
    // 'label' attribute on Label at SCMMessageDV.pcf: line 150, column 143
    function label_71 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.ClaimMessages.CarrierShareLabel", message.ReceiverShare.stripTrailingZeros())
    }
    
    // 'value' attribute on TextInput (id=uuid) at SCMMessageDV.pcf: line 15, column 31
    function valueRoot_2 () : java.lang.Object {
      return message
    }
    
    // 'value' attribute on TextInput (id=uuid) at SCMMessageDV.pcf: line 15, column 31
    function value_0 () : java.lang.String {
      return message.UUID
    }
    
    // 'value' attribute on TextInput (id=totalIncurredFeesReceiverShare) at SCMMessageDV.pcf: line 235, column 45
    function value_102 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumTotalIncurredFees)
    }
    
    // 'value' attribute on TextInput (id=sumTotalIncurredReceiverShare) at SCMMessageDV.pcf: line 241, column 45
    function value_105 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumTotalIncurred)
    }
    
    // 'value' attribute on TextInput (id=receiverShareInput) at SCMMessageDV.pcf: line 32, column 77
    function value_12 () : java.lang.String {
      return message.ReceiverShare.stripTrailingZeros() + "%"
    }
    
    // 'value' attribute on TypeKeyInput (id=originalCurrency) at SCMMessageDV.pcf: line 38, column 39
    function value_14 () : typekey.Currency {
      return message.OriginalCurrency
    }
    
    // 'value' attribute on TypeKeyInput (id=settlementCurrency) at SCMMessageDV.pcf: line 43, column 39
    function value_17 () : typekey.Currency {
      return message.SettlementCurrency
    }
    
    // 'value' attribute on TextInput (id=narrative) at SCMMessageDV.pcf: line 48, column 36
    function value_20 () : java.lang.String {
      return message.Narrative
    }
    
    // 'value' attribute on TextInput (id=paidThisTimeIndemnity) at SCMMessageDV.pcf: line 63, column 45
    function value_23 () : java.math.BigDecimal {
      return message.PaidThisTimeIndemnity_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=paidThisTimeFees) at SCMMessageDV.pcf: line 69, column 45
    function value_27 () : java.math.BigDecimal {
      return message.PaidThisTimeFees_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on DateInput (id=creationDate) at SCMMessageDV.pcf: line 19, column 39
    function value_3 () : java.util.Date {
      return message.CreationDate
    }
    
    // 'value' attribute on TextInput (id=sumPaidThisTime) at SCMMessageDV.pcf: line 75, column 45
    function value_31 () : java.math.BigDecimal {
      return message.SumPaidThisTime as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=paidToDateIndemnity) at SCMMessageDV.pcf: line 86, column 45
    function value_35 () : java.math.BigDecimal {
      return message.PaidToDateIndemnity_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=paidToDateFees) at SCMMessageDV.pcf: line 92, column 45
    function value_39 () : java.math.BigDecimal {
      return message.PaidToDateFees_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=sumPaidToDate) at SCMMessageDV.pcf: line 98, column 45
    function value_43 () : java.math.BigDecimal {
      return message.SumPaidToDate as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=outstandingAmountIndemnity) at SCMMessageDV.pcf: line 109, column 45
    function value_47 () : java.math.BigDecimal {
      return message.OutstandingIndemnity_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=outstandingAmountFees) at SCMMessageDV.pcf: line 115, column 45
    function value_51 () : java.math.BigDecimal {
      return message.OutstandingFees_amt as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=sumOustandingAmount) at SCMMessageDV.pcf: line 121, column 45
    function value_55 () : java.math.BigDecimal {
      return message.SumOutstandingAmount as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=totalIncurredIndemnity) at SCMMessageDV.pcf: line 132, column 45
    function value_59 () : java.math.BigDecimal {
      return message.SumTotalIncurredIndemity as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=movementReference) at SCMMessageDV.pcf: line 24, column 52
    function value_6 () : java.lang.String {
      return message.MovementReferenceSequence
    }
    
    // 'value' attribute on TextInput (id=totalIncurredFees) at SCMMessageDV.pcf: line 138, column 45
    function value_63 () : java.math.BigDecimal {
      return message.SumTotalIncurredFees
    }
    
    // 'value' attribute on TextInput (id=sumTotalIncurred) at SCMMessageDV.pcf: line 144, column 45
    function value_67 () : java.math.BigDecimal {
      return message.SumTotalIncurred as java.math.BigDecimal
    }
    
    // 'value' attribute on TextInput (id=paidThisTimeIndemnityReceiverShare) at SCMMessageDV.pcf: line 160, column 45
    function value_72 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.PaidThisTimeIndemnity_amt)
    }
    
    // 'value' attribute on TextInput (id=paidThisTimeFeesReceiverShare) at SCMMessageDV.pcf: line 166, column 45
    function value_75 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.PaidThisTimeFees_amt)
    }
    
    // 'value' attribute on TextInput (id=sumPaidThisTimeReceiverShare) at SCMMessageDV.pcf: line 172, column 45
    function value_78 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumPaidThisTime)
    }
    
    // 'value' attribute on TextInput (id=paidToDateIndemnityReceiverShare) at SCMMessageDV.pcf: line 183, column 45
    function value_81 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.PaidToDateIndemnity_amt)
    }
    
    // 'value' attribute on TextInput (id=paidToDateFeesReceiverShare) at SCMMessageDV.pcf: line 189, column 45
    function value_84 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.PaidToDateFees_amt)
    }
    
    // 'value' attribute on TextInput (id=sumPaidToDateReceiverShare) at SCMMessageDV.pcf: line 195, column 45
    function value_87 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumPaidToDate)
    }
    
    // 'value' attribute on TextInput (id=syndicateLineNumber) at SCMMessageDV.pcf: line 28, column 46
    function value_9 () : java.lang.String {
      return message.SyndicateLineNumber
    }
    
    // 'value' attribute on TextInput (id=outstandingAmountIndemnityReceiverShare) at SCMMessageDV.pcf: line 206, column 45
    function value_90 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.OutstandingIndemnity_amt)
    }
    
    // 'value' attribute on TextInput (id=outstandingAmountFeesReceiverShare) at SCMMessageDV.pcf: line 212, column 45
    function value_93 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.OutstandingFees_amt)
    }
    
    // 'value' attribute on TextInput (id=sumOustandingAmountReceiverShare) at SCMMessageDV.pcf: line 218, column 45
    function value_96 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumOutstandingAmount)
    }
    
    // 'value' attribute on TextInput (id=totalIncurredIndemnityReceiverShare) at SCMMessageDV.pcf: line 229, column 45
    function value_99 () : java.math.BigDecimal {
      return message.calculateReceiverShare(message.SumTotalIncurredIndemity)
    }
    
    property get message () : entity.LMMessageLloydsSCM_Ext {
      return getRequireValue("message", 0) as entity.LMMessageLloydsSCM_Ext
    }
    
    property set message ($arg :  entity.LMMessageLloydsSCM_Ext) {
      setRequireValue("message", 0, $arg)
    }
    
    
  }
  
  
}