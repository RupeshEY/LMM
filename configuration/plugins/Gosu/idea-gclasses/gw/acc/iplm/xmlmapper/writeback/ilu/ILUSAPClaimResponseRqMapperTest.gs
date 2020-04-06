package gw.acc.iplm.xmlmapper.writeback.ilu

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class ILUSAPClaimResponseRqMapperTest extends GUnitTestClass {

  private final var iluSAPSample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-ILU-AP-SAMPLE.xml")
  private var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(iluSAPSample)
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
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.SenderPartyId, claimResponseRq.Insurer.Party.FirstId)
    assertEquals(_claimResponseRqEntity.SenderPartyAgency, claimResponseRq.Insurer.Party.FirstAgency)
    assertEquals(_claimResponseRqEntity.SenderPartyName, claimResponseRq.Insurer.Party.Name)
  }

  public function testInsurerContact() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.ContactClassUserId, claimResponseRq.Insurer.Contact.ClassUserId)
    assertEquals(_claimResponseRqEntity.ContactClassAccountId, claimResponseRq.Insurer.Contact.AccountCode)
  }

  public function testServiceProvider() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.ReceiverPartyId, claimResponseRq.ServiceProvider.Party.FirstId)
    assertEquals(_claimResponseRqEntity.ReceiverPartyAgency, claimResponseRq.ServiceProvider.Party.FirstAgency)
    assertEquals(_claimResponseRqEntity.ReceiverPartyName, claimResponseRq.ServiceProvider.Party.Name)
  }

  public function testUMR() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.UMR, claimResponseRq.Contract.BrokerReference)
  }

  public function testTR() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.TR, claimResponseRq.ClaimEntry.BrokerReference)
  }

  public function testUCR() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.UCR, claimResponseRq.Claim.BrokerReference)
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
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.ClaimType.Code, claimResponseRq.Claim.ClaimType)
  }

  public function testResponseCode() {
    var claimResponseRq = callMapper()
    assertEquals(_claimResponseRqEntity.ResponseCode.Code, claimResponseRq.ClaimResponse.AgreementPartyResponse.IluAgreementPartyResponse)
  }

  public function testQueryReasons() {
    var claimResponseRq = callMapper()

    assertEquals("The number of query reasons in the XML does not match the number on the initial XML", _claimResponseRqEntity.QueryReasons.Count, claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason.Count)

    for (queryReason in claimResponseRq.ClaimResponse.AgreementPartyResponse.QueryReason index idx) {
      assertEquals(_claimResponseRqEntity.QueryReasons[idx].Reason.Code, queryReason)
    }
  }

  public function testPrivateComments() {
    var samplePrivateComment = _claimResponseRqEntity.PrivateComments.first().Detail
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
    var samplePublicComment = _claimResponseRqEntity.PublicComments.first().Detail
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

  private function generateListOfComments(amountOfComments : int) : List<String>{
    var sampleComments : List<String> = {}

    for(1..amountOfComments index idx){
      sampleComments.add("Sample Comment ${idx}")
    }

    return sampleComments
  }

  private function callMapper(): ClaimResponseRq {
    var claimResponseMapper = new ILUSAPClaimResponseRqMapper(_claimResponseRqEntity)
    claimResponseMapper.createClaimResponseRq()
    return claimResponseMapper.ClaimResponseRq
  }

}