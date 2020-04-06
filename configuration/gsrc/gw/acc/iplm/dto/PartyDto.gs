package gw.acc.iplm.dto

uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party


class PartyDto {
  var _sender: Party as Party
  var _id: String as Id
  var _senderName: String as Name
  var _agency: String as Agency

  public construct() {
  }

  public construct(party: Party) {
    _sender = party
    _id = party.FirstId
    _senderName = party.Name
    _agency = party.FirstAgency
  }

  public construct(id: String, name: String, agency: String) {
    _sender = ECFUtils.createParty(agency, id, name)
    _id = id
    _senderName = name
    _agency = agency
  }
}