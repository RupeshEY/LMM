package gw.acc.iplm.services.financial

uses gw.acc.iplm.exchangerate.ECFExchangeRateSetPlugin
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.api.util.DateUtil
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass

class ECFClaimResponseFinancialCalculatorTest extends GUnitTestClass {

  private static var eurToGbExchangeRate = 2
  private static var usdToGbExchangeRate = 3

  override function beforeClass() {
    super.beforeClass()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var exchangeRates = new ECFExchangeRateSetPlugin().getExchangeRateList()
      exchangeRates.firstWhere(\rate -> rate.BaseCurrency == Currency.TC_EUR and rate.PriceCurrency == Currency.TC_GBP).Rate = eurToGbExchangeRate
      exchangeRates.firstWhere(\rate -> rate.BaseCurrency == Currency.TC_USD and rate.PriceCurrency == Currency.TC_GBP).Rate = usdToGbExchangeRate
      CurrencyUtil.createMarketExchangeRateSet("FinancialCalculatorTest ExchangeRateSet", "From ECFClaimResponseFinancialCalculatorTest",
          DateUtil.currentDate(), null, exchangeRates)
    }, User.util.UnrestrictedUser)
  }

  function testGetMessageSum_SingleCurrency_Lloyds() {
    var currency = Currency.TC_GBP
    var vat = 100
    var leadReserve = 200
    var leadFees = 300

    var newLeadReserve = 500

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financial = new ECFMessageClaimDataFinancial_Ext()
      financial.Currency = currency
      financial.SettlementVat = new MonetaryAmount(vat, currency)
      financial.LeadReserveAmount = new MonetaryAmount(leadReserve, currency)
      financial.LeadReserveFees = new MonetaryAmount(leadFees, currency)
      claimData.addToFinancials(financial)

      msg.Currency1 = currency
      msg.LeadReserveAmount1 = new MonetaryAmount(newLeadReserve, currency)
    }, User.util.UnrestrictedUser)

    var total: float = vat + newLeadReserve + leadFees
    var expected = new CurrencyAmount(total, currency).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currency).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_SingleCurrency_ILU() {
    var currency = Currency.TC_GBP
    var vat = 100
    var importedServicesAmount = 6000
    var lossAndExpensesIncurred = 7020
    var profAdvisorFeesOutstanding = 1200

    var newImportedServicesAmount = 500

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_ILU
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financial = new ECFMessageClaimDataFinancial_Ext()
      financial.Currency = currency
      financial.SettlementVat = new MonetaryAmount(vat, currency)
      financial.ImportedServicesAmount = new MonetaryAmount(importedServicesAmount, currency)
      financial.LossAndExpensesIncurred = new MonetaryAmount(lossAndExpensesIncurred, currency)
      financial.ProfAdvisorFeesOutstanding = new MonetaryAmount(profAdvisorFeesOutstanding, currency)
      claimData.addToFinancials(financial)

      msg.Currency1 = currency
      msg.ImportedServicesAmount1 = new MonetaryAmount(newImportedServicesAmount, currency)
    }, User.util.UnrestrictedUser)

    var total: float = vat + newImportedServicesAmount + lossAndExpensesIncurred + profAdvisorFeesOutstanding
    var expected = new CurrencyAmount(total, currency).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currency).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_SingleCurrency_LIRMA() {
    var currency = Currency.TC_GBP
    var vat = 100
    var leadReserve = 200
    var importedServicesAmount = 6000
    var lossAndExpensesIncurred = 7020
    var profAdvisorFeesOutstanding = 1200

    var newLeadReserve = 500

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LIRMA
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financial = new ECFMessageClaimDataFinancial_Ext()
      financial.Currency = currency
      financial.SettlementVat = new MonetaryAmount(vat, currency)
      financial.LeadReserveAmount = new MonetaryAmount(leadReserve, currency)
      financial.ImportedServicesAmount = new MonetaryAmount(importedServicesAmount, currency)
      financial.LossAndExpensesIncurred = new MonetaryAmount(lossAndExpensesIncurred, currency)
      financial.ProfAdvisorFeesOutstanding = new MonetaryAmount(profAdvisorFeesOutstanding, currency)
      claimData.addToFinancials(financial)

      msg.Currency1 = currency
      msg.LeadReserveAmount1 = new MonetaryAmount(newLeadReserve, currency)
    }, User.util.UnrestrictedUser)

    var total: float = vat + newLeadReserve + importedServicesAmount + lossAndExpensesIncurred + profAdvisorFeesOutstanding
    var expected = new CurrencyAmount(total, currency).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currency).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_SingleCurrency_50PercentShare() {
    var currency = Currency.TC_GBP
    var vat = 150
    var leadReserve = 230
    var leadFees = 305
    var lossAndExpensesIncurred = 4000

    var newLeadReserve = 700

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 50bd

      var financial = new ECFMessageClaimDataFinancial_Ext()
      financial.Currency = currency
      financial.SettlementVat = new MonetaryAmount(vat, currency)
      financial.LeadReserveAmount = new MonetaryAmount(leadReserve, currency)
      financial.LeadReserveFees = new MonetaryAmount(leadFees, currency)
      financial.LossAndExpensesIncurred = new MonetaryAmount(lossAndExpensesIncurred, currency)
      claimData.addToFinancials(financial)

      msg.Currency1 = currency
      msg.LeadReserveAmount1 = new MonetaryAmount(newLeadReserve, currency)
    }, User.util.UnrestrictedUser)

    var total: float = (vat + newLeadReserve + leadFees + lossAndExpensesIncurred) / 2
    var expected = new CurrencyAmount(total, currency).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currency).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_TwoCurrency_InClaimData() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 100
    var leadReserveGB = 200
    var leadFeesGB = 300

    var newVatGB = 700

    var currencyEUR = Currency.TC_EUR
    var vatEUR = 100
    var leadReserveEUR = 200
    var leadFeesEUR = 300


    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)
      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      var financialEUR = new ECFMessageClaimDataFinancial_Ext()
      financialEUR.Currency = currencyEUR
      financialEUR.SettlementVat = new MonetaryAmount(vatEUR, currencyEUR)
      financialEUR.LeadReserveAmount = new MonetaryAmount(leadReserveEUR, currencyEUR)
      financialEUR.LeadReserveFees = new MonetaryAmount(leadFeesEUR, currencyEUR)
      claimData.addToFinancials(financialEUR)


      msg.Currency1 = currencyGB
      msg.VATAmount1 = new MonetaryAmount(newVatGB, currencyGB)
    }, User.util.UnrestrictedUser)

    var total: float = newVatGB + leadReserveGB + leadFeesGB
    total += (vatEUR + leadReserveEUR + leadFeesEUR) * eurToGbExchangeRate

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_TwoCurrency_InClaimDataAndClaimResponse() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 100
    var leadReserveGB = 200
    var leadFeesGB = 300

    var newleadFeesGB = 700

    var currencyEUR = Currency.TC_EUR
    var vatEUR = 100
    var leadReserveEUR = 200
    var leadFeesEUR = 300

    var newLeadReserveEUR = 1400


    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      var financialEUR = new ECFMessageClaimDataFinancial_Ext()
      financialEUR.Currency = currencyEUR
      financialEUR.SettlementVat = new MonetaryAmount(vatEUR, currencyEUR)
      financialEUR.LeadReserveAmount = new MonetaryAmount(leadReserveEUR, currencyEUR)
      financialEUR.LeadReserveFees = new MonetaryAmount(leadFeesEUR, currencyEUR)
      claimData.addToFinancials(financialEUR)


      msg.Currency1 = currencyGB
      msg.LeadReserveFees1 = new MonetaryAmount(newleadFeesGB, currencyGB)

      msg.Currency2 = currencyEUR
      msg.LeadReserveAmount2 = new MonetaryAmount(newLeadReserveEUR, currencyEUR)

    }, User.util.UnrestrictedUser)

    var total: float = vatGB + leadReserveGB + newleadFeesGB
    total += (vatEUR + newLeadReserveEUR + leadFeesEUR) * eurToGbExchangeRate

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_ThreeCurrency_InClaimData() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 400
    var leadReserveGB = 600
    var leadFeesGB = 700

    var newReserveAmtGB = 700

    var currencyEUR = Currency.TC_EUR
    var vatEUR = 300
    var leadReserveEUR = 250
    var leadFeesEUR = 340

    var currencyUSD = Currency.TC_USD
    var vatUSD = 310
    var leadReserveUSD = 2555
    var leadFeesUSD = 345


    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      var financialEUR = new ECFMessageClaimDataFinancial_Ext()
      financialEUR.Currency = currencyEUR
      financialEUR.SettlementVat = new MonetaryAmount(vatEUR, currencyEUR)
      financialEUR.LeadReserveAmount = new MonetaryAmount(leadReserveEUR, currencyEUR)
      financialEUR.LeadReserveFees = new MonetaryAmount(leadFeesEUR, currencyEUR)
      claimData.addToFinancials(financialEUR)

      var financialUSD = new ECFMessageClaimDataFinancial_Ext()
      financialUSD.Currency = currencyUSD
      financialUSD.SettlementVat = new MonetaryAmount(vatUSD, currencyUSD)
      financialUSD.LeadReserveAmount = new MonetaryAmount(leadReserveUSD, currencyUSD)
      financialUSD.LeadReserveFees = new MonetaryAmount(leadFeesUSD, currencyUSD)
      claimData.addToFinancials(financialUSD)

      msg.Currency1 = currencyGB
      msg.LeadReserveAmount1 = new MonetaryAmount(newReserveAmtGB, currencyGB)
    }, User.util.UnrestrictedUser)

    var total: float = vatGB + newReserveAmtGB + leadFeesGB
    total += (vatEUR + leadReserveEUR + leadFeesEUR) * eurToGbExchangeRate
    total += (vatUSD + leadReserveUSD + leadFeesUSD) * usdToGbExchangeRate

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_ThreeCurrency_InClaimDataAndClaimResponse() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 400
    var leadReserveGB = 600
    var leadFeesGB = 700

    var newReserveAmtGB = 700

    var currencyEUR = Currency.TC_EUR
    var vatEUR = 300
    var leadReserveEUR = 250
    var leadFeesEUR = 340

    var newVatEUR = 100

    var currencyUSD = Currency.TC_USD
    var vatUSD = 310
    var leadReserveUSD = 2555
    var leadFeesUSD = 345

    var newLeadFeesUSD = 1200


    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      var financialEUR = new ECFMessageClaimDataFinancial_Ext()
      financialEUR.Currency = currencyEUR
      financialEUR.SettlementVat = new MonetaryAmount(vatEUR, currencyEUR)
      financialEUR.LeadReserveAmount = new MonetaryAmount(leadReserveEUR, currencyEUR)
      financialEUR.LeadReserveFees = new MonetaryAmount(leadFeesEUR, currencyEUR)
      claimData.addToFinancials(financialEUR)

      var financialUSD = new ECFMessageClaimDataFinancial_Ext()
      financialUSD.Currency = currencyUSD
      financialUSD.SettlementVat = new MonetaryAmount(vatUSD, currencyUSD)
      financialUSD.LeadReserveAmount = new MonetaryAmount(leadReserveUSD, currencyUSD)
      financialUSD.LeadReserveFees = new MonetaryAmount(leadFeesUSD, currencyUSD)
      claimData.addToFinancials(financialUSD)

      msg.Currency1 = currencyGB
      msg.LeadReserveAmount1 = new MonetaryAmount(newReserveAmtGB, currencyGB)

      msg.Currency2 = currencyEUR
      msg.VATAmount2 = new MonetaryAmount(newVatEUR, currencyEUR)

      msg.Currency3 = currencyUSD
      msg.LeadReserveFees3 = new MonetaryAmount(newLeadFeesUSD, currencyUSD)
    }, User.util.UnrestrictedUser)

    var total: float = vatGB + newReserveAmtGB + leadFeesGB
    total += (newVatEUR + leadReserveEUR + leadFeesEUR) * eurToGbExchangeRate
    total += (vatUSD + leadReserveUSD + newLeadFeesUSD) * usdToGbExchangeRate

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_NoChangeInClaimResponse() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 400
    var leadReserveGB = 600
    var leadFeesGB = 700

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

    }, User.util.UnrestrictedUser)

    var total: float = vatGB + leadReserveGB + leadFeesGB

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_ClaimResponseRemovesAnAmount() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 400
    var leadReserveGB = 600
    var leadFeesGB = 700

    var newLeadFeesGB = 0

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      msg.Currency1 = currencyGB
      msg.LeadReserveFees1 = new MonetaryAmount(newLeadFeesGB, currencyGB)

    }, User.util.UnrestrictedUser)

    var total: float = vatGB + leadReserveGB + newLeadFeesGB

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_ClaimResponseSetsEverythingToZero() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 400
    var leadReserveGB = 600
    var leadFeesGB = 700

    var newVatGB = 0
    var newLeadReserveGB = 0
    var newLeadFeesGB = 0

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      msg.Currency1 = currencyGB
      msg.VATAmount1 = new MonetaryAmount(newVatGB, currencyGB)
      msg.LeadReserveAmount1 = new MonetaryAmount(newLeadReserveGB, currencyGB)
      msg.LeadReserveFees1 = new MonetaryAmount(newLeadFeesGB, currencyGB)

    }, User.util.UnrestrictedUser)

    var total: float = 0

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetMessageSum_EverythingWasZeroInTheClaimData() {
    var currencyGB = Currency.TC_GBP
    var vatGB = 0
    var leadReserveGB = 0
    var leadFeesGB = 0

    var newVatGB = 400
    var newLeadReserveGB = 600
    var newLeadFeesGB = 700

    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claimData = msg.ClaimDataResponded

    msg = wipeResponseFinancials(msg)
    claimData = wipeClaimDataFinancials(claimData)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      claimData = bundle.add(claimData)

      msg.BureauType = ECFBureauType_Ext.TC_LLOYDS
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      var financialGB = new ECFMessageClaimDataFinancial_Ext()
      financialGB.Currency = currencyGB
      financialGB.SettlementVat = new MonetaryAmount(vatGB, currencyGB)
      financialGB.LeadReserveAmount = new MonetaryAmount(leadReserveGB, currencyGB)
      financialGB.LeadReserveFees = new MonetaryAmount(leadFeesGB, currencyGB)
      claimData.addToFinancials(financialGB)

      msg.Currency1 = currencyGB
      msg.VATAmount1 = new MonetaryAmount(newVatGB, currencyGB)
      msg.LeadReserveAmount1 = new MonetaryAmount(newLeadReserveGB, currencyGB)
      msg.LeadReserveFees1 = new MonetaryAmount(newLeadFeesGB, currencyGB)

    }, User.util.UnrestrictedUser)

    var total: float = newVatGB + newLeadReserveGB + newLeadFeesGB

    var expected = new CurrencyAmount(total, currencyGB).stripTrailingZeros()
    var actual = ECFClaimResponseFinancialCalculator.getMessageSum(msg, currencyGB).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  private function wipeResponseFinancials(res: ECFMessageClaimResponseRq_Ext): ECFMessageClaimResponseRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      res = bundle.add(res)
      res.Currency1 = null
      res.Currency2 = null
      res.Currency3 = null

      res.LeadReserveAmount1 = null
      res.LeadReserveAmount2 = null
      res.LeadReserveAmount3 = null

      res.LeadReserveFees1 = null
      res.LeadReserveFees2 = null
      res.LeadReserveFees3 = null

      res.VATAmount1 = null
      res.VATAmount2 = null
      res.VATAmount3 = null

      res.ImportedServicesAmount1 = null
      res.ImportedServicesAmount2 = null
      res.ImportedServicesAmount3 = null
    }, User.util.UnrestrictedUser)

    return res.refresh() as ECFMessageClaimResponseRq_Ext
  }

  private function wipeClaimDataFinancials(cn: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn = bundle.add(cn)
      cn.Financials.each(\f -> {
        f.remove()
      })
    }, User.util.UnrestrictedUser)

    return cn.refresh() as ECFMessageClaimData_Ext
  }

}