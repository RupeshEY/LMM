package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactDocumentDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactDocumentDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=NameLink) at ContactDocumentDetailsInputSet.pcf: line 20, column 108
    function action_1 () : void {
      contactDocument.download()
    }
    
    // 'available' attribute on Link (id=NameLink) at ContactDocumentDetailsInputSet.pcf: line 20, column 108
    function available_0 () : java.lang.Boolean {
      return gw.document.DocumentsUtil.isDocumentMimeTypeAllowed(contactDocument.MimeType)
    }
    
    // 'label' attribute on Link (id=NameLink) at ContactDocumentDetailsInputSet.pcf: line 20, column 108
    function label_2 () : java.lang.Object {
      return contactDocument.Name
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at ContactDocumentDetailsInputSet.pcf: line 20, column 108
    function tooltip_3 () : java.lang.String {
      return new gw.contact.ContactDocumentsUIHelper().isViewDocumentContentTooltip(contactDocument)
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function valueRange_17 () : java.lang.Object {
      return LanguageType.getTypeKeys( false )
    }
    
    // 'value' attribute on TextInput (id=Description) at ContactDocumentDetailsInputSet.pcf: line 25, column 44
    function valueRoot_6 () : java.lang.Object {
      return contactDocument
    }
    
    // 'value' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function value_13 () : typekey.LanguageType {
      return contactDocument.Language
    }
    
    // 'value' attribute on TextInput (id=Author) at ContactDocumentDetailsInputSet.pcf: line 43, column 39
    function value_20 () : java.lang.String {
      return contactDocument.Author
    }
    
    // 'value' attribute on TextInput (id=Recipient) at ContactDocumentDetailsInputSet.pcf: line 47, column 42
    function value_23 () : java.lang.String {
      return contactDocument.Recipient
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at ContactDocumentDetailsInputSet.pcf: line 54, column 47
    function value_26 () : typekey.DocumentStatusType {
      return contactDocument.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at ContactDocumentDetailsInputSet.pcf: line 59, column 49
    function value_29 () : typekey.DocumentSecurityType {
      return contactDocument.SecurityType
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at ContactDocumentDetailsInputSet.pcf: line 65, column 41
    function value_32 () : typekey.DocumentType {
      return contactDocument.Type
    }
    
    // 'value' attribute on BooleanRadioInput (id=Obsolete) at ContactDocumentDetailsInputSet.pcf: line 70, column 41
    function value_35 () : java.lang.Boolean {
      return contactDocument.Obsolete
    }
    
    // 'value' attribute on TextInput (id=Description) at ContactDocumentDetailsInputSet.pcf: line 25, column 44
    function value_4 () : java.lang.String {
      return contactDocument.Description
    }
    
    // 'value' attribute on TextInput (id=MimeType) at ContactDocumentDetailsInputSet.pcf: line 31, column 38
    function value_8 () : java.lang.String {
      return contactDocument.MimeTypeLabel
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function verifyValueRangeIsAllowedType_18 ($$arg :  typekey.LanguageType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function verifyValueRange_19 () : void {
      var __valueRangeArg = LanguageType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=Language) at ContactDocumentDetailsInputSet.pcf: line 38, column 65
    function visible_12 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    // 'visible' attribute on TextInput (id=MimeType) at ContactDocumentDetailsInputSet.pcf: line 31, column 38
    function visible_7 () : java.lang.Boolean {
      return contactDocument.DMS
    }
    
    property get contactDocument () : ContactDocumentInfo {
      return getRequireValue("contactDocument", 0) as ContactDocumentInfo
    }
    
    property set contactDocument ($arg :  ContactDocumentInfo) {
      setRequireValue("contactDocument", 0, $arg)
    }
    
    
  }
  
  
}