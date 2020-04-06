package gw.acc.iplm.dto


final class ClaimNotifyRqWithCanRespondToFlagDTO {

  private final var _notifyRq: ECFMessageClaimNotifyRq_Ext as readonly NotifyRq
  private final var _canRespondTo: boolean as readonly CanRespondTo

  construct(final notifyRq: ECFMessageClaimNotifyRq_Ext, final canRespondTo: boolean){
    _notifyRq = notifyRq
    _canRespondTo = canRespondTo
  }
}