package gw.acc.iplm.exception.lm

uses gw.api.util.DisplayableException

/**
 * This class implements specific Exceptions for London Market messages
 */
class LMException extends DisplayableException {
  private var _errorCodeType: LMErrorCodeType as LMErrorCode

  construct(message : String){
    super(message)
  }

  construct(message : String, cause: Throwable) {
    super(message, cause)
  }

  /**
   * To throw simple exception messages
   *
   * @param errorCodeType The LMErrorCodeType for this exception
   */
  construct(errorCodeType: LMErrorCodeType) {
    super(getErrorCode(errorCodeType)
        + errorCodeType.MessageFormatter.prepareMessage({""}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with one string param
   *
   * @param errorCodeType The LMErrorCodeType for this exception
   * @param message       The String message for this exception
   */
  construct(errorCodeType: LMErrorCodeType, message: String) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({message}))
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with with other wrapped exception
   *
   * @param errorCodeType The LMErrorCodeType for this exception
   * @param ex            The Exception to wrap on this exception
   */
  construct(errorCodeType: LMErrorCodeType, ex: Exception) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage({ex.Message}), ex)
    _errorCodeType = errorCodeType
  }

  /**
   * To throw exception messages with multiple string params
   *
   * @param errorCodeType The LMErrorCodeType for this exception
   * @param message       The String[] of messages for this exception
   */
  construct(errorCodeType: LMErrorCodeType, params: String[]) {
    super(getErrorCode(errorCodeType) + errorCodeType.MessageFormatter.prepareMessage(params))
    _errorCodeType = errorCodeType
  }

  private static function getErrorCode(errorCodeType: LMErrorCodeType): String {
    return "[" + errorCodeType.ErrorCode + "] "
  }

  property get ErrorMessage(): String {
    return _errorCodeType?.toString()
  }
}