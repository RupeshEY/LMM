package gw.solr.request

uses gw.solr.utils.CCSolrUtils
uses gw.plugin.solr.SolrSearchStore
uses org.json.simple.JSONArray
uses org.json.simple.JSONObject


/**
 * Message request for the archive claims index.
 */
@Export
class ClaimContactArchiveRequest extends AbstractIndexRequest implements IMessageRequest {

  var _store : SolrSearchStore
  
  construct(docArray : JSONArray, store : SolrSearchStore) {
    _store = store
    for (docObj in docArray) {
      addDocument(ClaimContactArchiveDocument.createDocument(docObj as JSONObject))
    }
  }
  
  override function getDocumentType() : String {
    return CCSolrUtils.CC_CLAIM_CONTACT_DOCUMENT_TYPE + _store.suffix()
  }
  
}
