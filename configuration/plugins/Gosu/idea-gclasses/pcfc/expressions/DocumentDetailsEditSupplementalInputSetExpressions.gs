package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditSupplementalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsEditSupplementalInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/DocumentDetailsEditSupplementalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsEditSupplementalInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Obsolete) at DocumentDetailsEditSupplementalInputSet.pcf: line 15, column 34
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      document.Obsolete = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Obsolete) at DocumentDetailsEditSupplementalInputSet.pcf: line 15, column 34
    function valueRoot_3 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on BooleanRadioInput (id=Obsolete) at DocumentDetailsEditSupplementalInputSet.pcf: line 15, column 34
    function value_0 () : java.lang.Boolean {
      return document.Obsolete
    }
    
    property get document () : Document {
      return getRequireValue("document", 0) as Document
    }
    
    property set document ($arg :  Document) {
      setRequireValue("document", 0, $arg)
    }
    
    
  }
  
  
}