package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.services.api.InboundIMRService
uses gw.acc.iplm.utils.DocumentUtils
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.document.DocumentExistsException
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses org.apache.commons.io.IOUtils
uses org.apache.commons.lang.exception.ExceptionUtils

uses java.io.ByteArrayInputStream
uses java.io.InputStream

class IMRDocumentDownloadRsService extends InboundIMRService<ECFMessageDocumentDownloadRs_Ext> {

  private var _documentContentSourcePlugin: IDocumentContentSourceBase

  construct() {
    _documentContentSourcePlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
  }

  override function process(ecfMessage: ECFMessageDocumentDownloadRs_Ext) {
    LOGGER.debug("We have a Document Download Response")
    LOGGER.debug("We're going to process this response: \n" + ecfMessage.Content.ContentString)

    var documentInputStream = ecfMessage.DocumentBinary?.toInputStream()
    if (documentInputStream == null) {
      LOGGER.error("Not able to download the Document from the message.")
    }

    var docUID = readDocumentUIDFromMessage(ecfMessage)
    if (docUID == null) {
      LOGGER.debug("Unable to get the DocumentID from the message")
    }

    var document = DocumentUtils.findDocumentByIMRDocumentId(docUID)
    if (document == null) {
      LOGGER.info("Unable to find Document in ClaimCenter database. Creating Document entity.")
      document = createNewDocument(ecfMessage).first()
    }

    var decodedInputStream: InputStream
    try {
      decodedInputStream = decodeDocumentInputStream(documentInputStream)
    } catch (e: Exception) {
      LOGGER.error("Unable to decode binary document attachment in message {}", ecfMessage.UUID)
    }

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)

      try {
        _documentContentSourcePlugin.addDocument(decodedInputStream, document)
        document.DMS = true
        document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
        document.Status = DocumentStatusType.TC_FINAL
        LOGGER.info("Document {} with IMR ID {} added to the DMS", document.Name, document.IMRDocumentId)
      } catch (e: RuntimeException) {
        // This is needed because for some reason the OOTB DMS plugin wraps the DocumentExistsException
        // in a RuntimeException when a file already exists in the DMS...
        // See class BaseLocalDocumentContentSource
        if (ExceptionUtils.indexOfThrowable(e, DocumentExistsException) != -1) {
          document.DMS = true
          document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
          document.Status = DocumentStatusType.TC_FINAL
          LOGGER.info("Document {} with IMR ID {} already exists in the DMS", document.Name, document.IMRDocumentId)
        }
      } catch (e: DocumentExistsException) {
        document.DMS = true
        document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
        document.Status = DocumentStatusType.TC_FINAL
        LOGGER.info("Document {} with IMR ID {} already exists in the DMS", document.Name, document.IMRDocumentId)
      } catch (e: Exception) {
        LOGGER.error("Unable to add document to the DMS for message {} due to {}. Document IMR Status reset. Try again.", ecfMessage.UUID, e.Message)
        document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
      }
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function decodeDocumentInputStream(encodedIs: InputStream): InputStream {
    var documentBytes = IOUtils.toByteArray(encodedIs)
    var decodedBytes = Base64.MimeDecoder.decode(documentBytes)
    return new ByteArrayInputStream(decodedBytes)
  }

  private function readDocumentUIDFromMessage(message: ECFMessage_Ext): String {
    var repositoryOperationRs = RepositoryOperationRs.parse(message.Content.ContentString)
    return repositoryOperationRs.DocumentList?.first().DocumentItem?.first().Document?.DocumentId
  }

  override function mapDocumentInformation(docToUpdate: entity.Document, imrDoc: gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document, transactionReference: String) {
    super.mapDocumentInformation(docToUpdate, imrDoc, transactionReference)
    docToUpdate.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
  }
}