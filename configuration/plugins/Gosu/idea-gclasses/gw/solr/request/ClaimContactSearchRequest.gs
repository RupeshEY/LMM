package gw.solr.request

uses gw.plugin.solr.SolrSearchStore
uses gw.plugin.solr.SolrSortColumn
uses gw.solr.mapper.CCBuildDate
uses gw.solr.utils.CCACLInfo
uses gw.solr.utils.CCSolrDateUtil
uses gw.solr.utils.CCSolrUtils

uses gw.cc.config.Resources
uses java.util.List


/**
 * Claim contact search request.
 */
@Export
class ClaimContactSearchRequest extends AbstractSearchRequest<FreeTextClaimSearchEntity> {

  var _claimSearchCriteria : ClaimSearchCriteria
  var _store : SolrSearchStore
  
  construct(claimSearchCriteriaIn : ClaimSearchCriteria, sortColumns : List<SolrSortColumn>, store : SolrSearchStore) {
    super(Resources.CLAIMCONTACT_SEARCH_CONFIG, sortColumns)
    _claimSearchCriteria = claimSearchCriteriaIn
    _store = store
  }
  
  construct(claimSearchCriteriaIn : ClaimSearchCriteria, store : SolrSearchStore) {
    this(claimSearchCriteriaIn, null, store)
  }
  
  construct(claimSearchCriteriaIn : ClaimSearchCriteria) {
    this(claimSearchCriteriaIn, null, SolrSearchStore.ACTIVE)
  }
  
  override function getDocumentType() : String {
    return CCSolrUtils.CC_CLAIM_CONTACT_DOCUMENT_TYPE + _store.suffix()
  }

  // ------------------------------------------------------------------
  // Query construction
  // ------------------------------------------------------------------
  
  override function createSearchCriteria () {
    addCriterion(_claimSearchCriteria)
    addCriterion(CCACLInfo.ACLINFO, CCACLInfo.createACLInfoForCurrentUser(true, 300))
    addDateCriterion(_claimSearchCriteria.DateCriterionChoice)
  }

  function addDateCriterion( criterion : DateCriterionChoice ) {
    if(criterion != null) {
      var key = CCSolrDateUtil.getDateKey(criterion)
      if(key != null) {
        var range = CCSolrDateUtil.getDateRange(criterion)
        addCriterion(key, range)
        addCriterion(CCBuildDate.DATE_FIELD_SELECTION, key)
      }
    }
  }
  
  // ------------------------------------------------------------------
  // Query result processing
  // ------------------------------------------------------------------
  
  override function createResultRow() : FreeTextClaimSearchEntity {
    return new FreeTextClaimSearchEntity()
  }

  override function filterDocument( result : FreeTextClaimSearchEntity, store : SolrSearchStore) : boolean {
    var shouldFilter = super.filterDocument(result, store)
    if(!shouldFilter) {
      if (result.Status == null) {
        shouldFilter = (store == SolrSearchStore.ARCHIVE)
      } else {
        shouldFilter = (store == SolrSearchStore.ACTIVE) and isArchived(result)
      }
    }
    return shouldFilter
  }

  private function isArchived(result : FreeTextClaimSearchEntity) : boolean {
    return result.Status==ArchiveState.TC_ARCHIVED.DisplayName || result.Status==ArchiveState.TC_ARCHIVED.Code
  }
}
