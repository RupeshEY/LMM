package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.utils.ECFUtils

enhancement ECFContractMarket_ExtEnhancement: ECFContractMarket_Ext {

  /**
   * Returns the Party ID for this ECFContractMarket_Ext entity without the added
   * Xchanging prefixes.
   *
   * For example: An ID of "urn:ilu:1234" will return "1234".
   *
   * @return String representation of the PartyID without prefixes
   */
  property get PartyIdWithoutPrefixes(): String {
    return ECFUtils.stripPrefixesFromID(this.PartyID)
  }

}
