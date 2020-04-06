package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "GroupUser.eti;GroupUser.eix;GroupUser.etx")
enhancement GWGroupUserEntityEnhancement : entity.GroupUser {
  function calculateWorkload () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).calculateWorkload()
  }
  
  function findEntitiesThatMatchClassification (classification :  entity.WorkloadClassification) : gw.api.database.IQueryBeanResult {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).findEntitiesThatMatchClassification(classification)
  }
  
  function getWorkload () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).getWorkload()
  }
  
  function setWorkload (workload :  int) : void {
    (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).setWorkload(workload)
  }
  
  function syncWorkload () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).syncWorkload()
  }
  
  property get AssignmentWeightedWorkload () : int {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.user.GroupUserWorkloadMethods") as gw.api.assignment.workload.user.GroupUserWorkloadMethods).AssignmentWeightedWorkload
  }
  
  
}