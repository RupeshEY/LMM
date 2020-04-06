package gw.acc.iplm.xmlmapper.writeback.lirma

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.api.util.ConfigAccess
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class LirmaLeadClaimResponseRqMapperTest extends GUnitTestClass {

  private static var lirmaLeadSample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lirma-Lead-SAMPLE.xml")
  private static var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(lirmaLeadSample)
    _claimResponseRqEntity = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
  }

  public function testSender() {
    var claimResponseRq = callMapper()
    assertEquals("insurer", claimResponseRq.Sender)
  }

  public function testReceiver() {
    var claimResponseRq = callMapper()
    assertEquals("serviceprovider", claimResponseRq.Receiver)
  }

  public function testUUID() {
    var uuid = ECFMessageUtil.getNewMsgUUID()
    _claimResponseRqEntity.UUID = uuid
    var claimResponseRq = callMapper()
    assertEquals(uuid, claimResponseRq.UUId)
  }

  public function testCreationDate() {
    var claimResponseRq = callMapper()
    var formattedDate = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_claimResponseRqEntity.OriginTimeStamp).toString()
    assertEquals(formattedDate, claimResponseRq.CreationDate)
  }

  public function testInsurerTransactionReference() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.InsurerTransactionReference, claimResponseRq.InsurerTransactionReference)
  }

  public function testAsOfDate() {
    var claimResponseRq = callMapper()
    var cal = Calendar.getInstance()
    cal.setTime(_claimResponseRqEntity.AsOfDate)
    var expectedAsOfDate = new XmlDateTime(cal, true)
    assertEquals(expectedAsOfDate, claimResponseRq.AsOfDate)
  }

  public function testReferredUUId() {
    var uuid = ECFMessageUtil.getNewMsgUUID()
    _claimResponseRqEntity.ReferredUUID = uuid
    var claimResponseRq = callMapper()
    assertEquals(uuid, claimResponseRq.ReferredUUId)
  }

  public function testInsurerDetails() {
    var sampleInsurerId = "urn:lirma:C1104"
    var sampleInsurerAgency = "lirma"
    var sampleInsurerName = "CHUBB CUSTOM"

    _claimResponseRqEntity.ReceiverPartyId = sampleInsurerId
    _claimResponseRqEntity.ReceiverPartyAgency = sampleInsurerAgency
    _claimResponseRqEntity.ReceiverPartyName = sampleInsurerName

    var claimResponseRq = callMapper()

    assertEquals(sampleInsurerId, claimResponseRq.Insurer.Party.FirstId)
    assertEquals(sampleInsurerAgency, claimResponseRq.Insurer.Party.FirstAgency)
    assertEquals(sampleInsurerName, claimResponseRq.Insurer.Party.Name)
  }

  public function testInsurerContact() {
    var classUserId = "CHUB01"
    var accountCode = "CHUB"
    var samplePersonName = "Super User"
    var sampleTelephone = "201-555-0123"

    var claimResponseRq = callMapper()

    assertEquals(classUserId, claimResponseRq.Insurer.Contact.ClassUserId)
    assertEquals(accountCode, claimResponseRq.Insurer.Contact.AccountCode)
    assertEquals(samplePersonName, claimResponseRq.Insurer.Contact.PersonName)
    assertEquals(sampleTelephone, claimResponseRq.Insurer.Contact.Telephone)
  }

  public function testServiceProvider() {
    var sampleServiceProviderId = "urn:duns:236196817"
    var sampleServiceProviderAgency = "DUNS_dun_and_bradstreet"
    var sampleServiceProviderName = "Xchanging"

    var claimResponseRq = callMapper()

    assertEquals(sampleServiceProviderId, claimResponseRq.ServiceProvider.Party.FirstId)
    assertEquals(sampleServiceProviderAgency, claimResponseRq.ServiceProvider.Party.FirstAgency)
    assertEquals(sampleServiceProviderName, claimResponseRq.ServiceProvider.Party.Name)
  }

  public function testUMR() {
    var umr = "TESTUMR"
    _claimResponseRqEntity.UMR = umr
    var claimResponseRq = callMapper()
    assertEquals(umr, claimResponseRq.Contract.BrokerReference)
  }

  public function testTR() {
    var tr = "TESTTR"
    _claimResponseRqEntity.TR = tr
    var claimResponseRq = callMapper()
    assertEquals(tr, claimResponseRq.ClaimEntry.BrokerReference)
  }

  public function testUCR() {
    var ucr = "TESTUCR"
    _claimResponseRqEntity.UCR = ucr
    var claimResponseRq = callMapper()
    assertEquals(ucr, claimResponseRq.Claim.BrokerReference)
  }

  public function testClaimDetails() {
    var originalClaimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    _claimResponseRqEntity.ReferredUUID = originalClaimNotify.UUID
    var claimResponseRq = callMapper()
    assertEquals(originalClaimNotify.ClaimType.Code, claimResponseRq.Claim.ClaimType)
  }

  public function testClaimResponseElement() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.ParticipantFunction.DisplayName, claimResponseRq.ClaimResponse.ParticipantFunction)
    assertEquals(_claimResponseRqEntity.ClaimLineNumber, claimResponseRq.ClaimResponse.ClaimLineNo.longValue())
  }

  public function testClaimType() {
    var sampleClaimType = "000"
    var claimResponseRq = callMapper()
    assertEquals(sampleClaimType, claimResponseRq.Claim.ClaimType)
  }

  public function testSimultaneousRIPIndicator() {
    var sampleIndicator = "N"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator)
  }

  public function testMinorPrecautionaryIndicator() {
    var sampleIndicator = "Y"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.MinorPrecautionaryIndicator)
  }

  public function testChaseUpIndicator() {
    var sampleIndicator = "N"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.ChaseUpIndicator.Indicator)
  }

  public function testChaseUpIndicatorWithInterval() {
    var indicator = "Y"
    var interval = 24

    _claimResponseRqEntity.ChaseUpIndicator = indicator
    _claimResponseRqEntity.ChaseUpIndicatorInterval = interval

    var claimResponseRq = callMapper()
    assertEquals(indicator, claimResponseRq.Claim.Indicators.ChaseUpIndicator.Indicator)
    assertEquals(interval, claimResponseRq.Claim.Indicators.ChaseUpIndicator.Interval.intValue())
  }

  public function testContractualConditionsMayApplyIndicator() {
    var sampleIndicator = "Y"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.ContractualConditionsMayApplyIndicator.Code)
  }

  public function testAllUnderwritersToSeeFileIndicator() {
    var sampleIndicator = "N"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.AllUnderwritersToSeeFileIndicator)
  }

  public function testResponseCode() {
    var sampleRresponseCode = "CIR"
    var claimResponseRq = callMapper()
    assertEquals(sampleRresponseCode, claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LirmaResponse)
  }

  public function testLeadComments() {
    var sampleLeadComment = "lead comment test"
    var claimResponseRq = callMapper()
    assertEquals(1, claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LeadComments.Count)
    assertEquals(sampleLeadComment, claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LeadComments.first().CommentDetails)
  }

  public function testLeadComments_CommentsLimit() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.PublicComments = {}

      var comments = generateListOfComments(_claimResponseRqEntity.PublicCommentsLimit)

      for (comment in comments) {
        var newCommentEntity = new ECFMessagePublicComment_Ext()
        newCommentEntity.Detail = comment
        newCommentEntity.ECFMessage = _claimResponseRqEntity
        _claimResponseRqEntity.addToPublicComments(newCommentEntity)
      }

    }, "su")

    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, _claimResponseRqEntity.PublicComments.Count)
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, claimResponseRq.ClaimResponse.LeadResponse.LirmaLead.LeadComments.Count)
  }

  public function testLeadContact() {
    var sampleLeadName = "Lirma Lead"
    var sampleLeadPhone = "000-123-4567"
    var claimResponseRq = callMapper()
    assertEquals(sampleLeadName, claimResponseRq.ClaimResponse.LeadResponse.LeadContact.PersonName)
    assertEquals(sampleLeadPhone, claimResponseRq.ClaimResponse.LeadResponse.LeadContact.Telephone)
  }

  public function testClaimCategory() {
    var sampleClaimCategoryCode = "C"
    var claimResponseRq = callMapper()
    assertEquals(sampleClaimCategoryCode, claimResponseRq.Claim.ClaimCategoryCode)
  }

  public function testClaimSubCategory() {
    var sampleClaimCategoryCode = "TC"
    var claimResponseRq = callMapper()
    assertEquals(sampleClaimCategoryCode, claimResponseRq.Claim.ClaimSubCategoryCode)
  }

  public function testClaimEntryAmounts() {
    _claimResponseRqEntity.Currency1 = Currency.TC_GBP
    _claimResponseRqEntity.TargetCurrency1 = Currency.TC_GBP
    _claimResponseRqEntity.Currency2 = Currency.TC_EUR
    _claimResponseRqEntity.TargetCurrency2 = Currency.TC_EUR
    _claimResponseRqEntity.Currency3 = Currency.TC_USD
    _claimResponseRqEntity.TargetCurrency3 = Currency.TC_USD

    _claimResponseRqEntity.VATAmount1 = new MonetaryAmount(11.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.VATAmount2 = new MonetaryAmount(12.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.VATAmount3 = new MonetaryAmount(13.3bd, Currency.TC_USD)

    _claimResponseRqEntity.LeadReserveAmount1 = new MonetaryAmount(31.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveAmount2 = new MonetaryAmount(32.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.LeadReserveAmount3 = new MonetaryAmount(33.3bd, Currency.TC_USD)

    _claimResponseRqEntity.ImportedServicesAmount1 = new MonetaryAmount(41.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.ImportedServicesAmount2 = new MonetaryAmount(42.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.ImportedServicesAmount3 = new MonetaryAmount(43.3bd, Currency.TC_USD)

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(3, claimEntryAmounts.size())

    for (entryAmount in claimEntryAmounts index i) {
      assertNotNull("VatAmount at index ${i} is null", entryAmount.VatAmount)
      assertNotNull("LeadReserveAmount at index ${i} is null", entryAmount.LeadReserveAmount)
      assertNotNull("ImportedServicesAmount at index ${i} is null", entryAmount.ImportedServicesAmount)

      if (_claimResponseRqEntity.Currency1.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount1_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount1_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.ImportedServicesAmount1_amt, entryAmount.ImportedServicesAmount)
        assertEquals(_claimResponseRqEntity.VATAmount1.Currency.DisplayName, entryAmount.Ccy)
      }

      if (_claimResponseRqEntity.Currency2.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount2_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount2_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.ImportedServicesAmount2_amt, entryAmount.ImportedServicesAmount)
        assertEquals(_claimResponseRqEntity.VATAmount2.Currency.DisplayName, entryAmount.Ccy)
      }

      if (_claimResponseRqEntity.Currency3.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount3_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount3_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.ImportedServicesAmount3_amt, entryAmount.ImportedServicesAmount)
        assertEquals(_claimResponseRqEntity.VATAmount3.Currency.DisplayName, entryAmount.Ccy)
      }
    }
  }

  public function testClaimEntryAmountsWithNulls() {
    _claimResponseRqEntity.Currency1 = Currency.TC_GBP
    _claimResponseRqEntity.TargetCurrency1 = Currency.TC_GBP
    _claimResponseRqEntity.VATAmount1 = new MonetaryAmount(11.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveAmount1 = new MonetaryAmount(31.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.ImportedServicesAmount1 = new MonetaryAmount(41.1bd, Currency.TC_GBP)

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(1, claimEntryAmounts.size())
    assertNotNull("VatAmount is null", claimEntryAmounts.first().VatAmount)
    assertNotNull("LeadReserveAmount is null", claimEntryAmounts.first().LeadReserveAmount)
    assertNotNull("ImportedServicesAmount is null", claimEntryAmounts.first().ImportedServicesAmount)
    assertEquals(_claimResponseRqEntity.VATAmount1_amt, claimEntryAmounts.first().VatAmount)
    assertEquals(_claimResponseRqEntity.LeadReserveAmount1_amt, claimEntryAmounts.first().LeadReserveAmount)
    assertEquals(_claimResponseRqEntity.ImportedServicesAmount1_amt, claimEntryAmounts.first().ImportedServicesAmount)
    assertEquals(_claimResponseRqEntity.VATAmount1.Currency.DisplayName, claimEntryAmounts.first().Ccy)
  }

  public function testClaimEntryAmounts_WhereNothingIsChangedFromOriginal_NotSameOrder() {
    for (financial in _claimResponseRqEntity.ClaimDataResponded.Financials index ind) {
      if (ind == 1) {
        _claimResponseRqEntity.Currency1 = financial.Currency
        _claimResponseRqEntity.VATAmount1 = financial.Vat
        _claimResponseRqEntity.LeadReserveAmount1 = financial.LeadReserveAmount
        _claimResponseRqEntity.ImportedServicesAmount1 = financial.ImportedServicesAmount
      }

      if (ind == 2) {
        _claimResponseRqEntity.Currency2 = financial.Currency
        _claimResponseRqEntity.VATAmount2 = financial.Vat
        _claimResponseRqEntity.LeadReserveAmount2 = financial.LeadReserveAmount
        _claimResponseRqEntity.ImportedServicesAmount2 = financial.ImportedServicesAmount
      }

      if (ind == 0) {
        _claimResponseRqEntity.Currency3 = financial.Currency
        _claimResponseRqEntity.VATAmount3 = financial.Vat
        _claimResponseRqEntity.LeadReserveAmount3 = financial.LeadReserveAmount
        _claimResponseRqEntity.ImportedServicesAmount3 = financial.ImportedServicesAmount
      }
    }

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(0, claimEntryAmounts.size())
  }

  public function testAgreementPartyModification() {
    var claimResponseRqXml = callMapper()
    var modifiedInsurers = claimResponseRqXml.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer

    assertEquals(2, modifiedInsurers.size())
    var promotedInsurer = modifiedInsurers.firstWhere(\elt -> elt.AgreementPartyModifiedIndicator.Value == "add")
    assertNotNull(promotedInsurer)
    assertEquals("urn:lirma:C1004", promotedInsurer.Party.FirstId)
    assertEquals("lirma", promotedInsurer.Party.FirstAgency)
    assertEquals("Agreement Party", promotedInsurer.Party.Name)

    var demotedInsurer = modifiedInsurers.firstWhere(\elt -> elt.AgreementPartyModifiedIndicator.Value == "rem")
    assertEquals("rem", demotedInsurer.AgreementPartyModifiedIndicator.Value)
    assertEquals("urn:lirma:C1003", demotedInsurer.Party.FirstId)
    assertEquals("lirma", demotedInsurer.Party.FirstAgency)
    assertEquals("Follower", demotedInsurer.Party.Name)
  }

  private function generateListOfComments(amountOfComments: int): List<String> {
    var sampleComments: List<String> = {}

    for (1..amountOfComments index idx) {
      sampleComments.add("Sample Comment ${idx}")
    }

    return sampleComments
  }

  private function callMapper(): ClaimResponseRq {
    var claimResponseMapper = new LirmaLeadClaimResponseRqMapper(_claimResponseRqEntity)
    claimResponseMapper.createClaimResponseRq()
    return claimResponseMapper.ClaimResponseRq
  }

}