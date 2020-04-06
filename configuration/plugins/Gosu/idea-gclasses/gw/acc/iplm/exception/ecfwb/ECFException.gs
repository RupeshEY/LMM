package gw.acc.iplm.exception.ecfwb

uses gw.api.util.DisplayableException

/**
 * This class implements specific Exceptions for the ECF Writeback accelerator.
 */
class ECFException extends DisplayableException {

  private var _errorCodeType: ECFErrorCodeType as ECFErrorCode

  /**
   * To throw simple exception messages
   *
   * @param errorCodeType The ECFErrorCodeType for this exception
   */
  construct(errorCodeType: ECFErrorCodeType) {
    super(getErrorCode(errorCodeType)
        + errorCodeType.MessageFormatter.prepareMessage({""}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with one string param
   *
   * @param errorCodeType The ECFErrorCodeType for this exception
   * @param message       The String message for this exception
   */
  construct(errorCodeType: ECFErrorCodeType, message: String) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({message}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with with other wrapped exception
   *
   * @param errorCodeType The ECFErrorCodeType for this exception
   * @param ex            The Exception to wrap on this exception
   */
  construct(errorCodeType: ECFErrorCodeType, ex: Exception) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({ex.Message}), ex)
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with multiple string params
   *
   * @param errorCodeType The ECFErrorCodeType for this exception
   * @param message       The String[] of messages for this exception
   */
  construct(errorCodeType: ECFErrorCodeType, params: String[]) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage(params))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw simple exception message
   *
   * @param message The String message for this exception
   */
  construct(message: String) {
    super(message)
  }

  private static function getErrorCode(errorCodeType: ECFErrorCodeType): String {
    return "[" + errorCodeType.ErrorCode + "] "
  }

  property get ErrorMessage(): String {
    return _errorCodeType?.toString()
  }
}