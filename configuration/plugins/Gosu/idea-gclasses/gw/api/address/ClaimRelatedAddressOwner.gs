package gw.api.address
uses java.util.Set
uses gw.entity.IEntityPropertyInfo
uses gw.util.concurrent.LocklessLazyVar
uses java.util.HashSet

/**
 * Superclass for claim related address owner objects, which will typically
 * display a drop down of the claim's related addresses.
 * <ul>
 * <li>The list of addresses to display comes from the claim's Addresses property
 * <li>The set of non editable addresses is determined by calling
 *     claim.canEditAddress on each address in the list of addresses
 * <li>The default implementation of the Claim property returns null. This
 *     property should only be non null when actually setting the claim's
 *     loss location
 * </ul>
 */
@Export
abstract class ClaimRelatedAddressOwner extends CCAddressOwnerBase {
  
  private var _claim : Claim as readonly RelatedClaim
  private var _nonEditableAddresses = LocklessLazyVar.make(\ -> findNonEditableAddresses())

  construct(prop : IEntityPropertyInfo, inClaim : Claim) {
    super(prop)
    _claim = inClaim
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getClaimFileRequiredFields(_claim)
  }

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getClaimFileHiddenFields(_claim)
  }

  override property get Addresses() : Address[] {
    return addOriginalValue(_claim.Addresses)
  }
  
  override property get NonEditableAddresses() : Set<Address> {
    return _nonEditableAddresses.get();
  }

  override property get DefaultCountry() : Country {
     return (_claim.Policy.insured.PrimaryAddress.Country != null)
             ? _claim.Policy.insured.PrimaryAddress.Country
             : super.DefaultCountry
  }

  private function findNonEditableAddresses() : Set<Address> {
    var result = _claim.Policy.Verified
            ? _claim.Policy.Addresses.toSet().intersect(Addresses.toSet())
            : new HashSet<Address>()
    result.add(null)
    return result
  }
}
