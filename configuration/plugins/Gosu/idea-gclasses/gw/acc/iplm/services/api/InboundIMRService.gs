package gw.acc.iplm.services.api

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs

abstract class InboundIMRService<T extends entity.ECFMessage_Ext> extends InboundService<T> {

  /**
   * Creates or updates a document on a Claim
   * @param message : ECF_Message_Ext
   * @return Document
   */
  protected function createNewDocument(message: ECFMessage_Ext, tr: String = null): ArrayList<Document> {
    var repositoryOperationRs = RepositoryOperationRs.parse(message.Content.ContentString)
    var updatedDocuments: ArrayList<Document> = {}

    var claimToUpdate = message.Claim

    if (message.Claim == null) {
      throw new IMRException(IMR_UNABLE_TO_IDENTIFY_CLAIM)
    }

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      for (imrDoc in repositoryOperationRs?.DocumentList?.first().DocumentItem*.Document) {
        var documentToUpdate = claimToUpdate.Documents?.firstWhere(\elt -> elt.DocUID == imrDoc.DocumentId)?:new Document()
        documentToUpdate = bundle.add(documentToUpdate)
        mapDocumentInformation(documentToUpdate, imrDoc, tr)
        claimToUpdate.addToDocuments(documentToUpdate)
        updatedDocuments.add(documentToUpdate)
      }
    }, ECFConstants.ECF_SUPER_USER)

    return updatedDocuments
  }

  /**
   * Maps the information from the IMR document data to a document entity.
   *
   * @param docToUpdate          The Document Entity to update.
   * @param imrDocItem           The IMR Document information.
   * @param transactionReference The transaction Reference.
   */
  protected function mapDocumentInformation(docToUpdate: entity.Document, imrDoc: gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document, transactionReference: String) {
    docToUpdate.IMRDocumentId = imrDoc.DocumentId
    docToUpdate.IMRDocumentVersion = imrDoc.DocumentVersion
    docToUpdate.IMRDocumentVersionDtTime = imrDoc.DocumentVersionDtTime.toCalendar().getTime()
    docToUpdate.IMRInheritIndicator = imrDoc.InheritIndicator
    docToUpdate.Name = imrDoc.FileId
    docToUpdate.MimeType = imrDoc.FileFormatCd
    docToUpdate.IMRFileSizeNum = imrDoc.FileSize.NumUnits
    docToUpdate.IMRFileSizeUnit = imrDoc.FileSize.UnitMeasurementCd
    docToUpdate.IMRDocumentType = imrDoc.DocumentTypeCd.toString()
    docToUpdate.Description = imrDoc.Description
    docToUpdate.TR = transactionReference
  }

}