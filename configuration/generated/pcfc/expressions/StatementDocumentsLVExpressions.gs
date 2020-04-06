package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatementDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends StatementDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function action_12 () : void {
      DocumentDetailsPopup.push(document, not currentStatement.ServiceRequest.AlreadyPromoted)
    }
    
    // 'action' attribute on Link (id=DownloadLink) at StatementDocumentsLV.pcf: line 68, column 181
    function action_18 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function action_23 () : void {
      UploadDocumentContentPopup.push(document)
    }
    
    // 'action' attribute on Link (id=Unlink) at StatementDocumentsLV.pcf: line 84, column 43
    function action_29 () : void {
      currentStatement.unlinkDocumentForUI(document, currentStatement.New ? false : true) 
    }
    
    // 'action' attribute on Link (id=NameLink) at StatementDocumentsLV.pcf: line 47, column 87
    function action_7 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function action_dest_13 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document, not currentStatement.ServiceRequest.AlreadyPromoted)
    }
    
    // 'action' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function action_dest_24 () : pcf.api.Destination {
      return pcf.UploadDocumentContentPopup.createDestination(document)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function available_10 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on Link (id=DownloadLink) at StatementDocumentsLV.pcf: line 68, column 181
    function available_16 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function available_21 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=NameLink) at StatementDocumentsLV.pcf: line 47, column 87
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document) and not CurrentLocation.InEditMode
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function icon_14 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at StatementDocumentsLV.pcf: line 68, column 181
    function icon_19 () : java.lang.String {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document) ? "download_document_16.png" : "download_document_disabled_16.png" 
    }
    
    // 'icon' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function icon_25 () : java.lang.String {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document) ? "upload_document_16.png" : "upload_document_disabled_16.png"
    }
    
    // 'icon' attribute on Link (id=Unlink) at StatementDocumentsLV.pcf: line 84, column 43
    function icon_30 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "remove_document_16.png" : "remove_document_disabled_16.png"  
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at StatementDocumentsLV.pcf: line 34, column 32
    function icon_5 () : java.lang.String {
      return document.Icon
    }
    
    // 'initialValue' attribute on Variable at StatementDocumentsLV.pcf: line 27, column 26
    function initialValue_4 () : Document {
      return statementDocumentLinkPair.Second
    }
    
    // RowIterator (id=ActiveStatementDocuments) at StatementDocumentsLV.pcf: line 23, column 121
    function initializeVariables_43 () : void {
        document = statementDocumentLinkPair.Second;

    }
    
    // 'label' attribute on Link (id=DocumentsLV_ActionsDisabled) at StatementDocumentsLV.pcf: line 89, column 75
    function label_33 () : java.lang.Object {
      return documentsActionsHelper.AsynchronousActionsMessage
    }
    
    // 'label' attribute on Link (id=NameLink) at StatementDocumentsLV.pcf: line 47, column 87
    function label_8 () : java.lang.Object {
      return document.Name
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function tooltip_15 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at StatementDocumentsLV.pcf: line 68, column 181
    function tooltip_20 () : java.lang.String {
      return documentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function tooltip_26 () : java.lang.String {
      return documentsActionsHelper.UploadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=Unlink) at StatementDocumentsLV.pcf: line 84, column 43
    function tooltip_31 () : java.lang.String {
      return documentsActionsHelper.RemoveDocumentLinkTooltip()
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at StatementDocumentsLV.pcf: line 47, column 87
    function tooltip_9 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at StatementDocumentsLV.pcf: line 95, column 45
    function valueRoot_36 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at StatementDocumentsLV.pcf: line 95, column 45
    function value_34 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on TextCell (id=Author) at StatementDocumentsLV.pcf: line 99, column 36
    function value_37 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at StatementDocumentsLV.pcf: line 108, column 24
    function value_40 () : java.util.Date {
      return document.DateModified
    }
    
    // 'visible' attribute on Link (id=ViewPropertiesLink) at StatementDocumentsLV.pcf: line 59, column 55
    function visible_11 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at StatementDocumentsLV.pcf: line 68, column 181
    function visible_17 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentVisible(document) and not CurrentLocation.InEditMode and not currentStatement.ServiceRequest.AlreadyPromoted
    }
    
    // 'visible' attribute on Link (id=UploadLink) at StatementDocumentsLV.pcf: line 76, column 179
    function visible_22 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentVisible(document)and not CurrentLocation.InEditMode and not currentStatement.ServiceRequest.AlreadyPromoted 
    }
    
    // 'visible' attribute on Link (id=Unlink) at StatementDocumentsLV.pcf: line 84, column 43
    function visible_28 () : java.lang.Boolean {
      return documentsRemovable
    }
    
    // 'visible' attribute on Link (id=DocumentsLV_ActionsDisabled) at StatementDocumentsLV.pcf: line 89, column 75
    function visible_32 () : java.lang.Boolean {
      return documentsActionsHelper.isDocumentPending(document)
    }
    
    property get document () : Document {
      return getVariableValue("document", 1) as Document
    }
    
    property set document ($arg :  Document) {
      setVariableValue("document", 1, $arg)
    }
    
    property get statementDocumentLinkPair () : gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document> {
      return getIteratedValue(1) as gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at StatementDocumentsLV.pcf: line 17, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'value' attribute on RowIterator (id=ActiveStatementDocuments) at StatementDocumentsLV.pcf: line 95, column 45
    function sortValue_1 (statementDocumentLinkPair :  gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>) : java.lang.Object {
      var document : Document = (statementDocumentLinkPair.Second)
return document.Type
    }
    
    // 'value' attribute on RowIterator (id=ActiveStatementDocuments) at StatementDocumentsLV.pcf: line 99, column 36
    function sortValue_2 (statementDocumentLinkPair :  gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>) : java.lang.Object {
      var document : Document = (statementDocumentLinkPair.Second)
return document.Author
    }
    
    // 'value' attribute on RowIterator (id=ActiveStatementDocuments) at StatementDocumentsLV.pcf: line 108, column 24
    function sortValue_3 (statementDocumentLinkPair :  gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>) : java.lang.Object {
      var document : Document = (statementDocumentLinkPair.Second)
return document.DateModified
    }
    
    // 'value' attribute on RowIterator (id=ActiveStatementDocuments) at StatementDocumentsLV.pcf: line 23, column 121
    function value_44 () : java.util.List<gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>> {
      return currentStatement.ViewableDocumentLinksAndDocuments
    }
    
    property get currentStatement () : ServiceRequestStatement {
      return getRequireValue("currentStatement", 0) as ServiceRequestStatement
    }
    
    property set currentStatement ($arg :  ServiceRequestStatement) {
      setRequireValue("currentStatement", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get documentsRemovable () : boolean {
      return getRequireValue("documentsRemovable", 0) as java.lang.Boolean
    }
    
    property set documentsRemovable ($arg :  boolean) {
      setRequireValue("documentsRemovable", 0, $arg)
    }
    
    
  }
  
  
}