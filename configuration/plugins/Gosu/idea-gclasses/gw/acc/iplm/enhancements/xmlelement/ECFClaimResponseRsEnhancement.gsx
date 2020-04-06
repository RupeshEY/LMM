package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs

enhancement ECFClaimResponseRsEnhancement: ClaimResponseRs {

  /**
   * Gets the ServiceProvider.Party.FirstId.
   */
  property get SenderPartyId(): String {
    return this.ServiceProvider.Party.FirstId
  }

  /**
   * Gets the ServiceProvider.Party.Name.
   */
  property get SenderPartyName(): String {
    return this.ServiceProvider.Party.Name
  }

  /**
   * Gets the Sender role.
   */
  property get SenderPartyRoleCd(): String {
    return this.Sender
  }

  /**
   * Gets the ServiceProvider.Party.FirstAgency.
   */
  property get SenderPartyAgency(): String {
    return this.ServiceProvider.Party.FirstAgency
  }

  /**
   * Gets the Insurer Id
   *
   * @return String
   */
  property get InsurerId(): String {
    return this.Insurer?.Party?.FirstId
  }

  /**
   * Gets the Insurer Name
   *
   * @return String
   */
  property get InsurerName(): String {
    return this.Insurer?.Party?.Name
  }

  /**
   * Gets the Receiver Role.
   */
  property get ReceiverPartyRoleCd(): String {
    return this.Receiver
  }

  /**
   * Gets the Insurer Agency
   *
   * @return String
   */
  property get InsurerAgency(): String {
    return this.Insurer?.Party?.FirstAgency
  }
}