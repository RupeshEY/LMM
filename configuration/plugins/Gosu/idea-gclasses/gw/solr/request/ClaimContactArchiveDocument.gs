package gw.solr.request

uses org.json.simple.JSONObject
uses gw.cc.config.Resources

/**
 * Solr index document for archived Claims.
 */
@Export
class ClaimContactArchiveDocument extends AbstractIndexDocument {
  
  var _jsonDoc : JSONObject
  
  static function createDocument(docObj : JSONObject) : ClaimContactArchiveDocument {
    var document = new ClaimContactArchiveDocument()
    document.constructDocument(docObj)
    return document
  }
  
  construct() {
    super(Resources.CLAIMCONTACT_SEARCH_CONFIG)
  }
  
  function constructDocument(jsonDoc : JSONObject) {
    _jsonDoc = jsonDoc
  }
  
  override function asJSON() : JSONObject {
    return _jsonDoc
  }

}
