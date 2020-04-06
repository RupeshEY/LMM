package gw.api.vendormanagement

@Export
class ServiceRequestContactMethodsImpl implements ServiceRequestContactMethods {

  private var _serviceRequest : ServiceRequest
  construct(serviceRequest : ServiceRequest) {
    _serviceRequest = serviceRequest
  }

  override function setExpectedServiceRequestRoles() {
    _serviceRequest.Claim.addRole(ContactRole.TC_SERVICEREQUESTPARTICIPANT, _serviceRequest.Instruction.CustomerContact)
    _serviceRequest.Claim.addRole(ContactRole.TC_SERVICEREQUESTSPECIALIST, _serviceRequest.Specialist)
    // any incident specific roles must be added explicitly
  }
}