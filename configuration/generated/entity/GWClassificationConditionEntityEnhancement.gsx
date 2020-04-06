package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "ClassificationCondition.eti;ClassificationCondition.eix;ClassificationCondition.etx")
enhancement GWClassificationConditionEntityEnhancement : entity.ClassificationCondition {
  function clearFilters () : void {
    (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.conditions.ConditionMethods") as gw.api.assignment.workload.classifications.conditions.ConditionMethods).clearFilters()
  }
  
  function filterQuery (query :  gw.api.database.Query) : void {
    (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.conditions.ConditionMethods") as gw.api.assignment.workload.classifications.conditions.ConditionMethods).filterQuery(query)
  }
  
  function isMatch (entity :  java.lang.Object) : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.conditions.ConditionMethods") as gw.api.assignment.workload.classifications.conditions.ConditionMethods).isMatch(entity)
  }
  
  property get HasFilters () : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.assignment.workload.classifications.conditions.ConditionMethods") as gw.api.assignment.workload.classifications.conditions.ConditionMethods).HasFilters
  }
  
  
}