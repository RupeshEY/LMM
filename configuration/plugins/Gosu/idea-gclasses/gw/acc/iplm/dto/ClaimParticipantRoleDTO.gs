package gw.acc.iplm.dto

uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer

class ClaimParticipantRoleDTO {

  public var _agreementPartyModifiedIndicator: boolean
  public var _role: String as Role
  public var _bureau: String as Bureau
  public var _partyName: String as PartyName
  public var _partyId: String as PartyID
  var _insurerOrReinsurer: ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer

  construct(insurerOrReinsurer: ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer) {
    _insurerOrReinsurer = insurerOrReinsurer
  }

  property get AgreementPartyModifiedIndicator(): boolean {
    return _agreementPartyModifiedIndicator
  }

  property set AgreementPartyModifiedIndicator(value: boolean) {
    _agreementPartyModifiedIndicator = value
    _insurerOrReinsurer.AgreementPartyModifiedIndicator = value ? Add : Rem
  }
}