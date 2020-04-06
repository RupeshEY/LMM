package gw.fnolmapper.acord

uses xsd.acord.Addr

/**
 * Interface for mapping Address entities.
 */
@Export
interface IAddressMapper {
  /**
   * Creates an entity.Address from an ACORD Addr_Type.
   */
  function getAddress(addr:Addr) : Address
}
