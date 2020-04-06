package gw.processes
uses java.util.Iterator
uses gw.api.database.IQueryResult
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.path.Paths

@Export
class CatastrophePolicyLocationSummaryFetcher {

  construct(_batchSize : int) {
    BATCH_SIZE = _batchSize
  }
  
  var BATCH_SIZE : int
  var _existingPLSQueryIterator : Iterator<PolicyLocationSummary>
  var _numExistingPLSQueriesProcessed : int
  var _previousExistingPolicyNumber : String
  var _previousExistingPolicySystemId : String
  public var _nextPLS : PolicyLocationSummary

  /**
   * get the next existing PolicyLocationSummary before or equal to the specified endingPoint
   * return null at end or if greater than the endpoint
   */
  function getNextExistingPLS(catastrophe : Catastrophe, endingPolicyNumber : String, endingPolicySystemId : String) : PolicyLocationSummary {
    if (_nextPLS != null) {
      return maybeReturn(_nextPLS, endingPolicyNumber, endingPolicySystemId)
    }
    if (_existingPLSQueryIterator == null or _numExistingPLSQueriesProcessed == BATCH_SIZE) {
      var existingPLSQuery = createExistingPLSQuery(catastrophe, _previousExistingPolicyNumber, _previousExistingPolicySystemId)
      _existingPLSQueryIterator = existingPLSQuery.iterator()
      _numExistingPLSQueriesProcessed = 0
    }
    
    if (not _existingPLSQueryIterator.hasNext())
      return null // processed all data
      
    _numExistingPLSQueriesProcessed++
    return maybeReturn(_existingPLSQueryIterator.next(), endingPolicyNumber, endingPolicySystemId)
  }

  /**
   * return the pls if it's <= the specified policyNumber/PSID and clear any saved PLS.
   * If it's not in range, return null and save the pls value so it can be returned later 
   */
  function maybeReturn(pls : PolicyLocationSummary, endingPolicyNumber : String, endingPolicySystemId : String) : PolicyLocationSummary {
     if (endingPolicyNumber == null or compare(pls.PolicyNumber, pls.PolicySystemId, endingPolicyNumber, endingPolicySystemId) <= 0) {
       // in range, return the value
      _previousExistingPolicyNumber = pls.PolicyNumber
      _previousExistingPolicySystemId = pls.PolicySystemId
      _nextPLS = null
      return pls
    } else {
      // not in range, save value and return null
      _nextPLS = pls
      return null
    }
  }
  
  /**
   * return query for fetching existing PolicySystemLocations starting after the specified starting point.
   * if the starting point is unspecified (null), start from the beginning
   */
  function createExistingPLSQuery(catastrophe : Catastrophe, startingPolicyNumber : String, startingPolicySystemId : String)
           : IQueryResult<PolicyLocationSummary, PolicyLocationSummary> {
    
    var queryBase = Query.make(PolicyLocationSummary)
    var query = queryBase.compare("Catastrophe", Equals, catastrophe)
                       
    if (startingPolicyNumber != null) {    
      query.or(\ restriction -> restriction.compare("PolicyNumber", GreaterThan, startingPolicyNumber)
                                           .and(\ restriction2 -> restriction2.compare("PolicyNumber", Equals, startingPolicyNumber)
                                                                              .compare("PolicySystemId", GreaterThan, startingPolicySystemId)))
    }

    var existingPLSQuery = query.select()
         .orderBy(QuerySelectColumns.path(Paths.make(PolicyLocationSummary#PolicyNumber)))
         .thenBy(QuerySelectColumns.path(Paths.make(PolicyLocationSummary#PolicySystemId)))
    existingPLSQuery.setPageSize(BATCH_SIZE)
    
    return existingPLSQuery
  }

  /**
   * compares 2 pairs of (PolicyNumber, PolicySystemId) and returns -1, 0 or 1 for <, = or > 
   */
  function compare(policyNumber1 : String, policySystemId1 : String, policyNumber2 : String, policySystemId2 : String) : int {
    var pnCompare = policyNumber1.compareTo(policyNumber2)
    return (pnCompare != 0)
            ? pnCompare
            : policySystemId1.compareTo(policySystemId2)
  }


}
