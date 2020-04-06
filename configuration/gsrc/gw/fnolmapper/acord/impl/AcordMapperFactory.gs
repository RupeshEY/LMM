package gw.fnolmapper.acord.impl

uses gw.fnolmapper.acord.IMapperFactory
uses gw.fnolmapper.acord.IContactMapper
uses gw.fnolmapper.acord.IAddressMapper
uses gw.fnolmapper.acord.IExposureMapper
uses gw.fnolmapper.acord.IIncidentMapper
uses gw.fnolmapper.acord.IPolicyMapper
uses gw.fnolmapper.acord.AcordConfig
uses gw.fnolmapper.acord.ContactManager

/**
 * Default implementation of IMapperFactory that creates the
 * default implementations of the various mapper classes.
 */
@Export
class AcordMapperFactory implements IMapperFactory {

  var acordConfig:AcordConfig

  construct(config:AcordConfig) {
    acordConfig = config
  }
  
  override function getAddressMapper() : IAddressMapper {
    return new AcordAddressMapper(acordConfig)
  }

  override function getContactMapper() : IContactMapper {
    return new AcordContactMapper(acordConfig)
  }

  override function getExposureMapper(contactManager:ContactManager) : IExposureMapper {
    return new AcordExposureMapper(acordConfig, contactManager)
  }

  override function getIncidentMapper(contactManager:ContactManager) : IIncidentMapper {
    return new AcordIncidentMapper(acordConfig, contactManager)
  }

  override function getPolicyMapper() : IPolicyMapper {
    return new AcordPolicyMapper(acordConfig)
  }

}
