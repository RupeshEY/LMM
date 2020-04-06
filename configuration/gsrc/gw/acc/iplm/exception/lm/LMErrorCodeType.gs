package gw.acc.iplm.exception.lm

uses gw.api.locale.DisplayKey

/**
 * LM Error Code Types, to manage all type of exception in LM Services
 */
enum LMErrorCodeType {
  CLAIM_UCR_NOT_FOUND(301, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.ClaimUCRNotFound", objects[0])),
  CLAIM_MISSING(302, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.ClaimIsEmpty")),
  CLAIM_HAS_NO_MESSAGES(303, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.ClaimHasNoMessages", objects[0])),
  POLICY_NUMBER_BLANK(304, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.PolicyNumberBlank")),
  UCR_AND_POLICY_NUMBER_NOT_FOUND(305, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.UCRAndPolicyNumberNotFound")),
  INVALID_SEQUENCE(306, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.InvalidSequence")),
  PREVIOUS_MOVEMENT_NOT_POSTED(307, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.PreviousMovementNotPosted")),
  NO_BROKING_COMPANY_IDENTIFIED(308, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.NoBrokingCompanyIdentified")),
  RISK_CODE_NULL_OR_NOT_FOUND(309, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.RiskCodeNotFound")),
  DUPLICATE_MOVEMENT(310, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.DuplicateMovement")),
  UNKNOWN_SETTLEMENT_CURRENCY(311, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.UnknownSettlementCurrency")),
  UNKNOWN_ORIGINAL_CURRENCY(312, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.UnknownOriginalCurrency")),
  NO_CLAIM_FOR_OUT_OF_SEQUENCE_MESSAGE(313, \objects -> DisplayKey.get("Accelerator.IPLM.LMErrorCodeType.OutOfSequenceMessageWithNoClaim"))

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