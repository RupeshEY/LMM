package gw.acc.iplm.exception.ecfwb

uses gw.api.locale.DisplayKey

/**
 * ECF Error Code Types, to manage all type of exception in ECF-WB Services
 */
enum ECFErrorCodeType {

  //Policy Errors  / 100
  POLICY_NOT_UNIQUE(101, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyNotUnique")),
  POLICY_NOT_FOUND_IN_MESSAGE(102, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyNotFoundInMessage")),
  POLICY_NOT_FOUND_IN_SYSTEM(103, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyNotFoundInSystem", objects[0])),
  POLICY_NOT_VALID(104, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyNotValid", objects[0])),
  POLICY_MULTIPLE_RESULTS(105, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyMultipleResults", objects[0])),
  POLICY_MISSING_TYPE(106, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyMissingType", objects[0])),
  POLICY_NUMBER_BLANK(1060, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.PolicyNumberBlank")),

  //Claim Error
  CLAIM_MULTIPLE_RESULTS(107, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimMultipleResults", objects[0])),
  CLAIM_UCR_NOT_FOUND(108, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimUCRNotFound")),

  //Claim Notify Exception
  CLAIM_NOTIFY_ERROR(109, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimNotifyError", objects[0])),

  //General Messaging Error
  EMPTY_MESSAGE_ERROR(110, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.EmptyMessageError")),
  ILLEGAL_MESSAGE_TYPE_ERROR(111, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.IllegalMessageTypeError", objects[0])),
  MESSAGE_PREPROCESSING_ERROR(112, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.MessagePreprocessingError", objects[0])),
  UNABLE_TO_GENERATE_PAYLOAD(142, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.UnableToGeneratePayload")),

  //Claim Retrieve Exceptions
  CLAIM_RETRIEVE_ERROR(113, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveError", objects[0])),
  CLAIM_NOT_FOUND_FOR_UCR(114, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimNotFoundForUCR", objects[0])),

  //Message
  MESSAGE_DUPLICATE_UUID(115, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.MessageDuplicateUuid", objects[0])),

  //Claim Response Exceptions
  CLAIM_RESPONSE_ERROR(116, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimResponseError", objects[0])),
  CLAIM_RETRIEVE_VALIDATION_ERROR(117, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveValidationError")),
  ECF_CLASS_USERID_AND_ACCOUNTCODE_MANDATORY_ERROR(119, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFClassUseridAndAccountcodeMandatoryError")),
  ECF_RESPONSE_NEEDS_AT_LEAST_ONE_COMMENT(120, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFResponseNeedsAtLeastOneComment")),
  ECF_RESPONSE_NEEDS_AT_LEAST_ONE_PUBLIC_COMMENT_OR_ONE_PRIVATE_COMMENT(121, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFResponseNeedsAtLeastOnePublicCommentOrOnePrivateComment")),
  ECF_PUBLIC_COMMENTS_MAXIMUM_LINES_EXCEEDED(127, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFPublicCommentsMaximumLinesExceeded", objects[0])),
  ECF_PRIVATE_COMMENTS_MAXIMUM_LINES_EXCEEDED(139, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFPrivateCommentsMaximumLinesExceeded", objects[0])),
  ECF_COMMENTS_MAXIMUM_LINES_EXCEEDED(140, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ECFCommentsMaximumLinesExceeded", objects[0])),

  //Validation Errors
  CLAIM_NOTIFY_INVALID_ACTION_CODE_ERROR(122, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimNotifyInvalidActionCodeError")),
  CLAIM_NOTIFY_INSURER_DETAILS_NOT_FOUND_ERROR(123, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimNotifyInsurerDetailsNotFoundError", objects[0], objects[1])),
  CLAIM_DATA_POLICY_UCR_NOT_FOUND_ERROR(124, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimDataPolicyUCRNotFoundError")),
  PARALLEL_CLAIM_UCR_NOT_FOUND_ERROR(125, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ParallelClaimUCRNotFoundError", objects[0])),
  PARALLEL_CLAIM_UCR_MATCHES_CURRENT_MESSAGE_UCR(126, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ParallelClaimUCRMatchesCurrentMessageUCR", objects[0])),
  MESSAGE_TRANSACTION_ALREADY_SUSPENDED_ERROR(138, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.MessageTransactionAlreadySuspendedError", objects[0], objects[1], objects[2])),
  MISSING_RECEIVER_FIELDS(144, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.MissingReceiverFields")),

  // Claim Retrieve Error Codes
  CLAIM_RETRIEVE_UNKNOWN_DESCRIPTION(128, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveUnknownDescription")),
  CLAIM_RETRIEVE_RESPONSE_CLASS_UNAVAILABLE(129, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseClassUnavailable")),
  CLAIM_RETRIEVE_RESPONSE_IMR_UNAVAILABLE(130, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseImrUnavailable")),
  CLAIM_RETRIEVE_RESPONSE_CENTRAL_SYSTEMS_UNAVAILABLE(131, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseCentralSystemsUnavailable")),
  CLAIM_RETRIEVE_RESPONSE_REQUEST_INVALID(132, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseRequestInvalid")),
  CLAIM_RETRIEVE_RESPONSE_SENDER_CLAIM_COMBINATION_INVALID(133, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseSenderClaimCombinationInvalid")),
  CLAIM_RETRIEVE_RESPONSE_CLAIM_NOT_FOUND(134, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseClaimNotFound")),
  CLAIM_RETRIEVE_RESPONSE_CARRIER_NOT_REGISTERED_TO_INVOKE_SERVICE(135, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseCarrierNotRegisteredToInvokeService")),
  CLAIM_RETRIEVE_RESPONSE_UNABLE_TO_RETRIEVE_CLAIM_TRANSACTION(136, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseUnableToRetrieveClaimTransaction")),
  CLAIM_RETRIEVE_RESPONSE_ORGANISATION_IS_CONFLICTED(137, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.ClaimRetrieveResponseOrganisationIsConflicted")),

  //Suspense queue Error codes
  SUSPENSE_QUEUE_NOT_UNIQUE_CLAIM_TRANSACTION(118, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.SuspenseQueueNotAllowToDeleteAdditionalMessages")),
  SUSPENSE_QUEUE_APPLY_TO_CLAIM_MESSAGES_CURRENTLY_SUSPENDED(143, \objects -> DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ECF.ReprocessingAgainstClaimNum.ClaimMessagesCurrentlySuspended")),

  // Connection Errors
  UNABLE_TO_CONNECT(141, \objects -> DisplayKey.get("Accelerator.IPLM.ECFErrorCodeType.UnableToConnect"))

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