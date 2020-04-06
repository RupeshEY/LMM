package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.exception.imr.IMRErrorCodeType
uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.InboundIMRService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs

class IMRDocumentSearchRsService extends InboundIMRService<ECFMessageDocumentSearchRs_Ext> {

  /**
   * Processes the RepositoryOperationRs object returned from
   * IMR in order to update the appropriate Claim entity.
   * The Claim entity is identified by the UCR of the first document in the result
   *
   * @param ecfMessage The ECFMessage Entity which contains the message to process
   * @return The updated Claim entity.
   */
  override function process(ecfMessage: ECFMessageDocumentSearchRs_Ext) {
    try {
      var repositoryOperationRs = RepositoryOperationRs.parse(ecfMessage.Content.ContentString)
      if (repositoryOperationRs.DocumentList == null or repositoryOperationRs.DocumentList.isEmpty()) {
        return
      }
      var claimToUpdate = ecfMessage.Claim
      var tr = ecfMessage.TR
      if (claimToUpdate == null) {
        throw new ECFException(ECFErrorCodeType.CLAIM_NOT_FOUND_FOR_UCR)
      }
      var claimDocs = claimToUpdate.Documents
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        claimToUpdate = bundle.add(claimToUpdate)
        for (imrDoc in repositoryOperationRs?.DocumentList?.first()?.DocumentItem*.Document) {
          var documentToUpdate = claimDocs?.firstWhere(\elt -> elt.IMRDocumentId == imrDoc.DocumentId)?:new Document()
          documentToUpdate = bundle.add(documentToUpdate)
          mapDocumentInformation(documentToUpdate, imrDoc, tr)
          claimToUpdate.addToDocuments(documentToUpdate)
        }
      }, ECFConstants.ECF_SUPER_USER)

    } catch (ex: Exception) {
      throw new IMRException(IMRErrorCodeType.IMR_DOCUMENT_SEARCH_ERROR, ex)
    }
  }

  /**
   * Maps the information from the IMR document data to a document entity.
   *
   * @param docToUpdate          The Document Entity to update.
   * @param imrDocItem           The IMR Document information.
   * @param transactionReference The transaction Reference.
   */
  override function mapDocumentInformation(docToUpdate: entity.Document, imrDoc: gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document, transactionReference: String) {
    super.mapDocumentInformation(docToUpdate, imrDoc, transactionReference)

    if (docToUpdate.New) {
      docToUpdate.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
    }
    //If it already existed, but was on DMS
    else if (docToUpdate.ECFStatus == ECFDocumentStatus_Ext.TC_ON_DMS) {
      docToUpdate.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
    }
  }
}