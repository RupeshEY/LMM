package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactRelatedContactsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactRelatedContactsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ContactRelatedContactsDV.pcf: line 26, column 21
    function def_onEnter_1 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.onEnter(contactHandle, claim)
    }
    
    // 'def' attribute on ListViewInput at ContactRelatedContactsDV.pcf: line 26, column 21
    function def_refreshVariables_2 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.refreshVariables(contactHandle, claim)
    }
    
    // 'validationExpression' attribute on ListViewInput at ContactRelatedContactsDV.pcf: line 26, column 21
    function validationExpression_0 () : java.lang.Object {
      return Contact.validateRelationships().formatUserMessage()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}