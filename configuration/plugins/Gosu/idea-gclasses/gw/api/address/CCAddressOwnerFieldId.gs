package gw.api.address

uses java.util.Set
uses java.util.HashSet

/**
 * A class that contains the defined field id constants, useful sets of field
 * ids and utilities for use by CountryAddressFields and CCAddressOwners.
 * <p>
 * This class is intended to be the first place to go for customizing the
 * hidden and required fields in the address input sets and is a good place
 * for making global changes e.g. deciding which fields will be required for
 * addresses in the claim file in most countries. It is also the place for
 * adding new address owner fields which are not present out of box.
 * <p>
 * Overall, there are three different levels at which address fields can be
 * configured:
 * <ul>
 * <li> Simple global changes can be made by altering the constant sets of
 *      values in this class, CCAddressOwnerFieldId
 * <li> Country specific changes can be made by adding a country specific
 *      CountryAddressFields object (see CountryAddressFields for details)
 * <li> Changes specific to a particular use of AddressInputSet can be made
 *      by adding or altering the particular CCAddressOwner passed into that
 *      input set; this owner object can override any country specific or
 *      global defaults
 * </ul>
 */
@Export
class CCAddressOwnerFieldId extends AddressOwnerFieldId {

  /** Never instantiate the subclass; just use AddressOwnerFieldId constructor */
  private construct(aName : String) {
    super(aName)
  }

  /*
   * CC specific fields that can be used in a CCAddressOwner
   */
   
  /**
   * Field id for the address name field - the range input used to select one of
   * a range of addresses (if Addresses returns such a range). If your address
   * owner uses this range input and has some required fields on the address then
   * it should typically include ADDRESS_NAME in the set of required fields as
   * well; this will prevent the "none selected" option from showing up unless it
   * is really needed
   */
  public static final var ADDRESS_NAME : AddressOwnerFieldId = new AddressOwnerFieldId("Address_Name")

  /**
   * Claim specific field - location code
   */
  public static final var LOCATIONCODE : AddressOwnerFieldId = new AddressOwnerFieldId("LocationCode")

  /**
   * Claim specific field - jurisdiction state
   */
  public static final var JURISDICTIONSTATE : AddressOwnerFieldId = new AddressOwnerFieldId("JurisdictionState")

  /*
   * Useful pre declared sets of fields
   */

  /** Claim specific fields that are not actually part of an address */
  public static final var NON_ADDRESS_FIELDS : Set<AddressOwnerFieldId>
          = new HashSet<AddressOwnerFieldId>() {LOCATIONCODE, JURISDICTIONSTATE}.freeze()

  /** Commonly used set of required fields - just city and state required */
  public static final var CITY_STATE_REQUIRED : Set<AddressOwnerFieldId>
          = normalizeRequiredFields(new HashSet<AddressOwnerFieldId>() {CITY, STATE}.freeze())

  /** Commonly used set of hidden fields - just valid until and address type hidden */
  public static final var VALIDUNTIL_ADDRESSTYPE_HIDDEN : Set<AddressOwnerFieldId>
          = new HashSet<AddressOwnerFieldId>() {VALIDUNTIL, ADDRESSTYPE}.freeze()
  
  /** We normally hide the location code and jurisdiction state for workers comp claims */
  public static final var WC_HIDDEN_FIELDS : Set<AddressOwnerFieldId>
          = VALIDUNTIL_ADDRESSTYPE_HIDDEN.union(NON_ADDRESS_FIELDS).freeze()

  /** Place addresses require a postal code */
  public static final var POSTALCODE_REQUIRED : Set<AddressOwnerFieldId>
          = normalizeRequiredFields(new HashSet<AddressOwnerFieldId>() {POSTALCODE}.freeze())

  /** We normally hide all but the most important fields for search screens */
  public static final var SEARCH_HIDDEN_FIELDS : Set<AddressOwnerFieldId>
          = VALIDUNTIL_ADDRESSTYPE_HIDDEN.union(HIDDEN_FOR_SEARCH).union({
                  ADDRESSTYPE, DESCRIPTION, VALIDUNTIL, LOCATIONCODE, JURISDICTIONSTATE}).freeze()
  
  /** Basic set of address fields */
  public static final var BASE_ADDRESS_REQUIRED : Set<AddressOwnerFieldId> = 
          normalizeRequiredFields(new HashSet<AddressOwnerFieldId>() {ADDRESSLINE1,
                    CITY,
                    STATE,
                    POSTALCODE}.freeze())
  
  /*
   * Utility functions for handling sets of field ids
   */

  /**
   * Utility function that, given a set of required fields, adds in the
   * ADDRESS_NAME Field id if not already present and if the set contains
   * any fields that are actually part of the address; in practice this means
   * any fields that are not LOCATIONCODE or JURISDICTIONSTATE. This function
   * is useful because nearly always, if one address field is required then
   * you want the picker field (ADDRESS_NAME) to be required too.
   */
  static function normalizeRequiredFields(fields : Set<AddressOwnerFieldId>) : Set<AddressOwnerFieldId> {
    var result = fields
    if (result.HasElements
            and not result.contains(ADDRESS_NAME)
            and not NON_ADDRESS_FIELDS.containsAll(result)) {
      result = result.copy()
      result.add(ADDRESS_NAME)
      result = result.freeze()
    }
    return result
  }

}