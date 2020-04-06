package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/UnmodifiableTransactionSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UnmodifiableTransactionSetDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/UnmodifiableTransactionSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UnmodifiableTransactionSetDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 51, column 77
    function action_11 () : void {
      DocumentDetailsPopup.push(document, false)
    }
    
    // 'action' attribute on Link (id=NameLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 40, column 87
    function action_7 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 51, column 77
    function action_dest_12 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document, false)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 51, column 77
    function available_10 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on Link (id=NameLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 40, column 87
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 51, column 77
    function icon_13 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at UnmodifiableTransactionSetDocumentsLV.pcf: line 27, column 32
    function icon_5 () : java.lang.String {
      return document.Icon
    }
    
    // 'label' attribute on Link (id=NameLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 40, column 87
    function label_8 () : java.lang.Object {
      return document.Name
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 51, column 77
    function tooltip_14 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at UnmodifiableTransactionSetDocumentsLV.pcf: line 40, column 87
    function tooltip_9 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at UnmodifiableTransactionSetDocumentsLV.pcf: line 58, column 45
    function valueRoot_17 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at UnmodifiableTransactionSetDocumentsLV.pcf: line 58, column 45
    function value_15 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at UnmodifiableTransactionSetDocumentsLV.pcf: line 63, column 51
    function value_18 () : typekey.DocumentStatusType {
      return document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at UnmodifiableTransactionSetDocumentsLV.pcf: line 68, column 36
    function value_21 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at UnmodifiableTransactionSetDocumentsLV.pcf: line 77, column 24
    function value_24 () : java.util.Date {
      return document.DateModified
    }
    
    property get document () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/UnmodifiableTransactionSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at UnmodifiableTransactionSetDocumentsLV.pcf: line 14, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'value' attribute on RowIterator at UnmodifiableTransactionSetDocumentsLV.pcf: line 58, column 45
    function sortValue_1 (document :  entity.Document) : java.lang.Object {
      return document.Type
    }
    
    // 'value' attribute on RowIterator at UnmodifiableTransactionSetDocumentsLV.pcf: line 63, column 51
    function sortValue_2 (document :  entity.Document) : java.lang.Object {
      return document.Status
    }
    
    // 'value' attribute on RowIterator at UnmodifiableTransactionSetDocumentsLV.pcf: line 68, column 36
    function sortValue_3 (document :  entity.Document) : java.lang.Object {
      return document.Author
    }
    
    // 'value' attribute on RowIterator at UnmodifiableTransactionSetDocumentsLV.pcf: line 77, column 24
    function sortValue_4 (document :  entity.Document) : java.lang.Object {
      return document.DateModified
    }
    
    // 'value' attribute on RowIterator at UnmodifiableTransactionSetDocumentsLV.pcf: line 20, column 37
    function value_27 () : entity.Document[] {
      return DocumentList.where(\ d -> perm.Document.view(d))
    }
    
    property get DocumentList () : Document[] {
      return getRequireValue("DocumentList", 0) as Document[]
    }
    
    property set DocumentList ($arg :  Document[]) {
      setRequireValue("DocumentList", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}