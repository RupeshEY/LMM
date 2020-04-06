package gw.acc.iplm.xmlmapper.writeback.lirma

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.date.XmlDateTime

class LirmaSAPClaimResponseRqMapperTest   extends GUnitTestClass {

  private static var lirmaLeadSample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lirma-AP-SAMPLE.xml")
  private static var _claimResponseRqEntity: ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(lirmaLeadSample)
    _claimResponseRqEntity = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)  }

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

  public function testClaimType() {
    var sampleClaimType = "000"
    var claimResponseRq = callMapper()
    assertEquals(sampleClaimType, claimResponseRq.Claim.ClaimType)
  }

  public function testImmediatePartCollectionIndicator(){
    var sampleIndicator = "N"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.ImmediatePartCollectionIndicator)
  }

  public function testNoFurtherResponseIndicator(){
    var sampleIndicator = "Y"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.NoFurtherResponseIndicator)
  }

  public function testMultipleResponseIndicator(){
    var sampleIndicator = "N"
    var claimResponseRq = callMapper()
    assertEquals(sampleIndicator, claimResponseRq.Claim.Indicators.MultipleResponseIndicator)
  }

  public function testResponseCode() {
    var sampleRresponseCode = "CAA"
    var claimResponseRq = callMapper()
    assertEquals(sampleRresponseCode, claimResponseRq.ClaimResponse.LirmaCompany.LirmaCompanyResponse)
  }

  public function testRequestToBroker() {
    var sampleBrokerRequest1 = "123456"
    var sampleBrokerRequest2 = "789000"
    var claimResponseRq = callMapper()
    assertEquals(2, claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker.Count)
    assertEquals(sampleBrokerRequest1, claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker.first().Request)
    assertEquals(sampleBrokerRequest2, claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker.get(1).Request)
  }

  public function testOneRequestToBroker() {
    var sampleBrokerRequest1 = "123456"
    _claimResponseRqEntity.RequestToBroker2 = null
    var claimResponseRq = callMapper()
    assertEquals(1, claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker.Count)
    assertEquals(sampleBrokerRequest1, claimResponseRq.ClaimResponse.LirmaCompany.RequestToBroker.first().Request)
  }

  public function testInsurerClaimReferences() {
    var sampleClaimRef1 = "REFERENCE 03"
    var sampleClaimRef2 = "REFERENCE 04"

    var claimResponseRq = callMapper()
    assertEquals(sampleClaimRef1, claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference1)
    assertEquals(sampleClaimRef2, claimResponseRq.ClaimResponse.InsurerOrReinsurerClaimReference2)
  }

  public function testPrivateFootnote() {
    var sampleFootnote = "PrivateNote01"

    var claimResponseRq = callMapper()
    assertEquals(sampleFootnote, claimResponseRq.ClaimResponse.LirmaCompany.PrivateFootnote)
  }

  private function callMapper(): ClaimResponseRq {
    var claimResponseMapper = new LirmaSAPClaimResponseRqMapper(_claimResponseRqEntity)
    claimResponseMapper.createClaimResponseRq()
    return claimResponseMapper.ClaimResponseRq
  }

}