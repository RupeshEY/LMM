package gw.fnolmapper.acord

uses xsd.acord.ClaimsNotificationAddRq

/**
 * Maps the ACORD policy element to the Policy entity.
 */
@Export
interface IPolicyMapper {
  /**
   * Populates an (empty) entity.Policy from an ACORD ClaimsNotificatoinAddRq.
   */
  function populate(claimPolicy:Policy, req:ClaimsNotificationAddRq)
}
