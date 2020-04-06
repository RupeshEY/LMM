package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.LMFinancialConstants
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BureauLeadingInsurerOrReinsurer
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ClaimAgreementParty
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolder
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Insured
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Receiver
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass

uses java.math.BigDecimal

class LMMessageJvInsReinsuranceEnhancementTest extends GUnitTestClass {
  var _message : Jv_Ins_Reinsurance

  override function beforeMethod() {
    super.beforeMethod()
    _message = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
  }

  function testUUID() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.UUId, _message.UUID)
  }

  function testUCR() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Claim.BrokerReference, _message.UCR)
  }

  function testUMR() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Contract.BrokerReference, _message.UMR)
  }

  function testOriginTimestamp() {
    var parsedDate = ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY.get().parse(_message.ClaimMovement.CreationDate)
    assertEquals("This element does not match the xml element", parsedDate, _message.OriginTimestamp)
  }

  function testCreationDate() {
    var parsedDate = ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY.get().parse(_message.ClaimMovement.CreationDate)
    assertEquals("This element does not match the xml element", parsedDate, _message.CreationDate)
  }

  function testReceiverRoleCd() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Receiver.Value, _message.ReceiverPartyRoleCd)
  }

  function testSenderRoleCd() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Sender.Value, _message.SenderPartyRoleCd)
  }

  function testReceiverElement() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Reinsurer.Party, _message.ReceiverElement)
  }

  function testSenderElement() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Broker.Party, _message.SenderElement)
  }

  function testLossLocation() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Claim.LossLocation.Location.Description, _message.LossLocation)
  }

  function testLossDescription() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.LossDescription, _message.LossDescription)
  }

  function testLossStartDate() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Claim.LossPeriod.StartDate, _message.LossStartDate)
  }

  function testLossEndDate() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Claim.LossPeriod.EndDate, _message.LossEndDate)
  }

  function testExplanation() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.Explanation, _message.Explanation)
  }

  function testOCR() {
    assertEquals("This element does not match the xml element", _message.ClaimMovement.ClaimEntry.ServiceProviderReference, _message.OCR)
  }


  function testPolicyNumber_ReinsurerReferenceFormatted() {
    final var expectedPolicyNumber = "testPolicy"
    _message.ClaimMovement.Claim.ReinsurerReference = "${expectedPolicyNumber}/123"
    _message.ClaimMovement.Claim.InsurerReference = "shouldntHaveAnImpact/BecauseOfReinsurerReferenceTakingPrecedence"

    assertEquals(expectedPolicyNumber, _message.PolicyNumber)
  }

  function testPolicyNumber_ReinsurerReferenceNotFormatted() {
    final var expectedPolicyNumber = "testPolicy"
    _message.ClaimMovement.Claim.ReinsurerReference = "${expectedPolicyNumber}/123"
    _message.ClaimMovement.Claim.InsurerReference = "shouldntHaveAnImpact/BecauseOfReinsurerReferenceTakingPrecedence"

    assertEquals(expectedPolicyNumber, _message.PolicyNumber)
  }


  function testPolicyNumber_InsurerReferenceFormatted() {
    final var expectedPolicyNumber = "testPolicy"
    _message.ClaimMovement.Claim.ReinsurerReference = null
    _message.ClaimMovement.Claim.InsurerReference = expectedPolicyNumber

    assertEquals(expectedPolicyNumber, _message.PolicyNumber)
  }

  function testPolicyNumber_InsurerReferenceNotFormatted() {
    final var expectedPolicyNumber = "testPolicy"
    _message.ClaimMovement.Claim.ReinsurerReference = " "
    _message.ClaimMovement.Claim.InsurerReference = expectedPolicyNumber

    assertEquals(expectedPolicyNumber, _message.PolicyNumber)
  }

  function testBrokerPartyId() {
    final var expectedBrokerPartyId = "0999"
    _message.ClaimMovement.Broker.Party.Id = {expectedBrokerPartyId}

    assertEquals(expectedBrokerPartyId, _message.BrokerPartyId)
  }

  function testBrokerPartyName() {
    final var expectedBrokerPartyName = "AON"
    _message.ClaimMovement.Broker.Party.Name = expectedBrokerPartyName

    assertEquals(expectedBrokerPartyName, _message.BrokerPartyName)
  }

  function testBrokerPartyAgency() {
    final var expectedBrokerPartyAgency = "lloyds"

    assertEquals(expectedBrokerPartyAgency, _message.BrokerPartyAgency)
  }

  function testBrokerContactName() {
    final var expectedBrokerContactName = "Aegon Targaryen"
    _message.ClaimMovement.Broker.Contact.PersonName = expectedBrokerContactName

    assertEquals(expectedBrokerContactName, _message.BrokerContactName)
  }

  function testBrokerContactPhone() {
    final var expectedBrokerContactPhone = "020 75781200"
    _message.ClaimMovement.Broker.Contact.Telephone = expectedBrokerContactPhone

    assertEquals(expectedBrokerContactPhone, _message.BrokerContactPhone)
  }

  function testBrokerContactDescription() {
    final var expectedBrokerContactDescription = "Testdata"
    _message.ClaimMovement.Broker.Contact?.Description = expectedBrokerContactDescription

    assertEquals(expectedBrokerContactDescription, _message.BrokerContactDescription)
  }

  function testInsurerPartyId() {
    final var expectedInsurerPartyId = "0999"
    _message.ClaimMovement.Insurer.Party.Id = {expectedInsurerPartyId}

    assertEquals(expectedInsurerPartyId, _message.InsurerPartyId)
  }

  function testInsurerPartyName() {
    final var expectedInsurerPartyName = "Syn: 0999 - Line number: 004"
    _message.ClaimMovement.Insurer.Party.Name = expectedInsurerPartyName

    assertEquals(expectedInsurerPartyName, _message.InsurerPartyName)
  }

  function testInsurerPartyAgency() {
    assertNull(_message.InsurerPartyAgency)
  }

  function testReinsurerPartyId() {
    final var expectedReinsurerPartyId = "0999"
    _message.ClaimMovement.Reinsurer.Party.Id = {expectedReinsurerPartyId}

    assertEquals(expectedReinsurerPartyId, _message.ReinsurerPartyId)
  }

  function testReinsurerPartyName() {
    final var expectedReinsurerPartyName = "Syn: 0999 - Line number: 004"
    _message.ClaimMovement.Reinsurer.Party.Name = expectedReinsurerPartyName

    assertEquals(expectedReinsurerPartyName, _message.ReinsurerPartyName)
  }

  function testReinsurerPartyAgency() {
    final var expectedReinsurerPartyAgency = "lloyds"
    assertEquals(expectedReinsurerPartyAgency, _message.ReinsurerPartyAgency)
  }

  function testServiceProviderPartyId() {
    final var expectedServiceProviderPartyId = "0999"
    _message.ClaimMovement.ServiceProvider.Party.Id = {expectedServiceProviderPartyId}

    assertEquals(expectedServiceProviderPartyId, _message.ServiceProviderPartyId)
  }

  function testServiceProviderPartyName() {
    final var expectedServiceProviderPartyName = "XCHANGING INS-SURE SERVICES"
    _message.ClaimMovement.ServiceProvider.Party.Name = expectedServiceProviderPartyName

    assertEquals(expectedServiceProviderPartyName, _message.ServiceProviderPartyName)
  }

  function testServiceProviderPartyAgency() {
    final var expectedServiceProviderPartyAgency = "DUNS_dun_and_bradstreet"

    assertEquals(expectedServiceProviderPartyAgency, _message.ServiceProviderPartyAgency)
  }

  function testServiceProviderContactDescription() {
    final var expectedServiceProviderContactDescription = "AB"
    _message.ClaimMovement.ServiceProvider.Contact.Description = expectedServiceProviderContactDescription

    assertEquals(expectedServiceProviderContactDescription, _message.ServiceProviderContactDescription)
  }

  private function createClaimAgreementParty(): ClaimAgreementParty {
    final var claimAgreementParty = new ClaimAgreementParty()
    claimAgreementParty.Party = new Party()
    return claimAgreementParty
  }

  function testClaimAgreementPartyId() {
    final var expectedClaimAgreementPartyId = "0999"
    final var claimAgreementParty = createClaimAgreementParty()
    claimAgreementParty.Party.Id = {expectedClaimAgreementPartyId}
    _message.ClaimMovement.ClaimAgreementParty = {claimAgreementParty}

    assertEquals(expectedClaimAgreementPartyId, _message.ClaimAgreementPartyId)
  }

  function testClaimAgreementPartyAgency() {
    final var expectedClaimAgreementPartyAgency = "lloyds"

    assertEquals(expectedClaimAgreementPartyAgency, _message.ClaimAgreementPartyAgency)
  }

  function testClaimAgreementPartyParticipant() {
    final var expectedClaimAgreementParticipant = "bureau_leader_lloyds"
    final var claimAgreementParty = createClaimAgreementParty()
    _message.ClaimMovement.ClaimAgreementParty = {claimAgreementParty}
    _message.ClaimMovement.ClaimAgreementParty.first().ParticipantFunction = expectedClaimAgreementParticipant

    assertEquals(expectedClaimAgreementParticipant, _message.ClaimAgreementParticipantFunction)
  }

  function testCoverHolderName() {
    final var expectedCoverHolderName = "John"
    _message.ClaimMovement.CoverHolder = new CoverHolder()
    _message.ClaimMovement.CoverHolder.Party = new Party()
    _message.ClaimMovement.CoverHolder.Party.Name = expectedCoverHolderName

    assertEquals(expectedCoverHolderName, _message.CoverHolderName)
  }

  function testInsuredName() {
    final var expectedInsuredName = "John"
    _message.ClaimMovement.Insured = new Insured()
    _message.ClaimMovement.Insured.Party = new Party()
    _message.ClaimMovement.Insured.Party.Name = expectedInsuredName

    assertEquals(expectedInsuredName, _message.InsuredName)
  }

  function testBureauLeadingInsurerOrReinsurerPartyId() {
    final var expectedBureauLeadingInsurerOrReinsurerPartyId = "1000"
    final var bureauLeadingInsurerOrReinsurer = new BureauLeadingInsurerOrReinsurer()
    bureauLeadingInsurerOrReinsurer.Party = new Party()
    bureauLeadingInsurerOrReinsurer.Party.Id = {expectedBureauLeadingInsurerOrReinsurerPartyId}
    _message.ClaimMovement.BureauLeadingInsurerOrReinsurer = bureauLeadingInsurerOrReinsurer

    assertEquals(expectedBureauLeadingInsurerOrReinsurerPartyId, _message.BureauLeadingInsurerOrReinsurerPartyId)
  }

  function testBureauLeadingInsurerOrReinsurerPartyName() {
    final var expectedBureauLeadingInsurerOrReinsurerPartyName = "Beazley"
    final var bureauLeadingInsurerOrReinsurer = new BureauLeadingInsurerOrReinsurer()
    bureauLeadingInsurerOrReinsurer.Party = new Party()
    bureauLeadingInsurerOrReinsurer.Party.Name = expectedBureauLeadingInsurerOrReinsurerPartyName
    _message.ClaimMovement.BureauLeadingInsurerOrReinsurer = bureauLeadingInsurerOrReinsurer

    assertEquals(expectedBureauLeadingInsurerOrReinsurerPartyName, _message.BureauLeadingInsurerOrReinsurerPartyName)
  }

  function testBureauLeadingInsurerOrReinsurerPartyAgency() {
    final var expectedBureauLeadingInsurerOrReinsurerPartyAgency = "lloyds"

    assertEquals(expectedBureauLeadingInsurerOrReinsurerPartyAgency, _message.BureauLeadingInsurerOrReinsurerPartyAgency)
  }

  function testBureauLeadingInsurerOrReinsurerComments() {
    final var expectedBureauLeadingInsurerOrReinsurersComments = "TestBureauLeadingInsurerOrReinsurerComments"
    _message.ClaimMovement.BureauLeadingInsurerOrReinsurersComments = expectedBureauLeadingInsurerOrReinsurersComments

    assertEquals(expectedBureauLeadingInsurerOrReinsurersComments, _message.BureauLeadingInsurerOrReinsurersComments)
  }

  function testMessageSequence() {
    final var expectedSequence = 700
    _message.ClaimMovement.ClaimEntry.BrokerReference = "T91111/BTest"

    assertEquals(expectedSequence, _message.MessageSequence)
  }

  function testOriginalCurrency() {
    final var expectedCurrency = "USD"
    _message.ClaimMovement.ContractReferenceCurrency.Ccy = expectedCurrency

    assertEquals(expectedCurrency, _message.OriginalCurrency)
  }

  function testSettlementCurrency() {
    final var expectedCurrency = "EUR"
    _message.ClaimMovement.Extension.$Children.firstWhere(\elt -> elt.$QName.LocalPart == "SettlementCurrency").$Text = expectedCurrency

    assertEquals(expectedCurrency, _message.OriginalCurrency)
  }

  function testRiskCode() {
    final var riskCode = "L8"
    _message.ClaimMovement.Extension.$Children.get(1).$Children.get(0).$Children.get(0).$Text = riskCode
    assertEquals(riskCode, _message.RiskCode)
  }

  function testMovementReference() {
    final var expectedMovementReference = "T91111"
    _message.ClaimMovement.ClaimEntry.BrokerReference = "t91111/BTest"
    assertEquals(expectedMovementReference, _message.MovementReference)
  }

  function testMovementReferenceSequence() {
    final var expectedMovementReferenceSequence = "T9"
    _message.ClaimMovement.ClaimEntry.BrokerReference = "T91111/BTest"
    assertEquals(expectedMovementReferenceSequence, _message.MovementReferenceSequence)
  }

  function testSyndicateLineNumber_Insurer() {
    final var insurerName = "Syn: 4711 - Line number: 004"
    final var expectedSyndicateLineNumber = "004"

    _message.ClaimMovement.Receiver = ClaimMovementType_Receiver.Insurer
    _message.ClaimMovement.Insurer.Party.Name = insurerName
    assertEquals(expectedSyndicateLineNumber, _message.SyndicateLineNumber)
  }

  function testSyndicateLineNumber_ReInsurer() {
    final var reinsurerName = "Syn: 4711 - Line number: 004"
    final var expectedSyndicateLineNumber = "004"

    _message.ClaimMovement.Receiver= ClaimMovementType_Receiver.Reinsurer
    _message.ClaimMovement.Reinsurer.Party.Name = reinsurerName
    assertEquals(expectedSyndicateLineNumber, _message.SyndicateLineNumber)
  }

  function testNarrative() {
    final var expectedNarrative = "This is an example narrative text"

    _message.ClaimMovement.Explanation = expectedNarrative
    assertEquals(expectedNarrative, _message.Explanation)
  }

  function testPaidThisTimeIndemnity() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_THIS_TIME_INDEMNITY)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.PaidThisTimeIndemnity)
  }

  function testPaidThisTimeIndemnity_UnknownCurrency() {
    final var expectedCurrency = "DKK"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_THIS_TIME_INDEMNITY)

    assertNull(_message.PaidThisTimeIndemnity)
  }

  function testPaidThisTimeFees() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_THIS_TIME_FEES)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.PaidThisTimeFees)
  }

  function testPaidThisTimeFees_UnknownCurrency() {
    final var expectedCurrency = "DKK"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_THIS_TIME_FEES)

    assertNull(_message.PaidThisTimeFees)
  }

  function testPaidToDateIndemnity() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_TO_DATE_INDEMNITY)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.PaidToDateIndemnity)
  }

  function testPaidToDateIndemnity_UnknownCurrency() {
    final var expectedCurrency = "DKK"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_TO_DATE_INDEMNITY)

    assertNull(_message.PaidToDateIndemnity)
  }

  function testPaidToDateFees() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_TO_DATE_FEES)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.PaidToDateFees)
  }

  function testPaidToDateFees_UnknownCurrency() {
    final var expectedCurrency = "DKK"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.PAID_TO_DATE_FEES)

    assertNull(_message.PaidToDateFees)
  }

  function testOutstandingIndemnity() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.OUTSTANDING_AMOUNT_INDEMNITY)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.OutstandingIndemnity)
  }

  function testOutstandingFees() {
    final var expectedCurrency = "EUR"
    final var expectedAmount = 1000bd

    setFinancialAmountForType(expectedAmount, expectedCurrency, LMFinancialConstants.OUTSTANDING_AMOUNT_FEES)

    assertEquals(new MonetaryAmount(expectedAmount, Currency.get(expectedCurrency)), _message.OutstandingFees)
  }

  function testReceiverShare_Insurer() {
    final var expectedShare = 99.123bd

    _message.ClaimMovement.Receiver = ClaimMovementType_Receiver.Insurer
    _message.ClaimMovement.ContractSection.InsurerSharePercentage.Rate = expectedShare
    _message.ClaimMovement.ContractSection.ReinsurerSharePercentage.Rate = expectedShare * 2

    assertEquals(expectedShare, _message.ReceiverShare)
  }

  function testReceiverShare_Reinsurer() {
    final var expectedShare = 99.123bd

    _message.ClaimMovement.Receiver = ClaimMovementType_Receiver.Reinsurer
    _message.ClaimMovement.ContractSection.ReinsurerSharePercentage.Rate = expectedShare
    _message.ClaimMovement.ContractSection.InsurerSharePercentage.Rate = expectedShare * 2

    assertEquals(expectedShare, _message.ReceiverShare)
  }

  private function setFinancialAmountForType(amount: BigDecimal, currency: String, type: String) {
    _message.ClaimMovement.ClaimMovementAmtItem.firstWhere(\elt -> elt.Type == type)?.Amt = {amount}
    _message.ClaimMovement.ClaimMovementAmtItem.firstWhere(\elt -> elt.Type == type)?.Amt_elem.first().Ccy = currency
  }
}