package gw.solr

uses gw.solr.consistency.IReconstructor
uses gw.solr.request.ClaimContactIndexDocument
uses gw.solr.utils.CCACLInfo
uses org.json.simple.JSONObject
uses java.util.List


@Export
class CCDocumentReconstructor implements IReconstructor {

  override function reconstructDocument(docObj : JSONObject, updatedBeans : List<KeyableBean>) : JSONObject {
    var theClaimContact = updatedBeans.firstWhere( \ b -> b typeis ClaimContact ) as ClaimContact
    var aclInfo = CCACLInfo.createACLInfoForClaim(theClaimContact.Claim.Access)
    return ClaimContactIndexDocument.createDocument(theClaimContact, aclInfo).asJSON()
  }
  
}
