package gw.contactmapper.ab900


/**
 * Returns the ContactIntegrationMapper to be used by ClaimCenter
 * for integration.  It's @Export so customers can make the mapper() method return
 * a different ContactIntegrationMapper.
 */
@Export
class ContactIntegrationMapperFactory {

  public static function mapper() : gw.contactmapper.ab900.ContactIntegrationMapper {
    return new gw.contactmapper.ab900.ContactMapper()
  }
}
