package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (DocumentParam :  Document) : int {
      return 0
    }
    
    static function __constructorIndex (DocumentParam :  Document, editMetadata :  boolean) : int {
      return 1
    }
    
    // 'action' attribute on Link (id=UploadLink) at DocumentDetailsPopup.pcf: line 68, column 162
    function action_14 () : void {
      UploadDocumentContentPopup.push(DocumentParam)
    }
    
    // 'action' attribute on Link (id=DownloadLink) at DocumentDetailsPopup.pcf: line 48, column 164
    function action_6 () : void {
      DocumentParam.downloadContent()
    }
    
    // 'action' attribute on Link (id=UploadLink) at DocumentDetailsPopup.pcf: line 68, column 162
    function action_dest_15 () : pcf.api.Destination {
      return pcf.UploadDocumentContentPopup.createDestination(DocumentParam)
    }
    
    // 'afterCommit' attribute on Popup (id=DocumentDetailsPopup) at DocumentDetailsPopup.pcf: line 9, column 67
    function afterCommit_26 (TopLocation :  pcf.api.Location) : void {
      DocumentDetailsPopup.push(DocumentParam, editMetadata)
    }
    
    // 'available' attribute on Link (id=DownloadLink) at DocumentDetailsPopup.pcf: line 48, column 164
    function available_4 () : java.lang.Boolean {
      return documentsActionsHelper.isDocumentContentActionsAvailableInDocumentProperties(CurrentLocation.InEditMode, DocumentParam)
    }
    
    // 'canEdit' attribute on Popup (id=DocumentDetailsPopup) at DocumentDetailsPopup.pcf: line 9, column 67
    function canEdit_27 () : java.lang.Boolean {
      return perm.Document.edit(DocumentParam)
    }
    
    // 'columns' attribute on Layout at DocumentDetailsPopup.pcf: line 76, column 25
    function columns_18 () : java.lang.Double {
      return 1
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 79, column 38
    function def_onEnter_19 (def :  pcf.DocumentDetailsEditInputSet_default) : void {
      def.onEnter(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 79, column 38
    function def_onEnter_21 (def :  pcf.DocumentDetailsEditInputSet_email_sent) : void {
      def.onEnter(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 81, column 73
    function def_onEnter_24 (def :  pcf.DocumentDetailsEditSupplementalInputSet) : void {
      def.onEnter(DocumentParam)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 79, column 38
    function def_refreshVariables_20 (def :  pcf.DocumentDetailsEditInputSet_default) : void {
      def.refreshVariables(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 79, column 38
    function def_refreshVariables_22 (def :  pcf.DocumentDetailsEditInputSet_email_sent) : void {
      def.refreshVariables(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 81, column 73
    function def_refreshVariables_25 (def :  pcf.DocumentDetailsEditSupplementalInputSet) : void {
      def.refreshVariables(DocumentParam)
    }
    
    // 'icon' attribute on Link (id=UploadLink) at DocumentDetailsPopup.pcf: line 68, column 162
    function icon_16 () : java.lang.String {
      return documentsActionsHelper.isDocumentContentActionsAvailableInDocumentProperties(CurrentLocation.InEditMode, DocumentParam) ? "upload_document_16.png" : "upload_document_disabled_16.png"
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at DocumentDetailsPopup.pcf: line 48, column 164
    function icon_7 () : java.lang.String {
      return documentsActionsHelper.isDocumentContentActionsAvailableInDocumentProperties(CurrentLocation.InEditMode, DocumentParam) ? "download_document_16.png" : "download_document_disabled_16.png" 
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsPopup.pcf: line 20, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // EditButtons at DocumentDetailsPopup.pcf: line 34, column 112
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on InputSetRef at DocumentDetailsPopup.pcf: line 79, column 38
    function mode_23 () : java.lang.Object {
      return DocumentParam.Type
    }
    
    // 'tooltip' attribute on Link (id=UploadLink) at DocumentDetailsPopup.pcf: line 68, column 162
    function tooltip_17 () : java.lang.String {
      return documentsActionsHelper.UploadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at DocumentDetailsPopup.pcf: line 48, column 164
    function tooltip_8 () : java.lang.String {
      return documentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'visible' attribute on AlertBar (id=ContentlessNoActionsText) at DocumentDetailsPopup.pcf: line 30, column 39
    function visible_1 () : java.lang.Boolean {
      return !DocumentParam.DMS
    }
    
    // 'visible' attribute on Link (id=UploadLink) at DocumentDetailsPopup.pcf: line 68, column 162
    function visible_13 () : java.lang.Boolean {
      return editMetadata and documentsActionsHelper.isUploadDocumentContentVisibleInDocumentProperties(CurrentLocation.InEditMode, DocumentParam)
    }
    
    // 'editVisible' attribute on EditButtons at DocumentDetailsPopup.pcf: line 34, column 112
    function visible_2 () : java.lang.Boolean {
      return editMetadata and documentsActionsHelper.isEditDocumentDetailsVisible(DocumentParam)
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at DocumentDetailsPopup.pcf: line 48, column 164
    function visible_5 () : java.lang.Boolean {
      return editMetadata and documentsActionsHelper.isDownloadDocumentContentVisibleInDocumentProperties(CurrentLocation.InEditMode, DocumentParam)
    }
    
    // 'visible' attribute on Link (id=Spacer1) at DocumentDetailsPopup.pcf: line 52, column 131
    function visible_9 () : java.lang.Boolean {
      return editMetadata and documentsActionsHelper.isIconSpacerVisible(CurrentLocation.InEditMode, DocumentParam)
    }
    
    override property get CurrentLocation () : pcf.DocumentDetailsPopup {
      return super.CurrentLocation as pcf.DocumentDetailsPopup
    }
    
    property get DocumentParam () : Document {
      return getVariableValue("DocumentParam", 0) as Document
    }
    
    property set DocumentParam ($arg :  Document) {
      setVariableValue("DocumentParam", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get editMetadata () : boolean {
      return getVariableValue("editMetadata", 0) as java.lang.Boolean
    }
    
    property set editMetadata ($arg :  boolean) {
      setVariableValue("editMetadata", 0, $arg)
    }
    
    
  }
  
  
}