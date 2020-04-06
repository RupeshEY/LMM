package gw.acc.iplm.xmlmapper.writeback.ilu

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.api.util.ConfigAccess
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class ILULeadClaimResponseRqMapperTest extends GUnitTestClass {

  private static var iluAPSample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-ILU-Lead-SAMPLE.xml")
  private static var _iluClaimNotifyFile = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Ilu-SAMPLE.xml")
  private static var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(iluAPSample)
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
    var sampleInsurerId = "urn:ilu:402801"
    var sampleInsurerAgency = "ilu"
    var sampleInsurerName = "Zurich 402801"

    _claimResponseRqEntity.ReceiverPartyId = sampleInsurerId
    _claimResponseRqEntity.ReceiverPartyAgency = sampleInsurerAgency
    _claimResponseRqEntity.ReceiverPartyName = sampleInsurerName

    var claimResponseRq = callMapper()

    assertEquals(sampleInsurerId, claimResponseRq.Insurer.Party.FirstId)
    assertEquals(sampleInsurerAgency, claimResponseRq.Insurer.Party.FirstAgency)
    assertEquals(sampleInsurerName, claimResponseRq.Insurer.Party.Name)
  }

  public function testInsurerContact() {
    var classUserId = "1234"
    var accountCode = "5678"

    var claimResponseRq = callMapper()

    assertEquals(classUserId, claimResponseRq.Insurer.Contact.ClassUserId)
    assertEquals(accountCode, claimResponseRq.Insurer.Contact.AccountCode)
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

  public function testCedantInLiquidationIndicator() {
    var claimResponseRq = callMapper()
    assertEquals("Y", claimResponseRq.Claim.Indicators.CedantInLiquidationIndicator)
  }

  public function testSimiltaniousRIPIndicator() {
    var claimResponseRq = callMapper()
    assertEquals("Y", claimResponseRq.Claim.Indicators.SimultaneousRIPIndicator)
  }

  public function testChaseUpRequiredIndicator() {
    var claimResponseRq = callMapper()
    assertEquals("Y", claimResponseRq.Claim.Indicators.ChaseUpIndicator.Indicator)
  }

  public function testChaseUpIntervalValue() {
    var claimResponseRq = callMapper()
    assertEquals(24bi, claimResponseRq.Claim.Indicators.ChaseUpIndicator.Interval)
  }

  public function testVATAmount_Unchanged() {
    var newUUID = UUID.randomUUID().toString()
    var vatValue = new MonetaryAmount(9999.00bd, _claimResponseRqEntity.Currency1)

    var cnMessage = createILUClaimNotifyMessageForResponse(_claimResponseRqEntity)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnMessage = bundle.add(cnMessage)
      cnMessage.UUID = newUUID
      cnMessage.Financials.first().SettlementVat = vatValue

      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.ReferredUUID = newUUID
      _claimResponseRqEntity.VATAmount1 = vatValue

      _claimResponseRqEntity.ImportedServicesAmount1 = null
      _claimResponseRqEntity.LeadReserveAmount1 = null
      _claimResponseRqEntity.LeadReserveFees1 = null
      _claimResponseRqEntity.ImportedServicesNarrative1 = null
    }, "su")

    var claimResponseRq = callMapper(_claimResponseRqEntity)
    assertNull(claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.first().VatAmount)
  }

  public function testVATAmount_Changed() {
    var newUUID = UUID.randomUUID().toString()
    var vatValue = new MonetaryAmount(9999.00bd, _claimResponseRqEntity.Currency1)
    var newVatValue =  new MonetaryAmount(8888.00bd, _claimResponseRqEntity.Currency1)

    var cnMessage = createILUClaimNotifyMessageForResponse(_claimResponseRqEntity)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnMessage = bundle.add(cnMessage)
      cnMessage.UUID = newUUID
      cnMessage.Financials.first().SettlementVat = vatValue

      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.ReferredUUID = newUUID
      _claimResponseRqEntity.VATAmount1 = newVatValue

      _claimResponseRqEntity.ImportedServicesAmount1 = null
      _claimResponseRqEntity.LeadReserveAmount1 = null
      _claimResponseRqEntity.LeadReserveFees1 = null
      _claimResponseRqEntity.ImportedServicesNarrative1 = null
    }, "su")

    var claimResponseRq = callMapper(_claimResponseRqEntity)
    assertNotSame(newVatValue.Amount, cnMessage.Financials.first().SettlementVat.Amount)
    assertEquals(newVatValue.Amount, claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.first().VatAmount)
  }

  public function testImportedServicesAmount_Unchanged() {
    var newUUID = UUID.randomUUID().toString()
    var importedServicesValue = new MonetaryAmount(9999.00bd, _claimResponseRqEntity.Currency1)
    var cnMessage = createILUClaimNotifyMessageForResponse(_claimResponseRqEntity)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnMessage = bundle.add(cnMessage)
      cnMessage.UUID = newUUID
      cnMessage.Financials.first().ImportedServicesAmount = importedServicesValue

      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.ReferredUUID = newUUID
      _claimResponseRqEntity.ImportedServicesAmount1 = importedServicesValue

      _claimResponseRqEntity.VATAmount1 = null
      _claimResponseRqEntity.LeadReserveAmount1 = null
      _claimResponseRqEntity.LeadReserveFees1 = null
      _claimResponseRqEntity.ImportedServicesNarrative1 = null
    }, "su")

    var claimResponseRq = callMapper(_claimResponseRqEntity)
    assertNull(claimResponseRq.ClaimResponse?.LeadResponse?.ClaimEntryAmounts?.first()?.ImportedServicesAmount)
  }

  public function testImportedServicesAmount_Changed() {
    var newUUID = UUID.randomUUID().toString()
    var importedServicesValue = new MonetaryAmount(9999.00bd, _claimResponseRqEntity.Currency1)
    var newImportedServicesValue = new MonetaryAmount(8888.00bd, _claimResponseRqEntity.Currency1)

    var cnMessage = createILUClaimNotifyMessageForResponse(_claimResponseRqEntity)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnMessage = bundle.add(cnMessage)
      cnMessage.UUID = newUUID
      cnMessage.Financials.first().ImportedServicesAmount = importedServicesValue

      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.ReferredUUID = newUUID
      _claimResponseRqEntity.ImportedServicesAmount1 = newImportedServicesValue

      _claimResponseRqEntity.VATAmount1 = null
      _claimResponseRqEntity.LeadReserveAmount1 = null
      _claimResponseRqEntity.LeadReserveFees1 = null
      _claimResponseRqEntity.ImportedServicesNarrative1 = null
    }, "su")

    var claimResponseRq = callMapper(_claimResponseRqEntity)
    assertNotSame(newImportedServicesValue.Amount, cnMessage.Financials.first().ImportedServicesAmount.Amount)
    assertEquals(newImportedServicesValue.Amount, claimResponseRq.ClaimResponse.LeadResponse.ClaimEntryAmounts.first().ImportedServicesAmount)
  }

  public function testClaimEntryAmounts_WhereNothingIsChangedFromOriginal_NotSameOrder() {
    for (financial in _claimResponseRqEntity.ClaimDataResponded.Financials index ind) {
      if (ind == 1) {
        _claimResponseRqEntity.Currency1 = financial.Currency
        _claimResponseRqEntity.VATAmount1 = financial.Vat
        _claimResponseRqEntity.ImportedServicesAmount1 = financial.ImportedServicesAmount
        _claimResponseRqEntity.ImportedServicesNarrative1 = financial.ImportedServicesNarrative
      }

      if (ind == 2) {
        _claimResponseRqEntity.Currency2 = financial.Currency
        _claimResponseRqEntity.VATAmount2 = financial.Vat
        _claimResponseRqEntity.ImportedServicesAmount2 = financial.ImportedServicesAmount
        _claimResponseRqEntity.ImportedServicesNarrative2 = financial.ImportedServicesNarrative
      }

      if (ind == 0) {
        _claimResponseRqEntity.Currency3 = financial.Currency
        _claimResponseRqEntity.VATAmount3 = financial.Vat
        _claimResponseRqEntity.ImportedServicesAmount3 = financial.ImportedServicesAmount
        _claimResponseRqEntity.ImportedServicesNarrative3 = financial.ImportedServicesNarrative
      }
    }

    var claimResponseRqXml = callMapper()
    var claimEntryAmounts = claimResponseRqXml.ClaimResponse.LeadResponse.ClaimEntryAmounts
    assertEquals(0, claimEntryAmounts.size())
  }

  public function testJvClassOfBusiness() {
    var claimResponseRq = callMapper()
    assertEquals("AH", claimResponseRq.ContractSection.JvClassOfBusiness)
  }

  public function testClaimType() {
    var claimResponseRq = callMapper()
    assertEquals("000", claimResponseRq.Claim.ClaimType)
  }

  public function testParticipantFunction() {
    var claimResponseRq = callMapper()
    assertEquals("Lead", claimResponseRq.ClaimResponse.ParticipantFunction)
  }

  public function testClaimLineNo() {
    var claimResponseRq = callMapper()
    assertEquals(1bi, claimResponseRq.ClaimResponse.ClaimLineNo)
  }

  public function testLeadContact() {
    var claimResponseRq = callMapper()
    assertEquals("Default Owner", claimResponseRq.ClaimResponse.LeadResponse.LeadContact.PersonName)
    assertEquals("555-1234", claimResponseRq.ClaimResponse.LeadResponse.LeadContact.Telephone)
    assertEquals("su@guidewire.com", claimResponseRq.ClaimResponse.LeadResponse.LeadContact.Email)
  }

  public function testAgreementPartyModifiedIndicator() {
    var claimResponseRq = callMapper()
    assertEquals("add", claimResponseRq.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer.first().AgreementPartyModifiedIndicator.Value)
  }

  public function testInsurerOrReinsurerParty() {
    var claimResponseRq = callMapper()
    assertEquals("GW2001", claimResponseRq.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer.first().Party.FirstId)
    assertEquals("ilu", claimResponseRq.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer.first().Party.FirstAgency)
    assertEquals("Felix Insurance", claimResponseRq.ClaimResponse.LeadResponse.ContractMarket.InsurerOrReinsurer.first().Party.Name)
  }

  public function testPrivateComments() {
    var samplePrivateComment = _claimResponseRqEntity.PrivateComments.first().Detail
    var claimResponseRq = callMapper()
    assertEquals(samplePrivateComment, claimResponseRq.ClaimResponse.LeadResponse.IluLead.PrivateComments.first().CommentDetails)
  }

  public function testPrivateComments_CommentsLimit() {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.PrivateComments = {}

      var comments = generateListOfComments(_claimResponseRqEntity.PrivateCommentsLimit)

      for(comment in comments){
        var newCommentEntity = new ECFMessagePrivateComment_Ext()
        newCommentEntity.Detail = comment
        newCommentEntity.ECFMessage = _claimResponseRqEntity
        _claimResponseRqEntity.addToPrivateComments(newCommentEntity)
      }

    }, "su")

    assertEquals(_claimResponseRqEntity.PrivateCommentsLimit, _claimResponseRqEntity.PrivateComments.Count)
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.PrivateCommentsLimit, claimResponseRq.ClaimResponse.LeadResponse.IluLead.PrivateComments.Count)
  }

  public function testPublicComments() {
    var samplePublicComment = _claimResponseRqEntity.PublicComments.first().Detail
    var claimResponseRq = callMapper()
    assertEquals(samplePublicComment, claimResponseRq.ClaimResponse.LeadResponse.IluLead.PublicComments.first().CommentDetails)
  }

  public function testPublicComments_CommentsLimit() {
    gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
      _claimResponseRqEntity = bundle.add(_claimResponseRqEntity)
      _claimResponseRqEntity.PublicComments = {}

      var comments = generateListOfComments(_claimResponseRqEntity.PublicCommentsLimit)

      for(comment in comments){
        var newCommentEntity = new ECFMessagePublicComment_Ext()
        newCommentEntity.Detail = comment
        newCommentEntity.ECFMessage = _claimResponseRqEntity
        _claimResponseRqEntity.addToPublicComments(newCommentEntity)
      }

    }, "su")

    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, _claimResponseRqEntity.PublicComments.Count)
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, claimResponseRq.ClaimResponse.LeadResponse.IluLead.PublicComments.Count)
  }

  public function testResponseCode() {
    var claimResponseRq = callMapper()
    assertEquals("AUT", claimResponseRq.ClaimResponse.LeadResponse.IluLead.IluResponse)
  }

  private function generateListOfComments(amountOfComments : int) : List<String>{
    var sampleComments : List<String> = {}

    for(1..amountOfComments index idx){
      sampleComments.add("Sample Comment ${idx}")
    }

    return sampleComments
  }

  private function callMapper(): ClaimResponseRq {
    return callMapper(_claimResponseRqEntity)
  }

  private function callMapper(claimresponseRqEntity: ECFMessageClaimResponseRq_Ext): ClaimResponseRq {
    var claimResponseMapper = new ILULeadClaimResponseRqMapper(claimresponseRqEntity)
    claimResponseMapper.createClaimResponseRq()
    return claimResponseMapper.ClaimResponseRq
  }

  private function createILUClaimNotifyMessageForResponse(claimResponseEntity : ECFMessageClaimResponseRq_Ext) : ECFMessageClaimNotifyRq_Ext{
    var cnILUXml = ECFMessageUtil.createNewClaimNotifyRq(_iluClaimNotifyFile)
    var cnMessage = ECFMessageEntityUtil.createClaimNotifyRq(cnILUXml)
    var newUuid = claimResponseEntity.ReferredUUID

    var vatCurrency = cnMessage.Financials.first().Currency
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cnMessage = bundle.add(cnMessage)
      cnMessage.UUID = newUuid
    }, "su")

    return cnMessage
  }

}