package gw.api.address
uses gw.api.locale.DisplayKey
uses java.util.Set
uses java.lang.IllegalArgumentException
uses gw.api.util.LocationUtil
uses gw.api.admin.BaseAdminUtil
uses gw.entity.IEntityPropertyInfo
uses gw.util.concurrent.LocklessLazyVar
uses java.util.HashSet
uses java.lang.UnsupportedOperationException

/**
 * A rather complex CCAddressOwner that allows the AddressInputSet to be used
 * to pick the policy location for a FixedPropertyIncident. It presents all
 * addresses belonging to the available policy locations and, when the user
 * picks an address, it finds the corresponding policy location and sets that
 * on the FixedPropertyIncident.
 * <p>
 * In this address owner, only the actual address name field is required i.e.
 * you have to set an address but it can be empty. This is for backwards
 * compatibility with previous versions of ClaimCenter. Customers may prefer
 * to use the standard claim file required fields
 */
@Export
class FixedPropertyAddressOwner extends AddressOwnerBase implements CCAddressOwner {

  var _fixedPropertyIncident : FixedPropertyIncident
  var _newPolicyLocation : PolicyLocation
  var _propertyAddressValueRange = LocklessLazyVar.make(\ -> _fixedPropertyIncident.PropertyAddressValueRange)
  var _nonEditableAddresses = LocklessLazyVar.make(\ -> findNonEditableAddresses())
  
  construct(fixedPropertyIncident : FixedPropertyIncident, newPolicyLocation : PolicyLocation) {
    _fixedPropertyIncident = fixedPropertyIncident
    _newPolicyLocation = newPolicyLocation
  }

  override property get Address() : Address {
    return _fixedPropertyIncident.Property.Address
  }

  override property set Address(value : Address) {
    if (value != Address) {
      setPolicyLocationFromAddress(value)
    }
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return { CCAddressOwnerFieldId.ADDRESS_NAME }
  }

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return CCAddressOwnerFieldId.VALIDUNTIL_ADDRESSTYPE_HIDDEN
  }

  override property get Addresses() : Address[] {
    return _propertyAddressValueRange.get().map(\ p -> p.Address)
  }

  override function getOrCreateNewAddress() : Address {
    var prop = entity.PolicyLocation.Type.TypeInfo.getProperty("Address") as IEntityPropertyInfo

    //If the policy location is not in the bundle, we need to add it back before looking for the address
    //This can happen after a validation error, as evictUnrootedBeans will remove the policy location
    if(_newPolicyLocation.Bundle == null) {
      _newPolicyLocation = _fixedPropertyIncident.Bundle.add(_newPolicyLocation)
    }

    return CCAddressOwnerUtil.getOrCreateNewBeanFor(_newPolicyLocation, prop, \ -> {
      var result = new Address()
      result.Country = DefaultCountry
      _newPolicyLocation.Address = result
      return result
    })
  }

  override property get NonEditableAddresses() : Set<Address> {
    return _nonEditableAddresses.get()
  }

  override property get Claim() : Claim {
    return null
  }

  override property get DefaultCountry() : Country {
    var incidentClaim = _fixedPropertyIncident.Claim
    return (incidentClaim.Policy.insured.PrimaryAddress.Country != null)
             ? incidentClaim.Policy.insured.PrimaryAddress.Country
             : BaseAdminUtil.getDefaultCountry()
  }

  override property get SelectedCountry() : Country {
    var addressCountry = Address.Country
    return addressCountry != null ? addressCountry : DefaultCountry
  }

  override property set SelectedCountry(newValue : Country) {
    var normalizedNewValue = newValue != null ? newValue : DefaultCountry
    if (this.Address != null or normalizedNewValue != DefaultCountry) {
      super.SelectedCountry = normalizedNewValue
    }
  }

  override property get InputSetMode() : Country {
    return SelectedCountry
  }

  override property get ShowAddressSummary() : boolean {
    return not InEditMode
  }

  override property get ConfirmCountryChange() : boolean {
    return true
  }

  /**
   * Override the address name to make it clear the user is picking a property
   * (policy location) not just an address.
   */
  override property get AddressNameLabel() : String {
    return DisplayKey.get("Web.FixedPropertyIncident.Property.Picker")
  }

  override function isAvailable(fieldId : AddressOwnerFieldId) : boolean {
    return not this.NonEditableAddresses.contains(this.Address)
  }

  /**
   * Look up the existing policy location with the given address and, if found,
   * set it to be the incident's current location. If the address corresponds to
   * the new policy location then set incident's location to be the new policy
   * location. If the address is null set the incident's policy location to null.
   */
  private function setPolicyLocationFromAddress(newValue : Address) {
    if (newValue != null) {
      var policyLocationMatch = findExistingPolicyLocationForAddress(newValue)
      if (policyLocationMatch != null) {
        _fixedPropertyIncident.Property = policyLocationMatch
      } else if (_newPolicyLocation.Address == newValue) {
        _fixedPropertyIncident.Property = _newPolicyLocation
      } else {
        throw new IllegalArgumentException("Address must be new or belong to a PolicyLocation.")
      }
    } else {
      _fixedPropertyIncident.Property = null
    }
  }

  /**
   * Any addresses that come from a verified policy must not be edited
   */
  private function findNonEditableAddresses() : Set<Address> {
    var incidentClaim = _fixedPropertyIncident.Claim
    var readOnlyProperties = incidentClaim.Policy.Verified
            ? incidentClaim.PolicyProperties.toSet().intersect(_propertyAddressValueRange.get().toSet())
            : new HashSet<PolicyLocation>()
    var readOnlyAddresses = readOnlyProperties.map(\ p -> p.Address).toSet()
    readOnlyAddresses.add(null)
    return readOnlyAddresses
  }

  private function findExistingPolicyLocationForAddress(policyLocationAddress : Address) : PolicyLocation {
    return _propertyAddressValueRange.get()
            .firstWhere(\ p -> p.Address == policyLocationAddress)
  }
  
  override property get Jurisdiction() : Jurisdiction {
    return null
  }
  
  override property set Jurisdiction(newValue : Jurisdiction)  {
    throw new UnsupportedOperationException("Cannot set jurisdiction on a fixed property address owner")
  }
  
  override property get Jurisdictions() : Jurisdiction[] {
    return null
  }
}
