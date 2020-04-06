package gw.fnolmapper.acord

uses xsd.acord.InsuredOrPrincipal
uses xsd.acord.ClaimsParty

/**
 * Interface for mapping ClaimContact entities.
 */
@Export
interface IContactMapper {
  /**
   * Creates a ClaimContact from the InsuredOrPrincipal
   */
  function getContact(principal:InsuredOrPrincipal, policy:Policy) : ClaimContact
  
  /**
   * Creates a ClaimContact from the ACORD ClaimsParty
   */
  function getContact(claimParty:ClaimsParty) : ClaimContact
}
