package gw.acc.iplm.services.financial

uses gw.acc.iplm.exchangerate.ECFExchangeRateSetPlugin
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.api.databuilder.AuthorityLimitBuilder
uses gw.api.databuilder.AuthorityLimitProfileBuilder
uses gw.api.financials.CurrencyAmount
uses gw.testharness.v3.GUnitTestClass

class FinancialAuthorisationServiceTest extends GUnitTestClass {

  private static var _service : FinancialAuthorisationService
  private static var _exposureId = 0

  override function beforeClass() {
    super.beforeClass()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      new ECFExchangeRateSetPlugin().createExchangeRateSet()
    }, User.util.UnrestrictedUser)
  }

  override function beforeMethod() {
    _service = new FinancialAuthorisationService()
  }

  function testIsMessageAuthorised() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(200000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(100000, claim.Currency), null)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_False() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(200000, claim.Currency), null)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_NoClaimReserves_False() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_NoClaimReserves_True() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_ShareIs0() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      var claimData = bundle.add(msg.ClaimDataResponded)
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 0bd

      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_ShareIs10() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      var claimData = bundle.add(msg.ClaimDataResponded)
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 10bd

      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_ShareIs100() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      var claimData = bundle.add(msg.ClaimDataResponded)
      claimData.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimData.ReceiverPartyId).InsurerSharePercentage = 100bd

      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }


  function testIsMessageAuthorised_ClaimCostType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_CLAIMCOST)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(200000, claim.Currency), CostType.TC_CLAIMCOST)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_ClaimCostType_LMCovType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_CLAIMCOST)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      var iplmExposure = ClaimBuilderHelper.createExposure(bundle, claim, getNextExposureId(), CoverageType.TC_IPLM_EXT, ExposureType.TC_IPLM_EXT, false)
      ClaimBuilderHelper.createReserveLine(bundle, claim, iplmExposure, CostType.TC_CLAIMCOST, null, new CurrencyAmount(200000, claim.Currency))
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_AOExpenseCostType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_AOEXPENSE)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(200000, claim.Currency), CostType.TC_AOEXPENSE)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_AOExpenseCostType_LMCovType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_AOEXPENSE)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      //add a London Market exposure
      var iplmExposure = ClaimBuilderHelper.createExposure(bundle, claim, getNextExposureId(), CoverageType.TC_IPLM_EXT, ExposureType.TC_IPLM_EXT, false)
      ClaimBuilderHelper.createReserveLine(bundle, claim, iplmExposure, CostType.TC_AOEXPENSE, null, new CurrencyAmount(200000, claim.Currency))
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_NoCostType_LMCovType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_AOEXPENSE)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      //add a London Market exposure
      var iplmExposure = ClaimBuilderHelper.createExposure(bundle, claim, getNextExposureId(), CoverageType.TC_IPLM_EXT, ExposureType.TC_IPLM_EXT, false)
      ClaimBuilderHelper.createReserveLine(bundle, claim, iplmExposure, null, null, new CurrencyAmount(200000, claim.Currency))
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_ClaimCostType_MixedReserves() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(240000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_CLAIMCOST)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(100000, claim.Currency), CostType.TC_CLAIMCOST)
      addReserveToClaim(claim, new CurrencyAmount(250000, claim.Currency), null)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_MixedCostTypes() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limitC = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(240000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_CLAIMCOST)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var limitAO = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(240000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_AOEXPENSE)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limitC)
          .withLimit(limitAO)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(120000, claim.Currency), CostType.TC_CLAIMCOST)
      addReserveToClaim(claim, new CurrencyAmount(130000, claim.Currency), CostType.TC_AOEXPENSE)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_ClaimCostType_Mixedlimits() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var ecfLimit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCostType(CostType.TC_CLAIMCOST)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withLimit(ecfLimit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(5000, claim.Currency), CostType.TC_CLAIMCOST)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_ClaimCostType_MixedExposureCoverages() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .withCoverage(CoverageType.TC_IPLM_EXT)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)

      //add a London Market exposure with 1000
      var iplmExposure = ClaimBuilderHelper.createExposure(bundle, claim, getNextExposureId(), CoverageType.TC_IPLM_EXT, ExposureType.TC_IPLM_EXT, false)
      ClaimBuilderHelper.createReserveLine(bundle, claim, iplmExposure, null, null, new CurrencyAmount(1000, claim.Currency))

      //add some other exposure with 1000000 - Should be ignored
      addReserveToClaim(claim, new CurrencyAmount(110000, claim.Currency), CostType.TC_CLAIMCOST)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertTrue(result)
    })
  }

  function testIsMessageAuthorised_MixedReserveCurrencies() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(claim.Currency)
          .create()

      user.changeAuthorityProfile(authProfile)
      addReserveToClaim(claim, new CurrencyAmount(5000, claim.Currency), CostType.TC_CLAIMCOST)
      addReserveToClaim(claim, new CurrencyAmount(5000, Currency.TC_EUR), CostType.TC_CLAIMCOST)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testIsMessageAuthorised_NoReserves_AuthorityLimitIsNotDefaultCurrency() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, Currency.TC_EUR))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(Currency.TC_EUR)
          .create()

      user.changeAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var result = _service.isMessageAuthorised(msg)
      assertFalse(result)
    })
  }

  function testProcessLimit_DoesNotExceed() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var sum = new CurrencyAmount(1000, Currency.TC_GBP)
      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1100, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()
      var result = _service.exceedsLimit(sum, limit)
      assertFalse(result)
    })
  }

  function testProcessLimit_Exceeds() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var sum = new CurrencyAmount(1100, Currency.TC_GBP)
      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1000, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()
      var result = _service.exceedsLimit(sum, limit)
      assertTrue(result)
    })
  }

  function testGetClaimSum_OneReserve_CTR() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()
    var amt = new CurrencyAmount(50000, claim.Currency)
    var limit : AuthorityLimit

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim

      limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      addReserveToClaim(claim, amt, null)
    }, User.util.UnrestrictedUser)

    var expected = amt.stripTrailingZeros()
    var actual = _service.getClaimSum(msg.Claim, limit).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetClaimSum_MultipleReserve_CTR() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()
    var amt1 = new CurrencyAmount(20000, claim.Currency)
    var amt2 = new CurrencyAmount(30000, claim.Currency)
    var limit : AuthorityLimit

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim

      limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      addReserveToClaim(claim, amt1, null)
      addReserveToClaim(claim, amt2, null)
    }, User.util.UnrestrictedUser)

    var expected = amt1.add(amt2).stripTrailingZeros()
    var actual = _service.getClaimSum(msg.Claim, limit).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetClaimSum_OneReserve_CAR() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()
    var amt = new CurrencyAmount(50000, claim.Currency)
    var limit : AuthorityLimit

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim

      limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CAR)
          .onNewProfile()
          .create()

      addReserveToClaim(claim, amt, null)
    }, User.util.UnrestrictedUser)

    var expected = amt.stripTrailingZeros()
    var actual = _service.getClaimSum(msg.Claim, limit).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetClaimSum_MultipleReserve_CAR() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()
    var amt1 = new CurrencyAmount(20000, claim.Currency)
    var amt2 = new CurrencyAmount(30000, claim.Currency)
    var limit : AuthorityLimit

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim

      limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_CAR)
          .onNewProfile()
          .create()

      addReserveToClaim(claim, amt1, null)
      addReserveToClaim(claim, amt2, null)
    }, User.util.UnrestrictedUser)

    var expected = amt1.add(amt2).stripTrailingZeros()
    var actual = _service.getClaimSum(msg.Claim, limit).stripTrailingZeros()

    assertEquals(expected, actual)
  }

  function testGetClaimSum_NoCalculatorForAuthorityType() {
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()
    var limit : AuthorityLimit

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim

      limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(100000, claim.Currency))
          .withLimitType(AuthorityLimitType.TC_RCS)
          .onNewProfile()
          .create()
    }, User.util.UnrestrictedUser)

    var actual = _service.getClaimSum(msg.Claim, limit)

    assertEquals(0bd, actual.Amount)
  }

  function testApprovalIssueAddedToMessage() {
    var issue = "The total reserve for the claim exceeds £1.00."
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(Currency.TC_GBP)
          .create()

      user.changeAuthorityProfile(authProfile)

      addReserveToClaim(claim, new CurrencyAmount(2, claim.Currency), null)
    }, User.util.UnrestrictedUser)


    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _service.isMessageAuthorised(msg)
    })

    msg = msg.refresh() as ECFMessageClaimResponseRq_Ext
    assertEquals(issue, msg.ApprovalIssue)
  }

  function testApprovalIssueAddedToMessage_MultipleLimits() {
    var issue = "The total reserve for the claim exceeds £1.00."
    var issue2 = "The available reserves for all exposures on a claim exceeds £2.00."
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limitCtr = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var limitCar = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(2, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CAR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limitCtr)
          .withLimit(limitCar)
          .withCurrency(Currency.TC_GBP)
          .create()

      user.changeAuthorityProfile(authProfile)

      addReserveToClaim(claim, new CurrencyAmount(3, claim.Currency), null)
    }, User.util.UnrestrictedUser)


    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _service.isMessageAuthorised(msg)
    })

    msg = msg.refresh() as ECFMessageClaimResponseRq_Ext
    assertTrue(msg.ApprovalIssue.contains(issue))
    assertTrue(msg.ApprovalIssue.contains(issue2))
  }

  function testApprovalIssueAddedToMessage_IgnoreOtherLimits() {
    var issue = "The total reserve for the claim exceeds £1.00."
    var issue2 = "The total amount of payments to date for the claim exceeds £2.00"
    var msg = ECFMessageEntityUtil.createClaimResponseRq()
    var claim = ClaimBuilderHelper.createClaim()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      msg = bundle.add(msg)
      msg.Claim = claim
      var user = bundle.add(User.util.UnrestrictedUser)

      var limitCtr = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(1, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var limitCar = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(2, Currency.TC_GBP))
          .withLimitType(AuthorityLimitType.TC_CPTD)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limitCtr)
          .withLimit(limitCar)
          .withCurrency(Currency.TC_GBP)
          .create()

      user.changeAuthorityProfile(authProfile)

      addReserveToClaim(claim, new CurrencyAmount(3, claim.Currency), null)
    }, User.util.UnrestrictedUser)


    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _service.isMessageAuthorised(msg)
    })

    msg = msg.refresh() as ECFMessageClaimResponseRq_Ext
    assertEquals(issue, msg.ApprovalIssue)
  }

  private function addReserveToClaim(claim : Claim, amt : CurrencyAmount, costType : CostType) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var exposure = claim.Exposures.first()?:ClaimBuilderHelper.createExposure(bundle, claim, getNextExposureId())
      ClaimBuilderHelper.createReserveLine(bundle, claim, exposure, costType, null, amt)
    }, User.util.UnrestrictedUser)
  }

  private function getNextExposureId() : String {
    _exposureId++
    return Integer.toString(_exposureId)
  }
}