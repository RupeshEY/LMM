package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.services.message.MonetaryAmountAsserter
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

class ClaimDataFinancialCreatorTest extends GUnitTestClass {

  public static final var DELTA: double = 001d
  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqWithoutFinancial() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var notifyRqXml = ECFMessageUtil.createNewClaimNotifyRqWithoutFinancial()
        final var notifMsg = _entityMapperService.createEntity(notifyRqXml) as ECFMessageClaimNotifyRq_Ext
        assertEquals(0, notifMsg.Financials.length)
      })
    })
  }

  function testNewClaimNotifyRqWithFinancial() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var notifyRqXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var notifMsg = _entityMapperService.createEntity(notifyRqXml) as ECFMessageClaimNotifyRq_Ext
        assertEquals(3, notifMsg.Financials.length)

        assertEquals(ECFOutstandingQualifierCode_Ext.TC_S, notifMsg.OutstandingAmountQualifier)
        assertEquals("1245014052014,2245014052014,3245014052014,4245014052014", notifMsg.OriginalSplitReferenceCSV)
        assertEquals(Currency.TC_EUR, notifMsg.SettlementCurrency)

        final var financialGbp = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_GBP)
        assertEquals(Currency.TC_GBP, financialGbp.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.FguAmountIncurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialGbp.LossAndExpensesIncurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.11d, financialGbp.OutstandingLossPlus, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialGbp.FullCostsPaidBefoRetent, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.CurrentCostsForContract, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.CurrentLossesForContract, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialGbp.ProfAdvisorFeesOutstanding, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.ProfAdvisorFeesCurPayment, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.SettlementVat, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LeadReserveAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LeadReserveFees, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredReleasedAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredRetainedAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredRetainedInterest, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.SettlementTax, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ImportedServicesAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LetterOfCreditAmount, Currency.TC_EUR)
        assertEquals("ISN", financialGbp.ImportedServicesNarrative)
        assertEquals("LOCR", financialGbp.LetterOfCreditReference)
        assertEquals("FN", financialGbp.FguNarrative)
        assertEquals(10000d, financialGbp.SettlementAmount.Amount.doubleValue(), DELTA)
        assertEquals(1d, financialGbp.ExchangeRate.doubleValue(), DELTA)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Outstanding, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.PreviouslyPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Incurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Vat, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.CurrentPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.CurrentAgreeded, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.AgreedNotSettled, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ClaimLastPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ClaimAgreedNotSettled, Currency.TC_GBP)

        final var financialEur = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_EUR)
        assertEquals(Currency.TC_EUR, financialEur.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialEur.FguAmountIncurred, Currency.TC_EUR)

        final var financialUsd = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_USD)
        assertEquals(Currency.TC_USD, financialUsd.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(30000d, financialUsd.FguAmountIncurred, Currency.TC_USD)
        assertNull(null, financialUsd.PreviouslyPaid)
      })
    })
  }


  function testNewClaimNotifyRqWithThreeFinancialCurrenciesAndOneClaimEntryDetailCurrency() {


    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/CN_DE2509.xml"))
        final var notifMsg = _entityMapperService.createEntity(notifyRqXml) as ECFMessageClaimNotifyRq_Ext
        assertEquals(3, notifMsg.Financials.length)

        assertEquals(ECFOutstandingQualifierCode_Ext.TC_S, notifMsg.OutstandingAmountQualifier)
        assertEquals("1245014052014,2245014052014,3245014052014,4245014052014", notifMsg.OriginalSplitReferenceCSV)
        assertEquals(Currency.TC_EUR, notifMsg.SettlementCurrency)

        final var financialGbp = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_GBP)
        assertEquals(Currency.TC_GBP, financialGbp.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialGbp.FguAmountIncurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialGbp.LossAndExpensesIncurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1234567890123.11d, financialGbp.OutstandingLossPlus, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialGbp.FullCostsPaidBefoRetent, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.CurrentCostsForContract, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.CurrentLossesForContract, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialGbp.ProfAdvisorFeesOutstanding, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialGbp.ProfAdvisorFeesCurPayment, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.SettlementVat, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LeadReserveAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LeadReserveFees, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredReleasedAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredRetainedAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ReinsuredRetainedInterest, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.SettlementTax, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ImportedServicesAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LetterOfCreditAmount, Currency.TC_EUR)
        assertEquals("ISN", financialGbp.ImportedServicesNarrative)
        assertEquals("LOCR", financialGbp.LetterOfCreditReference)
        assertEquals("FN", financialGbp.FguNarrative)
        assertEquals(10000d, financialGbp.SettlementAmount.Amount.doubleValue(), DELTA)
        assertEquals(1d, financialGbp.ExchangeRate.doubleValue(), DELTA)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Outstanding, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.PreviouslyPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Incurred, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.Vat, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.CurrentPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.CurrentAgreeded, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.AgreedNotSettled, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ClaimLastPaid, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.ClaimAgreedNotSettled, Currency.TC_GBP)

        final var financialEur = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_EUR)
        assertEquals(Currency.TC_EUR, financialEur.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialEur.FguAmountIncurred, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialEur.LossAndExpensesIncurred, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialEur.OutstandingLossPlus, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialEur.FullCostsPaidBefoRetent, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialEur.CurrentCostsForContract, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialEur.CurrentLossesForContract, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialEur.ProfAdvisorFeesOutstanding, Currency.TC_EUR)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialEur.ProfAdvisorFeesCurPayment, Currency.TC_EUR)
        assertNull(financialEur.SettlementVat)
        assertNull(financialEur.LeadReserveAmount)
        assertNull(financialEur.LeadReserveFees)
        assertNull(financialEur.ReinsuredReleasedAmount)
        assertNull(financialEur.ReinsuredRetainedAmount)
        assertNull(financialEur.ReinsuredRetainedInterest)
        assertNull(financialEur.SettlementTax)
        assertNull(financialEur.ImportedServicesAmount)
        assertNull(financialEur.LetterOfCreditAmount)
        assertNull(financialEur.ImportedServicesNarrative)
        assertNull(financialEur.LetterOfCreditReference)
        assertNull(financialEur.FguNarrative)
        assertNull(financialEur.SettlementAmount)
        assertNull(financialEur.ExchangeRate)
        assertNull(financialEur.Outstanding)
        assertNull(financialEur.PreviouslyPaid)
        assertNull(financialEur.Incurred)
        assertNull(financialEur.Vat)
        assertNull(financialEur.CurrentPaid)
        assertNull(financialEur.CurrentAgreeded)
        assertNull(financialEur.AgreedNotSettled)
        assertNull(financialEur.ClaimLastPaid)
        assertNull(financialEur.ClaimAgreedNotSettled)


        final var financialUsd = notifMsg.Financials.firstWhere(\fin -> fin.FguAmountIncurred.Currency == Currency.TC_USD)
        assertEquals(Currency.TC_USD, financialUsd.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(30000d, financialUsd.FguAmountIncurred, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(20000d, financialUsd.LossAndExpensesIncurred, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialUsd.OutstandingLossPlus, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(20d, financialUsd.FullCostsPaidBefoRetent, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialUsd.CurrentCostsForContract, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialUsd.CurrentLossesForContract, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(0d, financialUsd.ProfAdvisorFeesOutstanding, Currency.TC_USD)
        MonetaryAmountAsserter.checkMonetaryAmount(10000d, financialUsd.ProfAdvisorFeesCurPayment, Currency.TC_USD)
        assertNull(financialUsd.SettlementVat)
        assertNull(financialUsd.LeadReserveAmount)
        assertNull(financialUsd.LeadReserveFees)
        assertNull(financialUsd.ReinsuredReleasedAmount)
        assertNull(financialUsd.ReinsuredRetainedAmount)
        assertNull(financialUsd.ReinsuredRetainedInterest)
        assertNull(financialUsd.SettlementTax)
        assertNull(financialUsd.ImportedServicesAmount)
        assertNull(financialUsd.LetterOfCreditAmount)
        assertNull(financialUsd.ImportedServicesNarrative)
        assertNull(financialUsd.LetterOfCreditReference)
        assertNull(financialUsd.FguNarrative)
        assertNull(financialUsd.SettlementAmount)
        assertNull(financialUsd.ExchangeRate)
        assertNull(financialUsd.Outstanding)
        assertNull(financialUsd.PreviouslyPaid)
        assertNull(financialUsd.Incurred)
        assertNull(financialUsd.Vat)
        assertNull(financialUsd.CurrentPaid)
        assertNull(financialUsd.CurrentAgreeded)
        assertNull(financialUsd.AgreedNotSettled)
        assertNull(financialUsd.ClaimLastPaid)
        assertNull(financialUsd.ClaimAgreedNotSettled)

      })
    })
  }


  function testNewClaimRetrieveqWithFinancial() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var crRqXml = ECFMessageUtil.createNewClaimRetrieveRs()
        final var crMsg = _entityMapperService.createEntity(crRqXml) as ECFMessageClaimRetrieveRs_Ext
        assertEquals(1, crMsg.Financials.length)

        assertEquals(ECFOutstandingQualifierCode_Ext.TC_S, crMsg.OutstandingAmountQualifier)
        assertEquals("2100225022011", crMsg.OriginalSplitReferenceCSV)
      })
    })
  }

  function testNewClaimNotifyRqWithFinancialWithoutTargetCurrencyThenTakesOriginalCurrency() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var notifyRqXml = ECFMessageUtil.createNewClaimNotifyRq()
        final var financialGbpXml = notifyRqXml.ClaimMovement.Extension.ClaimEntry.ClaimEntryFinancialAmounts.firstWhere(\fin ->
            fin.Ccy == Currency.TC_GBP.DisplayName
        )
        financialGbpXml.TargetCurrency = null
        final var notifMsg = _entityMapperService.createEntity(notifyRqXml) as ECFMessageClaimNotifyRq_Ext

        assertNull(notifMsg.SettlementCurrency)
        final var financialGbp = notifMsg.Financials.firstWhere(\fin -> fin.Currency == Currency.TC_GBP)
        assertEquals(Currency.TC_GBP, financialGbp.Currency)
        MonetaryAmountAsserter.checkMonetaryAmount(1000d, financialGbp.LetterOfCreditAmount, Currency.TC_GBP)
      })
    })
  }
}