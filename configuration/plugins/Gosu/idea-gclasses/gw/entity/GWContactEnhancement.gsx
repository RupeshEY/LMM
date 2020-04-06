package gw.entity

/**
 * Add a Country enhancement to Contact for use by the field validator mechanism. The Country property is called to 
 * determine the country to use when selecting a country specific field validator, such as for a phone number or
 * postal code.
 */
@Export
enhancement GWContactEnhancement : entity.Contact {
  
  /**
   * The country for this contact; uses the primary address country or, if that is null, the default country from
   * the global configuration.
   */
  property get Country() : Country {
    return this.PrimaryAddress.Country != null ? this.PrimaryAddress.Country : gw.api.admin.BaseAdminUtil.getDefaultCountry()
  }

  /**
   * Checks if this is a contact with a Vendor tag and if it is linked to ContactManager
   * @return whether this contact is a vendor and has an AddressBookUID
   */
  property get VendorLinkedToAddressBook() : boolean {
    return this.Tags.hasMatch(\ tag -> tag.getType() == ContactTagType.TC_VENDOR) and this.AddressBookUID != null
  }
}
