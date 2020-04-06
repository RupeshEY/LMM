package gw.api.assignment.workload.user

uses gw.api.assignment.workload.classifications.WorkloadClassificationMethods
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.api.system.CCLoggerCategory
uses gw.assignment.workload.proxy.WorkloadProxyFactory
uses gw.pl.persistence.core.Key
uses gw.entity.IEntityType

uses java.lang.Integer
uses java.util.Collections
uses java.util.Date
uses java.util.HashMap
uses java.util.Map

/**
 * <p>Base implementation of Weighted Workload methods for User.</p>
 *
 */
@Export
public class GroupUserWorkloadMethodsBaseImpl implements GroupUserWorkloadMethods {


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Members
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Delegate object owner. This is the User object that this delegate is associated with.
   */
  private var _pThis : GroupUser as readonly Owner


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * This constructor is required by the data model. This should otherwise not be used or accessed.
   */
  public construct(entity : GroupUser) {
    _pThis = entity
  }


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Retrieves the current user workload. If the workload has been previously cached,
   * that value is retrieved. If has not been cached then Owner value is recalculated.
   * The cached value may be out of date,  however no calculation is necessary.
   *
   * @return the user's workload
   */
  public override function getWorkload() : int {
    var result = 0
    if (hasStoredUserWorkload()) {
      result = Owner.GroupUserWorkload.Workload
    } else {
      result = calculateWorkload()
    }
    return result
  }


  /**
   * Recalculates and forcibly updates the user workload tracked by the UserWorkload entity.
   */
  public override function syncWorkload() : int {
    // calculate current value based on what's stored in the database as well as
    // anything that might already be in the current bundle.
    var load = calculateWorkload()
    Owner.setWorkload(load)
    return load
  }


  /**
   * Updates the user's assigned workload.
   */
  public override function setWorkload(load : int) {
    var groupuser = Owner.refresh() as GroupUser
    var bundle = groupuser.Bundle
    var guserWorkload : GroupUserWorkload = null
    if (groupuser.GroupUserWorkload == null) {
      guserWorkload = new GroupUserWorkload(bundle)
      groupuser.GroupUserWorkload = guserWorkload
    } else {
      guserWorkload = groupuser.GroupUserWorkload
    }

    guserWorkload.Workload = load
    guserWorkload.WorkloadUpdated = Date.CurrentDate
  }


  /**
   * <p>Calculates the total group user weight of all workload-aware entities that are assigned to Owner user. This value
   * is calculated in real-time rather than using the stored workload weight on the entities. Thus while Owner is 
   * the most accurate and up-to-date workload however it can consume a large amount of resources.</p>
   *
   * <p>This calculation takes into account both data that is already recorded in the database as well as current
   * updates stored in the current bundle of all assignables that affect the user's total weight factor.</p>
   *
   * <p>Because Owner computation may become resource-intensive, it is best to use getWorkload() unless it is really
   * necessary.</p>
   *
   * <p>If the user is ineligible (because they are not Active) this will immediately return zero.</p>
   */
  public override function calculateWorkload() : int {

    // check user eligibility. If the user is not eligible, then short circuit and since we know that
    // the user will be zero. No calculation is required for this case.
    if (not Owner.User.canHaveWorkload()) {
      return 0
    }

    var result = 0

    // create a table that maps and resolves all the weights of assignables that are affecting the
    // user's workload.  This computation takes into account both what is stored in the database
    // as well as what is currently being edited in the current bundle
    var workloadMatrix = createUserWeightTable()

    // using the table, add up all the weights of affecting assignables, Owner gives us our
    // total weight factor for the user.
    workloadMatrix.eachKeyAndValue(\ type, weightMap ->{
            weightMap.eachValue(\ weight -> { result += weight })
    })

    // Debugging output
    // output the list of assignables and their computed weights. This is useful for diagnosing
    // how each assignable is contributing to the user's total weight
    if (CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.TraceEnabled) {
      if (not workloadMatrix.Empty) {
        workloadMatrix.eachKeyAndValue(\ type, weightMap ->{
                for (w in weightMap.Keys) {
                  CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.trace("\t" + Owner.Bundle.loadBean(w).DisplayName + " -> " + weightMap.get(w))
                }
        })
        CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.trace("'" + Owner.Group.DisplayName + " - " + Owner.User.DisplayName + "' has weight " + result)
      } else {
        CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.trace("'" + Owner.Group.DisplayName + " - " + Owner.User.DisplayName + "' has no weight")
      }
    }

    // don't allow workload to become negative
    if (result < 0) {
      result = 0
    }

    return result
  }


  /**
   * Finds all entities that are assigned to this user that match a given Classification for this group user.
   */
  public override function findEntitiesThatMatchClassification(classification : WorkloadClassification) : IQueryBeanResult {
    return (classification as WorkloadClassificationMethods).findMatchesThatAffectWorkload(Owner)
  }


  /**
   * Returns the workload of a given user which is by default biased based on load factor. 
   */
  public override property get AssignmentWeightedWorkload() : int {
    var userWorkload = Owner.getWorkload()
    var userLoadFactor = Owner.LoadFactor
    // default workload is the user's absolute workload
    var loadFactoredWeight = userWorkload

    // if load factor is positive non-zero integer, then
    // the group-user workload is (100 / (user-group load factor)) * (user's absolute workload)
    // any decimal places are dropped, there is no rounding.
    if (userLoadFactor != null and userLoadFactor != 0) {
      var loadFactorMultiplier = (100.0 / userLoadFactor)
      loadFactoredWeight = (loadFactorMultiplier * userWorkload) as int
    }

    // if load factor is zero, then this user is shut out from accepting any assignments.
    // Assign them MAXINT (essentially infinity)
    else if (userLoadFactor == 0) {
      loadFactoredWeight = Integer.MAX_VALUE
    }

    return loadFactoredWeight
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  protected function hasStoredUserWorkload() : boolean {
    return Owner.GroupUserWorkload == null ? false : Owner.GroupUserWorkload.WorkloadUpdated != null
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Private Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Creates a table that will track the state of each assignable and its calculated weight. The total weight
   * factor is calculated after we have the states of each assignable are known.
   *
   * A table is necessary because assignables may appear in calculations several times and we only want to keep
   * the "most correct" calculation. For example, an assignable might be in the database, but it might also be
   * in the current bundle because it is being edited.  It might appear yet again because it matches several
   * classifications, so we only want the one that has the highest classification priority. Or it may even appear
   * as a bundle remove, in which case we don't want to calculate it at all, but this must override the version
   * that still exists.
   *
   *
   * NOTE: All processing is done only with assignables assigned to or just-previously assigned to 
   * this User.
   *
   */
  private function createUserWeightTable() : Map<IEntityType, Map<Key, Integer>> {
    var weightTable = new HashMap<IEntityType, Map<Key, Integer>>()

    // calculate weights of all entities that are in the current bundle. These are the top priority
    // calculations since these are being modified right now    
    populateUserWeightTableWithInBundleAssignableCalculations(weightTable)

    // calculate weights of all matching entities in the database. These are most likely up-to-date, but they
    // may not be because they are in the bundle, in which case we don't bother with them since we already have
    // a more accurate weight for these.
    populateUserWeightTableWithStoredAssignableCalculations(weightTable)

    // calculate weights of non-matching assignables. 
    populateUserWeightTableWithNonmatchingAssignableDefaultWeights(weightTable)

    return weightTable
  }


  private function populateUserWeightTableWithInBundleAssignableCalculations(weightTable : Map<IEntityType, Map<Key, Integer>>) {
    var currentBundle = Owner.Bundle
    // Update the weightTable matrix in current bundle. Weighted assignables might have been
    // added, removed or modified. They may even be seen by the bundle as unchanged
    // but in reality the computed weight is different.
    for (proxy in WorkloadProxyFactory.INSTANCE.Proxies) {
      var assignablesInBundle = currentBundle.getBeansByRootType(proxy.AssignableType)
      for (weightedAssignable in assignablesInBundle) {
        if (weightedAssignable typeis WorkloadDelegate and weightedAssignable typeis Assignable) {
          // our only interest is in assignables assigned to the current group user.
          if (weightedAssignable.AssignedUser == Owner.User and weightedAssignable.AssignedGroup == Owner.Group) {
            // if assignable is not a remove then add that to the weight table       
            if (not currentBundle.RemovedBeans.hasMatch(\ key ->key == weightedAssignable)) {
              var weight = proxy.getWeight(weightedAssignable)
              addToWeightTable(weightTable, weightedAssignable.ID, proxy.AssignableType, weight)
            } else {
              // on remove, it becomes weightless
              addToWeightTable(weightTable, weightedAssignable.ID, proxy.AssignableType, 0)
            }
          } else {
            // assignable is not assigned or no longer is assigned to Owner user,
            // so it always has no weight for Owner user.
            addToWeightTable(weightTable, weightedAssignable.ID, proxy.AssignableType, 0)
          }
        }
      }
    }
  }


  private function populateUserWeightTableWithStoredAssignableCalculations(weightTable : Map<IEntityType, Map<Key, Integer>>) {
    var currentBundle = Owner.Bundle
    var intermediateWeightTable = new HashMap<IEntityType, Map<Key, Integer>>()
    var allClassifications = WorkloadClassification.findAllActiveWorkloadClassifications()
    // populate weightTable with entities from database
    // these may or may not be up to date
    for (cls in allClassifications) {
      var classification = cls as WorkloadClassificationMethods
      // create a map of all matching assignables and their calculated weight, partitioned
      // by assignable type. 
      var classificationWeight = classification.calculateWorkloadMap(Owner)
      for (matchingAssignableKey in classificationWeight.Keys) {
        // skip elements that have already been computed in the bundle. Since those are more recent,
        // they basically will always override stuff in here, so doing these calcs is waste
        if (not weightTable.containsKey(classification.AssignableType) or not weightTable.get(classification.AssignableType).containsKey(matchingAssignableKey)) {
          var intermediateWeight = classificationWeight.get(matchingAssignableKey)
          // add key and calculated weight of found matching assignable to weight table
          addToWeightTable(intermediateWeightTable, matchingAssignableKey, classification.AssignableType, intermediateWeight)
        }
      }
    }

    // apply supplemental weights.  Unfortunately there's a cost to doing Owner -- the entities must be loaded
    // from backing data
    for (entityType in intermediateWeightTable.Keys) {
      var entityMap = intermediateWeightTable.get(entityType)
      // batch load all beans that need weight calcs
      var entities = Query.make(entityType as Type<KeyableBean>).compareIn("ID", entityMap.Keys.toTypedArray()).select()
      for (entity in entities) {
        var baseWeight = entityMap.get(entity.ID)
        // calculate true weight
        var weight = baseWeight + (entity as WorkloadDelegate).SupplementalWorkloadWeight
        // prohibit negative weight
        if (weight < 0) {
          weight = 0
        }
        // store weights in calc lookup table. This is necessary for cross-referencing weight data
        // before final calculation
        addToWeightTable(weightTable, entity.ID, entityType, weight)
      }
    }
  }


  private function populateUserWeightTableWithNonmatchingAssignableDefaultWeights(weightTable : Map<IEntityType, Map<Key, Integer>>) {
    // handle default weights. Default Weights are specific weights that are given
    // to all assignables that are assigned to a user but do not match any classifications.
    for (proxy in WorkloadProxyFactory.INSTANCE.Proxies) {

      // add to the exclusion list keys of all assignables that matched classifications
      // and so had a non-default score since they have already been accounted for.
      var excludeList = Collections.emptySet<Key>()
      if (weightTable.containsKey(proxy.AssignableType)) {
        excludeList = weightTable.get(proxy.AssignableType).Keys
      }

      // query for assignables that do not match any classifications for Owner type of
      // workload-enabled assignable type
      var defaultAssignablesQuery = proxy.findAssignables(Owner, excludeList.toList())
      for (entity in defaultAssignablesQuery) {
        // calculate workload weight (default + supplemental) - weight cannot be negative
        var workloadWeight = proxy.getDefaultWeight() + proxy.getSupplementalWeight(entity)
        if (workloadWeight < 0) {
          workloadWeight = 0
        }

        // add found non-matching assignable key and its score (the default weigh + supplemental weight) to
        // weight tracking table
        addToWeightTable(weightTable, (entity as KeyableBean).ID, proxy.AssignableType, workloadWeight)
      }
    }
  }


  private function getOrCreateTypeWeightTable(type : IEntityType, weightTable : Map<IEntityType, Map<Key, Integer>>) : java.util.Map<Key, Integer> {
    var assignableWeightTable : Map<Key, Integer>
    if (weightTable.Keys.contains(type)) {
      assignableWeightTable = weightTable.get(type)
    } else {
      assignableWeightTable = new HashMap<Key, Integer>()
      weightTable.put(type, assignableWeightTable)
    }

    return assignableWeightTable
  }


  private function addToWeightTable(weightTable : Map<IEntityType, Map<Key, Integer>>, key : Key, type : IEntityType, score : int) {
    var assignableWeightTable = getOrCreateTypeWeightTable(type, weightTable)
    // don't allow overwrite 
    if (not assignableWeightTable.containsKey(key)) {
      assignableWeightTable.put(key, score)
    }
  }


}
