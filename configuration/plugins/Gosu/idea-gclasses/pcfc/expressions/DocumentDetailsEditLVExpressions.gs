package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsEditLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsEditLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsEditLV.pcf: line 24, column 45
    function initialValue_0 () : gw.document.DocumentCCContext {
      return DocumentApplicationContext as gw.document.DocumentCCContext
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 56, column 34
    function sortValue_1 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Name
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 119, column 51
    function sortValue_10 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Status
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 125, column 53
    function sortValue_11 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.SecurityType
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 133, column 45
    function sortValue_12 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Type
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 142, column 49
    function sortValue_14 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.IMRDocumentType
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 62, column 41
    function sortValue_2 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Description
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 71, column 41
    function sortValue_3 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.MimeType
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 78, column 45
    function sortValue_4 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Language
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 84, column 48
    function sortValue_5 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Section
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 95, column 52
    function sortValue_6 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.RelatedTo
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 101, column 36
    function sortValue_7 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Author
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 107, column 39
    function sortValue_8 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Recipient
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 112, column 37
    function sortValue_9 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : java.lang.Object {
      var Document : entity.Document = (DocumentCreationInfo.Document)
var relatedServiceRequests : ServiceRequest[] = (Document.RelatedServiceRequests.toTypedArray())
return Document.Inbound
    }
    
    // 'toRemove' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 34, column 54
    function toRemove_86 (DocumentCreationInfo :  gw.document.DocumentCreationInfo) : void {
      DocumentCreationInfos.remove(DocumentCreationInfo); DocumentCreationInfo.Document.remove()
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 34, column 54
    function value_87 () : gw.document.DocumentCreationInfo[] {
      return DocumentCreationInfos.toTypedArray()
    }
    
    // 'visible' attribute on RowIterator at DocumentDetailsEditLV.pcf: line 142, column 49
    function visible_13 () : java.lang.Boolean {
      return DocumentCCContext.ECFClaim
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getRequireValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setRequireValue("DocumentApplicationContext", 0, $arg)
    }
    
    property get DocumentCCContext () : gw.document.DocumentCCContext {
      return getVariableValue("DocumentCCContext", 0) as gw.document.DocumentCCContext
    }
    
    property set DocumentCCContext ($arg :  gw.document.DocumentCCContext) {
      setVariableValue("DocumentCCContext", 0, $arg)
    }
    
    property get DocumentCreationInfos () : java.util.Collection<gw.document.DocumentCreationInfo> {
      return getRequireValue("DocumentCreationInfos", 0) as java.util.Collection<gw.document.DocumentCreationInfo>
    }
    
    property set DocumentCreationInfos ($arg :  java.util.Collection<gw.document.DocumentCreationInfo>) {
      setRequireValue("DocumentCreationInfos", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DocumentDetailsEditLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at DocumentDetailsEditLV.pcf: line 56, column 34
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Description) at DocumentDetailsEditLV.pcf: line 62, column 41
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.MimeType = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=Language) at DocumentDetailsEditLV.pcf: line 78, column 45
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=Section) at DocumentDetailsEditLV.pcf: line 84, column 48
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TextCell (id=Author) at DocumentDetailsEditLV.pcf: line 101, column 36
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Author = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Recipient) at DocumentDetailsEditLV.pcf: line 107, column 39
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Recipient = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioCell (id=InBound) at DocumentDetailsEditLV.pcf: line 112, column 37
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Inbound = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DocumentDetailsEditLV.pcf: line 119, column 51
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Status = (__VALUE_TO_SET as typekey.DocumentStatusType)
    }
    
    // 'value' attribute on TypeKeyCell (id=SecurityType) at DocumentDetailsEditLV.pcf: line 125, column 53
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.SecurityType = (__VALUE_TO_SET as typekey.DocumentSecurityType)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at DocumentDetailsEditLV.pcf: line 133, column 45
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Type = (__VALUE_TO_SET as typekey.DocumentType)
    }
    
    // 'value' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.IMRDocumentType = (__VALUE_TO_SET as String)
    }
    
    // 'editable' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function editable_42 () : java.lang.Boolean {
      return (DocumentApplicationContext.createDocumentDetailsHelper({ Document }) as gw.document.DocumentDetailsCCHelper).RelatedToEditable
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at DocumentDetailsEditLV.pcf: line 49, column 32
    function icon_17 () : java.lang.String {
      return Document.Icon
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsEditLV.pcf: line 38, column 33
    function initialValue_15 () : entity.Document {
      return DocumentCreationInfo.Document
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsEditLV.pcf: line 42, column 34
    function initialValue_16 () : ServiceRequest[] {
      return Document.RelatedServiceRequests.toTypedArray()
    }
    
    // RowIterator at DocumentDetailsEditLV.pcf: line 34, column 54
    function initializeVariables_85 () : void {
        Document = DocumentCreationInfo.Document;
  relatedServiceRequests = Document.RelatedServiceRequests.toTypedArray();

    }
    
    // 'optionGroupLabel' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function optionGroupLabel_48 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function optionLabel_30 (VALUE :  java.lang.String) : java.lang.String {
      return Document.getMimeTypeLabel(VALUE)
    }
    
    // 'optionLabel' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function optionLabel_49 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function valueRange_31 () : java.lang.Object {
      return Document.MimeTypeList
    }
    
    // 'valueRange' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function valueRange_50 () : java.lang.Object {
      return Document.Claim.RelatedToCandidates
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function valueRange_82 () : java.lang.Object {
      return typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Name) at DocumentDetailsEditLV.pcf: line 56, column 34
    function valueRoot_21 () : java.lang.Object {
      return Document
    }
    
    // 'value' attribute on TextCell (id=Name) at DocumentDetailsEditLV.pcf: line 56, column 34
    function value_18 () : java.lang.String {
      return Document.Name
    }
    
    // 'value' attribute on TextCell (id=Description) at DocumentDetailsEditLV.pcf: line 62, column 41
    function value_22 () : java.lang.String {
      return Document.Description
    }
    
    // 'value' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function value_26 () : java.lang.String {
      return Document.MimeType
    }
    
    // 'value' attribute on TypeKeyCell (id=Language) at DocumentDetailsEditLV.pcf: line 78, column 45
    function value_34 () : typekey.LanguageType {
      return Document.Language
    }
    
    // 'value' attribute on TypeKeyCell (id=Section) at DocumentDetailsEditLV.pcf: line 84, column 48
    function value_38 () : typekey.DocumentSection {
      return Document.Section
    }
    
    // 'value' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function value_43 () : gw.pl.persistence.core.Bean {
      return Document.RelatedTo
    }
    
    // 'value' attribute on TextCell (id=Author) at DocumentDetailsEditLV.pcf: line 101, column 36
    function value_53 () : java.lang.String {
      return Document.Author
    }
    
    // 'value' attribute on TextCell (id=Recipient) at DocumentDetailsEditLV.pcf: line 107, column 39
    function value_57 () : java.lang.String {
      return Document.Recipient
    }
    
    // 'value' attribute on BooleanRadioCell (id=InBound) at DocumentDetailsEditLV.pcf: line 112, column 37
    function value_61 () : java.lang.Boolean {
      return Document.Inbound
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DocumentDetailsEditLV.pcf: line 119, column 51
    function value_65 () : typekey.DocumentStatusType {
      return Document.Status
    }
    
    // 'value' attribute on TypeKeyCell (id=SecurityType) at DocumentDetailsEditLV.pcf: line 125, column 53
    function value_69 () : typekey.DocumentSecurityType {
      return Document.SecurityType
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at DocumentDetailsEditLV.pcf: line 133, column 45
    function value_73 () : typekey.DocumentType {
      return Document.Type
    }
    
    // 'value' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function value_78 () : String {
      return Document.IMRDocumentType
    }
    
    // 'valueRange' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function verifyValueRangeIsAllowedType_51 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function verifyValueRangeIsAllowedType_51 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function verifyValueRangeIsAllowedType_83 ($$arg :  String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function verifyValueRangeIsAllowedType_83 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=DocType) at DocumentDetailsEditLV.pcf: line 71, column 41
    function verifyValueRange_33 () : void {
      var __valueRangeArg = Document.MimeTypeList
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=RelatedTo) at DocumentDetailsEditLV.pcf: line 95, column 52
    function verifyValueRange_52 () : void {
      var __valueRangeArg = Document.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_51(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function verifyValueRange_84 () : void {
      var __valueRangeArg = typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_83(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeCell (id=IMRDocumentType) at DocumentDetailsEditLV.pcf: line 142, column 49
    function visible_77 () : java.lang.Boolean {
      return DocumentCCContext.ECFClaim
    }
    
    property get Document () : entity.Document {
      return getVariableValue("Document", 1) as entity.Document
    }
    
    property set Document ($arg :  entity.Document) {
      setVariableValue("Document", 1, $arg)
    }
    
    property get DocumentCreationInfo () : gw.document.DocumentCreationInfo {
      return getIteratedValue(1) as gw.document.DocumentCreationInfo
    }
    
    property get relatedServiceRequests () : ServiceRequest[] {
      return getVariableValue("relatedServiceRequests", 1) as ServiceRequest[]
    }
    
    property set relatedServiceRequests ($arg :  ServiceRequest[]) {
      setVariableValue("relatedServiceRequests", 1, $arg)
    }
    
    
  }
  
  
}