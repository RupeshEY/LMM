package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsEditInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsEditInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=NameLink) at DocumentDetailsEditInputSet.default.pcf: line 66, column 83
    function action_29 () : void {
      document.downloadContent()
    }
    
    // 'available' attribute on CheckBoxInput (id=allEnabled) at DocumentDetailsEditInputSet.default.pcf: line 29, column 61
    function available_2 () : java.lang.Boolean {
      return documentDetailsCCHelper.AllowFieldsSubset
    }
    
    // 'available' attribute on Link (id=NameLink) at DocumentDetailsEditInputSet.default.pcf: line 66, column 83
    function available_28 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'value' attribute on CheckBoxInput (id=sectionEnabled) at DocumentDetailsEditInputSet.default.pcf: line 134, column 61
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.SectionEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentDetailsEditInputSet.default.pcf: line 144, column 46
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on CheckBoxInput (id=relatedToEnabled) at DocumentDetailsEditInputSet.default.pcf: line 155, column 61
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.RelatedToEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function defaultSetter_129 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on CheckBoxInput (id=authorEnabled) at DocumentDetailsEditInputSet.default.pcf: line 201, column 61
    function defaultSetter_148 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.AuthorEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentDetailsEditInputSet.default.pcf: line 210, column 49
    function defaultSetter_154 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Author = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=recipientEnabled) at DocumentDetailsEditInputSet.default.pcf: line 218, column 61
    function defaultSetter_162 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.RecipientEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Recipient) at DocumentDetailsEditInputSet.default.pcf: line 227, column 52
    function defaultSetter_168 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Recipient = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=nameEnabled) at DocumentDetailsEditInputSet.default.pcf: line 43, column 61
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.NameEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=inboundEnabled) at DocumentDetailsEditInputSet.default.pcf: line 243, column 61
    function defaultSetter_178 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.InboundEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InBound) at DocumentDetailsEditInputSet.default.pcf: line 252, column 50
    function defaultSetter_184 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Inbound = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=statusEnabled) at DocumentDetailsEditInputSet.default.pcf: line 260, column 61
    function defaultSetter_192 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.StatusEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at DocumentDetailsEditInputSet.default.pcf: line 271, column 49
    function defaultSetter_198 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Status = (__VALUE_TO_SET as typekey.DocumentStatusType)
    }
    
    // 'value' attribute on CheckBoxInput (id=securityTypeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 279, column 61
    function defaultSetter_206 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.SecurityTypeEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentDetailsEditInputSet.default.pcf: line 289, column 51
    function defaultSetter_212 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.SecurityType = (__VALUE_TO_SET as typekey.DocumentSecurityType)
    }
    
    // 'value' attribute on CheckBoxInput (id=typeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 297, column 61
    function defaultSetter_220 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.TypeEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at DocumentDetailsEditInputSet.default.pcf: line 308, column 43
    function defaultSetter_226 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Type = (__VALUE_TO_SET as typekey.DocumentType)
    }
    
    // 'value' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function defaultSetter_234 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.IMRDocumentType = (__VALUE_TO_SET as String)
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentDetailsEditInputSet.default.pcf: line 54, column 47
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=descriptionEnabled) at DocumentDetailsEditInputSet.default.pcf: line 75, column 61
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.DescriptionEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentDetailsEditInputSet.default.pcf: line 84, column 54
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=mimeTypeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 92, column 61
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.MimeTypeEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.MimeType = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=allEnabled) at DocumentDetailsEditInputSet.default.pcf: line 29, column 61
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.AllFieldsEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=languageEnabled) at DocumentDetailsEditInputSet.default.pcf: line 114, column 119
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.LanguageEnabled = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function defaultSetter_91 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'editable' attribute on CheckBoxInput (id=relatedToEnabled) at DocumentDetailsEditInputSet.default.pcf: line 155, column 61
    function editable_112 () : java.lang.Boolean {
      return documentDetailsCCHelper.RelatedToEditable
    }
    
    // 'editable' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function editable_228 () : java.lang.Boolean {
      return document.OnDMS
    }
    
    // 'editable' attribute on CheckBoxInput (id=mimeTypeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 92, column 61
    function editable_49 () : java.lang.Boolean {
      return not fromTemplate
    }
    
    // 'editable' attribute on CheckBoxInput (id=languageEnabled) at DocumentDetailsEditInputSet.default.pcf: line 114, column 119
    function editable_74 () : java.lang.Boolean {
      return documentDetailsCCHelper.Language == null or not fromTemplate
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsEditInputSet.default.pcf: line 17, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'initialValue' attribute on Variable at DocumentDetailsEditInputSet.default.pcf: line 21, column 24
    function initialValue_1 () : Document {
      return documentDetailsCCHelper.getDocuments().Count == 1 ? documentDetailsCCHelper.getDocuments().single() : null
    }
    
    // 'label' attribute on Link (id=NameLink) at DocumentDetailsEditInputSet.default.pcf: line 66, column 83
    function label_30 () : java.lang.Object {
      return documentDetailsCCHelper.Name
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function optionGroupLabel_131 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function optionLabel_132 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function optionLabel_69 (VALUE :  java.lang.String) : java.lang.String {
      return gw.document.DocumentsUtil.getMimeTypeLabel(VALUE)
    }
    
    // 'required' attribute on TextInput (id=Name) at DocumentDetailsEditInputSet.default.pcf: line 54, column 47
    function required_24 () : java.lang.Boolean {
      return !documentDetailsCCHelper.AllowFieldsSubset
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditInputSet.default.pcf: line 189, column 30
    function sortValue_136 (ServiceRequest :  entity.ServiceRequest) : java.lang.Object {
      return ServiceRequest.DisplayName
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at DocumentDetailsEditInputSet.default.pcf: line 66, column 83
    function tooltip_31 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function valueRange_133 () : java.lang.Object {
      return documentDetailsCCHelper.RelatedToCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function valueRange_236 () : java.lang.Object {
      return typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function valueRange_70 () : java.lang.Object {
      return documentDetailsCCHelper.getMimeTypeList(documentDetailsCCHelper.MimeType)
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function valueRange_93 () : java.lang.Object {
      return LanguageType.getTypeKeys( false )
    }
    
    // 'value' attribute on CheckBoxInput (id=allEnabled) at DocumentDetailsEditInputSet.default.pcf: line 29, column 61
    function valueRoot_9 () : java.lang.Object {
      return documentDetailsCCHelper
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentDetailsEditInputSet.default.pcf: line 144, column 46
    function value_105 () : typekey.DocumentSection {
      return documentDetailsCCHelper.Section
    }
    
    // 'value' attribute on CheckBoxInput (id=relatedToEnabled) at DocumentDetailsEditInputSet.default.pcf: line 155, column 61
    function value_114 () : java.lang.Boolean {
      return documentDetailsCCHelper.RelatedToEnabled
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function value_124 () : gw.pl.persistence.core.Bean {
      return documentDetailsCCHelper.RelatedTo
    }
    
    // 'value' attribute on CheckBoxInput (id=nameEnabled) at DocumentDetailsEditInputSet.default.pcf: line 43, column 61
    function value_13 () : java.lang.Boolean {
      return documentDetailsCCHelper.NameEnabled
    }
    
    // 'value' attribute on RowIterator at DocumentDetailsEditInputSet.default.pcf: line 183, column 49
    function value_140 () : entity.ServiceRequest[] {
      return documentDetailsCCHelper.RelatedServiceRequests
    }
    
    // 'value' attribute on CheckBoxInput (id=authorEnabled) at DocumentDetailsEditInputSet.default.pcf: line 201, column 61
    function value_144 () : java.lang.Boolean {
      return documentDetailsCCHelper.AuthorEnabled
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentDetailsEditInputSet.default.pcf: line 210, column 49
    function value_151 () : java.lang.String {
      return documentDetailsCCHelper.Author
    }
    
    // 'value' attribute on CheckBoxInput (id=recipientEnabled) at DocumentDetailsEditInputSet.default.pcf: line 218, column 61
    function value_158 () : java.lang.Boolean {
      return documentDetailsCCHelper.RecipientEnabled
    }
    
    // 'value' attribute on TextInput (id=Recipient) at DocumentDetailsEditInputSet.default.pcf: line 227, column 52
    function value_165 () : java.lang.String {
      return documentDetailsCCHelper.Recipient
    }
    
    // 'value' attribute on CheckBoxInput (id=inboundEnabled) at DocumentDetailsEditInputSet.default.pcf: line 243, column 61
    function value_174 () : java.lang.Boolean {
      return documentDetailsCCHelper.InboundEnabled
    }
    
    // 'value' attribute on BooleanRadioInput (id=InBound) at DocumentDetailsEditInputSet.default.pcf: line 252, column 50
    function value_181 () : java.lang.Boolean {
      return documentDetailsCCHelper.Inbound
    }
    
    // 'value' attribute on CheckBoxInput (id=statusEnabled) at DocumentDetailsEditInputSet.default.pcf: line 260, column 61
    function value_188 () : java.lang.Boolean {
      return documentDetailsCCHelper.StatusEnabled
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at DocumentDetailsEditInputSet.default.pcf: line 271, column 49
    function value_195 () : typekey.DocumentStatusType {
      return documentDetailsCCHelper.Status
    }
    
    // 'value' attribute on CheckBoxInput (id=securityTypeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 279, column 61
    function value_202 () : java.lang.Boolean {
      return documentDetailsCCHelper.SecurityTypeEnabled
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentDetailsEditInputSet.default.pcf: line 289, column 51
    function value_209 () : typekey.DocumentSecurityType {
      return documentDetailsCCHelper.SecurityType
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentDetailsEditInputSet.default.pcf: line 54, column 47
    function value_21 () : java.lang.String {
      return documentDetailsCCHelper.Name
    }
    
    // 'value' attribute on CheckBoxInput (id=typeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 297, column 61
    function value_216 () : java.lang.Boolean {
      return documentDetailsCCHelper.TypeEnabled
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at DocumentDetailsEditInputSet.default.pcf: line 308, column 43
    function value_223 () : typekey.DocumentType {
      return documentDetailsCCHelper.Type
    }
    
    // 'value' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function value_230 () : String {
      return documentDetailsCCHelper.IMRDocumentType
    }
    
    // 'value' attribute on CheckBoxInput (id=descriptionEnabled) at DocumentDetailsEditInputSet.default.pcf: line 75, column 61
    function value_36 () : java.lang.Boolean {
      return documentDetailsCCHelper.DescriptionEnabled
    }
    
    // 'value' attribute on CheckBoxInput (id=allEnabled) at DocumentDetailsEditInputSet.default.pcf: line 29, column 61
    function value_4 () : java.lang.Boolean {
      return documentDetailsCCHelper.AllFieldsEnabled
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentDetailsEditInputSet.default.pcf: line 84, column 54
    function value_43 () : java.lang.String {
      return documentDetailsCCHelper.Description
    }
    
    // 'value' attribute on CheckBoxInput (id=mimeTypeEnabled) at DocumentDetailsEditInputSet.default.pcf: line 92, column 61
    function value_51 () : java.lang.Boolean {
      return documentDetailsCCHelper.MimeTypeEnabled
    }
    
    // 'value' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function value_61 () : java.lang.String {
      return documentDetailsCCHelper.MimeType
    }
    
    // 'value' attribute on CheckBoxInput (id=languageEnabled) at DocumentDetailsEditInputSet.default.pcf: line 114, column 119
    function value_76 () : java.lang.Boolean {
      return documentDetailsCCHelper.LanguageEnabled
    }
    
    // 'value' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function value_86 () : typekey.LanguageType {
      return documentDetailsCCHelper.Language
    }
    
    // 'value' attribute on CheckBoxInput (id=sectionEnabled) at DocumentDetailsEditInputSet.default.pcf: line 134, column 61
    function value_98 () : java.lang.Boolean {
      return documentDetailsCCHelper.SectionEnabled
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function verifyValueRangeIsAllowedType_134 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function verifyValueRangeIsAllowedType_134 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function verifyValueRangeIsAllowedType_237 ($$arg :  String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function verifyValueRangeIsAllowedType_237 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function verifyValueRangeIsAllowedType_71 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function verifyValueRangeIsAllowedType_71 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function verifyValueRangeIsAllowedType_94 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function verifyValueRangeIsAllowedType_94 ($$arg :  typekey.LanguageType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function verifyValueRange_135 () : void {
      var __valueRangeArg = documentDetailsCCHelper.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_134(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function verifyValueRange_238 () : void {
      var __valueRangeArg = typekey.IMRDocumentType_Ext.AllTypeKeys*.DisplayName
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_237(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function verifyValueRange_72 () : void {
      var __valueRangeArg = documentDetailsCCHelper.getMimeTypeList(documentDetailsCCHelper.MimeType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_71(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function verifyValueRange_95 () : void {
      var __valueRangeArg = LanguageType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_94(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=RelatedTo) at DocumentDetailsEditInputSet.default.pcf: line 171, column 61
    function visible_123 () : java.lang.Boolean {
      return documentDetailsCCHelper.RelatedToVisible
    }
    
    // 'visible' attribute on ListViewInput at DocumentDetailsEditInputSet.default.pcf: line 174, column 61
    function visible_141 () : java.lang.Boolean {
      return !documentDetailsCCHelper.RelatedToVisible
    }
    
    // 'visible' attribute on TextInput (id=Name) at DocumentDetailsEditInputSet.default.pcf: line 54, column 47
    function visible_20 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on RangeInput (id=IMRDocumentType) at DocumentDetailsEditInputSet.default.pcf: line 317, column 48
    function visible_229 () : java.lang.Boolean {
      return document.Claim.isECFVisible()
    }
    
    // 'visible' attribute on ContentInput (id=DocumentLink) at DocumentDetailsEditInputSet.default.pcf: line 58, column 69
    function visible_32 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode and document != null
    }
    
    // 'visible' attribute on RangeInput (id=MimeType) at DocumentDetailsEditInputSet.default.pcf: line 106, column 73
    function visible_60 () : java.lang.Boolean {
      return fromTemplate || documentDetailsCCHelper.ShowMimeType
    }
    
    // 'visible' attribute on CheckBoxInput (id=languageEnabled) at DocumentDetailsEditInputSet.default.pcf: line 114, column 119
    function visible_75 () : java.lang.Boolean {
      return documentDetailsCCHelper.AllowFieldsSubset && LanguageType.getTypeKeys( false ).Count > 1
    }
    
    // 'visible' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.default.pcf: line 126, column 67
    function visible_85 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get document () : Document {
      return getVariableValue("document", 0) as Document
    }
    
    property set document ($arg :  Document) {
      setVariableValue("document", 0, $arg)
    }
    
    property get documentDetailsCCHelper () : gw.document.DocumentDetailsCCHelper {
      return getRequireValue("documentDetailsCCHelper", 0) as gw.document.DocumentDetailsCCHelper
    }
    
    property set documentDetailsCCHelper ($arg :  gw.document.DocumentDetailsCCHelper) {
      setRequireValue("documentDetailsCCHelper", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get fromTemplate () : boolean {
      return getRequireValue("fromTemplate", 0) as java.lang.Boolean
    }
    
    property set fromTemplate ($arg :  boolean) {
      setRequireValue("fromTemplate", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DocumentDetailsEditInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestDisplayName) at DocumentDetailsEditInputSet.default.pcf: line 189, column 30
    function valueRoot_139 () : java.lang.Object {
      return ServiceRequest
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestDisplayName) at DocumentDetailsEditInputSet.default.pcf: line 189, column 30
    function value_137 () : java.lang.String {
      return ServiceRequest.DisplayName
    }
    
    property get ServiceRequest () : entity.ServiceRequest {
      return getIteratedValue(1) as entity.ServiceRequest
    }
    
    
  }
  
  
}