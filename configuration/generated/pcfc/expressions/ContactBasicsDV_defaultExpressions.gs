package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactBasicsDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Label at ContactBasicsDV.default.pcf: line 32, column 36
    function label_1 () : java.lang.String {
      return DisplayKey.get("Web.ContactDetail.UndefinedType", Contact.Subtype)
    }
    
    // 'visible' attribute on Label at ContactBasicsDV.default.pcf: line 32, column 36
    function visible_0 () : java.lang.Boolean {
      return Contact != null
    }
    
    // 'visible' attribute on Label at ContactBasicsDV.default.pcf: line 35, column 36
    function visible_2 () : java.lang.Boolean {
      return Contact == null
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
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    property get showRoles () : boolean {
      return getRequireValue("showRoles", 0) as java.lang.Boolean
    }
    
    property set showRoles ($arg :  boolean) {
      setRequireValue("showRoles", 0, $arg)
    }
    
    
          property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}