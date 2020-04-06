package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsEditInputSet_email_sentExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsEditInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentDetailsEditInputSet.email_sent.pcf: line 48, column 52
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentDetailsEditInputSet.email_sent.pcf: line 55, column 68
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentDetailsEditInputSet.email_sent.pcf: line 61, column 49
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentDetailsCCHelper.SecurityType = (__VALUE_TO_SET as typekey.DocumentSecurityType)
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function valueRange_17 () : java.lang.Object {
      return LanguageType.getTypeKeys( false )
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentDetailsEditInputSet.email_sent.pcf: line 20, column 47
    function valueRoot_2 () : java.lang.Object {
      return documentDetailsCCHelper
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentDetailsEditInputSet.email_sent.pcf: line 20, column 47
    function value_0 () : java.lang.String {
      return documentDetailsCCHelper.Author
    }
    
    // 'value' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function value_13 () : typekey.LanguageType {
      return documentDetailsCCHelper.Language
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentDetailsEditInputSet.email_sent.pcf: line 48, column 52
    function value_20 () : java.lang.String {
      return documentDetailsCCHelper.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentDetailsEditInputSet.email_sent.pcf: line 55, column 68
    function value_25 () : typekey.DocumentSection {
      return documentDetailsCCHelper.Section
    }
    
    // 'value' attribute on TextInput (id=Recipient) at DocumentDetailsEditInputSet.email_sent.pcf: line 24, column 50
    function value_3 () : java.lang.String {
      return documentDetailsCCHelper.Recipient
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentDetailsEditInputSet.email_sent.pcf: line 61, column 49
    function value_30 () : typekey.DocumentSecurityType {
      return documentDetailsCCHelper.SecurityType
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentDetailsEditInputSet.email_sent.pcf: line 29, column 45
    function value_6 () : java.lang.String {
      return documentDetailsCCHelper.Name
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at DocumentDetailsEditInputSet.email_sent.pcf: line 33, column 51
    function value_9 () : java.util.Date {
      return documentDetailsCCHelper.CreateTime
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function verifyValueRangeIsAllowedType_18 ($$arg :  typekey.LanguageType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function verifyValueRange_19 () : void {
      var __valueRangeArg = LanguageType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=Language) at DocumentDetailsEditInputSet.email_sent.pcf: line 40, column 65
    function visible_12 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    // 'visible' attribute on TypeKeyInput (id=Section) at DocumentDetailsEditInputSet.email_sent.pcf: line 55, column 68
    function visible_24 () : java.lang.Boolean {
      return DocumentSection.getTypeKeys( false ).Count > 1
    }
    
    property get documentDetailsCCHelper () : gw.document.DocumentDetailsCCHelper {
      return getRequireValue("documentDetailsCCHelper", 0) as gw.document.DocumentDetailsCCHelper
    }
    
    property set documentDetailsCCHelper ($arg :  gw.document.DocumentDetailsCCHelper) {
      setRequireValue("documentDetailsCCHelper", 0, $arg)
    }
    
    property get fromTemplate () : boolean {
      return getRequireValue("fromTemplate", 0) as java.lang.Boolean
    }
    
    property set fromTemplate ($arg :  boolean) {
      setRequireValue("fromTemplate", 0, $arg)
    }
    
    
  }
  
  
}