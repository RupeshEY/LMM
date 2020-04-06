package gw.acc.iplm.dto

uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs

/**
 * This class has only one instance of "Claim Notify Request" or "Claim Retrieve" at one time.
 * You can not instantiate this DTO with having both initialised values of Claim Notify Request
 * or Claim Retrieve Response objects.
 * <p>
 * The constructors enforce this rule.
 */
class ClaimMessageDTO {
  public var _claimNotifyRq: ClaimNotifyEventRq as readonly ClaimNotifyEventRq
  public var _claimRetrieveRs: RetrieveClaimRs as readonly ClaimRetrieveRs

  construct(claimNotifyRq: ClaimNotifyEventRq) {
    _claimNotifyRq = claimNotifyRq
  }

  construct(claimRetrieveRs: RetrieveClaimRs) {
    _claimRetrieveRs = claimRetrieveRs
  }
}