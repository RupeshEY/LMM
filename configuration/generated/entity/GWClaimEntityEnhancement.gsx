package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "Claim.eti;Claim.eix;Claim.etx")
enhancement GWClaimEntityEnhancement : entity.Claim {
  function assignUserByWorkload (includeSubgroups :  boolean, withinGroup :  entity.Group) : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).assignUserByWorkload(includeSubgroups, withinGroup)
  }
  
  function assignUserByWorkloadAndAttributes (crit :  entity.AttributeBasedAssignmentCriteria, includeSubGroups :  boolean, withinGroup :  entity.Group) : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).assignUserByWorkloadAndAttributes(crit, includeSubGroups, withinGroup)
  }
  
  function calculateWeight () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).calculateWeight()
  }
  
  function findMatchingClassification () : entity.WorkloadClassification {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).findMatchingClassification()
  }
  
  function isWorkloadAffected () : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).isWorkloadAffected()
  }
  
  function matchesClassification (crit :  entity.WorkloadClassification) : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).matchesClassification(crit)
  }
  
  function syncWorkload () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).syncWorkload()
  }
  
  property get DefaultWeight () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.entity.WeightedWorkloadMethods") as gw.api.assignment.workload.entity.WeightedWorkloadMethods).DefaultWeight
  }
  
  
}