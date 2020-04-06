package gw.vendormanagement

uses java.util.List

@Export
class ServiceRequestInstructionServiceEditHelper extends SpecialistServiceReferenceEditHelper {

  private var _incident : Incident

  construct(service : ServiceRequestInstructionService, hierarchyLevel : int) {
    super(service, ServiceRequestInstructionService#Service, hierarchyLevel)
    _incident = service.Instruction.ServiceRequest.Incident
  }


  /**
   * Returns the possible values for this property, sorted by Name. No guarantees
   * are made about which bundle the results appear in.
   * This override filters the top-level service types by incident type.
   */
  override property get RootSpecialistServices() : List<SpecialistService> {
    return SpecialistService.getRootsCompatibleWithIncident(_incident)
  }
}
