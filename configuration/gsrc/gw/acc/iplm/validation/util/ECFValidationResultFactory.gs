package gw.acc.iplm.validation.util

final class ECFValidationResultFactory {

  static function validResult(): ECFValidationResult {
    return new ECFValidationResult(){
        :IsValid = true}
  }

  static function invalidResult(error: String, errorCode: Integer): ECFValidationResult {
    return new ECFValidationResult(){
        :IsValid = false,
        :Error = error,
        :ErrorCode = errorCode}
  }
}