package gw.acc.iplm.entitymapper.imr.docupload

uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AccessRightCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.ListActionCdType

class DocumentUploadRqAccessPartyMapper {

  /**
   * Get Claim brokers and insurers access parties for Document
   *
   * @param document to create ECFMessageDocumentUploadAccessParty_Ext list for
   * @return List<ECFMessageDocumentUploadAccessParty_Ext> List of ECFMessageDocumentUploadAccessParty_Ext and if they can be attached to the upload request or not.
   */
  public static function createUploadAccessParties(document: Document): List<ECFMessageDocumentUploadAccessParty_Ext> {
    var claim = document.Claim

    var uploadAccessParties = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
    var ecfInsurerParties = claim.Contacts.where(\contact -> contact.Roles*.Role.contains(TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT)).toList()
    var ecfBrokerParties = claim.Contacts.where(\contact -> contact.Roles*.Role.contains(TC_BROKER_EXT)).toList()

    uploadAccessParties.addAll(mapClaimInsurerToAccessParty(ecfInsurerParties))
    uploadAccessParties.addAll(mapClaimBrokerToAccessParty(ecfBrokerParties))

    return uploadAccessParties
  }

  /**
   * Map InsurerOrReinsurer claim contacts to ECFMessageDocumentUploadAccessParty_Ext
   *
   * @param claimContacts list of InsurerOrReinsurer claim contacts.
   * @return List<ECFMessageDocumentUploadAccessParty_Ext> .
   */
  private static function mapClaimInsurerToAccessParty(claimContacts: List<ClaimContact>): List<ECFMessageDocumentUploadAccessParty_Ext> {
    var uploadAccessParties = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
    for (contact in claimContacts) {
      var accessParty = new ECFMessageDocumentUploadAccessParty_Ext()
      accessParty.ListAction = ListActionCdType.Remove.Value
      accessParty.AccessRight = AccessRightCdType.Read.Value
      accessParty.PartyId = contact.Company.ECFBureauId_Ext
      accessParty.PartyRole = ECFMessageConstants.INSURER_ROLE
      accessParty.PartyName = contact.Company.Name
      uploadAccessParties.add(accessParty)
    }
    return uploadAccessParties
  }

  /**
   * Map broker claim contacts to ECFMessageDocumentUploadAccessParty_Ext
   *
   * @param claimContacts list of broker claim contacts.
   * @return List<ECFMessageDocumentUploadAccessParty_Ext> .
   */
  private static function mapClaimBrokerToAccessParty(claimContacts: List<ClaimContact>): List<ECFMessageDocumentUploadAccessParty_Ext> {
    var uploadAccessParties = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
    for (contact in claimContacts) {
      var accessParty = new ECFMessageDocumentUploadAccessParty_Ext()
      accessParty.ListAction = ListActionCdType.Remove.Value
      accessParty.AccessRight = AccessRightCdType.Read.Value
      accessParty.PartyId = contact.Contact.VendorNumber
      accessParty.PartyRole = ContactRole.TC_BROKER_EXT.toString()
      accessParty.PartyName = contact.Contact.Name
      uploadAccessParties.add(accessParty)
    }
    return uploadAccessParties
  }

}