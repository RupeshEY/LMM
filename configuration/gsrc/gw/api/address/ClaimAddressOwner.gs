package gw.api.address

uses gw.entity.IEntityPropertyInfo

/**
 * CCAddressOwner object for the Claim entity.
 * See AddressOwner and CCAddressOwner for details of what an
 * AddressOwner object does.
 */
@Export
class ClaimAddressOwner extends ClaimRelatedAddressOwner {
  /**
   * When asked for a new Address entity, we can reuse an old loss location if all its fields are empty.
   * The following fields will be ignored when determining whether an old loss location is considered reusable.
   */
  final static var PROPERTIES_TO_IGNORE = {
      Address#CityDenorm,
      Address#PostalCodeDenorm,
      Address#PublicID,
      Address#ID,
      Address#BeanVersion,
      Address#CreateTime,
      Address#UpdateTime,
      Address#CreateUser,
      Address#UpdateUser,
      Address#RetiredValue,
      Address#Subtype,
      Address#LoadCommandID,
      Address#Country,
      Address#GeocodeStatus,
      Address#BatchGeocode
  }.map(\elt -> elt.PropertyInfo)
  
  construct(inClaim: Claim) {
    super(getAddressProperty(entity.Claim, "LossLocation"), inClaim)
  }

  override property get Owner(): KeyableBean {
    return RelatedClaim
  }

  /**
   * Should we preselect the "new" address, if possible?  We typically do this
   * whenever we're creating a new claim (i.e. if state is draft). This is true
   * even for homeowner's, where we handle the common case of the primary
   * dwelling being the loss address via a special custom control.
   */
  override property get PreselectNewAddress(): boolean {
    return Claim.State == TC_DRAFT
  }

  /**
   * Create a new address. This method does not always allocate a brand new
   * address. It first tries to determine if a loss location has already been
   * created but with empty fields. If so, we return the empty address as the new
   * address. Otherwise it calls the super class method.
   */
  override function getOrCreateNewAddress(): Address {
    if (Claim.State == TC_DRAFT) {
      if (Claim.LossLocation != null) {
        for (prop in entity.Address.Type.TypeInfo.Properties) {
          if (prop typeis IEntityPropertyInfo
              and Claim.LossLocation.getOriginalValue(prop.Name) != null
              and not PROPERTIES_TO_IGNORE.contains(prop)) {
            return super.getOrCreateNewAddress()
          }
        }
        return Claim.LossLocation
      }
    }
    return super.getOrCreateNewAddress()
  }
}
