package gw.acc.iplm.testutils

uses gw.api.databuilder.IncidentBuilder
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.pl.persistence.core.Bundle
uses gw.transaction.Transaction

uses java.math.RoundingMode


class ClaimBuilderHelper {

  private static var BASE_DATE = java.util.Date.Now
  private static var CLAIM_NUM = 10000000000
  private static var POLICY_NUM = 2000000000
  private static var UCR_NUM = 1000
  private static var UMR_NUM = 1000
  private static var EXPOSURE_PUBLICID_NUM = 1000000

  public static function createClaim() : Claim {
    return createClaim(false)
  }

  public static function createClaim(withECFProperties : boolean) : Claim {
    var newClaim : Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = createDefaultClaimWithLossDate(bundle, java.util.Date.Now.addMonths(-1))
      if (withECFProperties) {
        newClaim.UCR_Ext = getNextUCR()
        newClaim.UMR_Ext = getNextUMR()
        newClaim.ECFLastUpdateTime = Date.Now
      }
    }, "su")

    return newClaim
  }

  public static function createClaimWithUCR(ucr : String) : Claim {
    var newClaim : Claim
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = createDefaultClaimWithLossDate(bundle, java.util.Date.Now.addMonths(-1))
      newClaim.UCR_Ext = ucr
      newClaim.ECFLastUpdateTime = Date.Now
    }, "su")

    return newClaim
  }

  /**
   * Creates a claim to be used on tests.
   *
   * @param bundle           Bundle to commit the transaction
   * @param lossDateBaseDate Date to be used for the LossDate
   * @return Created Claim entity
   */
  public static function createDefaultClaimWithLossDate(bundle : Bundle, lossDateBaseDate : Date) : Claim {
    var claim = new gw.api.databuilder.ClaimBuilder()
        .withIncidentReport(false)
        .withWeather(TC_CL)
        .withAssignmentStatus(TC_ASSIGNED)
        .withLossDate(lossDateBaseDate)
        .withCurrency(gw.api.util.CurrencyUtil.getDefaultCurrency())
        .withStrategy(TC_AUTO_FAST)
        .withAssignmentDate(BASE_DATE.addDays(0))
        .withFlagged(TC_NEVERFLAGGED)
        .withLossLocation(new gw.api.databuilder.AddressBuilder()
            .withAddressLine1("345 Fir Lane")
            .withCountry(TC_US)
            .withPostalCode("91352")
            .withState(State.TC_CA)
            .withAddressType(TC_HOME)
            .withCity("La Canada"))
        .withLossCause(TC_VEHCOLLISION)
        .withClaimNumber(getNextClaimNum()) //"235-53-425888"
        .withMainContactType(TC_SELF)
        .withReportedByType(TC_SELF)
        .withLossType(TC_AUTO)
        .withValidationLevel(TC_NEWLOSS)
        .withPolicy(createPolicyBuilder(bundle, getNextPolicyNum())) //"4775949863-01"
        .withFault(80)
        .withJurisdictionState(TC_CA)
        .withSegment(TC_AUTO_LOW)
        .withReportedDate(BASE_DATE.addDays(-115))
        .withCoverageInQuestion(false)
        .withLOBCode(TC_PERSONALAUTOLINE)
        .withDescription("Car plowed into a fire hydrant")
        .withContactInRole(createPersonContact(bundle), TC_MAINCONTACT)
        .withContactInRole(createPersonContact(bundle), TC_REPORTER)
        .withPermissionRequired(ClaimSecurityType.TC_UNSECUREDCLAIM)
        .create(bundle)

    return claim
  }

  public static function createPolicyBuilder(bundle : Bundle, policyNumber : String) : gw.api.databuilder.PolicyBuilder {

    var policy = new gw.api.databuilder.PolicyBuilder()
        .withExpirationDate(BASE_DATE.addDays(274))
        .withUnderwritingCo(TC_PARENT)
        .withVerified(true)
        .withOrigEffectiveDate(BASE_DATE.addDays(-3266))
        .withCurrency(gw.api.util.CurrencyUtil.getDefaultCurrency())
        .withUnderwritingGroup(TC_ACME_AUTO)
        .withEffectiveDate(BASE_DATE.addDays(-90))
        .withStatus(TC_INFORCE)
        .withPolicyNumber(policyNumber)
        .withTotalProperties(0)
        .withPolicyType(TC_PERSONALAUTO)
        .withTotalVehicles(2)
        .withRiskUnit(new gw.api.databuilder.VehicleRUBuilder()
            .withRUNumber(1)
            .withVehicle(new gw.api.databuilder.VehicleBuilder()
                .withYear(1997)
                .withLicensePlate("1HGJ465")
                .withMake("Saturn")
                .withState(Jurisdiction.TC_CA)
                .withModel("SL")
                .withVin("1GV234TV347463377")))
        .withRiskUnit(new gw.api.databuilder.VehicleRUBuilder()
            .withRUNumber(2)
            .withVehicle(new gw.api.databuilder.VehicleBuilder()
                .withYear(1996)
                .withLicensePlate("2GDH967")
                .withMake("Toyota")
                .withState(Jurisdiction.TC_CA)
                .withModel("Corolla")
                .withVin("3DGF78575GD892577")))
        .withContactInRole(createPersonContact(bundle), TC_INSURED)

    return policy
  }


  public static function createPersonContact(bundle : Bundle) : Person {

    var contactDemoSample3038 = new gw.api.databuilder.PersonBuilder()
        .withLastName("Kinman")
        .withFirstName("Bill")
        .withPrimaryPhone(TC_WORK)
        .withPrimaryAddressSetEarly(new gw.api.databuilder.AddressBuilder()
            .withAddressLine1("0000 Bridgepointe Parkway")
            .withCountry(TC_US)
            .withPostalCode("94404")
            .withState(State.TC_CA)
            .withAddressType(TC_HOME)
            .withCity("San Mateo"))
        .withWorkPhone("818-446-1206")
        .withTaxID("123-45-6789")
        .create(bundle)

    return contactDemoSample3038

  }

  public static function getNextClaimNum() : String {
    CLAIM_NUM += 1
    var claimNumVal = String.valueOf(CLAIM_NUM)
    claimNumVal = claimNumVal.substring(0, 3) + "-" + claimNumVal.substring(3, 5) + "-" + claimNumVal.substring(5)
    return claimNumVal
  }

  public static function getNextPolicyNum() : String {
    POLICY_NUM += 1
    var policyNumVal = String.valueOf(POLICY_NUM) + "01"
    return policyNumVal
  }

  public static function getNextUCR() : String {
    UCR_NUM += 1
    var ucr = "B" + String.valueOf(UCR_NUM) + "OCT28SP02FOA"
    return ucr
  }

  public static function getNextUMR() : String {
    UMR_NUM += 1
    var umr = "B" + String.valueOf(UMR_NUM) + "OCT28SP02FOA"
    return umr
  }

  public static function getNextExposurePublicID() : String {
    EXPOSURE_PUBLICID_NUM += 1
    var exposureIdNum = "ECF" + String.valueOf(EXPOSURE_PUBLICID_NUM)
    return exposureIdNum
  }

  public static function createClaim(bundle : Bundle, ucr : String, publicId : String) : Claim {

    var claim : Claim = null

    var policy = ClaimBuilderHelper.createPolicyBuilder(bundle, "4775949863-01").create()
    claim = new gw.api.databuilder.ClaimBuilder()
        .withPublicID(publicId)
        .withPolicy(policy)
        .withLossCause(TC_WATERDAMAGE)
        .withCurrency(Currency.TC_USD)
        .create(bundle)
    claim.UCR_Ext = ucr

    policy = bundle.add(policy)
    claim = bundle.add(claim)

    return claim
  }

  public static function createExposure(bundle : Bundle, claim : Claim, expPublicId : String) : Exposure {

    return createExposure(bundle, claim, expPublicId, null, null, true)
  }

  /**
   * @param bundle      to create exposure with
   * @param claim       to create exposure on
   * @param expPublicId id of exposure
   * @param covType     Coverage Type of exposure
   * @param policy      take the exposure location from policy or not?
   * @return the Exposure
   */
  public static function createExposure(bundle : Bundle, claim : Claim, expPublicId : String, covType : CoverageType, exType : ExposureType, policy : boolean) : Exposure {

    var policyLocation1 = new gw.api.databuilder.PolicyLocationBuilder()
        .withAddress(new gw.api.databuilder.AddressBuilder()
            .withAddressLine1("2103 Veterans Pkwy.")
            .withCountry(TC_US)
            .withPostalCode("61704")
            .withState(State.TC_IL)
            .withAddressType(TC_BUSINESS)
            .withCity("Bloomington"))
        .create(bundle)

    var exposure1 = new gw.api.databuilder.ExposureBuilder()
        .withOtherCoverage(false)
        .withLossParty(TC_INSURED)
        .withExposureType(exType?:TC_PROPERTYDAMAGE)
        .withAssignmentStatus(TC_ASSIGNED)
        .withStrategy(TC_PROP_FAST)
        .withProgress(TC_INVESTIGATION)
        .withJurisdictionState(TC_IL)
        .withPrimaryCoverage(covType?:TC_CPBLDGCOV)
        .withSegment(TC_PROP_LOW)
        .withClaimantType(TC_INSURED)
        .withPublicID(expPublicId)
        .withState(TC_OPEN)
        .onClaim(claim)
        .withCoverageSubType(TC_CPBLDGCOV)

    if (policy == true) {
      exposure1.withIncident(new gw.api.databuilder.FixedPropertyIncidentBuilder()
          .withSeverity(TC_MINOR)
          .withProperty(policyLocation1)
          .withDescription("One large glass window broken by flying debris during storm"))
    } else {
      exposure1.withIncident(new IncidentBuilder()
          .withDescription("Some other incident"))
    }


    return exposure1.create(bundle)
  }

  public static function createReserveLine(bundle : Bundle, claim : Claim, exposure : Exposure, costType : CostType, costCategory : CostCategory, amount : CurrencyAmount) {
    var amtInDefaultCur = amount.convert(claim.Currency, RoundingMode.UP)

    var transactionSet1 = new gw.api.databuilder.ReserveSetBuilder()
        .withApprovalStatus(TC_APPROVED)
        .onClaim(claim)
        .create(bundle)

    var reserveLineBuilder = new gw.api.databuilder.ReserveLineBuilder()
        .withExposure(exposure)
        .withClaim(claim)


    if (costType != null) {
      reserveLineBuilder = reserveLineBuilder.withCostType(costType)
    }

    if (costCategory != null) {
      reserveLineBuilder = reserveLineBuilder.withCostCategory(costCategory)
    }

    var reserveLine1 = reserveLineBuilder.create(bundle)

    var reserveBuilder = new gw.api.databuilder.ReserveBuilder()
        .withReserveLine(reserveLine1)
        .onExposure(exposure)
        .onTransactionSet(transactionSet1)
        .withCurrency(amount.Currency)
        .withStatus(TC_SUBMITTED)
        .onClaim(claim)
        .withTransToClaimExchangeRate(CurrencyUtil.isSingleCurrencyMode() ? null :
            gw.api.database.Query.make(entity.ExchangeRate).
                compare("PriceCurrency", Equals, amount.Currency).
                compare("BaseCurrency", Equals, claim.Currency).select().FirstResult)
        .withLineItem(new gw.api.databuilder.TransactionLineItemBuilder()
            .withComments("Auto inspection fee")
            .withClaimForExAmount(amtInDefaultCur)
            .withReportingAmount(amtInDefaultCur)
            .withClaimAmount(amtInDefaultCur)
            .withReservingAmount(amount)
            .withTransactionAmount(amount)
            .withLineCategory(TC_OTHER)
            .withReportingForExAmount(amtInDefaultCur))

    if (costType != null) {
      reserveBuilder = reserveBuilder.withCostType(costType)
    }

    if (costCategory != null) {
      reserveBuilder = reserveBuilder.withCostCategory(costCategory)
    }

    reserveBuilder.create(bundle)
  }

  public static function createClaimWithAClaimNotify() : Claim {
    return createClaimWithAClaimNotifyMessage(getNextUCR())
  }

  public static function createClaimWithAClaimNotifyMessage(newUCR : String) : Claim {
    var umr = getNextPolicyNum()
    var tr = String.valueOf(System.currentTimeMillis())

    var newClaim : Claim
    var cnRqEntity : ECFMessageClaimNotifyRq_Ext

    var cnRq = ECFMessageUtil.createNewClaimNotifyRq()
    cnRq.UMR = umr
    cnRq.UCR = newUCR
    cnRq.TR = tr

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnRqEntity = ECFMessageEntityUtil.createClaimNotifyRq(cnRq)
      newClaim = bundle.add(ClaimBuilderHelper.createClaim())
      newClaim.UCR_Ext = newUCR
      newClaim.addToLMMessages(cnRqEntity)
    }, "su")

    return newClaim
  }

  public static function createClaimWithAClaimRetrieve() : Claim {
    return createClaimWithAClaimRetrieveMessage(getNextUCR())
  }

  public static function createClaimWithAClaimRetrieveMessage(newUCR : String) : Claim {
    var umr = getNextPolicyNum()
    var tr = String.valueOf(System.currentTimeMillis())

    var newClaim : Claim
    var claimRetrieveRsEntity : ECFMessageClaimRetrieveRs_Ext

    var claimRetrieveRs = ECFMessageUtil.createNewClaimRetrieveRs()
    claimRetrieveRs.UMR = umr
    claimRetrieveRs.UCR = newUCR
    claimRetrieveRs.TR = tr

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimRetrieveRsEntity = ECFMessageEntityUtil.createClaimRetrieveRs(claimRetrieveRs)
      newClaim = bundle.add(ClaimBuilderHelper.createClaim())
      newClaim.UCR_Ext = newUCR
      newClaim.addToLMMessages(claimRetrieveRsEntity)
    }, "su")

    return newClaim
  }

  public static function createLCOCatastrophe(code : String) : Catastrophe {
    var cat : Catastrophe = null
    var date = Date.getCurrentDate().addYears(-2)

    Transaction.runWithNewBundle(\bundle -> {
      cat = bundle.add(new Catastrophe())
      cat.LCOCode = code
      cat.Name = "LCO-" + code
      cat.Description = "LCO-" + code
      cat.Active = true
      cat.Type = CatastropheType.TC_ISO
      cat.CatastropheNumber = "087930"
      cat.CatastropheValidFrom = date
      cat.CatastropheValidTo = date.addDays(4)
    }, User.util.UnrestrictedUser)
    return cat
  }

  public static function createPCSCatastrophe(code : String) : Catastrophe {
    var cat : Catastrophe = null
    var date = Date.getCurrentDate().addYears(-2)

    Transaction.runWithNewBundle(\bundle -> {
      cat = bundle.add(new Catastrophe())
      cat.PCSCatastropheNumber = code
      cat.Name = "PCS-" + code
      cat.Description = "PCS-" + code
      cat.Active = true
      cat.Type = CatastropheType.TC_ISO
      cat.CatastropheNumber = "085731"
      cat.CatastropheValidFrom = date
      cat.CatastropheValidTo = date.addDays(4)
    }, User.util.UnrestrictedUser)
    return cat
  }

}