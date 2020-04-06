package gw.acc.iplm.xmlmapper.writeback.lloyds

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class LloydsSAPClaimResponseRqMapperTest extends GUnitTestClass {

  private static var lloydsAPSample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lloyds-AP-SAMPLE.xml")
  private static var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(lloydsAPSample)
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
    var sampleInsurerId = "urn:lloyds:0623"
    var sampleInsurerAgency = "lloyds"
    var sampleInsurerName = "Beazley 0623"

    _claimResponseRqEntity.ReceiverPartyId = sampleInsurerId
    _claimResponseRqEntity.ReceiverPartyAgency = sampleInsurerAgency
    _claimResponseRqEntity.ReceiverPartyName = sampleInsurerName

    var claimResponseRq = callMapper()

    assertEquals(sampleInsurerId, claimResponseRq.Insurer.Party.FirstId)
    assertEquals(sampleInsurerAgency, claimResponseRq.Insurer.Party.FirstAgency)
    assertEquals(sampleInsurerName, claimResponseRq.Insurer.Party.Name)
  }

  public function testInsurerContact() {
    var classUserId = "23214"
    var accountCode = "14241"

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

  public function testPrivateComments() {
    var samplePrivateComment = "4363463"
    var claimResponseRq = callMapper()
    assertEquals(samplePrivateComment, claimResponseRq.ClaimResponse.AgreementPartyResponse.PrivateComments.first().CommentDetails)
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
    assertEquals(_claimResponseRqEntity.PrivateCommentsLimit, claimResponseRq.ClaimResponse.AgreementPartyResponse.PrivateComments.Count)
  }

  public function testPublicComments() {
    var samplePublicComment = "1234567"
    var claimResponseRq = callMapper()
    assertEquals(samplePublicComment, claimResponseRq.ClaimResponse.AgreementPartyResponse.PublicComments.first().CommentDetails)
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
    assertEquals(_claimResponseRqEntity.PublicCommentsLimit, claimResponseRq.ClaimResponse.AgreementPartyResponse.PublicComments.Count)
  }

  public function testResponseCode() {
    var sampleRresponseCode = "QUERY-RETURN"
    var claimResponseRq = callMapper()
    assertEquals(sampleRresponseCode, claimResponseRq.ClaimResponse.AgreementPartyResponse.LloydsAgreeementPartyResponse)
  }

  public function testQueryReasons() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      bundle.add(_claimResponseRqEntity)

      var queryReason1 = new ECFResponseQueryReason_Ext()
      queryReason1.Reason = ECFQueryReason_Ext.TC_2
      queryReason1.ECFMessageClaimResponseRq_Ext = _claimResponseRqEntity

      var queryReason4 = new ECFResponseQueryReason_Ext()
      queryReason4.Reason = ECFQueryReason_Ext.TC_6
      queryReason4.ECFMessageClaimResponseRq_Ext = _claimResponseRqEntity

    }, ECFConstants.ECF_SUPER_USER)
    var claimResponseRq = callMapper()

    assertEquals(2, claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason.size())

    var queryReason1Xml = claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason.firstWhere(\elt -> elt == "2")
    assertNotNull(queryReason1Xml)

    var queryReason4Xml = claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason.firstWhere(\elt -> elt == "6")
    assertNotNull(queryReason4Xml)
  }

  private function generateListOfComments(amountOfComments : int) : List<String>{
    var sampleComments : List<String> = {}

    for(1..amountOfComments index idx){
      sampleComments.add("Sample Comment ${idx}")
    }

    return sampleComments
  }

  private function callMapper(): ClaimResponseRq {
    var claimResponseMapper = new LloydsSAPClaimResponseRqMapper(_claimResponseRqEntity)
    claimResponseMapper.createClaimResponseRq()
    return claimResponseMapper.ClaimResponseRq
  }

}