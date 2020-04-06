package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at NewClaimDocumentsLV.pcf: line 51, column 77
    function action_10 () : void {
      DocumentDetailsPopup.push(document, false)
    }
    
    // 'action' attribute on Link (id=DeleteDocumentLink) at NewClaimDocumentsLV.pcf: line 59, column 85
    function action_16 () : void {
      gw.document.DocumentsUtil.deleteDocumentWithoutCommitWithClaim(document, Claim)
    }
    
    // 'action' attribute on Link (id=NameLink) at NewClaimDocumentsLV.pcf: line 40, column 87
    function action_6 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at NewClaimDocumentsLV.pcf: line 51, column 77
    function action_dest_11 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document, false)
    }
    
    // 'available' attribute on Link (id=NameLink) at NewClaimDocumentsLV.pcf: line 40, column 87
    function available_5 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at NewClaimDocumentsLV.pcf: line 51, column 77
    function available_9 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at NewClaimDocumentsLV.pcf: line 51, column 77
    function icon_12 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'icon' attribute on Link (id=DeleteDocumentLink) at NewClaimDocumentsLV.pcf: line 59, column 85
    function icon_17 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "ico_delete.png" : "ico_delete_disabled.png" 
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at NewClaimDocumentsLV.pcf: line 27, column 32
    function icon_4 () : java.lang.String {
      return document.Icon
    }
    
    // 'label' attribute on Link (id=DocumentsLV_ActionsDisabled) at NewClaimDocumentsLV.pcf: line 64, column 72
    function label_20 () : java.lang.Object {
      return documentsActionsHelper.AsynchronousActionsMessage
    }
    
    // 'label' attribute on Link (id=NameLink) at NewClaimDocumentsLV.pcf: line 40, column 87
    function label_7 () : java.lang.Object {
      return document.Name
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at NewClaimDocumentsLV.pcf: line 51, column 77
    function tooltip_13 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=DeleteDocumentLink) at NewClaimDocumentsLV.pcf: line 59, column 85
    function tooltip_18 () : java.lang.String {
      return documentsActionsHelper.DeleteDocumentTooltip(document)
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at NewClaimDocumentsLV.pcf: line 40, column 87
    function tooltip_8 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at NewClaimDocumentsLV.pcf: line 71, column 45
    function valueRoot_23 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at NewClaimDocumentsLV.pcf: line 71, column 45
    function value_21 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at NewClaimDocumentsLV.pcf: line 76, column 51
    function value_24 () : typekey.DocumentStatusType {
      return document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at NewClaimDocumentsLV.pcf: line 81, column 36
    function value_27 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at NewClaimDocumentsLV.pcf: line 90, column 24
    function value_30 () : java.util.Date {
      return document.DateModified
    }
    
    // 'visible' attribute on Link (id=DeleteDocumentLink) at NewClaimDocumentsLV.pcf: line 59, column 85
    function visible_15 () : java.lang.Boolean {
      return documentsActionsHelper.isDeleteDocumentLinkVisible(document)
    }
    
    // 'visible' attribute on Link (id=DocumentsLV_ActionsDisabled) at NewClaimDocumentsLV.pcf: line 64, column 72
    function visible_19 () : java.lang.Boolean {
      return document.PendingDocUID != null and document.DMS
    }
    
    property get document () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NewClaimDocumentsLV.pcf: line 71, column 45
    function sortValue_0 (document :  entity.Document) : java.lang.Object {
      return document.Type
    }
    
    // 'value' attribute on RowIterator at NewClaimDocumentsLV.pcf: line 76, column 51
    function sortValue_1 (document :  entity.Document) : java.lang.Object {
      return document.Status
    }
    
    // 'value' attribute on RowIterator at NewClaimDocumentsLV.pcf: line 81, column 36
    function sortValue_2 (document :  entity.Document) : java.lang.Object {
      return document.Author
    }
    
    // 'value' attribute on RowIterator at NewClaimDocumentsLV.pcf: line 90, column 24
    function sortValue_3 (document :  entity.Document) : java.lang.Object {
      return document.DateModified
    }
    
    // 'value' attribute on RowIterator at NewClaimDocumentsLV.pcf: line 20, column 37
    function value_33 () : entity.Document[] {
      return DocumentList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get DocumentList () : Document[] {
      return getRequireValue("DocumentList", 0) as Document[]
    }
    
    property set DocumentList ($arg :  Document[]) {
      setRequireValue("DocumentList", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getRequireValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setRequireValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}