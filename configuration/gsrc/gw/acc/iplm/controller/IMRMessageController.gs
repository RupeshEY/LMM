package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManager
uses gw.acc.iplm.entitymapper.imr.docdownload.DocumentDownloadRqEntityMapper
uses gw.acc.iplm.entitymapper.imr.docsearch.DocumentSearchRqEntityMapper
uses gw.acc.iplm.entitymapper.imr.docupload.DocumentUploadRqEntityMapper
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

/**
 * Controller for IMR Messages sent internally from ClaimCenter.
 * This could be via button on the UI or invoked from within ClaimCenter code.
 * Any ECFMessages sent from ClaimCenter to ECF WB, IMR, or to be routed back to ECF_INBOUND queue
 * need to go through this class.
 */
class IMRMessageController {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  private var _imrDownloadRequestMapper: DocumentDownloadRqEntityMapper
  private var _imrUploadRequestMapper: DocumentUploadRqEntityMapper
  private var _imrSearchRequestMapper: DocumentSearchRqEntityMapper

  public construct() {
    _imrDownloadRequestMapper = new DocumentDownloadRqEntityMapper()
    _imrUploadRequestMapper = new DocumentUploadRqEntityMapper()
    _imrSearchRequestMapper = new DocumentSearchRqEntityMapper()
  }

  /**
   * Downloads the provided document from the IMR.
   *
   * @param claim    The Claim to which this document is attached
   * @param document The Document to download from the IMR
   */
  public function sendRepositoryDownloadRequestForDocument(document: Document) {
    try {
      var message = _imrDownloadRequestMapper.createNewDocumentDownloadRq(document)
      InterceptorManager.intercept(message)
    } catch (e: IMRException) {
      LOGGER.error("An error occurred during Document Download {}", e.Message, e)
      throw e
    } catch (e: Exception) {
      LOGGER.error("An error occurred during Document Download {}", e.Message, e)
      throw new IMRException(DisplayKey.get("Accelerator.IPLM.Web.DocumentsLV.Error.UnknownDownloadError"), e)
    }
  }

  /**
   * uploads the provided file to the IMR.
   *
   * @param document      The entity.Document to upload to the IMR
   * @param accessParties The Access Parties and their rights or Null if no access rights are needed.
   */
  public function sendRepositoryUploadRequestForDocument(document: Document, accessParties: List<ECFMessageDocumentUploadAccessParty_Ext>) {
    if (accessParties == null) {
      accessParties = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
    }
    try {
      var message = _imrUploadRequestMapper.createNewDocumentUploadRq(document, accessParties)
      InterceptorManager.intercept(message)
    } catch (e: IMRException) {
      LOGGER.error("An error occurred during Document Upload {}", e.Message, e)
      throw e
    } catch (e: Exception) {
      LOGGER.error("An error occurred during Document Upload {}", e.Message, e)
      throw new IMRException(DisplayKey.get("Accelerator.IPLM.Web.DocumentsLV.Error.UnknownUploadError"), e)
    }
  }

  /**
   * Update the Documents in this Claim from the IMR Repository
   *
   * @param claim
   */
  public function sendRepositorySearchRequestForClaim(claim: Claim) {
    sendRepositorySearchRequestForClaim(claim, null)
  }

  /**
   * Update the Documents in this Claim from the IMR Repository
   * with a TR (Transaction Reference).
   *
   * @param claim
   * @param transactionReference
   */
  public function sendRepositorySearchRequestForClaim(claim: Claim, transactionReference: String) {
    try {
      var message = _imrSearchRequestMapper.createNewDocumentSearchRq(claim, transactionReference)
      InterceptorManager.intercept(message)
    } catch (e: IMRException) {
      LOGGER.error("An error occurred during Document Search {}", e.Message, e)
      throw e
    } catch (e: Exception) {
      LOGGER.error("An error occurred during Document Search {}", e.Message, e)
      throw new IMRException(DisplayKey.get("Accelerator.IPLM.Web.DocumentsLV.Error.UnknownSearchError"), e)
    }
  }

}