package gw.api.address
uses java.util.Set
uses java.util.concurrent.ConcurrentHashMap
uses gw.lang.reflect.TypeSystem
uses gw.api.admin.BaseAdminUtil
uses gw.api.contact.AddressAutocompleteUtil

/**
 * Used for per country address configuration; defines which fields should be
 * visible or required for a particular country. The general pattern is to call
 * something like:
 * <pre>
 *   CountryAddressFieldsProvider.forCountry(country).getClaimFileRequiredFields(claim)
 * </pre>
 * That is you call forCountry to get the CountryAddressFields object for a
 * particular country and then call a method on that object to get the required
 * or hidden fields for a particular context for that country.
 * <p>
 * In the out of box configuration there is just one CountryAddressFields
 * class which is generic enough to be used for all countries in a simple
 * configuration. To add a country specific CountryAddressObject, create a new
 * class in the countryfields sub package of this package (gw.api.address.countryfields)
 * and call it CountryAddressFields_XX, where XX is the country code (e.g. US,
 * AU, GB etc.). This class should have a constructor that takes no arguments,
 * for example:
 * <pre>
 *   class CountryAddressFields_GB extends CountryAddressFields {
 *
 *     construct() {
 *       super("GB")
 *     }
 * </pre>
 * The subclass can override any number of the methods provided by
 * CountryAddressFields. The subclass will only be instantiated once and then
 * shared, so it should not have any mutable state and should just return
 * constant values.
 * <p>
 * Overall, there are three different levels at which address fields can be
 * configured:
 * <ul>
 * <li> Simple global changes can be made by altering the constant sets of
 *      values in CCAddressOwnerFieldId
 * <li> Country specific changes can be made by adding a country specific
 *      CountryAddressFields object (as described above)
 * <li> Changes specific to a particular use of AddressInputSet can be made
 *      by adding or altering the particular CCAddressOwner passed into that
 *      input set; this owner object can override any country specific or
 *      global defaults
 * </ul>
 */
@Export
class CountryAddressFields {

  private var _country : Country as readonly Country
  private var _hasStates : boolean

  /**
   * Only intended for use by subclassers. Normal users should call the
   * forCountry method to get the CountryAddressFields object for a
   * particular country.
   */  
  protected construct(inCountry : Country) {
    _country = inCountry
    _hasStates = AddressAutocompleteUtil.getStates(inCountry).HasElements
  }

  /**
   * The required fields used for most address input sets that are part of the
   * claim file (e.g. loss location, policy location etc.). One exception will
   * be address input sets used for the addresses of claim contacts; these are
   * considered to be contact addresses rather than claim file addresses.
   */
  function getClaimFileRequiredFields(claim : Claim) : Set<AddressOwnerFieldId> {
    // Default implementation ignores claim type and country
    return CCAddressOwnerFieldId.CITY_STATE_REQUIRED
  }

  /**
   * The hidden fields used for most address input sets that are part of the
   * claim file (e.g. loss location, policy location etc.). One exception will
   * be address input sets used for the addresses of claim contacts; these are
   * considered to be contact addresses rather than claim file addresses
   */
  function getClaimFileHiddenFields(claim : Claim) : Set<AddressOwnerFieldId> {
    // Default implementation ignores country
    return claim.LossType == LossType.TC_WC ? CCAddressOwnerFieldId.WC_HIDDEN_FIELDS : CCAddressOwnerFieldId.VALIDUNTIL_ADDRESSTYPE_HIDDEN
  }
 
  /**
   * The required fields used for address input sets that are used for the
   * contact primary address
   */
  function getContactRequiredFields(contact : Contact) : Set<AddressOwnerFieldId> {
    // Default implementation ignores country
    var result = CCAddressOwnerFieldId.NO_FIELDS

    if (contact typeis Place) {
      result = CCAddressOwnerFieldId.BASE_ADDRESS_REQUIRED
    } 
    
    return result
  }

  /**
   * The hidden fields used for address input sets that are used for the
   * contact primary address
   */
  function getContactHiddenFields(contact : Contact) : Set<AddressOwnerFieldId> {
    // Default implementation ignores contact type and country
    return CCAddressOwnerFieldId.NO_FIELDS
  }

  /**
   * The hidden fields used for address input sets that are used for searching
   * (it is assumed that there will be no required fields for searching though
   * this can be changed in the appropriate CCAddressOwner object if necessary). 
   */
  property get SearchHiddenFields() : Set<AddressOwnerFieldId> {
    // Default implementation ignores country
    return CCAddressOwnerFieldId.SEARCH_HIDDEN_FIELDS
  }

  /**
   * True if this country has states, false otherwise. Used in the visibility
   * expression of fields in the UI that show state information
   */
  property get IsCountryWithStates() : boolean {
    return _hasStates
  }

  /**
   * Static utility that returns true if the default country has states; just
   * looks up the CountryAddressFields object for the default country and then
   * calls IsCountryWithStates. Used in the visibility expression of fields in
   * the UI that show state information
   */
  @Deprecated("This property should not be used because the caller should check the country applicable to its context, rather than the system default country.")
  static property get DefaultCountryHasStates() : boolean {
    return CountryAddressFieldsProvider.forCountry(BaseAdminUtil.getDefaultCountry()).IsCountryWithStates
  }

}
