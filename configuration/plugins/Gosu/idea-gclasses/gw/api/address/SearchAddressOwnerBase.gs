package gw.api.address
uses gw.api.locale.DisplayKey
uses java.util.Set
uses java.lang.UnsupportedOperationException
uses java.util.Collections
uses gw.api.admin.BaseAdminUtil

/**
 * Base class for address owners used to display addresses on search
 * screens. On search screens we typically:
 * <ul>
 * <li>Display only a few fields, the ones that are most important for
 *     searching
 * <li>Don't require any fields to be filled out
 * <li>Allow the currently selected country to be null
 * <li>Don't ask for confirmation when changing country
 * </ul>
 */
@Export 
abstract class SearchAddressOwnerBase extends AddressOwnerBase implements CCAddressOwner {

  construct() {
  }

  override property set Address(value : Address) {
    throw new UnsupportedOperationException("Cannot set address on a search address owner")
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return CCAddressOwnerFieldId.NO_FIELDS
  }

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return CCAddressOwnerFieldId.SEARCH_HIDDEN_FIELDS
  }

  override property get Addresses() : Address[] {
    return null
  }

  override function getOrCreateNewAddress() : Address {
    return CCAddressOwnerUtil.createNewNonPersistentAddress(Address.Bundle)
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Collections.emptySet<Address>()
  }

  override property get Claim() : Claim {
    return null
  }

  override property get DefaultCountry() : Country {
    return null
  }

  override property get SelectedCountry() : Country {
    return Address.Country
  }

  override property set SelectedCountry(value : Country) {
    super.SelectedCountry = value
  }

  override property get InputSetMode() : Country {
    return SelectedCountry != null ? SelectedCountry : BaseAdminUtil.getDefaultCountry()
  }

  override property get ShowAddressSummary() : boolean {
    return false
  }

  override property get ConfirmCountryChange() : boolean {
    return false
  }

  override property get AddressNameLabel() : String {
    return DisplayKey.get("Web.Address.Default.Name")
  }

  override property get Jurisdiction() : Jurisdiction {
    return null
  }

  override property set Jurisdiction(newValue : Jurisdiction)  {
    throw new UnsupportedOperationException("Cannot set jurisdiction on a search address owner")
  }

  override property get Jurisdictions() : Jurisdiction[] {
    return null
  }
}
