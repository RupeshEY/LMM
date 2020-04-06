package gw.acc.iplm.testutils

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.utils.ECFXmlFileReader
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.ClaimNotifyEventRs
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.api.util.ConfigAccess
uses gw.xml.XmlElement
uses gw.xml.XmlSimpleValue

uses javax.xml.soap.MessageFactory
uses javax.xml.soap.SOAPMessage
uses java.io.File

class ECFMessageUtil {

  public static final var CLAIM_NOTIFY_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml")
  public static final var CLAIM_NOTIFY_RQ_WITH_BULK_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE-WithBulk.xml")
  public static final var CLAIM_NOTIFY_RQ_WITHOUT_TARGET_CURRENCY_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE-WithoutTargetCurrency.xml")
  public static final var CLAIM_NOTIFY_RQ_WITHOUT_FINANCIAL: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE-WithoutFullData.xml")
  public static final var RESPONDERRORNOTIFY_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/RespondErrorNotifyRq.xml")
  public static final var TRANSACTIONERRORNOTIFY_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/TransactionErrorNotify.xml")
  public static final var CLAIM_NOTIFY_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimEventNotifyRs-SAMPLE.xml")
  public static final var CLAIM_RETRIEVE_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimretrieve/RetrieveClaimRq-SAMPLE.xml")
  public static final var CLAIM_RETRIEVE_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimretrieve/RetrieveClaimRs-SAMPLE.xml")
  public static final var CLAIM_RETRIEVE_RS_WITH_BULK_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimretrieve/RetrieveClaimRs-SAMPLE-WithBulk.xml")
  public static final var CLAIM_RETRIEVE_RS_FILE_CLASS_DOWN: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimretrieve/RetrieveClaimRs-CLASS_Unavailable_sample.xml")
  public static final var CLAIM_RESPONSE_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lloyds-Lead-SAMPLE.xml")
  public static final var CLAIM_RESPONSE_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRs-SAMPLE.xml")
  public static final var DOCUMENT_SEARCH_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositorySearch-Request-Sample.xml")
  public static final var DOCUMENT_SEARCH_RQ_POSTRS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositorySearch-Request-PostRs.xml")
  public static final var DOCUMENT_SEARCH_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositorySearch-Response-Sample.xml")
  public static final var DOCUMENT_DOWNLOAD_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryDownload-Request-Sample.xml")
  public static final var DOCUMENT_DOWNLOAD_RQ_POSTRS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryDownload-Request-PostRs.xml")
  public static final var DOCUMENT_DOWNLOAD_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryDownload-Response-Sample.xml")
  public static final var DOCUMENT_DOWNLOAD_RS_FILE_XCHANGING: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryDownload-Response-xchanging-Sample.xml")
  public static final var DOCUMENT_UPLOAD_RQ_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryUpload-Request-Sample.xml")
  public static final var DOCUMENT_UPLOAD_RQ_POSTRS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryUpload-Request-PostRs.xml")
  public static final var DOCUMENT_UPLOAD_RS_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/RepositoryUpload-Response-Sample.xml")
  public static final var SAMPLE_ATTACHMENT_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/attachment.png")
  public static final var SAMPLE_BYTES_ATTACHMENT_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/attachment2.txt")
  public static final var DOCUMENT_DOWNLOAD_RS_FILE_2: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/AsyncDownloadRsXMLPart.xml")
  public static final var DOCUMENT_DOWNLOAD_BINARY_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/AsyncDownloadRsBinaryPart.txt")
  public static final var CLAIM_NOTIFY_RQ_FILE_BIG_PAYLOAD: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq_VeryBigPayload.xml")
  public static final var LLOYDS_SCM_FILE: File = ConfigAccess.getConfigFile("config/iplm/testresources/lloyds/SCMMessage-SAMPLE.xml")
  public static final var POST_RQ: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/PostRq.xml")
  public static final var POST_RS: File = ConfigAccess.getConfigFile("config/iplm/testresources/imr/PostRs.xml")

  /**
   * @return a new ClaimNotifyEventRq with a new UUID and a new UCR
   */
  public static function createNewClaimNotifyRq(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(CLAIM_NOTIFY_RQ_FILE)
  }

  public static function createNewClaimNotifyRqWithBulk(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(CLAIM_NOTIFY_RQ_WITH_BULK_FILE)
  }

  public static function createNewClaimNotifyRqWithOutTargetCurrency(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(CLAIM_NOTIFY_RQ_WITHOUT_TARGET_CURRENCY_FILE)
  }

  public static function createNewClaimNotifyRqWithoutFinancial(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(CLAIM_NOTIFY_RQ_WITHOUT_FINANCIAL)
  }

  public static function createNewRespondErrorNotifyRq(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(RESPONDERRORNOTIFY_FILE)
  }

  public static function createNewTransactionErrorNotifyRq(): ClaimNotifyEventRq {
    return createNewClaimNotifyRq(TRANSACTIONERRORNOTIFY_FILE)
  }

  public static function createNewClaimNotifyRs(): ClaimNotifyEventRs {
    var newMessage = readFile(CLAIM_NOTIFY_RS_FILE)
    var typedMessage = ClaimNotifyEventRs.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewClaimRetrieveRq(): RetrieveClaimRq {
    return createNewClaimRetrieveRq(CLAIM_RETRIEVE_RQ_FILE)
  }

  public static function createNewClaimRetrieveRq(xmlFile: File): RetrieveClaimRq {
    var newMessage = readFile(xmlFile)
    var typedMessage = RetrieveClaimRq.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewClaimRetrieveRs(): RetrieveClaimRs {
    return createNewClaimRetrieveRs(CLAIM_RETRIEVE_RS_FILE)
  }

  public static function createNewClaimRetrieveRsWithBulk(): RetrieveClaimRs {
    return createNewClaimRetrieveRs(CLAIM_RETRIEVE_RS_WITH_BULK_FILE)
  }

  public static function createNewClaimRetrieveRsWhereClassUnavailable(): RetrieveClaimRs {
    return createNewClaimRetrieveRs(CLAIM_RETRIEVE_RS_FILE_CLASS_DOWN)
  }

  private static function createNewClaimRetrieveRs(notifyXmlFile: File): RetrieveClaimRs {
    var newMessage = readFile(notifyXmlFile)
    newMessage = ECFXmlFileReader.getPayloadAsString(newMessage)
    var typedMessage = RetrieveClaimRs.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    if (typedMessage.ClaimMovement != null) {
      typedMessage.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    }
    return typedMessage
  }

  public static function createNewClaimResponseRq(xml : File): ClaimResponseRq {
    var newMessage = readFile(xml)
    newMessage = ECFXmlFileReader.getPayloadAsString(newMessage)
    var typedMessage = ClaimResponseRq.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewClaimResponseRq(): ClaimResponseRq {
    return createNewClaimResponseRq(CLAIM_RESPONSE_RQ_FILE)
  }

  public static function createNewClaimResponseRs(): ClaimResponseRs {
    var newMessage = readFile(CLAIM_RESPONSE_RS_FILE)
    newMessage = ECFXmlFileReader.getPayloadAsString(newMessage)
    var typedMessage = ClaimResponseRs.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewDocumentSearchRq(): RepositoryOperationRq {
    var newMessage = readFile(DOCUMENT_SEARCH_RQ_FILE)
    return createRepositoryOperationRequest(newMessage)
  }

  public static function createNewDocumentSearchRqPostRs(): PostRs {
    var newMessage = readFile(DOCUMENT_SEARCH_RQ_POSTRS_FILE)
    var typedMessage = PostRs.parse(newMessage)
    typedMessage.MsgItems.MsgItem.first().MsgId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewDocumentSearchRs(): RepositoryOperationRs {
    var newMessage = readFile(DOCUMENT_SEARCH_RS_FILE)
    return createRepositoryOperationResponse(newMessage)
  }

  public static function createNewDocumentUploadRq(): RepositoryOperationRq {
    var newMessage = readFile(DOCUMENT_UPLOAD_RQ_FILE)
    return createRepositoryOperationRequest(newMessage)
  }

  public static function createNewDocumentUploadRqPostRs(): PostRs {
    var newMessage = readFile(DOCUMENT_UPLOAD_RQ_POSTRS_FILE)
    var typedMessage = PostRs.parse(newMessage)
    typedMessage.MsgItems.MsgItem.first().MsgId = getNewMsgUUID()
    return typedMessage
  }

  public static function createNewDocumentUploadRs(): RepositoryOperationRs {
    var newMessage = readFile(DOCUMENT_UPLOAD_RS_FILE)
    return createRepositoryOperationResponse(newMessage)
  }

  public static function createNewDocumentDownloadRq(): RepositoryOperationRq {
    var newMessage = readFile(DOCUMENT_DOWNLOAD_RQ_FILE)
    return createRepositoryOperationRequest(newMessage)
  }

  public static function createNewDocumentDownloadRs(): RepositoryOperationRs {
    var newMessage = readFile(DOCUMENT_DOWNLOAD_RS_FILE)
    return createRepositoryOperationResponse(newMessage)
  }

  public static function createNewDocumentDownloadRqPostRs(): PostRs {
    var newMessage = readFile(DOCUMENT_DOWNLOAD_RQ_POSTRS_FILE)
    var typedMessage = PostRs.parse(newMessage)
    typedMessage.MsgItems.MsgItem.first().MsgId = getNewMsgUUID()
    return typedMessage
  }

  private static function createRepositoryOperationResponse(xmlPayload: String): RepositoryOperationRs {
    var repositoryOperationRs = RepositoryOperationRs.parse(xmlPayload)
    repositoryOperationRs.MsgId = getNewMsgUUID()
    return repositoryOperationRs
  }


   static function createNewClaimNotifyRq(notifyXmlFile: File): ClaimNotifyEventRq {
    var newMessage = readFile(notifyXmlFile)
    newMessage = ECFXmlFileReader.getPayloadAsString(newMessage)
    var typedMessage = ClaimNotifyEventRq.parse(newMessage)
    typedMessage.UUId = getNewMsgUUID()
    if (typedMessage.ClaimMovement != null) {
      typedMessage.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    }
    return typedMessage
  }

  private static function createRepositoryOperationRequest(xmlPayload: String): RepositoryOperationRq {
    var repositoryOperationRq = RepositoryOperationRq.parse(xmlPayload)
    repositoryOperationRq.MsgId = getNewMsgUUID()
    return repositoryOperationRq
  }

  public static function createSoapMessageRequest(xmlElement: XmlElement): SOAPMessage {
    var messageFactory = MessageFactory.newInstance()
    var message = messageFactory.createMessage()

    message.MimeHeaders.setHeader(SOAPMessageConstants.SOAP_ACTION, ACORDMessageConstants.ACORD_SOAP_ACTION_VALUE)
    message.SOAPPart.setMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING, ACORDMessageConstants.ACORD_CONTENT_TRANSFER_ENCODING_VALUE)

    var postRsDocument = ECFUtils.convertXmlStringToDocument(xmlElement.asUTFString())
    message.SOAPBody.addDocument(postRsDocument)

    message.saveChanges()
    return message
  }

  public static function createNewLloydsSyndicateClaimMessage() : Jv_Ins_Reinsurance {
    return createNewLMMRequest(LLOYDS_SCM_FILE)
  }

  public static function createNewLMMRequest(messageFile: File) : Jv_Ins_Reinsurance {
    var message = readFile(messageFile)
    var typedMessage = Jv_Ins_Reinsurance.parse(message)
    typedMessage.ClaimMovement.UUId = getNewMsgUUID()
    typedMessage.ClaimMovement.Claim.BrokerReference = ClaimBuilderHelper.getNextUCR()
    return typedMessage
  }

  public static function createNewPostRq() : PostRq {
    return createNewPostRq(POST_RQ)
  }

  public static function createNewPostRq(messageFile: File) : PostRq {
    var message = readFile(messageFile)
    var typedMessage = PostRq.parse(message)
    return typedMessage
  }

  public static function createNewPostRs() : PostRs {
    return createNewPostRs(POST_RS)
  }

  public static function createNewPostRs(messageFile: File) : PostRs {
    var message = readFile(messageFile)
    var typedMessage = PostRs.parse(message)
    typedMessage.MsgItems.MsgItem.first().MsgId = getNewMsgUUID()
    return typedMessage
  }

  private static function readFile(file: File): String {
    return SampleFileReader.readFile(file)
  }

  public static function getNewMsgUUID(): String {
    return java.util.UUID.randomUUID().toString()
  }


  /**
   * Creates new XMLElement from File
   *
   * @param xmlFile XML File
   * @return XmlElement
   */
  public static function createNewXmlMessage(xmlFile: File): XmlElement {
    var newMessage = readFile(xmlFile)
    newMessage = ECFXmlFileReader.getPayloadAsString(newMessage)
    var xmlElemet = XmlElement.parse(newMessage)
    var uuid = ECFXmlFileReader.getXmlElement(xmlElemet, xmlElemet, ClaimNotifyEventRq.$ELEMENT_QNAME_UUId.LocalPart)
    if (uuid != null) {
      uuid.set$SimpleValue(XmlSimpleValue.makeStringInstance(java.util.UUID.randomUUID().toString()))
    }
    var claimMovement = ECFXmlFileReader.getXmlElement(xmlElemet, xmlElemet, ClaimNotifyEventRq.$ELEMENT_QNAME_ClaimMovement.LocalPart)
    if (claimMovement != null) {
      var claimMovementUUID = ECFXmlFileReader.getXmlElement(xmlElemet, claimMovement, ClaimNotifyEventRq.$ELEMENT_QNAME_UUId.LocalPart)
      claimMovementUUID.set$SimpleValue(XmlSimpleValue.makeStringInstance(java.util.UUID.randomUUID().toString()))
    }

    return xmlElemet
  }
}