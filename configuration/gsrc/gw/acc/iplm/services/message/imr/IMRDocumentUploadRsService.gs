package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.InboundIMRService
uses gw.acc.iplm.utils.DocumentUtils
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementStatusCdType

class IMRDocumentUploadRsService extends InboundIMRService<ECFMessageDocumentUploadRs_Ext> {

  /**
   * This function will process IMR Document upload Async response.
   *
   * @param ecfMessage entity holding RepositoryOperationRs object from the response SOAP message.
   * @return Claim claim related to the document which has been uploaded
   */
  override function process(ecfMessage: ECFMessageDocumentUploadRs_Ext) {
    LOGGER.debug("We have Async Document Upload Response")
    var repositoryOperationRs = RepositoryOperationRs.parse(ecfMessage.Content.ContentString)

    var document = DocumentUtils.findDocumentByUploadRqUUID(repositoryOperationRs.ResponseInfo.MsgId)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      if (repositoryOperationRs.ResponseInfo.AcknowledgementStatusCd == AcknowledgementStatusCdType.Rejected) {
        document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
        LOGGER.debug(repositoryOperationRs.ResponseInfo.ErrorIndicator)
        throw new IMRException(IMR_UPLOADED_DOCUMENT_REJECTED)
      } else {
        if (repositoryOperationRs.ResponseInfo.AcknowledgementStatusCd == AcknowledgementStatusCdType.Processed_with_data_modification) {
          LOGGER.warn("{} Document upload successful however message was processed with data modification.", AcknowledgementStatusCdType.Processed_with_data_modification.Code)
        }
        if (document.OnDMS) {
          document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS
        } else {
          document.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
        }
      }
    }, ECFConstants.ECF_SUPER_USER)
  }
}