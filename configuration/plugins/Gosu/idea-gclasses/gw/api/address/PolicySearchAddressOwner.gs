package gw.api.address

@Export 
class PolicySearchAddressOwner extends SearchAddressOwnerBase {

  private var _policySearchCriteria : PolicySearchCriteria
  
  construct(policySearchCriteria : PolicySearchCriteria) {
    _policySearchCriteria = policySearchCriteria
  }

  override property get Address() : Address {
    return _policySearchCriteria.InsuredAddress
  }

}
