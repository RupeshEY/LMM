package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsFinancialsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsFinancialsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsFinancialsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsFinancialsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ECFMessageDetailsFinancialsPanelSet.pcf: line 13, column 115
    function initialValue_0 () : gw.acc.iplm.utils.pcf.messagedetails.ECFMessageDetailsFinancialsPCFHelper {
      return new gw.acc.iplm.utils.pcf.messagedetails.ECFMessageDetailsFinancialsPCFHelper(claimDataMsg)
    }
    
    // 'initialValue' attribute on Variable at ECFMessageDetailsFinancialsPanelSet.pcf: line 17, column 41
    function initialValue_1 () : ECFMessageClaimDataFinancial_Ext {
      return helper.Financial1
    }
    
    // 'initialValue' attribute on Variable at ECFMessageDetailsFinancialsPanelSet.pcf: line 21, column 41
    function initialValue_2 () : ECFMessageClaimDataFinancial_Ext {
      return helper.Financial2
    }
    
    // 'initialValue' attribute on Variable at ECFMessageDetailsFinancialsPanelSet.pcf: line 25, column 41
    function initialValue_3 () : ECFMessageClaimDataFinancial_Ext {
      return helper.Financial3
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function label_23 () : java.lang.Object {
      return financial1.Currency.getDisplayName()
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function label_25 () : java.lang.Object {
      return financial2.Currency.getDisplayName()
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function label_27 () : java.lang.Object {
      return financial3.Currency.getDisplayName()
    }
    
    // 'label' attribute on Label (id=yoursharelabel) at ECFMessageDetailsFinancialsPanelSet.pcf: line 704, column 169
    function label_401 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.ECFMessageDetails.Financial.YourShare", claimDataMsg.InsurerSharePercentage.stripTrailingZeros())
    }
    
    // 'value' attribute on TextInput (id=Financial1OutstandingAmountQualifierLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 46, column 70
    function valueRoot_16 () : java.lang.Object {
      return claimDataMsg.OutstandingAmountQualifier
    }
    
    // 'value' attribute on TextInput (id=Financial1OutstandingAmountQualifierLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 46, column 70
    function value_13 () : java.lang.String {
      return claimDataMsg.OutstandingAmountQualifier.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Financial1OriginalSplitReferenceCSVLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 51, column 69
    function value_18 () : java.lang.String {
      return helper.convertOSNDCsvToFormattedOSNDs(claimDataMsg.OriginalSplitReferenceCSV)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 73, column 50
    function value_400 () : java.lang.String[] {
      return {'tableActingAsFields'}
    }
    
    // 'value' attribute on TextInput (id=CurrentSyndicate) at ECFMessageDetailsFinancialsPanelSet.pcf: line 35, column 59
    function value_5 () : java.lang.String {
      return claimDataMsg.ReceiverPartyId.split(":").last()
    }
    
    // 'value' attribute on TextInput (id=CurrentSyndicateShare) at ECFMessageDetailsFinancialsPanelSet.pcf: line 40, column 66
    function value_9 () : java.lang.String {
      return claimDataMsg.InsurerSharePercentage.stripTrailingZeros() + "%"
    }
    
    // 'visible' attribute on TextInput (id=Financial1OutstandingAmountQualifierLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 46, column 70
    function visible_12 () : java.lang.Boolean {
      return claimDataMsg.OutstandingAmountQualifier != null
    }
    
    // 'visible' attribute on TextInput (id=Financial1OriginalSplitReferenceCSVLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 51, column 69
    function visible_17 () : java.lang.Boolean {
      return claimDataMsg.OriginalSplitReferenceCSV != null
    }
    
    // 'visible' attribute on Label (id=fullsharelabel) at ECFMessageDetailsFinancialsPanelSet.pcf: line 61, column 55
    function visible_21 () : java.lang.Boolean {
      return helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function visible_22 () : java.lang.Boolean {
      return helper.HasFinancial1
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function visible_24 () : java.lang.Boolean {
      return helper.HasFinancial2
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function visible_26 () : java.lang.Boolean {
      return helper.HasFinancial3
    }
    
    // 'visible' attribute on TextInput (id=CurrentSyndicate) at ECFMessageDetailsFinancialsPanelSet.pcf: line 35, column 59
    function visible_4 () : java.lang.Boolean {
      return claimDataMsg.ReceiverPartyId != null
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 725, column 88
    function visible_402 () : java.lang.Boolean {
      return helper.HasFinancial1 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 732, column 88
    function visible_404 () : java.lang.Boolean {
      return helper.HasFinancial2 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsFinancialsPanelSet.pcf: line 739, column 88
    function visible_406 () : java.lang.Boolean {
      return helper.HasFinancial3 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on TextInput (id=CurrentSyndicateShare) at ECFMessageDetailsFinancialsPanelSet.pcf: line 40, column 66
    function visible_8 () : java.lang.Boolean {
      return claimDataMsg.InsurerSharePercentage != null
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getRequireValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimDataMsg", 0, $arg)
    }
    
    property get financial1 () : ECFMessageClaimDataFinancial_Ext {
      return getVariableValue("financial1", 0) as ECFMessageClaimDataFinancial_Ext
    }
    
    property set financial1 ($arg :  ECFMessageClaimDataFinancial_Ext) {
      setVariableValue("financial1", 0, $arg)
    }
    
    property get financial2 () : ECFMessageClaimDataFinancial_Ext {
      return getVariableValue("financial2", 0) as ECFMessageClaimDataFinancial_Ext
    }
    
    property set financial2 ($arg :  ECFMessageClaimDataFinancial_Ext) {
      setVariableValue("financial2", 0, $arg)
    }
    
    property get financial3 () : ECFMessageClaimDataFinancial_Ext {
      return getVariableValue("financial3", 0) as ECFMessageClaimDataFinancial_Ext
    }
    
    property set financial3 ($arg :  ECFMessageClaimDataFinancial_Ext) {
      setVariableValue("financial3", 0, $arg)
    }
    
    property get helper () : gw.acc.iplm.utils.pcf.messagedetails.ECFMessageDetailsFinancialsPCFHelper {
      return getVariableValue("helper", 0) as gw.acc.iplm.utils.pcf.messagedetails.ECFMessageDetailsFinancialsPCFHelper
    }
    
    property set helper ($arg :  gw.acc.iplm.utils.pcf.messagedetails.ECFMessageDetailsFinancialsPCFHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsFinancialsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ECFMessageDetailsFinancialsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 725, column 88
    function label_409 () : java.lang.Object {
      return financial1.Currency.getDisplayName()
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 732, column 88
    function label_414 () : java.lang.Object {
      return financial2.Currency.getDisplayName()
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 739, column 88
    function label_419 () : java.lang.Object {
      return financial3.Currency.getDisplayName()
    }
    
    // 'value' attribute on TextAreaCell (id=Financial1FguNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 747, column 55
    function valueRoot_427 () : java.lang.Object {
      return financial1
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 725, column 88
    function value_410 () : gw.pl.currency.MonetaryAmount {
      return financial1.FguAmountIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 732, column 88
    function value_415 () : gw.pl.currency.MonetaryAmount {
      return financial2.FguAmountIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 739, column 88
    function value_420 () : gw.pl.currency.MonetaryAmount {
      return financial3.FguAmountIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on TextAreaCell (id=Financial1FguNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 747, column 55
    function value_425 () : java.lang.String {
      return financial1.FguNarrative
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LossAndExpensesIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 755, column 88
    function value_430 () : gw.pl.currency.MonetaryAmount {
      return financial1.LossAndExpensesIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LossAndExpensesIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 760, column 88
    function value_433 () : gw.pl.currency.MonetaryAmount {
      return financial2.LossAndExpensesIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LossAndExpensesIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 765, column 88
    function value_436 () : gw.pl.currency.MonetaryAmount {
      return financial3.LossAndExpensesIncurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1Carrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 773, column 88
    function value_440 () : gw.pl.currency.MonetaryAmount {
      return financial1.OutstandingLossPlus?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2Carrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 778, column 88
    function value_443 () : gw.pl.currency.MonetaryAmount {
      return financial2.OutstandingLossPlus?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3Carrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 783, column 88
    function value_446 () : gw.pl.currency.MonetaryAmount {
      return financial3.OutstandingLossPlus?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1FullCostsPaidBeforeRetentionCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 791, column 88
    function value_450 () : gw.pl.currency.MonetaryAmount {
      return financial1.FullCostsPaidBefoRetent?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2FullCostsPaidBeforeRetentionCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 796, column 88
    function value_453 () : gw.pl.currency.MonetaryAmount {
      return financial2.FullCostsPaidBefoRetent?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3FullCostsPaidBeforeRetentionCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 801, column 88
    function value_456 () : gw.pl.currency.MonetaryAmount {
      return financial3.FullCostsPaidBefoRetent?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentCostsForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 809, column 88
    function value_460 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentCostsForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentCostsForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 814, column 88
    function value_463 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentCostsForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentCostsForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 819, column 88
    function value_466 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentCostsForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentLossesForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 827, column 88
    function value_470 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentLossesForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentLossesForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 832, column 88
    function value_473 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentLossesForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentLossesForContractCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 837, column 88
    function value_476 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentLossesForContract?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ProfessionalAdvisorFeesOutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 845, column 88
    function value_480 () : gw.pl.currency.MonetaryAmount {
      return financial1.ProfAdvisorFeesOutstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ProfessionalAdvisorFeesOutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 850, column 88
    function value_483 () : gw.pl.currency.MonetaryAmount {
      return financial2.ProfAdvisorFeesOutstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ProfessionalAdvisorFeesOutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 855, column 88
    function value_486 () : gw.pl.currency.MonetaryAmount {
      return financial3.ProfAdvisorFeesOutstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ProfessionalAdvisorFeesCurrentPaymentCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 863, column 88
    function value_490 () : gw.pl.currency.MonetaryAmount {
      return financial1.ProfAdvisorFeesCurPayment?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ProfessionalAdvisorFeesCurrentPaymentCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 868, column 88
    function value_493 () : gw.pl.currency.MonetaryAmount {
      return financial2.ProfAdvisorFeesCurPayment?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ProfessionalAdvisorFeesCurrentPaymentCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 873, column 88
    function value_496 () : gw.pl.currency.MonetaryAmount {
      return financial3.ProfAdvisorFeesCurPayment?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LeadReserveAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 882, column 88
    function value_500 () : gw.pl.currency.MonetaryAmount {
      return financial1.LeadReserveAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LeadReserveAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 888, column 88
    function value_503 () : gw.pl.currency.MonetaryAmount {
      return financial2.LeadReserveAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=FinancialLeadReserveAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 894, column 88
    function value_506 () : gw.pl.currency.MonetaryAmount {
      return financial3.LeadReserveAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LeadReserveFeesCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 902, column 88
    function value_510 () : gw.pl.currency.MonetaryAmount {
      return financial1.LeadReserveFees?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LeadReserveFeesCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 907, column 88
    function value_513 () : gw.pl.currency.MonetaryAmount {
      return financial2.LeadReserveFees?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LeadReserveFeesCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 912, column 88
    function value_516 () : gw.pl.currency.MonetaryAmount {
      return financial3.LeadReserveFees?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredReleasedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 920, column 88
    function value_520 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredReleasedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredReleasedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 925, column 88
    function value_523 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredReleasedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ReinsuredReleasedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 930, column 88
    function value_526 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredReleasedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredRetainedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 938, column 88
    function value_530 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredRetainedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredRetainedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 943, column 88
    function value_533 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredRetainedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=FinancialReinsuredRetainedAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 948, column 88
    function value_536 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredRetainedAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredRetainedInterestCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 956, column 88
    function value_540 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredRetainedInterest?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredRetainedInterestCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 961, column 88
    function value_543 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredRetainedInterest?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ReinsuredRetainedInterestCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 966, column 88
    function value_546 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredRetainedInterest?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementTaxCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 974, column 88
    function value_550 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementTax?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementTaxCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 979, column 88
    function value_553 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementTax?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementTaxCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 984, column 88
    function value_556 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementTax?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementVatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 992, column 88
    function value_560 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementVat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementVatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 997, column 88
    function value_563 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementVat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementVatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1002, column 88
    function value_566 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementVat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ImportedServicesAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1010, column 88
    function value_570 () : gw.pl.currency.MonetaryAmount {
      return financial1.ImportedServicesAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ImportedServicesAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1015, column 88
    function value_573 () : gw.pl.currency.MonetaryAmount {
      return financial2.ImportedServicesAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ImportedServicesAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1020, column 88
    function value_576 () : gw.pl.currency.MonetaryAmount {
      return financial3.ImportedServicesAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on TextCell (id=Financial1ImportedServicesNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1028, column 55
    function value_580 () : java.lang.String {
      return financial1.ImportedServicesNarrative
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LetterOfCreditAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1036, column 88
    function value_585 () : gw.pl.currency.MonetaryAmount {
      return financial1.LetterOfCreditAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LetterOfCreditAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1041, column 88
    function value_588 () : gw.pl.currency.MonetaryAmount {
      return financial2.LetterOfCreditAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LetterOfCreditAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1046, column 88
    function value_591 () : gw.pl.currency.MonetaryAmount {
      return financial3.LetterOfCreditAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on TextCell (id=Financial1LetterOfCreditReference) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1054, column 55
    function value_595 () : java.lang.String {
      return financial1.LetterOfCreditReference
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1062, column 88
    function value_600 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1067, column 88
    function value_603 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementAmountCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1072, column 88
    function value_606 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementAmount?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1OutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1080, column 88
    function value_610 () : gw.pl.currency.MonetaryAmount {
      return financial1.Outstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2OutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1085, column 88
    function value_613 () : gw.pl.currency.MonetaryAmount {
      return financial2.Outstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3OutstandingCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1090, column 88
    function value_616 () : gw.pl.currency.MonetaryAmount {
      return financial3.Outstanding?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1PreviouslyPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1098, column 88
    function value_620 () : gw.pl.currency.MonetaryAmount {
      return financial1.PreviouslyPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2PreviouslyPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1103, column 88
    function value_623 () : gw.pl.currency.MonetaryAmount {
      return financial2.PreviouslyPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3PreviouslyPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1108, column 88
    function value_626 () : gw.pl.currency.MonetaryAmount {
      return financial3.PreviouslyPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1IncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1116, column 88
    function value_630 () : gw.pl.currency.MonetaryAmount {
      return financial1.Incurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2IncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1121, column 88
    function value_633 () : gw.pl.currency.MonetaryAmount {
      return financial2.Incurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3IncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1126, column 88
    function value_636 () : gw.pl.currency.MonetaryAmount {
      return financial3.Incurred?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1VatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1134, column 88
    function value_640 () : gw.pl.currency.MonetaryAmount {
      return financial1.Vat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2VatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1139, column 88
    function value_643 () : gw.pl.currency.MonetaryAmount {
      return financial2.Vat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3VatCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1144, column 88
    function value_646 () : gw.pl.currency.MonetaryAmount {
      return financial3.Vat?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1152, column 88
    function value_650 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1157, column 88
    function value_653 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1162, column 88
    function value_656 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentAgreedLblCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1170, column 88
    function value_660 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentAgreeded?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentAgreedCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1175, column 88
    function value_663 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentAgreeded?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentAgreedCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1180, column 88
    function value_666 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentAgreeded?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1AgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1188, column 88
    function value_670 () : gw.pl.currency.MonetaryAmount {
      return financial1.AgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2AgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1193, column 88
    function value_673 () : gw.pl.currency.MonetaryAmount {
      return financial2.AgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3AgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1198, column 88
    function value_676 () : gw.pl.currency.MonetaryAmount {
      return financial3.AgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ClaimLastPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1206, column 88
    function value_680 () : gw.pl.currency.MonetaryAmount {
      return financial1.ClaimLastPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ClaimLastPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1211, column 88
    function value_683 () : gw.pl.currency.MonetaryAmount {
      return financial2.ClaimLastPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ClaimLastPaidCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1216, column 88
    function value_686 () : gw.pl.currency.MonetaryAmount {
      return financial3.ClaimLastPaid?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ClaimAgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1224, column 88
    function value_690 () : gw.pl.currency.MonetaryAmount {
      return financial1.ClaimAgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ClaimAgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1229, column 88
    function value_693 () : gw.pl.currency.MonetaryAmount {
      return financial2.ClaimAgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ClaimAgreedNotSettledCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 1234, column 88
    function value_696 () : gw.pl.currency.MonetaryAmount {
      return financial3.ClaimAgreedNotSettled?.divide(100)?.multiply(claimDataMsg.InsurerSharePercentage)
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 725, column 88
    function visible_408 () : java.lang.Boolean {
      return helper.HasFinancial1 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 732, column 88
    function visible_413 () : java.lang.Boolean {
      return helper.HasFinancial2 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurredCarrier) at ECFMessageDetailsFinancialsPanelSet.pcf: line 739, column 88
    function visible_418 () : java.lang.Boolean {
      return helper.HasFinancial3 and helper.isLessThanFullShare()
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 718, column 148
    function visible_423 () : java.lang.Boolean {
      return financial1.FguAmountIncurred != null or financial2.FguAmountIncurred != null or financial3.FguAmountIncurred != null
    }
    
    // 'visible' attribute on TextAreaCell (id=Financial1FguNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 747, column 55
    function visible_424 () : java.lang.Boolean {
      return helper.HasFinancial1
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 742, column 63
    function visible_428 () : java.lang.Boolean {
      return financial1.FguNarrative != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 750, column 166
    function visible_438 () : java.lang.Boolean {
      return financial1.LossAndExpensesIncurred != null or financial2.LossAndExpensesIncurred != null or financial3.LossAndExpensesIncurred != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 768, column 154
    function visible_448 () : java.lang.Boolean {
      return financial1.OutstandingLossPlus != null or financial2.OutstandingLossPlus != null or financial3.OutstandingLossPlus != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 786, column 166
    function visible_458 () : java.lang.Boolean {
      return financial1.FullCostsPaidBefoRetent != null or financial2.FullCostsPaidBefoRetent != null or financial3.FullCostsPaidBefoRetent != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 804, column 166
    function visible_468 () : java.lang.Boolean {
      return financial1.CurrentCostsForContract != null or financial2.CurrentCostsForContract != null or financial3.CurrentCostsForContract != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 822, column 169
    function visible_478 () : java.lang.Boolean {
      return financial1.CurrentLossesForContract != null or financial2.CurrentLossesForContract != null or financial3.CurrentLossesForContract != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 840, column 175
    function visible_488 () : java.lang.Boolean {
      return financial1.ProfAdvisorFeesOutstanding != null or financial2.ProfAdvisorFeesOutstanding != null or financial3.ProfAdvisorFeesOutstanding != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 858, column 172
    function visible_498 () : java.lang.Boolean {
      return financial1.ProfAdvisorFeesCurPayment != null or financial2.ProfAdvisorFeesCurPayment != null or financial3.ProfAdvisorFeesCurPayment != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 876, column 148
    function visible_508 () : java.lang.Boolean {
      return financial1.LeadReserveAmount != null or financial2.LeadReserveAmount != null or financial3.LeadReserveAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 897, column 142
    function visible_518 () : java.lang.Boolean {
      return financial1.LeadReserveFees != null or financial2.LeadReserveFees != null or financial3.LeadReserveFees != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 915, column 166
    function visible_528 () : java.lang.Boolean {
      return financial1.ReinsuredReleasedAmount != null or financial2.ReinsuredReleasedAmount != null or financial3.ReinsuredReleasedAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 933, column 166
    function visible_538 () : java.lang.Boolean {
      return financial1.ReinsuredRetainedAmount != null or financial2.ReinsuredRetainedAmount != null or financial3.ReinsuredRetainedAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 951, column 172
    function visible_548 () : java.lang.Boolean {
      return financial1.ReinsuredRetainedInterest != null or financial2.ReinsuredRetainedInterest != null or financial3.ReinsuredRetainedInterest != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 969, column 136
    function visible_558 () : java.lang.Boolean {
      return financial1.SettlementTax != null or financial2.SettlementTax != null or financial3.SettlementTax != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 987, column 136
    function visible_568 () : java.lang.Boolean {
      return financial1.SettlementVat != null or financial2.SettlementVat != null or financial3.SettlementVat != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1005, column 163
    function visible_578 () : java.lang.Boolean {
      return financial1.ImportedServicesAmount != null or financial2.ImportedServicesAmount != null or financial3.ImportedServicesAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1023, column 76
    function visible_583 () : java.lang.Boolean {
      return financial1.ImportedServicesNarrative != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1031, column 157
    function visible_593 () : java.lang.Boolean {
      return financial1.LetterOfCreditAmount != null or financial2.LetterOfCreditAmount != null or financial3.LetterOfCreditAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1049, column 74
    function visible_598 () : java.lang.Boolean {
      return financial1.LetterOfCreditReference != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1057, column 145
    function visible_608 () : java.lang.Boolean {
      return financial1.SettlementAmount != null or financial2.SettlementAmount != null or financial3.SettlementAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1075, column 130
    function visible_618 () : java.lang.Boolean {
      return financial1.Outstanding != null or financial2.Outstanding != null or financial3.Outstanding != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1093, column 139
    function visible_628 () : java.lang.Boolean {
      return financial1.PreviouslyPaid != null or financial2.PreviouslyPaid != null or financial3.PreviouslyPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1111, column 121
    function visible_638 () : java.lang.Boolean {
      return financial1.Incurred != null or financial2.Incurred != null or financial3.Incurred != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1129, column 106
    function visible_648 () : java.lang.Boolean {
      return financial1.Vat != null or financial2.Vat != null or financial3.Vat != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1147, column 130
    function visible_658 () : java.lang.Boolean {
      return financial1.CurrentPaid != null or financial2.CurrentPaid != null or financial3.CurrentPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1165, column 142
    function visible_668 () : java.lang.Boolean {
      return financial1.CurrentAgreeded != null or financial2.CurrentAgreeded != null or financial3.CurrentAgreeded != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1183, column 145
    function visible_678 () : java.lang.Boolean {
      return financial1.AgreedNotSettled != null or financial2.AgreedNotSettled != null or financial3.AgreedNotSettled != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1201, column 136
    function visible_688 () : java.lang.Boolean {
      return financial1.ClaimLastPaid != null or financial2.ClaimLastPaid != null or financial3.ClaimLastPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 1219, column 160
    function visible_698 () : java.lang.Boolean {
      return financial1.ClaimAgreedNotSettled != null or financial2.ClaimAgreedNotSettled != null or financial3.ClaimAgreedNotSettled != null
    }
    
    property get name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsFinancialsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsFinancialsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function label_29 () : java.lang.Object {
      return financial1.Currency.getDisplayName()
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function label_35 () : java.lang.Object {
      return financial2.Currency.getDisplayName()
    }
    
    // 'label' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function label_41 () : java.lang.Object {
      return financial3.Currency.getDisplayName()
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function valueRoot_33 () : java.lang.Object {
      return financial1
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function valueRoot_39 () : java.lang.Object {
      return financial2
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function valueRoot_45 () : java.lang.Object {
      return financial3
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentCostsForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 197, column 55
    function value_100 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentCostsForContract
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentLossesForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 208, column 55
    function value_105 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentLossesForContract
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentLossesForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 213, column 55
    function value_109 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentLossesForContract
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentLossesForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 218, column 55
    function value_113 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentLossesForContract
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ProfessionalAdvisorFeesOutstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 229, column 55
    function value_118 () : gw.pl.currency.MonetaryAmount {
      return financial1.ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ProfessionalAdvisorFeesOutstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 234, column 55
    function value_122 () : gw.pl.currency.MonetaryAmount {
      return financial2.ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ProfessionalAdvisorFeesOutstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 239, column 55
    function value_126 () : gw.pl.currency.MonetaryAmount {
      return financial3.ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ProfessionalAdvisorFeesCurrentPayment) at ECFMessageDetailsFinancialsPanelSet.pcf: line 250, column 55
    function value_131 () : gw.pl.currency.MonetaryAmount {
      return financial1.ProfAdvisorFeesCurPayment
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ProfessionalAdvisorFeesCurrentPayment) at ECFMessageDetailsFinancialsPanelSet.pcf: line 255, column 55
    function value_135 () : gw.pl.currency.MonetaryAmount {
      return financial2.ProfAdvisorFeesCurPayment
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ProfessionalAdvisorFeesCurrentPayment) at ECFMessageDetailsFinancialsPanelSet.pcf: line 260, column 55
    function value_139 () : gw.pl.currency.MonetaryAmount {
      return financial3.ProfAdvisorFeesCurPayment
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LeadReserveAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 272, column 55
    function value_144 () : gw.pl.currency.MonetaryAmount {
      return financial1.LeadReserveAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LeadReserveAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 278, column 55
    function value_148 () : gw.pl.currency.MonetaryAmount {
      return financial2.LeadReserveAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=FinancialLeadReserveAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 284, column 55
    function value_152 () : gw.pl.currency.MonetaryAmount {
      return financial3.LeadReserveAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LeadReserveFees) at ECFMessageDetailsFinancialsPanelSet.pcf: line 295, column 55
    function value_157 () : gw.pl.currency.MonetaryAmount {
      return financial1.LeadReserveFees
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LeadReserveFees) at ECFMessageDetailsFinancialsPanelSet.pcf: line 300, column 55
    function value_161 () : gw.pl.currency.MonetaryAmount {
      return financial2.LeadReserveFees
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LeadReserveFees) at ECFMessageDetailsFinancialsPanelSet.pcf: line 305, column 55
    function value_165 () : gw.pl.currency.MonetaryAmount {
      return financial3.LeadReserveFees
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredReleasedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 316, column 55
    function value_170 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredReleasedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredReleasedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 321, column 55
    function value_174 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredReleasedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ReinsuredReleasedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 326, column 55
    function value_178 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredReleasedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredRetainedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 337, column 55
    function value_183 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredRetainedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredRetainedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 342, column 55
    function value_187 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredRetainedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=FinancialReinsuredRetainedAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 347, column 55
    function value_191 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredRetainedAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ReinsuredRetainedInterest) at ECFMessageDetailsFinancialsPanelSet.pcf: line 358, column 55
    function value_196 () : gw.pl.currency.MonetaryAmount {
      return financial1.ReinsuredRetainedInterest
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ReinsuredRetainedInterest) at ECFMessageDetailsFinancialsPanelSet.pcf: line 363, column 55
    function value_200 () : gw.pl.currency.MonetaryAmount {
      return financial2.ReinsuredRetainedInterest
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ReinsuredRetainedInterest) at ECFMessageDetailsFinancialsPanelSet.pcf: line 368, column 55
    function value_204 () : gw.pl.currency.MonetaryAmount {
      return financial3.ReinsuredRetainedInterest
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementTax) at ECFMessageDetailsFinancialsPanelSet.pcf: line 379, column 55
    function value_209 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementTax
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementTax) at ECFMessageDetailsFinancialsPanelSet.pcf: line 384, column 55
    function value_213 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementTax
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementTax) at ECFMessageDetailsFinancialsPanelSet.pcf: line 389, column 55
    function value_217 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementTax
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementVat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 400, column 55
    function value_222 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementVat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementVat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 405, column 55
    function value_226 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementVat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementVat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 410, column 55
    function value_230 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementVat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ImportedServicesAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 421, column 55
    function value_235 () : gw.pl.currency.MonetaryAmount {
      return financial1.ImportedServicesAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ImportedServicesAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 426, column 55
    function value_239 () : gw.pl.currency.MonetaryAmount {
      return financial2.ImportedServicesAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ImportedServicesAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 431, column 55
    function value_243 () : gw.pl.currency.MonetaryAmount {
      return financial3.ImportedServicesAmount
    }
    
    // 'value' attribute on TextCell (id=Financial1ImportedServicesNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 443, column 55
    function value_248 () : java.lang.String {
      return financial1.ImportedServicesNarrative
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LetterOfCreditAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 454, column 55
    function value_253 () : gw.pl.currency.MonetaryAmount {
      return financial1.LetterOfCreditAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LetterOfCreditAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 459, column 55
    function value_257 () : gw.pl.currency.MonetaryAmount {
      return financial2.LetterOfCreditAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LetterOfCreditAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 464, column 55
    function value_261 () : gw.pl.currency.MonetaryAmount {
      return financial3.LetterOfCreditAmount
    }
    
    // 'value' attribute on TextCell (id=Financial1LetterOfCreditReference) at ECFMessageDetailsFinancialsPanelSet.pcf: line 476, column 55
    function value_266 () : java.lang.String {
      return financial1.LetterOfCreditReference
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1SettlementAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 487, column 55
    function value_271 () : gw.pl.currency.MonetaryAmount {
      return financial1.SettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2SettlementAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 492, column 55
    function value_275 () : gw.pl.currency.MonetaryAmount {
      return financial2.SettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3SettlementAmount) at ECFMessageDetailsFinancialsPanelSet.pcf: line 497, column 55
    function value_279 () : gw.pl.currency.MonetaryAmount {
      return financial3.SettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1Outstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 509, column 55
    function value_284 () : gw.pl.currency.MonetaryAmount {
      return financial1.Outstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2Outstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 514, column 55
    function value_288 () : gw.pl.currency.MonetaryAmount {
      return financial2.Outstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3Outstanding) at ECFMessageDetailsFinancialsPanelSet.pcf: line 519, column 55
    function value_292 () : gw.pl.currency.MonetaryAmount {
      return financial3.Outstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1PreviouslyPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 530, column 55
    function value_297 () : gw.pl.currency.MonetaryAmount {
      return financial1.PreviouslyPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function value_30 () : gw.pl.currency.MonetaryAmount {
      return financial1.FguAmountIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2PreviouslyPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 535, column 55
    function value_301 () : gw.pl.currency.MonetaryAmount {
      return financial2.PreviouslyPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3PreviouslyPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 540, column 55
    function value_305 () : gw.pl.currency.MonetaryAmount {
      return financial3.PreviouslyPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1Incurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 551, column 55
    function value_310 () : gw.pl.currency.MonetaryAmount {
      return financial1.Incurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2Incurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 556, column 55
    function value_314 () : gw.pl.currency.MonetaryAmount {
      return financial2.Incurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3Incurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 561, column 55
    function value_318 () : gw.pl.currency.MonetaryAmount {
      return financial3.Incurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1Vat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 572, column 55
    function value_323 () : gw.pl.currency.MonetaryAmount {
      return financial1.Vat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2Vat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 577, column 55
    function value_327 () : gw.pl.currency.MonetaryAmount {
      return financial2.Vat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3Vat) at ECFMessageDetailsFinancialsPanelSet.pcf: line 582, column 55
    function value_331 () : gw.pl.currency.MonetaryAmount {
      return financial3.Vat
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 594, column 55
    function value_336 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 599, column 55
    function value_340 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 604, column 55
    function value_344 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentAgreededLbl) at ECFMessageDetailsFinancialsPanelSet.pcf: line 616, column 55
    function value_349 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentAgreeded
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentAgreeded) at ECFMessageDetailsFinancialsPanelSet.pcf: line 621, column 55
    function value_353 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentAgreeded
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3CurrentAgreeded) at ECFMessageDetailsFinancialsPanelSet.pcf: line 626, column 55
    function value_357 () : gw.pl.currency.MonetaryAmount {
      return financial3.CurrentAgreeded
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function value_36 () : gw.pl.currency.MonetaryAmount {
      return financial2.FguAmountIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1AgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 637, column 55
    function value_362 () : gw.pl.currency.MonetaryAmount {
      return financial1.AgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2AgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 642, column 55
    function value_366 () : gw.pl.currency.MonetaryAmount {
      return financial2.AgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3AgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 647, column 55
    function value_370 () : gw.pl.currency.MonetaryAmount {
      return financial3.AgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ClaimLastPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 658, column 55
    function value_375 () : gw.pl.currency.MonetaryAmount {
      return financial1.ClaimLastPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ClaimLastPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 663, column 55
    function value_379 () : gw.pl.currency.MonetaryAmount {
      return financial2.ClaimLastPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ClaimLastPaid) at ECFMessageDetailsFinancialsPanelSet.pcf: line 668, column 55
    function value_383 () : gw.pl.currency.MonetaryAmount {
      return financial3.ClaimLastPaid
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1ClaimAgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 680, column 55
    function value_388 () : gw.pl.currency.MonetaryAmount {
      return financial1.ClaimAgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2ClaimAgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 685, column 55
    function value_392 () : gw.pl.currency.MonetaryAmount {
      return financial2.ClaimAgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3ClaimAgreedNotSettled) at ECFMessageDetailsFinancialsPanelSet.pcf: line 690, column 55
    function value_396 () : gw.pl.currency.MonetaryAmount {
      return financial3.ClaimAgreedNotSettled
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function value_42 () : gw.pl.currency.MonetaryAmount {
      return financial3.FguAmountIncurred
    }
    
    // 'value' attribute on TextAreaCell (id=Financial1FguNarrative) at ECFMessageDetailsFinancialsPanelSet.pcf: line 113, column 55
    function value_48 () : java.lang.String {
      return financial1.FguNarrative
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1LossAndExpensesIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 124, column 55
    function value_53 () : gw.pl.currency.MonetaryAmount {
      return financial1.LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2LossAndExpensesIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 129, column 55
    function value_57 () : gw.pl.currency.MonetaryAmount {
      return financial2.LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3LossAndExpensesIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 134, column 55
    function value_61 () : gw.pl.currency.MonetaryAmount {
      return financial3.LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1) at ECFMessageDetailsFinancialsPanelSet.pcf: line 145, column 55
    function value_66 () : gw.pl.currency.MonetaryAmount {
      return financial1.OutstandingLossPlus
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2) at ECFMessageDetailsFinancialsPanelSet.pcf: line 150, column 55
    function value_70 () : gw.pl.currency.MonetaryAmount {
      return financial2.OutstandingLossPlus
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3) at ECFMessageDetailsFinancialsPanelSet.pcf: line 155, column 55
    function value_74 () : gw.pl.currency.MonetaryAmount {
      return financial3.OutstandingLossPlus
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1FullCostsPaidBeforeRetention) at ECFMessageDetailsFinancialsPanelSet.pcf: line 166, column 55
    function value_79 () : gw.pl.currency.MonetaryAmount {
      return financial1.FullCostsPaidBefoRetent
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2FullCostsPaidBeforeRetention) at ECFMessageDetailsFinancialsPanelSet.pcf: line 171, column 55
    function value_83 () : gw.pl.currency.MonetaryAmount {
      return financial2.FullCostsPaidBefoRetent
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial3FullCostsPaidBeforeRetention) at ECFMessageDetailsFinancialsPanelSet.pcf: line 176, column 55
    function value_87 () : gw.pl.currency.MonetaryAmount {
      return financial3.FullCostsPaidBefoRetent
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial1CurrentCostsForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 187, column 55
    function value_92 () : gw.pl.currency.MonetaryAmount {
      return financial1.CurrentCostsForContract
    }
    
    // 'value' attribute on MonetaryAmountCell (id=Financial2CurrentCostsForContract) at ECFMessageDetailsFinancialsPanelSet.pcf: line 192, column 55
    function value_96 () : gw.pl.currency.MonetaryAmount {
      return financial2.CurrentCostsForContract
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 179, column 166
    function visible_103 () : java.lang.Boolean {
      return financial1.CurrentCostsForContract != null or financial2.CurrentCostsForContract != null or financial3.CurrentCostsForContract != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 200, column 169
    function visible_116 () : java.lang.Boolean {
      return financial1.CurrentLossesForContract != null or financial2.CurrentLossesForContract != null or financial3.CurrentLossesForContract != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 221, column 175
    function visible_129 () : java.lang.Boolean {
      return financial1.ProfAdvisorFeesOutstanding != null or financial2.ProfAdvisorFeesOutstanding != null or financial3.ProfAdvisorFeesOutstanding != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 242, column 172
    function visible_142 () : java.lang.Boolean {
      return financial1.ProfAdvisorFeesCurPayment != null or financial2.ProfAdvisorFeesCurPayment != null or financial3.ProfAdvisorFeesCurPayment != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 263, column 148
    function visible_155 () : java.lang.Boolean {
      return financial1.LeadReserveAmount != null or financial2.LeadReserveAmount != null or financial3.LeadReserveAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 287, column 142
    function visible_168 () : java.lang.Boolean {
      return financial1.LeadReserveFees != null or financial2.LeadReserveFees != null or financial3.LeadReserveFees != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 308, column 166
    function visible_181 () : java.lang.Boolean {
      return financial1.ReinsuredReleasedAmount != null or financial2.ReinsuredReleasedAmount != null or financial3.ReinsuredReleasedAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 329, column 166
    function visible_194 () : java.lang.Boolean {
      return financial1.ReinsuredRetainedAmount != null or financial2.ReinsuredRetainedAmount != null or financial3.ReinsuredRetainedAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 350, column 172
    function visible_207 () : java.lang.Boolean {
      return financial1.ReinsuredRetainedInterest != null or financial2.ReinsuredRetainedInterest != null or financial3.ReinsuredRetainedInterest != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 371, column 136
    function visible_220 () : java.lang.Boolean {
      return financial1.SettlementTax != null or financial2.SettlementTax != null or financial3.SettlementTax != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 392, column 136
    function visible_233 () : java.lang.Boolean {
      return financial1.SettlementVat != null or financial2.SettlementVat != null or financial3.SettlementVat != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 413, column 163
    function visible_246 () : java.lang.Boolean {
      return financial1.ImportedServicesAmount != null or financial2.ImportedServicesAmount != null or financial3.ImportedServicesAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 434, column 76
    function visible_251 () : java.lang.Boolean {
      return financial1.ImportedServicesNarrative != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 446, column 157
    function visible_264 () : java.lang.Boolean {
      return financial1.LetterOfCreditAmount != null or financial2.LetterOfCreditAmount != null or financial3.LetterOfCreditAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 467, column 74
    function visible_269 () : java.lang.Boolean {
      return financial1.LetterOfCreditReference != null
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial1FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 87, column 55
    function visible_28 () : java.lang.Boolean {
      return helper.HasFinancial1
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 479, column 145
    function visible_282 () : java.lang.Boolean {
      return financial1.SettlementAmount != null or financial2.SettlementAmount != null or financial3.SettlementAmount != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 500, column 130
    function visible_295 () : java.lang.Boolean {
      return financial1.Outstanding != null or financial2.Outstanding != null or financial3.Outstanding != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 522, column 139
    function visible_308 () : java.lang.Boolean {
      return financial1.PreviouslyPaid != null or financial2.PreviouslyPaid != null or financial3.PreviouslyPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 543, column 121
    function visible_321 () : java.lang.Boolean {
      return financial1.Incurred != null or financial2.Incurred != null or financial3.Incurred != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 564, column 106
    function visible_334 () : java.lang.Boolean {
      return financial1.Vat != null or financial2.Vat != null or financial3.Vat != null
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial2FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 94, column 55
    function visible_34 () : java.lang.Boolean {
      return helper.HasFinancial2
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 585, column 130
    function visible_347 () : java.lang.Boolean {
      return financial1.CurrentPaid != null or financial2.CurrentPaid != null or financial3.CurrentPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 607, column 142
    function visible_360 () : java.lang.Boolean {
      return financial1.CurrentAgreeded != null or financial2.CurrentAgreeded != null or financial3.CurrentAgreeded != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 629, column 145
    function visible_373 () : java.lang.Boolean {
      return financial1.AgreedNotSettled != null or financial2.AgreedNotSettled != null or financial3.AgreedNotSettled != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 650, column 136
    function visible_386 () : java.lang.Boolean {
      return financial1.ClaimLastPaid != null or financial2.ClaimLastPaid != null or financial3.ClaimLastPaid != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 671, column 160
    function visible_399 () : java.lang.Boolean {
      return financial1.ClaimAgreedNotSettled != null or financial2.ClaimAgreedNotSettled != null or financial3.ClaimAgreedNotSettled != null
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=Financial3FguAmountIncurred) at ECFMessageDetailsFinancialsPanelSet.pcf: line 101, column 55
    function visible_40 () : java.lang.Boolean {
      return helper.HasFinancial3
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 75, column 148
    function visible_46 () : java.lang.Boolean {
      return financial1.FguAmountIncurred != null or financial2.FguAmountIncurred != null or financial3.FguAmountIncurred != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 104, column 63
    function visible_51 () : java.lang.Boolean {
      return financial1.FguNarrative != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 116, column 166
    function visible_64 () : java.lang.Boolean {
      return financial1.LossAndExpensesIncurred != null or financial2.LossAndExpensesIncurred != null or financial3.LossAndExpensesIncurred != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 137, column 154
    function visible_77 () : java.lang.Boolean {
      return financial1.OutstandingLossPlus != null or financial2.OutstandingLossPlus != null or financial3.OutstandingLossPlus != null
    }
    
    // 'visible' attribute on Row at ECFMessageDetailsFinancialsPanelSet.pcf: line 158, column 166
    function visible_90 () : java.lang.Boolean {
      return financial1.FullCostsPaidBefoRetent != null or financial2.FullCostsPaidBefoRetent != null or financial3.FullCostsPaidBefoRetent != null
    }
    
    property get name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}