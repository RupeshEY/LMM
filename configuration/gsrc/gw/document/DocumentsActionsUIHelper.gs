package gw.document

uses gw.api.admin.MessagingUtil
uses gw.api.locale.DisplayKey
uses gw.api.system.CCLoggerCategory
uses gw.api.system.PLConfigParameters
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSource
uses gw.plugin.document.IDocumentMetadataSource
uses gw.plugin.document.IDocumentProduction
uses gw.plugin.document.IDocumentTemplateSerializer
uses gw.plugin.document.IDocumentTemplateSource

/**
 * UI helper functions for the Documents UI in DocumentsLVs and DocumentPropertiesPopups
 */
@Export
class DocumentsActionsUIHelper {

  var _contentOutboundAvailable : Boolean = null
  var _metadataOutboundAvailable : Boolean = null

  /********************* Plugins Helpers *********************************************
  *
  *  IDocumentContentSource and IDocumentMetadataSource plugin helpers.
  *
  ***********************************************************************************/

  /**
   * Determines the asynchronous message to display in the documents actions while the
   * document is being stored in the DMS.
   * @return Asynchronous message for document actions
   */
  property get AsynchronousActionsMessage() : String {
    return DocumentStoreSuspended ?
        DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.Pending") :
        DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.Pending.Refresh")
  }

  /**
   * If the Metadata plugin is enabled, this returns whether it is available
   * Otherwise, it returns true
   */
  property get ShowMetadataServerDownWarning() : boolean {
    return MetadataSourceEnabled and not DocumentMetadataServerAvailable
  }

  /**
   * If the Content plugin is enabled, this returns whether it is available
   * Otherwise, it returns true
   */
  property get ShowContentServerDownWarning() : boolean {
    return ContentSourceEnabled and not DocumentContentServerAvailable
  }

  /**
   * Gets the status of the DocumentStore transport for the Asynchronous configuration
   * of the IDocumentContentSource plugin.
   *
   * @return the MessageDestinationStatus for DocumentStore
   */
  property get DocumentStoreSuspended () : boolean {
    var documentStoreDestination = MessagingUtil.getDestinationInfo().where(\destInfo -> destInfo.DestId == 324)
    if (documentStoreDestination.HasElements) {
      if (documentStoreDestination.Count > 1) {
        CCLoggerCategory.DOCUMENT.error("You have defined more than one configuration for the destination 324 in your messaging-config.xml. Please" +
            "take a look and make sure you only have one definition")
      }
      return {
          MessageDestinationStatus.TC_SHUTDOWN,
          MessageDestinationStatus.TC_SUSPENDED,
          MessageDestinationStatus.TC_SUSPENDING,
          MessageDestinationStatus.TC_SUSPENDEDINBOUND,
          MessageDestinationStatus.TC_SUSPENDEDOUTBOUND
        }.contains(documentStoreDestination.first().Status)
    } else {
      // If the DocumentStore destination is disabled, there is not a DestinationInfo for it in the MessagingUtil
      return false
    }
  }

  /**
   * Checks whether the actions in the Documents ListView are not visible because document is 'in flight'
   * @param document
   * @return whether the document is 'in flight'
   */
  function isDocumentPending(document: Document) : boolean {
    return document != null and document.PendingDocUID != null and document.DMS
  }

  /**
   * Determines if the IDocumentContentSource plugin is enabled and available to communicate with the DMS
   * @return whether the DMS is available to do actions with the documents
   */
  property get DocumentContentServerAvailable() : boolean {
    if(_contentOutboundAvailable == null) {
      //We cache the value because the call is expensive
      _contentOutboundAvailable = gw.plugin.Plugins.get(IDocumentContentSource).isOutboundAvailable()
    }
    return ContentSourceEnabled and _contentOutboundAvailable
  }

  /**
   * Determines if the IDocumentMetadataSource plugin is enabled and available to communicate with the DMS
   * @return whether the DMS is available to do access document metadata
   */
  property get DocumentMetadataServerAvailable() : boolean {
    if(_metadataOutboundAvailable == null) {
      //We cache the value because the call is expensive
      _metadataOutboundAvailable = (gw.plugin.Plugins.get(IDocumentMetadataSource)).isOutboundAvailable()
    }
      return MetadataSourceEnabled and _metadataOutboundAvailable
  }

  /**
   * Checks if the IDocumentContentSource plugin is configured enabled.
   * @return whether the IDCS plugin is enabled
   */
  property get ContentSourceEnabled () : boolean {
    return gw.plugin.Plugins.isEnabled(gw.plugin.document.IDocumentContentSource)
  }

  /**
   * Checks if the IDocumentMetadataSource plugin is configured enabled.
   * @return whether the IDMS plugin is enabled
   */
  property get MetadataSourceEnabled () : boolean {
    return gw.plugin.Plugins.isEnabled(gw.plugin.document.IDocumentMetadataSource)
  }

  /**
   * Checks if the document is stored in the DMS and it is accessible. The documents that
   * are in the temporary location are not in the DMS.
   * @param document
   * @return
   */
  private function documentStoredInDMS(document : Document) : boolean {
    return ContentSourceEnabled and document != null and document.PendingDocUID == null and document.DMS
  }

  /********************* Available Helpers *********************************************
  *
  *  Document actions' availability helpers.
  *
  *************************************************************************************/

  /**
   * Tells whether to enable document actions related to the metadata of the
   * document that are independent on the content.
   * @return true if the document metadata server is available, false otherwise
   */
  property get DocumentMetadataActionsAvailable() : boolean {
    if (MetadataSourceEnabled) {
      return DocumentMetadataServerAvailable
    }
    return ContentSourceEnabled
  }

  /**
   * Whether or not Content actions are available. This depends on whether the Content Server is available according
   * to the enabled plugin
   */
  property get DocumentContentActionsAvailable() : boolean {
    return ContentSourceEnabled and DocumentContentServerAvailable
  }

  /**
   * For template actions to be available, all 4 plugins must be available
   * The document must be picked (TemplateSource), generated (DocumentProduction),
   * and stored(Metadata and Content)
   * @return
   */
  property get DocumentTemplateActionsAvailable() : boolean {
    return DocumentProductionAvailable
        and DocumentTemplateSourceAvailable
        and DocumentMetadataActionsAvailable
        and DocumentContentActionsAvailable
  }

  /**
   * returns whether the DocumentProduction plugin is enabled
   */
  property get DocumentProductionAvailable() : boolean {
    return Plugins.isEnabled(IDocumentProduction)
  }

  /**
   * returns whether the TemplateSource plugin is available
   * For the LocalDocumentTemplateSource, the TemplateSerializer needs to be enabled as well
   */
  property get DocumentTemplateSourceAvailable() : boolean {
    return Plugins.isEnabled(IDocumentTemplateSource) and Plugins.isEnabled(IDocumentTemplateSerializer)
  }

  function isViewDocumentContentAvailable(document: Document) : boolean {
    return DocumentContentActionsAvailable and document != null and perm.Document.view(document) and document.DMS and
        document.ContentExist and document.PendingDocUID == null and
        document.DocumentMimeTypeAllowed
  }

  function isDownloadDocumentContentAvailable(document: Document) : boolean {
    return DocumentContentActionsAvailable and document != null and document.ContentExist
  }

  function isDeleteDocumentLinkAvailable(document: Document, undeletableDocumentPublicIds: java.util.Set<String>) : boolean {
    return DocumentMetadataActionsAvailable and
        not undeletableDocumentPublicIds.contains(document.PublicID)
  }

  function isRemoveDocumentLinkAvailable(serviceDocumentLink : gw.util.Pair<entity.ServiceRequestDocumentLink,entity.Document>) : boolean {
    return DocumentMetadataActionsAvailable and
        serviceDocumentLink.First.Unlinkable
  }

  function isUploadDocumentContentAvailable(document: Document) : boolean {
    return DocumentContentActionsAvailable and
        DocumentMetadataActionsAvailable and
        document != null and document.ContentExist
  }

  function isDocumentContentActionsAvailableInDocumentProperties(editable: boolean, document: Document) : boolean {
    return not editable and document != null and document.ContentExist and document.PendingDocUID == null
        and DocumentContentActionsAvailable
  }

  /********************* Visible Helpers *********************************************
  *
  *  Document actions' visibility helpers.
  *
  ***********************************************************************************/

  function isDownloadDocumentContentVisible(document: Document) : boolean {
    return document != null and perm.Document.view(document) and documentStoredInDMS(document)
  }

  function isEditDocumentDetailsVisible(document: Document) : boolean {
    return PLConfigParameters.DisplayDocumentEditUploadButtons.Value
        and document.PendingDocUID == null
        and isDocumentEditable(document)
  }

  function isUploadDocumentContentVisible(document: Document) : boolean {
    return PLConfigParameters.DisplayDocumentEditUploadButtons.Value
        and documentStoredInDMS(document)
        and isDocumentEditable(document)
  }

  private function isDocumentEditable(document : Document) : boolean {
    return document != null
        and perm.Document.edit(document)
        and document.Status != DocumentStatusType.TC_FINAL
  }

  /**
   * This is intended to control the visibility of the delete document from claim action.
   * Represented by the "ico_delete.png.png" and
   * "ico_delete_disabled.png" icons.
   * @param document to delete
   * @return whether the document can be deleted from the claim
   */
  function isDeleteDocumentLinkVisible(document: Document) : boolean {
    return document != null and document.PendingDocUID == null and perm.Document.delete(document)
  }

  function isUploadDocumentContentVisibleInDocumentProperties(editable: boolean, document: Document) : boolean {
    return not editable
        and PLConfigParameters.DisplayDocumentEditUploadButtons.Value
        and document != null
        and document.DMS
        and document.Status != DocumentStatusType.TC_FINAL
        and perm.Document.edit(document)
        and ContentSourceEnabled
  }

  function isDownloadDocumentContentVisibleInDocumentProperties(editable: boolean, document: Document) : boolean {
    return not editable and ContentSourceEnabled and document != null and perm.Document.view(document) and document.DMS
  }

  function isIconSpacerVisible(editable: boolean, document: Document) : boolean {
    return isDownloadDocumentContentVisibleInDocumentProperties(editable, document)
  }

  function isShowAsynchronousRefreshAction(documents : Document[]) : boolean {
    return documents.hasMatch( \ d -> isDocumentPending(d)) and not DocumentStoreSuspended
  }

  /**
   * Remove linked document and commits the change in a new bundle so that the removal is completed
   * regardless of the toolbar control flow on the PCF. Activity is required since its bundle is where the removal work
   * is performed
   * @param document to remove
   * @param activity the document is part of
   * @param inEditMode boolean whether the currentlocation is in edit mode
   */
  public static function removeLinkedDocument(document : Document, activity : Activity, inEditMode : Boolean) : void {
    if (!inEditMode) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        var newActivity = bundle.add(activity)
        var newDocument = bundle.add(document)
        newActivity.removeLinkedDocument(newDocument)
        })

    } else {
      activity.removeLinkedDocument(document)
    }
  }

  /********************* Tooltip Helpers *********************************************
  *
  *  Document actions' tooltips helpers. There are different tooltips based on the
  *  availability and visibility.
  *
  ***********************************************************************************/

  property get UploadDocumentContentTooltip () : String{
    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.Upload.Tooltip")
  }

  property get DownloadDocumentContentTooltip () : String {
    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.Download.Tooltip")
  }

  function RemoveDocumentLinkTooltip (serviceDocumentLink : gw.util.Pair<entity.ServiceRequestDocumentLink,entity.Document> = null) : String {
     if (serviceDocumentLink != null and not serviceDocumentLink.First.Unlinkable) {
      return DisplayKey.get("LV.Claim.Documents.Document.Remove.Unlinkable.Tooltip")
    }

    return DisplayKey.get("LV.Claim.Documents.Document.Remove.Tooltip")
  }

  function DeleteDocumentTooltip (document : Document, undeletableDocumentPublicIds: java.util.Set<String> = null
      , serviceDocumentLink : gw.util.Pair<entity.ServiceRequestDocumentLink,entity.Document> = null) : String {
    if (undeletableDocumentPublicIds != null and undeletableDocumentPublicIds.contains(document.PublicID)) {
      return DisplayKey.get("LV.Claim.Documents.Document.Delete.LinkToServiceRequest.Tooltip")
    } else if (serviceDocumentLink != null and not serviceDocumentLink.First.Unlinkable) {
      return DisplayKey.get("LV.Claim.Documents.Document.Delete.Unlinkable.Tooltip")
    }

    return DisplayKey.get("LV.Claim.Documents.Document.Delete.Tooltip")
  }

  // Refer to unlinking a document from an entity other than removing it from the Claim
  property get RemoveDocumentReferenceLinkTooltip() : String {
    return DisplayKey.get("LV.Claim.Documents.Document.Remove.Tooltip")
  }

  property get ViewDocumentPropertiesTooltip() : String {
    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewProperties.Tooltip")
  }

  /**
   * Retrieves the corresponding view content tooltip for the document. It checks on the content,
   * file type and permission.
   * @return tooltip for View document content action
   */
  public function getViewDocumentContentTooltip(document: Document) : String {

    if (document.getDocUID() == DocumentsUtilBase.NO_FILE_CONTENT_UID) {
      return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewContent.IndicateExistence")
    } else if (!DocumentsUtil.isDocumentMimeTypeAllowed(document.MimeType)) {
      return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewContent.MissingMimetype.Tooltip")
    } else if (!perm.Document.view(document)) {
      return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewContent.MissingViewPermission.Tooltip")
    }

    return DisplayKey.get("LV.Claim.Documents.Document.ViewAndEdit.ViewContent.Tooltip")
  }
}
