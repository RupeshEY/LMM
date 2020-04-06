package gw.solr.request

uses gw.solr.utils.CCSolrUtils
uses gw.plugin.solr.SolrSearchStore


/**
 * Message request to delete a claim contact.
 */
@Export
class ClaimContactDeleteRequest extends AbstractDeleteRequest {

  var _store : SolrSearchStore

  construct(claim : Claim, store : SolrSearchStore) {
    _store = store
    for (var claimContact in claim.Contacts) {
      addDocument(ClaimContactIndexDocument.createKey(claimContact))
    }
  }

  construct(claim : Claim) {
    this(claim, SolrSearchStore.ACTIVE)
  }

  construct(claimContact : ClaimContact, store : SolrSearchStore) {
    _store = store
    addDocument(ClaimContactIndexDocument.createKey(claimContact))
  }

  construct(claimContact : ClaimContact) {
    this(claimContact, SolrSearchStore.ACTIVE)
  }
  
  construct(claimNumber : String, store : SolrSearchStore) {
    _store = store
    addQuery("claimNumber", claimNumber)
  }

  override function getDocumentType() : String {
    return CCSolrUtils.CC_CLAIM_CONTACT_DOCUMENT_TYPE + _store.suffix()
  }

}
