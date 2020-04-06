package gw.solr.request

uses gw.solr.utils.CCSolrUtils
uses gw.plugin.solr.SolrSearchStore
uses gw.solr.utils.CCACLInfo


/**
 * Index message request for the claim contact index.
 */
@Export
class ClaimContactIndexRequest extends AbstractIndexRequest {
  
  var _store : SolrSearchStore
  
  construct(claim : Claim, store : SolrSearchStore) {
    _store = store
    var aclInfo = CCACLInfo.createACLInfoForClaim(claim.Access)
    for (var claimContact in claim.Contacts) {
      addDocument(ClaimContactIndexDocument.createDocument(claimContact, aclInfo))
    }
  }

  construct(claim : Claim) {
    this(claim, SolrSearchStore.ACTIVE)
  }
  
  construct(claimContact : ClaimContact, store : SolrSearchStore) {
    _store = store
    addDocument(ClaimContactIndexDocument.createDocument(claimContact, CCACLInfo.createACLInfoForClaim(claimContact.Claim.Access)))
  }
  
  construct(claimContact : ClaimContact) {
    this(claimContact, SolrSearchStore.ACTIVE)
  }

  override function getDocumentType() : String {
    return CCSolrUtils.CC_CLAIM_CONTACT_DOCUMENT_TYPE + _store.suffix()
  }

}
