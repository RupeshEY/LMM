package gw.api.address
uses gw.api.locale.DisplayKey
uses java.util.Set
uses com.google.common.collect.Sets

@Export
class ServiceRequestInstructionServiceAddressOwner extends ClaimRelatedAddressOwner {

  private var _serviceRequestInstruction : ServiceRequestInstruction

  construct(serviceRequestInstruction : ServiceRequestInstruction) {
    super(getAddressProperty(entity.ServiceRequestInstruction,"ServiceAddress"), serviceRequestInstruction.ServiceRequest.Claim)
    _serviceRequestInstruction = serviceRequestInstruction
  }

  override property get Owner() : KeyableBean {
    return _serviceRequestInstruction
  }

  override property get NonEditableAddresses() : Set<Address> {
    return Sets.newHashSet(ServiceAddresses)
  }

  override property get RequiredFields() : Set<AddressOwnerFieldId> {
    return AddressFields.getClaimFileRequiredFields(_serviceRequestInstruction.ServiceRequest.Claim)
  }
  
  property get ServiceAddresses() : Address[] {
    var addrs = super.Addresses.where(\ a -> not a.New).toSet()
    var specialistAddr = _serviceRequestInstruction.ServiceRequest.Specialist.PrimaryAddress
    if (specialistAddr != null) addrs.add(specialistAddr)
    return addrs.toTypedArray()
  }
  
  override property get Addresses() : Address[] {
    return null
  }
  
  override property get AddressNameLabel() : String {
    return DisplayKey.get("Web.ServiceRequest.ServiceAddress")
  }
}
