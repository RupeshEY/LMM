package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.controller.IMRMessageController

enhancement ECFDocumentEnhancement: Document {

  /**
   * A Property to check if document can be downloaded from IMR or not.
   *
   * @return boolean indicating if the document allowed in IMR Document Download request or not.
   */
  property get CanDownloadFromIMR(): boolean {
    return this.Claim.UCR_Ext != null
        and this.ECFStatus == ECFDocumentStatus_Ext.TC_ON_IMR
        and this.ECFStatus != ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD
  }

  /**
   * A Property to check if document can be uploaded to IMR or not.
   *
   * @return boolean indicating if the document allowed in IMR Document upload request or not.
   */
  property get CanUploadToIMR(): boolean {
    return this.Claim.UCR_Ext != null
        and this.ECFStatus == ECFDocumentStatus_Ext.TC_ON_DMS
        and this.ECFStatus != ECFDocumentStatus_Ext.TC_PENDING_UPLOAD
        and this.Status == DocumentStatusType.TC_FINAL
        and this.ContentExist
  }


  /**
   * A Property to check if the document exist on DMS or not.
   *
   * @return boolean indicating if the document is on DMS or not.
   */
  public property get OnDMS(): boolean {
    return (this.ECFStatus == ECFDocumentStatus_Ext.TC_ON_DMS or this.ECFStatus == ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS or this.ECFStatus == ECFDocumentStatus_Ext.TC_PENDING_UPLOAD)
  }

  /**
   * A function for sending IMR Upload request to upload a document to IMR.
   * Called from after commit in a popup, so updates are handled in a new bundle
   *
   * @param uploadAccessParties the access parties, their rights and actions and if the can be attached to the request or not.
   */
  function uploadToIMR(uploadAccessParties: java.util.List<ECFMessageDocumentUploadAccessParty_Ext>) {
    if (CanUploadToIMR) {
      var accessParties: java.util.List<ECFMessageDocumentUploadAccessParty_Ext>
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        if (accessParties == null) {
          accessParties = new ArrayList<ECFMessageDocumentUploadAccessParty_Ext>()
        }
        for (accessParty in uploadAccessParties) {
          if (not accessParty.CanAccess) {
            accessParties.add(accessParty)
          }
        }
        new IMRMessageController().sendRepositoryUploadRequestForDocument(this, accessParties)

      }, User.util.UnrestrictedUser)
    }
  }

  /**
   * A function for sending an IMR Download request to download a document from IMR
   * to the DMS.
   */
  function downloadToDMS() {
    if (CanDownloadFromIMR) {
      new IMRMessageController().sendRepositoryDownloadRequestForDocument(this)
    }
  }

  /**
   * A function for returning ECF document location status.
   *
   * @return ECFDocumentStatus_Ext
   */
  property get ECFDocumentLocationStatus(): ECFDocumentStatus_Ext {
    if (not this.ContentExist and this.TR == null) {
      return ECFDocumentStatus_Ext.TC_NONE
    } else {
      return this.ECFStatus
    }
  }
}
