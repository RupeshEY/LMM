package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DocumentsLV.pcf: line 22, column 43
    function initialValue_0 () : java.util.Set<String> {
      return documentSearchCriteria.Claim.UndeletableDocumentPublicIds
    }
    
    // 'initialValue' attribute on Variable at DocumentsLV.pcf: line 26, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'sortBy' attribute on RowIterator at DocumentsLV.pcf: line 166, column 61
    function sortValue_11 (document :  entity.Document) : java.lang.Object {
      return document.Obsolete
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 57, column 46
    function sortValue_2 (document :  entity.Document) : java.lang.Object {
      return document.ECFDocumentLocationStatus
    }
    
    // 'sortBy' attribute on RowIterator at DocumentsLV.pcf: line 64, column 23
    function sortValue_3 (document :  entity.Document) : java.lang.Object {
      return document.Name
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 133, column 45
    function sortValue_4 (document :  entity.Document) : java.lang.Object {
      return document.Type
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 140, column 66
    function sortValue_6 (document :  entity.Document) : java.lang.Object {
      return document.IMRDocumentType
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 145, column 51
    function sortValue_7 (document :  entity.Document) : java.lang.Object {
      return document.Status
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 150, column 36
    function sortValue_8 (document :  entity.Document) : java.lang.Object {
      return document.Author
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 159, column 24
    function sortValue_9 (document :  entity.Document) : java.lang.Object {
      return document.DateModified
    }
    
    // 'value' attribute on RowIterator at DocumentsLV.pcf: line 33, column 87
    function value_75 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return DocumentList
    }
    
    // 'visible' attribute on RowIterator at DocumentsLV.pcf: line 166, column 61
    function visible_10 () : java.lang.Boolean {
      return documentSearchCriteria.IncludeObsoletes
    }
    
    // 'visible' attribute on RowIterator at DocumentsLV.pcf: line 140, column 66
    function visible_5 () : java.lang.Boolean {
      return documentSearchCriteria.Claim.isECFVisible()
    }
    
    property get DocumentList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("DocumentList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set DocumentList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("DocumentList", 0, $arg)
    }
    
    property get documentSearchCriteria () : DocumentSearchCriteria {
      return getRequireValue("documentSearchCriteria", 0) as DocumentSearchCriteria
    }
    
    property set documentSearchCriteria ($arg :  DocumentSearchCriteria) {
      setRequireValue("documentSearchCriteria", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get undeletableDocumentPublicIds () : java.util.Set<String> {
      return getVariableValue("undeletableDocumentPublicIds", 0) as java.util.Set<String>
    }
    
    property set undeletableDocumentPublicIds ($arg :  java.util.Set<String>) {
      setVariableValue("undeletableDocumentPublicIds", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=NameLink) at DocumentsLV.pcf: line 72, column 87
    function action_23 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at DocumentsLV.pcf: line 83, column 77
    function action_27 () : void {
      DocumentDetailsPopup.push(document)
    }
    
    // 'action' attribute on Link (id=DownloadLink) at DocumentsLV.pcf: line 92, column 90
    function action_33 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function action_38 () : void {
      UploadDocumentContentPopup.push(document)
    }
    
    // 'action' attribute on Link (id=DocumentsLV_DeleteLink) at DocumentsLV.pcf: line 109, column 85
    function action_44 () : void {
      gw.document.DocumentsUtil.deleteDocument(document)
    }
    
    // 'action' attribute on Link (id=UploadToIMRButton) at DocumentsLV.pcf: line 120, column 48
    function action_50 () : void {
      pcf.ECFUploadDocumentACLPopup.push(document)
    }
    
    // 'action' attribute on Link (id=DownloadFromIMRButton) at DocumentsLV.pcf: line 126, column 52
    function action_53 () : void {
      document.downloadToDMS()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at DocumentsLV.pcf: line 83, column 77
    function action_dest_28 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document)
    }
    
    // 'action' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function action_dest_39 () : pcf.api.Destination {
      return pcf.UploadDocumentContentPopup.createDestination(document)
    }
    
    // 'action' attribute on Link (id=UploadToIMRButton) at DocumentsLV.pcf: line 120, column 48
    function action_dest_51 () : pcf.api.Destination {
      return pcf.ECFUploadDocumentACLPopup.createDestination(document)
    }
    
    // 'available' attribute on Link (id=NameLink) at DocumentsLV.pcf: line 72, column 87
    function available_22 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at DocumentsLV.pcf: line 83, column 77
    function available_26 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on Link (id=DownloadLink) at DocumentsLV.pcf: line 92, column 90
    function available_31 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function available_36 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=DocumentsLV_DeleteLink) at DocumentsLV.pcf: line 109, column 85
    function available_42 () : java.lang.Boolean {
      return documentsActionsHelper.isDeleteDocumentLinkAvailable(document, undeletableDocumentPublicIds)
    }
    
    // 'condition' attribute on ToolbarFlag at DocumentsLV.pcf: line 38, column 34
    function condition_12 () : java.lang.Boolean {
      return perm.Document.edit(document)
    }
    
    // 'condition' attribute on ToolbarFlag at DocumentsLV.pcf: line 41, column 24
    function condition_13 () : java.lang.Boolean {
      return document.Obsolete
    }
    
    // 'condition' attribute on ToolbarFlag at DocumentsLV.pcf: line 44, column 35
    function condition_14 () : java.lang.Boolean {
      return documentsActionsHelper.isDeleteDocumentLinkVisible(document) and documentsActionsHelper.isDeleteDocumentLinkAvailable(document, undeletableDocumentPublicIds)
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at DocumentsLV.pcf: line 51, column 32
    function icon_15 () : java.lang.String {
      return document.Icon
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at DocumentsLV.pcf: line 83, column 77
    function icon_29 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at DocumentsLV.pcf: line 92, column 90
    function icon_34 () : java.lang.String {
      return documentsActionsHelper.isDownloadDocumentContentAvailable(document) ? "download_document_16.png" : "download_document_disabled_16.png" 
    }
    
    // 'icon' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function icon_40 () : java.lang.String {
      return documentsActionsHelper.isUploadDocumentContentAvailable(document) ? "upload_document_16.png" : "upload_document_disabled_16.png"
    }
    
    // 'icon' attribute on Link (id=DocumentsLV_DeleteLink) at DocumentsLV.pcf: line 109, column 85
    function icon_45 () : java.lang.String {
      return documentsActionsHelper.isDeleteDocumentLinkAvailable(document, undeletableDocumentPublicIds) ? "ico_delete.png" : "ico_delete_disabled.png" 
    }
    
    // 'label' attribute on Link (id=NameLink) at DocumentsLV.pcf: line 72, column 87
    function label_24 () : java.lang.Object {
      return document.Name
    }
    
    // 'label' attribute on Link (id=DocumentsLV_ActionsDisabled) at DocumentsLV.pcf: line 114, column 75
    function label_48 () : java.lang.Object {
      return documentsActionsHelper.AsynchronousActionsMessage
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at DocumentsLV.pcf: line 72, column 87
    function tooltip_25 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at DocumentsLV.pcf: line 83, column 77
    function tooltip_30 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at DocumentsLV.pcf: line 92, column 90
    function tooltip_35 () : java.lang.String {
      return documentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function tooltip_41 () : java.lang.String {
      return documentsActionsHelper.UploadDocumentContentTooltip
    }
    
    // 'tooltip' attribute on Link (id=DocumentsLV_DeleteLink) at DocumentsLV.pcf: line 109, column 85
    function tooltip_46 () : java.lang.String {
      return documentsActionsHelper.DeleteDocumentTooltip(document, undeletableDocumentPublicIds)
    }
    
    // 'valueRange' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function valueRange_19 () : java.lang.Object {
      return ECFDocumentStatus_Ext.AllTypeKeys
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function valueRange_61 () : java.lang.Object {
      return typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
    }
    
    // 'value' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function valueRoot_18 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function value_16 () : ECFDocumentStatus_Ext {
      return document.ECFDocumentLocationStatus
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at DocumentsLV.pcf: line 133, column 45
    function value_54 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function value_58 () : String {
      return document.IMRDocumentType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DocumentsLV.pcf: line 145, column 51
    function value_64 () : typekey.DocumentStatusType {
      return document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at DocumentsLV.pcf: line 150, column 36
    function value_67 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at DocumentsLV.pcf: line 159, column 24
    function value_70 () : java.util.Date {
      return document.DateModified
    }
    
    // 'valueRange' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function verifyValueRangeIsAllowedType_20 ($$arg :  ECFDocumentStatus_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function verifyValueRangeIsAllowedType_62 ($$arg :  String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function verifyValueRangeIsAllowedType_62 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ECFStatus) at DocumentsLV.pcf: line 57, column 46
    function verifyValueRange_21 () : void {
      var __valueRangeArg = ECFDocumentStatus_Ext.AllTypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function verifyValueRange_63 () : void {
      var __valueRangeArg = typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_62(__valueRangeArg)
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at DocumentsLV.pcf: line 92, column 90
    function visible_32 () : java.lang.Boolean {
      return documentsActionsHelper.isDownloadDocumentContentVisible(document)
    }
    
    // 'visible' attribute on Link (id=UploadLink) at DocumentsLV.pcf: line 100, column 88
    function visible_37 () : java.lang.Boolean {
      return documentsActionsHelper.isUploadDocumentContentVisible(document)
    }
    
    // 'visible' attribute on Link (id=DocumentsLV_DeleteLink) at DocumentsLV.pcf: line 109, column 85
    function visible_43 () : java.lang.Boolean {
      return documentsActionsHelper.isDeleteDocumentLinkVisible(document)
    }
    
    // 'visible' attribute on Link (id=DocumentsLV_ActionsDisabled) at DocumentsLV.pcf: line 114, column 75
    function visible_47 () : java.lang.Boolean {
      return documentsActionsHelper.isDocumentPending(document)
    }
    
    // 'visible' attribute on Link (id=UploadToIMRButton) at DocumentsLV.pcf: line 120, column 48
    function visible_49 () : java.lang.Boolean {
      return document.CanUploadToIMR
    }
    
    // 'visible' attribute on Link (id=DownloadFromIMRButton) at DocumentsLV.pcf: line 126, column 52
    function visible_52 () : java.lang.Boolean {
      return document.CanDownloadFromIMR
    }
    
    // 'visible' attribute on RangeCell (id=IMRDocumentType) at DocumentsLV.pcf: line 140, column 66
    function visible_57 () : java.lang.Boolean {
      return documentSearchCriteria.Claim.isECFVisible()
    }
    
    // 'visible' attribute on LinkCell (id=HiddenDocument) at DocumentsLV.pcf: line 166, column 61
    function visible_74 () : java.lang.Boolean {
      return documentSearchCriteria.IncludeObsoletes
    }
    
    property get document () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  
}