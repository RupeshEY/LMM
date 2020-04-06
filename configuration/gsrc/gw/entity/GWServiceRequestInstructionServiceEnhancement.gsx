package gw.entity
uses gw.vendormanagement.SpecialistServiceReferenceEditHelper
uses gw.vendormanagement.ServiceRequestInstructionServiceEditHelper

@Export
enhancement GWServiceRequestInstructionServiceEnhancement : entity.ServiceRequestInstructionService {
  
  property get ServiceString() : String {
    var parent = this.Service.Parent
    return (parent != null ? (parent + " - ") : "") + this.Service
  }
  
  function isCompatibleWithKind(kind : ServiceRequestKind) : boolean {
    return this.Service.CompatibleKinds*.Kind.contains(kind)
  }

  /**
   * Returns a SpecialistServiceTypeReferenceEditHelper for the given hierarchy level
   */
  function getEditHelper(level : int) : SpecialistServiceReferenceEditHelper  {
    return new ServiceRequestInstructionServiceEditHelper(this, level)
  }
}
