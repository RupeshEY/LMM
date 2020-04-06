package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.address.ServiceRequestInstructionServiceAddressOwner
uses java.util.HashSet
uses java.util.Collections
uses java.lang.IllegalArgumentException
uses java.util.List

@Export
enhancement GWServiceRequestInstructionEnhancement : entity.ServiceRequestInstruction {

  /**
   * Gets an address owner object for the service address
   */
  property get ServiceAddressOwner() : ServiceRequestInstructionServiceAddressOwner {
    return new ServiceRequestInstructionServiceAddressOwner(this)
  }

  /**
   * Sorts the provided list of instruction services by first-level service, then by second-level
   * service, and so on. Sorts in place, and the list is returned for convenience.
   */
  static function sortInstructionServices(instructionServices : List<ServiceRequestInstructionService>) : List<ServiceRequestInstructionService> {
    Collections.sort(instructionServices, SpecialistService.StandardComparator.map<ServiceRequestInstructionService>(\ is -> is.Service))
    return instructionServices
  }

  /**
   * Returns a list of the services for this service request instruction, ordered by
   * e-level service name, followed by second-level service name, and so on.
   */
  property get OrderedServices() : List<ServiceRequestInstructionService> {
    return sortInstructionServices(this.Services.toList())
  }

  /**
   *  Indicates whether the Services in an Instruction are unique
   */
  property get ServicesAreUnique() : boolean {
    var serviceSet = new HashSet<SpecialistService>()
    for (service in this.Services) {
      if (not serviceSet.add(service.Service)) {
        return false
      }
    }
    return true
  }

  /**
   * adds the SpecialistService identified by code to this instruction
   * @throws IllegalArgumentException  if the SpecialistService cannot be found
   */
  function addServiceFoundByCode(code : String) : ServiceRequestInstructionService {
    var service = SpecialistService.getForCode(code)
    if (service == null) {
      throw new IllegalArgumentException("no SpecialistService found for code '" + code + "'")
    }
    // addService should pull the SpecialistService from the read-only bundle into this bundle
    return addService(service)
  }

  /**
   * adds the specified SpecialistService to this instruction
   */
  function addService(service : SpecialistService) : ServiceRequestInstructionService {
    var instructionService = new ServiceRequestInstructionService(this.Bundle)
    instructionService.Service = service
    this.addToServices(instructionService)
    return instructionService
  }

  function verifyServiceTypesForUI() {
    if (this.Services.IsEmpty) {
       throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.ServiceRequestInstructionHasNoServices"))
    }
  }

}
