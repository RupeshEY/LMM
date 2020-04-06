package gw.assignment.workload.proxy

uses gw.api.assignment.workload.proxy.AbstractWorkloadProxy
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.entity.IEntityType
uses gw.pl.persistence.core.Key

uses java.util.Set
uses java.util.List

/**
 * Proxy for access, computation, and management of Exposure-related workload operations.
 */
@Export
public class ExposureWorkloadProxy extends AbstractWorkloadProxy {

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  public override property get AssignableType() : IEntityType {
    return Exposure
  }


  public override function findAssignables(groupuser : GroupUser, excludeKeyList : List<Key>) : IQueryBeanResult<Exposure> {
    var query = Query.make(Exposure)
            .compare(Exposure#AssignedUser, Equals, groupuser.User)
            .compare(Exposure#AssignedGroup, Equals, groupuser.Group)
            .compare(Exposure#State, Equals, ExposureState.TC_OPEN)

    // exclude any exposures (by ID) that have been listed in the "excluded list"
    if (excludeKeyList != null and not excludeKeyList.Empty) {
       query.compareNotIn(Exposure#ID, excludeKeyList.toTypedArray())
    }
    
    return query.select()                    
  }

   
  public override function getSupplementalWeight(bean : Object) : int {
    return (bean as Exposure).SupplementalWorkloadWeight
  }


  public override function getWeight(bean : Object) : int {
    final var exposure = (bean as Exposure)
    return exposure.State == ExposureState.TC_OPEN ? exposure.WorkloadWeight : 0
  }


  public override function syncWeight(bean : Object) : int {
    return (bean as Exposure).syncWorkload()
  }

  public override property get WeightedStates(): Set {
    return { ExposureState.TC_OPEN, ExposureState.TC_CLOSED }
  }
}
