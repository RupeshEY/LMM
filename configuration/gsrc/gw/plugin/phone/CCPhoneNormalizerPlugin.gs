package gw.plugin.phone

uses gw.api.phone.AbstractPhoneNormalizerPlugin
uses java.util.Map
uses gw.entity.IEntityType
uses gw.api.util.phone.EntityPhoneMapper
uses gw.api.phone.ContactPhoneMappers
uses java.util.HashMap
uses java.util.List

/**
 * ClaimCenter implementation of the gw.plugin.phone.IPhoneNormalizerPlugin.
 */
@Export
class CCPhoneNormalizerPlugin extends AbstractPhoneNormalizerPlugin {

  override property get EntityPhoneMapperEntries(): Map <IEntityType, List <EntityPhoneMapper>> {

    var phoneMapper = new HashMap<IEntityType, List<EntityPhoneMapper>>()
    ContactPhoneMappers.addContactPhoneMappers(phoneMapper)
    //PolicyLocationSummary
    var policyLocationPhoneMapper =
        new EntityPhoneMapper(PolicyLocationSummary).withPhoneColumns("PhoneCountry", "Phone", "PhoneExtension")
    phoneMapper[PolicyLocationSummary] = { policyLocationPhoneMapper }

    return phoneMapper
  }
}