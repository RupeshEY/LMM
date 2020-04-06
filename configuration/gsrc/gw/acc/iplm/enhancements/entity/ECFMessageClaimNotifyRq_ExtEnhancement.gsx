package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.utils.ECFUtils
uses gw.api.database.Query

enhancement ECFMessageClaimNotifyRq_ExtEnhancement: ECFMessageClaimNotifyRq_Ext {

  /**
   * Gets a list of Document Search requests and responses related to this
   * Claim Notify Request based on the TR.
   * <p>
   * If no TR exists, it returns null.
   *
   * @return List<entity.ECFMessage_Ext>
   */
  property get DocumentSearchMessages(): List<entity.ECFMessage_Ext> {
    if (this.TR == null) {
      return null
    }

    var dsRqQuery = Query.make(ECFMessageDocumentSearchRq_Ext)
        .compare(ECFMessageDocumentSearchRq_Ext#TR, Equals, this.TR)
    var dsRsQuery = Query.make(ECFMessageDocumentSearchRs_Ext)
        .compare(ECFMessageDocumentSearchRs_Ext#TR, Equals, this.TR)

    var documenSearchRequests = dsRqQuery.select()?.toList()?:new ArrayList<entity.ECFMessageDocumentSearchRq_Ext>()

    var documenSearchResponses = dsRsQuery.select()?.toList()?:new ArrayList<entity.ECFMessageDocumentSearchRs_Ext>()

    var allDocumentSearches = new ArrayList<entity.ECFMessage_Ext>()
    allDocumentSearches.addAll(documenSearchRequests)
    allDocumentSearches.addAll(documenSearchResponses)

    return allDocumentSearches
  }

  /**
   * This function first evaluates participant detail in contract market if participant type is C (A Carrier) only
   * and action participant details are not missing.
   * If it finds that this role is Agreement Party in the contract market,
   * then it sets it to SAP (A second agreement party) otherwise it remains as C.
   *
   * @param participantTypeInRequest A Action Participant type in payload.
   */
  public function setParticipantType(participantTypeInRequest: String) {
    if (participantTypeInRequest == ECFParticipationType_Ext.TC_C.Code) {
      var ecfContractMarket = this.ECFContractMarkets.firstWhere(\elt -> elt.PartyIdWithoutPrefixes == this.ActionParticipant)
      this.ActionParticipantType = SAPOrCarrier(ecfContractMarket)
    } else {
      this.ActionParticipantType = ECFParticipationType_Ext.get(participantTypeInRequest)
    }
  }

  private function SAPOrCarrier(ecfContractMarket: ECFContractMarket_Ext): ECFParticipationType_Ext {
    if (ecfContractMarket != null
        and ecfContractMarket.ParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY) {
      return ECFParticipationType_Ext.TC_SAP
    } else {
      return ECFParticipationType_Ext.TC_C
    }
  }

  /*
   *Find ClaimResponseRq which this confirming ClaimNotify is a response to it.
   *
   * @return ECFMessageClaimNotifyRq_Ext
   */
  property get PreviousClaimNotify(): ECFMessageClaimNotifyRq_Ext {
    return this.Claim?.LMMessages?.whereTypeIs(ECFMessageClaimNotifyRq_Ext)?.firstWhere(\ecfMessage ->
        ecfMessage.UUID != this.UUID
            and ecfMessage.Status == ECFMessageStatus_Ext.TC_PENDING
            and ecfMessage.TR == this.TR
            and ECFUtils.stripPrefixesFromID(ecfMessage.ReceiverPartyId) == this.ActionParticipant)
  }
}
