package gw.api.assignment.workload.entity

uses gw.api.database.IQueryResult
uses gw.api.system.CCLoggerCategory
uses gw.api.util.DateUtil
uses gw.assignment.workload.proxy.WorkloadProxyFactory
uses gw.assignment.workload.strategies.GroupUserByAttributeWorkloadAssignmentStrategy
uses gw.assignment.workload.strategies.GroupUserWorkloadAssignmentStrategy

/**
 * Base class for all Weighted Workload related entity delegate classes. This class and all its descendants are delegates for
 * top-level Assignables that support Weighted Workload Assignment Load Balancing.
 */
@Export
public abstract class AbstractWeightedWorkloadMethodsBaseImpl<E extends Assignable> implements WeightedWorkloadMethods {
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Members
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Delegate object owner. This is the Assignable (e.g. the Claim or Exposure) that workload weight calculations apply.
   */
  private var _pThis : E


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * This constructor is required by the data model. This should otherwise not be used or accessed.
   */
  public construct(entity : E) {
    _pThis = entity
  }

  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * <p>Calculates and stores the calculated workload weight of an assignable for later reference.</p>
   * 
   * @returns the calculated workload
   */
  public override function syncWorkload() : int {
    var assignable = ((Owner as KeyableBean).refresh() as WorkloadDelegate)
    var workload = assignable.WorkloadWeight
    if (shouldSyncWorkload() or assignable.WorkloadUpdated == null) {
      workload = calculateWeight()
      // don't bother updating if it is unchanged
      if (workload != assignable.WorkloadWeight) {
        assignable.WorkloadWeight = workload
        assignable.WorkloadUpdated = DateUtil.currentDate()
      }

    }
    return workload
  }

  /**
   * Returns the Workload Classification that this assignable matches. Only the highest priority classification is 
   * recognized if multiple classifications match.
   * 
   * @returns the highest priority matching workload classification
   * 
   */
  public override function findMatchingClassification() : WorkloadClassification {
    var result : WorkloadClassification = null  

    // obtain all classifications that pertain to given type
    var classifications = findClassifications()
    
    if (classifications != null and not classifications.Empty) {
      // go through all classifications for this type, only the classification
      // with the highest rank will win
      for (cls in classifications) {
        if (matchesClassification(cls)) {
          result = cls
          break
        }
      }
    }
    
    return result
  }
  
  /**
   * <p>Calculates the total workload weight of this assignable based on matching workload classifications. The weight
   * of any assignable is always a non-negative integer value.</p>
   * 
   * <p>The workload of an Assignable is the assigned weight factor of the highest priority matching classification, along with any 
   * supplemental weight added to it. If the Assignable has no matches, then it is assigned the Default Weight for that
   * type of Assignable (e.g. Claim default weight) with any supplemental weight applied.</p>
   * 
   * <p>Weight only applies to "open" Assignables (e.g. open Claims or open Exposures). If it is in an inactive or "closed"
   * state, then the assignable will always have a weight of zero.  Supplemental and Default Weights do not apply to inactive
   * assignables.</p>
   *
   * <p>An Assignable's weight is constant until it is modified or matching classifications are altered.  An Assignable's weight
   * only affects a User's Workload if that assignable is assigned to that User.</p>
   * 
   * <p>This method performs a real-time calculation of the Assignable's weight. For performance reasons direct use is not recommended.
   * Instead, refer to the Assignable's <i>WorkloadWeight</i> attribute, which stores the Assignable's weight automatically
   * calculated since the last significant modification.</p>
   * @return the current workload weight of this assignable
   */
  public override function calculateWeight() : int {
    var result = 0

    // inherit default weight unless overridden by classification matches
    result = DefaultWeight
    
    var matchingClassification = findMatchingClassification()
    if (matchingClassification != null) {
      result = matchingClassification.Weight
    }
    
    // add supplemental weight
    if ((_pThis as WorkloadDelegate).SupplementalWorkloadWeight != null) {
      result += (_pThis as WorkloadDelegate).SupplementalWorkloadWeight
    }
  
    // total weight cannot be negative
    if (result < 0) {
      result = 0
    }
    
    return result
  }

  /**
   * Returns the owner entity of this instance of the delegate object.
   */
  public property get Owner() : E {
    return _pThis    
  }

  /**
   * <p>The workload weight of an assignable if it does not match any classifications.  This is not a minimum weight. If an
   * Assignable matches a classification, the default weight is not added to the calculated weight of the Assignable.
   * </p>
   * 
   * <p>Default weight must be a non-negative integer value, must be a constant and cannot be null.</p>
   *  
   * <p>Default weight should be considered an entity-level instead instance-level attribute. Thus default weight is invariant 
   * across all instances of an Assignable class. For example, all Claims will have the exact same default weight. 
   * All Exposures will also share a default weight, however the Exposure default weight and Claim default weight 
   * can be different.</p>
   * 
   * <p>This property cannot be overridden. To alter the default weight you must override the corresponding assignable's
   * WorkloadProxy implementation of the getDefaultWeight() method. For example, for the Claim entity, you must override
   * getDefaultWeight() of the ClaimWorkloadProxy class.</p>
   * 
   * 
   * <p>Be default, the global default weight is defined by the configuration parameter 
   * <strong>WeightedAssignmentGlobalDefaultWeight</strong> for all workload-enabled Assignables.</p>
   * 
   * @returns default workload weight of assignables that do not match any classifications.
   */
  final public override property get DefaultWeight() : int {
    // refer to the proxy for this Assignable type to get the default weight. For a Claim, for example, this would be
    // ClaimWorkloadProxy. This obtuse way of obtaining the default workload is a performance optimization.
    return WorkloadProxyFactory.INSTANCE.getProxy(_pThis).getDefaultWeight()
  }


  /**
   * Assigns this assignable to user within a group of users that has the least workload. The assignment strategy used by
   * default is the GroupUserWorkloadAssignmentStrategy.
   *
   * @param withinGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
   * @param includeSubgroups Whether the subgroups of the supplied group should also be considered
   * 
   * @return true if the assignment is successful, false otherwise
   */
  public override function assignUserByWorkload(includeSubgroups : boolean, withinGroup : Group) : boolean {
    if (withinGroup == null) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.warn("assignUserByWorkload: specified group was null - assignment aborted")
      return false
    }
    
    return Owner.assignUserDynamically(new GroupUserWorkloadAssignmentStrategy(), withinGroup, includeSubgroups)
  }
  
  /**
   * Assigns this assignable to user within a group of users that that has the least workload and match certain user attribute criteria. 
   * The assignment strategy used by default is the GroupUserByAttributeWorkloadAssignmentStrategy.
   * 
   * @param attributeBasedAssignmentCriteria
   *                         The criteria used to perform the search
   * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
   *                         the current group. If false, only searches users in the current group
   * @return true if the assignment is successful, false otherwise
   */
  public override function assignUserByWorkloadAndAttributes(crit : AttributeBasedAssignmentCriteria, includeSubGroups : boolean, withinGroup : Group) : boolean {
    if (withinGroup == null) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.warn("assignUserByWorkloadAndAttributes: specified group was null - assignment aborted")
      return false
    }
    if (crit == null) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.warn("assignUserByWorkloadAndAttributes: specified criteria was null - assignment aborted")
      return false
    }
    return Owner.assignUserDynamically(new GroupUserByAttributeWorkloadAssignmentStrategy(crit), withinGroup, includeSubGroups)
  }


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   *
   */
  protected abstract function shouldSyncWorkload() : boolean


  /**
   * Returns query which searches for classifications for the given workload-aware Assignable type.
   * 
   * @returns Returns query which searches for classifications for the given workload-aware Assignable type
   */
  protected abstract function findClassifications() : IQueryResult<WorkloadClassification, WorkloadClassification>

}
