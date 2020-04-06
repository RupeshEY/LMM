package gw.acc.iplm.exception.imr

uses gw.api.locale.DisplayKey

/**
 * IMR Error Code Types, to manage all type of exception in IMR Services
 */
enum IMRErrorCodeType {

  IMR_SYNC_REQUEST_ERROR(201, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRSyncRequestError", objects[0])),
  IMR_SYNC_RESPONSE_ERROR(202, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRSyncResponseError", objects[0])),
  IMR_UNABLE_TO_CONNECT(203, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRProblemProcessingRequest")),
  IMR_UPLOADED_DOCUMENT_REJECTED(204, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRUploadedDocumentRejected")),
  IMR_UPLOADED_DOCUMENT_EXCEEDS_SIZE_LIMIT(205, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRUploadedExceedsSizeLimit")),
  IMR_DOCUMENT_SEARCH_ERROR(206, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRDocumentSearchError")),
  IMR_UNABLE_TO_IDENTIFY_CLAIM(207, \objects -> DisplayKey.get("Accelerator.IPLM.IMRErrorCodeType.IMRUnableToIdentifyClaim")),

  private var _preparableMessage: Preparable as MessageFormatter

  private var _errorCode: Integer

  /**
   * This interface is used within this class to allow a
   * code block with String arguments to be defined with
   * each individual enum value.
   *
   * For example: Some display keys require a Claim Number
   * to be provided.
   */
  interface Preparable {
    function prepareMessage(vals: String[]): String
  }

  private construct(errorCode: Integer, preparableMessage: Preparable) {
    _errorCode = errorCode
    _preparableMessage = preparableMessage
  }

  property get ErrorCode(): Integer {
    return _errorCode
  }

  override function toString(): String {
    return this.MessageFormatter.prepareMessage({"", "", ""})
  }
}