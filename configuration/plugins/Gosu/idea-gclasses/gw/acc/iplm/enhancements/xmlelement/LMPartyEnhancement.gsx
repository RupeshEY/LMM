package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party

enhancement LMPartyEnhancement: Party {

  /**
   * Gets the first Id from the Party element
   * @return String - Party's first ID
   */
  property get FirstId() : String {
    return this.Id_elem?.first()?.Value
  }

  /**
   * Gets the first Agency from the Party element
   * @return String - Party's first Agency
   */
  property get FirstAgency() : String {
    return this.Id_elem?.first()?.Agency
  }

}
