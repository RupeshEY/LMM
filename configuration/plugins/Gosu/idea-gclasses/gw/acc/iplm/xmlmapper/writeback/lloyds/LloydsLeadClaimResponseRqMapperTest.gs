package gw.acc.iplm.xmlmapper.writeback.lloyds

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass
uses gw.transaction.Transaction
uses gw.xml.XmlSortException
uses gw.xml.date.XmlDateTime

class LloydsLeadClaimResponseRqMapperTest extends GUnitTestClass {

  private static var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _claimResponseRqEntity = ECFMessageEntityUtil.createClaimResponseRq()
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
    var sampleInsurerId = "urn:lloyds:6027"
    var sampleInsurerAgency = "lloyds"
    var sampleInsurerName = "RK2034"

    _claimResponseRqEntity.ReceiverPartyId = sampleInsurerId
    _claimResponseRqEntity.ReceiverPartyAgency = sampleInsurerAgency
    _claimResponseRqEntity.ReceiverPartyName = sampleInsurerName

    var claimResponseRq = callMapper()

    assertEquals(sampleInsurerId, claimResponseRq.Insurer.Party.FirstId)
    assertEquals(sampleInsurerAgency, claimResponseRq.Insurer.Party.FirstAgency)
    assertEquals(sampleInsurerName, claimResponseRq.Insurer.Party.Name)
  }

  public function testInsurerContact() {
    var classUserId = "CWSA1"
    var accountCode = "CWSA"
    var samplePersonName = "XXXXX"
    var sampleTelephone = "XXXXX"
    var sampleEmail = "XXXXX@XXXXX.com"

    var claimResponseRq = callMapper()

    assertEquals(classUserId, claimResponseRq.Insurer.Contact.ClassUserId)
    assertEquals(accountCode, claimResponseRq.Insurer.Contact.AccountCode)
    assertEquals(samplePersonName, claimResponseRq.Insurer.Contact.PersonName)
    assertEquals(sampleTelephone, claimResponseRq.Insurer.Contact.Telephone)
    assertEquals(sampleEmail, claimResponseRq.Insurer.Contact.Email)
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

  public function testClaimEntryAmounts() {
    _claimResponseRqEntity.Currency1 = Currency.TC_GBP
    _claimResponseRqEntity.Currency2 = Currency.TC_EUR
    _claimResponseRqEntity.Currency3 = Currency.TC_USD

    _claimResponseRqEntity.TargetCurrency1 = Currency.TC_GBP
    _claimResponseRqEntity.TargetCurrency2 = Currency.TC_EUR
    _claimResponseRqEntity.TargetCurrency3 = Currency.TC_USD

    _claimResponseRqEntity.VATAmount1 = new MonetaryAmount(11.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.VATAmount2 = new MonetaryAmount(12.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.VATAmount3 = new MonetaryAmount(13.3bd, Currency.TC_USD)

    _claimResponseRqEntity.LeadReserveFees1 = new MonetaryAmount(21.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveFees2 = new MonetaryAmount(22.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.LeadReserveFees3 = new MonetaryAmount(23.3bd, Currency.TC_USD)

    _claimResponseRqEntity.LeadReserveAmount1 = new MonetaryAmount(31.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveAmount2 = new MonetaryAmount(32.2bd, Currency.TC_EUR)
    _claimResponseRqEntity.LeadReserveAmount3 = new MonetaryAmount(33.3bd, Currency.TC_USD)

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(3, claimEntryAmounts.size())

    for (entryAmount in claimEntryAmounts index i) {
      assertNotNull("VatAmount at index ${i} is null", entryAmount.VatAmount)
      assertNotNull("LeadReserveFees at index ${i} is null", entryAmount.LeadReserveFees)
      assertNotNull("LeadReserveAmount at index ${i} is null", entryAmount.LeadReserveAmount)

      if (_claimResponseRqEntity.Currency1.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount1_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveFees1_amt, entryAmount.LeadReserveFees)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount1_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.VATAmount1.Currency.DisplayName.toUpperCase(), entryAmount.Ccy.toUpperCase())
      }

      if (_claimResponseRqEntity.Currency2.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount2_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveFees2_amt, entryAmount.LeadReserveFees)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount2_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.VATAmount2.Currency.DisplayName, entryAmount.Ccy)
      }

      if (_claimResponseRqEntity.Currency3.DisplayName == entryAmount.Ccy) {
        assertEquals(_claimResponseRqEntity.VATAmount3_amt, entryAmount.VatAmount)
        assertEquals(_claimResponseRqEntity.LeadReserveFees3_amt, entryAmount.LeadReserveFees)
        assertEquals(_claimResponseRqEntity.LeadReserveAmount3_amt, entryAmount.LeadReserveAmount)
        assertEquals(_claimResponseRqEntity.VATAmount3.Currency.DisplayName, entryAmount.Ccy)
      }
    }
  }

  public function testClaimEntryAmountsWithTargetCurrencyNull() {
    _claimResponseRqEntity.TargetCurrency1 = null

    var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
    _claimResponseRqEntity.ReferredUUID = claimNotifyRq.UUID

    try {
      callMapper()
    } catch (e: XmlSortException) {
      fail("It should not fail due to XMLSortException, if target currency is null. " + e)
    }
  }

  public function testClaimEntryAmountsWithTargetCurrencyNotNull() {
    _claimResponseRqEntity.TargetCurrency1 = Currency.TC_GBP

    var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
    var claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
    _claimResponseRqEntity.ReferredUUID = claimNotifyRq.UUID

    try {
      callMapper()
    } catch (e: XmlSortException) {
      fail("It should not fail due to XMLSortException, if target currency is GBP. " + e)
    }
  }

  public function testClaimEntryAmountsWithNulls() {
    _claimResponseRqEntity.VATAmount1 = new MonetaryAmount(11.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveFees1 = new MonetaryAmount(21.1bd, Currency.TC_GBP)
    _claimResponseRqEntity.LeadReserveAmount1 = new MonetaryAmount(31.1bd, Currency.TC_GBP)

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(1, claimEntryAmounts.size())

    for (entryAmount in claimEntryAmounts index i) {
      assertNotNull("VatAmount at index ${i} is null", entryAmount.VatAmount)
      assertNotNull("LeadReserveFees at index ${i} is null", entryAmount.LeadReserveFees)
      assertNotNull("LeadReserveAmount at index ${i} is null", entryAmount.LeadReserveAmount)
      assertEquals(_claimResponseRqEntity.VATAmount1_amt, entryAmount.VatAmount)
      assertEquals(_claimResponseRqEntity.LeadReserveFees1_amt, entryAmount.LeadReserveFees)
      assertEquals(_claimResponseRqEntity.LeadReserveAmount1_amt, entryAmount.LeadReserveAmount)
      assertEquals(_claimResponseRqEntity.VATAmount1.Currency.DisplayName.toUpperCase(), entryAmount.Ccy.toUpperCase())
    }
  }

  public function testClaimEntryAmounts_WhereNothingIsChangedFromOriginal() {
    for (financial in _claimResponseRqEntity.ClaimDataResponded.Financials index ind) {
      if (ind == 0) {
        _claimResponseRqEntity.Currency1 = financial.Currency
        _claimResponseRqEntity.TargetCurrency1 = financial.Currency
        _claimResponseRqEntity.VATAmount1 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees1 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount1 = financial.LeadReserveAmount
      }

      if (ind == 1) {
        _claimResponseRqEntity.Currency2 = financial.Currency
        _claimResponseRqEntity.TargetCurrency2 = financial.Currency
        _claimResponseRqEntity.VATAmount2 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees2 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount2 = financial.LeadReserveAmount
      }

      if (ind == 2) {
        _claimResponseRqEntity.Currency3 = financial.Currency
        _claimResponseRqEntity.TargetCurrency3 = financial.Currency
        _claimResponseRqEntity.VATAmount3 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees3 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount3 = financial.LeadReserveAmount
      }
    }

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    for (entryAmount in claimEntryAmounts index i) {
      assertNull("VatAmount for currency ${entryAmount.TargetCurrency} is not null", entryAmount.VatAmount)
      assertNull("LeadReserveFees for currency ${entryAmount.TargetCurrency}} is not null", entryAmount.LeadReserveFees)
      assertNull("LeadReserveAmount for currency ${entryAmount.TargetCurrency} is not null", entryAmount.LeadReserveAmount)
    }
  }

  public function testClaimEntryAmounts_WhereNothingIsChangedFromOriginal_NotSameOrder() {
    for (financial in _claimResponseRqEntity.ClaimDataResponded.Financials index ind) {
      if (ind == 1) {
        _claimResponseRqEntity.Currency1 = financial.Currency
        _claimResponseRqEntity.TargetCurrency1 = financial.Currency
        _claimResponseRqEntity.VATAmount1 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees1 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount1 = financial.LeadReserveAmount
      }

      if (ind == 2) {
        _claimResponseRqEntity.Currency2 = financial.Currency
        _claimResponseRqEntity.TargetCurrency2 = financial.Currency
        _claimResponseRqEntity.VATAmount2 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees2 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount2 = financial.LeadReserveAmount
      }

      if (ind == 0) {
        _claimResponseRqEntity.Currency3 = financial.Currency
        _claimResponseRqEntity.TargetCurrency3 = financial.Currency
        _claimResponseRqEntity.VATAmount3 = financial.Vat
        _claimResponseRqEntity.LeadReserveFees3 = financial.LeadReserveFees
        _claimResponseRqEntity.LeadReserveAmount3 = financial.LeadReserveAmount
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
    assertEquals("urn:lloyds:2033", promotedInsurer.Party.FirstId)
    assertEquals("lloyds", promotedInsurer.Party.FirstAgency)
    assertEquals("Agreement Party", promotedInsurer.Party.Name)

    var demotedInsurer = modifiedInsurers.firstWhere(\elt -> elt.AgreementPartyModifiedIndicator.Value == "rem")
    assertEquals("rem", demotedInsurer.AgreementPartyModifiedIndicator.Value)
    assertEquals("urn:lloyds:2031", demotedInsurer.Party.FirstId)
    assertEquals("lloyds", demotedInsurer.Party.FirstAgency)
    assertEquals("Follower", demotedInsurer.Party.Name)
  }

  public function testLeadContactDetails() {
    var leadPersonName = "LeadXXXXX"
    var leadTelephone = "LEADXXXXX"
    var leadEmail = "LloydLead@XXXXX.COM"

    var claimResponseRqXml = callMapper()
    var leasdContactDetails = claimResponseRqXml.ClaimResponse.LeadResponse.LeadContact
    assertEquals(leadPersonName, leasdContactDetails.PersonName)
    assertEquals(leadTelephone, leasdContactDetails.Telephone)
    assertEquals(leadEmail, leasdContactDetails.Email)
  }

  public function testRiskCode() {
    var claimResponseRq = callMapper()
    assertEquals("KA", claimResponseRq.ContractSection.RiskCode)
  }

  public function testCauseOfLoss() {
    var claimResponseRq = callMapper()
    assertEquals("PAAC", claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.CauseOfLoss)
  }

  public function testClaimsScheme() {
    var claimResponseRq = callMapper()
    assertEquals("2010", claimResponseRq.Claim.ClaimsScheme)
  }

  public function testTriagecategory() {
    var claimResponseRq = callMapper()
    assertEquals("CTP-Complex", claimResponseRq.Claim.TriageCategory)
  }

  public function testOutstandingAmountQualifier() {
    var claimResponseRq = callMapper()
    assertEquals("S", claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.OutstandingAmountQualifier)
  }

  public function testSimultaneousRIPIndicator_Negative() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.SimultaneousRIPIndicatorBoolean = false
    }, "su")

    var claimResponseRq = callMapper()
    assertEquals("N", claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator)
  }

  public function testSimultaneousRIPIndicator_Positive() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.SimultaneousRIPIndicatorBoolean = true
    }, "su")

    var claimResponseRq = callMapper()
    assertEquals("Y", claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator)
  }

  public function testInsurerClaimReferences() {
    var sampleClaimRef1 = "REFERENCE 01"
    var sampleClaimRef2 = "REFERENCE 02"

    var claimResponseRq = callMapper()
    assertEquals(sampleClaimRef1, claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference1)
    assertEquals(sampleClaimRef2, claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference2)
  }

  public function testPrivateComments() {
    var samplePrivateComment = "privateXXXXX"
    var claimResponseRq = callMapper()
    assertEquals(samplePrivateComment, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PrivateComments.first().CommentDetails)
  }

  public function testPrivateComments_CommentsLimit() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.PrivateComments = {}

      var comments = generateListOfComments(_claimResponseRqEntity.PrivateCommentsLimit)

      for (comment in comments) {
        var newCommentEntity = new ECFMessagePrivateComment_Ext()
        newCommentEntity.Detail = comment
        newCommentEntity.ECFMessage = _claimResponseRqEntity
        _claimResponseRqEntity.addToPrivateComments(newCommentEntity)
      }

    }, "su")

    assertEquals(_claimResponseRqEntity.PrivateCommentsLimit, _claimResponseRqEntity.PrivateComments.Count)
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.PrivateCommentsLimit, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PrivateComments.Count)
  }

  public function testPublicComments() {
    var samplePublicComment = "publicXXXXX"
    var claimResponseRq = callMapper()
    assertEquals(samplePublicComment, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PublicComments.first().CommentDetails)
  }

  public function testPublicComments_CommentsLimit() {
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
    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.PublicComments.Count)
  }

  public function testResponseCode() {
    var sampleRresponseCode = "SEEN-ACTION"
    var claimResponseRq = callMapper()
    assertEquals(sampleRresponseCode, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.LloydsResponse)
  }

  public function testQueryReasons() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)

      var queryReason1 = new ECFResponseQueryReason_Ext()
      queryReason1.Reason = ECFQueryReason_Ext.TC_1
      queryReason1.ECFMessageClaimResponseRq_Ext = _claimResponseRqEntity

      var queryReason4 = new ECFResponseQueryReason_Ext()
      queryReason4.Reason = ECFQueryReason_Ext.TC_4
      queryReason4.ECFMessageClaimResponseRq_Ext = _claimResponseRqEntity

    }, ECFConstants.ECF_SUPER_USER)
    var claimResponseRq = callMapper()

    assertEquals(2, claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.QueryReason.size())

    var queryReason1Xml = claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.QueryReason.firstWhere(\elt -> elt == "1")
    assertNotNull(queryReason1Xml)

    var queryReason4Xml = claimResponseRq.ClaimResponse.LeadResponse.LloydsLead.QueryReason.firstWhere(\elt -> elt == "4")
    assertNotNull(queryReason4Xml)
  }

  public function testPcsReference() {
    var samplePcs = "A23"
    var claimResponseRq = callMapper()
    assertEquals(samplePcs, claimResponseRq.Claim.PcsReference)
  }

  public function testLcoCatastropheReference() {
    var sampleLco = "69C"
    var claimResponseRq = callMapper()
    assertEquals(sampleLco, claimResponseRq.Claim.LcoCatastropheReference)
  }

  private function generateListOfComments(amountOfComments: int): List<String> {
    var sampleComments: List<String> = {}

    for (1..amountOfComments index idx) {
      sampleComments.add("Sample Comment ${idx}")
    }

    return sampleComments
  }

  private function callMapper(): ClaimResponseRq {
    var claimResponseMapper = new LloydsLeadClaimResponseRqMapper(_claimResponseRqEntity)
    return claimResponseMapper.createClaimResponseRq()
  }
}