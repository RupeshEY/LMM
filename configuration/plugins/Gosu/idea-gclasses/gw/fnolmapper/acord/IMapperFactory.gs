package gw.fnolmapper.acord

/**
 * IMapperFactory is an abstract factory for obtaining instances of the
 * various mapper classes used to map ACORD elements to ClaimCenter entities.
 * Anyone wishing to customize the way a particular mapping is performed should
 * also provide their own implementation of IMapperFactory.
 */
@Export
interface IMapperFactory 
{
  /**
   * Gets the IAddressMapper implementation.
   */
  function getAddressMapper() : IAddressMapper
  
  /**
   * Gets the IContactMapper implementation.
   */
  function getContactMapper() : IContactMapper
  
  /**
   * Gets the IExposureMapper implementation.
   */
  function getExposureMapper(contactManager:ContactManager) : IExposureMapper
  
  /**
   * Gets the IIncidentMapper implementation.
   */
  function getIncidentMapper(contactManager:ContactManager) : IIncidentMapper
  
  /**
   * Gets the IPolicyMapper implementation.
   */
  function getPolicyMapper() : IPolicyMapper
}