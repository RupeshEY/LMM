package gw.api.address

uses java.util.Set

/**
 * Extends the platform AddressOwner to add in ClaimCenter specific UI
 * fields. A CCAddressOwner is used as the argument to the generic
 * AddressInputSet. The generic AddressInputSet calls methods and
 * properties on the CCAddressOwner to decide which fields to show, which
 * fields should be required, how to get/set the Address object etc. This
 * allows a single modal AddressInputSet to be re-used in many different
 * situations, which makes it easier to add new countries to the system.
 * <p>
 * Overall, there are three different levels at which address fields can be
 * configured:
 * <ul>
 * <li> Simple global changes can be made by altering the constant sets of
 *      values in CCAddressOwnerFieldId
 * <li> Country specific changes can be made by adding a country specific
 *      CountryAddressFields object (see CountryAddressFields for details)
 * <li> Changes specific to a particular use of AddressInputSet can be made
 *      by adding or altering the particular CCAddressOwner passed into that
 *      input set; this owner object can override any country specific or
 *      global defaults
 * </ul>
 */
@Export
interface CCAddressOwner extends AddressOwner {

  /**
   * The addresses to show in the dropdown from which the user can select
   * pre-populated addresses. If this method returns null then no drop down
   * will be shown.
   */
  property get Addresses() : Address[]

  /**
   * Get or create a new address for use in the address dropdown. This address
   * will be used if the user selects "New..." from the dropdown. This method
   * should only return a single new address if called multiple times for the
   * same address owner as part of the same transaction.
   */
  function getOrCreateNewAddress() : Address

  /**
   * Set of addresses that cannot be edited. If an address appears in Addresses
   * and also in NonEditableAddresses it can be selected from the dropdown but
   * the address fields will then be readonly.
   */
  property get NonEditableAddresses() : Set<Address>

  /**
   * If non null then the address input set can display two claim specific
   * fields:
   * <ul>
   * <li>The claim loss location code, Claim.LossLocationCode, a simple string field
   * <li>The claim jurisdiction state, Claim.JurisdictionState
   * </ul>
   * These fields are only visible if Claim returns a non null value and they are
   * not in the HiddenFields list.
   */
  property get Claim() : Claim  

  /**
   * The default country to use if the current address is null
   */
  property get DefaultCountry() : Country
  
  /**
   * Set the currently selected country
   */
  override property set SelectedCountry(value : Country)

  /**
   * The mode to use for the address input set. This is nearly always the same as
   * the selected country. The only exception is when the address input set is
   * being used as part of a search screen. In that case the default country and
   * selected country can both return null (it's common to want to do a search with
   * no country set). However the input set mode will still return a country, typically
   * the global default country, if the currently selected country is null.
   */
  property get InputSetMode() : Country

  /**
   * Should the address be shown as a summary rather than in separate input fields?
   * This property should always return false if the current location is editable,
   * because if you're editing an address you're going to need to edit the individual
   * fields (the address line 1, city, state etc.). But if the location is readonly
   * it may or may not be appropriate to show just a summary of the address (e.g.
   * "3 Some St, Some City, CA") rather than listing each field separately
   */
  override property get ShowAddressSummary() : boolean
  
  /**
   * Should a confirmation message be shown when the country is changed? This is
   * usually true, except on search screens
   */
  property get ConfirmCountryChange() : boolean
  
  /**
   * The label to use for the range input used to pick from a list of addresses,
   * and also for the summary of the address (these are never both visible at
   * the same time, you only see either the range input or the summary). Most
   * implementors should just return null from this property, in which case a
   * default display key of the form "Web.Address.XX.Name" will be used,
   * where XX is the country code. But if this property returns a non null String
   * it will be used instead
   */
  override property get AddressNameLabel() : String
  
  /**
   * The Jurisdiction corresponding to the Address
   */
  property get Jurisdiction() : Jurisdiction 
  
  /**
   * Sets the Claim.JurisdictionState
   */
  property set Jurisdiction (value: Jurisdiction)

  /**
   * Gets the Jurisdictions corresponding to the InputSetMode
   */
  property get Jurisdictions() : Jurisdiction[] 
}
