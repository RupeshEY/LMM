package gw.api.address

uses gw.api.locale.DisplayKey
uses com.google.common.base.Preconditions
uses gw.entity.IEntityPropertyInfo
uses gw.entity.IEntityType
uses gw.api.admin.BaseAdminUtil
uses gw.pl.persistence.core.Key
uses java.lang.IllegalArgumentException
uses java.lang.IllegalStateException

/**
 * Base class for most ClaimCenter AddressOwner objects. Provides default
 * implementations for many of the CCAddressOwner methods and properties.
 * <p>
 * Subclassers must provide an owner object, returned by the abstract Owner
 * property, and a property info for the Address field on the owner object
 * which will contain the address. So, for example, an address owner for
 * managing a claim's loss location would override Owner to return a Claim and
 * would supply the "LossLocation" property to the CCAddressOwnerBase constructor. 
 */
@Export
abstract class CCAddressOwnerBase extends AddressOwnerBase implements CCAddressOwner {
  
  override property get AddressDelegate() : AddressFillableExtension {
    if (_delegate == null) {
      _delegate = new AddressEntityDelegate(this){
        override property set State(newValue : State) {
          super.State = newValue
          outer.resetJurisdictionState()
        }
      }
    }
    return _delegate
  }
  
  /** The property for setting/getting the address */
  private var _property : IEntityPropertyInfo
  
  /**
   * Create a new address owner.
   * @param prop a non null property that has type Address
   */
  construct(prop : IEntityPropertyInfo) {
    _property = Preconditions.checkNotNull(prop, "Property must be non null")
    if (not gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(entity.Address.Type, _property.FeatureType)) {
      throw new IllegalArgumentException("Property " + prop + " is not of type Address")
    }
  }

  /**
   * The Address accessor, for getting the current value of the address. Uses
   * the address property to get the address from the owner object.
   * <p>
   * Also handles the special case where we need the address to preselect a "new"
   * address (this is used in the new claim wizard). If the PreselectNewAddress
   * property returns true, the address is currently null, we are in an editable
   * location and we've not already pre allocated an address then this property
   * will create a new address and set the address property to point to it
   * before returning
   */
  override property get Address() : Address {
    var result = CoreAddress
    if (result == null and InEditMode) {
      result = preselectAddress()
      if (result != null) {      
        Address = result
      }
    }
    return result
  }
  
  /**
   * The Address setter, for setting the current value of the address
   */
  override property set Address(newAddress : Address) {
    _property.Accessor.setValue(Owner, newAddress)
    resetJurisdictionState()
  }
  
  /**
   * Core accessor functionality - just gets the current value of the address
   * without invoking the special new address preselection logic
   */
  protected final property get CoreAddress() : Address {
    return _property.Accessor.getValue(Owner) as Address
  }
  
  /**
   * Subclassers must override this method to return the object that owns the
   * address and has the address property that was given to the constructor.
   */
  abstract protected property get Owner() : KeyableBean;

  /**
   * If this property returns true then the Address accessor will preselect a
   * new address if the current address is null, the location is editable and
   * no address has been preselected in the past. The default implementation
   * of this property returns false.
   */
  protected property get PreselectNewAddress() : boolean {
    return false
  }
  
  /**
   * Create a new address. This method does not always allocate a brand new
   * address. The first time it is called for a particular address owner in
   * a particular bundle it will create a new address. But if it is called
   * subsequently in the same context then it will return the same address
   * it created the first time. Once the bundle is committed its state resets
   * and it will return a new address again. 
   */
  override function getOrCreateNewAddress() : Address {
    var ownerBean = Owner
    if (ownerBean == null) {
      throw new IllegalStateException("Cannot create a new address because owning entity is null")
    }
    return CCAddressOwnerUtil.getOrCreateNewBeanFor(ownerBean, _property, \ -> {
      var result = new Address()
      result.Country = DefaultCountry
      return result
    })
  }

  /**
   * Should return a Claim if, and only if, the Owner object is a Claim. The
   * default implementation just checks if the Owner is a Claim and, if so,
   * returns it, otherwise returns null.
   */  
  override property get Claim() : Claim {
    return Owner typeis Claim ? Owner : null
  }
  
  /**
   * The currently selected country. If the current address specifies a country
   * then return that, otherwise return the default country
   */
  override property get SelectedCountry() : Country {
    return this.CoreAddress.Country ?: DefaultCountry
  }
  
  /**
   * Set the currently selected country. If the current address is non null, or
   * it is currently null and we are setting the country to something other than
   * the default, then set the addresses country (possibly autocreating a new
   * address in the process). Otherwise do nothing because we don't have an
   * address and we're just setting the value to the default country.
   */
  override property set SelectedCountry(newValue : Country)  {
    var normalizedNewValue = newValue != null ? newValue : DefaultCountry
    if (this.CoreAddress != null or normalizedNewValue != DefaultCountry) {
      super.SelectedCountry = normalizedNewValue
      resetJurisdictionState()
    }
  }  
  
  /**
   * The Jurisdiction corresponding to the Address
   */
  override property get Jurisdiction() : Jurisdiction {
      return Claim.JurisdictionState
  }
  
  /**
   * Sets the Claim.JurisdictionState
   */
  override property set Jurisdiction(newValue : Jurisdiction)  {
    Claim.JurisdictionState =  newValue 
  }
  
  /**
   * Gets the Jurisdictions corresponding to the InputSetMode. Because this values returned are expected to be used
   * to populate Claim.JurisdictionState, only Jurisdictions corresponding to JurisdictionType.TC_INSURANCE are returned.
   */
  override property get Jurisdictions() : Jurisdiction[] {
    return typekey.Jurisdiction.getTypeKeys(false)
        .where(\j -> j.hasCategory(JurisdictionType.TC_INSURANCE))
        .toTypedArray()
  }
  
  /**
   * The input set mode is nearly always the currently selected country
   */
  override property get InputSetMode() : Country {
    return SelectedCountry
  }
  
  /**
   * In most cases we want to show the address in summary form if the current
   * location is NOT in edit mode. So the default implementation returns true
   * if the current location is not editable.
   */
  override property get ShowAddressSummary() : boolean {
    return not InEditMode
  }

  /**
   * By default, ask for confirmation before allowing the user to change the
   * current country
   */
  override property get ConfirmCountryChange() : boolean {
    return true
  }

  /**
   * The default country, used if the address is null or does not have a
   * country set up. The default implementation returns the default country
   * as specified by BaseAdminUtil.getDefaultCountry()
   */
  override property get DefaultCountry() : Country {
     return BaseAdminUtil.getDefaultCountry()
  }

  /**
   * Default implementation returns null, meaning the address range control
   * and address summary will be given the default label in the PCF, which
   * is usually of the form "Web.Address.XX.Name", where XX is the
   * country code.
   */
  override property get AddressNameLabel() : String {
    return DisplayKey.get("Web.Address.Default.Name")
  }
  
  property get AddressFields() : CountryAddressFields {
    return CountryAddressFieldsProvider.forCountry(InputSetMode)
  }

  override function isAvailable(fieldId : AddressOwnerFieldId) : boolean {
    return not NonEditableAddresses.contains(Address)
  }
  
  /**
   * Utility function that gets the named property from an entity type
   */
  protected static function getAddressProperty(type : IEntityType, name : String) : IEntityPropertyInfo {
    return type.TypeInfo.getProperty(name) as IEntityPropertyInfo
  }
  
  /**
   * Utility function that adds the original value of the address property to
   * the given list of addresses. Usually the UI should display the original
   * value of the property so if the user chooses a different address they
   * still have the option of going back to the original one before they hit
   * Update.
   */  
  protected function addOriginalValue(addressList : Address[]) : Address[] {
    var original : Address = null
    var originalId = Owner.getOriginalValue(_property.Name) as Key
    if (originalId != null) {
      original = Owner.Bundle.loadBean(originalId) as Address
    }
    return original == null or addressList.contains(original)
            ? addressList : addressList.concat({original})
  }
  
  /**
   * Internal method, called by Address to create a new address for preselection,
   * if the conditions are right. Returns the new address if conditions are right,
   * otherwise null
   */
  private function preselectAddress() : Address {
    var result : Address = null
    if (PreselectNewAddress
            and Owner != null
            and not CCAddressOwnerUtil.wasNewBeanCreatedFor(Owner, _property)) {
      result = getOrCreateNewAddress()
    }
    return result
  }
  
  private function resetJurisdictionState () {
    if (Claim != null) {
      Claim.JurisdictionState = AddressJurisdictionHandler.getJurisdiction(Address)
    }
  }

}
