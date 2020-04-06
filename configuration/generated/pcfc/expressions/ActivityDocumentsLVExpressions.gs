package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ActivityDocumentsLV.pcf: line 13, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'value' attribute on RowIterator at ActivityDocumentsLV.pcf: line 87, column 29
    function sortValue_1 (document :  entity.Document) : java.lang.Object {
      return document.Type
    }
    
    // 'value' attribute on RowIterator at ActivityDocumentsLV.pcf: line 92, column 51
    function sortValue_2 (document :  entity.Document) : java.lang.Object {
      return document.Status
    }
    
    // 'value' attribute on RowIterator at ActivityDocumentsLV.pcf: line 97, column 36
    function sortValue_3 (document :  entity.Document) : java.lang.Object {
      return document.Author
    }
    
    // 'value' attribute on RowIterator at ActivityDocumentsLV.pcf: line 108, column 29
    function sortValue_4 (document :  entity.Document) : java.lang.Object {
      return document.DateModified
    }
    
    // 'value' attribute on RowIterator at ActivityDocumentsLV.pcf: line 19, column 37
    function value_43 () : entity.Document[] {
      return Activity.LinkedDocuments
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ActivityDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at ActivityDocumentsLV.pcf: line 51, column 77
    function action_11 () : void {
      DocumentDetailsPopup.push(document, !CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on Link (id=DownloadLink) at ActivityDocumentsLV.pcf: line 60, column 90
    function action_17 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function action_22 () : void {
      UploadDocumentContentPopup.push(document)
    }
    
    // 'action' attribute on Link (id=DocumentsLV_RemoveLink) at ActivityDocumentsLV.pcf: line 78, column 82
    function action_27 () : void {
      documentsActionsHelper.removeLinkedDocument(document, Activity, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on Link (id=NameLink) at ActivityDocumentsLV.pcf: line 40, column 87
    function action_7 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at ActivityDocumentsLV.pcf: line 51, column 77
    function action_dest_12 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document, !CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function action_dest_23 () : pcf.api.Destination {
      return pcf.UploadDocumentContentPopup.createDestination(document)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at ActivityDocumentsLV.pcf: line 51, column 77
    function available_10 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on Link (id=DownloadLink) at ActivityDocumentsLV.pcf: line 60, column 90
    function available_15 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function available_20 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=NameLink) at ActivityDocumentsLV.pcf: line 40, column 87
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'confirmMessage' attribute on Link (id=DocumentsLV_RemoveLink) at ActivityDocumentsLV.pcf: line 78, column 82
    function confirmMessage_28 () : java.lang.String {
      return DisplayKey.get("Web.DocumentsLV.Button.Remove.Confirm", "activity")
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at ActivityDocumentsLV.pcf: line 51, column 77
    function icon_13 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at ActivityDocumentsLV.pcf: line 60, column 90
    function icon_18 () : java.lang.String {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document) ? "download_document_16.png" : "download_document_disabled_16.png" 
    }
    
    // 'icon' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function icon_24 () : java.lang.String {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document) ? "upload_document_16.png" : "upload_document_disabled_16.png"
    }
    
    // 'icon' attribute on Link (id=DocumentsLV_RemoveLink) at ActivityDocumentsLV.pcf: line 78, column 82
    function icon_29 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "remove_document_16.png" : "remove_document_disabled_16.png"  
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at ActivityDocumentsLV.pcf: line 26, column 32
    function icon_5 () : java.lang.String {
      return document.Icon
    }
    
    // 'label' attribute on Link (id=NameLink) at ActivityDocumentsLV.pcf: line 40, column 87
    function label_8 () : java.lang.Object {
      return document.Name
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at ActivityDocumentsLV.pcf: line 51, column 77
    function tooltip_14 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at ActivityDocumentsLV.pcf: line 60, column 90
    function tooltip_19 () : java.lang.String {
      return documentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function tooltip_25 () : java.lang.String {
      return documentsActionsHelper.UploadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=DocumentsLV_RemoveLink) at ActivityDocumentsLV.pcf: line 78, column 82
    function tooltip_30 () : java.lang.String {
      return documentsActionsHelper.RemoveDocumentReferenceLinkTooltip
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at ActivityDocumentsLV.pcf: line 40, column 87
    function tooltip_9 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ActivityDocumentsLV.pcf: line 87, column 29
    function valueRoot_33 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ActivityDocumentsLV.pcf: line 87, column 29
    function value_31 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ActivityDocumentsLV.pcf: line 92, column 51
    function value_34 () : typekey.DocumentStatusType {
      return document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at ActivityDocumentsLV.pcf: line 97, column 36
    function value_37 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at ActivityDocumentsLV.pcf: line 108, column 29
    function value_40 () : java.util.Date {
      return document.DateModified
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at ActivityDocumentsLV.pcf: line 60, column 90
    function visible_16 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentVisible(document)
    }
    
    // 'visible' attribute on Link (id=UploadLink) at ActivityDocumentsLV.pcf: line 69, column 88
    function visible_21 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentVisible(document)
    }
    
    property get document () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  
}