package gw.acc.iplm.exception.imr

uses gw.api.util.DisplayableException

/**
 * This class implements specific Exceptions for the ECF Writeback accelerator related to IMR access.
 */
class IMRException extends DisplayableException {
  private var _errorCodeType: IMRErrorCodeType as IMRErrorCode

  construct(message : String){
    super(message)
  }

  construct(message : String, cause: Throwable) {
    super(message, cause)
  }

  /**
   * To throw simple exception messages
   *
   * @param errorCodeType The IMRErrorCodeType for this exception
   */
  construct(errorCodeType: IMRErrorCodeType) {
    super(getErrorCode(errorCodeType)
        + errorCodeType.MessageFormatter.prepareMessage({""}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with one string param
   *
   * @param errorCodeType The IMRErrorCodeType for this exception
   * @param message       The String message for this exception
   */
  construct(errorCodeType: IMRErrorCodeType, message: String) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({message}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with with other wrapped exception
   *
   * @param errorCodeType The IMRErrorCodeType for this exception
   * @param ex            The Exception to wrap on this exception
   */
  construct(errorCodeType: IMRErrorCodeType, ex: Exception) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({ex.Message}), ex)
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with multiple string params
   *
   * @param errorCodeType The IMRErrorCodeType for this exception
   * @param message       The String[] of messages for this exception
   */
  construct(errorCodeType: IMRErrorCodeType, params: String[]) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage(params))
    _errorCodeType = errorCodeType
  }

  private static function getErrorCode(errorCodeType: IMRErrorCodeType): String {
    return "[" + errorCodeType.ErrorCode + "] "
  }

  property get ErrorMessage(): String {
    return _errorCodeType?.toString()
  }
}