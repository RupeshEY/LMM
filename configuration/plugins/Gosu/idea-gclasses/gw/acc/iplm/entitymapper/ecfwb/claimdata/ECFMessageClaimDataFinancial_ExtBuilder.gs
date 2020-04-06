package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.api.databuilder.DataBuilder
uses gw.api.databuilder.ValueGenerator
uses typekey.Currency

uses java.math.BigDecimal

public class ECFMessageClaimDataFinancial_ExtBuilder extends DataBuilder<ECFMessageClaimDataFinancial_Ext, ECFMessageClaimDataFinancial_ExtBuilder>{

  construct() {
    super(ECFMessageClaimDataFinancial_Ext)
  }


  public function withCurrency(value:Currency) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#Currency, value)
    return this
  }

  public function withAgreedNotSettled(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#AgreedNotSettled, value)
    return this
  }

  public function withClaimAgreedNotSettled(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ClaimAgreedNotSettled, value)
    return this
  }

  public function withClaimLastPaid(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ClaimLastPaid, value)
    return this
  }

  public function withCurrentAgreeded(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#CurrentAgreeded, value)
    return this
  }

  public function withCurrentCostsForContract(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#CurrentCostsForContract, value)
    return this
  }

  public function withCurrentLossesForContract(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#CurrentLossesForContract, value)
    return this
  }

  public function withCurrentPaid(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#CurrentPaid, value)
    return this
  }

  public function withECFMsgBuilder(builder: ValueGenerator<entity.ECFMessageClaimNotifyRq_Ext>) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ECFMsg, builder)
    return this
  }

  public function withECFMsg(value:entity.ECFMessageClaimNotifyRq_Ext) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ECFMsg, value)
    return this
  }

  public function withExchangeRate(value:BigDecimal) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ExchangeRate, value)
    return this
  }

  public function withFguAmountIncurred(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#FguAmountIncurred, value)
    return this
  }

  public function withFguNarrative(value:String) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#FguNarrative, value)
    return this
  }

  public function withFullCostsPaidBefoRetent(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#FullCostsPaidBefoRetent, value)
    return this
  }

  public function withImportedServicesAmount(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ImportedServicesAmount, value)
    return this
  }

  public function withImportedServicesNarrative(value:String) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ImportedServicesNarrative, value)
    return this
  }

  public function withIncurred(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#Incurred, value)
    return this
  }

  public function withLeadReserveAmount(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#LeadReserveAmount, value)
    return this
  }

  public function withLeadReserveFees(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#LeadReserveFees, value)
    return this
  }

  public function withLetterOfCreditAmount(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#LetterOfCreditAmount, value)
    return this
  }

  public function withLetterOfCreditReference(value:String) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#LetterOfCreditReference, value)
    return this
  }

  public function withLossAndExpensesIncurred(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#LossAndExpensesIncurred, value)
    return this
  }

  public function withOutstanding(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#Outstanding, value)
    return this
  }

  public function withOutstandingLossPlus(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#OutstandingLossPlus, value)
    return this
  }

  public function withPreviouslyPaid(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#PreviouslyPaid, value)
    return this
  }

  public function withProfAdvisorFeesCurPayment(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ProfAdvisorFeesCurPayment, value)
    return this
  }

  public function withProfAdvisorFeesOutstanding(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ProfAdvisorFeesOutstanding, value)
    return this
  }

  public function withReinsuredReleasedAmount(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ReinsuredReleasedAmount, value)
    return this
  }

  public function withReinsuredRetainedAmount(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ReinsuredRetainedAmount, value)
    return this
  }

  public function withReinsuredRetainedInterest(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#ReinsuredRetainedInterest, value)
    return this
  }

  public function withSettlementAmount(value:BigDecimal) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#SettlementAmount, value)
    return this
  }

  public function withSettlementTax(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#SettlementTax, value)
    return this
  }

  public function withSettlementVat(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#SettlementVat, value)
    return this
  }

  public function withVat(value:gw.pl.currency.MonetaryAmount) : ECFMessageClaimDataFinancial_ExtBuilder {
    set(ECFMessageClaimDataFinancial_Ext#Vat, value)
    return this
  }
}