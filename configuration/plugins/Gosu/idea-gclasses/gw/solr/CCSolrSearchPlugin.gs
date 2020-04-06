package gw.solr

uses gw.api.locale.DisplayKey
uses gw.api.util.UltraFastDateFormat
uses gw.plugin.management.SolrSearchMonitor
uses gw.plugin.solr.SolrResultSet
uses gw.plugin.solr.SolrSearchStore
uses gw.plugin.solr.SolrSortColumn
uses gw.plugin.solr.ISolrSearchPlugin
uses gw.solr.request.ClaimContactSearchRequest
uses gw.solr.utils.CCSolrUtils
uses gw.solr.utils.PLSolrUtils
uses org.apache.solr.client.solrj.SolrRequest
uses org.apache.solr.client.solrj.request.QueryRequest
uses org.json.simple.JSONArray
uses org.json.simple.JSONObject

uses java.util.Collections
uses gw.api.util.LocationUtil
uses java.util.Date
uses gw.api.solr.CCSolrConfig
uses java.util.List

/**
 * External Solr search for claims by contact.
 */
@Export
class CCSolrSearchPlugin extends AbstractSolrSearchPlugin implements ISolrSearchPlugin {

  construct() {
    super("CCSolrSearchPlugin")
  }

  override property get DefaultChunkSize() : int {
    return ChunkSize
  }
  
  override function search(criteria : ClaimSearchCriteria, store : SolrSearchStore) : List<FreeTextClaimSearchEntity> {
    var result = Collections.emptyList<FreeTextClaimSearchEntity>()
    var searchRequest = new ClaimContactSearchRequest(criteria, store)

    var solrQuery = constructSearchQuery(searchRequest)
    if(solrQuery != null) {
      var solrServer = CCSolrConfig.getSolrServer(searchRequest.getDocumentType())
      var queryRequest = new QueryRequest(solrQuery, SolrRequest.METHOD.POST)
      var response = queryRequest.process(solrServer)
	    SolrSearchMonitor.Instance.incrementTotalSearches()

      if(response.Status == 0) {
        if(Debug) _logger.info("Query response:" + (response != null ? "\n" + response : "(null)"))
        result = searchRequest.processQueryResponse(response, 0, store)
      } else {
	  	  SolrSearchMonitor.Instance.incrementTotalSearchErrors()
        _logger.warn("Query failed with response code " + response.Status + ", content = " + response.toString())
      }
    }
    return result
  }

  override function searchPaged(criteria : ClaimSearchCriteria, store : SolrSearchStore,
          startsWith : int, dynamicFetchSize : int, sortColumns : List<SolrSortColumn>,  startRank : int) : SolrResultSet<FreeTextClaimSearchEntity> {
    var result = new SolrResultSet<FreeTextClaimSearchEntity>(0, 0, startsWith, Collections.emptyList<FreeTextClaimSearchEntity>())
    var searchRequest = new ClaimContactSearchRequest(criteria, sortColumns, store)
    
    var solrQuery = constructPagingSearchQuery(searchRequest, startsWith, dynamicFetchSize)
    if(solrQuery != null) {
      var solrServer = CCSolrConfig.getSolrServer(searchRequest.getDocumentType())
      var queryRequest = new QueryRequest(solrQuery, SolrRequest.METHOD.POST)
      var response = queryRequest.process(solrServer)

      if(response.Status == 0) {
        if(Debug) _logger.info("Query response:" + (response != null ? "\n" + response : "(null)"))
        var numFound = response.Results.NumFound as int
        var maxScore = response.Results.MaxScore
        var records = searchRequest.processQueryResponse(response, startRank, store)
        result = new SolrResultSet<FreeTextClaimSearchEntity>(numFound, maxScore, startsWith, records)
      } else {
        _logger.warn("Query failed with response code " + response.Status + ", content = " + response.toString())
      }
    }
    return result
  }
  
  private function validateSearchRequest(searchRequest:ClaimContactSearchRequest) : boolean {
    //assume if both empty, entering form for first time
    var hasQueryTerms = hasQueryTerms(searchRequest)
    if(not hasQueryTerms and hasFilterTerms(searchRequest)) {
      //if in web context, add a request-scoped warning
      LocationUtil.addRequestScopedWarningMessage(DisplayKey.get("Validation.FreeTextSearch.FilterQueryOnly"))
    }
    return hasQueryTerms
  }
  
  //Can this query actually return any results?
  private function hasQueryTerms(searchRequest:ClaimContactSearchRequest) : boolean {
    return searchRequest.getQueryString(false).HasContent 
  }
  
  //Are there query filters populated?
  private function hasFilterTerms(searchRequest:ClaimContactSearchRequest) : boolean {
    return searchRequest.getQueryFilter(false).HasContent
  }
  
  override function searchByClaimNumber(claimNumber : String, store : SolrSearchStore) : Object {
    var newDocArray = new JSONArray()
    var docType = CCSolrUtils.CC_CLAIM_CONTACT_DOCUMENT_TYPE + store.suffix()
    var solrQuery = PLSolrUtils.buildArchiveSearchParams("claimNumber:" + claimNumber, Debug)
    var solrServer = CCSolrConfig.getSolrServer(docType)
    var queryRequest = new QueryRequest(solrQuery, SolrRequest.METHOD.POST)
    var response = queryRequest.process(solrServer)
    
    if(response.Status == 0) {
      var excludes = { "score", "timestamp", "_version_" }
      for(doc in response.Results) {
        var newDocObj = new JSONObject()
        for(key in doc.Keys) {
          if(excludes.contains(key)) {
            continue
          }
          var data = convertEntry(doc.get(key))
          newDocObj.put(key, data)
        }
        newDocArray.add(newDocObj)
      }
    } else {
      _logger.warn("Query failed with response code " + response.Status + ", content = " + response.toString())
    }
    return newDocArray
  }
  
  static final var DATE_FORMAT = "yyyy-MM-dd"
  static final var DATE_FORMATTER = UltraFastDateFormat.getInstance(DATE_FORMAT)
  
  function convertEntry(candidateValue : Object) : Object {
    var value : Object = null
    if(candidateValue typeis String) {
      value = candidateValue
    } else if(candidateValue typeis java.lang.Number) {
      // java.lang.Number needs to be fully qualified, otherwise this won't match 
      // java.lang numeric types (e.g. Long)
      value = candidateValue.toString()
    } else if(candidateValue typeis Boolean) {
      value = Boolean.valueOf(candidateValue)
    } else if(candidateValue typeis Date) {
      value = DATE_FORMATTER.format(candidateValue) + "T00:00:00.000Z"
    } else if(candidateValue typeis List) {
      if(candidateValue.HasElements) {
        var nested = new JSONArray()
        for(cv in candidateValue) {
          nested.add(convertEntry(cv))
        }
        value = nested
      }
    } else if(candidateValue != null) {
      _logger.error("Convert( Solr -> JSON ) failed on field of type " + typeof candidateValue)
    }
    return value
  }

}
