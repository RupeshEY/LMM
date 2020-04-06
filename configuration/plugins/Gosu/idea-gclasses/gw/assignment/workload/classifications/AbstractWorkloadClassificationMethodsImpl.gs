package gw.assignment.workload.classifications

uses gw.api.assignment.workload.classifications.WorkloadClassificationMethods
uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.pl.persistence.core.Key

uses java.lang.Integer
uses java.util.HashMap
uses java.util.Map

/**
 * Base class for all Workload Classifications.
 */
@Export
public abstract class AbstractWorkloadClassificationMethodsImpl implements WorkloadClassificationMethods {
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Members
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Delegate owner WorkloadClassification.
   */
  private var _classification : WorkloadClassification
  

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(weight : WorkloadClassification) {
    _classification = weight    
  }  


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Properties
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns reference to the owning WorkloadClassification.
   */
  final protected property get WorkloadClassification() : WorkloadClassification {
    return _classification
  }

  /**
   * General implementation of classification target query generation. While this can be overridden,
   * it is highly recommended customers not do so and rely on overriding buildQuery() instead unless
   * absolutely necessary.
   */
  public override function generateQuery() : Query {
    // initialize the query
    var query = createQuery()

    // populate the query. Customers might customize this
    buildQuery(query)

    // add classification condition filters to query
    addConditionsToQuery(query)

    return query
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Find all entities that match this classification.
   * 
   * @returns a QueryBeanResult that can be used to access matching Assignables
   */
  public override function findMatches() : IQueryBeanResult {
    var query = generateQuery()
    return query.select()
  }
  

  /**
   * Calculates and creates a map of all matching assignables by key and their assigned workload weight.
   * This calculation does NOT take into account supplemental weight (for performance reasons) as this is
   * part of an incremental step.
   *
   * For internal use only.
   */
  final public override function calculateWorkloadMap(gu : GroupUser) : Map<Key, Integer> {
    var assignableMap = new HashMap<Key, Integer>()
            
    // create query which finds assignables that match this classification.
    var weightedAssignables = findMatchesThatAffectWorkload(gu)
    for (assignableKey in weightedAssignables.keyIterator()) {
      var workloadWeight = WorkloadClassification.Weight            
      assignableMap.put(assignableKey, workloadWeight)
    }
    
    return assignableMap
  }

  /**
   * Basic check that only checks the classification's conditions for matches, assuming the classification
   * lacks any intrinsic/simple criterion.
   *
   * If you override this method, you must call super.isMatch() in order to test if classification conditions
   * triggers a match or not.
   */
  public override function isMatch(entity: Object): boolean {
    // take into consideration parameters in workload weights
    for (wc in WorkloadClassification.Conditions) {
      if (not wc.isMatch(entity as gw.pl.persistence.core.Bean)) {
        return false
      }
    }
    return true
  }

  /**
   * Finds all assignables for a group user that match this classification.
   */
  override public function findMatchesThatAffectWorkload(gu: GroupUser) : IQueryBeanResult {
    // apply assigned groupuser filter to classification query, singling out only matches
    // that apply to given groupuser.
    var query = generateQuery()

    addStateFilterForGroupUserToQuery(query)
    query.compare("AssignedUser", Equals, gu.User)
        .compare("AssignedGroup", Equals, gu.Group)

    return query.select()
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Creates the query to be used to search for Assignables that match this classification.
   *
   */
  protected function createQuery<T extends Assignable>() : Query<T> {
    return Query.make(AssignableType as Type<T>)
  }


  /**
   * Populates a query with query filters in search of matching assignables. Customers will need to implement
   * this if they want to support their own Assignables.
   */
  protected abstract function buildQuery(query : Query)


  /**
   * Adds potential classification conditional filters to query in search of matching assignables.
   */
  protected function addConditionsToQuery(beanQuery : Query) {
    for (wc in WorkloadClassification.Conditions) {
      wc.filterQuery(beanQuery)
    }
  }

  /**
   * Adds to the query for a group user a filter that only accepts Assignables that match a given
   * state. For example, Claims with ClaimState of TC_OPEN will match but TC_DRAFT will not.
   */
  protected abstract function addStateFilterForGroupUserToQuery(query : Query)

}
