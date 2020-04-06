package gw.api.address

uses java.util.Set
uses gw.api.admin.BaseAdminUtil

/**
* AddressOwner implementation for FNOLWizard_NewQuickClaimScreen for AF&F claims.
* The Wizard does not create a Check until the wizard is complete so there is not
* reference to the Check#CheckAddressOwner to use in the CCAddressInputSet.
* Note: This AddressOwner must not be used for any other case.
*/
@Export
class ClaimCheckAddressOwner extends AddressOwnerBase implements CCAddressOwner{

  var _address : Address

  construct(inAddress : Address) {
    _address = inAddress
  }

  override property get Address() : Address {
    return _address
  }

  override property set Address(value: Address) {
    this._address = value
  }

  override property get RequiredFields(): Set<AddressOwnerFieldId> {
    // Same as the required for Claim addresses
    return {CCAddressOwnerFieldId.CITY, CCAddressOwnerFieldId.STATE}
  }

  override property get HiddenFields(): Set<AddressOwnerFieldId> {
    // Same as the required for Claim addresses ignoring claim type
    return CCAddressOwnerFieldId.VALIDUNTIL_ADDRESSTYPE_HIDDEN
  }

  override property get InEditMode(): boolean {
    return true
  }

  override property set InEditMode(value: boolean) {
  }

  override property get AutofillEnabled(): boolean {
    return true
  }

  override property get Addresses(): Address[] {
    return null
  }

  override function getOrCreateNewAddress(): Address {
    return null
  }

  override property get NonEditableAddresses(): Set<Address> {
    return null
  }

  override property get Claim(): Claim {
    return null
  }

  override property get DefaultCountry(): Country {
    return BaseAdminUtil.getDefaultCountry()
  }

  override property get InputSetMode(): Country {
    return SelectedCountry
  }

  override property get ConfirmCountryChange(): boolean {
    return true
  }

  override property get Jurisdiction(): Jurisdiction {
    return null
  }

  override property set Jurisdiction(value: Jurisdiction) {
  }

  override property get Jurisdictions(): Jurisdiction[] {
    return typekey.Jurisdiction.getTypeKeys(false)
        .where(\j -> j.hasCategory(JurisdictionType.TC_INSURANCE))
        .toTypedArray()
  }
}
