package gw.api.address
uses gw.entity.IEntityPropertyInfo
uses java.util.Set
uses java.util.Collections

/**
 * Superclass for policy related address owner objects
 * <ul>
 * <li>We do not display any list of pre-existing addresses when entering a
 *     new address on the policy. Addresses are not shared between different
 *     policy locations.
 * <li>The set of non editable addresses is empty (and irrelevant anyway, as
 *     we don't show a list of properties to pick from)
 * <li>The claim property returns null (it should only return non null for
 *     the address owner used to edit the Claim's loss location)
 * </ul>
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
abstract class PolicyRelatedAddressOwner extends CCAddressOwnerBase {

  var _policy : Policy
  
  construct(prop : IEntityPropertyInfo, policy : Policy) {
    super(prop)
    _policy = policy
  }

  override property get Addresses() : Address[] {
    return null
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Collections.emptySet<Address>()
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getClaimFileRequiredFields(_policy.Claim)
  }
  

  override property get HiddenFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getClaimFileHiddenFields(_policy.Claim)
  }

  override property get DefaultCountry() : Country {
     return (_policy.insured.PrimaryAddress.Country != null)
             ? _policy.insured.PrimaryAddress.Country
             : super.DefaultCountry
  }
}
