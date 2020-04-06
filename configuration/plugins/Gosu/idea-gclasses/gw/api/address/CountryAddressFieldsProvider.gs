package gw.api.address

uses gw.lang.reflect.TypeSystem

uses java.util.concurrent.ConcurrentHashMap

@Export
class CountryAddressFieldsProvider {

  private static var countryConfigMap = new ConcurrentHashMap<Country, CountryAddressFields>()
  /**
   * Return the CountryAddressFields object for the given country. There is
   * one and only one object per country. If there is no country specific
   * CountryAddressFields subclass for the given country then an instance
   * of CountryAddressFields is used.
   */
  public static function forCountry(currentCountry : Country) : CountryAddressFields {
    if (currentCountry == null) {
      return new CountryAddressFields(currentCountry)
    }
    var currentCountryConfig = countryConfigMap.get(currentCountry)
    if (currentCountryConfig == null) {
      var typeForCountrySpecificConfig = TypeSystem.getByFullNameIfValid("gw.api.address.countryfields.CountryAddressFields_" + currentCountry.Code)
      if (typeForCountrySpecificConfig != null) {
        currentCountryConfig = typeForCountrySpecificConfig.TypeInfo.Constructors[0].Constructor.newInstance(null) as CountryAddressFields
      } else {
        currentCountryConfig = new CountryAddressFields(currentCountry)
      }
      countryConfigMap.put(currentCountry, currentCountryConfig)
    }

    return currentCountryConfig
  }
}