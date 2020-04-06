package gw.acc.iplm.enhancements.entity

uses gw.api.database.Query

enhancement ECFMessageDocumentSearchRs_ExtEnhancement: ECFMessageDocumentSearchRs_Ext {

  /**
   * Gets the Claim Notify request which may have triggered this Document
   * Search based on the TR.
   *
   * If no TR exists, it returns null.
   *
   * @return ECFMessageClaimNotifyRq_Ext
   */
  property get ClaimNotifyMessage(): ECFMessageClaimNotifyRq_Ext {
    if (this.TR == null) {
      return null
    }

    var claimNotifyMessage = Query.make(ECFMessageClaimNotifyRq_Ext)
        .compare(ECFMessageClaimNotifyRq_Ext#TR, Equals, this.TR)

    return claimNotifyMessage.select().AtMostOneRow
  }

}
