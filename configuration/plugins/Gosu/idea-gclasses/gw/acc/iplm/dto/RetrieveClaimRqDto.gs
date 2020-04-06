package gw.acc.iplm.dto

uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party


class RetrieveClaimRqDto {
  private var _ucr: String as UCR
  private var _umr: String as UMR
  private var _tr: String as TR
  private var _sender: PartyDto as Sender
  private var _claimType: ECFClaimTypeCode_Ext as ClaimType
  private var _claimLineNumber: String as ClaimLineNumber
  private var _calledFromClaim: Boolean as CalledFromClaim

  public construct() {
  }

  public construct(ucr: String, umr: String, tr: String, sender: Party, claimLineNumber: String, claimType: ECFClaimTypeCode_Ext, calledFromClaim: Boolean) {
    _ucr = ucr
    _umr = umr
    _tr = tr
    _sender = sender != null ? new PartyDto(sender) : null
    _claimLineNumber = claimLineNumber
    _claimType = claimType
    _calledFromClaim = calledFromClaim
  }
}