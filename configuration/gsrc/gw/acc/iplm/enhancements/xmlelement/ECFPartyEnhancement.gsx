package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party

enhancement ECFPartyEnhancement: Party {

  property get FirstId(): String {
    return this.Id_elem?.first()?.Value
  }

  property set FirstId(firstId : String) : void {
    if(this.Id?.Empty) {
      this.Id = {firstId}
    } else {
      this.Id_elem.first().Value = firstId
    }
  }

  property get FirstIdWithoutPrefixes(): String {
    return ECFUtils.stripPrefixesFromID(this.FirstId)
  }

  property get FirstAgency(): String {
    return this.Id_elem?.first()?.Agency
  }

  property set FirstAgency(firstAgency : String) {
    if(not this.Id?.Empty) {
      this.Id_elem.first().Agency = firstAgency
    }
  }

}
