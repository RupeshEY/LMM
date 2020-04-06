package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "ExposureWorkloadClassification.eti;ExposureWorkloadClassification.eix;ExposureWorkloadClassification.etx")
enhancement GWExposureWorkloadClassificationEntityEnhancement : entity.ExposureWorkloadClassification {
  function calculateWorkloadMap (groupuser :  entity.GroupUser) : java.util.Map<gw.pl.persistence.core.Key, java.lang.Integer> {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).calculateWorkloadMap(groupuser)
  }
  
  function findMatches () : gw.api.database.IQueryBeanResult {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).findMatches()
  }
  
  function findMatchesThatAffectWorkload (gu :  entity.GroupUser) : gw.api.database.IQueryBeanResult {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).findMatchesThatAffectWorkload(gu)
  }
  
  function generateQuery () : gw.api.database.Query {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).generateQuery()
  }
  
  function isMatch (entity :  java.lang.Object) : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).isMatch(entity)
  }
  
  property get AssignableType () : gw.entity.IEntityType {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.WorkloadClassificationMethods") as gw.api.assignment.workload.classifications.WorkloadClassificationMethods).AssignableType
  }
  
  
}