package gw.acc.iplm.services

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.LMMessageEntityUtil
uses gw.acc.iplm.testutils.SampleFileReader
uses gw.acc.iplm.testutils.XmlHelperUtil
uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.XmlElement
uses gw.xml.date.XmlDateTime
uses org.apache.commons.io.FileUtils
uses org.apache.commons.io.IOUtils

uses javax.xml.soap.MessageFactory
uses javax.xml.soap.SOAPMessage
uses java.io.File

class EntityMapperServiceComponentTest extends GUnitTestClass {

  private var _entityMapperService: EntityMapperService

  override function beforeMethod() {
    super.beforeMethod()
    LMMessageEntityUtil.deleteAllLMMessagesFromDB()
    _entityMapperService = new EntityMapperService()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    LMMessageEntityUtil.deleteAllLMMessagesFromDB()
  }

  function testLogSameMessageTwice() {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()

    var newMessage = _entityMapperService.createEntity(xmlPayload)
    var allMessages = ECFMessageEntityUtil.getAllECFMessages()
    assertEquals(1, allMessages.Count)

    assertCausesException(\-> {
      newMessage = _entityMapperService.createEntity(xmlPayload)
      var message2UUID = newMessage.UUID
    }, ECFException)
  }

  function testLogTwoDifferentMessages() {
    var xmlPayload1 = ECFMessageUtil.createNewClaimNotifyRq()
    var xmlPayload2 = getXMLPayloadFromFile(ECFMessageUtil.CLAIM_RETRIEVE_RS_FILE)

    _entityMapperService.createEntity(xmlPayload1)
    var allMessages = ECFMessageEntityUtil.getAllECFMessages()
    assertEquals(1, allMessages.Count)

    _entityMapperService.createEntity(xmlPayload2)
    allMessages = ECFMessageEntityUtil.getAllECFMessages()
    assertEquals(2, allMessages.Count)
  }

   function testNewClaimNotifyRq_ValidTransactionStatus() {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    xmlPayload.ClaimMovement.Extension.ClaimEntry.LloydsStatus = "12-PENDED/ REJECTED"
    var newMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
    assertEquals("12-PENDED/ REJECTED", newMessage.TransactionStatus.DisplayName)
  }

  function testNewClaimNotifyRq_InValidTransactionStatus() {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    xmlPayload.ClaimMovement.Extension.ClaimEntry.LloydsStatus = "10-AWAITING/ QUERIED"
    var newMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
    assertEquals("10-AWAITING/QUERIED", newMessage.TransactionStatus.DisplayName)
  }

  function testNewClaimNotifyRqAgreementPartyRespondAsRole() {
    // Given
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    // Chamge the Primary ContractMarket to Follower
    for(contractMarket in xmlPayload.ClaimMovement.Extension.Contract.ContractMarket){
      for(insurerOrReinsurer in contractMarket.InsurerOrReinsurer){
        if(insurerOrReinsurer.Party.Name == "Beazley 0623"){
          insurerOrReinsurer.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY.Code.toString()
          break
        }
      }
    }

    // When
    var newMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext

    // Then
    assertEquals(ECFMessageClaimNotifyRq_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
  }

  function testNewClaimNotifyRs() {
    AssertUtils.assertCausesECFExceptionWithType(\-> {
      var xmlPayload = getXMLPayloadFromFile(ECFMessageUtil.CLAIM_NOTIFY_RS_FILE)
      _entityMapperService.createEntity(xmlPayload)
    }, ECFErrorCodeType.ILLEGAL_MESSAGE_TYPE_ERROR)
  }

  function testNewClaimResponseRs() {
    var xmlPayload = getXMLPayloadFromFile(ECFMessageUtil.CLAIM_RESPONSE_RS_FILE)
    var newMessage = _entityMapperService.createEntity(xmlPayload)

    assertEquals(ECFMessageClaimResponseRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)

    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)

    assertNull(newMessage.UCR)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testClaimRetrieveRsWhenClassDown() {
    var xmlPayload = getXMLPayloadFromFile(ECFMessageUtil.CLAIM_RETRIEVE_RS_FILE_CLASS_DOWN)
    var newMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimRetrieveRs_Ext
    assertEquals(ECFMessageClaimRetrieveRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.ResponseAcknowledgement)
    assertEquals(ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS.DisplayName, newMessage.ResponseAcknowledgement.ResponseDescription)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testNewDocumentSearchRs() {
    var xmlPayload = getXMLPayloadFromFile(ECFMessageUtil.DOCUMENT_SEARCH_RS_FILE)
    var newMessage = _entityMapperService.createEntity(xmlPayload)
    assertEquals(ECFMessageDocumentSearchRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)
    assertNotNull(newMessage.UCR)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testLoggingDocumentDownloadRsBase64() {
    var imrDocumentId = UUID.randomUUID().toString()
    createDocumententityWithImrDocumentIdAndName(imrDocumentId, "testDoc")
    var tempFile = new File("./MyBase64SampleFirstReport.doc");
    var downloadRepoRs = getXMLPayloadFromFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE)
    var attachmentFile = ConfigAccess.getConfigFile("config/iplm/testresources/imr/SampleFirstReport.doc")
    var repositoryOperationRs = RepositoryOperationRs.parse(downloadRepoRs.asUTFString())
    repositoryOperationRs.DocumentList.first().DocumentItem.first().Document.FileFormatCd = "application/msword"
    repositoryOperationRs.DocumentList.first().DocumentItem.first().Document.FileId = attachmentFile.getName()
    repositoryOperationRs.DocumentList.first().DocumentItem.first().Document.DocumentId = imrDocumentId
    var postRq = XmlHelperUtil.createDocumentDownloadloadPostRq(repositoryOperationRs, attachmentFile.getName())
    var downloadRs = XmlHelperUtil.createSoapMessageRequest(XmlElement.parse(repositoryOperationRs.asUTFString()),
        postRq, attachmentFile, RepositoryOperationTypeCdType.RepositoryDownload, "base64")
    XmlHelperUtil.logSoapMessageString(downloadRs)
    var entityMapperService = new EntityMapperService()
    var ecfDownloadRsMessage = entityMapperService.createEntity(downloadRs) as ECFMessageDocumentDownloadRs_Ext
    var docId = repositoryOperationRs.DocumentList?.first().DocumentItem?.first().Document?.DocumentId
    var claim = ClaimBuilderHelper.createClaim()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfDownloadRsMessage = bundle.add(ecfDownloadRsMessage)
      ecfDownloadRsMessage.Claim = claim
      var newDoc = bundle.add(new Document())
      newDoc.Claim = claim
      newDoc.DocUID = attachmentFile.getName()
      newDoc.IMRDocumentId = docId
    }, User.util.UnrestrictedUser)
    assertEquals(repositoryOperationRs.MsgId, ecfDownloadRsMessage.UUID)
    assertNotNull(ecfDownloadRsMessage.DocumentBinary)
    var inputStream = ecfDownloadRsMessage.DocumentBinary?.toInputStream()
    var documentBytes = IOUtils.toByteArray(inputStream)
    var decodedBytes = Base64.MimeDecoder.decode(documentBytes)
    FileUtils.writeByteArrayToFile(tempFile, decodedBytes)
    assertEquals(true, tempFile.exists())
    assertEquals(true, not tempFile.isDirectory())
    assertEquals(attachmentFile.length(), tempFile.length())
  }

  function testNewDocumentDownloadRs() {
    var imrDocumentId = UUID.randomUUID().toString()
    createDocumententityWithImrDocumentIdAndName(imrDocumentId, "testDoc")

    var downloadRsXml = SampleFileReader.readFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE)
    var repositoryOperationRs = RepositoryOperationRs.parse(downloadRsXml)
    repositoryOperationRs.DocumentList.first().DocumentItem.first().Document.DocumentId = imrDocumentId

    var attachmentFile = ConfigAccess.getConfigFile("config/iplm/testresources/imr/SampleFirstReport.doc")
    var postRq = XmlHelperUtil.createDocumentDownloadloadPostRq(repositoryOperationRs, attachmentFile.getName())
    var downloadRs = XmlHelperUtil.createSoapMessageRequest(XmlElement.parse(repositoryOperationRs.asUTFString()),
        postRq, attachmentFile, RepositoryOperationTypeCdType.RepositoryDownload, "base64")
    var newMessage = _entityMapperService.createEntity(downloadRs)
    assertEquals(ECFMessageDocumentDownloadRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)
    assertNotNull((newMessage as ECFMessageDocumentDownloadRs_Ext).DocumentBinary)
    assertNull(newMessage.UCR)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testHandleXchangingsDodgyTimestamp() {
    var imrDocumentId = UUID.randomUUID().toString()
    createDocumententityWithImrDocumentIdAndName(imrDocumentId, "testDoc")
    var downloadRepoRs = getXMLPayloadFromFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE)
    var repositoryOperationRs = RepositoryOperationRs.parse(downloadRepoRs.asUTFString())
    var attachmentFile = ConfigAccess.getConfigFile("config/iplm/testresources/imr/SampleFirstReport.doc")
    var postRq = XmlHelperUtil.createDocumentDownloadloadPostRq(repositoryOperationRs, attachmentFile.getName())
    var downloadRs = XmlHelperUtil.createSoapMessageRequest(XmlElement.parse(repositoryOperationRs.asUTFString()),
        postRq, attachmentFile, RepositoryOperationTypeCdType.RepositoryDownload, "base64")
    var newMessage = _entityMapperService.createEntity(downloadRs)
    assertEquals(ECFMessageDocumentDownloadRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)
    assertNotNull((newMessage as ECFMessageDocumentDownloadRs_Ext).DocumentBinary)
    assertNull(newMessage.UCR)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testHandleNullDocumentVersionDtTime() {
    var imrDocumentId = UUID.randomUUID().toString()
    createDocumententityWithImrDocumentIdAndName(imrDocumentId, "testDoc")
    var downloadRepoRs = getXMLPayloadFromFile(ECFMessageUtil.DOCUMENT_DOWNLOAD_RS_FILE)
    var repositoryOperationRs = RepositoryOperationRs.parse(downloadRepoRs.asUTFString())
    repositoryOperationRs.DocumentList[0].DocumentItem[0].Document.DocumentVersionDtTime = null
    repositoryOperationRs.DocumentList[0].DocumentItem[0].Document.DocumentId = imrDocumentId
    var attachmentFile = ConfigAccess.getConfigFile("config/iplm/testresources/imr/SampleFirstReport.doc")
    var postRq = XmlHelperUtil.createDocumentDownloadloadPostRq(repositoryOperationRs, attachmentFile.getName())
    var downloadRs = XmlHelperUtil.createSoapMessageRequest(XmlElement.parse(repositoryOperationRs.asUTFString()),
        postRq, attachmentFile, RepositoryOperationTypeCdType.RepositoryDownload, "base64")
    var newMessage = _entityMapperService.createEntity(downloadRs)
    assertEquals(ECFMessageDocumentDownloadRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)
    assertNotNull((newMessage as ECFMessageDocumentDownloadRs_Ext).DocumentBinary)
    assertNull(newMessage.UCR)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testNewDocumentUploadRs() {
    var xmlPayload = getXMLPayloadFromFile(ECFMessageUtil.DOCUMENT_UPLOAD_RS_FILE)
    var newMessage = _entityMapperService.createEntity(xmlPayload)

    assertEquals(ECFMessageDocumentUploadRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)

    assertNull(newMessage.UCR)

    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }

  function testLogMessage_SoapMessageDocSearchResponse() {
    //Create a new claim with a new UCR
    var testClaim = createNewClaim()
    //Create a new Doc Search RepositoryOperationRs with the UCR
    var repositoryOperation = createDocumentSearchResponse(testClaim)
    //Create a new soapmessage for from this RepositoryOperationRs
    var docSearchSoapMessage = createNewSearchSOAPMessage(repositoryOperation)
    //Log this message and make sure the correct type is returned
    var docSearchRespEntity = _entityMapperService.createEntity(docSearchSoapMessage)
    //Make sure the SOAP parts are logged too
    assertNotNull(docSearchRespEntity)
    assertNotNull(docSearchRespEntity.Content)
    assertEquals(typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT, docSearchRespEntity.Subtype)
    //Make sure the Claim entity is associated with the Message
    assertNotNull(docSearchRespEntity.Claim)
    assertEquals(testClaim.ClaimNumber, docSearchRespEntity.Claim.ClaimNumber)
  }

  function testDocSearchResponseWithoutResults() {
    //Create a new claim with a new UCR
    var testClaim = createNewClaim()
    // Make sure there aren't any results
    var repositoryOperation = createDocumentSearchResponse(testClaim)
    repositoryOperation.DocumentList.clear()
    //Create a new soapmessage for from this RepositoryOperationRs
    var docSearchSoapMessage = createNewSearchSOAPMessage(repositoryOperation)
    //Log this message and make sure the correct type is returned
    var docSearchRespEntity = _entityMapperService.createEntity(docSearchSoapMessage)
    //Make sure the SOAP parts are logged too
    assertNotNull(docSearchRespEntity)
    assertNotNull(docSearchRespEntity.Content)
    assertEquals(typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT, docSearchRespEntity.Subtype)
    // Make sure that there is no Claim
    assertNull(docSearchRespEntity.Claim)
  }

  public function testCanHandleClaimNotifyWithNoResponseCode() {
    var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
    xmlPayload.ClaimMovement.ResponseCode = ""
    var newMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
    assertEquals(ECFMessageClaimNotifyRq_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNull(newMessage.ResponseCode)
    assertEquals(1, ECFMessageEntityUtil.getAllECFMessages().Count)
  }


  function testHourFormatIs24Hours() {
    var dateUnderTest = Date.create(2016, gw.date.Month.NOVEMBER, 1, 13, 0, 0, 0, null)
    var dateAsString = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(dateUnderTest)
    //This test is mainly for validating hours from 0-24 hours, so we don't need to verify zone Z,
    //which can be different and cause build servers to fail.
    assertTrue(dateAsString.contains("2016-11-01T13:00:00"))
  }

  function testCanHandleSyndicateClaimsMessage() {
    var xmlPayload = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    var newMessage = _entityMapperService.createEntity(xmlPayload)

    assertEquals(LMMessageLloydsSCM_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)

    assertNotNull(newMessage.UUID)
    assertNotNull(newMessage.Content)
    assertNotNull(newMessage.Status)
    assertNotNull(newMessage.OriginTimeStamp)
    assertNotNull(newMessage.Suspended)
    assertNotNull(newMessage.UCR)
    assertNotNull(newMessage.UMR)
    assertEquals(1, LMMessageEntityUtil.getAllLMMessages().Count)
  }

  private function createNewSearchSOAPMessage(docSearchResp: RepositoryOperationRs): SOAPMessage {
    var docSearchPostRq = createPostRequestObject(docSearchResp)
    var messageFactory = MessageFactory.newInstance()
    var docSearchSoapMessage = messageFactory.createMessage()
    docSearchSoapMessage.MimeHeaders.setHeader(SOAPMessageConstants.SOAP_ACTION, ACORDMessageConstants.ACORD_SOAP_ACTION_VALUE)
    docSearchSoapMessage.SOAPPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)

    //add Acord message equals RepositoryOperationRq Object
    addAcordMessagePart(docSearchSoapMessage, docSearchResp, docSearchPostRq.getWorkFolder().getMsgFile().getFileFormatCd(), docSearchPostRq.getWorkFolder().getMsgFile().getFileId())

    addMessageBodyData(docSearchSoapMessage, docSearchPostRq)
    docSearchSoapMessage.saveChanges()
    return docSearchSoapMessage
  }

  /**
   * This function will add object xml representation to SOAP body.
   *
   * @param SOAPMessage representing the SOAP request message
   * @param XmlElement  representing any object to be attached.
   */
  private static function addMessageBodyData(soapMessage: SOAPMessage, xmlElement: XmlElement) {
    var soapPart = soapMessage.getSOAPPart()
    var envelope = soapPart.getEnvelope()
    var body = envelope.getBody()
    var bodyChildElement = body.addDocument(ECFUtils.convertXmlStringToDocument(xmlElement.asUTFString()))
    bodyChildElement.addNamespaceDeclaration("", ACORDMessageConstants.NS_POSTRQ)
    bodyChildElement.setElementQName(ACORDMessageConstants.POST_RQ)
  }

  /**
   * This function will add Acord message to the MIME envelope, MIME Part
   *
   * @param SOAPMessage representing the IMR webservice request
   * @param xmlElement  the RepositoryOperationRq to add to the MIME part
   * @param contentType the content type header value, mostly it is text/html
   * @param contentId   the content Id mostly represent file name
   * @return SOAPMessage the soap request adding Acord MIME Part
   */
  private static function addAcordMessagePart(soapMessage: SOAPMessage, xmlElement: XmlElement, contentType: String, contentId: String): SOAPMessage {
    var attachPart = soapMessage.createAttachmentPart(xmlElement.asUTFString(), contentType)
    attachPart.setContentId("<" + contentId.substring(4) + ">")
    attachPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)
    soapMessage.addAttachmentPart(attachPart)

    return soapMessage
  }

  private static function createPostRequestObject(docSearchResp: RepositoryOperationRs): PostRq {
    var postRq = new PostRq()

    postRq.Sender.PartyId = docSearchResp.Sender.PartyId
    postRq.Sender.PartyName = docSearchResp.Sender.PartyName
    postRq.Sender.PartyRoleCd = docSearchResp.Sender.PartyRoleCd

    postRq.Receiver.PartyId = docSearchResp.Receiver.PartyId
    postRq.Receiver.PartyName = docSearchResp.Receiver.PartyName
    postRq.Receiver.PartyRoleCd = docSearchResp.Receiver.PartyRoleCd

    postRq.Application.ApplicationCd = ACORDMessageConstants.ACORD_APPLICATION_TYPE
    postRq.Application.SchemaVersion = ACORDMessageConstants.ACORD_SCHEMA_VERSION

    postRq.TimeStamp = new XmlDateTime(docSearchResp.CreationDtTime)

    postRq.MsgItem.MsgId = docSearchResp.MsgId
    postRq.MsgItem.MsgTypeCd = ECFMessageConstants.POSTRQ_MESSAGE_TYPE

    postRq.WorkFolder.MsgFile.FileId = ECFMessageConstants.CID + UUID.randomUUID().toString()
    postRq.WorkFolder.MsgFile.FileFormatCd = SOAPMessageConstants.ATTACHMENT_CONTENT_TYPE_TEXT_XML

    return postRq
  }

  private function getXMLPayloadFromFile(sampleFile: File): XmlElement {
    if (sampleFile.isDirectory() or (not sampleFile.exists())) {
      return null
    }
    var cnsRq = new SampleFileReader().readFile(sampleFile)
    return XmlElement.parse(cnsRq)
  }

  private function createDocumentSearchResponse(newClaim: Claim): RepositoryOperationRs {
    var repOpResp = ECFMessageUtil.createNewDocumentSearchRs()
    //Set each UCR to the same as the claim's
    repOpResp.DocumentList.each(\docList -> {
      docList.DocumentItem.each(\docItem -> {
        docItem.ReferredObjects.Claim.BrokerReference = newClaim.UCR_Ext
      })
    })
    return repOpResp
  }

  private function createNewClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }

  private function createDocumententityWithImrDocumentIdAndName(imrId : String, name : String) : Document{
    var testClaim = ClaimBuilderHelper.createClaim(true)
    var testDocument : Document
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      testDocument = new Document(bundle)
      testDocument = bundle.add(testDocument)
      testDocument.DocUID = UUID.randomUUID().toString()
      testDocument.IMRDocumentId = imrId
      testDocument.IMRDocumentVersion = "1.0"
      testDocument.Name = name
      testDocument.MimeType = "application/msword"
      testDocument.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD
      testDocument.Claim = testClaim
    }, User.util.UnrestrictedUser)
    return testDocument
  }
}