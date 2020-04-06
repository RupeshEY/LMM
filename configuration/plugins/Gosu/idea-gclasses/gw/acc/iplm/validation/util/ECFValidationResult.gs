package gw.acc.iplm.validation.util

uses gw.xml.ws.annotation.WsiExportable

/**
 * Result of an ECF Validation
 */
@WsiExportable
final class ECFValidationResult {

  private var _valid : boolean as IsValid
  private var _errorMsg : String as Error
  private var _errorCode: Integer as ErrorCode

}