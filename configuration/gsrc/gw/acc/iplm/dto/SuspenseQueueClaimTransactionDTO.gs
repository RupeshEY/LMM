package gw.acc.iplm.dto

class SuspenseQueueClaimTransactionDTO {
  var _ucr: String as UCR
  var _umr: String as UMR
  var _tr: String as TR

  public construct(umr: String, ucr: String, tr: String) {
    _ucr = ucr
    _umr = umr
    _tr = tr
  }
}